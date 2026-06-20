package com.censivn.C3DEngine.c.a.a;

import com.censivn.C3DEngine.c.a.ParticleData;

/* loaded from: classes.dex */
public final class b {
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

    public final void a(float f, float f2, float f3) {
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

    public final void a() {
        if (this.d) {
            float f = this.h;
            a(this.h + e());
            this.a = f;
        }
        if (this.e) {
            float f2 = this.i;
            b(this.i + f());
            this.b = f2;
        }
        if (this.f) {
            float f3 = this.j;
            c(this.j + g());
            this.c = f3;
        }
    }

    public final float b() {
        return this.h;
    }

    public final void a(float f) {
        this.h = f;
        if (!this.d) {
            this.a = f;
        }
        this.g.a(f);
    }

    public final float c() {
        return this.i;
    }

    public final void b(float f) {
        this.i = f;
        if (!this.e) {
            this.b = f;
        }
        this.g.b(f);
    }

    public final float d() {
        return this.j;
    }

    public final void c(float f) {
        this.j = f;
        if (!this.f) {
            this.c = f;
        }
        this.g.c(f);
    }

    public final float e() {
        return this.h - this.a;
    }

    public final void d(float f) {
        this.a = this.h - f;
    }

    public final float f() {
        return this.i - this.b;
    }

    public final void e(float f) {
        this.b = this.i - f;
    }

    public final float g() {
        return this.j - this.c;
    }

    public final void f(float f) {
        this.c = this.j - f;
    }

    public final float a(b bVar) {
        return (float) Math.sqrt(((this.h - bVar.h) * (this.h - bVar.h)) + ((this.i - bVar.i) * (this.i - bVar.i)) + ((this.j - bVar.j) * (this.j - bVar.j)));
    }
}
