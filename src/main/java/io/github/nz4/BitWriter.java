package io.github.nz4;

/**
 * BitWriter encodes sequence of bits to a byte array.
 *
 * BitWriter accumulates 8 bits in an internal buffer and flushes it to the
 * destination byte array every 8 bits. You need to call {@link BitWriter#sync()}
 * method to flush the final byte and synchronize the offset to 8-bit boundary.
 */
public class BitWriter
{
    private int bitOffset;
    private int head;
    private final byte[] dst;
    private int dstOff;

    /**
     * Creates a new BitWriter.
     *
     * This is equivalent to <code>BitWriter(dst, 0)</code>.
     *
     * @param dst byte array to write bit sequence to.
     * @exception NullPointerException If <code>dst</code> is <code>null</code>.
     */
    public BitWriter(byte[] dst)
    {
        this(0, dst, 0);
    }

    /**
     * Creates a new BitWriter.
     *
     * The new BitWriter reads bit sequence from dst[dstOff].
     *
     * @param dst byte array to write bit sequence to.
     * @param dstOff offset of the byte array.
     * @exception NullPointerException If <code>dst</code> is <code>null</code>.
     * @exception IndexOutOfBoundsException If <code>dstOff</code> is negative or greater than <code>dst.length</code>.
     */
    public BitWriter(byte[] dst, int dstOff)
    {
        this(0, dst, dstOff);
    }

    /**
     * Creates a new BitWriter.
     *
     * The new BitWriter writes bit sequence to dst[dstOff] with first <code>bitOffset</code> bits skipped.
     *
     * @param dst byte array to write bit sequence to.
     * @param dstOff offset of the byte array to read bit sequence from.
     * @param bitOffset bit offset of dst[dstOff] to write bit sequence to.
     * @exception IndexOutOfBoundsException If <code>dstOff</code> is negative or greater than <code>dst.length</code>.
     * @exception IndexOutOfBoundsException if <code>bitOffset</code> is negative or greater than 8.
     */
    private BitWriter(int bitOffset, byte[] dst, int dstOff)
    {
        if (dst == null) {
            throw new NullPointerException();
        }
        if (dstOff < 0 || dstOff > dst.length) {
            throw new IndexOutOfBoundsException();
        }
        if (bitOffset < 0 || bitOffset > 8) {
            throw new IndexOutOfBoundsException();
        }
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

    /**
     * Writes bit sequence.
     *
     * This method can write at most 64 bits from a given long value to the byte array.
     *
     * @param bitPattern bit sequence in long.
     * @param count number of bits to write from <code>bitPattern</code>.
     * @exception IllegalArgumentException If count is negative or greater than 64.
     * @exception IndexOutOfBoundsException If offset exceeds the capacity of byte array.
     */
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

    /**
     * Flushes the final byte and synchronizes the offset to a 8-bit boundary.
     *
     * @exception IndexOutOfBoundsException If offset exceeds the capacity of byte array.
     */
    public void sync()
    {
        if (bitOffset > 0) {
            dst[dstOff] = (byte) head;
            dstOff++;
            head = 0;
            bitOffset = 0;
        }
    }

    /**
     * Gets current offset.
     *
     * @return offset of the byte array.
     */
    public int getOffset()
    {
        return dstOff;
    }
}
