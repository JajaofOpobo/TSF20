package android.support.p002v4.view;

import android.view.View;
import android.view.ViewParent;
/* renamed from: android.support.v4.view.ap */
/* loaded from: classes.dex */
class C0329ap {
    /* renamed from: a */
    public static void m12791a(View view) {
        view.postInvalidateOnAnimation();
    }

    /* renamed from: a */
    public static void m12789a(View view, int i, int i2, int i3, int i4) {
        view.postInvalidate(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m12788a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: a */
    public static void m12787a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* renamed from: b */
    public static int m12786b(View view) {
        return view.getImportantForAccessibility();
    }

    /* renamed from: a */
    public static void m12790a(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    /* renamed from: c */
    public static ViewParent m12785c(View view) {
        return view.getParentForAccessibility();
    }

    /* renamed from: d */
    public static int m12784d(View view) {
        return view.getMinimumHeight();
    }

    /* renamed from: e */
    public static void m12783e(View view) {
        view.requestFitSystemWindows();
    }

    /* renamed from: f */
    public static boolean m12782f(View view) {
        return view.getFitsSystemWindows();
    }

    /* renamed from: g */
    public static boolean m12781g(View view) {
        return view.hasOverlappingRendering();
    }
}
