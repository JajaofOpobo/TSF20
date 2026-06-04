package android.support.v4.view;

import android.view.View;

/* loaded from: classes.dex */
class an extends am {
    an() {
    }

    @Override // android.support.v4.view.aj, android.support.v4.view.ap
    public final void b(View view) {
        view.postInvalidateOnAnimation();
    }

    @Override // android.support.v4.view.aj, android.support.v4.view.ap
    public final void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Override // android.support.v4.view.aj, android.support.v4.view.ap
    public final int c(View view) {
        return view.getImportantForAccessibility();
    }

    @Override // android.support.v4.view.aj, android.support.v4.view.ap
    public final void d(View view) {
        view.setImportantForAccessibility(1);
    }
}
