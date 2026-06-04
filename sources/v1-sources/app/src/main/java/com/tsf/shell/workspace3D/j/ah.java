package com.tsf.shell.workspace3D.j;

import com.tsf.shell.workspace3D.bf;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class ah extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ n a;
    private final /* synthetic */ Runnable x;

    ah(n nVar, Runnable runnable) {
        this.a = nVar;
        this.x = runnable;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.b.v vVar;
        ArrayList arrayList;
        bf.m();
        vVar = this.a.a;
        vVar.Q();
        n.g(this.a);
        arrayList = this.a.x;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tsf.shell.setting.e eVar = (com.tsf.shell.setting.e) it.next();
            eVar.N().setAll(0.0f, 0.0f, 1.0f);
            eVar.aL();
        }
        if (this.x != null) {
            this.x.run();
        }
    }
}
