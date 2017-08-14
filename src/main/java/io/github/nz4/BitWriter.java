package io.github.nz4;

public class BitWriter
{
    private int bitOffset;
    private int head;
    private final byte[] dst;
    private int dstOff;

    public BitWriter(byte[] dst)
    {
        this(0, dst, 0);
    }

    public BitWriter(byte[] dst, int dstOff)
    {
        this(0, dst, dstOff);
    }

    public BitWriter(int bitOffset, byte[] dst, int dstOff)
    {
        this.bitOffset = bitOffset;
        if (bitOffset > 0) {
            this.head = dst[dstOff] & ((1 << bitOffset) - 1);
        }
        else {
            this.head = 0;
        }
        this.dst = dst;
        this.dstOff = dstOff;
    }

    //public void skip(int count)
    //{
    //    int newBitOff = bitOffset + count;
    //    dstOff += newBitOff / 8;
    //    bitOffset = newBitOff % 8;
    //}

    //public void fill(int count)
    //{
    //    write(-1, count);
    //}

    public void writeLongLE(long bitPattern, int count)
    {
        if (count > 64 || count < 0) {
            throw new IllegalArgumentException();
        }
        int headRemainingBits = 8 - bitOffset;
        if (count >= headRemainingBits) {
            dst[dstOff] = (byte) (head | (((int) bitPattern) << bitOffset));
            count -= headRemainingBits;
            bitPattern >>>= (long) headRemainingBits;
            switch (count / 8) {
            case 0:
                dstOff += 1;
                bitOffset = count;
                break;
            case 1:
                dst[dstOff + 1] = (byte) bitPattern;
                dstOff += 2;
                bitPattern >>>= 8L;
                bitOffset = count - 8;
                break;
            case 2:
                dst[dstOff + 1] = (byte) bitPattern;
                dst[dstOff + 2] = (byte) (bitPattern >>> 8L);
                dstOff += 3;
                bitPattern >>>= 16L;
                bitOffset = count - 16;
                break;
            case 3:
                dst[dstOff + 1] = (byte) bitPattern;
                dst[dstOff + 2] = (byte) (bitPattern >>> 8L);
                dst[dstOff + 3] = (byte) (bitPattern >>> 16L);
                dstOff += 4;
                bitPattern >>>= 24L;
                bitOffset = count - 24;
                break;
            case 4:
                dst[dstOff + 1] = (byte) bitPattern;
                dst[dstOff + 2] = (byte) (bitPattern >>> 8L);
                dst[dstOff + 3] = (byte) (bitPattern >>> 16L);
                dst[dstOff + 4] = (byte) (bitPattern >>> 24L);
                dstOff += 5;
                bitPattern >>>= 32L;
                bitOffset = count - 32;
                break;
            case 5:
                dst[dstOff + 1] = (byte) bitPattern;
                dst[dstOff + 2] = (byte) (bitPattern >>> 8L);
                dst[dstOff + 3] = (byte) (bitPattern >>> 16L);
                dst[dstOff + 4] = (byte) (bitPattern >>> 24L);
                dst[dstOff + 5] = (byte) (bitPattern >>> 32L);
                dstOff += 6;
                bitPattern >>>= 40L;
                bitOffset = count - 40;
                break;
            case 6:
                dst[dstOff + 1] = (byte) bitPattern;
                dst[dstOff + 2] = (byte) (bitPattern >>> 8L);
                dst[dstOff + 3] = (byte) (bitPattern >>> 16L);
                dst[dstOff + 4] = (byte) (bitPattern >>> 24L);
                dst[dstOff + 5] = (byte) (bitPattern >>> 32L);
                dst[dstOff + 6] = (byte) (bitPattern >>> 40L);
                dstOff += 7;
                bitPattern >>>= 48L;
                bitOffset = count - 48;
                break;
            case 7:
                dst[dstOff + 1] = (byte) bitPattern;
                dst[dstOff + 2] = (byte) (bitPattern >>> 8L);
                dst[dstOff + 3] = (byte) (bitPattern >>> 16L);
                dst[dstOff + 4] = (byte) (bitPattern >>> 24L);
                dst[dstOff + 5] = (byte) (bitPattern >>> 32L);
                dst[dstOff + 6] = (byte) (bitPattern >>> 40L);
                dst[dstOff + 7] = (byte) (bitPattern >>> 48L);
                dstOff += 8;
                bitPattern >>>= 56L;
                bitOffset = count - 56;
                break;
            case 8:
                dst[dstOff + 1] = (byte) bitPattern;
                dst[dstOff + 2] = (byte) (bitPattern >>> 8L);
                dst[dstOff + 3] = (byte) (bitPattern >>> 16L);
                dst[dstOff + 4] = (byte) (bitPattern >>> 24L);
                dst[dstOff + 5] = (byte) (bitPattern >>> 32L);
                dst[dstOff + 6] = (byte) (bitPattern >>> 40L);
                dst[dstOff + 7] = (byte) (bitPattern >>> 48L);
                dst[dstOff + 8] = (byte) (bitPattern >>> 56L);
                dstOff += 9;
                bitOffset = 0;
                head = 0;
                return;
            }
            head = ((int) bitPattern) & ((1 << bitOffset) - 1);
        }
        else {
            head |= (int) ((((int) bitPattern) & ((1 << count)-1)) << bitOffset);
            bitOffset += count;
        }
    }

    public void sync()
    {
        if (bitOffset > 0) {
            dst[dstOff] = (byte) head;
            dstOff++;
            head = 0;
            bitOffset = 0;
        }
    }

    public int getOffset()
    {
        return dstOff;
    }
}
