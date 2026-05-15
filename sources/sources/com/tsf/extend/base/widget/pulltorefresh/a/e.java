package com.tsf.extend.base.widget.pulltorefresh.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends d {
    private final Animation f;
    private final Matrix g;
    private float h;
    private float i;
    private final boolean j;

    public e(Context context, PullToRefreshBase.b bVar, PullToRefreshBase.h hVar, TypedArray typedArray) {
        super(context, bVar, hVar, typedArray);
        this.j = typedArray.getBoolean(f.i.PullToRefresh_ptrRotateDrawableWhilePulling, true);
        this.b.setScaleType(ImageView.ScaleType.MATRIX);
        this.g = new Matrix();
        this.b.setImageMatrix(this.g);
        this.f = new RotateAnimation(0.0f, 720.0f, 1, 0.5f, 1, 0.5f);
        this.f.setInterpolator(a);
        this.f.setDuration(1200L);
        this.f.setRepeatCount(-1);
        this.f.setRepeatMode(1);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a.d
    public void a(Drawable drawable) {
        if (drawable != null) {
            this.h = Math.round(drawable.getIntrinsicWidth() / 2.0f);
            this.i = Math.round(drawable.getIntrinsicHeight() / 2.0f);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a.d
    protected void a(float f) {
        float fMax;
        if (this.j) {
            fMax = 90.0f * f;
        } else {
            fMax = Math.max(0.0f, Math.min(180.0f, (360.0f * f) - 180.0f));
        }
        this.g.setRotate(fMax, this.h, this.i);
        this.b.setImageMatrix(this.g);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a.d
    protected void b() {
        this.b.startAnimation(this.f);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a.d
    protected void d() {
        this.b.clearAnimation();
        k();
    }

    private void k() {
        if (this.g != null) {
            this.g.reset();
            this.b.setImageMatrix(this.g);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a.d
    protected void a() {
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a.d
    protected void c() {
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.a.d
    protected int getDefaultDrawableResId() {
        return f.d.search_loading_circle_big;
    }
}
