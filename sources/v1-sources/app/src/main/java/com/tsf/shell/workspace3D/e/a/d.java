package com.tsf.shell.workspace3D.e.a;

import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;

/* loaded from: classes.dex */
final class d extends com.censivn.C3DEngine.g.c.a.a {
    final /* synthetic */ a a;
    private final /* synthetic */ g x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(a aVar, r rVar, int i, float f, g gVar) {
        super(rVar, i, f);
        this.a = aVar;
        this.x = gVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        v vVar;
        h hVar;
        h hVar2;
        this.x.d.Q();
        a.a(this.a, this.x);
        vVar = this.a.i;
        vVar.Q();
        this.a.n = false;
        this.a.o = false;
        hVar = this.a.k;
        if (hVar != null) {
            a aVar = this.a;
            hVar2 = this.a.k;
            aVar.j = hVar2;
            this.a.k = null;
        }
    }
}
