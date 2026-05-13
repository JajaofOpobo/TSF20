package com.tsf.shell.plugin.crop;
/* loaded from: classes.dex */
public class b {
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
    private a m;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public void a(a aVar) {
        this.m = aVar;
    }

    public void a(b bVar, b bVar2) {
        float f = this.a - bVar.a;
        float f2 = this.b - bVar.b;
        float f3 = this.c - bVar.a;
        float f4 = this.d - bVar.b;
        bVar2.b(f, f2, f3, f4);
        bVar2.i = f / bVar.g;
        bVar2.j = f2 / bVar.h;
        bVar2.k = f3 / bVar.g;
        bVar2.l = f4 / bVar.h;
    }

    public void b(b bVar, b bVar2) {
        b(bVar.a + (bVar.g * bVar2.i), bVar.b + (bVar.h * bVar2.j), bVar.a + (bVar.g * bVar2.k), bVar.b + (bVar.h * bVar2.l));
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

    public void a(b bVar) {
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
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
