package com.tsf.shell.workspace3D.k.c.b;

import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class ae extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ ad a;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.ab x;

    ae(ad adVar, com.tsf.shell.workspace3D.k.ab abVar) {
        this.a = adVar;
        this.x = abVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.tsf.shell.workspace3D.k.ab abVar;
        com.censivn.C3DEngine.e.a.a aVar;
        this.x.h(true);
        abVar = ad.c;
        if (abVar == this.x) {
            bf.m();
            aVar = ad.b;
            aVar.Q();
        }
    }
}
