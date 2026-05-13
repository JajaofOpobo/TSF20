package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
/* loaded from: classes.dex */
class as {
    private static ThreadLocal<Rect> a;

    public static void a(View view) {
        view.requestApplyInsets();
    }

    public static void a(View view, float f) {
        view.setElevation(f);
    }

    public static float b(View view) {
        return view.getElevation();
    }

    public static void a(View view, final ab abVar) {
        if (abVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: android.support.v4.view.as.1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return ((bj) ab.this.a(view2, new bj(windowInsets))).f();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, ColorStateList colorStateList) {
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
    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, PorterDuff.Mode mode) {
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

    public static bi a(View view, bi biVar) {
        WindowInsets f;
        WindowInsets onApplyWindowInsets;
        if ((biVar instanceof bj) && (onApplyWindowInsets = view.onApplyWindowInsets((f = ((bj) biVar).f()))) != f) {
            return new bj(onApplyWindowInsets);
        }
        return biVar;
    }

    public static bi b(View view, bi biVar) {
        WindowInsets f;
        WindowInsets dispatchApplyWindowInsets;
        if ((biVar instanceof bj) && (dispatchApplyWindowInsets = view.dispatchApplyWindowInsets((f = ((bj) biVar).f()))) != f) {
            return new bj(dispatchApplyWindowInsets);
        }
        return biVar;
    }

    public static boolean e(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void f(View view) {
        view.stopNestedScroll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, int i) {
        boolean z;
        Rect a2 = a();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !a2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        am.a(view, i);
        if (z && a2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, int i) {
        boolean z;
        Rect a2 = a();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !a2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        am.b(view, i);
        if (z && a2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(a2);
        }
    }

    private static Rect a() {
        if (a == null) {
            a = new ThreadLocal<>();
        }
        Rect rect = a.get();
        if (rect == null) {
            rect = new Rect();
            a.set(rect);
        }
        rect.setEmpty();
        return rect;
    }
}
