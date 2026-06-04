package com.tsf.shell.workspace3D.h;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class w extends com.tsf.shell.workspace3D.a.c {
    final /* synthetic */ l a;
    private final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(l lVar, com.censivn.C3DEngine.b.r rVar, a aVar) {
        super(rVar);
        this.a = lVar;
        this.c = aVar;
    }

    @Override // com.tsf.shell.workspace3D.a.c, com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        int i;
        int i2;
        i = this.a.r;
        if (i != 1) {
            i2 = this.a.r;
            if (i2 != 3) {
                return;
            }
        }
        this.a.c(this.c);
        this.a.s();
    }
}
