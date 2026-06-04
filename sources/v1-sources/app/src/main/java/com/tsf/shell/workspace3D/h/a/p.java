package com.tsf.shell.workspace3D.h.a;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class p extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ n a;
    private final /* synthetic */ int[] c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(n nVar, com.censivn.C3DEngine.b.r rVar, int[] iArr) {
        super(rVar);
        this.a = nVar;
        this.c = iArr;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        this.a.e(this.c[4]);
    }
}
