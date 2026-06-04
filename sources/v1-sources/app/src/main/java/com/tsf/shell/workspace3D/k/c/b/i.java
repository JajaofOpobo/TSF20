package com.tsf.shell.workspace3D.k.c.b;

import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.tsf.shell.bo;

/* loaded from: classes.dex */
final class i implements Runnable {
    final /* synthetic */ c a;
    private final /* synthetic */ LauncherFolder3DInfo b;

    i(c cVar, LauncherFolder3DInfo launcherFolder3DInfo) {
        this.a = cVar;
        this.b = launcherFolder3DInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bo.a(com.censivn.C3DEngine.a.c(), this.b);
    }
}
