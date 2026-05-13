package android.support.p002v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
/* renamed from: android.support.v4.view.aj */
/* loaded from: classes.dex */
class C0323aj {

    /* renamed from: a */
    private static Field f754a;

    /* renamed from: b */
    private static boolean f755b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ColorStateList m12825a(View view) {
        if (view instanceof InterfaceC0303af) {
            return ((InterfaceC0303af) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12823a(View view, ColorStateList colorStateList) {
        if (view instanceof InterfaceC0303af) {
            ((InterfaceC0303af) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static PorterDuff.Mode m12821b(View view) {
        if (view instanceof InterfaceC0303af) {
            return ((InterfaceC0303af) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12822a(View view, PorterDuff.Mode mode) {
        if (view instanceof InterfaceC0303af) {
            ((InterfaceC0303af) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m12819c(View view) {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m12818d(View view) {
        if (!f755b) {
            try {
                f754a = View.class.getDeclaredField("mMinHeight");
                f754a.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f755b = true;
        }
        if (f754a != null) {
            try {
                return ((Integer) f754a.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m12817e(View view) {
        return view.getWindowToken() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12824a(View view, int i) {
        int top = view.getTop();
        view.offsetTopAndBottom(i);
        if (i != 0) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                int abs = Math.abs(i);
                ((View) parent).invalidate(view.getLeft(), top - abs, view.getRight(), top + view.getHeight() + abs);
                return;
            }
            view.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m12820b(View view, int i) {
        int left = view.getLeft();
        view.offsetLeftAndRight(i);
        if (i != 0) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                int abs = Math.abs(i);
                ((View) parent).invalidate(left - abs, view.getTop(), left + view.getWidth() + abs, view.getBottom());
                return;
            }
            view.invalidate();
        }
    }
}
