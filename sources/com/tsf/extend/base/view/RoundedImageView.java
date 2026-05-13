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
import com.tsf.extend.C1536f;
/* loaded from: classes.dex */
public class RoundedImageView extends ImageView {

    /* renamed from: a */
    public static final Shader.TileMode f4571a;

    /* renamed from: b */
    static final /* synthetic */ boolean f4572b;

    /* renamed from: c */
    private static final ImageView.ScaleType[] f4573c;

    /* renamed from: d */
    private final float[] f4574d;

    /* renamed from: e */
    private Drawable f4575e;

    /* renamed from: f */
    private ColorStateList f4576f;

    /* renamed from: g */
    private float f4577g;

    /* renamed from: h */
    private ColorFilter f4578h;

    /* renamed from: i */
    private boolean f4579i;

    /* renamed from: j */
    private Drawable f4580j;

    /* renamed from: k */
    private boolean f4581k;

    /* renamed from: l */
    private boolean f4582l;

    /* renamed from: m */
    private boolean f4583m;

    /* renamed from: n */
    private int f4584n;

    /* renamed from: o */
    private int f4585o;

    /* renamed from: p */
    private ImageView.ScaleType f4586p;

    /* renamed from: q */
    private Shader.TileMode f4587q;

    /* renamed from: r */
    private Shader.TileMode f4588r;

