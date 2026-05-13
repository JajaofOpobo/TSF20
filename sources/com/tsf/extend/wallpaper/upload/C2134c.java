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
import com.tsf.extend.base.p080j.C1421b;
@TargetApi(11)
/* renamed from: com.tsf.extend.wallpaper.upload.c */
/* loaded from: classes.dex */
public class C2134c extends FrameLayout implements Animator.AnimatorListener {

    /* renamed from: a */
    private UploadWallpaperActivity f7006a;

    /* renamed from: b */
    private View f7007b;

    /* renamed from: c */
    private int f7008c;

    /* renamed from: d */
    private int f7009d;

    /* renamed from: e */
    private View$OnClickListenerC2129b f7010e;

    /* renamed from: f */
    private DialogInterface$OnClickListenerC2135d f7011f;

    /* renamed from: g */
    private final LayoutTransition f7012g;

    public C2134c(Context context) {
        super(context);
        this.f7008c = 0;
        this.f7009d = 0;
        this.f7012g = new LayoutTransition();
    }

    /* renamed from: a */
    public void m6283a(UploadWallpaperActivity uploadWallpaperActivity, View view) {
        this.f7007b = view;
        this.f7006a = uploadWallpaperActivity;
    }

    public void setCategoryRealY(int i) {
        this.f7009d = i;
    }

    public int getCategoryRealY() {
        return this.f7009d;
    }

    /* renamed from: a */
    public void m6284a() {
        if (Build.VERSION.SDK_INT >= 11) {
            setLayoutTransition(this.f7012g);
        }
        getCategoryView();
        getSubmitView();
    }

    /* renamed from: b */
    public boolean m6282b() {
        if (this.f7010e == null) {
            return true;
        }
        return this.f7010e.m6303b();
    }

    private View getCategoryView() {
        if (this.f7010e == null) {
            this.f7010e = new View$OnClickListenerC2129b(getContext());
            this.f7010e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f7010e.m6307a(this.f7006a, this);
            addView(this.f7010e);
            this.f7010e.m6310a();
        }
        return this.f7010e;
    }

    private View getSubmitView() {
        if (this.f7011f == null) {
            this.f7011f = new DialogInterface$OnClickListenerC2135d(getContext());
            this.f7011f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f7011f.m6278a(this.f7006a, this);
            addView(this.f7011f);
            this.f7011f.setVisibility(8);
            this.f7011f.m6280a();
        }
        return this.f7011f;
    }

    public void setTabIndex(int i) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        if (Build.VERSION.SDK_INT >= 11) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f7008c = i;
            if (this.f7008c == 1) {
                ofFloat = ObjectAnimator.ofFloat(getSubmitView(), "translationX", this.f7007b.getWidth(), 0.0f);
                ofFloat2 = ObjectAnimator.ofFloat(getCategoryView(), "translationX", 0.0f, -this.f7007b.getWidth());
            } else {
                ofFloat = ObjectAnimator.ofFloat(getCategoryView(), "translationX", -this.f7007b.getWidth(), 0.0f);
                ofFloat2 = ObjectAnimator.ofFloat(getSubmitView(), "translationX", 0.0f, this.f7007b.getWidth());
            }
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(this);
            animatorSet.start();
        }
    }

    public int getTabIndex() {
        return this.f7008c;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        getSubmitView().setVisibility(0);
        getCategoryView().setVisibility(0);
        boolean z = this.f7008c != 1;
        if (this.f7011f != null) {
            this.f7011f.m6275a(z ? false : true);
        }
        if (this.f7010e != null) {
            this.f7010e.m6304a(z);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        boolean z = this.f7008c != 1;
        if (this.f7011f != null) {
            this.f7011f.m6272b(z ? false : true);
        }
        if (this.f7010e != null) {
            this.f7010e.m6300b(z);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        boolean z = this.f7008c != 1;
        if (this.f7011f != null) {
            this.f7011f.m6270c(z ? false : true);
        }
        if (this.f7010e != null) {
            this.f7010e.m6297c(z);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        boolean z = this.f7008c != 1;
        if (this.f7011f != null) {
            this.f7011f.m6268d(z ? false : true);
        }
        if (this.f7010e != null) {
            this.f7010e.m6294d(z);
        }
    }

    /* renamed from: c */
    public void m6281c() {
        C1421b.m8698a(this, this.f7010e);
        C1421b.m8698a(this, this.f7011f);
    }
}
