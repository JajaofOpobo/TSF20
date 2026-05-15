package com.tsf.extend.wallpaper;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WallpaperImageView extends View {
    protected boolean a;
    private b b;
    private Bitmap c;
    private Bitmap d;
    private Matrix e;
    private Paint f;
    private float g;
    private float h;
    private long i;
    private float j;
    private GestureDetector k;
    private a l;
    private float m;
    private boolean n;
    private float o;
    private float p;
    private float q;
    private int r;
    private int s;

    public interface a {
        void a(WallpaperImageView wallpaperImageView);

        void b(WallpaperImageView wallpaperImageView);
    }

    public enum b {
        WidthFirst,
        HeightFirst
    }

    public WallpaperImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = b.WidthFirst;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0L;
        this.m = 0.0f;
        this.e = new Matrix();
        this.f = new Paint();
        this.f.setAntiAlias(true);
        getScreenParams();
        this.k = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.tsf.extend.wallpaper.WallpaperImageView.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (WallpaperImageView.this.l != null) {
                    WallpaperImageView.this.l.a(WallpaperImageView.this);
                    return true;
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (WallpaperImageView.this.l != null) {
                    WallpaperImageView.this.l.b(WallpaperImageView.this);
                    return true;
                }
                return true;
            }
        });
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.c != null || this.d != null) {
            a(this.d == null ? this.c : this.d);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.n) {
            return false;
        }
        this.k.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(-14079703);
        if (this.i == 0) {
            this.i = System.currentTimeMillis();
        }
        if (this.c != null || this.d != null) {
            try {
                a(this.d == null ? this.c : this.d, canvas);
            } catch (Throwable th) {
            }
        }
    }

    private void a(Bitmap bitmap) {
        this.p = getMeasuredWidth();
        this.q = getMeasuredHeight();
        this.o = (this.p * 1.0f) / this.q;
        float height = bitmap.getHeight();
        float width = bitmap.getWidth();
        switch (this.b) {
            case WidthFirst:
                this.j = this.p / width;
                break;
            case HeightFirst:
                this.j = this.q / height;
                break;
        }
    }

    private void a(Bitmap bitmap, Canvas canvas) {
        float width;
        this.e.reset();
        float height = this.j;
        if (this.n && this.b == b.WidthFirst) {
            height = (getHeight() * 1.0f) / bitmap.getHeight();
        }
        this.e.postScale(height, height);
        this.g = (getWidth() - (bitmap.getWidth() * height)) / 2.0f;
        this.h = (getHeight() - (height * bitmap.getHeight())) / 2.0f;
        this.g += this.m * this.g;
        if (this.n) {
            if (this.r <= 0 || this.s < 0) {
                this.g = 0.0f;
            } else {
                float height2 = this.o * bitmap.getHeight();
                if (this.r > 1) {
                    width = (bitmap.getWidth() - height2) / (this.r - 1);
                    if (width < 0.0f) {
                        width = 0.0f;
                    }
                } else {
                    width = 0.0f;
                }
                canvas.drawBitmap(bitmap, new Rect((int) (this.s * width), 0, (int) ((width * this.s) + height2), bitmap.getHeight()), new Rect(0, 0, (int) this.p, (int) this.q), this.f);
                return;
            }
        }
        this.e.postTranslate(this.g, this.h);
        canvas.drawBitmap(bitmap, this.e, this.f);
    }

    private void getScreenParams() {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("multi_process_file", 4);
        this.s = sharedPreferences.getInt("prefer_default_screen", -1);
        this.r = sharedPreferences.getInt("prefer_total_screen", -1);
    }

    public b getScaleType() {
        return this.b;
    }

    public void setScaleType(b bVar) {
        this.b = bVar;
        Bitmap bitmap = this.d != null ? this.d : this.c;
        if (bitmap != null) {
            a(bitmap);
            invalidate();
        }
    }

    public void a() {
        this.n = true;
        invalidate();
    }

    public void b() {
        this.n = false;
        invalidate();
    }

    public void setTempBitmap(Bitmap bitmap) {
        this.c = bitmap;
        requestLayout();
        invalidate();
    }

    public void setSrcBitmap(Bitmap bitmap) {
        this.d = bitmap;
        if (!this.a) {
            requestLayout();
            invalidate();
        }
    }

    public Bitmap getSrcBitmap() {
        return this.d;
    }

    public Bitmap getTempBitmap() {
        return this.c;
    }

    public boolean c() {
        return this.a;
    }

    public void setOnTapListener(a aVar) {
        this.l = aVar;
    }

    public void a(float f, boolean z) {
        if (this.b == b.HeightFirst) {
            if (z) {
                final float f2 = this.m;
                if (Build.VERSION.SDK_INT >= 11) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.tsf.extend.wallpaper.WallpaperImageView.2
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            WallpaperImageView.this.m = fFloatValue * f2;
                            WallpaperImageView.this.invalidate();
                        }
                    });
                    valueAnimatorOfFloat.setDuration(200L);
                    valueAnimatorOfFloat.start();
                }
            } else {
                this.m = f;
            }
            invalidate();
        }
    }
}
