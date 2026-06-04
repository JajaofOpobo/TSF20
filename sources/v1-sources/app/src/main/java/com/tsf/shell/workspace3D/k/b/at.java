package com.tsf.shell.workspace3D.k.b;

/* loaded from: classes.dex */
final class at implements Runnable {
    private final /* synthetic */ Runnable a;

    at(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a != null) {
            this.a.run();
        }
    }
}
