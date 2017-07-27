package io.github.nz4;

import java.util.function.IntToLongFunction;

final class BitUnpacking8IntLE
{
    private BitUnpacking8IntLE()
    { }

    public static void unpack(byte[] src, int srcOff, int[] dst, int dstOff, int bits)
    {
        switch (bits) {
        case 0:
            // do nothing
            break;
        case 1:
            bitUnpack8IntLE1(src, srcOff, dst, dstOff);
            break;
        case 2:
            bitUnpack8IntLE2(src, srcOff, dst, dstOff);
            break;
        case 3:
            bitUnpack8IntLE3(src, srcOff, dst, dstOff);
            break;
        case 4:
            bitUnpack8IntLE4(src, srcOff, dst, dstOff);
            break;
        case 5:
            bitUnpack8IntLE5(src, srcOff, dst, dstOff);
            break;
        case 6:
            bitUnpack8IntLE6(src, srcOff, dst, dstOff);
            break;
        case 7:
            bitUnpack8IntLE7(src, srcOff, dst, dstOff);
            break;
        case 8:
            bitUnpack8IntLE8(src, srcOff, dst, dstOff);
            break;
        case 9:
            bitUnpack8IntLE9(src, srcOff, dst, dstOff);
            break;
        case 10:
            bitUnpack8IntLE10(src, srcOff, dst, dstOff);
            break;
        case 11:
            bitUnpack8IntLE11(src, srcOff, dst, dstOff);
            break;
        case 12:
            bitUnpack8IntLE12(src, srcOff, dst, dstOff);
            break;
        case 13:
            bitUnpack8IntLE13(src, srcOff, dst, dstOff);
            break;
        case 14:
            bitUnpack8IntLE14(src, srcOff, dst, dstOff);
            break;
        case 15:
            bitUnpack8IntLE15(src, srcOff, dst, dstOff);
            break;
        case 16:
            bitUnpack8IntLE16(src, srcOff, dst, dstOff);
            break;
        case 17:
            bitUnpack8IntLE17(src, srcOff, dst, dstOff);
            break;
        case 18:
            bitUnpack8IntLE18(src, srcOff, dst, dstOff);
            break;
        case 19:
            bitUnpack8IntLE19(src, srcOff, dst, dstOff);
            break;
        case 20:
            bitUnpack8IntLE20(src, srcOff, dst, dstOff);
            break;
        case 21:
            bitUnpack8IntLE21(src, srcOff, dst, dstOff);
            break;
        case 22:
            bitUnpack8IntLE22(src, srcOff, dst, dstOff);
            break;
        case 23:
            bitUnpack8IntLE23(src, srcOff, dst, dstOff);
            break;
        case 24:
            bitUnpack8IntLE24(src, srcOff, dst, dstOff);
            break;
        case 25:
            bitUnpack8IntLE25(src, srcOff, dst, dstOff);
            break;
        case 26:
            bitUnpack8IntLE26(src, srcOff, dst, dstOff);
            break;
        case 27:
            bitUnpack8IntLE27(src, srcOff, dst, dstOff);
            break;
        case 28:
            bitUnpack8IntLE28(src, srcOff, dst, dstOff);
            break;
        case 29:
            bitUnpack8IntLE29(src, srcOff, dst, dstOff);
            break;
        case 30:
            bitUnpack8IntLE30(src, srcOff, dst, dstOff);
            break;
        case 31:
            bitUnpack8IntLE31(src, srcOff, dst, dstOff);
            break;
        case 32:
            bitUnpack8IntLE32(src, srcOff, dst, dstOff);
            break;
        default:
            throw new IllegalArgumentException("Bit width must be from 0 to 32 but got " + bits);
        }
    }

