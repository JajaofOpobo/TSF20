package com.tsf.shell.workspace3D.j.a;

/* loaded from: classes.dex */
final class l implements Runnable {
    final /* synthetic */ k a;

    l(k kVar) {
        this.a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.censivn.C3DEngine.e.b bVar;
        if (this.a.a != null && this.a.C) {
            if (this.a.A == 1) {
                this.a.A = 0;
            } else {
                this.a.A = 1;
            }
            com.tsf.shell.workspace3D.h.d.a aVar = this.a.a;
            bVar = this.a.G;
            aVar.a(bVar, this.a.A, this.a.B);
        }
    }
}
