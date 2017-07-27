
here = File.dirname(__FILE__)

MAX_BITS = {long: 64, int: 32}
LITERAL_SUFFIX = {long: "L", int: ""}
BELE = {true => 'BE', false => 'LE'}

PACKAGE_NAME = "io.github.nz4"
OUTPUT_PATH = File.join(here, *"src/main/java".split("/"))
PACK_CLASS_NAME_PROC = -> (be, t) { "BitPacking8#{t.capitalize}#{BELE[be]}" }
UNPACK_CLASS_NAME_PROC = -> (be, t) { "BitUnpacking8#{t.capitalize}#{BELE[be]}" }
PACK_DISPATCH_METHOD_NAME_PROC = -> (be, t) { "pack" }
UNPACK_DISPATCH_METHOD_NAME_PROC = -> (be, t) { "unpack" }
PACK_METHOD_NAME_PROC = -> (be, t, bits) { "bitPack8#{t.capitalize}#{BELE[be]}#{bits}" }
UNPACK_METHOD_NAME_PROC = -> (be, t, bits) { "bitUnpack8#{t.capitalize}#{BELE[be]}#{bits}" }

class Writer
  def initialize
    @indent = 0
    @code = String.new
  end

  def indent(num=1, &block)
    @indent += num
    yield
    @indent -= num
  end

  def write_indent
    @code << ('    ' * @indent)
  end

  def write(code)
    @code << code
  end

  def puts(*lines)
    if lines.empty?
      @code << "\n"
    else
      lines.each do |line|
        @code << "#{'    ' * @indent}#{line}\n"
      end
    end
  end

  def to_s
    @code
  end
end

def calc_mask(t, bits)
  if bits == MAX_BITS[t]
    -1
  else
    mask = 0
    bits.times do
      mask <<= 1
      mask |= 1
    end
    mask
  end
end

def calc_value_shift_mask(be, t, bits, byte_index, value_index)
  value_start_bit_index = (value_index * bits) - (8 * (byte_index));
  value_end_bit_index = ((value_index + 1) * bits) - (8 * (byte_index + 1));

  if be
    value_start_bit_wanted = value_start_bit_index < 0 ? bits - 1 + value_start_bit_index : bits - 1;
    value_end_bit_wanted = value_end_bit_index > 0 ? value_end_bit_index : 0;
    byte_start_bit_wanted = value_start_bit_index < 0 ? 8 : 7 - value_start_bit_index;
    byte_end_bit_wanted = value_end_bit_index > 0 ? 0 : -value_end_bit_index;
    shift = value_end_bit_wanted - byte_end_bit_wanted;
    width_wanted = [7, byte_start_bit_wanted].min - [7, byte_end_bit_wanted].min + 1;
  else
    value_start_bit_wanted = bits - 1 - (value_end_bit_index > 0 ? value_end_bit_index : 0);
    value_end_bit_wanted = bits - 1 - (value_start_bit_index < 0 ? bits - 1 + value_start_bit_index : bits - 1);
    byte_start_bit_wanted = 7 - (value_end_bit_index > 0 ? 0 : -value_end_bit_index);
    byte_end_bit_wanted = 7 - (value_start_bit_index < 0 ? 8 : 7 - value_start_bit_index);
    shift = value_start_bit_wanted - byte_start_bit_wanted;
    width_wanted = [0, byte_start_bit_wanted].max - [0, byte_end_bit_wanted].max + 1;
  end

  mask_width = width_wanted + [0, shift].max

  return shift, calc_mask(t, mask_width)
end

def round8(v)
  (v + 7) / 8 * 8
end

def mask_literal(t, v)
  if v < 0
    "#{v}#{LITERAL_SUFFIX[t]}"
  else
    ("0x%x" % v) + LITERAL_SUFFIX[t]
  end
end

