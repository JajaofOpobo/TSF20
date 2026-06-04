package com.flurry.a.b.a;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {
    final String a;
    final boolean b;
    final char c;
    final int d;
    private final int[] e;
    private final char[] f;
    private final byte[] g;

    public a(String str, String str2, boolean z, char c, int i) {
        this.e = new int[128];
        this.f = new char[64];
        this.g = new byte[64];
        this.a = str;
        this.b = z;
        this.c = c;
        this.d = i;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
        }
        str2.getChars(0, length, this.f, 0);
        Arrays.fill(this.e, -1);
        for (int i2 = 0; i2 < length; i2++) {
            char c2 = this.f[i2];
            this.g[i2] = (byte) c2;
            this.e[c2] = i2;
        }
        if (z) {
            this.e[c] = -2;
        }
    }

    public a(a aVar, String str) {
        this(aVar, str, aVar.b, aVar.c, Integer.MAX_VALUE);
    }

    public a(a aVar, String str, boolean z, char c, int i) {
        this.e = new int[128];
        this.f = new char[64];
        this.g = new byte[64];
        this.a = str;
        byte[] bArr = aVar.g;
        System.arraycopy(bArr, 0, this.g, 0, bArr.length);
        char[] cArr = aVar.f;
        System.arraycopy(cArr, 0, this.f, 0, cArr.length);
        int[] iArr = aVar.e;
        System.arraycopy(iArr, 0, this.e, 0, iArr.length);
        this.b = z;
        this.c = c;
        this.d = i;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean a(char c) {
        return c == this.c;
    }

    public final boolean a(int i) {
        return i == this.c;
    }

    public final char b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final int b(char c) {
        if (c <= 127) {
            return this.e[c];
        }
        return -1;
    }

    public final int a(int i, char[] cArr, int i2) {
        int i3 = i2 + 1;
        cArr[i2] = this.f[(i >> 18) & 63];
        int i4 = i3 + 1;
        cArr[i3] = this.f[(i >> 12) & 63];
        int i5 = i4 + 1;
        cArr[i4] = this.f[(i >> 6) & 63];
        int i6 = i5 + 1;
        cArr[i5] = this.f[i & 63];
        return i6;
    }

    public final int a(int i, int i2, char[] cArr, int i3) {
        int i4 = i3 + 1;
        cArr[i3] = this.f[(i >> 18) & 63];
        int i5 = i4 + 1;
        cArr[i4] = this.f[(i >> 12) & 63];
        if (this.b) {
            int i6 = i5 + 1;
            cArr[i5] = i2 == 2 ? this.f[(i >> 6) & 63] : this.c;
            int i7 = i6 + 1;
            cArr[i6] = this.c;
            return i7;
        }
        if (i2 != 2) {
            return i5;
        }
        int i8 = i5 + 1;
        cArr[i5] = this.f[(i >> 6) & 63];
        return i8;
    }

    public final String a(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append('\"');
        }
        int i = 0;
        int i2 = length - 3;
        int i3 = this.d >> 2;
        while (i <= i2) {
            int i4 = i + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i] << 8) | (bArr[i4] & 255)) << 8;
            int i7 = i5 + 1;
            int i8 = i6 | (bArr[i5] & 255);
            sb.append(this.f[(i8 >> 18) & 63]);
            sb.append(this.f[(i8 >> 12) & 63]);
            sb.append(this.f[(i8 >> 6) & 63]);
            sb.append(this.f[i8 & 63]);
            int i9 = i3 - 1;
            if (i9 <= 0) {
                sb.append('\\');
                sb.append('n');
                i9 = this.d >> 2;
            }
            i3 = i9;
            i = i7;
        }
        int i10 = length - i;
        if (i10 > 0) {
            int i11 = i + 1;
            int i12 = bArr[i] << 16;
            if (i10 == 2) {
                i12 |= (bArr[i11] & 255) << 8;
            }
            sb.append(this.f[(i12 >> 18) & 63]);
            sb.append(this.f[(i12 >> 12) & 63]);
            if (this.b) {
                sb.append(i10 == 2 ? this.f[(i12 >> 6) & 63] : this.c);
                sb.append(this.c);
            } else if (i10 == 2) {
                sb.append(this.f[(i12 >> 6) & 63]);
            }
        }
        if (z) {
            sb.append('\"');
        }
        return sb.toString();
    }

    public final String toString() {
        return this.a;
    }
}
