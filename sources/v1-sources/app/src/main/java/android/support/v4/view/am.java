package android.support.v4.view;

import android.view.View;

/* loaded from: classes.dex */
class am extends al {
    am() {
    }

    @Override // android.support.v4.view.aj, android.support.v4.view.ap
    public final boolean a(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    @Override // android.support.v4.view.aj, android.support.v4.view.ap
    public final void a(View view, a aVar) {
        view.setAccessibilityDelegate((View.AccessibilityDelegate) aVar.a());
    }
}
