package com.tsf.shell.workspace3D.h.a;

/* loaded from: classes.dex */
final class z extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ x a;

    z(x xVar) {
        this.a = xVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void b(float f) {
        float f2;
        int i;
        boolean z;
        x xVar = this.a;
        f2 = this.a.au;
        i = this.a.af;
        xVar.ay = f2 * i * f;
        z = this.a.ai;
        if (z) {
            this.a.az = 45.0f * (1.0f - (Math.abs(f - 0.5f) * 2.0f));
        }
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.g.b.b bVar;
        com.censivn.C3DEngine.g.u uVar;
        bVar = this.a.at;
        int i = x.Y;
        uVar = this.a.as;
        com.censivn.C3DEngine.g.s.a(bVar, i, uVar);
    }
}
