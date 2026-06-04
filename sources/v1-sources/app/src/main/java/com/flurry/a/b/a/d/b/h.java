package com.flurry.a.b.a.d.b;

import com.flurry.a.b.a.d.ag;

/* loaded from: classes.dex */
public final class h extends com.flurry.a.b.a.d.r {
    protected static final ag[] a = new ag[0];
    protected static final i[] b = new i[0];
    protected static final com.flurry.a.b.a.d.a[] c = new com.flurry.a.b.a.d.a[0];
    protected static final w[] d = new w[0];
    protected final com.flurry.a.b.a.d.t[] e;
    protected final ag[] f;
    protected final i[] g;
    protected final com.flurry.a.b.a.d.a[] h;
    protected final w[] i;

    public h() {
        this((byte) 0);
    }

    private h(byte b2) {
        com.flurry.a.b.a.d.t[] tVarArr;
        tVarArr = g.a;
        this.e = tVarArr;
        this.f = a;
        this.g = b;
        this.h = c;
        this.i = d;
    }

    @Override // com.flurry.a.b.a.d.r
    public final boolean f() {
        return this.f.length > 0;
    }

    @Override // com.flurry.a.b.a.d.r
    public final boolean g() {
        return this.g.length > 0;
    }

    @Override // com.flurry.a.b.a.d.r
    public final boolean h() {
        return this.h.length > 0;
    }

    @Override // com.flurry.a.b.a.d.r
    public final boolean i() {
        return this.i.length > 0;
    }

    @Override // com.flurry.a.b.a.d.r
    public final Iterable a() {
        return com.flurry.a.b.a.d.i.b.b(this.e);
    }

    @Override // com.flurry.a.b.a.d.r
    public final Iterable b() {
        return com.flurry.a.b.a.d.i.b.b(this.f);
    }

    @Override // com.flurry.a.b.a.d.r
    public final Iterable c() {
        return com.flurry.a.b.a.d.i.b.b(this.g);
    }

    @Override // com.flurry.a.b.a.d.r
    public final Iterable d() {
        return com.flurry.a.b.a.d.i.b.b(this.h);
    }

    @Override // com.flurry.a.b.a.d.r
    public final Iterable e() {
        return com.flurry.a.b.a.d.i.b.b(this.i);
    }
}
