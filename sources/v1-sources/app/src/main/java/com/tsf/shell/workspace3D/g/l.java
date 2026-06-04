package com.tsf.shell.workspace3D.g;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class l implements Runnable {
    final /* synthetic */ j a;
    private final /* synthetic */ MotionEvent b;

    l(j jVar, MotionEvent motionEvent) {
        this.a = jVar;
        this.b = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.workspace3D.k.a.a aVar;
        aVar = i.d;
        aVar.b(this.b.getX(), this.b.getY());
    }
}
