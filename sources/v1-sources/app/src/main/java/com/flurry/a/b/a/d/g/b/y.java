package com.flurry.a.b.a.d.g.b;

/* loaded from: classes.dex */
public abstract class y extends e {
    protected final com.flurry.a.b.a.d.az e;
    protected final com.flurry.a.b.a.d.f f;

    protected abstract void b(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar);

    protected y(Class cls, com.flurry.a.b.a.d.az azVar, com.flurry.a.b.a.d.f fVar) {
        super(cls);
        this.e = azVar;
        this.f = fVar;
    }

    @Override // com.flurry.a.b.a.d.g.b.v, com.flurry.a.b.a.d.ac
    public final void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        eVar.b();
        b(obj, eVar, awVar);
        eVar.c();
    }

    @Override // com.flurry.a.b.a.d.ac
    public final void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar, com.flurry.a.b.a.d.az azVar) {
        azVar.c(obj, eVar);
        b(obj, eVar, awVar);
        azVar.f(obj, eVar);
    }
}
