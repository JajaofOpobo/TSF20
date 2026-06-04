package com.flurry.a.b.a.c;

import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
public final class f {
    static final byte[] d;
    static final String[] e;
    static final String[] f;
    private static int g = 1000000;
    private static int h = 1000000000;
    private static long i = 10000000000L;
    private static long j = 1000;
    private static long k = -2147483648L;
    private static long l = 2147483647L;
    static final String a = String.valueOf(Long.MIN_VALUE);
    static final char[] b = new char[4000];
    static final char[] c = new char[4000];

    static {
        int i2 = 0;
        int i3 = 0;
        while (i2 < 10) {
            char c2 = (char) (i2 + 48);
            char c3 = i2 == 0 ? (char) 0 : c2;
            int i4 = 0;
            while (i4 < 10) {
                char c4 = (char) (i4 + 48);
                char c5 = (i2 == 0 && i4 == 0) ? (char) 0 : c4;
                int i5 = i3;
                for (int i6 = 0; i6 < 10; i6++) {
                    char c6 = (char) (i6 + 48);
                    b[i5] = c3;
                    b[i5 + 1] = c5;
                    b[i5 + 2] = c6;
                    c[i5] = c2;
                    c[i5 + 1] = c4;
                    c[i5 + 2] = c6;
                    i5 += 4;
                }
                i4++;
                i3 = i5;
            }
            i2++;
        }
        d = new byte[4000];
        for (int i7 = 0; i7 < 4000; i7++) {
            d[i7] = (byte) c[i7];
        }
        e = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        f = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    public static int a(int i2, char[] cArr, int i3) {
        int b2;
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                return a(i2, cArr, i3);
            }
            cArr[i3] = '-';
            i2 = -i2;
            i3++;
        }
        if (i2 < g) {
            if (i2 < 1000) {
                if (i2 < 10) {
                    int i4 = i3 + 1;
                    cArr[i3] = (char) (i2 + 48);
                    return i4;
                }
                return b(i2, cArr, i3);
            }
            int i5 = i2 / ThemeShellDescription.PICKER_MENU;
            return c(i2 - (i5 * ThemeShellDescription.PICKER_MENU), cArr, b(i5, cArr, i3));
        }
        boolean z = i2 >= h;
        if (z) {
            i2 -= h;
            if (i2 >= h) {
                i2 -= h;
                cArr[i3] = '2';
                i3++;
            } else {
                cArr[i3] = '1';
                i3++;
            }
        }
        int i6 = i2 / ThemeShellDescription.PICKER_MENU;
        int i7 = i2 - (i6 * ThemeShellDescription.PICKER_MENU);
        int i8 = i6 / ThemeShellDescription.PICKER_MENU;
        int i9 = i6 - (i8 * ThemeShellDescription.PICKER_MENU);
        if (z) {
            b2 = c(i8, cArr, i3);
        } else {
            b2 = b(i8, cArr, i3);
        }
        return c(i7, cArr, c(i9, cArr, b2));
    }

    public static int a(long j2, char[] cArr, int i2) {
        if (j2 < 0) {
            if (j2 > k) {
                return a((int) j2, cArr, i2);
            }
            if (j2 == Long.MIN_VALUE) {
                int length = a.length();
                a.getChars(0, length, cArr, i2);
                return i2 + length;
            }
            cArr[i2] = '-';
            j2 = -j2;
            i2++;
        } else if (j2 <= l) {
            return a((int) j2, cArr, i2);
        }
        int i3 = 10;
        for (long j3 = i; j2 >= j3 && i3 != 19; j3 = (j3 << 1) + (j3 << 3)) {
            i3++;
        }
        int i4 = i2 + i3;
        int i5 = i4;
        while (j2 > l) {
            i5 -= 3;
            long j4 = j2 / j;
            c((int) (j2 - (j * j4)), cArr, i5);
            j2 = j4;
        }
        int i6 = (int) j2;
        while (i6 >= 1000) {
            i5 -= 3;
            int i7 = i6 / ThemeShellDescription.PICKER_MENU;
            c(i6 - (i7 * ThemeShellDescription.PICKER_MENU), cArr, i5);
            i6 = i7;
        }
        b(i6, cArr, i2);
        return i4;
    }

    public static String a(int i2) {
        if (i2 < e.length) {
            if (i2 >= 0) {
                return e[i2];
            }
            int i3 = (-i2) - 1;
            if (i3 < f.length) {
                return f[i3];
            }
        }
        return Integer.toString(i2);
    }

    public static String a(long j2) {
        return (j2 > 2147483647L || j2 < -2147483648L) ? Long.toString(j2) : a((int) j2);
    }

    public static String a(double d2) {
        return Double.toString(d2);
    }

    private static int b(int i2, char[] cArr, int i3) {
        int i4 = i2 << 2;
        int i5 = i4 + 1;
        char c2 = b[i4];
        if (c2 != 0) {
            cArr[i3] = c2;
            i3++;
        }
        int i6 = i5 + 1;
        char c3 = b[i5];
        if (c3 != 0) {
            cArr[i3] = c3;
            i3++;
        }
        int i7 = i3 + 1;
        cArr[i3] = b[i6];
        return i7;
    }

    private static int c(int i2, char[] cArr, int i3) {
        int i4 = i2 << 2;
        int i5 = i3 + 1;
        int i6 = i4 + 1;
        cArr[i3] = c[i4];
        int i7 = i5 + 1;
        cArr[i5] = c[i6];
        int i8 = i7 + 1;
        cArr[i7] = c[i6 + 1];
        return i8;
    }
}
