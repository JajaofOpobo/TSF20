package com.tsf.shell.workspace3D;

import android.view.View;
import android.view.animation.Animation;

/* loaded from: classes.dex */
final class ag implements Animation.AnimationListener {
    final /* synthetic */ af a;

    ag(af afVar) {
        this.a = afVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        View view;
        view = this.a.f;
        view.clearAnimation();
        this.a.a(0);
    }
}
