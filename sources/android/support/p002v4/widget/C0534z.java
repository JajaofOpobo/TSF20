package android.support.p002v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
/* renamed from: android.support.v4.widget.z */
/* loaded from: classes.dex */
class C0534z {
    /* renamed from: a */
    public static Object m12134a(Context context, Interpolator interpolator) {
        return interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    /* renamed from: a */
    public static boolean m12133a(Object obj) {
        return ((OverScroller) obj).isFinished();
    }

    /* renamed from: b */
    public static int m12127b(Object obj) {
        return ((OverScroller) obj).getCurrX();
    }

    /* renamed from: c */
    public static int m12126c(Object obj) {
        return ((OverScroller) obj).getCurrY();
    }

    /* renamed from: d */
    public static boolean m12125d(Object obj) {
        return ((OverScroller) obj).computeScrollOffset();
    }

    /* renamed from: a */
    public static void m12132a(Object obj, int i, int i2, int i3, int i4) {
        ((OverScroller) obj).startScroll(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m12131a(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((OverScroller) obj).startScroll(i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public static void m12129a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((OverScroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    /* renamed from: a */
    public static void m12128a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        ((OverScroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    /* renamed from: e */
    public static void m12124e(Object obj) {
        ((OverScroller) obj).abortAnimation();
    }

    /* renamed from: f */
    public static int m12123f(Object obj) {
        return ((OverScroller) obj).getFinalX();
    }

    /* renamed from: g */
    public static int m12122g(Object obj) {
        return ((OverScroller) obj).getFinalY();
    }

    /* renamed from: a */
    public static boolean m12130a(Object obj, int i, int i2, int i3, int i4, int i5, int i6) {
        return ((OverScroller) obj).springBack(i, i2, i3, i4, i5, i6);
    }
}
