package com.flurry.a.b.a.d.g;

import com.flurry.a.b.a.d.as;
import com.flurry.a.b.a.d.at;
import com.flurry.a.b.a.d.av;
import com.flurry.a.b.a.d.ax;
import com.flurry.a.b.a.d.az;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends b {
    public static final g e = new g();
    protected final av f = new h();

    private g() {
    }

    @Override // com.flurry.a.b.a.d.g.b
    protected final Iterable a() {
        return this.f.c();
    }

    @Override // com.flurry.a.b.a.d.au
    public final com.flurry.a.b.a.d.ac a(as asVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f fVar) {
        com.flurry.a.b.a.d.ac b;
        com.flurry.a.b.a.d.e.k kVar = (com.flurry.a.b.a.d.e.k) asVar.b(aVar);
        com.flurry.a.b.a.d.ac a = a(asVar, kVar.c());
        if (a == null) {
            com.flurry.a.b.a.g.a a2 = a(asVar, kVar.c(), aVar);
            boolean z = a2 != aVar;
            if (aVar.f()) {
                return a(asVar, a2, kVar, fVar, z);
            }
            Iterator it = this.f.c().iterator();
            while (it.hasNext()) {
                com.flurry.a.b.a.d.ac a3 = ((ax) it.next()).a();
                if (a3 != null) {
                    return a3;
                }
            }
            com.flurry.a.b.a.d.ac a4 = a(a2);
            if (a4 == null) {
                com.flurry.a.b.a.d.ac a5 = a(a2, asVar, kVar, fVar);
                if (a5 == null) {
                    Class p = a2.p();
                    if (!(com.flurry.a.b.a.d.i.l.a(p) == null && !com.flurry.a.b.a.d.i.l.d(p))) {
                        b = null;
                    } else {
                        if (kVar.b() == Object.class) {
                            throw new IllegalArgumentException("Can not create bean serializer for Object.class");
                        }
                        f fVar2 = new f(kVar);
                        List a6 = a(asVar, kVar);
                        if (a6 == null) {
                            a6 = new ArrayList();
                        }
                        if (this.f.b()) {
                            Iterator it2 = this.f.e().iterator();
                            while (it2.hasNext()) {
                                it2.next();
                            }
                        }
                        List a7 = a(asVar, kVar, a6);
                        if (this.f.b()) {
                            Iterator it3 = this.f.e().iterator();
                            while (it3.hasNext()) {
                                it3.next();
                            }
                        }
                        fVar2.a(a7);
                        fVar2.a(asVar.a().f(kVar.c()));
                        com.flurry.a.b.a.d.e.f p2 = kVar.p();
                        if (p2 != null) {
                            if (asVar.a(at.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                                com.flurry.a.b.a.d.i.l.a(p2.j());
                            }
                            com.flurry.a.b.a.g.a a8 = p2.a(kVar.j());
                            fVar2.a(new a(p2, com.flurry.a.b.a.d.g.b.n.a(null, a8, asVar.a(at.USE_STATIC_TYPING), b(asVar, a8.g(), fVar), fVar, null, null)));
                        }
                        a(asVar, fVar2);
                        if (this.f.b()) {
                            Iterator it4 = this.f.e().iterator();
                            while (it4.hasNext()) {
                                it4.next();
                            }
                        }
                        b = fVar2.b();
                        if (b == null && kVar.h()) {
                            b = fVar2.c();
                        }
                        if (this.f.b()) {
                            Iterator it5 = this.f.e().iterator();
                            while (it5.hasNext()) {
                                it5.next();
                            }
                        }
                    }
                    if (b == null) {
                        return a(asVar, a2, kVar, fVar);
                    }
                    return b;
                }
                return a5;
            }
            return a4;
        }
        return a;
    }

    @Override // com.flurry.a.b.a.d.au
    public final com.flurry.a.b.a.d.ac a(as asVar, com.flurry.a.b.a.g.a aVar) {
        com.flurry.a.b.a.d.ac acVar = null;
        if (this.f.a()) {
            asVar.f(aVar.p());
            Iterator it = this.f.d().iterator();
            while (it.hasNext() && (acVar = ((ax) it.next()).a()) == null) {
            }
        }
        return acVar;
    }

    private List a(as asVar, com.flurry.a.b.a.d.e.k kVar) {
        List<com.flurry.a.b.a.d.h> d = kVar.d();
        com.flurry.a.b.a.d.b a = asVar.a();
        com.flurry.a.b.a.d.b a2 = asVar.a();
        HashMap hashMap = new HashMap();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            com.flurry.a.b.a.d.e.e i = ((com.flurry.a.b.a.d.h) it.next()).i();
            if (i == null) {
                it.remove();
            } else {
                Class d2 = i.d();
                Boolean bool = (Boolean) hashMap.get(d2);
                if (bool == null) {
                    bool = a2.e(((com.flurry.a.b.a.d.e.k) asVar.f(d2)).c());
                    if (bool == null) {
                        bool = Boolean.FALSE;
                    }
                    hashMap.put(d2, bool);
                }
                if (bool.booleanValue()) {
                    it.remove();
                }
            }
        }
        if (asVar.a(at.REQUIRE_SETTERS_FOR_GETTERS)) {
            a(d);
        }
        if (d.isEmpty()) {
            return null;
        }
        boolean a3 = a(asVar, kVar, (az) null, (com.flurry.a.b.a.d.f) null);
        n nVar = new n(asVar, kVar);
        ArrayList arrayList = new ArrayList(d.size());
        com.flurry.a.b.a.d.h.j j = kVar.j();
        for (com.flurry.a.b.a.d.h hVar : d) {
            com.flurry.a.b.a.d.e.e i2 = hVar.i();
            com.flurry.a.b.a.d.c a4 = a.a(i2);
            if (a4 == null || !a4.c()) {
                String a5 = hVar.a();
                if (i2 instanceof com.flurry.a.b.a.d.e.f) {
                    arrayList.add(a(asVar, j, nVar, a3, a5, (com.flurry.a.b.a.d.e.f) i2));
                } else {
                    arrayList.add(a(asVar, j, nVar, a3, a5, (com.flurry.a.b.a.d.e.d) i2));
                }
            }
        }
        return arrayList;
    }

    private static List a(as asVar, com.flurry.a.b.a.d.e.k kVar, List list) {
        String[] c = asVar.a().c(kVar.c());
        if (c != null && c.length > 0) {
            HashSet a = com.flurry.a.b.a.d.i.b.a(c);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (a.contains(((d) it.next()).d())) {
                    it.remove();
                }
            }
        }
        return list;
    }

    private static void a(as asVar, f fVar) {
        List a = fVar.a();
        boolean a2 = asVar.a(at.DEFAULT_VIEW_INCLUSION);
        int size = a.size();
        d[] dVarArr = new d[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            d dVar = (d) a.get(i);
            Class[] h = dVar.h();
            if (h == null) {
                if (a2) {
                    dVarArr[i] = dVar;
                }
            } else {
                i2++;
                dVarArr[i] = k.a(dVar, h);
            }
            i++;
            i2 = i2;
        }
        if (!a2 || i2 != 0) {
            fVar.a(dVarArr);
        }
    }

    private static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!(((com.flurry.a.b.a.d.h) it.next()).j() != null)) {
                it.remove();
            }
        }
    }

    private d a(as asVar, com.flurry.a.b.a.d.h.j jVar, n nVar, boolean z, String str, com.flurry.a.b.a.d.e.e eVar) {
        boolean z2 = true;
        if (asVar.a(at.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            com.flurry.a.b.a.d.i.l.a(eVar.j());
        }
        com.flurry.a.b.a.g.a a = eVar.a(jVar);
        com.flurry.a.b.a.d.g gVar = new com.flurry.a.b.a.d.g(str, a, nVar.a(), eVar);
        com.flurry.a.b.a.d.ac a2 = a(asVar, eVar);
        az azVar = null;
        Class p = a.p();
        if (!p.isArray() && !Collection.class.isAssignableFrom(p) && !Map.class.isAssignableFrom(p)) {
            z2 = false;
        }
        if (z2) {
            com.flurry.a.b.a.g.a g = a.g();
            com.flurry.a.b.a.d.b a3 = asVar.a();
            com.flurry.a.b.a.d.f.d b = a3.b(asVar, eVar, a);
            azVar = b == null ? b(asVar, g, gVar) : b.a(asVar, g, asVar.m().a(eVar, asVar, a3), gVar);
        }
        com.flurry.a.b.a.d.b a4 = asVar.a();
        com.flurry.a.b.a.d.f.d a5 = a4.a(asVar, eVar, a);
        d a6 = nVar.a(str, a, a2, a5 == null ? b(asVar, a, gVar) : a5.a(asVar, a, asVar.m().a(eVar, asVar, a4), gVar), azVar, eVar, z);
        a6.a(asVar.a().i(eVar));
        return a6;
    }
}