    static {
        f4572b = !RoundedImageView.class.desiredAssertionStatus();
        f4571a = Shader.TileMode.CLAMP;
        f4573c = new ImageView.ScaleType[]{ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    }

    public RoundedImageView(Context context) {
        super(context);
        this.f4574d = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f4576f = ColorStateList.valueOf(-16777216);
        this.f4577g = 0.0f;
        this.f4578h = null;
        this.f4579i = false;
        this.f4581k = false;
        this.f4582l = false;
        this.f4583m = false;
        this.f4586p = ImageView.ScaleType.FIT_CENTER;
        this.f4587q = f4571a;
        this.f4588r = f4571a;
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4574d = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f4576f = ColorStateList.valueOf(-16777216);
        this.f4577g = 0.0f;
        this.f4578h = null;
        this.f4579i = false;
        this.f4581k = false;
        this.f4582l = false;
        this.f4583m = false;
        this.f4586p = ImageView.ScaleType.FIT_CENTER;
        this.f4587q = f4571a;
        this.f4588r = f4571a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1536f.C1545i.RoundedImageView, i, 0);
        int i2 = obtainStyledAttributes.getInt(C1536f.C1545i.RoundedImageView_android_scaleType, -1);
        if (i2 >= 0) {
            setScaleType(f4573c[i2]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1536f.C1545i.RoundedImageView_riv_corner_radius, -1);
        this.f4574d[0] = obtainStyledAttributes.getDimensionPixelSize(C1536f.C1545i.RoundedImageView_riv_corner_radius_top_left, -1);
        this.f4574d[1] = obtainStyledAttributes.getDimensionPixelSize(C1536f.C1545i.RoundedImageView_riv_corner_radius_top_right, -1);
        this.f4574d[2] = obtainStyledAttributes.getDimensionPixelSize(C1536f.C1545i.RoundedImageView_riv_corner_radius_bottom_right, -1);
        this.f4574d[3] = obtainStyledAttributes.getDimensionPixelSize(C1536f.C1545i.RoundedImageView_riv_corner_radius_bottom_left, -1);
        int length = this.f4574d.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f4574d[i3] < 0.0f) {
                this.f4574d[i3] = 0.0f;
            } else {
                z = true;
            }
        }
        if (!z) {
            float f = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length2 = this.f4574d.length;
            for (int i4 = 0; i4 < length2; i4++) {
                this.f4574d[i4] = f;
            }
        }
        this.f4577g = obtainStyledAttributes.getDimensionPixelSize(C1536f.C1545i.RoundedImageView_riv_border_width, -1);
        if (this.f4577g < 0.0f) {
            this.f4577g = 0.0f;
        }
        this.f4576f = obtainStyledAttributes.getColorStateList(C1536f.C1545i.RoundedImageView_riv_border_color);
        if (this.f4576f == null) {
            this.f4576f = ColorStateList.valueOf(-16777216);
        }
        this.f4583m = obtainStyledAttributes.getBoolean(C1536f.C1545i.RoundedImageView_riv_mutate_background, false);
        this.f4582l = obtainStyledAttributes.getBoolean(C1536f.C1545i.RoundedImageView_riv_oval, false);
        int i5 = obtainStyledAttributes.getInt(C1536f.C1545i.RoundedImageView_riv_tile_mode, -2);
        if (i5 != -2) {
            setTileModeX(m8476a(i5));
            setTileModeY(m8476a(i5));
        }
        int i6 = obtainStyledAttributes.getInt(C1536f.C1545i.RoundedImageView_riv_tile_mode_x, -2);
        if (i6 != -2) {
            setTileModeX(m8476a(i6));
        }
        int i7 = obtainStyledAttributes.getInt(C1536f.C1545i.RoundedImageView_riv_tile_mode_y, -2);
        if (i7 != -2) {
            setTileModeY(m8476a(i7));
        }
        m8472c();
        m8474a(true);
        if (this.f4583m) {
            super.setBackgroundDrawable(this.f4575e);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static Shader.TileMode m8476a(int i) {
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
        return this.f4586p;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!f4572b && scaleType == null) {
            throw new AssertionError();
        }
        if (this.f4586p != scaleType) {
            this.f4586p = scaleType;
            switch (C14741.f4589a[scaleType.ordinal()]) {
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
            m8472c();
            m8474a(false);
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.base.view.RoundedImageView$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C14741 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4589a = new int[ImageView.ScaleType.values().length];

        static {
            try {
                f4589a[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f4589a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f4589a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f4589a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f4589a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f4589a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f4589a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f4584n = 0;
        this.f4580j = C1480e.m8446a(drawable);
        m8472c();
        super.setImageDrawable(this.f4580j);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f4584n = 0;
        this.f4580j = C1480e.m8449a(bitmap);
        m8472c();
        super.setImageDrawable(this.f4580j);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f4584n != i) {
            this.f4584n = i;
            this.f4580j = m8478a();
            m8472c();
            super.setImageDrawable(this.f4580j);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    /* renamed from: a */
    private Drawable m8478a() {
        Drawable drawable = null;
        Resources resources = getResources();
        if (resources == null) {
            return null;
        }
        if (this.f4584n != 0) {
            try {
                drawable = resources.getDrawable(this.f4584n);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.f4584n, e);
                this.f4584n = 0;
            }
        }
        return C1480e.m8446a(drawable);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (this.f4585o != i) {
            this.f4585o = i;
            this.f4575e = m8473b();
            setBackgroundDrawable(this.f4575e);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f4575e = new ColorDrawable(i);
        setBackgroundDrawable(this.f4575e);
    }

    /* renamed from: b */
    private Drawable m8473b() {
        Drawable drawable = null;
        Resources resources = getResources();
        if (resources == null) {
            return null;
        }
        if (this.f4585o != 0) {
            try {
                drawable = resources.getDrawable(this.f4585o);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.f4585o, e);
                this.f4585o = 0;
            }
        }
        return C1480e.m8446a(drawable);
    }

    /* renamed from: c */
    private void m8472c() {
        m8475a(this.f4580j, this.f4586p);
    }

    /* renamed from: a */
    private void m8474a(boolean z) {
        if (this.f4583m) {
            if (z) {
                this.f4575e = C1480e.m8446a(this.f4575e);
            }
            m8475a(this.f4575e, ImageView.ScaleType.FIT_XY);
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f4578h != colorFilter) {
            this.f4578h = colorFilter;
            this.f4581k = true;
            this.f4579i = true;
            m8471d();
            invalidate();
        }
    }

    /* renamed from: d */
    private void m8471d() {
        if (this.f4580j != null && this.f4579i) {
            this.f4580j = this.f4580j.mutate();
            if (this.f4581k) {
                this.f4580j.setColorFilter(this.f4578h);
            }
        }
    }

    /* renamed from: a */
    private void m8475a(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable != null) {
            if (drawable instanceof C1480e) {
                ((C1480e) drawable).m8445a(scaleType).m8452a(this.f4577g).m8450a(this.f4576f).m8444a(this.f4582l).m8447a(this.f4587q).m8441b(this.f4588r);
                if (this.f4574d != null) {
                    ((C1480e) drawable).m8451a(this.f4574d[0], this.f4574d[1], this.f4574d[2], this.f4574d[3]);
                }
                m8471d();
            } else if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    m8475a(layerDrawable.getDrawable(i), scaleType);
                }
            }
        }
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f4575e = drawable;
        m8474a(true);
        super.setBackgroundDrawable(this.f4575e);
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f = 0.0f;
        for (float f2 : this.f4574d) {
            f = Math.max(f2, f);
        }
        return f;
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        m8477a(dimension, dimension, dimension, dimension);
    }

    public void setCornerRadius(float f) {
        m8477a(f, f, f, f);
    }

    /* renamed from: a */
    public void m8477a(float f, float f2, float f3, float f4) {
        if (this.f4574d[0] != f || this.f4574d[1] != f2 || this.f4574d[2] != f4 || this.f4574d[3] != f3) {
            this.f4574d[0] = f;
            this.f4574d[1] = f2;
            this.f4574d[3] = f3;
            this.f4574d[2] = f4;
            m8472c();
            m8474a(false);
            invalidate();
        }
    }

    public float getBorderWidth() {
        return this.f4577g;
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    public void setBorderWidth(float f) {
        if (this.f4577g != f) {
            this.f4577g = f;
            m8472c();
            m8474a(false);
            invalidate();
        }
    }

    public int getBorderColor() {
        return this.f4576f.getDefaultColor();
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public ColorStateList getBorderColors() {
        return this.f4576f;
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (!this.f4576f.equals(colorStateList)) {
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(-16777216);
            }
            this.f4576f = colorStateList;
            m8472c();
            m8474a(false);
            if (this.f4577g > 0.0f) {
                invalidate();
            }
        }
    }

    public void setOval(boolean z) {
        this.f4582l = z;
        m8472c();
        m8474a(false);
        invalidate();
    }

    public Shader.TileMode getTileModeX() {
        return this.f4587q;
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f4587q != tileMode) {
            this.f4587q = tileMode;
            m8472c();
            m8474a(false);
            invalidate();
        }
    }

    public Shader.TileMode getTileModeY() {
        return this.f4588r;
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.f4588r != tileMode) {
            this.f4588r = tileMode;
            m8472c();
            m8474a(false);
            invalidate();
        }
    }
}
