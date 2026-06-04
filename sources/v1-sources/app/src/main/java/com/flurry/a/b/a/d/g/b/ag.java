package com.flurry.a.b.a.d.g.b;

/* loaded from: classes.dex */
public final class ag extends y {
    @Override // com.flurry.a.b.a.d.g.b.y
    public final /* synthetic */ void b(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        for (short s : (short[]) obj) {
            eVar.a((int) s);
        }
    }

    public ag() {
        this(null);
    }

    private ag(com.flurry.a.b.a.d.az azVar) {
        super(short[].class, azVar, null);
    }

    @Override // com.flurry.a.b.a.d.g.b.e
    public final e a(com.flurry.a.b.a.d.az azVar) {
        return new ag(azVar);
    }
}
