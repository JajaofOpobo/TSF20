package android.support.p002v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
/* renamed from: android.support.v4.view.bc */
/* loaded from: classes.dex */
class C0374bc {
    /* renamed from: a */
    public static void m12679a(View view, long j) {
        view.animate().setDuration(j);
    }

    /* renamed from: a */
    public static void m12680a(View view, float f) {
        view.animate().alpha(f);
    }

    /* renamed from: b */
    public static void m12675b(View view, float f) {
        view.animate().translationY(f);
    }

    /* renamed from: a */
    public static long m12681a(View view) {
        return view.animate().getDuration();
    }

    /* renamed from: a */
    public static void m12677a(View view, Interpolator interpolator) {
        view.animate().setInterpolator(interpolator);
    }

    /* renamed from: b */
    public static void m12674b(View view, long j) {
        view.animate().setStartDelay(j);
    }

    /* renamed from: b */
    public static void m12676b(View view) {
        view.animate().cancel();
    }

    /* renamed from: c */
    public static void m12673c(View view) {
        view.animate().start();
    }

    /* renamed from: a */
    public static void m12678a(final View view, final InterfaceC0380bf interfaceC0380bf) {
        if (interfaceC0380bf != null) {
            view.animate().setListener(new AnimatorListenerAdapter() { // from class: android.support.v4.view.bc.1
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
