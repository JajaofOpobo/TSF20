package com.censivn.C3DEngine.b.h.a;
/* loaded from: classes.dex */
public class b {
    private com.censivn.C3DEngine.b.f.a.b a;
    private float b = 0.0f;
    private float c = 0.0f;
    private float d = 0.0f;
    private float e = 0.0f;
    private float f = 0.0f;
    private float g = 0.0f;

    public b(com.censivn.C3DEngine.b.f.a.b bVar) {
        this.a = bVar;
        float random = (float) Math.random();
        this.a.k().setAll(random, random, random);
        this.a.c(0, 0, 1, 1);
        this.a.h();
        c();
    }

    public void a() {
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        c();
        this.a.i().spX(0.0f);
        this.a.i().spY(0.0f);
        this.a.i().spZ(0.0f);
        this.a.a(255.0f);
        this.a.h();
    }

    private void c() {
        this.e = a(3.0f, 3.0f);
        this.f = a(3.0f, 3.0f);
        this.g = a(8.0f, 8.0f);
    }

    public void a(int i) {
        this.a.H.set(i);
        this.a.h();
    }

    public float a(float f, float f2) {
        float random = (float) (Math.random() * f2);
        float f3 = Math.random() > 0.5d ? 1.0f : -1.0f;
        return (f3 * f) + (random * f3);
    }

    public boolean b() {
        this.e *= 0.98f;
        this.b += this.e;
        this.f -= 0.05f;
        this.f *= 0.98f;
        this.c += this.f;
        this.g = 0.98f * this.g;
        this.d += this.g;
        float abs = Math.abs(this.e);
        if (abs < 2.0f && abs >= 1.0f) {
            this.a.a(((abs - 1.0f) / 1.0f) * 255.0f);
        }
        this.a.i().spX(this.b);
        this.a.i().spY(this.c);
        this.a.i().spZ(this.d);
        this.a.h();
        return Math.abs(this.e) >= 1.0f;
    }
}
