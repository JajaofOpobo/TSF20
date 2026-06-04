package com.tsf.shell.workspace3D;

import com.censivn.C3DEngine.api.element.TextureElement;

/* loaded from: classes.dex */
final class bd extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ av a;

    bd(av avVar) {
        this.a = avVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.e.b bVar;
        com.censivn.C3DEngine.e.b bVar2;
        TextureElement textureElement;
        TextureElement textureElement2;
        bVar = this.a.m;
        bVar.Q();
        bVar2 = this.a.m;
        bVar2.z().b();
        textureElement = this.a.n;
        if (textureElement != null) {
            com.censivn.C3DEngine.b.ad f = com.censivn.C3DEngine.a.f();
            textureElement2 = this.a.n;
            f.a(textureElement2);
            this.a.n = null;
        }
    }
}
