package android.support.v4.view;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
class al extends ak {
    al() {
    }

    @Override // android.support.v4.view.aj
    final long a() {
        return ValueAnimator.getFrameDelay();
    }

    @Override // android.support.v4.view.aj, android.support.v4.view.ap
    public final void b(View view, int i) {
        view.setLayerType(i, null);
    }
}
