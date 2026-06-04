package com.tsf.shell.workspace3D.e;

import com.censivn.C3DEngine.api.element.TextureElement;

/* loaded from: classes.dex */
final class am extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ p a;

    am(p pVar) {
        this.a = pVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        com.censivn.C3DEngine.e.b bVar;
        com.censivn.C3DEngine.b.v vVar3;
        TextureElement textureElement;
        com.censivn.C3DEngine.b.v vVar4;
        com.censivn.C3DEngine.b.v vVar5;
        com.censivn.C3DEngine.b.v vVar6;
        TextureElement textureElement2;
        vVar = this.a.aA;
        vVar.z().d();
        vVar2 = this.a.aA;
        bVar = this.a.Y;
        if (vVar2 == bVar) {
            vVar6 = this.a.aA;
            com.censivn.C3DEngine.b.ac z = vVar6.z();
            textureElement2 = this.a.K;
            z.c(textureElement2);
        } else {
            vVar3 = this.a.aA;
            com.censivn.C3DEngine.b.ac z2 = vVar3.z();
            textureElement = this.a.L;
            z2.c(textureElement);
        }
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.j(1.0f);
        uVar.k(1.0f);
        vVar4 = this.a.aA;
        com.censivn.C3DEngine.g.s.a(vVar4);
        vVar5 = this.a.aA;
        com.censivn.C3DEngine.g.s.a(vVar5, 150, uVar);
    }
}
