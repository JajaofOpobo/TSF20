package com.tsf.shell.workspace3D.k.c.b;

import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
final class r extends RenderRunnable {
    final /* synthetic */ c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(c cVar) {
        super(1, 1);
        this.a = cVar;
    }

    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
    public final void run() {
        boolean z;
        c cVar;
        c cVar2;
        c cVar3;
        z = this.a.N;
        if (z) {
            ao aoVar = c.d;
            cVar2 = this.a.z;
            cVar3 = this.a.z;
            aoVar.a(cVar2, cVar3.o());
        }
        af afVar = c.e;
        cVar = this.a.z;
        afVar.a(cVar);
        this.a.N = false;
        this.a.O = null;
    }
}
