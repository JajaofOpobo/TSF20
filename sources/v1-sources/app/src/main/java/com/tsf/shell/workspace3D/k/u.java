package com.tsf.shell.workspace3D.k;

import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;

/* loaded from: classes.dex */
final class u implements Runnable {
    final /* synthetic */ t a;
    private final /* synthetic */ s b;
    private final /* synthetic */ LauncherItem3DInfo c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ y e;

    u(t tVar, s sVar, LauncherItem3DInfo launcherItem3DInfo, boolean z, y yVar) {
        this.a = tVar;
        this.b = sVar;
        this.c = launcherItem3DInfo;
        this.d = z;
        this.e = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t.a(this.a, this.b, this.c, this.d, this.e);
    }
}
