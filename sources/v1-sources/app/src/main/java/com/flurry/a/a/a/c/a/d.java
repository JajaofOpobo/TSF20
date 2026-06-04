package com.flurry.a.a.a.c.a;

/* loaded from: classes.dex */
final class d extends ab {
    public com.flurry.a.a.a.c a;

    public d(com.flurry.a.a.a.c cVar, com.flurry.a.a.a.c cVar2) {
        super(cVar);
        this.a = cVar2;
    }

    @Override // com.flurry.a.a.a.c.a.ab
    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.b == dVar.b && this.a == dVar.a;
    }

    @Override // com.flurry.a.a.a.c.a.ab
    public final int hashCode() {
        return super.hashCode() + this.a.hashCode();
    }
}
