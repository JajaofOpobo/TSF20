package com.censivn.C3DEngine.c.a.a;

import com.censivn.C3DEngine.c.a.e;
/* loaded from: classes.dex */
public class b {
    public float a;
    public float b;
    public float c;
    public boolean d = true;
    public boolean e = true;
    public boolean f = true;
    private e g;
    private float h;
    private float i;
    private float j;

    public b(e eVar) {
        this.g = eVar;
        a(this.g.a(), this.g.b(), this.g.c());
    }

    public void a(float f, float f2, float f3) {
        this.a = f;
        this.h = f;
        this.b = f2;
        this.i = f2;
        this.c = f3;
        this.j = f3;
        this.g.a(f);
        this.g.b(f2);
        this.g.c(f3);
    }

    public void a() {
        if (this.d) {
            float b = b();
            a(b() + e());
            this.a = b;
        }
        if (this.e) {
            float c = c();
            b(c() + f());
            this.b = c;
        }
        if (this.f) {
            float d = d();
            c(d() + g());
            this.c = d;
        }
    }

    public float b() {
        return this.h;
    }

    public void a(float f) {
        this.h = f;
        if (!this.d) {
            this.a = f;
        }
        this.g.a(f);
    }

    public float c() {
        return this.i;
    }

    public void b(float f) {
        this.i = f;
        if (!this.e) {
            this.b = f;
        }
        this.g.b(f);
    }

    public float d() {
        return this.j;
    }

    public void c(float f) {
        this.j = f;
        if (!this.f) {
            this.c = f;
        }
        this.g.c(f);
    }

    public float e() {
        return this.h - this.a;
    }

    public void d(float f) {
        this.a = this.h - f;
    }

    public float f() {
        return this.i - this.b;
    }

    public void e(float f) {
        this.b = this.i - f;
    }

    public float g() {
        return this.j - this.c;
    }

    public void f(float f) {
        this.c = this.j - f;
    }

    public float a(b bVar) {
        return (float) Math.sqrt(((b() - bVar.b()) * (b() - bVar.b())) + ((c() - bVar.c()) * (c() - bVar.c())) + ((d() - bVar.d()) * (d() - bVar.d())));
    }
}
