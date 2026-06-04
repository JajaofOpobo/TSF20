package com.tsf.shell.workspace3D.k;

import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
final class r extends RenderRunnable {
    final /* synthetic */ p a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(p pVar) {
        super(1, 1);
        this.a = pVar;
    }

    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
    public final void run() {
        this.a.aJ();
    }
}
