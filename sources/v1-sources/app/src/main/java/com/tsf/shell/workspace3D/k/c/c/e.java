package com.tsf.shell.workspace3D.k.c.c;

import android.opengl.GLES20;
import com.censivn.C3DEngine.b.v;

/* loaded from: classes.dex */
final class e extends v {
    final /* synthetic */ a a;

    e(a aVar) {
        this.a = aVar;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        boolean z;
        com.censivn.C3DEngine.c.b.a aVar;
        com.censivn.C3DEngine.c.a aVar2;
        GLES20.glClear(256);
        GLES20.glEnable(2929);
        z = this.a.e;
        if (z) {
            return;
        }
        aVar = this.a.m;
        aVar.c((float) ((Math.cos(1.0d) * 2.0d) - (Math.random() * 2.0d)));
        aVar2 = this.a.l;
        aVar2.a();
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void m_() {
        GLES20.glDisable(2929);
        GLES20.glClear(256);
    }
}
