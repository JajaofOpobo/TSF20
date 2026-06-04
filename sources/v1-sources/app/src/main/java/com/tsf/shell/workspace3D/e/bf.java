package com.tsf.shell.workspace3D.e;

import com.censivn.C3DEngine.api.element.PositionNumber3d;

/* loaded from: classes.dex */
final class bf extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ p a;
    private final /* synthetic */ float x;
    private final /* synthetic */ float y;

    bf(p pVar, float f, float f2) {
        this.a = pVar;
        this.x = f;
        this.y = f2;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        e eVar;
        com.censivn.C3DEngine.b.v vVar;
        float f2;
        float f3;
        float f4;
        e eVar2;
        float f5;
        float f6 = this.x + ((this.y - this.x) * f);
        eVar = this.a.af;
        if (eVar.g(f6) > 0.5f) {
            this.a.X = f6;
            vVar = this.a.au;
            PositionNumber3d L = vVar.L();
            f2 = this.a.y;
            f3 = this.a.X;
            L.y = f2 + f3;
            p pVar = this.a;
            f4 = this.a.X;
            pVar.a(f4, true);
            eVar2 = this.a.af;
            f5 = this.a.X;
            eVar2.i(f5);
        }
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.a.a().b(new bg(this, this.x), 500L);
    }
}
