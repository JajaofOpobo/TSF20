package com.tsf.shell.workspace3D.e;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class af extends com.censivn.C3DEngine.b.l {
    boolean a;
    final /* synthetic */ p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(p pVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.c = pVar;
        this.a = true;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        e eVar;
        e eVar2;
        if (this.a) {
            this.a = false;
            eVar2 = this.c.af;
            eVar2.a(motionEvent2.getX(), motionEvent2.getY());
        }
        eVar = this.c.af;
        eVar.c(motionEvent2.getX(), motionEvent2.getY());
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        e eVar;
        if (!this.a) {
            this.a = true;
            eVar = this.c.af;
            eVar.n();
        }
    }
}
