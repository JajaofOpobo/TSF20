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
import com.tsf.extend.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class CustomWallpaperShadowView extends View {
    private int a;
    private Paint b;
    private x c;
    private boolean d;
    private Rect e;
    private boolean f;
    private ValueAnimator g;

    public CustomWallpaperShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        this.e = null;
        this.f = false;
        this.g = null;
        a();
    }

    public void setWallpaperClipCalculateManager(x xVar) {
        this.c = xVar;
    }

    private void a() {
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, null);
        }
        this.b = new Paint();
        this.b.setStyle(Paint.Style.STROKE);
        this.b.setStrokeWidth(1.0f * com.tsf.extend.base.j.p.a());
        this.b.setColor(-855638017);
        this.a = getResources().getColor(f.b.wallpaper_clip_shadow);
        setDrawingCacheEnabled(false);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.c != null) {
            canvas.save();
            canvas.clipRect(0, 0, getWidth(), getHeight());
            canvas.clipRect(this.e == null ? this.c.c() : this.e, Region.Op.DIFFERENCE);
            canvas.drawColor(this.a);
            canvas.restore();
            canvas.drawRect(this.e == null ? this.c.c() : this.e, this.b);
        }
    }

    public void setSingleScreen(boolean z) {
        Rect rectA;
        if (!this.d) {
            invalidate();
            return;
        }
        if (this.g != null && Build.VERSION.SDK_INT >= 11) {
            this.g.cancel();
        }
        final Rect rect = new Rect();
        final Rect rect2 = new Rect();
        if (this.e == null) {
            rectA = this.c.a(!z);
        } else {
            rectA = this.e;
        }
        rect.set(rectA);
        rect2.set(this.c.a(z));
        this.e = new Rect();
        if (Build.VERSION.SDK_INT >= 11) {
            this.g = new ValueAnimator();
            this.g.setDuration(500L);
            this.g.setFloatValues(0.0f, 1.0f);
            this.g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.tsf.extend.wallpaper.CustomWallpaperShadowView.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Float f = null;
                    if (Build.VERSION.SDK_INT >= 11) {
                        f = (Float) valueAnimator.getAnimatedValue();
                    }
                    CustomWallpaperShadowView.this.e.set((int) (rect.left + ((rect2.left - rect.left) * f.floatValue())), (int) (rect.top + ((rect2.top - rect.top) * f.floatValue())), (int) (rect.right + ((rect2.right - rect.right) * f.floatValue())), (int) ((f.floatValue() * (rect2.bottom - rect.bottom)) + rect.bottom));
                    CustomWallpaperShadowView.this.postInvalidate();
                }
            });
            this.g.addListener(new Animator.AnimatorListener() { // from class: com.tsf.extend.wallpaper.CustomWallpaperShadowView.2
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (!CustomWallpaperShadowView.this.f) {
                        CustomWallpaperShadowView.this.e = null;
                        CustomWallpaperShadowView.this.postInvalidate();
                    } else {
                        CustomWallpaperShadowView.this.f = false;
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    CustomWallpaperShadowView.this.f = true;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }
            });
            this.g.start();
        }
    }
}
