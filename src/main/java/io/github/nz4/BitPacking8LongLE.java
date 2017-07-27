package io.github.nz4;

final class BitPacking8LongLE
{
    private BitPacking8LongLE()
    { }

    public static void pack(long[] src, int srcOff, byte[] dst, int dstOff, int bits)
    {
        switch (bits) {
        case 0:
            // do nothing
            break;
        case 1:
            bitPack8LongLE1(src, srcOff, dst, dstOff);
            break;
        case 2:
            bitPack8LongLE2(src, srcOff, dst, dstOff);
            break;
        case 3:
            bitPack8LongLE3(src, srcOff, dst, dstOff);
            break;
        case 4:
            bitPack8LongLE4(src, srcOff, dst, dstOff);
            break;
        case 5:
            bitPack8LongLE5(src, srcOff, dst, dstOff);
            break;
        case 6:
            bitPack8LongLE6(src, srcOff, dst, dstOff);
            break;
        case 7:
            bitPack8LongLE7(src, srcOff, dst, dstOff);
            break;
        case 8:
            bitPack8LongLE8(src, srcOff, dst, dstOff);
            break;
        case 9:
            bitPack8LongLE9(src, srcOff, dst, dstOff);
            break;
        case 10:
            bitPack8LongLE10(src, srcOff, dst, dstOff);
            break;
        case 11:
            bitPack8LongLE11(src, srcOff, dst, dstOff);
            break;
        case 12:
            bitPack8LongLE12(src, srcOff, dst, dstOff);
            break;
        case 13:
            bitPack8LongLE13(src, srcOff, dst, dstOff);
            break;
        case 14:
            bitPack8LongLE14(src, srcOff, dst, dstOff);
            break;
        case 15:
            bitPack8LongLE15(src, srcOff, dst, dstOff);
            break;
        case 16:
            bitPack8LongLE16(src, srcOff, dst, dstOff);
            break;
        case 17:
            bitPack8LongLE17(src, srcOff, dst, dstOff);
            break;
        case 18:
            bitPack8LongLE18(src, srcOff, dst, dstOff);
            break;
        case 19:
            bitPack8LongLE19(src, srcOff, dst, dstOff);
            break;
        case 20:
            bitPack8LongLE20(src, srcOff, dst, dstOff);
            break;
        case 21:
            bitPack8LongLE21(src, srcOff, dst, dstOff);
            break;
        case 22:
            bitPack8LongLE22(src, srcOff, dst, dstOff);
            break;
        case 23:
            bitPack8LongLE23(src, srcOff, dst, dstOff);
            break;
        case 24:
            bitPack8LongLE24(src, srcOff, dst, dstOff);
            break;
        case 25:
            bitPack8LongLE25(src, srcOff, dst, dstOff);
            break;
        case 26:
            bitPack8LongLE26(src, srcOff, dst, dstOff);
            break;
        case 27:
            bitPack8LongLE27(src, srcOff, dst, dstOff);
            break;
        case 28:
            bitPack8LongLE28(src, srcOff, dst, dstOff);
            break;
        case 29:
            bitPack8LongLE29(src, srcOff, dst, dstOff);
            break;
        case 30:
            bitPack8LongLE30(src, srcOff, dst, dstOff);
            break;
        case 31:
            bitPack8LongLE31(src, srcOff, dst, dstOff);
            break;
        case 32:
            bitPack8LongLE32(src, srcOff, dst, dstOff);
            break;
        case 33:
            bitPack8LongLE33(src, srcOff, dst, dstOff);
            break;
        case 34:
            bitPack8LongLE34(src, srcOff, dst, dstOff);
            break;
        case 35:
            bitPack8LongLE35(src, srcOff, dst, dstOff);
            break;
        case 36:
            bitPack8LongLE36(src, srcOff, dst, dstOff);
            break;
        case 37:
            bitPack8LongLE37(src, srcOff, dst, dstOff);
            break;
        case 38:
            bitPack8LongLE38(src, srcOff, dst, dstOff);
            break;
        case 39:
            bitPack8LongLE39(src, srcOff, dst, dstOff);
            break;
        case 40:
            bitPack8LongLE40(src, srcOff, dst, dstOff);
            break;
        case 41:
            bitPack8LongLE41(src, srcOff, dst, dstOff);
            break;
        case 42:
            bitPack8LongLE42(src, srcOff, dst, dstOff);
            break;
        case 43:
            bitPack8LongLE43(src, srcOff, dst, dstOff);
            break;
        case 44:
            bitPack8LongLE44(src, srcOff, dst, dstOff);
            break;
        case 45:
            bitPack8LongLE45(src, srcOff, dst, dstOff);
            break;
        case 46:
            bitPack8LongLE46(src, srcOff, dst, dstOff);
            break;
        case 47:
            bitPack8LongLE47(src, srcOff, dst, dstOff);
            break;
        case 48:
            bitPack8LongLE48(src, srcOff, dst, dstOff);
            break;
        case 49:
            bitPack8LongLE49(src, srcOff, dst, dstOff);
            break;
        case 50:
            bitPack8LongLE50(src, srcOff, dst, dstOff);
            break;
        case 51:
            bitPack8LongLE51(src, srcOff, dst, dstOff);
            break;
        case 52:
            bitPack8LongLE52(src, srcOff, dst, dstOff);
            break;
        case 53:
            bitPack8LongLE53(src, srcOff, dst, dstOff);
            break;
        case 54:
            bitPack8LongLE54(src, srcOff, dst, dstOff);
            break;
        case 55:
            bitPack8LongLE55(src, srcOff, dst, dstOff);
            break;
        case 56:
            bitPack8LongLE56(src, srcOff, dst, dstOff);
            break;
        case 57:
            bitPack8LongLE57(src, srcOff, dst, dstOff);
            break;
        case 58:
            bitPack8LongLE58(src, srcOff, dst, dstOff);
            break;
        case 59:
            bitPack8LongLE59(src, srcOff, dst, dstOff);
            break;
        case 60:
            bitPack8LongLE60(src, srcOff, dst, dstOff);
            break;
        case 61:
            bitPack8LongLE61(src, srcOff, dst, dstOff);
            break;
        case 62:
            bitPack8LongLE62(src, srcOff, dst, dstOff);
            break;
        case 63:
            bitPack8LongLE63(src, srcOff, dst, dstOff);
            break;
        case 64:
            bitPack8LongLE64(src, srcOff, dst, dstOff);
            break;
        default:
            throw new IllegalArgumentException("Bit width must be from 0 to 64 but got " + bits);
        }
    }

