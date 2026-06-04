package com.censivn.C3DEngine.b;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class e implements Runnable {
    final /* synthetic */ b a;

    e(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        boolean z;
        g gVar2;
        MotionEvent motionEvent;
        gVar = this.a.l;
        if (gVar != null) {
            z = this.a.m;
            if (!z) {
                gVar2 = this.a.l;
                motionEvent = this.a.q;
                gVar2.a(motionEvent);
            }
        }
    }
}
