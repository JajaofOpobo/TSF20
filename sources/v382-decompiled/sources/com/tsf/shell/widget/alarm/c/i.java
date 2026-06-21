package com.tsf.shell.widget.alarm.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.tsf.shell.widget.alarm.u;

/* loaded from: classes.dex */
class i extends VMouseEventListener {
    final /* synthetic */ h a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, VObject3d vObject3d) {
        super(vObject3d);
        this.a = hVar;
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onDown(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onUp(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onSingleTapUp(MotionEvent motionEvent) {
        int i;
        StringBuilder sb = new StringBuilder("onSingleTapUp+");
        i = this.a.f;
        u.c(sb.append(i).toString());
        this.a.c();
    }
}
