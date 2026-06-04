package com.flurry.a.b.a.d.g;

import com.flurry.a.b.a.d.as;
import com.flurry.a.b.a.d.at;
import com.flurry.a.b.a.d.au;
import com.flurry.a.b.a.d.ax;
import com.flurry.a.b.a.d.az;
import com.flurry.a.b.a.d.g.b.ag;
import com.flurry.a.b.a.d.g.b.ah;
import com.flurry.a.b.a.d.g.b.aj;
import com.flurry.a.b.a.d.g.b.ak;
import com.flurry.a.b.a.d.g.b.al;
import com.flurry.a.b.a.d.g.b.ay;
import com.flurry.a.b.a.d.g.b.ba;
import com.flurry.a.b.a.d.g.b.bb;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.TimeZone;

/* loaded from: classes.dex */
public abstract class b extends au {
    protected static final HashMap a = new HashMap();
    protected static final HashMap b = new HashMap();
    protected static final HashMap c;
    protected com.flurry.a.b.a.d.d.a d = com.flurry.a.b.a.d.d.a.a;

    protected abstract Iterable a();

    static {
        a.put(String.class.getName(), new ay());
        ba baVar = ba.a;
        a.put(StringBuffer.class.getName(), baVar);
        a.put(StringBuilder.class.getName(), baVar);
        a.put(Character.class.getName(), baVar);
        a.put(Character.TYPE.getName(), baVar);
        a.put(Boolean.TYPE.getName(), new x(true));
        a.put(Boolean.class.getName(), new x(false));
        ab abVar = new ab();
        a.put(Integer.class.getName(), abVar);
        a.put(Integer.TYPE.getName(), abVar);
        a.put(Long.class.getName(), ac.a);
        a.put(Long.TYPE.getName(), ac.a);
        a.put(Byte.class.getName(), aa.a);
        a.put(Byte.TYPE.getName(), aa.a);
        a.put(Short.class.getName(), aa.a);
        a.put(Short.TYPE.getName(), aa.a);
        a.put(Float.class.getName(), z.a);
        a.put(Float.TYPE.getName(), z.a);
        a.put(Double.class.getName(), y.a);
        a.put(Double.TYPE.getName(), y.a);
        ad adVar = new ad();
        a.put(BigInteger.class.getName(), adVar);
        a.put(BigDecimal.class.getName(), adVar);
        a.put(Calendar.class.getName(), com.flurry.a.b.a.d.g.b.c.a);
        com.flurry.a.b.a.d.g.b.f fVar = com.flurry.a.b.a.d.g.b.f.a;
        a.put(Date.class.getName(), fVar);
        a.put(Timestamp.class.getName(), fVar);
        a.put(java.sql.Date.class.getName(), new ae());
        a.put(Time.class.getName(), new af());
        for (Map.Entry entry : new al().a()) {
            Object value = entry.getValue();
            if (value instanceof com.flurry.a.b.a.d.ac) {
                a.put(((Class) entry.getKey()).getName(), (com.flurry.a.b.a.d.ac) value);
            } else if (value instanceof Class) {
                b.put(((Class) entry.getKey()).getName(), (Class) value);
            } else {
                throw new IllegalStateException("Internal error: unrecognized value of type " + entry.getClass().getName());
            }
        }
        b.put(com.flurry.a.b.a.h.m.class.getName(), bb.class);
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put(boolean[].class.getName(), new com.flurry.a.b.a.d.g.b.z());
        c.put(byte[].class.getName(), new com.flurry.a.b.a.d.g.b.aa());
        c.put(char[].class.getName(), new com.flurry.a.b.a.d.g.b.ab());
        c.put(short[].class.getName(), new ag());
        c.put(int[].class.getName(), new com.flurry.a.b.a.d.g.b.ae());
        c.put(long[].class.getName(), new com.flurry.a.b.a.d.g.b.af());
        c.put(float[].class.getName(), new com.flurry.a.b.a.d.g.b.ad());
        c.put(double[].class.getName(), new com.flurry.a.b.a.d.g.b.ac());
    }

    protected b() {
    }

