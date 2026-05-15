package com.tsf.extend.wallpaper;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WallpaperClipImageView extends View {
    private float a;
    private int b;
    private PointF c;
    private PointF d;
    private Matrix e;
    private Matrix f;
    private Bitmap g;
    private x h;
    private boolean i;
    private float j;
    private boolean k;
    private ValueAnimator l;
    private Matrix m;
    private Matrix n;
    private View.OnTouchListener o;

    public WallpaperClipImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
        this.c = new PointF();
        this.d = new PointF();
        this.e = new Matrix();
        this.i = false;
        this.j = 1.0f;
        this.k = false;
        this.m = new Matrix();
        this.n = new Matrix();
        this.o = new View.OnTouchListener() { // from class: com.tsf.extend.wallpaper.WallpaperClipImageView.3
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction() & 255) {
                    case 0:
                        if (WallpaperClipImageView.this.b(motionEvent)) {
                            WallpaperClipImageView.this.b = 0;
                            WallpaperClipImageView.this.c.set(motionEvent.getX(), motionEvent.getY());
                            WallpaperClipImageView.this.m.set(WallpaperClipImageView.this.e);
                        } else {
                            WallpaperClipImageView.this.b = -1;
                        }
                        return true;
                    case 1:
                    case 3:
                    case 6:
                        WallpaperClipImageView.this.b = -1;
                        return true;
                    case 2:
                        if (WallpaperClipImageView.this.b != -1 && WallpaperClipImageView.this.b(motionEvent)) {
                            if (WallpaperClipImageView.this.b == 0) {
                                float[] fArrA = WallpaperClipImageView.this.a(motionEvent.getX() - WallpaperClipImageView.this.c.x, motionEvent.getY() - WallpaperClipImageView.this.c.y);
                                if (fArrA[0] != 0.0f || fArrA[1] != 0.0f) {
                                    WallpaperClipImageView.this.k = true;
                                    WallpaperClipImageView.this.n.set(WallpaperClipImageView.this.m);
                                    WallpaperClipImageView.this.n.postTranslate(fArrA[0], fArrA[1]);
                                    WallpaperClipImageView.this.e.set(WallpaperClipImageView.this.n);
                                    WallpaperClipImageView.this.invalidate();
                                }
                            } else if (WallpaperClipImageView.this.b == 1) {
                                float[] fArrA2 = WallpaperClipImageView.this.a(WallpaperClipImageView.c(motionEvent) / WallpaperClipImageView.this.a);
                                if (fArrA2 != null) {
                                    WallpaperClipImageView.this.n.set(WallpaperClipImageView.this.m);
                                    WallpaperClipImageView.this.n.postScale(fArrA2[0], fArrA2[0], fArrA2[3], fArrA2[4]);
                                    WallpaperClipImageView.this.e.set(WallpaperClipImageView.this.n);
                                    WallpaperClipImageView.this.invalidate();
                                    WallpaperClipImageView.this.n.postTranslate(fArrA2[1], fArrA2[2]);
                                    WallpaperClipImageView.this.e.set(WallpaperClipImageView.this.n);
                                    WallpaperClipImageView.this.invalidate();
                                }
                            }
                        }
                        return true;
                    case 4:
                    default:
                        return true;
                    case 5:
                        if (WallpaperClipImageView.this.b(motionEvent)) {
                            WallpaperClipImageView.this.b = 1;
                            WallpaperClipImageView.this.a = WallpaperClipImageView.c(motionEvent);
                            WallpaperClipImageView.this.d.set((motionEvent.getX() + WallpaperClipImageView.this.c.x) / 2.0f, (motionEvent.getY() + WallpaperClipImageView.this.c.y) / 2.0f);
                            WallpaperClipImageView.this.m.set(WallpaperClipImageView.this.e);
                        }
                        return true;
                }
            }
        };
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, null);
        }
    }

    public void a(x xVar, Bitmap bitmap) {
        if (xVar != null && bitmap != null) {
            this.g = bitmap;
            this.h = xVar;
            a(false);
        }
    }

    private void a(boolean z) {
        float fD;
        final RectF rectF = new RectF();
        final float fA = a(this.f != null ? this.f : this.e, rectF);
        final Matrix matrix = new Matrix();
        matrix.set(this.f != null ? this.f : this.e);
        matrix.reset();
        float width = this.g.getWidth() / this.g.getHeight();
        float fD2 = this.h.d() / this.h.e();
        this.i = width > fD2;
        if (this.h.g()) {
            matrix.postTranslate(this.h.a() - ((this.g.getWidth() - this.h.d()) / 2), this.h.b());
            this.j = 1.0f;
        } else {
            if (width > fD2) {
                fD = this.h.e() / this.g.getHeight();
            } else {
                fD = this.h.d() / this.g.getWidth();
            }
            matrix.postScale(fD, fD);
            matrix.postTranslate(this.h.a() - (((this.g.getWidth() * fD) - this.h.d()) / 2.0f), this.h.b() - (((this.g.getHeight() * fD) - this.h.e()) / 2.0f));
            this.j = fD;
        }
        this.k = false;
        if (z) {
            if (this.l != null && Build.VERSION.SDK_INT >= 11) {
                this.l.cancel();
            }
            final RectF rectF2 = new RectF();
            final float fA2 = a(matrix, rectF2);
            if (x.a) {
                Log.d("ClipWallpaper", "start Animation targetScale:" + fA2 + " targetRect:" + rectF2);
            }
            this.f = new Matrix();
            if (Build.VERSION.SDK_INT >= 11) {
                this.l = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.l.setDuration(500L);
                this.l.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.tsf.extend.wallpaper.WallpaperClipImageView.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float fFloatValue = 0.0f;
                        if (Build.VERSION.SDK_INT >= 11) {
                            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        }
                        float f = ((fA2 - fA) * fFloatValue) + fA;
                        float f2 = ((rectF2.left - rectF.left) * fFloatValue) + rectF.left;
                        float f3 = ((rectF2.top - rectF.top) * fFloatValue) + rectF.top;
                        if (WallpaperClipImageView.this.f != null) {
                            WallpaperClipImageView.this.f.reset();
                            WallpaperClipImageView.this.f.postScale(f, f);
                            WallpaperClipImageView.this.f.postTranslate(f2, f3);
                            if (x.a) {
                                Log.d("ClipWallpaper", "Animation targetProgressOffsetX:" + f2 + " targetProgressOffsetY:" + f3 + " progress:" + fFloatValue);
                            }
                            WallpaperClipImageView.this.postInvalidate();
                        }
                    }
                });
                this.l.addListener(new Animator.AnimatorListener() { // from class: com.tsf.extend.wallpaper.WallpaperClipImageView.2
                    private boolean c = false;

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        if (!this.c) {
                            WallpaperClipImageView.this.f = null;
                            WallpaperClipImageView.this.e.set(matrix);
                            WallpaperClipImageView.this.invalidate();
                        } else {
                            this.c = false;
                        }
                        WallpaperClipImageView.this.l = null;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        this.c = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }
                });
                this.l.start();
                return;
            }
            this.e.set(matrix);
            invalidate();
        }
    }

    public void a() {
        if (this.l != null && Build.VERSION.SDK_INT >= 11) {
            this.l.end();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.g != null) {
            canvas.drawBitmap(this.g, this.f != null ? this.f : this.e, null);
        } else {
            super.draw(canvas);
        }
    }

    public RectF getDisplayRect() {
        RectF rectF = new RectF();
        a(this.e, rectF);
        if (x.a) {
            Log.d("ClipWallpaper", "image total rect:" + rectF);
        }
        float fA = this.h.a() - rectF.left;
        float fB = this.h.b() - rectF.top;
        float fD = this.h.d() + fA;
        float fE = this.h.e() + fB;
        float f = this.h.f() / (rectF.right - rectF.left);
        if (x.a) {
            Log.d("ClipWallpaper", "image in stroken rect:" + new RectF(fA, fB, fD, fE) + " scaleRate:" + f);
        }
        RectF rectF2 = new RectF(fA * f, fB * f, fD * f, f * fE);
        if (x.a) {
            Log.d("ClipWallpaper", "image in stroken,original rect:" + rectF2);
        }
        return rectF2;
    }

    public View.OnTouchListener getTouchListener() {
        return this.o;
    }

    private float a(Matrix matrix, RectF rectF) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        rectF.left = fArr[2];
        rectF.top = fArr[5];
        float f = fArr[0];
        rectF.right = rectF.left + (this.g.getWidth() * f);
        rectF.bottom = rectF.top + (this.g.getHeight() * f);
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float[] a(float f, float f2) {
        RectF rectF = new RectF();
        a(this.m, rectF);
        Rect rectC = this.h.c();
        float f3 = rectC.top - rectF.top;
        float f4 = rectC.left - rectF.left;
        float f5 = rectC.bottom - rectF.bottom;
        float f6 = rectC.right - rectF.right;
        if (f > f4) {
            f = f4;
        } else if (f < f6) {
            f = f6;
        }
        if (f2 > f3) {
            f2 = f3;
        } else if (f2 < f5) {
            f2 = f5;
        }
        return new float[]{f, f2};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float[] a(float f) {
        float f2;
        float f3;
        float f4 = 0.0f;
        if (x.a) {
            Log.d("ClipWallpaper", "======prepareScale targetScale:" + f + " mInitialScale:" + this.j);
        }
        RectF rectF = new RectF();
        float fA = (5.0f * this.j) / a(this.m, rectF);
        Rect rectC = this.h.c();
        if (this.i) {
            f2 = (rectC.bottom - rectC.top) / (rectF.bottom - rectF.top);
        } else {
            f2 = (rectC.right - rectC.left) / (rectF.right - rectF.left);
        }
        if (x.a) {
            Log.d("ClipWallpaper", "prepareScale minScale:" + f2 + " maxScale:" + fA + " targetImageRect:" + rectF + " wallpaperRect" + rectC + " mSrcBitmapWidthMore:" + this.i);
        }
        if (f > fA) {
            f = fA;
        } else if (f < f2) {
            f = f2;
        }
        PointF pointF = new PointF();
        pointF.set((rectC.left + rectC.right) / 2.0f, (rectC.top + rectC.bottom) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.set(this.m);
        matrix.postScale(f, f, pointF.x, pointF.y);
        a(matrix, rectF);
        if (rectF.left > rectC.left) {
            f3 = rectC.left - rectF.left;
        } else {
            f3 = rectF.right < ((float) rectC.right) ? rectC.right - rectF.right : 0.0f;
        }
        if (rectF.top > rectC.top) {
            f4 = rectC.top - rectF.top;
        } else if (rectF.bottom < rectC.bottom) {
            f4 = rectC.bottom - rectF.bottom;
        }
        if (x.a) {
            Matrix matrix2 = new Matrix();
            matrix2.set(matrix);
            matrix2.postTranslate(f3, f4);
            RectF rectF2 = new RectF();
            a(matrix2, rectF2);
            Log.d("ClipWallpaper", "result scale:" + f + " maxScale:" + fA + " minScale:" + f2 + " dx:" + f3 + " dy:" + f4 + " logRect:" + rectF2 + " no did Offset rect:" + rectF);
        }
        return new float[]{f, f3, f4, pointF.x, pointF.y};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(MotionEvent motionEvent) {
        return this.h.c().contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float c(MotionEvent motionEvent) {
        float x = motionEvent.getX(1) - motionEvent.getX(0);
        float y = motionEvent.getY(1) - motionEvent.getY(0);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public void setSingleScreen(boolean z) {
        this.h.b(z);
        a(true);
    }

    public void b() {
        this.g = null;
    }
}
