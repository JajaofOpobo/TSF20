package android.support.p002v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewParent;
/* renamed from: android.support.v4.view.am */
/* loaded from: classes.dex */
class C0326am {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m12813a() {
        return ValueAnimator.getFrameDelay();
    }

    /* renamed from: a */
    public static void m12808a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    /* renamed from: a */
    public static int m12811a(View view) {
        return view.getLayerType();
    }

    /* renamed from: a */
    public static int m12812a(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    /* renamed from: b */
    public static int m12806b(View view) {
        return view.getMeasuredWidthAndState();
    }

    /* renamed from: c */
    public static int m12802c(View view) {
        return view.getMeasuredState();
    }

    /* renamed from: d */
    public static float m12800d(View view) {
        return view.getTranslationY();
    }

    /* renamed from: e */
    public static float m12798e(View view) {
        return view.getScaleX();
    }

    /* renamed from: a */
    public static void m12810a(View view, float f) {
        view.setTranslationY(f);
    }

    /* renamed from: b */
    public static void m12805b(View view, float f) {
        view.setAlpha(f);
    }

    /* renamed from: c */
    public static void m12801c(View view, float f) {
        view.setScaleX(f);
    }

    /* renamed from: d */
    public static void m12799d(View view, float f) {
        view.setScaleY(f);
    }

    /* renamed from: f */
    public static void m12797f(View view) {
        view.jumpDrawablesToCurrentState();
    }

    /* renamed from: a */
    public static void m12807a(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    /* renamed from: b */
    public static void m12803b(View view, boolean z) {
        view.setActivated(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12809a(View view, int i) {
        view.offsetTopAndBottom(i);
        m12796g(view);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            m12796g((View) parent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m12804b(View view, int i) {
        view.offsetLeftAndRight(i);
        m12796g(view);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            m12796g((View) parent);
        }
    }

    /* renamed from: g */
    private static void m12796g(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
