package com.flurry.a.b.a.d.b;

import com.flurry.a.b.a.d.ae;
import com.flurry.a.b.a.d.ag;
import com.flurry.a.b.a.d.ay;
import com.flurry.a.b.a.d.b.b.bv;
import com.flurry.a.b.a.d.b.b.ca;
import com.flurry.a.b.a.d.e.x;
import com.flurry.a.b.a.d.y;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class g extends c {
    protected final com.flurry.a.b.a.d.r i;
    private static final Class[] j = {Throwable.class};
    public static final g h = new g((byte) 0);

    public g() {
        this((byte) 0);
    }

    private g(byte b) {
        this.i = new h();
    }

    @Override // com.flurry.a.b.a.d.q
    public final ae b(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar) {
        if (this.i.f()) {
            nVar.f(aVar.p());
            Iterator it = this.i.b().iterator();
            while (it.hasNext()) {
                ae a = ((ag) it.next()).a();
                if (a != null) {
                    return a;
                }
            }
        }
        Class p = aVar.p();
        if (p == String.class || p == Object.class) {
            return bv.a(aVar);
        }
        ae aeVar = (ae) c.get(aVar);
        if (aeVar == null) {
            if (aVar.r()) {
                com.flurry.a.b.a.d.e.k kVar = (com.flurry.a.b.a.d.e.k) nVar.b(aVar);
                Class<?> p2 = aVar.p();
                com.flurry.a.b.a.d.i.p a2 = a(p2, nVar);
                for (com.flurry.a.b.a.d.e.f fVar : kVar.o()) {
                    if (nVar.a().p(fVar)) {
                        if (fVar.f() != 1 || !fVar.d().isAssignableFrom(p2)) {
                            throw new IllegalArgumentException("Unsuitable method (" + fVar + ") decorated with @JsonCreator (for Enum type " + p2.getName() + ")");
                        }
                        if (fVar.a(0) != String.class) {
                            throw new IllegalArgumentException("Parameter #0 type for factory method (" + fVar + ") not suitable, must be java.lang.String");
                        }
                        if (nVar.c()) {
                            com.flurry.a.b.a.d.i.l.a(fVar.j());
                        }
                        return bv.a(a2, fVar);
                    }
                }
                return bv.a(a2);
            }
            return bv.a(nVar, aVar);
        }
        return aeVar;
    }

    @Override // com.flurry.a.b.a.d.b.c
    protected final com.flurry.a.b.a.d.w a() {
        Iterator it = this.i.a().iterator();
        while (it.hasNext()) {
            com.flurry.a.b.a.d.w a = ((com.flurry.a.b.a.d.t) it.next()).a();
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.b.c
    protected final com.flurry.a.b.a.d.w b() {
        Iterator it = this.i.a().iterator();
        while (it.hasNext()) {
            com.flurry.a.b.a.d.w b = ((com.flurry.a.b.a.d.t) it.next()).b();
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.b.c
    protected final com.flurry.a.b.a.d.w c() {
        Iterator it = this.i.a().iterator();
        while (it.hasNext()) {
            com.flurry.a.b.a.d.w c = ((com.flurry.a.b.a.d.t) it.next()).c();
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.b.c
    protected final com.flurry.a.b.a.d.w d() {
        Iterator it = this.i.a().iterator();
        while (it.hasNext()) {
            com.flurry.a.b.a.d.w d = ((com.flurry.a.b.a.d.t) it.next()).d();
            if (d != null) {
                return d;
            }
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.b.c
    protected final com.flurry.a.b.a.d.w e() {
        Iterator it = this.i.a().iterator();
        while (it.hasNext()) {
            com.flurry.a.b.a.d.w e = ((com.flurry.a.b.a.d.t) it.next()).e();
            if (e != null) {
                return e;
            }
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.b.c
    protected final com.flurry.a.b.a.d.w f() {
        Iterator it = this.i.a().iterator();
        while (it.hasNext()) {
            com.flurry.a.b.a.d.w f = ((com.flurry.a.b.a.d.t) it.next()).f();
            if (f != null) {
                return f;
            }
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.b.c
    protected final com.flurry.a.b.a.d.w g() {
        Iterator it = this.i.a().iterator();
        while (it.hasNext()) {
            com.flurry.a.b.a.d.w g = ((com.flurry.a.b.a.d.t) it.next()).g();
            if (g != null) {
                return g;
            }
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.b.c
    public final com.flurry.a.b.a.g.a b(com.flurry.a.b.a.g.a aVar) {
        aVar.p();
        if (this.i.h()) {
            Iterator it = this.i.d().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        return aVar;
    }

    @Override // com.flurry.a.b.a.d.b.c
    public final v a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.e.k kVar) {
        v a;
        com.flurry.a.b.a.d.e.c k;
        Object j2 = nVar.a().j(kVar.c());
        if (j2 != null) {
            if (j2 instanceof v) {
                a = (v) j2;
            } else {
                if (!(j2 instanceof Class)) {
                    throw new IllegalStateException("Invalid value instantiator returned for type " + kVar + ": neither a Class nor ValueInstantiator");
                }
                Class cls = (Class) j2;
                if (!v.class.isAssignableFrom(cls)) {
                    throw new IllegalStateException("Invalid instantiator Class<?> returned for type " + kVar + ": " + cls.getName() + " not a ValueInstantiator");
                }
                a = nVar.d(cls);
            }
        } else {
            boolean a2 = nVar.a(com.flurry.a.b.a.d.o.CAN_OVERRIDE_ACCESS_MODIFIERS);
            com.flurry.a.b.a.d.b.a.d dVar = new com.flurry.a.b.a.d.b.a.d(kVar, a2);
            com.flurry.a.b.a.d.b a3 = nVar.a();
            if (kVar.a().d() && (k = kVar.k()) != null) {
                if (a2) {
                    com.flurry.a.b.a.d.i.l.a(k.e());
                }
                dVar.a(k);
            }
            x a4 = nVar.a().a(kVar.c(), nVar.e());
            b(nVar, kVar, a4, a3, dVar);
            a(nVar, kVar, a4, a3, dVar);
            a = dVar.a(nVar);
        }
        if (this.i.i()) {
            for (w wVar : this.i.e()) {
                v a5 = wVar.a();
                if (a5 == null) {
                    throw new y("Broken registered ValueInstantiators (of type " + wVar.getClass().getName() + "): returned null ValueInstantiator");
                }
                a = a5;
            }
        }
        return a;
    }

    @Override // com.flurry.a.b.a.d.q
    public final com.flurry.a.b.a.d.w a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f fVar) {
        com.flurry.a.b.a.d.e.k kVar;
        com.flurry.a.b.a.d.w wVar;
        k a;
        if (aVar.c()) {
            aVar = b(aVar);
        }
        com.flurry.a.b.a.d.e.k kVar2 = (com.flurry.a.b.a.d.e.k) nVar.b(aVar);
        com.flurry.a.b.a.d.w a2 = a(nVar, kVar2.c());
        if (a2 != null) {
            return a2;
        }
        com.flurry.a.b.a.g.a a3 = a(nVar, kVar2.c(), aVar);
        if (a3.p() != aVar.p()) {
            aVar = a3;
            kVar = (com.flurry.a.b.a.d.e.k) nVar.b(a3);
        } else {
            kVar = kVar2;
        }
        Iterator it = this.i.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                wVar = null;
                break;
            }
            wVar = ((com.flurry.a.b.a.d.t) it.next()).h();
            if (wVar != null) {
                break;
            }
        }
        if (wVar == null) {
            if (aVar.q()) {
                f a4 = a(kVar);
                a4.a(a(nVar, kVar));
                a(nVar, kVar, a4);
                com.flurry.a.b.a.d.e.f a5 = kVar.a("initCause", j);
                if (a5 != null && (a = a(nVar, kVar, "cause", a5)) != null) {
                    a4.a(a);
                }
                a4.a("localizedMessage");
                a4.a("message");
                if (this.i.g()) {
                    Iterator it2 = this.i.c().iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
                com.flurry.a.b.a.d.w a6 = a4.a(fVar);
                if (a6 instanceof d) {
                    a6 = new ca((d) a6);
                }
                if (this.i.g()) {
                    Iterator it3 = this.i.c().iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                    return a6;
                }
                return a6;
            }
            if (aVar.c()) {
                kVar.a();
                Iterator it4 = this.i.d().iterator();
                while (it4.hasNext()) {
                    it4.next();
                }
            }
            com.flurry.a.b.a.d.w c = c(nVar, aVar, fVar);
            if (c == null) {
                Class p = aVar.p();
                String a7 = com.flurry.a.b.a.d.i.l.a(p);
                if (a7 != null) {
                    throw new IllegalArgumentException("Can not deserialize Class " + p.getName() + " (of type " + a7 + ") as a Bean");
                }
                if (com.flurry.a.b.a.d.i.l.d(p)) {
                    throw new IllegalArgumentException("Can not deserialize Proxy class " + p.getName() + " as a Bean");
                }
                String b = com.flurry.a.b.a.d.i.l.b(p);
                if (b != null) {
                    throw new IllegalArgumentException("Can not deserialize Class " + p.getName() + " (of type " + b + ") as a Bean");
                }
                return a(nVar, aVar, kVar, fVar);
            }
            return c;
        }
        return wVar;
    }

    private com.flurry.a.b.a.d.w a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.e.k kVar, com.flurry.a.b.a.d.f fVar) {
        v a = a(nVar, kVar);
        if (aVar.c() && !a.b()) {
            return new a(aVar);
        }
        f a2 = a(kVar);
        a2.a(a);
        a(nVar, kVar, a2);
        Map q = kVar.q();
        if (q != null) {
            for (Map.Entry entry : q.entrySet()) {
                String str = (String) entry.getKey();
                com.flurry.a.b.a.d.e.e eVar = (com.flurry.a.b.a.d.e.e) entry.getValue();
                if (eVar instanceof com.flurry.a.b.a.d.e.f) {
                    a2.a(str, a(nVar, kVar, eVar.b(), (com.flurry.a.b.a.d.e.f) eVar));
                } else {
                    a2.a(str, a(nVar, kVar, eVar.b(), (com.flurry.a.b.a.d.e.d) eVar));
                }
            }
        }
        Map m = kVar.m();
        if (m != null) {
            boolean a3 = nVar.a(com.flurry.a.b.a.d.o.CAN_OVERRIDE_ACCESS_MODIFIERS);
            for (Map.Entry entry2 : m.entrySet()) {
                com.flurry.a.b.a.d.e.e eVar2 = (com.flurry.a.b.a.d.e.e) entry2.getValue();
                if (a3) {
                    com.flurry.a.b.a.d.i.l.a(eVar2.j());
                }
                String b = eVar2.b();
                Type c = eVar2.c();
                a2.a(b, c == null ? null : kVar.j().a(c), kVar.i(), eVar2, entry2.getKey());
            }
        }
        if (this.i.g()) {
            Iterator it = this.i.c().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        com.flurry.a.b.a.d.w a4 = a2.a(fVar);
        if (this.i.g()) {
            Iterator it2 = this.i.c().iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            return a4;
        }
        return a4;
    }

    private static f a(com.flurry.a.b.a.d.e.k kVar) {
        return new f(kVar);
    }

    private void a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.e.k kVar, x xVar, com.flurry.a.b.a.d.b bVar, com.flurry.a.b.a.d.b.a.d dVar) {
        int i;
        int i2;
        for (com.flurry.a.b.a.d.e.c cVar : kVar.n()) {
            int f = cVar.f();
            if (f > 0) {
                boolean p = bVar.p(cVar);
                boolean a = xVar.a(cVar);
                if (f == 1) {
                    com.flurry.a.b.a.d.e.h b = cVar.b(0);
                    String a2 = bVar.a(b);
                    Object d = bVar.d((com.flurry.a.b.a.d.e.e) b);
                    if (d != null || (a2 != null && a2.length() > 0)) {
                        dVar.a(cVar, new com.flurry.a.b.a.d.b.a.e[]{a(nVar, kVar, a2, 0, b, d)});
                    } else {
                        Class g = cVar.g();
                        if (g == String.class) {
                            if (p || a) {
                                dVar.a((com.flurry.a.b.a.d.e.i) cVar);
                            }
                        } else if (g == Integer.TYPE || g == Integer.class) {
                            if (p || a) {
                                dVar.b(cVar);
                            }
                        } else if (g == Long.TYPE || g == Long.class) {
                            if (p || a) {
                                dVar.c(cVar);
                            }
                        } else if (g == Double.TYPE || g == Double.class) {
                            if (p || a) {
                                dVar.d(cVar);
                            }
                        } else if (p) {
                            dVar.f(cVar);
                        }
                    }
                } else if (p || a) {
                    com.flurry.a.b.a.d.e.h hVar = null;
                    int i3 = 0;
                    int i4 = 0;
                    com.flurry.a.b.a.d.b.a.e[] eVarArr = new com.flurry.a.b.a.d.b.a.e[f];
                    int i5 = 0;
                    while (i5 < f) {
                        com.flurry.a.b.a.d.e.h b2 = cVar.b(i5);
                        String a3 = b2 == null ? null : bVar.a(b2);
                        Object d2 = bVar.d((com.flurry.a.b.a.d.e.e) b2);
                        if (a3 != null && a3.length() > 0) {
                            eVarArr[i5] = a(nVar, kVar, a3, i5, b2, d2);
                            i = i4;
                            i2 = i3 + 1;
                            b2 = hVar;
                        } else if (d2 != null) {
                            eVarArr[i5] = a(nVar, kVar, a3, i5, b2, d2);
                            i = i4 + 1;
                            i2 = i3;
                            b2 = hVar;
                        } else if (hVar == null) {
                            i = i4;
                            i2 = i3;
                        } else {
                            i = i4;
                            i2 = i3;
                            b2 = hVar;
                        }
                        i5++;
                        i4 = i;
                        i3 = i2;
                        hVar = b2;
                    }
                    if (p || i3 > 0 || i4 > 0) {
                        if (i3 + i4 == f) {
                            dVar.a(cVar, eVarArr);
                        } else {
                            if (i3 == 0 && i4 + 1 == f) {
                                throw new IllegalArgumentException("Delegated constructor with Injectables not yet supported (see [JACKSON-712]) for " + cVar);
                            }
                            throw new IllegalArgumentException("Argument #" + hVar.g() + " of constructor " + cVar + " has no property name annotation; must have name when multiple-paramater constructor annotated as Creator");
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.e.k kVar, x xVar, com.flurry.a.b.a.d.b bVar, com.flurry.a.b.a.d.b.a.d dVar) {
        int i;
        for (com.flurry.a.b.a.d.e.f fVar : kVar.o()) {
            int f = fVar.f();
            if (f > 0) {
                boolean p = bVar.p(fVar);
                if (f == 1) {
                    com.flurry.a.b.a.d.e.h b = fVar.b(0);
                    String a = bVar.a(b);
                    if (bVar.d((com.flurry.a.b.a.d.e.e) b) == null && (a == null || a.length() == 0)) {
                        Class g = fVar.g();
                        if (g == String.class) {
                            if (p || xVar.a((com.flurry.a.b.a.d.e.e) fVar)) {
                                dVar.a(fVar);
                            }
                        } else if (g == Integer.TYPE || g == Integer.class) {
                            if (p || xVar.a((com.flurry.a.b.a.d.e.e) fVar)) {
                                dVar.b(fVar);
                            }
                        } else if (g == Long.TYPE || g == Long.class) {
                            if (p || xVar.a((com.flurry.a.b.a.d.e.e) fVar)) {
                                dVar.c(fVar);
                            }
                        } else if (g == Double.TYPE || g == Double.class) {
                            if (p || xVar.a((com.flurry.a.b.a.d.e.e) fVar)) {
                                dVar.d(fVar);
                            }
                        } else if (g == Boolean.TYPE || g == Boolean.class) {
                            if (p || xVar.a((com.flurry.a.b.a.d.e.e) fVar)) {
                                dVar.e(fVar);
                            }
                        } else if (bVar.p(fVar)) {
                            dVar.f(fVar);
                        }
                    }
                    com.flurry.a.b.a.d.b.a.e[] eVarArr = new com.flurry.a.b.a.d.b.a.e[f];
                    for (i = 0; i < f; i++) {
                        com.flurry.a.b.a.d.e.h b2 = fVar.b(i);
                        String a2 = bVar.a(b2);
                        Object d = bVar.d((com.flurry.a.b.a.d.e.e) b2);
                        if ((a2 == null || a2.length() == 0) && d == null) {
                            throw new IllegalArgumentException("Argument #" + i + " of factory method " + fVar + " has no property name annotation; must have when multiple-paramater static method annotated as Creator");
                        }
                        eVarArr[i] = a(nVar, kVar, a2, i, b2, d);
                    }
                    dVar.a(fVar, eVarArr);
                } else if (bVar.p(fVar)) {
                    com.flurry.a.b.a.d.b.a.e[] eVarArr2 = new com.flurry.a.b.a.d.b.a.e[f];
                    while (i < f) {
                    }
                    dVar.a(fVar, eVarArr2);
                } else {
                    continue;
                }
            }
        }
    }

    private com.flurry.a.b.a.d.b.a.e a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.e.k kVar, String str, int i, com.flurry.a.b.a.d.e.h hVar, Object obj) {
        com.flurry.a.b.a.g.a a = nVar.n().a(hVar.e(), kVar.j());
        com.flurry.a.b.a.d.g gVar = new com.flurry.a.b.a.d.g(str, a, kVar.i(), hVar);
        com.flurry.a.b.a.g.a a2 = a(nVar, a, hVar, gVar);
        com.flurry.a.b.a.d.f a3 = a2 != a ? gVar.a(a2) : gVar;
        com.flurry.a.b.a.d.w a4 = a(nVar, hVar);
        com.flurry.a.b.a.g.a a5 = a(nVar, hVar, a2);
        ay ayVar = (ay) a5.o();
        com.flurry.a.b.a.d.b.a.e eVar = new com.flurry.a.b.a.d.b.a.e(str, a5, ayVar == null ? b(nVar, a5, a3) : ayVar, kVar.i(), hVar, i, obj);
        if (a4 != null) {
            return eVar.a(a4);
        }
        return eVar;
    }

    private void a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.e.k kVar, f fVar) {
        j jVar;
        List<com.flurry.a.b.a.d.h> d = kVar.d();
        com.flurry.a.b.a.d.b a = nVar.a();
        Boolean d2 = a.d(kVar.c());
        if (d2 != null) {
            fVar.a(d2.booleanValue());
        }
        HashSet a2 = com.flurry.a.b.a.d.i.b.a(a.c(kVar.c()));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            fVar.a((String) it.next());
        }
        com.flurry.a.b.a.d.e.f l = kVar.l();
        Set f = l == null ? kVar.f() : kVar.g();
        if (f != null) {
            Iterator it2 = f.iterator();
            while (it2.hasNext()) {
                fVar.a((String) it2.next());
            }
        }
        HashMap hashMap = new HashMap();
        for (com.flurry.a.b.a.d.h hVar : d) {
            String a3 = hVar.a();
            if (!a2.contains(a3) && !hVar.e()) {
                if (hVar.c()) {
                    com.flurry.a.b.a.d.e.f g = hVar.g();
                    if (a(nVar, g.g(), hashMap)) {
                        fVar.a(a3);
                    } else {
                        k a4 = a(nVar, kVar, a3, g);
                        if (a4 != null) {
                            fVar.b(a4);
                        }
                    }
                } else if (hVar.d()) {
                    com.flurry.a.b.a.d.e.d h2 = hVar.h();
                    if (a(nVar, h2.d(), hashMap)) {
                        fVar.a(a3);
                    } else {
                        k a5 = a(nVar, kVar, a3, h2);
                        if (a5 != null) {
                            fVar.b(a5);
                        }
                    }
                }
            }
        }
        if (l != null) {
            if (nVar.a(com.flurry.a.b.a.d.o.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                l.l();
            }
            com.flurry.a.b.a.g.a a6 = kVar.j().a(l.a(1));
            com.flurry.a.b.a.d.g gVar = new com.flurry.a.b.a.d.g(l.b(), a6, kVar.i(), l);
            com.flurry.a.b.a.g.a a7 = a(nVar, a6, l, gVar);
            com.flurry.a.b.a.d.w a8 = a(nVar, l);
            if (a8 != null) {
                jVar = new j(gVar, l, a7, a8);
            } else {
                gVar.c();
                jVar = new j(gVar, l, a(nVar, l, a7), (com.flurry.a.b.a.d.w) null);
            }
            fVar.a(jVar);
        }
        if (nVar.a(com.flurry.a.b.a.d.o.USE_GETTERS_AS_SETTERS)) {
            for (com.flurry.a.b.a.d.h hVar2 : d) {
                if (hVar2.b()) {
                    String a9 = hVar2.a();
                    if (!fVar.b(a9) && !a2.contains(a9)) {
                        com.flurry.a.b.a.d.e.f f2 = hVar2.f();
                        Class d3 = f2.d();
                        if (Collection.class.isAssignableFrom(d3) || Map.class.isAssignableFrom(d3)) {
                            if (!a2.contains(a9) && !fVar.b(a9)) {
                                if (nVar.a(com.flurry.a.b.a.d.o.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                                    f2.l();
                                }
                                com.flurry.a.b.a.g.a a10 = f2.a(kVar.j());
                                new com.flurry.a.b.a.d.g(a9, a10, kVar.i(), f2);
                                com.flurry.a.b.a.d.w a11 = a(nVar, f2);
                                com.flurry.a.b.a.g.a a12 = a(nVar, f2, a10);
                                k qVar = new q(a9, a12, (ay) a12.o(), kVar.i(), f2);
                                if (a11 != null) {
                                    qVar = qVar.a(a11);
                                }
                                fVar.b(qVar);
                            }
                        }
                    }
                }
            }
        }
    }

    private k a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.e.k kVar, String str, com.flurry.a.b.a.d.e.f fVar) {
        if (nVar.a(com.flurry.a.b.a.d.o.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            com.flurry.a.b.a.d.i.l.a(fVar.j());
        }
        com.flurry.a.b.a.g.a a = kVar.j().a(fVar.a(0));
        com.flurry.a.b.a.d.g gVar = new com.flurry.a.b.a.d.g(str, a, kVar.i(), fVar);
        com.flurry.a.b.a.g.a a2 = a(nVar, a, fVar, gVar);
        if (a2 != a) {
            gVar.a(a2);
        }
        com.flurry.a.b.a.d.w a3 = a(nVar, fVar);
        com.flurry.a.b.a.g.a a4 = a(nVar, fVar, a2);
        k oVar = new o(str, a4, (ay) a4.o(), kVar.i(), fVar);
        if (a3 != null) {
            oVar = oVar.a(a3);
        }
        com.flurry.a.b.a.d.c a5 = nVar.a().a((com.flurry.a.b.a.d.e.e) fVar);
        if (a5 != null && a5.b()) {
            oVar.a(a5.a());
        }
        return oVar;
    }

    private k a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.e.k kVar, String str, com.flurry.a.b.a.d.e.d dVar) {
        if (nVar.a(com.flurry.a.b.a.d.o.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            com.flurry.a.b.a.d.i.l.a(dVar.j());
        }
        com.flurry.a.b.a.g.a a = kVar.j().a(dVar.c());
        com.flurry.a.b.a.d.g gVar = new com.flurry.a.b.a.d.g(str, a, kVar.i(), dVar);
        com.flurry.a.b.a.g.a a2 = a(nVar, a, dVar, gVar);
        if (a2 != a) {
            gVar.a(a2);
        }
        com.flurry.a.b.a.d.w a3 = a(nVar, dVar);
        com.flurry.a.b.a.g.a a4 = a(nVar, dVar, a2);
        k lVar = new l(str, a4, (ay) a4.o(), kVar.i(), dVar);
        if (a3 != null) {
            lVar = lVar.a(a3);
        }
        com.flurry.a.b.a.d.c a5 = nVar.a().a((com.flurry.a.b.a.d.e.e) dVar);
        if (a5 != null && a5.b()) {
            lVar.a(a5.a());
        }
        return lVar;
    }

    private static boolean a(com.flurry.a.b.a.d.n nVar, Class cls, Map map) {
        Boolean bool = (Boolean) map.get(cls);
        if (bool == null) {
            bool = nVar.a().e(((com.flurry.a.b.a.d.e.k) nVar.f(cls)).c());
            if (bool == null) {
                bool = Boolean.FALSE;
            }
        }
        return bool.booleanValue();
    }
}
