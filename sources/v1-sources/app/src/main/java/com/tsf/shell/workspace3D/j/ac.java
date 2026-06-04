package com.tsf.shell.workspace3D.j;

import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class ac implements Runnable {
    final /* synthetic */ n a;

    ac(n nVar) {
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.setting.e eVar;
        com.tsf.shell.setting.e eVar2;
        if (bf.i().c()) {
            bf.i().h();
            eVar2 = this.a.v;
            eVar2.e(0);
        } else {
            bf.i().a(true);
            eVar = this.a.v;
            eVar.e(1);
        }
    }
}
