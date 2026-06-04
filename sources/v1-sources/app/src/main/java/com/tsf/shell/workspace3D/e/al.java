package com.tsf.shell.workspace3D.e;

import com.censivn.C3DEngine.api.element.TextureElement;

/* loaded from: classes.dex */
final class al extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ p a;
    private final /* synthetic */ TextureElement x;

    al(p pVar, TextureElement textureElement) {
        this.a = pVar;
        this.x = textureElement;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        com.censivn.C3DEngine.b.v vVar3;
        com.censivn.C3DEngine.b.v vVar4;
        vVar = this.a.aA;
        vVar.z().d();
        vVar2 = this.a.aA;
        vVar2.z().c(this.x);
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.j(1.0f);
        uVar.k(1.0f);
        vVar3 = this.a.aA;
        com.censivn.C3DEngine.g.s.a(vVar3);
        vVar4 = this.a.aA;
        com.censivn.C3DEngine.g.s.a(vVar4, 150, uVar);
    }
}
