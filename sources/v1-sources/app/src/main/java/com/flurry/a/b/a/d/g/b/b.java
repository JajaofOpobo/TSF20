package com.flurry.a.b.a.d.g.b;

/* loaded from: classes.dex */
public abstract class b extends v implements com.flurry.a.b.a.d.ar {
    protected static final com.flurry.a.b.a.d.g.d[] a = new com.flurry.a.b.a.d.g.d[0];
    protected final com.flurry.a.b.a.d.g.d[] b;
    protected final com.flurry.a.b.a.d.g.d[] c;
    protected final com.flurry.a.b.a.d.g.a d;
    protected final Object e;

    protected b(com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.g.d[] dVarArr, com.flurry.a.b.a.d.g.d[] dVarArr2, com.flurry.a.b.a.d.g.a aVar2, Object obj) {
        super(aVar);
        this.b = dVarArr;
        this.c = dVarArr2;
        this.d = aVar2;
        this.e = obj;
    }

    public b(Class cls, com.flurry.a.b.a.d.g.d[] dVarArr, com.flurry.a.b.a.d.g.d[] dVarArr2, com.flurry.a.b.a.d.g.a aVar, Object obj) {
        super(cls);
        this.b = dVarArr;
        this.c = dVarArr2;
        this.d = aVar;
        this.e = obj;
    }

    protected b(b bVar) {
        this(bVar.k, bVar.b, bVar.c, bVar.d, bVar.e);
    }

    @Override // com.flurry.a.b.a.d.ac
    public final void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar, com.flurry.a.b.a.d.az azVar) {
        azVar.b(obj, eVar);
        if (this.e != null) {
            c(obj, eVar, awVar);
        } else {
            b(obj, eVar, awVar);
        }
        azVar.e(obj, eVar);
    }

    protected final void b(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        com.flurry.a.b.a.d.g.d[] dVarArr;
        if (this.c != null && awVar.a() != null) {
            dVarArr = this.c;
        } else {
            dVarArr = this.b;
        }
        int i = 0;
        try {
            int length = dVarArr.length;
            while (i < length) {
                com.flurry.a.b.a.d.g.d dVar = dVarArr[i];
                if (dVar != null) {
                    dVar.a(obj, eVar, awVar);
                }
                i++;
            }
            if (this.d != null) {
                this.d.a(obj, eVar, awVar);
            }
        } catch (Exception e) {
            a(awVar, e, obj, i == dVarArr.length ? "[anySetter]" : dVarArr[i].d());
        } catch (StackOverflowError e2) {
            com.flurry.a.b.a.d.y yVar = new com.flurry.a.b.a.d.y("Infinite recursion (StackOverflowError)");
            yVar.a(new com.flurry.a.b.a.d.z(obj, i == dVarArr.length ? "[anySetter]" : dVarArr[i].d()));
            throw yVar;
        }
    }

    protected final void c(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        com.flurry.a.b.a.d.g.d[] dVarArr;
        if (this.c != null && awVar.a() != null) {
            dVarArr = this.c;
        } else {
            dVarArr = this.b;
        }
        Object obj2 = this.e;
        com.flurry.a.b.a.d.g.j b = awVar.b();
        if (b == null) {
            throw new com.flurry.a.b.a.d.y("Can not resolve BeanPropertyFilter with id '" + obj2 + "'; no FilterProvider configured");
        }
        if (b.a() == null) {
            b(obj, eVar, awVar);
            return;
        }
        int i = 0;
        try {
            while (i < dVarArr.length) {
                i++;
            }
            if (this.d != null) {
                this.d.a(obj, eVar, awVar);
            }
        } catch (Exception e) {
            a(awVar, e, obj, i == dVarArr.length ? "[anySetter]" : dVarArr[i].d());
        } catch (StackOverflowError e2) {
            com.flurry.a.b.a.d.y yVar = new com.flurry.a.b.a.d.y("Infinite recursion (StackOverflowError)");
            yVar.a(new com.flurry.a.b.a.d.z(obj, i == dVarArr.length ? "[anySetter]" : dVarArr[i].d()));
            throw yVar;
        }
    }

    @Override // com.flurry.a.b.a.d.ar
    public final void a(com.flurry.a.b.a.d.aw awVar) {
        com.flurry.a.b.a.d.g.d dVar;
        int length = this.c == null ? 0 : this.c.length;
        int length2 = this.b.length;
        for (int i = 0; i < length2; i++) {
            com.flurry.a.b.a.d.g.d dVar2 = this.b[i];
            if (!dVar2.e()) {
                com.flurry.a.b.a.g.a f = dVar2.f();
                if (f == null) {
                    f = awVar.a(dVar2.g());
                    if (!f.u()) {
                        if (f.f() || f.h() > 0) {
                            dVar2.a(f);
                        }
                    }
                }
                com.flurry.a.b.a.d.ac a2 = awVar.a(f, dVar2);
                com.flurry.a.b.a.d.ac acVar = a2;
                if (f.f()) {
                    com.flurry.a.b.a.d.az azVar = (com.flurry.a.b.a.d.az) f.g().o();
                    acVar = a2;
                    if (azVar != null) {
                        boolean z = a2 instanceof e;
                        acVar = a2;
                        if (z) {
                            e eVar = (e) a2;
                            acVar = eVar;
                            if (azVar != null) {
                                acVar = eVar.a(azVar);
                            }
                        }
                    }
                }
                this.b[i] = dVar2.a(acVar);
                if (i < length && (dVar = this.c[i]) != null) {
                    this.c[i] = dVar.a(acVar);
                }
            }
        }
        if (this.d != null) {
            this.d.a(awVar);
        }
    }
}
