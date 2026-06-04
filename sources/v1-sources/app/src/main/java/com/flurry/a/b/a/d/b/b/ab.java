package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
final class ab extends c {
    protected static final ab a = new ab();

    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        if (jVar.e() == com.flurry.a.b.a.o.START_OBJECT) {
            jVar.b();
            return a(jVar, pVar, pVar.e());
        }
        if (jVar.e() == com.flurry.a.b.a.o.FIELD_NAME) {
            return a(jVar, pVar, pVar.e());
        }
        throw pVar.b(com.flurry.a.b.a.e.p.class);
    }

    protected ab() {
        super(com.flurry.a.b.a.e.p.class);
    }

    public static ab c() {
        return a;
    }
}
