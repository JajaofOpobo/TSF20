package com.tsf.shell.workspace3D.g.b;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.ad;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.g.u;

/* loaded from: classes.dex */
final class h extends u {
    final /* synthetic */ b a;

    h(b bVar) {
        this.a = bVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        com.censivn.C3DEngine.e.b bVar;
        com.censivn.C3DEngine.e.b bVar2;
        com.censivn.C3DEngine.e.b bVar3;
        com.censivn.C3DEngine.e.b bVar4;
        bVar = this.a.B;
        bVar2 = this.a.A;
        bVar.b(bVar2.I());
        bVar3 = this.a.C;
        bVar4 = this.a.A;
        bVar3.b(bVar4.I());
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        v vVar;
        com.censivn.C3DEngine.e.b bVar;
        com.censivn.C3DEngine.e.b bVar2;
        com.censivn.C3DEngine.e.b bVar3;
        k kVar;
        TextureElement textureElement;
        TextureElement textureElement2;
        TextureElement textureElement3;
        vVar = this.a.a;
        vVar.H();
        bVar = this.a.A;
        bVar.H();
        bVar2 = this.a.B;
        bVar2.H();
        bVar3 = this.a.C;
        bVar3.H();
        kVar = this.a.I;
        kVar.H();
        this.a.ao = null;
        ad f = com.censivn.C3DEngine.a.f();
        textureElement = this.a.E;
        f.a(textureElement);
        ad f2 = com.censivn.C3DEngine.a.f();
        textureElement2 = this.a.F;
        f2.a(textureElement2);
        ad f3 = com.censivn.C3DEngine.a.f();
        textureElement3 = this.a.G;
        f3.a(textureElement3);
    }
}
