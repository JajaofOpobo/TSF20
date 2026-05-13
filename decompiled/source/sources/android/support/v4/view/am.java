package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
class am {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a() {
        return ValueAnimator.getFrameDelay();
    }

    public static void a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    public static int a(View view) {
        return view.getLayerType();
    }

    public static int a(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    public static int b(View view) {
        return view.getMeasuredWidthAndState();
    }

    public static int c(View view) {
        return view.getMeasuredState();
    }

    public static float d(View view) {
        return view.getTranslationY();
    }

    public static float e(View view) {
        return view.getScaleX();
    }

    public static void a(View view, float f) {
        view.setTranslationY(f);
    }

    public static void b(View view, float f) {
        view.setAlpha(f);
    }

    public static void c(View view, float f) {
        view.setScaleX(f);
    }

    public static void d(View view, float f) {
        view.setScaleY(f);
    }

    public static void f(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void a(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    public static void b(View view, boolean z) {
        view.setActivated(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, int i) {
        view.offsetTopAndBottom(i);
        g(view);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            g((View) parent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, int i) {
        view.offsetLeftAndRight(i);
        g(view);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            g((View) parent);
        }
    }

    private static void g(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
