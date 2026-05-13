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
/* renamed from: com.tsf.extend.base.view.e */
/* loaded from: classes.dex */
public class C1480e extends Drawable {

    /* renamed from: d */
    private final Bitmap f4629d;

    /* renamed from: e */
    private final Paint f4630e;

    /* renamed from: f */
    private final int f4631f;

    /* renamed from: g */
    private final int f4632g;

    /* renamed from: i */
    private final Paint f4634i;

    /* renamed from: a */
    private final RectF f4626a = new RectF();

    /* renamed from: b */
    private final RectF f4627b = new RectF();

    /* renamed from: c */
    private final RectF f4628c = new RectF();

    /* renamed from: h */
    private final RectF f4633h = new RectF();

    /* renamed from: j */
    private final Matrix f4635j = new Matrix();

    /* renamed from: k */
    private final RectF f4636k = new RectF();

    /* renamed from: l */
    private Shader.TileMode f4637l = Shader.TileMode.CLAMP;

    /* renamed from: m */
    private Shader.TileMode f4638m = Shader.TileMode.CLAMP;

    /* renamed from: n */
    private boolean f4639n = true;

    /* renamed from: o */
    private float f4640o = 0.0f;

    /* renamed from: p */
    private final boolean[] f4641p = {true, true, true, true};

    /* renamed from: q */
    private boolean f4642q = false;

    /* renamed from: r */
    private float f4643r = 0.0f;

    /* renamed from: s */
    private ColorStateList f4644s = ColorStateList.valueOf(-16777216);

    /* renamed from: t */
    private ImageView.ScaleType f4645t = ImageView.ScaleType.FIT_CENTER;

    public C1480e(Bitmap bitmap) {
        this.f4629d = bitmap;
        this.f4631f = bitmap.getWidth();
        this.f4632g = bitmap.getHeight();
        this.f4628c.set(0.0f, 0.0f, this.f4631f, this.f4632g);
        this.f4630e = new Paint();
        this.f4630e.setStyle(Paint.Style.FILL);
        this.f4630e.setAntiAlias(true);
        this.f4634i = new Paint();
        this.f4634i.setStyle(Paint.Style.STROKE);
        this.f4634i.setAntiAlias(true);
        this.f4634i.setColor(this.f4644s.getColorForState(getState(), -16777216));
        this.f4634i.setStrokeWidth(this.f4643r);
    }

    /* renamed from: a */
    public static C1480e m8449a(Bitmap bitmap) {
        if (bitmap != null) {
            return new C1480e(bitmap);
        }
        return null;
    }

