package com.flurry.a.b.a.d.g.b;

import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends a {
    @Override // com.flurry.a.b.a.d.g.b.a
    public final /* synthetic */ void b(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        com.flurry.a.b.a.d.ac acVar = this.d;
        Iterator it = ((EnumSet) obj).iterator();
        com.flurry.a.b.a.d.ac acVar2 = acVar;
        while (it.hasNext()) {
            Enum r0 = (Enum) it.next();
            if (acVar2 == null) {
                acVar2 = awVar.a(r0.getDeclaringClass(), this.e);
            }
            acVar2.a(r0, eVar, awVar);
        }
    }

    public i(com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f fVar) {
        super(EnumSet.class, aVar, true, null, fVar, null);
    }

    @Override // com.flurry.a.b.a.d.g.b.e
    public final e a(com.flurry.a.b.a.d.az azVar) {
        return this;
    }
}
