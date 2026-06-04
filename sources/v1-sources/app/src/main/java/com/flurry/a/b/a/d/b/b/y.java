package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
public final class y extends c {
    private static final y a = new y();

    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        switch (jVar.e()) {
            case START_OBJECT:
                return a(jVar, pVar, pVar.e());
            case START_ARRAY:
                return b(jVar, pVar, pVar.e());
            default:
                return c(jVar, pVar, pVar.e());
        }
    }

    @Override // com.flurry.a.b.a.d.b.b.c, com.flurry.a.b.a.d.b.b.ap, com.flurry.a.b.a.d.w
    public final /* bridge */ /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, com.flurry.a.b.a.d.ay ayVar) {
        return super.a(jVar, pVar, ayVar);
    }

    protected y() {
        super(com.flurry.a.b.a.h.class);
    }

    public static com.flurry.a.b.a.d.w a(Class cls) {
        if (cls == com.flurry.a.b.a.e.p.class) {
            return ab.c();
        }
        if (cls == com.flurry.a.b.a.e.a.class) {
            return aa.c();
        }
        return a;
    }
}
