package com.tsf.shell.workspace3D.g.d;

/* loaded from: classes.dex */
public final class aq extends com.censivn.C3DEngine.e.b {
    private float C;
    private float D;
    private float E;
    private float F;
    private float a;

    public aq(int i, int i2, ar arVar) {
        super(0.0f, 0.0f, 3, 1, false);
        this.A = i * com.censivn.C3DEngine.a.b;
        this.a = i2 * com.censivn.C3DEngine.a.b;
        float f = arVar.a;
        float f2 = arVar.b;
        float f3 = arVar.c;
        this.E = com.censivn.C3DEngine.a.b * f;
        this.F = (f3 - f2) * com.censivn.C3DEngine.a.b;
        F().set(0, 1.0f, 1.0f);
        F().set(3, 0.0f, 1.0f);
        F().set(4, 1.0f, 0.0f);
        F().set(7, 0.0f, 0.0f);
        F().set(1, f2 / f3, 1.0f);
        F().set(2, f / f3, 1.0f);
        F().set(6, f2 / f3, 0.0f);
        F().set(5, f / f3, 0.0f);
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        if (w()) {
            this.C += (this.D - this.C) * 0.2f;
            if (Math.abs(this.D - this.C) < 0.2f) {
                a_(false);
                this.C = this.D;
            }
            k();
        }
    }

    @Override // com.censivn.C3DEngine.e.b
    public final float n_() {
        return this.C;
    }

    public final void i(float f) {
        a_(true);
        this.D = f;
        com.censivn.C3DEngine.a.d().g();
    }

    @Override // com.censivn.C3DEngine.e.b
    public final void a_(float f) {
        this.D = f;
        this.C = f;
        k();
    }

    private void k() {
        float f = this.C / 2.0f;
        E().setPX(0, this.F + f, (-this.a) / 2.0f, 0.0f);
        E().setPX(1, f, (-this.a) / 2.0f, 0.0f);
        E().setPX(2, -f, (-this.a) / 2.0f, 0.0f);
        E().setPX(3, (-f) - this.E, (-this.a) / 2.0f, 0.0f);
        E().setPX(4, this.F + f, this.a / 2.0f, 0.0f);
        E().setPX(5, f, this.a / 2.0f, 0.0f);
        E().setPX(6, -f, this.a / 2.0f, 0.0f);
        E().setPX(7, (-f) - this.E, this.a / 2.0f, 0.0f);
        ad();
    }
}
