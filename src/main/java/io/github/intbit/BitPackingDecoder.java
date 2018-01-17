package io.github.intbit;

import java.nio.ByteOrder;
import static io.github.intbit.BitPacking.bitUnpack8IntBE;
import static io.github.intbit.BitPacking.bitUnpack8IntLE;

public class BitPackingDecoder
{
    public static int decodeBitPackingOver8BE(
            int bits,
            byte[] src, int srcOff,
            int[] dst, int off, int len)
    {
        int endOff = off + len;
        while (off < endOff) {
            bitUnpack8IntBE(bits, src, srcOff, dst, off);
            off += 8;
            srcOff += bits;  // bits * 8 / 8 = bits
        }
        int overrunBytes = (((len + 7) / 8 * 8) - len) * bits / 8;
        return srcOff - overrunBytes;
    }

    public static int decodeBitPackingOver8LE(
            int bits,
            byte[] src, int srcOff,
            int[] dst, int off, int len)
    {
        int endOff = off + len;
        while (off < endOff) {
            bitUnpack8IntLE(bits, src, srcOff, dst, off);
            off += 8;
            srcOff += bits;  // bits * 8 / 8 = bits
        }
        int overrunBytes = (((len + 7) / 8 * 8) - len) * bits / 8;
        return srcOff - overrunBytes;
    }

    private final boolean isBigEndian;

    public BitPackingDecoder(ByteOrder byteOrder)
    {
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.isBigEndian = false;
        }
        else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.isBigEndian = true;
        }
        else {
            throw new UnsupportedOperationException("Unknown byte order: " + byteOrder);
        }
    }

    public int decodeBitPackingOver8(
            int bits,
            byte[] src, int srcOff,
            int[] dst, int off, int len)
    {
        if (isBigEndian) {
            return decodeBitPackingOver8BE(bits, src, srcOff, dst, off, len);
        }
        else {
            return decodeBitPackingOver8LE(bits, src, srcOff, dst, off, len);
        }
    }
}
