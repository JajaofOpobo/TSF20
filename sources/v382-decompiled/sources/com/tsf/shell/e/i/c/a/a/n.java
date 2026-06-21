package com.tsf.shell.e.i.c.a.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.event.VMouseEventListener;
import com.censivn.C3DEngine.api.shell.VInformation;

/* loaded from: classes.dex */
class n extends VMouseEventListener {
    Number3d a;
    float b;
    float c;
    final /* synthetic */ m d;
    private boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(m mVar, VObject3d vObject3d) {
        super(vObject3d);
        this.d = mVar;
        this.a = new Number3d(0.0f, 0.0f, 0.0f);
        this.b = 0.0f;
        this.c = 0.0f;
        this.e = false;
    }

    private Number3d a(MotionEvent motionEvent) {
        float screenHeight = VInformation.getScreenHeight();
        this.a.x = motionEvent.getX() - (VInformation.getScreenWidth() / 2.0f);
        this.a.y = 0.0f - (motionEvent.getY() - (screenHeight / 2.0f));
        this.a.z = 0.0f;
        Number3d globalToLocal = this.d.globalToLocal(this.a);
        globalToLocal.y -= 112.0f;
        return globalToLocal;
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onSingleTapUp(MotionEvent motionEvent) {
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onDown(MotionEvent motionEvent) {
        this.e = false;
        this.d.d.a = 0.0f;
        Number3d a = a(motionEvent);
        this.c = (float) Math.atan2(a.y, a.x);
        this.b = this.d.d.b;
        this.d.invalidate();
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onUp(MotionEvent motionEvent) {
        if (!this.e) {
            this.d.d.a = 2.0E-4f;
            this.d.invalidate();
        }
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Number3d a = a(motionEvent2);
        this.d.d.c = (float) (this.b - Math.toDegrees((float) (this.c - ((float) Math.atan2(a.y, a.x)))));
        this.d.invalidate();
    }

    @Override // com.censivn.C3DEngine.api.event.VMouseEventListener
    public void onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.e = true;
        float sqrt = (float) ((Math.sqrt((f * f) + (f2 * f2)) / 2000.0d) * 5.0d);
        if (f > 0.0f) {
            this.d.b.a += sqrt;
            this.d.c.a += sqrt * 0.9f;
            k kVar = this.d.d;
            kVar.a = (sqrt * 0.8f) + kVar.a;
        } else {
            this.d.b.a -= sqrt;
            this.d.c.a -= sqrt * 0.9f;
            this.d.d.a -= sqrt * 0.8f;
        }
        this.d.invalidate();
    }
}
