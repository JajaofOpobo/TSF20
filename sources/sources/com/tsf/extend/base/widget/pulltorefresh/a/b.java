package com.tsf.extend.base.widget.pulltorefresh.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
@SuppressLint({"ViewConstructor"})
public class b extends d {
    private final Animation f;
    private final Animation g;

    public b(Context context, PullToRefreshBase.b bVar, PullToRefreshBase.h hVar, TypedArray typedArray) {
        super(context, bVar, hVar, typedArray);
        int i = bVar == PullToRefreshBase.b.PULL_FROM_START ? -180 : 180;
        this.f = new RotateAnimation(0.0f, i, 1, 0.5f, 1, 0.5f);
        this.f.setInterpolator(a);
        this.f.setDuration(150L);
        this.f.setFillAfter(true);
        this.g = new RotateAnimation(i, 0.0f, 1, 0.5f, 1, 0.5f);
        this.g.setInterpolator(a);
        this.g.setDuration(150L);
        this.g.setFillAfter(true);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a.d
    protected void a(Drawable drawable) {
        if (drawable != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            int iMax = Math.max(intrinsicHeight, intrinsicWidth);
            layoutParams.height = iMax;
            layoutParams.width = iMax;
            this.b.requestLayout();
            this.b.setScaleType(ImageView.ScaleType.MATRIX);
            Matrix matrix = new Matrix();
            matrix.postTranslate((layoutParams.width - intrinsicWidth) / 2.0f, (layoutParams.height - intrinsicHeight) / 2.0f);
            matrix.postRotate(getDrawableRotationAngle(), layoutParams.width / 2.0f, layoutParams.height / 2.0f);
            this.b.setImageMatrix(matrix);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a.d
    protected void a(float f) {
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a.d
    protected void a() {
        if (this.f == this.b.getAnimation()) {
            this.b.startAnimation(this.g);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a.d
    protected void b() {
        this.b.clearAnimation();
        this.b.setVisibility(4);
        this.c.setVisibility(0);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a.d
    protected void c() {
        this.b.startAnimation(this.f);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a.d
    protected void d() {
        this.b.clearAnimation();
        this.c.setVisibility(8);
        this.b.setVisibility(0);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a.d
    protected int getDefaultDrawableResId() {
        return f.d.kui_ptr_default_flip;
    }

    private float getDrawableRotationAngle() {
        switch (this.d) {
            case PULL_FROM_END:
                if (this.e == PullToRefreshBase.h.HORIZONTAL) {
                }
                break;
            case PULL_FROM_START:
                if (this.e == PullToRefreshBase.h.HORIZONTAL) {
                }
                break;
        }
        return 0.0f;
    }
}
