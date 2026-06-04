package com.tsf.shell.workspace3D.k.c.b;

import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
final class ab extends RenderRunnable {
    final /* synthetic */ c a;
    private final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(c cVar, String str) {
        super(1, 1);
        this.a = cVar;
        this.b = str;
    }

    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
    public final void run() {
        c cVar;
        c cVar2;
        ao aoVar = c.d;
        cVar = this.a.z;
        aoVar.a(cVar, this.b);
        c.d.a(this.b);
        this.a.t();
        if (this.a.q) {
            af afVar = c.e;
            cVar2 = this.a.z;
            afVar.a(cVar2);
        }
    }
}
