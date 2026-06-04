package com.tsf.shell.setting.a;

import com.tsf.shell.bd;

/* loaded from: classes.dex */
final class t implements Runnable {
    final /* synthetic */ g a;

    t(g gVar) {
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        com.censivn.C3DEngine.b.v vVar;
        com.censivn.C3DEngine.b.v vVar2;
        this.a.q = false;
        gVar = g.s;
        bd.a(gVar);
        vVar = this.a.c;
        vVar2 = this.a.d;
        vVar.d(vVar2);
        g.j(this.a);
    }
}
