package io.github.nz4;

import java.util.Random;
import org.junit.Test;
import static io.github.nz4.ZigZagCodings.decodeZigZagInt;
import static io.github.nz4.ZigZagCodings.decodeZigZagLong;
import static io.github.nz4.ZigZagCodings.encodeZigZagInt;
import static io.github.nz4.ZigZagCodings.encodeZigZagLong;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ZigZagCodingsTest
{
    @Test
    public void staticEncodeInt()
    {
        assertThat(encodeZigZagInt( 0), is(0));
        assertThat(encodeZigZagInt(-1), is(1));
        assertThat(encodeZigZagInt( 1), is(2));
        assertThat(encodeZigZagInt(-2), is(3));
        assertThat(encodeZigZagInt( 2), is(4));

        assertThat(encodeZigZagInt(Integer.MAX_VALUE-1), is(-4));
        assertThat(encodeZigZagInt(Integer.MIN_VALUE+1), is(-3));
        assertThat(encodeZigZagInt(Integer.MAX_VALUE),   is(-2));
        assertThat(encodeZigZagInt(Integer.MIN_VALUE),   is(-1));
    }

    @Test
    public void staticEncodeLong()
    {
        assertThat(encodeZigZagLong( 0L), is(0L));
        assertThat(encodeZigZagLong(-1L), is(1L));
        assertThat(encodeZigZagLong( 1L), is(2L));
        assertThat(encodeZigZagLong(-2L), is(3L));
        assertThat(encodeZigZagLong( 2L), is(4L));

        assertThat(encodeZigZagLong(Long.MAX_VALUE-1), is(-4L));
        assertThat(encodeZigZagLong(Long.MIN_VALUE+1), is(-3L));
        assertThat(encodeZigZagLong(Long.MAX_VALUE),   is(-2L));
        assertThat(encodeZigZagLong(Long.MIN_VALUE),   is(-1L));
    }

    @Test
    public void staticDecodeInt()
    {
        assertThat(decodeZigZagInt(0), is( 0));
        assertThat(decodeZigZagInt(1), is(-1));
        assertThat(decodeZigZagInt(2), is( 1));
        assertThat(decodeZigZagInt(3), is(-2));
        assertThat(decodeZigZagInt(4), is( 2));

        assertThat(decodeZigZagInt(-4), is(Integer.MAX_VALUE-1));
        assertThat(decodeZigZagInt(-3), is(Integer.MIN_VALUE+1));
        assertThat(decodeZigZagInt(-2), is(Integer.MAX_VALUE));
        assertThat(decodeZigZagInt(-1), is(Integer.MIN_VALUE));
    }

    @Test
    public void staticDecodeLong()
    {
        assertThat(decodeZigZagLong(0L), is( 0L));
        assertThat(decodeZigZagLong(1L), is(-1L));
        assertThat(decodeZigZagLong(2L), is( 1L));
        assertThat(decodeZigZagLong(3L), is(-2L));
        assertThat(decodeZigZagLong(4L), is( 2L));

        assertThat(decodeZigZagLong(-4L), is(Long.MAX_VALUE-1));
        assertThat(decodeZigZagLong(-3L), is(Long.MIN_VALUE+1));
        assertThat(decodeZigZagLong(-2L), is(Long.MAX_VALUE));
        assertThat(decodeZigZagLong(-1L), is(Long.MIN_VALUE));
    }

    @Test
    public void randomRoundTripInt()
    {
        Random rand = newRandom();
        for (int i = 0; i < 1000; i++) {
            int src = rand.nextInt();
            int encoded = encodeZigZagInt(src);
            assertThat(decodeZigZagInt(encoded), is(src));
        }
    }

    @Test
    public void randomRoundTripLong()
    {
        Random rand = newRandom();
        for (int i = 0; i < 1000; i++) {
            long src = rand.nextLong();
            long encoded = encodeZigZagLong(src);
            assertThat(decodeZigZagLong(encoded), is(src));
        }
    }

    @Test
    public void randomRoundTripIntRangeEncodingByLong()
    {
        Random rand = newRandom();
        for (int i = 0; i < 1000; i++) {
            int src = rand.nextInt();
            int encoded = (int) encodeZigZagLong((long) src);
            assertThat(decodeZigZagInt(encoded), is(src));
        }
    }

    @Test
    public void randomRoundTripIntRangeDecodingByInt()
    {
        Random rand = newRandom();
        for (int i = 0; i < 1000; i++) {
            int src = rand.nextInt();
            long encoded = encodeZigZagInt(src) & 0xffffffffL;
            assertThat(decodeZigZagLong(encoded), is((long) src));
        }
    }

    private Random newRandom()
    {
        return new Random(3);
    }
}
