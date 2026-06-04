package com.tsf.shell.workspace3D.h;

/* loaded from: classes.dex */
final class n implements Runnable {
    final /* synthetic */ l a;

    n(l lVar) {
        this.a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.k instanceof com.tsf.shell.workspace3D.h.a.x) {
            this.a.R();
            ((com.tsf.shell.workspace3D.h.a.x) this.a.k).bE();
        }
    }
}
