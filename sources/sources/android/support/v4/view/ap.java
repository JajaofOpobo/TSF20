package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class ap {
    public static void a(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        view.postInvalidate(i, i2, i3, i4);
    }

    public static void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static int b(View view) {
        return view.getImportantForAccessibility();
    }

    public static void a(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static ViewParent c(View view) {
        return view.getParentForAccessibility();
    }

    public static int d(View view) {
        return view.getMinimumHeight();
    }

    public static void e(View view) {
        view.requestFitSystemWindows();
    }

    public static boolean f(View view) {
        return view.getFitsSystemWindows();
    }

    public static boolean g(View view) {
        return view.hasOverlappingRendering();
    }
}
