package android.support.p002v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* renamed from: android.support.v4.view.bd */
/* loaded from: classes.dex */
class C0376bd {
    /* renamed from: a */
    public static void m12672a(final View view, final InterfaceC0380bf interfaceC0380bf) {
        if (interfaceC0380bf != null) {
            view.animate().setListener(new AnimatorListenerAdapter() { // from class: android.support.v4.view.bd.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    InterfaceC0380bf.this.mo11263c(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    InterfaceC0380bf.this.mo11264b(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    InterfaceC0380bf.this.mo11265a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }
}
