package android.support.p002v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
/* renamed from: android.support.v4.view.b */
/* loaded from: classes.dex */
class C0357b {

    /* renamed from: android.support.v4.view.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0359a {
        /* renamed from: a */
        void mo12725a(View view, int i);

        /* renamed from: a */
        void mo12723a(View view, Object obj);

        /* renamed from: a */
        boolean mo12724a(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        boolean mo12722a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: b */
        void mo12721b(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: c */
        void mo12720c(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: d */
        void mo12719d(View view, AccessibilityEvent accessibilityEvent);
    }

    /* renamed from: a */
    public static Object m12734a() {
        return new View.AccessibilityDelegate();
    }

    /* renamed from: a */
    public static Object m12733a(final InterfaceC0359a interfaceC0359a) {
        return new View.AccessibilityDelegate() { // from class: android.support.v4.view.b.1
            @Override // android.view.View.AccessibilityDelegate
            public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return InterfaceC0359a.this.mo12724a(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                InterfaceC0359a.this.mo12721b(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                InterfaceC0359a.this.mo12723a(view, accessibilityNodeInfo);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                InterfaceC0359a.this.mo12720c(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return InterfaceC0359a.this.mo12722a(viewGroup, view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void sendAccessibilityEvent(View view, int i) {
                InterfaceC0359a.this.mo12725a(view, i);
            }

            @Override // android.view.View.AccessibilityDelegate
            public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                InterfaceC0359a.this.mo12719d(view, accessibilityEvent);
            }
        };
    }

    /* renamed from: a */
    public static boolean m12731a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        return ((View.AccessibilityDelegate) obj).dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public static void m12728b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public static void m12730a(Object obj, View view, Object obj2) {
        ((View.AccessibilityDelegate) obj).onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo) obj2);
    }

    /* renamed from: c */
    public static void m12727c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public static boolean m12729a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return ((View.AccessibilityDelegate) obj).onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public static void m12732a(Object obj, View view, int i) {
        ((View.AccessibilityDelegate) obj).sendAccessibilityEvent(view, i);
    }

    /* renamed from: d */
    public static void m12726d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
