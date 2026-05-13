package android.support.p002v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
/* renamed from: android.support.v4.view.as */
/* loaded from: classes.dex */
class C0332as {

    /* renamed from: a */
    private static ThreadLocal<Rect> f757a;

    /* renamed from: a */
    public static void m12774a(View view) {
        view.requestApplyInsets();
    }

    /* renamed from: a */
    public static void m12773a(View view, float f) {
        view.setElevation(f);
    }

    /* renamed from: b */
    public static float m12767b(View view) {
        return view.getElevation();
    }

    /* renamed from: a */
    public static void m12769a(View view, final InterfaceC0298ab interfaceC0298ab) {
        if (interfaceC0298ab == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: android.support.v4.view.as.1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return ((C0384bj) InterfaceC0298ab.this.mo12060a(view2, new C0384bj(windowInsets))).m12664f();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static ColorStateList m12764c(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12771a(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? false : true;
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static PorterDuff.Mode m12763d(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12770a(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? false : true;
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    /* renamed from: a */
    public static C0383bi m12768a(View view, C0383bi c0383bi) {
        WindowInsets m12664f;
        WindowInsets onApplyWindowInsets;
        if ((c0383bi instanceof C0384bj) && (onApplyWindowInsets = view.onApplyWindowInsets((m12664f = ((C0384bj) c0383bi).m12664f()))) != m12664f) {
            return new C0384bj(onApplyWindowInsets);
        }
        return c0383bi;
    }

    /* renamed from: b */
    public static C0383bi m12765b(View view, C0383bi c0383bi) {
        WindowInsets m12664f;
        WindowInsets dispatchApplyWindowInsets;
        if ((c0383bi instanceof C0384bj) && (dispatchApplyWindowInsets = view.dispatchApplyWindowInsets((m12664f = ((C0384bj) c0383bi).m12664f()))) != m12664f) {
            return new C0384bj(dispatchApplyWindowInsets);
        }
        return c0383bi;
    }

    /* renamed from: e */
    public static boolean m12762e(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: f */
    public static void m12761f(View view) {
        view.stopNestedScroll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12772a(View view, int i) {
        boolean z;
        Rect m12775a = m12775a();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m12775a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !m12775a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        C0326am.m12809a(view, i);
        if (z && m12775a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m12775a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m12766b(View view, int i) {
        boolean z;
        Rect m12775a = m12775a();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m12775a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !m12775a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        C0326am.m12804b(view, i);
        if (z && m12775a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m12775a);
        }
    }

    /* renamed from: a */
    private static Rect m12775a() {
        if (f757a == null) {
            f757a = new ThreadLocal<>();
        }
        Rect rect = f757a.get();
        if (rect == null) {
            rect = new Rect();
            f757a.set(rect);
        }
        rect.setEmpty();
        return rect;
    }
}
