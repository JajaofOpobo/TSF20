package com.tsf.shell.workspace3D.e.a;

import com.censivn.C3DEngine.b.r;

/* loaded from: classes.dex */
final class e extends com.censivn.C3DEngine.g.c.a.a {
    final /* synthetic */ a a;
    private final /* synthetic */ g x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(a aVar, r rVar, int i, float f, g gVar) {
        super(rVar, i, f);
        this.a = aVar;
        this.x = gVar;
    }

    @Override // com.censivn.C3DEngine.g.u
    public final void a() {
        this.x.d.Q();
        a.a(this.a, this.x);
    }
}
