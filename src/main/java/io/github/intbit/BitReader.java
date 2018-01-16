package io.github.intbit;

/**
 * BitReader decodes sequence of bits from a byte array.
 */
public class BitReader
{
    private final byte[] src;
    private int srcOff;
    private int bitOffset;

    /**
     * Creates a new BitReader.
     *
     * This is equivalent to <code>BitReader(src, 0)</code>.
     *
     * @param src byte array to read bit sequence from.
     * @exception NullPointerException If <code>src</code> is <code>null</code>.
     */
    public BitReader(byte[] src)
    {
        this(0, src, 0);
    }

    /**
     * Creates a new BitReader.
     *
     * The new BitReader reads bit sequence from src[srcOff].
     *
     * @param src byte array to read bit sequence from.
     * @param srcOff byte offset of the byte array.
     * @exception NullPointerException If <code>src</code> is <code>null</code>.
     * @exception IndexOutOfBoundsException If <code>srcOff</code> is negative or greater than <code>src.length</code>.
     */
    public BitReader(byte[] src, int srcOff)
    {
        this(0, src, srcOff);
    }

    /**
     * Creates a new BitReader.
     *
     * The new BitReader reads bit sequence from src[srcOff] with first <code>bitOffset</code> bits skipped.
     *
     * @param src byte array to read bit sequence from.
     * @param srcOff byte offset of the byte array to read bit sequence from.
     * @param bitOffset bit offset of src[srcOff] to read bit sequence from.
     * @exception NullPointerException If <code>src</code> is <code>null</code>.
     * @exception IndexOutOfBoundsException If <code>srcOff</code> is negative or greater than <code>src.length</code>.
     * @exception IndexOutOfBoundsException if <code>bitOffset</code> is negative or greater than 8.
     */
    private BitReader(int bitOffset, byte[] src, int srcOff)
    {
        if (src == null) {
            throw new NullPointerException();
        }
        if (srcOff < 0 || srcOff > src.length) {
            throw new IndexOutOfBoundsException();
        }
        if (bitOffset < 0 || bitOffset > 8) {
            throw new IndexOutOfBoundsException();
        }
        this.src = src;
        this.srcOff = srcOff;
        this.bitOffset = bitOffset;
    }

    /**
     * Reads bit sequence.
     *
     * This method can read at most 64 bits from the byte array.
     *
     * @param count number of bits to read.
     * @return decoded bit pattern.
     * @exception IllegalArgumentException If count is negative or greater than 64.
     * @exception IndexOutOfBoundsException If offset exceeds the capacity of byte array.
     */
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

    /**
     * Gets current offset.
     *
     * This returns offset of the byte currently reading from. If the byte offset is
     *
     * @return offset of the byte array.
     */
    public int getOffset()
    {
        return srcOff + ((bitOffset + 7) / 8);
    }
}
