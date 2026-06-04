package com.tsf.shell.workspace3D.k;

import com.censivn.C3DEngine.api.element.TextureElement;

/* loaded from: classes.dex */
final class ad extends com.censivn.C3DEngine.e.b {
    final /* synthetic */ ab C;
    float a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ab abVar) {
        super(128.0f, 128.0f, 1, 1, true);
        this.C = abVar;
        this.a = 0.0f;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void m_() {
        int i;
        int i2;
        com.censivn.C3DEngine.e.b bVar;
        TextureElement textureElement;
        com.censivn.C3DEngine.e.b bVar2;
        TextureElement textureElement2;
        int i3;
        int i4;
        int i5;
        com.censivn.C3DEngine.e.b bVar3;
        TextureElement textureElement3;
        com.censivn.C3DEngine.e.b bVar4;
        TextureElement textureElement4;
        this.a = (float) (this.a + 0.5d);
        this.C.R = (int) this.a;
        i = this.C.Q;
        if (i == 0) {
            i5 = this.C.R;
            if (i5 == 16) {
                bVar3 = this.C.J;
                com.censivn.C3DEngine.b.ac z = bVar3.z();
                textureElement3 = ab.K;
                z.d(textureElement3);
                bVar4 = this.C.J;
                com.censivn.C3DEngine.b.ac z2 = bVar4.z();
                textureElement4 = ab.O;
                z2.c(textureElement4);
                this.C.Q = 1;
                this.a = 0.0f;
                this.C.R = 0;
            }
        } else {
            i2 = this.C.R;
            if (i2 == 13) {
                bVar = this.C.J;
                com.censivn.C3DEngine.b.ac z3 = bVar.z();
                textureElement = ab.O;
                z3.d(textureElement);
                bVar2 = this.C.J;
                com.censivn.C3DEngine.b.ac z4 = bVar2.z();
                textureElement2 = ab.K;
                z4.c(textureElement2);
                this.C.Q = 0;
                this.a = 0.0f;
                this.C.R = 0;
            }
        }
        i3 = this.C.R;
        int i6 = i3 % 4;
        i4 = this.C.R;
        int i7 = i4 / 4;
        F().set(0, (i6 + 1) * 0.25f, (i7 + 1) * 0.25f);
        F().set(1, i6 * 0.25f, (i7 + 1) * 0.25f);
        F().set(2, (i6 + 1) * 0.25f, i7 * 0.25f);
        F().set(3, i6 * 0.25f, i7 * 0.25f);
    }
}
