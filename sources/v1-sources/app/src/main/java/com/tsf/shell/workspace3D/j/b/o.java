package com.tsf.shell.workspace3D.j.b;

/* loaded from: classes.dex */
final class o implements Runnable {
    final /* synthetic */ d a;

    o(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        z = this.a.s;
        if (z) {
            d.e(this.a);
        } else {
            d.f(this.a);
        }
    }
}
