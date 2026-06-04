package com.tsf.shell.workspace3D.k.c.b;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class w extends com.censivn.C3DEngine.b.l {
    final /* synthetic */ c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(c cVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.a = cVar;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        com.tsf.shell.workspace3D.g.i iVar;
        c cVar;
        com.tsf.shell.workspace3D.g.i iVar2;
        iVar = c.w;
        cVar = this.a.z;
        iVar.a(cVar);
        iVar2 = c.w;
        iVar2.a(this.a.g);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        com.tsf.shell.workspace3D.g.i iVar;
        iVar = c.w;
        iVar.a(motionEvent, motionEvent2);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        com.tsf.shell.workspace3D.g.i iVar;
        iVar = c.w;
        iVar.a(motionEvent);
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
