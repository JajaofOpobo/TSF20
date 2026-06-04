package com.flurry.a.b.a.d.g.b;

/* loaded from: classes.dex */
public final class h extends s {
    protected final com.flurry.a.b.a.d.i.q a;

    @Override // com.flurry.a.b.a.d.g.b.v, com.flurry.a.b.a.d.ac
    public final /* synthetic */ void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        Enum r2 = (Enum) obj;
        if (awVar.a(com.flurry.a.b.a.d.at.WRITE_ENUMS_USING_INDEX)) {
            eVar.a(r2.ordinal());
        } else {
            eVar.b(this.a.a(r2));
        }
    }

    private h(com.flurry.a.b.a.d.i.q qVar) {
        super(Enum.class, (byte) 0);
        this.a = qVar;
    }

    public static h a(Class cls, com.flurry.a.b.a.d.as asVar) {
        return new h(asVar.a(com.flurry.a.b.a.d.at.WRITE_ENUMS_USING_TO_STRING) ? com.flurry.a.b.a.d.i.q.a(cls) : com.flurry.a.b.a.d.i.q.a(cls, asVar.a()));
    }

    public final com.flurry.a.b.a.d.i.q d() {
        return this.a;
    }
}
