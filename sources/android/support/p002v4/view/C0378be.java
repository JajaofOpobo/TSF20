package android.support.p002v4.view;

import android.animation.ValueAnimator;
import android.view.View;
/* renamed from: android.support.v4.view.be */
/* loaded from: classes.dex */
class C0378be {
    /* renamed from: a */
    public static void m12671a(final View view, final InterfaceC0382bh interfaceC0382bh) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        if (interfaceC0382bh != null) {
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.v4.view.be.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    InterfaceC0382bh.this.mo11884a(view);
                }
            };
        }
        view.animate().setUpdateListener(animatorUpdateListener);
    }
}
