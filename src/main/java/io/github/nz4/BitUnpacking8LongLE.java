package io.github.nz4;

import java.util.function.IntToLongFunction;

final class BitUnpacking8LongLE
{
    private BitUnpacking8LongLE()
    { }

    public static void unpack(byte[] src, int srcOff, long[] dst, int dstOff, int bits)
    {
        switch (bits) {
        case 0:
            // do nothing
            break;
        case 1:
            bitUnpack8LongLE1(src, srcOff, dst, dstOff);
            break;
        case 2:
            bitUnpack8LongLE2(src, srcOff, dst, dstOff);
            break;
        case 3:
            bitUnpack8LongLE3(src, srcOff, dst, dstOff);
            break;
        case 4:
            bitUnpack8LongLE4(src, srcOff, dst, dstOff);
            break;
        case 5:
            bitUnpack8LongLE5(src, srcOff, dst, dstOff);
            break;
        case 6:
            bitUnpack8LongLE6(src, srcOff, dst, dstOff);
            break;
        case 7:
            bitUnpack8LongLE7(src, srcOff, dst, dstOff);
            break;
        case 8:
            bitUnpack8LongLE8(src, srcOff, dst, dstOff);
            break;
        case 9:
            bitUnpack8LongLE9(src, srcOff, dst, dstOff);
            break;
        case 10:
            bitUnpack8LongLE10(src, srcOff, dst, dstOff);
            break;
        case 11:
            bitUnpack8LongLE11(src, srcOff, dst, dstOff);
            break;
        case 12:
            bitUnpack8LongLE12(src, srcOff, dst, dstOff);
            break;
        case 13:
            bitUnpack8LongLE13(src, srcOff, dst, dstOff);
            break;
        case 14:
            bitUnpack8LongLE14(src, srcOff, dst, dstOff);
            break;
        case 15:
            bitUnpack8LongLE15(src, srcOff, dst, dstOff);
            break;
        case 16:
            bitUnpack8LongLE16(src, srcOff, dst, dstOff);
            break;
        case 17:
            bitUnpack8LongLE17(src, srcOff, dst, dstOff);
            break;
        case 18:
            bitUnpack8LongLE18(src, srcOff, dst, dstOff);
            break;
        case 19:
            bitUnpack8LongLE19(src, srcOff, dst, dstOff);
            break;
        case 20:
            bitUnpack8LongLE20(src, srcOff, dst, dstOff);
            break;
        case 21:
            bitUnpack8LongLE21(src, srcOff, dst, dstOff);
            break;
        case 22:
            bitUnpack8LongLE22(src, srcOff, dst, dstOff);
            break;
        case 23:
            bitUnpack8LongLE23(src, srcOff, dst, dstOff);
            break;
        case 24:
            bitUnpack8LongLE24(src, srcOff, dst, dstOff);
            break;
        case 25:
            bitUnpack8LongLE25(src, srcOff, dst, dstOff);
            break;
        case 26:
            bitUnpack8LongLE26(src, srcOff, dst, dstOff);
            break;
        case 27:
            bitUnpack8LongLE27(src, srcOff, dst, dstOff);
            break;
        case 28:
            bitUnpack8LongLE28(src, srcOff, dst, dstOff);
            break;
        case 29:
            bitUnpack8LongLE29(src, srcOff, dst, dstOff);
            break;
        case 30:
            bitUnpack8LongLE30(src, srcOff, dst, dstOff);
            break;
        case 31:
            bitUnpack8LongLE31(src, srcOff, dst, dstOff);
            break;
        case 32:
            bitUnpack8LongLE32(src, srcOff, dst, dstOff);
            break;
        case 33:
            bitUnpack8LongLE33(src, srcOff, dst, dstOff);
            break;
        case 34:
            bitUnpack8LongLE34(src, srcOff, dst, dstOff);
            break;
        case 35:
            bitUnpack8LongLE35(src, srcOff, dst, dstOff);
            break;
        case 36:
            bitUnpack8LongLE36(src, srcOff, dst, dstOff);
            break;
        case 37:
            bitUnpack8LongLE37(src, srcOff, dst, dstOff);
            break;
        case 38:
            bitUnpack8LongLE38(src, srcOff, dst, dstOff);
            break;
        case 39:
            bitUnpack8LongLE39(src, srcOff, dst, dstOff);
            break;
        case 40:
            bitUnpack8LongLE40(src, srcOff, dst, dstOff);
            break;
        case 41:
            bitUnpack8LongLE41(src, srcOff, dst, dstOff);
            break;
        case 42:
            bitUnpack8LongLE42(src, srcOff, dst, dstOff);
            break;
        case 43:
            bitUnpack8LongLE43(src, srcOff, dst, dstOff);
            break;
        case 44:
            bitUnpack8LongLE44(src, srcOff, dst, dstOff);
            break;
        case 45:
            bitUnpack8LongLE45(src, srcOff, dst, dstOff);
            break;
        case 46:
            bitUnpack8LongLE46(src, srcOff, dst, dstOff);
            break;
        case 47:
            bitUnpack8LongLE47(src, srcOff, dst, dstOff);
            break;
        case 48:
            bitUnpack8LongLE48(src, srcOff, dst, dstOff);
            break;
        case 49:
            bitUnpack8LongLE49(src, srcOff, dst, dstOff);
            break;
        case 50:
            bitUnpack8LongLE50(src, srcOff, dst, dstOff);
            break;
        case 51:
            bitUnpack8LongLE51(src, srcOff, dst, dstOff);
            break;
        case 52:
            bitUnpack8LongLE52(src, srcOff, dst, dstOff);
            break;
        case 53:
            bitUnpack8LongLE53(src, srcOff, dst, dstOff);
            break;
        case 54:
            bitUnpack8LongLE54(src, srcOff, dst, dstOff);
            break;
        case 55:
            bitUnpack8LongLE55(src, srcOff, dst, dstOff);
            break;
        case 56:
            bitUnpack8LongLE56(src, srcOff, dst, dstOff);
            break;
        case 57:
            bitUnpack8LongLE57(src, srcOff, dst, dstOff);
            break;
        case 58:
            bitUnpack8LongLE58(src, srcOff, dst, dstOff);
            break;
        case 59:
            bitUnpack8LongLE59(src, srcOff, dst, dstOff);
            break;
        case 60:
            bitUnpack8LongLE60(src, srcOff, dst, dstOff);
            break;
        case 61:
            bitUnpack8LongLE61(src, srcOff, dst, dstOff);
            break;
        case 62:
            bitUnpack8LongLE62(src, srcOff, dst, dstOff);
            break;
        case 63:
            bitUnpack8LongLE63(src, srcOff, dst, dstOff);
            break;
        case 64:
            bitUnpack8LongLE64(src, srcOff, dst, dstOff);
            break;
        default:
            throw new IllegalArgumentException("Bit width must be from 0 to 64 but got " + bits);
        }
    }

