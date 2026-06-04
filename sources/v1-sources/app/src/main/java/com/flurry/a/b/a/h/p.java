package com.flurry.a.b.a.h;

/* loaded from: classes.dex */
public final class p {
    private static final com.flurry.a.b.a.o[] d = new com.flurry.a.b.a.o[16];
    protected p a;
    protected long b;
    protected final Object[] c = new Object[16];

    static {
        System.arraycopy(com.flurry.a.b.a.o.values(), 1, d, 1, Math.min(15, r0.length - 1));
    }

    public final com.flurry.a.b.a.o a(int i) {
        long j = this.b;
        if (i > 0) {
            j >>= i << 2;
        }
        return d[((int) j) & 15];
    }

    public final Object b(int i) {
        return this.c[i];
    }

    public final p a() {
        return this.a;
    }

    public final p a(int i, com.flurry.a.b.a.o oVar) {
        if (i < 16) {
            b(i, oVar);
            return null;
        }
        this.a = new p();
        this.a.b(0, oVar);
        return this.a;
    }

    public final p a(int i, com.flurry.a.b.a.o oVar, Object obj) {
        if (i < 16) {
            b(i, oVar, obj);
            return null;
        }
        this.a = new p();
        this.a.b(0, oVar, obj);
        return this.a;
    }

    private void b(int i, com.flurry.a.b.a.o oVar) {
        long ordinal = oVar.ordinal();
        if (i > 0) {
            ordinal <<= i << 2;
        }
        this.b = ordinal | this.b;
    }

    private void b(int i, com.flurry.a.b.a.o oVar, Object obj) {
        this.c[i] = obj;
        long ordinal = oVar.ordinal();
        if (i > 0) {
            ordinal <<= i << 2;
        }
        this.b = ordinal | this.b;
    }
}
