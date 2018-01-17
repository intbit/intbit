package io.github.intbit;

final class BitPacking8IntBE
{
    private BitPacking8IntBE()
    { }

    public static void pack(int bits, int[] src, int srcOff, byte[] dst, int dstOff)
    {
        switch (bits) {
        case 0:
            bitPack8IntBE0(src, srcOff, dst, dstOff);
            break;
        case 1:
            bitPack8IntBE1(src, srcOff, dst, dstOff);
            break;
        case 2:
            bitPack8IntBE2(src, srcOff, dst, dstOff);
            break;
        case 3:
            bitPack8IntBE3(src, srcOff, dst, dstOff);
            break;
        case 4:
            bitPack8IntBE4(src, srcOff, dst, dstOff);
            break;
        case 5:
            bitPack8IntBE5(src, srcOff, dst, dstOff);
            break;
        case 6:
            bitPack8IntBE6(src, srcOff, dst, dstOff);
            break;
        case 7:
            bitPack8IntBE7(src, srcOff, dst, dstOff);
            break;
        case 8:
            bitPack8IntBE8(src, srcOff, dst, dstOff);
            break;
        case 9:
            bitPack8IntBE9(src, srcOff, dst, dstOff);
            break;
        case 10:
            bitPack8IntBE10(src, srcOff, dst, dstOff);
            break;
        case 11:
            bitPack8IntBE11(src, srcOff, dst, dstOff);
            break;
        case 12:
            bitPack8IntBE12(src, srcOff, dst, dstOff);
            break;
        case 13:
            bitPack8IntBE13(src, srcOff, dst, dstOff);
            break;
        case 14:
            bitPack8IntBE14(src, srcOff, dst, dstOff);
            break;
        case 15:
            bitPack8IntBE15(src, srcOff, dst, dstOff);
            break;
        case 16:
            bitPack8IntBE16(src, srcOff, dst, dstOff);
            break;
        case 17:
            bitPack8IntBE17(src, srcOff, dst, dstOff);
            break;
        case 18:
            bitPack8IntBE18(src, srcOff, dst, dstOff);
            break;
        case 19:
            bitPack8IntBE19(src, srcOff, dst, dstOff);
            break;
        case 20:
            bitPack8IntBE20(src, srcOff, dst, dstOff);
            break;
        case 21:
            bitPack8IntBE21(src, srcOff, dst, dstOff);
            break;
        case 22:
            bitPack8IntBE22(src, srcOff, dst, dstOff);
            break;
        case 23:
            bitPack8IntBE23(src, srcOff, dst, dstOff);
            break;
        case 24:
            bitPack8IntBE24(src, srcOff, dst, dstOff);
            break;
        case 25:
            bitPack8IntBE25(src, srcOff, dst, dstOff);
            break;
        case 26:
            bitPack8IntBE26(src, srcOff, dst, dstOff);
            break;
        case 27:
            bitPack8IntBE27(src, srcOff, dst, dstOff);
            break;
        case 28:
            bitPack8IntBE28(src, srcOff, dst, dstOff);
            break;
        case 29:
            bitPack8IntBE29(src, srcOff, dst, dstOff);
            break;
        case 30:
            bitPack8IntBE30(src, srcOff, dst, dstOff);
            break;
        case 31:
            bitPack8IntBE31(src, srcOff, dst, dstOff);
            break;
        case 32:
            bitPack8IntBE32(src, srcOff, dst, dstOff);
            break;
        default:
            throw new IllegalArgumentException("Bit width must be from 0 to 32 but got " + bits);
        }
    }

    public static void bitPack8IntBE0(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        // do nothing
    }

