package android.support.v4.view.a;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
class b extends e {
    b() {
    }

    @Override // android.support.v4.view.a.e, android.support.v4.view.a.c
    public final void a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).addAction(i);
    }

    @Override // android.support.v4.view.a.e, android.support.v4.view.a.c
    public final void a(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setClassName(charSequence);
    }

    @Override // android.support.v4.view.a.e, android.support.v4.view.a.c
    public final void a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setScrollable(z);
    }
}
