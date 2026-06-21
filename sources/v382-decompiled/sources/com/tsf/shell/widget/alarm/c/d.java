package com.tsf.shell.widget.alarm.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;

/* loaded from: classes.dex */
class d extends VMouseEventListener {
    final /* synthetic */ c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, VObject3d vObject3d) {
        super(vObject3d);
        this.a = cVar;
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onDown(MotionEvent motionEvent) {
        this.a.c();
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onUp(MotionEvent motionEvent) {
        this.a.d();
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onSingleTapUp(MotionEvent motionEvent) {
        Runnable runnable;
        Runnable runnable2;
        runnable = this.a.b;
        if (runnable != null) {
            runnable2 = this.a.b;
            runnable2.run();
        }
    }
}
