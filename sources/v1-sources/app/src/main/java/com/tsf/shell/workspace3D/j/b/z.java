package com.tsf.shell.workspace3D.j.b;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class z extends com.censivn.C3DEngine.b.l {
    public Runnable a;
    public boolean c;
    final /* synthetic */ d d;
    private float e;
    private float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d dVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.d = dVar;
        this.c = false;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        float f;
        float f2;
        f = this.d.m;
        this.e = f;
        f2 = this.d.n;
        this.f = f2;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.d.m = (this.e + motionEvent2.getX()) - motionEvent.getX();
        this.d.n = this.f - (motionEvent2.getY() - motionEvent.getY());
        this.d.g();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        com.tsf.shell.g.h.a();
        if (this.c) {
            this.d.a(this.a);
        } else if (this.a != null) {
            this.a.run();
        }
    }
}
