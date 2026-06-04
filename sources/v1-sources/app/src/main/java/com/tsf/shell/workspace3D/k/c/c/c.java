package com.tsf.shell.workspace3D.k.c.c;

import com.censivn.C3DEngine.f.o;
import com.censivn.C3DEngine.f.p;

/* loaded from: classes.dex */
final class c implements Runnable {
    final /* synthetic */ a a;

    c(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.censivn.C3DEngine.f.f a = o.a(p.MAX_3DS, com.censivn.C3DEngine.a.c().getResources(), "com.tsf.shell:raw/widget_airship");
        a.c();
        this.a.b = a.b().d(0);
        com.censivn.C3DEngine.a.a().c(new d(this));
    }
}
