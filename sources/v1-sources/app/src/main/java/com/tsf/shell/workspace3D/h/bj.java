package com.tsf.shell.workspace3D.h;

/* loaded from: classes.dex */
final class bj implements Runnable {
    final /* synthetic */ bi a;

    bj(bi biVar) {
        this.a = biVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar;
        com.censivn.C3DEngine.e.b bVar;
        com.censivn.C3DEngine.g.b.b bVar2;
        lVar = this.a.f.e;
        if (lVar.o().f()) {
            this.a.c = true;
            this.a.f.y = true;
            bVar = this.a.f.c;
            bVar.a_(true);
            bVar2 = this.a.f.s;
            com.censivn.C3DEngine.g.s.a(bVar2);
        }
    }
}
