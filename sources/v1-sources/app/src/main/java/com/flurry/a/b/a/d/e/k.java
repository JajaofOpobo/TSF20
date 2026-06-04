package com.flurry.a.b.a.d.e;

import com.flurry.a.b.a.d.ah;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class k extends com.flurry.a.b.a.d.e {
    protected final ah b;
    protected final com.flurry.a.b.a.d.b c;
    protected final b d;
    protected com.flurry.a.b.a.d.h.j e;
    protected final List f;
    protected f g;
    protected Map h;
    protected Set i;
    protected Set j;
    protected f k;
    protected f l;

    private k(ah ahVar, com.flurry.a.b.a.g.a aVar, b bVar, List list) {
        super(aVar);
        this.b = ahVar;
        this.c = ahVar == null ? null : ahVar.a();
        this.d = bVar;
        this.f = list;
    }

    public static k a(u uVar) {
        k kVar = new k(uVar.a(), uVar.b(), uVar.c(), uVar.d());
        kVar.g = uVar.h();
        kVar.i = uVar.i();
        kVar.j = uVar.j();
        kVar.h = uVar.e();
        return kVar;
    }

    public static k b(u uVar) {
        k kVar = new k(uVar.a(), uVar.b(), uVar.c(), uVar.d());
        kVar.k = uVar.f();
        kVar.l = uVar.g();
        return kVar;
    }

    public static k a(ah ahVar, com.flurry.a.b.a.g.a aVar, b bVar) {
        return new k(ahVar, aVar, bVar, Collections.emptyList());
    }

    @Override // com.flurry.a.b.a.d.e
    public final b c() {
        return this.d;
    }

    public final List d() {
        return this.f;
    }

    public final f e() {
        return this.k;
    }

    public final Set f() {
        return this.i == null ? Collections.emptySet() : this.i;
    }

    public final Set g() {
        return this.j;
    }

    public final boolean h() {
        return this.d.g();
    }

    public final com.flurry.a.b.a.d.i.a i() {
        return this.d.f();
    }

    public final com.flurry.a.b.a.d.h.j j() {
        if (this.e == null) {
            this.e = new com.flurry.a.b.a.d.h.j(this.b.n(), this.a);
        }
        return this.e;
    }

    public final c k() {
        return this.d.h();
    }

    public final f l() {
        Class g;
        if (this.g != null && (g = this.g.g()) != String.class && g != Object.class) {
            throw new IllegalArgumentException("Invalid 'any-setter' annotation on method " + this.g.b() + "(): first argument not of type String or Object, but " + g.getName());
        }
        return this.g;
    }

    public final Map m() {
        return this.h;
    }

    public final List n() {
        return this.d.i();
    }

    public final f a(String str, Class[] clsArr) {
        return this.d.a(str, clsArr);
    }

    public final Object a(boolean z) {
        c h = this.d.h();
        if (h == null) {
            return null;
        }
        if (z) {
            com.flurry.a.b.a.d.i.l.a(h.j());
        }
        try {
            return h.e().newInstance(new Object[0]);
        } catch (Exception e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            if (e instanceof Error) {
                throw ((Error) e);
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalArgumentException("Failed to instantiate bean of type " + this.d.e().getName() + ": (" + e.getClass().getName() + ") " + e.getMessage(), e);
        }
    }

    public final List o() {
        List<f> j = this.d.j();
        if (!j.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (f fVar : j) {
                if (a(fVar)) {
                    arrayList.add(fVar);
                }
            }
            return arrayList;
        }
        return j;
    }

    public final Constructor a(Class... clsArr) {
        for (c cVar : this.d.i()) {
            if (cVar.f() == 1) {
                Class g = cVar.g();
                for (Class cls : clsArr) {
                    if (cls == g) {
                        return cVar.e();
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method b(Class... clsArr) {
        for (f fVar : this.d.j()) {
            if (a(fVar)) {
                Class g = fVar.g();
                for (Class cls : clsArr) {
                    if (g.isAssignableFrom(cls)) {
                        return fVar.e();
                    }
                }
            }
        }
        return null;
    }

    private boolean a(f fVar) {
        if (b().isAssignableFrom(fVar.d())) {
            return this.c.p(fVar) || "valueOf".equals(fVar.b());
        }
        return false;
    }

    public final com.flurry.a.b.a.d.a.h a(com.flurry.a.b.a.d.a.h hVar) {
        return this.c == null ? hVar : this.c.a(this.d, hVar);
    }

    public final f p() {
        if (this.l != null && !Map.class.isAssignableFrom(this.l.d())) {
            throw new IllegalArgumentException("Invalid 'any-getter' annotation on method " + this.l.b() + "(): return type is not instance of java.util.Map");
        }
        return this.l;
    }

    public final Map q() {
        com.flurry.a.b.a.d.c a;
        HashMap hashMap = null;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            e j = ((com.flurry.a.b.a.d.h) it.next()).j();
            if (j != null && (a = this.c.a(j)) != null && a.c()) {
                HashMap hashMap2 = hashMap == null ? new HashMap() : hashMap;
                String a2 = a.a();
                if (hashMap2.put(a2, j) != null) {
                    throw new IllegalArgumentException("Multiple back-reference properties with name '" + a2 + "'");
                }
                hashMap = hashMap2;
            }
        }
        return hashMap;
    }
}
