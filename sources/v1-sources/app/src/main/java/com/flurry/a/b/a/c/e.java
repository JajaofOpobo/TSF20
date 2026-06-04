package com.flurry.a.b.a.c;

/* loaded from: classes.dex */
public final class e {
    static final String a = String.valueOf(Long.MIN_VALUE).substring(1);
    static final String b = String.valueOf(Long.MAX_VALUE);

    public static final int a(char[] cArr, int i, int i2) {
        int i3 = cArr[i] - '0';
        int i4 = i2 + i;
        int i5 = i + 1;
        if (i5 < i4) {
            int i6 = (i3 * 10) + (cArr[i5] - '0');
            int i7 = i5 + 1;
            if (i7 < i4) {
                int i8 = (i6 * 10) + (cArr[i7] - '0');
                int i9 = i7 + 1;
                if (i9 < i4) {
                    int i10 = (i8 * 10) + (cArr[i9] - '0');
                    int i11 = i9 + 1;
                    if (i11 < i4) {
                        int i12 = (i10 * 10) + (cArr[i11] - '0');
                        int i13 = i11 + 1;
                        if (i13 < i4) {
                            int i14 = (i12 * 10) + (cArr[i13] - '0');
                            int i15 = i13 + 1;
                            if (i15 < i4) {
                                int i16 = (i14 * 10) + (cArr[i15] - '0');
                                int i17 = i15 + 1;
                                if (i17 < i4) {
                                    int i18 = (i16 * 10) + (cArr[i17] - '0');
                                    if (i17 + 1 < i4) {
                                        return (i18 * 10) + (cArr[r2] - '0');
                                    }
                                    return i18;
                                }
                                return i16;
                            }
                            return i14;
                        }
                        return i12;
                    }
                    return i10;
                }
                return i8;
            }
            return i6;
        }
        return i3;
    }

    public static final int a(String str) {
        int i = 1;
        char charAt = str.charAt(0);
        int length = str.length();
        boolean z = charAt == '-';
        if (z) {
            if (length == 1 || length > 10) {
                return Integer.parseInt(str);
            }
            charAt = str.charAt(1);
            i = 2;
        } else if (length > 9) {
            return Integer.parseInt(str);
        }
        if (charAt > '9' || charAt < '0') {
            return Integer.parseInt(str);
        }
        int i2 = charAt - '0';
        if (i < length) {
            int i3 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 > '9' || charAt2 < '0') {
                return Integer.parseInt(str);
            }
            i2 = (i2 * 10) + (charAt2 - '0');
            if (i3 < length) {
                int i4 = i3 + 1;
                char charAt3 = str.charAt(i3);
                if (charAt3 > '9' || charAt3 < '0') {
                    return Integer.parseInt(str);
                }
                i2 = (i2 * 10) + (charAt3 - '0');
                if (i4 < length) {
                    while (true) {
                        int i5 = i4 + 1;
                        char charAt4 = str.charAt(i4);
                        if (charAt4 > '9' || charAt4 < '0') {
                            break;
                        }
                        i2 = (i2 * 10) + (charAt4 - '0');
                        if (i5 >= length) {
                            break;
                        }
                        i4 = i5;
                    }
                    return Integer.parseInt(str);
                }
            }
        }
        return z ? -i2 : i2;
    }

    public static final long b(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (a(cArr, i, i3) * 1000000000) + a(cArr, i3 + i, 9);
    }

    public static final long b(String str) {
        return str.length() <= 9 ? a(str) : Long.parseLong(str);
    }

    public static final boolean a(char[] cArr, int i, int i2, boolean z) {
        String str = z ? a : b;
        int length = str.length();
        if (i2 < length) {
            return true;
        }
        if (i2 > length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            int charAt = cArr[i + i3] - str.charAt(i3);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }

    public static final boolean c(String str) {
        String str2 = b;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            int charAt = str.charAt(i) - str2.charAt(i);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }

    public static double d(String str) {
        if (str == null) {
            return 0.0d;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return 0.0d;
        }
        try {
            return e(trim);
        } catch (NumberFormatException e) {
            return 0.0d;
        }
    }

    public static final double e(String str) {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_NORMAL;
        }
        return Double.parseDouble(str);
    }
}
