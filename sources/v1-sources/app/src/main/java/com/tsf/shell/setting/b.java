package com.tsf.shell.setting;

import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
final class b extends RenderRunnable {
    final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(a aVar) {
        super(2, 1);
        this.a = aVar;
    }

    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
    public final void run() {
        this.a.b();
        this.a.e = null;
    }
}
