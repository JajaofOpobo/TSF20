package com.tsf.shell.workspace3D.k.c.b;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class at extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ ao a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(ao aoVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = aoVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        au auVar = new au(this);
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(auVar);
    }
}
