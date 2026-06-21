package com.censivn.C3DEngine.b.g.a;

import com.censivn.C3DEngine.b.g.v;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class a extends c {
    private x c;
    private com.censivn.C3DEngine.b.f.a.b d;
    private int e;
    private long f;
    private long g;
    private Runnable h;
    private v i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;

    public a(com.censivn.C3DEngine.b.f.a.b bVar, int i, x xVar) {
        xVar.a(bVar);
        bVar.setTweenChild(this);
        this.d = bVar;
        this.e = i;
        this.c = xVar;
        this.i = xVar.e();
        b();
    }

    @Override // com.censivn.C3DEngine.b.g.a.c
    public x a() {
        return this.c;
    }

    public void b() {
        if (this.c.b) {
            this.j = this.d.m.x;
        }
        if (this.c.c) {
            this.k = this.d.m.y;
        }
        if (this.c.d) {
            this.l = this.d.m.z;
        }
        if (this.c.e) {
            this.m = this.d.n.x;
        }
        if (this.c.f) {
            this.n = this.d.n.y;
        }
        if (this.c.g) {
            this.o = this.d.n.z;
        }
        if (this.c.h) {
            this.p = this.d.o.x;
        }
        if (this.c.i) {
            this.q = this.d.o.y;
        }
        if (this.c.j) {
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
                w.b(this);
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
            float f = this.g / this.e;
            float a = this.i.a(f);
            a(a);
            this.c.b(f);
            this.c.a(a);
            this.d.f();
        }
    }

    private void a(float f) {
        if (this.c.b) {
            this.d.m.x = this.j + ((this.c.m - this.j) * f);
        }
        if (this.c.c) {
            this.d.m.y = this.k + ((this.c.n - this.k) * f);
        }
        if (this.c.d) {
            this.d.m.z = this.l + ((this.c.o - this.l) * f);
        }
        if (this.c.e) {
            this.d.n.x = this.m + ((this.c.p - this.m) * f);
        }
        if (this.c.f) {
            this.d.n.y = this.n + ((this.c.q - this.n) * f);
        }
        if (this.c.g) {
            this.d.n.z = this.o + ((this.c.r - this.o) * f);
        }
        if (this.c.h) {
            this.d.o.x = this.p + ((this.c.s - this.p) * f);
        }
        if (this.c.i) {
            this.d.o.y = this.q + ((this.c.t - this.q) * f);
        }
        if (this.c.j) {
            this.d.o.z = this.r + ((this.c.u - this.r) * f);
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
