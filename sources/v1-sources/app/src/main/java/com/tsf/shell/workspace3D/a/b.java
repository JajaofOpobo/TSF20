package com.tsf.shell.workspace3D.a;

import android.view.MotionEvent;
import com.tsf.shell.Home;

/* loaded from: classes.dex */
final class b implements Runnable {
    final /* synthetic */ a a;
    private final /* synthetic */ MotionEvent b;

    b(a aVar, MotionEvent motionEvent) {
        this.a = aVar;
        this.b = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Home.d().a((int) this.b.getX(), (int) this.b.getY());
    }
}
