package com.censivn.C3DEngine.c.b;

import com.censivn.C3DEngine.c.a.BaseParticle;
import com.censivn.C3DEngine.c.a.ParticleData;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SpringPhysicsSystem extends BaseParticle implements IPhysicsSystem {
    private ArrayList<com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint> b;
    private ArrayList<com.censivn.C3DEngine.c.a.spring.SpringConstraint> c;
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

    public SpringPhysicsSystem(float f, float f2) {
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = f;
        a(f2);
    }

    public SpringPhysicsSystem() {
        this(1.0f, 0.0f);
    }

    public ArrayList<com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint> b() {
        return this.b;
    }

    public void a(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.h = (f / 100.0f) + 1.0f;
    }

    public void b(float f) {
        int size = this.c.size();
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.g = f;
        float f2 = f * 0.5f;
        for (int i = 0; i < size; i++) {
            this.c.get(i).a(f2);
        }
    }

    public void c(float f) {
        this.e = f;
    }

    public void d(float f) {
        this.f = f;
    }

    @Override // com.censivn.C3DEngine.c.a.BaseParticle, com.censivn.C3DEngine.c.IPhysicsSystem
    public void a(com.censivn.C3DEngine.c.a.Particle cVar) {
        super.a(cVar);
        c();
        d();
        b(this.g);
    }

    @Override // com.censivn.C3DEngine.c.IPhysicsSystem
    public void a() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.c.get(i).a();
        }
        int size2 = this.b.size();
        for (int i2 = 0; i2 < size2; i2++) {
            com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint bVar = this.b.get(i2);
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

    private void c() {
        ArrayList<ParticleData> arrayListA = this.a.a();
        int size = arrayListA.size();
        this.b = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ParticleData eVar = arrayListA.get(i);
            com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint bVar = new com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint(eVar);
            eVar.a(bVar);
            this.b.add(bVar);
        }
    }

    private void d() {
        ArrayList<com.censivn.C3DEngine.c.a.ConstraintList> arrayListB = this.a.b();
        int size = arrayListB.size();
        this.c = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ArrayList<ParticleData> arrayListA = arrayListB.get(i).a();
            int size2 = arrayListA.size();
            for (int i2 = 0; i2 < size2 - 1; i2++) {
                a(arrayListA.get(i2).f(), arrayListA.get(i2 + 1).f());
                if (i2 > 1) {
                    a(arrayListA.get(0).f(), arrayListA.get(i2).f());
                }
            }
            a(arrayListA.get(size2 - 1).f(), arrayListA.get(0).f());
        }
    }

    private void a(com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint bVar, com.censivn.C3DEngine.c.a.spring.DampedSpringConstraint bVar2) {
        this.c.add(new com.censivn.C3DEngine.c.a.spring.SpringConstraint(bVar, bVar2, bVar.a(bVar2), this.g));
    }
}
