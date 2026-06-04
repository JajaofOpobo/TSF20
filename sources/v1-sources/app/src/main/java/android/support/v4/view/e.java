package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* loaded from: classes.dex */
final class e extends b {
    e() {
    }

    @Override // android.support.v4.view.b, android.support.v4.view.g, android.support.v4.view.d
    public final Object a(a aVar) {
        return new l(new f(this, aVar));
    }

    @Override // android.support.v4.view.g, android.support.v4.view.d
    public final android.support.v4.view.a.f a(Object obj, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = ((View.AccessibilityDelegate) obj).getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new android.support.v4.view.a.f(accessibilityNodeProvider);
        }
        return null;
    }

    @Override // android.support.v4.view.g, android.support.v4.view.d
    public final boolean a(Object obj, View view, int i, Bundle bundle) {
        return ((View.AccessibilityDelegate) obj).performAccessibilityAction(view, i, bundle);
    }
}