    @Override // com.flurry.a.b.a.d.au
    public final az b(as asVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f fVar) {
        Collection a2;
        com.flurry.a.b.a.d.e.b c2 = ((com.flurry.a.b.a.d.e.k) asVar.f(aVar.p())).c();
        com.flurry.a.b.a.d.b a3 = asVar.a();
        com.flurry.a.b.a.d.f.d a4 = a3.a(asVar, c2);
        if (a4 == null) {
            a4 = asVar.l();
            a2 = null;
        } else {
            a2 = asVar.m().a(c2, asVar, a3);
        }
        if (a4 == null) {
            return null;
        }
        return a4.a(asVar, aVar, a2, fVar);
    }

    public static com.flurry.a.b.a.d.ac a(com.flurry.a.b.a.g.a aVar) {
        String name = aVar.p().getName();
        com.flurry.a.b.a.d.ac acVar = (com.flurry.a.b.a.d.ac) a.get(name);
        if (acVar == null) {
            Class cls = (Class) b.get(name);
            if (cls != null) {
                try {
                    return (com.flurry.a.b.a.d.ac) cls.newInstance();
                } catch (Exception e) {
                    throw new IllegalStateException("Failed to instantiate standard serializer (of type " + cls.getName() + "): " + e.getMessage(), e);
                }
            }
            return null;
        }
        return acVar;
    }

