package io.github.intbit;

import java.util.Arrays;

final class BitUnpacking8LongBE
{
    private BitUnpacking8LongBE()
    { }

    public static void unpack(int bits, byte[] src, int srcOff, long[] dst, int dstOff)
    {
        switch (bits) {
        case 0:
            bitUnpack8LongBE0(src, srcOff, dst, dstOff);
            break;
        case 1:
            bitUnpack8LongBE1(src, srcOff, dst, dstOff);
            break;
        case 2:
            bitUnpack8LongBE2(src, srcOff, dst, dstOff);
            break;
        case 3:
            bitUnpack8LongBE3(src, srcOff, dst, dstOff);
            break;
        case 4:
            bitUnpack8LongBE4(src, srcOff, dst, dstOff);
            break;
        case 5:
            bitUnpack8LongBE5(src, srcOff, dst, dstOff);
            break;
        case 6:
            bitUnpack8LongBE6(src, srcOff, dst, dstOff);
            break;
        case 7:
            bitUnpack8LongBE7(src, srcOff, dst, dstOff);
            break;
        case 8:
            bitUnpack8LongBE8(src, srcOff, dst, dstOff);
            break;
        case 9:
            bitUnpack8LongBE9(src, srcOff, dst, dstOff);
            break;
        case 10:
            bitUnpack8LongBE10(src, srcOff, dst, dstOff);
            break;
        case 11:
            bitUnpack8LongBE11(src, srcOff, dst, dstOff);
            break;
        case 12:
            bitUnpack8LongBE12(src, srcOff, dst, dstOff);
            break;
        case 13:
            bitUnpack8LongBE13(src, srcOff, dst, dstOff);
            break;
        case 14:
            bitUnpack8LongBE14(src, srcOff, dst, dstOff);
            break;
        case 15:
            bitUnpack8LongBE15(src, srcOff, dst, dstOff);
            break;
        case 16:
            bitUnpack8LongBE16(src, srcOff, dst, dstOff);
            break;
        case 17:
            bitUnpack8LongBE17(src, srcOff, dst, dstOff);
            break;
        case 18:
            bitUnpack8LongBE18(src, srcOff, dst, dstOff);
            break;
        case 19:
            bitUnpack8LongBE19(src, srcOff, dst, dstOff);
            break;
        case 20:
            bitUnpack8LongBE20(src, srcOff, dst, dstOff);
            break;
        case 21:
            bitUnpack8LongBE21(src, srcOff, dst, dstOff);
            break;
        case 22:
            bitUnpack8LongBE22(src, srcOff, dst, dstOff);
            break;
        case 23:
            bitUnpack8LongBE23(src, srcOff, dst, dstOff);
            break;
        case 24:
            bitUnpack8LongBE24(src, srcOff, dst, dstOff);
            break;
        case 25:
            bitUnpack8LongBE25(src, srcOff, dst, dstOff);
            break;
        case 26:
            bitUnpack8LongBE26(src, srcOff, dst, dstOff);
            break;
        case 27:
            bitUnpack8LongBE27(src, srcOff, dst, dstOff);
            break;
        case 28:
            bitUnpack8LongBE28(src, srcOff, dst, dstOff);
            break;
        case 29:
            bitUnpack8LongBE29(src, srcOff, dst, dstOff);
            break;
        case 30:
            bitUnpack8LongBE30(src, srcOff, dst, dstOff);
            break;
        case 31:
            bitUnpack8LongBE31(src, srcOff, dst, dstOff);
            break;
        case 32:
            bitUnpack8LongBE32(src, srcOff, dst, dstOff);
            break;
        case 33:
            bitUnpack8LongBE33(src, srcOff, dst, dstOff);
            break;
        case 34:
            bitUnpack8LongBE34(src, srcOff, dst, dstOff);
            break;
        case 35:
            bitUnpack8LongBE35(src, srcOff, dst, dstOff);
            break;
        case 36:
            bitUnpack8LongBE36(src, srcOff, dst, dstOff);
            break;
        case 37:
            bitUnpack8LongBE37(src, srcOff, dst, dstOff);
            break;
        case 38:
            bitUnpack8LongBE38(src, srcOff, dst, dstOff);
            break;
        case 39:
            bitUnpack8LongBE39(src, srcOff, dst, dstOff);
            break;
        case 40:
            bitUnpack8LongBE40(src, srcOff, dst, dstOff);
            break;
        case 41:
            bitUnpack8LongBE41(src, srcOff, dst, dstOff);
            break;
        case 42:
            bitUnpack8LongBE42(src, srcOff, dst, dstOff);
            break;
        case 43:
            bitUnpack8LongBE43(src, srcOff, dst, dstOff);
            break;
        case 44:
            bitUnpack8LongBE44(src, srcOff, dst, dstOff);
            break;
        case 45:
            bitUnpack8LongBE45(src, srcOff, dst, dstOff);
            break;
        case 46:
            bitUnpack8LongBE46(src, srcOff, dst, dstOff);
            break;
        case 47:
            bitUnpack8LongBE47(src, srcOff, dst, dstOff);
            break;
        case 48:
            bitUnpack8LongBE48(src, srcOff, dst, dstOff);
            break;
        case 49:
            bitUnpack8LongBE49(src, srcOff, dst, dstOff);
            break;
        case 50:
            bitUnpack8LongBE50(src, srcOff, dst, dstOff);
            break;
        case 51:
            bitUnpack8LongBE51(src, srcOff, dst, dstOff);
            break;
        case 52:
            bitUnpack8LongBE52(src, srcOff, dst, dstOff);
            break;
        case 53:
            bitUnpack8LongBE53(src, srcOff, dst, dstOff);
            break;
        case 54:
            bitUnpack8LongBE54(src, srcOff, dst, dstOff);
            break;
        case 55:
            bitUnpack8LongBE55(src, srcOff, dst, dstOff);
            break;
        case 56:
            bitUnpack8LongBE56(src, srcOff, dst, dstOff);
            break;
        case 57:
            bitUnpack8LongBE57(src, srcOff, dst, dstOff);
            break;
        case 58:
            bitUnpack8LongBE58(src, srcOff, dst, dstOff);
            break;
        case 59:
            bitUnpack8LongBE59(src, srcOff, dst, dstOff);
            break;
        case 60:
            bitUnpack8LongBE60(src, srcOff, dst, dstOff);
            break;
        case 61:
            bitUnpack8LongBE61(src, srcOff, dst, dstOff);
            break;
        case 62:
            bitUnpack8LongBE62(src, srcOff, dst, dstOff);
            break;
        case 63:
            bitUnpack8LongBE63(src, srcOff, dst, dstOff);
            break;
        case 64:
            bitUnpack8LongBE64(src, srcOff, dst, dstOff);
            break;
        default:
            throw new IllegalArgumentException("Bit width must be from 0 to 64 but got " + bits);
        }
    }

    public static void bitUnpack8LongBE0(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        Arrays.fill(dst, dstOff, dstOff + 8, 0);
    }

