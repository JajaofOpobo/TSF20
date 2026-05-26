package com.censivn.C3DEngine.b.f.b;

import com.censivn.C3DEngine.b.f.k;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends k {
    private float a;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;

    public a(float f, float f2, b bVar) {
        this(f, f2, com.censivn.C3DEngine.b.b.a.b, bVar);
    }

    public a(float f, float f2, float f3, b bVar) {
        super(f, f2, 3, 3, false);
        this.k = f3;
        a(bVar, false);
        b(this.b, this.c);
    }

    public void a(b bVar) {
        a(bVar, true);
    }

    private void a(b bVar, boolean z) {
        float f = bVar.a;
        float f2 = bVar.b;
        float f3 = bVar.c;
        float f4 = bVar.d;
        float f5 = bVar.e;
        float f6 = bVar.f;
        uvs().set(0, 1.0f, 1.0f);
        uvs().set(3, 0.0f, 1.0f);
        uvs().set(12, 1.0f, 0.0f);
        uvs().set(15, 0.0f, 0.0f);
        uvs().set(1, f2 / f5, 1.0f);
        uvs().set(2, f / f5, 1.0f);
        uvs().set(4, 1.0f, f4 / f6);
        uvs().set(5, f2 / f5, f4 / f6);
        uvs().set(6, f / f5, f4 / f6);
        uvs().set(7, 0.0f, f4 / f6);
        uvs().set(8, 1.0f, f3 / f6);
        uvs().set(9, f2 / f5, f3 / f6);
        uvs().set(10, f / f5, f3 / f6);
        uvs().set(11, 0.0f, f3 / f6);
        uvs().set(13, f2 / f5, 0.0f);
        uvs().set(14, f / f5, 0.0f);
        this.d = f5 - f2;
        this.a = f;
        this.e = f6 - f4;
        this.f = f3;
        if (z) {
            syncUpdateUvsVBO();
        }
    }

    public void b(float f, float f2) {
        this.b = f;
        this.c = f2;
        g();
    }

    @Override // com.censivn.C3DEngine.b.f.k
    public void a(float f) {
        this.b = f;
        g();
    }

    @Override // com.censivn.C3DEngine.b.f.k
    public void b(float f) {
        this.c = f;
        g();
    }

    @Override // com.censivn.C3DEngine.b.f.k
    public float b() {
        return this.b;
    }

    @Override // com.censivn.C3DEngine.b.f.k
    public float c() {
        return this.c;
    }

    public void c(float f, float f2) {
        this.b = (this.d * this.k) + f + (this.a * this.k);
        this.c = (this.e * this.k) + f2 + (this.f * this.k);
        g();
    }

    private void g() {
        float f = this.b / 2.0f;
        this.h = f;
        this.g = f;
        float f2 = this.c / 2.0f;
        this.j = f2;
        this.i = f2;
        float f3 = -f2;
        points().setPX(0, f, f3, 0.0f);
        points().setPX(1, f - (this.d * this.k), f3, 0.0f);
        points().setPX(2, (-f) + (this.a * this.k), f3, 0.0f);
        points().setPX(3, -f, f3, 0.0f);
        float f4 = (-f2) + (this.e * this.k);
        points().setPX(4, f, f4, 0.0f);
        points().setPX(5, f - (this.d * this.k), f4, 0.0f);
        points().setPX(6, (-f) + (this.a * this.k), f4, 0.0f);
        points().setPX(7, -f, f4, 0.0f);
        float f5 = f2 - (this.f * this.k);
        points().setPX(8, f, f5, 0.0f);
        points().setPX(9, f - (this.d * this.k), f5, 0.0f);
        points().setPX(10, (-f) + (this.a * this.k), f5, 0.0f);
        points().setPX(11, -f, f5, 0.0f);
        points().setPX(12, f, f2, 0.0f);
        points().setPX(13, f - (this.d * this.k), f2, 0.0f);
        points().setPX(14, (-f) + (this.a * this.k), f2, 0.0f);
        points().setPX(15, -f, f2, 0.0f);
        syncUpdatePointVBO();
    }

    public float a() {
        return this.i;
    }

    public void c(float f) {
        d(f);
        syncUpdatePointVBO();
    }

    public void d(float f) {
        this.i = f;
        points().pxY(8, f - (this.f * this.k));
        points().pxY(9, f - (this.f * this.k));
        points().pxY(10, f - (this.f * this.k));
        points().pxY(11, f - (this.f * this.k));
        points().pxY(12, f);
        points().pxY(13, f);
        points().pxY(14, f);
        points().pxY(15, f);
    }

    public float d() {
        return this.j;
    }

    public void e(float f) {
        f(f);
        syncUpdatePointVBO();
    }

    public void f(float f) {
        this.j = f;
        points().pxY(0, -f);
        points().pxY(1, -f);
        points().pxY(2, -f);
        points().pxY(3, -f);
        points().pxY(4, (-f) + (this.e * this.k));
        points().pxY(5, (-f) + (this.e * this.k));
        points().pxY(6, (-f) + (this.e * this.k));
        points().pxY(7, (-f) + (this.e * this.k));
    }

    public float e() {
        return this.h;
    }

    public void g(float f) {
        h(f);
        syncUpdatePointVBO();
    }

    public void h(float f) {
        this.h = f;
        points().pxX(0, this.h);
        points().pxX(1, this.h - (this.d * this.k));
        points().pxX(4, this.h);
        points().pxX(5, this.h - (this.d * this.k));
        points().pxX(8, this.h);
        points().pxX(9, this.h - (this.d * this.k));
        points().pxX(12, this.h);
        points().pxX(13, this.h - (this.d * this.k));
    }

    public float f() {
        return this.g;
    }

    public void i(float f) {
        j(f);
        syncUpdatePointVBO();
    }

    public void j(float f) {
        this.g = f;
        points().pxX(2, (-this.g) + (this.a * this.k));
        points().pxX(3, -this.g);
        points().pxX(6, (-this.g) + (this.a * this.k));
        points().pxX(7, -this.g);
        points().pxX(10, (-this.g) + (this.a * this.k));
        points().pxX(11, -this.g);
        points().pxX(14, (-this.g) + (this.a * this.k));
        points().pxX(15, -this.g);
    }
}