    public final com.flurry.a.b.a.d.ac a(com.flurry.a.b.a.g.a aVar, as asVar, com.flurry.a.b.a.d.e.k kVar, com.flurry.a.b.a.d.f fVar) {
        Class p = aVar.p();
        if (com.flurry.a.b.a.d.aa.class.isAssignableFrom(p)) {
            if (com.flurry.a.b.a.d.ab.class.isAssignableFrom(p)) {
                return com.flurry.a.b.a.d.g.b.u.a;
            }
            return com.flurry.a.b.a.d.g.b.t.a;
        }
        com.flurry.a.b.a.d.e.f e = kVar.e();
        if (e != null) {
            Method e2 = e.e();
            if (asVar.a(at.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                com.flurry.a.b.a.d.i.l.a((Member) e2);
            }
            return new com.flurry.a.b.a.d.g.b.m(e2, a(asVar, e), fVar);
        }
        if (InetAddress.class.isAssignableFrom(p)) {
            return com.flurry.a.b.a.d.g.b.k.a;
        }
        if (TimeZone.class.isAssignableFrom(p)) {
            return com.flurry.a.b.a.d.g.b.az.a;
        }
        if (Charset.class.isAssignableFrom(p)) {
            return ba.a;
        }
        com.flurry.a.b.a.d.ac a2 = this.d.a(aVar);
        if (a2 == null) {
            if (Number.class.isAssignableFrom(p)) {
                return ad.a;
            }
            if (Enum.class.isAssignableFrom(p)) {
                return com.flurry.a.b.a.d.g.b.h.a(p, asVar);
            }
            if (Calendar.class.isAssignableFrom(p)) {
                return com.flurry.a.b.a.d.g.b.c.a;
            }
            if (Date.class.isAssignableFrom(p)) {
                return com.flurry.a.b.a.d.g.b.f.a;
            }
            return null;
        }
        return a2;
    }

    public final com.flurry.a.b.a.d.ac a(as asVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.e.k kVar, com.flurry.a.b.a.d.f fVar) {
        Class p = aVar.p();
        if (Iterator.class.isAssignableFrom(p)) {
            com.flurry.a.b.a.g.a b2 = aVar.b(0);
            if (b2 == null) {
                b2 = com.flurry.a.b.a.d.h.k.b();
            }
            az b3 = b(asVar, b2, fVar);
            return new ak(b2, a(asVar, kVar, b3, fVar), b3, fVar);
        }
        if (Iterable.class.isAssignableFrom(p)) {
            com.flurry.a.b.a.g.a b4 = aVar.b(0);
            if (b4 == null) {
                b4 = com.flurry.a.b.a.d.h.k.b();
            }
            az b5 = b(asVar, b4, fVar);
            return new com.flurry.a.b.a.d.g.b.l(b4, a(asVar, kVar, b5, fVar), b5, fVar);
        }
        if (CharSequence.class.isAssignableFrom(p)) {
            return ba.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static com.flurry.a.b.a.d.ac a(as asVar, com.flurry.a.b.a.d.e.a aVar) {
        Object b2 = asVar.a().b(aVar);
        if (b2 == null) {
            return null;
        }
        if (b2 instanceof com.flurry.a.b.a.d.ac) {
            com.flurry.a.b.a.d.ac acVar = (com.flurry.a.b.a.d.ac) b2;
            if (acVar instanceof com.flurry.a.b.a.d.m) {
                return ((com.flurry.a.b.a.d.m) acVar).a();
            }
            return acVar;
        }
        if (!(b2 instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned value of type " + b2.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
        }
        Class cls = (Class) b2;
        if (!com.flurry.a.b.a.d.ac.class.isAssignableFrom(cls)) {
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
        }
        com.flurry.a.b.a.d.ac b3 = asVar.b(cls);
        if (b3 instanceof com.flurry.a.b.a.d.m) {
            return ((com.flurry.a.b.a.d.m) b3).a();
        }
        return b3;
    }

    public final com.flurry.a.b.a.d.ac a(as asVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.e.k kVar, com.flurry.a.b.a.d.f fVar, boolean z) {
        boolean a2;
        az b2 = b(asVar, aVar.g(), fVar);
        if (b2 != null) {
            a2 = false;
        } else {
            a2 = !z ? a(asVar, kVar, b2, fVar) : z;
        }
        com.flurry.a.b.a.d.e.b c2 = kVar.c();
        com.flurry.a.b.a.d.b a3 = asVar.a();
        Class d = a3.d((com.flurry.a.b.a.d.e.a) c2);
        if ((d == null || d == com.flurry.a.b.a.d.ad.class) && fVar != null) {
            d = a3.d((com.flurry.a.b.a.d.e.a) fVar.b());
        }
        com.flurry.a.b.a.d.ac b3 = (d == null || d == com.flurry.a.b.a.d.ad.class) ? null : asVar.b(d);
        if (aVar.j()) {
            com.flurry.a.b.a.d.h.f fVar2 = (com.flurry.a.b.a.d.h.f) aVar;
            com.flurry.a.b.a.d.e.b c3 = kVar.c();
            com.flurry.a.b.a.d.b a4 = asVar.a();
            Class c4 = a4.c((com.flurry.a.b.a.d.e.a) c3);
            if ((c4 == null || c4 == com.flurry.a.b.a.d.ad.class) && fVar != null) {
                c4 = a4.c((com.flurry.a.b.a.d.e.a) fVar.b());
            }
            com.flurry.a.b.a.d.ac b4 = (c4 == null || c4 == com.flurry.a.b.a.d.ad.class) ? null : asVar.b(c4);
            if (fVar2.l()) {
                com.flurry.a.b.a.d.h.g gVar = (com.flurry.a.b.a.d.h.g) fVar2;
                Iterator it = a().iterator();
                while (it.hasNext()) {
                    com.flurry.a.b.a.d.ac d2 = ((ax) it.next()).d();
                    if (d2 != null) {
                        return d2;
                    }
                }
                if (!EnumMap.class.isAssignableFrom(gVar.p())) {
                    return com.flurry.a.b.a.d.g.b.n.a(asVar.a().c(kVar.c()), gVar, a2, b2, fVar, b4, b3);
                }
                com.flurry.a.b.a.g.a k = gVar.k();
                return new com.flurry.a.b.a.d.g.b.g(gVar.g(), a2, k.r() ? com.flurry.a.b.a.d.i.q.a(k.p(), asVar.a()) : null, b2, fVar, b3);
            }
            Iterator it2 = a().iterator();
            while (it2.hasNext()) {
                com.flurry.a.b.a.d.ac e = ((ax) it2.next()).e();
                if (e != null) {
                    return e;
                }
            }
            return null;
        }
        if (aVar.i()) {
            com.flurry.a.b.a.d.h.c cVar = (com.flurry.a.b.a.d.h.c) aVar;
            if (cVar.f_()) {
                com.flurry.a.b.a.d.h.d dVar = (com.flurry.a.b.a.d.h.d) cVar;
                Iterator it3 = a().iterator();
                while (it3.hasNext()) {
                    com.flurry.a.b.a.d.ac b5 = ((ax) it3.next()).b();
                    if (b5 != null) {
                        return b5;
                    }
                }
                Class p = dVar.p();
                if (!EnumSet.class.isAssignableFrom(p)) {
                    Class p2 = dVar.g().p();
                    return RandomAccess.class.isAssignableFrom(p) ? p2 == String.class ? new com.flurry.a.b.a.d.g.b.j(fVar) : new aj(dVar.g(), a2, b2, fVar, b3) : p2 == String.class ? new com.flurry.a.b.a.d.g.b.ax(fVar) : new com.flurry.a.b.a.d.g.b.d(dVar.g(), a2, b2, fVar, b3);
                }
                com.flurry.a.b.a.g.a g = dVar.g();
                if (!g.r()) {
                    g = null;
                }
                return new com.flurry.a.b.a.d.g.b.i(g, fVar);
            }
            Iterator it4 = a().iterator();
            while (it4.hasNext()) {
                com.flurry.a.b.a.d.ac c5 = ((ax) it4.next()).c();
                if (c5 != null) {
                    return c5;
                }
            }
            return null;
        }
        if (aVar.b()) {
            com.flurry.a.b.a.d.h.a aVar2 = (com.flurry.a.b.a.d.h.a) aVar;
            Class p3 = aVar2.p();
            if (String[].class == p3) {
                return new ah(fVar);
            }
            com.flurry.a.b.a.d.ac acVar = (com.flurry.a.b.a.d.ac) c.get(p3.getName());
            return acVar != null ? acVar : new com.flurry.a.b.a.d.g.b.q(aVar2.g(), a2, b2, fVar, b3);
        }
        return null;
    }

    protected static com.flurry.a.b.a.g.a a(as asVar, com.flurry.a.b.a.d.e.a aVar, com.flurry.a.b.a.g.a aVar2) {
        Class e = asVar.a().e(aVar);
        if (e != null) {
            try {
                aVar2 = aVar2.h(e);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("Failed to widen type " + aVar2 + " with concrete-type annotation (value " + e.getName() + "), method '" + aVar.b() + "': " + e2.getMessage());
            }
        }
        return b(asVar, aVar, aVar2);
    }

    protected static com.flurry.a.b.a.g.a b(as asVar, com.flurry.a.b.a.d.e.a aVar, com.flurry.a.b.a.g.a aVar2) {
        com.flurry.a.b.a.d.b a2 = asVar.a();
        if (aVar2.f()) {
            aVar2.k();
            Class f = a2.f(aVar);
            if (f != null) {
                if (!(aVar2 instanceof com.flurry.a.b.a.d.h.g)) {
                    throw new IllegalArgumentException("Illegal key-type annotation: type " + aVar2 + " is not a Map type");
                }
                try {
                    aVar2 = ((com.flurry.a.b.a.d.h.g) aVar2).e(f);
                } catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException("Failed to narrow key type " + aVar2 + " with key-type annotation (" + f.getName() + "): " + e.getMessage());
                }
            }
            aVar2.g();
            Class g = a2.g(aVar);
            if (g != null) {
                try {
                    return aVar2.c(g);
                } catch (IllegalArgumentException e2) {
                    throw new IllegalArgumentException("Failed to narrow content type " + aVar2 + " with content-type annotation (" + g.getName() + "): " + e2.getMessage());
                }
            }
            return aVar2;
        }
        return aVar2;
    }

    protected static boolean a(as asVar, com.flurry.a.b.a.d.e.k kVar, az azVar, com.flurry.a.b.a.d.f fVar) {
        if (azVar != null) {
            return false;
        }
        com.flurry.a.b.a.d.b a2 = asVar.a();
        com.flurry.a.b.a.d.a.i h = a2.h((com.flurry.a.b.a.d.e.a) kVar.c());
        if (h != null) {
            if (h == com.flurry.a.b.a.d.a.i.STATIC) {
                return true;
            }
        } else if (asVar.a(at.USE_STATIC_TYPING)) {
            return true;
        }
        if (fVar == null) {
            return false;
        }
        com.flurry.a.b.a.g.a a3 = fVar.a();
        if (!a3.f()) {
            return false;
        }
        com.flurry.a.b.a.d.e.e b2 = fVar.b();
        fVar.a();
        if (a2.g(b2) != null) {
            return true;
        }
        if (!(a3 instanceof com.flurry.a.b.a.d.h.g)) {
            return false;
        }
        com.flurry.a.b.a.d.e.e b3 = fVar.b();
        fVar.a();
        return a2.f(b3) != null;
    }
}
