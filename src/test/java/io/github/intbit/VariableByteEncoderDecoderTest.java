package io.github.intbit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.Test;
import static io.github.intbit.VariableByteEncoder.variableByteLengthOfUnsignedInt;
import static io.github.intbit.VariableByteEncoder.variableByteLengthOfUnsignedLong;
import static io.github.intbit.VariableByteEncoder.variableByteLengthOfZigZagInt;
import static io.github.intbit.VariableByteEncoder.variableByteLengthOfZigZagLong;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class VariableByteEncoderDecoderTest
{
    @Test
    public void staticEncodeUnsignedInt()
    {
        byte[] bytes = new byte[100];
        VariableByteEncoder e = new VariableByteEncoder(bytes, 3);
        int expectedOffset = 3;

        e.writeUnsignedInt(  0);  // 1-byte
        expectedOffset += 1;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 1], is((byte) 0));
        assertThat(variableByteLengthOfUnsignedInt(0), is(1));

        e.writeUnsignedInt(  1);  // 1-byte
        expectedOffset += 1;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 1], is((byte) 1));
        assertThat(variableByteLengthOfUnsignedInt(1), is(1));

        e.writeUnsignedInt(  2);  // 1-byte
        expectedOffset += 1;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 1], is((byte) 2));
        assertThat(variableByteLengthOfUnsignedInt(2), is(1));

        e.writeUnsignedInt(0x7f);  // (1<<7)-1
        expectedOffset += 1;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 1], is((byte) 0x7f));
        assertThat(variableByteLengthOfUnsignedInt(0x7f), is(1));

        e.writeUnsignedInt(128);  // 1<<7
        expectedOffset += 2;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 2], is((byte) 0x80));
        assertThat(bytes[e.getOffset() - 1], is((byte)    1));
        assertThat(variableByteLengthOfUnsignedInt(128), is(2));

        e.writeUnsignedInt(129);  // (1<<7) + 1
        expectedOffset += 2;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 2], is((byte) 0x81));
        assertThat(bytes[e.getOffset() - 1], is((byte)    1));
        assertThat(variableByteLengthOfUnsignedInt(129), is(2));

        e.writeUnsignedInt(256);  // (1<<7) * 2
        expectedOffset += 2;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 2], is((byte) 0x80));
        assertThat(bytes[e.getOffset() - 1], is((byte)    2));
        assertThat(variableByteLengthOfUnsignedInt(256), is(2));

        e.writeUnsignedInt( -2);  // (1<<32)-2
        expectedOffset += 5;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 5], is((byte) 0xfe));
        assertThat(bytes[e.getOffset() - 4], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 3], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 2], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 1], is((byte) 0x0f));
        assertThat(variableByteLengthOfUnsignedInt(-1), is(5));

        e.writeUnsignedInt( -1);  // (1<<32)-1
        expectedOffset += 5;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 5], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 4], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 3], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 2], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 1], is((byte) 0x0f));
        assertThat(variableByteLengthOfUnsignedInt(-1), is(5));
    }

    @Test
    public void staticEncodeZigZagInt()
    {
        byte[] bytes = new byte[100];
        VariableByteEncoder e = new VariableByteEncoder(bytes, 3);
        int expectedOffset = 3;

        e.writeZigZagInt(  0);  // 1-byte
        expectedOffset += 1;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 1], is((byte) 0));
        assertThat(variableByteLengthOfZigZagInt(0), is(1));

        e.writeZigZagInt( -1);  // 1-byte
        expectedOffset += 1;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 1], is((byte) 1));
        assertThat(variableByteLengthOfZigZagInt(-1), is(1));

        e.writeZigZagInt(  1);  // 1-byte
        expectedOffset += 1;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 1], is((byte) 2));
        assertThat(variableByteLengthOfZigZagInt(1), is(1));

        e.writeZigZagInt( -2);  // 1-byte
        expectedOffset += 1;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 1], is((byte) 3));
        assertThat(variableByteLengthOfZigZagInt(-2), is(1));

        e.writeZigZagInt(0x7f);  // (1<<7)-1
        expectedOffset += 2;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 2], is((byte) 0xfe));
        assertThat(bytes[e.getOffset() - 1], is((byte)    1));
        assertThat(variableByteLengthOfZigZagInt(0x7f), is(2));
    }

    @Test
    public void staticEncodeUnsignedLong()
    {
        byte[] bytes = new byte[100];
        VariableByteEncoder e = new VariableByteEncoder(bytes, 3);
        int expectedOffset = 3;

        e.writeUnsignedLong(  1L);  // 1-byte
        expectedOffset += 1;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 1], is((byte) 1));
        assertThat(variableByteLengthOfUnsignedLong(1L), is(1));

        e.writeUnsignedLong(  2L);  // 1-byte
        expectedOffset += 1;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 1], is((byte) 2));
        assertThat(variableByteLengthOfUnsignedLong(2L), is(1));

        e.writeUnsignedLong(0x7fL);  // (1<<7)-1
        expectedOffset += 1;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 1], is((byte) 0x7f));
        assertThat(variableByteLengthOfUnsignedLong(0x7fL), is(1));

        e.writeUnsignedLong(128L);  // 1<<7
        expectedOffset += 2;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 2], is((byte) 0x80));
        assertThat(bytes[e.getOffset() - 1], is((byte)    1));
        assertThat(variableByteLengthOfUnsignedLong(128L), is(2));

        e.writeUnsignedLong(129L);  // (1<<7) + 1
        expectedOffset += 2;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 2], is((byte) 0x81));
        assertThat(bytes[e.getOffset() - 1], is((byte)    1));
        assertThat(variableByteLengthOfUnsignedLong(129L), is(2));

        e.writeUnsignedLong(256L);  // (1<<7) * 2
        expectedOffset += 2;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 2], is((byte) 0x80));
        assertThat(bytes[e.getOffset() - 1], is((byte)    2));
        assertThat(variableByteLengthOfUnsignedLong(256L), is(2));

        e.writeUnsignedLong( -2L);  // (1<<64)-2
        expectedOffset += 10;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() -10], is((byte) 0xfe));
        assertThat(bytes[e.getOffset() - 9], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 7], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 6], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 5], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 4], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 3], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 2], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 1], is((byte) 0x01));
        assertThat(variableByteLengthOfUnsignedLong(-2L), is(10));

        e.writeUnsignedLong( -1L);  // (1<<64)-1
        expectedOffset += 10;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() -10], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 9], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 7], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 6], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 5], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 4], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 3], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 2], is((byte) 0xff));
        assertThat(bytes[e.getOffset() - 1], is((byte) 0x01));
        assertThat(variableByteLengthOfUnsignedLong(-1L), is(10));
    }

    @Test
    public void staticEncodeZigZagLong()
    {
        byte[] bytes = new byte[100];
        VariableByteEncoder e = new VariableByteEncoder(bytes, 3);
        int expectedOffset = 3;

        e.writeZigZagLong(  0L);  // 1-byte
        expectedOffset += 1;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 1], is((byte) 0));
        assertThat(variableByteLengthOfZigZagLong(0L), is(1));

        e.writeZigZagLong( -1L);  // 1-byte
        expectedOffset += 1;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 1], is((byte) 1));
        assertThat(variableByteLengthOfZigZagLong(-1L), is(1));

        e.writeZigZagLong(  1L);  // 1-byte
        expectedOffset += 1;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 1], is((byte) 2));
        assertThat(variableByteLengthOfZigZagLong(1L), is(1));

        e.writeZigZagLong( -2L);  // 1-byte
        expectedOffset += 1;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 1], is((byte) 3));
        assertThat(variableByteLengthOfZigZagLong(-2L), is(1));

        e.writeZigZagLong(0x7fL);  // (1<<7)-1
        expectedOffset += 2;
        assertThat(e.getOffset(), is(expectedOffset));
        assertThat(bytes[e.getOffset() - 2], is((byte) 0xfe));
        assertThat(bytes[e.getOffset() - 1], is((byte)    1));
        assertThat(variableByteLengthOfZigZagLong(0x7fL), is(2));
    }

    @Test
    public void randomRoundTripUnsignedInt()
    {
        byte[] bytes = new byte[8000];
        VariableByteEncoder enc = new VariableByteEncoder(bytes, 7);
        List<Integer> expected = new ArrayList<>();

        Random rand = newRandom();
        for (int i = 0; i < 1000; i++) {
            int src = rand.nextInt();
            enc.writeUnsignedInt(src);
            expected.add(src);
        }

        VariableByteDecoder dec = new VariableByteDecoder(bytes, 7);
        for (int i = 0; i < 1000; i++) {
            assertThat(dec.readUnsignedInt(), is(expected.get(i)));
        }
    }

    @Test
    public void randomRoundTripUnsignedLong()
    {
        byte[] bytes = new byte[16000];
        VariableByteEncoder enc = new VariableByteEncoder(bytes, 7);
        List<Long> expected = new ArrayList<>();

        Random rand = newRandom();
        for (int i = 0; i < 1000; i++) {
            long src = rand.nextLong();
            src >>= rand.nextInt(64);
            enc.writeUnsignedLong(src);
            expected.add(src);
        }

        VariableByteDecoder dec = new VariableByteDecoder(bytes, 7);
        for (int i = 0; i < 1000; i++) {
            assertThat(dec.readUnsignedLong(), is(expected.get(i)));
        }
    }

    @Test
    public void randomRoundTripZigZagInt()
    {
        byte[] bytes = new byte[16000];
        VariableByteEncoder enc = new VariableByteEncoder(bytes, 7);
        List<Integer> expected = new ArrayList<>();

        Random rand = newRandom();
        for (int i = 0; i < 1000; i++) {
            int src = rand.nextInt();
            src >>= rand.nextInt(32);
            enc.writeZigZagInt(src);
            expected.add(src);
        }

        VariableByteDecoder dec = new VariableByteDecoder(bytes, 7);
        for (int i = 0; i < 1000; i++) {
            assertThat(dec.readZigZagInt(), is(expected.get(i)));
        }
    }

    @Test
    public void randomRoundTripZigZagLong()
    {
        byte[] bytes = new byte[16000];
        VariableByteEncoder enc = new VariableByteEncoder(bytes, 7);
        List<Long> expected = new ArrayList<>();

        Random rand = newRandom();
        for (int i = 0; i < 1000; i++) {
            long src = rand.nextLong();
            src >>= rand.nextInt(64);
            enc.writeZigZagLong(src);
            expected.add(src);
        }

        VariableByteDecoder dec = new VariableByteDecoder(bytes, 7);
        for (int i = 0; i < 1000; i++) {
            assertThat(dec.readZigZagLong(), is(expected.get(i)));
        }
    }

    @Test
    public void randomRoundTripZigZagIntRangeEncodingByLong()
    {
        byte[] bytes = new byte[16000];
        VariableByteEncoder enc = new VariableByteEncoder(bytes, 7);
        List<Integer> expected = new ArrayList<>();

        Random rand = newRandom();
        for (int i = 0; i < 1000; i++) {
            int src = rand.nextInt();
            src >>= rand.nextInt(32);
            enc.writeZigZagLong(src);
            expected.add(src);
        }

        VariableByteDecoder dec = new VariableByteDecoder(bytes, 7);
        for (int i = 0; i < 1000; i++) {
            assertThat(dec.readZigZagInt(), is(expected.get(i)));
        }
    }

    @Test
    public void randomRoundTripZigZagIntRangeDecodingByInt()
    {
        byte[] bytes = new byte[16000];
        VariableByteEncoder enc = new VariableByteEncoder(bytes, 7);
        List<Integer> expected = new ArrayList<>();

        Random rand = newRandom();
        for (int i = 0; i < 1000; i++) {
            int src = rand.nextInt();
            enc.writeZigZagInt(src);
            expected.add(src);
        }

        VariableByteDecoder dec = new VariableByteDecoder(bytes, 7);
        for (int i = 0; i < 1000; i++) {
            assertThat((int) dec.readZigZagLong(), is(expected.get(i)));
        }
    }

    @Test
    public void testSetGetOffset()
    {
        byte[] bytes = new byte[100];

        VariableByteEncoder enc = new VariableByteEncoder(bytes, 0);
        enc.setOffset(5);
        enc.writeUnsignedInt(5);
        assertThat(bytes[5], is((byte) 5));
        assertThat(enc.getOffset(), is(6));

        VariableByteDecoder dec = new VariableByteDecoder(bytes, 0);
        dec.setOffset(5);
        assertThat(dec.readUnsignedInt(), is(5));
        assertThat(dec.getOffset(), is(6));
    }

    @Test
    public void testOutOfIndex()
    {
        byte[] bytes = new byte[10];

        VariableByteEncoder enc = new VariableByteEncoder(bytes, 8);
        assertArrayIndexOutOfBoundsException(() -> enc.writeUnsignedInt(0x7fffffff));

        VariableByteDecoder dec = new VariableByteDecoder(bytes, 8);
        assertArrayIndexOutOfBoundsException(() -> dec.readUnsignedInt());
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
