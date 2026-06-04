package com.tsf.shell.workspace3D.k.c.b;

import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class p extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ c a;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.ab x;

    p(c cVar, com.tsf.shell.workspace3D.k.ab abVar) {
        this.a = cVar;
        this.x = abVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        ArrayList arrayList;
        arrayList = this.a.R;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.a.a((com.tsf.shell.workspace3D.k.ab) it.next(), (LauncherFolder3DInfo) this.a.g.be());
        }
        this.a.b(true);
        this.a.a(false, (Runnable) null, true);
        this.a.u();
        this.a.R.clear();
        this.a.G();
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        this.x.j(1.0f - f);
    }
}
