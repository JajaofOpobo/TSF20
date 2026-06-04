package com.tsf.shell.workspace3D.k.c.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.LauncherFolder3DInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class v extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ t a;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.ab x;
    private final /* synthetic */ ArrayList y;
    private final /* synthetic */ LauncherFolder3DInfo z;

    v(t tVar, com.tsf.shell.workspace3D.k.ab abVar, ArrayList arrayList, LauncherFolder3DInfo launcherFolder3DInfo) {
        this.a = tVar;
        this.x = abVar;
        this.y = arrayList;
        this.z = launcherFolder3DInfo;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        c cVar5;
        c cVar6;
        c cVar7;
        c cVar8;
        cVar = this.a.a;
        Number3d d = cVar.h.d(this.x.c(new Number3d(0.0f, 0.0f, 0.0f)));
        if (this.y.size() != 0) {
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                com.tsf.shell.workspace3D.k.j jVar = (com.tsf.shell.workspace3D.k.j) it.next();
                cVar7 = this.a.a;
                cVar7.a((com.tsf.shell.workspace3D.k.ab) jVar, this.z);
                jVar.Q();
                jVar.L().setAllFrom(d);
                cVar8 = this.a.a;
                cVar8.h.d(jVar);
            }
            this.y.clear();
        }
        this.x.Q();
        this.x.L().setAllFrom(d);
        cVar2 = this.a.a;
        cVar2.h.d(this.x);
        cVar3 = this.a.a;
        cVar3.b(true);
        cVar4 = this.a.a;
        cVar4.a(false, (Runnable) null, true);
        cVar5 = this.a.a;
        cVar5.u();
        cVar6 = this.a.a;
        cVar6.G();
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        this.x.j(1.0f - f);
    }
}
