package com.tsf.shell.workspace3D.h.d;

import com.censivn.C3DEngine.g.u;
import com.tsf.shell.workspace3D.k.ab;
import com.tsf.shell.workspace3D.k.b.ap;

/* loaded from: classes.dex */
final class h extends u {
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
    final /* synthetic */ b a;
    private final /* synthetic */ ab x;
    private final /* synthetic */ int y;
    private final /* synthetic */ float z;

    h(b bVar, ab abVar, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
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
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        this.x.a((a) null);
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        if (this.y == 0) {
            this.x.D.E().setPX(ap.c, this.z + ((ap.k - this.z) * f), this.A + ((ap.s - this.A) * f), 0.0f);
            this.x.D.E().setPX(ap.e, this.B + ((ap.m - this.B) * f), this.C + ((ap.u - this.C) * f), 0.0f);
            this.x.D.E().setPX(ap.g, this.D + ((ap.o - this.D) * f), this.E + ((ap.w - this.E) * f), 0.0f);
            this.x.D.E().setPX(ap.i, this.F + ((ap.q - this.F) * f), this.G + ((ap.y - this.G) * f), 0.0f);
            this.x.D.ag();
            return;
        }
        this.x.D.E().setPX(ap.d, this.H + ((ap.l - this.H) * f), this.I + ((ap.t - this.I) * f), 0.0f);
        this.x.D.E().setPX(ap.f, this.J + ((ap.n - this.J) * f), this.K + ((ap.v - this.K) * f), 0.0f);
        this.x.D.E().setPX(ap.h, this.L + ((ap.p - this.L) * f), this.M + ((ap.x - this.M) * f), 0.0f);
        this.x.D.E().setPX(ap.j, this.N + ((ap.r - this.N) * f), this.O + ((ap.z - this.O) * f), 0.0f);
        this.x.D.ag();
    }
}
