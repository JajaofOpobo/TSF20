package com.tsf.extend.wallpaper.upload;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
@TargetApi(11)
/* loaded from: classes.dex */
public class c extends FrameLayout implements Animator.AnimatorListener {
    private UploadWallpaperActivity a;
    private View b;
    private int c;
    private int d;
    private b e;
    private d f;
    private final LayoutTransition g;

    public c(Context context) {
        super(context);
        this.c = 0;
        this.d = 0;
        this.g = new LayoutTransition();
    }

    public void a(UploadWallpaperActivity uploadWallpaperActivity, View view) {
        this.b = view;
        this.a = uploadWallpaperActivity;
    }

    public void setCategoryRealY(int i) {
        this.d = i;
    }

    public int getCategoryRealY() {
        return this.d;
    }

    public void a() {
        if (Build.VERSION.SDK_INT >= 11) {
            setLayoutTransition(this.g);
        }
        getCategoryView();
        getSubmitView();
    }

    public boolean b() {
        if (this.e == null) {
            return true;
        }
        return this.e.b();
    }

    private View getCategoryView() {
        if (this.e == null) {
            this.e = new b(getContext());
            this.e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.e.a(this.a, this);
            addView(this.e);
            this.e.a();
        }
        return this.e;
    }

    private View getSubmitView() {
        if (this.f == null) {
            this.f = new d(getContext());
            this.f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f.a(this.a, this);
            addView(this.f);
            this.f.setVisibility(8);
            this.f.a();
        }
        return this.f;
    }

    public void setTabIndex(int i) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        if (Build.VERSION.SDK_INT >= 11) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.c = i;
            if (this.c == 1) {
                ofFloat = ObjectAnimator.ofFloat(getSubmitView(), "translationX", this.b.getWidth(), 0.0f);
                ofFloat2 = ObjectAnimator.ofFloat(getCategoryView(), "translationX", 0.0f, -this.b.getWidth());
            } else {
                ofFloat = ObjectAnimator.ofFloat(getCategoryView(), "translationX", -this.b.getWidth(), 0.0f);
                ofFloat2 = ObjectAnimator.ofFloat(getSubmitView(), "translationX", 0.0f, this.b.getWidth());
            }
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(this);
            animatorSet.start();
        }
    }

    public int getTabIndex() {
        return this.c;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        getSubmitView().setVisibility(0);
        getCategoryView().setVisibility(0);
        boolean z = this.c != 1;
        if (this.f != null) {
            this.f.a(z ? false : true);
        }
        if (this.e != null) {
            this.e.a(z);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        boolean z = this.c != 1;
        if (this.f != null) {
            this.f.b(z ? false : true);
        }
        if (this.e != null) {
            this.e.b(z);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        boolean z = this.c != 1;
        if (this.f != null) {
            this.f.c(z ? false : true);
        }
        if (this.e != null) {
            this.e.c(z);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        boolean z = this.c != 1;
        if (this.f != null) {
            this.f.d(z ? false : true);
        }
        if (this.e != null) {
            this.e.d(z);
        }
    }

    public void c() {
        com.tsf.extend.base.j.b.a(this, this.e);
        com.tsf.extend.base.j.b.a(this, this.f);
    }
}
