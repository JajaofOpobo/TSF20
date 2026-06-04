package com.tsf.shell.workspace3D.k.c.a;

import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.k.b.k;

/* loaded from: classes.dex */
final class d extends RenderRunnable {
    final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(a aVar) {
        super(2, 1);
        this.a = aVar;
    }

    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
    public final void run() {
        h hVar;
        k l = bf.l();
        hVar = this.a.f;
        l.a((com.tsf.shell.workspace3D.k.j) hVar);
    }
}
