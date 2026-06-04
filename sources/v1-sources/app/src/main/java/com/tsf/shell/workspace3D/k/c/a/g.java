package com.tsf.shell.workspace3D.k.c.a;

/* loaded from: classes.dex */
final class g extends com.censivn.C3DEngine.e.b {
    private int C;
    private int D;
    private int E;
    private float F;
    private float G;
    final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i * com.censivn.C3DEngine.a.b, i2 * com.censivn.C3DEngine.a.b, (byte) 0);
        this.a = aVar;
        this.E = 0;
        this.C = i3;
        this.D = i4;
        this.F = i / i5;
        this.G = i2 / i6;
        this.E = (int) (Math.random() * (i4 - 1));
        k();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        boolean z;
        z = this.a.i;
        if (!z && com.tsf.shell.workspace3D.k.b.a.a) {
            k();
        }
    }

    private void k() {
        int i = this.E % this.C;
        int i2 = this.E / this.C;
        F().set(0, this.F * i, (i2 + 1) * this.G);
        F().set(1, (i + 1) * this.F, (i2 + 1) * this.G);
        F().set(2, this.F * i, this.G * i2);
        F().set(3, (i + 1) * this.F, i2 * this.G);
        ah();
        this.E++;
        if (this.E >= this.D) {
            this.E = 0;
        }
    }
}
