package com.tsf.shell.workspace3D.h.a;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class m extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ l a;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(l lVar, com.censivn.C3DEngine.b.r rVar, int i) {
        super(rVar);
        this.a = lVar;
        this.c = i;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        int i;
        int i2;
        this.a.g(this.c);
        l lVar = this.a;
        i = this.a.J;
        lVar.c(i, false);
        this.a.J = this.c;
        l lVar2 = this.a;
        i2 = this.a.J;
        lVar2.c(i2, true);
    }
}
