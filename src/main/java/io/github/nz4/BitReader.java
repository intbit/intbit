package io.github.nz4;

public class BitReader
{
    private final byte[] src;
    private int srcOff;
    private int bitOffset;

    public BitReader(byte[] src, int srcOff)
    {
        this(0, src, srcOff);
    }

    public BitReader(int bitOffset, byte[] src, int srcOff)
    {
        this.src = src;
        this.srcOff = srcOff;
        this.bitOffset = bitOffset;
    }

    public long readLongLE(int count)
    {
        if (count > 64 || count <= 0) {
            if (count == 0) {
                return 0L;
            }
            throw new IllegalArgumentException();
        }

        int headRemainingBits = 8 - bitOffset;
        if (count <= headRemainingBits) {
            // count <= headRemainingBits < 8
            long result = ((src[srcOff] & 0xffL) >>> bitOffset) & (long) ((1 << count) - 1);
            bitOffset += count;
            return result;
        }
        else {
            // count > headRemainingBits
            //if (bitOffset == 0) {   // This branch has no effects
            //    result = 0L;
            //    resultBits = 0;
            //} else { ... }
            long result = (src[srcOff] & 0xffL) >>> bitOffset;
            srcOff++;
            //bitOffset = 0;  // unnecessary
            count -= headRemainingBits;
            int resultBits = headRemainingBits;

            while (count >= 8) {
                result |= (src[srcOff] & 0xffL) << resultBits;
                count -= 8;
                resultBits += 8;
                srcOff++;
            }

            if (count > 0) {
                result |= ((long) ((src[srcOff] & 0xff) & ((1 << count) - 1))) << resultBits;
            }
            bitOffset = count;

            return result;
        }
    }

    public int getOffset()
    {
        return srcOff + ((bitOffset + 7) / 8);
    }
}
