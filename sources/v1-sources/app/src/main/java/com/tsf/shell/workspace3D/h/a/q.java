package com.tsf.shell.workspace3D.h.a;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class q extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ n a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(n nVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = nVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        if (!this.a.C) {
            n.b(this.a);
        }
    }
}
