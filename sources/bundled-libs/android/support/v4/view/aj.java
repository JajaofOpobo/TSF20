package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class aj {
    private static Field a;
    private static boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    static ColorStateList a(View view) {
        if (view instanceof af) {
            return ((af) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void a(View view, ColorStateList colorStateList) {
        if (view instanceof af) {
            ((af) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static PorterDuff.Mode b(View view) {
        if (view instanceof af) {
            return ((af) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void a(View view, PorterDuff.Mode mode) {
        if (view instanceof af) {
            ((af) view).setSupportBackgroundTintMode(mode);
        }
    }

    static boolean c(View view) {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    static int d(View view) {
        if (!b) {
            try {
                a = View.class.getDeclaredField("mMinHeight");
                a.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            b = true;
        }
        if (a != null) {
            try {
                return ((Integer) a.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }

    static boolean e(View view) {
        return view.getWindowToken() != null;
    }

    static void a(View view, int i) {
        int top = view.getTop();
        view.offsetTopAndBottom(i);
        if (i != 0) {
            Object parent = view.getParent();
            if (parent instanceof View) {
                int iAbs = Math.abs(i);
                ((View) parent).invalidate(view.getLeft(), top - iAbs, view.getRight(), top + view.getHeight() + iAbs);
            } else {
                view.invalidate();
            }
        }
    }

    static void b(View view, int i) {
        int left = view.getLeft();
        view.offsetLeftAndRight(i);
        if (i != 0) {
            Object parent = view.getParent();
            if (parent instanceof View) {
                int iAbs = Math.abs(i);
                ((View) parent).invalidate(left - iAbs, view.getTop(), left + view.getWidth() + iAbs, view.getBottom());
            } else {
                view.invalidate();
            }
        }
    }
}
