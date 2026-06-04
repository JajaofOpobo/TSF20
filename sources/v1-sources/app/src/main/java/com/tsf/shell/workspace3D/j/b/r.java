package com.tsf.shell.workspace3D.j.b;

import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class r extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ d a;
    private final /* synthetic */ Runnable x;

    r(d dVar, Runnable runnable) {
        this.a = dVar;
        this.x = runnable;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.b.v vVar;
        ArrayList arrayList;
        bf.m();
        vVar = this.a.a;
        vVar.Q();
        d.k(this.a);
        arrayList = this.a.o;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            aVar.a(0.0f);
            aVar.n();
        }
        if (this.x != null) {
            this.x.run();
        }
    }
}
