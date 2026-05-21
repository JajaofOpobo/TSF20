package com.censivn.C3DEngine.api.event;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.b.d.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class VMouseEventListener {
    public VMouseEventListener mThis;
    public VObject3d target;
    public a vTarget;

    public VMouseEventListener() {
    }

    public VMouseEventListener(VObject3d vObject3d) {
        this.target = vObject3d;
        this.mThis = this;
        this.vTarget = new a(vObject3d.vTarget) { // from class: com.censivn.C3DEngine.api.event.VMouseEventListener.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onSingleTapUp(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onShowPress(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void c(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onLongPress(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void d(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onLongRelease(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                VMouseEventListener.this.mThis.onScroll(motionEvent, motionEvent2, f, f2);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onDown(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onUp(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void g(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onSingleUp(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                VMouseEventListener.this.mThis.onMove(motionEvent, motionEvent2);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                VMouseEventListener.this.mThis.onFling(motionEvent, motionEvent2, f, f2);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void h(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onDoubleTap(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void i(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onPointer2Up(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void j(MotionEvent motionEvent) {
                VMouseEventListener.this.mThis.onPointer2Down(motionEvent);
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void k(MotionEvent motionEvent) {
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
