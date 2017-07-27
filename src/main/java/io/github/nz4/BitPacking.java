package io.github.nz4;

import java.util.function.IntToLongFunction;

public final class BitPacking
{
    public static void bitPack8IntLE(
            int[] src, int srcOff,
            byte[] dst, int dstOff,
            int bits)
    {
        BitPacking8IntLE.pack(src, srcOff, dst, dstOff, bits);
    }

    public static void bitUnpack8IntLE(
            byte[] src, int srcOff,
            int[] dst, int dstOff,
            int bits)
    {
        BitUnpacking8IntLE.unpack(src, srcOff, dst, dstOff, bits);
    }

    public static void bitUnpack8IntLE(
            IntToLongFunction src, int srcOff,
            int[] dst, int dstOff,
            int bits)
    {
        BitUnpacking8IntLE.unpack(src, srcOff, dst, dstOff, bits);
    }

    public static void bitPack8LongLE(
            long[] src, int srcOff,
            byte[] dst, int dstOff,
            int bits)
    {
        BitPacking8LongLE.pack(src, srcOff, dst, dstOff, bits);
    }

    public static void bitUnpack8LongLE(
            byte[] src, int srcOff,
            long[] dst, int dstOff,
            int bits)
    {
        BitUnpacking8LongLE.unpack(src, srcOff, dst, dstOff, bits);
    }

    public static void bitUnpack8LongLE(
            IntToLongFunction src, int srcOff,
            long[] dst, int dstOff,
            int bits)
    {
        BitUnpacking8LongLE.unpack(src, srcOff, dst, dstOff, bits);
    }

    public static void bitPack8IntBE(
            int[] src, int srcOff,
            byte[] dst, int dstOff,
            int bits)
    {
        BitPacking8IntBE.pack(src, srcOff, dst, dstOff, bits);
    }

    public static void bitUnpack8IntBE(
            byte[] src, int srcOff,
            int[] dst, int dstOff,
            int bits)
    {
        BitUnpacking8IntBE.unpack(src, srcOff, dst, dstOff, bits);
    }

    public static void bitUnpack8IntBE(
            IntToLongFunction src, int srcOff,
            int[] dst, int dstOff,
            int bits)
    {
        BitUnpacking8IntBE.unpack(src, srcOff, dst, dstOff, bits);
    }

    public static void bitPack8LongBE(
            long[] src, int srcOff,
            byte[] dst, int dstOff,
            int bits)
    {
        BitPacking8LongBE.pack(src, srcOff, dst, dstOff, bits);
    }

    public static void bitUnpack8LongBE(
            byte[] src, int srcOff,
            long[] dst, int dstOff,
            int bits)
    {
        BitUnpacking8LongBE.unpack(src, srcOff, dst, dstOff, bits);
    }

    public static void bitUnpack8LongBE(
            IntToLongFunction src, int srcOff,
            long[] dst, int dstOff,
            int bits)
    {
        BitUnpacking8LongBE.unpack(src, srcOff, dst, dstOff, bits);
    }
}
