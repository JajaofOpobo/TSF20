package com.tsf.shell.workspace3D.h;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class aa implements Runnable {
    final /* synthetic */ z a;
    private final /* synthetic */ MotionEvent b;

    aa(z zVar, MotionEvent motionEvent) {
        this.a = zVar;
        this.b = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
