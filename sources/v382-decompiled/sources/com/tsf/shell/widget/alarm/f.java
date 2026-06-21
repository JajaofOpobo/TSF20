package com.tsf.shell.widget.alarm;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.shell.VInformation;

/* loaded from: classes.dex */
class f extends VMouseEventListener {
    Number3d a;
    m b;
    int c;
    final /* synthetic */ e d;
    private double e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, VObject3d vObject3d) {
        super(vObject3d);
        this.d = eVar;
        this.a = new Number3d(0.0f, 0.0f, 0.0f);
        this.c = 1;
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onDown(MotionEvent motionEvent) {
        m mVar;
        m mVar2;
        if (i.f) {
            mVar2 = this.d.t;
            this.b = mVar2;
        } else {
            mVar = this.d.u;
            this.b = mVar;
        }
        this.b.a();
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onMove(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (this.b != null) {
            Number3d a = a(motionEvent);
            double atan2 = Math.atan2(a.y, a.x);
            Number3d a2 = a(motionEvent2);
            double atan22 = Math.atan2(a2.y, a2.x);
            this.c = atan22 > this.e ? 1 : -1;
            if (Math.abs(atan22 - this.e) > 3.141592653589793d) {
                this.c *= -1;
                u.c("EX DRAG Way");
            }
            this.e = atan22;
            float f = (float) (((atan22 - atan2) * 180.0d) / 3.141592653589793d);
            if (f < 0.0f) {
                f += 360.0f;
            }
            this.b.a(f);
        }
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onUp(MotionEvent motionEvent) {
        if (this.b != null) {
            this.b.b();
            this.b = null;
        }
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        u.c("BackPage onFling");
        if (this.b != null) {
            this.b.a(this.c, (float) ((Math.sqrt((f * f) + (f2 * f2)) / 10000.0d) * 240.0d));
        }
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onSingleTapUp(MotionEvent motionEvent) {
        if (this.b != null) {
            Number3d a = a(motionEvent);
            this.b.b((float) ((Math.atan2(a.y, a.x) * 180.0d) / 3.141592653589793d));
        }
    }

    private Number3d a(MotionEvent motionEvent) {
        float screenHeight = VInformation.getScreenHeight();
        this.a.x = motionEvent.getX() - (VInformation.getScreenWidth() / 2.0f);
        this.a.y = 0.0f - (motionEvent.getY() - (screenHeight / 2.0f));
        this.a.z = 0.0f;
        return AlarmWidget.l.globalToLocal(this.a);
    }
}
