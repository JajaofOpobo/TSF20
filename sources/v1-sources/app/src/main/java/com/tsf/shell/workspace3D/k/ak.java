package com.tsf.shell.workspace3D.k;

import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
final class ak extends RenderRunnable {
    final /* synthetic */ aj a;
    private final /* synthetic */ com.censivn.C3DEngine.b.r b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(aj ajVar, com.censivn.C3DEngine.b.r rVar) {
        super(2, 1);
        this.a = ajVar;
        this.b = rVar;
    }

    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
    public final void run() {
        LauncherShortcut3DInfo launcherShortcut3DInfo;
        int i;
        int i2;
        this.b.a_(false);
        aj ajVar = this.a;
        launcherShortcut3DInfo = this.a.a;
        i = aj.T;
        i2 = aj.U;
        ajVar.b(launcherShortcut3DInfo.getIcon(true, i, i2));
    }
}
