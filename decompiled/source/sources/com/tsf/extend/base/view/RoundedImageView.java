package com.tsf.extend.base.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import com.tsf.extend.f;
/* loaded from: classes.dex */
public class RoundedImageView extends ImageView {
    public static final Shader.TileMode a;
    static final /* synthetic */ boolean b;
    private static final ImageView.ScaleType[] c;
    private final float[] d;
    private Drawable e;
    private ColorStateList f;
    private float g;
    private ColorFilter h;
    private boolean i;
    private Drawable j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private ImageView.ScaleType p;
    private Shader.TileMode q;
    private Shader.TileMode r;

    static {
        b = !RoundedImageView.class.desiredAssertionStatus();
        a = Shader.TileMode.CLAMP;
        c = new ImageView.ScaleType[]{ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    }

    public RoundedImageView(Context context) {
        super(context);
        this.d = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f = ColorStateList.valueOf(-16777216);
        this.g = 0.0f;
        this.h = null;
        this.i = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.p = ImageView.ScaleType.FIT_CENTER;
        this.q = a;
        this.r = a;
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f = ColorStateList.valueOf(-16777216);
        this.g = 0.0f;
        this.h = null;
        this.i = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.p = ImageView.ScaleType.FIT_CENTER;
        this.q = a;
        this.r = a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.i.RoundedImageView, i, 0);
        int i2 = obtainStyledAttributes.getInt(f.i.RoundedImageView_android_scaleType, -1);
        if (i2 >= 0) {
            setScaleType(c[i2]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(f.i.RoundedImageView_riv_corner_radius, -1);
        this.d[0] = obtainStyledAttributes.getDimensionPixelSize(f.i.RoundedImageView_riv_corner_radius_top_left, -1);
        this.d[1] = obtainStyledAttributes.getDimensionPixelSize(f.i.RoundedImageView_riv_corner_radius_top_right, -1);
        this.d[2] = obtainStyledAttributes.getDimensionPixelSize(f.i.RoundedImageView_riv_corner_radius_bottom_right, -1);
        this.d[3] = obtainStyledAttributes.getDimensionPixelSize(f.i.RoundedImageView_riv_corner_radius_bottom_left, -1);
        int length = this.d.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.d[i3] < 0.0f) {
                this.d[i3] = 0.0f;
            } else {
                z = true;
            }
        }
        if (!z) {
            float f = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length2 = this.d.length;
            for (int i4 = 0; i4 < length2; i4++) {
                this.d[i4] = f;
            }
        }
        this.g = obtainStyledAttributes.getDimensionPixelSize(f.i.RoundedImageView_riv_border_width, -1);
        if (this.g < 0.0f) {
            this.g = 0.0f;
        }
        this.f = obtainStyledAttributes.getColorStateList(f.i.RoundedImageView_riv_border_color);
        if (this.f == null) {
            this.f = ColorStateList.valueOf(-16777216);
        }
        this.m = obtainStyledAttributes.getBoolean(f.i.RoundedImageView_riv_mutate_background, false);
        this.l = obtainStyledAttributes.getBoolean(f.i.RoundedImageView_riv_oval, false);
        int i5 = obtainStyledAttributes.getInt(f.i.RoundedImageView_riv_tile_mode, -2);
        if (i5 != -2) {
            setTileModeX(a(i5));
            setTileModeY(a(i5));
        }
        int i6 = obtainStyledAttributes.getInt(f.i.RoundedImageView_riv_tile_mode_x, -2);
        if (i6 != -2) {
            setTileModeX(a(i6));
        }
        int i7 = obtainStyledAttributes.getInt(f.i.RoundedImageView_riv_tile_mode_y, -2);
        if (i7 != -2) {
            setTileModeY(a(i7));
        }
        c();
        a(true);
        if (this.m) {
            super.setBackgroundDrawable(this.e);
        }
        obtainStyledAttributes.recycle();
    }

