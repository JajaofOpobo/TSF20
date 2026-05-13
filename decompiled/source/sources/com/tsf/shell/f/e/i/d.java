package com.tsf.shell.f.e.i;
/* loaded from: classes.dex */
public class d {
    private com.censivn.C3DEngine.b.f.a.b a;
    private float b = 0.0f;
    private float c = 0.0f;
    private float d = 0.0f;
    private float e = 0.0f;
    private float f = 0.0f;
    private float g = 0.0f;
    private float h = 0.0f;
    private float i = 0.0f;

    public d(com.censivn.C3DEngine.b.f.a.b bVar) {
        this.a = bVar;
    }

    public void a() {
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.e = 0.0f;
        this.a.a(255.0f);
        float random = (float) Math.random();
        this.a.k().setAll(random, random, random);
        this.a.c(0, 0, 1, 1);
        this.a.h();
        this.f = a(1.0f, 5.0f);
        this.g = a(1.0f, 5.0f);
        this.h = a(5.0f, 15.0f);
        this.i = a(10.0f, 10.0f);
        this.a.i().spX(this.b);
        this.a.i().spY(this.c);
        this.a.i().spZ(this.d);
        this.a.j().z = this.e;
        this.a.h();
    }

    public float a(float f, float f2) {
        float random = (float) (Math.random() * f2);
        float f3 = Math.random() > 0.5d ? 1.0f : -1.0f;
        return (f3 * f) + (random * f3);
    }

    public boolean b() {
        this.f *= 0.98f;
        this.b += this.f;
        this.g -= 0.05f;
        this.g *= 0.98f;
        this.c += this.g;
        this.h *= 0.98f;
        this.d += this.h;
        this.i = 0.98f * this.i;
        this.e += this.i;
        this.a.i().spX(this.b);
        this.a.i().spY(this.c);
        this.a.i().spZ(this.d);
        this.a.j().z = this.e;
        this.a.h();
        return true;
    }
}
