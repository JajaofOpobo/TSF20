package com.flurry.a.b.a.d.b.a;

/* loaded from: classes.dex */
public final class n {
    final com.flurry.a.b.a.j a;
    final com.flurry.a.b.a.d.p b;
    final Object[] c;
    private int d;
    private j e;

    public n(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, int i) {
        this.a = jVar;
        this.b = pVar;
        this.d = i;
        this.c = new Object[i];
    }

    protected final j a() {
        return this.e;
    }

    public final boolean a(int i, Object obj) {
        this.c[i] = obj;
        int i2 = this.d - 1;
        this.d = i2;
        return i2 <= 0;
    }

    public final void a(com.flurry.a.b.a.d.b.k kVar, Object obj) {
        this.e = new m(this.e, obj, kVar);
    }

    public final void a(com.flurry.a.b.a.d.b.j jVar, String str, Object obj) {
        this.e = new k(this.e, obj, jVar, str);
    }

    public final void a(Object obj, Object obj2) {
        this.e = new l(this.e, obj2, obj);
    }
}
