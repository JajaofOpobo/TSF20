package com.tsf.extend.base.widget.pulltorefresh.p081a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
/* renamed from: com.tsf.extend.base.widget.pulltorefresh.a.e */
/* loaded from: classes.dex */
public class C1513e extends AbstractC1511d {

    /* renamed from: f */
    private final Animation f4766f;

    /* renamed from: g */
    private final Matrix f4767g;

    /* renamed from: h */
    private float f4768h;

    /* renamed from: i */
    private float f4769i;

    /* renamed from: j */
    private final boolean f4770j;

    public C1513e(Context context, PullToRefreshBase.EnumC1491b enumC1491b, PullToRefreshBase.EnumC1497h enumC1497h, TypedArray typedArray) {
        super(context, enumC1491b, enumC1497h, typedArray);
        this.f4770j = typedArray.getBoolean(C1536f.C1545i.PullToRefresh_ptrRotateDrawableWhilePulling, true);
        this.f4753b.setScaleType(ImageView.ScaleType.MATRIX);
        this.f4767g = new Matrix();
        this.f4753b.setImageMatrix(this.f4767g);
        this.f4766f = new RotateAnimation(0.0f, 720.0f, 1, 0.5f, 1, 0.5f);
        this.f4766f.setInterpolator(f4752a);
        this.f4766f.setDuration(1200L);
        this.f4766f.setRepeatCount(-1);
        this.f4766f.setRepeatMode(1);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d
    /* renamed from: a */
    public void mo8352a(Drawable drawable) {
        if (drawable != null) {
            this.f4768h = Math.round(drawable.getIntrinsicWidth() / 2.0f);
            this.f4769i = Math.round(drawable.getIntrinsicHeight() / 2.0f);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d
    /* renamed from: a */
    protected void mo8353a(float f) {
        float max;
        if (this.f4770j) {
            max = 90.0f * f;
        } else {
            max = Math.max(0.0f, Math.min(180.0f, (360.0f * f) - 180.0f));
        }
        this.f4767g.setRotate(max, this.f4768h, this.f4769i);
        this.f4753b.setImageMatrix(this.f4767g);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d
    /* renamed from: b */
    protected void mo8351b() {
        this.f4753b.startAnimation(this.f4766f);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d
    /* renamed from: d */
    protected void mo8349d() {
        this.f4753b.clearAnimation();
        m8348k();
    }

    /* renamed from: k */
    private void m8348k() {
        if (this.f4767g != null) {
            this.f4767g.reset();
            this.f4753b.setImageMatrix(this.f4767g);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d
    /* renamed from: a */
    protected void mo8354a() {
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d
    /* renamed from: c */
    protected void mo8350c() {
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d
    protected int getDefaultDrawableResId() {
        return C1536f.C1540d.search_loading_circle_big;
    }
}
