package com.flurry.a.b.a.d.g.b;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ax extends w implements com.flurry.a.b.a.d.ar {
    protected com.flurry.a.b.a.d.ac a;

    @Override // com.flurry.a.b.a.d.g.b.v, com.flurry.a.b.a.d.ac
    public final /* synthetic */ void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        Collection collection = (Collection) obj;
        eVar.b();
        if (this.a == null) {
            a(collection, eVar, awVar);
        } else {
            b(collection, eVar, awVar);
        }
        eVar.c();
    }

    @Override // com.flurry.a.b.a.d.ac
    public final /* synthetic */ void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar, com.flurry.a.b.a.d.az azVar) {
        Collection collection = (Collection) obj;
        azVar.c(collection, eVar);
        if (this.a == null) {
            a(collection, eVar, awVar);
        } else {
            b(collection, eVar, awVar);
        }
        azVar.f(collection, eVar);
    }

    public ax(com.flurry.a.b.a.d.f fVar) {
        super(Collection.class, fVar);
    }

    @Override // com.flurry.a.b.a.d.ar
    public final void a(com.flurry.a.b.a.d.aw awVar) {
        com.flurry.a.b.a.d.ac a = awVar.a(String.class, this.b);
        if (!a(a)) {
            this.a = a;
        }
    }

    private final void a(Collection collection, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        if (this.a != null) {
            b(collection, eVar, awVar);
            return;
        }
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                try {
                    awVar.a(eVar);
                } catch (Exception e) {
                    a(awVar, e, collection, i);
                }
            } else {
                eVar.b(str);
            }
            i++;
        }
    }

    private void b(Collection collection, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        com.flurry.a.b.a.d.ac acVar = this.a;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                try {
                    awVar.a(eVar);
                } catch (Exception e) {
                    a(awVar, e, collection, 0);
                }
            } else {
                acVar.a(str, eVar, awVar);
            }
        }
    }
}
