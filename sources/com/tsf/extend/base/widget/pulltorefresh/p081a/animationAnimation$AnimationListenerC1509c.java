package com.tsf.extend.base.widget.pulltorefresh.p081a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
@SuppressLint({"ViewConstructor"})
/* renamed from: com.tsf.extend.base.widget.pulltorefresh.a.c  reason: invalid class name */
/* loaded from: classes.dex */
public class animationAnimation$AnimationListenerC1509c extends FrameLayout implements Animation.AnimationListener {

    /* renamed from: a */
    private Animation f4746a;

    /* renamed from: b */
    private Animation f4747b;

    /* renamed from: c */
    private ImageView f4748c;

    /* renamed from: d */
    private final Animation f4749d;

    /* renamed from: e */
    private final Animation f4750e;

    public animationAnimation$AnimationListenerC1509c(Context context, PullToRefreshBase.EnumC1491b enumC1491b) {
        super(context);
        int i;
        int i2;
        this.f4748c = new ImageView(context);
        Drawable drawable = getResources().getDrawable(C1536f.C1540d.kui_ptr_default_flip);
        this.f4748c.setImageDrawable(drawable);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C1536f.C1539c.ptr_indicator_internal_padding);
        this.f4748c.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        addView(this.f4748c);
        switch (enumC1491b) {
            case PULL_FROM_END:
                i = C1536f.C1537a.kui_ptr_slide_in_from_bottom;
                i2 = C1536f.C1537a.kui_ptr_slide_out_to_bottom;
                setBackgroundResource(C1536f.C1540d.kui_ptr_indicator_bg_bottom);
                this.f4748c.setScaleType(ImageView.ScaleType.MATRIX);
                Matrix matrix = new Matrix();
                matrix.setRotate(180.0f, drawable.getIntrinsicWidth() / 2.0f, drawable.getIntrinsicHeight() / 2.0f);
                this.f4748c.setImageMatrix(matrix);
                break;
            default:
                i = C1536f.C1537a.kui_ptr_slide_in_from_top;
                i2 = C1536f.C1537a.kui_ptr_slide_out_to_top;
                setBackgroundResource(C1536f.C1540d.kui_ptr_indicator_bg_top);
                break;
        }
        this.f4746a = AnimationUtils.loadAnimation(context, i);
        this.f4746a.setAnimationListener(this);
        this.f4747b = AnimationUtils.loadAnimation(context, i2);
        this.f4747b.setAnimationListener(this);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.f4749d = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.f4749d.setInterpolator(linearInterpolator);
        this.f4749d.setDuration(150L);
        this.f4749d.setFillAfter(true);
        this.f4750e = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f4750e.setInterpolator(linearInterpolator);
        this.f4750e.setDuration(150L);
        this.f4750e.setFillAfter(true);
    }

    /* renamed from: a */
    public final boolean m8366a() {
        Animation animation = getAnimation();
        return animation != null ? this.f4746a == animation : getVisibility() == 0;
    }

    /* renamed from: b */
    public void m8365b() {
        startAnimation(this.f4747b);
    }

    /* renamed from: c */
    public void m8364c() {
        this.f4748c.clearAnimation();
        startAnimation(this.f4746a);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        if (animation == this.f4747b) {
            this.f4748c.clearAnimation();
            setVisibility(8);
        } else if (animation == this.f4746a) {
            setVisibility(0);
        }
        clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        setVisibility(0);
    }

    /* renamed from: d */
    public void m8363d() {
        this.f4748c.startAnimation(this.f4749d);
    }

    /* renamed from: e */
    public void m8362e() {
        this.f4748c.startAnimation(this.f4750e);
    }
}
