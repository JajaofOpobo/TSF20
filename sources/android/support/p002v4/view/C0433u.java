package android.support.p002v4.view;

import android.view.MotionEvent;
/* renamed from: android.support.v4.view.u */
/* loaded from: classes.dex */
class C0433u {
    /* renamed from: a */
    public static int m12582a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    /* renamed from: b */
    public static int m12581b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    /* renamed from: c */
    public static float m12580c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    /* renamed from: d */
    public static float m12579d(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    /* renamed from: a */
    public static int m12583a(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }
}
