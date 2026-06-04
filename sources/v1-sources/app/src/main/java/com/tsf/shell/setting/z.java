package com.tsf.shell.setting;

import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
final class z extends RenderRunnable {
    final /* synthetic */ y a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(y yVar) {
        super(2, 1);
        this.a = yVar;
    }

    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
    public final void run() {
        this.a.b();
        this.a.d = null;
    }
}
