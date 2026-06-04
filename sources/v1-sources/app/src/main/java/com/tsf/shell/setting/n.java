package com.tsf.shell.setting;

import android.view.MotionEvent;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class n extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ l a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(l lVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = lVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        bf.h().c();
    }
}
