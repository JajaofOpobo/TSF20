package android.support.p002v4.view.p011a;

import android.view.accessibility.AccessibilityNodeInfo;
/* renamed from: android.support.v4.view.a.c */
/* loaded from: classes.dex */
class C0272c {
    /* renamed from: a */
    public static boolean m13050a(Object obj, Object obj2) {
        return ((AccessibilityNodeInfo) obj).removeAction((AccessibilityNodeInfo.AccessibilityAction) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m13051a(int i, CharSequence charSequence) {
        return new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
    }
}
