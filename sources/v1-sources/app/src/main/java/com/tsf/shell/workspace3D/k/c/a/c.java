package com.tsf.shell.workspace3D.k.c.a;

import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.k.b.k;

/* loaded from: classes.dex */
final class c extends RenderRunnable {
    final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(a aVar) {
        super(2, 1);
        this.a = aVar;
    }

    @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
    public final void run() {
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        h hVar5;
        hVar = this.a.f;
        if (!hVar.B.o && a.l(this.a)) {
            hVar3 = this.a.f;
            hVar3.be().isRecreate = true;
            hVar4 = this.a.f;
            hVar4.bp();
            a.o(this.a);
            a.p(this.a);
            hVar5 = this.a.f;
            hVar5.i_();
            return;
        }
        k l = bf.l();
        hVar2 = this.a.f;
        l.a((com.tsf.shell.workspace3D.k.j) hVar2);
    }
}
