package android.support.v4.view;

import android.view.View;

/* loaded from: classes.dex */
class az {
    public static void a(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static int b(View view) {
        return view.getImportantForAccessibility();
    }

    public static void a(View view, int i) {
        view.setImportantForAccessibility(i);
    }
}
