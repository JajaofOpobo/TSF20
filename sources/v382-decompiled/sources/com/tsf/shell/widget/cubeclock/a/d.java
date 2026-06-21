package com.tsf.shell.widget.cubeclock.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.tsf.shell.widget.cubeclock.j;

/* loaded from: classes.dex */
class d extends VMouseEventListener {
    Number3d a;
    final /* synthetic */ b b;
    private float c;
    private float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, VObject3d vObject3d) {
        super(vObject3d);
        com.tsf.shell.widget.cubeclock.c cVar;
        this.b = bVar;
        this.a = new Number3d(0.0f, 0.0f, 0.0f);
        cVar = bVar.l;
        this.c = 416.0f * cVar.p;
        this.d = this.c / 2.0f;
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onDown(MotionEvent motionEvent) {
        j.a("onDown" + motionEvent.getX());
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        this.b.j = a(a(motionEvent2).x);
        b bVar = this.b;
        f3 = this.b.j;
        bVar.a((int) Math.floor(f3));
        this.b.invalidate();
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onSingleTapUp(MotionEvent motionEvent) {
        float f;
        this.b.j = a(a(motionEvent).x);
        b bVar = this.b;
        f = this.b.j;
        bVar.a((int) Math.floor(f));
        this.b.invalidate();
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onUp(MotionEvent motionEvent) {
        this.b.j = -5.0f;
    }

    private Number3d a(MotionEvent motionEvent) {
        float screenHeight = VInformation.getScreenHeight();
        this.a.x = motionEvent.getX() - (VInformation.getScreenWidth() / 2.0f);
        this.a.y = 0.0f - (motionEvent.getY() - (screenHeight / 2.0f));
        this.a.z = 0.0f;
        return this.b.globalToLocal(this.a);
    }

    private float a(float f) {
        float f2 = ((this.d + f) / this.c) * 16.0f;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        if (f2 > 15.0f) {
            return 15.0f;
        }
        return f2;
    }
}
