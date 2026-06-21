package com.censivn.C3DEngine.c.b;

import com.censivn.C3DEngine.c.a.Particle;
import com.censivn.C3DEngine.c.a.BaseParticle;
import com.censivn.C3DEngine.c.a.ParticleData;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends d implements com.censivn.C3DEngine.c.b {
    private ArrayList b;
    private ArrayList c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;

    public a(float f, float f2) {
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = f;
        this.h = ((f2 < 0.0f ? 0.0f : f2) / 100.0f) + 1.0f;
    }

    public a() {
        this(1.0f, 0.0f);
    }

    public final ArrayList b() {
        return this.b;
    }

    private void d(float f) {
        int size = this.c.size();
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.g = f;
        float f2 = f * 0.5f;
        for (int i = 0; i < size; i++) {
            ((com.censivn.C3DEngine.c.a.spring.SpringConstraint) this.c.get(i)).a(f2);
        }
    }

    public final void a(float f) {
        this.d = f;
    }

    public final void b(float f) {
        this.e = f;
    }

    public final void c(float f) {
        this.f = f;
    }

    public final void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint bVar = (com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint) this.b.get(i);
            bVar.d = true;
            bVar.e = true;
            bVar.f = true;
        }
    }

    public final void d() {
        a(this.a.d(), "x");
    }

    public final void e() {
        a(this.a.f(), "x");
    }

    public final void f() {
        a(this.a.e(), "y");
    }

    public final void g() {
        a(this.a.g(), "y");
    }

    private void a(float f, String str) {
        float d;
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint bVar = (com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint) this.b.get(i);
            if (str.equals("x")) {
                d = bVar.b();
            } else if (str.equals("y")) {
                d = bVar.c();
            } else {
                d = bVar.d();
            }
            if (Math.abs(d - f) <= 0.0f) {
                bVar.d = false;
                bVar.e = false;
                bVar.f = false;
            }
        }
    }

    @Override // com.censivn.C3DEngine.c.a.BaseParticle, com.censivn.C3DEngine.c.b
    public final void a(c cVar) {
        super.a(cVar);
        ArrayList a = this.a.a();
        int size = a.size();
        this.b = new ArrayList();
        for (int i = 0; i < size; i++) {
            e eVar = (e) a.get(i);
            com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint bVar = new com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint(eVar);
            eVar.a(bVar);
            this.b.add(bVar);
        }
        h();
        d(this.g);
    }

    @Override // com.censivn.C3DEngine.c.b
    public final void a() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ((com.censivn.C3DEngine.c.a.spring.SpringConstraint) this.c.get(i)).a();
        }
        int size2 = this.b.size();
        for (int i2 = 0; i2 < size2; i2++) {
            com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint bVar = (com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint) this.b.get(i2);
            if (bVar.d) {
                bVar.a(bVar.b() + this.d);
            }
            if (bVar.e) {
                bVar.b(bVar.c() + this.e);
            }
            if (bVar.f) {
                bVar.c(bVar.d() + this.f);
            }
            bVar.d(bVar.e() / this.h);
            bVar.e(bVar.f() / this.h);
            bVar.f(bVar.g() / this.h);
            if (this.i) {
                if (bVar.b() < this.j) {
                    bVar.a(this.j);
                } else if (bVar.b() > this.k) {
                    bVar.a(this.k);
                }
                if (bVar.c() < this.l) {
                    bVar.b(this.l);
                } else if (bVar.c() > this.m) {
                    bVar.b(this.m);
                }
                if (bVar.d() < this.n) {
                    bVar.c(this.n);
                } else if (bVar.d() > this.o) {
                    bVar.c(this.o);
                }
            }
            bVar.a();
        }
    }

    private void h() {
        ArrayList b = this.a.b();
        int size = b.size();
        this.c = new ArrayList();
        for (int i = 0; i < size; i++) {
            ArrayList a = ((com.censivn.C3DEngine.c.a.spring) b.get(i)).a();
            int size2 = a.size();
            for (int i2 = 0; i2 < size2 - 1; i2++) {
                a(((e) a.get(i2)).f(), ((e) a.get(i2 + 1)).f());
                if (i2 > 1) {
                    a(((e) a.get(0)).f(), ((e) a.get(i2)).f());
                }
            }
            a(((e) a.get(size2 - 1)).f(), ((e) a.get(0)).f());
        }
    }

    private void a(com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint bVar, com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint bVar2) {
        this.c.add(new com.censivn.C3DEngine.c.a.spring.SpringConstraint(bVar, bVar2, bVar.a(bVar2), this.g));
    }
}
