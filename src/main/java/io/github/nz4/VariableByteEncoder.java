package io.github.nz4;

import static io.github.nz4.ZigZagCodings.encodeZigZagInt;
import static io.github.nz4.ZigZagCodings.encodeZigZagLong;

public class VariableByteEncoder
{
    /**
     * Calculate number of necessary bytes to encode an unsigned long using variable byte encoding.
     *
     * Return value is at least 1 and at most 10.
     *
     * @param unsigned a 64-bit unsigned integer to be encoded.
     * @return number of bytes to be used by variable byte encoding.
     */
    public static int variableBytesOfUnsignedLong(long unsigned)
    {
        if (unsigned == 0) {
            return 1;
        }
        int bits = 64 - Long.numberOfLeadingZeros(unsigned);
        return (bits + 6) / 7;
    }

    /**
     * Calculate number of necessary bytes to encode an unsigned int using variable byte encoding.
     *
     * Return value is at least 1 and at most 5.
     *
     * @param unsigned a 32-bit unsigned integer to be encoded.
     * @return number of bytes to be used by variable byte encoding.
     */
    public static int variableBytesOfUnsignedInt(int unsigned)
    {
        if (unsigned == 0) {
            return 1;
        }
        int bits = 32 - Integer.numberOfLeadingZeros(unsigned);
        return (bits + 6) / 7;
    }

    /**
     * Calculate number of necessary bytes to encode a signed long using ZigZag encoding and variable byte encoding.
     *
     * @param signed a 64-bit signed integer to be encoded.
     * @return number of bytes to be used by ZigZag encoding and variable byte encoding.
     */
    public static int variableBytesOfZigZagLong(long signed)
    {
        return variableBytesOfUnsignedLong(encodeZigZagLong(signed));
    }

    /**
     * Calculate number of necessary bytes to encode a signed int using ZigZag encoding and variable byte encoding.
     *
     * @param signed a 32-bit signed integer to be encoded.
     * @return number of bytes to be used by ZigZag encoding and variable byte encoding.
     */
    public static int variableBytesOfZigZagInt(int signed)
    {
        return variableBytesOfUnsignedInt(encodeZigZagInt(signed));
    }

    /**
     * Encode an unsigned long using variable byte encoding.
     *
     * Destination buffer must have at least enough capacity calculated by {@link #variableBytesOfUnsignedLong(long)}
     * method. Otherwise, this method throws ArrayIndexOutOfBoundsException.
     *
     * @param unsigned a 64-bit unsigned integer to be encoded.
     * @param dst byte array to store the encoded bytes.
     * @param offset of the byte array.
     * @return dstOff + number of written bytes.
     * @throws ArrayIndexOutOfBoundsException dst.length is less than dstOff + variableBytesOfUnsignedLong(unsigned).
     */
    public static int encodeUnsignedVariableLong(long unsigned, byte[] dst, int dstOff)
    {
        while ((unsigned & 0xffffffffffffff80L) != 0L) {
            dst[dstOff] = (byte) ((unsigned & 0x7fL) | 0x80L);
            unsigned >>>= 7L;
            dstOff++;
        }
        dst[dstOff] = (byte) (unsigned & 0x7fL);
        dstOff++;
        return dstOff;
    }

    /**
     * Encode an unsigned int using variable byte encoding.
     *
     * Destination buffer must have at least enough capacity calculated by {@link #variableBytesOfUnsignedInt(int)}
     * method. Otherwise, this method throws ArrayIndexOutOfBoundsException.
     *
     * @param unsigned a 32-bit unsigned integer to be encoded.
     * @param dst byte array to store the encoded bytes.
     * @param offset of the byte array.
     * @return dstOff + number of written bytes.
     * @throws ArrayIndexOutOfBoundsException dst.length is less than dstOff + variableBytesOfUnsignedInt(unsigned).
     */
    public static int encodeUnsignedVariableInt(int unsigned, byte[] dst, int dstOff)
    {
        while ((unsigned & 0xffffff80) != 0L) {
            dst[dstOff] = (byte) ((unsigned & 0x7f) | 0x80);
            unsigned >>>= 7;
            dstOff++;
        }
        dst[dstOff] = (byte) (unsigned & 0x7f);
        dstOff++;
        return dstOff;
    }

    /**
     * Encode a signed long using ZigZag encoding and variable byte encoding.
     *
     * Destination buffer must have at least enough capacity calculated by {@link #variableBytesOfZigZagLong(long)}
     * method. Otherwise, this method throws ArrayIndexOutOfBoundsException.
     *
     * @param signed a 64-bit signed integer to be encoded.
     * @param dst byte array to store the encoded bytes.
     * @param offset of the byte array.
     * @return dstOff + number of written bytes.
     * @throws ArrayIndexOutOfBoundsException dst.length is less than dstOff + variableBytesOfZigZagLong(signed).
     */
    public static int encodeZigZagVariableLong(long signed, byte[] dst, int dstOff)
    {
        return encodeUnsignedVariableLong(encodeZigZagLong(signed), dst, dstOff);
    }

    /**
     * Encode a signed int using ZigZag encoding and variable byte encoding.
     *
     * Destination buffer must have at least enough capacity calculated by {@link #variableBytesOfZigZagInt(int)}
     * method. Otherwise, this method throws ArrayIndexOutOfBoundsException.
     *
     * @param signed a 64-bit signed integer to be encoded.
     * @param dst byte array to store the encoded bytes.
     * @param offset of the byte array.
     * @return dstOff + number of written bytes.
     * @throws ArrayIndexOutOfBoundsException dst.length is less than dstOff + variableBytesOfZigZagInt(signed).
     */
    public static int encodeZigZagVariableInt(int signed, byte[] dst, int dstOff)
    {
        return encodeUnsignedVariableInt(encodeZigZagInt(signed), dst, dstOff);
    }

    private final byte[] dst;
    private int dstOff;

    public VariableByteEncoder(byte[] dst, int dstOff)
    {
        this.dst = dst;
        this.dstOff = dstOff;
    }

    public int getOffset()
    {
        return dstOff;
    }

    public void setOffset(int dstOff)
    {
        this.dstOff = dstOff;
    }

    public void writeUnsignedLong(long unsigned)
    {
        dstOff = encodeUnsignedVariableLong(unsigned, dst, dstOff);
    }

    public void writeUnsignedInt(int unsigned)
    {
        dstOff = encodeUnsignedVariableInt(unsigned, dst, dstOff);
    }

    public void writeZigZagLong(long signed)
    {
        dstOff = encodeZigZagVariableLong(signed, dst, dstOff);
    }

    public void writeZigZagInt(int signed)
    {
        dstOff = encodeZigZagVariableInt(signed, dst, dstOff);
    }
}
