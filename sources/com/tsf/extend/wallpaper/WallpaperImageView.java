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
/* loaded from: classes.dex */
public class WallpaperImageView extends View {

    /* renamed from: a */
    protected boolean f6506a;

    /* renamed from: b */
    private EnumC2011b f6507b;

    /* renamed from: c */
    private Bitmap f6508c;

    /* renamed from: d */
    private Bitmap f6509d;

    /* renamed from: e */
    private Matrix f6510e;

    /* renamed from: f */
    private Paint f6511f;

    /* renamed from: g */
    private float f6512g;

    /* renamed from: h */
    private float f6513h;

    /* renamed from: i */
    private long f6514i;

    /* renamed from: j */
    private float f6515j;

    /* renamed from: k */
    private GestureDetector f6516k;

    /* renamed from: l */
    private InterfaceC2010a f6517l;

    /* renamed from: m */
    private float f6518m;

    /* renamed from: n */
    private boolean f6519n;

    /* renamed from: o */
    private float f6520o;

    /* renamed from: p */
    private float f6521p;

    /* renamed from: q */
    private float f6522q;

    /* renamed from: r */
    private int f6523r;

    /* renamed from: s */
    private int f6524s;

    /* renamed from: com.tsf.extend.wallpaper.WallpaperImageView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2010a {
        /* renamed from: a */
        void mo6744a(WallpaperImageView wallpaperImageView);

        /* renamed from: b */
        void mo6743b(WallpaperImageView wallpaperImageView);
    }

    /* renamed from: com.tsf.extend.wallpaper.WallpaperImageView$b */
    /* loaded from: classes.dex */
    public enum EnumC2011b {
        WidthFirst,
        HeightFirst
    }

    public WallpaperImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6507b = EnumC2011b.WidthFirst;
        this.f6512g = 0.0f;
        this.f6513h = 0.0f;
        this.f6514i = 0L;
        this.f6518m = 0.0f;
        this.f6510e = new Matrix();
        this.f6511f = new Paint();
        this.f6511f.setAntiAlias(true);
        getScreenParams();
        this.f6516k = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.tsf.extend.wallpaper.WallpaperImageView.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (WallpaperImageView.this.f6517l != null) {
                    WallpaperImageView.this.f6517l.mo6744a(WallpaperImageView.this);
                    return true;
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (WallpaperImageView.this.f6517l != null) {
                    WallpaperImageView.this.f6517l.mo6743b(WallpaperImageView.this);
                    return true;
                }
                return true;
            }
        });
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.f6508c != null || this.f6509d != null) {
            m6750a(this.f6509d == null ? this.f6508c : this.f6509d);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f6519n) {
            return false;
        }
        this.f6516k.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(-14079703);
        if (this.f6514i == 0) {
            this.f6514i = System.currentTimeMillis();
        }
        if (this.f6508c != null || this.f6509d != null) {
            try {
                m6749a(this.f6509d == null ? this.f6508c : this.f6509d, canvas);
            } catch (Throwable th) {
            }
        }
    }

    /* renamed from: a */
    private void m6750a(Bitmap bitmap) {
        this.f6521p = getMeasuredWidth();
        this.f6522q = getMeasuredHeight();
        this.f6520o = (this.f6521p * 1.0f) / this.f6522q;
        float height = bitmap.getHeight();
        float width = bitmap.getWidth();
        switch (this.f6507b) {
            case WidthFirst:
                this.f6515j = this.f6521p / width;
                return;
            case HeightFirst:
                this.f6515j = this.f6522q / height;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m6749a(Bitmap bitmap, Canvas canvas) {
        float f;
        this.f6510e.reset();
        float f2 = this.f6515j;
        if (this.f6519n && this.f6507b == EnumC2011b.WidthFirst) {
            f2 = (getHeight() * 1.0f) / bitmap.getHeight();
        }
        this.f6510e.postScale(f2, f2);
        this.f6512g = (getWidth() - (bitmap.getWidth() * f2)) / 2.0f;
        this.f6513h = (getHeight() - (f2 * bitmap.getHeight())) / 2.0f;
        this.f6512g += this.f6518m * this.f6512g;
        if (this.f6519n) {
            if (this.f6523r <= 0 || this.f6524s < 0) {
                this.f6512g = 0.0f;
            } else {
                float height = this.f6520o * bitmap.getHeight();
                if (this.f6523r > 1) {
                    f = (bitmap.getWidth() - height) / (this.f6523r - 1);
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                } else {
                    f = 0.0f;
                }
                canvas.drawBitmap(bitmap, new Rect((int) (this.f6524s * f), 0, (int) ((f * this.f6524s) + height), bitmap.getHeight()), new Rect(0, 0, (int) this.f6521p, (int) this.f6522q), this.f6511f);
                return;
            }
        }
        this.f6510e.postTranslate(this.f6512g, this.f6513h);
        canvas.drawBitmap(bitmap, this.f6510e, this.f6511f);
    }

    private void getScreenParams() {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("multi_process_file", 4);
        this.f6524s = sharedPreferences.getInt("prefer_default_screen", -1);
        this.f6523r = sharedPreferences.getInt("prefer_total_screen", -1);
    }

    public EnumC2011b getScaleType() {
        return this.f6507b;
    }

    public void setScaleType(EnumC2011b enumC2011b) {
        this.f6507b = enumC2011b;
        Bitmap bitmap = this.f6509d != null ? this.f6509d : this.f6508c;
        if (bitmap != null) {
            m6750a(bitmap);
            invalidate();
        }
    }

    /* renamed from: a */
    public void m6752a() {
        this.f6519n = true;
        invalidate();
    }

    /* renamed from: b */
    public void m6746b() {
        this.f6519n = false;
        invalidate();
    }

    public void setTempBitmap(Bitmap bitmap) {
        this.f6508c = bitmap;
        requestLayout();
        invalidate();
    }

    public void setSrcBitmap(Bitmap bitmap) {
        this.f6509d = bitmap;
        if (!this.f6506a) {
            requestLayout();
            invalidate();
        }
    }

    public Bitmap getSrcBitmap() {
        return this.f6509d;
    }

    public Bitmap getTempBitmap() {
        return this.f6508c;
    }

    /* renamed from: c */
    public boolean m6745c() {
        return this.f6506a;
    }

    public void setOnTapListener(InterfaceC2010a interfaceC2010a) {
        this.f6517l = interfaceC2010a;
    }

    /* renamed from: a */
    public void m6751a(float f, boolean z) {
        if (this.f6507b == EnumC2011b.HeightFirst) {
            if (z) {
                final float f2 = this.f6518m;
                if (Build.VERSION.SDK_INT >= 11) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.tsf.extend.wallpaper.WallpaperImageView.2
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            WallpaperImageView.this.f6518m = floatValue * f2;
                            WallpaperImageView.this.invalidate();
                        }
                    });
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            } else {
                this.f6518m = f;
            }
            invalidate();
        }
    }
}
