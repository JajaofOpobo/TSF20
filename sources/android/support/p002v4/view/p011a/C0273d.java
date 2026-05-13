package android.support.p002v4.view.p011a;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
/* renamed from: android.support.v4.view.a.d */
/* loaded from: classes.dex */
class C0273d {
    /* renamed from: a */
    public static Object m13047a(Object obj) {
        return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo) obj);
    }

    /* renamed from: a */
    public static void m13046a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).addAction(i);
    }

    /* renamed from: a */
    public static void m13043a(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).addChild(view);
    }

    /* renamed from: b */
    public static int m13035b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getActions();
    }

    /* renamed from: a */
    public static void m13045a(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInParent(rect);
    }

    /* renamed from: b */
    public static void m13034b(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInScreen(rect);
    }

    /* renamed from: c */
    public static CharSequence m13029c(Object obj) {
        return ((AccessibilityNodeInfo) obj).getClassName();
    }

    /* renamed from: d */
    public static CharSequence m13023d(Object obj) {
        return ((AccessibilityNodeInfo) obj).getContentDescription();
    }

    /* renamed from: e */
    public static CharSequence m13019e(Object obj) {
        return ((AccessibilityNodeInfo) obj).getPackageName();
    }

    /* renamed from: f */
    public static CharSequence m13017f(Object obj) {
        return ((AccessibilityNodeInfo) obj).getText();
    }

    /* renamed from: g */
    public static boolean m13015g(Object obj) {
        return ((AccessibilityNodeInfo) obj).isCheckable();
    }

    /* renamed from: h */
    public static boolean m13013h(Object obj) {
        return ((AccessibilityNodeInfo) obj).isChecked();
    }

    /* renamed from: i */
    public static boolean m13012i(Object obj) {
        return ((AccessibilityNodeInfo) obj).isClickable();
    }

    /* renamed from: j */
    public static boolean m13011j(Object obj) {
        return ((AccessibilityNodeInfo) obj).isEnabled();
    }

    /* renamed from: k */
    public static boolean m13010k(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocusable();
    }

    /* renamed from: l */
    public static boolean m13009l(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocused();
    }

    /* renamed from: m */
    public static boolean m13008m(Object obj) {
        return ((AccessibilityNodeInfo) obj).isLongClickable();
    }

    /* renamed from: n */
    public static boolean m13007n(Object obj) {
        return ((AccessibilityNodeInfo) obj).isPassword();
    }

    /* renamed from: o */
    public static boolean m13006o(Object obj) {
        return ((AccessibilityNodeInfo) obj).isScrollable();
    }

    /* renamed from: p */
    public static boolean m13005p(Object obj) {
        return ((AccessibilityNodeInfo) obj).isSelected();
    }

    /* renamed from: c */
    public static void m13028c(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInParent(rect);
    }

    /* renamed from: d */
    public static void m13022d(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInScreen(rect);
    }

    /* renamed from: a */
    public static void m13037a(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setClassName(charSequence);
    }

    /* renamed from: a */
    public static void m13036a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setClickable(z);
    }

    /* renamed from: b */
    public static void m13031b(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setContentDescription(charSequence);
    }

    /* renamed from: b */
    public static void m13030b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setEnabled(z);
    }

    /* renamed from: c */
    public static void m13024c(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocusable(z);
    }

    /* renamed from: d */
    public static void m13020d(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocused(z);
    }

    /* renamed from: e */
    public static void m13018e(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setLongClickable(z);
    }

    /* renamed from: c */
    public static void m13025c(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setPackageName(charSequence);
    }

    /* renamed from: b */
    public static void m13033b(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setParent(view);
    }

    /* renamed from: f */
    public static void m13016f(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setScrollable(z);
    }

    /* renamed from: g */
    public static void m13014g(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setSelected(z);
    }

    /* renamed from: c */
    public static void m13027c(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setSource(view);
    }

    /* renamed from: q */
    public static void m13004q(Object obj) {
        ((AccessibilityNodeInfo) obj).recycle();
    }
}
