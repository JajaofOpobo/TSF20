package com.censivn.C3DEngine.b.g.a;
/* loaded from: classes.dex */
public class a extends c {
    private com.censivn.C3DEngine.b.g.d c;
    private com.censivn.C3DEngine.b.f.a.b d;
    private int e;
    private long f;
    private long g;
    private Runnable h;
    private com.censivn.C3DEngine.b.g.b i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;

    public a(com.censivn.C3DEngine.b.f.a.b bVar, int i, com.censivn.C3DEngine.b.g.d dVar) {
        dVar.a(bVar);
        bVar.setTweenChild(this);
        this.d = bVar;
        this.e = i;
        this.c = dVar;
        this.i = dVar.e();
        b();
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public com.censivn.C3DEngine.b.g.d a() {
        return this.c;
    }

    public void b() {
        if (this.c.g) {
            this.j = this.d.m.x;
        }
        if (this.c.h) {
            this.k = this.d.m.y;
        }
        if (this.c.i) {
            this.l = this.d.m.z;
        }
        if (this.c.j) {
            this.m = this.d.n.x;
        }
        if (this.c.k) {
            this.n = this.d.n.y;
        }
        if (this.c.l) {
            this.o = this.d.n.z;
        }
        if (this.c.m) {
            this.p = this.d.o.x;
        }
        if (this.c.n) {
            this.q = this.d.o.y;
        }
        if (this.c.o) {
            this.r = this.d.o.z;
        }
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public void c() {
        if (this.a == 0 || this.a == 2) {
            if (this.a == 2) {
                this.f = System.currentTimeMillis() - this.g;
                this.a = 0;
            }
            if (this.f == 0) {
                this.f = System.currentTimeMillis();
                this.c.b();
            }
            this.g = (int) (System.currentTimeMillis() - this.f);
            if (this.g >= this.e) {
                this.g = this.e;
                com.censivn.C3DEngine.b.g.c.b(this);
                a(1.0f);
                this.c.b(1.0f);
                this.c.a(1.0f);
                this.d.setTweenChild(null);
                this.c.a();
                if (this.c.g() != null) {
                    this.c.g().run();
                }
                this.d.f();
                return;
            }
            float f = ((float) this.g) / this.e;
            float a = this.i.a(f);
            a(a);
            this.c.b(f);
            this.c.a(a);
            this.d.f();
        }
    }

    private void a(float f) {
        if (this.c.g) {
            this.d.m.x = this.j + ((this.c.r - this.j) * f);
        }
        if (this.c.h) {
            this.d.m.y = this.k + ((this.c.s - this.k) * f);
        }
        if (this.c.i) {
            this.d.m.z = this.l + ((this.c.t - this.l) * f);
        }
        if (this.c.j) {
            this.d.n.x = this.m + ((this.c.u - this.m) * f);
        }
        if (this.c.k) {
            this.d.n.y = this.n + ((this.c.v - this.n) * f);
        }
        if (this.c.l) {
            this.d.n.z = this.o + ((this.c.w - this.o) * f);
        }
        if (this.c.m) {
            this.d.o.x = this.p + ((this.c.x - this.p) * f);
        }
        if (this.c.n) {
            this.d.o.y = this.q + ((this.c.y - this.q) * f);
        }
        if (this.c.o) {
            this.d.o.z = this.r + ((this.c.z - this.r) * f);
        }
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public void a(Runnable runnable) {
        this.h = runnable;
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public Runnable d() {
        return this.h;
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public void e() {
        this.a = 1;
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public void f() {
        this.a = 2;
    }
}
