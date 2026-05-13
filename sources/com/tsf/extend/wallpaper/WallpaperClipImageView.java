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
/* loaded from: classes.dex */
public class WallpaperClipImageView extends View {

    /* renamed from: a */
    private float f6326a;

    /* renamed from: b */
    private int f6327b;

    /* renamed from: c */
    private PointF f6328c;

    /* renamed from: d */
    private PointF f6329d;

    /* renamed from: e */
    private Matrix f6330e;

    /* renamed from: f */
    private Matrix f6331f;

    /* renamed from: g */
    private Bitmap f6332g;

    /* renamed from: h */
    private C2146x f6333h;

    /* renamed from: i */
    private boolean f6334i;

    /* renamed from: j */
    private float f6335j;

    /* renamed from: k */
    private boolean f6336k;

    /* renamed from: l */
    private ValueAnimator f6337l;

    /* renamed from: m */
    private Matrix f6338m;

    /* renamed from: n */
    private Matrix f6339n;

    /* renamed from: o */
    private View.OnTouchListener f6340o;

    public WallpaperClipImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6327b = -1;
        this.f6328c = new PointF();
        this.f6329d = new PointF();
        this.f6330e = new Matrix();
        this.f6334i = false;
        this.f6335j = 1.0f;
        this.f6336k = false;
        this.f6338m = new Matrix();
        this.f6339n = new Matrix();
        this.f6340o = new View.OnTouchListener() { // from class: com.tsf.extend.wallpaper.WallpaperClipImageView.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction() & 255) {
                    case 0:
                        if (WallpaperClipImageView.this.m6889b(motionEvent)) {
                            WallpaperClipImageView.this.f6327b = 0;
                            WallpaperClipImageView.this.f6328c.set(motionEvent.getX(), motionEvent.getY());
                            WallpaperClipImageView.this.f6338m.set(WallpaperClipImageView.this.f6330e);
                            break;
                        } else {
                            WallpaperClipImageView.this.f6327b = -1;
                            break;
                        }
                    case 1:
                    case 3:
                    case 6:
                        WallpaperClipImageView.this.f6327b = -1;
                        break;
                    case 2:
                        if (WallpaperClipImageView.this.f6327b != -1 && WallpaperClipImageView.this.m6889b(motionEvent)) {
                            if (WallpaperClipImageView.this.f6327b == 0) {
                                float[] m6903a = WallpaperClipImageView.this.m6903a(motionEvent.getX() - WallpaperClipImageView.this.f6328c.x, motionEvent.getY() - WallpaperClipImageView.this.f6328c.y);
                                if (m6903a[0] != 0.0f || m6903a[1] != 0.0f) {
                                    WallpaperClipImageView.this.f6336k = true;
                                    WallpaperClipImageView.this.f6339n.set(WallpaperClipImageView.this.f6338m);
                                    WallpaperClipImageView.this.f6339n.postTranslate(m6903a[0], m6903a[1]);
                                    WallpaperClipImageView.this.f6330e.set(WallpaperClipImageView.this.f6339n);
                                    WallpaperClipImageView.this.invalidate();
                                    break;
                                }
                            } else if (WallpaperClipImageView.this.f6327b == 1) {
                                float[] m6904a = WallpaperClipImageView.this.m6904a(WallpaperClipImageView.m6886c(motionEvent) / WallpaperClipImageView.this.f6326a);
                                if (m6904a != null) {
                                    WallpaperClipImageView.this.f6339n.set(WallpaperClipImageView.this.f6338m);
                                    WallpaperClipImageView.this.f6339n.postScale(m6904a[0], m6904a[0], m6904a[3], m6904a[4]);
                                    WallpaperClipImageView.this.f6330e.set(WallpaperClipImageView.this.f6339n);
                                    WallpaperClipImageView.this.invalidate();
                                    WallpaperClipImageView.this.f6339n.postTranslate(m6904a[1], m6904a[2]);
                                    WallpaperClipImageView.this.f6330e.set(WallpaperClipImageView.this.f6339n);
                                    WallpaperClipImageView.this.invalidate();
                                    break;
                                }
                            }
                        }
                        break;
                    case 5:
                        if (WallpaperClipImageView.this.m6889b(motionEvent)) {
                            WallpaperClipImageView.this.f6327b = 1;
                            WallpaperClipImageView.this.f6326a = WallpaperClipImageView.m6886c(motionEvent);
                            WallpaperClipImageView.this.f6329d.set((motionEvent.getX() + WallpaperClipImageView.this.f6328c.x) / 2.0f, (motionEvent.getY() + WallpaperClipImageView.this.f6328c.y) / 2.0f);
                            WallpaperClipImageView.this.f6338m.set(WallpaperClipImageView.this.f6330e);
                            break;
                        }
                        break;
                }
                return true;
            }
        };
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, null);
        }
    }

    /* renamed from: a */
    public void m6892a(C2146x c2146x, Bitmap bitmap) {
        if (c2146x != null && bitmap != null) {
            this.f6332g = bitmap;
            this.f6333h = c2146x;
            m6891a(false);
        }
    }

    /* renamed from: a */
    private void m6891a(boolean z) {
        float m6229d;
        final RectF rectF = new RectF();
        final float m6902a = m6902a(this.f6331f != null ? this.f6331f : this.f6330e, rectF);
        final Matrix matrix = new Matrix();
        matrix.set(this.f6331f != null ? this.f6331f : this.f6330e);
        matrix.reset();
        float width = this.f6332g.getWidth() / this.f6332g.getHeight();
        float m6229d2 = this.f6333h.m6229d() / this.f6333h.m6228e();
        this.f6334i = width > m6229d2;
        if (this.f6333h.m6226g()) {
            matrix.postTranslate(this.f6333h.m6237a() - ((this.f6332g.getWidth() - this.f6333h.m6229d()) / 2), this.f6333h.m6232b());
            this.f6335j = 1.0f;
        } else {
            if (width > m6229d2) {
                m6229d = this.f6333h.m6228e() / this.f6332g.getHeight();
            } else {
                m6229d = this.f6333h.m6229d() / this.f6332g.getWidth();
            }
            matrix.postScale(m6229d, m6229d);
            matrix.postTranslate(this.f6333h.m6237a() - (((this.f6332g.getWidth() * m6229d) - this.f6333h.m6229d()) / 2.0f), this.f6333h.m6232b() - (((this.f6332g.getHeight() * m6229d) - this.f6333h.m6228e()) / 2.0f));
            this.f6335j = m6229d;
        }
        this.f6336k = false;
        if (z) {
            if (this.f6337l != null && Build.VERSION.SDK_INT >= 11) {
                this.f6337l.cancel();
            }
            final RectF rectF2 = new RectF();
            final float m6902a2 = m6902a(matrix, rectF2);
            if (C2146x.f7063a) {
                Log.d("ClipWallpaper", "start Animation targetScale:" + m6902a2 + " targetRect:" + rectF2);
            }
            this.f6331f = new Matrix();
            if (Build.VERSION.SDK_INT >= 11) {
                this.f6337l = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f6337l.setDuration(500L);
                this.f6337l.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.tsf.extend.wallpaper.WallpaperClipImageView.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float f = 0.0f;
                        if (Build.VERSION.SDK_INT >= 11) {
                            f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        }
                        float f2 = ((m6902a2 - m6902a) * f) + m6902a;
                        float f3 = ((rectF2.left - rectF.left) * f) + rectF.left;
                        float f4 = ((rectF2.top - rectF.top) * f) + rectF.top;
                        if (WallpaperClipImageView.this.f6331f != null) {
                            WallpaperClipImageView.this.f6331f.reset();
                            WallpaperClipImageView.this.f6331f.postScale(f2, f2);
                            WallpaperClipImageView.this.f6331f.postTranslate(f3, f4);
                            if (C2146x.f7063a) {
                                Log.d("ClipWallpaper", "Animation targetProgressOffsetX:" + f3 + " targetProgressOffsetY:" + f4 + " progress:" + f);
                            }
                            WallpaperClipImageView.this.postInvalidate();
                        }
                    }
                });
                this.f6337l.addListener(new Animator.AnimatorListener() { // from class: com.tsf.extend.wallpaper.WallpaperClipImageView.2

                    /* renamed from: c */
                    private boolean f6348c = false;

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        if (!this.f6348c) {
                            WallpaperClipImageView.this.f6331f = null;
                            WallpaperClipImageView.this.f6330e.set(matrix);
                            WallpaperClipImageView.this.invalidate();
                        } else {
                            this.f6348c = false;
                        }
                        WallpaperClipImageView.this.f6337l = null;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        this.f6348c = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }
                });
                this.f6337l.start();
                return;
            }
            this.f6330e.set(matrix);
            invalidate();
        }
    }

    /* renamed from: a */
    public void m6905a() {
        if (this.f6337l != null && Build.VERSION.SDK_INT >= 11) {
            this.f6337l.end();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f6332g != null) {
            canvas.drawBitmap(this.f6332g, this.f6331f != null ? this.f6331f : this.f6330e, null);
        } else {
            super.draw(canvas);
        }
    }

    public RectF getDisplayRect() {
        RectF rectF = new RectF();
        m6902a(this.f6330e, rectF);
        if (C2146x.f7063a) {
            Log.d("ClipWallpaper", "image total rect:" + rectF);
        }
        float m6237a = this.f6333h.m6237a() - rectF.left;
        float m6232b = this.f6333h.m6232b() - rectF.top;
        float m6229d = this.f6333h.m6229d() + m6237a;
        float m6228e = this.f6333h.m6228e() + m6232b;
        float m6227f = this.f6333h.m6227f() / (rectF.right - rectF.left);
        if (C2146x.f7063a) {
            Log.d("ClipWallpaper", "image in stroken rect:" + new RectF(m6237a, m6232b, m6229d, m6228e) + " scaleRate:" + m6227f);
        }
        RectF rectF2 = new RectF(m6237a * m6227f, m6232b * m6227f, m6229d * m6227f, m6227f * m6228e);
        if (C2146x.f7063a) {
            Log.d("ClipWallpaper", "image in stroken,original rect:" + rectF2);
        }
        return rectF2;
    }

    public View.OnTouchListener getTouchListener() {
        return this.f6340o;
    }

    /* renamed from: a */
    private float m6902a(Matrix matrix, RectF rectF) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        rectF.left = fArr[2];
        rectF.top = fArr[5];
        float f = fArr[0];
        rectF.right = rectF.left + (this.f6332g.getWidth() * f);
        rectF.bottom = rectF.top + (this.f6332g.getHeight() * f);
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public float[] m6903a(float f, float f2) {
        RectF rectF = new RectF();
        m6902a(this.f6338m, rectF);
        Rect m6230c = this.f6333h.m6230c();
        float f3 = m6230c.top - rectF.top;
        float f4 = m6230c.left - rectF.left;
        float f5 = m6230c.bottom - rectF.bottom;
        float f6 = m6230c.right - rectF.right;
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
    /* renamed from: a */
    public float[] m6904a(float f) {
        float f2;
        float f3;
        float f4 = 0.0f;
        if (C2146x.f7063a) {
            Log.d("ClipWallpaper", "======prepareScale targetScale:" + f + " mInitialScale:" + this.f6335j);
        }
        RectF rectF = new RectF();
        float m6902a = (5.0f * this.f6335j) / m6902a(this.f6338m, rectF);
        Rect m6230c = this.f6333h.m6230c();
        if (this.f6334i) {
            f2 = (m6230c.bottom - m6230c.top) / (rectF.bottom - rectF.top);
        } else {
            f2 = (m6230c.right - m6230c.left) / (rectF.right - rectF.left);
        }
        if (C2146x.f7063a) {
            Log.d("ClipWallpaper", "prepareScale minScale:" + f2 + " maxScale:" + m6902a + " targetImageRect:" + rectF + " wallpaperRect" + m6230c + " mSrcBitmapWidthMore:" + this.f6334i);
        }
        if (f > m6902a) {
            f = m6902a;
        } else if (f < f2) {
            f = f2;
        }
        PointF pointF = new PointF();
        pointF.set((m6230c.left + m6230c.right) / 2.0f, (m6230c.top + m6230c.bottom) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.set(this.f6338m);
        matrix.postScale(f, f, pointF.x, pointF.y);
        m6902a(matrix, rectF);
        if (rectF.left > m6230c.left) {
            f3 = m6230c.left - rectF.left;
        } else {
            f3 = rectF.right < ((float) m6230c.right) ? m6230c.right - rectF.right : 0.0f;
        }
        if (rectF.top > m6230c.top) {
            f4 = m6230c.top - rectF.top;
        } else if (rectF.bottom < m6230c.bottom) {
            f4 = m6230c.bottom - rectF.bottom;
        }
        if (C2146x.f7063a) {
            Matrix matrix2 = new Matrix();
            matrix2.set(matrix);
            matrix2.postTranslate(f3, f4);
            RectF rectF2 = new RectF();
            m6902a(matrix2, rectF2);
            Log.d("ClipWallpaper", "result scale:" + f + " maxScale:" + m6902a + " minScale:" + f2 + " dx:" + f3 + " dy:" + f4 + " logRect:" + rectF2 + " no did Offset rect:" + rectF);
        }
        return new float[]{f, f3, f4, pointF.x, pointF.y};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m6889b(MotionEvent motionEvent) {
        return this.f6333h.m6230c().contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static float m6886c(MotionEvent motionEvent) {
        float x = motionEvent.getX(1) - motionEvent.getX(0);
        float y = motionEvent.getY(1) - motionEvent.getY(0);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public void setSingleScreen(boolean z) {
        this.f6333h.m6231b(z);
        m6891a(true);
    }

    /* renamed from: b */
    public void m6890b() {
        this.f6332g = null;
    }
}
