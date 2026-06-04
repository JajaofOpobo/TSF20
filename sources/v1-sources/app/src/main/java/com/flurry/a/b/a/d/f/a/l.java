package com.flurry.a.b.a.d.f.a;

import com.flurry.a.b.a.d.ah;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends com.flurry.a.b.a.d.f.b {
    protected LinkedHashSet a;

    @Override // com.flurry.a.b.a.d.f.b
    public final Collection a(com.flurry.a.b.a.d.e.e eVar, ah ahVar, com.flurry.a.b.a.d.b bVar) {
        HashMap hashMap = new HashMap();
        if (this.a != null) {
            Class d = eVar.d();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                com.flurry.a.b.a.d.f.a aVar = (com.flurry.a.b.a.d.f.a) it.next();
                if (d.isAssignableFrom(aVar.a())) {
                    a(com.flurry.a.b.a.d.e.b.b(aVar.a(), bVar, ahVar), aVar, ahVar, bVar, hashMap);
                }
            }
        }
        List<com.flurry.a.b.a.d.f.a> a = bVar.a((com.flurry.a.b.a.d.e.a) eVar);
        if (a != null) {
            for (com.flurry.a.b.a.d.f.a aVar2 : a) {
                a(com.flurry.a.b.a.d.e.b.b(aVar2.a(), bVar, ahVar), aVar2, ahVar, bVar, hashMap);
            }
        }
        a(com.flurry.a.b.a.d.e.b.b(eVar.d(), bVar, ahVar), new com.flurry.a.b.a.d.f.a(eVar.d(), null), ahVar, bVar, hashMap);
        return new ArrayList(hashMap.values());
    }

    @Override // com.flurry.a.b.a.d.f.b
    public final Collection a(com.flurry.a.b.a.d.e.b bVar, ah ahVar, com.flurry.a.b.a.d.b bVar2) {
        HashMap hashMap = new HashMap();
        if (this.a != null) {
            Class d = bVar.d();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                com.flurry.a.b.a.d.f.a aVar = (com.flurry.a.b.a.d.f.a) it.next();
                if (d.isAssignableFrom(aVar.a())) {
                    a(com.flurry.a.b.a.d.e.b.b(aVar.a(), bVar2, ahVar), aVar, ahVar, bVar2, hashMap);
                }
            }
        }
        a(bVar, new com.flurry.a.b.a.d.f.a(bVar.d(), null), ahVar, bVar2, hashMap);
        return new ArrayList(hashMap.values());
    }

    private void a(com.flurry.a.b.a.d.e.b bVar, com.flurry.a.b.a.d.f.a aVar, ah ahVar, com.flurry.a.b.a.d.b bVar2, HashMap hashMap) {
        String g;
        if (!aVar.c() && (g = bVar2.g(bVar)) != null) {
            aVar = new com.flurry.a.b.a.d.f.a(aVar.a(), g);
        }
        if (hashMap.containsKey(aVar)) {
            if (aVar.c() && !((com.flurry.a.b.a.d.f.a) hashMap.get(aVar)).c()) {
                hashMap.put(aVar, aVar);
                return;
            }
            return;
        }
        hashMap.put(aVar, aVar);
        List<com.flurry.a.b.a.d.f.a> a = bVar2.a((com.flurry.a.b.a.d.e.a) bVar);
        if (a != null && !a.isEmpty()) {
            for (com.flurry.a.b.a.d.f.a aVar2 : a) {
                com.flurry.a.b.a.d.e.b b = com.flurry.a.b.a.d.e.b.b(aVar2.a(), bVar2, ahVar);
                a(b, !aVar2.c() ? new com.flurry.a.b.a.d.f.a(aVar2.a(), bVar2.g(b)) : aVar2, ahVar, bVar2, hashMap);
            }
        }
    }
}
