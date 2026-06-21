package android.support.v4.view.a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
class s {
    public static Object a(final t tVar) {
        return new AccessibilityNodeProvider() { // from class: android.support.v4.view.a.s.1
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) t.this.a(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public List findAccessibilityNodeInfosByText(String str, int i) {
                return t.this.a(str, i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public boolean performAction(int i, int i2, Bundle bundle) {
                return t.this.a(i, i2, bundle);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public AccessibilityNodeInfo findFocus(int i) {
                return (AccessibilityNodeInfo) t.this.b(i);
            }
        };
    }
}
