package com.censivn.C3DEngine.b;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class q implements Runnable {
    final /* synthetic */ m a;
    private final /* synthetic */ MotionEvent b;
    private final /* synthetic */ MotionEvent c;
    private final /* synthetic */ float d;
    private final /* synthetic */ float e;

    q(m mVar, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.a = mVar;
        this.b = motionEvent;
        this.c = motionEvent2;
        this.d = f;
        this.e = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.workspace3D.a.a aVar;
        aVar = this.a.e;
        aVar.b(this.b, this.c, this.d, this.e);
    }
}
