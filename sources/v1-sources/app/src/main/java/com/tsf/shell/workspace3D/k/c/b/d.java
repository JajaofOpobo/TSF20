package com.tsf.shell.workspace3D.k.c.b;

import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.tsf.shell.bm;

/* loaded from: classes.dex */
final class d implements Runnable {
    private final /* synthetic */ LauncherFolder3DInfo a;

    d(LauncherFolder3DInfo launcherFolder3DInfo) {
        this.a = launcherFolder3DInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm.a((LauncherItem3DInfo) this.a);
    }
}
