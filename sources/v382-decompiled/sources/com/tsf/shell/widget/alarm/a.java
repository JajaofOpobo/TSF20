package com.tsf.shell.widget.alarm;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.shell.VInformation;

/* loaded from: classes.dex */
public class a extends VMouseEventListener {
    Number3d a;
    float b;
    final /* synthetic */ AlarmWidget c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AlarmWidget alarmWidget, VObject3d vObject3d) {
        super(vObject3d);
        this.c = alarmWidget;
        this.a = new Number3d(0.0f, 0.0f, 0.0f);
        this.b = 0.1f;
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onDown(MotionEvent motionEvent) {
        Number3d a = a(motionEvent);
        this.c.m.a(a.x, a.y);
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onUp(MotionEvent motionEvent) {
    }

    private Number3d a(MotionEvent motionEvent) {
        float screenHeight = VInformation.getScreenHeight();
        this.a.x = motionEvent.getX() - (VInformation.getScreenWidth() / 2.0f);
        this.a.y = 0.0f - (motionEvent.getY() - (screenHeight / 2.0f));
        this.a.z = 0.0f;
        return AlarmWidget.l.globalToLocal(this.a);
    }
}
