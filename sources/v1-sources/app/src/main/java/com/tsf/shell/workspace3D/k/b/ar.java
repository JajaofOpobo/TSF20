package com.tsf.shell.workspace3D.k.b;

import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class ar extends com.censivn.C3DEngine.g.u {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.j x;

    ar(Runnable runnable, com.tsf.shell.workspace3D.k.j jVar) {
        this.a = runnable;
        this.x = jVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        if (this.a != null) {
            this.a.run();
        }
        bf.l().a(this.x);
    }
}