    /* renamed from: a */
    public static Drawable m8446a(Drawable drawable) {
        if (drawable != null && !(drawable instanceof C1480e)) {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), m8446a(layerDrawable.getDrawable(i)));
                }
                return layerDrawable;
            }
            Bitmap m8440b = m8440b(drawable);
            if (m8440b != null) {
                return new C1480e(m8440b);
            }
            return drawable;
        }
        return drawable;
    }

    /* renamed from: b */
    public static Bitmap m8440b(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f4644s.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.f4644s.getColorForState(iArr, 0);
        if (this.f4634i.getColor() != colorForState) {
            this.f4634i.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.base.view.e$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C14811 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4646a = new int[ImageView.ScaleType.values().length];

        static {
            try {
                f4646a[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f4646a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f4646a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f4646a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f4646a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f4646a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f4646a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    /* renamed from: a */
    private void m8453a() {
        float min;
        float width;
        float f;
        float f2 = 0.0f;
        switch (C14811.f4646a[this.f4645t.ordinal()]) {
            case 1:
                this.f4633h.set(this.f4626a);
                this.f4633h.inset(this.f4643r / 2.0f, this.f4643r / 2.0f);
                this.f4635j.reset();
                this.f4635j.setTranslate((int) (((this.f4633h.width() - this.f4631f) * 0.5f) + 0.5f), (int) (((this.f4633h.height() - this.f4632g) * 0.5f) + 0.5f));
                break;
            case 2:
                this.f4633h.set(this.f4626a);
                this.f4633h.inset(this.f4643r / 2.0f, this.f4643r / 2.0f);
                this.f4635j.reset();
                if (this.f4631f * this.f4633h.height() > this.f4633h.width() * this.f4632g) {
                    width = this.f4633h.height() / this.f4632g;
                    f = (this.f4633h.width() - (this.f4631f * width)) * 0.5f;
                } else {
                    width = this.f4633h.width() / this.f4631f;
                    f = 0.0f;
                    f2 = (this.f4633h.height() - (this.f4632g * width)) * 0.5f;
                }
                this.f4635j.setScale(width, width);
                this.f4635j.postTranslate(((int) (f + 0.5f)) + (this.f4643r / 2.0f), ((int) (f2 + 0.5f)) + (this.f4643r / 2.0f));
                break;
            case 3:
                this.f4635j.reset();
                if (this.f4631f <= this.f4626a.width() && this.f4632g <= this.f4626a.height()) {
                    min = 1.0f;
                } else {
                    min = Math.min(this.f4626a.width() / this.f4631f, this.f4626a.height() / this.f4632g);
                }
                this.f4635j.setScale(min, min);
                this.f4635j.postTranslate((int) (((this.f4626a.width() - (this.f4631f * min)) * 0.5f) + 0.5f), (int) (((this.f4626a.height() - (this.f4632g * min)) * 0.5f) + 0.5f));
                this.f4633h.set(this.f4628c);
                this.f4635j.mapRect(this.f4633h);
                this.f4633h.inset(this.f4643r / 2.0f, this.f4643r / 2.0f);
                this.f4635j.setRectToRect(this.f4628c, this.f4633h, Matrix.ScaleToFit.FILL);
                break;
            case 4:
            default:
                this.f4633h.set(this.f4628c);
                this.f4635j.setRectToRect(this.f4628c, this.f4626a, Matrix.ScaleToFit.CENTER);
                this.f4635j.mapRect(this.f4633h);
                this.f4633h.inset(this.f4643r / 2.0f, this.f4643r / 2.0f);
                this.f4635j.setRectToRect(this.f4628c, this.f4633h, Matrix.ScaleToFit.FILL);
                break;
            case 5:
                this.f4633h.set(this.f4628c);
                this.f4635j.setRectToRect(this.f4628c, this.f4626a, Matrix.ScaleToFit.END);
                this.f4635j.mapRect(this.f4633h);
                this.f4633h.inset(this.f4643r / 2.0f, this.f4643r / 2.0f);
                this.f4635j.setRectToRect(this.f4628c, this.f4633h, Matrix.ScaleToFit.FILL);
                break;
            case 6:
                this.f4633h.set(this.f4628c);
                this.f4635j.setRectToRect(this.f4628c, this.f4626a, Matrix.ScaleToFit.START);
                this.f4635j.mapRect(this.f4633h);
                this.f4633h.inset(this.f4643r / 2.0f, this.f4643r / 2.0f);
                this.f4635j.setRectToRect(this.f4628c, this.f4633h, Matrix.ScaleToFit.FILL);
                break;
            case 7:
                this.f4633h.set(this.f4626a);
                this.f4633h.inset(this.f4643r / 2.0f, this.f4643r / 2.0f);
                this.f4635j.reset();
                this.f4635j.setRectToRect(this.f4628c, this.f4633h, Matrix.ScaleToFit.FILL);
                break;
        }
        this.f4627b.set(this.f4633h);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4626a.set(rect);
        m8453a();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f4639n) {
            BitmapShader bitmapShader = new BitmapShader(this.f4629d, this.f4637l, this.f4638m);
            if (this.f4637l == Shader.TileMode.CLAMP && this.f4638m == Shader.TileMode.CLAMP) {
                bitmapShader.setLocalMatrix(this.f4635j);
            }
            this.f4630e.setShader(bitmapShader);
            this.f4639n = false;
        }
        if (this.f4642q) {
            if (this.f4643r > 0.0f) {
                canvas.drawOval(this.f4627b, this.f4630e);
                canvas.drawOval(this.f4633h, this.f4634i);
                return;
            }
            canvas.drawOval(this.f4627b, this.f4630e);
        } else if (m8443a(this.f4641p)) {
            float f = this.f4640o;
            if (this.f4643r > 0.0f) {
                canvas.drawRoundRect(this.f4627b, f, f, this.f4630e);
                canvas.drawRoundRect(this.f4633h, f, f, this.f4634i);
                m8448a(canvas);
                m8442b(canvas);
                return;
            }
            canvas.drawRoundRect(this.f4627b, f, f, this.f4630e);
            m8448a(canvas);
        } else {
            canvas.drawRect(this.f4627b, this.f4630e);
            if (this.f4643r > 0.0f) {
                canvas.drawRect(this.f4633h, this.f4634i);
            }
        }
    }

    /* renamed from: a */
    private void m8448a(Canvas canvas) {
        if (!m8439b(this.f4641p) && this.f4640o != 0.0f) {
            float f = this.f4627b.left;
            float f2 = this.f4627b.top;
            float width = this.f4627b.width() + f;
            float height = this.f4627b.height() + f2;
            float f3 = this.f4640o;
            if (!this.f4641p[0]) {
                this.f4636k.set(f, f2, f + f3, f2 + f3);
                canvas.drawRect(this.f4636k, this.f4630e);
            }
            if (!this.f4641p[1]) {
                this.f4636k.set(width - f3, f2, width, f3);
                canvas.drawRect(this.f4636k, this.f4630e);
            }
            if (!this.f4641p[2]) {
                this.f4636k.set(width - f3, height - f3, width, height);
                canvas.drawRect(this.f4636k, this.f4630e);
            }
            if (!this.f4641p[3]) {
                this.f4636k.set(f, height - f3, f3 + f, height);
                canvas.drawRect(this.f4636k, this.f4630e);
            }
        }
    }

    /* renamed from: b */
    private void m8442b(Canvas canvas) {
        if (!m8439b(this.f4641p) && this.f4640o != 0.0f) {
            float f = this.f4627b.left;
            float f2 = this.f4627b.top;
            float width = f + this.f4627b.width();
            float height = f2 + this.f4627b.height();
            float f3 = this.f4640o;
            float f4 = this.f4643r / 2.0f;
            if (!this.f4641p[0]) {
                canvas.drawLine(f - f4, f2, f + f3, f2, this.f4634i);
                canvas.drawLine(f, f2 - f4, f, f2 + f3, this.f4634i);
            }
            if (!this.f4641p[1]) {
                canvas.drawLine((width - f3) - f4, f2, width, f2, this.f4634i);
                canvas.drawLine(width, f2 - f4, width, f2 + f3, this.f4634i);
            }
            if (!this.f4641p[2]) {
                canvas.drawLine((width - f3) - f4, height, width + f4, height, this.f4634i);
                canvas.drawLine(width, height - f3, width, height, this.f4634i);
            }
            if (!this.f4641p[3]) {
                canvas.drawLine(f - f4, height, f + f3, height, this.f4634i);
                canvas.drawLine(f, height - f3, f, height, this.f4634i);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4630e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f4630e.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f4630e.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4630e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f4630e.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f4630e.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f4631f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4632g;
    }

    /* renamed from: a */
    public C1480e m8451a(float f, float f2, float f3, float f4) {
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
            float floatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(floatValue) || Float.isNaN(floatValue) || floatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: " + floatValue);
            }
            this.f4640o = floatValue;
        } else {
            this.f4640o = 0.0f;
        }
        this.f4641p[0] = f > 0.0f;
        this.f4641p[1] = f2 > 0.0f;
        this.f4641p[2] = f3 > 0.0f;
        this.f4641p[3] = f4 > 0.0f;
        return this;
    }

    /* renamed from: a */
    public C1480e m8452a(float f) {
        this.f4643r = f;
        this.f4634i.setStrokeWidth(this.f4643r);
        return this;
    }

    /* renamed from: a */
    public C1480e m8450a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f4644s = colorStateList;
        this.f4634i.setColor(this.f4644s.getColorForState(getState(), -16777216));
        return this;
    }

    /* renamed from: a */
    public C1480e m8444a(boolean z) {
        this.f4642q = z;
        return this;
    }

    /* renamed from: a */
    public C1480e m8445a(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f4645t != scaleType) {
            this.f4645t = scaleType;
            m8453a();
        }
        return this;
    }

    /* renamed from: a */
    public C1480e m8447a(Shader.TileMode tileMode) {
        if (this.f4637l != tileMode) {
            this.f4637l = tileMode;
            this.f4639n = true;
            invalidateSelf();
        }
        return this;
    }

    /* renamed from: b */
    public C1480e m8441b(Shader.TileMode tileMode) {
        if (this.f4638m != tileMode) {
            this.f4638m = tileMode;
            this.f4639n = true;
            invalidateSelf();
        }
        return this;
    }

    /* renamed from: a */
    private static boolean m8443a(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m8439b(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }
}
