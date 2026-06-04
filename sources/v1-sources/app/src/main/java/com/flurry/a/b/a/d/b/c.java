package com.flurry.a.b.a.d.b;

import com.flurry.a.b.a.d.af;
import com.flurry.a.b.a.d.ay;
import com.flurry.a.b.a.d.b.b.ac;
import com.flurry.a.b.a.d.b.b.ad;
import com.flurry.a.b.a.d.b.b.ae;
import com.flurry.a.b.a.d.b.b.bv;
import com.flurry.a.b.a.d.b.b.by;
import com.flurry.a.b.a.d.b.b.y;
import com.flurry.a.b.a.d.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class c extends com.flurry.a.b.a.d.q {
    static final HashMap b = u.a();
    static final HashMap c = bv.a();
    static final HashMap d;
    static final HashMap e;
    protected static final HashMap f;
    protected com.flurry.a.b.a.d.d.a g = com.flurry.a.b.a.d.d.a.a;

    public abstract v a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.e.k kVar);

    protected abstract com.flurry.a.b.a.d.w a();

    protected abstract com.flurry.a.b.a.d.w b();

    public abstract com.flurry.a.b.a.g.a b(com.flurry.a.b.a.g.a aVar);

    protected abstract com.flurry.a.b.a.d.w c();

    protected abstract com.flurry.a.b.a.d.w d();

    protected abstract com.flurry.a.b.a.d.w e();

    protected abstract com.flurry.a.b.a.d.w f();

    protected abstract com.flurry.a.b.a.d.w g();

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put(Map.class.getName(), LinkedHashMap.class);
        d.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
        d.put(SortedMap.class.getName(), TreeMap.class);
        d.put("java.util.NavigableMap", TreeMap.class);
        try {
            d.put(Class.forName("java.util.ConcurrentNavigableMap").getName(), Class.forName("java.util.ConcurrentSkipListMap"));
        } catch (ClassNotFoundException e2) {
        }
        HashMap hashMap2 = new HashMap();
        e = hashMap2;
        hashMap2.put(Collection.class.getName(), ArrayList.class);
        e.put(List.class.getName(), ArrayList.class);
        e.put(Set.class.getName(), HashSet.class);
        e.put(SortedSet.class.getName(), TreeSet.class);
        e.put(Queue.class.getName(), LinkedList.class);
        e.put("java.util.Deque", LinkedList.class);
        e.put("java.util.NavigableSet", TreeSet.class);
        f = ae.a();
    }

    protected c() {
    }

    @Override // com.flurry.a.b.a.d.q
    public final com.flurry.a.b.a.d.w a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.s sVar, com.flurry.a.b.a.d.h.a aVar, com.flurry.a.b.a.d.f fVar) {
        com.flurry.a.b.a.g.a g = aVar.g();
        com.flurry.a.b.a.d.w wVar = (com.flurry.a.b.a.d.w) g.n();
        if (wVar == null) {
            com.flurry.a.b.a.d.w wVar2 = (com.flurry.a.b.a.d.w) f.get(g);
            if (wVar2 != null) {
                com.flurry.a.b.a.d.w a = a();
                return a != null ? a : wVar2;
            }
            if (g.t()) {
                throw new IllegalArgumentException("Internal error: primitive type (" + aVar + ") passed, no array deserializer found");
            }
        }
        ay ayVar = (ay) g.o();
        if (ayVar == null) {
            ayVar = b(nVar, g, fVar);
        }
        com.flurry.a.b.a.d.w a2 = a();
        if (a2 != null) {
            return a2;
        }
        if (wVar == null) {
            wVar = sVar.a(nVar, g, fVar);
        }
        return new ad(aVar, wVar, ayVar);
    }

    @Override // com.flurry.a.b.a.d.q
    public final com.flurry.a.b.a.d.w a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.s sVar, com.flurry.a.b.a.d.h.d dVar, com.flurry.a.b.a.d.f fVar) {
        com.flurry.a.b.a.d.h.d dVar2 = (com.flurry.a.b.a.d.h.d) b(dVar);
        Class p = dVar2.p();
        com.flurry.a.b.a.d.e.k kVar = (com.flurry.a.b.a.d.e.k) nVar.c(dVar2);
        com.flurry.a.b.a.d.w a = a(nVar, kVar.c());
        if (a != null) {
            return a;
        }
        com.flurry.a.b.a.d.h.d dVar3 = (com.flurry.a.b.a.d.h.d) a(nVar, kVar.c(), dVar2);
        com.flurry.a.b.a.g.a g = dVar3.g();
        com.flurry.a.b.a.d.w wVar = (com.flurry.a.b.a.d.w) g.n();
        ay ayVar = (ay) g.o();
        if (ayVar == null) {
            ayVar = b(nVar, g, fVar);
        }
        com.flurry.a.b.a.d.w b2 = b();
        if (b2 != null) {
            return b2;
        }
        if (wVar == null) {
            if (EnumSet.class.isAssignableFrom(p)) {
                return new com.flurry.a.b.a.d.b.b.m(g.p(), a(nVar, g));
            }
            wVar = sVar.a(nVar, g, fVar);
        }
        if (dVar3.s() || dVar3.c()) {
            Class cls = (Class) e.get(p.getName());
            if (cls == null) {
                throw new IllegalArgumentException("Can not find a deserializer for non-concrete Collection type " + dVar3);
            }
            dVar3 = (com.flurry.a.b.a.d.h.d) nVar.a(dVar3, cls);
            kVar = (com.flurry.a.b.a.d.e.k) nVar.c(dVar3);
        }
        v a2 = a(nVar, kVar);
        if (g.p() == String.class) {
            return new by(dVar3, wVar, a2);
        }
        return new com.flurry.a.b.a.d.b.b.g(dVar3, wVar, ayVar, a2);
    }

    @Override // com.flurry.a.b.a.d.q
    public final com.flurry.a.b.a.d.w a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.h.c cVar, com.flurry.a.b.a.d.f fVar) {
        com.flurry.a.b.a.d.h.c cVar2 = (com.flurry.a.b.a.d.h.c) b(cVar);
        com.flurry.a.b.a.d.e.k kVar = (com.flurry.a.b.a.d.e.k) nVar.f(cVar2.p());
        com.flurry.a.b.a.d.w a = a(nVar, kVar.c());
        if (a != null) {
            return a;
        }
        com.flurry.a.b.a.g.a g = ((com.flurry.a.b.a.d.h.c) a(nVar, kVar.c(), cVar2)).g();
        g.n();
        if (((ay) g.o()) == null) {
            b(nVar, g, fVar);
        }
        return c();
    }

    @Override // com.flurry.a.b.a.d.q
    public final com.flurry.a.b.a.d.w a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.s sVar, com.flurry.a.b.a.d.h.g gVar, com.flurry.a.b.a.d.f fVar) {
        com.flurry.a.b.a.d.e.k kVar;
        com.flurry.a.b.a.d.h.g gVar2;
        com.flurry.a.b.a.d.h.g gVar3 = (com.flurry.a.b.a.d.h.g) b(gVar);
        com.flurry.a.b.a.d.e.k kVar2 = (com.flurry.a.b.a.d.e.k) nVar.c(gVar3);
        com.flurry.a.b.a.d.w a = a(nVar, kVar2.c());
        if (a != null) {
            return a;
        }
        com.flurry.a.b.a.d.h.g gVar4 = (com.flurry.a.b.a.d.h.g) a(nVar, kVar2.c(), gVar3);
        com.flurry.a.b.a.g.a k = gVar4.k();
        com.flurry.a.b.a.g.a g = gVar4.g();
        com.flurry.a.b.a.d.w wVar = (com.flurry.a.b.a.d.w) g.n();
        com.flurry.a.b.a.d.ae aeVar = (com.flurry.a.b.a.d.ae) k.n();
        if (aeVar == null) {
            aeVar = sVar.b(nVar, k);
        }
        ay ayVar = (ay) g.o();
        ay b2 = ayVar == null ? b(nVar, g, fVar) : ayVar;
        com.flurry.a.b.a.d.w e2 = e();
        if (e2 != null) {
            return e2;
        }
        com.flurry.a.b.a.d.w a2 = wVar == null ? sVar.a(nVar, g, fVar) : wVar;
        Class p = gVar4.p();
        if (EnumMap.class.isAssignableFrom(p)) {
            Class p2 = k.p();
            if (p2 == null || !p2.isEnum()) {
                throw new IllegalArgumentException("Can not construct EnumMap; generic (key) type not available");
            }
            return new com.flurry.a.b.a.d.b.b.l(k.p(), a(nVar, k), a2);
        }
        if (gVar4.s() || gVar4.c()) {
            Class cls = (Class) d.get(p.getName());
            if (cls == null) {
                throw new IllegalArgumentException("Can not find a deserializer for non-concrete Map type " + gVar4);
            }
            com.flurry.a.b.a.d.h.g gVar5 = (com.flurry.a.b.a.d.h.g) nVar.a(gVar4, cls);
            kVar = (com.flurry.a.b.a.d.e.k) nVar.c(gVar5);
            gVar2 = gVar5;
        } else {
            kVar = kVar2;
            gVar2 = gVar4;
        }
        ac acVar = new ac(gVar2, a(nVar, kVar), aeVar, a2, b2);
        acVar.a(nVar.a().c(kVar.c()));
        return acVar;
    }

    @Override // com.flurry.a.b.a.d.q
    public final com.flurry.a.b.a.d.w a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.s sVar, com.flurry.a.b.a.d.h.f fVar, com.flurry.a.b.a.d.f fVar2) {
        com.flurry.a.b.a.d.h.f fVar3 = (com.flurry.a.b.a.d.h.f) b(fVar);
        com.flurry.a.b.a.d.e.k kVar = (com.flurry.a.b.a.d.e.k) nVar.c(fVar3);
        com.flurry.a.b.a.d.w a = a(nVar, kVar.c());
        if (a != null) {
            return a;
        }
        com.flurry.a.b.a.d.h.f fVar4 = (com.flurry.a.b.a.d.h.f) a(nVar, kVar.c(), fVar3);
        com.flurry.a.b.a.g.a k = fVar4.k();
        com.flurry.a.b.a.g.a g = fVar4.g();
        g.n();
        if (((com.flurry.a.b.a.d.ae) k.n()) == null) {
            sVar.b(nVar, k);
        }
        if (((ay) g.o()) == null) {
            b(nVar, g, fVar2);
        }
        return f();
    }

    @Override // com.flurry.a.b.a.d.q
    public final com.flurry.a.b.a.d.w a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar) {
        com.flurry.a.b.a.d.e.k kVar = (com.flurry.a.b.a.d.e.k) nVar.c(aVar);
        com.flurry.a.b.a.d.w a = a(nVar, kVar.c());
        if (a != null) {
            return a;
        }
        Class<?> p = aVar.p();
        com.flurry.a.b.a.d.w d2 = d();
        if (d2 != null) {
            return d2;
        }
        for (com.flurry.a.b.a.d.e.f fVar : kVar.o()) {
            if (nVar.a().p(fVar)) {
                if (fVar.f() == 1 && fVar.d().isAssignableFrom(p)) {
                    return com.flurry.a.b.a.d.b.b.j.a(nVar, p, fVar);
                }
                throw new IllegalArgumentException("Unsuitable method (" + fVar + ") decorated with @JsonCreator (for Enum type " + p.getName() + ")");
            }
        }
        return new com.flurry.a.b.a.d.b.b.j(a(p, nVar));
    }

    @Override // com.flurry.a.b.a.d.q
    public final com.flurry.a.b.a.d.w a(com.flurry.a.b.a.g.a aVar) {
        Class p = aVar.p();
        com.flurry.a.b.a.d.w g = g();
        return g != null ? g : y.a(p);
    }

    protected final com.flurry.a.b.a.d.w c(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f fVar) {
        com.flurry.a.b.a.g.a b2;
        Class p = aVar.p();
        com.flurry.a.b.a.d.w wVar = (com.flurry.a.b.a.d.w) b.get(new com.flurry.a.b.a.d.h.b(p));
        if (wVar == null) {
            if (AtomicReference.class.isAssignableFrom(p)) {
                com.flurry.a.b.a.g.a[] b3 = nVar.n().b(aVar, AtomicReference.class);
                if (b3 == null || b3.length <= 0) {
                    b2 = com.flurry.a.b.a.d.h.k.b();
                } else {
                    b2 = b3[0];
                }
                return new com.flurry.a.b.a.d.b.b.b(b2, fVar);
            }
            com.flurry.a.b.a.d.w b4 = this.g.b(aVar);
            if (b4 == null) {
                return null;
            }
            return b4;
        }
        return wVar;
    }

    @Override // com.flurry.a.b.a.d.q
    public final ay b(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f fVar) {
        Collection a;
        com.flurry.a.b.a.d.f.d dVar;
        com.flurry.a.b.a.g.a b2;
        com.flurry.a.b.a.d.e.b c2 = ((com.flurry.a.b.a.d.e.k) nVar.f(aVar.p())).c();
        com.flurry.a.b.a.d.b a2 = nVar.a();
        com.flurry.a.b.a.d.f.d a3 = a2.a(nVar, c2);
        if (a3 == null) {
            com.flurry.a.b.a.d.f.d l = nVar.l();
            if (l == null) {
                return null;
            }
            dVar = l;
            a = null;
        } else {
            a = nVar.m().a(c2, nVar, a2);
            dVar = a3;
        }
        if (dVar.a() == null && aVar.c() && (b2 = b(aVar)) != null && b2.p() != aVar.p()) {
            dVar = dVar.a(b2.p());
        }
        return dVar.a(nVar, aVar, a, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static com.flurry.a.b.a.d.w a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.e.a aVar) {
        Object j = nVar.a().j(aVar);
        if (j != null) {
            if (j instanceof com.flurry.a.b.a.d.w) {
                com.flurry.a.b.a.d.w wVar = (com.flurry.a.b.a.d.w) j;
                return wVar instanceof com.flurry.a.b.a.d.k ? ((com.flurry.a.b.a.d.k) wVar).a() : wVar;
            }
            if (!(j instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned deserializer definition of type " + j.getClass().getName() + "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
            }
            Class cls = (Class) j;
            if (!com.flurry.a.b.a.d.w.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonDeserializer>");
            }
            com.flurry.a.b.a.d.w b2 = nVar.b(cls);
            return b2 instanceof com.flurry.a.b.a.d.k ? ((com.flurry.a.b.a.d.k) b2).a() : b2;
        }
        return null;
    }

    protected static com.flurry.a.b.a.g.a a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.e.a aVar, com.flurry.a.b.a.g.a aVar2) {
        com.flurry.a.b.a.g.a f2;
        Class l;
        Class k;
        com.flurry.a.b.a.d.b a = nVar.a();
        Class m = a.m(aVar);
        if (m != null) {
            try {
                f2 = aVar2.f(m);
            } catch (IllegalArgumentException e2) {
                throw new com.flurry.a.b.a.d.y("Failed to narrow type " + aVar2 + " with concrete-type annotation (value " + m.getName() + "), method '" + aVar.b() + "': " + e2.getMessage(), null, e2);
            }
        } else {
            f2 = aVar2;
        }
        if (f2.f()) {
            f2.k();
            Class n = a.n(aVar);
            if (n != null) {
                if (!(f2 instanceof com.flurry.a.b.a.d.h.f)) {
                    throw new com.flurry.a.b.a.d.y("Illegal key-type annotation: type " + f2 + " is not a Map(-like) type");
                }
                try {
                    f2 = ((com.flurry.a.b.a.d.h.f) f2).d(n);
                } catch (IllegalArgumentException e3) {
                    throw new com.flurry.a.b.a.d.y("Failed to narrow key type " + f2 + " with key-type annotation (" + n.getName() + "): " + e3.getMessage(), null, e3);
                }
            }
            com.flurry.a.b.a.g.a k2 = f2.k();
            if (k2 != null && k2.n() == null && (k = a.k(aVar)) != null && k != af.class) {
                k2.g(nVar.c(k));
            }
            f2.g();
            Class o = a.o(aVar);
            if (o != null) {
                try {
                    f2 = f2.b(o);
                } catch (IllegalArgumentException e4) {
                    throw new com.flurry.a.b.a.d.y("Failed to narrow content type " + f2 + " with content-type annotation (" + o.getName() + "): " + e4.getMessage(), null, e4);
                }
            }
            if (f2.g().n() == null && (l = a.l(aVar)) != null && l != x.class) {
                f2.g().g(nVar.b(l));
            }
        }
        return f2;
    }

    protected final com.flurry.a.b.a.g.a a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.e.e eVar, com.flurry.a.b.a.d.f fVar) {
        ay b2;
        Class k;
        if (aVar.f()) {
            com.flurry.a.b.a.d.b a = nVar.a();
            com.flurry.a.b.a.g.a k2 = aVar.k();
            if (k2 != null && (k = a.k(eVar)) != null && k != af.class) {
                k2.g(nVar.c(k));
            }
            Class l = a.l(eVar);
            if (l != null && l != x.class) {
                aVar.g().g(nVar.b(l));
            }
            if (eVar instanceof com.flurry.a.b.a.d.e.e) {
                com.flurry.a.b.a.d.b a2 = nVar.a();
                com.flurry.a.b.a.d.f.d b3 = a2.b(nVar, eVar, aVar);
                com.flurry.a.b.a.g.a g = aVar.g();
                ay b4 = b3 == null ? b(nVar, g, fVar) : b3.a(nVar, g, nVar.m().a(eVar, nVar, a2), fVar);
                if (b4 != null) {
                    aVar = aVar.b(b4);
                }
            }
        }
        if (eVar instanceof com.flurry.a.b.a.d.e.e) {
            com.flurry.a.b.a.d.b a3 = nVar.a();
            com.flurry.a.b.a.d.f.d a4 = a3.a(nVar, eVar, aVar);
            b2 = a4 == null ? b(nVar, aVar, fVar) : a4.a(nVar, aVar, nVar.m().a(eVar, nVar, a3), fVar);
        } else {
            b2 = b(nVar, aVar, null);
        }
        if (b2 != null) {
            return aVar.c(b2);
        }
        return aVar;
    }

    protected static com.flurry.a.b.a.d.i.p a(Class cls, com.flurry.a.b.a.d.n nVar) {
        return nVar.a(com.flurry.a.b.a.d.o.READ_ENUMS_USING_TO_STRING) ? com.flurry.a.b.a.d.i.p.a(cls) : com.flurry.a.b.a.d.i.p.a(cls, nVar.a());
    }
}
