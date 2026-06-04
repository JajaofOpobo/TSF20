package com.flurry.a.b.a.d.g;

import com.flurry.a.b.a.d.aw;

/* loaded from: classes.dex */
final class m extends d {
    protected final d p;
    protected final Class q;

    protected m(d dVar, Class cls) {
        super(dVar);
        this.p = dVar;
        this.q = cls;
    }

    @Override // com.flurry.a.b.a.d.g.d
    public final d a(com.flurry.a.b.a.d.ac acVar) {
        return new m(this.p.a(acVar), this.q);
    }

    @Override // com.flurry.a.b.a.d.g.d
    public final void a(Object obj, com.flurry.a.b.a.e eVar, aw awVar) {
        Class<?> a = awVar.a();
        if (a == null || this.q.isAssignableFrom(a)) {
            this.p.a(obj, eVar, awVar);
        }
    }
}
