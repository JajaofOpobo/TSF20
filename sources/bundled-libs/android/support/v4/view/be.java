package android.support.v4.view;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class be {
    public static void a(final View view, final bh bhVar) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        if (bhVar != null) {
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.v4.view.be.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    bhVar.a(view);
                }
            };
        }
        view.animate().setUpdateListener(animatorUpdateListener);
    }
}
