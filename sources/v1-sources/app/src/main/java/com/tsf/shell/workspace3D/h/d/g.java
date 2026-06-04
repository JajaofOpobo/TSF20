package com.tsf.shell.workspace3D.h.d;

import com.censivn.C3DEngine.g.r;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.k.ab;
import com.tsf.shell.workspace3D.k.b.ap;

/* loaded from: classes.dex */
final class g extends u {
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
    private final /* synthetic */ float Q;
    private final /* synthetic */ float R;
    private final /* synthetic */ float S;
    private final /* synthetic */ float T;
    private final /* synthetic */ float U;
    private final /* synthetic */ float V;
    private final /* synthetic */ float W;
    private final /* synthetic */ float X;
    private final /* synthetic */ float Y;
    private final /* synthetic */ float Z;
    final /* synthetic */ b a;
    private final /* synthetic */ float aa;
    private final /* synthetic */ float ab;
    private final /* synthetic */ float ac;
    private final /* synthetic */ float ad;
    private final /* synthetic */ float ae;
    private final /* synthetic */ ab x;
    private final /* synthetic */ int y;
    private final /* synthetic */ float z;

    g(b bVar, ab abVar, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27, float f28, float f29, float f30, float f31, float f32) {
        this.a = bVar;
        this.x = abVar;
        this.y = i;
        this.z = f;
        this.A = f2;
        this.B = f3;
        this.C = f4;
        this.D = f5;
        this.E = f6;
        this.F = f7;
        this.G = f8;
        this.H = f9;
        this.I = f10;
        this.J = f11;
        this.K = f12;
        this.L = f13;
        this.M = f14;
        this.N = f15;
        this.O = f16;
        this.P = f17;
        this.Q = f18;
        this.R = f19;
        this.S = f20;
        this.T = f21;
        this.U = f22;
        this.V = f23;
        this.W = f24;
        this.X = f25;
        this.Y = f26;
        this.Z = f27;
        this.aa = f28;
        this.ab = f29;
        this.ac = f30;
        this.ad = f31;
        this.ae = f32;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        b bVar = this.a;
        ab abVar = this.x;
        int i = this.y;
        float pxX = abVar.D.E().pxX(ap.c);
        float pxY = abVar.D.E().pxY(ap.c);
        float pxX2 = abVar.D.E().pxX(ap.d);
        float pxY2 = abVar.D.E().pxY(ap.d);
        float pxX3 = abVar.D.E().pxX(ap.e);
        float pxY3 = abVar.D.E().pxY(ap.e);
        float pxX4 = abVar.D.E().pxX(ap.f);
        float pxY4 = abVar.D.E().pxY(ap.f);
        h hVar = new h(bVar, abVar, i, pxX, pxY, pxX3, pxY3, abVar.D.E().pxX(ap.g), abVar.D.E().pxY(ap.g), abVar.D.E().pxX(ap.i), abVar.D.E().pxY(ap.i), pxX2, pxY2, pxX4, pxY4, abVar.D.E().pxX(ap.h), abVar.D.E().pxY(ap.h), abVar.D.E().pxX(ap.j), abVar.D.E().pxY(ap.j));
        hVar.a((r) new com.censivn.C3DEngine.g.k());
        s.a(abVar, ThemeShellDescription.PICKER_MENU, hVar);
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        if (this.y == 0) {
            this.x.D.E().setPX(ap.c, this.z + ((this.A - this.z) * f), this.B + ((this.C - this.B) * f), 0.0f);
            this.x.D.E().setPX(ap.e, this.D + ((this.E - this.D) * f), this.F + ((this.G - this.F) * f), 0.0f);
            this.x.D.E().setPX(ap.g, this.H + ((this.I - this.H) * f), this.J + ((this.K - this.J) * f), 0.0f);
            this.x.D.E().setPX(ap.i, this.L + ((this.M - this.L) * f), this.N + ((this.O - this.N) * f), 0.0f);
            this.x.D.ag();
            return;
        }
        this.x.D.E().setPX(ap.d, this.P + ((this.Q - this.P) * f), this.R + ((this.S - this.R) * f), 0.0f);
        this.x.D.E().setPX(ap.f, this.T + ((this.U - this.T) * f), this.V + ((this.W - this.V) * f), 0.0f);
        this.x.D.E().setPX(ap.h, this.X + ((this.Y - this.X) * f), this.Z + ((this.aa - this.Z) * f), 0.0f);
        this.x.D.E().setPX(ap.j, this.ab + ((this.ac - this.ab) * f), this.ad + ((this.ae - this.ad) * f), 0.0f);
        this.x.D.ag();
    }
}
