package com.flurry.a.b.a.d.b.b;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class ac extends h implements com.flurry.a.b.a.d.aq {
    protected final com.flurry.a.b.a.g.a a;
    protected final com.flurry.a.b.a.d.ae b;
    protected final com.flurry.a.b.a.d.w c;
    protected final com.flurry.a.b.a.d.ay d;
    protected final com.flurry.a.b.a.d.b.v e;
    protected final boolean f;
    protected com.flurry.a.b.a.d.b.a.i g;
    protected com.flurry.a.b.a.d.w h;
    protected HashSet i;

    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        if (this.g != null) {
            return b(jVar, pVar);
        }
        if (this.h != null) {
            return (Map) this.e.a(this.h.a(jVar, pVar));
        }
        if (!this.f) {
            throw pVar.a(this.a.p(), "No default constructor found");
        }
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.START_OBJECT || e == com.flurry.a.b.a.o.FIELD_NAME || e == com.flurry.a.b.a.o.END_OBJECT) {
            Map map = (Map) this.e.m();
            a(jVar, pVar, map);
            return map;
        }
        if (e == com.flurry.a.b.a.o.VALUE_STRING) {
            return (Map) this.e.a(jVar.k());
        }
        throw pVar.b(this.a.p());
    }

    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Object obj) {
        Map map = (Map) obj;
        com.flurry.a.b.a.o e = jVar.e();
        if (e != com.flurry.a.b.a.o.START_OBJECT && e != com.flurry.a.b.a.o.FIELD_NAME) {
            throw pVar.b(this.a.p());
        }
        a(jVar, pVar, map);
        return map;
    }

    public ac(com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.b.v vVar, com.flurry.a.b.a.d.ae aeVar, com.flurry.a.b.a.d.w wVar, com.flurry.a.b.a.d.ay ayVar) {
        super(Map.class);
        this.a = aVar;
        this.b = aeVar;
        this.c = wVar;
        this.d = ayVar;
        this.e = vVar;
        if (vVar.j()) {
            this.g = new com.flurry.a.b.a.d.b.a.i(vVar);
        } else {
            this.g = null;
        }
        this.f = vVar.h();
    }

    public final void a(String[] strArr) {
        this.i = (strArr == null || strArr.length == 0) ? null : com.flurry.a.b.a.d.i.b.a(strArr);
    }

    @Override // com.flurry.a.b.a.d.aq
    public final void a(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.d.s sVar) {
        if (this.e.i()) {
            com.flurry.a.b.a.g.a l = this.e.l();
            if (l == null) {
                throw new IllegalArgumentException("Invalid delegate-creator definition for " + this.a + ": value instantiator (" + this.e.getClass().getName() + ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
            }
            this.h = sVar.a(nVar, l, new com.flurry.a.b.a.d.g(null, l, null, this.e.o()));
        }
        if (this.g != null) {
            for (com.flurry.a.b.a.d.b.k kVar : this.g.a()) {
                if (!kVar.e()) {
                    this.g.a(kVar, sVar.a(nVar, kVar.a(), kVar));
                }
            }
        }
    }

    @Override // com.flurry.a.b.a.d.b.b.h
    public final com.flurry.a.b.a.d.w c() {
        return this.c;
    }

    @Override // com.flurry.a.b.a.d.b.b.ap, com.flurry.a.b.a.d.w
    public final Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, com.flurry.a.b.a.d.ay ayVar) {
        return ayVar.a(jVar, pVar);
    }

    private void a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar, Map map) {
        Object a;
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.START_OBJECT) {
            e = jVar.b();
        }
        com.flurry.a.b.a.d.ae aeVar = this.b;
        com.flurry.a.b.a.d.w wVar = this.c;
        com.flurry.a.b.a.d.ay ayVar = this.d;
        while (e == com.flurry.a.b.a.o.FIELD_NAME) {
            String g = jVar.g();
            Object a2 = aeVar.a(g, pVar);
            com.flurry.a.b.a.o b = jVar.b();
            if (this.i != null && this.i.contains(g)) {
                jVar.d();
            } else {
                if (b == com.flurry.a.b.a.o.VALUE_NULL) {
                    a = null;
                } else if (ayVar == null) {
                    a = wVar.a(jVar, pVar);
                } else {
                    a = wVar.a(jVar, pVar, ayVar);
                }
                map.put(a2, a);
            }
            e = jVar.b();
        }
    }

    private Map b(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        Object a;
        com.flurry.a.b.a.d.b.a.i iVar = this.g;
        com.flurry.a.b.a.d.b.a.n a2 = iVar.a(jVar, pVar);
        com.flurry.a.b.a.o e = jVar.e();
        if (e == com.flurry.a.b.a.o.START_OBJECT) {
            e = jVar.b();
        }
        com.flurry.a.b.a.d.w wVar = this.c;
        com.flurry.a.b.a.d.ay ayVar = this.d;
        while (e == com.flurry.a.b.a.o.FIELD_NAME) {
            String g = jVar.g();
            com.flurry.a.b.a.o b = jVar.b();
            if (this.i != null && this.i.contains(g)) {
                jVar.d();
            } else {
                com.flurry.a.b.a.d.b.k a3 = iVar.a(g);
                if (a3 != null) {
                    if (a2.a(a3.i(), a3.a(jVar, pVar))) {
                        jVar.b();
                        try {
                            Map map = (Map) iVar.a(a2);
                            a(jVar, pVar, map);
                            return map;
                        } catch (Exception e2) {
                            a(e2, this.a.p());
                            return null;
                        }
                    }
                } else {
                    Object a4 = this.b.a(jVar.g(), pVar);
                    if (b == com.flurry.a.b.a.o.VALUE_NULL) {
                        a = null;
                    } else if (ayVar == null) {
                        a = wVar.a(jVar, pVar);
                    } else {
                        a = wVar.a(jVar, pVar, ayVar);
                    }
                    a2.a(a4, a);
                }
            }
            e = jVar.b();
        }
        try {
            return (Map) iVar.a(a2);
        } catch (Exception e3) {
            a(e3, this.a.p());
            return null;
        }
    }

    private static void a(Throwable th, Object obj) {
        Throwable th2 = th;
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        if ((th2 instanceof IOException) && !(th2 instanceof com.flurry.a.b.a.d.y)) {
            throw ((IOException) th2);
        }
        throw com.flurry.a.b.a.d.y.a(th2, obj, (String) null);
    }
}
