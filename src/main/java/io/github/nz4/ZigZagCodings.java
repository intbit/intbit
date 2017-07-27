package io.github.nz4;

/**
 * ZigZagCodings implements encoder and decoder of ZigZag encoding.
 *
 * <pre>
 * import static io.github.nz4.ZigZagCodings.*;
 *
 * long encoded = encodeZigZagLong(-32L);
 * encodeZigZagLong(encoded) == -32;
 * </pre>
 *
 */
public final class ZigZagCodings
{
    private ZigZagCodings()
    { }

    /**
     * Encode a signed long into an unsigned long using a ZigZag encoding.
     *
     * @param signed a 64-bit signed integer to be encoded.
     * @return encoded 64-bit unsigned integer.
     */
    public static long encodeZigZagLong(long signed)
    {
        return (signed << 1) ^ (signed >> 63);
    }

    /**
     * Decode an unsigned long encoded by ZigZag encoding into a signed long.
     *
     * @param unsigned a 64-bit unsigned integer to be decoded.
     * @return decoded 64-bit signed integer.
     */
    public static long decodeZigZagLong(long unsigned)
    {
        long t = (((unsigned << 63) >> 63) ^ unsigned) >> 1;
        return t ^ (unsigned & (1L << 63));
    }

    /**
     * Encode a signed int into an unsigned int using a ZigZag encoding.
     *
     * @param signed a 32-bit signed integer to be encoded.
     * @return encoded 32-bit unsigned integer.
     */
    public static int encodeZigZagInt(int signed)
    {
        return (signed << 1) ^ (signed >> 31);
    }

    /**
     * Decode an unsigned int encoded by ZigZag encoding into a signed int.
     *
     * @param unsigned a 32-bit unsigned integer to be decoded.
     * @return decoded 32-bit signed integer.
     */
    public static int decodeZigZagInt(int unsigned)
    {
        int t = (((unsigned << 31) >> 31) ^ unsigned) >> 1;
        return t ^ (unsigned & (1 << 31));
    }
}
