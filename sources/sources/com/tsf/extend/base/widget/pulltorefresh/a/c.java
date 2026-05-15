package com.tsf.extend.base.widget.pulltorefresh.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
@SuppressLint({"ViewConstructor"})
public class c extends FrameLayout implements Animation.AnimationListener {
    private Animation a;
    private Animation b;
    private ImageView c;
    private final Animation d;
    private final Animation e;

    public c(Context context, PullToRefreshBase.b bVar) {
        int i;
        int i2;
        super(context);
        this.c = new ImageView(context);
        this.c.setImageDrawable(getResources().getDrawable(f.d.kui_ptr_default_flip));
        int dimensionPixelSize = getResources().getDimensionPixelSize(f.c.ptr_indicator_internal_padding);
        this.c.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        addView(this.c);
        switch (bVar) {
            case PULL_FROM_END:
                i = f.a.kui_ptr_slide_in_from_bottom;
                i2 = f.a.kui_ptr_slide_out_to_bottom;
                setBackgroundResource(f.d.kui_ptr_indicator_bg_bottom);
                this.c.setScaleType(ImageView.ScaleType.MATRIX);
                Matrix matrix = new Matrix();
                matrix.setRotate(180.0f, r6.getIntrinsicWidth() / 2.0f, r6.getIntrinsicHeight() / 2.0f);
                this.c.setImageMatrix(matrix);
                break;
            default:
                i = f.a.kui_ptr_slide_in_from_top;
                i2 = f.a.kui_ptr_slide_out_to_top;
                setBackgroundResource(f.d.kui_ptr_indicator_bg_top);
                break;
        }
        this.a = AnimationUtils.loadAnimation(context, i);
        this.a.setAnimationListener(this);
        this.b = AnimationUtils.loadAnimation(context, i2);
        this.b.setAnimationListener(this);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.d = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.d.setInterpolator(linearInterpolator);
        this.d.setDuration(150L);
        this.d.setFillAfter(true);
        this.e = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.e.setInterpolator(linearInterpolator);
        this.e.setDuration(150L);
        this.e.setFillAfter(true);
    }

    public final boolean a() {
        Animation animation = getAnimation();
        return animation != null ? this.a == animation : getVisibility() == 0;
    }

    public void b() {
        startAnimation(this.b);
    }

    public void c() {
        this.c.clearAnimation();
        startAnimation(this.a);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        if (animation == this.b) {
            this.c.clearAnimation();
            setVisibility(8);
        } else if (animation == this.a) {
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

    public void d() {
        this.c.startAnimation(this.d);
    }

    public void e() {
        this.c.startAnimation(this.e);
    }
}
