package com.censivn.C3DEngine.api.message;

import com.censivn.C3DEngine.b.w;

/* loaded from: classes.dex */
final class a implements Runnable {
    final /* synthetic */ VMessageQueueManager a;
    private final /* synthetic */ int b;
    private final /* synthetic */ Runnable c;

    a(VMessageQueueManager vMessageQueueManager, int i, Runnable runnable) {
        this.a = vMessageQueueManager;
        this.b = i;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == VMessageQueueManager.TYPE_GL_THREAD) {
            com.censivn.C3DEngine.a.a().c(this.c);
        } else if (this.b == VMessageQueueManager.TYPE_MAINUI_THREAD) {
            com.censivn.C3DEngine.a.a();
            w.a(this.c);
        }
    }
}
