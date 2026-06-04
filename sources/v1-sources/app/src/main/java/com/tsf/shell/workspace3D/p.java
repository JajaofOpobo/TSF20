package com.tsf.shell.workspace3D;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class p implements Runnable {
    final /* synthetic */ n a;
    private final /* synthetic */ MotionEvent b;

    p(n nVar, MotionEvent motionEvent) {
        this.a = nVar;
        this.b = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
