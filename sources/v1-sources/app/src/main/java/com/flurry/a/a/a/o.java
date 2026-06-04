package com.flurry.a.a.a;

/* loaded from: classes.dex */
final class o extends v {
    private final int i;

    public o(u uVar, String str, int i) {
        super(ad.FIXED, uVar, str);
        if (i < 0) {
            throw new IllegalArgumentException("Invalid fixed size: " + i);
        }
        this.i = i;
    }

    @Override // com.flurry.a.a.a.c
    public final int l() {
        return this.i;
    }

    @Override // com.flurry.a.a.a.c
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return c(oVar) && a((v) oVar) && this.i == oVar.i && this.c.equals(oVar.c);
    }

    @Override // com.flurry.a.a.a.v, com.flurry.a.a.a.c
    final int m() {
        return super.m() + this.i;
    }

    @Override // com.flurry.a.a.a.c
    final void a(w wVar, com.flurry.a.b.a.e eVar) {
        if (!b(wVar, eVar)) {
            eVar.d();
            eVar.a("type", "fixed");
            c(wVar, eVar);
            if (this.g != null) {
                eVar.a("doc", this.g);
            }
            eVar.a("size", this.i);
            this.c.a(eVar);
            a(eVar);
            eVar.e();
        }
    }
}
