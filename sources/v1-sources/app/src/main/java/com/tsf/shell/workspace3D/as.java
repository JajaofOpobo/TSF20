package com.tsf.shell.workspace3D;

import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
final class as extends RenderRunnable {
    final /* synthetic */ ap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(ap apVar) {
        super(1, 1);
        this.a = apVar;
    }

    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
    public final void run() {
        com.tsf.shell.workspace3D.k.ah ahVar;
        com.tsf.shell.workspace3D.k.ah ahVar2;
        int i;
        ahVar = this.a.g;
        if (ahVar != null) {
            ahVar2 = this.a.g;
            i = this.a.b;
            ahVar2.a(i);
        }
    }
}
