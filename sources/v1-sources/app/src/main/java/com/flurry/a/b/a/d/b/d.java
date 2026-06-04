package com.flurry.a.b.a.d.b;

import com.flurry.a.b.a.d.aq;
import com.flurry.a.b.a.d.ay;
import com.flurry.a.b.a.d.b.b.ap;
import com.flurry.a.b.a.d.y;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeParser;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends ap implements aq {
    protected final com.flurry.a.b.a.d.e.b a;
    protected final com.flurry.a.b.a.g.a b;
    protected final com.flurry.a.b.a.d.f c;
    protected final v d;
    protected com.flurry.a.b.a.d.w e;
    protected final com.flurry.a.b.a.d.b.a.i f;
    protected boolean g;
    protected final com.flurry.a.b.a.d.b.a.a h;
    protected final com.flurry.a.b.a.d.b.a.p[] i;
    protected j j;
    protected final HashSet k;
    protected final boolean l;
    protected final Map m;
    protected HashMap n;
    protected com.flurry.a.b.a.d.b.a.o o;
    protected com.flurry.a.b.a.d.b.a.f p;

    public d(com.flurry.a.b.a.d.e eVar, com.flurry.a.b.a.d.f fVar, v vVar, com.flurry.a.b.a.d.b.a.a aVar, Map map, HashSet hashSet, boolean z, j jVar, List list) {
        this(eVar.c(), eVar.a(), fVar, vVar, aVar, map, hashSet, z, jVar, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private d(com.flurry.a.b.a.d.e.b bVar, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f fVar, v vVar, com.flurry.a.b.a.d.b.a.a aVar2, Map map, HashSet hashSet, boolean z, j jVar, List list) {
        super(aVar);
        com.flurry.a.b.a.d.b.a.p[] pVarArr = null;
        this.a = bVar;
        this.b = aVar;
        this.c = fVar;
        this.d = vVar;
        if (vVar.j()) {
            this.f = new com.flurry.a.b.a.d.b.a.i(vVar);
        } else {
            this.f = null;
        }
        this.h = aVar2;
        this.m = map;
        this.k = hashSet;
        this.l = z;
        this.j = jVar;
        if (list != null && !list.isEmpty()) {
            pVarArr = (com.flurry.a.b.a.d.b.a.p[]) list.toArray(new com.flurry.a.b.a.d.b.a.p[list.size()]);
        }
        this.i = pVarArr;
        this.g = (!vVar.i() && this.f == null && vVar.h() && this.o == null) ? false : true;
    }

    protected d(d dVar) {
        this(dVar, dVar.l);
    }

    protected d(d dVar, boolean z) {
        super(dVar.b);
        this.a = dVar.a;
        this.b = dVar.b;
        this.c = dVar.c;
        this.d = dVar.d;
        this.e = dVar.e;
        this.f = dVar.f;
        this.h = dVar.h;
        this.m = dVar.m;
        this.k = dVar.k;
        this.l = z;
        this.j = dVar.j;
        this.i = dVar.i;
        this.g = dVar.g;
        this.o = dVar.o;
    }

    @Override // com.flurry.a.b.a.d.w
    public com.flurry.a.b.a.d.w a() {
        return getClass() != d.class ? this : new d(this, true);
    }

    private k a(String str) {
        if (this.m == null) {
            return null;
        }
        return (k) this.m.get(str);
    }

    @Override // com.flurry.a.b.a.d.aq
    public final void a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.s sVar) {
        k a;
        com.flurry.a.b.a.d.b.a.o oVar;
        com.flurry.a.b.a.d.w g;
        com.flurry.a.b.a.d.w a2;
        Iterator c = this.h.c();
        com.flurry.a.b.a.d.b.a.g gVar = null;
        com.flurry.a.b.a.d.b.a.o oVar2 = null;
        while (c.hasNext()) {
            k kVar = (k) c.next();
            k a3 = !kVar.e() ? kVar.a(sVar.a(nVar, kVar.a(), kVar)) : kVar;
            String d = a3.d();
            if (d != null) {
                com.flurry.a.b.a.d.w g2 = a3.g();
                boolean z = false;
                if (g2 instanceof d) {
                    a = ((d) g2).a(d);
                } else {
                    if (!(g2 instanceof com.flurry.a.b.a.d.b.b.h)) {
                        if (!(g2 instanceof a)) {
                            throw new IllegalArgumentException("Can not handle managed/back reference '" + d + "': type for value deserializer is not BeanDeserializer or ContainerDeserializerBase, but " + g2.getClass().getName());
                        }
                        throw new IllegalArgumentException("Can not handle managed/back reference for abstract types (property " + this.b.p().getName() + "." + a3.c() + ")");
                    }
                    com.flurry.a.b.a.d.w c2 = ((com.flurry.a.b.a.d.b.b.h) g2).c();
                    if (!(c2 instanceof d)) {
                        throw new IllegalArgumentException("Can not handle managed/back reference '" + d + "': value deserializer is of type ContainerDeserializerBase, but content type is not handled by a BeanDeserializer  (instead it's of type " + c2.getClass().getName() + ")");
                    }
                    a = ((d) c2).a(d);
                    z = true;
                }
                if (a == null) {
                    throw new IllegalArgumentException("Can not handle managed/back reference '" + d + "': no back reference property found from type " + a3.a());
                }
                com.flurry.a.b.a.g.a aVar = this.b;
                com.flurry.a.b.a.g.a a4 = a.a();
                if (!a4.p().isAssignableFrom(aVar.p())) {
                    throw new IllegalArgumentException("Can not handle managed/back reference '" + d + "': back reference type (" + a4.p().getName() + ") not compatible with managed type (" + aVar.p().getName() + ")");
                }
                a3 = new n(d, a3, a, this.a.f(), z);
            }
            com.flurry.a.b.a.d.e.e b = a3.b();
            k a5 = (b == null || nVar.a().b(b) != Boolean.TRUE || (a2 = (g = a3.g()).a()) == g || a2 == null) ? null : a3.a(a2);
            if (a5 != null) {
                if (oVar2 == null) {
                    oVar2 = new com.flurry.a.b.a.d.b.a.o();
                }
                oVar2.a(a5);
                a3 = a5;
                oVar = oVar2;
            } else {
                oVar = oVar2;
            }
            k a6 = a(nVar, a3);
            if (a6 != kVar) {
                this.h.a(a6);
            }
            if (a6.f()) {
                ay h = a6.h();
                if (h.a() == com.flurry.a.b.a.a.v.EXTERNAL_PROPERTY) {
                    com.flurry.a.b.a.d.b.a.g gVar2 = gVar == null ? new com.flurry.a.b.a.d.b.a.g() : gVar;
                    gVar2.a(a6, h.b());
                    this.h.b(a6);
                    gVar = gVar2;
                }
            }
            oVar2 = oVar;
        }
        if (this.j != null && !this.j.b()) {
            this.j = this.j.a(sVar.a(nVar, this.j.c(), this.j.a()));
        }
        if (this.d.i()) {
            com.flurry.a.b.a.g.a l = this.d.l();
            if (l == null) {
                throw new IllegalArgumentException("Invalid delegate-creator definition for " + this.b + ": value instantiator (" + this.d.getClass().getName() + ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
            }
            this.e = sVar.a(nVar, l, new com.flurry.a.b.a.d.g(null, l, this.a.f(), this.d.o()));
        }
        if (this.f != null) {
            for (k kVar2 : this.f.a()) {
                if (!kVar2.e()) {
                    this.f.a(kVar2, sVar.a(nVar, kVar2.a(), kVar2));
                }
            }
        }
        if (gVar != null) {
            this.p = gVar.a();
            this.g = true;
        }
        this.o = oVar2;
        if (oVar2 != null) {
            this.g = true;
        }
    }

    private k a(com.flurry.a.b.a.d.n nVar, k kVar) {
        Class p;
        Class c;
        com.flurry.a.b.a.d.w g = kVar.g();
        if ((g instanceof d) && !((d) g).d.h() && (c = com.flurry.a.b.a.d.i.l.c((p = kVar.a().p()))) != null && c == this.b.p()) {
            Constructor<?>[] constructors = p.getConstructors();
            for (Constructor<?> constructor : constructors) {
                Class[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == c) {
                    if (nVar.a(com.flurry.a.b.a.d.o.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                        com.flurry.a.b.a.d.i.l.a(constructor);
                    }
                    return new m(kVar, constructor);
                }
            }
            return kVar;
        }
        return kVar;
    }

    @Override // com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.START_OBJECT) {
            jVar.b();
            return b(jVar, pVar);
        }
        switch (e.a[e.ordinal()]) {
            case 1:
                if (this.e == null || this.d.c()) {
                    return this.d.a(jVar.k());
                }
                Object a = this.d.a(this.e.a(jVar, pVar));
                if (this.i != null) {
                    a(pVar, a);
                    return a;
                }
                return a;
            case 2:
                switch (e.b[jVar.q().ordinal()]) {
                    case 1:
                        if (this.e == null || this.d.d()) {
                            return this.d.a(jVar.t());
                        }
                        Object a2 = this.d.a(this.e.a(jVar, pVar));
                        if (this.i != null) {
                            a(pVar, a2);
                            return a2;
                        }
                        return a2;
                    case 2:
                        if (this.e == null || this.d.d()) {
                            return this.d.a(jVar.u());
                        }
                        Object a3 = this.d.a(this.e.a(jVar, pVar));
                        if (this.i != null) {
                            a(pVar, a3);
                            return a3;
                        }
                        return a3;
                    default:
                        if (this.e == null) {
                            throw pVar.a(this.b.p(), "no suitable creator method found to deserialize from JSON integer number");
                        }
                        Object a4 = this.d.a(this.e.a(jVar, pVar));
                        if (this.i != null) {
                            a(pVar, a4);
                            return a4;
                        }
                        return a4;
                }
            case 3:
                switch (e.b[jVar.q().ordinal()]) {
                    case 3:
                    case 4:
                        if (this.e == null || this.d.f()) {
                            return this.d.a(jVar.x());
                        }
                        Object a5 = this.d.a(this.e.a(jVar, pVar));
                        if (this.i != null) {
                            a(pVar, a5);
                            return a5;
                        }
                        return a5;
                    default:
                        if (this.e != null) {
                            return this.d.a(this.e.a(jVar, pVar));
                        }
                        throw pVar.a(this.b.p(), "no suitable creator method found to deserialize from JSON floating-point number");
                }
            case 4:
                return jVar.z();
            case 5:
            case 6:
                if (this.e == null || this.d.g()) {
                    return this.d.a(jVar.e() == com.flurry.a.b.a.o.VALUE_TRUE);
                }
                Object a6 = this.d.a(this.e.a(jVar, pVar));
                if (this.i != null) {
                    a(pVar, a6);
                    return a6;
                }
                return a6;
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                return r(jVar, pVar);
            case ThemeParser.TYPE_FOLDER /* 8 */:
            case 9:
                return b(jVar, pVar);
            default:
                throw pVar.b(this.b.p());
        }
    }

    @Override // com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Object obj) {
        if (this.i != null) {
            a(pVar, obj);
        }
        if (this.o != null) {
            return b(jVar, pVar, obj);
        }
        if (this.p != null) {
            return c(jVar, pVar, obj);
        }
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.START_OBJECT) {
            e = jVar.b();
        }
        while (e == com.flurry.a.b.a.o.FIELD_NAME) {
            String g = jVar.g();
            jVar.b();
            k a = this.h.a(g);
            if (a != null) {
                try {
                    a.a(jVar, pVar, obj);
                } catch (Exception e2) {
                    a(e2, obj, g, pVar);
                }
            } else if (this.k != null && this.k.contains(g)) {
                jVar.d();
            } else if (this.j != null) {
                this.j.a(jVar, pVar, obj, g);
            } else {
                a(jVar, pVar, obj, g);
            }
            e = jVar.b();
        }
        return obj;
    }

    @Override // com.flurry.a.b.a.d.b.b.ap, com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, ay ayVar) {
        return ayVar.a(jVar, pVar);
    }

    public Object b(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        if (this.g) {
            if (this.o != null) {
                return s(jVar, pVar);
            }
            if (this.p != null) {
                return this.f != null ? u(jVar, pVar) : c(jVar, pVar, this.d.m());
            }
            if (this.e != null) {
                return this.d.a(this.e.a(jVar, pVar));
            }
            if (this.f != null) {
                return c(jVar, pVar);
            }
            if (this.b.c()) {
                throw y.a(jVar, "Can not instantiate abstract type " + this.b + " (need to add/enable type information?)");
            }
            throw y.a(jVar, "No suitable constructor found for type " + this.b + ": can not instantiate from JSON object (need to add/enable type information?)");
        }
        Object m = this.d.m();
        if (this.i != null) {
            a(pVar, m);
        }
        while (jVar.e() != com.flurry.a.b.a.o.END_OBJECT) {
            String g = jVar.g();
            jVar.b();
            k a = this.h.a(g);
            if (a != null) {
                try {
                    a.a(jVar, pVar, m);
                } catch (Exception e) {
                    a(e, m, g, pVar);
                }
            } else if (this.k != null && this.k.contains(g)) {
                jVar.d();
            } else if (this.j != null) {
                try {
                    this.j.a(jVar, pVar, m, g);
                } catch (Exception e2) {
                    a(e2, m, g, pVar);
                }
            } else {
                a(jVar, pVar, m, g);
            }
            jVar.b();
        }
        return m;
    }

    private Object r(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        if (this.e != null) {
            try {
                Object a = this.d.a(this.e.a(jVar, pVar));
                if (this.i != null) {
                    a(pVar, a);
                }
                return a;
            } catch (Exception e) {
                a(e, pVar);
            }
        }
        throw pVar.b(this.b.p());
    }

    protected final Object c(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.d.b.a.i iVar = this.f;
        com.flurry.a.b.a.d.b.a.n a = iVar.a(jVar, pVar);
        com.flurry.a.b.a.o e = jVar.e();
        com.flurry.a.b.a.h.m mVar = null;
        while (e == com.flurry.a.b.a.o.FIELD_NAME) {
            String g = jVar.g();
            jVar.b();
            k a2 = iVar.a(g);
            if (a2 != null) {
                if (a.a(a2.i(), a2.a(jVar, pVar))) {
                    jVar.b();
                    try {
                        Object a3 = iVar.a(a);
                        if (a3.getClass() != this.b.p()) {
                            return a(jVar, pVar, a3, mVar);
                        }
                        return a(jVar, pVar, mVar != null ? a(pVar, a3, mVar) : a3);
                    } catch (Exception e2) {
                        a(e2, this.b.p(), g, pVar);
                    }
                } else {
                    continue;
                }
            } else {
                k a4 = this.h.a(g);
                if (a4 != null) {
                    a.a(a4, a4.a(jVar, pVar));
                } else if (this.k != null && this.k.contains(g)) {
                    jVar.d();
                } else if (this.j != null) {
                    a.a(this.j, g, this.j.a(jVar, pVar));
                } else {
                    if (mVar == null) {
                        mVar = new com.flurry.a.b.a.h.m(jVar.a());
                    }
                    mVar.a(g);
                    mVar.b(jVar);
                }
            }
            e = jVar.b();
        }
        try {
            Object a5 = iVar.a(a);
            if (mVar == null) {
                return a5;
            }
            if (a5.getClass() != this.b.p()) {
                return a((com.flurry.a.b.a.j) null, pVar, a5, mVar);
            }
            return a(pVar, a5, mVar);
        } catch (Exception e3) {
            a(e3, pVar);
            return null;
        }
    }

    private Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Object obj, com.flurry.a.b.a.h.m mVar) {
        Object obj2;
        com.flurry.a.b.a.d.w b = b(pVar, obj);
        if (b != null) {
            if (mVar != null) {
                mVar.e();
                com.flurry.a.b.a.j h = mVar.h();
                h.b();
                obj2 = b.a(h, pVar, obj);
            } else {
                obj2 = obj;
            }
            if (jVar != null) {
                return b.a(jVar, pVar, obj2);
            }
            return obj2;
        }
        Object a = mVar != null ? a(pVar, obj, mVar) : obj;
        if (jVar != null) {
            return a(jVar, pVar, a);
        }
        return a;
    }

    private Object s(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        if (this.e != null) {
            return this.d.a(this.e.a(jVar, pVar));
        }
        if (this.f != null) {
            return t(jVar, pVar);
        }
        com.flurry.a.b.a.h.m mVar = new com.flurry.a.b.a.h.m(jVar.a());
        mVar.d();
        Object m = this.d.m();
        if (this.i != null) {
            a(pVar, m);
        }
        while (jVar.e() != com.flurry.a.b.a.o.END_OBJECT) {
            String g = jVar.g();
            jVar.b();
            k a = this.h.a(g);
            if (a != null) {
                try {
                    a.a(jVar, pVar, m);
                } catch (Exception e) {
                    a(e, m, g, pVar);
                }
            } else if (this.k != null && this.k.contains(g)) {
                jVar.d();
            } else {
                mVar.a(g);
                mVar.b(jVar);
                if (this.j != null) {
                    try {
                        this.j.a(jVar, pVar, m, g);
                    } catch (Exception e2) {
                        a(e2, m, g, pVar);
                    }
                }
            }
            jVar.b();
        }
        mVar.e();
        this.o.a(pVar, m, mVar);
        return m;
    }

    private Object b(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Object obj) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.START_OBJECT) {
            e = jVar.b();
        }
        com.flurry.a.b.a.h.m mVar = new com.flurry.a.b.a.h.m(jVar.a());
        mVar.d();
        while (e == com.flurry.a.b.a.o.FIELD_NAME) {
            String g = jVar.g();
            k a = this.h.a(g);
            jVar.b();
            if (a != null) {
                try {
                    a.a(jVar, pVar, obj);
                } catch (Exception e2) {
                    a(e2, obj, g, pVar);
                }
            } else if (this.k != null && this.k.contains(g)) {
                jVar.d();
            } else {
                mVar.a(g);
                mVar.b(jVar);
                if (this.j != null) {
                    this.j.a(jVar, pVar, obj, g);
                }
            }
            e = jVar.b();
        }
        mVar.e();
        this.o.a(pVar, obj, mVar);
        return obj;
    }

    private Object t(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.d.b.a.i iVar = this.f;
        com.flurry.a.b.a.d.b.a.n a = iVar.a(jVar, pVar);
        com.flurry.a.b.a.h.m mVar = new com.flurry.a.b.a.h.m(jVar.a());
        mVar.d();
        com.flurry.a.b.a.o e = jVar.e();
        while (e == com.flurry.a.b.a.o.FIELD_NAME) {
            String g = jVar.g();
            jVar.b();
            k a2 = iVar.a(g);
            if (a2 != null) {
                if (a.a(a2.i(), a2.a(jVar, pVar))) {
                    com.flurry.a.b.a.o b = jVar.b();
                    try {
                        Object a3 = iVar.a(a);
                        while (b == com.flurry.a.b.a.o.FIELD_NAME) {
                            jVar.b();
                            mVar.b(jVar);
                            b = jVar.b();
                        }
                        mVar.e();
                        if (a3.getClass() != this.b.p()) {
                            throw pVar.b("Can not create polymorphic instances with unwrapped values");
                        }
                        return this.o.a(pVar, a3, mVar);
                    } catch (Exception e2) {
                        a(e2, this.b.p(), g, pVar);
                    }
                } else {
                    continue;
                }
            } else {
                k a4 = this.h.a(g);
                if (a4 != null) {
                    a.a(a4, a4.a(jVar, pVar));
                } else if (this.k != null && this.k.contains(g)) {
                    jVar.d();
                } else {
                    mVar.a(g);
                    mVar.b(jVar);
                    if (this.j != null) {
                        a.a(this.j, g, this.j.a(jVar, pVar));
                    }
                }
            }
            e = jVar.b();
        }
        try {
            return this.o.a(pVar, iVar.a(a), mVar);
        } catch (Exception e3) {
            a(e3, pVar);
            return null;
        }
    }

    private Object c(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Object obj) {
        com.flurry.a.b.a.d.b.a.f a = this.p.a();
        while (jVar.e() != com.flurry.a.b.a.o.END_OBJECT) {
            String g = jVar.g();
            jVar.b();
            k a2 = this.h.a(g);
            if (a2 != null) {
                try {
                    a2.a(jVar, pVar, obj);
                } catch (Exception e) {
                    a(e, obj, g, pVar);
                }
            } else if (this.k != null && this.k.contains(g)) {
                jVar.d();
            } else if (!a.a(jVar, pVar, g, obj)) {
                if (this.j != null) {
                    try {
                        this.j.a(jVar, pVar, obj, g);
                    } catch (Exception e2) {
                        a(e2, obj, g, pVar);
                    }
                } else {
                    a(jVar, pVar, obj, g);
                }
            }
            jVar.b();
        }
        return a.a(jVar, pVar, obj);
    }

    private Object u(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        Object obj = null;
        com.flurry.a.b.a.d.b.a.f a = this.p.a();
        com.flurry.a.b.a.d.b.a.i iVar = this.f;
        com.flurry.a.b.a.d.b.a.n a2 = iVar.a(jVar, pVar);
        com.flurry.a.b.a.h.m mVar = new com.flurry.a.b.a.h.m(jVar.a());
        mVar.d();
        com.flurry.a.b.a.o e = jVar.e();
        while (e == com.flurry.a.b.a.o.FIELD_NAME) {
            String g = jVar.g();
            jVar.b();
            k a3 = iVar.a(g);
            if (a3 != null) {
                if (a2.a(a3.i(), a3.a(jVar, pVar))) {
                    com.flurry.a.b.a.o b = jVar.b();
                    try {
                        Object a4 = iVar.a(a2);
                        while (b == com.flurry.a.b.a.o.FIELD_NAME) {
                            jVar.b();
                            mVar.b(jVar);
                            b = jVar.b();
                        }
                        if (a4.getClass() != this.b.p()) {
                            throw pVar.b("Can not create polymorphic instances with unwrapped values");
                        }
                        return a.a(jVar, pVar, a4);
                    } catch (Exception e2) {
                        a(e2, this.b.p(), g, pVar);
                    }
                } else {
                    continue;
                }
            } else {
                k a5 = this.h.a(g);
                if (a5 != null) {
                    a2.a(a5, a5.a(jVar, pVar));
                } else if (!a.a(jVar, pVar, g, obj)) {
                    if (this.k != null && this.k.contains(g)) {
                        jVar.d();
                    } else if (this.j != null) {
                        a2.a(this.j, g, this.j.a(jVar, pVar));
                    }
                }
            }
            e = jVar.b();
        }
        try {
            return a.a(jVar, pVar, iVar.a(a2));
        } catch (Exception e3) {
            a(e3, pVar);
            return obj;
        }
    }

    private void a(com.flurry.a.b.a.d.p pVar, Object obj) {
        for (com.flurry.a.b.a.d.b.a.p pVar2 : this.i) {
            pVar2.a(pVar, obj);
        }
    }

    @Override // com.flurry.a.b.a.d.b.b.ap
    protected final void a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Object obj, String str) {
        if (this.l || (this.k != null && this.k.contains(str))) {
            jVar.d();
        } else {
            super.a(jVar, pVar, obj, str);
        }
    }

    private Object a(com.flurry.a.b.a.d.p pVar, Object obj, com.flurry.a.b.a.h.m mVar) {
        mVar.e();
        com.flurry.a.b.a.j h = mVar.h();
        while (h.b() != com.flurry.a.b.a.o.END_OBJECT) {
            String g = h.g();
            h.b();
            a(h, pVar, obj, g);
        }
        return obj;
    }

    private com.flurry.a.b.a.d.w b(com.flurry.a.b.a.d.p pVar, Object obj) {
        com.flurry.a.b.a.d.w wVar;
        com.flurry.a.b.a.d.s b;
        synchronized (this) {
            wVar = this.n == null ? null : (com.flurry.a.b.a.d.w) this.n.get(new com.flurry.a.b.a.d.h.b(obj.getClass()));
        }
        if (wVar == null && (b = pVar.b()) != null) {
            wVar = b.a(pVar.a(), pVar.a((Class) obj.getClass()), this.c);
            if (wVar != null) {
                synchronized (this) {
                    if (this.n == null) {
                        this.n = new HashMap();
                    }
                    this.n.put(new com.flurry.a.b.a.d.h.b(obj.getClass()), wVar);
                }
            }
        }
        return wVar;
    }

    private static void a(Throwable th, Object obj, String str, com.flurry.a.b.a.d.p pVar) {
        Throwable th2 = th;
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        boolean z = pVar == null || pVar.a(com.flurry.a.b.a.d.o.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z || !(th2 instanceof y)) {
                throw ((IOException) th2);
            }
        } else if (!z && (th2 instanceof RuntimeException)) {
            throw ((RuntimeException) th2);
        }
        throw y.a(th2, obj, str);
    }

    private void a(Throwable th, com.flurry.a.b.a.d.p pVar) {
        Throwable th2 = th;
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        boolean z = pVar == null || pVar.a(com.flurry.a.b.a.d.o.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            throw ((IOException) th2);
        }
        if (!z && (th2 instanceof RuntimeException)) {
            throw ((RuntimeException) th2);
        }
        throw pVar.a(this.b.p(), th2);
    }
}
