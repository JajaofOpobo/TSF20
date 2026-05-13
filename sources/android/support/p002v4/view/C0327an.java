package android.support.p002v4.view;

import android.view.View;
/* renamed from: android.support.v4.view.an */
/* loaded from: classes.dex */
class C0327an {
    /* renamed from: a */
    public static boolean m12795a(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    /* renamed from: b */
    public static boolean m12793b(View view, int i) {
        return view.canScrollVertically(i);
    }

    /* renamed from: a */
    public static void m12794a(View view, Object obj) {
        view.setAccessibilityDelegate((View.AccessibilityDelegate) obj);
    }
}
