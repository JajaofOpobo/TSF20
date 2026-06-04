package com.tsf.shell.workspace3D.h.d;

import com.censivn.C3DEngine.g.u;
import com.tsf.shell.workspace3D.k.c.b.ac;

/* loaded from: classes.dex */
final class f extends u {
    private final /* synthetic */ float A;
    private final /* synthetic */ float B;
    private final /* synthetic */ float C;
    private final /* synthetic */ float D;
    private final /* synthetic */ float E;
    private final /* synthetic */ float F;
    private final /* synthetic */ float G;
    private final /* synthetic */ float H;
    final /* synthetic */ b a;
    private final /* synthetic */ ac x;
    private final /* synthetic */ int y;
    private final /* synthetic */ com.censivn.C3DEngine.e.b z;

    f(b bVar, ac acVar, int i, com.censivn.C3DEngine.e.b bVar2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a = bVar;
        this.x = acVar;
        this.y = i;
        this.z = bVar2;
        this.A = f;
        this.B = f2;
        this.C = f3;
        this.D = f4;
        this.E = f5;
        this.F = f6;
        this.G = f7;
        this.H = f8;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        this.x.a((a) null);
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        if (this.y == 0) {
            this.z.E().setPX(0, this.A + ((com.tsf.shell.workspace3D.k.c.b.c.e.i - this.A) * f), this.B + ((com.tsf.shell.workspace3D.k.c.b.c.e.m - this.B) * f), 0.0f);
            this.z.E().setPX(2, this.C + ((com.tsf.shell.workspace3D.k.c.b.c.e.k - this.C) * f), this.D + ((com.tsf.shell.workspace3D.k.c.b.c.e.o - this.D) * f), 0.0f);
            this.z.ag();
        } else {
            this.z.E().setPX(1, this.E + ((com.tsf.shell.workspace3D.k.c.b.c.e.j - this.E) * f), this.F + ((com.tsf.shell.workspace3D.k.c.b.c.e.n - this.F) * f), 0.0f);
            this.z.E().setPX(3, this.G + ((com.tsf.shell.workspace3D.k.c.b.c.e.l - this.G) * f), this.H + ((com.tsf.shell.workspace3D.k.c.b.c.e.p - this.H) * f), 0.0f);
            this.z.ag();
        }
    }
}
