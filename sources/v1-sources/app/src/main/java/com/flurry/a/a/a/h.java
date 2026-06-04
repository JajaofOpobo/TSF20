package com.flurry.a.a.a;

/* loaded from: classes.dex */
final class h extends c {
    private final c f;

    public h(c cVar) {
        super(ad.ARRAY);
        this.f = cVar;
    }

    @Override // com.flurry.a.a.a.c
    public final c i() {
        return this.f;
    }

    @Override // com.flurry.a.a.a.c
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return c(hVar) && this.f.equals(hVar.f) && this.c.equals(hVar.c);
    }

    @Override // com.flurry.a.a.a.c
    final int m() {
        return super.m() + this.f.m();
    }

    @Override // com.flurry.a.a.a.c
    final void a(w wVar, com.flurry.a.b.a.e eVar) {
        eVar.d();
        eVar.a("type", "array");
        eVar.a("items");
        this.f.a(wVar, eVar);
        this.c.a(eVar);
        eVar.e();
    }
}
