package com.tsf.shell.workspace3D.k.c.c;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.ac;
import com.censivn.C3DEngine.b.ad;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.k.s;

/* loaded from: classes.dex */
final class k extends com.tsf.shell.workspace3D.k.j {
    final /* synthetic */ j a;

    k(j jVar) {
        this.a = jVar;
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void f(int i) {
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void aR() {
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void br() {
        s sVar;
        s sVar2;
        s sVar3;
        TextureElement textureElement;
        TextureElement textureElement2;
        com.censivn.C3DEngine.e.b bVar;
        com.censivn.C3DEngine.e.b bVar2;
        com.censivn.C3DEngine.e.b bVar3;
        TextureElement textureElement3;
        com.censivn.C3DEngine.e.b bVar4;
        com.censivn.C3DEngine.e.b bVar5;
        this.a.d = bf.l().a().a(be().packagename);
        sVar = this.a.d;
        if (sVar != null) {
            sVar2 = this.a.d;
            sVar2.l = this.a;
            sVar3 = this.a.d;
            Bitmap b = sVar3.k.b(com.censivn.C3DEngine.a.c());
            this.a.c = com.censivn.C3DEngine.a.f().a(b, false);
            b.recycle();
            j jVar = this.a;
            textureElement = this.a.c;
            float f = textureElement.width;
            textureElement2 = this.a.c;
            jVar.b = new com.censivn.C3DEngine.e.b(f, textureElement2.height);
            bVar = this.a.b;
            l lVar = new l(this, bVar);
            bVar2 = this.a.b;
            bVar2.a((com.censivn.C3DEngine.b.l) lVar);
            bVar3 = this.a.b;
            ac z = bVar3.z();
            textureElement3 = this.a.c;
            z.c(textureElement3);
            bVar4 = this.a.b;
            d(bVar4);
            bVar5 = this.a.b;
            bVar5.ar();
            ar();
            return;
        }
        bf.l().a((com.tsf.shell.workspace3D.k.j) this);
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void n() {
        TextureElement textureElement;
        com.censivn.C3DEngine.e.b bVar;
        s sVar;
        ad f = com.censivn.C3DEngine.a.f();
        textureElement = this.a.c;
        f.a(textureElement);
        bVar = this.a.b;
        bVar.H();
        sVar = this.a.d;
        sVar.l = null;
        this.a.d = null;
        super.n();
    }
}
