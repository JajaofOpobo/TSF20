package com.tsf.shell.workspace3D.k.b;

import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
final class az extends RenderRunnable {
    final /* synthetic */ ay a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    az(ay ayVar) {
        super(2, 1);
        this.a = ayVar;
    }

    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
    public final void run() {
        this.a.a.a.j();
    }
}
