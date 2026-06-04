package com.tsf.shell.workspace3D.k.b;

import com.censivn.C3DEngine.api.element.TextureElement;

/* loaded from: classes.dex */
final class ae extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ ab a;

    ae(ab abVar) {
        this.a = abVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.e.b bVar;
        TextureElement textureElement;
        com.censivn.C3DEngine.e.b bVar2;
        bVar = this.a.b;
        bVar.Q();
        com.censivn.C3DEngine.b.ad f = com.censivn.C3DEngine.a.f();
        textureElement = this.a.c;
        f.a(textureElement);
        bVar2 = this.a.b;
        bVar2.z().b();
        this.a.c = null;
        new af(this);
    }
}
