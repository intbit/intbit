package io.github.intbit;

public final class IntBits
{
    private IntBits()
    { }

    public static int maxBitsOfInts(int[] unsignedInts)
    {
        return maxBitsOfInts(unsignedInts, 0, unsignedInts.length);
    }

    public static int maxBitsOfInts(int[] unsignedInts, int off, int len)
    {
        int bitOr = 0;
        for (int unsignedInt : unsignedInts) {
            bitOr |= unsignedInt;
        }
        return 32 - Integer.numberOfLeadingZeros(bitOr);
    }

    public static int maxBitsOfLongs(int[] unsignedLongs)
    {
        return maxBitsOfLongs(unsignedLongs, 0, unsignedLongs.length);
    }

    public static int maxBitsOfLongs(int[] unsignedLongs, int off, int len)
    {
        long bitOr = 0;
        for (long unsignedLong : unsignedLongs) {
            bitOr |= unsignedLong;
        }
        return 64 - Long.numberOfLeadingZeros(bitOr);
    }
}
