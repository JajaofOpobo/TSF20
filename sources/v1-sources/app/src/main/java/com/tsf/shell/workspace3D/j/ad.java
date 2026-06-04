package com.tsf.shell.workspace3D.j;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;

/* loaded from: classes.dex */
final class ad extends ak {
    final /* synthetic */ n a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(n nVar, com.censivn.C3DEngine.b.r rVar) {
        super(nVar, rVar);
        this.a = nVar;
    }

    @Override // com.tsf.shell.workspace3D.j.ak, com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        com.censivn.C3DEngine.e.b.a aVar;
        com.censivn.C3DEngine.e.b.a aVar2;
        TextureElement textureElement;
        super.e(motionEvent);
        aVar = this.a.c;
        aVar.z().d();
        aVar2 = this.a.c;
        com.censivn.C3DEngine.b.ac z = aVar2.z();
        textureElement = this.a.e;
        z.c(textureElement);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        com.censivn.C3DEngine.e.b.a aVar;
        com.censivn.C3DEngine.e.b.a aVar2;
        TextureElement textureElement;
        super.f(motionEvent);
        aVar = this.a.c;
        aVar.z().d();
        aVar2 = this.a.c;
        com.censivn.C3DEngine.b.ac z = aVar2.z();
        textureElement = this.a.d;
        z.c(textureElement);
    }
}
