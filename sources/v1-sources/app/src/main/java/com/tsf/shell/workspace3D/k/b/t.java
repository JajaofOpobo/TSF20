package com.tsf.shell.workspace3D.k.b;

import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.tsf.shell.bm;

/* loaded from: classes.dex */
final class t implements Runnable {
    final /* synthetic */ k a;
    private final /* synthetic */ LauncherItem3DInfo b;
    private final /* synthetic */ Runnable c;

    t(k kVar, LauncherItem3DInfo launcherItem3DInfo, Runnable runnable) {
        this.a = kVar;
        this.b = launcherItem3DInfo;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.id == -1) {
            bm.a(this.b);
        } else {
            bm.a(com.censivn.C3DEngine.a.c(), this.b);
        }
        if (this.c != null) {
            this.c.run();
        }
    }
}
