package com.flurry.a.a.a.c;

/* loaded from: classes.dex */
public final class a {
    private static final ThreadLocal a = new b();
    private static final ThreadLocal b = new c();

    public static int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = i + 0;
        int i4 = i2 + 0;
        int i5 = 0;
        for (int i6 = 0; i5 < i3 && i6 < i4; i6++) {
            int i7 = bArr[i5] & 255;
            int i8 = bArr2[i6] & 255;
            if (i7 == i8) {
                i5++;
            } else {
                return i7 - i8;
            }
        }
        return i - i2;
    }

    public static int a(boolean z, byte[] bArr, int i) {
        bArr[i] = z ? (byte) 1 : (byte) 0;
        return 1;
    }

    public static int a(int i, byte[] bArr, int i2) {
        int i3;
        int i4;
        int i5 = (i << 1) ^ (i >> 31);
        if ((i5 & (-128)) != 0) {
            int i6 = i2 + 1;
            bArr[i2] = (byte) ((i5 | 128) & 255);
            int i7 = i5 >>> 7;
            if (i7 > 127) {
                i4 = i6 + 1;
                bArr[i6] = (byte) ((i7 | 128) & 255);
                int i8 = i7 >>> 7;
                if (i8 > 127) {
                    i6 = i4 + 1;
                    bArr[i4] = (byte) ((i8 | 128) & 255);
                    i7 = i8 >>> 7;
                    if (i7 > 127) {
                        i4 = i6 + 1;
                        bArr[i6] = (byte) ((i7 | 128) & 255);
                        i3 = i7 >>> 7;
                    }
                } else {
                    i3 = i8;
                }
            }
            i4 = i6;
            i3 = i7;
        } else {
            i3 = i5;
            i4 = i2;
        }
        bArr[i4] = (byte) i3;
        return (i4 + 1) - i2;
    }

    public static int a(long j, byte[] bArr, int i) {
        int i2;
        long j2 = (j << 1) ^ (j >> 63);
        if (((-128) & j2) != 0) {
            i2 = i + 1;
            bArr[i] = (byte) ((128 | j2) & 255);
            long j3 = j2 >>> 7;
            if (j3 > 127) {
                int i3 = i2 + 1;
                bArr[i2] = (byte) ((128 | j3) & 255);
                long j4 = j3 >>> 7;
                if (j4 > 127) {
                    i2 = i3 + 1;
                    bArr[i3] = (byte) ((128 | j4) & 255);
                    j3 = j4 >>> 7;
                    if (j3 > 127) {
                        i3 = i2 + 1;
                        bArr[i2] = (byte) ((128 | j3) & 255);
                        j4 = j3 >>> 7;
                        if (j4 > 127) {
                            i2 = i3 + 1;
                            bArr[i3] = (byte) ((128 | j4) & 255);
                            j3 = j4 >>> 7;
                            if (j3 > 127) {
                                i3 = i2 + 1;
                                bArr[i2] = (byte) ((128 | j3) & 255);
                                j4 = j3 >>> 7;
                                if (j4 > 127) {
                                    i2 = i3 + 1;
                                    bArr[i3] = (byte) ((128 | j4) & 255);
                                    j3 = j4 >>> 7;
                                    if (j3 > 127) {
                                        i3 = i2 + 1;
                                        bArr[i2] = (byte) ((128 | j3) & 255);
                                        j4 = j3 >>> 7;
                                        if (j4 > 127) {
                                            i2 = i3 + 1;
                                            bArr[i3] = (byte) ((128 | j4) & 255);
                                            j2 = j4 >>> 7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = i3;
                j2 = j4;
            }
            j2 = j3;
        } else {
            i2 = i;
        }
        bArr[i2] = (byte) j2;
        return (i2 + 1) - i;
    }

    public static int a(float f, byte[] bArr, int i) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        bArr[i] = (byte) (floatToRawIntBits & 255);
        bArr[i + 1] = (byte) ((floatToRawIntBits >>> 8) & 255);
        bArr[i + 2] = (byte) ((floatToRawIntBits >>> 16) & 255);
        bArr[i + 3] = (byte) ((floatToRawIntBits >>> 24) & 255);
        return 4;
    }

    public static int a(double d, byte[] bArr, int i) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i2 = (int) (doubleToRawLongBits & (-1));
        int i3 = (int) ((doubleToRawLongBits >>> 32) & (-1));
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 4] = (byte) (i3 & 255);
        bArr[i + 5] = (byte) ((i3 >>> 8) & 255);
        bArr[i + 1] = (byte) ((i2 >>> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >>> 16) & 255);
        bArr[i + 6] = (byte) ((i3 >>> 16) & 255);
        bArr[i + 7] = (byte) ((i3 >>> 24) & 255);
        bArr[i + 3] = (byte) ((i2 >>> 24) & 255);
        return 8;
    }
}
