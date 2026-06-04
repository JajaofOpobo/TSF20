package com.flurry.a.b.a.c;

import com.flurry.a.b.a.h.l;
import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public final class d {
    protected l b;
    protected final char[] c = new char[6];
    private static final char[] d = com.flurry.a.b.a.h.e.d();
    private static final byte[] e = com.flurry.a.b.a.h.e.e();
    protected static final ThreadLocal a = new ThreadLocal();

    public d() {
        this.c[0] = '\\';
        this.c[2] = '0';
        this.c[3] = '0';
    }

    public static d a() {
        SoftReference softReference = (SoftReference) a.get();
        d dVar = softReference == null ? null : (d) softReference.get();
        if (dVar == null) {
            d dVar2 = new d();
            a.set(new SoftReference(dVar2));
            return dVar2;
        }
        return dVar;
    }

    public final char[] a(String str) {
        int i;
        int i2;
        l lVar = this.b;
        if (lVar == null) {
            lVar = new l(null);
            this.b = lVar;
        }
        char[] j = lVar.j();
        int[] c = com.flurry.a.b.a.h.e.c();
        int length = c.length;
        int length2 = str.length();
        int i3 = 0;
        int i4 = 0;
        loop0: while (i4 < length2) {
            do {
                char charAt = str.charAt(i4);
                if (charAt >= length || c[charAt] == 0) {
                    if (i3 >= j.length) {
                        j = lVar.l();
                        i = 0;
                    } else {
                        i = i3;
                    }
                    i3 = i + 1;
                    j[i] = charAt;
                    i4++;
                } else {
                    int i5 = i4 + 1;
                    int i6 = c[str.charAt(i4)];
                    char[] cArr = this.c;
                    if (i6 < 0) {
                        int i7 = -(i6 + 1);
                        cArr[1] = 'u';
                        cArr[4] = d[i7 >> 4];
                        cArr[5] = d[i7 & 15];
                        i2 = 6;
                    } else {
                        cArr[1] = (char) i6;
                        i2 = 2;
                    }
                    if (i3 + i2 > j.length) {
                        int length3 = j.length - i3;
                        if (length3 > 0) {
                            System.arraycopy(this.c, 0, j, i3, length3);
                        }
                        j = lVar.l();
                        int i8 = i2 - length3;
                        System.arraycopy(this.c, length3, j, i3, i8);
                        i3 += i8;
                        i4 = i5;
                    } else {
                        System.arraycopy(this.c, 0, j, i3, i2);
                        i3 += i2;
                        i4 = i5;
                    }
                }
            } while (i4 < length2);
        }
        lVar.a(i3);
        return lVar.f();
    }
}
