package com.tsf.shell.workspace3D.h.d;

import com.censivn.C3DEngine.g.r;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class c extends u {
    private final /* synthetic */ float A;
    private final /* synthetic */ float B;
    private final /* synthetic */ float C;
    private final /* synthetic */ float D;
    private final /* synthetic */ float E;
    private final /* synthetic */ float F;
    private final /* synthetic */ float G;
    private final /* synthetic */ float H;
    private final /* synthetic */ float I;
    private final /* synthetic */ float J;
    private final /* synthetic */ float K;
    private final /* synthetic */ float L;
    private final /* synthetic */ float M;
    private final /* synthetic */ float N;
    private final /* synthetic */ float O;
    private final /* synthetic */ float P;
    final /* synthetic */ b a;
    private final /* synthetic */ com.censivn.C3DEngine.e.b x;
    private final /* synthetic */ int y;
    private final /* synthetic */ Runnable z;

    c(b bVar, com.censivn.C3DEngine.e.b bVar2, int i, Runnable runnable, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.a = bVar;
        this.x = bVar2;
        this.y = i;
        this.z = runnable;
        this.A = f;
        this.B = f2;
        this.C = f3;
        this.D = f4;
        this.E = f5;
        this.F = f6;
        this.G = f7;
        this.H = f8;
        this.I = f9;
        this.J = f10;
        this.K = f11;
        this.L = f12;
        this.M = f13;
        this.N = f14;
        this.O = f15;
        this.P = f16;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        b bVar = this.a;
        com.censivn.C3DEngine.e.b bVar2 = this.x;
        int i = this.y;
        Runnable runnable = this.z;
        com.censivn.C3DEngine.e.b bVar3 = (com.censivn.C3DEngine.e.b) bVar2.s();
        float pxX = bVar2.E().pxX(0);
        float pxX2 = bVar2.E().pxX(1);
        float pxX3 = bVar2.E().pxX(2);
        float pxX4 = bVar2.E().pxX(3);
        d dVar = new d(bVar, runnable, i, bVar2, pxX, bVar3, bVar2.E().pxY(0), pxX3, bVar2.E().pxY(2), pxX2, bVar2.E().pxY(1), pxX4, bVar2.E().pxY(3));
        dVar.a((r) new com.censivn.C3DEngine.g.k());
        s.a(bVar2, ThemeShellDescription.PICKER_MENU, dVar);
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        if (this.y == 0) {
            this.x.E().setPX(0, this.A + ((this.B - this.A) * f), this.C + ((this.D - this.C) * f), 0.0f);
            this.x.E().setPX(2, this.E + ((this.F - this.E) * f), this.G + ((this.H - this.G) * f), 0.0f);
            this.x.ag();
        } else {
            this.x.E().setPX(1, this.I + ((this.J - this.I) * f), this.K + ((this.L - this.K) * f), 0.0f);
            this.x.E().setPX(3, this.M + ((this.N - this.M) * f), this.O + ((this.P - this.O) * f), 0.0f);
            this.x.ag();
        }
    }
}
