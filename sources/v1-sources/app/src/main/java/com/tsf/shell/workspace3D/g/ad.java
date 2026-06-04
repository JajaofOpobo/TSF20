package com.tsf.shell.workspace3D.g;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class ad extends com.censivn.C3DEngine.b.l {
    ad(com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        y.b(y.a(motionEvent));
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        y yVar;
        int i4;
        i = y.i;
        if (i != -1) {
            i2 = y.i;
            if (i2 != 5) {
                i3 = y.i;
                y.b(i3, false);
                yVar = y.k;
                i4 = y.i;
                yVar.a(i4, false);
                y.i = -1;
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        boolean z;
        int i;
        int i2;
        int i3 = 5;
        z = y.m;
        if (z) {
            float[] b = com.censivn.C3DEngine.h.a.b(motionEvent2.getX(), motionEvent2.getY());
            i = y.n;
            i2 = y.o;
            if (com.censivn.C3DEngine.h.a.b(i, i2, b[0], b[1]) > 50.0f) {
                y.m = false;
            }
        } else {
            i3 = y.a(motionEvent2);
        }
        y.b(i3);
    }
}
