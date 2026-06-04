package com.tsf.shell.workspace3D.k.b;

import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class ay implements Runnable {
    final /* synthetic */ ax a;

    ay(ax axVar) {
        this.a = axVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bf.l().j();
        a.a(true);
        az azVar = new az(this);
        azVar.autoInvalidate = true;
        com.censivn.C3DEngine.a.a().a((RenderRunnable) azVar);
    }
}
