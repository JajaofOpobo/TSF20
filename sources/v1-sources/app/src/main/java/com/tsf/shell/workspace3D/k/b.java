package com.tsf.shell.workspace3D.k;

import com.tsf.shell.workspace3D.g.ao;

/* loaded from: classes.dex */
final class b implements Runnable {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.K = true;
        ao.i();
    }
}
