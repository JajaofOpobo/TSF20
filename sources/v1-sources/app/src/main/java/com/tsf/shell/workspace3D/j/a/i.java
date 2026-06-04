package com.tsf.shell.workspace3D.j.a;

import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class i implements Runnable {
    final /* synthetic */ a a;

    i(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        this.a.u = false;
        bf.j().o().e();
        z = this.a.v;
        if (z) {
            bf.j().o().l();
        } else {
            bf.j().o().k();
        }
    }
}
