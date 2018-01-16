package io.github.intbit;

import static io.github.intbit.ZigZagCodings.decodeZigZagInt;
import static io.github.intbit.ZigZagCodings.decodeZigZagLong;

public class VariableByteDecoder
{
    private final byte[] src;
    private int srcOff;

    public VariableByteDecoder(byte[] src, int srcOff)
    {
        this.src = src;
        this.srcOff = srcOff;
    }

    public int getOffset()
    {
        return srcOff;
    }

    public void setOffset(int srcOff)
    {
        this.srcOff = srcOff;
    }

    public long readUnsignedLong()
    {
        long unsigned = 0;
        int i = 0;
        long b;
        while (((b = src[srcOff] & 0xff) & 0x80) != 0) {
            unsigned |= (b & 0x7f) << i;
            i += 7;
            srcOff++;
        }
        srcOff++;
        return unsigned | (b << i);
    }

    public int readUnsignedInt()
    {
        int unsigned = 0;
        int i = 0;
        int b;
        while (((b = src[srcOff] & 0xff) & 0x80) != 0) {
            unsigned |= (b & 0x7f) << i;
            i += 7;
            srcOff++;
        }
        srcOff++;
        return unsigned | (b << i);
    }

    public long readZigZagLong()
    {
        return decodeZigZagLong(readUnsignedLong());
    }

    public int readZigZagInt()
    {
        return decodeZigZagInt(readUnsignedInt());
    }
}
