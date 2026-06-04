package com.tsf.shell.workspace3D.h;

import com.tsf.shell.R;

/* loaded from: classes.dex */
final class v implements Runnable {
    final /* synthetic */ l a;

    v(l lVar) {
        this.a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.workspace3D.al alVar;
        a aVar;
        alVar = this.a.u;
        com.censivn.C3DEngine.b.v c = alVar.c();
        if (c != null && (c instanceof com.tsf.shell.workspace3D.k.a)) {
            com.tsf.shell.workspace3D.k.a aVar2 = (com.tsf.shell.workspace3D.k.a) c;
            if (this.a.k.q() != null) {
                a aVar3 = this.a.k;
                aVar = this.a.o;
                if (aVar3 != aVar) {
                    if (!this.a.k.q().a(aVar2.be().width * aVar2.be().height, aVar2.C)) {
                        this.a.t();
                        com.tsf.shell.au.a(R.string.out_of_space);
                    }
                }
            }
            this.a.s();
            return;
        }
        this.a.s();
    }
}
