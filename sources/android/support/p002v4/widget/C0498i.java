package android.support.p002v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
/* renamed from: android.support.v4.widget.i */
/* loaded from: classes.dex */
class C0498i {

    /* renamed from: a */
    private static final int[] f1055a = {16843828};

    /* renamed from: a */
    public static void m12264a(View view) {
        if (view instanceof InterfaceC0500j) {
            view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC0499a());
            view.setSystemUiVisibility(1280);
        }
    }

    /* renamed from: a */
    public static void m12263a(View view, Object obj, int i) {
        WindowInsets windowInsets = (WindowInsets) obj;
        if (i == 3) {
            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
        } else if (i == 5) {
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        view.dispatchApplyWindowInsets(windowInsets);
    }

    /* renamed from: a */
    public static void m12262a(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i) {
        WindowInsets windowInsets = (WindowInsets) obj;
        if (i == 3) {
            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
        } else if (i == 5) {
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        marginLayoutParams.leftMargin = windowInsets.getSystemWindowInsetLeft();
        marginLayoutParams.topMargin = windowInsets.getSystemWindowInsetTop();
        marginLayoutParams.rightMargin = windowInsets.getSystemWindowInsetRight();
        marginLayoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom();
    }

    /* renamed from: a */
    public static int m12261a(Object obj) {
        if (obj != null) {
            return ((WindowInsets) obj).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: a */
    public static Drawable m12265a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1055a);
        try {
            return obtainStyledAttributes.getDrawable(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v4.widget.i$a */
    /* loaded from: classes.dex */
    static class View$OnApplyWindowInsetsListenerC0499a implements View.OnApplyWindowInsetsListener {
        View$OnApplyWindowInsetsListenerC0499a() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((InterfaceC0500j) view).mo12260a(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }
}
