package com.tsf.extend.base.view;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.widget.ImageView;
import java.util.HashSet;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends Drawable {
    private final Bitmap d;
    private final Paint e;
    private final int f;
    private final int g;
    private final Paint i;
    private final RectF a = new RectF();
    private final RectF b = new RectF();
    private final RectF c = new RectF();
    private final RectF h = new RectF();
    private final Matrix j = new Matrix();
    private final RectF k = new RectF();
    private Shader.TileMode l = Shader.TileMode.CLAMP;
    private Shader.TileMode m = Shader.TileMode.CLAMP;
    private boolean n = true;
    private float o = 0.0f;
    private final boolean[] p = {true, true, true, true};
    private boolean q = false;
    private float r = 0.0f;
    private ColorStateList s = ColorStateList.valueOf(-16777216);
    private ImageView.ScaleType t = ImageView.ScaleType.FIT_CENTER;

    public e(Bitmap bitmap) {
        this.d = bitmap;
        this.f = bitmap.getWidth();
        this.g = bitmap.getHeight();
        this.c.set(0.0f, 0.0f, this.f, this.g);
        this.e = new Paint();
        this.e.setStyle(Paint.Style.FILL);
        this.e.setAntiAlias(true);
        this.i = new Paint();
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setAntiAlias(true);
        this.i.setColor(this.s.getColorForState(getState(), -16777216));
        this.i.setStrokeWidth(this.r);
    }

    public static e a(Bitmap bitmap) {
        if (bitmap != null) {
            return new e(bitmap);
        }
        return null;
    }

    public static Drawable a(Drawable drawable) {
        if (drawable != null && !(drawable instanceof e)) {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), a(layerDrawable.getDrawable(i)));
                }
                return layerDrawable;
            }
            Bitmap bitmapB = b(drawable);
            if (bitmapB != null) {
                return new e(bitmapB);
            }
            return drawable;
        }
        return drawable;
    }

    public static Bitmap b(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.s.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.s.getColorForState(iArr, 0);
        if (this.i.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.i.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: com.tsf.extend.base.view.e$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ImageView.ScaleType.values().length];

        static {
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    private void a() {
        float fMin;
        float fWidth;
        float fWidth2;
        float fHeight = 0.0f;
        switch (AnonymousClass1.a[this.t.ordinal()]) {
            case 1:
                this.h.set(this.a);
                this.h.inset(this.r / 2.0f, this.r / 2.0f);
                this.j.reset();
                this.j.setTranslate((int) (((this.h.width() - this.f) * 0.5f) + 0.5f), (int) (((this.h.height() - this.g) * 0.5f) + 0.5f));
                break;
            case 2:
                this.h.set(this.a);
                this.h.inset(this.r / 2.0f, this.r / 2.0f);
                this.j.reset();
                if (this.f * this.h.height() > this.h.width() * this.g) {
                    fWidth = this.h.height() / this.g;
                    fWidth2 = (this.h.width() - (this.f * fWidth)) * 0.5f;
                } else {
                    fWidth = this.h.width() / this.f;
                    fWidth2 = 0.0f;
                    fHeight = (this.h.height() - (this.g * fWidth)) * 0.5f;
                }
                this.j.setScale(fWidth, fWidth);
                this.j.postTranslate(((int) (fWidth2 + 0.5f)) + (this.r / 2.0f), ((int) (fHeight + 0.5f)) + (this.r / 2.0f));
                break;
            case 3:
                this.j.reset();
                if (this.f <= this.a.width() && this.g <= this.a.height()) {
                    fMin = 1.0f;
                } else {
                    fMin = Math.min(this.a.width() / this.f, this.a.height() / this.g);
                }
                float fWidth3 = (int) (((this.a.width() - (this.f * fMin)) * 0.5f) + 0.5f);
                float fHeight2 = (int) (((this.a.height() - (this.g * fMin)) * 0.5f) + 0.5f);
                this.j.setScale(fMin, fMin);
                this.j.postTranslate(fWidth3, fHeight2);
                this.h.set(this.c);
                this.j.mapRect(this.h);
                this.h.inset(this.r / 2.0f, this.r / 2.0f);
                this.j.setRectToRect(this.c, this.h, Matrix.ScaleToFit.FILL);
                break;
            case 4:
            default:
                this.h.set(this.c);
                this.j.setRectToRect(this.c, this.a, Matrix.ScaleToFit.CENTER);
                this.j.mapRect(this.h);
                this.h.inset(this.r / 2.0f, this.r / 2.0f);
                this.j.setRectToRect(this.c, this.h, Matrix.ScaleToFit.FILL);
                break;
            case 5:
                this.h.set(this.c);
                this.j.setRectToRect(this.c, this.a, Matrix.ScaleToFit.END);
                this.j.mapRect(this.h);
                this.h.inset(this.r / 2.0f, this.r / 2.0f);
                this.j.setRectToRect(this.c, this.h, Matrix.ScaleToFit.FILL);
                break;
            case 6:
                this.h.set(this.c);
                this.j.setRectToRect(this.c, this.a, Matrix.ScaleToFit.START);
                this.j.mapRect(this.h);
                this.h.inset(this.r / 2.0f, this.r / 2.0f);
                this.j.setRectToRect(this.c, this.h, Matrix.ScaleToFit.FILL);
                break;
            case 7:
                this.h.set(this.a);
                this.h.inset(this.r / 2.0f, this.r / 2.0f);
                this.j.reset();
                this.j.setRectToRect(this.c, this.h, Matrix.ScaleToFit.FILL);
                break;
        }
        this.b.set(this.h);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.set(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.n) {
            BitmapShader bitmapShader = new BitmapShader(this.d, this.l, this.m);
            if (this.l == Shader.TileMode.CLAMP && this.m == Shader.TileMode.CLAMP) {
                bitmapShader.setLocalMatrix(this.j);
            }
            this.e.setShader(bitmapShader);
            this.n = false;
        }
        if (this.q) {
            if (this.r > 0.0f) {
                canvas.drawOval(this.b, this.e);
                canvas.drawOval(this.h, this.i);
                return;
            } else {
                canvas.drawOval(this.b, this.e);
                return;
            }
        }
        if (a(this.p)) {
            float f = this.o;
            if (this.r > 0.0f) {
                canvas.drawRoundRect(this.b, f, f, this.e);
                canvas.drawRoundRect(this.h, f, f, this.i);
                a(canvas);
                b(canvas);
                return;
            }
            canvas.drawRoundRect(this.b, f, f, this.e);
            a(canvas);
            return;
        }
        canvas.drawRect(this.b, this.e);
        if (this.r > 0.0f) {
            canvas.drawRect(this.h, this.i);
        }
    }

    private void a(Canvas canvas) {
        if (!b(this.p) && this.o != 0.0f) {
            float f = this.b.left;
            float f2 = this.b.top;
            float fWidth = this.b.width() + f;
            float fHeight = this.b.height() + f2;
            float f3 = this.o;
            if (!this.p[0]) {
                this.k.set(f, f2, f + f3, f2 + f3);
                canvas.drawRect(this.k, this.e);
            }
            if (!this.p[1]) {
                this.k.set(fWidth - f3, f2, fWidth, f3);
                canvas.drawRect(this.k, this.e);
            }
            if (!this.p[2]) {
                this.k.set(fWidth - f3, fHeight - f3, fWidth, fHeight);
                canvas.drawRect(this.k, this.e);
            }
            if (!this.p[3]) {
                this.k.set(f, fHeight - f3, f3 + f, fHeight);
                canvas.drawRect(this.k, this.e);
            }
        }
    }

    private void b(Canvas canvas) {
        if (!b(this.p) && this.o != 0.0f) {
            float f = this.b.left;
            float f2 = this.b.top;
            float fWidth = f + this.b.width();
            float fHeight = f2 + this.b.height();
            float f3 = this.o;
            float f4 = this.r / 2.0f;
            if (!this.p[0]) {
                canvas.drawLine(f - f4, f2, f + f3, f2, this.i);
                canvas.drawLine(f, f2 - f4, f, f2 + f3, this.i);
            }
            if (!this.p[1]) {
                canvas.drawLine((fWidth - f3) - f4, f2, fWidth, f2, this.i);
                canvas.drawLine(fWidth, f2 - f4, fWidth, f2 + f3, this.i);
            }
            if (!this.p[2]) {
                canvas.drawLine((fWidth - f3) - f4, fHeight, fWidth + f4, fHeight, this.i);
                canvas.drawLine(fWidth, fHeight - f3, fWidth, fHeight, this.i);
            }
            if (!this.p[3]) {
                canvas.drawLine(f - f4, fHeight, f + f3, fHeight, this.i);
                canvas.drawLine(f, fHeight - f3, f, fHeight, this.i);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.e.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.e.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.e.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.e.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.g;
    }

    public e a(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (!hashSet.isEmpty()) {
            float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue) || fFloatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: " + fFloatValue);
            }
            this.o = fFloatValue;
        } else {
            this.o = 0.0f;
        }
        this.p[0] = f > 0.0f;
        this.p[1] = f2 > 0.0f;
        this.p[2] = f3 > 0.0f;
        this.p[3] = f4 > 0.0f;
        return this;
    }

    public e a(float f) {
        this.r = f;
        this.i.setStrokeWidth(this.r);
        return this;
    }

    public e a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.s = colorStateList;
        this.i.setColor(this.s.getColorForState(getState(), -16777216));
        return this;
    }

    public e a(boolean z) {
        this.q = z;
        return this;
    }

    public e a(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.t != scaleType) {
            this.t = scaleType;
            a();
        }
        return this;
    }

    public e a(Shader.TileMode tileMode) {
        if (this.l != tileMode) {
            this.l = tileMode;
            this.n = true;
            invalidateSelf();
        }
        return this;
    }

    public e b(Shader.TileMode tileMode) {
        if (this.m != tileMode) {
            this.m = tileMode;
            this.n = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean a(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }
}