    public static void bitPack8LongLE1(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1L) <<  0)
                | ((src[ 1 + srcOff] & 0x1L) <<  1)
                | ((src[ 2 + srcOff] & 0x1L) <<  2)
                | ((src[ 3 + srcOff] & 0x1L) <<  3)
                | ((src[ 4 + srcOff] & 0x1L) <<  4)
                | ((src[ 5 + srcOff] & 0x1L) <<  5)
                | ((src[ 6 + srcOff] & 0x1L) <<  6)
                | ((src[ 7 + srcOff] & 0x1L) <<  7)
            ) & 0xff);
    }

    public static void bitPack8LongLE2(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3L) <<  0)
                | ((src[ 1 + srcOff] & 0x3L) <<  2)
                | ((src[ 2 + srcOff] & 0x3L) <<  4)
                | ((src[ 3 + srcOff] & 0x3L) <<  6)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3L) <<  0)
                | ((src[ 5 + srcOff] & 0x3L) <<  2)
                | ((src[ 6 + srcOff] & 0x3L) <<  4)
                | ((src[ 7 + srcOff] & 0x3L) <<  6)
            ) & 0xff);
    }

    public static void bitPack8LongLE3(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7L) <<  0)
                | ((src[ 1 + srcOff] & 0x7L) <<  3)
                | ((src[ 2 + srcOff] & 0x7L) <<  6)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7L) >>> 2)
                | ((src[ 3 + srcOff] & 0x7L) <<  1)
                | ((src[ 4 + srcOff] & 0x7L) <<  4)
                | ((src[ 5 + srcOff] & 0x7L) <<  7)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7L) >>> 1)
                | ((src[ 6 + srcOff] & 0x7L) <<  2)
                | ((src[ 7 + srcOff] & 0x7L) <<  5)
            ) & 0xff);
    }

    public static void bitPack8LongLE4(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfL) <<  0)
                | ((src[ 1 + srcOff] & 0xfL) <<  4)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfL) <<  0)
                | ((src[ 3 + srcOff] & 0xfL) <<  4)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfL) <<  0)
                | ((src[ 5 + srcOff] & 0xfL) <<  4)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfL) <<  0)
                | ((src[ 7 + srcOff] & 0xfL) <<  4)
            ) & 0xff);
    }

    public static void bitPack8LongLE5(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fL) <<  0)
                | ((src[ 1 + srcOff] & 0x1fL) <<  5)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fL) >>> 3)
                | ((src[ 2 + srcOff] & 0x1fL) <<  2)
                | ((src[ 3 + srcOff] & 0x1fL) <<  7)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fL) >>> 1)
                | ((src[ 4 + srcOff] & 0x1fL) <<  4)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fL) >>> 4)
                | ((src[ 5 + srcOff] & 0x1fL) <<  1)
                | ((src[ 6 + srcOff] & 0x1fL) <<  6)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fL) >>> 2)
                | ((src[ 7 + srcOff] & 0x1fL) <<  3)
            ) & 0xff);
    }

    public static void bitPack8LongLE6(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fL) <<  0)
                | ((src[ 1 + srcOff] & 0x3fL) <<  6)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fL) >>> 2)
                | ((src[ 2 + srcOff] & 0x3fL) <<  4)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fL) >>> 4)
                | ((src[ 3 + srcOff] & 0x3fL) <<  2)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fL) <<  0)
                | ((src[ 5 + srcOff] & 0x3fL) <<  6)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fL) >>> 2)
                | ((src[ 6 + srcOff] & 0x3fL) <<  4)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fL) >>> 4)
                | ((src[ 7 + srcOff] & 0x3fL) <<  2)
            ) & 0xff);
    }

    public static void bitPack8LongLE7(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fL) <<  0)
                | ((src[ 1 + srcOff] & 0x7fL) <<  7)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fL) >>> 1)
                | ((src[ 2 + srcOff] & 0x7fL) <<  6)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fL) >>> 2)
                | ((src[ 3 + srcOff] & 0x7fL) <<  5)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fL) >>> 3)
                | ((src[ 4 + srcOff] & 0x7fL) <<  4)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fL) >>> 4)
                | ((src[ 5 + srcOff] & 0x7fL) <<  3)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fL) >>> 5)
                | ((src[ 6 + srcOff] & 0x7fL) <<  2)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fL) >>> 6)
                | ((src[ 7 + srcOff] & 0x7fL) <<  1)
            ) & 0xff);
    }

    public static void bitPack8LongLE8(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffL) <<  0)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffL) <<  0)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffL) <<  0)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffL) <<  0)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffL) <<  0)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffL) <<  0)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffL) <<  0)
            ) & 0xff);
    }

    public static void bitPack8LongLE9(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffL) >>> 8)
                | ((src[ 1 + srcOff] & 0x1ffL) <<  1)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffL) >>> 7)
                | ((src[ 2 + srcOff] & 0x1ffL) <<  2)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffL) >>> 6)
                | ((src[ 3 + srcOff] & 0x1ffL) <<  3)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffL) >>> 5)
                | ((src[ 4 + srcOff] & 0x1ffL) <<  4)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffL) >>> 4)
                | ((src[ 5 + srcOff] & 0x1ffL) <<  5)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffL) >>> 3)
                | ((src[ 6 + srcOff] & 0x1ffL) <<  6)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffL) >>> 2)
                | ((src[ 7 + srcOff] & 0x1ffL) <<  7)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffL) >>> 1)
            ) & 0xff);
    }

    public static void bitPack8LongLE10(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffL) >>> 8)
                | ((src[ 1 + srcOff] & 0x3ffL) <<  2)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffL) >>> 6)
                | ((src[ 2 + srcOff] & 0x3ffL) <<  4)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffL) >>> 4)
                | ((src[ 3 + srcOff] & 0x3ffL) <<  6)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffL) >>> 2)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffL) <<  0)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffL) >>> 8)
                | ((src[ 5 + srcOff] & 0x3ffL) <<  2)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffL) >>> 6)
                | ((src[ 6 + srcOff] & 0x3ffL) <<  4)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffL) >>> 4)
                | ((src[ 7 + srcOff] & 0x3ffL) <<  6)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffL) >>> 2)
            ) & 0xff);
    }

    public static void bitPack8LongLE11(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffL) >>> 8)
                | ((src[ 1 + srcOff] & 0x7ffL) <<  3)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffL) >>> 5)
                | ((src[ 2 + srcOff] & 0x7ffL) <<  6)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffL) >>> 2)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffL) >>> 10)
                | ((src[ 3 + srcOff] & 0x7ffL) <<  1)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffL) >>> 7)
                | ((src[ 4 + srcOff] & 0x7ffL) <<  4)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffL) >>> 4)
                | ((src[ 5 + srcOff] & 0x7ffL) <<  7)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffL) >>> 1)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffL) >>> 9)
                | ((src[ 6 + srcOff] & 0x7ffL) <<  2)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffL) >>> 6)
                | ((src[ 7 + srcOff] & 0x7ffL) <<  5)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffL) >>> 3)
            ) & 0xff);
    }

    public static void bitPack8LongLE12(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffL) >>> 8)
                | ((src[ 1 + srcOff] & 0xfffL) <<  4)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffL) >>> 4)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffL) <<  0)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffL) >>> 8)
                | ((src[ 3 + srcOff] & 0xfffL) <<  4)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffL) >>> 4)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffL) <<  0)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffL) >>> 8)
                | ((src[ 5 + srcOff] & 0xfffL) <<  4)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffL) >>> 4)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffL) <<  0)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffL) >>> 8)
                | ((src[ 7 + srcOff] & 0xfffL) <<  4)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffL) >>> 4)
            ) & 0xff);
    }

    public static void bitPack8LongLE13(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffL) >>> 8)
                | ((src[ 1 + srcOff] & 0x1fffL) <<  5)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffL) >>> 3)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffL) >>> 11)
                | ((src[ 2 + srcOff] & 0x1fffL) <<  2)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffL) >>> 6)
                | ((src[ 3 + srcOff] & 0x1fffL) <<  7)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffL) >>> 1)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffL) >>> 9)
                | ((src[ 4 + srcOff] & 0x1fffL) <<  4)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffL) >>> 4)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffL) >>> 12)
                | ((src[ 5 + srcOff] & 0x1fffL) <<  1)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffL) >>> 7)
                | ((src[ 6 + srcOff] & 0x1fffL) <<  6)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffL) >>> 2)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffL) >>> 10)
                | ((src[ 7 + srcOff] & 0x1fffL) <<  3)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffL) >>> 5)
            ) & 0xff);
    }

    public static void bitPack8LongLE14(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffL) >>> 8)
                | ((src[ 1 + srcOff] & 0x3fffL) <<  6)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffL) >>> 2)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffL) >>> 10)
                | ((src[ 2 + srcOff] & 0x3fffL) <<  4)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffL) >>> 4)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffL) >>> 12)
                | ((src[ 3 + srcOff] & 0x3fffL) <<  2)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffL) >>> 6)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffL) <<  0)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffL) >>> 8)
                | ((src[ 5 + srcOff] & 0x3fffL) <<  6)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffL) >>> 2)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffL) >>> 10)
                | ((src[ 6 + srcOff] & 0x3fffL) <<  4)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffL) >>> 4)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffL) >>> 12)
                | ((src[ 7 + srcOff] & 0x3fffL) <<  2)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffL) >>> 6)
            ) & 0xff);
    }

    public static void bitPack8LongLE15(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffL) >>> 8)
                | ((src[ 1 + srcOff] & 0x7fffL) <<  7)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffL) >>> 1)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffL) >>> 9)
                | ((src[ 2 + srcOff] & 0x7fffL) <<  6)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffL) >>> 2)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffL) >>> 10)
                | ((src[ 3 + srcOff] & 0x7fffL) <<  5)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffL) >>> 3)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffL) >>> 11)
                | ((src[ 4 + srcOff] & 0x7fffL) <<  4)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffL) >>> 4)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffL) >>> 12)
                | ((src[ 5 + srcOff] & 0x7fffL) <<  3)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffL) >>> 5)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffL) >>> 13)
                | ((src[ 6 + srcOff] & 0x7fffL) <<  2)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffL) >>> 6)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffL) >>> 14)
                | ((src[ 7 + srcOff] & 0x7fffL) <<  1)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffL) >>> 7)
            ) & 0xff);
    }

    public static void bitPack8LongLE16(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffL) <<  0)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffL) >>> 8)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffL) <<  0)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffL) >>> 8)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffL) <<  0)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffL) >>> 8)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffL) <<  0)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffL) >>> 8)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffL) <<  0)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffL) >>> 8)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffL) <<  0)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffL) >>> 8)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffL) <<  0)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffL) >>> 8)
            ) & 0xff);
    }

    public static void bitPack8LongLE17(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffL) >>> 16)
                | ((src[ 1 + srcOff] & 0x1ffffL) <<  1)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffL) >>> 7)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffL) >>> 15)
                | ((src[ 2 + srcOff] & 0x1ffffL) <<  2)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffL) >>> 6)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffL) >>> 14)
                | ((src[ 3 + srcOff] & 0x1ffffL) <<  3)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffL) >>> 5)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffL) >>> 13)
                | ((src[ 4 + srcOff] & 0x1ffffL) <<  4)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffL) >>> 4)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffL) >>> 12)
                | ((src[ 5 + srcOff] & 0x1ffffL) <<  5)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffL) >>> 3)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffL) >>> 11)
                | ((src[ 6 + srcOff] & 0x1ffffL) <<  6)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffL) >>> 2)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffL) >>> 10)
                | ((src[ 7 + srcOff] & 0x1ffffL) <<  7)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffL) >>> 1)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffL) >>> 9)
            ) & 0xff);
    }

    public static void bitPack8LongLE18(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffL) >>> 16)
                | ((src[ 1 + srcOff] & 0x3ffffL) <<  2)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffL) >>> 6)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffL) >>> 14)
                | ((src[ 2 + srcOff] & 0x3ffffL) <<  4)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffL) >>> 4)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffL) >>> 12)
                | ((src[ 3 + srcOff] & 0x3ffffL) <<  6)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffL) >>> 2)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffL) >>> 10)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffL) <<  0)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffL) >>> 8)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffL) >>> 16)
                | ((src[ 5 + srcOff] & 0x3ffffL) <<  2)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffL) >>> 6)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffL) >>> 14)
                | ((src[ 6 + srcOff] & 0x3ffffL) <<  4)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffL) >>> 4)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffL) >>> 12)
                | ((src[ 7 + srcOff] & 0x3ffffL) <<  6)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffL) >>> 2)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffL) >>> 10)
            ) & 0xff);
    }

    public static void bitPack8LongLE19(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffL) >>> 16)
                | ((src[ 1 + srcOff] & 0x7ffffL) <<  3)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffL) >>> 5)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffL) >>> 13)
                | ((src[ 2 + srcOff] & 0x7ffffL) <<  6)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffL) >>> 2)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffL) >>> 10)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffL) >>> 18)
                | ((src[ 3 + srcOff] & 0x7ffffL) <<  1)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffL) >>> 7)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffL) >>> 15)
                | ((src[ 4 + srcOff] & 0x7ffffL) <<  4)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffL) >>> 4)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffL) >>> 12)
                | ((src[ 5 + srcOff] & 0x7ffffL) <<  7)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffL) >>> 1)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffL) >>> 9)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffL) >>> 17)
                | ((src[ 6 + srcOff] & 0x7ffffL) <<  2)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffL) >>> 6)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffL) >>> 14)
                | ((src[ 7 + srcOff] & 0x7ffffL) <<  5)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffL) >>> 3)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffL) >>> 11)
            ) & 0xff);
    }

    public static void bitPack8LongLE20(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffL) >>> 16)
                | ((src[ 1 + srcOff] & 0xfffffL) <<  4)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffL) >>> 4)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffL) >>> 12)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffL) <<  0)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffL) >>> 8)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffL) >>> 16)
                | ((src[ 3 + srcOff] & 0xfffffL) <<  4)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffL) >>> 4)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffL) >>> 12)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffL) <<  0)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffL) >>> 8)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffL) >>> 16)
                | ((src[ 5 + srcOff] & 0xfffffL) <<  4)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffL) >>> 4)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffL) >>> 12)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffL) <<  0)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffL) >>> 8)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffL) >>> 16)
                | ((src[ 7 + srcOff] & 0xfffffL) <<  4)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffL) >>> 4)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffL) >>> 12)
            ) & 0xff);
    }

    public static void bitPack8LongLE21(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffL) >>> 16)
                | ((src[ 1 + srcOff] & 0x1fffffL) <<  5)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffL) >>> 3)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffL) >>> 11)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffL) >>> 19)
                | ((src[ 2 + srcOff] & 0x1fffffL) <<  2)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffL) >>> 6)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffL) >>> 14)
                | ((src[ 3 + srcOff] & 0x1fffffL) <<  7)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffL) >>> 1)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffL) >>> 9)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffL) >>> 17)
                | ((src[ 4 + srcOff] & 0x1fffffL) <<  4)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffL) >>> 4)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffL) >>> 12)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffL) >>> 20)
                | ((src[ 5 + srcOff] & 0x1fffffL) <<  1)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffL) >>> 7)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffL) >>> 15)
                | ((src[ 6 + srcOff] & 0x1fffffL) <<  6)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffL) >>> 2)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffL) >>> 10)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffL) >>> 18)
                | ((src[ 7 + srcOff] & 0x1fffffL) <<  3)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffL) >>> 5)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffL) >>> 13)
            ) & 0xff);
    }

    public static void bitPack8LongLE22(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffL) >>> 16)
                | ((src[ 1 + srcOff] & 0x3fffffL) <<  6)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffL) >>> 2)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffL) >>> 10)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffL) >>> 18)
                | ((src[ 2 + srcOff] & 0x3fffffL) <<  4)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffL) >>> 4)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffL) >>> 12)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffL) >>> 20)
                | ((src[ 3 + srcOff] & 0x3fffffL) <<  2)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffL) >>> 6)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffL) >>> 14)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffL) <<  0)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffL) >>> 8)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffL) >>> 16)
                | ((src[ 5 + srcOff] & 0x3fffffL) <<  6)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffL) >>> 2)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffL) >>> 10)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffL) >>> 18)
                | ((src[ 6 + srcOff] & 0x3fffffL) <<  4)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffL) >>> 4)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffL) >>> 12)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffL) >>> 20)
                | ((src[ 7 + srcOff] & 0x3fffffL) <<  2)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffL) >>> 6)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffL) >>> 14)
            ) & 0xff);
    }

    public static void bitPack8LongLE23(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffL) >>> 16)
                | ((src[ 1 + srcOff] & 0x7fffffL) <<  7)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffL) >>> 1)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffL) >>> 9)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffL) >>> 17)
                | ((src[ 2 + srcOff] & 0x7fffffL) <<  6)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffL) >>> 2)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffL) >>> 10)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffL) >>> 18)
                | ((src[ 3 + srcOff] & 0x7fffffL) <<  5)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffL) >>> 3)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffL) >>> 11)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffL) >>> 19)
                | ((src[ 4 + srcOff] & 0x7fffffL) <<  4)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffL) >>> 4)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffL) >>> 12)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffL) >>> 20)
                | ((src[ 5 + srcOff] & 0x7fffffL) <<  3)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffL) >>> 5)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffL) >>> 13)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffL) >>> 21)
                | ((src[ 6 + srcOff] & 0x7fffffL) <<  2)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffL) >>> 6)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffL) >>> 14)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffL) >>> 22)
                | ((src[ 7 + srcOff] & 0x7fffffL) <<  1)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffL) >>> 7)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffL) >>> 15)
            ) & 0xff);
    }

    public static void bitPack8LongLE24(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffL) <<  0)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffL) >>> 8)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffL) >>> 16)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffL) <<  0)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffL) >>> 8)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffL) >>> 16)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffL) <<  0)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffL) >>> 8)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffL) >>> 16)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffL) <<  0)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffL) >>> 8)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffL) >>> 16)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffL) <<  0)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffL) >>> 8)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffL) >>> 16)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffL) <<  0)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffL) >>> 8)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffL) >>> 16)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffL) <<  0)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffL) >>> 8)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffL) >>> 16)
            ) & 0xff);
    }

    public static void bitPack8LongLE25(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffL) >>> 24)
                | ((src[ 1 + srcOff] & 0x1ffffffL) <<  1)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffL) >>> 7)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffL) >>> 15)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffL) >>> 23)
                | ((src[ 2 + srcOff] & 0x1ffffffL) <<  2)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffL) >>> 6)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffL) >>> 14)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffL) >>> 22)
                | ((src[ 3 + srcOff] & 0x1ffffffL) <<  3)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffL) >>> 5)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffL) >>> 13)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffL) >>> 21)
                | ((src[ 4 + srcOff] & 0x1ffffffL) <<  4)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffL) >>> 4)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffL) >>> 12)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffL) >>> 20)
                | ((src[ 5 + srcOff] & 0x1ffffffL) <<  5)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffL) >>> 3)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffL) >>> 11)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffL) >>> 19)
                | ((src[ 6 + srcOff] & 0x1ffffffL) <<  6)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffL) >>> 2)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffL) >>> 10)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffL) >>> 18)
                | ((src[ 7 + srcOff] & 0x1ffffffL) <<  7)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffL) >>> 1)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffL) >>> 9)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffL) >>> 17)
            ) & 0xff);
    }

    public static void bitPack8LongLE26(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffL) >>> 24)
                | ((src[ 1 + srcOff] & 0x3ffffffL) <<  2)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffL) >>> 6)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffL) >>> 14)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffL) >>> 22)
                | ((src[ 2 + srcOff] & 0x3ffffffL) <<  4)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffL) >>> 4)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffL) >>> 12)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffL) >>> 20)
                | ((src[ 3 + srcOff] & 0x3ffffffL) <<  6)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffL) >>> 2)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffL) >>> 10)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffL) >>> 18)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffL) <<  0)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffL) >>> 8)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffL) >>> 16)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffL) >>> 24)
                | ((src[ 5 + srcOff] & 0x3ffffffL) <<  2)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffL) >>> 6)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffL) >>> 14)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffL) >>> 22)
                | ((src[ 6 + srcOff] & 0x3ffffffL) <<  4)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffL) >>> 4)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffL) >>> 12)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffL) >>> 20)
                | ((src[ 7 + srcOff] & 0x3ffffffL) <<  6)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffL) >>> 2)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffL) >>> 10)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffL) >>> 18)
            ) & 0xff);
    }

    public static void bitPack8LongLE27(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffL) >>> 24)
                | ((src[ 1 + srcOff] & 0x7ffffffL) <<  3)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffL) >>> 5)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffL) >>> 13)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffL) >>> 21)
                | ((src[ 2 + srcOff] & 0x7ffffffL) <<  6)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffL) >>> 2)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffL) >>> 10)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffL) >>> 18)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffL) >>> 26)
                | ((src[ 3 + srcOff] & 0x7ffffffL) <<  1)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffL) >>> 7)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffL) >>> 15)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffL) >>> 23)
                | ((src[ 4 + srcOff] & 0x7ffffffL) <<  4)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffL) >>> 4)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffL) >>> 12)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffL) >>> 20)
                | ((src[ 5 + srcOff] & 0x7ffffffL) <<  7)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffL) >>> 1)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffL) >>> 9)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffL) >>> 17)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffL) >>> 25)
                | ((src[ 6 + srcOff] & 0x7ffffffL) <<  2)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffL) >>> 6)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffL) >>> 14)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffL) >>> 22)
                | ((src[ 7 + srcOff] & 0x7ffffffL) <<  5)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffL) >>> 3)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffL) >>> 11)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffL) >>> 19)
            ) & 0xff);
    }

    public static void bitPack8LongLE28(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffL) >>> 24)
                | ((src[ 1 + srcOff] & 0xfffffffL) <<  4)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffL) >>> 4)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffL) >>> 12)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffL) >>> 20)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffL) <<  0)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffL) >>> 8)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffL) >>> 16)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffL) >>> 24)
                | ((src[ 3 + srcOff] & 0xfffffffL) <<  4)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffL) >>> 4)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffL) >>> 12)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffL) >>> 20)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffL) <<  0)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffL) >>> 8)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffL) >>> 16)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffL) >>> 24)
                | ((src[ 5 + srcOff] & 0xfffffffL) <<  4)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffL) >>> 4)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffL) >>> 12)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffL) >>> 20)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffL) <<  0)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffL) >>> 8)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffL) >>> 16)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffL) >>> 24)
                | ((src[ 7 + srcOff] & 0xfffffffL) <<  4)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffL) >>> 4)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffL) >>> 12)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffL) >>> 20)
            ) & 0xff);
    }

    public static void bitPack8LongLE29(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffL) >>> 24)
                | ((src[ 1 + srcOff] & 0x1fffffffL) <<  5)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffL) >>> 3)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffL) >>> 11)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffL) >>> 19)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffL) >>> 27)
                | ((src[ 2 + srcOff] & 0x1fffffffL) <<  2)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffL) >>> 6)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffL) >>> 14)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffL) >>> 22)
                | ((src[ 3 + srcOff] & 0x1fffffffL) <<  7)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffL) >>> 1)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffL) >>> 9)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffL) >>> 17)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffL) >>> 25)
                | ((src[ 4 + srcOff] & 0x1fffffffL) <<  4)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffL) >>> 4)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffL) >>> 12)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffL) >>> 20)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffL) >>> 28)
                | ((src[ 5 + srcOff] & 0x1fffffffL) <<  1)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffL) >>> 7)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffL) >>> 15)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffL) >>> 23)
                | ((src[ 6 + srcOff] & 0x1fffffffL) <<  6)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffL) >>> 2)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffL) >>> 10)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffL) >>> 18)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffL) >>> 26)
                | ((src[ 7 + srcOff] & 0x1fffffffL) <<  3)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffL) >>> 5)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffL) >>> 13)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffL) >>> 21)
            ) & 0xff);
    }

    public static void bitPack8LongLE30(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffL) >>> 24)
                | ((src[ 1 + srcOff] & 0x3fffffffL) <<  6)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffL) >>> 2)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffL) >>> 10)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffL) >>> 18)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffL) >>> 26)
                | ((src[ 2 + srcOff] & 0x3fffffffL) <<  4)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffL) >>> 4)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffL) >>> 12)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffL) >>> 20)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffL) >>> 28)
                | ((src[ 3 + srcOff] & 0x3fffffffL) <<  2)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffL) >>> 6)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffL) >>> 14)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffL) >>> 22)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffL) <<  0)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffL) >>> 8)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffL) >>> 16)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffL) >>> 24)
                | ((src[ 5 + srcOff] & 0x3fffffffL) <<  6)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffL) >>> 2)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffL) >>> 10)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffL) >>> 18)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffL) >>> 26)
                | ((src[ 6 + srcOff] & 0x3fffffffL) <<  4)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffL) >>> 4)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffL) >>> 12)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffL) >>> 20)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffL) >>> 28)
                | ((src[ 7 + srcOff] & 0x3fffffffL) <<  2)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffL) >>> 6)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffL) >>> 14)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffL) >>> 22)
            ) & 0xff);
    }

    public static void bitPack8LongLE31(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffL) >>> 24)
                | ((src[ 1 + srcOff] & 0x7fffffffL) <<  7)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffL) >>> 1)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffL) >>> 9)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffL) >>> 17)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffL) >>> 25)
                | ((src[ 2 + srcOff] & 0x7fffffffL) <<  6)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffL) >>> 2)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffL) >>> 10)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffL) >>> 18)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffL) >>> 26)
                | ((src[ 3 + srcOff] & 0x7fffffffL) <<  5)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffL) >>> 3)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffL) >>> 11)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffL) >>> 19)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffL) >>> 27)
                | ((src[ 4 + srcOff] & 0x7fffffffL) <<  4)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffL) >>> 4)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffL) >>> 12)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffL) >>> 20)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffL) >>> 28)
                | ((src[ 5 + srcOff] & 0x7fffffffL) <<  3)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffL) >>> 5)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffL) >>> 13)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffL) >>> 21)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffL) >>> 29)
                | ((src[ 6 + srcOff] & 0x7fffffffL) <<  2)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffL) >>> 6)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffL) >>> 14)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffL) >>> 22)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffL) >>> 30)
                | ((src[ 7 + srcOff] & 0x7fffffffL) <<  1)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffL) >>> 7)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffL) >>> 15)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffL) >>> 23)
            ) & 0xff);
    }

    public static void bitPack8LongLE32(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffL) <<  0)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffL) >>> 8)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffL) >>> 16)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffL) >>> 24)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffL) <<  0)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffL) >>> 8)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffL) >>> 16)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffL) >>> 24)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffL) <<  0)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffL) >>> 8)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffL) >>> 16)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffL) >>> 24)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffL) <<  0)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffL) >>> 8)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffL) >>> 16)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffL) >>> 24)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffL) <<  0)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffL) >>> 8)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffL) >>> 16)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffL) >>> 24)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffL) <<  0)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffL) >>> 8)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffL) >>> 16)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffL) >>> 24)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffL) <<  0)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffL) >>> 8)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffL) >>> 16)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffL) >>> 24)
            ) & 0xff);
    }

    public static void bitPack8LongLE33(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffL) >>> 32)
                | ((src[ 1 + srcOff] & 0x1ffffffffL) <<  1)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffL) >>> 7)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffL) >>> 15)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffL) >>> 23)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffL) >>> 31)
                | ((src[ 2 + srcOff] & 0x1ffffffffL) <<  2)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffL) >>> 6)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffL) >>> 14)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffL) >>> 22)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffL) >>> 30)
                | ((src[ 3 + srcOff] & 0x1ffffffffL) <<  3)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffL) >>> 5)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffL) >>> 13)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffL) >>> 21)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffL) >>> 29)
                | ((src[ 4 + srcOff] & 0x1ffffffffL) <<  4)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffL) >>> 4)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffL) >>> 12)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffL) >>> 20)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffL) >>> 28)
                | ((src[ 5 + srcOff] & 0x1ffffffffL) <<  5)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffL) >>> 3)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffL) >>> 11)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffL) >>> 19)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffL) >>> 27)
                | ((src[ 6 + srcOff] & 0x1ffffffffL) <<  6)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffL) >>> 2)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffL) >>> 10)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffL) >>> 18)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffL) >>> 26)
                | ((src[ 7 + srcOff] & 0x1ffffffffL) <<  7)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffL) >>> 1)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffL) >>> 9)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffL) >>> 17)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffL) >>> 25)
            ) & 0xff);
    }

    public static void bitPack8LongLE34(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffL) >>> 32)
                | ((src[ 1 + srcOff] & 0x3ffffffffL) <<  2)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffL) >>> 6)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffL) >>> 14)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffL) >>> 22)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffL) >>> 30)
                | ((src[ 2 + srcOff] & 0x3ffffffffL) <<  4)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffL) >>> 4)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffL) >>> 12)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffL) >>> 20)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffL) >>> 28)
                | ((src[ 3 + srcOff] & 0x3ffffffffL) <<  6)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffL) >>> 2)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffL) >>> 10)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffL) >>> 18)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffL) >>> 26)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffL) <<  0)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffL) >>> 8)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffL) >>> 16)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffL) >>> 24)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffL) >>> 32)
                | ((src[ 5 + srcOff] & 0x3ffffffffL) <<  2)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffL) >>> 6)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffL) >>> 14)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffL) >>> 22)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffL) >>> 30)
                | ((src[ 6 + srcOff] & 0x3ffffffffL) <<  4)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffL) >>> 4)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffL) >>> 12)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffL) >>> 20)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffL) >>> 28)
                | ((src[ 7 + srcOff] & 0x3ffffffffL) <<  6)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffL) >>> 2)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffL) >>> 10)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffL) >>> 18)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffL) >>> 26)
            ) & 0xff);
    }

    public static void bitPack8LongLE35(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffL) >>> 32)
                | ((src[ 1 + srcOff] & 0x7ffffffffL) <<  3)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffL) >>> 5)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffL) >>> 13)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffL) >>> 21)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffL) >>> 29)
                | ((src[ 2 + srcOff] & 0x7ffffffffL) <<  6)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffL) >>> 2)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffL) >>> 10)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffL) >>> 18)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffL) >>> 26)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffL) >>> 34)
                | ((src[ 3 + srcOff] & 0x7ffffffffL) <<  1)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffL) >>> 7)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffL) >>> 15)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffL) >>> 23)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffL) >>> 31)
                | ((src[ 4 + srcOff] & 0x7ffffffffL) <<  4)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffL) >>> 4)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffL) >>> 12)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffL) >>> 20)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffL) >>> 28)
                | ((src[ 5 + srcOff] & 0x7ffffffffL) <<  7)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffL) >>> 1)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffL) >>> 9)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffL) >>> 17)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffL) >>> 25)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffL) >>> 33)
                | ((src[ 6 + srcOff] & 0x7ffffffffL) <<  2)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffL) >>> 6)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffL) >>> 14)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffL) >>> 22)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffL) >>> 30)
                | ((src[ 7 + srcOff] & 0x7ffffffffL) <<  5)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffL) >>> 3)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffL) >>> 11)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffL) >>> 19)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffL) >>> 27)
            ) & 0xff);
    }

    public static void bitPack8LongLE36(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffL) >>> 32)
                | ((src[ 1 + srcOff] & 0xfffffffffL) <<  4)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffL) >>> 4)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffL) >>> 12)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffL) >>> 20)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffL) >>> 28)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffL) <<  0)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffL) >>> 8)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffL) >>> 16)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffL) >>> 24)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffL) >>> 32)
                | ((src[ 3 + srcOff] & 0xfffffffffL) <<  4)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffL) >>> 4)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffL) >>> 12)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffL) >>> 20)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffL) >>> 28)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffL) <<  0)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffL) >>> 8)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffL) >>> 16)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffL) >>> 24)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffL) >>> 32)
                | ((src[ 5 + srcOff] & 0xfffffffffL) <<  4)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffL) >>> 4)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffL) >>> 12)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffL) >>> 20)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffL) >>> 28)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffL) <<  0)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffL) >>> 8)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffL) >>> 16)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffL) >>> 24)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffL) >>> 32)
                | ((src[ 7 + srcOff] & 0xfffffffffL) <<  4)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffL) >>> 4)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffL) >>> 12)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffL) >>> 20)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffL) >>> 28)
            ) & 0xff);
    }

    public static void bitPack8LongLE37(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffL) >>> 32)
                | ((src[ 1 + srcOff] & 0x1fffffffffL) <<  5)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffL) >>> 3)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffL) >>> 11)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffL) >>> 19)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffL) >>> 27)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffL) >>> 35)
                | ((src[ 2 + srcOff] & 0x1fffffffffL) <<  2)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffL) >>> 6)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffL) >>> 14)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffL) >>> 22)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffL) >>> 30)
                | ((src[ 3 + srcOff] & 0x1fffffffffL) <<  7)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffL) >>> 1)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffL) >>> 9)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffL) >>> 17)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffL) >>> 25)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffL) >>> 33)
                | ((src[ 4 + srcOff] & 0x1fffffffffL) <<  4)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffL) >>> 4)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffL) >>> 12)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffL) >>> 20)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffL) >>> 28)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffL) >>> 36)
                | ((src[ 5 + srcOff] & 0x1fffffffffL) <<  1)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffL) >>> 7)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffL) >>> 15)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffL) >>> 23)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffL) >>> 31)
                | ((src[ 6 + srcOff] & 0x1fffffffffL) <<  6)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffL) >>> 2)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffL) >>> 10)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffL) >>> 18)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffL) >>> 26)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffL) >>> 34)
                | ((src[ 7 + srcOff] & 0x1fffffffffL) <<  3)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffL) >>> 5)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffL) >>> 13)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffL) >>> 21)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffL) >>> 29)
            ) & 0xff);
    }

    public static void bitPack8LongLE38(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffL) >>> 32)
                | ((src[ 1 + srcOff] & 0x3fffffffffL) <<  6)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffL) >>> 2)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffL) >>> 10)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffL) >>> 18)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffL) >>> 26)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffL) >>> 34)
                | ((src[ 2 + srcOff] & 0x3fffffffffL) <<  4)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffL) >>> 4)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffL) >>> 12)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffL) >>> 20)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffL) >>> 28)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffL) >>> 36)
                | ((src[ 3 + srcOff] & 0x3fffffffffL) <<  2)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffL) >>> 6)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffL) >>> 14)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffL) >>> 22)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffL) >>> 30)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffL) <<  0)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffL) >>> 8)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffL) >>> 16)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffL) >>> 24)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffL) >>> 32)
                | ((src[ 5 + srcOff] & 0x3fffffffffL) <<  6)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffL) >>> 2)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffL) >>> 10)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffL) >>> 18)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffL) >>> 26)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffL) >>> 34)
                | ((src[ 6 + srcOff] & 0x3fffffffffL) <<  4)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffL) >>> 4)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffL) >>> 12)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffL) >>> 20)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffL) >>> 28)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffL) >>> 36)
                | ((src[ 7 + srcOff] & 0x3fffffffffL) <<  2)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffL) >>> 6)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffL) >>> 14)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffL) >>> 22)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffL) >>> 30)
            ) & 0xff);
    }

    public static void bitPack8LongLE39(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffL) >>> 32)
                | ((src[ 1 + srcOff] & 0x7fffffffffL) <<  7)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffL) >>> 1)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffL) >>> 9)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffL) >>> 17)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffL) >>> 25)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffL) >>> 33)
                | ((src[ 2 + srcOff] & 0x7fffffffffL) <<  6)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffL) >>> 2)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffL) >>> 10)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffL) >>> 18)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffL) >>> 26)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffL) >>> 34)
                | ((src[ 3 + srcOff] & 0x7fffffffffL) <<  5)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffL) >>> 3)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffL) >>> 11)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffL) >>> 19)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffL) >>> 27)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffL) >>> 35)
                | ((src[ 4 + srcOff] & 0x7fffffffffL) <<  4)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffL) >>> 4)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffL) >>> 12)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffL) >>> 20)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffL) >>> 28)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffL) >>> 36)
                | ((src[ 5 + srcOff] & 0x7fffffffffL) <<  3)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffL) >>> 5)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffL) >>> 13)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffL) >>> 21)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffL) >>> 29)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffL) >>> 37)
                | ((src[ 6 + srcOff] & 0x7fffffffffL) <<  2)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffL) >>> 6)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffL) >>> 14)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffL) >>> 22)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffL) >>> 30)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffL) >>> 38)
                | ((src[ 7 + srcOff] & 0x7fffffffffL) <<  1)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffL) >>> 7)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffL) >>> 15)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffL) >>> 23)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffL) >>> 31)
            ) & 0xff);
    }

    public static void bitPack8LongLE40(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffL) <<  0)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffL) >>> 32)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffL) <<  0)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffL) >>> 8)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffL) >>> 16)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffL) >>> 24)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffL) >>> 32)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffL) <<  0)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffL) >>> 8)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffL) >>> 16)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffL) >>> 24)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffL) >>> 32)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffL) <<  0)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffL) >>> 8)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffL) >>> 16)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffL) >>> 24)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffL) >>> 32)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffL) <<  0)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffL) >>> 8)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffL) >>> 16)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffL) >>> 24)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffL) >>> 32)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffL) <<  0)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffL) >>> 8)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffL) >>> 16)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffL) >>> 24)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffL) >>> 32)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffL) <<  0)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffL) >>> 8)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffL) >>> 16)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffL) >>> 24)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffL) >>> 32)
            ) & 0xff);
    }

    public static void bitPack8LongLE41(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffL) >>> 40)
                | ((src[ 1 + srcOff] & 0x1ffffffffffL) <<  1)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffL) >>> 7)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffL) >>> 15)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffL) >>> 23)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffL) >>> 31)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffL) >>> 39)
                | ((src[ 2 + srcOff] & 0x1ffffffffffL) <<  2)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffL) >>> 6)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffL) >>> 14)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffL) >>> 22)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffL) >>> 30)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffL) >>> 38)
                | ((src[ 3 + srcOff] & 0x1ffffffffffL) <<  3)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffL) >>> 5)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffL) >>> 13)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffL) >>> 21)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffL) >>> 29)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffL) >>> 37)
                | ((src[ 4 + srcOff] & 0x1ffffffffffL) <<  4)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffL) >>> 4)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffL) >>> 12)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffL) >>> 20)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffL) >>> 28)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffL) >>> 36)
                | ((src[ 5 + srcOff] & 0x1ffffffffffL) <<  5)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffL) >>> 3)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffL) >>> 11)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffL) >>> 19)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffL) >>> 27)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffL) >>> 35)
                | ((src[ 6 + srcOff] & 0x1ffffffffffL) <<  6)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffL) >>> 2)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffL) >>> 10)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffL) >>> 18)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffL) >>> 26)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffL) >>> 34)
                | ((src[ 7 + srcOff] & 0x1ffffffffffL) <<  7)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffL) >>> 1)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffL) >>> 9)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffL) >>> 17)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffL) >>> 25)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffL) >>> 33)
            ) & 0xff);
    }

    public static void bitPack8LongLE42(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffL) >>> 40)
                | ((src[ 1 + srcOff] & 0x3ffffffffffL) <<  2)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffL) >>> 6)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffL) >>> 14)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffL) >>> 22)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffL) >>> 30)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffL) >>> 38)
                | ((src[ 2 + srcOff] & 0x3ffffffffffL) <<  4)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffL) >>> 4)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffL) >>> 12)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffL) >>> 20)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffL) >>> 28)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffL) >>> 36)
                | ((src[ 3 + srcOff] & 0x3ffffffffffL) <<  6)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffL) >>> 2)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffL) >>> 10)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffL) >>> 18)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffL) >>> 26)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffL) >>> 34)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffL) <<  0)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffL) >>> 8)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffL) >>> 16)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffL) >>> 24)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffL) >>> 32)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffL) >>> 40)
                | ((src[ 5 + srcOff] & 0x3ffffffffffL) <<  2)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffL) >>> 6)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffL) >>> 14)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffL) >>> 22)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffL) >>> 30)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffL) >>> 38)
                | ((src[ 6 + srcOff] & 0x3ffffffffffL) <<  4)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffL) >>> 4)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffL) >>> 12)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffL) >>> 20)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffL) >>> 28)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffL) >>> 36)
                | ((src[ 7 + srcOff] & 0x3ffffffffffL) <<  6)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffL) >>> 2)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffL) >>> 10)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffL) >>> 18)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffL) >>> 26)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffL) >>> 34)
            ) & 0xff);
    }

    public static void bitPack8LongLE43(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffL) >>> 40)
                | ((src[ 1 + srcOff] & 0x7ffffffffffL) <<  3)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffL) >>> 5)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffL) >>> 13)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffL) >>> 21)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffL) >>> 29)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffL) >>> 37)
                | ((src[ 2 + srcOff] & 0x7ffffffffffL) <<  6)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffL) >>> 2)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffL) >>> 10)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffL) >>> 18)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffL) >>> 26)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffL) >>> 34)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffL) >>> 42)
                | ((src[ 3 + srcOff] & 0x7ffffffffffL) <<  1)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffL) >>> 7)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffL) >>> 15)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffL) >>> 23)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffL) >>> 31)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffL) >>> 39)
                | ((src[ 4 + srcOff] & 0x7ffffffffffL) <<  4)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffL) >>> 4)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffL) >>> 12)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffL) >>> 20)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffL) >>> 28)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffL) >>> 36)
                | ((src[ 5 + srcOff] & 0x7ffffffffffL) <<  7)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffL) >>> 1)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffL) >>> 9)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffL) >>> 17)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffL) >>> 25)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffL) >>> 33)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffL) >>> 41)
                | ((src[ 6 + srcOff] & 0x7ffffffffffL) <<  2)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffL) >>> 6)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffL) >>> 14)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffL) >>> 22)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffL) >>> 30)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffL) >>> 38)
                | ((src[ 7 + srcOff] & 0x7ffffffffffL) <<  5)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffL) >>> 3)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffL) >>> 11)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffL) >>> 19)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffL) >>> 27)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffL) >>> 35)
            ) & 0xff);
    }

    public static void bitPack8LongLE44(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffL) >>> 40)
                | ((src[ 1 + srcOff] & 0xfffffffffffL) <<  4)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffL) >>> 4)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffL) >>> 12)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffL) >>> 20)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffL) >>> 28)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffL) >>> 36)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffL) <<  0)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffL) >>> 8)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffL) >>> 16)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffL) >>> 24)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffL) >>> 32)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffL) >>> 40)
                | ((src[ 3 + srcOff] & 0xfffffffffffL) <<  4)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffL) >>> 4)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffL) >>> 12)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffL) >>> 20)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffL) >>> 28)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffL) >>> 36)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffL) <<  0)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffL) >>> 8)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffL) >>> 16)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffL) >>> 24)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffL) >>> 32)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffL) >>> 40)
                | ((src[ 5 + srcOff] & 0xfffffffffffL) <<  4)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffL) >>> 4)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffL) >>> 12)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffL) >>> 20)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffL) >>> 28)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffL) >>> 36)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffL) <<  0)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffL) >>> 8)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffL) >>> 16)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffL) >>> 24)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffL) >>> 32)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffL) >>> 40)
                | ((src[ 7 + srcOff] & 0xfffffffffffL) <<  4)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffL) >>> 4)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffL) >>> 12)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffL) >>> 20)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffL) >>> 28)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffL) >>> 36)
            ) & 0xff);
    }

    public static void bitPack8LongLE45(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffL) >>> 40)
                | ((src[ 1 + srcOff] & 0x1fffffffffffL) <<  5)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffL) >>> 3)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffL) >>> 11)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffL) >>> 19)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffL) >>> 27)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffL) >>> 35)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffL) >>> 43)
                | ((src[ 2 + srcOff] & 0x1fffffffffffL) <<  2)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffL) >>> 6)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffL) >>> 14)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffL) >>> 22)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffL) >>> 30)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffL) >>> 38)
                | ((src[ 3 + srcOff] & 0x1fffffffffffL) <<  7)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffL) >>> 1)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffL) >>> 9)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffL) >>> 17)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffL) >>> 25)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffL) >>> 33)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffL) >>> 41)
                | ((src[ 4 + srcOff] & 0x1fffffffffffL) <<  4)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffL) >>> 4)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffL) >>> 12)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffL) >>> 20)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffL) >>> 28)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffL) >>> 36)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffL) >>> 44)
                | ((src[ 5 + srcOff] & 0x1fffffffffffL) <<  1)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffL) >>> 7)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffL) >>> 15)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffL) >>> 23)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffL) >>> 31)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffL) >>> 39)
                | ((src[ 6 + srcOff] & 0x1fffffffffffL) <<  6)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffL) >>> 2)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffL) >>> 10)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffL) >>> 18)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffL) >>> 26)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffL) >>> 34)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffL) >>> 42)
                | ((src[ 7 + srcOff] & 0x1fffffffffffL) <<  3)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffL) >>> 5)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffL) >>> 13)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffL) >>> 21)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffL) >>> 29)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffL) >>> 37)
            ) & 0xff);
    }

    public static void bitPack8LongLE46(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffL) >>> 40)
                | ((src[ 1 + srcOff] & 0x3fffffffffffL) <<  6)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffL) >>> 2)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffL) >>> 10)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffL) >>> 18)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffL) >>> 26)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffL) >>> 34)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffL) >>> 42)
                | ((src[ 2 + srcOff] & 0x3fffffffffffL) <<  4)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffL) >>> 4)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffL) >>> 12)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffL) >>> 20)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffL) >>> 28)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffL) >>> 36)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffL) >>> 44)
                | ((src[ 3 + srcOff] & 0x3fffffffffffL) <<  2)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffL) >>> 6)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffL) >>> 14)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffL) >>> 22)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffL) >>> 30)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffL) >>> 38)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffL) <<  0)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffL) >>> 8)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffL) >>> 16)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffL) >>> 24)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffL) >>> 32)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffL) >>> 40)
                | ((src[ 5 + srcOff] & 0x3fffffffffffL) <<  6)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffL) >>> 2)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffL) >>> 10)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffL) >>> 18)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffL) >>> 26)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffL) >>> 34)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffL) >>> 42)
                | ((src[ 6 + srcOff] & 0x3fffffffffffL) <<  4)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffL) >>> 4)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffL) >>> 12)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffL) >>> 20)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffL) >>> 28)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffL) >>> 36)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffL) >>> 44)
                | ((src[ 7 + srcOff] & 0x3fffffffffffL) <<  2)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffL) >>> 6)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffL) >>> 14)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffL) >>> 22)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffL) >>> 30)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffL) >>> 38)
            ) & 0xff);
    }

    public static void bitPack8LongLE47(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffL) >>> 40)
                | ((src[ 1 + srcOff] & 0x7fffffffffffL) <<  7)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffL) >>> 1)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffL) >>> 9)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffL) >>> 17)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffL) >>> 25)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffL) >>> 33)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffL) >>> 41)
                | ((src[ 2 + srcOff] & 0x7fffffffffffL) <<  6)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffL) >>> 2)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffL) >>> 10)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffL) >>> 18)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffL) >>> 26)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffL) >>> 34)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffL) >>> 42)
                | ((src[ 3 + srcOff] & 0x7fffffffffffL) <<  5)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffL) >>> 3)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffL) >>> 11)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffL) >>> 19)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffL) >>> 27)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffL) >>> 35)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffL) >>> 43)
                | ((src[ 4 + srcOff] & 0x7fffffffffffL) <<  4)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffL) >>> 4)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffL) >>> 12)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffL) >>> 20)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffL) >>> 28)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffL) >>> 36)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffL) >>> 44)
                | ((src[ 5 + srcOff] & 0x7fffffffffffL) <<  3)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffL) >>> 5)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffL) >>> 13)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffL) >>> 21)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffL) >>> 29)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffL) >>> 37)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffL) >>> 45)
                | ((src[ 6 + srcOff] & 0x7fffffffffffL) <<  2)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffL) >>> 6)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffL) >>> 14)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffL) >>> 22)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffL) >>> 30)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffL) >>> 38)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffL) >>> 46)
                | ((src[ 7 + srcOff] & 0x7fffffffffffL) <<  1)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffL) >>> 7)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffL) >>> 15)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffL) >>> 23)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffL) >>> 31)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffL) >>> 39)
            ) & 0xff);
    }

    public static void bitPack8LongLE48(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffffL) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffffL) >>> 24)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffffL) >>> 32)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffffL) >>> 40)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffffL) <<  0)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffffL) >>> 8)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffffL) >>> 16)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffffL) >>> 24)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffffL) >>> 32)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffffL) >>> 40)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffffL) <<  0)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffffL) >>> 8)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffffL) >>> 16)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffffL) >>> 24)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffffL) >>> 32)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffffL) >>> 40)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffffL) <<  0)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffffL) >>> 8)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffffL) >>> 16)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffffL) >>> 24)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffffL) >>> 32)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffffL) >>> 40)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffffL) <<  0)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffffL) >>> 8)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffffL) >>> 16)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffffL) >>> 24)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffffL) >>> 32)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffffL) >>> 40)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffffL) <<  0)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffffL) >>> 8)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffffL) >>> 16)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffffL) >>> 24)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffffL) >>> 32)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffffL) >>> 40)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffffL) <<  0)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffffL) >>> 8)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffffL) >>> 16)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffffL) >>> 24)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffffL) >>> 32)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffffL) >>> 40)
            ) & 0xff);
    }

    public static void bitPack8LongLE49(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffffL) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffffL) >>> 48)
                | ((src[ 1 + srcOff] & 0x1ffffffffffffL) <<  1)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffffL) >>> 7)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffffL) >>> 15)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffffL) >>> 23)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffffL) >>> 31)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffffL) >>> 39)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffffL) >>> 47)
                | ((src[ 2 + srcOff] & 0x1ffffffffffffL) <<  2)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffffL) >>> 6)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffffL) >>> 14)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffffL) >>> 22)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffffL) >>> 30)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffffL) >>> 38)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffffL) >>> 46)
                | ((src[ 3 + srcOff] & 0x1ffffffffffffL) <<  3)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffffL) >>> 5)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffffL) >>> 13)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffffL) >>> 21)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffffL) >>> 29)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffffL) >>> 37)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffffL) >>> 45)
                | ((src[ 4 + srcOff] & 0x1ffffffffffffL) <<  4)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffffL) >>> 4)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffffL) >>> 12)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffffL) >>> 20)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffffL) >>> 28)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffffL) >>> 36)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffffL) >>> 44)
                | ((src[ 5 + srcOff] & 0x1ffffffffffffL) <<  5)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffffL) >>> 3)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffffL) >>> 11)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffffL) >>> 19)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffffL) >>> 27)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffffL) >>> 35)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffffL) >>> 43)
                | ((src[ 6 + srcOff] & 0x1ffffffffffffL) <<  6)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffffL) >>> 2)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffffL) >>> 10)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffffL) >>> 18)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffffL) >>> 26)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffffL) >>> 34)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffffL) >>> 42)
                | ((src[ 7 + srcOff] & 0x1ffffffffffffL) <<  7)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffffL) >>> 1)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffffL) >>> 9)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffffL) >>> 17)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffffL) >>> 25)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffffL) >>> 33)
            ) & 0xff);
        dst[48 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffffL) >>> 41)
            ) & 0xff);
    }

    public static void bitPack8LongLE50(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffffL) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffffL) >>> 48)
                | ((src[ 1 + srcOff] & 0x3ffffffffffffL) <<  2)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffffL) >>> 6)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffffL) >>> 14)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffffL) >>> 22)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffffL) >>> 30)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffffL) >>> 38)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffffL) >>> 46)
                | ((src[ 2 + srcOff] & 0x3ffffffffffffL) <<  4)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffffL) >>> 4)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffffL) >>> 12)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffffL) >>> 20)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffffL) >>> 28)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffffL) >>> 36)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffffL) >>> 44)
                | ((src[ 3 + srcOff] & 0x3ffffffffffffL) <<  6)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffffL) >>> 2)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffffL) >>> 10)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffffL) >>> 18)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffffL) >>> 26)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffffL) >>> 34)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffffL) >>> 42)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffffL) <<  0)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffffL) >>> 8)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffffL) >>> 16)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffffL) >>> 24)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffffL) >>> 32)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffffL) >>> 40)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffffL) >>> 48)
                | ((src[ 5 + srcOff] & 0x3ffffffffffffL) <<  2)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffffL) >>> 6)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffffL) >>> 14)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffffL) >>> 22)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffffL) >>> 30)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffffL) >>> 38)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffffL) >>> 46)
                | ((src[ 6 + srcOff] & 0x3ffffffffffffL) <<  4)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffffL) >>> 4)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffffL) >>> 12)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffffL) >>> 20)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffffL) >>> 28)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffffL) >>> 36)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffffL) >>> 44)
                | ((src[ 7 + srcOff] & 0x3ffffffffffffL) <<  6)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffffL) >>> 2)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffffL) >>> 10)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffffL) >>> 18)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffffL) >>> 26)
            ) & 0xff);
        dst[48 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffffL) >>> 34)
            ) & 0xff);
        dst[49 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffffL) >>> 42)
            ) & 0xff);
    }

    public static void bitPack8LongLE51(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffffL) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffffL) >>> 48)
                | ((src[ 1 + srcOff] & 0x7ffffffffffffL) <<  3)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffffL) >>> 5)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffffL) >>> 13)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffffL) >>> 21)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffffL) >>> 29)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffffL) >>> 37)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffffL) >>> 45)
                | ((src[ 2 + srcOff] & 0x7ffffffffffffL) <<  6)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffffL) >>> 2)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffffL) >>> 10)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffffL) >>> 18)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffffL) >>> 26)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffffL) >>> 34)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffffL) >>> 42)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffffL) >>> 50)
                | ((src[ 3 + srcOff] & 0x7ffffffffffffL) <<  1)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffffL) >>> 7)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffffL) >>> 15)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffffL) >>> 23)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffffL) >>> 31)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffffL) >>> 39)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffffL) >>> 47)
                | ((src[ 4 + srcOff] & 0x7ffffffffffffL) <<  4)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffffL) >>> 4)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffffL) >>> 12)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffffL) >>> 20)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffffL) >>> 28)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffffL) >>> 36)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffffL) >>> 44)
                | ((src[ 5 + srcOff] & 0x7ffffffffffffL) <<  7)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffffL) >>> 1)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffffL) >>> 9)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffffL) >>> 17)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffffL) >>> 25)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffffL) >>> 33)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffffL) >>> 41)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffffL) >>> 49)
                | ((src[ 6 + srcOff] & 0x7ffffffffffffL) <<  2)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffffL) >>> 6)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffffL) >>> 14)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffffL) >>> 22)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffffL) >>> 30)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffffL) >>> 38)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffffL) >>> 46)
                | ((src[ 7 + srcOff] & 0x7ffffffffffffL) <<  5)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffffL) >>> 3)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffffL) >>> 11)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffffL) >>> 19)
            ) & 0xff);
        dst[48 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffffL) >>> 27)
            ) & 0xff);
        dst[49 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffffL) >>> 35)
            ) & 0xff);
        dst[50 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffffL) >>> 43)
            ) & 0xff);
    }

    public static void bitPack8LongLE52(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffffL) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffffL) >>> 48)
                | ((src[ 1 + srcOff] & 0xfffffffffffffL) <<  4)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffffL) >>> 4)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffffL) >>> 12)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffffL) >>> 20)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffffL) >>> 28)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffffL) >>> 36)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffffL) >>> 44)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffffL) <<  0)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffffL) >>> 8)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffffL) >>> 16)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffffL) >>> 24)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffffL) >>> 32)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffffL) >>> 40)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffffL) >>> 48)
                | ((src[ 3 + srcOff] & 0xfffffffffffffL) <<  4)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffffL) >>> 4)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffffL) >>> 12)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffffL) >>> 20)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffffL) >>> 28)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffffL) >>> 36)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffffL) >>> 44)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffffL) <<  0)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffffL) >>> 8)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffffL) >>> 16)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffffL) >>> 24)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffffL) >>> 32)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffffL) >>> 40)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffffL) >>> 48)
                | ((src[ 5 + srcOff] & 0xfffffffffffffL) <<  4)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffffL) >>> 4)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffffL) >>> 12)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffffL) >>> 20)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffffL) >>> 28)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffffL) >>> 36)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffffL) >>> 44)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffffL) <<  0)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffffL) >>> 8)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffffL) >>> 16)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffffL) >>> 24)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffffL) >>> 32)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffffL) >>> 40)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffffL) >>> 48)
                | ((src[ 7 + srcOff] & 0xfffffffffffffL) <<  4)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffffL) >>> 4)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffffL) >>> 12)
            ) & 0xff);
        dst[48 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffffL) >>> 20)
            ) & 0xff);
        dst[49 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffffL) >>> 28)
            ) & 0xff);
        dst[50 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffffL) >>> 36)
            ) & 0xff);
        dst[51 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffffL) >>> 44)
            ) & 0xff);
    }

    public static void bitPack8LongLE53(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffffL) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffffL) >>> 48)
                | ((src[ 1 + srcOff] & 0x1fffffffffffffL) <<  5)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffffL) >>> 3)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffffL) >>> 11)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffffL) >>> 19)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffffL) >>> 27)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffffL) >>> 35)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffffL) >>> 43)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffffL) >>> 51)
                | ((src[ 2 + srcOff] & 0x1fffffffffffffL) <<  2)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffffL) >>> 6)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffffL) >>> 14)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffffL) >>> 22)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffffL) >>> 30)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffffL) >>> 38)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffffL) >>> 46)
                | ((src[ 3 + srcOff] & 0x1fffffffffffffL) <<  7)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffffL) >>> 1)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffffL) >>> 9)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffffL) >>> 17)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffffL) >>> 25)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffffL) >>> 33)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffffL) >>> 41)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffffL) >>> 49)
                | ((src[ 4 + srcOff] & 0x1fffffffffffffL) <<  4)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffffL) >>> 4)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffffL) >>> 12)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffffL) >>> 20)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffffL) >>> 28)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffffL) >>> 36)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffffL) >>> 44)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffffL) >>> 52)
                | ((src[ 5 + srcOff] & 0x1fffffffffffffL) <<  1)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffffL) >>> 7)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffffL) >>> 15)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffffL) >>> 23)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffffL) >>> 31)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffffL) >>> 39)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffffL) >>> 47)
                | ((src[ 6 + srcOff] & 0x1fffffffffffffL) <<  6)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffffL) >>> 2)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffffL) >>> 10)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffffL) >>> 18)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffffL) >>> 26)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffffL) >>> 34)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffffL) >>> 42)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffffL) >>> 50)
                | ((src[ 7 + srcOff] & 0x1fffffffffffffL) <<  3)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffffL) >>> 5)
            ) & 0xff);
        dst[48 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffffL) >>> 13)
            ) & 0xff);
        dst[49 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffffL) >>> 21)
            ) & 0xff);
        dst[50 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffffL) >>> 29)
            ) & 0xff);
        dst[51 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffffL) >>> 37)
            ) & 0xff);
        dst[52 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffffL) >>> 45)
            ) & 0xff);
    }

    public static void bitPack8LongLE54(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffffL) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffffL) >>> 48)
                | ((src[ 1 + srcOff] & 0x3fffffffffffffL) <<  6)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffffL) >>> 2)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffffL) >>> 10)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffffL) >>> 18)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffffL) >>> 26)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffffL) >>> 34)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffffL) >>> 42)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffffL) >>> 50)
                | ((src[ 2 + srcOff] & 0x3fffffffffffffL) <<  4)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffffL) >>> 4)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffffL) >>> 12)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffffL) >>> 20)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffffL) >>> 28)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffffL) >>> 36)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffffL) >>> 44)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffffL) >>> 52)
                | ((src[ 3 + srcOff] & 0x3fffffffffffffL) <<  2)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffffL) >>> 6)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffffL) >>> 14)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffffL) >>> 22)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffffL) >>> 30)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffffL) >>> 38)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffffL) >>> 46)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffffL) <<  0)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffffL) >>> 8)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffffL) >>> 16)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffffL) >>> 24)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffffL) >>> 32)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffffL) >>> 40)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffffL) >>> 48)
                | ((src[ 5 + srcOff] & 0x3fffffffffffffL) <<  6)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffffL) >>> 2)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffffL) >>> 10)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffffL) >>> 18)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffffL) >>> 26)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffffL) >>> 34)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffffL) >>> 42)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffffL) >>> 50)
                | ((src[ 6 + srcOff] & 0x3fffffffffffffL) <<  4)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffffL) >>> 4)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffffL) >>> 12)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffffL) >>> 20)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffffL) >>> 28)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffffL) >>> 36)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffffL) >>> 44)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffffL) >>> 52)
                | ((src[ 7 + srcOff] & 0x3fffffffffffffL) <<  2)
            ) & 0xff);
        dst[48 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffffL) >>> 6)
            ) & 0xff);
        dst[49 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffffL) >>> 14)
            ) & 0xff);
        dst[50 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffffL) >>> 22)
            ) & 0xff);
        dst[51 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffffL) >>> 30)
            ) & 0xff);
        dst[52 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffffL) >>> 38)
            ) & 0xff);
        dst[53 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffffL) >>> 46)
            ) & 0xff);
    }

    public static void bitPack8LongLE55(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffffL) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffffL) >>> 48)
                | ((src[ 1 + srcOff] & 0x7fffffffffffffL) <<  7)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffffL) >>> 1)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffffL) >>> 9)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffffL) >>> 17)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffffL) >>> 25)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffffL) >>> 33)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffffL) >>> 41)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffffL) >>> 49)
                | ((src[ 2 + srcOff] & 0x7fffffffffffffL) <<  6)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffffL) >>> 2)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffffL) >>> 10)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffffL) >>> 18)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffffL) >>> 26)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffffL) >>> 34)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffffL) >>> 42)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffffL) >>> 50)
                | ((src[ 3 + srcOff] & 0x7fffffffffffffL) <<  5)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffffL) >>> 3)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffffL) >>> 11)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffffL) >>> 19)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffffL) >>> 27)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffffL) >>> 35)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffffL) >>> 43)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffffL) >>> 51)
                | ((src[ 4 + srcOff] & 0x7fffffffffffffL) <<  4)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffffL) >>> 4)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffffL) >>> 12)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffffL) >>> 20)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffffL) >>> 28)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffffL) >>> 36)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffffL) >>> 44)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffffL) >>> 52)
                | ((src[ 5 + srcOff] & 0x7fffffffffffffL) <<  3)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffffL) >>> 5)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffffL) >>> 13)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffffL) >>> 21)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffffL) >>> 29)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffffL) >>> 37)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffffL) >>> 45)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffffL) >>> 53)
                | ((src[ 6 + srcOff] & 0x7fffffffffffffL) <<  2)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffffL) >>> 6)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffffL) >>> 14)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffffL) >>> 22)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffffL) >>> 30)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffffL) >>> 38)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffffL) >>> 46)
            ) & 0xff);
        dst[48 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffffL) >>> 54)
                | ((src[ 7 + srcOff] & 0x7fffffffffffffL) <<  1)
            ) & 0xff);
        dst[49 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffffL) >>> 7)
            ) & 0xff);
        dst[50 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffffL) >>> 15)
            ) & 0xff);
        dst[51 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffffL) >>> 23)
            ) & 0xff);
        dst[52 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffffL) >>> 31)
            ) & 0xff);
        dst[53 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffffL) >>> 39)
            ) & 0xff);
        dst[54 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffffL) >>> 47)
            ) & 0xff);
    }

    public static void bitPack8LongLE56(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffffffL) <<  0)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffffffL) <<  0)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffffffL) <<  0)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffffffL) <<  0)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffffffL) <<  0)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[48 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[49 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffffffL) <<  0)
            ) & 0xff);
        dst[50 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[51 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[52 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[53 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[54 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[55 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffffffffffffL) >>> 48)
            ) & 0xff);
    }

    public static void bitPack8LongLE57(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffffffffffffL) >>> 56)
                | ((src[ 1 + srcOff] & 0x1ffffffffffffffL) <<  1)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffffffL) >>> 7)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffffffL) >>> 15)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffffffL) >>> 23)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffffffL) >>> 31)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffffffL) >>> 39)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffffffL) >>> 47)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffffffffffffL) >>> 55)
                | ((src[ 2 + srcOff] & 0x1ffffffffffffffL) <<  2)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffffffL) >>> 6)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffffffL) >>> 14)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffffffL) >>> 22)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffffffL) >>> 30)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffffffL) >>> 38)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffffffL) >>> 46)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffffffffffffL) >>> 54)
                | ((src[ 3 + srcOff] & 0x1ffffffffffffffL) <<  3)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffffffL) >>> 5)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffffffL) >>> 13)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffffffL) >>> 21)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffffffL) >>> 29)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffffffL) >>> 37)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffffffL) >>> 45)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffffffffffffL) >>> 53)
                | ((src[ 4 + srcOff] & 0x1ffffffffffffffL) <<  4)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffffffL) >>> 4)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffffffL) >>> 12)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffffffL) >>> 20)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffffffL) >>> 28)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffffffL) >>> 36)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffffffL) >>> 44)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffffffffffffL) >>> 52)
                | ((src[ 5 + srcOff] & 0x1ffffffffffffffL) <<  5)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffffffL) >>> 3)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffffffL) >>> 11)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffffffL) >>> 19)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffffffL) >>> 27)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffffffL) >>> 35)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffffffL) >>> 43)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffffffffffffL) >>> 51)
                | ((src[ 6 + srcOff] & 0x1ffffffffffffffL) <<  6)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffffffL) >>> 2)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffffffL) >>> 10)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffffffL) >>> 18)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffffffL) >>> 26)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffffffL) >>> 34)
            ) & 0xff);
        dst[48 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffffffL) >>> 42)
            ) & 0xff);
        dst[49 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffffffffffffL) >>> 50)
                | ((src[ 7 + srcOff] & 0x1ffffffffffffffL) <<  7)
            ) & 0xff);
        dst[50 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffffffL) >>> 1)
            ) & 0xff);
        dst[51 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffffffL) >>> 9)
            ) & 0xff);
        dst[52 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffffffL) >>> 17)
            ) & 0xff);
        dst[53 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffffffL) >>> 25)
            ) & 0xff);
        dst[54 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffffffL) >>> 33)
            ) & 0xff);
        dst[55 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffffffL) >>> 41)
            ) & 0xff);
        dst[56 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffffffffffffL) >>> 49)
            ) & 0xff);
    }

    public static void bitPack8LongLE58(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffffffffffffL) >>> 56)
                | ((src[ 1 + srcOff] & 0x3ffffffffffffffL) <<  2)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffffffL) >>> 6)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffffffL) >>> 14)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffffffL) >>> 22)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffffffL) >>> 30)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffffffL) >>> 38)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffffffL) >>> 46)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffffffffffffL) >>> 54)
                | ((src[ 2 + srcOff] & 0x3ffffffffffffffL) <<  4)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffffffL) >>> 4)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffffffL) >>> 12)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffffffL) >>> 20)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffffffL) >>> 28)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffffffL) >>> 36)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffffffL) >>> 44)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffffffffffffL) >>> 52)
                | ((src[ 3 + srcOff] & 0x3ffffffffffffffL) <<  6)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffffffL) >>> 2)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffffffL) >>> 10)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffffffL) >>> 18)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffffffL) >>> 26)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffffffL) >>> 34)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffffffL) >>> 42)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffffffffffffL) >>> 50)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffffffL) <<  0)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffffffffffffL) >>> 56)
                | ((src[ 5 + srcOff] & 0x3ffffffffffffffL) <<  2)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffffffL) >>> 6)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffffffL) >>> 14)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffffffL) >>> 22)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffffffL) >>> 30)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffffffL) >>> 38)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffffffL) >>> 46)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffffffffffffL) >>> 54)
                | ((src[ 6 + srcOff] & 0x3ffffffffffffffL) <<  4)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffffffL) >>> 4)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffffffL) >>> 12)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffffffL) >>> 20)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffffffL) >>> 28)
            ) & 0xff);
        dst[48 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffffffL) >>> 36)
            ) & 0xff);
        dst[49 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffffffL) >>> 44)
            ) & 0xff);
        dst[50 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffffffffffffL) >>> 52)
                | ((src[ 7 + srcOff] & 0x3ffffffffffffffL) <<  6)
            ) & 0xff);
        dst[51 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffffffL) >>> 2)
            ) & 0xff);
        dst[52 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffffffL) >>> 10)
            ) & 0xff);
        dst[53 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffffffL) >>> 18)
            ) & 0xff);
        dst[54 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffffffL) >>> 26)
            ) & 0xff);
        dst[55 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffffffL) >>> 34)
            ) & 0xff);
        dst[56 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffffffL) >>> 42)
            ) & 0xff);
        dst[57 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffffffffffffL) >>> 50)
            ) & 0xff);
    }

    public static void bitPack8LongLE59(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffffffffffffL) >>> 56)
                | ((src[ 1 + srcOff] & 0x7ffffffffffffffL) <<  3)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffffffL) >>> 5)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffffffL) >>> 13)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffffffL) >>> 21)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffffffL) >>> 29)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffffffL) >>> 37)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffffffL) >>> 45)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffffffffffffL) >>> 53)
                | ((src[ 2 + srcOff] & 0x7ffffffffffffffL) <<  6)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffffffL) >>> 2)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffffffL) >>> 10)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffffffL) >>> 18)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffffffL) >>> 26)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffffffL) >>> 34)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffffffL) >>> 42)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffffffL) >>> 50)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffffffffffffL) >>> 58)
                | ((src[ 3 + srcOff] & 0x7ffffffffffffffL) <<  1)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffffffL) >>> 7)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffffffL) >>> 15)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffffffL) >>> 23)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffffffL) >>> 31)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffffffL) >>> 39)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffffffL) >>> 47)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffffffffffffL) >>> 55)
                | ((src[ 4 + srcOff] & 0x7ffffffffffffffL) <<  4)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffffffL) >>> 4)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffffffL) >>> 12)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffffffL) >>> 20)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffffffL) >>> 28)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffffffL) >>> 36)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffffffL) >>> 44)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffffffffffffL) >>> 52)
                | ((src[ 5 + srcOff] & 0x7ffffffffffffffL) <<  7)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffffffL) >>> 1)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffffffL) >>> 9)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffffffL) >>> 17)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffffffL) >>> 25)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffffffL) >>> 33)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffffffL) >>> 41)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffffffL) >>> 49)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffffffffffffL) >>> 57)
                | ((src[ 6 + srcOff] & 0x7ffffffffffffffL) <<  2)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffffffL) >>> 6)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffffffL) >>> 14)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffffffL) >>> 22)
            ) & 0xff);
        dst[48 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffffffL) >>> 30)
            ) & 0xff);
        dst[49 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffffffL) >>> 38)
            ) & 0xff);
        dst[50 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffffffL) >>> 46)
            ) & 0xff);
        dst[51 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffffffffffffL) >>> 54)
                | ((src[ 7 + srcOff] & 0x7ffffffffffffffL) <<  5)
            ) & 0xff);
        dst[52 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffffffL) >>> 3)
            ) & 0xff);
        dst[53 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffffffL) >>> 11)
            ) & 0xff);
        dst[54 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffffffL) >>> 19)
            ) & 0xff);
        dst[55 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffffffL) >>> 27)
            ) & 0xff);
        dst[56 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffffffL) >>> 35)
            ) & 0xff);
        dst[57 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffffffL) >>> 43)
            ) & 0xff);
        dst[58 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffffffffffffL) >>> 51)
            ) & 0xff);
    }

    public static void bitPack8LongLE60(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffffffffffffL) >>> 56)
                | ((src[ 1 + srcOff] & 0xfffffffffffffffL) <<  4)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffffffL) >>> 4)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffffffL) >>> 12)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffffffL) >>> 20)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffffffL) >>> 28)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffffffL) >>> 36)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffffffL) >>> 44)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffffffffffffL) >>> 52)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffffffL) <<  0)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffffffffffffL) >>> 56)
                | ((src[ 3 + srcOff] & 0xfffffffffffffffL) <<  4)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffffffL) >>> 4)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffffffL) >>> 12)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffffffL) >>> 20)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffffffL) >>> 28)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffffffL) >>> 36)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffffffL) >>> 44)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffffffffffffL) >>> 52)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffffffL) <<  0)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffffffffffffL) >>> 56)
                | ((src[ 5 + srcOff] & 0xfffffffffffffffL) <<  4)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffffffL) >>> 4)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffffffL) >>> 12)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffffffL) >>> 20)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffffffL) >>> 28)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffffffL) >>> 36)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffffffL) >>> 44)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffffffffffffL) >>> 52)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffffffL) <<  0)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[48 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[49 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[50 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[51 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[52 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffffffffffffL) >>> 56)
                | ((src[ 7 + srcOff] & 0xfffffffffffffffL) <<  4)
            ) & 0xff);
        dst[53 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffffffL) >>> 4)
            ) & 0xff);
        dst[54 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffffffL) >>> 12)
            ) & 0xff);
        dst[55 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffffffL) >>> 20)
            ) & 0xff);
        dst[56 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffffffL) >>> 28)
            ) & 0xff);
        dst[57 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffffffL) >>> 36)
            ) & 0xff);
        dst[58 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffffffL) >>> 44)
            ) & 0xff);
        dst[59 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffffffffffffL) >>> 52)
            ) & 0xff);
    }

    public static void bitPack8LongLE61(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffffffffffffL) >>> 56)
                | ((src[ 1 + srcOff] & 0x1fffffffffffffffL) <<  5)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffffffL) >>> 3)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffffffL) >>> 11)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffffffL) >>> 19)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffffffL) >>> 27)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffffffL) >>> 35)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffffffL) >>> 43)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffffffL) >>> 51)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffffffffffffL) >>> 59)
                | ((src[ 2 + srcOff] & 0x1fffffffffffffffL) <<  2)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffffffL) >>> 6)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffffffL) >>> 14)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffffffL) >>> 22)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffffffL) >>> 30)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffffffL) >>> 38)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffffffL) >>> 46)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffffffffffffL) >>> 54)
                | ((src[ 3 + srcOff] & 0x1fffffffffffffffL) <<  7)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffffffL) >>> 1)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffffffL) >>> 9)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffffffL) >>> 17)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffffffL) >>> 25)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffffffL) >>> 33)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffffffL) >>> 41)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffffffL) >>> 49)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffffffffffffL) >>> 57)
                | ((src[ 4 + srcOff] & 0x1fffffffffffffffL) <<  4)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffffffL) >>> 4)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffffffL) >>> 12)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffffffL) >>> 20)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffffffL) >>> 28)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffffffL) >>> 36)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffffffL) >>> 44)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffffffL) >>> 52)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffffffffffffL) >>> 60)
                | ((src[ 5 + srcOff] & 0x1fffffffffffffffL) <<  1)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffffffL) >>> 7)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffffffL) >>> 15)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffffffL) >>> 23)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffffffL) >>> 31)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffffffL) >>> 39)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffffffL) >>> 47)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffffffffffffL) >>> 55)
                | ((src[ 6 + srcOff] & 0x1fffffffffffffffL) <<  6)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffffffL) >>> 2)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffffffL) >>> 10)
            ) & 0xff);
        dst[48 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffffffL) >>> 18)
            ) & 0xff);
        dst[49 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffffffL) >>> 26)
            ) & 0xff);
        dst[50 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffffffL) >>> 34)
            ) & 0xff);
        dst[51 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffffffL) >>> 42)
            ) & 0xff);
        dst[52 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffffffL) >>> 50)
            ) & 0xff);
        dst[53 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffffffffffffL) >>> 58)
                | ((src[ 7 + srcOff] & 0x1fffffffffffffffL) <<  3)
            ) & 0xff);
        dst[54 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffffffL) >>> 5)
            ) & 0xff);
        dst[55 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffffffL) >>> 13)
            ) & 0xff);
        dst[56 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffffffL) >>> 21)
            ) & 0xff);
        dst[57 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffffffL) >>> 29)
            ) & 0xff);
        dst[58 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffffffL) >>> 37)
            ) & 0xff);
        dst[59 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffffffL) >>> 45)
            ) & 0xff);
        dst[60 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffffffffffffL) >>> 53)
            ) & 0xff);
    }

    public static void bitPack8LongLE62(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffffffffffffL) >>> 56)
                | ((src[ 1 + srcOff] & 0x3fffffffffffffffL) <<  6)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffffffL) >>> 2)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffffffL) >>> 10)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffffffL) >>> 18)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffffffL) >>> 26)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffffffL) >>> 34)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffffffL) >>> 42)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffffffL) >>> 50)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffffffffffffL) >>> 58)
                | ((src[ 2 + srcOff] & 0x3fffffffffffffffL) <<  4)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffffffL) >>> 4)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffffffL) >>> 12)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffffffL) >>> 20)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffffffL) >>> 28)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffffffL) >>> 36)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffffffL) >>> 44)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffffffL) >>> 52)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffffffffffffL) >>> 60)
                | ((src[ 3 + srcOff] & 0x3fffffffffffffffL) <<  2)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffffffL) >>> 6)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffffffL) >>> 14)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffffffL) >>> 22)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffffffL) >>> 30)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffffffL) >>> 38)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffffffL) >>> 46)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffffffffffffL) >>> 54)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffffffL) <<  0)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffffffffffffL) >>> 56)
                | ((src[ 5 + srcOff] & 0x3fffffffffffffffL) <<  6)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffffffL) >>> 2)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffffffL) >>> 10)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffffffL) >>> 18)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffffffL) >>> 26)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffffffL) >>> 34)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffffffL) >>> 42)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffffffL) >>> 50)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffffffffffffL) >>> 58)
                | ((src[ 6 + srcOff] & 0x3fffffffffffffffL) <<  4)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffffffL) >>> 4)
            ) & 0xff);
        dst[48 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffffffL) >>> 12)
            ) & 0xff);
        dst[49 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffffffL) >>> 20)
            ) & 0xff);
        dst[50 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffffffL) >>> 28)
            ) & 0xff);
        dst[51 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffffffL) >>> 36)
            ) & 0xff);
        dst[52 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffffffL) >>> 44)
            ) & 0xff);
        dst[53 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffffffL) >>> 52)
            ) & 0xff);
        dst[54 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffffffffffffL) >>> 60)
                | ((src[ 7 + srcOff] & 0x3fffffffffffffffL) <<  2)
            ) & 0xff);
        dst[55 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffffffL) >>> 6)
            ) & 0xff);
        dst[56 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffffffL) >>> 14)
            ) & 0xff);
        dst[57 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffffffL) >>> 22)
            ) & 0xff);
        dst[58 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffffffL) >>> 30)
            ) & 0xff);
        dst[59 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffffffL) >>> 38)
            ) & 0xff);
        dst[60 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffffffL) >>> 46)
            ) & 0xff);
        dst[61 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffffffffffffL) >>> 54)
            ) & 0xff);
    }

    public static void bitPack8LongLE63(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffffffL) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffffffL) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffffffL) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffffffL) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffffffL) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffffffL) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffffffL) >>> 48)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffffffffffffL) >>> 56)
                | ((src[ 1 + srcOff] & 0x7fffffffffffffffL) <<  7)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffffffL) >>> 1)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffffffL) >>> 9)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffffffL) >>> 17)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffffffL) >>> 25)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffffffL) >>> 33)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffffffL) >>> 41)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffffffL) >>> 49)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffffffffffffL) >>> 57)
                | ((src[ 2 + srcOff] & 0x7fffffffffffffffL) <<  6)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffffffL) >>> 2)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffffffL) >>> 10)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffffffL) >>> 18)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffffffL) >>> 26)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffffffL) >>> 34)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffffffL) >>> 42)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffffffL) >>> 50)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffffffffffffL) >>> 58)
                | ((src[ 3 + srcOff] & 0x7fffffffffffffffL) <<  5)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffffffL) >>> 3)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffffffL) >>> 11)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffffffL) >>> 19)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffffffL) >>> 27)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffffffL) >>> 35)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffffffL) >>> 43)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffffffL) >>> 51)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffffffffffffL) >>> 59)
                | ((src[ 4 + srcOff] & 0x7fffffffffffffffL) <<  4)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffffffL) >>> 4)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffffffL) >>> 12)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffffffL) >>> 20)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffffffL) >>> 28)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffffffL) >>> 36)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffffffL) >>> 44)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffffffL) >>> 52)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffffffffffffL) >>> 60)
                | ((src[ 5 + srcOff] & 0x7fffffffffffffffL) <<  3)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffffffL) >>> 5)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffffffL) >>> 13)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffffffL) >>> 21)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffffffL) >>> 29)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffffffL) >>> 37)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffffffL) >>> 45)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffffffL) >>> 53)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffffffffffffL) >>> 61)
                | ((src[ 6 + srcOff] & 0x7fffffffffffffffL) <<  2)
            ) & 0xff);
        dst[48 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffffffL) >>> 6)
            ) & 0xff);
        dst[49 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffffffL) >>> 14)
            ) & 0xff);
        dst[50 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffffffL) >>> 22)
            ) & 0xff);
        dst[51 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffffffL) >>> 30)
            ) & 0xff);
        dst[52 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffffffL) >>> 38)
            ) & 0xff);
        dst[53 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffffffL) >>> 46)
            ) & 0xff);
        dst[54 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffffffL) >>> 54)
            ) & 0xff);
        dst[55 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffffffffffffL) >>> 62)
                | ((src[ 7 + srcOff] & 0x7fffffffffffffffL) <<  1)
            ) & 0xff);
        dst[56 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffffffL) >>> 7)
            ) & 0xff);
        dst[57 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffffffL) >>> 15)
            ) & 0xff);
        dst[58 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffffffL) >>> 23)
            ) & 0xff);
        dst[59 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffffffL) >>> 31)
            ) & 0xff);
        dst[60 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffffffL) >>> 39)
            ) & 0xff);
        dst[61 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffffffL) >>> 47)
            ) & 0xff);
        dst[62 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffffffffffffL) >>> 55)
            ) & 0xff);
    }

    public static void bitPack8LongLE64(long[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & -1L) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & -1L) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & -1L) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & -1L) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & -1L) >>> 32)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & -1L) >>> 40)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & -1L) >>> 48)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & -1L) >>> 56)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & -1L) <<  0)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & -1L) >>> 8)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & -1L) >>> 16)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & -1L) >>> 24)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & -1L) >>> 32)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & -1L) >>> 40)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & -1L) >>> 48)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & -1L) >>> 56)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & -1L) <<  0)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & -1L) >>> 8)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & -1L) >>> 16)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & -1L) >>> 24)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & -1L) >>> 32)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & -1L) >>> 40)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & -1L) >>> 48)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & -1L) >>> 56)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & -1L) <<  0)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & -1L) >>> 8)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & -1L) >>> 16)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & -1L) >>> 24)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & -1L) >>> 32)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & -1L) >>> 40)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & -1L) >>> 48)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & -1L) >>> 56)
            ) & 0xff);
        dst[32 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & -1L) <<  0)
            ) & 0xff);
        dst[33 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & -1L) >>> 8)
            ) & 0xff);
        dst[34 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & -1L) >>> 16)
            ) & 0xff);
        dst[35 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & -1L) >>> 24)
            ) & 0xff);
        dst[36 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & -1L) >>> 32)
            ) & 0xff);
        dst[37 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & -1L) >>> 40)
            ) & 0xff);
        dst[38 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & -1L) >>> 48)
            ) & 0xff);
        dst[39 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & -1L) >>> 56)
            ) & 0xff);
        dst[40 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & -1L) <<  0)
            ) & 0xff);
        dst[41 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & -1L) >>> 8)
            ) & 0xff);
        dst[42 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & -1L) >>> 16)
            ) & 0xff);
        dst[43 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & -1L) >>> 24)
            ) & 0xff);
        dst[44 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & -1L) >>> 32)
            ) & 0xff);
        dst[45 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & -1L) >>> 40)
            ) & 0xff);
        dst[46 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & -1L) >>> 48)
            ) & 0xff);
        dst[47 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & -1L) >>> 56)
            ) & 0xff);
        dst[48 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & -1L) <<  0)
            ) & 0xff);
        dst[49 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & -1L) >>> 8)
            ) & 0xff);
        dst[50 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & -1L) >>> 16)
            ) & 0xff);
        dst[51 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & -1L) >>> 24)
            ) & 0xff);
        dst[52 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & -1L) >>> 32)
            ) & 0xff);
        dst[53 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & -1L) >>> 40)
            ) & 0xff);
        dst[54 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & -1L) >>> 48)
            ) & 0xff);
        dst[55 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & -1L) >>> 56)
            ) & 0xff);
        dst[56 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & -1L) <<  0)
            ) & 0xff);
        dst[57 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & -1L) >>> 8)
            ) & 0xff);
        dst[58 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & -1L) >>> 16)
            ) & 0xff);
        dst[59 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & -1L) >>> 24)
            ) & 0xff);
        dst[60 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & -1L) >>> 32)
            ) & 0xff);
        dst[61 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & -1L) >>> 40)
            ) & 0xff);
        dst[62 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & -1L) >>> 48)
            ) & 0xff);
        dst[63 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & -1L) >>> 56)
            ) & 0xff);
    }

}
