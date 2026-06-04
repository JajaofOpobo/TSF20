package com.tsf.shell.workspace3D.h.a;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class af implements Runnable {
    final /* synthetic */ ae a;
    private final /* synthetic */ MotionEvent b;
    private final /* synthetic */ MotionEvent c;

    af(ae aeVar, MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.a = aeVar;
        this.b = motionEvent;
        this.c = motionEvent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        float f;
        boolean z2;
        e eVar;
        z = this.a.a.ag;
        if (!z) {
            this.a.a.bI();
            ae aeVar = this.a;
            x xVar = this.a.a;
            eVar = this.a.a.ad;
            float f2 = eVar.L().x;
            xVar.ay = f2;
            aeVar.c = f2;
        }
        x xVar2 = this.a.a;
        f = this.a.c;
        xVar2.ay = f + (this.b.getX() - this.c.getX());
        z2 = this.a.a.ai;
        if (z2) {
            float y = (float) (((this.b.getY() - this.c.getY()) / (com.censivn.C3DEngine.a.m / 2)) * 1.3d);
            this.a.a.az = (y <= 1.0f ? y < -1.0f ? -1.0f : y : 1.0f) * 45.0f;
        }
    }
}
