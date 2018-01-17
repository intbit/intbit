package io.github.intbit;

import java.nio.ByteOrder;
import static io.github.intbit.BitPacking.bitPack8IntLE;
import static io.github.intbit.BitPacking.bitPack8IntBE;

public class BitPackingEncoder
{
    public static int maxBitPackingBufferSizeOver8(int bits, int count)
    {
        return ((count + 7) / 8 * 8) * bits / 8;
    }

    public static int encodeBitPackingOver8BE(
            int bits,
            int[] unsignedInts,
            byte[] dst, int dstOff)
    {
        return encodeBitPackingOver8BE(bits,
                unsignedInts, 0, unsignedInts.length,
                dst, dstOff);
    }

    public static int encodeBitPackingOver8BE(
            int bits,
            int[] unsignedInts, int off, int len,
            byte[] dst, int dstOff)
    {
        int endOff = off + len;
        while (off < endOff) {
            bitPack8IntBE(bits, unsignedInts, off, dst, dstOff);
            off += 8;
            dstOff += bits;  // bits * 8 / 8 = bits
        }
        int overrunBytes = (((len + 7) / 8 * 8) - len) * bits / 8;
        return dstOff - overrunBytes;
    }

    public static int encodeBitPackingOver8LE(
            int bits,
            int[] unsignedInts,
            byte[] dst, int dstOff)
    {
        return encodeBitPackingOver8LE(bits,
                unsignedInts, 0, unsignedInts.length,
                dst, dstOff);
    }

    public static int encodeBitPackingOver8LE(
            int bits,
            int[] unsignedInts, int off, int len,
            byte[] dst, int dstOff)
    {
        int endOff = off + len;
        while (off < endOff) {
            bitPack8IntLE(bits, unsignedInts, off, dst, dstOff);
            off += 8;
            dstOff += bits;  // bits * 8 / 8 = bits
        }
        int overrunBytes = (((len + 7) / 8 * 8) - len) * bits / 8;
        return dstOff - overrunBytes;
    }

    private final boolean isBigEndian;

    public BitPackingEncoder(ByteOrder byteOrder)
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

    public void encodeBitPackingOver8(
            int bits,
            int[] unsignedInts,
            byte[] dst, int dstOff)
    {
        if (isBigEndian) {
            encodeBitPackingOver8BE(bits, unsignedInts, dst, dstOff);
        }
        else {
            encodeBitPackingOver8LE(bits, unsignedInts, dst, dstOff);
        }
    }

    public void encodeBitPackingOver8(
            int bits,
            int[] unsignedInts, int off, int len,
            byte[] dst, int dstOff)
    {
        if (isBigEndian) {
            encodeBitPackingOver8BE(bits, unsignedInts, off, len, dst, dstOff);
        }
        else {
            encodeBitPackingOver8LE(bits, unsignedInts, off, len, dst, dstOff);
        }
    }
}
