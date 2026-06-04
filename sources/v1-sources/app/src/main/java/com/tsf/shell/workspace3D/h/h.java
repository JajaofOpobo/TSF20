package com.tsf.shell.workspace3D.h;

import com.tsf.shell.Home;

/* loaded from: classes.dex */
final class h implements Runnable {
    final /* synthetic */ g a;

    h(g gVar) {
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.A = new com.tsf.shell.h.j(com.censivn.C3DEngine.a.c(), this.a.a);
        Home.d().f().addView(this.a.A);
    }
}
