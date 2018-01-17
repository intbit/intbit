package io.github.intbit;

public final class BitPacking
{
    private BitPacking()
    { }

    public static void bitPack8IntLE(
            int bits,
            int[] src, int srcOff,
            byte[] dst, int dstOff)
    {
        BitPacking8IntLE.pack(bits, src, srcOff, dst, dstOff);
    }

    public static void bitUnpack8IntLE(
            int bits,
            byte[] src, int srcOff,
            int[] dst, int dstOff)
    {
        BitUnpacking8IntLE.unpack(bits, src, srcOff, dst, dstOff);
    }

    public static void bitPack8LongLE(
            int bits,
            long[] src, int srcOff,
            byte[] dst, int dstOff)
    {
        BitPacking8LongLE.pack(bits, src, srcOff, dst, dstOff);
    }

    public static void bitUnpack8LongLE(
            int bits,
            byte[] src, int srcOff,
            long[] dst, int dstOff)
    {
        BitUnpacking8LongLE.unpack(bits, src, srcOff, dst, dstOff);
    }

    public static void bitPack8IntBE(
            int bits,
            int[] src, int srcOff,
            byte[] dst, int dstOff)
    {
        BitPacking8IntBE.pack(bits, src, srcOff, dst, dstOff);
    }

    public static void bitUnpack8IntBE(
            int bits,
            byte[] src, int srcOff,
            int[] dst, int dstOff)
    {
        BitUnpacking8IntBE.unpack(bits, src, srcOff, dst, dstOff);
    }

    public static void bitPack8LongBE(
            int bits,
            long[] src, int srcOff,
            byte[] dst, int dstOff)
    {
        BitPacking8LongBE.pack(bits, src, srcOff, dst, dstOff);
    }

    public static void bitUnpack8LongBE(
            int bits,
            byte[] src, int srcOff,
            long[] dst, int dstOff)
    {
        BitUnpacking8LongBE.unpack(bits, src, srcOff, dst, dstOff);
    }
}
