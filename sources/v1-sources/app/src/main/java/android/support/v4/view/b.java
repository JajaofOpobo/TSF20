package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
class b extends g {
    b() {
    }

    @Override // android.support.v4.view.g, android.support.v4.view.d
    public final Object a() {
        return new View.AccessibilityDelegate();
    }

    @Override // android.support.v4.view.g, android.support.v4.view.d
    public Object a(a aVar) {
        return new i(new c(this, aVar));
    }

    @Override // android.support.v4.view.g, android.support.v4.view.d
    public final boolean a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        return ((View.AccessibilityDelegate) obj).dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.g, android.support.v4.view.d
    public final void b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.g, android.support.v4.view.d
    public final void a(Object obj, View view, android.support.v4.view.a.a aVar) {
        ((View.AccessibilityDelegate) obj).onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo) aVar.a());
    }

    @Override // android.support.v4.view.g, android.support.v4.view.d
    public final void c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.g, android.support.v4.view.d
    public final boolean a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return ((View.AccessibilityDelegate) obj).onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.support.v4.view.g, android.support.v4.view.d
    public final void a(Object obj, View view, int i) {
        ((View.AccessibilityDelegate) obj).sendAccessibilityEvent(view, i);
    }

    @Override // android.support.v4.view.g, android.support.v4.view.d
    public final void d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
