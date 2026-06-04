package com.tsf.shell.workspace3D.k.c.b;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class aq extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ ao a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aq(ao aoVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = aoVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (c.c != null) {
            c.c.j().a(motionEvent, motionEvent2);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (c.c != null) {
            c.c.j().g(f2);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void g(MotionEvent motionEvent) {
        if (c.c != null) {
            c.c.j().g(0.0f);
        }
    }
}
