package com.censivn.C3DEngine.b.g;
/* loaded from: classes.dex */
public class d {
    public int A;
    public int B;
    private Object a;
    private b b;
    private Runnable c;
    private Runnable d;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public void a(Object obj) {
        this.a = obj;
    }

    public Object d() {
        return this.a;
    }

    public void a() {
    }

    public void a(b bVar) {
        this.b = bVar;
    }

    public b e() {
        return this.b;
    }

    public void a(float f) {
    }

    public void b(float f) {
    }

    public void b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        c();
        if (this.d != null) {
            this.d.run();
        }
    }

    public void c() {
    }

    public void a(Runnable runnable) {
        this.c = runnable;
    }

    public void b(Runnable runnable) {
        this.d = runnable;
    }

    public Runnable g() {
        return this.c;
    }

    public void c(float f) {
        this.j = true;
        this.u = f;
    }

    public void d(float f) {
        this.k = true;
        this.v = f;
    }

    public void e(float f) {
        this.l = true;
        this.w = f;
    }

    public void f(float f) {
        this.g = true;
        this.r = f;
    }

    public void g(float f) {
        this.g = true;
        this.r = com.censivn.C3DEngine.b.b.a.a * f;
    }

    public void h(float f) {
        this.h = true;
        this.s = f;
    }

    public void i(float f) {
        this.h = true;
        this.s = com.censivn.C3DEngine.b.b.a.a * f;
    }

    public void j(float f) {
        this.i = true;
        this.t = f;
    }

    public void k(float f) {
        this.i = true;
        this.t = com.censivn.C3DEngine.b.b.a.a * f;
    }

    public void l(float f) {
        this.m = true;
        this.x = f;
    }

    public void m(float f) {
        this.n = true;
        this.y = f;
    }

    public void n(float f) {
        this.o = true;
        this.z = f;
    }

    public void a(int i) {
        this.p = true;
        this.A = i;
    }

    public void b(int i) {
        this.q = true;
        this.B = i;
    }
}
