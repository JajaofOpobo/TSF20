package android.support.p002v4.view.p011a;

import android.view.accessibility.AccessibilityNodeInfo;
/* renamed from: android.support.v4.view.a.e */
/* loaded from: classes.dex */
class C0274e {
    /* renamed from: a */
    public static boolean m13003a(Object obj) {
        return ((AccessibilityNodeInfo) obj).isVisibleToUser();
    }

    /* renamed from: a */
    public static void m13001a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setVisibleToUser(z);
    }

    /* renamed from: a */
    public static void m13002a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).setMovementGranularities(i);
    }

    /* renamed from: b */
    public static int m13000b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getMovementGranularities();
    }

    /* renamed from: c */
    public static boolean m12998c(Object obj) {
        return ((AccessibilityNodeInfo) obj).isAccessibilityFocused();
    }

    /* renamed from: b */
    public static void m12999b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setAccessibilityFocused(z);
    }
}
