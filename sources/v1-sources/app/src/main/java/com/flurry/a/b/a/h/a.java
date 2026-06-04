package com.flurry.a.b.a.h;

/* loaded from: classes.dex */
public final class a {
    protected final byte[][] a = new byte[b.values().length][];
    protected final char[][] b = new char[c.values().length][];

    public final char[] a(c cVar) {
        return a(cVar, 0);
    }

    public final char[] a(c cVar, int i) {
        int i2;
        i2 = cVar.e;
        if (i2 > i) {
            i = cVar.e;
        }
        int ordinal = cVar.ordinal();
        char[] cArr = this.b[ordinal];
        if (cArr == null || cArr.length < i) {
            return new char[i];
        }
        this.b[ordinal] = null;
        return cArr;
    }

    public final void a(c cVar, char[] cArr) {
        this.b[cVar.ordinal()] = cArr;
    }
}
