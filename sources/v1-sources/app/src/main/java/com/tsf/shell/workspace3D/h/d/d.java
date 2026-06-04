package com.tsf.shell.workspace3D.h.d;

import com.censivn.C3DEngine.g.u;

/* loaded from: classes.dex */
final class d extends u {
    private final /* synthetic */ float A;
    private final /* synthetic */ com.censivn.C3DEngine.e.b B;
    private final /* synthetic */ float C;
    private final /* synthetic */ float D;
    private final /* synthetic */ float E;
    private final /* synthetic */ float F;
    private final /* synthetic */ float G;
    private final /* synthetic */ float H;
    private final /* synthetic */ float I;
    final /* synthetic */ b a;
    private final /* synthetic */ Runnable x;
    private final /* synthetic */ int y;
    private final /* synthetic */ com.censivn.C3DEngine.e.b z;

    d(b bVar, Runnable runnable, int i, com.censivn.C3DEngine.e.b bVar2, float f, com.censivn.C3DEngine.e.b bVar3, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a = bVar;
        this.x = runnable;
        this.y = i;
        this.z = bVar2;
        this.A = f;
        this.B = bVar3;
        this.C = f2;
        this.D = f3;
        this.E = f4;
        this.F = f5;
        this.G = f6;
        this.H = f7;
        this.I = f8;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        if (this.x != null) {
            this.x.run();
        }
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        if (this.y == 0) {
            this.z.E().setPX(0, this.A + ((this.B.E().pxX(0) - this.A) * f), this.C + ((this.B.E().pxY(0) - this.C) * f), 0.0f);
            this.z.E().setPX(2, this.D + ((this.B.E().pxX(2) - this.D) * f), this.E + ((this.B.E().pxY(2) - this.E) * f), 0.0f);
            this.z.ag();
        } else {
            this.z.E().setPX(1, this.F + ((this.B.E().pxX(1) - this.F) * f), this.G + ((this.B.E().pxY(1) - this.G) * f), 0.0f);
            this.z.E().setPX(3, this.H + ((this.B.E().pxX(3) - this.H) * f), this.I + ((this.B.E().pxY(3) - this.I) * f), 0.0f);
            this.z.ag();
        }
    }
}
