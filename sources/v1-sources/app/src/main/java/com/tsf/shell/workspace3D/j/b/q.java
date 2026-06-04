package com.tsf.shell.workspace3D.j.b;

import com.censivn.C3DEngine.api.element.PositionNumber3d;

/* loaded from: classes.dex */
final class q extends com.censivn.C3DEngine.g.u {
    final /* synthetic */ d a;
    private final /* synthetic */ float x;
    private final /* synthetic */ float y;

    q(d dVar, float f, float f2) {
        this.a = dVar;
        this.x = f;
        this.y = f2;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a(float f) {
        com.censivn.C3DEngine.e.b.a aVar;
        com.censivn.C3DEngine.e.b bVar;
        com.censivn.C3DEngine.e.c cVar;
        com.censivn.C3DEngine.e.b.a aVar2;
        aVar = this.a.c;
        aVar.k(this.x + ((this.y - this.x) * f));
        bVar = this.a.j;
        PositionNumber3d L = bVar.L();
        cVar = this.a.q;
        PositionNumber3d L2 = cVar.L();
        aVar2 = this.a.c;
        float f2 = -aVar2.l();
        L2.y = f2;
        L.y = f2;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        com.censivn.C3DEngine.e.b.a aVar;
        aVar = this.a.c;
        aVar.ar();
    }
}