    public static void bitPack8IntBE1(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1) <<  7)
                | ((src[ 1 + srcOff] & 0x1) <<  6)
                | ((src[ 2 + srcOff] & 0x1) <<  5)
                | ((src[ 3 + srcOff] & 0x1) <<  4)
                | ((src[ 4 + srcOff] & 0x1) <<  3)
                | ((src[ 5 + srcOff] & 0x1) <<  2)
                | ((src[ 6 + srcOff] & 0x1) <<  1)
                | ((src[ 7 + srcOff] & 0x1) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE2(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3) <<  6)
                | ((src[ 1 + srcOff] & 0x3) <<  4)
                | ((src[ 2 + srcOff] & 0x3) <<  2)
                | ((src[ 3 + srcOff] & 0x3) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3) <<  6)
                | ((src[ 5 + srcOff] & 0x3) <<  4)
                | ((src[ 6 + srcOff] & 0x3) <<  2)
                | ((src[ 7 + srcOff] & 0x3) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE3(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7) <<  5)
                | ((src[ 1 + srcOff] & 0x7) <<  2)
                | ((src[ 2 + srcOff] & 0x7) >>> 1)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7) <<  7)
                | ((src[ 3 + srcOff] & 0x7) <<  4)
                | ((src[ 4 + srcOff] & 0x7) <<  1)
                | ((src[ 5 + srcOff] & 0x7) >>> 2)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7) <<  6)
                | ((src[ 6 + srcOff] & 0x7) <<  3)
                | ((src[ 7 + srcOff] & 0x7) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE4(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xf) <<  4)
                | ((src[ 1 + srcOff] & 0xf) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xf) <<  4)
                | ((src[ 3 + srcOff] & 0xf) <<  0)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xf) <<  4)
                | ((src[ 5 + srcOff] & 0xf) <<  0)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xf) <<  4)
                | ((src[ 7 + srcOff] & 0xf) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE5(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1f) <<  3)
                | ((src[ 1 + srcOff] & 0x1f) >>> 2)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1f) <<  6)
                | ((src[ 2 + srcOff] & 0x1f) <<  1)
                | ((src[ 3 + srcOff] & 0x1f) >>> 4)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1f) <<  4)
                | ((src[ 4 + srcOff] & 0x1f) >>> 1)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1f) <<  7)
                | ((src[ 5 + srcOff] & 0x1f) <<  2)
                | ((src[ 6 + srcOff] & 0x1f) >>> 3)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1f) <<  5)
                | ((src[ 7 + srcOff] & 0x1f) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE6(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3f) <<  2)
                | ((src[ 1 + srcOff] & 0x3f) >>> 4)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3f) <<  4)
                | ((src[ 2 + srcOff] & 0x3f) >>> 2)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3f) <<  6)
                | ((src[ 3 + srcOff] & 0x3f) <<  0)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3f) <<  2)
                | ((src[ 5 + srcOff] & 0x3f) >>> 4)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3f) <<  4)
                | ((src[ 6 + srcOff] & 0x3f) >>> 2)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3f) <<  6)
                | ((src[ 7 + srcOff] & 0x3f) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE7(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7f) <<  1)
                | ((src[ 1 + srcOff] & 0x7f) >>> 6)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7f) <<  2)
                | ((src[ 2 + srcOff] & 0x7f) >>> 5)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7f) <<  3)
                | ((src[ 3 + srcOff] & 0x7f) >>> 4)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7f) <<  4)
                | ((src[ 4 + srcOff] & 0x7f) >>> 3)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7f) <<  5)
                | ((src[ 5 + srcOff] & 0x7f) >>> 2)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7f) <<  6)
                | ((src[ 6 + srcOff] & 0x7f) >>> 1)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7f) <<  7)
                | ((src[ 7 + srcOff] & 0x7f) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE8(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xff) <<  0)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xff) <<  0)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xff) <<  0)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xff) <<  0)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xff) <<  0)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xff) <<  0)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xff) <<  0)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE9(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ff) >>> 1)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ff) <<  7)
                | ((src[ 1 + srcOff] & 0x1ff) >>> 2)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ff) <<  6)
                | ((src[ 2 + srcOff] & 0x1ff) >>> 3)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ff) <<  5)
                | ((src[ 3 + srcOff] & 0x1ff) >>> 4)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ff) <<  4)
                | ((src[ 4 + srcOff] & 0x1ff) >>> 5)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ff) <<  3)
                | ((src[ 5 + srcOff] & 0x1ff) >>> 6)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ff) <<  2)
                | ((src[ 6 + srcOff] & 0x1ff) >>> 7)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ff) <<  1)
                | ((src[ 7 + srcOff] & 0x1ff) >>> 8)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE10(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ff) >>> 2)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ff) <<  6)
                | ((src[ 1 + srcOff] & 0x3ff) >>> 4)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ff) <<  4)
                | ((src[ 2 + srcOff] & 0x3ff) >>> 6)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ff) <<  2)
                | ((src[ 3 + srcOff] & 0x3ff) >>> 8)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ff) <<  0)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ff) >>> 2)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ff) <<  6)
                | ((src[ 5 + srcOff] & 0x3ff) >>> 4)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ff) <<  4)
                | ((src[ 6 + srcOff] & 0x3ff) >>> 6)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ff) <<  2)
                | ((src[ 7 + srcOff] & 0x3ff) >>> 8)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE11(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ff) >>> 3)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ff) <<  5)
                | ((src[ 1 + srcOff] & 0x7ff) >>> 6)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ff) <<  2)
                | ((src[ 2 + srcOff] & 0x7ff) >>> 9)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ff) >>> 1)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ff) <<  7)
                | ((src[ 3 + srcOff] & 0x7ff) >>> 4)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ff) <<  4)
                | ((src[ 4 + srcOff] & 0x7ff) >>> 7)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ff) <<  1)
                | ((src[ 5 + srcOff] & 0x7ff) >>> 10)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ff) >>> 2)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ff) <<  6)
                | ((src[ 6 + srcOff] & 0x7ff) >>> 5)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ff) <<  3)
                | ((src[ 7 + srcOff] & 0x7ff) >>> 8)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE12(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfff) >>> 4)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfff) <<  4)
                | ((src[ 1 + srcOff] & 0xfff) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfff) <<  0)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfff) >>> 4)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfff) <<  4)
                | ((src[ 3 + srcOff] & 0xfff) >>> 8)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfff) <<  0)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfff) >>> 4)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfff) <<  4)
                | ((src[ 5 + srcOff] & 0xfff) >>> 8)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfff) <<  0)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfff) >>> 4)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfff) <<  4)
                | ((src[ 7 + srcOff] & 0xfff) >>> 8)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE13(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fff) >>> 5)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fff) <<  3)
                | ((src[ 1 + srcOff] & 0x1fff) >>> 10)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fff) >>> 2)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fff) <<  6)
                | ((src[ 2 + srcOff] & 0x1fff) >>> 7)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fff) <<  1)
                | ((src[ 3 + srcOff] & 0x1fff) >>> 12)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fff) >>> 4)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fff) <<  4)
                | ((src[ 4 + srcOff] & 0x1fff) >>> 9)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fff) >>> 1)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fff) <<  7)
                | ((src[ 5 + srcOff] & 0x1fff) >>> 6)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fff) <<  2)
                | ((src[ 6 + srcOff] & 0x1fff) >>> 11)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fff) >>> 3)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fff) <<  5)
                | ((src[ 7 + srcOff] & 0x1fff) >>> 8)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE14(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fff) >>> 6)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fff) <<  2)
                | ((src[ 1 + srcOff] & 0x3fff) >>> 12)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fff) >>> 4)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fff) <<  4)
                | ((src[ 2 + srcOff] & 0x3fff) >>> 10)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fff) >>> 2)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fff) <<  6)
                | ((src[ 3 + srcOff] & 0x3fff) >>> 8)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fff) <<  0)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fff) >>> 6)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fff) <<  2)
                | ((src[ 5 + srcOff] & 0x3fff) >>> 12)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fff) >>> 4)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fff) <<  4)
                | ((src[ 6 + srcOff] & 0x3fff) >>> 10)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fff) >>> 2)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fff) <<  6)
                | ((src[ 7 + srcOff] & 0x3fff) >>> 8)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE15(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fff) >>> 7)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fff) <<  1)
                | ((src[ 1 + srcOff] & 0x7fff) >>> 14)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fff) >>> 6)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fff) <<  2)
                | ((src[ 2 + srcOff] & 0x7fff) >>> 13)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fff) >>> 5)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fff) <<  3)
                | ((src[ 3 + srcOff] & 0x7fff) >>> 12)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fff) >>> 4)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fff) <<  4)
                | ((src[ 4 + srcOff] & 0x7fff) >>> 11)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fff) >>> 3)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fff) <<  5)
                | ((src[ 5 + srcOff] & 0x7fff) >>> 10)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fff) >>> 2)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fff) <<  6)
                | ((src[ 6 + srcOff] & 0x7fff) >>> 9)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fff) >>> 1)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fff) <<  7)
                | ((src[ 7 + srcOff] & 0x7fff) >>> 8)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE16(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffff) >>> 8)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffff) <<  0)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffff) >>> 8)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffff) <<  0)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffff) >>> 8)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffff) <<  0)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffff) >>> 8)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffff) <<  0)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffff) >>> 8)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffff) <<  0)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffff) >>> 8)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffff) <<  0)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffff) >>> 8)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffff) <<  0)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffff) >>> 8)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE17(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffff) >>> 9)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffff) >>> 1)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffff) <<  7)
                | ((src[ 1 + srcOff] & 0x1ffff) >>> 10)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffff) >>> 2)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffff) <<  6)
                | ((src[ 2 + srcOff] & 0x1ffff) >>> 11)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffff) >>> 3)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffff) <<  5)
                | ((src[ 3 + srcOff] & 0x1ffff) >>> 12)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffff) >>> 4)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffff) <<  4)
                | ((src[ 4 + srcOff] & 0x1ffff) >>> 13)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffff) >>> 5)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffff) <<  3)
                | ((src[ 5 + srcOff] & 0x1ffff) >>> 14)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffff) >>> 6)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffff) <<  2)
                | ((src[ 6 + srcOff] & 0x1ffff) >>> 15)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffff) >>> 7)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffff) <<  1)
                | ((src[ 7 + srcOff] & 0x1ffff) >>> 16)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffff) >>> 8)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE18(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffff) >>> 10)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffff) >>> 2)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffff) <<  6)
                | ((src[ 1 + srcOff] & 0x3ffff) >>> 12)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffff) >>> 4)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffff) <<  4)
                | ((src[ 2 + srcOff] & 0x3ffff) >>> 14)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffff) >>> 6)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffff) <<  2)
                | ((src[ 3 + srcOff] & 0x3ffff) >>> 16)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffff) >>> 8)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffff) <<  0)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffff) >>> 10)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffff) >>> 2)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffff) <<  6)
                | ((src[ 5 + srcOff] & 0x3ffff) >>> 12)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffff) >>> 4)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffff) <<  4)
                | ((src[ 6 + srcOff] & 0x3ffff) >>> 14)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffff) >>> 6)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffff) <<  2)
                | ((src[ 7 + srcOff] & 0x3ffff) >>> 16)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffff) >>> 8)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE19(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffff) >>> 11)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffff) >>> 3)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffff) <<  5)
                | ((src[ 1 + srcOff] & 0x7ffff) >>> 14)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffff) >>> 6)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffff) <<  2)
                | ((src[ 2 + srcOff] & 0x7ffff) >>> 17)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffff) >>> 9)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffff) >>> 1)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffff) <<  7)
                | ((src[ 3 + srcOff] & 0x7ffff) >>> 12)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffff) >>> 4)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffff) <<  4)
                | ((src[ 4 + srcOff] & 0x7ffff) >>> 15)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffff) >>> 7)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffff) <<  1)
                | ((src[ 5 + srcOff] & 0x7ffff) >>> 18)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffff) >>> 10)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffff) >>> 2)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffff) <<  6)
                | ((src[ 6 + srcOff] & 0x7ffff) >>> 13)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffff) >>> 5)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffff) <<  3)
                | ((src[ 7 + srcOff] & 0x7ffff) >>> 16)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffff) >>> 8)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE20(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffff) >>> 12)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffff) >>> 4)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffff) <<  4)
                | ((src[ 1 + srcOff] & 0xfffff) >>> 16)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffff) >>> 8)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffff) <<  0)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffff) >>> 12)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffff) >>> 4)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffff) <<  4)
                | ((src[ 3 + srcOff] & 0xfffff) >>> 16)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffff) >>> 8)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffff) <<  0)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffff) >>> 12)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffff) >>> 4)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffff) <<  4)
                | ((src[ 5 + srcOff] & 0xfffff) >>> 16)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffff) >>> 8)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffff) <<  0)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffff) >>> 12)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffff) >>> 4)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffff) <<  4)
                | ((src[ 7 + srcOff] & 0xfffff) >>> 16)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffff) >>> 8)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE21(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffff) >>> 13)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffff) >>> 5)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffff) <<  3)
                | ((src[ 1 + srcOff] & 0x1fffff) >>> 18)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffff) >>> 10)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffff) >>> 2)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffff) <<  6)
                | ((src[ 2 + srcOff] & 0x1fffff) >>> 15)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffff) >>> 7)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffff) <<  1)
                | ((src[ 3 + srcOff] & 0x1fffff) >>> 20)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffff) >>> 12)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffff) >>> 4)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffff) <<  4)
                | ((src[ 4 + srcOff] & 0x1fffff) >>> 17)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffff) >>> 9)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffff) >>> 1)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffff) <<  7)
                | ((src[ 5 + srcOff] & 0x1fffff) >>> 14)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffff) >>> 6)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffff) <<  2)
                | ((src[ 6 + srcOff] & 0x1fffff) >>> 19)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffff) >>> 11)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffff) >>> 3)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffff) <<  5)
                | ((src[ 7 + srcOff] & 0x1fffff) >>> 16)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffff) >>> 8)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE22(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffff) >>> 14)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffff) >>> 6)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffff) <<  2)
                | ((src[ 1 + srcOff] & 0x3fffff) >>> 20)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffff) >>> 12)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffff) >>> 4)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffff) <<  4)
                | ((src[ 2 + srcOff] & 0x3fffff) >>> 18)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffff) >>> 10)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffff) >>> 2)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffff) <<  6)
                | ((src[ 3 + srcOff] & 0x3fffff) >>> 16)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffff) >>> 8)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffff) <<  0)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffff) >>> 14)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffff) >>> 6)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffff) <<  2)
                | ((src[ 5 + srcOff] & 0x3fffff) >>> 20)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffff) >>> 12)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffff) >>> 4)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffff) <<  4)
                | ((src[ 6 + srcOff] & 0x3fffff) >>> 18)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffff) >>> 10)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffff) >>> 2)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffff) <<  6)
                | ((src[ 7 + srcOff] & 0x3fffff) >>> 16)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffff) >>> 8)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE23(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffff) >>> 15)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffff) >>> 7)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffff) <<  1)
                | ((src[ 1 + srcOff] & 0x7fffff) >>> 22)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffff) >>> 14)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffff) >>> 6)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffff) <<  2)
                | ((src[ 2 + srcOff] & 0x7fffff) >>> 21)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffff) >>> 13)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffff) >>> 5)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffff) <<  3)
                | ((src[ 3 + srcOff] & 0x7fffff) >>> 20)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffff) >>> 12)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffff) >>> 4)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffff) <<  4)
                | ((src[ 4 + srcOff] & 0x7fffff) >>> 19)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffff) >>> 11)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffff) >>> 3)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffff) <<  5)
                | ((src[ 5 + srcOff] & 0x7fffff) >>> 18)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffff) >>> 10)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffff) >>> 2)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffff) <<  6)
                | ((src[ 6 + srcOff] & 0x7fffff) >>> 17)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffff) >>> 9)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffff) >>> 1)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffff) <<  7)
                | ((src[ 7 + srcOff] & 0x7fffff) >>> 16)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffff) >>> 8)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE24(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffff) >>> 16)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffff) >>> 8)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xffffff) <<  0)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffff) >>> 16)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffff) >>> 8)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xffffff) <<  0)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffff) >>> 16)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffff) >>> 8)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xffffff) <<  0)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffff) >>> 16)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffff) >>> 8)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xffffff) <<  0)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffff) >>> 16)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffff) >>> 8)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xffffff) <<  0)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffff) >>> 16)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffff) >>> 8)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xffffff) <<  0)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffff) >>> 16)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffff) >>> 8)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xffffff) <<  0)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffff) >>> 16)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffff) >>> 8)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xffffff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE25(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffff) >>> 17)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffff) >>> 9)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffff) >>> 1)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1ffffff) <<  7)
                | ((src[ 1 + srcOff] & 0x1ffffff) >>> 18)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffff) >>> 10)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffff) >>> 2)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1ffffff) <<  6)
                | ((src[ 2 + srcOff] & 0x1ffffff) >>> 19)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffff) >>> 11)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffff) >>> 3)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1ffffff) <<  5)
                | ((src[ 3 + srcOff] & 0x1ffffff) >>> 20)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffff) >>> 12)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffff) >>> 4)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1ffffff) <<  4)
                | ((src[ 4 + srcOff] & 0x1ffffff) >>> 21)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffff) >>> 13)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffff) >>> 5)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1ffffff) <<  3)
                | ((src[ 5 + srcOff] & 0x1ffffff) >>> 22)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffff) >>> 14)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffff) >>> 6)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1ffffff) <<  2)
                | ((src[ 6 + srcOff] & 0x1ffffff) >>> 23)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffff) >>> 15)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffff) >>> 7)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1ffffff) <<  1)
                | ((src[ 7 + srcOff] & 0x1ffffff) >>> 24)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffff) >>> 16)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffff) >>> 8)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1ffffff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE26(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffff) >>> 18)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffff) >>> 10)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffff) >>> 2)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3ffffff) <<  6)
                | ((src[ 1 + srcOff] & 0x3ffffff) >>> 20)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffff) >>> 12)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffff) >>> 4)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3ffffff) <<  4)
                | ((src[ 2 + srcOff] & 0x3ffffff) >>> 22)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffff) >>> 14)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffff) >>> 6)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3ffffff) <<  2)
                | ((src[ 3 + srcOff] & 0x3ffffff) >>> 24)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffff) >>> 16)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffff) >>> 8)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3ffffff) <<  0)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffff) >>> 18)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffff) >>> 10)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffff) >>> 2)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3ffffff) <<  6)
                | ((src[ 5 + srcOff] & 0x3ffffff) >>> 20)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffff) >>> 12)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffff) >>> 4)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3ffffff) <<  4)
                | ((src[ 6 + srcOff] & 0x3ffffff) >>> 22)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffff) >>> 14)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffff) >>> 6)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3ffffff) <<  2)
                | ((src[ 7 + srcOff] & 0x3ffffff) >>> 24)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffff) >>> 16)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffff) >>> 8)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3ffffff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE27(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffff) >>> 19)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffff) >>> 11)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffff) >>> 3)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7ffffff) <<  5)
                | ((src[ 1 + srcOff] & 0x7ffffff) >>> 22)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffff) >>> 14)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffff) >>> 6)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7ffffff) <<  2)
                | ((src[ 2 + srcOff] & 0x7ffffff) >>> 25)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffff) >>> 17)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffff) >>> 9)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffff) >>> 1)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7ffffff) <<  7)
                | ((src[ 3 + srcOff] & 0x7ffffff) >>> 20)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffff) >>> 12)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffff) >>> 4)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7ffffff) <<  4)
                | ((src[ 4 + srcOff] & 0x7ffffff) >>> 23)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffff) >>> 15)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffff) >>> 7)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7ffffff) <<  1)
                | ((src[ 5 + srcOff] & 0x7ffffff) >>> 26)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffff) >>> 18)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffff) >>> 10)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffff) >>> 2)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7ffffff) <<  6)
                | ((src[ 6 + srcOff] & 0x7ffffff) >>> 21)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffff) >>> 13)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffff) >>> 5)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7ffffff) <<  3)
                | ((src[ 7 + srcOff] & 0x7ffffff) >>> 24)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffff) >>> 16)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffff) >>> 8)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7ffffff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE28(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffff) >>> 20)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffff) >>> 12)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffff) >>> 4)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0xfffffff) <<  4)
                | ((src[ 1 + srcOff] & 0xfffffff) >>> 24)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffff) >>> 16)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffff) >>> 8)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0xfffffff) <<  0)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffff) >>> 20)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffff) >>> 12)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffff) >>> 4)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0xfffffff) <<  4)
                | ((src[ 3 + srcOff] & 0xfffffff) >>> 24)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffff) >>> 16)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffff) >>> 8)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0xfffffff) <<  0)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffff) >>> 20)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffff) >>> 12)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffff) >>> 4)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0xfffffff) <<  4)
                | ((src[ 5 + srcOff] & 0xfffffff) >>> 24)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffff) >>> 16)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffff) >>> 8)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0xfffffff) <<  0)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffff) >>> 20)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffff) >>> 12)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffff) >>> 4)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0xfffffff) <<  4)
                | ((src[ 7 + srcOff] & 0xfffffff) >>> 24)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffff) >>> 16)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffff) >>> 8)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0xfffffff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE29(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffff) >>> 21)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffff) >>> 13)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffff) >>> 5)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x1fffffff) <<  3)
                | ((src[ 1 + srcOff] & 0x1fffffff) >>> 26)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffff) >>> 18)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffff) >>> 10)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffff) >>> 2)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x1fffffff) <<  6)
                | ((src[ 2 + srcOff] & 0x1fffffff) >>> 23)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffff) >>> 15)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffff) >>> 7)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x1fffffff) <<  1)
                | ((src[ 3 + srcOff] & 0x1fffffff) >>> 28)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffff) >>> 20)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffff) >>> 12)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffff) >>> 4)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x1fffffff) <<  4)
                | ((src[ 4 + srcOff] & 0x1fffffff) >>> 25)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffff) >>> 17)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffff) >>> 9)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffff) >>> 1)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x1fffffff) <<  7)
                | ((src[ 5 + srcOff] & 0x1fffffff) >>> 22)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffff) >>> 14)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffff) >>> 6)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x1fffffff) <<  2)
                | ((src[ 6 + srcOff] & 0x1fffffff) >>> 27)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffff) >>> 19)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffff) >>> 11)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffff) >>> 3)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x1fffffff) <<  5)
                | ((src[ 7 + srcOff] & 0x1fffffff) >>> 24)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffff) >>> 16)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffff) >>> 8)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x1fffffff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE30(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffff) >>> 22)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffff) >>> 14)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffff) >>> 6)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x3fffffff) <<  2)
                | ((src[ 1 + srcOff] & 0x3fffffff) >>> 28)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffff) >>> 20)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffff) >>> 12)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffff) >>> 4)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x3fffffff) <<  4)
                | ((src[ 2 + srcOff] & 0x3fffffff) >>> 26)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffff) >>> 18)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffff) >>> 10)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffff) >>> 2)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x3fffffff) <<  6)
                | ((src[ 3 + srcOff] & 0x3fffffff) >>> 24)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffff) >>> 16)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffff) >>> 8)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x3fffffff) <<  0)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffff) >>> 22)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffff) >>> 14)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffff) >>> 6)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x3fffffff) <<  2)
                | ((src[ 5 + srcOff] & 0x3fffffff) >>> 28)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffff) >>> 20)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffff) >>> 12)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffff) >>> 4)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x3fffffff) <<  4)
                | ((src[ 6 + srcOff] & 0x3fffffff) >>> 26)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffff) >>> 18)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffff) >>> 10)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffff) >>> 2)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x3fffffff) <<  6)
                | ((src[ 7 + srcOff] & 0x3fffffff) >>> 24)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffff) >>> 16)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffff) >>> 8)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x3fffffff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE31(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffff) >>> 23)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffff) >>> 15)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffff) >>> 7)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & 0x7fffffff) <<  1)
                | ((src[ 1 + srcOff] & 0x7fffffff) >>> 30)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffff) >>> 22)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffff) >>> 14)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffff) >>> 6)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & 0x7fffffff) <<  2)
                | ((src[ 2 + srcOff] & 0x7fffffff) >>> 29)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffff) >>> 21)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffff) >>> 13)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffff) >>> 5)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & 0x7fffffff) <<  3)
                | ((src[ 3 + srcOff] & 0x7fffffff) >>> 28)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffff) >>> 20)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffff) >>> 12)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffff) >>> 4)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & 0x7fffffff) <<  4)
                | ((src[ 4 + srcOff] & 0x7fffffff) >>> 27)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffff) >>> 19)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffff) >>> 11)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffff) >>> 3)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & 0x7fffffff) <<  5)
                | ((src[ 5 + srcOff] & 0x7fffffff) >>> 26)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffff) >>> 18)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffff) >>> 10)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffff) >>> 2)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & 0x7fffffff) <<  6)
                | ((src[ 6 + srcOff] & 0x7fffffff) >>> 25)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffff) >>> 17)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffff) >>> 9)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffff) >>> 1)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & 0x7fffffff) <<  7)
                | ((src[ 7 + srcOff] & 0x7fffffff) >>> 24)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffff) >>> 16)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffff) >>> 8)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & 0x7fffffff) <<  0)
            ) & 0xff);
    }

    public static void bitPack8IntBE32(int[] src, int srcOff, byte[] dst, int dstOff)
    {
        dst[ 0 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & -1) >>> 24)
            ) & 0xff);
        dst[ 1 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & -1) >>> 16)
            ) & 0xff);
        dst[ 2 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & -1) >>> 8)
            ) & 0xff);
        dst[ 3 + dstOff] = (byte)((
                  ((src[ 0 + srcOff] & -1) <<  0)
            ) & 0xff);
        dst[ 4 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & -1) >>> 24)
            ) & 0xff);
        dst[ 5 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & -1) >>> 16)
            ) & 0xff);
        dst[ 6 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & -1) >>> 8)
            ) & 0xff);
        dst[ 7 + dstOff] = (byte)((
                  ((src[ 1 + srcOff] & -1) <<  0)
            ) & 0xff);
        dst[ 8 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & -1) >>> 24)
            ) & 0xff);
        dst[ 9 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & -1) >>> 16)
            ) & 0xff);
        dst[10 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & -1) >>> 8)
            ) & 0xff);
        dst[11 + dstOff] = (byte)((
                  ((src[ 2 + srcOff] & -1) <<  0)
            ) & 0xff);
        dst[12 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & -1) >>> 24)
            ) & 0xff);
        dst[13 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & -1) >>> 16)
            ) & 0xff);
        dst[14 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & -1) >>> 8)
            ) & 0xff);
        dst[15 + dstOff] = (byte)((
                  ((src[ 3 + srcOff] & -1) <<  0)
            ) & 0xff);
        dst[16 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & -1) >>> 24)
            ) & 0xff);
        dst[17 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & -1) >>> 16)
            ) & 0xff);
        dst[18 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & -1) >>> 8)
            ) & 0xff);
        dst[19 + dstOff] = (byte)((
                  ((src[ 4 + srcOff] & -1) <<  0)
            ) & 0xff);
        dst[20 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & -1) >>> 24)
            ) & 0xff);
        dst[21 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & -1) >>> 16)
            ) & 0xff);
        dst[22 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & -1) >>> 8)
            ) & 0xff);
        dst[23 + dstOff] = (byte)((
                  ((src[ 5 + srcOff] & -1) <<  0)
            ) & 0xff);
        dst[24 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & -1) >>> 24)
            ) & 0xff);
        dst[25 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & -1) >>> 16)
            ) & 0xff);
        dst[26 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & -1) >>> 8)
            ) & 0xff);
        dst[27 + dstOff] = (byte)((
                  ((src[ 6 + srcOff] & -1) <<  0)
            ) & 0xff);
        dst[28 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & -1) >>> 24)
            ) & 0xff);
        dst[29 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & -1) >>> 16)
            ) & 0xff);
        dst[30 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & -1) >>> 8)
            ) & 0xff);
        dst[31 + dstOff] = (byte)((
                  ((src[ 7 + srcOff] & -1) <<  0)
            ) & 0xff);
    }

}
