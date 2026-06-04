package com.flurry.a.a.a.c;

/* loaded from: classes.dex */
public class x extends y {
    static final /* synthetic */ boolean b;
    private p d;

    static {
        b = !x.class.desiredAssertionStatus();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    x(com.flurry.a.a.a.c cVar, com.flurry.a.a.a.c cVar2) {
        this(new com.flurry.a.a.a.c.a.c().a(cVar, cVar2));
        if (cVar == null) {
            throw new NullPointerException("writer cannot be null!");
        }
        if (cVar2 == null) {
            throw new NullPointerException("reader cannot be null!");
        }
    }

    private x(Object obj) {
        super((com.flurry.a.a.a.c.a.g) obj);
    }

    public final com.flurry.a.a.a.m[] u() {
        return ((com.flurry.a.a.a.c.a.l) this.a.a(com.flurry.a.a.a.c.a.g.s)).z;
    }

    public final void v() {
        this.a.a();
    }

    @Override // com.flurry.a.a.a.c.y, com.flurry.a.a.a.c.p
    public final long e() {
        com.flurry.a.a.a.c.a.g a = this.a.a(com.flurry.a.a.a.c.a.g.f);
        if (a == com.flurry.a.a.a.c.a.g.e) {
            return this.c.d();
        }
        if (a == com.flurry.a.a.a.c.a.g.h) {
            return (long) this.c.g();
        }
        if (b || a == com.flurry.a.a.a.c.a.g.f) {
            return this.c.e();
        }
        throw new AssertionError();
    }

    @Override // com.flurry.a.a.a.c.y, com.flurry.a.a.a.c.p
    public final float f() {
        com.flurry.a.a.a.c.a.g a = this.a.a(com.flurry.a.a.a.c.a.g.g);
        if (a == com.flurry.a.a.a.c.a.g.e) {
            return this.c.d();
        }
        if (a == com.flurry.a.a.a.c.a.g.f) {
            return this.c.e();
        }
        if (b || a == com.flurry.a.a.a.c.a.g.g) {
            return this.c.f();
        }
        throw new AssertionError();
    }

    @Override // com.flurry.a.a.a.c.y, com.flurry.a.a.a.c.p
    public final double g() {
        com.flurry.a.a.a.c.a.g a = this.a.a(com.flurry.a.a.a.c.a.g.h);
        if (a == com.flurry.a.a.a.c.a.g.e) {
            return this.c.d();
        }
        if (a == com.flurry.a.a.a.c.a.g.f) {
            return this.c.e();
        }
        if (a == com.flurry.a.a.a.c.a.g.g) {
            return this.c.f();
        }
        if (b || a == com.flurry.a.a.a.c.a.g.h) {
            return this.c.g();
        }
        throw new AssertionError();
    }

    @Override // com.flurry.a.a.a.c.y, com.flurry.a.a.a.c.p
    public final int k() {
        this.a.a(com.flurry.a.a.a.c.a.g.l);
        com.flurry.a.a.a.c.a.j jVar = (com.flurry.a.a.a.c.a.j) this.a.c();
        Object obj = jVar.z[this.c.k()];
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        throw new com.flurry.a.a.a.b((String) obj);
    }

    @Override // com.flurry.a.a.a.c.y, com.flurry.a.a.a.c.p
    public final int r() {
        this.a.a(com.flurry.a.a.a.c.a.g.m);
        com.flurry.a.a.a.c.a.x xVar = (com.flurry.a.a.a.c.a.x) this.a.c();
        this.a.c(xVar.B);
        return xVar.z;
    }

    @Override // com.flurry.a.a.a.c.y, com.flurry.a.a.a.c.a.b
    public final com.flurry.a.a.a.c.a.g a(com.flurry.a.a.a.c.a.g gVar, com.flurry.a.a.a.c.a.g gVar2) {
        if (gVar2 instanceof com.flurry.a.a.a.c.a.l) {
            if (gVar == com.flurry.a.a.a.c.a.g.s) {
                return gVar2;
            }
            return null;
        }
        if (gVar2 instanceof com.flurry.a.a.a.c.a.r) {
            com.flurry.a.a.a.c.a.r rVar = (com.flurry.a.a.a.c.a.r) gVar2;
            if (rVar.B != gVar) {
                throw new com.flurry.a.a.a.b("Found " + rVar.B + " while looking for " + gVar);
            }
            return rVar.z;
        }
        if (gVar2 instanceof com.flurry.a.a.a.c.a.v) {
            this.a.d(((com.flurry.a.a.a.c.a.v) gVar2).z);
        } else if (gVar2 instanceof com.flurry.a.a.a.c.a.y) {
            this.a.c(((com.flurry.a.a.a.c.a.h) this.a.c()).a(this.c.r()));
        } else {
            if (gVar2 instanceof com.flurry.a.a.a.c.a.k) {
                throw new com.flurry.a.a.a.b(((com.flurry.a.a.a.c.a.k) gVar2).z);
            }
            if (gVar2 instanceof com.flurry.a.a.a.c.a.i) {
                this.d = this.c;
                q.a();
                this.c = q.a(((com.flurry.a.a.a.c.a.i) gVar2).z, (f) null);
            } else if (gVar2 == com.flurry.a.a.a.c.a.g.x) {
                this.c = this.d;
            } else {
                throw new com.flurry.a.a.a.b("Unknown action: " + gVar2);
            }
        }
        return null;
    }

    @Override // com.flurry.a.a.a.c.w, com.flurry.a.a.a.c.a.f
    public final void s() {
        com.flurry.a.a.a.c.a.g c = this.a.c();
        if (c instanceof com.flurry.a.a.a.c.a.r) {
            this.a.c(((com.flurry.a.a.a.c.a.r) c).z);
            return;
        }
        if (c instanceof com.flurry.a.a.a.c.a.v) {
            this.a.c(((com.flurry.a.a.a.c.a.v) c).z);
            return;
        }
        if (c instanceof com.flurry.a.a.a.c.a.y) {
            this.a.c(((com.flurry.a.a.a.c.a.h) this.a.c()).a(this.c.r()));
        } else {
            if (c instanceof com.flurry.a.a.a.c.a.k) {
                throw new com.flurry.a.a.a.b(((com.flurry.a.a.a.c.a.k) c).z);
            }
            if (c instanceof com.flurry.a.a.a.c.a.i) {
                this.d = this.c;
                q.a();
                this.c = q.a(((com.flurry.a.a.a.c.a.i) c).z, (f) null);
            } else if (c == com.flurry.a.a.a.c.a.g.x) {
                this.c = this.d;
            }
        }
    }
}
