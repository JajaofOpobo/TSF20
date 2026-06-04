package com.censivn.C3DEngine.b;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class p implements Runnable {
    final /* synthetic */ m a;
    private final /* synthetic */ MotionEvent b;

    p(m mVar, MotionEvent motionEvent) {
        this.a = mVar;
        this.b = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.workspace3D.a.a aVar;
        aVar = this.a.e;
        aVar.f(this.b);
    }
}
