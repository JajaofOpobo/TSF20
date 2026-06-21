package com.tsf.shell.e.e;

import android.view.MotionEvent;

/* loaded from: classes.dex */
class ab extends com.censivn.C3DEngine.b.d.a {
    private float a;
    private float b;
    private int d;
    private ad e;
    private boolean f;

    public ab(com.censivn.C3DEngine.b.f.j jVar, ad adVar, int i) {
        super(jVar);
        this.f = false;
        this.e = adVar;
        this.d = i;
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        final float y;
        if (this.f) {
            if (this.d == 0 || this.d == 1) {
                y = motionEvent2.getY() - this.b;
            } else {
                y = motionEvent2.getX() - this.a;
            }
            com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.e.ab.1
                @Override // java.lang.Runnable
                public void run() {
                    ab.this.e.a(ab.this.d, y);
                }
            });
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        this.f = true;
        this.a = motionEvent.getX();
        this.b = motionEvent.getY();
        this.e.j();
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void f(MotionEvent motionEvent) {
        boolean z;
        this.f = false;
        z = aa.e;
        if (z) {
            this.e.a(this.d);
        }
    }
}
