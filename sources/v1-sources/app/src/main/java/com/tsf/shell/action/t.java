package com.tsf.shell.action;

import com.censivn.C3DEngine.b.w;
import com.tsf.shell.bd;

/* loaded from: classes.dex */
final class t implements Runnable {
    t() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!bd.a()) {
            bd.a(false);
            r.b = true;
        }
        u uVar = new u(this);
        com.censivn.C3DEngine.a.a();
        w.a(uVar);
    }
}
