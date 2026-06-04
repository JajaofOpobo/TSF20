package com.tsf.shell.workspace3D.e;

import com.censivn.C3DEngine.api.element.Number3d;

/* loaded from: classes.dex */
final class aw extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ p a;
    private final /* synthetic */ float x;

    aw(p pVar, float f) {
        this.a = pVar;
        this.x = f;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        com.censivn.C3DEngine.b.v vVar3;
        com.censivn.C3DEngine.b.v vVar4;
        cg cgVar;
        cg cgVar2;
        com.censivn.C3DEngine.b.v vVar5;
        com.tsf.shell.workspace3D.bf.m();
        vVar = this.a.F;
        vVar.Q();
        vVar2 = this.a.F;
        vVar2.L().x = this.x;
        vVar3 = this.a.F;
        vVar3.L().y = 0.0f;
        vVar4 = this.a.F;
        Number3d M = vVar4.M();
        cgVar = this.a.W;
        M.z = -cgVar.M().z;
        cgVar2 = this.a.W;
        vVar5 = this.a.F;
        cgVar2.d(vVar5);
    }
}
