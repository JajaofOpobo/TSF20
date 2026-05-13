package android.support.p002v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
/* renamed from: android.support.v4.view.c */
/* loaded from: classes.dex */
class C0385c {

    /* renamed from: android.support.v4.view.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0387a {
        /* renamed from: a */
        Object mo12660a(View view);

        /* renamed from: a */
        void mo12659a(View view, int i);

        /* renamed from: a */
        void mo12656a(View view, Object obj);

        /* renamed from: a */
        boolean mo12658a(View view, int i, Bundle bundle);

        /* renamed from: a */
        boolean mo12657a(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        boolean mo12655a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: b */
        void mo12654b(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: c */
        void mo12653c(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: d */
        void mo12652d(View view, AccessibilityEvent accessibilityEvent);
    }

    /* renamed from: a */
    public static Object m12663a(final InterfaceC0387a interfaceC0387a) {
        return new View.AccessibilityDelegate() { // from class: android.support.v4.view.c.1
            @Override // android.view.View.AccessibilityDelegate
            public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return InterfaceC0387a.this.mo12657a(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                InterfaceC0387a.this.mo12654b(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                InterfaceC0387a.this.mo12656a(view, accessibilityNodeInfo);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                InterfaceC0387a.this.mo12653c(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return InterfaceC0387a.this.mo12655a(viewGroup, view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void sendAccessibilityEvent(View view, int i) {
                InterfaceC0387a.this.mo12659a(view, i);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                InterfaceC0387a.this.mo12652d(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                return (AccessibilityNodeProvider) InterfaceC0387a.this.mo12660a(view);
            }

            @Override // android.view.View.AccessibilityDelegate
            public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                return InterfaceC0387a.this.mo12658a(view, i, bundle);
            }
        };
    }

    /* renamed from: a */
    public static Object m12662a(Object obj, View view) {
        return ((View.AccessibilityDelegate) obj).getAccessibilityNodeProvider(view);
    }

    /* renamed from: a */
    public static boolean m12661a(Object obj, View view, int i, Bundle bundle) {
        return ((View.AccessibilityDelegate) obj).performAccessibilityAction(view, i, bundle);
    }
}
