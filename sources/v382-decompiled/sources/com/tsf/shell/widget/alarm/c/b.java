package com.tsf.shell.widget.alarm.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.tsf.shell.widget.alarm.u;

/* loaded from: classes.dex */
class b extends VMouseEventListener {
    final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, VObject3d vObject3d) {
        super(vObject3d);
        this.a = aVar;
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onDown(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onUp(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onSingleTapUp(MotionEvent motionEvent) {
        u.c("APMToggle  onSingleTapUp");
        this.a.c();
    }
}
