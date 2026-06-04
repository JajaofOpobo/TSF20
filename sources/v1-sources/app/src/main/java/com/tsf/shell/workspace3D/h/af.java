package com.tsf.shell.workspace3D.h;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class af extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ ab a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(ab abVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = abVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        ab.i(this.a);
    }
}
