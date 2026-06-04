package com.tsf.shell.workspace3D.g;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class ap extends com.censivn.C3DEngine.b.l {
    private float a;
    private float c;
    private int d;
    private ar e;
    private boolean f;

    public ap(com.censivn.C3DEngine.b.r rVar, ar arVar, int i) {
        super(rVar);
        this.f = false;
        this.e = arVar;
        this.d = i;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        float y;
        if (this.f) {
            if (this.d == 0 || this.d == 1) {
                y = motionEvent2.getY() - this.c;
            } else {
                y = motionEvent2.getX() - this.a;
            }
            com.censivn.C3DEngine.a.a().b(new aq(this, y));
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        this.f = true;
        this.a = motionEvent.getX();
        this.c = motionEvent.getY();
        this.e.q();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        boolean z;
        this.f = false;
        z = ao.D;
        if (z) {
            this.e.a(this.d);
        }
    }
}
