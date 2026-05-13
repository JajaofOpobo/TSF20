package android.support.p002v4.view.p011a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
/* renamed from: android.support.v4.view.a.h */
/* loaded from: classes.dex */
class C0283h {

    /* renamed from: android.support.v4.view.a.h$a */
    /* loaded from: classes.dex */
    interface InterfaceC0285a {
        /* renamed from: a */
        Object mo12989a(int i);

        /* renamed from: a */
        List<Object> mo12987a(String str, int i);

        /* renamed from: a */
        boolean mo12988a(int i, int i2, Bundle bundle);
    }

    /* renamed from: a */
    public static Object m12990a(final InterfaceC0285a interfaceC0285a) {
        return new AccessibilityNodeProvider() { // from class: android.support.v4.view.a.h.1
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) InterfaceC0285a.this.mo12989a(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return InterfaceC0285a.this.mo12987a(str, i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public boolean performAction(int i, int i2, Bundle bundle) {
                return InterfaceC0285a.this.mo12988a(i, i2, bundle);
            }
        };
    }
}
