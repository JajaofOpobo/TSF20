package com.tsf.shell.workspace3D.j;

import com.tsf.shell.bd;

/* loaded from: classes.dex */
final class t implements Runnable {
    final /* synthetic */ n a;

    t(n nVar) {
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar;
        if (bd.c() == 0) {
            bd.b(1);
        } else {
            bd.b(0);
        }
        hVar = this.a.o;
        hVar.h(true);
    }
}
