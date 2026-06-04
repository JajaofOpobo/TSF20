package com.tsf.shell.workspace3D.e;

/* loaded from: classes.dex */
public class cg extends com.censivn.C3DEngine.e.b {
    private float C;
    private float D;
    private float E;
    private float F;
    private float a;

    public cg(int i, int i2, ch chVar) {
        super(0.0f, 0.0f, 3, 1, false);
        a(i, i2, chVar);
    }

    public final void a(int i, int i2, ch chVar) {
        this.C = i * com.censivn.C3DEngine.a.b;
        this.D = i2 * com.censivn.C3DEngine.a.b;
        float f = chVar.a;
        float f2 = chVar.b;
        float f3 = chVar.c;
        float f4 = this.C / 2.0f;
        this.E = com.censivn.C3DEngine.a.b * f;
        this.F = (chVar.c - f2) * com.censivn.C3DEngine.a.b;
        F().set(0, 1.0f, 1.0f);
        F().set(3, 0.0f, 1.0f);
        F().set(4, 1.0f, 0.0f);
        F().set(7, 0.0f, 0.0f);
        F().set(1, f2 / f3, 1.0f);
        F().set(2, f / f3, 1.0f);
        F().set(6, f2 / f3, 0.0f);
        F().set(5, f / f3, 0.0f);
        E().setPX(2, (-f4) + this.E, (-this.D) / 2.0f, 0.0f);
        E().setPX(3, -f4, (-this.D) / 2.0f, 0.0f);
        E().setPX(6, (-f4) + this.E, this.D / 2.0f, 0.0f);
        E().setPX(7, -f4, this.D / 2.0f, 0.0f);
        E().setPX(1, 0.0f, (-this.D) / 2.0f, 0.0f);
        E().setPX(0, this.F, (-this.D) / 2.0f, 0.0f);
        E().setPX(5, 0.0f, this.D / 2.0f, 0.0f);
        E().setPX(4, this.F, this.D / 2.0f, 0.0f);
        l();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
    }

    public final float k() {
        return this.a;
    }

    public final void i(float f) {
        this.a = f;
        l();
    }

    private void l() {
        float f = this.a;
        float f2 = this.D / 2.0f;
        E().setPX(1, f, -f2, 0.0f);
        E().setPX(0, this.F + f, -f2, 0.0f);
        E().setPX(5, f, f2, 0.0f);
        E().setPX(4, f + this.F, f2, 0.0f);
        ad();
    }
}
