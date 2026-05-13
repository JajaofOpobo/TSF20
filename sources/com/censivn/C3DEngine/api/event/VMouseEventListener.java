package com.censivn.C3DEngine.api.event;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
/* loaded from: classes.dex */
public class VMouseEventListener {
    public VMouseEventListener mThis;
    public VObject3d target;
    public C0937a vTarget;

    public VMouseEventListener() {
    }

    public VMouseEventListener(VObject3d vObject3d) {
        this.target = vObject3d;
        this.mThis = this;
        this.vTarget = new C0937a(vObject3d.vTarget) { // from class: com.censivn.C3DEngine.api.event.VMouseEventListener.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onSingleTapUp(motionEvent);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: b */
            public void mo3548b(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onShowPress(motionEvent);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: c */
            public void mo2122c(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onLongPress(motionEvent);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: d */
            public void mo2119d(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onLongRelease(motionEvent);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                VMouseEventListener.this.mThis.onScroll(motionEvent, motionEvent2, f, f2);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onDown(motionEvent);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: f */
            public void mo1653f(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onUp(motionEvent);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: g */
            public void mo3208g(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onSingleUp(motionEvent);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                VMouseEventListener.this.mThis.onMove(motionEvent, motionEvent2);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: b */
            public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                VMouseEventListener.this.mThis.onFling(motionEvent, motionEvent2, f, f2);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: h */
            public void mo3555h(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onDoubleTap(motionEvent);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: i */
            public void mo3544i(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onPointer2Up(motionEvent);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: j */
            public void mo3543j(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onPointer2Down(motionEvent);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: k */
            public void mo10267k(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onSingleTapConfirmed(motionEvent);
            }
        };
    }

    public VObject3d getTarget() {
        return this.target;
    }

    public Object getVirtualTarget() {
        return this.vTarget;
    }

    public void onSingleTapUp(MotionEvent motionEvent) {
    }

    public void onSingleTapConfirmed(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onLongRelease(MotionEvent motionEvent) {
    }

    public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    public void onDown(MotionEvent motionEvent) {
    }

    public void onUp(MotionEvent motionEvent) {
    }

    public void onSingleUp(MotionEvent motionEvent) {
    }

    public void onMove(MotionEvent motionEvent, MotionEvent motionEvent2) {
    }

    public void onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    public void onDoubleTap(MotionEvent motionEvent) {
    }

    public void onPointer2Up(MotionEvent motionEvent) {
    }

    public void onPointer2Down(MotionEvent motionEvent) {
    }
}
