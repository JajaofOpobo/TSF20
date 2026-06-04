package android.support.v4.app;

import android.view.animation.Animation;

/* loaded from: classes.dex */
final class o implements Animation.AnimationListener {
    final /* synthetic */ Fragment a;
    final /* synthetic */ m b;

    o(m mVar, Fragment fragment) {
        this.b = mVar;
        this.a = fragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.a.b != null) {
            this.a.b = null;
            this.b.a(this.a, this.a.c, 0, 0, false);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
