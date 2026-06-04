package com.tsf.shell.workspace3D;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class bc extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ av a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(av avVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = avVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        com.tsf.shell.action.c.a();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        this.a.k();
    }
}
