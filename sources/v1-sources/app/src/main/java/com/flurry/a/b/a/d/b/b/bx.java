package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
public final class bx extends com.flurry.a.b.a.d.b.v {
    protected final String a;
    protected final boolean b;
    protected com.flurry.a.b.a.d.e.i c;
    protected com.flurry.a.b.a.d.b.a.e[] d;
    protected com.flurry.a.b.a.d.e.i e;
    protected com.flurry.a.b.a.g.a f;
    protected com.flurry.a.b.a.d.e.i g;
    protected com.flurry.a.b.a.d.e.i h;
    protected com.flurry.a.b.a.d.e.i i;
    protected com.flurry.a.b.a.d.e.i j;
    protected com.flurry.a.b.a.d.e.i k;
    protected com.flurry.a.b.a.d.e.i l;

    public bx(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.g.a aVar) {
        this.b = nVar == null ? false : nVar.a(com.flurry.a.b.a.d.o.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        this.a = aVar == null ? "UNKNOWN TYPE" : aVar.toString();
    }

    public final void a(com.flurry.a.b.a.d.e.i iVar, com.flurry.a.b.a.d.e.i iVar2, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.e.i iVar3, com.flurry.a.b.a.d.b.a.e[] eVarArr) {
        this.c = iVar;
        this.g = iVar2;
        this.f = aVar;
        this.e = iVar3;
        this.d = eVarArr;
    }

    public final void a(com.flurry.a.b.a.d.e.i iVar) {
        this.h = iVar;
    }

    public final void b(com.flurry.a.b.a.d.e.i iVar) {
        this.i = iVar;
    }

    public final void c(com.flurry.a.b.a.d.e.i iVar) {
        this.j = iVar;
    }

    public final void d(com.flurry.a.b.a.d.e.i iVar) {
        this.k = iVar;
    }

    public final void e(com.flurry.a.b.a.d.e.i iVar) {
        this.l = iVar;
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final String a() {
        return this.a;
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final boolean c() {
        return this.h != null;
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final boolean d() {
        return this.i != null;
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final boolean e() {
        return this.j != null;
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final boolean f() {
        return this.k != null;
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final boolean g() {
        return this.l != null;
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final boolean h() {
        return this.c != null;
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final boolean j() {
        return this.e != null;
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final com.flurry.a.b.a.g.a l() {
        return this.f;
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final com.flurry.a.b.a.d.b.k[] k() {
        return this.d;
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final Object m() {
        if (this.c == null) {
            throw new IllegalStateException("No default constructor for " + this.a);
        }
        try {
            return this.c.h();
        } catch (Exception e) {
            throw a((Throwable) e);
        } catch (ExceptionInInitializerError e2) {
            throw a((Throwable) e2);
        }
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final Object a(Object[] objArr) {
        if (this.e == null) {
            throw new IllegalStateException("No with-args constructor for " + this.a);
        }
        try {
            return this.e.a(objArr);
        } catch (Exception e) {
            throw a((Throwable) e);
        } catch (ExceptionInInitializerError e2) {
            throw a((Throwable) e2);
        }
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final Object a(Object obj) {
        if (this.g == null) {
            throw new IllegalStateException("No delegate constructor for " + this.a);
        }
        try {
            return this.g.a(obj);
        } catch (Exception e) {
            throw a((Throwable) e);
        } catch (ExceptionInInitializerError e2) {
            throw a((Throwable) e2);
        }
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final Object a(String str) {
        if (this.h != null) {
            try {
                return this.h.a(str);
            } catch (Exception e) {
                throw a((Throwable) e);
            }
        }
        if (this.l != null) {
            String trim = str.trim();
            if ("true".equals(trim)) {
                return a(true);
            }
            if ("false".equals(trim)) {
                return a(false);
            }
        }
        if (this.b && str.length() == 0) {
            return null;
        }
        throw new com.flurry.a.b.a.d.y("Can not instantiate value of type " + this.a + " from JSON String; no single-String constructor/factory method");
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final Object a(int i) {
        try {
            if (this.i != null) {
                return this.i.a(Integer.valueOf(i));
            }
            if (this.j != null) {
                return this.j.a(Long.valueOf(i));
            }
            throw new com.flurry.a.b.a.d.y("Can not instantiate value of type " + this.a + " from JSON integral number; no single-int-arg constructor/factory method");
        } catch (Exception e) {
            throw a((Throwable) e);
        }
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final Object a(long j) {
        try {
            if (this.j != null) {
                return this.j.a(Long.valueOf(j));
            }
            throw new com.flurry.a.b.a.d.y("Can not instantiate value of type " + this.a + " from JSON long integral number; no single-long-arg constructor/factory method");
        } catch (Exception e) {
            throw a((Throwable) e);
        }
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final Object a(double d) {
        try {
            if (this.k != null) {
                return this.k.a(Double.valueOf(d));
            }
            throw new com.flurry.a.b.a.d.y("Can not instantiate value of type " + this.a + " from JSON floating-point number; no one-double/Double-arg constructor/factory method");
        } catch (Exception e) {
            throw a((Throwable) e);
        }
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final Object a(boolean z) {
        try {
            if (this.l != null) {
                return this.l.a(Boolean.valueOf(z));
            }
            throw new com.flurry.a.b.a.d.y("Can not instantiate value of type " + this.a + " from JSON boolean value; no single-boolean/Boolean-arg constructor/factory method");
        } catch (Exception e) {
            throw a((Throwable) e);
        }
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final com.flurry.a.b.a.d.e.i o() {
        return this.g;
    }

    @Override // com.flurry.a.b.a.d.b.v
    public final com.flurry.a.b.a.d.e.i n() {
        return this.c;
    }

    private com.flurry.a.b.a.d.y a(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return new com.flurry.a.b.a.d.y("Instantiation of " + this.a + " value failed: " + th.getMessage(), th);
    }
}
