package com.tsf.shell.workspace3D;

/* loaded from: classes.dex */
final class e implements Runnable {
    final /* synthetic */ d a;

    e(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        d dVar = this.a;
        i = this.a.g;
        dVar.a(i);
        this.a.f();
    }
}
