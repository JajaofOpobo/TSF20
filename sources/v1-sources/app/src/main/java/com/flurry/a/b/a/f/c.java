package com.flurry.a.b.a.f;

import com.flurry.a.b.a.h.i;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {
    static final c a = new c();
    protected c b;
    protected final boolean c;
    protected final boolean d;
    protected String[] e;
    protected d[] f;
    protected int g;
    protected int h;
    protected int i;
    protected boolean j;

    public static c a() {
        c cVar = a;
        return new c(null, true, true, cVar.e, cVar.f, cVar.g);
    }

    private c() {
        this.d = true;
        this.c = true;
        this.j = true;
        c();
    }

    private void c() {
        this.e = new String[64];
        this.f = new d[32];
        this.i = 63;
        this.g = 0;
        this.h = 48;
    }

    private c(c cVar, boolean z, boolean z2, String[] strArr, d[] dVarArr, int i) {
        this.b = cVar;
        this.d = z;
        this.c = z2;
        this.e = strArr;
        this.f = dVarArr;
        this.g = i;
        int length = strArr.length;
        this.h = length - (length >> 2);
        this.i = length - 1;
        this.j = false;
    }

    public final synchronized c a(boolean z, boolean z2) {
        return new c(this, z, z2, this.e, this.f, this.g);
    }

    private synchronized void a(c cVar) {
        if (cVar.g > 12000) {
            c();
        } else if (cVar.g > this.g) {
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.i = cVar.i;
        }
        this.j = false;
    }

    public final void b() {
        if (this.j && this.b != null) {
            this.b.a(this);
            this.j = false;
        }
    }

    public final String a(char[] cArr, int i, int i2, int i3) {
        int i4;
        String a2;
        if (i2 <= 0) {
            return "";
        }
        if (!this.d) {
            return new String(cArr, i, i2);
        }
        int i5 = i3 & this.i;
        String str = this.e[i5];
        if (str != null) {
            if (str.length() == i2) {
                int i6 = 0;
                while (str.charAt(i6) == cArr[i + i6] && (i6 = i6 + 1) < i2) {
                }
                if (i6 == i2) {
                    return str;
                }
            }
            d dVar = this.f[i5 >> 1];
            if (dVar != null && (a2 = dVar.a(cArr, i, i2)) != null) {
                return a2;
            }
        }
        if (!this.j) {
            String[] strArr = this.e;
            int length = strArr.length;
            this.e = new String[length];
            System.arraycopy(strArr, 0, this.e, 0, length);
            d[] dVarArr = this.f;
            int length2 = dVarArr.length;
            this.f = new d[length2];
            System.arraycopy(dVarArr, 0, this.f, 0, length2);
            this.j = true;
            i4 = i5;
        } else if (this.g >= this.h) {
            d();
            i4 = a(cArr, i2) & this.i;
        } else {
            i4 = i5;
        }
        this.g++;
        String str2 = new String(cArr, i, i2);
        if (this.c) {
            str2 = i.a.a(str2);
        }
        if (this.e[i4] == null) {
            this.e[i4] = str2;
            return str2;
        }
        int i7 = i4 >> 1;
        this.f[i7] = new d(str2, this.f[i7]);
        return str2;
    }

    private static int a(char[] cArr, int i) {
        int i2 = 1;
        int i3 = cArr[0];
        while (i2 < i) {
            int i4 = (i3 * 31) + cArr[i2];
            i2++;
            i3 = i4;
        }
        return i3;
    }

    private static int a(String str) {
        int charAt = str.charAt(0);
        int length = str.length();
        for (int i = 1; i < length; i++) {
            charAt = (charAt * 31) + str.charAt(i);
        }
        return charAt;
    }

    private void d() {
        int length = this.e.length;
        int i = length + length;
        if (i > 65536) {
            this.g = 0;
            Arrays.fill(this.e, (Object) null);
            Arrays.fill(this.f, (Object) null);
            this.j = true;
            return;
        }
        String[] strArr = this.e;
        d[] dVarArr = this.f;
        this.e = new String[i];
        this.f = new d[i >> 1];
        this.i = i - 1;
        this.h += this.h;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            String str = strArr[i3];
            if (str != null) {
                i2++;
                int a2 = a(str) & this.i;
                if (this.e[a2] == null) {
                    this.e[a2] = str;
                } else {
                    int i4 = a2 >> 1;
                    this.f[i4] = new d(str, this.f[i4]);
                }
            }
        }
        int i5 = length >> 1;
        int i6 = i2;
        for (int i7 = 0; i7 < i5; i7++) {
            d dVar = dVarArr[i7];
            while (dVar != null) {
                int i8 = i6 + 1;
                String a3 = dVar.a();
                int a4 = a(a3) & this.i;
                if (this.e[a4] == null) {
                    this.e[a4] = a3;
                } else {
                    int i9 = a4 >> 1;
                    this.f[i9] = new d(a3, this.f[i9]);
                }
                dVar = dVar.b();
                i6 = i8;
            }
        }
        if (i6 != this.g) {
            throw new Error("Internal error on SymbolTable.rehash(): had " + this.g + " entries; now have " + i6 + ".");
        }
    }
}