    private static Shader.TileMode a(int i) {
        switch (i) {
            case 0:
                return Shader.TileMode.CLAMP;
            case 1:
                return Shader.TileMode.REPEAT;
            case 2:
                return Shader.TileMode.MIRROR;
            default:
                return null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.p;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!b && scaleType == null) {
            throw new AssertionError();
        }
        if (this.p != scaleType) {
            this.p = scaleType;
            switch (AnonymousClass1.a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            c();
            a(false);
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.base.view.RoundedImageView$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
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
                a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.n = 0;
        this.j = e.a(drawable);
        c();
        super.setImageDrawable(this.j);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.n = 0;
        this.j = e.a(bitmap);
        c();
        super.setImageDrawable(this.j);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.n != i) {
            this.n = i;
            this.j = a();
            c();
            super.setImageDrawable(this.j);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    private Drawable a() {
        Drawable drawable = null;
        Resources resources = getResources();
        if (resources == null) {
            return null;
        }
        if (this.n != 0) {
            try {
                drawable = resources.getDrawable(this.n);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.n, e);
                this.n = 0;
            }
        }
        return e.a(drawable);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (this.o != i) {
            this.o = i;
            this.e = b();
            setBackgroundDrawable(this.e);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.e = new ColorDrawable(i);
        setBackgroundDrawable(this.e);
    }

    private Drawable b() {
        Drawable drawable = null;
        Resources resources = getResources();
        if (resources == null) {
            return null;
        }
        if (this.o != 0) {
            try {
                drawable = resources.getDrawable(this.o);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.o, e);
                this.o = 0;
            }
        }
        return e.a(drawable);
    }

    private void c() {
        a(this.j, this.p);
    }

    private void a(boolean z) {
        if (this.m) {
            if (z) {
                this.e = e.a(this.e);
            }
            a(this.e, ImageView.ScaleType.FIT_XY);
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.h != colorFilter) {
            this.h = colorFilter;
            this.k = true;
            this.i = true;
            d();
            invalidate();
        }
    }

    private void d() {
        if (this.j != null && this.i) {
            this.j = this.j.mutate();
            if (this.k) {
                this.j.setColorFilter(this.h);
            }
        }
    }

    private void a(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable != null) {
            if (drawable instanceof e) {
                ((e) drawable).a(scaleType).a(this.g).a(this.f).a(this.l).a(this.q).b(this.r);
                if (this.d != null) {
                    ((e) drawable).a(this.d[0], this.d[1], this.d[2], this.d[3]);
                }
                d();
            } else if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    a(layerDrawable.getDrawable(i), scaleType);
                }
            }
        }
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.e = drawable;
        a(true);
        super.setBackgroundDrawable(this.e);
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f = 0.0f;
        for (float f2 : this.d) {
            f = Math.max(f2, f);
        }
        return f;
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        a(dimension, dimension, dimension, dimension);
    }

    public void setCornerRadius(float f) {
        a(f, f, f, f);
    }

    public void a(float f, float f2, float f3, float f4) {
        if (this.d[0] != f || this.d[1] != f2 || this.d[2] != f4 || this.d[3] != f3) {
            this.d[0] = f;
            this.d[1] = f2;
            this.d[3] = f3;
            this.d[2] = f4;
            c();
            a(false);
            invalidate();
        }
    }

    public float getBorderWidth() {
        return this.g;
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    public void setBorderWidth(float f) {
        if (this.g != f) {
            this.g = f;
            c();
            a(false);
            invalidate();
        }
    }

    public int getBorderColor() {
        return this.f.getDefaultColor();
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public ColorStateList getBorderColors() {
        return this.f;
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (!this.f.equals(colorStateList)) {
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(-16777216);
            }
            this.f = colorStateList;
            c();
            a(false);
            if (this.g > 0.0f) {
                invalidate();
            }
        }
    }

    public void setOval(boolean z) {
        this.l = z;
        c();
        a(false);
        invalidate();
    }

    public Shader.TileMode getTileModeX() {
        return this.q;
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.q != tileMode) {
            this.q = tileMode;
            c();
            a(false);
            invalidate();
        }
    }

    public Shader.TileMode getTileModeY() {
        return this.r;
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.r != tileMode) {
            this.r = tileMode;
            c();
            a(false);
            invalidate();
        }
    }
}
