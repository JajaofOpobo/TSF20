package com.censivn.C3DEngine.b.g;

/* loaded from: classes.dex */
public class x {
    private Object a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public int v;
    public int w;
    private v x;
    private Runnable y;
    private Runnable z;

    public void a(Object obj) {
        this.a = obj;
    }

    public Object d() {
        return this.a;
    }

    public void a() {
    }

    public void a(v vVar) {
        this.x = vVar;
    }

    public v e() {
        return this.x;
    }

    public void a(float f) {
    }

    public void b(float f) {
    }

    public void b() {
    }

    protected void f() {
        c();
        if (this.z != null) {
            this.z.run();
        }
    }

    public void c() {
    }

    public void a(Runnable runnable) {
        this.y = runnable;
    }

    public void b(Runnable runnable) {
        this.z = runnable;
    }

    public Runnable g() {
        return this.y;
    }

    public void c(float f) {
        this.e = true;
        this.p = f;
    }

    public void d(float f) {
        this.f = true;
        this.q = f;
    }

    public void e(float f) {
        this.g = true;
        this.r = f;
    }

    public void f(float f) {
        this.b = true;
        this.m = f;
    }

    public void g(float f) {
        this.b = true;
        this.m = com.censivn.C3DEngine.b.b.a.a * f;
    }

    public void h(float f) {
        this.c = true;
        this.n = f;
    }

    public void i(float f) {
        this.c = true;
        this.n = com.censivn.C3DEngine.b.b.a.a * f;
    }

    public void j(float f) {
        this.d = true;
        this.o = f;
    }

    public void k(float f) {
        this.d = true;
        this.o = com.censivn.C3DEngine.b.b.a.a * f;
    }

    public void l(float f) {
        this.h = true;
        this.s = f;
    }

    public void m(float f) {
        this.i = true;
        this.t = f;
    }

    public void n(float f) {
        this.j = true;
        this.u = f;
    }

    public void a(int i) {
        this.k = true;
        this.v = i;
    }

    public void b(int i) {
        this.l = true;
        this.w = i;
    }
}
