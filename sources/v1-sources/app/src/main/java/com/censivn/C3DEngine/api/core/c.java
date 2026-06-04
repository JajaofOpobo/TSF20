package com.censivn.C3DEngine.api.core;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.g.s;
import com.censivn.C3DEngine.g.u;

/* loaded from: classes.dex */
final class c extends u {
    private final /* synthetic */ boolean A;
    private final /* synthetic */ int B;
    final /* synthetic */ VTextureManager a;
    private final /* synthetic */ VObject3d x;
    private final /* synthetic */ TextureElement y;
    private final /* synthetic */ TextureElement z;

    c(VTextureManager vTextureManager, VObject3d vObject3d, TextureElement textureElement, TextureElement textureElement2, boolean z, int i) {
        this.a = vTextureManager;
        this.x = vObject3d;
        this.y = textureElement;
        this.z = textureElement2;
        this.A = z;
        this.B = i;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        this.a.replaceTexture(this.x, this.y, this.z, this.A);
        u uVar = new u();
        uVar.a(255);
        s.a(this.x.vTarget, this.B, uVar);
    }
}