def generate_packer_class(be, t)
  class_name = PACK_CLASS_NAME_PROC.call(be, t)

  c = Writer.new
  c.puts "package #{PACKAGE_NAME};"
  c.puts
  c.puts "final class #{class_name}"
  c.puts "{"
  c.indent do
    c.puts "private #{class_name}()"
    c.puts "{ }"
    c.puts
    c.puts "public static void #{PACK_DISPATCH_METHOD_NAME_PROC.call(be, t)}(#{t}[] src, int srcOff, byte[] dst, int dstOff, int bits)"
    c.puts "{"
    c.indent do
      c.puts "switch (bits) {"
      c.puts "case 0:"
      c.puts "    // do nothing"
      c.puts "    break;"
      (1..MAX_BITS[t]).each do |bits|
        c.puts "case #{bits}:"
        c.puts "    #{PACK_METHOD_NAME_PROC.call(be, t, bits)}(src, srcOff, dst, dstOff);"
        c.puts "    break;"
      end
      c.puts "default:"
      c.puts "    throw new IllegalArgumentException(\"Bit width must be from 0 to #{MAX_BITS[t]} but got \" + bits);"
      c.puts "}"
    end
    c.puts "}"
    c.puts

    (1..MAX_BITS[t]).each do |bits|
      c.puts "public static void #{PACK_METHOD_NAME_PROC.call(be, t, bits)}(#{t}[] src, int srcOff, byte[] dst, int dstOff)"
      c.puts "{"
      c.indent do
        bits.times do |byte_index|
          c.puts "dst[#{"%2d" % byte_index} + dstOff] = (byte)(("
          c.indent(2) do
            start_index = (byte_index * 8) / bits
            end_index = ((byte_index + 1) * 8 + bits - 1) / bits
            (start_index..(end_index-1)).each do |value_index|
              if value_index == start_index
                or_prefix = "  "
              else
                or_prefix = "| "
              end
              vshift, vmask = calc_value_shift_mask(be, t, bits, byte_index, value_index)
              if vshift > 0
                shifting = ">>> #{vshift}"
              else
                shifting = "<<  #{-vshift}"
              end
              mask = calc_mask(t, bits)
              src_ref = "src[#{"%2d" % value_index} + srcOff]"
              c.puts "#{or_prefix}((#{src_ref} & #{mask_literal(t, mask)}) #{shifting})"
            end
          end
          c.puts "    ) & 0xff);";
        end
      end
      c.puts "}"
      c.puts
    end
  end
  c.puts "}"

  return class_name, c.to_s
end

def generate_unpacker_class(be, t)
  class_name = UNPACK_CLASS_NAME_PROC.call(be, t)

  c = Writer.new
  c.puts "package #{PACKAGE_NAME};"
  c.puts
  c.puts "import java.util.function.IntToLongFunction;"
  c.puts
  c.puts "final class #{class_name}"
  c.puts "{"
  c.indent do
    c.puts "private #{class_name}()"
    c.puts "{ }"
    c.puts

    ["byte[]", "IntToLongFunction"].each do |src_type|
      c.puts "public static void #{UNPACK_DISPATCH_METHOD_NAME_PROC.call(be, t)}(#{src_type} src, int srcOff, #{t}[] dst, int dstOff, int bits)"
      c.puts "{"
      c.indent do
        c.puts "switch (bits) {"
        c.puts "case 0:"
        c.puts "    // do nothing"
        c.puts "    break;"
        (1..MAX_BITS[t]).each do |bits|
          c.puts "case #{bits}:"
          c.puts "    #{UNPACK_METHOD_NAME_PROC.call(be, t, bits)}(src, srcOff, dst, dstOff);"
          c.puts "    break;"
        end
        c.puts "default:"
        c.puts "    throw new IllegalArgumentException(\"Bit width must be from 0 to #{MAX_BITS[t]} but got \" + bits);"
        c.puts "}"
      end
      c.puts "}"
      c.puts

      (1..MAX_BITS[t]).each do |bits|
        c.puts "public static void #{UNPACK_METHOD_NAME_PROC.call(be, t, bits)}(#{src_type} src, int srcOff, #{t}[] dst, int dstOff)"
        c.puts "{"
        c.indent do
          8.times do |value_index|
            c.puts "dst[#{"%2d" % value_index} + dstOff] ="
            c.indent(2) do
              start_index = value_index * bits / 8;
              end_index = round8((value_index + 1) * bits) / 8;

              (start_index..(end_index-1)).each do |byte_index|
                or_prefix = (byte_index == start_index) ? "  " : "| "
                semicolon_suffix = (byte_index == end_index-1) ? ";" : ""
                vshift, vmask = calc_value_shift_mask(be, t, bits, byte_index, value_index)
                if vshift < 0
                  shifting = ">> #{-vshift}"
                else
                  shifting = "<< #{vshift}"
                end
                if src_type == "IntToLongFunction"
                  src_ref = "src.applyAsLong(#{"%2d" % byte_index} + srcOff)"
                else
                  src_ref = "src[#{"%2d" % byte_index} + srcOff]"
                end
                c.puts "#{or_prefix}((((#{t}) #{src_ref}) #{shifting}) & #{mask_literal(t, vmask)})#{semicolon_suffix}"
              end
            end
          end
        end
        c.puts "}"
        c.puts
      end
    end
  end
  c.puts "}"

  return class_name, c.to_s
end

classes = {}

[true, false].each do |be|
  [:int, :long].each do |t|
    name, code = generate_packer_class(be, t)
    classes[name] = code

    name, code = generate_unpacker_class(be, t)
    classes[name] = code
  end
end

classes.each_pair do |name, code|
  path = File.join(OUTPUT_PATH, *PACKAGE_NAME.split("."), "#{name}.java")
  File.write(path, code)
  puts "Generated #{path}"
end

