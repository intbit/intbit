package io.github.nz4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class BitReaderWriterTest
{
    @Test
    public void staticOne()
    {
        byte[] bytes = new byte[100];

        BitWriter w = new BitWriter(bytes, 3);
        w.writeLongLE(1, 1);
        w.writeLongLE(0, 1);
        w.writeLongLE(1, 1);
        w.writeLongLE(1, 1);
        w.sync();
        assertThat(bytes[3], is((byte) 0b1101));

        BitReader r = new BitReader(bytes, 3);
        assertThat(r.readLongLE(1), is(1L));
        assertThat(r.readLongLE(1), is(0L));
        assertThat(r.readLongLE(1), is(1L));
        assertThat(r.readLongLE(1), is(1L));
    }

    @Test
    public void staticTwo()
    {
        byte[] bytes = new byte[100];

        BitWriter w = new BitWriter(bytes, 3);
        w.writeLongLE(0b01L, 2);
        w.writeLongLE(0b10L, 2);
        w.writeLongLE(0b00L, 2);
        w.writeLongLE(0b11L, 2);
        w.sync();
        assertThat(bytes[3], is((byte) 0b11001001));

        BitReader r = new BitReader(bytes, 3);
        assertThat(r.readLongLE(2), is(0b01L));
        assertThat(r.readLongLE(2), is(0b10L));
        assertThat(r.readLongLE(2), is(0b00L));
        assertThat(r.readLongLE(2), is(0b11L));
    }

    @Test
    public void staticLong()
    {
        byte[] bytes = new byte[100];

        BitWriter w = new BitWriter(bytes, 3);
        w.writeLongLE(0b011L, 3);
        w.writeLongLE(0b000011L, 6);
        w.writeLongLE(0b101101010011100101101010011100L, 30);
        w.writeLongLE(0b1L, 1);
        w.writeLongLE(0b101101010011100101101010L, 24);
        w.sync();

        BitReader r = new BitReader(bytes, 3);
        assertThat(r.readLongLE(3), is(0b011L));
        assertThat(r.readLongLE(6), is(0b000011L));
        assertThat(r.readLongLE(30), is(0b101101010011100101101010011100L));
        assertThat(r.readLongLE(1), is(0b1L));
        assertThat(r.readLongLE(24), is(0b101101010011100101101010L));
    }

    @Test
    public void randomRoundTripLong()
    {
        byte[] bytes = new byte[8000];
        BitWriter enc = new BitWriter(bytes, 7);
        List<Long> expected = new ArrayList<>();

        Random rand = newRandom();
        for (int i = 0; i < 1000; i++) {
            long src = rand.nextLong();
            src >>= rand.nextInt(64);
            int bits = 64 - Long.numberOfLeadingZeros(src);
            enc.writeLongLE(src, bits);
            expected.add(src);
        }
        enc.sync();

        BitReader dec = new BitReader(bytes, 7);
        for (int i = 0; i < 1000; i++) {
            long src = expected.get(i);
            int bits = 64 - Long.numberOfLeadingZeros(src);
            assertThat(dec.readLongLE(bits), is(src));
        }
    }

    @Test
    public void testSetGetOffset()
    {
        byte[] bytes = new byte[100];

        BitWriter enc = new BitWriter(bytes, 5);
        assertThat(enc.getOffset(), is(5));
        enc.writeLongLE(5L, 3);
        assertThat(enc.getOffset(), is(5));
        enc.sync();
        assertThat(enc.getOffset(), is(6));
        assertThat(bytes[5], is((byte) 5));

        BitReader dec = new BitReader(bytes, 5);
        assertThat(dec.getOffset(), is(5));
        assertThat(dec.readLongLE(3), is(5L));
        assertThat(dec.getOffset(), is(6));
    }

    @Test
    public void testOutOfIndex()
    {
        byte[] bytes = new byte[10];

        BitWriter enc = new BitWriter(bytes, 8);
        assertArrayIndexOutOfBoundsException(() -> { enc.writeLongLE(0L, 17); enc.sync(); });

        BitReader dec = new BitReader(bytes, 8);
        assertArrayIndexOutOfBoundsException(() -> dec.readLongLE(17));
    }

    @Test
    public void readingZeroBitsDoesNething()
    {
        assertThat(new BitReader(new byte[0], 0).readLongLE(0), is(0L));
    }

    @Test
    public void writingZeroBitsDoesNething()
    {
        try {
            BitWriter w = new BitWriter(new byte[0], 0);
            w.writeLongLE(0, 0);
            w.sync();
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            fail();
        }
    }

    @Test
    public void readerOverrun()
    {
        try {
            BitReader r = new BitReader(new byte[1], 0);
            r.readLongLE(8);
            assertThat(r.getOffset(), is(1));
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            fail();
        }

        try {
            BitReader r = new BitReader(new byte[2], 0);
            r.readLongLE(16);
            assertThat(r.getOffset(), is(2));
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            fail();
        }

        try {
            BitReader r = new BitReader(new byte[2], 0);
            r.readLongLE(4);
            r.readLongLE(12);
            assertThat(r.getOffset(), is(2));
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            fail();
        }
    }

    @Test
    public void writerOverrun()
    {
        try {
            BitWriter w = new BitWriter(new byte[1], 0);
            w.writeLongLE(0L, 8);
            w.sync();
            assertThat(w.getOffset(), is(1));
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            fail();
        }

        try {
            BitWriter w = new BitWriter(new byte[2], 0);
            w.writeLongLE(0L, 16);
            w.sync();
            assertThat(w.getOffset(), is(2));
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            fail();
        }

        try {
            BitWriter w = new BitWriter(new byte[2], 0);
            w.writeLongLE(0L, 4);
            w.writeLongLE(0L, 12);
            w.sync();
            assertThat(w.getOffset(), is(2));
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            fail();
        }
    }

    private void assertArrayIndexOutOfBoundsException(Runnable runnable)
    {
        try {
            runnable.run();
            fail();
        }
        catch (Exception ex) {
            assertThat(ex, instanceOf(ArrayIndexOutOfBoundsException.class));
        }
    }

    private Random newRandom()
    {
        return new Random(3);
    }
}
