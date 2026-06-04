package com.censivn.C3DEngine.api.event;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.l;
import com.censivn.C3DEngine.b.r;

/* loaded from: classes.dex */
final class a extends l {
    final /* synthetic */ VMouseEventListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(VMouseEventListener vMouseEventListener, r rVar) {
        super(rVar);
        this.a = vMouseEventListener;
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        this.a.mThis.onSingleTapUp(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent) {
        this.a.mThis.onShowPress(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void c(MotionEvent motionEvent) {
        this.a.mThis.onLongPress(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void d(MotionEvent motionEvent) {
        this.a.mThis.onLongRelease(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.a.mThis.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        this.a.mThis.onDown(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        this.a.mThis.onUp(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void g(MotionEvent motionEvent) {
        this.a.mThis.onSingleUp(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.a.mThis.onMove(motionEvent, motionEvent2);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.a.mThis.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void h(MotionEvent motionEvent) {
        this.a.mThis.onDoubleTap(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void i(MotionEvent motionEvent) {
        this.a.mThis.onPointer2Up(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void j(MotionEvent motionEvent) {
        this.a.mThis.onPointer2Down(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void k(MotionEvent motionEvent) {
        this.a.mThis.onSingleTapConfirmed(motionEvent);
    }
}
