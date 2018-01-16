package io.github.intbit;

import java.util.List;
import java.util.stream.IntStream;
import org.junit.Test;
import static io.github.intbit.BitPacking.bitPack8IntLE;
import static io.github.intbit.BitPacking.bitPack8LongLE;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BitPackingLEFormatTest
{
    @Test
    public void staticFormat()
    {
        int[] int8 = {
            0b1110, 0b1010,
            0b1110, 0b1010,
            0b0110, 0b0010,
            0b0110, 0b0010,
        };

        byte[] expected = new byte[4];
        BitWriter w = new BitWriter(expected, 0);
        for (int v : int8) {
            w.writeLongLE(v, 4);
        }
        w.sync();

        byte[] packedInt = new byte[4];
        bitPack8IntLE(int8, 0, packedInt, 0, 4);
        assertThat(packedInt, is(expected));

        byte[] packedLong = new byte[4];
        long[] long8 = IntStream.of(int8).mapToLong(v -> v).toArray();
        bitPack8LongLE(long8, 0, packedLong, 0, 4);
        assertThat(packedLong, is(expected));
    }
}
