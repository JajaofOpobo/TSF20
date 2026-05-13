package com.censivn.C3DEngine.b.g.a;

import com.censivn.C3DEngine.b.f.i;
/* loaded from: classes.dex */
public class b extends c {
    private com.censivn.C3DEngine.b.g.d c;
    private i d;
    private int e;
    private long f = 0;
    private long g = 0;
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
    private float s;

    public b(i iVar, int i, com.censivn.C3DEngine.b.g.d dVar) {
        this.e = 0;
        dVar.a(iVar);
        iVar.setTweenChild(this);
        this.d = iVar;
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
            this.j = this.d.position().x;
        }
        if (this.c.h) {
            this.k = this.d.position().y;
        }
        if (this.c.i) {
            this.l = this.d.position().z;
        }
        if (this.c.j) {
            this.m = this.d.rotation().x;
        }
        if (this.c.k) {
            this.n = this.d.rotation().y;
        }
        if (this.c.l) {
            this.o = this.d.rotation().z;
        }
        if (this.c.m) {
            this.p = this.d.scale().x;
        }
        if (this.c.n) {
            this.q = this.d.scale().y;
        }
        if (this.c.o) {
            this.r = this.d.scale().z;
        }
        if (this.c.p) {
            this.s = this.d.alpha();
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
            if (this.g >= this.e || this.g < 0) {
                this.g = this.e;
                com.censivn.C3DEngine.b.g.c.b(this);
                a(1.0f);
                this.c.b(1.0f);
                this.c.a(1.0f);
                this.d.setTweenChild(null);
                this.c.a();
                if (this.c.g() != null) {
                    this.c.g().run();
                    return;
                }
                return;
            }
            float f = ((float) this.g) / this.e;
            float a = this.i.a(f);
            a(a);
            this.c.b(f);
            this.c.a(a);
        }
    }

    private void a(float f) {
        if (this.c.g) {
            this.d.position().x = this.j + ((this.c.r - this.j) * f);
        }
        if (this.c.h) {
            this.d.position().y = this.k + ((this.c.s - this.k) * f);
        }
        if (this.c.i) {
            this.d.position().z = this.l + ((this.c.t - this.l) * f);
        }
        if (this.c.j) {
            this.d.rotation().x = this.m + ((this.c.u - this.m) * f);
        }
        if (this.c.k) {
            this.d.rotation().y = this.n + ((this.c.v - this.n) * f);
        }
        if (this.c.l) {
            this.d.rotation().z = this.o + ((this.c.w - this.o) * f);
        }
        if (this.c.m) {
            this.d.scale().x = this.p + ((this.c.x - this.p) * f);
        }
        if (this.c.n) {
            this.d.scale().y = this.q + ((this.c.y - this.q) * f);
        }
        if (this.c.o) {
            this.d.scale().z = this.r + ((this.c.z - this.r) * f);
        }
        if (this.c.p) {
            this.d.alpha(this.s + ((this.c.A - this.s) * f));
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
