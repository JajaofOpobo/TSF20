package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
public final class x extends bw {
    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            String trim = jVar.k().trim();
            return trim.length() == 0 ? (com.flurry.a.b.a.g.a) b() : pVar.f().b(trim);
        }
        if (e == com.flurry.a.b.a.o.VALUE_EMBEDDED_OBJECT) {
            return (com.flurry.a.b.a.g.a) jVar.z();
        }
        throw pVar.b(this.q);
    }

    public x() {
        super(com.flurry.a.b.a.g.a.class);
    }
}
