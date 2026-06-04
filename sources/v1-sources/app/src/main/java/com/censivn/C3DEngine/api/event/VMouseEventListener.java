package com.censivn.C3DEngine.api.event;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.b.l;

/* loaded from: classes.dex */
public class VMouseEventListener {
    public VMouseEventListener mThis;
    public VObject3d target;
    public l vTarget;

    public VMouseEventListener() {
    }

    public VMouseEventListener(VObject3d vObject3d) {
        this.target = vObject3d;
        this.mThis = this;
        this.vTarget = new a(this, vObject3d.vTarget);
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
