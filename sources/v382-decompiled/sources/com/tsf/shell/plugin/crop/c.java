package com.tsf.shell.plugin.crop;

/* loaded from: classes.dex */
public class c {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    private d m;

    public void a(d dVar) {
        this.m = dVar;
    }

    public void a(c cVar, c cVar2) {
        float f = this.a - cVar.a;
        float f2 = this.b - cVar.b;
        float f3 = this.c - cVar.a;
        float f4 = this.d - cVar.b;
        cVar2.b(f, f2, f3, f4);
        cVar2.i = f / cVar.g;
        cVar2.j = f2 / cVar.h;
        cVar2.k = f3 / cVar.g;
        cVar2.l = f4 / cVar.h;
    }

    public void b(c cVar, c cVar2) {
        b(cVar.a + (cVar.g * cVar2.i), cVar.b + (cVar.h * cVar2.j), cVar.a + (cVar.g * cVar2.k), cVar.b + (cVar.h * cVar2.l));
    }

    public void a(float f, float f2) {
        this.e = f;
        this.f = f2;
        d();
    }

    public void a(float f) {
        this.e = f;
        d();
    }

    public void b(float f) {
        this.f = f;
        d();
    }

    public void c(float f) {
        this.g = f;
        d();
    }

    public void d(float f) {
        this.h = f;
        d();
    }

    public void e(float f) {
        this.a = f;
        c();
    }

    public void f(float f) {
        this.b = f;
        c();
    }

    public void g(float f) {
        this.d = f;
        c();
    }

    public void h(float f) {
        this.c = f;
        c();
    }

    public void a(c cVar) {
        this.e = cVar.e;
        this.f = cVar.f;
        this.g = cVar.g;
        this.h = cVar.h;
        d();
    }

    public void a(float f, float f2, float f3, float f4) {
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        d();
    }

    public void b(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        c();
    }

    private void c() {
        this.e = this.a;
        this.f = this.b;
        this.g = this.c - this.a;
        this.h = this.d - this.b;
        if (this.m != null) {
            this.m.a();
        }
    }

    private void d() {
        this.a = this.e;
        this.b = this.f;
        this.c = this.e + this.g;
        this.d = this.f + this.h;
        if (this.m != null) {
            this.m.a();
        }
    }

    public float a() {
        return this.e + (this.g / 2.0f);
    }

    public float b() {
        return this.f + (this.h / 2.0f);
    }
}
