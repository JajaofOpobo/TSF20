package com.tsf.extend.base.widget.pulltorefresh.p081a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
@SuppressLint({"ViewConstructor"})
/* renamed from: com.tsf.extend.base.widget.pulltorefresh.a.b */
/* loaded from: classes.dex */
public class C1507b extends AbstractC1511d {

    /* renamed from: f */
    private final Animation f4743f;

    /* renamed from: g */
    private final Animation f4744g;

    public C1507b(Context context, PullToRefreshBase.EnumC1491b enumC1491b, PullToRefreshBase.EnumC1497h enumC1497h, TypedArray typedArray) {
        super(context, enumC1491b, enumC1497h, typedArray);
        int i = enumC1491b == PullToRefreshBase.EnumC1491b.PULL_FROM_START ? -180 : 180;
        this.f4743f = new RotateAnimation(0.0f, i, 1, 0.5f, 1, 0.5f);
        this.f4743f.setInterpolator(f4752a);
        this.f4743f.setDuration(150L);
        this.f4743f.setFillAfter(true);
        this.f4744g = new RotateAnimation(i, 0.0f, 1, 0.5f, 1, 0.5f);
        this.f4744g.setInterpolator(f4752a);
        this.f4744g.setDuration(150L);
        this.f4744g.setFillAfter(true);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d
    /* renamed from: a */
    protected void mo8352a(Drawable drawable) {
        if (drawable != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            ViewGroup.LayoutParams layoutParams = this.f4753b.getLayoutParams();
            int max = Math.max(intrinsicHeight, intrinsicWidth);
            layoutParams.height = max;
            layoutParams.width = max;
            this.f4753b.requestLayout();
            this.f4753b.setScaleType(ImageView.ScaleType.MATRIX);
            Matrix matrix = new Matrix();
            matrix.postTranslate((layoutParams.width - intrinsicWidth) / 2.0f, (layoutParams.height - intrinsicHeight) / 2.0f);
            matrix.postRotate(getDrawableRotationAngle(), layoutParams.width / 2.0f, layoutParams.height / 2.0f);
            this.f4753b.setImageMatrix(matrix);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d
    /* renamed from: a */
    protected void mo8353a(float f) {
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d
    /* renamed from: a */
    protected void mo8354a() {
        if (this.f4743f == this.f4753b.getAnimation()) {
            this.f4753b.startAnimation(this.f4744g);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d
    /* renamed from: b */
    protected void mo8351b() {
        this.f4753b.clearAnimation();
        this.f4753b.setVisibility(4);
        this.f4754c.setVisibility(0);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d
    /* renamed from: c */
    protected void mo8350c() {
        this.f4753b.startAnimation(this.f4743f);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d
    /* renamed from: d */
    protected void mo8349d() {
        this.f4753b.clearAnimation();
        this.f4754c.setVisibility(8);
        this.f4753b.setVisibility(0);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d
    protected int getDefaultDrawableResId() {
        return C1536f.C1540d.kui_ptr_default_flip;
    }

    private float getDrawableRotationAngle() {
        switch (this.f4755d) {
            case PULL_FROM_END:
                if (this.f4756e == PullToRefreshBase.EnumC1497h.HORIZONTAL) {
                    return 90.0f;
                }
                return 180.0f;
            case PULL_FROM_START:
                if (this.f4756e != PullToRefreshBase.EnumC1497h.HORIZONTAL) {
                    return 0.0f;
                }
                return 270.0f;
            default:
                return 0.0f;
        }
    }
}
