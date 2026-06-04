package com.tsf.shell.setting.a;

import com.tsf.shell.bd;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class j implements Runnable {
    final /* synthetic */ i a;

    j(i iVar) {
        this.a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        com.censivn.C3DEngine.b.v vVar;
        this.a.a.q = false;
        gVar = g.s;
        bd.b(gVar);
        bf.m().a();
        vVar = this.a.a.d;
        vVar.Q();
        g.k(this.a.a);
    }
}
