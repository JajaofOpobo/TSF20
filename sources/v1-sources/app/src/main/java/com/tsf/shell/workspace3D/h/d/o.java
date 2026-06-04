package com.tsf.shell.workspace3D.h.d;

import com.censivn.C3DEngine.g.u;

/* loaded from: classes.dex */
final class o extends u {
    final /* synthetic */ k a;
    private final /* synthetic */ Runnable x;

    o(k kVar, Runnable runnable) {
        this.a = kVar;
        this.x = runnable;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        if (this.x != null) {
            this.x.run();
        }
    }
}
