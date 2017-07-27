package io.github.nz4;

import java.util.function.IntToLongFunction;

final class BitUnpacking8IntBE
{
    private BitUnpacking8IntBE()
    { }

    public static void unpack(byte[] src, int srcOff, int[] dst, int dstOff, int bits)
    {
        switch (bits) {
        case 0:
            // do nothing
            break;
        case 1:
            bitUnpack8IntBE1(src, srcOff, dst, dstOff);
            break;
        case 2:
            bitUnpack8IntBE2(src, srcOff, dst, dstOff);
            break;
        case 3:
            bitUnpack8IntBE3(src, srcOff, dst, dstOff);
            break;
        case 4:
            bitUnpack8IntBE4(src, srcOff, dst, dstOff);
            break;
        case 5:
            bitUnpack8IntBE5(src, srcOff, dst, dstOff);
            break;
        case 6:
            bitUnpack8IntBE6(src, srcOff, dst, dstOff);
            break;
        case 7:
            bitUnpack8IntBE7(src, srcOff, dst, dstOff);
            break;
        case 8:
            bitUnpack8IntBE8(src, srcOff, dst, dstOff);
            break;
        case 9:
            bitUnpack8IntBE9(src, srcOff, dst, dstOff);
            break;
        case 10:
            bitUnpack8IntBE10(src, srcOff, dst, dstOff);
            break;
        case 11:
            bitUnpack8IntBE11(src, srcOff, dst, dstOff);
            break;
        case 12:
            bitUnpack8IntBE12(src, srcOff, dst, dstOff);
            break;
        case 13:
            bitUnpack8IntBE13(src, srcOff, dst, dstOff);
            break;
        case 14:
            bitUnpack8IntBE14(src, srcOff, dst, dstOff);
            break;
        case 15:
            bitUnpack8IntBE15(src, srcOff, dst, dstOff);
            break;
        case 16:
            bitUnpack8IntBE16(src, srcOff, dst, dstOff);
            break;
        case 17:
            bitUnpack8IntBE17(src, srcOff, dst, dstOff);
            break;
        case 18:
            bitUnpack8IntBE18(src, srcOff, dst, dstOff);
            break;
        case 19:
            bitUnpack8IntBE19(src, srcOff, dst, dstOff);
            break;
        case 20:
            bitUnpack8IntBE20(src, srcOff, dst, dstOff);
            break;
        case 21:
            bitUnpack8IntBE21(src, srcOff, dst, dstOff);
            break;
        case 22:
            bitUnpack8IntBE22(src, srcOff, dst, dstOff);
            break;
        case 23:
            bitUnpack8IntBE23(src, srcOff, dst, dstOff);
            break;
        case 24:
            bitUnpack8IntBE24(src, srcOff, dst, dstOff);
            break;
        case 25:
            bitUnpack8IntBE25(src, srcOff, dst, dstOff);
            break;
        case 26:
            bitUnpack8IntBE26(src, srcOff, dst, dstOff);
            break;
        case 27:
            bitUnpack8IntBE27(src, srcOff, dst, dstOff);
            break;
        case 28:
            bitUnpack8IntBE28(src, srcOff, dst, dstOff);
            break;
        case 29:
            bitUnpack8IntBE29(src, srcOff, dst, dstOff);
            break;
        case 30:
            bitUnpack8IntBE30(src, srcOff, dst, dstOff);
            break;
        case 31:
            bitUnpack8IntBE31(src, srcOff, dst, dstOff);
            break;
        case 32:
            bitUnpack8IntBE32(src, srcOff, dst, dstOff);
            break;
        default:
            throw new IllegalArgumentException("Bit width must be from 0 to 32 but got " + bits);
        }
    }

