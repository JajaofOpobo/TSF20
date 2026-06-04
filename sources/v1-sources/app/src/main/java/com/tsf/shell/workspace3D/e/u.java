package com.tsf.shell.workspace3D.e;

import com.censivn.C3DEngine.api.element.TextureElement;

/* loaded from: classes.dex */
final class u extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ p a;

    u(p pVar) {
        this.a = pVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.b.v vVar;
        TextureElement textureElement;
        com.censivn.C3DEngine.b.v vVar2;
        com.censivn.C3DEngine.e.b bVar;
        com.tsf.shell.a.t.V();
        com.tsf.shell.workspace3D.bf.a(true);
        com.tsf.shell.aq.a();
        com.tsf.shell.workspace3D.bf.m();
        vVar = this.a.au;
        vVar.Q();
        com.censivn.C3DEngine.b.ad f = com.censivn.C3DEngine.a.f();
        textureElement = this.a.ar;
        f.a(textureElement);
        this.a.ar = null;
        vVar2 = this.a.au;
        vVar2.H();
        bVar = this.a.at;
        bVar.H();
        this.a.au = null;
        this.a.at = null;
    }
}
