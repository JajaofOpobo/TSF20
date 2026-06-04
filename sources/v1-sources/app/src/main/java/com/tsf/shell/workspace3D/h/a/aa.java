package com.tsf.shell.workspace3D.h.a;

/* loaded from: classes.dex */
final class aa extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ x a;

    aa(x xVar) {
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
        xVar.ay = f2 * i * (1.0f - f);
        z = this.a.ai;
        if (z) {
            this.a.az = (-45.0f) * (1.0f - (Math.abs(f - 0.5f) * 2.0f));
        }
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        e eVar;
        com.censivn.C3DEngine.b.v vVar;
        this.a.ag = false;
        eVar = this.a.ad;
        eVar.aH();
        vVar = this.a.ab;
        vVar.e(true);
        r0.aq.a(this.a.av);
    }
}