    public static void bitUnpack8LongBE1(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 7) & 0x1L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 6) & 0x1L);
        dst[ 2 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 5) & 0x1L);
        dst[ 3 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 4) & 0x1L);
        dst[ 4 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 3) & 0x1L);
        dst[ 5 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 2) & 0x1L);
        dst[ 6 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 1) & 0x1L);
        dst[ 7 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0x1L);
    }

    public static void bitUnpack8LongBE2(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 6) & 0x3L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 4) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 2) & 0x3L);
        dst[ 3 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0x3L);
        dst[ 4 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 6) & 0x3L);
        dst[ 5 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 4) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 2) & 0x3L);
        dst[ 7 + dstOff] =
                  ((((long) src[ 1 + srcOff]) << 0) & 0x3L);
    }

    public static void bitUnpack8LongBE3(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 5) & 0x7L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 2) & 0x7L);
        dst[ 2 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 1) & 0x7L)
                | ((((long) src[ 1 + srcOff]) >> 7) & 0x1L);
        dst[ 3 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 4) & 0x7L);
        dst[ 4 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 1) & 0x7L);
        dst[ 5 + dstOff] =
                  ((((long) src[ 1 + srcOff]) << 2) & 0x7L)
                | ((((long) src[ 2 + srcOff]) >> 6) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 3) & 0x7L);
        dst[ 7 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 0) & 0x7L);
    }

    public static void bitUnpack8LongBE4(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 4) & 0xfL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 0) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 4) & 0xfL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 1 + srcOff]) << 0) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 2 + srcOff]) >> 4) & 0xfL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 0) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 4) & 0xfL);
        dst[ 7 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 0) & 0xfL);
    }

    public static void bitUnpack8LongBE5(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 3) & 0x1fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 2) & 0x1fL)
                | ((((long) src[ 1 + srcOff]) >> 6) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[ 1 + srcOff]) >> 1) & 0x1fL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 1 + srcOff]) << 4) & 0x1fL)
                | ((((long) src[ 2 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 1) & 0x1fL)
                | ((((long) src[ 3 + srcOff]) >> 7) & 0x1L);
        dst[ 5 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 2) & 0x1fL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 3) & 0x1fL)
                | ((((long) src[ 4 + srcOff]) >> 5) & 0x7L);
        dst[ 7 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 0) & 0x1fL);
    }

    public static void bitUnpack8LongBE6(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 2) & 0x3fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 4) & 0x3fL)
                | ((((long) src[ 1 + srcOff]) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 1 + srcOff]) << 2) & 0x3fL)
                | ((((long) src[ 2 + srcOff]) >> 6) & 0x3L);
        dst[ 3 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 0) & 0x3fL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 3 + srcOff]) >> 2) & 0x3fL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 4) & 0x3fL)
                | ((((long) src[ 4 + srcOff]) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 2) & 0x3fL)
                | ((((long) src[ 5 + srcOff]) >> 6) & 0x3L);
        dst[ 7 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 0) & 0x3fL);
    }

    public static void bitUnpack8LongBE7(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) >> 1) & 0x7fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 6) & 0x7fL)
                | ((((long) src[ 1 + srcOff]) >> 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 1 + srcOff]) << 5) & 0x7fL)
                | ((((long) src[ 2 + srcOff]) >> 3) & 0x1fL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 4) & 0x7fL)
                | ((((long) src[ 3 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 3) & 0x7fL)
                | ((((long) src[ 4 + srcOff]) >> 5) & 0x7L);
        dst[ 5 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 2) & 0x7fL)
                | ((((long) src[ 5 + srcOff]) >> 6) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 1) & 0x7fL)
                | ((((long) src[ 6 + srcOff]) >> 7) & 0x1L);
        dst[ 7 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 0) & 0x7fL);
    }

    public static void bitUnpack8LongBE8(byte[] src, int srcOff, long[] dst, int dstOff)
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

    public static void bitUnpack8LongBE9(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 1 + srcOff]) >> 7) & 0x1L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 1 + srcOff]) << 2) & 0x1ffL)
                | ((((long) src[ 2 + srcOff]) >> 6) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 3) & 0x1ffL)
                | ((((long) src[ 3 + srcOff]) >> 5) & 0x7L);
        dst[ 3 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 4) & 0x1ffL)
                | ((((long) src[ 4 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 5) & 0x1ffL)
                | ((((long) src[ 5 + srcOff]) >> 3) & 0x1fL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 6) & 0x1ffL)
                | ((((long) src[ 6 + srcOff]) >> 2) & 0x3fL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 7) & 0x1ffL)
                | ((((long) src[ 7 + srcOff]) >> 1) & 0x7fL);
        dst[ 7 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 8) & 0x1ffL)
                | ((((long) src[ 8 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE10(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 1 + srcOff]) >> 6) & 0x3L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 1 + srcOff]) << 4) & 0x3ffL)
                | ((((long) src[ 2 + srcOff]) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 6) & 0x3ffL)
                | ((((long) src[ 3 + srcOff]) >> 2) & 0x3fL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 8) & 0x3ffL)
                | ((((long) src[ 4 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 6 + srcOff]) >> 6) & 0x3L);
        dst[ 5 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 4) & 0x3ffL)
                | ((((long) src[ 7 + srcOff]) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 6) & 0x3ffL)
                | ((((long) src[ 8 + srcOff]) >> 2) & 0x3fL);
        dst[ 7 + dstOff] =
                  ((((long) src[ 8 + srcOff]) << 8) & 0x3ffL)
                | ((((long) src[ 9 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE11(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 1 + srcOff]) >> 5) & 0x7L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 1 + srcOff]) << 6) & 0x7ffL)
                | ((((long) src[ 2 + srcOff]) >> 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 9) & 0x7ffL)
                | ((((long) src[ 3 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 4 + srcOff]) >> 7) & 0x1L);
        dst[ 3 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 4) & 0x7ffL)
                | ((((long) src[ 5 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 7) & 0x7ffL)
                | ((((long) src[ 6 + srcOff]) >> 1) & 0x7fL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 10) & 0x7ffL)
                | ((((long) src[ 7 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 8 + srcOff]) >> 6) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[ 8 + srcOff]) << 5) & 0x7ffL)
                | ((((long) src[ 9 + srcOff]) >> 3) & 0x1fL);
        dst[ 7 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 8) & 0x7ffL)
                | ((((long) src[10 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE12(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 1 + srcOff]) >> 4) & 0xfL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 1 + srcOff]) << 8) & 0xfffL)
                | ((((long) src[ 2 + srcOff]) << 0) & 0xffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 4 + srcOff]) >> 4) & 0xfL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 8) & 0xfffL)
                | ((((long) src[ 5 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 7 + srcOff]) >> 4) & 0xfL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 8) & 0xfffL)
                | ((((long) src[ 8 + srcOff]) << 0) & 0xffL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[10 + srcOff]) >> 4) & 0xfL);
        dst[ 7 + dstOff] =
                  ((((long) src[10 + srcOff]) << 8) & 0xfffL)
                | ((((long) src[11 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE13(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[ 1 + srcOff]) >> 3) & 0x1fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 1 + srcOff]) << 10) & 0x1fffL)
                | ((((long) src[ 2 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 3 + srcOff]) >> 6) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 7) & 0x1fffL)
                | ((((long) src[ 4 + srcOff]) >> 1) & 0x7fL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 12) & 0x1fffL)
                | ((((long) src[ 5 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 6 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 9) & 0x1fffL)
                | ((((long) src[ 7 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 8 + srcOff]) >> 7) & 0x1L);
        dst[ 5 + dstOff] =
                  ((((long) src[ 8 + srcOff]) << 6) & 0x1fffL)
                | ((((long) src[ 9 + srcOff]) >> 2) & 0x3fL);
        dst[ 6 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 11) & 0x1fffL)
                | ((((long) src[10 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[11 + srcOff]) >> 5) & 0x7L);
        dst[ 7 + dstOff] =
                  ((((long) src[11 + srcOff]) << 8) & 0x1fffL)
                | ((((long) src[12 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE14(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 1 + srcOff]) >> 2) & 0x3fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 1 + srcOff]) << 12) & 0x3fffL)
                | ((((long) src[ 2 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 3 + srcOff]) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 10) & 0x3fffL)
                | ((((long) src[ 4 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 5 + srcOff]) >> 6) & 0x3L);
        dst[ 3 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 8) & 0x3fffL)
                | ((((long) src[ 6 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 8 + srcOff]) >> 2) & 0x3fL);
        dst[ 5 + dstOff] =
                  ((((long) src[ 8 + srcOff]) << 12) & 0x3fffL)
                | ((((long) src[ 9 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[10 + srcOff]) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[10 + srcOff]) << 10) & 0x3fffL)
                | ((((long) src[11 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[12 + srcOff]) >> 6) & 0x3L);
        dst[ 7 + dstOff] =
                  ((((long) src[12 + srcOff]) << 8) & 0x3fffL)
                | ((((long) src[13 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE15(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[ 1 + srcOff]) >> 1) & 0x7fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 1 + srcOff]) << 14) & 0x7fffL)
                | ((((long) src[ 2 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 3 + srcOff]) >> 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 13) & 0x7fffL)
                | ((((long) src[ 4 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[ 5 + srcOff]) >> 3) & 0x1fL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 12) & 0x7fffL)
                | ((((long) src[ 6 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 7 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 11) & 0x7fffL)
                | ((((long) src[ 8 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 9 + srcOff]) >> 5) & 0x7L);
        dst[ 5 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 10) & 0x7fffL)
                | ((((long) src[10 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[11 + srcOff]) >> 6) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[11 + srcOff]) << 9) & 0x7fffL)
                | ((((long) src[12 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[13 + srcOff]) >> 7) & 0x1L);
        dst[ 7 + dstOff] =
                  ((((long) src[13 + srcOff]) << 8) & 0x7fffL)
                | ((((long) src[14 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE16(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 1 + srcOff]) << 0) & 0xffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 3 + srcOff]) << 0) & 0xffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 5 + srcOff]) << 0) & 0xffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 7 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 8 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 9 + srcOff]) << 0) & 0xffL);
        dst[ 5 + dstOff] =
                  ((((long) src[10 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[11 + srcOff]) << 0) & 0xffL);
        dst[ 6 + dstOff] =
                  ((((long) src[12 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[13 + srcOff]) << 0) & 0xffL);
        dst[ 7 + dstOff] =
                  ((((long) src[14 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[15 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE17(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[ 1 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 2 + srcOff]) >> 7) & 0x1L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 10) & 0x1ffffL)
                | ((((long) src[ 3 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 4 + srcOff]) >> 6) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 11) & 0x1ffffL)
                | ((((long) src[ 5 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 6 + srcOff]) >> 5) & 0x7L);
        dst[ 3 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 12) & 0x1ffffL)
                | ((((long) src[ 7 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 8 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 8 + srcOff]) << 13) & 0x1ffffL)
                | ((((long) src[ 9 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[10 + srcOff]) >> 3) & 0x1fL);
        dst[ 5 + dstOff] =
                  ((((long) src[10 + srcOff]) << 14) & 0x1ffffL)
                | ((((long) src[11 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[12 + srcOff]) >> 2) & 0x3fL);
        dst[ 6 + dstOff] =
                  ((((long) src[12 + srcOff]) << 15) & 0x1ffffL)
                | ((((long) src[13 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[14 + srcOff]) >> 1) & 0x7fL);
        dst[ 7 + dstOff] =
                  ((((long) src[14 + srcOff]) << 16) & 0x1ffffL)
                | ((((long) src[15 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[16 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE18(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 1 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 2 + srcOff]) >> 6) & 0x3L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 12) & 0x3ffffL)
                | ((((long) src[ 3 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 4 + srcOff]) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 14) & 0x3ffffL)
                | ((((long) src[ 5 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 6 + srcOff]) >> 2) & 0x3fL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 16) & 0x3ffffL)
                | ((((long) src[ 7 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 8 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[10 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[11 + srcOff]) >> 6) & 0x3L);
        dst[ 5 + dstOff] =
                  ((((long) src[11 + srcOff]) << 12) & 0x3ffffL)
                | ((((long) src[12 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[13 + srcOff]) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[13 + srcOff]) << 14) & 0x3ffffL)
                | ((((long) src[14 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[15 + srcOff]) >> 2) & 0x3fL);
        dst[ 7 + dstOff] =
                  ((((long) src[15 + srcOff]) << 16) & 0x3ffffL)
                | ((((long) src[16 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[17 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE19(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[ 1 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 2 + srcOff]) >> 5) & 0x7L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 14) & 0x7ffffL)
                | ((((long) src[ 3 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 4 + srcOff]) >> 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 17) & 0x7ffffL)
                | ((((long) src[ 5 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[ 6 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 7 + srcOff]) >> 7) & 0x1L);
        dst[ 3 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 12) & 0x7ffffL)
                | ((((long) src[ 8 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 9 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 15) & 0x7ffffL)
                | ((((long) src[10 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[11 + srcOff]) >> 1) & 0x7fL);
        dst[ 5 + dstOff] =
                  ((((long) src[11 + srcOff]) << 18) & 0x7ffffL)
                | ((((long) src[12 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[13 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[14 + srcOff]) >> 6) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[14 + srcOff]) << 13) & 0x7ffffL)
                | ((((long) src[15 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[16 + srcOff]) >> 3) & 0x1fL);
        dst[ 7 + dstOff] =
                  ((((long) src[16 + srcOff]) << 16) & 0x7ffffL)
                | ((((long) src[17 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[18 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE20(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 1 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 2 + srcOff]) >> 4) & 0xfL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 16) & 0xfffffL)
                | ((((long) src[ 3 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 4 + srcOff]) << 0) & 0xffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 6 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 7 + srcOff]) >> 4) & 0xfL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 16) & 0xfffffL)
                | ((((long) src[ 8 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 9 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[10 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[11 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[12 + srcOff]) >> 4) & 0xfL);
        dst[ 5 + dstOff] =
                  ((((long) src[12 + srcOff]) << 16) & 0xfffffL)
                | ((((long) src[13 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[14 + srcOff]) << 0) & 0xffL);
        dst[ 6 + dstOff] =
                  ((((long) src[15 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[16 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[17 + srcOff]) >> 4) & 0xfL);
        dst[ 7 + dstOff] =
                  ((((long) src[17 + srcOff]) << 16) & 0xfffffL)
                | ((((long) src[18 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[19 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE21(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[ 1 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[ 2 + srcOff]) >> 3) & 0x1fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 18) & 0x1fffffL)
                | ((((long) src[ 3 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 4 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 5 + srcOff]) >> 6) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 15) & 0x1fffffL)
                | ((((long) src[ 6 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[ 7 + srcOff]) >> 1) & 0x7fL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 20) & 0x1fffffL)
                | ((((long) src[ 8 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 9 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[10 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[10 + srcOff]) << 17) & 0x1fffffL)
                | ((((long) src[11 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[12 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[13 + srcOff]) >> 7) & 0x1L);
        dst[ 5 + dstOff] =
                  ((((long) src[13 + srcOff]) << 14) & 0x1fffffL)
                | ((((long) src[14 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[15 + srcOff]) >> 2) & 0x3fL);
        dst[ 6 + dstOff] =
                  ((((long) src[15 + srcOff]) << 19) & 0x1fffffL)
                | ((((long) src[16 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[17 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[18 + srcOff]) >> 5) & 0x7L);
        dst[ 7 + dstOff] =
                  ((((long) src[18 + srcOff]) << 16) & 0x1fffffL)
                | ((((long) src[19 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[20 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE22(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 1 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 2 + srcOff]) >> 2) & 0x3fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 20) & 0x3fffffL)
                | ((((long) src[ 3 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 4 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 5 + srcOff]) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 18) & 0x3fffffL)
                | ((((long) src[ 6 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 7 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 8 + srcOff]) >> 6) & 0x3L);
        dst[ 3 + dstOff] =
                  ((((long) src[ 8 + srcOff]) << 16) & 0x3fffffL)
                | ((((long) src[ 9 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[10 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[11 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[12 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[13 + srcOff]) >> 2) & 0x3fL);
        dst[ 5 + dstOff] =
                  ((((long) src[13 + srcOff]) << 20) & 0x3fffffL)
                | ((((long) src[14 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[15 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[16 + srcOff]) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[16 + srcOff]) << 18) & 0x3fffffL)
                | ((((long) src[17 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[18 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[19 + srcOff]) >> 6) & 0x3L);
        dst[ 7 + dstOff] =
                  ((((long) src[19 + srcOff]) << 16) & 0x3fffffL)
                | ((((long) src[20 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[21 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE23(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[ 1 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[ 2 + srcOff]) >> 1) & 0x7fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 2 + srcOff]) << 22) & 0x7fffffL)
                | ((((long) src[ 3 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 4 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 5 + srcOff]) >> 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 21) & 0x7fffffL)
                | ((((long) src[ 6 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[ 7 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[ 8 + srcOff]) >> 3) & 0x1fL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 8 + srcOff]) << 20) & 0x7fffffL)
                | ((((long) src[ 9 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[10 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[11 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[11 + srcOff]) << 19) & 0x7fffffL)
                | ((((long) src[12 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[13 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[14 + srcOff]) >> 5) & 0x7L);
        dst[ 5 + dstOff] =
                  ((((long) src[14 + srcOff]) << 18) & 0x7fffffL)
                | ((((long) src[15 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[16 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[17 + srcOff]) >> 6) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[17 + srcOff]) << 17) & 0x7fffffL)
                | ((((long) src[18 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[19 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[20 + srcOff]) >> 7) & 0x1L);
        dst[ 7 + dstOff] =
                  ((((long) src[20 + srcOff]) << 16) & 0x7fffffL)
                | ((((long) src[21 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[22 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE24(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 1 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 2 + srcOff]) << 0) & 0xffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 4 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 5 + srcOff]) << 0) & 0xffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 7 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 8 + srcOff]) << 0) & 0xffL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[10 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[11 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[12 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[13 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[14 + srcOff]) << 0) & 0xffL);
        dst[ 5 + dstOff] =
                  ((((long) src[15 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[16 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[17 + srcOff]) << 0) & 0xffL);
        dst[ 6 + dstOff] =
                  ((((long) src[18 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[19 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[20 + srcOff]) << 0) & 0xffL);
        dst[ 7 + dstOff] =
                  ((((long) src[21 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[22 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[23 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE25(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[ 1 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[ 2 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 3 + srcOff]) >> 7) & 0x1L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 18) & 0x1ffffffL)
                | ((((long) src[ 4 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 5 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 6 + srcOff]) >> 6) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 19) & 0x1ffffffL)
                | ((((long) src[ 7 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[ 8 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 9 + srcOff]) >> 5) & 0x7L);
        dst[ 3 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 20) & 0x1ffffffL)
                | ((((long) src[10 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[11 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[12 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[12 + srcOff]) << 21) & 0x1ffffffL)
                | ((((long) src[13 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[14 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[15 + srcOff]) >> 3) & 0x1fL);
        dst[ 5 + dstOff] =
                  ((((long) src[15 + srcOff]) << 22) & 0x1ffffffL)
                | ((((long) src[16 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[17 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[18 + srcOff]) >> 2) & 0x3fL);
        dst[ 6 + dstOff] =
                  ((((long) src[18 + srcOff]) << 23) & 0x1ffffffL)
                | ((((long) src[19 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[20 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[21 + srcOff]) >> 1) & 0x7fL);
        dst[ 7 + dstOff] =
                  ((((long) src[21 + srcOff]) << 24) & 0x1ffffffL)
                | ((((long) src[22 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[23 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[24 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE26(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[ 1 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 2 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 3 + srcOff]) >> 6) & 0x3L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 20) & 0x3ffffffL)
                | ((((long) src[ 4 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 5 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 6 + srcOff]) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 22) & 0x3ffffffL)
                | ((((long) src[ 7 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 8 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 9 + srcOff]) >> 2) & 0x3fL);
        dst[ 3 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 24) & 0x3ffffffL)
                | ((((long) src[10 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[11 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[12 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[13 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[14 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[15 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[16 + srcOff]) >> 6) & 0x3L);
        dst[ 5 + dstOff] =
                  ((((long) src[16 + srcOff]) << 20) & 0x3ffffffL)
                | ((((long) src[17 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[18 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[19 + srcOff]) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[19 + srcOff]) << 22) & 0x3ffffffL)
                | ((((long) src[20 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[21 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[22 + srcOff]) >> 2) & 0x3fL);
        dst[ 7 + dstOff] =
                  ((((long) src[22 + srcOff]) << 24) & 0x3ffffffL)
                | ((((long) src[23 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[24 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[25 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE27(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[ 1 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[ 2 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 3 + srcOff]) >> 5) & 0x7L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 22) & 0x7ffffffL)
                | ((((long) src[ 4 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 5 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 6 + srcOff]) >> 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 25) & 0x7ffffffL)
                | ((((long) src[ 7 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[ 8 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[ 9 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[10 + srcOff]) >> 7) & 0x1L);
        dst[ 3 + dstOff] =
                  ((((long) src[10 + srcOff]) << 20) & 0x7ffffffL)
                | ((((long) src[11 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[12 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[13 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[13 + srcOff]) << 23) & 0x7ffffffL)
                | ((((long) src[14 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[15 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[16 + srcOff]) >> 1) & 0x7fL);
        dst[ 5 + dstOff] =
                  ((((long) src[16 + srcOff]) << 26) & 0x7ffffffL)
                | ((((long) src[17 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[18 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[19 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[20 + srcOff]) >> 6) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[20 + srcOff]) << 21) & 0x7ffffffL)
                | ((((long) src[21 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[22 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[23 + srcOff]) >> 3) & 0x1fL);
        dst[ 7 + dstOff] =
                  ((((long) src[23 + srcOff]) << 24) & 0x7ffffffL)
                | ((((long) src[24 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[25 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[26 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE28(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[ 1 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 2 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 3 + srcOff]) >> 4) & 0xfL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 24) & 0xfffffffL)
                | ((((long) src[ 4 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 5 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 6 + srcOff]) << 0) & 0xffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[ 8 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 9 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[10 + srcOff]) >> 4) & 0xfL);
        dst[ 3 + dstOff] =
                  ((((long) src[10 + srcOff]) << 24) & 0xfffffffL)
                | ((((long) src[11 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[12 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[13 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[14 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[15 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[16 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[17 + srcOff]) >> 4) & 0xfL);
        dst[ 5 + dstOff] =
                  ((((long) src[17 + srcOff]) << 24) & 0xfffffffL)
                | ((((long) src[18 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[19 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[20 + srcOff]) << 0) & 0xffL);
        dst[ 6 + dstOff] =
                  ((((long) src[21 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[22 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[23 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[24 + srcOff]) >> 4) & 0xfL);
        dst[ 7 + dstOff] =
                  ((((long) src[24 + srcOff]) << 24) & 0xfffffffL)
                | ((((long) src[25 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[26 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[27 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE29(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[ 1 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[ 2 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[ 3 + srcOff]) >> 3) & 0x1fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 26) & 0x1fffffffL)
                | ((((long) src[ 4 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[ 5 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 6 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 7 + srcOff]) >> 6) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 23) & 0x1fffffffL)
                | ((((long) src[ 8 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[ 9 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[10 + srcOff]) >> 1) & 0x7fL);
        dst[ 3 + dstOff] =
                  ((((long) src[10 + srcOff]) << 28) & 0x1fffffffL)
                | ((((long) src[11 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[12 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[13 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[14 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[14 + srcOff]) << 25) & 0x1fffffffL)
                | ((((long) src[15 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[16 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[17 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[18 + srcOff]) >> 7) & 0x1L);
        dst[ 5 + dstOff] =
                  ((((long) src[18 + srcOff]) << 22) & 0x1fffffffL)
                | ((((long) src[19 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[20 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[21 + srcOff]) >> 2) & 0x3fL);
        dst[ 6 + dstOff] =
                  ((((long) src[21 + srcOff]) << 27) & 0x1fffffffL)
                | ((((long) src[22 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[23 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[24 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[25 + srcOff]) >> 5) & 0x7L);
        dst[ 7 + dstOff] =
                  ((((long) src[25 + srcOff]) << 24) & 0x1fffffffL)
                | ((((long) src[26 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[27 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[28 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE30(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[ 1 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 2 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 3 + srcOff]) >> 2) & 0x3fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 28) & 0x3fffffffL)
                | ((((long) src[ 4 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[ 5 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 6 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 7 + srcOff]) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 26) & 0x3fffffffL)
                | ((((long) src[ 8 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[ 9 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[10 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[11 + srcOff]) >> 6) & 0x3L);
        dst[ 3 + dstOff] =
                  ((((long) src[11 + srcOff]) << 24) & 0x3fffffffL)
                | ((((long) src[12 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[13 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[14 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[15 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[16 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[17 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[18 + srcOff]) >> 2) & 0x3fL);
        dst[ 5 + dstOff] =
                  ((((long) src[18 + srcOff]) << 28) & 0x3fffffffL)
                | ((((long) src[19 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[20 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[21 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[22 + srcOff]) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[22 + srcOff]) << 26) & 0x3fffffffL)
                | ((((long) src[23 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[24 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[25 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[26 + srcOff]) >> 6) & 0x3L);
        dst[ 7 + dstOff] =
                  ((((long) src[26 + srcOff]) << 24) & 0x3fffffffL)
                | ((((long) src[27 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[28 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[29 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE31(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[ 1 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[ 2 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[ 3 + srcOff]) >> 1) & 0x7fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 3 + srcOff]) << 30) & 0x7fffffffL)
                | ((((long) src[ 4 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[ 5 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 6 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 7 + srcOff]) >> 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 29) & 0x7fffffffL)
                | ((((long) src[ 8 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[ 9 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[10 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[11 + srcOff]) >> 3) & 0x1fL);
        dst[ 3 + dstOff] =
                  ((((long) src[11 + srcOff]) << 28) & 0x7fffffffL)
                | ((((long) src[12 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[13 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[14 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[15 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[15 + srcOff]) << 27) & 0x7fffffffL)
                | ((((long) src[16 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[17 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[18 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[19 + srcOff]) >> 5) & 0x7L);
        dst[ 5 + dstOff] =
                  ((((long) src[19 + srcOff]) << 26) & 0x7fffffffL)
                | ((((long) src[20 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[21 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[22 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[23 + srcOff]) >> 6) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[23 + srcOff]) << 25) & 0x7fffffffL)
                | ((((long) src[24 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[25 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[26 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[27 + srcOff]) >> 7) & 0x1L);
        dst[ 7 + dstOff] =
                  ((((long) src[27 + srcOff]) << 24) & 0x7fffffffL)
                | ((((long) src[28 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[29 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[30 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE32(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 1 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 2 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 3 + srcOff]) << 0) & 0xffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 5 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 6 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 7 + srcOff]) << 0) & 0xffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 8 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 9 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[10 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[11 + srcOff]) << 0) & 0xffL);
        dst[ 3 + dstOff] =
                  ((((long) src[12 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[13 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[14 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[15 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[16 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[17 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[18 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[19 + srcOff]) << 0) & 0xffL);
        dst[ 5 + dstOff] =
                  ((((long) src[20 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[21 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[22 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[23 + srcOff]) << 0) & 0xffL);
        dst[ 6 + dstOff] =
                  ((((long) src[24 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[25 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[26 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[27 + srcOff]) << 0) & 0xffL);
        dst[ 7 + dstOff] =
                  ((((long) src[28 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[29 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[30 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[31 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE33(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[ 1 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[ 2 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[ 3 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 4 + srcOff]) >> 7) & 0x1L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 26) & 0x1ffffffffL)
                | ((((long) src[ 5 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[ 6 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 7 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 8 + srcOff]) >> 6) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[ 8 + srcOff]) << 27) & 0x1ffffffffL)
                | ((((long) src[ 9 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[10 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[11 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[12 + srcOff]) >> 5) & 0x7L);
        dst[ 3 + dstOff] =
                  ((((long) src[12 + srcOff]) << 28) & 0x1ffffffffL)
                | ((((long) src[13 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[14 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[15 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[16 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[16 + srcOff]) << 29) & 0x1ffffffffL)
                | ((((long) src[17 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[18 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[19 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[20 + srcOff]) >> 3) & 0x1fL);
        dst[ 5 + dstOff] =
                  ((((long) src[20 + srcOff]) << 30) & 0x1ffffffffL)
                | ((((long) src[21 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[22 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[23 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[24 + srcOff]) >> 2) & 0x3fL);
        dst[ 6 + dstOff] =
                  ((((long) src[24 + srcOff]) << 31) & 0x1ffffffffL)
                | ((((long) src[25 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[26 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[27 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[28 + srcOff]) >> 1) & 0x7fL);
        dst[ 7 + dstOff] =
                  ((((long) src[28 + srcOff]) << 32) & 0x1ffffffffL)
                | ((((long) src[29 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[30 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[31 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[32 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE34(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[ 1 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[ 2 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 3 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 4 + srcOff]) >> 6) & 0x3L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 28) & 0x3ffffffffL)
                | ((((long) src[ 5 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[ 6 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 7 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 8 + srcOff]) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 8 + srcOff]) << 30) & 0x3ffffffffL)
                | ((((long) src[ 9 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[10 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[11 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[12 + srcOff]) >> 2) & 0x3fL);
        dst[ 3 + dstOff] =
                  ((((long) src[12 + srcOff]) << 32) & 0x3ffffffffL)
                | ((((long) src[13 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[14 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[15 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[16 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[17 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[18 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[19 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[20 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[21 + srcOff]) >> 6) & 0x3L);
        dst[ 5 + dstOff] =
                  ((((long) src[21 + srcOff]) << 28) & 0x3ffffffffL)
                | ((((long) src[22 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[23 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[24 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[25 + srcOff]) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[25 + srcOff]) << 30) & 0x3ffffffffL)
                | ((((long) src[26 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[27 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[28 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[29 + srcOff]) >> 2) & 0x3fL);
        dst[ 7 + dstOff] =
                  ((((long) src[29 + srcOff]) << 32) & 0x3ffffffffL)
                | ((((long) src[30 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[31 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[32 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[33 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE35(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[ 1 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[ 2 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[ 3 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 4 + srcOff]) >> 5) & 0x7L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 30) & 0x7ffffffffL)
                | ((((long) src[ 5 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[ 6 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 7 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 8 + srcOff]) >> 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 8 + srcOff]) << 33) & 0x7ffffffffL)
                | ((((long) src[ 9 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[10 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[11 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[12 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[13 + srcOff]) >> 7) & 0x1L);
        dst[ 3 + dstOff] =
                  ((((long) src[13 + srcOff]) << 28) & 0x7ffffffffL)
                | ((((long) src[14 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[15 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[16 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[17 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[17 + srcOff]) << 31) & 0x7ffffffffL)
                | ((((long) src[18 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[19 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[20 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[21 + srcOff]) >> 1) & 0x7fL);
        dst[ 5 + dstOff] =
                  ((((long) src[21 + srcOff]) << 34) & 0x7ffffffffL)
                | ((((long) src[22 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[23 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[24 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[25 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[26 + srcOff]) >> 6) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[26 + srcOff]) << 29) & 0x7ffffffffL)
                | ((((long) src[27 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[28 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[29 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[30 + srcOff]) >> 3) & 0x1fL);
        dst[ 7 + dstOff] =
                  ((((long) src[30 + srcOff]) << 32) & 0x7ffffffffL)
                | ((((long) src[31 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[32 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[33 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[34 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE36(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[ 1 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[ 2 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 3 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 4 + srcOff]) >> 4) & 0xfL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 32) & 0xfffffffffL)
                | ((((long) src[ 5 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 6 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 7 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 8 + srcOff]) << 0) & 0xffL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[10 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[11 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[12 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[13 + srcOff]) >> 4) & 0xfL);
        dst[ 3 + dstOff] =
                  ((((long) src[13 + srcOff]) << 32) & 0xfffffffffL)
                | ((((long) src[14 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[15 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[16 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[17 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[18 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[19 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[20 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[21 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[22 + srcOff]) >> 4) & 0xfL);
        dst[ 5 + dstOff] =
                  ((((long) src[22 + srcOff]) << 32) & 0xfffffffffL)
                | ((((long) src[23 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[24 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[25 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[26 + srcOff]) << 0) & 0xffL);
        dst[ 6 + dstOff] =
                  ((((long) src[27 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[28 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[29 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[30 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[31 + srcOff]) >> 4) & 0xfL);
        dst[ 7 + dstOff] =
                  ((((long) src[31 + srcOff]) << 32) & 0xfffffffffL)
                | ((((long) src[32 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[33 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[34 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[35 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE37(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[ 1 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[ 2 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[ 3 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[ 4 + srcOff]) >> 3) & 0x1fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 34) & 0x1fffffffffL)
                | ((((long) src[ 5 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[ 6 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[ 7 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 8 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 9 + srcOff]) >> 6) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 31) & 0x1fffffffffL)
                | ((((long) src[10 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[11 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[12 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[13 + srcOff]) >> 1) & 0x7fL);
        dst[ 3 + dstOff] =
                  ((((long) src[13 + srcOff]) << 36) & 0x1fffffffffL)
                | ((((long) src[14 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[15 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[16 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[17 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[18 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[18 + srcOff]) << 33) & 0x1fffffffffL)
                | ((((long) src[19 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[20 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[21 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[22 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[23 + srcOff]) >> 7) & 0x1L);
        dst[ 5 + dstOff] =
                  ((((long) src[23 + srcOff]) << 30) & 0x1fffffffffL)
                | ((((long) src[24 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[25 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[26 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[27 + srcOff]) >> 2) & 0x3fL);
        dst[ 6 + dstOff] =
                  ((((long) src[27 + srcOff]) << 35) & 0x1fffffffffL)
                | ((((long) src[28 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[29 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[30 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[31 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[32 + srcOff]) >> 5) & 0x7L);
        dst[ 7 + dstOff] =
                  ((((long) src[32 + srcOff]) << 32) & 0x1fffffffffL)
                | ((((long) src[33 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[34 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[35 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[36 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE38(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[ 1 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[ 2 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 3 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 4 + srcOff]) >> 2) & 0x3fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 36) & 0x3fffffffffL)
                | ((((long) src[ 5 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[ 6 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[ 7 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 8 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 9 + srcOff]) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 34) & 0x3fffffffffL)
                | ((((long) src[10 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[11 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[12 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[13 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[14 + srcOff]) >> 6) & 0x3L);
        dst[ 3 + dstOff] =
                  ((((long) src[14 + srcOff]) << 32) & 0x3fffffffffL)
                | ((((long) src[15 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[16 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[17 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[18 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[19 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[20 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[21 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[22 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[23 + srcOff]) >> 2) & 0x3fL);
        dst[ 5 + dstOff] =
                  ((((long) src[23 + srcOff]) << 36) & 0x3fffffffffL)
                | ((((long) src[24 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[25 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[26 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[27 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[28 + srcOff]) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[28 + srcOff]) << 34) & 0x3fffffffffL)
                | ((((long) src[29 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[30 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[31 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[32 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[33 + srcOff]) >> 6) & 0x3L);
        dst[ 7 + dstOff] =
                  ((((long) src[33 + srcOff]) << 32) & 0x3fffffffffL)
                | ((((long) src[34 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[35 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[36 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[37 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE39(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[ 1 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[ 2 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[ 3 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[ 4 + srcOff]) >> 1) & 0x7fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 4 + srcOff]) << 38) & 0x7fffffffffL)
                | ((((long) src[ 5 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[ 6 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[ 7 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 8 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 9 + srcOff]) >> 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src[ 9 + srcOff]) << 37) & 0x7fffffffffL)
                | ((((long) src[10 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[11 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[12 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[13 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[14 + srcOff]) >> 3) & 0x1fL);
        dst[ 3 + dstOff] =
                  ((((long) src[14 + srcOff]) << 36) & 0x7fffffffffL)
                | ((((long) src[15 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[16 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[17 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[18 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[19 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[19 + srcOff]) << 35) & 0x7fffffffffL)
                | ((((long) src[20 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[21 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[22 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[23 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[24 + srcOff]) >> 5) & 0x7L);
        dst[ 5 + dstOff] =
                  ((((long) src[24 + srcOff]) << 34) & 0x7fffffffffL)
                | ((((long) src[25 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[26 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[27 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[28 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[29 + srcOff]) >> 6) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[29 + srcOff]) << 33) & 0x7fffffffffL)
                | ((((long) src[30 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[31 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[32 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[33 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[34 + srcOff]) >> 7) & 0x1L);
        dst[ 7 + dstOff] =
                  ((((long) src[34 + srcOff]) << 32) & 0x7fffffffffL)
                | ((((long) src[35 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[36 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[37 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[38 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE40(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 2 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 3 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 4 + srcOff]) << 0) & 0xffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 7 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 8 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 9 + srcOff]) << 0) & 0xffL);
        dst[ 2 + dstOff] =
                  ((((long) src[10 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[11 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[12 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[13 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[14 + srcOff]) << 0) & 0xffL);
        dst[ 3 + dstOff] =
                  ((((long) src[15 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[16 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[17 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[18 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[19 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[20 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[21 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[22 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[23 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[24 + srcOff]) << 0) & 0xffL);
        dst[ 5 + dstOff] =
                  ((((long) src[25 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[26 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[27 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[28 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[29 + srcOff]) << 0) & 0xffL);
        dst[ 6 + dstOff] =
                  ((((long) src[30 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[31 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[32 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[33 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[34 + srcOff]) << 0) & 0xffL);
        dst[ 7 + dstOff] =
                  ((((long) src[35 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[36 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[37 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[38 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[39 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE41(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[ 2 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[ 3 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[ 4 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 5 + srcOff]) >> 7) & 0x1L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 34) & 0x1ffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[ 7 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[ 8 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 9 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[10 + srcOff]) >> 6) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[10 + srcOff]) << 35) & 0x1ffffffffffL)
                | ((((long) src[11 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[12 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[13 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[14 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[15 + srcOff]) >> 5) & 0x7L);
        dst[ 3 + dstOff] =
                  ((((long) src[15 + srcOff]) << 36) & 0x1ffffffffffL)
                | ((((long) src[16 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[17 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[18 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[19 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[20 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[20 + srcOff]) << 37) & 0x1ffffffffffL)
                | ((((long) src[21 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[22 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[23 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[24 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[25 + srcOff]) >> 3) & 0x1fL);
        dst[ 5 + dstOff] =
                  ((((long) src[25 + srcOff]) << 38) & 0x1ffffffffffL)
                | ((((long) src[26 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[27 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[28 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[29 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[30 + srcOff]) >> 2) & 0x3fL);
        dst[ 6 + dstOff] =
                  ((((long) src[30 + srcOff]) << 39) & 0x1ffffffffffL)
                | ((((long) src[31 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[32 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[33 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[34 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[35 + srcOff]) >> 1) & 0x7fL);
        dst[ 7 + dstOff] =
                  ((((long) src[35 + srcOff]) << 40) & 0x1ffffffffffL)
                | ((((long) src[36 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[37 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[38 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[39 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[40 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE42(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[ 2 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[ 3 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 4 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 5 + srcOff]) >> 6) & 0x3L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 36) & 0x3ffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[ 7 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[ 8 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 9 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[10 + srcOff]) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[10 + srcOff]) << 38) & 0x3ffffffffffL)
                | ((((long) src[11 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[12 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[13 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[14 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[15 + srcOff]) >> 2) & 0x3fL);
        dst[ 3 + dstOff] =
                  ((((long) src[15 + srcOff]) << 40) & 0x3ffffffffffL)
                | ((((long) src[16 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[17 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[18 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[19 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[20 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[21 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[22 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[23 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[24 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[25 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[26 + srcOff]) >> 6) & 0x3L);
        dst[ 5 + dstOff] =
                  ((((long) src[26 + srcOff]) << 36) & 0x3ffffffffffL)
                | ((((long) src[27 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[28 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[29 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[30 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[31 + srcOff]) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[31 + srcOff]) << 38) & 0x3ffffffffffL)
                | ((((long) src[32 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[33 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[34 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[35 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[36 + srcOff]) >> 2) & 0x3fL);
        dst[ 7 + dstOff] =
                  ((((long) src[36 + srcOff]) << 40) & 0x3ffffffffffL)
                | ((((long) src[37 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[38 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[39 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[40 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[41 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE43(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[ 2 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[ 3 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[ 4 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 5 + srcOff]) >> 5) & 0x7L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 38) & 0x7ffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[ 7 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[ 8 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 9 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[10 + srcOff]) >> 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src[10 + srcOff]) << 41) & 0x7ffffffffffL)
                | ((((long) src[11 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[12 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[13 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[14 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[15 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[16 + srcOff]) >> 7) & 0x1L);
        dst[ 3 + dstOff] =
                  ((((long) src[16 + srcOff]) << 36) & 0x7ffffffffffL)
                | ((((long) src[17 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[18 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[19 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[20 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[21 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[21 + srcOff]) << 39) & 0x7ffffffffffL)
                | ((((long) src[22 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[23 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[24 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[25 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[26 + srcOff]) >> 1) & 0x7fL);
        dst[ 5 + dstOff] =
                  ((((long) src[26 + srcOff]) << 42) & 0x7ffffffffffL)
                | ((((long) src[27 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[28 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[29 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[30 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[31 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[32 + srcOff]) >> 6) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[32 + srcOff]) << 37) & 0x7ffffffffffL)
                | ((((long) src[33 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[34 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[35 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[36 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[37 + srcOff]) >> 3) & 0x1fL);
        dst[ 7 + dstOff] =
                  ((((long) src[37 + srcOff]) << 40) & 0x7ffffffffffL)
                | ((((long) src[38 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[39 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[40 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[41 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[42 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE44(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[ 2 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[ 3 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 4 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 5 + srcOff]) >> 4) & 0xfL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 40) & 0xfffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 8 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 9 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[10 + srcOff]) << 0) & 0xffL);
        dst[ 2 + dstOff] =
                  ((((long) src[11 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[12 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[13 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[14 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[15 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[16 + srcOff]) >> 4) & 0xfL);
        dst[ 3 + dstOff] =
                  ((((long) src[16 + srcOff]) << 40) & 0xfffffffffffL)
                | ((((long) src[17 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[18 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[19 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[20 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[21 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[22 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[23 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[24 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[25 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[26 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[27 + srcOff]) >> 4) & 0xfL);
        dst[ 5 + dstOff] =
                  ((((long) src[27 + srcOff]) << 40) & 0xfffffffffffL)
                | ((((long) src[28 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[29 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[30 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[31 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[32 + srcOff]) << 0) & 0xffL);
        dst[ 6 + dstOff] =
                  ((((long) src[33 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[34 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[35 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[36 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[37 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[38 + srcOff]) >> 4) & 0xfL);
        dst[ 7 + dstOff] =
                  ((((long) src[38 + srcOff]) << 40) & 0xfffffffffffL)
                | ((((long) src[39 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[40 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[41 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[42 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[43 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE45(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[ 2 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[ 3 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[ 4 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[ 5 + srcOff]) >> 3) & 0x1fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 42) & 0x1fffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[ 8 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[ 9 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[10 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[11 + srcOff]) >> 6) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[11 + srcOff]) << 39) & 0x1fffffffffffL)
                | ((((long) src[12 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[13 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[14 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[15 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[16 + srcOff]) >> 1) & 0x7fL);
        dst[ 3 + dstOff] =
                  ((((long) src[16 + srcOff]) << 44) & 0x1fffffffffffL)
                | ((((long) src[17 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[18 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[19 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[20 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[21 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[22 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[22 + srcOff]) << 41) & 0x1fffffffffffL)
                | ((((long) src[23 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[24 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[25 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[26 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[27 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[28 + srcOff]) >> 7) & 0x1L);
        dst[ 5 + dstOff] =
                  ((((long) src[28 + srcOff]) << 38) & 0x1fffffffffffL)
                | ((((long) src[29 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[30 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[31 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[32 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[33 + srcOff]) >> 2) & 0x3fL);
        dst[ 6 + dstOff] =
                  ((((long) src[33 + srcOff]) << 43) & 0x1fffffffffffL)
                | ((((long) src[34 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[35 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[36 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[37 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[38 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[39 + srcOff]) >> 5) & 0x7L);
        dst[ 7 + dstOff] =
                  ((((long) src[39 + srcOff]) << 40) & 0x1fffffffffffL)
                | ((((long) src[40 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[41 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[42 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[43 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[44 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE46(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[ 2 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[ 3 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 4 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 5 + srcOff]) >> 2) & 0x3fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 44) & 0x3fffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[ 8 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[ 9 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[10 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[11 + srcOff]) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[11 + srcOff]) << 42) & 0x3fffffffffffL)
                | ((((long) src[12 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[13 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[14 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[15 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[16 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[17 + srcOff]) >> 6) & 0x3L);
        dst[ 3 + dstOff] =
                  ((((long) src[17 + srcOff]) << 40) & 0x3fffffffffffL)
                | ((((long) src[18 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[19 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[20 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[21 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[22 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[23 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[24 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[25 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[26 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[27 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[28 + srcOff]) >> 2) & 0x3fL);
        dst[ 5 + dstOff] =
                  ((((long) src[28 + srcOff]) << 44) & 0x3fffffffffffL)
                | ((((long) src[29 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[30 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[31 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[32 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[33 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[34 + srcOff]) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[34 + srcOff]) << 42) & 0x3fffffffffffL)
                | ((((long) src[35 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[36 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[37 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[38 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[39 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[40 + srcOff]) >> 6) & 0x3L);
        dst[ 7 + dstOff] =
                  ((((long) src[40 + srcOff]) << 40) & 0x3fffffffffffL)
                | ((((long) src[41 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[42 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[43 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[44 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[45 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE47(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[ 2 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[ 3 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[ 4 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[ 5 + srcOff]) >> 1) & 0x7fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 5 + srcOff]) << 46) & 0x7fffffffffffL)
                | ((((long) src[ 6 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[ 8 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[ 9 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[10 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[11 + srcOff]) >> 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src[11 + srcOff]) << 45) & 0x7fffffffffffL)
                | ((((long) src[12 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[13 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[14 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[15 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[16 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[17 + srcOff]) >> 3) & 0x1fL);
        dst[ 3 + dstOff] =
                  ((((long) src[17 + srcOff]) << 44) & 0x7fffffffffffL)
                | ((((long) src[18 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[19 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[20 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[21 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[22 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[23 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[23 + srcOff]) << 43) & 0x7fffffffffffL)
                | ((((long) src[24 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[25 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[26 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[27 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[28 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[29 + srcOff]) >> 5) & 0x7L);
        dst[ 5 + dstOff] =
                  ((((long) src[29 + srcOff]) << 42) & 0x7fffffffffffL)
                | ((((long) src[30 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[31 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[32 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[33 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[34 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[35 + srcOff]) >> 6) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[35 + srcOff]) << 41) & 0x7fffffffffffL)
                | ((((long) src[36 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[37 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[38 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[39 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[40 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[41 + srcOff]) >> 7) & 0x1L);
        dst[ 7 + dstOff] =
                  ((((long) src[41 + srcOff]) << 40) & 0x7fffffffffffL)
                | ((((long) src[42 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[43 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[44 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[45 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[46 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE48(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 3 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 4 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 5 + srcOff]) << 0) & 0xffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 8 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 9 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[10 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[11 + srcOff]) << 0) & 0xffL);
        dst[ 2 + dstOff] =
                  ((((long) src[12 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[13 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[14 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[15 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[16 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[17 + srcOff]) << 0) & 0xffL);
        dst[ 3 + dstOff] =
                  ((((long) src[18 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[19 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[20 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[21 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[22 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[23 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[24 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[25 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[26 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[27 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[28 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[29 + srcOff]) << 0) & 0xffL);
        dst[ 5 + dstOff] =
                  ((((long) src[30 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[31 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[32 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[33 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[34 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[35 + srcOff]) << 0) & 0xffL);
        dst[ 6 + dstOff] =
                  ((((long) src[36 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[37 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[38 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[39 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[40 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[41 + srcOff]) << 0) & 0xffL);
        dst[ 7 + dstOff] =
                  ((((long) src[42 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[43 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[44 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[45 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[46 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[47 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE49(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 41) & 0x1ffffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[ 3 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[ 4 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[ 5 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 6 + srcOff]) >> 7) & 0x1L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 42) & 0x1ffffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[ 8 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[ 9 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[10 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[11 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[12 + srcOff]) >> 6) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[12 + srcOff]) << 43) & 0x1ffffffffffffL)
                | ((((long) src[13 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[14 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[15 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[16 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[17 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[18 + srcOff]) >> 5) & 0x7L);
        dst[ 3 + dstOff] =
                  ((((long) src[18 + srcOff]) << 44) & 0x1ffffffffffffL)
                | ((((long) src[19 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[20 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[21 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[22 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[23 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[24 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[24 + srcOff]) << 45) & 0x1ffffffffffffL)
                | ((((long) src[25 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[26 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[27 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[28 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[29 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[30 + srcOff]) >> 3) & 0x1fL);
        dst[ 5 + dstOff] =
                  ((((long) src[30 + srcOff]) << 46) & 0x1ffffffffffffL)
                | ((((long) src[31 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[32 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[33 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[34 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[35 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[36 + srcOff]) >> 2) & 0x3fL);
        dst[ 6 + dstOff] =
                  ((((long) src[36 + srcOff]) << 47) & 0x1ffffffffffffL)
                | ((((long) src[37 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[38 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[39 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[40 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[41 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[42 + srcOff]) >> 1) & 0x7fL);
        dst[ 7 + dstOff] =
                  ((((long) src[42 + srcOff]) << 48) & 0x1ffffffffffffL)
                | ((((long) src[43 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[44 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[45 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[46 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[47 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[48 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE50(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[ 3 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[ 4 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 5 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 6 + srcOff]) >> 6) & 0x3L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 44) & 0x3ffffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[ 8 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[ 9 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[10 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[11 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[12 + srcOff]) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[12 + srcOff]) << 46) & 0x3ffffffffffffL)
                | ((((long) src[13 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[14 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[15 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[16 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[17 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[18 + srcOff]) >> 2) & 0x3fL);
        dst[ 3 + dstOff] =
                  ((((long) src[18 + srcOff]) << 48) & 0x3ffffffffffffL)
                | ((((long) src[19 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[20 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[21 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[22 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[23 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[24 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[25 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[26 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[27 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[28 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[29 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[30 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[31 + srcOff]) >> 6) & 0x3L);
        dst[ 5 + dstOff] =
                  ((((long) src[31 + srcOff]) << 44) & 0x3ffffffffffffL)
                | ((((long) src[32 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[33 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[34 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[35 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[36 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[37 + srcOff]) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[37 + srcOff]) << 46) & 0x3ffffffffffffL)
                | ((((long) src[38 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[39 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[40 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[41 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[42 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[43 + srcOff]) >> 2) & 0x3fL);
        dst[ 7 + dstOff] =
                  ((((long) src[43 + srcOff]) << 48) & 0x3ffffffffffffL)
                | ((((long) src[44 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[45 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[46 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[47 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[48 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[49 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE51(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 43) & 0x7ffffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[ 3 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[ 4 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[ 5 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 6 + srcOff]) >> 5) & 0x7L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 46) & 0x7ffffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[ 8 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[ 9 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[10 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[11 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[12 + srcOff]) >> 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src[12 + srcOff]) << 49) & 0x7ffffffffffffL)
                | ((((long) src[13 + srcOff]) << 41) & 0x1ffffffffffffL)
                | ((((long) src[14 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[15 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[16 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[17 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[18 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[19 + srcOff]) >> 7) & 0x1L);
        dst[ 3 + dstOff] =
                  ((((long) src[19 + srcOff]) << 44) & 0x7ffffffffffffL)
                | ((((long) src[20 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[21 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[22 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[23 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[24 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[25 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[25 + srcOff]) << 47) & 0x7ffffffffffffL)
                | ((((long) src[26 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[27 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[28 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[29 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[30 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[31 + srcOff]) >> 1) & 0x7fL);
        dst[ 5 + dstOff] =
                  ((((long) src[31 + srcOff]) << 50) & 0x7ffffffffffffL)
                | ((((long) src[32 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[33 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[34 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[35 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[36 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[37 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[38 + srcOff]) >> 6) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[38 + srcOff]) << 45) & 0x7ffffffffffffL)
                | ((((long) src[39 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[40 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[41 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[42 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[43 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[44 + srcOff]) >> 3) & 0x1fL);
        dst[ 7 + dstOff] =
                  ((((long) src[44 + srcOff]) << 48) & 0x7ffffffffffffL)
                | ((((long) src[45 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[46 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[47 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[48 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[49 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[50 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE52(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[ 3 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[ 4 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 5 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 6 + srcOff]) >> 4) & 0xfL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 48) & 0xfffffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 8 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 9 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[10 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[11 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[12 + srcOff]) << 0) & 0xffL);
        dst[ 2 + dstOff] =
                  ((((long) src[13 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[14 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[15 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[16 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[17 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[18 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[19 + srcOff]) >> 4) & 0xfL);
        dst[ 3 + dstOff] =
                  ((((long) src[19 + srcOff]) << 48) & 0xfffffffffffffL)
                | ((((long) src[20 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[21 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[22 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[23 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[24 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[25 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[26 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[27 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[28 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[29 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[30 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[31 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[32 + srcOff]) >> 4) & 0xfL);
        dst[ 5 + dstOff] =
                  ((((long) src[32 + srcOff]) << 48) & 0xfffffffffffffL)
                | ((((long) src[33 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[34 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[35 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[36 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[37 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[38 + srcOff]) << 0) & 0xffL);
        dst[ 6 + dstOff] =
                  ((((long) src[39 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[40 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[41 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[42 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[43 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[44 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[45 + srcOff]) >> 4) & 0xfL);
        dst[ 7 + dstOff] =
                  ((((long) src[45 + srcOff]) << 48) & 0xfffffffffffffL)
                | ((((long) src[46 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[47 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[48 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[49 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[50 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[51 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE53(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 45) & 0x1fffffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[ 3 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[ 4 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[ 5 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[ 6 + srcOff]) >> 3) & 0x1fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 50) & 0x1fffffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[ 8 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[ 9 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[10 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[11 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[12 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[13 + srcOff]) >> 6) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[13 + srcOff]) << 47) & 0x1fffffffffffffL)
                | ((((long) src[14 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[15 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[16 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[17 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[18 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[19 + srcOff]) >> 1) & 0x7fL);
        dst[ 3 + dstOff] =
                  ((((long) src[19 + srcOff]) << 52) & 0x1fffffffffffffL)
                | ((((long) src[20 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[21 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[22 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[23 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[24 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[25 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[26 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[26 + srcOff]) << 49) & 0x1fffffffffffffL)
                | ((((long) src[27 + srcOff]) << 41) & 0x1ffffffffffffL)
                | ((((long) src[28 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[29 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[30 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[31 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[32 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[33 + srcOff]) >> 7) & 0x1L);
        dst[ 5 + dstOff] =
                  ((((long) src[33 + srcOff]) << 46) & 0x1fffffffffffffL)
                | ((((long) src[34 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[35 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[36 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[37 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[38 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[39 + srcOff]) >> 2) & 0x3fL);
        dst[ 6 + dstOff] =
                  ((((long) src[39 + srcOff]) << 51) & 0x1fffffffffffffL)
                | ((((long) src[40 + srcOff]) << 43) & 0x7ffffffffffffL)
                | ((((long) src[41 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[42 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[43 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[44 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[45 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[46 + srcOff]) >> 5) & 0x7L);
        dst[ 7 + dstOff] =
                  ((((long) src[46 + srcOff]) << 48) & 0x1fffffffffffffL)
                | ((((long) src[47 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[48 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[49 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[50 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[51 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[52 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE54(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[ 3 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[ 4 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 5 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 6 + srcOff]) >> 2) & 0x3fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 52) & 0x3fffffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[ 8 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[ 9 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[10 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[11 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[12 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[13 + srcOff]) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[13 + srcOff]) << 50) & 0x3fffffffffffffL)
                | ((((long) src[14 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[15 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[16 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[17 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[18 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[19 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[20 + srcOff]) >> 6) & 0x3L);
        dst[ 3 + dstOff] =
                  ((((long) src[20 + srcOff]) << 48) & 0x3fffffffffffffL)
                | ((((long) src[21 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[22 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[23 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[24 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[25 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[26 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[27 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[28 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[29 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[30 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[31 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[32 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[33 + srcOff]) >> 2) & 0x3fL);
        dst[ 5 + dstOff] =
                  ((((long) src[33 + srcOff]) << 52) & 0x3fffffffffffffL)
                | ((((long) src[34 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[35 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[36 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[37 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[38 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[39 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[40 + srcOff]) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[40 + srcOff]) << 50) & 0x3fffffffffffffL)
                | ((((long) src[41 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[42 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[43 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[44 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[45 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[46 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[47 + srcOff]) >> 6) & 0x3L);
        dst[ 7 + dstOff] =
                  ((((long) src[47 + srcOff]) << 48) & 0x3fffffffffffffL)
                | ((((long) src[48 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[49 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[50 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[51 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[52 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[53 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE55(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 47) & 0x7fffffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[ 3 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[ 4 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[ 5 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[ 6 + srcOff]) >> 1) & 0x7fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 6 + srcOff]) << 54) & 0x7fffffffffffffL)
                | ((((long) src[ 7 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[ 8 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[ 9 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[10 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[11 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[12 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[13 + srcOff]) >> 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src[13 + srcOff]) << 53) & 0x7fffffffffffffL)
                | ((((long) src[14 + srcOff]) << 45) & 0x1fffffffffffffL)
                | ((((long) src[15 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[16 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[17 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[18 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[19 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[20 + srcOff]) >> 3) & 0x1fL);
        dst[ 3 + dstOff] =
                  ((((long) src[20 + srcOff]) << 52) & 0x7fffffffffffffL)
                | ((((long) src[21 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[22 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[23 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[24 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[25 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[26 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[27 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[27 + srcOff]) << 51) & 0x7fffffffffffffL)
                | ((((long) src[28 + srcOff]) << 43) & 0x7ffffffffffffL)
                | ((((long) src[29 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[30 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[31 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[32 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[33 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[34 + srcOff]) >> 5) & 0x7L);
        dst[ 5 + dstOff] =
                  ((((long) src[34 + srcOff]) << 50) & 0x7fffffffffffffL)
                | ((((long) src[35 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[36 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[37 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[38 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[39 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[40 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[41 + srcOff]) >> 6) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[41 + srcOff]) << 49) & 0x7fffffffffffffL)
                | ((((long) src[42 + srcOff]) << 41) & 0x1ffffffffffffL)
                | ((((long) src[43 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[44 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[45 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[46 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[47 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[48 + srcOff]) >> 7) & 0x1L);
        dst[ 7 + dstOff] =
                  ((((long) src[48 + srcOff]) << 48) & 0x7fffffffffffffL)
                | ((((long) src[49 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[50 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[51 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[52 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[53 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[54 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE56(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 3 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 4 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 5 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 6 + srcOff]) << 0) & 0xffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[ 8 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 9 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[10 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[11 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[12 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[13 + srcOff]) << 0) & 0xffL);
        dst[ 2 + dstOff] =
                  ((((long) src[14 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[15 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[16 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[17 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[18 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[19 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[20 + srcOff]) << 0) & 0xffL);
        dst[ 3 + dstOff] =
                  ((((long) src[21 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[22 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[23 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[24 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[25 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[26 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[27 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[28 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[29 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[30 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[31 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[32 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[33 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[34 + srcOff]) << 0) & 0xffL);
        dst[ 5 + dstOff] =
                  ((((long) src[35 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[36 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[37 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[38 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[39 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[40 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[41 + srcOff]) << 0) & 0xffL);
        dst[ 6 + dstOff] =
                  ((((long) src[42 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[43 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[44 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[45 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[46 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[47 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[48 + srcOff]) << 0) & 0xffL);
        dst[ 7 + dstOff] =
                  ((((long) src[49 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[50 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[51 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[52 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[53 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[54 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[55 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE57(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 49) & 0x1ffffffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 41) & 0x1ffffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[ 3 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[ 4 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[ 5 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[ 6 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[ 7 + srcOff]) >> 7) & 0x1L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 50) & 0x1ffffffffffffffL)
                | ((((long) src[ 8 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[ 9 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[10 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[11 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[12 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[13 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[14 + srcOff]) >> 6) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[14 + srcOff]) << 51) & 0x1ffffffffffffffL)
                | ((((long) src[15 + srcOff]) << 43) & 0x7ffffffffffffL)
                | ((((long) src[16 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[17 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[18 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[19 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[20 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[21 + srcOff]) >> 5) & 0x7L);
        dst[ 3 + dstOff] =
                  ((((long) src[21 + srcOff]) << 52) & 0x1ffffffffffffffL)
                | ((((long) src[22 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[23 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[24 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[25 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[26 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[27 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[28 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[28 + srcOff]) << 53) & 0x1ffffffffffffffL)
                | ((((long) src[29 + srcOff]) << 45) & 0x1fffffffffffffL)
                | ((((long) src[30 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[31 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[32 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[33 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[34 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[35 + srcOff]) >> 3) & 0x1fL);
        dst[ 5 + dstOff] =
                  ((((long) src[35 + srcOff]) << 54) & 0x1ffffffffffffffL)
                | ((((long) src[36 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[37 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[38 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[39 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[40 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[41 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[42 + srcOff]) >> 2) & 0x3fL);
        dst[ 6 + dstOff] =
                  ((((long) src[42 + srcOff]) << 55) & 0x1ffffffffffffffL)
                | ((((long) src[43 + srcOff]) << 47) & 0x7fffffffffffffL)
                | ((((long) src[44 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[45 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[46 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[47 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[48 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[49 + srcOff]) >> 1) & 0x7fL);
        dst[ 7 + dstOff] =
                  ((((long) src[49 + srcOff]) << 56) & 0x1ffffffffffffffL)
                | ((((long) src[50 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[51 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[52 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[53 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[54 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[55 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[56 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE58(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 50) & 0x3ffffffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[ 3 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[ 4 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[ 5 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[ 6 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[ 7 + srcOff]) >> 6) & 0x3L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 52) & 0x3ffffffffffffffL)
                | ((((long) src[ 8 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[ 9 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[10 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[11 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[12 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[13 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[14 + srcOff]) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[14 + srcOff]) << 54) & 0x3ffffffffffffffL)
                | ((((long) src[15 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[16 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[17 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[18 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[19 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[20 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[21 + srcOff]) >> 2) & 0x3fL);
        dst[ 3 + dstOff] =
                  ((((long) src[21 + srcOff]) << 56) & 0x3ffffffffffffffL)
                | ((((long) src[22 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[23 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[24 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[25 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[26 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[27 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[28 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[29 + srcOff]) << 50) & 0x3ffffffffffffffL)
                | ((((long) src[30 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[31 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[32 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[33 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[34 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[35 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[36 + srcOff]) >> 6) & 0x3L);
        dst[ 5 + dstOff] =
                  ((((long) src[36 + srcOff]) << 52) & 0x3ffffffffffffffL)
                | ((((long) src[37 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[38 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[39 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[40 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[41 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[42 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[43 + srcOff]) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[43 + srcOff]) << 54) & 0x3ffffffffffffffL)
                | ((((long) src[44 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[45 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[46 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[47 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[48 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[49 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[50 + srcOff]) >> 2) & 0x3fL);
        dst[ 7 + dstOff] =
                  ((((long) src[50 + srcOff]) << 56) & 0x3ffffffffffffffL)
                | ((((long) src[51 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[52 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[53 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[54 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[55 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[56 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[57 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE59(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 51) & 0x7ffffffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 43) & 0x7ffffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[ 3 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[ 4 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[ 5 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[ 6 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[ 7 + srcOff]) >> 5) & 0x7L);
        dst[ 1 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 54) & 0x7ffffffffffffffL)
                | ((((long) src[ 8 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[ 9 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[10 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[11 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[12 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[13 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[14 + srcOff]) >> 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src[14 + srcOff]) << 57) & 0x7ffffffffffffffL)
                | ((((long) src[15 + srcOff]) << 49) & 0x1ffffffffffffffL)
                | ((((long) src[16 + srcOff]) << 41) & 0x1ffffffffffffL)
                | ((((long) src[17 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[18 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[19 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[20 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[21 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[22 + srcOff]) >> 7) & 0x1L);
        dst[ 3 + dstOff] =
                  ((((long) src[22 + srcOff]) << 52) & 0x7ffffffffffffffL)
                | ((((long) src[23 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[24 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[25 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[26 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[27 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[28 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[29 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[29 + srcOff]) << 55) & 0x7ffffffffffffffL)
                | ((((long) src[30 + srcOff]) << 47) & 0x7fffffffffffffL)
                | ((((long) src[31 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[32 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[33 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[34 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[35 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[36 + srcOff]) >> 1) & 0x7fL);
        dst[ 5 + dstOff] =
                  ((((long) src[36 + srcOff]) << 58) & 0x7ffffffffffffffL)
                | ((((long) src[37 + srcOff]) << 50) & 0x3ffffffffffffffL)
                | ((((long) src[38 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[39 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[40 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[41 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[42 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[43 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[44 + srcOff]) >> 6) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[44 + srcOff]) << 53) & 0x7ffffffffffffffL)
                | ((((long) src[45 + srcOff]) << 45) & 0x1fffffffffffffL)
                | ((((long) src[46 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[47 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[48 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[49 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[50 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[51 + srcOff]) >> 3) & 0x1fL);
        dst[ 7 + dstOff] =
                  ((((long) src[51 + srcOff]) << 56) & 0x7ffffffffffffffL)
                | ((((long) src[52 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[53 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[54 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[55 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[56 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[57 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[58 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE60(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 52) & 0xfffffffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[ 3 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[ 4 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[ 5 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[ 6 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[ 7 + srcOff]) >> 4) & 0xfL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 56) & 0xfffffffffffffffL)
                | ((((long) src[ 8 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[ 9 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[10 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[11 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[12 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[13 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[14 + srcOff]) << 0) & 0xffL);
        dst[ 2 + dstOff] =
                  ((((long) src[15 + srcOff]) << 52) & 0xfffffffffffffffL)
                | ((((long) src[16 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[17 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[18 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[19 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[20 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[21 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[22 + srcOff]) >> 4) & 0xfL);
        dst[ 3 + dstOff] =
                  ((((long) src[22 + srcOff]) << 56) & 0xfffffffffffffffL)
                | ((((long) src[23 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[24 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[25 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[26 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[27 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[28 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[29 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[30 + srcOff]) << 52) & 0xfffffffffffffffL)
                | ((((long) src[31 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[32 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[33 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[34 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[35 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[36 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[37 + srcOff]) >> 4) & 0xfL);
        dst[ 5 + dstOff] =
                  ((((long) src[37 + srcOff]) << 56) & 0xfffffffffffffffL)
                | ((((long) src[38 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[39 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[40 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[41 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[42 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[43 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[44 + srcOff]) << 0) & 0xffL);
        dst[ 6 + dstOff] =
                  ((((long) src[45 + srcOff]) << 52) & 0xfffffffffffffffL)
                | ((((long) src[46 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[47 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[48 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[49 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[50 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[51 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[52 + srcOff]) >> 4) & 0xfL);
        dst[ 7 + dstOff] =
                  ((((long) src[52 + srcOff]) << 56) & 0xfffffffffffffffL)
                | ((((long) src[53 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[54 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[55 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[56 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[57 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[58 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[59 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE61(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 53) & 0x1fffffffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 45) & 0x1fffffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[ 3 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[ 4 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[ 5 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[ 6 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[ 7 + srcOff]) >> 3) & 0x1fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 58) & 0x1fffffffffffffffL)
                | ((((long) src[ 8 + srcOff]) << 50) & 0x3ffffffffffffffL)
                | ((((long) src[ 9 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[10 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[11 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[12 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[13 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[14 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[15 + srcOff]) >> 6) & 0x3L);
        dst[ 2 + dstOff] =
                  ((((long) src[15 + srcOff]) << 55) & 0x1fffffffffffffffL)
                | ((((long) src[16 + srcOff]) << 47) & 0x7fffffffffffffL)
                | ((((long) src[17 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[18 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[19 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[20 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[21 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[22 + srcOff]) >> 1) & 0x7fL);
        dst[ 3 + dstOff] =
                  ((((long) src[22 + srcOff]) << 60) & 0x1fffffffffffffffL)
                | ((((long) src[23 + srcOff]) << 52) & 0xfffffffffffffffL)
                | ((((long) src[24 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[25 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[26 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[27 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[28 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[29 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[30 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[30 + srcOff]) << 57) & 0x1fffffffffffffffL)
                | ((((long) src[31 + srcOff]) << 49) & 0x1ffffffffffffffL)
                | ((((long) src[32 + srcOff]) << 41) & 0x1ffffffffffffL)
                | ((((long) src[33 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[34 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[35 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[36 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[37 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[38 + srcOff]) >> 7) & 0x1L);
        dst[ 5 + dstOff] =
                  ((((long) src[38 + srcOff]) << 54) & 0x1fffffffffffffffL)
                | ((((long) src[39 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[40 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[41 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[42 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[43 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[44 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[45 + srcOff]) >> 2) & 0x3fL);
        dst[ 6 + dstOff] =
                  ((((long) src[45 + srcOff]) << 59) & 0x1fffffffffffffffL)
                | ((((long) src[46 + srcOff]) << 51) & 0x7ffffffffffffffL)
                | ((((long) src[47 + srcOff]) << 43) & 0x7ffffffffffffL)
                | ((((long) src[48 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[49 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[50 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[51 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[52 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[53 + srcOff]) >> 5) & 0x7L);
        dst[ 7 + dstOff] =
                  ((((long) src[53 + srcOff]) << 56) & 0x1fffffffffffffffL)
                | ((((long) src[54 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[55 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[56 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[57 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[58 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[59 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[60 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE62(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 54) & 0x3fffffffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[ 3 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[ 4 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[ 5 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[ 6 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[ 7 + srcOff]) >> 2) & 0x3fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 60) & 0x3fffffffffffffffL)
                | ((((long) src[ 8 + srcOff]) << 52) & 0xfffffffffffffffL)
                | ((((long) src[ 9 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[10 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[11 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[12 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[13 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[14 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[15 + srcOff]) >> 4) & 0xfL);
        dst[ 2 + dstOff] =
                  ((((long) src[15 + srcOff]) << 58) & 0x3fffffffffffffffL)
                | ((((long) src[16 + srcOff]) << 50) & 0x3ffffffffffffffL)
                | ((((long) src[17 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[18 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[19 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[20 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[21 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[22 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[23 + srcOff]) >> 6) & 0x3L);
        dst[ 3 + dstOff] =
                  ((((long) src[23 + srcOff]) << 56) & 0x3fffffffffffffffL)
                | ((((long) src[24 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[25 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[26 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[27 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[28 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[29 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[30 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[31 + srcOff]) << 54) & 0x3fffffffffffffffL)
                | ((((long) src[32 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[33 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[34 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[35 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[36 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[37 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[38 + srcOff]) >> 2) & 0x3fL);
        dst[ 5 + dstOff] =
                  ((((long) src[38 + srcOff]) << 60) & 0x3fffffffffffffffL)
                | ((((long) src[39 + srcOff]) << 52) & 0xfffffffffffffffL)
                | ((((long) src[40 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[41 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[42 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[43 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[44 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[45 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[46 + srcOff]) >> 4) & 0xfL);
        dst[ 6 + dstOff] =
                  ((((long) src[46 + srcOff]) << 58) & 0x3fffffffffffffffL)
                | ((((long) src[47 + srcOff]) << 50) & 0x3ffffffffffffffL)
                | ((((long) src[48 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[49 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[50 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[51 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[52 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[53 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[54 + srcOff]) >> 6) & 0x3L);
        dst[ 7 + dstOff] =
                  ((((long) src[54 + srcOff]) << 56) & 0x3fffffffffffffffL)
                | ((((long) src[55 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[56 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[57 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[58 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[59 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[60 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[61 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE63(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 55) & 0x7fffffffffffffffL)
                | ((((long) src[ 1 + srcOff]) << 47) & 0x7fffffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 39) & 0x7fffffffffffL)
                | ((((long) src[ 3 + srcOff]) << 31) & 0x7fffffffffL)
                | ((((long) src[ 4 + srcOff]) << 23) & 0x7fffffffL)
                | ((((long) src[ 5 + srcOff]) << 15) & 0x7fffffL)
                | ((((long) src[ 6 + srcOff]) << 7) & 0x7fffL)
                | ((((long) src[ 7 + srcOff]) >> 1) & 0x7fL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 7 + srcOff]) << 62) & 0x7fffffffffffffffL)
                | ((((long) src[ 8 + srcOff]) << 54) & 0x3fffffffffffffffL)
                | ((((long) src[ 9 + srcOff]) << 46) & 0x3fffffffffffffL)
                | ((((long) src[10 + srcOff]) << 38) & 0x3fffffffffffL)
                | ((((long) src[11 + srcOff]) << 30) & 0x3fffffffffL)
                | ((((long) src[12 + srcOff]) << 22) & 0x3fffffffL)
                | ((((long) src[13 + srcOff]) << 14) & 0x3fffffL)
                | ((((long) src[14 + srcOff]) << 6) & 0x3fffL)
                | ((((long) src[15 + srcOff]) >> 2) & 0x3fL);
        dst[ 2 + dstOff] =
                  ((((long) src[15 + srcOff]) << 61) & 0x7fffffffffffffffL)
                | ((((long) src[16 + srcOff]) << 53) & 0x1fffffffffffffffL)
                | ((((long) src[17 + srcOff]) << 45) & 0x1fffffffffffffL)
                | ((((long) src[18 + srcOff]) << 37) & 0x1fffffffffffL)
                | ((((long) src[19 + srcOff]) << 29) & 0x1fffffffffL)
                | ((((long) src[20 + srcOff]) << 21) & 0x1fffffffL)
                | ((((long) src[21 + srcOff]) << 13) & 0x1fffffL)
                | ((((long) src[22 + srcOff]) << 5) & 0x1fffL)
                | ((((long) src[23 + srcOff]) >> 3) & 0x1fL);
        dst[ 3 + dstOff] =
                  ((((long) src[23 + srcOff]) << 60) & 0x7fffffffffffffffL)
                | ((((long) src[24 + srcOff]) << 52) & 0xfffffffffffffffL)
                | ((((long) src[25 + srcOff]) << 44) & 0xfffffffffffffL)
                | ((((long) src[26 + srcOff]) << 36) & 0xfffffffffffL)
                | ((((long) src[27 + srcOff]) << 28) & 0xfffffffffL)
                | ((((long) src[28 + srcOff]) << 20) & 0xfffffffL)
                | ((((long) src[29 + srcOff]) << 12) & 0xfffffL)
                | ((((long) src[30 + srcOff]) << 4) & 0xfffL)
                | ((((long) src[31 + srcOff]) >> 4) & 0xfL);
        dst[ 4 + dstOff] =
                  ((((long) src[31 + srcOff]) << 59) & 0x7fffffffffffffffL)
                | ((((long) src[32 + srcOff]) << 51) & 0x7ffffffffffffffL)
                | ((((long) src[33 + srcOff]) << 43) & 0x7ffffffffffffL)
                | ((((long) src[34 + srcOff]) << 35) & 0x7ffffffffffL)
                | ((((long) src[35 + srcOff]) << 27) & 0x7ffffffffL)
                | ((((long) src[36 + srcOff]) << 19) & 0x7ffffffL)
                | ((((long) src[37 + srcOff]) << 11) & 0x7ffffL)
                | ((((long) src[38 + srcOff]) << 3) & 0x7ffL)
                | ((((long) src[39 + srcOff]) >> 5) & 0x7L);
        dst[ 5 + dstOff] =
                  ((((long) src[39 + srcOff]) << 58) & 0x7fffffffffffffffL)
                | ((((long) src[40 + srcOff]) << 50) & 0x3ffffffffffffffL)
                | ((((long) src[41 + srcOff]) << 42) & 0x3ffffffffffffL)
                | ((((long) src[42 + srcOff]) << 34) & 0x3ffffffffffL)
                | ((((long) src[43 + srcOff]) << 26) & 0x3ffffffffL)
                | ((((long) src[44 + srcOff]) << 18) & 0x3ffffffL)
                | ((((long) src[45 + srcOff]) << 10) & 0x3ffffL)
                | ((((long) src[46 + srcOff]) << 2) & 0x3ffL)
                | ((((long) src[47 + srcOff]) >> 6) & 0x3L);
        dst[ 6 + dstOff] =
                  ((((long) src[47 + srcOff]) << 57) & 0x7fffffffffffffffL)
                | ((((long) src[48 + srcOff]) << 49) & 0x1ffffffffffffffL)
                | ((((long) src[49 + srcOff]) << 41) & 0x1ffffffffffffL)
                | ((((long) src[50 + srcOff]) << 33) & 0x1ffffffffffL)
                | ((((long) src[51 + srcOff]) << 25) & 0x1ffffffffL)
                | ((((long) src[52 + srcOff]) << 17) & 0x1ffffffL)
                | ((((long) src[53 + srcOff]) << 9) & 0x1ffffL)
                | ((((long) src[54 + srcOff]) << 1) & 0x1ffL)
                | ((((long) src[55 + srcOff]) >> 7) & 0x1L);
        dst[ 7 + dstOff] =
                  ((((long) src[55 + srcOff]) << 56) & 0x7fffffffffffffffL)
                | ((((long) src[56 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[57 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[58 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[59 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[60 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[61 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[62 + srcOff]) << 0) & 0xffL);
    }

    public static void bitUnpack8LongBE64(byte[] src, int srcOff, long[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((long) src[ 0 + srcOff]) << 56) & -1L)
                | ((((long) src[ 1 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[ 2 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[ 3 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[ 4 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[ 5 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[ 6 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[ 7 + srcOff]) << 0) & 0xffL);
        dst[ 1 + dstOff] =
                  ((((long) src[ 8 + srcOff]) << 56) & -1L)
                | ((((long) src[ 9 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[10 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[11 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[12 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[13 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[14 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[15 + srcOff]) << 0) & 0xffL);
        dst[ 2 + dstOff] =
                  ((((long) src[16 + srcOff]) << 56) & -1L)
                | ((((long) src[17 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[18 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[19 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[20 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[21 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[22 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[23 + srcOff]) << 0) & 0xffL);
        dst[ 3 + dstOff] =
                  ((((long) src[24 + srcOff]) << 56) & -1L)
                | ((((long) src[25 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[26 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[27 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[28 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[29 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[30 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[31 + srcOff]) << 0) & 0xffL);
        dst[ 4 + dstOff] =
                  ((((long) src[32 + srcOff]) << 56) & -1L)
                | ((((long) src[33 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[34 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[35 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[36 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[37 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[38 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[39 + srcOff]) << 0) & 0xffL);
        dst[ 5 + dstOff] =
                  ((((long) src[40 + srcOff]) << 56) & -1L)
                | ((((long) src[41 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[42 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[43 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[44 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[45 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[46 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[47 + srcOff]) << 0) & 0xffL);
        dst[ 6 + dstOff] =
                  ((((long) src[48 + srcOff]) << 56) & -1L)
                | ((((long) src[49 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[50 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[51 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[52 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[53 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[54 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[55 + srcOff]) << 0) & 0xffL);
        dst[ 7 + dstOff] =
                  ((((long) src[56 + srcOff]) << 56) & -1L)
                | ((((long) src[57 + srcOff]) << 48) & 0xffffffffffffffL)
                | ((((long) src[58 + srcOff]) << 40) & 0xffffffffffffL)
                | ((((long) src[59 + srcOff]) << 32) & 0xffffffffffL)
                | ((((long) src[60 + srcOff]) << 24) & 0xffffffffL)
                | ((((long) src[61 + srcOff]) << 16) & 0xffffffL)
                | ((((long) src[62 + srcOff]) << 8) & 0xffffL)
                | ((((long) src[63 + srcOff]) << 0) & 0xffL);
    }

}
