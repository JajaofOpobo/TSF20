package android.support.v4.view.a;

import android.view.accessibility.AccessibilityNodeInfo;
/* loaded from: classes.dex */
class c {
    public static boolean a(Object obj, Object obj2) {
        return ((AccessibilityNodeInfo) obj).removeAction((AccessibilityNodeInfo.AccessibilityAction) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(int i, CharSequence charSequence) {
        return new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
    }
}
