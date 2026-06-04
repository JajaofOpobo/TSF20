package com.censivn.C3DEngine.e.b;

/* loaded from: classes.dex */
public class a extends com.censivn.C3DEngine.e.b {
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float a;

    public a(float f, float f2, b bVar) {
        this(f, f2, com.censivn.C3DEngine.a.b, bVar);
    }

    public a(float f, float f2, float f3, b bVar) {
        super(f, f2, 3, 3, false);
        this.J = f3;
        a(bVar, false);
        a(this.A, this.B);
    }

    public final void a(b bVar) {
        a(bVar, true);
    }

    private void a(b bVar, boolean z) {
        float f = bVar.a;
        float f2 = bVar.b;
        float f3 = bVar.c;
        float f4 = bVar.d;
        float f5 = bVar.e;
        float f6 = bVar.f;
        F().set(0, 1.0f, 1.0f);
        F().set(3, 0.0f, 1.0f);
        F().set(12, 1.0f, 0.0f);
        F().set(15, 0.0f, 0.0f);
        F().set(1, f2 / f5, 1.0f);
        F().set(2, f / f5, 1.0f);
        F().set(4, 1.0f, f4 / f6);
        F().set(5, f2 / f5, f4 / f6);
        F().set(6, f / f5, f4 / f6);
        F().set(7, 0.0f, f4 / f6);
        F().set(8, 1.0f, f3 / f6);
        F().set(9, f2 / f5, f3 / f6);
        F().set(10, f / f5, f3 / f6);
        F().set(11, 0.0f, f3 / f6);
        F().set(13, f2 / f5, 0.0f);
        F().set(14, f / f5, 0.0f);
        this.C = f5 - f2;
        this.a = f;
        this.D = f6 - f4;
        this.E = f3;
        if (z) {
            ae();
        }
    }

    public final void a(float f, float f2) {
        this.A = f;
        this.B = f2;
        o();
    }

    @Override // com.censivn.C3DEngine.e.b
    public final void a_(float f) {
        this.A = f;
        o();
    }

    @Override // com.censivn.C3DEngine.e.b
    public final void h(float f) {
        this.B = f;
        o();
    }

    @Override // com.censivn.C3DEngine.e.b
    public final float n_() {
        return this.A;
    }

    @Override // com.censivn.C3DEngine.e.b
    public final float o_() {
        return this.B;
    }

    private void o() {
        float f = this.A / 2.0f;
        this.G = f;
        this.F = f;
        float f2 = this.B / 2.0f;
        this.I = f2;
        this.H = f2;
        float f3 = -f2;
        E().setPX(0, f, f3, 0.0f);
        E().setPX(1, f - (this.C * this.J), f3, 0.0f);
        E().setPX(2, (-f) + (this.a * this.J), f3, 0.0f);
        E().setPX(3, -f, f3, 0.0f);
        float f4 = f3 + (this.D * this.J);
        E().setPX(4, f, f4, 0.0f);
        E().setPX(5, f - (this.C * this.J), f4, 0.0f);
        E().setPX(6, (-f) + (this.a * this.J), f4, 0.0f);
        E().setPX(7, -f, f4, 0.0f);
        float f5 = f2 - (this.E * this.J);
        E().setPX(8, f, f5, 0.0f);
        E().setPX(9, f - (this.C * this.J), f5, 0.0f);
        E().setPX(10, (-f) + (this.a * this.J), f5, 0.0f);
        E().setPX(11, -f, f5, 0.0f);
        E().setPX(12, f, f2, 0.0f);
        E().setPX(13, f - (this.C * this.J), f2, 0.0f);
        E().setPX(14, (-f) + (this.a * this.J), f2, 0.0f);
        E().setPX(15, -f, f2, 0.0f);
        ad();
    }

    public final float k() {
        return this.H;
    }

    public void i(float f) {
        j(f);
        ad();
    }

    public final void j(float f) {
        this.H = f;
        E().pxY(8, f - (this.E * this.J));
        E().pxY(9, f - (this.E * this.J));
        E().pxY(10, f - (this.E * this.J));
        E().pxY(11, f - (this.E * this.J));
        E().pxY(12, f);
        E().pxY(13, f);
        E().pxY(14, f);
        E().pxY(15, f);
    }

    public final float l() {
        return this.I;
    }

    public void k(float f) {
        l(f);
        ad();
    }

    public final void l(float f) {
        this.I = f;
        E().pxY(0, -f);
        E().pxY(1, -f);
        E().pxY(2, -f);
        E().pxY(3, -f);
        E().pxY(4, (-f) + (this.D * this.J));
        E().pxY(5, (-f) + (this.D * this.J));
        E().pxY(6, (-f) + (this.D * this.J));
        E().pxY(7, (-f) + (this.D * this.J));
    }

    public final float m() {
        return this.G;
    }

    public void m(float f) {
        n(f);
        ad();
    }

    public final void n(float f) {
        this.G = f;
        E().pxX(0, this.G);
        E().pxX(1, this.G - (this.C * this.J));
        E().pxX(4, this.G);
        E().pxX(5, this.G - (this.C * this.J));
        E().pxX(8, this.G);
        E().pxX(9, this.G - (this.C * this.J));
        E().pxX(12, this.G);
        E().pxX(13, this.G - (this.C * this.J));
    }

    public final float n() {
        return this.F;
    }

    public void o(float f) {
        p(f);
        ad();
    }

    public final void p(float f) {
        this.F = f;
        E().pxX(2, (-this.F) + (this.a * this.J));
        E().pxX(3, -this.F);
        E().pxX(6, (-this.F) + (this.a * this.J));
        E().pxX(7, -this.F);
        E().pxX(10, (-this.F) + (this.a * this.J));
        E().pxX(11, -this.F);
        E().pxX(14, (-this.F) + (this.a * this.J));
        E().pxX(15, -this.F);
    }
}
