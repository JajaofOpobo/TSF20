package com.tsf.extend.wallpaper;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p080j.C1437p;
/* loaded from: classes.dex */
public class CustomWallpaperShadowView extends View {

    /* renamed from: a */
    private int f6188a;

    /* renamed from: b */
    private Paint f6189b;

    /* renamed from: c */
    private C2146x f6190c;

    /* renamed from: d */
    private boolean f6191d;

    /* renamed from: e */
    private Rect f6192e;

    /* renamed from: f */
    private boolean f6193f;

    /* renamed from: g */
    private ValueAnimator f6194g;

    public CustomWallpaperShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6191d = true;
        this.f6192e = null;
        this.f6193f = false;
        this.f6194g = null;
        m7025a();
    }

    public void setWallpaperClipCalculateManager(C2146x c2146x) {
        this.f6190c = c2146x;
    }

    /* renamed from: a */
    private void m7025a() {
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, null);
        }
        this.f6189b = new Paint();
        this.f6189b.setStyle(Paint.Style.STROKE);
        this.f6189b.setStrokeWidth(1.0f * C1437p.m8623a());
        this.f6189b.setColor(-855638017);
        this.f6188a = getResources().getColor(C1536f.C1538b.wallpaper_clip_shadow);
        setDrawingCacheEnabled(false);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f6190c != null) {
            canvas.save();
            canvas.clipRect(0, 0, getWidth(), getHeight());
            canvas.clipRect(this.f6192e == null ? this.f6190c.m6230c() : this.f6192e, Region.Op.DIFFERENCE);
            canvas.drawColor(this.f6188a);
            canvas.restore();
            canvas.drawRect(this.f6192e == null ? this.f6190c.m6230c() : this.f6192e, this.f6189b);
        }
    }

    public void setSingleScreen(boolean z) {
        Rect rect;
        if (!this.f6191d) {
            invalidate();
            return;
        }
        if (this.f6194g != null && Build.VERSION.SDK_INT >= 11) {
            this.f6194g.cancel();
        }
        final Rect rect2 = new Rect();
        final Rect rect3 = new Rect();
        if (this.f6192e == null) {
            rect = this.f6190c.m6233a(!z);
        } else {
            rect = this.f6192e;
        }
        rect2.set(rect);
        rect3.set(this.f6190c.m6233a(z));
        this.f6192e = new Rect();
        if (Build.VERSION.SDK_INT >= 11) {
            this.f6194g = new ValueAnimator();
            this.f6194g.setDuration(500L);
            this.f6194g.setFloatValues(0.0f, 1.0f);
            this.f6194g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.tsf.extend.wallpaper.CustomWallpaperShadowView.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Float f = null;
                    if (Build.VERSION.SDK_INT >= 11) {
                        f = (Float) valueAnimator.getAnimatedValue();
                    }
                    CustomWallpaperShadowView.this.f6192e.set((int) (rect2.left + ((rect3.left - rect2.left) * f.floatValue())), (int) (rect2.top + ((rect3.top - rect2.top) * f.floatValue())), (int) (rect2.right + ((rect3.right - rect2.right) * f.floatValue())), (int) ((f.floatValue() * (rect3.bottom - rect2.bottom)) + rect2.bottom));
                    CustomWallpaperShadowView.this.postInvalidate();
                }
            });
            this.f6194g.addListener(new Animator.AnimatorListener() { // from class: com.tsf.extend.wallpaper.CustomWallpaperShadowView.2
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (!CustomWallpaperShadowView.this.f6193f) {
                        CustomWallpaperShadowView.this.f6192e = null;
                        CustomWallpaperShadowView.this.postInvalidate();
                        return;
                    }
                    CustomWallpaperShadowView.this.f6193f = false;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    CustomWallpaperShadowView.this.f6193f = true;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }
            });
            this.f6194g.start();
        }
    }
}
