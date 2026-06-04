package com.flurry.a.b.a.d.g;

import com.flurry.a.b.a.d.aw;

/* loaded from: classes.dex */
final class l extends d {
    protected final d p;
    protected final Class[] q;

    protected l(d dVar, Class[] clsArr) {
        super(dVar);
        this.p = dVar;
        this.q = clsArr;
    }

    @Override // com.flurry.a.b.a.d.g.d
    public final d a(com.flurry.a.b.a.d.ac acVar) {
        return new l(this.p.a(acVar), this.q);
    }

    @Override // com.flurry.a.b.a.d.g.d
    public final void a(Object obj, com.flurry.a.b.a.e eVar, aw awVar) {
        Class<?> a = awVar.a();
        if (a != null) {
            int i = 0;
            int length = this.q.length;
            while (i < length && !this.q[i].isAssignableFrom(a)) {
                i++;
            }
            if (i == length) {
                return;
            }
        }
        this.p.a(obj, eVar, awVar);
    }
}
