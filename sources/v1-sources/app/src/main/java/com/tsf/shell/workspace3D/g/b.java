package com.tsf.shell.workspace3D.g;

import com.censivn.C3DEngine.api.element.PositionNumber3d;

/* loaded from: classes.dex */
final class b extends com.censivn.C3DEngine.b.v {
    b() {
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void c() {
        com.tsf.shell.workspace3D.k.j jVar;
        com.censivn.C3DEngine.e.b bVar;
        com.tsf.shell.workspace3D.k.j jVar2;
        com.censivn.C3DEngine.e.b bVar2;
        com.tsf.shell.workspace3D.k.j jVar3;
        jVar = a.j;
        if (jVar != null) {
            bVar = a.b;
            PositionNumber3d L = bVar.L();
            jVar2 = a.j;
            L.y = jVar2.L().y;
            bVar2 = a.c;
            PositionNumber3d L2 = bVar2.L();
            jVar3 = a.j;
            L2.x = jVar3.L().x;
        }
    }
}
