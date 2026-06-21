package android.support.v4.view.a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
class q {
    public static Object a(final r rVar) {
        return new AccessibilityNodeProvider() { // from class: android.support.v4.view.a.q.1
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) r.this.a(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public List findAccessibilityNodeInfosByText(String str, int i) {
                return r.this.a(str, i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public boolean performAction(int i, int i2, Bundle bundle) {
                return r.this.a(i, i2, bundle);
            }
        };
    }
}
