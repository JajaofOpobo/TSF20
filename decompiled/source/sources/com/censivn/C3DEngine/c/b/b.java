package com.censivn.C3DEngine.c.b;

import com.censivn.C3DEngine.c.a.d;
import com.censivn.C3DEngine.c.a.e;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b extends d implements com.censivn.C3DEngine.c.b {
    private ArrayList<com.censivn.C3DEngine.c.a.a.b> b;
    private ArrayList<com.censivn.C3DEngine.c.a.a.a> c;
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

    public b(float f, float f2) {
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = f;
        a(f2);
    }

    public b() {
        this(1.0f, 0.0f);
    }

    public ArrayList<com.censivn.C3DEngine.c.a.a.b> b() {
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

    @Override // com.censivn.C3DEngine.c.a.d, com.censivn.C3DEngine.c.b
    public void a(com.censivn.C3DEngine.c.a.c cVar) {
        super.a(cVar);
        c();
        d();
        b(this.g);
    }

    @Override // com.censivn.C3DEngine.c.b
    public void a() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.c.get(i).a();
        }
        int size2 = this.b.size();
        for (int i2 = 0; i2 < size2; i2++) {
            com.censivn.C3DEngine.c.a.a.b bVar = this.b.get(i2);
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
        ArrayList<e> a = this.a.a();
        int size = a.size();
        this.b = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            e eVar = a.get(i);
            com.censivn.C3DEngine.c.a.a.b bVar = new com.censivn.C3DEngine.c.a.a.b(eVar);
            eVar.a(bVar);
            this.b.add(bVar);
        }
    }

    private void d() {
        ArrayList<com.censivn.C3DEngine.c.a.a> b = this.a.b();
        int size = b.size();
        this.c = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ArrayList<e> a = b.get(i).a();
            int size2 = a.size();
            for (int i2 = 0; i2 < size2 - 1; i2++) {
                a(a.get(i2).f(), a.get(i2 + 1).f());
                if (i2 > 1) {
                    a(a.get(0).f(), a.get(i2).f());
                }
            }
            a(a.get(size2 - 1).f(), a.get(0).f());
        }
    }

    private void a(com.censivn.C3DEngine.c.a.a.b bVar, com.censivn.C3DEngine.c.a.a.b bVar2) {
        this.c.add(new com.censivn.C3DEngine.c.a.a.a(bVar, bVar2, bVar.a(bVar2), this.g));
    }
}
