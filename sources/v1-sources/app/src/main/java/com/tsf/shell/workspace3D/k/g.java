package com.tsf.shell.workspace3D.k;

import com.tsf.shell.Home;
import com.tsf.shell.bm;

/* loaded from: classes.dex */
final class g implements Runnable {
    final /* synthetic */ a a;

    g(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Home.d().g().deleteAppWidgetId(this.a.be().appWidgetId);
        bm.b(com.censivn.C3DEngine.a.c(), this.a.be());
    }
}
