package com.tsf.shell.workspace3D;

import java.util.ArrayList;

/* loaded from: classes.dex */
final class ay implements Runnable {
    final /* synthetic */ ax a;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.j b;
    private final /* synthetic */ com.tsf.shell.workspace3D.h.a c;

    ay(ax axVar, com.tsf.shell.workspace3D.k.j jVar, com.tsf.shell.workspace3D.h.a aVar) {
        this.a = axVar;
        this.b = jVar;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        av avVar;
        av avVar2;
        ArrayList bH = ((com.tsf.shell.workspace3D.k.ab) this.b).bH();
        int size = bH == null ? 0 : bH.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                ((com.tsf.shell.workspace3D.k.ab) bH.get(i)).e(true);
            }
        }
        ((com.tsf.shell.workspace3D.k.ab) this.b).aW();
        bf.m();
        this.b.Q();
        this.c.g(this.b);
        this.b.e(true);
        this.b.b_();
        avVar = this.a.A;
        avVar.n();
        this.a.a = true;
        avVar2 = this.a.A;
        avVar2.m();
    }
}
