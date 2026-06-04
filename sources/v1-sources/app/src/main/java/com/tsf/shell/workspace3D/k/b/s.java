package com.tsf.shell.workspace3D.k.b;

import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.tsf.shell.bm;

/* loaded from: classes.dex */
final class s implements Runnable {
    final /* synthetic */ k a;
    private final /* synthetic */ LauncherItem3DInfo b;

    s(k kVar, LauncherItem3DInfo launcherItem3DInfo) {
        this.a = kVar;
        this.b = launcherItem3DInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b.appWidgetId);
        bm.b(com.censivn.C3DEngine.a.c(), this.b);
        this.b.unbind();
    }
}
