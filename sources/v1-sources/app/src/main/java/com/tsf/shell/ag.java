package com.tsf.shell;

import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
final class ag extends RenderRunnable {
    final /* synthetic */ Home a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(Home home) {
        super(1, 1);
        this.a = home;
    }

    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
    public final void run() {
        com.tsf.shell.workspace3D.bf.j().D();
    }
}
