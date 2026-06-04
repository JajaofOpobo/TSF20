package com.censivn.C3DEngine.b;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class o implements Runnable {
    final /* synthetic */ n a;
    private final /* synthetic */ MotionEvent b;

    o(n nVar, MotionEvent motionEvent) {
        this.a = nVar;
        this.b = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar;
        m mVar2;
        m mVar3;
        b bVar;
        switch (this.b.getAction()) {
            case 261:
                mVar2 = this.a.a;
                m.b(mVar2, this.b);
                break;
            case 262:
                mVar = this.a.a;
                m.c(mVar, this.b);
                break;
        }
        mVar3 = this.a.a;
        bVar = mVar3.b;
        bVar.a(this.b);
    }
}
