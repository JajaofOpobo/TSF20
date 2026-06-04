package com.tsf.shell.setting;

import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
final class t extends RenderRunnable {
    final /* synthetic */ s a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(s sVar) {
        super(2, 1);
        this.a = sVar;
    }

    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
    public final void run() {
        this.a.c();
        this.a.e = null;
    }
}
