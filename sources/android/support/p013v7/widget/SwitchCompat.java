package android.support.p013v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v4.p003a.p004a.C0021a;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.C0427t;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.p017c.C0604a;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.CompoundButton;
/* renamed from: android.support.v7.widget.SwitchCompat */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: F */
    private static final int[] f1969F = {16842912};

    /* renamed from: A */
    private Layout f1970A;

    /* renamed from: B */
    private TransformationMethod f1971B;

    /* renamed from: C */
    private C0715a f1972C;

    /* renamed from: D */
    private final Rect f1973D;

    /* renamed from: E */
    private final C0742g f1974E;

    /* renamed from: a */
    private Drawable f1975a;

    /* renamed from: b */
    private Drawable f1976b;

    /* renamed from: c */
    private int f1977c;

    /* renamed from: d */
    private int f1978d;

    /* renamed from: e */
    private int f1979e;

    /* renamed from: f */
    private boolean f1980f;

    /* renamed from: g */
    private CharSequence f1981g;

    /* renamed from: h */
    private CharSequence f1982h;

    /* renamed from: i */
    private boolean f1983i;

    /* renamed from: j */
    private int f1984j;

    /* renamed from: k */
    private int f1985k;

    /* renamed from: l */
    private float f1986l;

    /* renamed from: m */
    private float f1987m;

    /* renamed from: n */
    private VelocityTracker f1988n;

    /* renamed from: o */
    private int f1989o;

    /* renamed from: p */
    private float f1990p;

    /* renamed from: q */
    private int f1991q;

    /* renamed from: r */
    private int f1992r;

    /* renamed from: s */
    private int f1993s;

    /* renamed from: t */
    private int f1994t;

    /* renamed from: u */
    private int f1995u;

    /* renamed from: v */
    private int f1996v;

    /* renamed from: w */
    private int f1997w;

    /* renamed from: x */
    private TextPaint f1998x;

    /* renamed from: y */
    private ColorStateList f1999y;

    /* renamed from: z */
    private Layout f2000z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0535a.C0536a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1988n = VelocityTracker.obtain();
        this.f1973D = new Rect();
        this.f1998x = new TextPaint(1);
        Resources resources = getResources();
        this.f1998x.density = resources.getDisplayMetrics().density;
        C0725aa m11295a = C0725aa.m11295a(context, attributeSet, C0535a.C0546k.SwitchCompat, i, 0);
        this.f1975a = m11295a.m11300a(C0535a.C0546k.SwitchCompat_android_thumb);
        if (this.f1975a != null) {
            this.f1975a.setCallback(this);
        }
        this.f1976b = m11295a.m11300a(C0535a.C0546k.SwitchCompat_track);
        if (this.f1976b != null) {
            this.f1976b.setCallback(this);
        }
        this.f1981g = m11295a.m11292c(C0535a.C0546k.SwitchCompat_android_textOn);
        this.f1982h = m11295a.m11292c(C0535a.C0546k.SwitchCompat_android_textOff);
        this.f1983i = m11295a.m11297a(C0535a.C0546k.SwitchCompat_showText, true);
        this.f1977c = m11295a.m11287e(C0535a.C0546k.SwitchCompat_thumbTextPadding, 0);
        this.f1978d = m11295a.m11287e(C0535a.C0546k.SwitchCompat_switchMinWidth, 0);
        this.f1979e = m11295a.m11287e(C0535a.C0546k.SwitchCompat_switchPadding, 0);
        this.f1980f = m11295a.m11297a(C0535a.C0546k.SwitchCompat_splitTrack, false);
        int m11284g = m11295a.m11284g(C0535a.C0546k.SwitchCompat_switchTextAppearance, 0);
        if (m11284g != 0) {
            m11375a(context, m11284g);
        }
        this.f1974E = C0742g.m11215a();
        m11295a.m11301a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1985k = viewConfiguration.getScaledTouchSlop();
        this.f1989o = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: a */
    public void m11375a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C0535a.C0546k.TextAppearance);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(C0535a.C0546k.TextAppearance_android_textColor);
        if (colorStateList != null) {
            this.f1999y = colorStateList;
        } else {
            this.f1999y = getTextColors();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0535a.C0546k.TextAppearance_android_textSize, 0);
        if (dimensionPixelSize != 0 && dimensionPixelSize != this.f1998x.getTextSize()) {
            this.f1998x.setTextSize(dimensionPixelSize);
            requestLayout();
        }
        m11376a(obtainStyledAttributes.getInt(C0535a.C0546k.TextAppearance_android_typeface, -1), obtainStyledAttributes.getInt(C0535a.C0546k.TextAppearance_android_textStyle, -1));
        if (obtainStyledAttributes.getBoolean(C0535a.C0546k.TextAppearance_textAllCaps, false)) {
            this.f1971B = new C0604a(getContext());
        } else {
            this.f1971B = null;
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m11376a(int i, int i2) {
        Typeface typeface = null;
        switch (i) {
            case 1:
                typeface = Typeface.SANS_SERIF;
                break;
            case 2:
                typeface = Typeface.SERIF;
                break;
            case 3:
                typeface = Typeface.MONOSPACE;
                break;
        }
        m11374a(typeface, i2);
    }

    /* renamed from: a */
    public void m11374a(Typeface typeface, int i) {
        Typeface create;
        if (i > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i);
            } else {
                create = Typeface.create(typeface, i);
            }
            setSwitchTypeface(create);
            int style = ((create != null ? create.getStyle() : 0) ^ (-1)) & i;
            this.f1998x.setFakeBoldText((style & 1) != 0);
            this.f1998x.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        this.f1998x.setFakeBoldText(false);
        this.f1998x.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setSwitchTypeface(Typeface typeface) {
        if (this.f1998x.getTypeface() != typeface) {
            this.f1998x.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setSwitchPadding(int i) {
        this.f1979e = i;
        requestLayout();
    }

    public int getSwitchPadding() {
        return this.f1979e;
    }

    public void setSwitchMinWidth(int i) {
        this.f1978d = i;
        requestLayout();
    }

    public int getSwitchMinWidth() {
        return this.f1978d;
    }

    public void setThumbTextPadding(int i) {
        this.f1977c = i;
        requestLayout();
    }

    public int getThumbTextPadding() {
        return this.f1977c;
    }

    public void setTrackDrawable(Drawable drawable) {
        this.f1976b = drawable;
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(this.f1974E.m11211a(getContext(), i));
    }

    public Drawable getTrackDrawable() {
        return this.f1976b;
    }

    public void setThumbDrawable(Drawable drawable) {
        this.f1975a = drawable;
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(this.f1974E.m11211a(getContext(), i));
    }

    public Drawable getThumbDrawable() {
        return this.f1975a;
    }

    public void setSplitTrack(boolean z) {
        this.f1980f = z;
        invalidate();
    }

    public boolean getSplitTrack() {
        return this.f1980f;
    }

    public CharSequence getTextOn() {
        return this.f1981g;
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1981g = charSequence;
        requestLayout();
    }

    public CharSequence getTextOff() {
        return this.f1982h;
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1982h = charSequence;
        requestLayout();
    }

    public void setShowText(boolean z) {
        if (this.f1983i != z) {
            this.f1983i = z;
            requestLayout();
        }
    }

    public boolean getShowText() {
        return this.f1983i;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (this.f1983i) {
            if (this.f2000z == null) {
                this.f2000z = m11369a(this.f1981g);
            }
            if (this.f1970A == null) {
                this.f1970A = m11369a(this.f1982h);
            }
        }
        Rect rect = this.f1973D;
        if (this.f1975a != null) {
            this.f1975a.getPadding(rect);
            i4 = (this.f1975a.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1975a.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.f1993s = Math.max(this.f1983i ? Math.max(this.f2000z.getWidth(), this.f1970A.getWidth()) + (this.f1977c * 2) : 0, i4);
        if (this.f1976b != null) {
            this.f1976b.getPadding(rect);
            i5 = this.f1976b.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        if (this.f1975a != null) {
            Rect m11124a = C0755o.m11124a(this.f1975a);
            i6 = Math.max(i6, m11124a.left);
            i7 = Math.max(i7, m11124a.right);
        }
        int max = Math.max(this.f1978d, i7 + i6 + (this.f1993s * 2));
        int max2 = Math.max(i5, i3);
        this.f1991q = max;
        this.f1992r = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(C0309ai.m12899h(this), max2);
        }
    }

    @Override // android.view.View
    @TargetApi(14)
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1981g : this.f1982h;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* renamed from: a */
    private Layout m11369a(CharSequence charSequence) {
        CharSequence transformation = this.f1971B != null ? this.f1971B.getTransformation(charSequence, this) : charSequence;
        return new StaticLayout(transformation, this.f1998x, transformation != null ? (int) Math.ceil(Layout.getDesiredWidth(transformation, this.f1998x)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: a */
    private boolean m11378a(float f, float f2) {
        if (this.f1975a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1975a.getPadding(this.f1973D);
        int i = this.f1995u - this.f1985k;
        int i2 = (thumbOffset + this.f1994t) - this.f1985k;
        return f > ((float) i2) && f < ((float) ((((this.f1993s + i2) + this.f1973D.left) + this.f1973D.right) + this.f1985k)) && f2 > ((float) i) && f2 < ((float) (this.f1997w + this.f1985k));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        this.f1988n.addMovement(motionEvent);
        switch (C0427t.m12599a(motionEvent)) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (isEnabled() && m11378a(x, y)) {
                    this.f1984j = 1;
                    this.f1986l = x;
                    this.f1987m = y;
                    break;
                }
                break;
            case 1:
            case 3:
                if (this.f1984j == 2) {
                    m11367b(motionEvent);
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f1984j = 0;
                this.f1988n.clear();
                break;
            case 2:
                switch (this.f1984j) {
                    case 2:
                        float x2 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f2 = x2 - this.f1986l;
                        if (thumbScrollRange != 0) {
                            f = f2 / thumbScrollRange;
                        } else {
                            f = f2 > 0.0f ? 1.0f : -1.0f;
                        }
                        if (C0730ad.m11259a(this)) {
                            f = -f;
                        }
                        float m11377a = m11377a(f + this.f1990p, 0.0f, 1.0f);
                        if (m11377a != this.f1990p) {
                            this.f1986l = x2;
                            setThumbPosition(m11377a);
                        }
                        return true;
                    case 1:
                        float x3 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x3 - this.f1986l) > this.f1985k || Math.abs(y2 - this.f1987m) > this.f1985k) {
                            this.f1984j = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f1986l = x3;
                            this.f1987m = y2;
                            return true;
                        }
                        break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m11370a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: b */
    private void m11367b(MotionEvent motionEvent) {
        boolean z = true;
        this.f1984j = 0;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.f1988n.computeCurrentVelocity(1000);
            float xVelocity = this.f1988n.getXVelocity();
            if (Math.abs(xVelocity) > this.f1989o) {
                if (C0730ad.m11259a(this)) {
                    if (xVelocity >= 0.0f) {
                        z = false;
                    }
                } else if (xVelocity <= 0.0f) {
                    z = false;
                }
            } else {
                z = getTargetCheckedState();
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m11370a(motionEvent);
    }

    /* renamed from: a */
    private void m11368a(final boolean z) {
        if (this.f1972C != null) {
            m11379a();
        }
        this.f1972C = new C0715a(this.f1990p, z ? 1.0f : 0.0f);
        this.f1972C.setDuration(250L);
        this.f1972C.setAnimationListener(new Animation.AnimationListener() { // from class: android.support.v7.widget.SwitchCompat.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (SwitchCompat.this.f1972C == animation) {
                    SwitchCompat.this.setThumbPosition(z ? 1.0f : 0.0f);
                    SwitchCompat.this.f1972C = null;
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }
        });
        startAnimation(this.f1972C);
    }

    /* renamed from: a */
    private void m11379a() {
        if (this.f1972C != null) {
            clearAnimation();
            this.f1972C = null;
        }
    }

    private boolean getTargetCheckedState() {
        return this.f1990p > 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThumbPosition(float f) {
        this.f1990p = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() != null && C0309ai.m12883x(this) && isShown()) {
            m11368a(isChecked);
            return;
        }
        m11379a();
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9 = 0;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1975a != null) {
            Rect rect = this.f1973D;
            if (this.f1976b != null) {
                this.f1976b.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m11124a = C0755o.m11124a(this.f1975a);
            i5 = Math.max(0, m11124a.left - rect.left);
            i9 = Math.max(0, m11124a.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0730ad.m11259a(this)) {
            int paddingLeft = getPaddingLeft() + i5;
            i7 = ((this.f1991q + paddingLeft) - i5) - i9;
            i6 = paddingLeft;
        } else {
            int width = (getWidth() - getPaddingRight()) - i9;
            i6 = i9 + i5 + (width - this.f1991q);
            i7 = width;
        }
        switch (getGravity() & 112) {
            case 16:
                i8 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (this.f1992r / 2);
                height = this.f1992r + i8;
                break;
            case 80:
                height = getHeight() - getPaddingBottom();
                i8 = height - this.f1992r;
                break;
            default:
                i8 = getPaddingTop();
                height = this.f1992r + i8;
                break;
        }
        this.f1994t = i6;
        this.f1995u = i8;
        this.f1997w = height;
        this.f1996v = i7;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        int i3;
        Rect rect2 = this.f1973D;
        int i4 = this.f1994t;
        int i5 = this.f1995u;
        int i6 = this.f1996v;
        int i7 = this.f1997w;
        int thumbOffset = i4 + getThumbOffset();
        if (this.f1975a != null) {
            rect = C0755o.m11124a(this.f1975a);
        } else {
            rect = C0755o.f2168a;
        }
        if (this.f1976b != null) {
            this.f1976b.getPadding(rect2);
            int i8 = rect2.left + thumbOffset;
            if (rect != null) {
                if (rect.left > rect2.left) {
                    i4 += rect.left - rect2.left;
                }
                i3 = rect.top > rect2.top ? (rect.top - rect2.top) + i5 : i5;
                if (rect.right > rect2.right) {
                    i6 -= rect.right - rect2.right;
                }
                i2 = rect.bottom > rect2.bottom ? i7 - (rect.bottom - rect2.bottom) : i7;
            } else {
                i2 = i7;
                i3 = i5;
            }
            this.f1976b.setBounds(i4, i3, i6, i2);
            i = i8;
        } else {
            i = thumbOffset;
        }
        if (this.f1975a != null) {
            this.f1975a.getPadding(rect2);
            int i9 = i - rect2.left;
            int i10 = i + this.f1993s + rect2.right;
            this.f1975a.setBounds(i9, i5, i10, i7);
            Drawable background = getBackground();
            if (background != null) {
                C0021a.m13861a(background, i9, i5, i10, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f1973D;
        Drawable drawable = this.f1976b;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f1995u;
        int i2 = this.f1997w;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f1975a;
        if (drawable != null) {
            if (this.f1980f && drawable2 != null) {
                Rect m11124a = C0755o.m11124a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m11124a.left;
                rect.right -= m11124a.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f2000z : this.f1970A;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            if (this.f1999y != null) {
                this.f1998x.setColor(this.f1999y.getColorForState(drawableState, 0));
            }
            this.f1998x.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.right + bounds.left;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C0730ad.m11259a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1991q;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f1979e;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C0730ad.m11259a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1991q;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f1979e;
        }
        return compoundPaddingRight;
    }

    private int getThumbOffset() {
        float f;
        if (C0730ad.m11259a(this)) {
            f = 1.0f - this.f1990p;
        } else {
            f = this.f1990p;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        if (this.f1976b != null) {
            Rect rect2 = this.f1973D;
            this.f1976b.getPadding(rect2);
            if (this.f1975a != null) {
                rect = C0755o.m11124a(this.f1975a);
            } else {
                rect = C0755o.f2168a;
            }
            return ((((this.f1991q - this.f1993s) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f1969F);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        if (this.f1975a != null) {
            this.f1975a.setState(drawableState);
        }
        if (this.f1976b != null) {
            this.f1976b.setState(drawableState);
        }
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        if (this.f1975a != null) {
            C0021a.m13863a(this.f1975a, f, f2);
        }
        if (this.f1976b != null) {
            C0021a.m13863a(this.f1976b, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1975a || drawable == this.f1976b;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        if (Build.VERSION.SDK_INT >= 11) {
            super.jumpDrawablesToCurrentState();
            if (this.f1975a != null) {
                this.f1975a.jumpToCurrentState();
            }
            if (this.f1976b != null) {
                this.f1976b.jumpToCurrentState();
            }
            m11379a();
            setThumbPosition(isChecked() ? 1.0f : 0.0f);
        }
    }

    @Override // android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            CharSequence charSequence = isChecked() ? this.f1981g : this.f1982h;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text).append(' ').append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    /* renamed from: a */
    private static float m11377a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.SwitchCompat$a */
    /* loaded from: classes.dex */
    public class C0715a extends Animation {

        /* renamed from: a */
        final float f2003a;

        /* renamed from: b */
        final float f2004b;

        /* renamed from: c */
        final float f2005c;

        private C0715a(float f, float f2) {
            this.f2003a = f;
            this.f2004b = f2;
            this.f2005c = f2 - f;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f, Transformation transformation) {
            SwitchCompat.this.setThumbPosition(this.f2003a + (this.f2005c * f));
        }
    }
}
