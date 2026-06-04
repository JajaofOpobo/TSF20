package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
final class bm extends bf {
    protected final com.flurry.a.b.a.d.i.p b;
    protected final com.flurry.a.b.a.d.e.f c;

    protected bm(com.flurry.a.b.a.d.i.p pVar, com.flurry.a.b.a.d.e.f fVar) {
        super(pVar.a());
        this.b = pVar;
        this.c = fVar;
    }

    @Override // com.flurry.a.b.a.d.b.b.bf
    public final Object b(String str, com.flurry.a.b.a.d.p pVar) {
        if (this.c != null) {
            try {
                return this.c.a(str);
            } catch (Exception e) {
                com.flurry.a.b.a.d.i.l.a(e);
            }
        }
        Enum a = this.b.a(str);
        if (a == null) {
            throw pVar.a(this.a, str, "not one of values for Enum class");
        }
        return a;
    }
}