    public static void bitUnpack8IntLE1(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0x1);
        dst[ 1 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 1) & 0x1);
        dst[ 2 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 2) & 0x1);
        dst[ 3 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 3) & 0x1);
        dst[ 4 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 4) & 0x1);
        dst[ 5 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 5) & 0x1);
        dst[ 6 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 6) & 0x1);
        dst[ 7 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 7) & 0x1);
    }

    public static void bitUnpack8IntLE2(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0x3);
        dst[ 1 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 2) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 4) & 0x3);
        dst[ 3 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 6) & 0x3);
        dst[ 4 + dstOff] =
                  ((((int) src[ 1 + srcOff]) << 0) & 0x3);
        dst[ 5 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 2) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 4) & 0x3);
        dst[ 7 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 6) & 0x3);
    }

    public static void bitUnpack8IntLE3(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0x7);
        dst[ 1 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 3) & 0x7);
        dst[ 2 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 1 + srcOff]) << 2) & 0x7);
        dst[ 3 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 1) & 0x7);
        dst[ 4 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 4) & 0x7);
        dst[ 5 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 7) & 0x1)
                | ((((int) src[ 2 + srcOff]) << 1) & 0x7);
        dst[ 6 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 2) & 0x7);
        dst[ 7 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 5) & 0x7);
    }

    public static void bitUnpack8IntLE4(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xf);
        dst[ 1 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 4) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src[ 1 + srcOff]) << 0) & 0xf);
        dst[ 3 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 0) & 0xf);
        dst[ 5 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 4) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 0) & 0xf);
        dst[ 7 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 4) & 0xf);
    }

    public static void bitUnpack8IntLE5(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0x1f);
        dst[ 1 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 5) & 0x7)
                | ((((int) src[ 1 + srcOff]) << 3) & 0x1f);
        dst[ 2 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 2) & 0x1f);
        dst[ 3 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 7) & 0x1)
                | ((((int) src[ 2 + srcOff]) << 1) & 0x1f);
        dst[ 4 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 3 + srcOff]) << 4) & 0x1f);
        dst[ 5 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 1) & 0x1f);
        dst[ 6 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 4 + srcOff]) << 2) & 0x1f);
        dst[ 7 + dstOff] =
                  ((((int) src[ 4 + srcOff]) >> 3) & 0x1f);
    }

    public static void bitUnpack8IntLE6(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0x3f);
        dst[ 1 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 1 + srcOff]) << 2) & 0x3f);
        dst[ 2 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 2 + srcOff]) << 4) & 0x3f);
        dst[ 3 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 2) & 0x3f);
        dst[ 4 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 0) & 0x3f);
        dst[ 5 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 4 + srcOff]) << 2) & 0x3f);
        dst[ 6 + dstOff] =
                  ((((int) src[ 4 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 5 + srcOff]) << 4) & 0x3f);
        dst[ 7 + dstOff] =
                  ((((int) src[ 5 + srcOff]) >> 2) & 0x3f);
    }

    public static void bitUnpack8IntLE7(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0x7f);
        dst[ 1 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 7) & 0x1)
                | ((((int) src[ 1 + srcOff]) << 1) & 0x7f);
        dst[ 2 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 2 + srcOff]) << 2) & 0x7f);
        dst[ 3 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 5) & 0x7)
                | ((((int) src[ 3 + srcOff]) << 3) & 0x7f);
        dst[ 4 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 4 + srcOff]) << 4) & 0x7f);
        dst[ 5 + dstOff] =
                  ((((int) src[ 4 + srcOff]) >> 3) & 0x1f)
                | ((((int) src[ 5 + srcOff]) << 5) & 0x7f);
        dst[ 6 + dstOff] =
                  ((((int) src[ 5 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[ 6 + srcOff]) << 6) & 0x7f);
        dst[ 7 + dstOff] =
                  ((((int) src[ 6 + srcOff]) >> 1) & 0x7f);
    }

    public static void bitUnpack8IntLE8(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 1 + srcOff]) << 0) & 0xff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 0) & 0xff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 4 + srcOff]) << 0) & 0xff);
        dst[ 5 + dstOff] =
                  ((((int) src[ 5 + srcOff]) << 0) & 0xff);
        dst[ 6 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 0) & 0xff);
        dst[ 7 + dstOff] =
                  ((((int) src[ 7 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntLE9(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0x1ff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 1) & 0x7f)
                | ((((int) src[ 2 + srcOff]) << 7) & 0x1ff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[ 3 + srcOff]) << 6) & 0x1ff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 3) & 0x1f)
                | ((((int) src[ 4 + srcOff]) << 5) & 0x1ff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 4 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 5 + srcOff]) << 4) & 0x1ff);
        dst[ 5 + dstOff] =
                  ((((int) src[ 5 + srcOff]) >> 5) & 0x7)
                | ((((int) src[ 6 + srcOff]) << 3) & 0x1ff);
        dst[ 6 + dstOff] =
                  ((((int) src[ 6 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 7 + srcOff]) << 2) & 0x1ff);
        dst[ 7 + dstOff] =
                  ((((int) src[ 7 + srcOff]) >> 7) & 0x1)
                | ((((int) src[ 8 + srcOff]) << 1) & 0x1ff);
    }

    public static void bitUnpack8IntLE10(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0x3ff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[ 2 + srcOff]) << 6) & 0x3ff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 3 + srcOff]) << 4) & 0x3ff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 4 + srcOff]) << 2) & 0x3ff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 5 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 6 + srcOff]) << 8) & 0x3ff);
        dst[ 5 + dstOff] =
                  ((((int) src[ 6 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[ 7 + srcOff]) << 6) & 0x3ff);
        dst[ 6 + dstOff] =
                  ((((int) src[ 7 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 8 + srcOff]) << 4) & 0x3ff);
        dst[ 7 + dstOff] =
                  ((((int) src[ 8 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 9 + srcOff]) << 2) & 0x3ff);
    }

    public static void bitUnpack8IntLE11(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0x7ff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 3) & 0x1f)
                | ((((int) src[ 2 + srcOff]) << 5) & 0x7ff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 3 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 4 + srcOff]) << 10) & 0x7ff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 4 + srcOff]) >> 1) & 0x7f)
                | ((((int) src[ 5 + srcOff]) << 7) & 0x7ff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 5 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 6 + srcOff]) << 4) & 0x7ff);
        dst[ 5 + dstOff] =
                  ((((int) src[ 6 + srcOff]) >> 7) & 0x1)
                | ((((int) src[ 7 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[ 8 + srcOff]) << 9) & 0x7ff);
        dst[ 6 + dstOff] =
                  ((((int) src[ 8 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[ 9 + srcOff]) << 6) & 0x7ff);
        dst[ 7 + dstOff] =
                  ((((int) src[ 9 + srcOff]) >> 5) & 0x7)
                | ((((int) src[10 + srcOff]) << 3) & 0x7ff);
    }

    public static void bitUnpack8IntLE12(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xfff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 2 + srcOff]) << 4) & 0xfff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 4 + srcOff]) << 8) & 0xfff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 4 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 5 + srcOff]) << 4) & 0xfff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 7 + srcOff]) << 8) & 0xfff);
        dst[ 5 + dstOff] =
                  ((((int) src[ 7 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 8 + srcOff]) << 4) & 0xfff);
        dst[ 6 + dstOff] =
                  ((((int) src[ 9 + srcOff]) << 0) & 0xff)
                | ((((int) src[10 + srcOff]) << 8) & 0xfff);
        dst[ 7 + dstOff] =
                  ((((int) src[10 + srcOff]) >> 4) & 0xf)
                | ((((int) src[11 + srcOff]) << 4) & 0xfff);
    }

    public static void bitUnpack8IntLE13(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0x1fff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 5) & 0x7)
                | ((((int) src[ 2 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[ 3 + srcOff]) << 11) & 0x1fff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[ 4 + srcOff]) << 6) & 0x1fff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 4 + srcOff]) >> 7) & 0x1)
                | ((((int) src[ 5 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[ 6 + srcOff]) << 9) & 0x1fff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 6 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 7 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 8 + srcOff]) << 12) & 0x1fff);
        dst[ 5 + dstOff] =
                  ((((int) src[ 8 + srcOff]) >> 1) & 0x7f)
                | ((((int) src[ 9 + srcOff]) << 7) & 0x1fff);
        dst[ 6 + dstOff] =
                  ((((int) src[ 9 + srcOff]) >> 6) & 0x3)
                | ((((int) src[10 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[11 + srcOff]) << 10) & 0x1fff);
        dst[ 7 + dstOff] =
                  ((((int) src[11 + srcOff]) >> 3) & 0x1f)
                | ((((int) src[12 + srcOff]) << 5) & 0x1fff);
    }

    public static void bitUnpack8IntLE14(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0x3fff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 2 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 3 + srcOff]) << 10) & 0x3fff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 4 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 5 + srcOff]) << 12) & 0x3fff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 5 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[ 6 + srcOff]) << 6) & 0x3fff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 7 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 8 + srcOff]) << 8) & 0x3fff);
        dst[ 5 + dstOff] =
                  ((((int) src[ 8 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 9 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[10 + srcOff]) << 10) & 0x3fff);
        dst[ 6 + dstOff] =
                  ((((int) src[10 + srcOff]) >> 4) & 0xf)
                | ((((int) src[11 + srcOff]) << 4) & 0xfff)
                | ((((int) src[12 + srcOff]) << 12) & 0x3fff);
        dst[ 7 + dstOff] =
                  ((((int) src[12 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[13 + srcOff]) << 6) & 0x3fff);
    }

    public static void bitUnpack8IntLE15(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0x7fff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 7) & 0x1)
                | ((((int) src[ 2 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[ 3 + srcOff]) << 9) & 0x7fff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 4 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 5 + srcOff]) << 10) & 0x7fff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 5 + srcOff]) >> 5) & 0x7)
                | ((((int) src[ 6 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[ 7 + srcOff]) << 11) & 0x7fff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 7 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 8 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 9 + srcOff]) << 12) & 0x7fff);
        dst[ 5 + dstOff] =
                  ((((int) src[ 9 + srcOff]) >> 3) & 0x1f)
                | ((((int) src[10 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[11 + srcOff]) << 13) & 0x7fff);
        dst[ 6 + dstOff] =
                  ((((int) src[11 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[12 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[13 + srcOff]) << 14) & 0x7fff);
        dst[ 7 + dstOff] =
                  ((((int) src[13 + srcOff]) >> 1) & 0x7f)
                | ((((int) src[14 + srcOff]) << 7) & 0x7fff);
    }

    public static void bitUnpack8IntLE16(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 3 + srcOff]) << 8) & 0xffff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 4 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 5 + srcOff]) << 8) & 0xffff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 7 + srcOff]) << 8) & 0xffff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 8 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 9 + srcOff]) << 8) & 0xffff);
        dst[ 5 + dstOff] =
                  ((((int) src[10 + srcOff]) << 0) & 0xff)
                | ((((int) src[11 + srcOff]) << 8) & 0xffff);
        dst[ 6 + dstOff] =
                  ((((int) src[12 + srcOff]) << 0) & 0xff)
                | ((((int) src[13 + srcOff]) << 8) & 0xffff);
        dst[ 7 + dstOff] =
                  ((((int) src[14 + srcOff]) << 0) & 0xff)
                | ((((int) src[15 + srcOff]) << 8) & 0xffff);
    }

    public static void bitUnpack8IntLE17(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 16) & 0x1ffff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 1) & 0x7f)
                | ((((int) src[ 3 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[ 4 + srcOff]) << 15) & 0x1ffff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 4 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[ 5 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 6 + srcOff]) << 14) & 0x1ffff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 6 + srcOff]) >> 3) & 0x1f)
                | ((((int) src[ 7 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[ 8 + srcOff]) << 13) & 0x1ffff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 8 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 9 + srcOff]) << 4) & 0xfff)
                | ((((int) src[10 + srcOff]) << 12) & 0x1ffff);
        dst[ 5 + dstOff] =
                  ((((int) src[10 + srcOff]) >> 5) & 0x7)
                | ((((int) src[11 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[12 + srcOff]) << 11) & 0x1ffff);
        dst[ 6 + dstOff] =
                  ((((int) src[12 + srcOff]) >> 6) & 0x3)
                | ((((int) src[13 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[14 + srcOff]) << 10) & 0x1ffff);
        dst[ 7 + dstOff] =
                  ((((int) src[14 + srcOff]) >> 7) & 0x1)
                | ((((int) src[15 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[16 + srcOff]) << 9) & 0x1ffff);
    }

    public static void bitUnpack8IntLE18(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 16) & 0x3ffff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[ 3 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 4 + srcOff]) << 14) & 0x3ffff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 4 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 5 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 6 + srcOff]) << 12) & 0x3ffff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 6 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 7 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 8 + srcOff]) << 10) & 0x3ffff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 9 + srcOff]) << 0) & 0xff)
                | ((((int) src[10 + srcOff]) << 8) & 0xffff)
                | ((((int) src[11 + srcOff]) << 16) & 0x3ffff);
        dst[ 5 + dstOff] =
                  ((((int) src[11 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[12 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[13 + srcOff]) << 14) & 0x3ffff);
        dst[ 6 + dstOff] =
                  ((((int) src[13 + srcOff]) >> 4) & 0xf)
                | ((((int) src[14 + srcOff]) << 4) & 0xfff)
                | ((((int) src[15 + srcOff]) << 12) & 0x3ffff);
        dst[ 7 + dstOff] =
                  ((((int) src[15 + srcOff]) >> 6) & 0x3)
                | ((((int) src[16 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[17 + srcOff]) << 10) & 0x3ffff);
    }

    public static void bitUnpack8IntLE19(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 16) & 0x7ffff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 3) & 0x1f)
                | ((((int) src[ 3 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[ 4 + srcOff]) << 13) & 0x7ffff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 4 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 5 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 6 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[ 7 + srcOff]) << 18) & 0x7ffff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 7 + srcOff]) >> 1) & 0x7f)
                | ((((int) src[ 8 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[ 9 + srcOff]) << 15) & 0x7ffff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 9 + srcOff]) >> 4) & 0xf)
                | ((((int) src[10 + srcOff]) << 4) & 0xfff)
                | ((((int) src[11 + srcOff]) << 12) & 0x7ffff);
        dst[ 5 + dstOff] =
                  ((((int) src[11 + srcOff]) >> 7) & 0x1)
                | ((((int) src[12 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[13 + srcOff]) << 9) & 0x1ffff)
                | ((((int) src[14 + srcOff]) << 17) & 0x7ffff);
        dst[ 6 + dstOff] =
                  ((((int) src[14 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[15 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[16 + srcOff]) << 14) & 0x7ffff);
        dst[ 7 + dstOff] =
                  ((((int) src[16 + srcOff]) >> 5) & 0x7)
                | ((((int) src[17 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[18 + srcOff]) << 11) & 0x7ffff);
    }

    public static void bitUnpack8IntLE20(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 16) & 0xfffff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 3 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 4 + srcOff]) << 12) & 0xfffff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 5 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 6 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 7 + srcOff]) << 16) & 0xfffff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 7 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 8 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 9 + srcOff]) << 12) & 0xfffff);
        dst[ 4 + dstOff] =
                  ((((int) src[10 + srcOff]) << 0) & 0xff)
                | ((((int) src[11 + srcOff]) << 8) & 0xffff)
                | ((((int) src[12 + srcOff]) << 16) & 0xfffff);
        dst[ 5 + dstOff] =
                  ((((int) src[12 + srcOff]) >> 4) & 0xf)
                | ((((int) src[13 + srcOff]) << 4) & 0xfff)
                | ((((int) src[14 + srcOff]) << 12) & 0xfffff);
        dst[ 6 + dstOff] =
                  ((((int) src[15 + srcOff]) << 0) & 0xff)
                | ((((int) src[16 + srcOff]) << 8) & 0xffff)
                | ((((int) src[17 + srcOff]) << 16) & 0xfffff);
        dst[ 7 + dstOff] =
                  ((((int) src[17 + srcOff]) >> 4) & 0xf)
                | ((((int) src[18 + srcOff]) << 4) & 0xfff)
                | ((((int) src[19 + srcOff]) << 12) & 0xfffff);
    }

    public static void bitUnpack8IntLE21(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 16) & 0x1fffff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 5) & 0x7)
                | ((((int) src[ 3 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[ 4 + srcOff]) << 11) & 0x7ffff)
                | ((((int) src[ 5 + srcOff]) << 19) & 0x1fffff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 5 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[ 6 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 7 + srcOff]) << 14) & 0x1fffff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 7 + srcOff]) >> 7) & 0x1)
                | ((((int) src[ 8 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[ 9 + srcOff]) << 9) & 0x1ffff)
                | ((((int) src[10 + srcOff]) << 17) & 0x1fffff);
        dst[ 4 + dstOff] =
                  ((((int) src[10 + srcOff]) >> 4) & 0xf)
                | ((((int) src[11 + srcOff]) << 4) & 0xfff)
                | ((((int) src[12 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[13 + srcOff]) << 20) & 0x1fffff);
        dst[ 5 + dstOff] =
                  ((((int) src[13 + srcOff]) >> 1) & 0x7f)
                | ((((int) src[14 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[15 + srcOff]) << 15) & 0x1fffff);
        dst[ 6 + dstOff] =
                  ((((int) src[15 + srcOff]) >> 6) & 0x3)
                | ((((int) src[16 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[17 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[18 + srcOff]) << 18) & 0x1fffff);
        dst[ 7 + dstOff] =
                  ((((int) src[18 + srcOff]) >> 3) & 0x1f)
                | ((((int) src[19 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[20 + srcOff]) << 13) & 0x1fffff);
    }

    public static void bitUnpack8IntLE22(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 16) & 0x3fffff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 3 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 4 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[ 5 + srcOff]) << 18) & 0x3fffff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 5 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 6 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 7 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[ 8 + srcOff]) << 20) & 0x3fffff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 8 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[ 9 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[10 + srcOff]) << 14) & 0x3fffff);
        dst[ 4 + dstOff] =
                  ((((int) src[11 + srcOff]) << 0) & 0xff)
                | ((((int) src[12 + srcOff]) << 8) & 0xffff)
                | ((((int) src[13 + srcOff]) << 16) & 0x3fffff);
        dst[ 5 + dstOff] =
                  ((((int) src[13 + srcOff]) >> 6) & 0x3)
                | ((((int) src[14 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[15 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[16 + srcOff]) << 18) & 0x3fffff);
        dst[ 6 + dstOff] =
                  ((((int) src[16 + srcOff]) >> 4) & 0xf)
                | ((((int) src[17 + srcOff]) << 4) & 0xfff)
                | ((((int) src[18 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[19 + srcOff]) << 20) & 0x3fffff);
        dst[ 7 + dstOff] =
                  ((((int) src[19 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[20 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[21 + srcOff]) << 14) & 0x3fffff);
    }

    public static void bitUnpack8IntLE23(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 16) & 0x7fffff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 7) & 0x1)
                | ((((int) src[ 3 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[ 4 + srcOff]) << 9) & 0x1ffff)
                | ((((int) src[ 5 + srcOff]) << 17) & 0x7fffff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 5 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 6 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 7 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[ 8 + srcOff]) << 18) & 0x7fffff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 8 + srcOff]) >> 5) & 0x7)
                | ((((int) src[ 9 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[10 + srcOff]) << 11) & 0x7ffff)
                | ((((int) src[11 + srcOff]) << 19) & 0x7fffff);
        dst[ 4 + dstOff] =
                  ((((int) src[11 + srcOff]) >> 4) & 0xf)
                | ((((int) src[12 + srcOff]) << 4) & 0xfff)
                | ((((int) src[13 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[14 + srcOff]) << 20) & 0x7fffff);
        dst[ 5 + dstOff] =
                  ((((int) src[14 + srcOff]) >> 3) & 0x1f)
                | ((((int) src[15 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[16 + srcOff]) << 13) & 0x1fffff)
                | ((((int) src[17 + srcOff]) << 21) & 0x7fffff);
        dst[ 6 + dstOff] =
                  ((((int) src[17 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[18 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[19 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[20 + srcOff]) << 22) & 0x7fffff);
        dst[ 7 + dstOff] =
                  ((((int) src[20 + srcOff]) >> 1) & 0x7f)
                | ((((int) src[21 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[22 + srcOff]) << 15) & 0x7fffff);
    }

    public static void bitUnpack8IntLE24(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 16) & 0xffffff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 4 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 5 + srcOff]) << 16) & 0xffffff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 7 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 8 + srcOff]) << 16) & 0xffffff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 9 + srcOff]) << 0) & 0xff)
                | ((((int) src[10 + srcOff]) << 8) & 0xffff)
                | ((((int) src[11 + srcOff]) << 16) & 0xffffff);
        dst[ 4 + dstOff] =
                  ((((int) src[12 + srcOff]) << 0) & 0xff)
                | ((((int) src[13 + srcOff]) << 8) & 0xffff)
                | ((((int) src[14 + srcOff]) << 16) & 0xffffff);
        dst[ 5 + dstOff] =
                  ((((int) src[15 + srcOff]) << 0) & 0xff)
                | ((((int) src[16 + srcOff]) << 8) & 0xffff)
                | ((((int) src[17 + srcOff]) << 16) & 0xffffff);
        dst[ 6 + dstOff] =
                  ((((int) src[18 + srcOff]) << 0) & 0xff)
                | ((((int) src[19 + srcOff]) << 8) & 0xffff)
                | ((((int) src[20 + srcOff]) << 16) & 0xffffff);
        dst[ 7 + dstOff] =
                  ((((int) src[21 + srcOff]) << 0) & 0xff)
                | ((((int) src[22 + srcOff]) << 8) & 0xffff)
                | ((((int) src[23 + srcOff]) << 16) & 0xffffff);
    }

    public static void bitUnpack8IntLE25(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[ 3 + srcOff]) << 24) & 0x1ffffff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 1) & 0x7f)
                | ((((int) src[ 4 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[ 5 + srcOff]) << 15) & 0x7fffff)
                | ((((int) src[ 6 + srcOff]) << 23) & 0x1ffffff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 6 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[ 7 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 8 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[ 9 + srcOff]) << 22) & 0x1ffffff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 9 + srcOff]) >> 3) & 0x1f)
                | ((((int) src[10 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[11 + srcOff]) << 13) & 0x1fffff)
                | ((((int) src[12 + srcOff]) << 21) & 0x1ffffff);
        dst[ 4 + dstOff] =
                  ((((int) src[12 + srcOff]) >> 4) & 0xf)
                | ((((int) src[13 + srcOff]) << 4) & 0xfff)
                | ((((int) src[14 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[15 + srcOff]) << 20) & 0x1ffffff);
        dst[ 5 + dstOff] =
                  ((((int) src[15 + srcOff]) >> 5) & 0x7)
                | ((((int) src[16 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[17 + srcOff]) << 11) & 0x7ffff)
                | ((((int) src[18 + srcOff]) << 19) & 0x1ffffff);
        dst[ 6 + dstOff] =
                  ((((int) src[18 + srcOff]) >> 6) & 0x3)
                | ((((int) src[19 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[20 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[21 + srcOff]) << 18) & 0x1ffffff);
        dst[ 7 + dstOff] =
                  ((((int) src[21 + srcOff]) >> 7) & 0x1)
                | ((((int) src[22 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[23 + srcOff]) << 9) & 0x1ffff)
                | ((((int) src[24 + srcOff]) << 17) & 0x1ffffff);
    }

    public static void bitUnpack8IntLE26(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[ 3 + srcOff]) << 24) & 0x3ffffff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[ 4 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 5 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[ 6 + srcOff]) << 22) & 0x3ffffff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 6 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 7 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 8 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[ 9 + srcOff]) << 20) & 0x3ffffff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 9 + srcOff]) >> 6) & 0x3)
                | ((((int) src[10 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[11 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[12 + srcOff]) << 18) & 0x3ffffff);
        dst[ 4 + dstOff] =
                  ((((int) src[13 + srcOff]) << 0) & 0xff)
                | ((((int) src[14 + srcOff]) << 8) & 0xffff)
                | ((((int) src[15 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[16 + srcOff]) << 24) & 0x3ffffff);
        dst[ 5 + dstOff] =
                  ((((int) src[16 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[17 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[18 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[19 + srcOff]) << 22) & 0x3ffffff);
        dst[ 6 + dstOff] =
                  ((((int) src[19 + srcOff]) >> 4) & 0xf)
                | ((((int) src[20 + srcOff]) << 4) & 0xfff)
                | ((((int) src[21 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[22 + srcOff]) << 20) & 0x3ffffff);
        dst[ 7 + dstOff] =
                  ((((int) src[22 + srcOff]) >> 6) & 0x3)
                | ((((int) src[23 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[24 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[25 + srcOff]) << 18) & 0x3ffffff);
    }

    public static void bitUnpack8IntLE27(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[ 3 + srcOff]) << 24) & 0x7ffffff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 3) & 0x1f)
                | ((((int) src[ 4 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[ 5 + srcOff]) << 13) & 0x1fffff)
                | ((((int) src[ 6 + srcOff]) << 21) & 0x7ffffff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 6 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 7 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 8 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[ 9 + srcOff]) << 18) & 0x3ffffff)
                | ((((int) src[10 + srcOff]) << 26) & 0x7ffffff);
        dst[ 3 + dstOff] =
                  ((((int) src[10 + srcOff]) >> 1) & 0x7f)
                | ((((int) src[11 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[12 + srcOff]) << 15) & 0x7fffff)
                | ((((int) src[13 + srcOff]) << 23) & 0x7ffffff);
        dst[ 4 + dstOff] =
                  ((((int) src[13 + srcOff]) >> 4) & 0xf)
                | ((((int) src[14 + srcOff]) << 4) & 0xfff)
                | ((((int) src[15 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[16 + srcOff]) << 20) & 0x7ffffff);
        dst[ 5 + dstOff] =
                  ((((int) src[16 + srcOff]) >> 7) & 0x1)
                | ((((int) src[17 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[18 + srcOff]) << 9) & 0x1ffff)
                | ((((int) src[19 + srcOff]) << 17) & 0x1ffffff)
                | ((((int) src[20 + srcOff]) << 25) & 0x7ffffff);
        dst[ 6 + dstOff] =
                  ((((int) src[20 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[21 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[22 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[23 + srcOff]) << 22) & 0x7ffffff);
        dst[ 7 + dstOff] =
                  ((((int) src[23 + srcOff]) >> 5) & 0x7)
                | ((((int) src[24 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[25 + srcOff]) << 11) & 0x7ffff)
                | ((((int) src[26 + srcOff]) << 19) & 0x7ffffff);
    }

    public static void bitUnpack8IntLE28(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[ 3 + srcOff]) << 24) & 0xfffffff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 4 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 5 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[ 6 + srcOff]) << 20) & 0xfffffff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 7 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 8 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 9 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[10 + srcOff]) << 24) & 0xfffffff);
        dst[ 3 + dstOff] =
                  ((((int) src[10 + srcOff]) >> 4) & 0xf)
                | ((((int) src[11 + srcOff]) << 4) & 0xfff)
                | ((((int) src[12 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[13 + srcOff]) << 20) & 0xfffffff);
        dst[ 4 + dstOff] =
                  ((((int) src[14 + srcOff]) << 0) & 0xff)
                | ((((int) src[15 + srcOff]) << 8) & 0xffff)
                | ((((int) src[16 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[17 + srcOff]) << 24) & 0xfffffff);
        dst[ 5 + dstOff] =
                  ((((int) src[17 + srcOff]) >> 4) & 0xf)
                | ((((int) src[18 + srcOff]) << 4) & 0xfff)
                | ((((int) src[19 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[20 + srcOff]) << 20) & 0xfffffff);
        dst[ 6 + dstOff] =
                  ((((int) src[21 + srcOff]) << 0) & 0xff)
                | ((((int) src[22 + srcOff]) << 8) & 0xffff)
                | ((((int) src[23 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[24 + srcOff]) << 24) & 0xfffffff);
        dst[ 7 + dstOff] =
                  ((((int) src[24 + srcOff]) >> 4) & 0xf)
                | ((((int) src[25 + srcOff]) << 4) & 0xfff)
                | ((((int) src[26 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[27 + srcOff]) << 20) & 0xfffffff);
    }

    public static void bitUnpack8IntLE29(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[ 3 + srcOff]) << 24) & 0x1fffffff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 5) & 0x7)
                | ((((int) src[ 4 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[ 5 + srcOff]) << 11) & 0x7ffff)
                | ((((int) src[ 6 + srcOff]) << 19) & 0x7ffffff)
                | ((((int) src[ 7 + srcOff]) << 27) & 0x1fffffff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 7 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[ 8 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 9 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[10 + srcOff]) << 22) & 0x1fffffff);
        dst[ 3 + dstOff] =
                  ((((int) src[10 + srcOff]) >> 7) & 0x1)
                | ((((int) src[11 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[12 + srcOff]) << 9) & 0x1ffff)
                | ((((int) src[13 + srcOff]) << 17) & 0x1ffffff)
                | ((((int) src[14 + srcOff]) << 25) & 0x1fffffff);
        dst[ 4 + dstOff] =
                  ((((int) src[14 + srcOff]) >> 4) & 0xf)
                | ((((int) src[15 + srcOff]) << 4) & 0xfff)
                | ((((int) src[16 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[17 + srcOff]) << 20) & 0xfffffff)
                | ((((int) src[18 + srcOff]) << 28) & 0x1fffffff);
        dst[ 5 + dstOff] =
                  ((((int) src[18 + srcOff]) >> 1) & 0x7f)
                | ((((int) src[19 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[20 + srcOff]) << 15) & 0x7fffff)
                | ((((int) src[21 + srcOff]) << 23) & 0x1fffffff);
        dst[ 6 + dstOff] =
                  ((((int) src[21 + srcOff]) >> 6) & 0x3)
                | ((((int) src[22 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[23 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[24 + srcOff]) << 18) & 0x3ffffff)
                | ((((int) src[25 + srcOff]) << 26) & 0x1fffffff);
        dst[ 7 + dstOff] =
                  ((((int) src[25 + srcOff]) >> 3) & 0x1f)
                | ((((int) src[26 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[27 + srcOff]) << 13) & 0x1fffff)
                | ((((int) src[28 + srcOff]) << 21) & 0x1fffffff);
    }

    public static void bitUnpack8IntLE30(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[ 3 + srcOff]) << 24) & 0x3fffffff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 4 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 5 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[ 6 + srcOff]) << 18) & 0x3ffffff)
                | ((((int) src[ 7 + srcOff]) << 26) & 0x3fffffff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 7 + srcOff]) >> 4) & 0xf)
                | ((((int) src[ 8 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 9 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[10 + srcOff]) << 20) & 0xfffffff)
                | ((((int) src[11 + srcOff]) << 28) & 0x3fffffff);
        dst[ 3 + dstOff] =
                  ((((int) src[11 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[12 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[13 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[14 + srcOff]) << 22) & 0x3fffffff);
        dst[ 4 + dstOff] =
                  ((((int) src[15 + srcOff]) << 0) & 0xff)
                | ((((int) src[16 + srcOff]) << 8) & 0xffff)
                | ((((int) src[17 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[18 + srcOff]) << 24) & 0x3fffffff);
        dst[ 5 + dstOff] =
                  ((((int) src[18 + srcOff]) >> 6) & 0x3)
                | ((((int) src[19 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[20 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[21 + srcOff]) << 18) & 0x3ffffff)
                | ((((int) src[22 + srcOff]) << 26) & 0x3fffffff);
        dst[ 6 + dstOff] =
                  ((((int) src[22 + srcOff]) >> 4) & 0xf)
                | ((((int) src[23 + srcOff]) << 4) & 0xfff)
                | ((((int) src[24 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[25 + srcOff]) << 20) & 0xfffffff)
                | ((((int) src[26 + srcOff]) << 28) & 0x3fffffff);
        dst[ 7 + dstOff] =
                  ((((int) src[26 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[27 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[28 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[29 + srcOff]) << 22) & 0x3fffffff);
    }

    public static void bitUnpack8IntLE31(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[ 3 + srcOff]) << 24) & 0x7fffffff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 7) & 0x1)
                | ((((int) src[ 4 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[ 5 + srcOff]) << 9) & 0x1ffff)
                | ((((int) src[ 6 + srcOff]) << 17) & 0x1ffffff)
                | ((((int) src[ 7 + srcOff]) << 25) & 0x7fffffff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 7 + srcOff]) >> 6) & 0x3)
                | ((((int) src[ 8 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 9 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[10 + srcOff]) << 18) & 0x3ffffff)
                | ((((int) src[11 + srcOff]) << 26) & 0x7fffffff);
        dst[ 3 + dstOff] =
                  ((((int) src[11 + srcOff]) >> 5) & 0x7)
                | ((((int) src[12 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[13 + srcOff]) << 11) & 0x7ffff)
                | ((((int) src[14 + srcOff]) << 19) & 0x7ffffff)
                | ((((int) src[15 + srcOff]) << 27) & 0x7fffffff);
        dst[ 4 + dstOff] =
                  ((((int) src[15 + srcOff]) >> 4) & 0xf)
                | ((((int) src[16 + srcOff]) << 4) & 0xfff)
                | ((((int) src[17 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[18 + srcOff]) << 20) & 0xfffffff)
                | ((((int) src[19 + srcOff]) << 28) & 0x7fffffff);
        dst[ 5 + dstOff] =
                  ((((int) src[19 + srcOff]) >> 3) & 0x1f)
                | ((((int) src[20 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[21 + srcOff]) << 13) & 0x1fffff)
                | ((((int) src[22 + srcOff]) << 21) & 0x1fffffff)
                | ((((int) src[23 + srcOff]) << 29) & 0x7fffffff);
        dst[ 6 + dstOff] =
                  ((((int) src[23 + srcOff]) >> 2) & 0x3f)
                | ((((int) src[24 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[25 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[26 + srcOff]) << 22) & 0x3fffffff)
                | ((((int) src[27 + srcOff]) << 30) & 0x7fffffff);
        dst[ 7 + dstOff] =
                  ((((int) src[27 + srcOff]) >> 1) & 0x7f)
                | ((((int) src[28 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[29 + srcOff]) << 15) & 0x7fffff)
                | ((((int) src[30 + srcOff]) << 23) & 0x7fffffff);
    }

    public static void bitUnpack8IntLE32(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[ 3 + srcOff]) << 24) & -1);
        dst[ 1 + dstOff] =
                  ((((int) src[ 4 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 5 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 6 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[ 7 + srcOff]) << 24) & -1);
        dst[ 2 + dstOff] =
                  ((((int) src[ 8 + srcOff]) << 0) & 0xff)
                | ((((int) src[ 9 + srcOff]) << 8) & 0xffff)
                | ((((int) src[10 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[11 + srcOff]) << 24) & -1);
        dst[ 3 + dstOff] =
                  ((((int) src[12 + srcOff]) << 0) & 0xff)
                | ((((int) src[13 + srcOff]) << 8) & 0xffff)
                | ((((int) src[14 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[15 + srcOff]) << 24) & -1);
        dst[ 4 + dstOff] =
                  ((((int) src[16 + srcOff]) << 0) & 0xff)
                | ((((int) src[17 + srcOff]) << 8) & 0xffff)
                | ((((int) src[18 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[19 + srcOff]) << 24) & -1);
        dst[ 5 + dstOff] =
                  ((((int) src[20 + srcOff]) << 0) & 0xff)
                | ((((int) src[21 + srcOff]) << 8) & 0xffff)
                | ((((int) src[22 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[23 + srcOff]) << 24) & -1);
        dst[ 6 + dstOff] =
                  ((((int) src[24 + srcOff]) << 0) & 0xff)
                | ((((int) src[25 + srcOff]) << 8) & 0xffff)
                | ((((int) src[26 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[27 + srcOff]) << 24) & -1);
        dst[ 7 + dstOff] =
                  ((((int) src[28 + srcOff]) << 0) & 0xff)
                | ((((int) src[29 + srcOff]) << 8) & 0xffff)
                | ((((int) src[30 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[31 + srcOff]) << 24) & -1);
    }

    public static void unpack(IntToLongFunction src, int srcOff, int[] dst, int dstOff, int bits)
    {
        switch (bits) {
        case 0:
            // do nothing
            break;
        case 1:
            bitUnpack8IntLE1(src, srcOff, dst, dstOff);
            break;
        case 2:
            bitUnpack8IntLE2(src, srcOff, dst, dstOff);
            break;
        case 3:
            bitUnpack8IntLE3(src, srcOff, dst, dstOff);
            break;
        case 4:
            bitUnpack8IntLE4(src, srcOff, dst, dstOff);
            break;
        case 5:
            bitUnpack8IntLE5(src, srcOff, dst, dstOff);
            break;
        case 6:
            bitUnpack8IntLE6(src, srcOff, dst, dstOff);
            break;
        case 7:
            bitUnpack8IntLE7(src, srcOff, dst, dstOff);
            break;
        case 8:
            bitUnpack8IntLE8(src, srcOff, dst, dstOff);
            break;
        case 9:
            bitUnpack8IntLE9(src, srcOff, dst, dstOff);
            break;
        case 10:
            bitUnpack8IntLE10(src, srcOff, dst, dstOff);
            break;
        case 11:
            bitUnpack8IntLE11(src, srcOff, dst, dstOff);
            break;
        case 12:
            bitUnpack8IntLE12(src, srcOff, dst, dstOff);
            break;
        case 13:
            bitUnpack8IntLE13(src, srcOff, dst, dstOff);
            break;
        case 14:
            bitUnpack8IntLE14(src, srcOff, dst, dstOff);
            break;
        case 15:
            bitUnpack8IntLE15(src, srcOff, dst, dstOff);
            break;
        case 16:
            bitUnpack8IntLE16(src, srcOff, dst, dstOff);
            break;
        case 17:
            bitUnpack8IntLE17(src, srcOff, dst, dstOff);
            break;
        case 18:
            bitUnpack8IntLE18(src, srcOff, dst, dstOff);
            break;
        case 19:
            bitUnpack8IntLE19(src, srcOff, dst, dstOff);
            break;
        case 20:
            bitUnpack8IntLE20(src, srcOff, dst, dstOff);
            break;
        case 21:
            bitUnpack8IntLE21(src, srcOff, dst, dstOff);
            break;
        case 22:
            bitUnpack8IntLE22(src, srcOff, dst, dstOff);
            break;
        case 23:
            bitUnpack8IntLE23(src, srcOff, dst, dstOff);
            break;
        case 24:
            bitUnpack8IntLE24(src, srcOff, dst, dstOff);
            break;
        case 25:
            bitUnpack8IntLE25(src, srcOff, dst, dstOff);
            break;
        case 26:
            bitUnpack8IntLE26(src, srcOff, dst, dstOff);
            break;
        case 27:
            bitUnpack8IntLE27(src, srcOff, dst, dstOff);
            break;
        case 28:
            bitUnpack8IntLE28(src, srcOff, dst, dstOff);
            break;
        case 29:
            bitUnpack8IntLE29(src, srcOff, dst, dstOff);
            break;
        case 30:
            bitUnpack8IntLE30(src, srcOff, dst, dstOff);
            break;
        case 31:
            bitUnpack8IntLE31(src, srcOff, dst, dstOff);
            break;
        case 32:
            bitUnpack8IntLE32(src, srcOff, dst, dstOff);
            break;
        default:
            throw new IllegalArgumentException("Bit width must be from 0 to 32 but got " + bits);
        }
    }

    public static void bitUnpack8IntLE1(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0x1);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 1) & 0x1);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 2) & 0x1);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 3) & 0x1);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 4) & 0x1);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 5) & 0x1);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 6) & 0x1);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 7) & 0x1);
    }

    public static void bitUnpack8IntLE2(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0x3);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 2) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 4) & 0x3);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 6) & 0x3);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) << 0) & 0x3);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 2) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 4) & 0x3);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 6) & 0x3);
    }

    public static void bitUnpack8IntLE3(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0x7);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 3) & 0x7);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 2) & 0x7);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 1) & 0x7);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 4) & 0x7);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 7) & 0x1)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 1) & 0x7);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 2) & 0x7);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 5) & 0x7);
    }

    public static void bitUnpack8IntLE4(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xf);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 4) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) << 0) & 0xf);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 0) & 0xf);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 4) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 0) & 0xf);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 4) & 0xf);
    }

    public static void bitUnpack8IntLE5(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0x1f);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 5) & 0x7)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 3) & 0x1f);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 2) & 0x1f);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 7) & 0x1)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 1) & 0x1f);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 4) & 0x1f);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 1) & 0x1f);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 2) & 0x1f);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) >> 3) & 0x1f);
    }

    public static void bitUnpack8IntLE6(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0x3f);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 2) & 0x3f);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 4) & 0x3f);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 2) & 0x3f);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 0) & 0x3f);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 2) & 0x3f);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 4) & 0x3f);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) >> 2) & 0x3f);
    }

    public static void bitUnpack8IntLE7(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0x7f);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 7) & 0x1)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 1) & 0x7f);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 2) & 0x7f);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 5) & 0x7)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 3) & 0x7f);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 4) & 0x7f);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) >> 3) & 0x1f)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 5) & 0x7f);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 6) & 0x7f);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) >> 1) & 0x7f);
    }

    public static void bitUnpack8IntLE8(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) << 0) & 0xff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 0) & 0xff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) << 0) & 0xff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) << 0) & 0xff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 0) & 0xff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntLE9(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0x1ff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 1) & 0x7f)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 7) & 0x1ff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 6) & 0x1ff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 3) & 0x1f)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 5) & 0x1ff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 4) & 0x1ff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) >> 5) & 0x7)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 3) & 0x1ff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 2) & 0x1ff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) >> 7) & 0x1)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 1) & 0x1ff);
    }

    public static void bitUnpack8IntLE10(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0x3ff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 6) & 0x3ff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 4) & 0x3ff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 2) & 0x3ff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 8) & 0x3ff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 6) & 0x3ff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 4) & 0x3ff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 2) & 0x3ff);
    }

    public static void bitUnpack8IntLE11(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0x7ff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 3) & 0x1f)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 5) & 0x7ff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 10) & 0x7ff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) >> 1) & 0x7f)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 7) & 0x7ff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 4) & 0x7ff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) >> 7) & 0x1)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 9) & 0x7ff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 6) & 0x7ff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) >> 5) & 0x7)
                | ((((int) src.applyAsLong(10 + srcOff)) << 3) & 0x7ff);
    }

    public static void bitUnpack8IntLE12(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xfff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 4) & 0xfff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 8) & 0xfff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 4) & 0xfff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 8) & 0xfff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 4) & 0xfff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 8) & 0xfff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(11 + srcOff)) << 4) & 0xfff);
    }

    public static void bitUnpack8IntLE13(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0x1fff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 5) & 0x7)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 11) & 0x1fff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 6) & 0x1fff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) >> 7) & 0x1)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 9) & 0x1fff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 12) & 0x1fff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) >> 1) & 0x7f)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 7) & 0x1fff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong(10 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 10) & 0x1fff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(11 + srcOff)) >> 3) & 0x1f)
                | ((((int) src.applyAsLong(12 + srcOff)) << 5) & 0x1fff);
    }

    public static void bitUnpack8IntLE14(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0x3fff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 10) & 0x3fff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 12) & 0x3fff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 6) & 0x3fff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 8) & 0x3fff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 10) & 0x3fff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(11 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 12) & 0x3fff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(12 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong(13 + srcOff)) << 6) & 0x3fff);
    }

    public static void bitUnpack8IntLE15(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0x7fff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 7) & 0x1)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 9) & 0x7fff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 10) & 0x7fff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) >> 5) & 0x7)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 11) & 0x7fff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 12) & 0x7fff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) >> 3) & 0x1f)
                | ((((int) src.applyAsLong(10 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 13) & 0x7fff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(11 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong(12 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 14) & 0x7fff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(13 + srcOff)) >> 1) & 0x7f)
                | ((((int) src.applyAsLong(14 + srcOff)) << 7) & 0x7fff);
    }

    public static void bitUnpack8IntLE16(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 8) & 0xffff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 8) & 0xffff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 8) & 0xffff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 8) & 0xffff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 8) & 0xffff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(12 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 8) & 0xffff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(14 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 8) & 0xffff);
    }

    public static void bitUnpack8IntLE17(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0x1ffff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 1) & 0x7f)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 15) & 0x1ffff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 14) & 0x1ffff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) >> 3) & 0x1f)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 13) & 0x1ffff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 12) & 0x1ffff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) >> 5) & 0x7)
                | ((((int) src.applyAsLong(11 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 11) & 0x1ffff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(12 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong(13 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 10) & 0x1ffff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(14 + srcOff)) >> 7) & 0x1)
                | ((((int) src.applyAsLong(15 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 9) & 0x1ffff);
    }

    public static void bitUnpack8IntLE18(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0x3ffff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 14) & 0x3ffff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 12) & 0x3ffff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 10) & 0x3ffff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 16) & 0x3ffff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(11 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong(12 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 14) & 0x3ffff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(13 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(14 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 12) & 0x3ffff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(15 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong(16 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 10) & 0x3ffff);
    }

    public static void bitUnpack8IntLE19(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0x7ffff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 3) & 0x1f)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 13) & 0x7ffff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 18) & 0x7ffff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) >> 1) & 0x7f)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 15) & 0x7ffff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(10 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 12) & 0x7ffff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(11 + srcOff)) >> 7) & 0x1)
                | ((((int) src.applyAsLong(12 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 9) & 0x1ffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 17) & 0x7ffff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(14 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong(15 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 14) & 0x7ffff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(16 + srcOff)) >> 5) & 0x7)
                | ((((int) src.applyAsLong(17 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 11) & 0x7ffff);
    }

    public static void bitUnpack8IntLE20(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0xfffff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 12) & 0xfffff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 16) & 0xfffff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 12) & 0xfffff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 16) & 0xfffff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(12 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(13 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 12) & 0xfffff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(15 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 16) & 0xfffff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(17 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(18 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 12) & 0xfffff);
    }

    public static void bitUnpack8IntLE21(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0x1fffff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 5) & 0x7)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 11) & 0x7ffff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 19) & 0x1fffff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 14) & 0x1fffff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) >> 7) & 0x1)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 9) & 0x1ffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 17) & 0x1fffff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(11 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 20) & 0x1fffff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(13 + srcOff)) >> 1) & 0x7f)
                | ((((int) src.applyAsLong(14 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 15) & 0x1fffff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(15 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong(16 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 18) & 0x1fffff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(18 + srcOff)) >> 3) & 0x1f)
                | ((((int) src.applyAsLong(19 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 13) & 0x1fffff);
    }

    public static void bitUnpack8IntLE22(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0x3fffff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 18) & 0x3fffff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 20) & 0x3fffff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 14) & 0x3fffff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(11 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 16) & 0x3fffff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(13 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong(14 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 18) & 0x3fffff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(16 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(17 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 20) & 0x3fffff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(19 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong(20 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(21 + srcOff)) << 14) & 0x3fffff);
    }

    public static void bitUnpack8IntLE23(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0x7fffff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 7) & 0x1)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 9) & 0x1ffff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 17) & 0x7fffff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 18) & 0x7fffff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) >> 5) & 0x7)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 11) & 0x7ffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 19) & 0x7fffff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(11 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(12 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 20) & 0x7fffff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(14 + srcOff)) >> 3) & 0x1f)
                | ((((int) src.applyAsLong(15 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 13) & 0x1fffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 21) & 0x7fffff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(17 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong(18 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 22) & 0x7fffff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(20 + srcOff)) >> 1) & 0x7f)
                | ((((int) src.applyAsLong(21 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong(22 + srcOff)) << 15) & 0x7fffff);
    }

    public static void bitUnpack8IntLE24(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 16) & 0xffffff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 16) & 0xffffff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 16) & 0xffffff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(12 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 16) & 0xffffff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(15 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 16) & 0xffffff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(18 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 16) & 0xffffff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(21 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(22 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(23 + srcOff)) << 16) & 0xffffff);
    }

    public static void bitUnpack8IntLE25(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 24) & 0x1ffffff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 1) & 0x7f)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 15) & 0x7fffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 23) & 0x1ffffff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 22) & 0x1ffffff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) >> 3) & 0x1f)
                | ((((int) src.applyAsLong(10 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 13) & 0x1fffff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 21) & 0x1ffffff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(12 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(13 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 20) & 0x1ffffff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(15 + srcOff)) >> 5) & 0x7)
                | ((((int) src.applyAsLong(16 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 11) & 0x7ffff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 19) & 0x1ffffff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(18 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong(19 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(21 + srcOff)) << 18) & 0x1ffffff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(21 + srcOff)) >> 7) & 0x1)
                | ((((int) src.applyAsLong(22 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong(23 + srcOff)) << 9) & 0x1ffff)
                | ((((int) src.applyAsLong(24 + srcOff)) << 17) & 0x1ffffff);
    }

    public static void bitUnpack8IntLE26(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 24) & 0x3ffffff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 22) & 0x3ffffff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 20) & 0x3ffffff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong(10 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 18) & 0x3ffffff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(13 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 24) & 0x3ffffff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(16 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong(17 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 22) & 0x3ffffff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(19 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(20 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(21 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(22 + srcOff)) << 20) & 0x3ffffff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(22 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong(23 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(24 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(25 + srcOff)) << 18) & 0x3ffffff);
    }

    public static void bitUnpack8IntLE27(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 24) & 0x7ffffff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 3) & 0x1f)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 13) & 0x1fffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 21) & 0x7ffffff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 18) & 0x3ffffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 26) & 0x7ffffff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) >> 1) & 0x7f)
                | ((((int) src.applyAsLong(11 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 15) & 0x7fffff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 23) & 0x7ffffff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(13 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(14 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 20) & 0x7ffffff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(16 + srcOff)) >> 7) & 0x1)
                | ((((int) src.applyAsLong(17 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 9) & 0x1ffff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 17) & 0x1ffffff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 25) & 0x7ffffff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(20 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong(21 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(22 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong(23 + srcOff)) << 22) & 0x7ffffff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(23 + srcOff)) >> 5) & 0x7)
                | ((((int) src.applyAsLong(24 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong(25 + srcOff)) << 11) & 0x7ffff)
                | ((((int) src.applyAsLong(26 + srcOff)) << 19) & 0x7ffffff);
    }

    public static void bitUnpack8IntLE28(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 24) & 0xfffffff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 20) & 0xfffffff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 24) & 0xfffffff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(11 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 20) & 0xfffffff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(14 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 24) & 0xfffffff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(17 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(18 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 20) & 0xfffffff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(21 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(22 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(23 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(24 + srcOff)) << 24) & 0xfffffff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(24 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(25 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(26 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(27 + srcOff)) << 20) & 0xfffffff);
    }

    public static void bitUnpack8IntLE29(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 24) & 0x1fffffff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 5) & 0x7)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 11) & 0x7ffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 19) & 0x7ffffff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 27) & 0x1fffffff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 22) & 0x1fffffff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) >> 7) & 0x1)
                | ((((int) src.applyAsLong(11 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 9) & 0x1ffff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 17) & 0x1ffffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 25) & 0x1fffffff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(14 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(15 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 20) & 0xfffffff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 28) & 0x1fffffff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(18 + srcOff)) >> 1) & 0x7f)
                | ((((int) src.applyAsLong(19 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 15) & 0x7fffff)
                | ((((int) src.applyAsLong(21 + srcOff)) << 23) & 0x1fffffff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(21 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong(22 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(23 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(24 + srcOff)) << 18) & 0x3ffffff)
                | ((((int) src.applyAsLong(25 + srcOff)) << 26) & 0x1fffffff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(25 + srcOff)) >> 3) & 0x1f)
                | ((((int) src.applyAsLong(26 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong(27 + srcOff)) << 13) & 0x1fffff)
                | ((((int) src.applyAsLong(28 + srcOff)) << 21) & 0x1fffffff);
    }

    public static void bitUnpack8IntLE30(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 24) & 0x3fffffff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 18) & 0x3ffffff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 26) & 0x3fffffff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 20) & 0xfffffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 28) & 0x3fffffff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong(11 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong(12 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 22) & 0x3fffffff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(15 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 24) & 0x3fffffff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(18 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong(19 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(21 + srcOff)) << 18) & 0x3ffffff)
                | ((((int) src.applyAsLong(22 + srcOff)) << 26) & 0x3fffffff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(22 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(23 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(24 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(25 + srcOff)) << 20) & 0xfffffff)
                | ((((int) src.applyAsLong(26 + srcOff)) << 28) & 0x3fffffff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(26 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong(27 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(28 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong(29 + srcOff)) << 22) & 0x3fffffff);
    }

    public static void bitUnpack8IntLE31(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 24) & 0x7fffffff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 7) & 0x1)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 9) & 0x1ffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 17) & 0x1ffffff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 25) & 0x7fffffff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) >> 6) & 0x3)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 18) & 0x3ffffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 26) & 0x7fffffff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong(11 + srcOff)) >> 5) & 0x7)
                | ((((int) src.applyAsLong(12 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 11) & 0x7ffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 19) & 0x7ffffff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 27) & 0x7fffffff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(15 + srcOff)) >> 4) & 0xf)
                | ((((int) src.applyAsLong(16 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 20) & 0xfffffff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 28) & 0x7fffffff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(19 + srcOff)) >> 3) & 0x1f)
                | ((((int) src.applyAsLong(20 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong(21 + srcOff)) << 13) & 0x1fffff)
                | ((((int) src.applyAsLong(22 + srcOff)) << 21) & 0x1fffffff)
                | ((((int) src.applyAsLong(23 + srcOff)) << 29) & 0x7fffffff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(23 + srcOff)) >> 2) & 0x3f)
                | ((((int) src.applyAsLong(24 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(25 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong(26 + srcOff)) << 22) & 0x3fffffff)
                | ((((int) src.applyAsLong(27 + srcOff)) << 30) & 0x7fffffff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(27 + srcOff)) >> 1) & 0x7f)
                | ((((int) src.applyAsLong(28 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong(29 + srcOff)) << 15) & 0x7fffff)
                | ((((int) src.applyAsLong(30 + srcOff)) << 23) & 0x7fffffff);
    }

    public static void bitUnpack8IntLE32(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 24) & -1);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 24) & -1);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 24) & -1);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong(12 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 24) & -1);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(16 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 24) & -1);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(20 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(21 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(22 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(23 + srcOff)) << 24) & -1);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(24 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(25 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(26 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(27 + srcOff)) << 24) & -1);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(28 + srcOff)) << 0) & 0xff)
                | ((((int) src.applyAsLong(29 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(30 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(31 + srcOff)) << 24) & -1);
    }

}
