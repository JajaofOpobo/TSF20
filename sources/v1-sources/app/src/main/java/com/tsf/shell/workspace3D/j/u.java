package com.tsf.shell.workspace3D.j;

import com.tsf.shell.R;
import com.tsf.shell.au;

/* loaded from: classes.dex */
final class u implements Runnable {
    final /* synthetic */ n a;

    u(n nVar) {
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar;
        i iVar2;
        if (com.tsf.shell.a.t.e()) {
            iVar2 = this.a.p;
            iVar2.i(true);
            com.tsf.shell.a.t.a((Boolean) false);
        } else {
            au.a(R.string.mn_lock_desktop_summary);
            iVar = this.a.p;
            iVar.h(true);
            com.tsf.shell.a.t.a((Boolean) true);
        }
    }
}
