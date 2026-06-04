package com.flurry.a.b.a.d.g.b;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class ak extends a {
    @Override // com.flurry.a.b.a.d.g.b.a
    public final /* synthetic */ void b(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        com.flurry.a.b.a.d.ac acVar;
        Class<?> cls = null;
        Iterator it = (Iterator) obj;
        if (it.hasNext()) {
            com.flurry.a.b.a.d.az azVar = this.c;
            com.flurry.a.b.a.d.ac acVar2 = null;
            do {
                Object next = it.next();
                if (next == null) {
                    awVar.a(eVar);
                } else {
                    Class<?> cls2 = next.getClass();
                    if (cls2 == cls) {
                        acVar = acVar2;
                    } else {
                        acVar2 = awVar.a(cls2, this.e);
                        cls = cls2;
                        acVar = acVar2;
                    }
                    if (azVar == null) {
                        acVar.a(next, eVar, awVar);
                    } else {
                        acVar.a(next, eVar, awVar, azVar);
                    }
                }
            } while (it.hasNext());
        }
    }

    public ak(com.flurry.a.b.a.g.a aVar, boolean z, com.flurry.a.b.a.d.az azVar, com.flurry.a.b.a.d.f fVar) {
        super(Iterator.class, aVar, z, azVar, fVar, null);
    }

    @Override // com.flurry.a.b.a.d.g.b.e
    public final e a(com.flurry.a.b.a.d.az azVar) {
        return new ak(this.b, this.a, azVar, this.e);
    }
}
