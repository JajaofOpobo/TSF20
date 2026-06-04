package com.tsf.shell.workspace3D.k;

import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.tsf.shell.bm;

/* loaded from: classes.dex */
final class w implements Runnable {
    final /* synthetic */ v a;
    private final /* synthetic */ LauncherItem3DInfo b;

    w(v vVar, LauncherItem3DInfo launcherItem3DInfo) {
        this.a = vVar;
        this.b = launcherItem3DInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm.a(this.b);
    }
}
