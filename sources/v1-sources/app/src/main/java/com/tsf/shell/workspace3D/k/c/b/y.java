package com.tsf.shell.workspace3D.k.c.b;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class y extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(c cVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = cVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        int i;
        i = this.a.A;
        if (i == c.b) {
            this.a.p();
        } else {
            this.a.a(true);
        }
    }
}
