package com.flurry.a.b.a.d.e;

import com.flurry.a.b.a.a.aa;
import com.flurry.a.b.a.a.ab;
import com.flurry.a.b.a.a.z;
import com.flurry.a.b.a.d.ad;
import com.flurry.a.b.a.d.af;
import com.flurry.a.b.a.d.ah;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class q extends com.flurry.a.b.a.d.b {
    @Override // com.flurry.a.b.a.d.b
    public final /* synthetic */ Object j(a aVar) {
        Class a;
        com.flurry.a.b.a.d.a.d dVar = (com.flurry.a.b.a.d.a.d) aVar.a(com.flurry.a.b.a.d.a.d.class);
        if (dVar == null || (a = dVar.a()) == com.flurry.a.b.a.d.x.class) {
            return null;
        }
        return a;
    }

    @Override // com.flurry.a.b.a.d.b
    public final boolean a(Annotation annotation) {
        return annotation.annotationType().getAnnotation(com.flurry.a.b.a.a.a.class) != null;
    }

    @Override // com.flurry.a.b.a.d.b
    public final String a(Enum r2) {
        return r2.name();
    }

    @Override // com.flurry.a.b.a.d.b
    public final Boolean a(b bVar) {
        com.flurry.a.b.a.d.a.c cVar = (com.flurry.a.b.a.d.a.c) bVar.a(com.flurry.a.b.a.d.a.c.class);
        if (cVar == null) {
            return null;
        }
        return cVar.a() ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // com.flurry.a.b.a.d.b
    public final String b(b bVar) {
        com.flurry.a.b.a.d.a.f fVar = (com.flurry.a.b.a.d.a.f) bVar.a(com.flurry.a.b.a.d.a.f.class);
        if (fVar == null) {
            return null;
        }
        return fVar.a();
    }

    @Override // com.flurry.a.b.a.d.b
    public final String[] c(b bVar) {
        com.flurry.a.b.a.a.k kVar = (com.flurry.a.b.a.a.k) bVar.a(com.flurry.a.b.a.a.k.class);
        if (kVar == null) {
            return null;
        }
        return kVar.a();
    }

    @Override // com.flurry.a.b.a.d.b
    public final Boolean d(b bVar) {
        com.flurry.a.b.a.a.k kVar = (com.flurry.a.b.a.a.k) bVar.a(com.flurry.a.b.a.a.k.class);
        if (kVar == null) {
            return null;
        }
        return Boolean.valueOf(kVar.b());
    }

    @Override // com.flurry.a.b.a.d.b
    public final Boolean e(b bVar) {
        com.flurry.a.b.a.a.l lVar = (com.flurry.a.b.a.a.l) bVar.a(com.flurry.a.b.a.a.l.class);
        if (lVar == null) {
            return null;
        }
        return Boolean.valueOf(lVar.a());
    }

    @Override // com.flurry.a.b.a.d.b
    public final Object f(b bVar) {
        com.flurry.a.b.a.d.a.e eVar = (com.flurry.a.b.a.d.a.e) bVar.a(com.flurry.a.b.a.d.a.e.class);
        if (eVar != null) {
            String a = eVar.a();
            if (a.length() > 0) {
                return a;
            }
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.b
    public final x a(b bVar, x xVar) {
        com.flurry.a.b.a.a.d dVar = (com.flurry.a.b.a.a.d) bVar.a(com.flurry.a.b.a.a.d.class);
        return dVar == null ? xVar : xVar.a(dVar);
    }

    @Override // com.flurry.a.b.a.d.b
    public final com.flurry.a.b.a.d.c a(e eVar) {
        com.flurry.a.b.a.a.m mVar = (com.flurry.a.b.a.a.m) eVar.a(com.flurry.a.b.a.a.m.class);
        if (mVar != null) {
            return new com.flurry.a.b.a.d.c(com.flurry.a.b.a.d.d.MANAGED_REFERENCE, mVar.a());
        }
        com.flurry.a.b.a.a.g gVar = (com.flurry.a.b.a.a.g) eVar.a(com.flurry.a.b.a.a.g.class);
        if (gVar != null) {
            return new com.flurry.a.b.a.d.c(com.flurry.a.b.a.d.d.BACK_REFERENCE, gVar.a());
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.b
    public final Boolean b(e eVar) {
        z zVar = (z) eVar.a(z.class);
        if (zVar == null || !zVar.a()) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // com.flurry.a.b.a.d.b
    public final boolean c(e eVar) {
        return q(eVar);
    }

    @Override // com.flurry.a.b.a.d.b
    public final Object d(e eVar) {
        com.flurry.a.b.a.d.a.a aVar = (com.flurry.a.b.a.d.a.a) eVar.a(com.flurry.a.b.a.d.a.a.class);
        if (aVar == null) {
            return null;
        }
        String a = aVar.a();
        if (a.length() == 0) {
            if (!(eVar instanceof f)) {
                return eVar.d().getName();
            }
            f fVar = (f) eVar;
            if (fVar.f() == 0) {
                return eVar.d().getName();
            }
            return fVar.g().getName();
        }
        return a;
    }

    @Override // com.flurry.a.b.a.d.b
    public final com.flurry.a.b.a.d.f.d a(ah ahVar, b bVar) {
        return a(ahVar, (a) bVar);
    }

    @Override // com.flurry.a.b.a.d.b
    public final com.flurry.a.b.a.d.f.d a(ah ahVar, e eVar, com.flurry.a.b.a.g.a aVar) {
        if (aVar.f()) {
            return null;
        }
        return a(ahVar, eVar);
    }

    @Override // com.flurry.a.b.a.d.b
    public final com.flurry.a.b.a.d.f.d b(ah ahVar, e eVar, com.flurry.a.b.a.g.a aVar) {
        if (!aVar.f()) {
            throw new IllegalArgumentException("Must call method with a container type (got " + aVar + ")");
        }
        return a(ahVar, eVar);
    }

    @Override // com.flurry.a.b.a.d.b
    public final List a(a aVar) {
        com.flurry.a.b.a.a.s sVar = (com.flurry.a.b.a.a.s) aVar.a(com.flurry.a.b.a.a.s.class);
        if (sVar == null) {
            return null;
        }
        com.flurry.a.b.a.a.t[] a = sVar.a();
        ArrayList arrayList = new ArrayList(a.length);
        for (com.flurry.a.b.a.a.t tVar : a) {
            arrayList.add(new com.flurry.a.b.a.d.f.a(tVar.a(), tVar.b()));
        }
        return arrayList;
    }

    @Override // com.flurry.a.b.a.d.b
    public final String g(b bVar) {
        com.flurry.a.b.a.a.y yVar = (com.flurry.a.b.a.a.y) bVar.a(com.flurry.a.b.a.a.y.class);
        if (yVar == null) {
            return null;
        }
        return yVar.a();
    }

    @Override // com.flurry.a.b.a.d.b
    public final boolean a(f fVar) {
        return q(fVar);
    }

    @Override // com.flurry.a.b.a.d.b
    public final boolean a(c cVar) {
        return q(cVar);
    }

    @Override // com.flurry.a.b.a.d.b
    public final boolean a(d dVar) {
        return q(dVar);
    }

    @Override // com.flurry.a.b.a.d.b
    public final Object b(a aVar) {
        Class a;
        com.flurry.a.b.a.d.a.g gVar = (com.flurry.a.b.a.d.a.g) aVar.a(com.flurry.a.b.a.d.a.g.class);
        if (gVar == null || (a = gVar.a()) == ad.class) {
            com.flurry.a.b.a.a.q qVar = (com.flurry.a.b.a.a.q) aVar.a(com.flurry.a.b.a.a.q.class);
            if (qVar != null && qVar.a()) {
                return new com.flurry.a.b.a.d.g.b.r(aVar.d());
            }
            return null;
        }
        return a;
    }

    @Override // com.flurry.a.b.a.d.b
    public final Class c(a aVar) {
        Class c;
        com.flurry.a.b.a.d.a.g gVar = (com.flurry.a.b.a.d.a.g) aVar.a(com.flurry.a.b.a.d.a.g.class);
        if (gVar == null || (c = gVar.c()) == ad.class) {
            return null;
        }
        return c;
    }

    @Override // com.flurry.a.b.a.d.b
    public final Class d(a aVar) {
        Class b;
        com.flurry.a.b.a.d.a.g gVar = (com.flurry.a.b.a.d.a.g) aVar.a(com.flurry.a.b.a.d.a.g.class);
        if (gVar == null || (b = gVar.b()) == ad.class) {
            return null;
        }
        return b;
    }

    @Override // com.flurry.a.b.a.d.b
    public final com.flurry.a.b.a.d.a.h a(a aVar, com.flurry.a.b.a.d.a.h hVar) {
        com.flurry.a.b.a.d.a.g gVar = (com.flurry.a.b.a.d.a.g) aVar.a(com.flurry.a.b.a.d.a.g.class);
        if (gVar != null) {
            return gVar.h();
        }
        ab abVar = (ab) aVar.a(ab.class);
        if (abVar != null) {
            return abVar.a() ? com.flurry.a.b.a.d.a.h.ALWAYS : com.flurry.a.b.a.d.a.h.NON_NULL;
        }
        return hVar;
    }

    @Override // com.flurry.a.b.a.d.b
    public final Class e(a aVar) {
        Class d;
        com.flurry.a.b.a.d.a.g gVar = (com.flurry.a.b.a.d.a.g) aVar.a(com.flurry.a.b.a.d.a.g.class);
        if (gVar == null || (d = gVar.d()) == com.flurry.a.b.a.d.a.n.class) {
            return null;
        }
        return d;
    }

    @Override // com.flurry.a.b.a.d.b
    public final Class f(a aVar) {
        Class e;
        com.flurry.a.b.a.d.a.g gVar = (com.flurry.a.b.a.d.a.g) aVar.a(com.flurry.a.b.a.d.a.g.class);
        if (gVar == null || (e = gVar.e()) == com.flurry.a.b.a.d.a.n.class) {
            return null;
        }
        return e;
    }

    @Override // com.flurry.a.b.a.d.b
    public final Class g(a aVar) {
        Class f;
        com.flurry.a.b.a.d.a.g gVar = (com.flurry.a.b.a.d.a.g) aVar.a(com.flurry.a.b.a.d.a.g.class);
        if (gVar == null || (f = gVar.f()) == com.flurry.a.b.a.d.a.n.class) {
            return null;
        }
        return f;
    }

    @Override // com.flurry.a.b.a.d.b
    public final com.flurry.a.b.a.d.a.i h(a aVar) {
        com.flurry.a.b.a.d.a.g gVar = (com.flurry.a.b.a.d.a.g) aVar.a(com.flurry.a.b.a.d.a.g.class);
        if (gVar == null) {
            return null;
        }
        return gVar.g();
    }

    @Override // com.flurry.a.b.a.d.b
    public final Class[] i(a aVar) {
        com.flurry.a.b.a.d.a.m mVar = (com.flurry.a.b.a.d.a.m) aVar.a(com.flurry.a.b.a.d.a.m.class);
        if (mVar == null) {
            return null;
        }
        return mVar.a();
    }

    @Override // com.flurry.a.b.a.d.b
    public final String[] h(b bVar) {
        com.flurry.a.b.a.a.p pVar = (com.flurry.a.b.a.a.p) bVar.a(com.flurry.a.b.a.a.p.class);
        if (pVar == null) {
            return null;
        }
        return pVar.a();
    }

    @Override // com.flurry.a.b.a.d.b
    public final Boolean i(b bVar) {
        com.flurry.a.b.a.a.p pVar = (com.flurry.a.b.a.a.p) bVar.a(com.flurry.a.b.a.a.p.class);
        if (pVar == null) {
            return null;
        }
        return Boolean.valueOf(pVar.b());
    }

    @Override // com.flurry.a.b.a.d.b
    public final String b(f fVar) {
        com.flurry.a.b.a.a.o oVar = (com.flurry.a.b.a.a.o) fVar.a(com.flurry.a.b.a.a.o.class);
        if (oVar != null) {
            return oVar.a();
        }
        com.flurry.a.b.a.a.i iVar = (com.flurry.a.b.a.a.i) fVar.a(com.flurry.a.b.a.a.i.class);
        if (iVar != null) {
            return iVar.a();
        }
        if (fVar.b(com.flurry.a.b.a.d.a.g.class) || fVar.b(com.flurry.a.b.a.d.a.m.class)) {
            return "";
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.b
    public final boolean c(f fVar) {
        aa aaVar = (aa) fVar.a(aa.class);
        return aaVar != null && aaVar.a();
    }

    @Override // com.flurry.a.b.a.d.b
    public final String b(d dVar) {
        com.flurry.a.b.a.a.o oVar = (com.flurry.a.b.a.a.o) dVar.a(com.flurry.a.b.a.a.o.class);
        if (oVar != null) {
            return oVar.a();
        }
        if (dVar.b(com.flurry.a.b.a.d.a.g.class) || dVar.b(com.flurry.a.b.a.d.a.m.class)) {
            return "";
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.b
    public final Class k(a aVar) {
        Class c;
        com.flurry.a.b.a.d.a.d dVar = (com.flurry.a.b.a.d.a.d) aVar.a(com.flurry.a.b.a.d.a.d.class);
        if (dVar == null || (c = dVar.c()) == af.class) {
            return null;
        }
        return c;
    }

    @Override // com.flurry.a.b.a.d.b
    public final Class l(a aVar) {
        Class b;
        com.flurry.a.b.a.d.a.d dVar = (com.flurry.a.b.a.d.a.d) aVar.a(com.flurry.a.b.a.d.a.d.class);
        if (dVar == null || (b = dVar.b()) == com.flurry.a.b.a.d.x.class) {
            return null;
        }
        return b;
    }

    @Override // com.flurry.a.b.a.d.b
    public final Class m(a aVar) {
        Class d;
        com.flurry.a.b.a.d.a.d dVar = (com.flurry.a.b.a.d.a.d) aVar.a(com.flurry.a.b.a.d.a.d.class);
        if (dVar == null || (d = dVar.d()) == com.flurry.a.b.a.d.a.n.class) {
            return null;
        }
        return d;
    }

    @Override // com.flurry.a.b.a.d.b
    public final Class n(a aVar) {
        Class e;
        com.flurry.a.b.a.d.a.d dVar = (com.flurry.a.b.a.d.a.d) aVar.a(com.flurry.a.b.a.d.a.d.class);
        if (dVar == null || (e = dVar.e()) == com.flurry.a.b.a.d.a.n.class) {
            return null;
        }
        return e;
    }

    @Override // com.flurry.a.b.a.d.b
    public final Class o(a aVar) {
        Class f;
        com.flurry.a.b.a.d.a.d dVar = (com.flurry.a.b.a.d.a.d) aVar.a(com.flurry.a.b.a.d.a.d.class);
        if (dVar == null || (f = dVar.f()) == com.flurry.a.b.a.d.a.n.class) {
            return null;
        }
        return f;
    }

    @Override // com.flurry.a.b.a.d.b
    public final Object j(b bVar) {
        com.flurry.a.b.a.d.a.l lVar = (com.flurry.a.b.a.d.a.l) bVar.a(com.flurry.a.b.a.d.a.l.class);
        if (lVar == null) {
            return null;
        }
        return lVar.a();
    }

    @Override // com.flurry.a.b.a.d.b
    public final String d(f fVar) {
        com.flurry.a.b.a.a.o oVar = (com.flurry.a.b.a.a.o) fVar.a(com.flurry.a.b.a.a.o.class);
        if (oVar != null) {
            return oVar.a();
        }
        com.flurry.a.b.a.a.r rVar = (com.flurry.a.b.a.a.r) fVar.a(com.flurry.a.b.a.a.r.class);
        if (rVar != null) {
            return rVar.a();
        }
        if (fVar.b(com.flurry.a.b.a.d.a.d.class) || fVar.b(com.flurry.a.b.a.d.a.m.class) || fVar.b(com.flurry.a.b.a.a.g.class) || fVar.b(com.flurry.a.b.a.a.m.class)) {
            return "";
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.b
    public final boolean e(f fVar) {
        return fVar.b(com.flurry.a.b.a.a.c.class);
    }

    @Override // com.flurry.a.b.a.d.b
    public final boolean f(f fVar) {
        return fVar.b(com.flurry.a.b.a.a.b.class);
    }

    @Override // com.flurry.a.b.a.d.b
    public final boolean p(a aVar) {
        return aVar.b(com.flurry.a.b.a.a.h.class);
    }

    @Override // com.flurry.a.b.a.d.b
    public final String c(d dVar) {
        com.flurry.a.b.a.a.o oVar = (com.flurry.a.b.a.a.o) dVar.a(com.flurry.a.b.a.a.o.class);
        if (oVar != null) {
            return oVar.a();
        }
        if (dVar.b(com.flurry.a.b.a.d.a.d.class) || dVar.b(com.flurry.a.b.a.d.a.m.class) || dVar.b(com.flurry.a.b.a.a.g.class) || dVar.b(com.flurry.a.b.a.a.m.class)) {
            return "";
        }
        return null;
    }

    @Override // com.flurry.a.b.a.d.b
    public final String a(h hVar) {
        com.flurry.a.b.a.a.o oVar;
        if (hVar == null || (oVar = (com.flurry.a.b.a.a.o) hVar.a(com.flurry.a.b.a.a.o.class)) == null) {
            return null;
        }
        return oVar.a();
    }

    private static boolean q(a aVar) {
        com.flurry.a.b.a.a.j jVar = (com.flurry.a.b.a.a.j) aVar.a(com.flurry.a.b.a.a.j.class);
        return jVar != null && jVar.a();
    }

    private static com.flurry.a.b.a.d.f.d a(ah ahVar, a aVar) {
        com.flurry.a.b.a.d.f.d mVar;
        com.flurry.a.b.a.a.u uVar = (com.flurry.a.b.a.a.u) aVar.a(com.flurry.a.b.a.a.u.class);
        com.flurry.a.b.a.d.a.k kVar = (com.flurry.a.b.a.d.a.k) aVar.a(com.flurry.a.b.a.d.a.k.class);
        if (kVar != null) {
            if (uVar == null) {
                return null;
            }
            mVar = ahVar.g(kVar.a());
        } else {
            if (uVar == null) {
                return null;
            }
            if (uVar.a() == com.flurry.a.b.a.a.w.NONE) {
                return new com.flurry.a.b.a.d.f.a.m().a(com.flurry.a.b.a.a.w.NONE, null);
            }
            mVar = new com.flurry.a.b.a.d.f.a.m();
        }
        com.flurry.a.b.a.d.a.j jVar = (com.flurry.a.b.a.d.a.j) aVar.a(com.flurry.a.b.a.d.a.j.class);
        com.flurry.a.b.a.d.f.d a = mVar.a(uVar.a(), jVar == null ? null : ahVar.h(jVar.a()));
        com.flurry.a.b.a.a.v b = uVar.b();
        if (b == com.flurry.a.b.a.a.v.EXTERNAL_PROPERTY && (aVar instanceof b)) {
            b = com.flurry.a.b.a.a.v.PROPERTY;
        }
        com.flurry.a.b.a.d.f.d a2 = a.a(b).a(uVar.c());
        Class d = uVar.d();
        return d != com.flurry.a.b.a.a.x.class ? a2.a(d) : a2;
    }
}
