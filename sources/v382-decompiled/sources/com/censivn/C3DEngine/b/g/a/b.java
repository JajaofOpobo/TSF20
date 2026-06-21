package com.censivn.C3DEngine.b.g.a;

import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.v;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class b extends c {
    private x c;
    private j d;
    private int e;
    private long f = 0;
    private long g = 0;
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
    private float s;

    public b(j jVar, int i, x xVar) {
        this.e = 0;
        xVar.a(jVar);
        jVar.setTweenChild(this);
        this.d = jVar;
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
            this.j = this.d.position().x;
        }
        if (this.c.c) {
            this.k = this.d.position().y;
        }
        if (this.c.d) {
            this.l = this.d.position().z;
        }
        if (this.c.e) {
            this.m = this.d.rotation().x;
        }
        if (this.c.f) {
            this.n = this.d.rotation().y;
        }
        if (this.c.g) {
            this.o = this.d.rotation().z;
        }
        if (this.c.h) {
            this.p = this.d.scale().x;
        }
        if (this.c.i) {
            this.q = this.d.scale().y;
        }
        if (this.c.j) {
            this.r = this.d.scale().z;
        }
        if (this.c.k) {
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
                w.b(this);
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
            float f = this.g / this.e;
            float a = this.i.a(f);
            a(a);
            this.c.b(f);
            this.c.a(a);
        }
    }

    private void a(float f) {
        if (this.c.b) {
            this.d.position().x = this.j + ((this.c.m - this.j) * f);
        }
        if (this.c.c) {
            this.d.position().y = this.k + ((this.c.n - this.k) * f);
        }
        if (this.c.d) {
            this.d.position().z = this.l + ((this.c.o - this.l) * f);
        }
        if (this.c.e) {
            this.d.rotation().x = this.m + ((this.c.p - this.m) * f);
        }
        if (this.c.f) {
            this.d.rotation().y = this.n + ((this.c.q - this.n) * f);
        }
        if (this.c.g) {
            this.d.rotation().z = this.o + ((this.c.r - this.o) * f);
        }
        if (this.c.h) {
            this.d.scale().x = this.p + ((this.c.s - this.p) * f);
        }
        if (this.c.i) {
            this.d.scale().y = this.q + ((this.c.t - this.q) * f);
        }
        if (this.c.j) {
            this.d.scale().z = this.r + ((this.c.u - this.r) * f);
        }
        if (this.c.k) {
            this.d.alpha(this.s + ((this.c.v - this.s) * f));
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
