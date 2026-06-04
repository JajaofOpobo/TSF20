package com.tsf.shell.h;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class o implements Runnable {
    final /* synthetic */ m a;
    private final /* synthetic */ MotionEvent b;

    o(m mVar, MotionEvent motionEvent) {
        this.a = mVar;
        this.b = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
