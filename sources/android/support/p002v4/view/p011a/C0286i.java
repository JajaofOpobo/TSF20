package android.support.p002v4.view.p011a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
/* renamed from: android.support.v4.view.a.i */
/* loaded from: classes.dex */
class C0286i {

    /* renamed from: android.support.v4.view.a.i$a */
    /* loaded from: classes.dex */
    interface InterfaceC0288a {
        /* renamed from: a */
        Object mo12985a(int i);

        /* renamed from: a */
        List<Object> mo12983a(String str, int i);

        /* renamed from: a */
        boolean mo12984a(int i, int i2, Bundle bundle);

        /* renamed from: b */
        Object mo12982b(int i);
    }

    /* renamed from: a */
    public static Object m12986a(final InterfaceC0288a interfaceC0288a) {
        return new AccessibilityNodeProvider() { // from class: android.support.v4.view.a.i.1
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) InterfaceC0288a.this.mo12985a(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return InterfaceC0288a.this.mo12983a(str, i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public boolean performAction(int i, int i2, Bundle bundle) {
                return InterfaceC0288a.this.mo12984a(i, i2, bundle);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public AccessibilityNodeInfo findFocus(int i) {
                return (AccessibilityNodeInfo) InterfaceC0288a.this.mo12982b(i);
            }
        };
    }
}
