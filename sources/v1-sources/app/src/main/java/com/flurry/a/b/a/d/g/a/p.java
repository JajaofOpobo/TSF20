package com.flurry.a.b.a.d.g.a;

import com.flurry.a.b.a.d.ac;
import com.flurry.a.b.a.d.aw;

/* loaded from: classes.dex */
public final class p extends com.flurry.a.b.a.d.g.b.b {
    public p(com.flurry.a.b.a.d.g.b.b bVar) {
        super(bVar);
    }

    @Override // com.flurry.a.b.a.d.ac
    public final ac a() {
        return this;
    }

    @Override // com.flurry.a.b.a.d.ac
    public final boolean b() {
        return true;
    }

    @Override // com.flurry.a.b.a.d.g.b.v, com.flurry.a.b.a.d.ac
    public final void a(Object obj, com.flurry.a.b.a.e eVar, aw awVar) {
        if (this.e != null) {
            c(obj, eVar, awVar);
        } else {
            b(obj, eVar, awVar);
        }
    }

    public final String toString() {
        return "UnwrappingBeanSerializer for " + c().getName();
    }
}
