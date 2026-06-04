package com.flurry.a.b.a.d.g.b;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends a {
    @Override // com.flurry.a.b.a.d.g.b.a
    public final /* synthetic */ void b(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        int i = 0;
        Collection collection = (Collection) obj;
        if (this.d != null) {
            com.flurry.a.b.a.d.ac acVar = this.d;
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                com.flurry.a.b.a.d.az azVar = this.c;
                do {
                    Object next = it.next();
                    if (next == null) {
                        try {
                            awVar.a(eVar);
                        } catch (Exception e) {
                            a(awVar, e, collection, i);
                        }
                    } else if (azVar == null) {
                        acVar.a(next, eVar, awVar);
                    } else {
                        acVar.a(next, eVar, awVar, azVar);
                    }
                    i++;
                } while (it.hasNext());
                return;
            }
            return;
        }
        Iterator it2 = collection.iterator();
        if (it2.hasNext()) {
            com.flurry.a.b.a.d.g.a.d dVar = this.f;
            com.flurry.a.b.a.d.az azVar2 = this.c;
            com.flurry.a.b.a.d.g.a.d dVar2 = dVar;
            int i2 = 0;
            do {
                try {
                    Object next2 = it2.next();
                    if (next2 == null) {
                        awVar.a(eVar);
                    } else {
                        Class<?> cls = next2.getClass();
                        com.flurry.a.b.a.d.ac a = dVar2.a(cls);
                        if (a == null) {
                            com.flurry.a.b.a.d.ac a2 = this.b.e() ? a(dVar2, awVar.a(this.b, cls), awVar) : a(dVar2, cls, awVar);
                            dVar2 = this.f;
                            a = a2;
                        }
                        if (azVar2 == null) {
                            a.a(next2, eVar, awVar);
                        } else {
                            a.a(next2, eVar, awVar, azVar2);
                        }
                    }
                    i2++;
                } catch (Exception e2) {
                    a(awVar, e2, collection, i2);
                    return;
                }
            } while (it2.hasNext());
        }
    }

    public d(com.flurry.a.b.a.g.a aVar, boolean z, com.flurry.a.b.a.d.az azVar, com.flurry.a.b.a.d.f fVar, com.flurry.a.b.a.d.ac acVar) {
        super(Collection.class, aVar, z, azVar, fVar, acVar);
    }

    @Override // com.flurry.a.b.a.d.g.b.e
    public final e a(com.flurry.a.b.a.d.az azVar) {
        return new d(this.b, this.a, azVar, this.e, this.d);
    }
}
