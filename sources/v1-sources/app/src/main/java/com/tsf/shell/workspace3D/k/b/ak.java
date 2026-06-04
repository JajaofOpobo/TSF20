package com.tsf.shell.workspace3D.k.b;

import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;

/* loaded from: classes.dex */
final class ak implements Runnable {
    final /* synthetic */ aj a;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.al b;
    private final /* synthetic */ LauncherItem3DInfo c;

    ak(aj ajVar, com.tsf.shell.workspace3D.k.al alVar, LauncherItem3DInfo launcherItem3DInfo) {
        this.a = ajVar;
        this.b = alVar;
        this.c = launcherItem3DInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ai aiVar;
        aiVar = this.a.a;
        aiVar.a(this.b, this.c);
    }
}
