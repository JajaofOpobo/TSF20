package com.flurry.a.a.a;

/* loaded from: classes.dex */
final class t extends c {
    private final c f;

    public t(c cVar) {
        super(ad.MAP);
        this.f = cVar;
    }

    @Override // com.flurry.a.a.a.c
    public final c j() {
        return this.f;
    }

    @Override // com.flurry.a.a.a.c
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return c(tVar) && this.f.equals(tVar.f) && this.c.equals(tVar.c);
    }

    @Override // com.flurry.a.a.a.c
    final int m() {
        return super.m() + this.f.m();
    }

    @Override // com.flurry.a.a.a.c
    final void a(w wVar, com.flurry.a.b.a.e eVar) {
        eVar.d();
        eVar.a("type", "map");
        eVar.a("values");
        this.f.a(wVar, eVar);
        this.c.a(eVar);
        eVar.e();
    }
}
