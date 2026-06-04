package com.flurry.a.b.a.d.i;

/* loaded from: classes.dex */
public abstract class v {
    Object a;
    w b;
    w c;
    int d;

    protected abstract Object a(int i);

    protected v() {
    }

    public final Object a() {
        if (this.c != null) {
            this.a = this.c.a;
        }
        this.c = null;
        this.b = null;
        this.d = 0;
        return this.a == null ? a(12) : this.a;
    }

    public final Object a(Object obj, int i) {
        int i2;
        w wVar = new w(obj, i);
        if (this.b == null) {
            this.c = wVar;
            this.b = wVar;
        } else {
            w wVar2 = this.c;
            if (wVar2.c != null) {
                throw new IllegalStateException();
            }
            wVar2.c = wVar;
            this.c = wVar;
        }
        this.d += i;
        if (i < 16384) {
            i2 = i + i;
        } else {
            i2 = (i >> 2) + i;
        }
        return a(i2);
    }

    public final Object b(Object obj, int i) {
        int i2 = i + this.d;
        Object a = a(i2);
        int i3 = 0;
        for (w wVar = this.b; wVar != null; wVar = wVar.c) {
            System.arraycopy(wVar.a, 0, a, i3, wVar.b);
            i3 += wVar.b;
        }
        System.arraycopy(obj, 0, a, i3, i);
        int i4 = i3 + i;
        if (i4 != i2) {
            throw new IllegalStateException("Should have gotten " + i2 + " entries, got " + i4);
        }
        return a;
    }
}
