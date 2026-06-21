package com.tsf.shell.widget.alarm.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;

/* loaded from: classes.dex */
class f extends VMouseEventListener {
    final /* synthetic */ e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, VObject3d vObject3d) {
        super(vObject3d);
        this.a = eVar;
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onDown(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onUp(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onSingleTapUp(MotionEvent motionEvent) {
        this.a.d();
    }
}
