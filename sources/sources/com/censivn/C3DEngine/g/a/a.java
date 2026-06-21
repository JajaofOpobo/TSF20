package com.censivn.C3DEngine.g.a;

import android.os.Handler;
import com.censivn.C3DEngine.g.r;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;

/* loaded from: classes.dex */
public final class a implements c {
    private u a;
    private com.censivn.C3DEngine.e.a.c b;
    private int c;
    private long d;
    private long e;
    private int f = 1;
    private int g = 2;
    private int h = 0;
    private int i = this.h;
    private Handler j;
    private Runnable k;
    private r l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;

    public a(com.censivn.C3DEngine.e.a.c cVar, int i, u uVar) {
        uVar.a(cVar);
        cVar.a(this);
        this.b = cVar;
        this.c = i;
        this.a = uVar;
        this.l = uVar.c();
        b();
    }

    @Override // com.censivn.C3DEngine.g.a.c
    public final u a() {
        return this.a;
    }

    public final void b() {
        if (this.a.b) {
            this.m = this.b.m.x;
        }
        if (this.a.c) {
            this.n = this.b.m.y;
        }
        if (this.a.d) {
            this.o = this.b.m.z;
        }
        if (this.a.e) {
            this.p = this.b.n.x;
        }
        if (this.a.f) {
            this.q = this.b.n.y;
        }
        if (this.a.g) {
            this.r = this.b.n.z;
        }
        if (this.a.h) {
            this.s = this.b.o.x;
        }
        if (this.a.i) {
            this.t = this.b.o.y;
        }
        if (this.a.j) {
            this.u = this.b.o.z;
        }
    }

    @Override // com.censivn.C3DEngine.g.a.c
    public final void c() {
        if (this.i == this.h || this.i == this.g) {
            if (this.i == this.g) {
                this.d = System.currentTimeMillis() - this.e;
                this.i = this.h;
            }
            if (this.d == 0) {
                this.d = System.currentTimeMillis();
                u uVar = this.a;
            }
            this.e = (int) (System.currentTimeMillis() - this.d);
            if (this.e >= this.c) {
                this.e = this.c;
                s.b(this);
                a(1.0f);
                this.a.b(1.0f);
                this.a.a(1.0f);
                this.b.a((c) null);
                this.a.a();
                if (this.a.d() != null) {
                    this.a.d().run();
                }
                this.b.c();
                return;
            }
            float f = this.e / this.c;
            float a = this.l.a(f);
            a(a);
            this.a.b(f);
            this.a.a(a);
            this.b.c();
        }
    }

    private void a(float f) {
        if (this.a.b) {
            this.b.m.x = this.m + ((this.a.m - this.m) * f);
        }
        if (this.a.c) {
            this.b.m.y = this.n + ((this.a.n - this.n) * f);
        }
        if (this.a.d) {
            this.b.m.z = this.o + ((this.a.o - this.o) * f);
        }
        if (this.a.e) {
            this.b.n.x = this.p + ((this.a.p - this.p) * f);
        }
        if (this.a.f) {
            this.b.n.y = this.q + ((this.a.q - this.q) * f);
        }
        if (this.a.g) {
            this.b.n.z = this.r + ((this.a.r - this.r) * f);
        }
        if (this.a.h) {
            this.b.o.x = this.s + ((this.a.s - this.s) * f);
        }
        if (this.a.i) {
            this.b.o.y = this.t + ((this.a.t - this.t) * f);
        }
        if (this.a.j) {
            this.b.o.z = this.u + ((this.a.u - this.u) * f);
        }
    }

    @Override // com.censivn.C3DEngine.g.a.c
    public final void d() {
        this.j = null;
    }

    @Override // com.censivn.C3DEngine.g.a.c
    public final Handler e() {
        return this.j;
    }

    @Override // com.censivn.C3DEngine.g.a.c
    public final void f() {
        this.k = null;
    }

    @Override // com.censivn.C3DEngine.g.a.c
    public final Runnable g() {
        return this.k;
    }

    @Override // com.censivn.C3DEngine.g.a.c
    public final void h() {
        this.i = this.f;
    }

    @Override // com.censivn.C3DEngine.g.a.c
    public final void i() {
        this.i = this.g;
    }
}
