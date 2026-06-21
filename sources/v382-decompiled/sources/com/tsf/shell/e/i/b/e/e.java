package com.tsf.shell.e.i.b.e;

import android.view.MotionEvent;

/* loaded from: classes.dex */
class e extends com.tsf.shell.e.i.a.c {
    final /* synthetic */ d g;
    private float h;
    private float i;
    private b j;
    private boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, b bVar) {
        super(bVar);
        this.g = dVar;
        this.k = false;
        this.j = bVar;
    }

    @Override // com.tsf.shell.e.i.a.c, com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent) {
        int i;
        com.tsf.shell.manager.action.b bVar = com.tsf.shell.manager.a.d;
        i = this.g.t;
        bVar.a(i);
    }

    @Override // com.tsf.shell.e.i.a.c, com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        this.k = false;
        this.h = motionEvent.getX();
        this.i = motionEvent.getY();
        this.j.aQ();
        com.tsf.shell.manager.action.h.a();
    }

    @Override // com.tsf.shell.e.i.a.c, com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.k) {
            com.tsf.shell.manager.a.h.a(motionEvent2.getX(), motionEvent2.getY(), this.h, this.i);
            return;
        }
        com.tsf.shell.manager.a.h.w();
        com.tsf.shell.manager.a.h.a(motionEvent2.getX(), motionEvent2.getY(), this.h, this.i);
        this.k = true;
    }

    @Override // com.tsf.shell.e.i.a.c, com.censivn.C3DEngine.b.d.a
    public void f(MotionEvent motionEvent) {
        if (this.k) {
            com.tsf.shell.manager.a.h.x();
            this.k = false;
        }
    }
}
