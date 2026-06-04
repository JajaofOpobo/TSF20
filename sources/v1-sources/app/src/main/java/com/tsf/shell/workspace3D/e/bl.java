package com.tsf.shell.workspace3D.e;

import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class bl extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ p a;
    private final /* synthetic */ float x;
    private final /* synthetic */ float y;

    bl(p pVar, float f, float f2) {
        this.a = pVar;
        this.x = f;
        this.y = f2;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        com.censivn.C3DEngine.b.v vVar;
        float f2;
        com.censivn.C3DEngine.b.v vVar2;
        float f3;
        com.censivn.C3DEngine.b.v vVar3;
        p pVar = this.a;
        vVar = this.a.au;
        PositionNumber3d L = vVar.L();
        float f4 = this.x;
        f2 = this.a.ap;
        float f5 = f4 + ((f2 - this.x) * f);
        L.x = f5;
        pVar.x = f5;
        p pVar2 = this.a;
        vVar2 = this.a.au;
        PositionNumber3d L2 = vVar2.L();
        float f6 = this.y;
        f3 = this.a.aq;
        float f7 = f6 + ((f3 - this.y) * f);
        L2.y = f7;
        pVar2.y = f7;
        vVar3 = this.a.au;
        vVar3.M().z = 200.0f + ((-40.0f) * f);
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.b.v vVar;
        this.a.t();
        bm bmVar = new bm(this);
        bmVar.a(0);
        vVar = this.a.au;
        com.censivn.C3DEngine.g.s.a(vVar, ThemeShellDescription.PAGE_PREVIEW_SELECT, bmVar);
        bn bnVar = new bn(this);
        bnVar.a(255);
        com.censivn.C3DEngine.g.s.a(com.tsf.shell.workspace3D.bf.j().p().bn(), ThemeShellDescription.PAGE_PREVIEW_SELECT, bnVar);
    }
}
