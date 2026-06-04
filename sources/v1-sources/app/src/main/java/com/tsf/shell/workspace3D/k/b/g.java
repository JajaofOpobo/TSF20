package com.tsf.shell.workspace3D.k.b;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class g extends com.censivn.C3DEngine.b.l {
    boolean a;
    final /* synthetic */ e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(e eVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.c = eVar;
        this.a = false;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        com.tsf.shell.action.c.a();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        com.tsf.shell.workspace3D.g.i iVar;
        com.tsf.shell.workspace3D.g.i iVar2;
        iVar = this.c.b;
        if (!iVar.b()) {
            iVar2 = this.c.b;
            iVar2.a(motionEvent, motionEvent2);
        } else if (!this.a) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            MotionEvent obtain2 = MotionEvent.obtain(motionEvent2);
            float[] a = com.censivn.C3DEngine.h.a.a(motionEvent);
            this.a = true;
            com.censivn.C3DEngine.a.a().c(new h(this, a, obtain, obtain2));
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        com.tsf.shell.workspace3D.g.i iVar;
        iVar = this.c.b;
        iVar.a(motionEvent);
        this.c.h();
        this.a = false;
    }
}