    public static void bitUnpack8IntBE1(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 7) & 0x1);
        dst[ 1 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 6) & 0x1);
        dst[ 2 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 5) & 0x1);
        dst[ 3 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 4) & 0x1);
        dst[ 4 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 3) & 0x1);
        dst[ 5 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 2) & 0x1);
        dst[ 6 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 1) & 0x1);
        dst[ 7 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0x1);
    }

    public static void bitUnpack8IntBE2(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 6) & 0x3);
        dst[ 1 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 4) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 2) & 0x3);
        dst[ 3 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0x3);
        dst[ 4 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 6) & 0x3);
        dst[ 5 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 4) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 2) & 0x3);
        dst[ 7 + dstOff] =
                  ((((int) src[ 1 + srcOff]) << 0) & 0x3);
    }

    public static void bitUnpack8IntBE3(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 5) & 0x7);
        dst[ 1 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 2) & 0x7);
        dst[ 2 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 1) & 0x7)
                | ((((int) src[ 1 + srcOff]) >> 7) & 0x1);
        dst[ 3 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 4) & 0x7);
        dst[ 4 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 1) & 0x7);
        dst[ 5 + dstOff] =
                  ((((int) src[ 1 + srcOff]) << 2) & 0x7)
                | ((((int) src[ 2 + srcOff]) >> 6) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 3) & 0x7);
        dst[ 7 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 0) & 0x7);
    }

    public static void bitUnpack8IntBE4(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 4) & 0xf);
        dst[ 1 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 0) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 4) & 0xf);
        dst[ 3 + dstOff] =
                  ((((int) src[ 1 + srcOff]) << 0) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src[ 2 + srcOff]) >> 4) & 0xf);
        dst[ 5 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 0) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 4) & 0xf);
        dst[ 7 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 0) & 0xf);
    }

    public static void bitUnpack8IntBE5(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 3) & 0x1f);
        dst[ 1 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 2) & 0x1f)
                | ((((int) src[ 1 + srcOff]) >> 6) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src[ 1 + srcOff]) >> 1) & 0x1f);
        dst[ 3 + dstOff] =
                  ((((int) src[ 1 + srcOff]) << 4) & 0x1f)
                | ((((int) src[ 2 + srcOff]) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 1) & 0x1f)
                | ((((int) src[ 3 + srcOff]) >> 7) & 0x1);
        dst[ 5 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 2) & 0x1f);
        dst[ 6 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 3) & 0x1f)
                | ((((int) src[ 4 + srcOff]) >> 5) & 0x7);
        dst[ 7 + dstOff] =
                  ((((int) src[ 4 + srcOff]) << 0) & 0x1f);
    }

    public static void bitUnpack8IntBE6(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 2) & 0x3f);
        dst[ 1 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 4) & 0x3f)
                | ((((int) src[ 1 + srcOff]) >> 4) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src[ 1 + srcOff]) << 2) & 0x3f)
                | ((((int) src[ 2 + srcOff]) >> 6) & 0x3);
        dst[ 3 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 0) & 0x3f);
        dst[ 4 + dstOff] =
                  ((((int) src[ 3 + srcOff]) >> 2) & 0x3f);
        dst[ 5 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 4) & 0x3f)
                | ((((int) src[ 4 + srcOff]) >> 4) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src[ 4 + srcOff]) << 2) & 0x3f)
                | ((((int) src[ 5 + srcOff]) >> 6) & 0x3);
        dst[ 7 + dstOff] =
                  ((((int) src[ 5 + srcOff]) << 0) & 0x3f);
    }

    public static void bitUnpack8IntBE7(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) >> 1) & 0x7f);
        dst[ 1 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 6) & 0x7f)
                | ((((int) src[ 1 + srcOff]) >> 2) & 0x3f);
        dst[ 2 + dstOff] =
                  ((((int) src[ 1 + srcOff]) << 5) & 0x7f)
                | ((((int) src[ 2 + srcOff]) >> 3) & 0x1f);
        dst[ 3 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 4) & 0x7f)
                | ((((int) src[ 3 + srcOff]) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 3) & 0x7f)
                | ((((int) src[ 4 + srcOff]) >> 5) & 0x7);
        dst[ 5 + dstOff] =
                  ((((int) src[ 4 + srcOff]) << 2) & 0x7f)
                | ((((int) src[ 5 + srcOff]) >> 6) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src[ 5 + srcOff]) << 1) & 0x7f)
                | ((((int) src[ 6 + srcOff]) >> 7) & 0x1);
        dst[ 7 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 0) & 0x7f);
    }

    public static void bitUnpack8IntBE8(byte[] src, int srcOff, int[] dst, int dstOff)
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

    public static void bitUnpack8IntBE9(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[ 1 + srcOff]) >> 7) & 0x1);
        dst[ 1 + dstOff] =
                  ((((int) src[ 1 + srcOff]) << 2) & 0x1ff)
                | ((((int) src[ 2 + srcOff]) >> 6) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 3) & 0x1ff)
                | ((((int) src[ 3 + srcOff]) >> 5) & 0x7);
        dst[ 3 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 4) & 0x1ff)
                | ((((int) src[ 4 + srcOff]) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src[ 4 + srcOff]) << 5) & 0x1ff)
                | ((((int) src[ 5 + srcOff]) >> 3) & 0x1f);
        dst[ 5 + dstOff] =
                  ((((int) src[ 5 + srcOff]) << 6) & 0x1ff)
                | ((((int) src[ 6 + srcOff]) >> 2) & 0x3f);
        dst[ 6 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 7) & 0x1ff)
                | ((((int) src[ 7 + srcOff]) >> 1) & 0x7f);
        dst[ 7 + dstOff] =
                  ((((int) src[ 7 + srcOff]) << 8) & 0x1ff)
                | ((((int) src[ 8 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE10(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 1 + srcOff]) >> 6) & 0x3);
        dst[ 1 + dstOff] =
                  ((((int) src[ 1 + srcOff]) << 4) & 0x3ff)
                | ((((int) src[ 2 + srcOff]) >> 4) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 6) & 0x3ff)
                | ((((int) src[ 3 + srcOff]) >> 2) & 0x3f);
        dst[ 3 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 8) & 0x3ff)
                | ((((int) src[ 4 + srcOff]) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 5 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 6 + srcOff]) >> 6) & 0x3);
        dst[ 5 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 4) & 0x3ff)
                | ((((int) src[ 7 + srcOff]) >> 4) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src[ 7 + srcOff]) << 6) & 0x3ff)
                | ((((int) src[ 8 + srcOff]) >> 2) & 0x3f);
        dst[ 7 + dstOff] =
                  ((((int) src[ 8 + srcOff]) << 8) & 0x3ff)
                | ((((int) src[ 9 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE11(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[ 1 + srcOff]) >> 5) & 0x7);
        dst[ 1 + dstOff] =
                  ((((int) src[ 1 + srcOff]) << 6) & 0x7ff)
                | ((((int) src[ 2 + srcOff]) >> 2) & 0x3f);
        dst[ 2 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 9) & 0x7ff)
                | ((((int) src[ 3 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[ 4 + srcOff]) >> 7) & 0x1);
        dst[ 3 + dstOff] =
                  ((((int) src[ 4 + srcOff]) << 4) & 0x7ff)
                | ((((int) src[ 5 + srcOff]) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src[ 5 + srcOff]) << 7) & 0x7ff)
                | ((((int) src[ 6 + srcOff]) >> 1) & 0x7f);
        dst[ 5 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 10) & 0x7ff)
                | ((((int) src[ 7 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 8 + srcOff]) >> 6) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src[ 8 + srcOff]) << 5) & 0x7ff)
                | ((((int) src[ 9 + srcOff]) >> 3) & 0x1f);
        dst[ 7 + dstOff] =
                  ((((int) src[ 9 + srcOff]) << 8) & 0x7ff)
                | ((((int) src[10 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE12(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 1 + srcOff]) >> 4) & 0xf);
        dst[ 1 + dstOff] =
                  ((((int) src[ 1 + srcOff]) << 8) & 0xfff)
                | ((((int) src[ 2 + srcOff]) << 0) & 0xff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 4 + srcOff]) >> 4) & 0xf);
        dst[ 3 + dstOff] =
                  ((((int) src[ 4 + srcOff]) << 8) & 0xfff)
                | ((((int) src[ 5 + srcOff]) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 7 + srcOff]) >> 4) & 0xf);
        dst[ 5 + dstOff] =
                  ((((int) src[ 7 + srcOff]) << 8) & 0xfff)
                | ((((int) src[ 8 + srcOff]) << 0) & 0xff);
        dst[ 6 + dstOff] =
                  ((((int) src[ 9 + srcOff]) << 4) & 0xfff)
                | ((((int) src[10 + srcOff]) >> 4) & 0xf);
        dst[ 7 + dstOff] =
                  ((((int) src[10 + srcOff]) << 8) & 0xfff)
                | ((((int) src[11 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE13(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[ 1 + srcOff]) >> 3) & 0x1f);
        dst[ 1 + dstOff] =
                  ((((int) src[ 1 + srcOff]) << 10) & 0x1fff)
                | ((((int) src[ 2 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 3 + srcOff]) >> 6) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 7) & 0x1fff)
                | ((((int) src[ 4 + srcOff]) >> 1) & 0x7f);
        dst[ 3 + dstOff] =
                  ((((int) src[ 4 + srcOff]) << 12) & 0x1fff)
                | ((((int) src[ 5 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 6 + srcOff]) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 9) & 0x1fff)
                | ((((int) src[ 7 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[ 8 + srcOff]) >> 7) & 0x1);
        dst[ 5 + dstOff] =
                  ((((int) src[ 8 + srcOff]) << 6) & 0x1fff)
                | ((((int) src[ 9 + srcOff]) >> 2) & 0x3f);
        dst[ 6 + dstOff] =
                  ((((int) src[ 9 + srcOff]) << 11) & 0x1fff)
                | ((((int) src[10 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[11 + srcOff]) >> 5) & 0x7);
        dst[ 7 + dstOff] =
                  ((((int) src[11 + srcOff]) << 8) & 0x1fff)
                | ((((int) src[12 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE14(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 1 + srcOff]) >> 2) & 0x3f);
        dst[ 1 + dstOff] =
                  ((((int) src[ 1 + srcOff]) << 12) & 0x3fff)
                | ((((int) src[ 2 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 3 + srcOff]) >> 4) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 10) & 0x3fff)
                | ((((int) src[ 4 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 5 + srcOff]) >> 6) & 0x3);
        dst[ 3 + dstOff] =
                  ((((int) src[ 5 + srcOff]) << 8) & 0x3fff)
                | ((((int) src[ 6 + srcOff]) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 7 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 8 + srcOff]) >> 2) & 0x3f);
        dst[ 5 + dstOff] =
                  ((((int) src[ 8 + srcOff]) << 12) & 0x3fff)
                | ((((int) src[ 9 + srcOff]) << 4) & 0xfff)
                | ((((int) src[10 + srcOff]) >> 4) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src[10 + srcOff]) << 10) & 0x3fff)
                | ((((int) src[11 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[12 + srcOff]) >> 6) & 0x3);
        dst[ 7 + dstOff] =
                  ((((int) src[12 + srcOff]) << 8) & 0x3fff)
                | ((((int) src[13 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE15(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[ 1 + srcOff]) >> 1) & 0x7f);
        dst[ 1 + dstOff] =
                  ((((int) src[ 1 + srcOff]) << 14) & 0x7fff)
                | ((((int) src[ 2 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 3 + srcOff]) >> 2) & 0x3f);
        dst[ 2 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 13) & 0x7fff)
                | ((((int) src[ 4 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[ 5 + srcOff]) >> 3) & 0x1f);
        dst[ 3 + dstOff] =
                  ((((int) src[ 5 + srcOff]) << 12) & 0x7fff)
                | ((((int) src[ 6 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 7 + srcOff]) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src[ 7 + srcOff]) << 11) & 0x7fff)
                | ((((int) src[ 8 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[ 9 + srcOff]) >> 5) & 0x7);
        dst[ 5 + dstOff] =
                  ((((int) src[ 9 + srcOff]) << 10) & 0x7fff)
                | ((((int) src[10 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[11 + srcOff]) >> 6) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src[11 + srcOff]) << 9) & 0x7fff)
                | ((((int) src[12 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[13 + srcOff]) >> 7) & 0x1);
        dst[ 7 + dstOff] =
                  ((((int) src[13 + srcOff]) << 8) & 0x7fff)
                | ((((int) src[14 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE16(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 1 + srcOff]) << 0) & 0xff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 3 + srcOff]) << 0) & 0xff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 4 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 5 + srcOff]) << 0) & 0xff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 7 + srcOff]) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 8 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 9 + srcOff]) << 0) & 0xff);
        dst[ 5 + dstOff] =
                  ((((int) src[10 + srcOff]) << 8) & 0xffff)
                | ((((int) src[11 + srcOff]) << 0) & 0xff);
        dst[ 6 + dstOff] =
                  ((((int) src[12 + srcOff]) << 8) & 0xffff)
                | ((((int) src[13 + srcOff]) << 0) & 0xff);
        dst[ 7 + dstOff] =
                  ((((int) src[14 + srcOff]) << 8) & 0xffff)
                | ((((int) src[15 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE17(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 9) & 0x1ffff)
                | ((((int) src[ 1 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[ 2 + srcOff]) >> 7) & 0x1);
        dst[ 1 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 10) & 0x1ffff)
                | ((((int) src[ 3 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 4 + srcOff]) >> 6) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src[ 4 + srcOff]) << 11) & 0x1ffff)
                | ((((int) src[ 5 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[ 6 + srcOff]) >> 5) & 0x7);
        dst[ 3 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 12) & 0x1ffff)
                | ((((int) src[ 7 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 8 + srcOff]) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src[ 8 + srcOff]) << 13) & 0x1ffff)
                | ((((int) src[ 9 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[10 + srcOff]) >> 3) & 0x1f);
        dst[ 5 + dstOff] =
                  ((((int) src[10 + srcOff]) << 14) & 0x1ffff)
                | ((((int) src[11 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[12 + srcOff]) >> 2) & 0x3f);
        dst[ 6 + dstOff] =
                  ((((int) src[12 + srcOff]) << 15) & 0x1ffff)
                | ((((int) src[13 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[14 + srcOff]) >> 1) & 0x7f);
        dst[ 7 + dstOff] =
                  ((((int) src[14 + srcOff]) << 16) & 0x1ffff)
                | ((((int) src[15 + srcOff]) << 8) & 0xffff)
                | ((((int) src[16 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE18(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[ 1 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 2 + srcOff]) >> 6) & 0x3);
        dst[ 1 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 12) & 0x3ffff)
                | ((((int) src[ 3 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 4 + srcOff]) >> 4) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src[ 4 + srcOff]) << 14) & 0x3ffff)
                | ((((int) src[ 5 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 6 + srcOff]) >> 2) & 0x3f);
        dst[ 3 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 16) & 0x3ffff)
                | ((((int) src[ 7 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 8 + srcOff]) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src[ 9 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[10 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[11 + srcOff]) >> 6) & 0x3);
        dst[ 5 + dstOff] =
                  ((((int) src[11 + srcOff]) << 12) & 0x3ffff)
                | ((((int) src[12 + srcOff]) << 4) & 0xfff)
                | ((((int) src[13 + srcOff]) >> 4) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src[13 + srcOff]) << 14) & 0x3ffff)
                | ((((int) src[14 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[15 + srcOff]) >> 2) & 0x3f);
        dst[ 7 + dstOff] =
                  ((((int) src[15 + srcOff]) << 16) & 0x3ffff)
                | ((((int) src[16 + srcOff]) << 8) & 0xffff)
                | ((((int) src[17 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE19(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 11) & 0x7ffff)
                | ((((int) src[ 1 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[ 2 + srcOff]) >> 5) & 0x7);
        dst[ 1 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 14) & 0x7ffff)
                | ((((int) src[ 3 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 4 + srcOff]) >> 2) & 0x3f);
        dst[ 2 + dstOff] =
                  ((((int) src[ 4 + srcOff]) << 17) & 0x7ffff)
                | ((((int) src[ 5 + srcOff]) << 9) & 0x1ffff)
                | ((((int) src[ 6 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[ 7 + srcOff]) >> 7) & 0x1);
        dst[ 3 + dstOff] =
                  ((((int) src[ 7 + srcOff]) << 12) & 0x7ffff)
                | ((((int) src[ 8 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 9 + srcOff]) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src[ 9 + srcOff]) << 15) & 0x7ffff)
                | ((((int) src[10 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[11 + srcOff]) >> 1) & 0x7f);
        dst[ 5 + dstOff] =
                  ((((int) src[11 + srcOff]) << 18) & 0x7ffff)
                | ((((int) src[12 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[13 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[14 + srcOff]) >> 6) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src[14 + srcOff]) << 13) & 0x7ffff)
                | ((((int) src[15 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[16 + srcOff]) >> 3) & 0x1f);
        dst[ 7 + dstOff] =
                  ((((int) src[16 + srcOff]) << 16) & 0x7ffff)
                | ((((int) src[17 + srcOff]) << 8) & 0xffff)
                | ((((int) src[18 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE20(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[ 1 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 2 + srcOff]) >> 4) & 0xf);
        dst[ 1 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 16) & 0xfffff)
                | ((((int) src[ 3 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 4 + srcOff]) << 0) & 0xff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 5 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[ 6 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 7 + srcOff]) >> 4) & 0xf);
        dst[ 3 + dstOff] =
                  ((((int) src[ 7 + srcOff]) << 16) & 0xfffff)
                | ((((int) src[ 8 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 9 + srcOff]) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src[10 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[11 + srcOff]) << 4) & 0xfff)
                | ((((int) src[12 + srcOff]) >> 4) & 0xf);
        dst[ 5 + dstOff] =
                  ((((int) src[12 + srcOff]) << 16) & 0xfffff)
                | ((((int) src[13 + srcOff]) << 8) & 0xffff)
                | ((((int) src[14 + srcOff]) << 0) & 0xff);
        dst[ 6 + dstOff] =
                  ((((int) src[15 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[16 + srcOff]) << 4) & 0xfff)
                | ((((int) src[17 + srcOff]) >> 4) & 0xf);
        dst[ 7 + dstOff] =
                  ((((int) src[17 + srcOff]) << 16) & 0xfffff)
                | ((((int) src[18 + srcOff]) << 8) & 0xffff)
                | ((((int) src[19 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE21(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 13) & 0x1fffff)
                | ((((int) src[ 1 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[ 2 + srcOff]) >> 3) & 0x1f);
        dst[ 1 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 18) & 0x1fffff)
                | ((((int) src[ 3 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[ 4 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 5 + srcOff]) >> 6) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src[ 5 + srcOff]) << 15) & 0x1fffff)
                | ((((int) src[ 6 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[ 7 + srcOff]) >> 1) & 0x7f);
        dst[ 3 + dstOff] =
                  ((((int) src[ 7 + srcOff]) << 20) & 0x1fffff)
                | ((((int) src[ 8 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[ 9 + srcOff]) << 4) & 0xfff)
                | ((((int) src[10 + srcOff]) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src[10 + srcOff]) << 17) & 0x1fffff)
                | ((((int) src[11 + srcOff]) << 9) & 0x1ffff)
                | ((((int) src[12 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[13 + srcOff]) >> 7) & 0x1);
        dst[ 5 + dstOff] =
                  ((((int) src[13 + srcOff]) << 14) & 0x1fffff)
                | ((((int) src[14 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[15 + srcOff]) >> 2) & 0x3f);
        dst[ 6 + dstOff] =
                  ((((int) src[15 + srcOff]) << 19) & 0x1fffff)
                | ((((int) src[16 + srcOff]) << 11) & 0x7ffff)
                | ((((int) src[17 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[18 + srcOff]) >> 5) & 0x7);
        dst[ 7 + dstOff] =
                  ((((int) src[18 + srcOff]) << 16) & 0x1fffff)
                | ((((int) src[19 + srcOff]) << 8) & 0xffff)
                | ((((int) src[20 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE22(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[ 1 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 2 + srcOff]) >> 2) & 0x3f);
        dst[ 1 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 20) & 0x3fffff)
                | ((((int) src[ 3 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[ 4 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 5 + srcOff]) >> 4) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src[ 5 + srcOff]) << 18) & 0x3fffff)
                | ((((int) src[ 6 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[ 7 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 8 + srcOff]) >> 6) & 0x3);
        dst[ 3 + dstOff] =
                  ((((int) src[ 8 + srcOff]) << 16) & 0x3fffff)
                | ((((int) src[ 9 + srcOff]) << 8) & 0xffff)
                | ((((int) src[10 + srcOff]) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src[11 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[12 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[13 + srcOff]) >> 2) & 0x3f);
        dst[ 5 + dstOff] =
                  ((((int) src[13 + srcOff]) << 20) & 0x3fffff)
                | ((((int) src[14 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[15 + srcOff]) << 4) & 0xfff)
                | ((((int) src[16 + srcOff]) >> 4) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src[16 + srcOff]) << 18) & 0x3fffff)
                | ((((int) src[17 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[18 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[19 + srcOff]) >> 6) & 0x3);
        dst[ 7 + dstOff] =
                  ((((int) src[19 + srcOff]) << 16) & 0x3fffff)
                | ((((int) src[20 + srcOff]) << 8) & 0xffff)
                | ((((int) src[21 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE23(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 15) & 0x7fffff)
                | ((((int) src[ 1 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[ 2 + srcOff]) >> 1) & 0x7f);
        dst[ 1 + dstOff] =
                  ((((int) src[ 2 + srcOff]) << 22) & 0x7fffff)
                | ((((int) src[ 3 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[ 4 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 5 + srcOff]) >> 2) & 0x3f);
        dst[ 2 + dstOff] =
                  ((((int) src[ 5 + srcOff]) << 21) & 0x7fffff)
                | ((((int) src[ 6 + srcOff]) << 13) & 0x1fffff)
                | ((((int) src[ 7 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[ 8 + srcOff]) >> 3) & 0x1f);
        dst[ 3 + dstOff] =
                  ((((int) src[ 8 + srcOff]) << 20) & 0x7fffff)
                | ((((int) src[ 9 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[10 + srcOff]) << 4) & 0xfff)
                | ((((int) src[11 + srcOff]) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src[11 + srcOff]) << 19) & 0x7fffff)
                | ((((int) src[12 + srcOff]) << 11) & 0x7ffff)
                | ((((int) src[13 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[14 + srcOff]) >> 5) & 0x7);
        dst[ 5 + dstOff] =
                  ((((int) src[14 + srcOff]) << 18) & 0x7fffff)
                | ((((int) src[15 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[16 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[17 + srcOff]) >> 6) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src[17 + srcOff]) << 17) & 0x7fffff)
                | ((((int) src[18 + srcOff]) << 9) & 0x1ffff)
                | ((((int) src[19 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[20 + srcOff]) >> 7) & 0x1);
        dst[ 7 + dstOff] =
                  ((((int) src[20 + srcOff]) << 16) & 0x7fffff)
                | ((((int) src[21 + srcOff]) << 8) & 0xffff)
                | ((((int) src[22 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE24(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[ 1 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 2 + srcOff]) << 0) & 0xff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[ 4 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 5 + srcOff]) << 0) & 0xff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[ 7 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 8 + srcOff]) << 0) & 0xff);
        dst[ 3 + dstOff] =
                  ((((int) src[ 9 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[10 + srcOff]) << 8) & 0xffff)
                | ((((int) src[11 + srcOff]) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src[12 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[13 + srcOff]) << 8) & 0xffff)
                | ((((int) src[14 + srcOff]) << 0) & 0xff);
        dst[ 5 + dstOff] =
                  ((((int) src[15 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[16 + srcOff]) << 8) & 0xffff)
                | ((((int) src[17 + srcOff]) << 0) & 0xff);
        dst[ 6 + dstOff] =
                  ((((int) src[18 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[19 + srcOff]) << 8) & 0xffff)
                | ((((int) src[20 + srcOff]) << 0) & 0xff);
        dst[ 7 + dstOff] =
                  ((((int) src[21 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[22 + srcOff]) << 8) & 0xffff)
                | ((((int) src[23 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE25(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 17) & 0x1ffffff)
                | ((((int) src[ 1 + srcOff]) << 9) & 0x1ffff)
                | ((((int) src[ 2 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[ 3 + srcOff]) >> 7) & 0x1);
        dst[ 1 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 18) & 0x1ffffff)
                | ((((int) src[ 4 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[ 5 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 6 + srcOff]) >> 6) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 19) & 0x1ffffff)
                | ((((int) src[ 7 + srcOff]) << 11) & 0x7ffff)
                | ((((int) src[ 8 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[ 9 + srcOff]) >> 5) & 0x7);
        dst[ 3 + dstOff] =
                  ((((int) src[ 9 + srcOff]) << 20) & 0x1ffffff)
                | ((((int) src[10 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[11 + srcOff]) << 4) & 0xfff)
                | ((((int) src[12 + srcOff]) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src[12 + srcOff]) << 21) & 0x1ffffff)
                | ((((int) src[13 + srcOff]) << 13) & 0x1fffff)
                | ((((int) src[14 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[15 + srcOff]) >> 3) & 0x1f);
        dst[ 5 + dstOff] =
                  ((((int) src[15 + srcOff]) << 22) & 0x1ffffff)
                | ((((int) src[16 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[17 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[18 + srcOff]) >> 2) & 0x3f);
        dst[ 6 + dstOff] =
                  ((((int) src[18 + srcOff]) << 23) & 0x1ffffff)
                | ((((int) src[19 + srcOff]) << 15) & 0x7fffff)
                | ((((int) src[20 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[21 + srcOff]) >> 1) & 0x7f);
        dst[ 7 + dstOff] =
                  ((((int) src[21 + srcOff]) << 24) & 0x1ffffff)
                | ((((int) src[22 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[23 + srcOff]) << 8) & 0xffff)
                | ((((int) src[24 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE26(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 18) & 0x3ffffff)
                | ((((int) src[ 1 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[ 2 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 3 + srcOff]) >> 6) & 0x3);
        dst[ 1 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 20) & 0x3ffffff)
                | ((((int) src[ 4 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[ 5 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 6 + srcOff]) >> 4) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 22) & 0x3ffffff)
                | ((((int) src[ 7 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[ 8 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 9 + srcOff]) >> 2) & 0x3f);
        dst[ 3 + dstOff] =
                  ((((int) src[ 9 + srcOff]) << 24) & 0x3ffffff)
                | ((((int) src[10 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[11 + srcOff]) << 8) & 0xffff)
                | ((((int) src[12 + srcOff]) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src[13 + srcOff]) << 18) & 0x3ffffff)
                | ((((int) src[14 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[15 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[16 + srcOff]) >> 6) & 0x3);
        dst[ 5 + dstOff] =
                  ((((int) src[16 + srcOff]) << 20) & 0x3ffffff)
                | ((((int) src[17 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[18 + srcOff]) << 4) & 0xfff)
                | ((((int) src[19 + srcOff]) >> 4) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src[19 + srcOff]) << 22) & 0x3ffffff)
                | ((((int) src[20 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[21 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[22 + srcOff]) >> 2) & 0x3f);
        dst[ 7 + dstOff] =
                  ((((int) src[22 + srcOff]) << 24) & 0x3ffffff)
                | ((((int) src[23 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[24 + srcOff]) << 8) & 0xffff)
                | ((((int) src[25 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE27(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 19) & 0x7ffffff)
                | ((((int) src[ 1 + srcOff]) << 11) & 0x7ffff)
                | ((((int) src[ 2 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[ 3 + srcOff]) >> 5) & 0x7);
        dst[ 1 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 22) & 0x7ffffff)
                | ((((int) src[ 4 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[ 5 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 6 + srcOff]) >> 2) & 0x3f);
        dst[ 2 + dstOff] =
                  ((((int) src[ 6 + srcOff]) << 25) & 0x7ffffff)
                | ((((int) src[ 7 + srcOff]) << 17) & 0x1ffffff)
                | ((((int) src[ 8 + srcOff]) << 9) & 0x1ffff)
                | ((((int) src[ 9 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[10 + srcOff]) >> 7) & 0x1);
        dst[ 3 + dstOff] =
                  ((((int) src[10 + srcOff]) << 20) & 0x7ffffff)
                | ((((int) src[11 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[12 + srcOff]) << 4) & 0xfff)
                | ((((int) src[13 + srcOff]) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src[13 + srcOff]) << 23) & 0x7ffffff)
                | ((((int) src[14 + srcOff]) << 15) & 0x7fffff)
                | ((((int) src[15 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[16 + srcOff]) >> 1) & 0x7f);
        dst[ 5 + dstOff] =
                  ((((int) src[16 + srcOff]) << 26) & 0x7ffffff)
                | ((((int) src[17 + srcOff]) << 18) & 0x3ffffff)
                | ((((int) src[18 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[19 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[20 + srcOff]) >> 6) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src[20 + srcOff]) << 21) & 0x7ffffff)
                | ((((int) src[21 + srcOff]) << 13) & 0x1fffff)
                | ((((int) src[22 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[23 + srcOff]) >> 3) & 0x1f);
        dst[ 7 + dstOff] =
                  ((((int) src[23 + srcOff]) << 24) & 0x7ffffff)
                | ((((int) src[24 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[25 + srcOff]) << 8) & 0xffff)
                | ((((int) src[26 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE28(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 20) & 0xfffffff)
                | ((((int) src[ 1 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[ 2 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 3 + srcOff]) >> 4) & 0xf);
        dst[ 1 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 24) & 0xfffffff)
                | ((((int) src[ 4 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[ 5 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 6 + srcOff]) << 0) & 0xff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 7 + srcOff]) << 20) & 0xfffffff)
                | ((((int) src[ 8 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[ 9 + srcOff]) << 4) & 0xfff)
                | ((((int) src[10 + srcOff]) >> 4) & 0xf);
        dst[ 3 + dstOff] =
                  ((((int) src[10 + srcOff]) << 24) & 0xfffffff)
                | ((((int) src[11 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[12 + srcOff]) << 8) & 0xffff)
                | ((((int) src[13 + srcOff]) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src[14 + srcOff]) << 20) & 0xfffffff)
                | ((((int) src[15 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[16 + srcOff]) << 4) & 0xfff)
                | ((((int) src[17 + srcOff]) >> 4) & 0xf);
        dst[ 5 + dstOff] =
                  ((((int) src[17 + srcOff]) << 24) & 0xfffffff)
                | ((((int) src[18 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[19 + srcOff]) << 8) & 0xffff)
                | ((((int) src[20 + srcOff]) << 0) & 0xff);
        dst[ 6 + dstOff] =
                  ((((int) src[21 + srcOff]) << 20) & 0xfffffff)
                | ((((int) src[22 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[23 + srcOff]) << 4) & 0xfff)
                | ((((int) src[24 + srcOff]) >> 4) & 0xf);
        dst[ 7 + dstOff] =
                  ((((int) src[24 + srcOff]) << 24) & 0xfffffff)
                | ((((int) src[25 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[26 + srcOff]) << 8) & 0xffff)
                | ((((int) src[27 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE29(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 21) & 0x1fffffff)
                | ((((int) src[ 1 + srcOff]) << 13) & 0x1fffff)
                | ((((int) src[ 2 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[ 3 + srcOff]) >> 3) & 0x1f);
        dst[ 1 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 26) & 0x1fffffff)
                | ((((int) src[ 4 + srcOff]) << 18) & 0x3ffffff)
                | ((((int) src[ 5 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[ 6 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[ 7 + srcOff]) >> 6) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src[ 7 + srcOff]) << 23) & 0x1fffffff)
                | ((((int) src[ 8 + srcOff]) << 15) & 0x7fffff)
                | ((((int) src[ 9 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[10 + srcOff]) >> 1) & 0x7f);
        dst[ 3 + dstOff] =
                  ((((int) src[10 + srcOff]) << 28) & 0x1fffffff)
                | ((((int) src[11 + srcOff]) << 20) & 0xfffffff)
                | ((((int) src[12 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[13 + srcOff]) << 4) & 0xfff)
                | ((((int) src[14 + srcOff]) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src[14 + srcOff]) << 25) & 0x1fffffff)
                | ((((int) src[15 + srcOff]) << 17) & 0x1ffffff)
                | ((((int) src[16 + srcOff]) << 9) & 0x1ffff)
                | ((((int) src[17 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[18 + srcOff]) >> 7) & 0x1);
        dst[ 5 + dstOff] =
                  ((((int) src[18 + srcOff]) << 22) & 0x1fffffff)
                | ((((int) src[19 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[20 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[21 + srcOff]) >> 2) & 0x3f);
        dst[ 6 + dstOff] =
                  ((((int) src[21 + srcOff]) << 27) & 0x1fffffff)
                | ((((int) src[22 + srcOff]) << 19) & 0x7ffffff)
                | ((((int) src[23 + srcOff]) << 11) & 0x7ffff)
                | ((((int) src[24 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[25 + srcOff]) >> 5) & 0x7);
        dst[ 7 + dstOff] =
                  ((((int) src[25 + srcOff]) << 24) & 0x1fffffff)
                | ((((int) src[26 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[27 + srcOff]) << 8) & 0xffff)
                | ((((int) src[28 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE30(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 22) & 0x3fffffff)
                | ((((int) src[ 1 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[ 2 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 3 + srcOff]) >> 2) & 0x3f);
        dst[ 1 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 28) & 0x3fffffff)
                | ((((int) src[ 4 + srcOff]) << 20) & 0xfffffff)
                | ((((int) src[ 5 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[ 6 + srcOff]) << 4) & 0xfff)
                | ((((int) src[ 7 + srcOff]) >> 4) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src[ 7 + srcOff]) << 26) & 0x3fffffff)
                | ((((int) src[ 8 + srcOff]) << 18) & 0x3ffffff)
                | ((((int) src[ 9 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[10 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[11 + srcOff]) >> 6) & 0x3);
        dst[ 3 + dstOff] =
                  ((((int) src[11 + srcOff]) << 24) & 0x3fffffff)
                | ((((int) src[12 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[13 + srcOff]) << 8) & 0xffff)
                | ((((int) src[14 + srcOff]) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src[15 + srcOff]) << 22) & 0x3fffffff)
                | ((((int) src[16 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[17 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[18 + srcOff]) >> 2) & 0x3f);
        dst[ 5 + dstOff] =
                  ((((int) src[18 + srcOff]) << 28) & 0x3fffffff)
                | ((((int) src[19 + srcOff]) << 20) & 0xfffffff)
                | ((((int) src[20 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[21 + srcOff]) << 4) & 0xfff)
                | ((((int) src[22 + srcOff]) >> 4) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src[22 + srcOff]) << 26) & 0x3fffffff)
                | ((((int) src[23 + srcOff]) << 18) & 0x3ffffff)
                | ((((int) src[24 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[25 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[26 + srcOff]) >> 6) & 0x3);
        dst[ 7 + dstOff] =
                  ((((int) src[26 + srcOff]) << 24) & 0x3fffffff)
                | ((((int) src[27 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[28 + srcOff]) << 8) & 0xffff)
                | ((((int) src[29 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE31(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 23) & 0x7fffffff)
                | ((((int) src[ 1 + srcOff]) << 15) & 0x7fffff)
                | ((((int) src[ 2 + srcOff]) << 7) & 0x7fff)
                | ((((int) src[ 3 + srcOff]) >> 1) & 0x7f);
        dst[ 1 + dstOff] =
                  ((((int) src[ 3 + srcOff]) << 30) & 0x7fffffff)
                | ((((int) src[ 4 + srcOff]) << 22) & 0x3fffffff)
                | ((((int) src[ 5 + srcOff]) << 14) & 0x3fffff)
                | ((((int) src[ 6 + srcOff]) << 6) & 0x3fff)
                | ((((int) src[ 7 + srcOff]) >> 2) & 0x3f);
        dst[ 2 + dstOff] =
                  ((((int) src[ 7 + srcOff]) << 29) & 0x7fffffff)
                | ((((int) src[ 8 + srcOff]) << 21) & 0x1fffffff)
                | ((((int) src[ 9 + srcOff]) << 13) & 0x1fffff)
                | ((((int) src[10 + srcOff]) << 5) & 0x1fff)
                | ((((int) src[11 + srcOff]) >> 3) & 0x1f);
        dst[ 3 + dstOff] =
                  ((((int) src[11 + srcOff]) << 28) & 0x7fffffff)
                | ((((int) src[12 + srcOff]) << 20) & 0xfffffff)
                | ((((int) src[13 + srcOff]) << 12) & 0xfffff)
                | ((((int) src[14 + srcOff]) << 4) & 0xfff)
                | ((((int) src[15 + srcOff]) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src[15 + srcOff]) << 27) & 0x7fffffff)
                | ((((int) src[16 + srcOff]) << 19) & 0x7ffffff)
                | ((((int) src[17 + srcOff]) << 11) & 0x7ffff)
                | ((((int) src[18 + srcOff]) << 3) & 0x7ff)
                | ((((int) src[19 + srcOff]) >> 5) & 0x7);
        dst[ 5 + dstOff] =
                  ((((int) src[19 + srcOff]) << 26) & 0x7fffffff)
                | ((((int) src[20 + srcOff]) << 18) & 0x3ffffff)
                | ((((int) src[21 + srcOff]) << 10) & 0x3ffff)
                | ((((int) src[22 + srcOff]) << 2) & 0x3ff)
                | ((((int) src[23 + srcOff]) >> 6) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src[23 + srcOff]) << 25) & 0x7fffffff)
                | ((((int) src[24 + srcOff]) << 17) & 0x1ffffff)
                | ((((int) src[25 + srcOff]) << 9) & 0x1ffff)
                | ((((int) src[26 + srcOff]) << 1) & 0x1ff)
                | ((((int) src[27 + srcOff]) >> 7) & 0x1);
        dst[ 7 + dstOff] =
                  ((((int) src[27 + srcOff]) << 24) & 0x7fffffff)
                | ((((int) src[28 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[29 + srcOff]) << 8) & 0xffff)
                | ((((int) src[30 + srcOff]) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE32(byte[] src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src[ 0 + srcOff]) << 24) & -1)
                | ((((int) src[ 1 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[ 2 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 3 + srcOff]) << 0) & 0xff);
        dst[ 1 + dstOff] =
                  ((((int) src[ 4 + srcOff]) << 24) & -1)
                | ((((int) src[ 5 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[ 6 + srcOff]) << 8) & 0xffff)
                | ((((int) src[ 7 + srcOff]) << 0) & 0xff);
        dst[ 2 + dstOff] =
                  ((((int) src[ 8 + srcOff]) << 24) & -1)
                | ((((int) src[ 9 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[10 + srcOff]) << 8) & 0xffff)
                | ((((int) src[11 + srcOff]) << 0) & 0xff);
        dst[ 3 + dstOff] =
                  ((((int) src[12 + srcOff]) << 24) & -1)
                | ((((int) src[13 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[14 + srcOff]) << 8) & 0xffff)
                | ((((int) src[15 + srcOff]) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src[16 + srcOff]) << 24) & -1)
                | ((((int) src[17 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[18 + srcOff]) << 8) & 0xffff)
                | ((((int) src[19 + srcOff]) << 0) & 0xff);
        dst[ 5 + dstOff] =
                  ((((int) src[20 + srcOff]) << 24) & -1)
                | ((((int) src[21 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[22 + srcOff]) << 8) & 0xffff)
                | ((((int) src[23 + srcOff]) << 0) & 0xff);
        dst[ 6 + dstOff] =
                  ((((int) src[24 + srcOff]) << 24) & -1)
                | ((((int) src[25 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[26 + srcOff]) << 8) & 0xffff)
                | ((((int) src[27 + srcOff]) << 0) & 0xff);
        dst[ 7 + dstOff] =
                  ((((int) src[28 + srcOff]) << 24) & -1)
                | ((((int) src[29 + srcOff]) << 16) & 0xffffff)
                | ((((int) src[30 + srcOff]) << 8) & 0xffff)
                | ((((int) src[31 + srcOff]) << 0) & 0xff);
    }

    public static void unpack(IntToLongFunction src, int srcOff, int[] dst, int dstOff, int bits)
    {
        switch (bits) {
        case 0:
            // do nothing
            break;
        case 1:
            bitUnpack8IntBE1(src, srcOff, dst, dstOff);
            break;
        case 2:
            bitUnpack8IntBE2(src, srcOff, dst, dstOff);
            break;
        case 3:
            bitUnpack8IntBE3(src, srcOff, dst, dstOff);
            break;
        case 4:
            bitUnpack8IntBE4(src, srcOff, dst, dstOff);
            break;
        case 5:
            bitUnpack8IntBE5(src, srcOff, dst, dstOff);
            break;
        case 6:
            bitUnpack8IntBE6(src, srcOff, dst, dstOff);
            break;
        case 7:
            bitUnpack8IntBE7(src, srcOff, dst, dstOff);
            break;
        case 8:
            bitUnpack8IntBE8(src, srcOff, dst, dstOff);
            break;
        case 9:
            bitUnpack8IntBE9(src, srcOff, dst, dstOff);
            break;
        case 10:
            bitUnpack8IntBE10(src, srcOff, dst, dstOff);
            break;
        case 11:
            bitUnpack8IntBE11(src, srcOff, dst, dstOff);
            break;
        case 12:
            bitUnpack8IntBE12(src, srcOff, dst, dstOff);
            break;
        case 13:
            bitUnpack8IntBE13(src, srcOff, dst, dstOff);
            break;
        case 14:
            bitUnpack8IntBE14(src, srcOff, dst, dstOff);
            break;
        case 15:
            bitUnpack8IntBE15(src, srcOff, dst, dstOff);
            break;
        case 16:
            bitUnpack8IntBE16(src, srcOff, dst, dstOff);
            break;
        case 17:
            bitUnpack8IntBE17(src, srcOff, dst, dstOff);
            break;
        case 18:
            bitUnpack8IntBE18(src, srcOff, dst, dstOff);
            break;
        case 19:
            bitUnpack8IntBE19(src, srcOff, dst, dstOff);
            break;
        case 20:
            bitUnpack8IntBE20(src, srcOff, dst, dstOff);
            break;
        case 21:
            bitUnpack8IntBE21(src, srcOff, dst, dstOff);
            break;
        case 22:
            bitUnpack8IntBE22(src, srcOff, dst, dstOff);
            break;
        case 23:
            bitUnpack8IntBE23(src, srcOff, dst, dstOff);
            break;
        case 24:
            bitUnpack8IntBE24(src, srcOff, dst, dstOff);
            break;
        case 25:
            bitUnpack8IntBE25(src, srcOff, dst, dstOff);
            break;
        case 26:
            bitUnpack8IntBE26(src, srcOff, dst, dstOff);
            break;
        case 27:
            bitUnpack8IntBE27(src, srcOff, dst, dstOff);
            break;
        case 28:
            bitUnpack8IntBE28(src, srcOff, dst, dstOff);
            break;
        case 29:
            bitUnpack8IntBE29(src, srcOff, dst, dstOff);
            break;
        case 30:
            bitUnpack8IntBE30(src, srcOff, dst, dstOff);
            break;
        case 31:
            bitUnpack8IntBE31(src, srcOff, dst, dstOff);
            break;
        case 32:
            bitUnpack8IntBE32(src, srcOff, dst, dstOff);
            break;
        default:
            throw new IllegalArgumentException("Bit width must be from 0 to 32 but got " + bits);
        }
    }

    public static void bitUnpack8IntBE1(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 7) & 0x1);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 6) & 0x1);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 5) & 0x1);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 4) & 0x1);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 3) & 0x1);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 2) & 0x1);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 1) & 0x1);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0x1);
    }

    public static void bitUnpack8IntBE2(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 6) & 0x3);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 4) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 2) & 0x3);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0x3);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 6) & 0x3);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 4) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 2) & 0x3);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) << 0) & 0x3);
    }

    public static void bitUnpack8IntBE3(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 5) & 0x7);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 2) & 0x7);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 1) & 0x7)
                | ((((int) src.applyAsLong( 1 + srcOff)) >> 7) & 0x1);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 4) & 0x7);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 1) & 0x7);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) << 2) & 0x7)
                | ((((int) src.applyAsLong( 2 + srcOff)) >> 6) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 3) & 0x7);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 0) & 0x7);
    }

    public static void bitUnpack8IntBE4(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 4) & 0xf);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 0) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 4) & 0xf);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) << 0) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) >> 4) & 0xf);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 0) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 4) & 0xf);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 0) & 0xf);
    }

    public static void bitUnpack8IntBE5(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 3) & 0x1f);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 2) & 0x1f)
                | ((((int) src.applyAsLong( 1 + srcOff)) >> 6) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) >> 1) & 0x1f);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) << 4) & 0x1f)
                | ((((int) src.applyAsLong( 2 + srcOff)) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 1) & 0x1f)
                | ((((int) src.applyAsLong( 3 + srcOff)) >> 7) & 0x1);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 2) & 0x1f);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 3) & 0x1f)
                | ((((int) src.applyAsLong( 4 + srcOff)) >> 5) & 0x7);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) << 0) & 0x1f);
    }

    public static void bitUnpack8IntBE6(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 2) & 0x3f);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 4) & 0x3f)
                | ((((int) src.applyAsLong( 1 + srcOff)) >> 4) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) << 2) & 0x3f)
                | ((((int) src.applyAsLong( 2 + srcOff)) >> 6) & 0x3);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 0) & 0x3f);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) >> 2) & 0x3f);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 4) & 0x3f)
                | ((((int) src.applyAsLong( 4 + srcOff)) >> 4) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) << 2) & 0x3f)
                | ((((int) src.applyAsLong( 5 + srcOff)) >> 6) & 0x3);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) << 0) & 0x3f);
    }

    public static void bitUnpack8IntBE7(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) >> 1) & 0x7f);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 6) & 0x7f)
                | ((((int) src.applyAsLong( 1 + srcOff)) >> 2) & 0x3f);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) << 5) & 0x7f)
                | ((((int) src.applyAsLong( 2 + srcOff)) >> 3) & 0x1f);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 4) & 0x7f)
                | ((((int) src.applyAsLong( 3 + srcOff)) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 3) & 0x7f)
                | ((((int) src.applyAsLong( 4 + srcOff)) >> 5) & 0x7);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) << 2) & 0x7f)
                | ((((int) src.applyAsLong( 5 + srcOff)) >> 6) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) << 1) & 0x7f)
                | ((((int) src.applyAsLong( 6 + srcOff)) >> 7) & 0x1);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 0) & 0x7f);
    }

    public static void bitUnpack8IntBE8(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
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

    public static void bitUnpack8IntBE9(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong( 1 + srcOff)) >> 7) & 0x1);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) << 2) & 0x1ff)
                | ((((int) src.applyAsLong( 2 + srcOff)) >> 6) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 3) & 0x1ff)
                | ((((int) src.applyAsLong( 3 + srcOff)) >> 5) & 0x7);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 4) & 0x1ff)
                | ((((int) src.applyAsLong( 4 + srcOff)) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) << 5) & 0x1ff)
                | ((((int) src.applyAsLong( 5 + srcOff)) >> 3) & 0x1f);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) << 6) & 0x1ff)
                | ((((int) src.applyAsLong( 6 + srcOff)) >> 2) & 0x3f);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 7) & 0x1ff)
                | ((((int) src.applyAsLong( 7 + srcOff)) >> 1) & 0x7f);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) << 8) & 0x1ff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE10(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 1 + srcOff)) >> 6) & 0x3);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) << 4) & 0x3ff)
                | ((((int) src.applyAsLong( 2 + srcOff)) >> 4) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 6) & 0x3ff)
                | ((((int) src.applyAsLong( 3 + srcOff)) >> 2) & 0x3f);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 8) & 0x3ff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 6 + srcOff)) >> 6) & 0x3);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 4) & 0x3ff)
                | ((((int) src.applyAsLong( 7 + srcOff)) >> 4) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) << 6) & 0x3ff)
                | ((((int) src.applyAsLong( 8 + srcOff)) >> 2) & 0x3f);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) << 8) & 0x3ff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE11(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong( 1 + srcOff)) >> 5) & 0x7);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) << 6) & 0x7ff)
                | ((((int) src.applyAsLong( 2 + srcOff)) >> 2) & 0x3f);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 9) & 0x7ff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong( 4 + srcOff)) >> 7) & 0x1);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) << 4) & 0x7ff)
                | ((((int) src.applyAsLong( 5 + srcOff)) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) << 7) & 0x7ff)
                | ((((int) src.applyAsLong( 6 + srcOff)) >> 1) & 0x7f);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 10) & 0x7ff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 8 + srcOff)) >> 6) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) << 5) & 0x7ff)
                | ((((int) src.applyAsLong( 9 + srcOff)) >> 3) & 0x1f);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) << 8) & 0x7ff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE12(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 1 + srcOff)) >> 4) & 0xf);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xfff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 0) & 0xff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 4 + srcOff)) >> 4) & 0xf);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) << 8) & 0xfff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 7 + srcOff)) >> 4) & 0xf);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) << 8) & 0xfff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 0) & 0xff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(10 + srcOff)) >> 4) & 0xf);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) << 8) & 0xfff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE13(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong( 1 + srcOff)) >> 3) & 0x1f);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) << 10) & 0x1fff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 3 + srcOff)) >> 6) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 7) & 0x1fff)
                | ((((int) src.applyAsLong( 4 + srcOff)) >> 1) & 0x7f);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) << 12) & 0x1fff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 6 + srcOff)) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 9) & 0x1fff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong( 8 + srcOff)) >> 7) & 0x1);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) << 6) & 0x1fff)
                | ((((int) src.applyAsLong( 9 + srcOff)) >> 2) & 0x3f);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) << 11) & 0x1fff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong(11 + srcOff)) >> 5) & 0x7);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(11 + srcOff)) << 8) & 0x1fff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE14(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 1 + srcOff)) >> 2) & 0x3f);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) << 12) & 0x3fff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 3 + srcOff)) >> 4) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 10) & 0x3fff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 5 + srcOff)) >> 6) & 0x3);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) << 8) & 0x3fff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 8 + srcOff)) >> 2) & 0x3f);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) << 12) & 0x3fff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(10 + srcOff)) >> 4) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) << 10) & 0x3fff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(12 + srcOff)) >> 6) & 0x3);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(12 + srcOff)) << 8) & 0x3fff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE15(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong( 1 + srcOff)) >> 1) & 0x7f);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 1 + srcOff)) << 14) & 0x7fff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 3 + srcOff)) >> 2) & 0x3f);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 13) & 0x7fff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong( 5 + srcOff)) >> 3) & 0x1f);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) << 12) & 0x7fff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 7 + srcOff)) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) << 11) & 0x7fff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong( 9 + srcOff)) >> 5) & 0x7);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) << 10) & 0x7fff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(11 + srcOff)) >> 6) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(11 + srcOff)) << 9) & 0x7fff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong(13 + srcOff)) >> 7) & 0x1);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(13 + srcOff)) << 8) & 0x7fff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE16(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 0) & 0xff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 0) & 0xff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 0) & 0xff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 0) & 0xff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 0) & 0xff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(12 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 0) & 0xff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(14 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE17(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 9) & 0x1ffff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong( 2 + srcOff)) >> 7) & 0x1);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 10) & 0x1ffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 4 + srcOff)) >> 6) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) << 11) & 0x1ffff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong( 6 + srcOff)) >> 5) & 0x7);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 12) & 0x1ffff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 8 + srcOff)) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) << 13) & 0x1ffff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong(10 + srcOff)) >> 3) & 0x1f);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) << 14) & 0x1ffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(12 + srcOff)) >> 2) & 0x3f);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(12 + srcOff)) << 15) & 0x1ffff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong(14 + srcOff)) >> 1) & 0x7f);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(14 + srcOff)) << 16) & 0x1ffff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE18(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 2 + srcOff)) >> 6) & 0x3);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 12) & 0x3ffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 4 + srcOff)) >> 4) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) << 14) & 0x3ffff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 6 + srcOff)) >> 2) & 0x3f);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 16) & 0x3ffff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(11 + srcOff)) >> 6) & 0x3);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(11 + srcOff)) << 12) & 0x3ffff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(13 + srcOff)) >> 4) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(13 + srcOff)) << 14) & 0x3ffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(15 + srcOff)) >> 2) & 0x3f);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(15 + srcOff)) << 16) & 0x3ffff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE19(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 11) & 0x7ffff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong( 2 + srcOff)) >> 5) & 0x7);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 14) & 0x7ffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 4 + srcOff)) >> 2) & 0x3f);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) << 17) & 0x7ffff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 9) & 0x1ffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong( 7 + srcOff)) >> 7) & 0x1);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) << 12) & 0x7ffff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 9 + srcOff)) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) << 15) & 0x7ffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong(11 + srcOff)) >> 1) & 0x7f);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(11 + srcOff)) << 18) & 0x7ffff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(14 + srcOff)) >> 6) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(14 + srcOff)) << 13) & 0x7ffff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong(16 + srcOff)) >> 3) & 0x1f);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(16 + srcOff)) << 16) & 0x7ffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE20(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 2 + srcOff)) >> 4) & 0xf);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 16) & 0xfffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 0) & 0xff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 7 + srcOff)) >> 4) & 0xf);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) << 16) & 0xfffff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(12 + srcOff)) >> 4) & 0xf);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(12 + srcOff)) << 16) & 0xfffff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 0) & 0xff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(15 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(17 + srcOff)) >> 4) & 0xf);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(17 + srcOff)) << 16) & 0xfffff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE21(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 13) & 0x1fffff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong( 2 + srcOff)) >> 3) & 0x1f);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 18) & 0x1fffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 5 + srcOff)) >> 6) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) << 15) & 0x1fffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong( 7 + srcOff)) >> 1) & 0x7f);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) << 20) & 0x1fffff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(10 + srcOff)) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) << 17) & 0x1fffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 9) & 0x1ffff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong(13 + srcOff)) >> 7) & 0x1);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(13 + srcOff)) << 14) & 0x1fffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(15 + srcOff)) >> 2) & 0x3f);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(15 + srcOff)) << 19) & 0x1fffff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 11) & 0x7ffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong(18 + srcOff)) >> 5) & 0x7);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(18 + srcOff)) << 16) & 0x1fffff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE22(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 2 + srcOff)) >> 2) & 0x3f);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 20) & 0x3fffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 5 + srcOff)) >> 4) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) << 18) & 0x3fffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 8 + srcOff)) >> 6) & 0x3);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) << 16) & 0x3fffff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(11 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(13 + srcOff)) >> 2) & 0x3f);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(13 + srcOff)) << 20) & 0x3fffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(16 + srcOff)) >> 4) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(16 + srcOff)) << 18) & 0x3fffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(19 + srcOff)) >> 6) & 0x3);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(19 + srcOff)) << 16) & 0x3fffff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(21 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE23(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 15) & 0x7fffff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong( 2 + srcOff)) >> 1) & 0x7f);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 2 + srcOff)) << 22) & 0x7fffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 5 + srcOff)) >> 2) & 0x3f);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 5 + srcOff)) << 21) & 0x7fffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 13) & 0x1fffff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong( 8 + srcOff)) >> 3) & 0x1f);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) << 20) & 0x7fffff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(11 + srcOff)) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(11 + srcOff)) << 19) & 0x7fffff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 11) & 0x7ffff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong(14 + srcOff)) >> 5) & 0x7);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(14 + srcOff)) << 18) & 0x7fffff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(17 + srcOff)) >> 6) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(17 + srcOff)) << 17) & 0x7fffff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 9) & 0x1ffff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong(20 + srcOff)) >> 7) & 0x1);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(20 + srcOff)) << 16) & 0x7fffff)
                | ((((int) src.applyAsLong(21 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(22 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE24(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 0) & 0xff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 0) & 0xff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 0) & 0xff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(12 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 0) & 0xff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(15 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 0) & 0xff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(18 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 0) & 0xff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(21 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(22 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(23 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE25(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 17) & 0x1ffffff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 9) & 0x1ffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong( 3 + srcOff)) >> 7) & 0x1);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 18) & 0x1ffffff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 6 + srcOff)) >> 6) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 19) & 0x1ffffff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 11) & 0x7ffff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong( 9 + srcOff)) >> 5) & 0x7);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) << 20) & 0x1ffffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(12 + srcOff)) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(12 + srcOff)) << 21) & 0x1ffffff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 13) & 0x1fffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong(15 + srcOff)) >> 3) & 0x1f);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(15 + srcOff)) << 22) & 0x1ffffff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(18 + srcOff)) >> 2) & 0x3f);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(18 + srcOff)) << 23) & 0x1ffffff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 15) & 0x7fffff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong(21 + srcOff)) >> 1) & 0x7f);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(21 + srcOff)) << 24) & 0x1ffffff)
                | ((((int) src.applyAsLong(22 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(23 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(24 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE26(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 18) & 0x3ffffff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 3 + srcOff)) >> 6) & 0x3);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 20) & 0x3ffffff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 6 + srcOff)) >> 4) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 22) & 0x3ffffff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 9 + srcOff)) >> 2) & 0x3f);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong( 9 + srcOff)) << 24) & 0x3ffffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(13 + srcOff)) << 18) & 0x3ffffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(16 + srcOff)) >> 6) & 0x3);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(16 + srcOff)) << 20) & 0x3ffffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(19 + srcOff)) >> 4) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(19 + srcOff)) << 22) & 0x3ffffff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong(21 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(22 + srcOff)) >> 2) & 0x3f);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(22 + srcOff)) << 24) & 0x3ffffff)
                | ((((int) src.applyAsLong(23 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(24 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(25 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE27(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 19) & 0x7ffffff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 11) & 0x7ffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong( 3 + srcOff)) >> 5) & 0x7);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 22) & 0x7ffffff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 6 + srcOff)) >> 2) & 0x3f);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 6 + srcOff)) << 25) & 0x7ffffff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 17) & 0x1ffffff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 9) & 0x1ffff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong(10 + srcOff)) >> 7) & 0x1);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) << 20) & 0x7ffffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(13 + srcOff)) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(13 + srcOff)) << 23) & 0x7ffffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 15) & 0x7fffff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong(16 + srcOff)) >> 1) & 0x7f);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(16 + srcOff)) << 26) & 0x7ffffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 18) & 0x3ffffff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(20 + srcOff)) >> 6) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(20 + srcOff)) << 21) & 0x7ffffff)
                | ((((int) src.applyAsLong(21 + srcOff)) << 13) & 0x1fffff)
                | ((((int) src.applyAsLong(22 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong(23 + srcOff)) >> 3) & 0x1f);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(23 + srcOff)) << 24) & 0x7ffffff)
                | ((((int) src.applyAsLong(24 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(25 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(26 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE28(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 20) & 0xfffffff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 3 + srcOff)) >> 4) & 0xf);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 24) & 0xfffffff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 0) & 0xff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) << 20) & 0xfffffff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(10 + srcOff)) >> 4) & 0xf);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) << 24) & 0xfffffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(14 + srcOff)) << 20) & 0xfffffff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(17 + srcOff)) >> 4) & 0xf);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(17 + srcOff)) << 24) & 0xfffffff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 0) & 0xff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(21 + srcOff)) << 20) & 0xfffffff)
                | ((((int) src.applyAsLong(22 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(23 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(24 + srcOff)) >> 4) & 0xf);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(24 + srcOff)) << 24) & 0xfffffff)
                | ((((int) src.applyAsLong(25 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(26 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(27 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE29(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 21) & 0x1fffffff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 13) & 0x1fffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong( 3 + srcOff)) >> 3) & 0x1f);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 26) & 0x1fffffff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 18) & 0x3ffffff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong( 7 + srcOff)) >> 6) & 0x3);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) << 23) & 0x1fffffff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 15) & 0x7fffff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong(10 + srcOff)) >> 1) & 0x7f);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong(10 + srcOff)) << 28) & 0x1fffffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 20) & 0xfffffff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(14 + srcOff)) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(14 + srcOff)) << 25) & 0x1fffffff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 17) & 0x1ffffff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 9) & 0x1ffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong(18 + srcOff)) >> 7) & 0x1);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(18 + srcOff)) << 22) & 0x1fffffff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(21 + srcOff)) >> 2) & 0x3f);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(21 + srcOff)) << 27) & 0x1fffffff)
                | ((((int) src.applyAsLong(22 + srcOff)) << 19) & 0x7ffffff)
                | ((((int) src.applyAsLong(23 + srcOff)) << 11) & 0x7ffff)
                | ((((int) src.applyAsLong(24 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong(25 + srcOff)) >> 5) & 0x7);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(25 + srcOff)) << 24) & 0x1fffffff)
                | ((((int) src.applyAsLong(26 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(27 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(28 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE30(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 22) & 0x3fffffff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 3 + srcOff)) >> 2) & 0x3f);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 28) & 0x3fffffff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 20) & 0xfffffff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong( 7 + srcOff)) >> 4) & 0xf);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) << 26) & 0x3fffffff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 18) & 0x3ffffff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(11 + srcOff)) >> 6) & 0x3);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong(11 + srcOff)) << 24) & 0x3fffffff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(15 + srcOff)) << 22) & 0x3fffffff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong(18 + srcOff)) >> 2) & 0x3f);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(18 + srcOff)) << 28) & 0x3fffffff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 20) & 0xfffffff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(21 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(22 + srcOff)) >> 4) & 0xf);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(22 + srcOff)) << 26) & 0x3fffffff)
                | ((((int) src.applyAsLong(23 + srcOff)) << 18) & 0x3ffffff)
                | ((((int) src.applyAsLong(24 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(25 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(26 + srcOff)) >> 6) & 0x3);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(26 + srcOff)) << 24) & 0x3fffffff)
                | ((((int) src.applyAsLong(27 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(28 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(29 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE31(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 23) & 0x7fffffff)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 15) & 0x7fffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 7) & 0x7fff)
                | ((((int) src.applyAsLong( 3 + srcOff)) >> 1) & 0x7f);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 3 + srcOff)) << 30) & 0x7fffffff)
                | ((((int) src.applyAsLong( 4 + srcOff)) << 22) & 0x3fffffff)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 14) & 0x3fffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 6) & 0x3fff)
                | ((((int) src.applyAsLong( 7 + srcOff)) >> 2) & 0x3f);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 7 + srcOff)) << 29) & 0x7fffffff)
                | ((((int) src.applyAsLong( 8 + srcOff)) << 21) & 0x1fffffff)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 13) & 0x1fffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 5) & 0x1fff)
                | ((((int) src.applyAsLong(11 + srcOff)) >> 3) & 0x1f);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong(11 + srcOff)) << 28) & 0x7fffffff)
                | ((((int) src.applyAsLong(12 + srcOff)) << 20) & 0xfffffff)
                | ((((int) src.applyAsLong(13 + srcOff)) << 12) & 0xfffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 4) & 0xfff)
                | ((((int) src.applyAsLong(15 + srcOff)) >> 4) & 0xf);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(15 + srcOff)) << 27) & 0x7fffffff)
                | ((((int) src.applyAsLong(16 + srcOff)) << 19) & 0x7ffffff)
                | ((((int) src.applyAsLong(17 + srcOff)) << 11) & 0x7ffff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 3) & 0x7ff)
                | ((((int) src.applyAsLong(19 + srcOff)) >> 5) & 0x7);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(19 + srcOff)) << 26) & 0x7fffffff)
                | ((((int) src.applyAsLong(20 + srcOff)) << 18) & 0x3ffffff)
                | ((((int) src.applyAsLong(21 + srcOff)) << 10) & 0x3ffff)
                | ((((int) src.applyAsLong(22 + srcOff)) << 2) & 0x3ff)
                | ((((int) src.applyAsLong(23 + srcOff)) >> 6) & 0x3);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(23 + srcOff)) << 25) & 0x7fffffff)
                | ((((int) src.applyAsLong(24 + srcOff)) << 17) & 0x1ffffff)
                | ((((int) src.applyAsLong(25 + srcOff)) << 9) & 0x1ffff)
                | ((((int) src.applyAsLong(26 + srcOff)) << 1) & 0x1ff)
                | ((((int) src.applyAsLong(27 + srcOff)) >> 7) & 0x1);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(27 + srcOff)) << 24) & 0x7fffffff)
                | ((((int) src.applyAsLong(28 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(29 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(30 + srcOff)) << 0) & 0xff);
    }

    public static void bitUnpack8IntBE32(IntToLongFunction src, int srcOff, int[] dst, int dstOff)
    {
        dst[ 0 + dstOff] =
                  ((((int) src.applyAsLong( 0 + srcOff)) << 24) & -1)
                | ((((int) src.applyAsLong( 1 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong( 2 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 3 + srcOff)) << 0) & 0xff);
        dst[ 1 + dstOff] =
                  ((((int) src.applyAsLong( 4 + srcOff)) << 24) & -1)
                | ((((int) src.applyAsLong( 5 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong( 6 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong( 7 + srcOff)) << 0) & 0xff);
        dst[ 2 + dstOff] =
                  ((((int) src.applyAsLong( 8 + srcOff)) << 24) & -1)
                | ((((int) src.applyAsLong( 9 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(10 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(11 + srcOff)) << 0) & 0xff);
        dst[ 3 + dstOff] =
                  ((((int) src.applyAsLong(12 + srcOff)) << 24) & -1)
                | ((((int) src.applyAsLong(13 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(14 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(15 + srcOff)) << 0) & 0xff);
        dst[ 4 + dstOff] =
                  ((((int) src.applyAsLong(16 + srcOff)) << 24) & -1)
                | ((((int) src.applyAsLong(17 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(18 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(19 + srcOff)) << 0) & 0xff);
        dst[ 5 + dstOff] =
                  ((((int) src.applyAsLong(20 + srcOff)) << 24) & -1)
                | ((((int) src.applyAsLong(21 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(22 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(23 + srcOff)) << 0) & 0xff);
        dst[ 6 + dstOff] =
                  ((((int) src.applyAsLong(24 + srcOff)) << 24) & -1)
                | ((((int) src.applyAsLong(25 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(26 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(27 + srcOff)) << 0) & 0xff);
        dst[ 7 + dstOff] =
                  ((((int) src.applyAsLong(28 + srcOff)) << 24) & -1)
                | ((((int) src.applyAsLong(29 + srcOff)) << 16) & 0xffffff)
                | ((((int) src.applyAsLong(30 + srcOff)) << 8) & 0xffff)
                | ((((int) src.applyAsLong(31 + srcOff)) << 0) & 0xff);
    }

}
