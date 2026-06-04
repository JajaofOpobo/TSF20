package com.tsf.shell.workspace3D.k.b;

import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class aq extends com.censivn.C3DEngine.g.u {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.j x;

    aq(Runnable runnable, com.tsf.shell.workspace3D.k.j jVar) {
        this.a = runnable;
        this.x = jVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        if (this.a != null) {
            this.a.run();
        }
        bf.l().a(this.x);
        bf.s().d(this.x);
    }
}
