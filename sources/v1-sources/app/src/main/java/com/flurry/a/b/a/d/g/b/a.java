package com.flurry.a.b.a.d.g.b;

/* loaded from: classes.dex */
public abstract class a extends e implements com.flurry.a.b.a.d.ar {
    protected final boolean a;
    protected final com.flurry.a.b.a.g.a b;
    protected final com.flurry.a.b.a.d.az c;
    protected com.flurry.a.b.a.d.ac d;
    protected final com.flurry.a.b.a.d.f e;
    protected com.flurry.a.b.a.d.g.a.d f;

    protected abstract void b(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected a(Class cls, com.flurry.a.b.a.g.a aVar, boolean z, com.flurry.a.b.a.d.az azVar, com.flurry.a.b.a.d.f fVar, com.flurry.a.b.a.d.ac acVar) {
        super(cls, (byte) 0);
        boolean z2 = false;
        this.b = aVar;
        if (z || (aVar != null && aVar.u())) {
            z2 = true;
        }
        this.a = z2;
        this.c = azVar;
        this.e = fVar;
        this.d = acVar;
        this.f = com.flurry.a.b.a.d.g.a.d.a();
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

    @Override // com.flurry.a.b.a.d.ar
    public final void a(com.flurry.a.b.a.d.aw awVar) {
        if (this.a && this.b != null && this.d == null) {
            this.d = awVar.a(this.b, this.e);
        }
    }

    protected final com.flurry.a.b.a.d.ac a(com.flurry.a.b.a.d.g.a.d dVar, Class cls, com.flurry.a.b.a.d.aw awVar) {
        com.flurry.a.b.a.d.g.a.h a = dVar.a(cls, awVar, this.e);
        if (dVar != a.b) {
            this.f = a.b;
        }
        return a.a;
    }

    protected final com.flurry.a.b.a.d.ac a(com.flurry.a.b.a.d.g.a.d dVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.aw awVar) {
        com.flurry.a.b.a.d.g.a.h a = dVar.a(aVar, awVar, this.e);
        if (dVar != a.b) {
            this.f = a.b;
        }
        return a.a;
    }
}
