package com.tsf.shell.workspace3D.k.b;

import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;

/* loaded from: classes.dex */
final class u implements Runnable {
    final /* synthetic */ k a;
    private final /* synthetic */ LauncherItem3DInfo b;

    u(k kVar, LauncherItem3DInfo launcherItem3DInfo) {
        this.a = kVar;
        this.b = launcherItem3DInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.workspace3D.k.ae aeVar = new com.tsf.shell.workspace3D.k.ae((LauncherShortcut3DInfo) this.b);
        aeVar.i_();
        aeVar.aJ();
        this.a.onLoadWidgetComplete(aeVar, null);
    }
}