    public static void bitUnpack8LongLE1(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0x1L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 1) & 0x1L);
        dst[ 2 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 2) & 0x1L);
        dst[ 3 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 3) & 0x1L);
        dst[ 4 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 4) & 0x1L);
        dst[ 5 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 5) & 0x1L);
        dst[ 6 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 6) & 0x1L);
        dst[ 7 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 7) & 0x1L);
    }

    public static void bitUnpack8LongLE2(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0x3L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 2) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 4) & 0x3L);
        dst[ 3 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 6) & 0x3L);
        dst[ 4 + dstOff] =
                  ((((long) src[ 1 + srcOff]) << 0) & 0x3L);
        dst[ 5 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 2) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 4) & 0x3L);
        dst[ 7 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 6) & 0x3L);
    }

    public static void bitUnpack8LongLE3(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0x7L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 3) & 0x7L);
        dst[ 2 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 1 + srcOff]) << 2) & 0x7L);
        dst[ 3 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 1) & 0x7L);
        dst[ 4 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 4) & 0x7L);
        dst[ 5 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[ 2 + srcOff]) << 1) & 0x7L);
        dst[ 6 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 2) & 0x7L);
        dst[ 7 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 5) & 0x7L);
    }

    public static void bitUnpack8LongLE4(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xfL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 1 + srcOff]) << 0) & 0xfL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 0) & 0xfL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 0) & 0xfL);
        dst[ 7 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 4) & 0xfL);
    }

    public static void bitUnpack8LongLE5(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0x1fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[ 1 + srcOff]) << 3) & 0x1fL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 2) & 0x1fL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[ 2 + srcOff]) << 1) & 0x1fL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 3 + srcOff]) << 4) & 0x1fL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 1) & 0x1fL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 4 + srcOff]) << 2) & 0x1fL);
        dst[ 7 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 3) & 0x1fL);
    }

    public static void bitUnpack8LongLE6(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0x3fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 1 + srcOff]) << 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 2 + srcOff]) << 4) & 0x3fL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 2) & 0x3fL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 0) & 0x3fL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 4 + srcOff]) << 2) & 0x3fL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 5 + srcOff]) << 4) & 0x3fL);
        dst[ 7 + dstOff] =
                  ((((long) src[ 5 + srcOff]) >> 2) & 0x3fL);
    }

    public static void bitUnpack8LongLE7(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0x7fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[ 1 + srcOff]) << 1) & 0x7fL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 2 + srcOff]) << 2) & 0x7fL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[ 3 + srcOff]) << 3) & 0x7fL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 4 + srcOff]) << 4) & 0x7fL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[ 5 + srcOff]) << 5) & 0x7fL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 5 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 6 + srcOff]) << 6) & 0x7fL);
        dst[ 7 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 1) & 0x7fL);
    }

    public static void bitUnpack8LongLE8(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 1 + srcOff]) << 0) & 0xffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 0) & 0xffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 0) & 0xffL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 0) & 0xffL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 0) & 0xffL);
        dst[ 7 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongLE9(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0x1ffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[ 2 + srcOff]) << 7) & 0x1ffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 3 + srcOff]) << 6) & 0x1ffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[ 4 + srcOff]) << 5) & 0x1ffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 5 + srcOff]) << 4) & 0x1ffL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 5 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[ 6 + srcOff]) << 3) & 0x1ffL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 7 + srcOff]) << 2) & 0x1ffL);
        dst[ 7 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[ 8 + srcOff]) << 1) & 0x1ffL);
    }

    public static void bitUnpack8LongLE10(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0x3ffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 2 + srcOff]) << 6) & 0x3ffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 3 + srcOff]) << 4) & 0x3ffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 4 + srcOff]) << 2) & 0x3ffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 6 + srcOff]) << 8) & 0x3ffL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 7 + srcOff]) << 6) & 0x3ffL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 8 + srcOff]) << 4) & 0x3ffL);
        dst[ 7 + dstOff] =
                  ((((long) src[ 8 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 9 + srcOff]) << 2) & 0x3ffL);
    }

    public static void bitUnpack8LongLE11(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0x7ffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[ 2 + srcOff]) << 5) & 0x7ffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 3 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 4 + srcOff]) << 10) & 0x7ffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[ 5 + srcOff]) << 7) & 0x7ffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 5 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 6 + srcOff]) << 4) & 0x7ffL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[ 7 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 8 + srcOff]) << 9) & 0x7ffL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 8 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 9 + srcOff]) << 6) & 0x7ffL);
        dst[ 7 + dstOff] =
                  ((((long) src[ 9 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[10 + srcOff]) << 3) & 0x7ffL);
    }

    public static void bitUnpack8LongLE12(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xfffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 2 + srcOff]) << 4) & 0xfffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 4 + srcOff]) << 8) & 0xfffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 5 + srcOff]) << 4) & 0xfffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 7 + srcOff]) << 8) & 0xfffL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 8 + srcOff]) << 4) & 0xfffL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 0) & 0xffL)
                | ((((long) src[10 + srcOff]) << 8) & 0xfffL);
        dst[ 7 + dstOff] =
                  ((((long) src[10 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[11 + srcOff]) << 4) & 0xfffL);
    }

    public static void bitUnpack8LongLE13(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0x1fffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[ 2 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 3 + srcOff]) << 11) & 0x1fffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 4 + srcOff]) << 6) & 0x1fffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[ 5 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 6 + srcOff]) << 9) & 0x1fffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 7 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 8 + srcOff]) << 12) & 0x1fffL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 8 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[ 9 + srcOff]) << 7) & 0x1fffL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 9 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[10 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[11 + srcOff]) << 10) & 0x1fffL);
        dst[ 7 + dstOff] =
                  ((((long) src[11 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[12 + srcOff]) << 5) & 0x1fffL);
    }

    public static void bitUnpack8LongLE14(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0x3fffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 2 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 3 + srcOff]) << 10) & 0x3fffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 4 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 5 + srcOff]) << 12) & 0x3fffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 5 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 6 + srcOff]) << 6) & 0x3fffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 8 + srcOff]) << 8) & 0x3fffL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 8 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 9 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[10 + srcOff]) << 10) & 0x3fffL);
        dst[ 6 + dstOff] =
                  ((((long) src[10 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[11 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[12 + srcOff]) << 12) & 0x3fffL);
        dst[ 7 + dstOff] =
                  ((((long) src[12 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[13 + srcOff]) << 6) & 0x3fffL);
    }

    public static void bitUnpack8LongLE15(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0x7fffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[ 2 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 3 + srcOff]) << 9) & 0x7fffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 4 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 5 + srcOff]) << 10) & 0x7fffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 5 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[ 6 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 7 + srcOff]) << 11) & 0x7fffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 8 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 9 + srcOff]) << 12) & 0x7fffL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 9 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[10 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[11 + srcOff]) << 13) & 0x7fffL);
        dst[ 6 + dstOff] =
                  ((((long) src[11 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[12 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[13 + srcOff]) << 14) & 0x7fffL);
        dst[ 7 + dstOff] =
                  ((((long) src[13 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[14 + srcOff]) << 7) & 0x7fffL);
    }

    public static void bitUnpack8LongLE16(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 3 + srcOff]) << 8) & 0xffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 5 + srcOff]) << 8) & 0xffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 7 + srcOff]) << 8) & 0xffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 8 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 9 + srcOff]) << 8) & 0xffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[10 + srcOff]) << 0) & 0xffL)
                | ((((long) src[11 + srcOff]) << 8) & 0xffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[12 + srcOff]) << 0) & 0xffL)
                | ((((long) src[13 + srcOff]) << 8) & 0xffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[14 + srcOff]) << 0) & 0xffL)
                | ((((long) src[15 + srcOff]) << 8) & 0xffffL);
    }

    public static void bitUnpack8LongLE17(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0x1ffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[ 3 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[ 4 + srcOff]) << 15) & 0x1ffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 5 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 6 + srcOff]) << 14) & 0x1ffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[ 7 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[ 8 + srcOff]) << 13) & 0x1ffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 8 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 9 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[10 + srcOff]) << 12) & 0x1ffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[10 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[11 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[12 + srcOff]) << 11) & 0x1ffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[12 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[13 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[14 + srcOff]) << 10) & 0x1ffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[14 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[15 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[16 + srcOff]) << 9) & 0x1ffffL);
    }

    public static void bitUnpack8LongLE18(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0x3ffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 3 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 4 + srcOff]) << 14) & 0x3ffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 5 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 6 + srcOff]) << 12) & 0x3ffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 7 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 8 + srcOff]) << 10) & 0x3ffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 0) & 0xffL)
                | ((((long) src[10 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[11 + srcOff]) << 16) & 0x3ffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[11 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[12 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[13 + srcOff]) << 14) & 0x3ffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[13 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[14 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[15 + srcOff]) << 12) & 0x3ffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[15 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[16 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[17 + srcOff]) << 10) & 0x3ffffL);
    }

    public static void bitUnpack8LongLE19(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0x7ffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[ 3 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[ 4 + srcOff]) << 13) & 0x7ffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 5 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 6 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 7 + srcOff]) << 18) & 0x7ffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[ 8 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[ 9 + srcOff]) << 15) & 0x7ffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 9 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[10 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[11 + srcOff]) << 12) & 0x7ffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[11 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[12 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[13 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[14 + srcOff]) << 17) & 0x7ffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[14 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[15 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[16 + srcOff]) << 14) & 0x7ffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[16 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[17 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[18 + srcOff]) << 11) & 0x7ffffL);
    }

    public static void bitUnpack8LongLE20(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xfffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 3 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 4 + srcOff]) << 12) & 0xfffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 6 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 7 + srcOff]) << 16) & 0xfffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 8 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 9 + srcOff]) << 12) & 0xfffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[10 + srcOff]) << 0) & 0xffL)
                | ((((long) src[11 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[12 + srcOff]) << 16) & 0xfffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[12 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[13 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[14 + srcOff]) << 12) & 0xfffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[15 + srcOff]) << 0) & 0xffL)
                | ((((long) src[16 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[17 + srcOff]) << 16) & 0xfffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[17 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[18 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[19 + srcOff]) << 12) & 0xfffffL);
    }

    public static void bitUnpack8LongLE21(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0x1fffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[ 3 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 4 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[ 5 + srcOff]) << 19) & 0x1fffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 5 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 6 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 7 + srcOff]) << 14) & 0x1fffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[ 8 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 9 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[10 + srcOff]) << 17) & 0x1fffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[10 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[11 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[12 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[13 + srcOff]) << 20) & 0x1fffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[13 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[14 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[15 + srcOff]) << 15) & 0x1fffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[15 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[16 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[17 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[18 + srcOff]) << 18) & 0x1fffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[18 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[19 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[20 + srcOff]) << 13) & 0x1fffffL);
    }

    public static void bitUnpack8LongLE22(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0x3fffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 3 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 4 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 5 + srcOff]) << 18) & 0x3fffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 5 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 6 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 7 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 8 + srcOff]) << 20) & 0x3fffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 8 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 9 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[10 + srcOff]) << 14) & 0x3fffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[11 + srcOff]) << 0) & 0xffL)
                | ((((long) src[12 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[13 + srcOff]) << 16) & 0x3fffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[13 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[14 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[15 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[16 + srcOff]) << 18) & 0x3fffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[16 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[17 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[18 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[19 + srcOff]) << 20) & 0x3fffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[19 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[20 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[21 + srcOff]) << 14) & 0x3fffffL);
    }

    public static void bitUnpack8LongLE23(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0x7fffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[ 3 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 4 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[ 5 + srcOff]) << 17) & 0x7fffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 5 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 6 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 7 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 8 + srcOff]) << 18) & 0x7fffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 8 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[ 9 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[10 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[11 + srcOff]) << 19) & 0x7fffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[11 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[12 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[13 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[14 + srcOff]) << 20) & 0x7fffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[14 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[15 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[16 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[17 + srcOff]) << 21) & 0x7fffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[17 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[18 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[19 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[20 + srcOff]) << 22) & 0x7fffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[20 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[21 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[22 + srcOff]) << 15) & 0x7fffffL);
    }

    public static void bitUnpack8LongLE24(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 4 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 5 + srcOff]) << 16) & 0xffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 7 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 8 + srcOff]) << 16) & 0xffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 0) & 0xffL)
                | ((((long) src[10 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[11 + srcOff]) << 16) & 0xffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[12 + srcOff]) << 0) & 0xffL)
                | ((((long) src[13 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[14 + srcOff]) << 16) & 0xffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[15 + srcOff]) << 0) & 0xffL)
                | ((((long) src[16 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[17 + srcOff]) << 16) & 0xffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[18 + srcOff]) << 0) & 0xffL)
                | ((((long) src[19 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[20 + srcOff]) << 16) & 0xffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[21 + srcOff]) << 0) & 0xffL)
                | ((((long) src[22 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[23 + srcOff]) << 16) & 0xffffffL);
    }

    public static void bitUnpack8LongLE25(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0x1ffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[ 4 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[ 5 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[ 6 + srcOff]) << 23) & 0x1ffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 7 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 8 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 9 + srcOff]) << 22) & 0x1ffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 9 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[10 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[11 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[12 + srcOff]) << 21) & 0x1ffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[12 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[13 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[14 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[15 + srcOff]) << 20) & 0x1ffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[15 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[16 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[17 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[18 + srcOff]) << 19) & 0x1ffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[18 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[19 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[20 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[21 + srcOff]) << 18) & 0x1ffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[21 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[22 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[23 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[24 + srcOff]) << 17) & 0x1ffffffL);
    }

    public static void bitUnpack8LongLE26(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0x3ffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 4 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 5 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 6 + srcOff]) << 22) & 0x3ffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 7 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 8 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 9 + srcOff]) << 20) & 0x3ffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 9 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[10 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[11 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[12 + srcOff]) << 18) & 0x3ffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[13 + srcOff]) << 0) & 0xffL)
                | ((((long) src[14 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[15 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[16 + srcOff]) << 24) & 0x3ffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[16 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[17 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[18 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[19 + srcOff]) << 22) & 0x3ffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[19 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[20 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[21 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[22 + srcOff]) << 20) & 0x3ffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[22 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[23 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[24 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[25 + srcOff]) << 18) & 0x3ffffffL);
    }

    public static void bitUnpack8LongLE27(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0x7ffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[ 4 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[ 5 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[ 6 + srcOff]) << 21) & 0x7ffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 7 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 8 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 9 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[10 + srcOff]) << 26) & 0x7ffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[10 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[11 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[12 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[13 + srcOff]) << 23) & 0x7ffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[13 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[14 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[15 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[16 + srcOff]) << 20) & 0x7ffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[16 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[17 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[18 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[19 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[20 + srcOff]) << 25) & 0x7ffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[20 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[21 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[22 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[23 + srcOff]) << 22) & 0x7ffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[23 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[24 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[25 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[26 + srcOff]) << 19) & 0x7ffffffL);
    }

    public static void bitUnpack8LongLE28(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xfffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 4 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 5 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 6 + srcOff]) << 20) & 0xfffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 8 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 9 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[10 + srcOff]) << 24) & 0xfffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[10 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[11 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[12 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[13 + srcOff]) << 20) & 0xfffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[14 + srcOff]) << 0) & 0xffL)
                | ((((long) src[15 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[16 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[17 + srcOff]) << 24) & 0xfffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[17 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[18 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[19 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[20 + srcOff]) << 20) & 0xfffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[21 + srcOff]) << 0) & 0xffL)
                | ((((long) src[22 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[23 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[24 + srcOff]) << 24) & 0xfffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[24 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[25 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[26 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[27 + srcOff]) << 20) & 0xfffffffL);
    }

    public static void bitUnpack8LongLE29(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0x1fffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[ 4 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 5 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[ 6 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[ 7 + srcOff]) << 27) & 0x1fffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 8 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 9 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[10 + srcOff]) << 22) & 0x1fffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[10 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[11 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[12 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[13 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[14 + srcOff]) << 25) & 0x1fffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[14 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[15 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[16 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[17 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[18 + srcOff]) << 28) & 0x1fffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[18 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[19 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[20 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[21 + srcOff]) << 23) & 0x1fffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[21 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[22 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[23 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[24 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[25 + srcOff]) << 26) & 0x1fffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[25 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[26 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[27 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[28 + srcOff]) << 21) & 0x1fffffffL);
    }

    public static void bitUnpack8LongLE30(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0x3fffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 4 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 5 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 6 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[ 7 + srcOff]) << 26) & 0x3fffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 8 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 9 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[10 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[11 + srcOff]) << 28) & 0x3fffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[11 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[12 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[13 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[14 + srcOff]) << 22) & 0x3fffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[15 + srcOff]) << 0) & 0xffL)
                | ((((long) src[16 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[17 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[18 + srcOff]) << 24) & 0x3fffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[18 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[19 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[20 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[21 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[22 + srcOff]) << 26) & 0x3fffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[22 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[23 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[24 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[25 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[26 + srcOff]) << 28) & 0x3fffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[26 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[27 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[28 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[29 + srcOff]) << 22) & 0x3fffffffL);
    }

    public static void bitUnpack8LongLE31(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0x7fffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[ 4 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 5 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[ 6 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[ 7 + srcOff]) << 25) & 0x7fffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 8 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 9 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[10 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[11 + srcOff]) << 26) & 0x7fffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[11 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[12 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[13 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[14 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[15 + srcOff]) << 27) & 0x7fffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[15 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[16 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[17 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[18 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[19 + srcOff]) << 28) & 0x7fffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[19 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[20 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[21 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[22 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[23 + srcOff]) << 29) & 0x7fffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[23 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[24 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[25 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[26 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[27 + srcOff]) << 30) & 0x7fffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[27 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[28 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[29 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[30 + srcOff]) << 23) & 0x7fffffffL);
    }

    public static void bitUnpack8LongLE32(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 5 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 6 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 7 + srcOff]) << 24) & 0xffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 8 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 9 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[10 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[11 + srcOff]) << 24) & 0xffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[12 + srcOff]) << 0) & 0xffL)
                | ((((long) src[13 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[14 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[15 + srcOff]) << 24) & 0xffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[16 + srcOff]) << 0) & 0xffL)
                | ((((long) src[17 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[18 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[19 + srcOff]) << 24) & 0xffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[20 + srcOff]) << 0) & 0xffL)
                | ((((long) src[21 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[22 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[23 + srcOff]) << 24) & 0xffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[24 + srcOff]) << 0) & 0xffL)
                | ((((long) src[25 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[26 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[27 + srcOff]) << 24) & 0xffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[28 + srcOff]) << 0) & 0xffL)
                | ((((long) src[29 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[30 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[31 + srcOff]) << 24) & 0xffffffffL);
    }

    public static void bitUnpack8LongLE33(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0x1ffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[ 5 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[ 6 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[ 7 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[ 8 + srcOff]) << 31) & 0x1ffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 8 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 9 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[10 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[11 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[12 + srcOff]) << 30) & 0x1ffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[12 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[13 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[14 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[15 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[16 + srcOff]) << 29) & 0x1ffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[16 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[17 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[18 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[19 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[20 + srcOff]) << 28) & 0x1ffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[20 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[21 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[22 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[23 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[24 + srcOff]) << 27) & 0x1ffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[24 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[25 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[26 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[27 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[28 + srcOff]) << 26) & 0x1ffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[28 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[29 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[30 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[31 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[32 + srcOff]) << 25) & 0x1ffffffffL);
    }

    public static void bitUnpack8LongLE34(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0x3ffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 5 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 6 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 7 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[ 8 + srcOff]) << 30) & 0x3ffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 8 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 9 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[10 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[11 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[12 + srcOff]) << 28) & 0x3ffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[12 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[13 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[14 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[15 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[16 + srcOff]) << 26) & 0x3ffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[17 + srcOff]) << 0) & 0xffL)
                | ((((long) src[18 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[19 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[20 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[21 + srcOff]) << 32) & 0x3ffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[21 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[22 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[23 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[24 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[25 + srcOff]) << 30) & 0x3ffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[25 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[26 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[27 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[28 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[29 + srcOff]) << 28) & 0x3ffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[29 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[30 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[31 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[32 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[33 + srcOff]) << 26) & 0x3ffffffffL);
    }

    public static void bitUnpack8LongLE35(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0x7ffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[ 5 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[ 6 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[ 7 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[ 8 + srcOff]) << 29) & 0x7ffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 8 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 9 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[10 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[11 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[12 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[13 + srcOff]) << 34) & 0x7ffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[13 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[14 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[15 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[16 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[17 + srcOff]) << 31) & 0x7ffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[17 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[18 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[19 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[20 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[21 + srcOff]) << 28) & 0x7ffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[21 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[22 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[23 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[24 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[25 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[26 + srcOff]) << 33) & 0x7ffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[26 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[27 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[28 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[29 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[30 + srcOff]) << 30) & 0x7ffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[30 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[31 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[32 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[33 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[34 + srcOff]) << 27) & 0x7ffffffffL);
    }

    public static void bitUnpack8LongLE36(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xfffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 5 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 6 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 7 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[ 8 + srcOff]) << 28) & 0xfffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 0) & 0xffL)
                | ((((long) src[10 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[11 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[12 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[13 + srcOff]) << 32) & 0xfffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[13 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[14 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[15 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[16 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[17 + srcOff]) << 28) & 0xfffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[18 + srcOff]) << 0) & 0xffL)
                | ((((long) src[19 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[20 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[21 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[22 + srcOff]) << 32) & 0xfffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[22 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[23 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[24 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[25 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[26 + srcOff]) << 28) & 0xfffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[27 + srcOff]) << 0) & 0xffL)
                | ((((long) src[28 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[29 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[30 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[31 + srcOff]) << 32) & 0xfffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[31 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[32 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[33 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[34 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[35 + srcOff]) << 28) & 0xfffffffffL);
    }

    public static void bitUnpack8LongLE37(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0x1fffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[ 5 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 6 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[ 7 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[ 8 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[ 9 + srcOff]) << 35) & 0x1fffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 9 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[10 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[11 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[12 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[13 + srcOff]) << 30) & 0x1fffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[13 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[14 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[15 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[16 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[17 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[18 + srcOff]) << 33) & 0x1fffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[18 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[19 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[20 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[21 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[22 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[23 + srcOff]) << 36) & 0x1fffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[23 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[24 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[25 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[26 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[27 + srcOff]) << 31) & 0x1fffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[27 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[28 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[29 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[30 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[31 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[32 + srcOff]) << 34) & 0x1fffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[32 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[33 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[34 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[35 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[36 + srcOff]) << 29) & 0x1fffffffffL);
    }

    public static void bitUnpack8LongLE38(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0x3fffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 5 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 6 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 7 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[ 8 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[ 9 + srcOff]) << 34) & 0x3fffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 9 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[10 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[11 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[12 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[13 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[14 + srcOff]) << 36) & 0x3fffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[14 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[15 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[16 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[17 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[18 + srcOff]) << 30) & 0x3fffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[19 + srcOff]) << 0) & 0xffL)
                | ((((long) src[20 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[21 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[22 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[23 + srcOff]) << 32) & 0x3fffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[23 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[24 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[25 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[26 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[27 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[28 + srcOff]) << 34) & 0x3fffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[28 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[29 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[30 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[31 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[32 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[33 + srcOff]) << 36) & 0x3fffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[33 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[34 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[35 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[36 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[37 + srcOff]) << 30) & 0x3fffffffffL);
    }

    public static void bitUnpack8LongLE39(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0x7fffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 4 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[ 5 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 6 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[ 7 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[ 8 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[ 9 + srcOff]) << 33) & 0x7fffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 9 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[10 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[11 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[12 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[13 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[14 + srcOff]) << 34) & 0x7fffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[14 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[15 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[16 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[17 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[18 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[19 + srcOff]) << 35) & 0x7fffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[19 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[20 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[21 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[22 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[23 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[24 + srcOff]) << 36) & 0x7fffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[24 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[25 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[26 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[27 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[28 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[29 + srcOff]) << 37) & 0x7fffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[29 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[30 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[31 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[32 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[33 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[34 + srcOff]) << 38) & 0x7fffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[34 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[35 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[36 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[37 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[38 + srcOff]) << 31) & 0x7fffffffffL);
    }

    public static void bitUnpack8LongLE40(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 6 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 7 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 8 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 9 + srcOff]) << 32) & 0xffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[10 + srcOff]) << 0) & 0xffL)
                | ((((long) src[11 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[12 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[13 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[14 + srcOff]) << 32) & 0xffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[15 + srcOff]) << 0) & 0xffL)
                | ((((long) src[16 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[17 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[18 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[19 + srcOff]) << 32) & 0xffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[20 + srcOff]) << 0) & 0xffL)
                | ((((long) src[21 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[22 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[23 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[24 + srcOff]) << 32) & 0xffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[25 + srcOff]) << 0) & 0xffL)
                | ((((long) src[26 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[27 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[28 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[29 + srcOff]) << 32) & 0xffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[30 + srcOff]) << 0) & 0xffL)
                | ((((long) src[31 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[32 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[33 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[34 + srcOff]) << 32) & 0xffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[35 + srcOff]) << 0) & 0xffL)
                | ((((long) src[36 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[37 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[38 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[39 + srcOff]) << 32) & 0xffffffffffL);
    }

    public static void bitUnpack8LongLE41(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0x1ffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 5 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[ 6 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[ 7 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[ 8 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[ 9 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[10 + srcOff]) << 39) & 0x1ffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[10 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[11 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[12 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[13 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[14 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[15 + srcOff]) << 38) & 0x1ffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[15 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[16 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[17 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[18 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[19 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[20 + srcOff]) << 37) & 0x1ffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[20 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[21 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[22 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[23 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[24 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[25 + srcOff]) << 36) & 0x1ffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[25 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[26 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[27 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[28 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[29 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[30 + srcOff]) << 35) & 0x1ffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[30 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[31 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[32 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[33 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[34 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[35 + srcOff]) << 34) & 0x1ffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[35 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[36 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[37 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[38 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[39 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[40 + srcOff]) << 33) & 0x1ffffffffffL);
    }

    public static void bitUnpack8LongLE42(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0x3ffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 5 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 6 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 7 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 8 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[ 9 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[10 + srcOff]) << 38) & 0x3ffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[10 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[11 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[12 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[13 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[14 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[15 + srcOff]) << 36) & 0x3ffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[15 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[16 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[17 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[18 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[19 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[20 + srcOff]) << 34) & 0x3ffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[21 + srcOff]) << 0) & 0xffL)
                | ((((long) src[22 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[23 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[24 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[25 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[26 + srcOff]) << 40) & 0x3ffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[26 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[27 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[28 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[29 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[30 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[31 + srcOff]) << 38) & 0x3ffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[31 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[32 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[33 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[34 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[35 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[36 + srcOff]) << 36) & 0x3ffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[36 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[37 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[38 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[39 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[40 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[41 + srcOff]) << 34) & 0x3ffffffffffL);
    }

    public static void bitUnpack8LongLE43(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0x7ffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 5 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[ 6 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[ 7 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[ 8 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[ 9 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[10 + srcOff]) << 37) & 0x7ffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[10 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[11 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[12 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[13 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[14 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[15 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[16 + srcOff]) << 42) & 0x7ffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[16 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[17 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[18 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[19 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[20 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[21 + srcOff]) << 39) & 0x7ffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[21 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[22 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[23 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[24 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[25 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[26 + srcOff]) << 36) & 0x7ffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[26 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[27 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[28 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[29 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[30 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[31 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[32 + srcOff]) << 41) & 0x7ffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[32 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[33 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[34 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[35 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[36 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[37 + srcOff]) << 38) & 0x7ffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[37 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[38 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[39 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[40 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[41 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[42 + srcOff]) << 35) & 0x7ffffffffffL);
    }

    public static void bitUnpack8LongLE44(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xfffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 5 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 6 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 7 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 8 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[ 9 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[10 + srcOff]) << 36) & 0xfffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[11 + srcOff]) << 0) & 0xffL)
                | ((((long) src[12 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[13 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[14 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[15 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[16 + srcOff]) << 40) & 0xfffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[16 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[17 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[18 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[19 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[20 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[21 + srcOff]) << 36) & 0xfffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[22 + srcOff]) << 0) & 0xffL)
                | ((((long) src[23 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[24 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[25 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[26 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[27 + srcOff]) << 40) & 0xfffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[27 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[28 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[29 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[30 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[31 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[32 + srcOff]) << 36) & 0xfffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[33 + srcOff]) << 0) & 0xffL)
                | ((((long) src[34 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[35 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[36 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[37 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[38 + srcOff]) << 40) & 0xfffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[38 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[39 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[40 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[41 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[42 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[43 + srcOff]) << 36) & 0xfffffffffffL);
    }

    public static void bitUnpack8LongLE45(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0x1fffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 5 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[ 6 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 7 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[ 8 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[ 9 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[10 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[11 + srcOff]) << 43) & 0x1fffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[11 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[12 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[13 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[14 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[15 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[16 + srcOff]) << 38) & 0x1fffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[16 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[17 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[18 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[19 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[20 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[21 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[22 + srcOff]) << 41) & 0x1fffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[22 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[23 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[24 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[25 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[26 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[27 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[28 + srcOff]) << 44) & 0x1fffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[28 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[29 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[30 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[31 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[32 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[33 + srcOff]) << 39) & 0x1fffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[33 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[34 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[35 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[36 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[37 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[38 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[39 + srcOff]) << 42) & 0x1fffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[39 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[40 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[41 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[42 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[43 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[44 + srcOff]) << 37) & 0x1fffffffffffL);
    }

    public static void bitUnpack8LongLE46(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0x3fffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 5 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 6 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 7 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 8 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[ 9 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[10 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[11 + srcOff]) << 42) & 0x3fffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[11 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[12 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[13 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[14 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[15 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[16 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[17 + srcOff]) << 44) & 0x3fffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[17 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[18 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[19 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[20 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[21 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[22 + srcOff]) << 38) & 0x3fffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[23 + srcOff]) << 0) & 0xffL)
                | ((((long) src[24 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[25 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[26 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[27 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[28 + srcOff]) << 40) & 0x3fffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[28 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[29 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[30 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[31 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[32 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[33 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[34 + srcOff]) << 42) & 0x3fffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[34 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[35 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[36 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[37 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[38 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[39 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[40 + srcOff]) << 44) & 0x3fffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[40 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[41 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[42 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[43 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[44 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[45 + srcOff]) << 38) & 0x3fffffffffffL);
    }

    public static void bitUnpack8LongLE47(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0x7fffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 5 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[ 6 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 7 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[ 8 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[ 9 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[10 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[11 + srcOff]) << 41) & 0x7fffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[11 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[12 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[13 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[14 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[15 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[16 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[17 + srcOff]) << 42) & 0x7fffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[17 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[18 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[19 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[20 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[21 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[22 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[23 + srcOff]) << 43) & 0x7fffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[23 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[24 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[25 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[26 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[27 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[28 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[29 + srcOff]) << 44) & 0x7fffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[29 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[30 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[31 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[32 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[33 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[34 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[35 + srcOff]) << 45) & 0x7fffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[35 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[36 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[37 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[38 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[39 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[40 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[41 + srcOff]) << 46) & 0x7fffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[41 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[42 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[43 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[44 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[45 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[46 + srcOff]) << 39) & 0x7fffffffffffL);
    }

    public static void bitUnpack8LongLE48(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 7 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 8 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 9 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[10 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[11 + srcOff]) << 40) & 0xffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[12 + srcOff]) << 0) & 0xffL)
                | ((((long) src[13 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[14 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[15 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[16 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[17 + srcOff]) << 40) & 0xffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[18 + srcOff]) << 0) & 0xffL)
                | ((((long) src[19 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[20 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[21 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[22 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[23 + srcOff]) << 40) & 0xffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[24 + srcOff]) << 0) & 0xffL)
                | ((((long) src[25 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[26 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[27 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[28 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[29 + srcOff]) << 40) & 0xffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[30 + srcOff]) << 0) & 0xffL)
                | ((((long) src[31 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[32 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[33 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[34 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[35 + srcOff]) << 40) & 0xffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[36 + srcOff]) << 0) & 0xffL)
                | ((((long) src[37 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[38 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[39 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[40 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[41 + srcOff]) << 40) & 0xffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[42 + srcOff]) << 0) & 0xffL)
                | ((((long) src[43 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[44 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[45 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[46 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[47 + srcOff]) << 40) & 0xffffffffffffL);
    }

    public static void bitUnpack8LongLE49(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 48) & 0x1ffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[ 7 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[ 8 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[ 9 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[10 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[11 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[12 + srcOff]) << 47) & 0x1ffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[12 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[13 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[14 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[15 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[16 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[17 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[18 + srcOff]) << 46) & 0x1ffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[18 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[19 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[20 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[21 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[22 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[23 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[24 + srcOff]) << 45) & 0x1ffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[24 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[25 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[26 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[27 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[28 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[29 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[30 + srcOff]) << 44) & 0x1ffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[30 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[31 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[32 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[33 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[34 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[35 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[36 + srcOff]) << 43) & 0x1ffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[36 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[37 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[38 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[39 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[40 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[41 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[42 + srcOff]) << 42) & 0x1ffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[42 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[43 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[44 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[45 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[46 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[47 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[48 + srcOff]) << 41) & 0x1ffffffffffffL);
    }

    public static void bitUnpack8LongLE50(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 48) & 0x3ffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 7 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 8 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 9 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[10 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[11 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[12 + srcOff]) << 46) & 0x3ffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[12 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[13 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[14 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[15 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[16 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[17 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[18 + srcOff]) << 44) & 0x3ffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[18 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[19 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[20 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[21 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[22 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[23 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[24 + srcOff]) << 42) & 0x3ffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[25 + srcOff]) << 0) & 0xffL)
                | ((((long) src[26 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[27 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[28 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[29 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[30 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[31 + srcOff]) << 48) & 0x3ffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[31 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[32 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[33 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[34 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[35 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[36 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[37 + srcOff]) << 46) & 0x3ffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[37 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[38 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[39 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[40 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[41 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[42 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[43 + srcOff]) << 44) & 0x3ffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[43 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[44 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[45 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[46 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[47 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[48 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[49 + srcOff]) << 42) & 0x3ffffffffffffL);
    }

    public static void bitUnpack8LongLE51(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 48) & 0x7ffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[ 7 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[ 8 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[ 9 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[10 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[11 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[12 + srcOff]) << 45) & 0x7ffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[12 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[13 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[14 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[15 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[16 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[17 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[18 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[19 + srcOff]) << 50) & 0x7ffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[19 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[20 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[21 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[22 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[23 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[24 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[25 + srcOff]) << 47) & 0x7ffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[25 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[26 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[27 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[28 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[29 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[30 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[31 + srcOff]) << 44) & 0x7ffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[31 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[32 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[33 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[34 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[35 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[36 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[37 + srcOff]) << 41) & 0x1ffffffffffffL)
                | ((((long) src[38 + srcOff]) << 49) & 0x7ffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[38 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[39 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[40 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[41 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[42 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[43 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[44 + srcOff]) << 46) & 0x7ffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[44 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[45 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[46 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[47 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[48 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[49 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[50 + srcOff]) << 43) & 0x7ffffffffffffL);
    }

    public static void bitUnpack8LongLE52(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 48) & 0xfffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 7 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 8 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 9 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[10 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[11 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[12 + srcOff]) << 44) & 0xfffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[13 + srcOff]) << 0) & 0xffL)
                | ((((long) src[14 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[15 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[16 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[17 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[18 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[19 + srcOff]) << 48) & 0xfffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[19 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[20 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[21 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[22 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[23 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[24 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[25 + srcOff]) << 44) & 0xfffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[26 + srcOff]) << 0) & 0xffL)
                | ((((long) src[27 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[28 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[29 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[30 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[31 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[32 + srcOff]) << 48) & 0xfffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[32 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[33 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[34 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[35 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[36 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[37 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[38 + srcOff]) << 44) & 0xfffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[39 + srcOff]) << 0) & 0xffL)
                | ((((long) src[40 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[41 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[42 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[43 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[44 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[45 + srcOff]) << 48) & 0xfffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[45 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[46 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[47 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[48 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[49 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[50 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[51 + srcOff]) << 44) & 0xfffffffffffffL);
    }

    public static void bitUnpack8LongLE53(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 48) & 0x1fffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[ 7 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 8 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[ 9 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[10 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[11 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[12 + srcOff]) << 43) & 0x7ffffffffffffL)
                | ((((long) src[13 + srcOff]) << 51) & 0x1fffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[13 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[14 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[15 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[16 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[17 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[18 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[19 + srcOff]) << 46) & 0x1fffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[19 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[20 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[21 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[22 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[23 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[24 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[25 + srcOff]) << 41) & 0x1ffffffffffffL)
                | ((((long) src[26 + srcOff]) << 49) & 0x1fffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[26 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[27 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[28 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[29 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[30 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[31 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[32 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[33 + srcOff]) << 52) & 0x1fffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[33 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[34 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[35 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[36 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[37 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[38 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[39 + srcOff]) << 47) & 0x1fffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[39 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[40 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[41 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[42 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[43 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[44 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[45 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[46 + srcOff]) << 50) & 0x1fffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[46 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[47 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[48 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[49 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[50 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[51 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[52 + srcOff]) << 45) & 0x1fffffffffffffL);
    }

    public static void bitUnpack8LongLE54(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 48) & 0x3fffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 7 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 8 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 9 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[10 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[11 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[12 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[13 + srcOff]) << 50) & 0x3fffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[13 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[14 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[15 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[16 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[17 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[18 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[19 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[20 + srcOff]) << 52) & 0x3fffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[20 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[21 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[22 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[23 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[24 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[25 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[26 + srcOff]) << 46) & 0x3fffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[27 + srcOff]) << 0) & 0xffL)
                | ((((long) src[28 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[29 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[30 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[31 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[32 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[33 + srcOff]) << 48) & 0x3fffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[33 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[34 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[35 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[36 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[37 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[38 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[39 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[40 + srcOff]) << 50) & 0x3fffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[40 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[41 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[42 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[43 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[44 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[45 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[46 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[47 + srcOff]) << 52) & 0x3fffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[47 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[48 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[49 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[50 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[51 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[52 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[53 + srcOff]) << 46) & 0x3fffffffffffffL);
    }

    public static void bitUnpack8LongLE55(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 48) & 0x7fffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 6 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[ 7 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 8 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[ 9 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[10 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[11 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[12 + srcOff]) << 41) & 0x1ffffffffffffL)
                | ((((long) src[13 + srcOff]) << 49) & 0x7fffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[13 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[14 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[15 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[16 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[17 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[18 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[19 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[20 + srcOff]) << 50) & 0x7fffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[20 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[21 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[22 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[23 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[24 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[25 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[26 + srcOff]) << 43) & 0x7ffffffffffffL)
                | ((((long) src[27 + srcOff]) << 51) & 0x7fffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[27 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[28 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[29 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[30 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[31 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[32 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[33 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[34 + srcOff]) << 52) & 0x7fffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[34 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[35 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[36 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[37 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[38 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[39 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[40 + srcOff]) << 45) & 0x1fffffffffffffL)
                | ((((long) src[41 + srcOff]) << 53) & 0x7fffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[41 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[42 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[43 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[44 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[45 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[46 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[47 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[48 + srcOff]) << 54) & 0x7fffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[48 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[49 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[50 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[51 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[52 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[53 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[54 + srcOff]) << 47) & 0x7fffffffffffffL);
    }

    public static void bitUnpack8LongLE56(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 48) & 0xffffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 8 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 9 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[10 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[11 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[12 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[13 + srcOff]) << 48) & 0xffffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[14 + srcOff]) << 0) & 0xffL)
                | ((((long) src[15 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[16 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[17 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[18 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[19 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[20 + srcOff]) << 48) & 0xffffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[21 + srcOff]) << 0) & 0xffL)
                | ((((long) src[22 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[23 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[24 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[25 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[26 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[27 + srcOff]) << 48) & 0xffffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[28 + srcOff]) << 0) & 0xffL)
                | ((((long) src[29 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[30 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[31 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[32 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[33 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[34 + srcOff]) << 48) & 0xffffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[35 + srcOff]) << 0) & 0xffL)
                | ((((long) src[36 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[37 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[38 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[39 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[40 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[41 + srcOff]) << 48) & 0xffffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[42 + srcOff]) << 0) & 0xffL)
                | ((((long) src[43 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[44 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[45 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[46 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[47 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[48 + srcOff]) << 48) & 0xffffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[49 + srcOff]) << 0) & 0xffL)
                | ((((long) src[50 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[51 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[52 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[53 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[54 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[55 + srcOff]) << 48) & 0xffffffffffffffL);
    }

    public static void bitUnpack8LongLE57(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 56) & 0x1ffffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[ 8 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[ 9 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[10 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[11 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[12 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[13 + srcOff]) << 47) & 0x7fffffffffffffL)
                | ((((long) src[14 + srcOff]) << 55) & 0x1ffffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[14 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[15 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[16 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[17 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[18 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[19 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[20 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[21 + srcOff]) << 54) & 0x1ffffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[21 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[22 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[23 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[24 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[25 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[26 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[27 + srcOff]) << 45) & 0x1fffffffffffffL)
                | ((((long) src[28 + srcOff]) << 53) & 0x1ffffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[28 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[29 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[30 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[31 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[32 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[33 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[34 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[35 + srcOff]) << 52) & 0x1ffffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[35 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[36 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[37 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[38 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[39 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[40 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[41 + srcOff]) << 43) & 0x7ffffffffffffL)
                | ((((long) src[42 + srcOff]) << 51) & 0x1ffffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[42 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[43 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[44 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[45 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[46 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[47 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[48 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[49 + srcOff]) << 50) & 0x1ffffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[49 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[50 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[51 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[52 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[53 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[54 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[55 + srcOff]) << 41) & 0x1ffffffffffffL)
                | ((((long) src[56 + srcOff]) << 49) & 0x1ffffffffffffffL);
    }

    public static void bitUnpack8LongLE58(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 56) & 0x3ffffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[ 8 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 9 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[10 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[11 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[12 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[13 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[14 + srcOff]) << 54) & 0x3ffffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[14 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[15 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[16 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[17 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[18 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[19 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[20 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[21 + srcOff]) << 52) & 0x3ffffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[21 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[22 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[23 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[24 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[25 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[26 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[27 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[28 + srcOff]) << 50) & 0x3ffffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[29 + srcOff]) << 0) & 0xffL)
                | ((((long) src[30 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[31 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[32 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[33 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[34 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[35 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[36 + srcOff]) << 56) & 0x3ffffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[36 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[37 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[38 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[39 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[40 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[41 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[42 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[43 + srcOff]) << 54) & 0x3ffffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[43 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[44 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[45 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[46 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[47 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[48 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[49 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[50 + srcOff]) << 52) & 0x3ffffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[50 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[51 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[52 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[53 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[54 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[55 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[56 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[57 + srcOff]) << 50) & 0x3ffffffffffffffL);
    }

    public static void bitUnpack8LongLE59(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 56) & 0x7ffffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[ 8 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[ 9 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[10 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[11 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[12 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[13 + srcOff]) << 45) & 0x1fffffffffffffL)
                | ((((long) src[14 + srcOff]) << 53) & 0x7ffffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[14 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[15 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[16 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[17 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[18 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[19 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[20 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[21 + srcOff]) << 50) & 0x3ffffffffffffffL)
                | ((((long) src[22 + srcOff]) << 58) & 0x7ffffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[22 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[23 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[24 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[25 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[26 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[27 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[28 + srcOff]) << 47) & 0x7fffffffffffffL)
                | ((((long) src[29 + srcOff]) << 55) & 0x7ffffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[29 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[30 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[31 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[32 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[33 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[34 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[35 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[36 + srcOff]) << 52) & 0x7ffffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[36 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[37 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[38 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[39 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[40 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[41 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[42 + srcOff]) << 41) & 0x1ffffffffffffL)
                | ((((long) src[43 + srcOff]) << 49) & 0x1ffffffffffffffL)
                | ((((long) src[44 + srcOff]) << 57) & 0x7ffffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[44 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[45 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[46 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[47 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[48 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[49 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[50 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[51 + srcOff]) << 54) & 0x7ffffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[51 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[52 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[53 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[54 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[55 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[56 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[57 + srcOff]) << 43) & 0x7ffffffffffffL)
                | ((((long) src[58 + srcOff]) << 51) & 0x7ffffffffffffffL);
    }

    public static void bitUnpack8LongLE60(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 56) & 0xfffffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[ 8 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 9 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[10 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[11 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[12 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[13 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[14 + srcOff]) << 52) & 0xfffffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[15 + srcOff]) << 0) & 0xffL)
                | ((((long) src[16 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[17 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[18 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[19 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[20 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[21 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[22 + srcOff]) << 56) & 0xfffffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[22 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[23 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[24 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[25 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[26 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[27 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[28 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[29 + srcOff]) << 52) & 0xfffffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[30 + srcOff]) << 0) & 0xffL)
                | ((((long) src[31 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[32 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[33 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[34 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[35 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[36 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[37 + srcOff]) << 56) & 0xfffffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[37 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[38 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[39 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[40 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[41 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[42 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[43 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[44 + srcOff]) << 52) & 0xfffffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[45 + srcOff]) << 0) & 0xffL)
                | ((((long) src[46 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[47 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[48 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[49 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[50 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[51 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[52 + srcOff]) << 56) & 0xfffffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[52 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[53 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[54 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[55 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[56 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[57 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[58 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[59 + srcOff]) << 52) & 0xfffffffffffffffL);
    }

    public static void bitUnpack8LongLE61(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 56) & 0x1fffffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[ 8 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 9 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[10 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[11 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[12 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[13 + srcOff]) << 43) & 0x7ffffffffffffL)
                | ((((long) src[14 + srcOff]) << 51) & 0x7ffffffffffffffL)
                | ((((long) src[15 + srcOff]) << 59) & 0x1fffffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[15 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[16 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[17 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[18 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[19 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[20 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[21 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[22 + srcOff]) << 54) & 0x1fffffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[22 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[23 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[24 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[25 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[26 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[27 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[28 + srcOff]) << 41) & 0x1ffffffffffffL)
                | ((((long) src[29 + srcOff]) << 49) & 0x1ffffffffffffffL)
                | ((((long) src[30 + srcOff]) << 57) & 0x1fffffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[30 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[31 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[32 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[33 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[34 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[35 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[36 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[37 + srcOff]) << 52) & 0xfffffffffffffffL)
                | ((((long) src[38 + srcOff]) << 60) & 0x1fffffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[38 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[39 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[40 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[41 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[42 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[43 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[44 + srcOff]) << 47) & 0x7fffffffffffffL)
                | ((((long) src[45 + srcOff]) << 55) & 0x1fffffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[45 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[46 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[47 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[48 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[49 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[50 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[51 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[52 + srcOff]) << 50) & 0x3ffffffffffffffL)
                | ((((long) src[53 + srcOff]) << 58) & 0x1fffffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[53 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[54 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[55 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[56 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[57 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[58 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[59 + srcOff]) << 45) & 0x1fffffffffffffL)
                | ((((long) src[60 + srcOff]) << 53) & 0x1fffffffffffffffL);
    }

    public static void bitUnpack8LongLE62(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 56) & 0x3fffffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[ 8 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 9 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[10 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[11 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[12 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[13 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[14 + srcOff]) << 50) & 0x3ffffffffffffffL)
                | ((((long) src[15 + srcOff]) << 58) & 0x3fffffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[15 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[16 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[17 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[18 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[19 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[20 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[21 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[22 + srcOff]) << 52) & 0xfffffffffffffffL)
                | ((((long) src[23 + srcOff]) << 60) & 0x3fffffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[23 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[24 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[25 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[26 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[27 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[28 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[29 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[30 + srcOff]) << 54) & 0x3fffffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[31 + srcOff]) << 0) & 0xffL)
                | ((((long) src[32 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[33 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[34 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[35 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[36 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[37 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[38 + srcOff]) << 56) & 0x3fffffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[38 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[39 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[40 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[41 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[42 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[43 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[44 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[45 + srcOff]) << 50) & 0x3ffffffffffffffL)
                | ((((long) src[46 + srcOff]) << 58) & 0x3fffffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[46 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[47 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[48 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[49 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[50 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[51 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[52 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[53 + srcOff]) << 52) & 0xfffffffffffffffL)
                | ((((long) src[54 + srcOff]) << 60) & 0x3fffffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[54 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[55 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[56 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[57 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[58 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[59 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[60 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[61 + srcOff]) << 54) & 0x3fffffffffffffffL);
    }

    public static void bitUnpack8LongLE63(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 56) & 0x7fffffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 7 + srcOff]) >> 7) & 0x1L)
                | ((((long) src[ 8 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 9 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[10 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[11 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[12 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[13 + srcOff]) << 41) & 0x1ffffffffffffL)
                | ((((long) src[14 + srcOff]) << 49) & 0x1ffffffffffffffL)
                | ((((long) src[15 + srcOff]) << 57) & 0x7fffffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src[15 + srcOff]) >> 6) & 0x3L)
                | ((((long) src[16 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[17 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[18 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[19 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[20 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[21 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[22 + srcOff]) << 50) & 0x3ffffffffffffffL)
                | ((((long) src[23 + srcOff]) << 58) & 0x7fffffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src[23 + srcOff]) >> 5) & 0x7L)
                | ((((long) src[24 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[25 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[26 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[27 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[28 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[29 + srcOff]) << 43) & 0x7ffffffffffffL)
                | ((((long) src[30 + srcOff]) << 51) & 0x7ffffffffffffffL)
                | ((((long) src[31 + srcOff]) << 59) & 0x7fffffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src[31 + srcOff]) >> 4) & 0xfL)
                | ((((long) src[32 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[33 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[34 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[35 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[36 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[37 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[38 + srcOff]) << 52) & 0xfffffffffffffffL)
                | ((((long) src[39 + srcOff]) << 60) & 0x7fffffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src[39 + srcOff]) >> 3) & 0x1fL)
                | ((((long) src[40 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[41 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[42 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[43 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[44 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[45 + srcOff]) << 45) & 0x1fffffffffffffL)
                | ((((long) src[46 + srcOff]) << 53) & 0x1fffffffffffffffL)
                | ((((long) src[47 + srcOff]) << 61) & 0x7fffffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src[47 + srcOff]) >> 2) & 0x3fL)
                | ((((long) src[48 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[49 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[50 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[51 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[52 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[53 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[54 + srcOff]) << 54) & 0x3fffffffffffffffL)
                | ((((long) src[55 + srcOff]) << 62) & 0x7fffffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src[55 + srcOff]) >> 1) & 0x7fL)
                | ((((long) src[56 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[57 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[58 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[59 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[60 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[61 + srcOff]) << 47) & 0x7fffffffffffffL)
                | ((((long) src[62 + srcOff]) << 55) & 0x7fffffffffffffffL);
    }

    public static void bitUnpack8LongLE64(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 5 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 56) & -1L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 8 + srcOff]) << 0) & 0xffL)
                | ((((long) src[ 9 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[10 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[11 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[12 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[13 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[14 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[15 + srcOff]) << 56) & -1L);
        dst[ 2 + dstOff] =
                  ((((long) src[16 + srcOff]) << 0) & 0xffL)
                | ((((long) src[17 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[18 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[19 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[20 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[21 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[22 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[23 + srcOff]) << 56) & -1L);
        dst[ 3 + dstOff] =
                  ((((long) src[24 + srcOff]) << 0) & 0xffL)
                | ((((long) src[25 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[26 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[27 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[28 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[29 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[30 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[31 + srcOff]) << 56) & -1L);
        dst[ 4 + dstOff] =
                  ((((long) src[32 + srcOff]) << 0) & 0xffL)
                | ((((long) src[33 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[34 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[35 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[36 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[37 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[38 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[39 + srcOff]) << 56) & -1L);
        dst[ 5 + dstOff] =
                  ((((long) src[40 + srcOff]) << 0) & 0xffL)
                | ((((long) src[41 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[42 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[43 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[44 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[45 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[46 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[47 + srcOff]) << 56) & -1L);
        dst[ 6 + dstOff] =
                  ((((long) src[48 + srcOff]) << 0) & 0xffL)
                | ((((long) src[49 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[50 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[51 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[52 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[53 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[54 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[55 + srcOff]) << 56) & -1L);
        dst[ 7 + dstOff] =
                  ((((long) src[56 + srcOff]) << 0) & 0xffL)
                | ((((long) src[57 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[58 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[59 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[60 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[61 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[62 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[63 + srcOff]) << 56) & -1L);
    }

    public static void unpack(IntToLongFunction src, int srcOff, long[] dst, int dstOff, int bits)
    {
        switch (bits) {
        case 0:
            // do nothing
            break;
        case 1:
            bitUnpack8LongLE1(src, srcOff, dst, dstOff);
            break;
        case 2:
            bitUnpack8LongLE2(src, srcOff, dst, dstOff);
            break;
        case 3:
            bitUnpack8LongLE3(src, srcOff, dst, dstOff);
            break;
        case 4:
            bitUnpack8LongLE4(src, srcOff, dst, dstOff);
            break;
        case 5:
            bitUnpack8LongLE5(src, srcOff, dst, dstOff);
            break;
        case 6:
            bitUnpack8LongLE6(src, srcOff, dst, dstOff);
            break;
        case 7:
            bitUnpack8LongLE7(src, srcOff, dst, dstOff);
            break;
        case 8:
            bitUnpack8LongLE8(src, srcOff, dst, dstOff);
            break;
        case 9:
            bitUnpack8LongLE9(src, srcOff, dst, dstOff);
            break;
        case 10:
            bitUnpack8LongLE10(src, srcOff, dst, dstOff);
            break;
        case 11:
            bitUnpack8LongLE11(src, srcOff, dst, dstOff);
            break;
        case 12:
            bitUnpack8LongLE12(src, srcOff, dst, dstOff);
            break;
        case 13:
            bitUnpack8LongLE13(src, srcOff, dst, dstOff);
            break;
        case 14:
            bitUnpack8LongLE14(src, srcOff, dst, dstOff);
            break;
        case 15:
            bitUnpack8LongLE15(src, srcOff, dst, dstOff);
            break;
        case 16:
            bitUnpack8LongLE16(src, srcOff, dst, dstOff);
            break;
        case 17:
            bitUnpack8LongLE17(src, srcOff, dst, dstOff);
            break;
        case 18:
            bitUnpack8LongLE18(src, srcOff, dst, dstOff);
            break;
        case 19:
            bitUnpack8LongLE19(src, srcOff, dst, dstOff);
            break;
        case 20:
            bitUnpack8LongLE20(src, srcOff, dst, dstOff);
            break;
        case 21:
            bitUnpack8LongLE21(src, srcOff, dst, dstOff);
            break;
        case 22:
            bitUnpack8LongLE22(src, srcOff, dst, dstOff);
            break;
        case 23:
            bitUnpack8LongLE23(src, srcOff, dst, dstOff);
            break;
        case 24:
            bitUnpack8LongLE24(src, srcOff, dst, dstOff);
            break;
        case 25:
            bitUnpack8LongLE25(src, srcOff, dst, dstOff);
            break;
        case 26:
            bitUnpack8LongLE26(src, srcOff, dst, dstOff);
            break;
        case 27:
            bitUnpack8LongLE27(src, srcOff, dst, dstOff);
            break;
        case 28:
            bitUnpack8LongLE28(src, srcOff, dst, dstOff);
            break;
        case 29:
            bitUnpack8LongLE29(src, srcOff, dst, dstOff);
            break;
        case 30:
            bitUnpack8LongLE30(src, srcOff, dst, dstOff);
            break;
        case 31:
            bitUnpack8LongLE31(src, srcOff, dst, dstOff);
            break;
        case 32:
            bitUnpack8LongLE32(src, srcOff, dst, dstOff);
            break;
        case 33:
            bitUnpack8LongLE33(src, srcOff, dst, dstOff);
            break;
        case 34:
            bitUnpack8LongLE34(src, srcOff, dst, dstOff);
            break;
        case 35:
            bitUnpack8LongLE35(src, srcOff, dst, dstOff);
            break;
        case 36:
            bitUnpack8LongLE36(src, srcOff, dst, dstOff);
            break;
        case 37:
            bitUnpack8LongLE37(src, srcOff, dst, dstOff);
            break;
        case 38:
            bitUnpack8LongLE38(src, srcOff, dst, dstOff);
            break;
        case 39:
            bitUnpack8LongLE39(src, srcOff, dst, dstOff);
            break;
        case 40:
            bitUnpack8LongLE40(src, srcOff, dst, dstOff);
            break;
        case 41:
            bitUnpack8LongLE41(src, srcOff, dst, dstOff);
            break;
        case 42:
            bitUnpack8LongLE42(src, srcOff, dst, dstOff);
            break;
        case 43:
            bitUnpack8LongLE43(src, srcOff, dst, dstOff);
            break;
        case 44:
            bitUnpack8LongLE44(src, srcOff, dst, dstOff);
            break;
        case 45:
            bitUnpack8LongLE45(src, srcOff, dst, dstOff);
            break;
        case 46:
            bitUnpack8LongLE46(src, srcOff, dst, dstOff);
            break;
        case 47:
            bitUnpack8LongLE47(src, srcOff, dst, dstOff);
            break;
        case 48:
            bitUnpack8LongLE48(src, srcOff, dst, dstOff);
            break;
        case 49:
            bitUnpack8LongLE49(src, srcOff, dst, dstOff);
            break;
        case 50:
            bitUnpack8LongLE50(src, srcOff, dst, dstOff);
            break;
        case 51:
            bitUnpack8LongLE51(src, srcOff, dst, dstOff);
            break;
        case 52:
            bitUnpack8LongLE52(src, srcOff, dst, dstOff);
            break;
        case 53:
            bitUnpack8LongLE53(src, srcOff, dst, dstOff);
            break;
        case 54:
            bitUnpack8LongLE54(src, srcOff, dst, dstOff);
            break;
        case 55:
            bitUnpack8LongLE55(src, srcOff, dst, dstOff);
            break;
        case 56:
            bitUnpack8LongLE56(src, srcOff, dst, dstOff);
            break;
        case 57:
            bitUnpack8LongLE57(src, srcOff, dst, dstOff);
            break;
        case 58:
            bitUnpack8LongLE58(src, srcOff, dst, dstOff);
            break;
        case 59:
            bitUnpack8LongLE59(src, srcOff, dst, dstOff);
            break;
        case 60:
            bitUnpack8LongLE60(src, srcOff, dst, dstOff);
            break;
        case 61:
            bitUnpack8LongLE61(src, srcOff, dst, dstOff);
            break;
        case 62:
            bitUnpack8LongLE62(src, srcOff, dst, dstOff);
            break;
        case 63:
            bitUnpack8LongLE63(src, srcOff, dst, dstOff);
            break;
        case 64:
            bitUnpack8LongLE64(src, srcOff, dst, dstOff);
            break;
        default:
            throw new IllegalArgumentException("Bit width must be from 0 to 64 but got " + bits);
        }
    }

    public static void bitUnpack8LongLE1(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0x1L);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) >> 1) & 0x1L);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) >> 2) & 0x1L);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) >> 3) & 0x1L);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) >> 4) & 0x1L);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) >> 5) & 0x1L);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) >> 6) & 0x1L);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) >> 7) & 0x1L);
    }

    public static void bitUnpack8LongLE2(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0x3L);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) >> 2) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) >> 4) & 0x3L);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) >> 6) & 0x3L);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) << 0) & 0x3L);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 2) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 4) & 0x3L);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 6) & 0x3L);
    }

    public static void bitUnpack8LongLE3(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0x7L);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) >> 3) & 0x7L);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 2) & 0x7L);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 1) & 0x7L);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 4) & 0x7L);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 1) & 0x7L);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) >> 2) & 0x7L);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) >> 5) & 0x7L);
    }

    public static void bitUnpack8LongLE4(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xfL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) << 0) & 0xfL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) << 0) & 0xfL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) << 0) & 0xfL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 4) & 0xfL);
    }

    public static void bitUnpack8LongLE5(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0x1fL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 3) & 0x1fL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 2) & 0x1fL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 1) & 0x1fL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 4) & 0x1fL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 1) & 0x1fL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 2) & 0x1fL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 3) & 0x1fL);
    }

    public static void bitUnpack8LongLE6(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0x3fL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 4) & 0x3fL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) >> 2) & 0x3fL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) << 0) & 0x3fL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 2) & 0x3fL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 4) & 0x3fL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) >> 2) & 0x3fL);
    }

    public static void bitUnpack8LongLE7(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0x7fL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 1) & 0x7fL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 2) & 0x7fL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 3) & 0x7fL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 4) & 0x7fL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 5) & 0x7fL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 6) & 0x7fL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 1) & 0x7fL);
    }

    public static void bitUnpack8LongLE8(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) << 0) & 0xffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) << 0) & 0xffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) << 0) & 0xffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) << 0) & 0xffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) << 0) & 0xffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) << 0) & 0xffL);
    }

    public static void bitUnpack8LongLE9(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0x1ffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 7) & 0x1ffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 6) & 0x1ffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 5) & 0x1ffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 4) & 0x1ffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 3) & 0x1ffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 2) & 0x1ffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 1) & 0x1ffL);
    }

    public static void bitUnpack8LongLE10(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0x3ffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 6) & 0x3ffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 4) & 0x3ffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 2) & 0x3ffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 8) & 0x3ffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 6) & 0x3ffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 4) & 0x3ffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong( 8 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 2) & 0x3ffL);
    }

    public static void bitUnpack8LongLE11(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0x7ffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 5) & 0x7ffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 10) & 0x7ffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 7) & 0x7ffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 4) & 0x7ffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 9) & 0x7ffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong( 8 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 6) & 0x7ffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong( 9 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(10 + srcOff)) << 3) & 0x7ffL);
    }

    public static void bitUnpack8LongLE12(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xfffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 4) & 0xfffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 8) & 0xfffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 4) & 0xfffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 8) & 0xfffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 4) & 0xfffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong( 9 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 8) & 0xfffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(10 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 4) & 0xfffL);
    }

    public static void bitUnpack8LongLE13(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0x1fffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 11) & 0x1fffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 6) & 0x1fffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 9) & 0x1fffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 12) & 0x1fffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong( 8 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 7) & 0x1fffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong( 9 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(10 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 10) & 0x1fffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(11 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 5) & 0x1fffL);
    }

    public static void bitUnpack8LongLE14(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0x3fffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 10) & 0x3fffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 12) & 0x3fffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 6) & 0x3fffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 8) & 0x3fffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong( 8 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 10) & 0x3fffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(10 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 12) & 0x3fffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(12 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 6) & 0x3fffL);
    }

    public static void bitUnpack8LongLE15(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0x7fffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 1 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 9) & 0x7fffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 10) & 0x7fffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 11) & 0x7fffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 12) & 0x7fffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong( 9 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 13) & 0x7fffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(11 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 14) & 0x7fffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(13 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 7) & 0x7fffL);
    }

    public static void bitUnpack8LongLE16(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 8) & 0xffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 8) & 0xffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 8) & 0xffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 8 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 8) & 0xffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(10 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 8) & 0xffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(12 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 8) & 0xffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(14 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 8) & 0xffffL);
    }

    public static void bitUnpack8LongLE17(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0x1ffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 15) & 0x1ffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 14) & 0x1ffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 13) & 0x1ffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 8 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 12) & 0x1ffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(10 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(11 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 11) & 0x1ffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(12 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(13 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 10) & 0x1ffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(14 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(15 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 9) & 0x1ffffL);
    }

    public static void bitUnpack8LongLE18(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0x3ffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 14) & 0x3ffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 12) & 0x3ffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 10) & 0x3ffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 9 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 16) & 0x3ffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(11 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 14) & 0x3ffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(13 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 12) & 0x3ffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(15 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(16 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 10) & 0x3ffffL);
    }

    public static void bitUnpack8LongLE19(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0x7ffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 13) & 0x7ffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 18) & 0x7ffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 15) & 0x7ffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong( 9 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 12) & 0x7ffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(11 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(12 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 17) & 0x7ffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(14 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 14) & 0x7ffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(16 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(17 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 11) & 0x7ffffL);
    }

    public static void bitUnpack8LongLE20(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xfffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 12) & 0xfffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 16) & 0xfffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 12) & 0xfffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(10 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 16) & 0xfffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(12 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 12) & 0xfffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(15 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 16) & 0xfffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(17 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 12) & 0xfffffL);
    }

    public static void bitUnpack8LongLE21(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0x1fffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 19) & 0x1fffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 14) & 0x1fffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 17) & 0x1fffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(10 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 20) & 0x1fffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(13 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 15) & 0x1fffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(15 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(16 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 18) & 0x1fffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(18 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 13) & 0x1fffffL);
    }

    public static void bitUnpack8LongLE22(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0x3fffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 18) & 0x3fffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 20) & 0x3fffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 8 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 14) & 0x3fffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(11 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 16) & 0x3fffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(13 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(14 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 18) & 0x3fffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(16 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 20) & 0x3fffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(19 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 14) & 0x3fffffL);
    }

    public static void bitUnpack8LongLE23(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0x7fffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 2 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 17) & 0x7fffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 18) & 0x7fffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 8 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 19) & 0x7fffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(11 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 20) & 0x7fffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(14 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 21) & 0x7fffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(17 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 22) & 0x7fffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(20 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 15) & 0x7fffffL);
    }

    public static void bitUnpack8LongLE24(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 16) & 0xffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 16) & 0xffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 9 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 16) & 0xffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(12 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 16) & 0xffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(15 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 16) & 0xffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(18 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 16) & 0xffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(21 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 16) & 0xffffffL);
    }

    public static void bitUnpack8LongLE25(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0x1ffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 23) & 0x1ffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 22) & 0x1ffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 9 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 21) & 0x1ffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(12 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 20) & 0x1ffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(15 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(16 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 19) & 0x1ffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(18 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(19 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 18) & 0x1ffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(21 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(22 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 17) & 0x1ffffffL);
    }

    public static void bitUnpack8LongLE26(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0x3ffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 22) & 0x3ffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 20) & 0x3ffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong( 9 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(10 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 18) & 0x3ffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(13 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 24) & 0x3ffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(16 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 22) & 0x3ffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(19 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 20) & 0x3ffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(22 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(23 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 18) & 0x3ffffffL);
    }

    public static void bitUnpack8LongLE27(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0x7ffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 21) & 0x7ffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 26) & 0x7ffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(10 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 23) & 0x7ffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(13 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 20) & 0x7ffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(16 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(17 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 25) & 0x7ffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(20 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 22) & 0x7ffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(23 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(24 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 19) & 0x7ffffffL);
    }

    public static void bitUnpack8LongLE28(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xfffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 20) & 0xfffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 24) & 0xfffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(10 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 20) & 0xfffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(14 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 24) & 0xfffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(17 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 20) & 0xfffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(21 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 24) & 0xfffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(24 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 20) & 0xfffffffL);
    }

    public static void bitUnpack8LongLE29(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0x1fffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 27) & 0x1fffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 22) & 0x1fffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(10 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(11 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 25) & 0x1fffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(14 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 28) & 0x1fffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(18 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 23) & 0x1fffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(21 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(22 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 26) & 0x1fffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(25 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 21) & 0x1fffffffL);
    }

    public static void bitUnpack8LongLE30(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0x3fffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 26) & 0x3fffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 28) & 0x3fffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(11 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 22) & 0x3fffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(15 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 24) & 0x3fffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(18 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(19 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 26) & 0x3fffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(22 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 28) & 0x3fffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(26 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 22) & 0x3fffffffL);
    }

    public static void bitUnpack8LongLE31(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0x7fffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 3 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 25) & 0x7fffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 26) & 0x7fffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(11 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(12 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 27) & 0x7fffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(15 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 28) & 0x7fffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(19 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 29) & 0x7fffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(23 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 30) & 0x7fffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(27 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 23) & 0x7fffffffL);
    }

    public static void bitUnpack8LongLE32(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 24) & 0xffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 8 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 24) & 0xffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(12 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 24) & 0xffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(16 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 24) & 0xffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(20 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 24) & 0xffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(24 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 24) & 0xffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(28 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 24) & 0xffffffffL);
    }

    public static void bitUnpack8LongLE33(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0x1ffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 23) & 0x7fffffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 31) & 0x1ffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 8 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 30) & 0x1ffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(12 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 29) & 0x1ffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(16 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 28) & 0x1ffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(20 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(21 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 27) & 0x1ffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(24 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(25 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 26) & 0x1ffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(28 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(29 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 25) & 0x1ffffffffL);
    }

    public static void bitUnpack8LongLE34(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0x3ffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 30) & 0x3ffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 8 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 28) & 0x3ffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(12 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(13 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 26) & 0x3ffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(17 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 32) & 0x3ffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(21 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 30) & 0x3ffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(25 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 28) & 0x3ffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(29 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(30 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 26) & 0x3ffffffffL);
    }

    public static void bitUnpack8LongLE35(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0x7ffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 29) & 0x7ffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 8 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 34) & 0x7ffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(13 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 23) & 0x7fffffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 31) & 0x7ffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(17 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 28) & 0x7ffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(21 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(22 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 25) & 0x1ffffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 33) & 0x7ffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(26 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 30) & 0x7ffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(30 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(31 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 27) & 0x7ffffffffL);
    }

    public static void bitUnpack8LongLE36(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xfffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 28) & 0xfffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 9 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 32) & 0xfffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(13 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 28) & 0xfffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(18 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 32) & 0xfffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(22 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 28) & 0xfffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(27 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 32) & 0xfffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(31 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 28) & 0xfffffffffL);
    }

    public static void bitUnpack8LongLE37(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0x1fffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 27) & 0x7ffffffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 35) & 0x1fffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 9 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 30) & 0x1fffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(13 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(14 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 25) & 0x1ffffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 33) & 0x1fffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(18 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 36) & 0x1fffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(23 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 23) & 0x7fffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 31) & 0x1fffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(27 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(28 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 34) & 0x1fffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(32 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 29) & 0x1fffffffffL);
    }

    public static void bitUnpack8LongLE38(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0x3fffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 34) & 0x3fffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 9 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 36) & 0x3fffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(14 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 30) & 0x3fffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(19 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 32) & 0x3fffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(23 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(24 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 34) & 0x3fffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(28 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 36) & 0x3fffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(33 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 30) & 0x3fffffffffL);
    }

    public static void bitUnpack8LongLE39(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0x7fffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 4 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 25) & 0x1ffffffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 33) & 0x7fffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong( 9 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(10 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 34) & 0x7fffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(14 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(15 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 27) & 0x7ffffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 35) & 0x7fffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(19 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 36) & 0x7fffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(24 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 29) & 0x1fffffffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 37) & 0x7fffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(29 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 38) & 0x7fffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(34 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 23) & 0x7fffffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 31) & 0x7fffffffffL);
    }

    public static void bitUnpack8LongLE40(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 32) & 0xffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(10 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 32) & 0xffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(15 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 32) & 0xffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(20 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 32) & 0xffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(25 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 32) & 0xffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(30 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 32) & 0xffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(35 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 32) & 0xffffffffffL);
    }

    public static void bitUnpack8LongLE41(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0x1ffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 23) & 0x7fffffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 31) & 0x7fffffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 39) & 0x1ffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(10 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 38) & 0x1ffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(15 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 29) & 0x1fffffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 37) & 0x1ffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(20 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 36) & 0x1ffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(25 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(26 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 27) & 0x7ffffffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 35) & 0x1ffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(30 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(31 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 34) & 0x1ffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(35 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(36 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 25) & 0x1ffffffffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 33) & 0x1ffffffffffL);
    }

    public static void bitUnpack8LongLE42(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0x3ffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 38) & 0x3ffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(10 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 36) & 0x3ffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(15 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(16 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 34) & 0x3ffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(21 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 40) & 0x3ffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(26 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 38) & 0x3ffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(31 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 36) & 0x3ffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(36 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(37 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 34) & 0x3ffffffffffL);
    }

    public static void bitUnpack8LongLE43(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0x7ffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 29) & 0x1fffffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 37) & 0x7ffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(10 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(11 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 42) & 0x7ffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(16 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 23) & 0x7fffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 31) & 0x7fffffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 39) & 0x7ffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(21 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 36) & 0x7ffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(26 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(27 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 25) & 0x1ffffffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 33) & 0x1ffffffffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 41) & 0x7ffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(32 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 38) & 0x7ffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(37 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(38 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 27) & 0x7ffffffffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 35) & 0x7ffffffffffL);
    }

    public static void bitUnpack8LongLE44(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xfffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 36) & 0xfffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(11 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 40) & 0xfffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(16 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 36) & 0xfffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(22 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 40) & 0xfffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(27 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 36) & 0xfffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(33 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 40) & 0xfffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(38 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 36) & 0xfffffffffffL);
    }

    public static void bitUnpack8LongLE45(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0x1fffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 27) & 0x7ffffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 35) & 0x7ffffffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 43) & 0x1fffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(11 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 38) & 0x1fffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(16 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(17 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 25) & 0x1ffffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 33) & 0x1ffffffffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 41) & 0x1fffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(22 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 44) & 0x1fffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(28 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 23) & 0x7fffffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 31) & 0x7fffffffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 39) & 0x1fffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(33 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(34 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 42) & 0x1fffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(39 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 29) & 0x1fffffffffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 37) & 0x1fffffffffffL);
    }

    public static void bitUnpack8LongLE46(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0x3fffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 42) & 0x3fffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(11 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 44) & 0x3fffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(17 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 38) & 0x3fffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(23 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 40) & 0x3fffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(28 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(29 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 42) & 0x3fffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(34 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 44) & 0x3fffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(40 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 38) & 0x3fffffffffffL);
    }

    public static void bitUnpack8LongLE47(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0x7fffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 5 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 25) & 0x1ffffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 33) & 0x1ffffffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 41) & 0x7fffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(11 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(12 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 42) & 0x7fffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(17 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(18 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 27) & 0x7ffffffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 35) & 0x7ffffffffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 43) & 0x7fffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(23 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 44) & 0x7fffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(29 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 29) & 0x1fffffffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 37) & 0x1fffffffffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 45) & 0x7fffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(35 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 46) & 0x7fffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(41 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 23) & 0x7fffffffL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 31) & 0x7fffffffffL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 39) & 0x7fffffffffffL);
    }

    public static void bitUnpack8LongLE48(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 40) & 0xffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(12 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 40) & 0xffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(18 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 40) & 0xffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(24 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 40) & 0xffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(30 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 40) & 0xffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(36 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 40) & 0xffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(42 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 40) & 0xffffffffffffL);
    }

    public static void bitUnpack8LongLE49(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 48) & 0x1ffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 23) & 0x7fffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 31) & 0x7fffffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 39) & 0x7fffffffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 47) & 0x1ffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(12 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 46) & 0x1ffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(18 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 29) & 0x1fffffffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 37) & 0x1fffffffffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 45) & 0x1ffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(24 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 44) & 0x1ffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(30 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(31 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 27) & 0x7ffffffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 35) & 0x7ffffffffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 43) & 0x1ffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(36 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(37 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 42) & 0x1ffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(42 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(43 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 25) & 0x1ffffffffL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 33) & 0x1ffffffffffL)
                | ((((long) src.applyAsLong(48 + srcOff)) << 41) & 0x1ffffffffffffL);
    }

    public static void bitUnpack8LongLE50(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 48) & 0x3ffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 46) & 0x3ffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(12 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 44) & 0x3ffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(18 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(19 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 42) & 0x3ffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(25 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 48) & 0x3ffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(31 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 46) & 0x3ffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(37 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 44) & 0x3ffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(43 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(44 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(48 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(49 + srcOff)) << 42) & 0x3ffffffffffffL);
    }

    public static void bitUnpack8LongLE51(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 48) & 0x7ffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 29) & 0x1fffffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 37) & 0x1fffffffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 45) & 0x7ffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(12 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(13 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 42) & 0x3ffffffffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 50) & 0x7ffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(19 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 23) & 0x7fffffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 31) & 0x7fffffffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 39) & 0x7fffffffffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 47) & 0x7ffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(25 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 44) & 0x7ffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(31 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(32 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 25) & 0x1ffffffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 33) & 0x1ffffffffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 41) & 0x1ffffffffffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 49) & 0x7ffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(38 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 46) & 0x7ffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(44 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(45 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong(48 + srcOff)) << 27) & 0x7ffffffffL)
                | ((((long) src.applyAsLong(49 + srcOff)) << 35) & 0x7ffffffffffL)
                | ((((long) src.applyAsLong(50 + srcOff)) << 43) & 0x7ffffffffffffL);
    }

    public static void bitUnpack8LongLE52(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 48) & 0xfffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 44) & 0xfffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(13 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 48) & 0xfffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(19 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 44) & 0xfffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(26 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 48) & 0xfffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(32 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 44) & 0xfffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(39 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 48) & 0xfffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(45 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(48 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(49 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(50 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(51 + srcOff)) << 44) & 0xfffffffffffffL);
    }

    public static void bitUnpack8LongLE53(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 48) & 0x1fffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 27) & 0x7ffffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 35) & 0x7ffffffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 43) & 0x7ffffffffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 51) & 0x1fffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(13 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 46) & 0x1fffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(19 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(20 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 25) & 0x1ffffffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 33) & 0x1ffffffffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 41) & 0x1ffffffffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 49) & 0x1fffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(26 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 44) & 0xfffffffffffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 52) & 0x1fffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(33 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 23) & 0x7fffffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 31) & 0x7fffffffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 39) & 0x7fffffffffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 47) & 0x1fffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(39 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(40 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 42) & 0x3ffffffffffffL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 50) & 0x1fffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(46 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(48 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(49 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong(50 + srcOff)) << 29) & 0x1fffffffffL)
                | ((((long) src.applyAsLong(51 + srcOff)) << 37) & 0x1fffffffffffL)
                | ((((long) src.applyAsLong(52 + srcOff)) << 45) & 0x1fffffffffffffL);
    }

    public static void bitUnpack8LongLE54(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 48) & 0x3fffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 42) & 0x3ffffffffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 50) & 0x3fffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(13 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 44) & 0xfffffffffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 52) & 0x3fffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(20 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 46) & 0x3fffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(27 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 48) & 0x3fffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(33 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(34 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 42) & 0x3ffffffffffffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 50) & 0x3fffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(40 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 44) & 0xfffffffffffffL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 52) & 0x3fffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(47 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(48 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(49 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(50 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(51 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(52 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(53 + srcOff)) << 46) & 0x3fffffffffffffL);
    }

    public static void bitUnpack8LongLE55(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 48) & 0x7fffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 6 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 25) & 0x1ffffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 33) & 0x1ffffffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 41) & 0x1ffffffffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 49) & 0x7fffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(13 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(14 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 42) & 0x3ffffffffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 50) & 0x7fffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(20 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(21 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 27) & 0x7ffffffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 35) & 0x7ffffffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 43) & 0x7ffffffffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 51) & 0x7fffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(27 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 44) & 0xfffffffffffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 52) & 0x7fffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(34 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 29) & 0x1fffffffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 37) & 0x1fffffffffffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 45) & 0x1fffffffffffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 53) & 0x7fffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(41 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 46) & 0x3fffffffffffffL)
                | ((((long) src.applyAsLong(48 + srcOff)) << 54) & 0x7fffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(48 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(49 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(50 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong(51 + srcOff)) << 23) & 0x7fffffffL)
                | ((((long) src.applyAsLong(52 + srcOff)) << 31) & 0x7fffffffffL)
                | ((((long) src.applyAsLong(53 + srcOff)) << 39) & 0x7fffffffffffL)
                | ((((long) src.applyAsLong(54 + srcOff)) << 47) & 0x7fffffffffffffL);
    }

    public static void bitUnpack8LongLE56(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 48) & 0xffffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 48) & 0xffffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(14 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 48) & 0xffffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(21 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 48) & 0xffffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(28 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 48) & 0xffffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(35 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 48) & 0xffffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(42 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(48 + srcOff)) << 48) & 0xffffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(49 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(50 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(51 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(52 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(53 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(54 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(55 + srcOff)) << 48) & 0xffffffffffffffL);
    }

    public static void bitUnpack8LongLE57(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 56) & 0x1ffffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 23) & 0x7fffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 31) & 0x7fffffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 39) & 0x7fffffffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 47) & 0x7fffffffffffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 55) & 0x1ffffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(14 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 46) & 0x3fffffffffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 54) & 0x1ffffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(21 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 29) & 0x1fffffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 37) & 0x1fffffffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 45) & 0x1fffffffffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 53) & 0x1ffffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(28 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 44) & 0xfffffffffffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 52) & 0x1ffffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(35 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(36 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 27) & 0x7ffffffffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 35) & 0x7ffffffffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 43) & 0x7ffffffffffffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 51) & 0x1ffffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(42 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(43 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(48 + srcOff)) << 42) & 0x3ffffffffffffL)
                | ((((long) src.applyAsLong(49 + srcOff)) << 50) & 0x1ffffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(49 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(50 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(51 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(52 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong(53 + srcOff)) << 25) & 0x1ffffffffL)
                | ((((long) src.applyAsLong(54 + srcOff)) << 33) & 0x1ffffffffffL)
                | ((((long) src.applyAsLong(55 + srcOff)) << 41) & 0x1ffffffffffffL)
                | ((((long) src.applyAsLong(56 + srcOff)) << 49) & 0x1ffffffffffffffL);
    }

    public static void bitUnpack8LongLE58(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 56) & 0x3ffffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 46) & 0x3fffffffffffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 54) & 0x3ffffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(14 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 44) & 0xfffffffffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 52) & 0x3ffffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(21 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(22 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 42) & 0x3ffffffffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 50) & 0x3ffffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(29 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 56) & 0x3ffffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(36 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 46) & 0x3fffffffffffffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 54) & 0x3ffffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(43 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(48 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(49 + srcOff)) << 44) & 0xfffffffffffffL)
                | ((((long) src.applyAsLong(50 + srcOff)) << 52) & 0x3ffffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(50 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(51 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(52 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(53 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(54 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(55 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(56 + srcOff)) << 42) & 0x3ffffffffffffL)
                | ((((long) src.applyAsLong(57 + srcOff)) << 50) & 0x3ffffffffffffffL);
    }

    public static void bitUnpack8LongLE59(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 56) & 0x7ffffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 29) & 0x1fffffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 37) & 0x1fffffffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 45) & 0x1fffffffffffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 53) & 0x7ffffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(14 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(15 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 42) & 0x3ffffffffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 50) & 0x3ffffffffffffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 58) & 0x7ffffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(22 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 23) & 0x7fffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 31) & 0x7fffffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 39) & 0x7fffffffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 47) & 0x7fffffffffffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 55) & 0x7ffffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(29 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 44) & 0xfffffffffffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 52) & 0x7ffffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(36 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(37 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 25) & 0x1ffffffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 33) & 0x1ffffffffffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 41) & 0x1ffffffffffffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 49) & 0x1ffffffffffffffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 57) & 0x7ffffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(44 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(48 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(49 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(50 + srcOff)) << 46) & 0x3fffffffffffffL)
                | ((((long) src.applyAsLong(51 + srcOff)) << 54) & 0x7ffffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(51 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(52 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(53 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(54 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong(55 + srcOff)) << 27) & 0x7ffffffffL)
                | ((((long) src.applyAsLong(56 + srcOff)) << 35) & 0x7ffffffffffL)
                | ((((long) src.applyAsLong(57 + srcOff)) << 43) & 0x7ffffffffffffL)
                | ((((long) src.applyAsLong(58 + srcOff)) << 51) & 0x7ffffffffffffffL);
    }

    public static void bitUnpack8LongLE60(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 56) & 0xfffffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 44) & 0xfffffffffffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 52) & 0xfffffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(15 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 56) & 0xfffffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(22 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 44) & 0xfffffffffffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 52) & 0xfffffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(30 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 56) & 0xfffffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(37 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 44) & 0xfffffffffffffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 52) & 0xfffffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(45 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(48 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(49 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(50 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(51 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong(52 + srcOff)) << 56) & 0xfffffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(52 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(53 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(54 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(55 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(56 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(57 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(58 + srcOff)) << 44) & 0xfffffffffffffL)
                | ((((long) src.applyAsLong(59 + srcOff)) << 52) & 0xfffffffffffffffL);
    }

    public static void bitUnpack8LongLE61(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 56) & 0x1fffffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 27) & 0x7ffffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 35) & 0x7ffffffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 43) & 0x7ffffffffffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 51) & 0x7ffffffffffffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 59) & 0x1fffffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(15 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 46) & 0x3fffffffffffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 54) & 0x1fffffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(22 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong(23 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 25) & 0x1ffffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 33) & 0x1ffffffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 41) & 0x1ffffffffffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 49) & 0x1ffffffffffffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 57) & 0x1fffffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(30 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 44) & 0xfffffffffffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 52) & 0xfffffffffffffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 60) & 0x1fffffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(38 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 23) & 0x7fffffffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 31) & 0x7fffffffffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 39) & 0x7fffffffffffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 47) & 0x7fffffffffffffL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 55) & 0x1fffffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(45 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(46 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(48 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(49 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(50 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(51 + srcOff)) << 42) & 0x3ffffffffffffL)
                | ((((long) src.applyAsLong(52 + srcOff)) << 50) & 0x3ffffffffffffffL)
                | ((((long) src.applyAsLong(53 + srcOff)) << 58) & 0x1fffffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(53 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(54 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(55 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(56 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong(57 + srcOff)) << 29) & 0x1fffffffffL)
                | ((((long) src.applyAsLong(58 + srcOff)) << 37) & 0x1fffffffffffL)
                | ((((long) src.applyAsLong(59 + srcOff)) << 45) & 0x1fffffffffffffL)
                | ((((long) src.applyAsLong(60 + srcOff)) << 53) & 0x1fffffffffffffffL);
    }

    public static void bitUnpack8LongLE62(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 56) & 0x3fffffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 42) & 0x3ffffffffffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 50) & 0x3ffffffffffffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 58) & 0x3fffffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(15 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(16 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 44) & 0xfffffffffffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 52) & 0xfffffffffffffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 60) & 0x3fffffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(23 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(24 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 46) & 0x3fffffffffffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 54) & 0x3fffffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(31 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 56) & 0x3fffffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(38 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(39 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 42) & 0x3ffffffffffffL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 50) & 0x3ffffffffffffffL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 58) & 0x3fffffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(46 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(48 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(49 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(50 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(51 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(52 + srcOff)) << 44) & 0xfffffffffffffL)
                | ((((long) src.applyAsLong(53 + srcOff)) << 52) & 0xfffffffffffffffL)
                | ((((long) src.applyAsLong(54 + srcOff)) << 60) & 0x3fffffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(54 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(55 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(56 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(57 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(58 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(59 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(60 + srcOff)) << 46) & 0x3fffffffffffffL)
                | ((((long) src.applyAsLong(61 + srcOff)) << 54) & 0x3fffffffffffffffL);
    }

    public static void bitUnpack8LongLE63(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 56) & 0x7fffffffffffffffL);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 7 + srcOff)) >> 7) & 0x1L)
                | ((((long) src.applyAsLong( 8 + srcOff)) << 1) & 0x1ffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 9) & 0x1ffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 17) & 0x1ffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 25) & 0x1ffffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 33) & 0x1ffffffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 41) & 0x1ffffffffffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 49) & 0x1ffffffffffffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 57) & 0x7fffffffffffffffL);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(15 + srcOff)) >> 6) & 0x3L)
                | ((((long) src.applyAsLong(16 + srcOff)) << 2) & 0x3ffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 10) & 0x3ffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 18) & 0x3ffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 26) & 0x3ffffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 34) & 0x3ffffffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 42) & 0x3ffffffffffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 50) & 0x3ffffffffffffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 58) & 0x7fffffffffffffffL);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(23 + srcOff)) >> 5) & 0x7L)
                | ((((long) src.applyAsLong(24 + srcOff)) << 3) & 0x7ffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 11) & 0x7ffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 19) & 0x7ffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 27) & 0x7ffffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 35) & 0x7ffffffffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 43) & 0x7ffffffffffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 51) & 0x7ffffffffffffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 59) & 0x7fffffffffffffffL);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(31 + srcOff)) >> 4) & 0xfL)
                | ((((long) src.applyAsLong(32 + srcOff)) << 4) & 0xfffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 12) & 0xfffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 20) & 0xfffffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 28) & 0xfffffffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 36) & 0xfffffffffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 44) & 0xfffffffffffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 52) & 0xfffffffffffffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 60) & 0x7fffffffffffffffL);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(39 + srcOff)) >> 3) & 0x1fL)
                | ((((long) src.applyAsLong(40 + srcOff)) << 5) & 0x1fffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 13) & 0x1fffffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 21) & 0x1fffffffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 29) & 0x1fffffffffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 37) & 0x1fffffffffffL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 45) & 0x1fffffffffffffL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 53) & 0x1fffffffffffffffL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 61) & 0x7fffffffffffffffL);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(47 + srcOff)) >> 2) & 0x3fL)
                | ((((long) src.applyAsLong(48 + srcOff)) << 6) & 0x3fffL)
                | ((((long) src.applyAsLong(49 + srcOff)) << 14) & 0x3fffffL)
                | ((((long) src.applyAsLong(50 + srcOff)) << 22) & 0x3fffffffL)
                | ((((long) src.applyAsLong(51 + srcOff)) << 30) & 0x3fffffffffL)
                | ((((long) src.applyAsLong(52 + srcOff)) << 38) & 0x3fffffffffffL)
                | ((((long) src.applyAsLong(53 + srcOff)) << 46) & 0x3fffffffffffffL)
                | ((((long) src.applyAsLong(54 + srcOff)) << 54) & 0x3fffffffffffffffL)
                | ((((long) src.applyAsLong(55 + srcOff)) << 62) & 0x7fffffffffffffffL);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(55 + srcOff)) >> 1) & 0x7fL)
                | ((((long) src.applyAsLong(56 + srcOff)) << 7) & 0x7fffL)
                | ((((long) src.applyAsLong(57 + srcOff)) << 15) & 0x7fffffL)
                | ((((long) src.applyAsLong(58 + srcOff)) << 23) & 0x7fffffffL)
                | ((((long) src.applyAsLong(59 + srcOff)) << 31) & 0x7fffffffffL)
                | ((((long) src.applyAsLong(60 + srcOff)) << 39) & 0x7fffffffffffL)
                | ((((long) src.applyAsLong(61 + srcOff)) << 47) & 0x7fffffffffffffL)
                | ((((long) src.applyAsLong(62 + srcOff)) << 55) & 0x7fffffffffffffffL);
    }

    public static void bitUnpack8LongLE64(IntToLongFunction src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src.applyAsLong( 0 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 1 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong( 3 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong( 4 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong( 5 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong( 6 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong( 7 + srcOff)) << 56) & -1L);
        dst[ 1 + dstOff] =
                  ((((long) src.applyAsLong( 8 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong( 9 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(10 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(11 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(12 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(13 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(14 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong(15 + srcOff)) << 56) & -1L);
        dst[ 2 + dstOff] =
                  ((((long) src.applyAsLong(16 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(17 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(18 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(19 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(20 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(21 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(22 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong(23 + srcOff)) << 56) & -1L);
        dst[ 3 + dstOff] =
                  ((((long) src.applyAsLong(24 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(25 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(26 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(27 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(28 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(29 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(30 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong(31 + srcOff)) << 56) & -1L);
        dst[ 4 + dstOff] =
                  ((((long) src.applyAsLong(32 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(33 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(34 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(35 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(36 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(37 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(38 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong(39 + srcOff)) << 56) & -1L);
        dst[ 5 + dstOff] =
                  ((((long) src.applyAsLong(40 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(41 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(42 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(43 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(44 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(45 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(46 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong(47 + srcOff)) << 56) & -1L);
        dst[ 6 + dstOff] =
                  ((((long) src.applyAsLong(48 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(49 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(50 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(51 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(52 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(53 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(54 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong(55 + srcOff)) << 56) & -1L);
        dst[ 7 + dstOff] =
                  ((((long) src.applyAsLong(56 + srcOff)) << 0) & 0xffL)
                | ((((long) src.applyAsLong(57 + srcOff)) << 8) & 0xffffL)
                | ((((long) src.applyAsLong(58 + srcOff)) << 16) & 0xffffffL)
                | ((((long) src.applyAsLong(59 + srcOff)) << 24) & 0xffffffffL)
                | ((((long) src.applyAsLong(60 + srcOff)) << 32) & 0xffffffffffL)
                | ((((long) src.applyAsLong(61 + srcOff)) << 40) & 0xffffffffffffL)
                | ((((long) src.applyAsLong(62 + srcOff)) << 48) & 0xffffffffffffffL)
                | ((((long) src.applyAsLong(63 + srcOff)) << 56) & -1L);
    }

}
