package com.tsf.shell.plugin.themepicker.indicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v4.view.C0335au;
import android.support.p002v4.view.C0427t;
import android.support.p002v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tsf.shell.plugin.themepicker.C3852f;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class TitlePageIndicator extends View implements InterfaceC3895c {

    /* renamed from: A */
    private InterfaceC3892c f12743A;

    /* renamed from: a */
    private ViewPager f12744a;

    /* renamed from: b */
    private ViewPager.InterfaceC0245e f12745b;

    /* renamed from: c */
    private int f12746c;

    /* renamed from: d */
    private float f12747d;

    /* renamed from: e */
    private int f12748e;

    /* renamed from: f */
    private final Paint f12749f;

    /* renamed from: g */
    private boolean f12750g;

    /* renamed from: h */
    private int f12751h;

    /* renamed from: i */
    private int f12752i;

    /* renamed from: j */
    private Path f12753j;

    /* renamed from: k */
    private final Rect f12754k;

    /* renamed from: l */
    private final Paint f12755l;

    /* renamed from: m */
    private EnumC3890a f12756m;

    /* renamed from: n */
    private EnumC3891b f12757n;

    /* renamed from: o */
    private final Paint f12758o;

    /* renamed from: p */
    private float f12759p;

    /* renamed from: q */
    private float f12760q;

    /* renamed from: r */
    private float f12761r;

    /* renamed from: s */
    private float f12762s;

    /* renamed from: t */
    private float f12763t;

    /* renamed from: u */
    private float f12764u;

    /* renamed from: v */
    private float f12765v;

    /* renamed from: w */
    private int f12766w;

    /* renamed from: x */
    private float f12767x;

    /* renamed from: y */
    private int f12768y;

    /* renamed from: z */
    private boolean f12769z;

    /* renamed from: com.tsf.shell.plugin.themepicker.indicator.TitlePageIndicator$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3892c {
        /* renamed from: a */
        void m1245a(int i);
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.indicator.TitlePageIndicator$a */
    /* loaded from: classes.dex */
    public enum EnumC3890a {
        None(0),
        Triangle(1),
        Underline(2);
        

        /* renamed from: d */
        public final int f12776d;

        EnumC3890a(int i) {
            this.f12776d = i;
        }

        /* renamed from: a */
        public static EnumC3890a m1247a(int i) {
            EnumC3890a[] values;
            for (EnumC3890a enumC3890a : values()) {
                if (enumC3890a.f12776d == i) {
                    return enumC3890a;
                }
            }
            return null;
        }
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.indicator.TitlePageIndicator$b */
    /* loaded from: classes.dex */
    public enum EnumC3891b {
        Bottom(0),
        Top(1);
        

        /* renamed from: c */
        public final int f12780c;

        EnumC3891b(int i) {
            this.f12780c = i;
        }

        /* renamed from: a */
        public static EnumC3891b m1246a(int i) {
            EnumC3891b[] values;
            for (EnumC3891b enumC3891b : values()) {
                if (enumC3891b.f12780c == i) {
                    return enumC3891b;
                }
            }
            return null;
        }
    }

    public TitlePageIndicator(Context context) {
        this(context, null);
    }

    public TitlePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3852f.C3853a.vpiTitlePageIndicatorStyle);
    }

    public TitlePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12746c = -1;
        this.f12749f = new Paint();
        this.f12753j = new Path();
        this.f12754k = new Rect();
        this.f12755l = new Paint();
        this.f12758o = new Paint();
        this.f12767x = -1.0f;
        this.f12768y = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(C3852f.C3855c.default_title_indicator_footer_color);
            float dimension = resources.getDimension(C3852f.C3856d.default_title_indicator_footer_line_height);
            int integer = resources.getInteger(C3852f.C3859g.default_title_indicator_footer_indicator_style);
            float dimension2 = resources.getDimension(C3852f.C3856d.default_title_indicator_footer_indicator_height);
            float dimension3 = resources.getDimension(C3852f.C3856d.default_title_indicator_footer_indicator_underline_padding);
            float dimension4 = resources.getDimension(C3852f.C3856d.default_title_indicator_footer_padding);
            int integer2 = resources.getInteger(C3852f.C3859g.default_title_indicator_line_position);
            int color2 = resources.getColor(C3852f.C3855c.default_title_indicator_selected_color);
            boolean z = resources.getBoolean(C3852f.C3854b.default_title_indicator_selected_bold);
            int color3 = resources.getColor(C3852f.C3855c.default_title_indicator_text_color);
            float dimension5 = resources.getDimension(C3852f.C3856d.default_title_indicator_text_size);
            float dimension6 = resources.getDimension(C3852f.C3856d.default_title_indicator_title_padding);
            float dimension7 = resources.getDimension(C3852f.C3856d.default_title_indicator_clip_padding);
            float dimension8 = resources.getDimension(C3852f.C3856d.default_title_indicator_top_padding);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3852f.C3863k.TitlePageIndicator, i, 0);
            this.f12765v = obtainStyledAttributes.getDimension(C3852f.C3863k.TitlePageIndicator_footerLineHeight, dimension);
            this.f12756m = EnumC3890a.m1247a(obtainStyledAttributes.getInteger(C3852f.C3863k.TitlePageIndicator_footerIndicatorStyle, integer));
            this.f12759p = obtainStyledAttributes.getDimension(C3852f.C3863k.TitlePageIndicator_footerIndicatorHeight, dimension2);
            this.f12760q = obtainStyledAttributes.getDimension(C3852f.C3863k.TitlePageIndicator_footerIndicatorUnderlinePadding, dimension3);
            this.f12761r = obtainStyledAttributes.getDimension(C3852f.C3863k.TitlePageIndicator_footerPadding, dimension4);
            this.f12757n = EnumC3891b.m1246a(obtainStyledAttributes.getInteger(C3852f.C3863k.TitlePageIndicator_linePosition, integer2));
            this.f12763t = obtainStyledAttributes.getDimension(C3852f.C3863k.TitlePageIndicator_topPadding, dimension8);
            this.f12762s = obtainStyledAttributes.getDimension(C3852f.C3863k.TitlePageIndicator_titlePadding, dimension6);
            this.f12764u = obtainStyledAttributes.getDimension(C3852f.C3863k.TitlePageIndicator_clipPadding, dimension7);
            this.f12752i = obtainStyledAttributes.getColor(C3852f.C3863k.TitlePageIndicator_selectedColor, color2);
            this.f12751h = obtainStyledAttributes.getColor(C3852f.C3863k.TitlePageIndicator_android_textColor, color3);
            this.f12750g = obtainStyledAttributes.getBoolean(C3852f.C3863k.TitlePageIndicator_selectedBold, z);
            float dimension9 = obtainStyledAttributes.getDimension(C3852f.C3863k.TitlePageIndicator_android_textSize, dimension5);
            int color4 = obtainStyledAttributes.getColor(C3852f.C3863k.TitlePageIndicator_footerColor, color);
            this.f12749f.setTextSize(dimension9);
            this.f12749f.setAntiAlias(true);
            this.f12755l.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f12755l.setStrokeWidth(this.f12765v);
            this.f12755l.setColor(color4);
            this.f12758o.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f12758o.setColor(color4);
            Drawable drawable = obtainStyledAttributes.getDrawable(C3852f.C3863k.TitlePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.f12766w = C0335au.m12757a(ViewConfiguration.get(context));
        }
    }

    public int getFooterColor() {
        return this.f12755l.getColor();
    }

    public void setFooterColor(int i) {
        this.f12755l.setColor(i);
        this.f12758o.setColor(i);
        invalidate();
    }

    public float getFooterLineHeight() {
        return this.f12765v;
    }

    public void setFooterLineHeight(float f) {
        this.f12765v = f;
        this.f12755l.setStrokeWidth(this.f12765v);
        invalidate();
    }

    public float getFooterIndicatorHeight() {
        return this.f12759p;
    }

    public void setFooterIndicatorHeight(float f) {
        this.f12759p = f;
        invalidate();
    }

    public float getFooterIndicatorPadding() {
        return this.f12761r;
    }

    public void setFooterIndicatorPadding(float f) {
        this.f12761r = f;
        invalidate();
    }

    public EnumC3890a getFooterIndicatorStyle() {
        return this.f12756m;
    }

    public void setFooterIndicatorStyle(EnumC3890a enumC3890a) {
        this.f12756m = enumC3890a;
        invalidate();
    }

    public EnumC3891b getLinePosition() {
        return this.f12757n;
    }

    public void setLinePosition(EnumC3891b enumC3891b) {
        this.f12757n = enumC3891b;
        invalidate();
    }

    public int getSelectedColor() {
        return this.f12752i;
    }

    public void setSelectedColor(int i) {
        this.f12752i = i;
        invalidate();
    }

    public void setSelectedBold(boolean z) {
        this.f12750g = z;
        invalidate();
    }

    public int getTextColor() {
        return this.f12751h;
    }

    public void setTextColor(int i) {
        this.f12749f.setColor(i);
        this.f12751h = i;
        invalidate();
    }

    public float getTextSize() {
        return this.f12749f.getTextSize();
    }

    public void setTextSize(float f) {
        this.f12749f.setTextSize(f);
        invalidate();
    }

    public float getTitlePadding() {
        return this.f12762s;
    }

    public void setTitlePadding(float f) {
        this.f12762s = f;
        invalidate();
    }

    public float getTopPadding() {
        return this.f12763t;
    }

    public void setTopPadding(float f) {
        this.f12763t = f;
        invalidate();
    }

    public float getClipPadding() {
        return this.f12764u;
    }

    public void setClipPadding(float f) {
        this.f12764u = f;
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.f12749f.setTypeface(typeface);
        invalidate();
    }

    public Typeface getTypeface() {
        return this.f12749f.getTypeface();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int mo938b;
        int i;
        float f;
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f12744a != null && (mo938b = this.f12744a.getAdapter().mo938b()) != 0) {
            if (this.f12746c == -1 && this.f12744a != null) {
                this.f12746c = this.f12744a.getCurrentItem();
            }
            ArrayList<Rect> m1253a = m1253a(this.f12749f);
            int size = m1253a.size();
            if (this.f12746c >= size) {
                setCurrentItem(size - 1);
                return;
            }
            int i3 = mo938b - 1;
            float width = getWidth() / 2.0f;
            float f4 = 0.0f + this.f12764u;
            int width2 = getWidth();
            int height = getHeight();
            int i4 = width2 + 0;
            float f5 = i4 - this.f12764u;
            int i5 = this.f12746c;
            if (this.f12747d <= 0.5d) {
                i = i5;
                f = this.f12747d;
            } else {
                i = i5 + 1;
                f = 1.0f - this.f12747d;
            }
            boolean z = f <= 0.25f;
            boolean z2 = f <= 0.05f;
            float f6 = (0.25f - f) / 0.25f;
            Rect rect = m1253a.get(this.f12746c);
            float f7 = rect.right - rect.left;
            if (rect.left < f4) {
                m1251b(rect, f7, 0);
            }
            if (rect.right > f5) {
                m1252a(rect, f7, i4);
            }
            if (this.f12746c > 0) {
                for (int i6 = this.f12746c - 1; i6 >= 0; i6--) {
                    Rect rect2 = m1253a.get(i6);
                    if (rect2.left < f4) {
                        int i7 = rect2.right - rect2.left;
                        m1251b(rect2, i7, 0);
                        Rect rect3 = m1253a.get(i6 + 1);
                        if (rect2.right + this.f12762s > rect3.left) {
                            rect2.left = (int) ((rect3.left - i7) - this.f12762s);
                            rect2.right = rect2.left + i7;
                        }
                    }
                }
            }
            if (this.f12746c < i3) {
                int i8 = this.f12746c + 1;
                while (true) {
                    int i9 = i8;
                    if (i9 >= mo938b) {
                        break;
                    }
                    Rect rect4 = m1253a.get(i9);
                    if (rect4.right > f5) {
                        int i10 = rect4.right - rect4.left;
                        m1252a(rect4, i10, i4);
                        Rect rect5 = m1253a.get(i9 - 1);
                        if (rect4.left - this.f12762s < rect5.right) {
                            rect4.left = (int) (rect5.right + this.f12762s);
                            rect4.right = rect4.left + i10;
                        }
                    }
                    i8 = i9 + 1;
                }
            }
            int i11 = this.f12751h >>> 24;
            int i12 = 0;
            while (true) {
                int i13 = i12;
                if (i13 >= mo938b) {
                    break;
                }
                Rect rect6 = m1253a.get(i13);
                if ((rect6.left > 0 && rect6.left < i4) || (rect6.right > 0 && rect6.right < i4)) {
                    boolean z3 = i13 == i;
                    CharSequence m1250c = m1250c(i13);
                    this.f12749f.setFakeBoldText(z3 && z2 && this.f12750g);
                    this.f12749f.setColor(this.f12751h);
                    if (z3 && z) {
                        this.f12749f.setAlpha(i11 - ((int) (i11 * f6)));
                    }
                    if (i13 < size - 1) {
                        Rect rect7 = m1253a.get(i13 + 1);
                        if (rect6.right + this.f12762s > rect7.left) {
                            int i14 = rect6.right - rect6.left;
                            rect6.left = (int) ((rect7.left - i14) - this.f12762s);
                            rect6.right = rect6.left + i14;
                        }
                    }
                    canvas.drawText(m1250c, 0, m1250c.length(), rect6.left, this.f12763t + rect6.bottom, this.f12749f);
                    if (z3 && z) {
                        this.f12749f.setColor(this.f12752i);
                        this.f12749f.setAlpha((int) ((this.f12752i >>> 24) * f6));
                        canvas.drawText(m1250c, 0, m1250c.length(), rect6.left, this.f12763t + rect6.bottom, this.f12749f);
                    }
                }
                i12 = i13 + 1;
            }
            float f8 = this.f12765v;
            float f9 = this.f12759p;
            if (this.f12757n == EnumC3891b.Top) {
                i2 = 0;
                float f10 = -f9;
                f3 = -f8;
                f2 = f10;
            } else {
                i2 = height;
                f2 = f9;
                f3 = f8;
            }
            this.f12753j.reset();
            this.f12753j.moveTo(0.0f, i2 - (f3 / 2.0f));
            this.f12753j.lineTo(width2, i2 - (f3 / 2.0f));
            this.f12753j.close();
            canvas.drawPath(this.f12753j, this.f12755l);
            float f11 = i2 - f3;
            switch (this.f12756m) {
                case Triangle:
                    this.f12753j.reset();
                    this.f12753j.moveTo(width, f11 - f2);
                    this.f12753j.lineTo(width + f2, f11);
                    this.f12753j.lineTo(width - f2, f11);
                    this.f12753j.close();
                    canvas.drawPath(this.f12753j, this.f12758o);
                    return;
                case Underline:
                    if (z && i < size) {
                        Rect rect8 = m1253a.get(i);
                        float f12 = rect8.right + this.f12760q;
                        float f13 = rect8.left - this.f12760q;
                        float f14 = f11 - f2;
                        this.f12753j.reset();
                        this.f12753j.moveTo(f13, f11);
                        this.f12753j.lineTo(f12, f11);
                        this.f12753j.lineTo(f12, f14);
                        this.f12753j.lineTo(f13, f14);
                        this.f12753j.close();
                        this.f12758o.setAlpha((int) (255.0f * f6));
                        canvas.drawPath(this.f12753j, this.f12758o);
                        this.f12758o.setAlpha(255);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (this.f12744a == null || this.f12744a.getAdapter().mo938b() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case 0:
                this.f12768y = C0427t.m12596b(motionEvent, 0);
                this.f12767x = motionEvent.getX();
                return true;
            case 1:
            case 3:
                if (!this.f12769z) {
                    int mo938b = this.f12744a.getAdapter().mo938b();
                    int width = getWidth();
                    float f = width / 2.0f;
                    float f2 = width / 6.0f;
                    float f3 = f - f2;
                    float f4 = f2 + f;
                    float x = motionEvent.getX();
                    if (x < f3) {
                        if (this.f12746c > 0) {
                            if (action != 3) {
                                this.f12744a.setCurrentItem(this.f12746c - 1);
                                return true;
                            }
                            return true;
                        }
                    } else if (x > f4) {
                        if (this.f12746c < mo938b - 1) {
                            if (action != 3) {
                                this.f12744a.setCurrentItem(this.f12746c + 1);
                                return true;
                            }
                            return true;
                        }
                    } else if (this.f12743A != null && action != 3) {
                        this.f12743A.m1245a(this.f12746c);
                    }
                }
                this.f12769z = false;
                this.f12768y = -1;
                if (this.f12744a.m13165f()) {
                    this.f12744a.m13167e();
                    return true;
                }
                return true;
            case 2:
                float m12594c = C0427t.m12594c(motionEvent, C0427t.m12598a(motionEvent, this.f12768y));
                float f5 = m12594c - this.f12767x;
                if (!this.f12769z && Math.abs(f5) > this.f12766w) {
                    this.f12769z = true;
                }
                if (this.f12769z) {
                    this.f12767x = m12594c;
                    if (this.f12744a.m13165f() || this.f12744a.m13169d()) {
                        this.f12744a.m13179b(f5);
                        return true;
                    }
                    return true;
                }
                return true;
            case 4:
            default:
                return true;
            case 5:
                int m12597b = C0427t.m12597b(motionEvent);
                this.f12767x = C0427t.m12594c(motionEvent, m12597b);
                this.f12768y = C0427t.m12596b(motionEvent, m12597b);
                return true;
            case 6:
                int m12597b2 = C0427t.m12597b(motionEvent);
                if (C0427t.m12596b(motionEvent, m12597b2) == this.f12768y) {
                    this.f12768y = C0427t.m12596b(motionEvent, m12597b2 == 0 ? 1 : 0);
                }
                this.f12767x = C0427t.m12594c(motionEvent, C0427t.m12598a(motionEvent, this.f12768y));
                return true;
        }
    }

    /* renamed from: a */
    private void m1252a(Rect rect, float f, int i) {
        rect.right = (int) (i - this.f12764u);
        rect.left = (int) (rect.right - f);
    }

    /* renamed from: b */
    private void m1251b(Rect rect, float f, int i) {
        rect.left = (int) (i + this.f12764u);
        rect.right = (int) (this.f12764u + f);
    }

    /* renamed from: a */
    private ArrayList<Rect> m1253a(Paint paint) {
        ArrayList<Rect> arrayList = new ArrayList<>();
        int mo938b = this.f12744a.getAdapter().mo938b();
        int width = getWidth();
        int i = width / 2;
        for (int i2 = 0; i2 < mo938b; i2++) {
            Rect m1254a = m1254a(i2, paint);
            int i3 = m1254a.right - m1254a.left;
            int i4 = m1254a.bottom - m1254a.top;
            m1254a.left = (int) ((i - (i3 / 2.0f)) + (((i2 - this.f12746c) - this.f12747d) * width));
            m1254a.right = i3 + m1254a.left;
            m1254a.top = 0;
            m1254a.bottom = i4;
            arrayList.add(m1254a);
        }
        return arrayList;
    }

    /* renamed from: a */
    private Rect m1254a(int i, Paint paint) {
        Rect rect = new Rect();
        CharSequence m1250c = m1250c(i);
        rect.right = (int) paint.measureText(m1250c, 0, m1250c.length());
        rect.bottom = (int) (paint.descent() - paint.ascent());
        return rect;
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f12744a != viewPager) {
            if (this.f12744a != null) {
                this.f12744a.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.f12744a = viewPager;
            this.f12744a.setOnPageChangeListener(this);
            invalidate();
        }
    }

    public void setOnCenterItemClickListener(InterfaceC3892c interfaceC3892c) {
        this.f12743A = interfaceC3892c;
    }

    public void setCurrentItem(int i) {
        if (this.f12744a == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f12744a.setCurrentItem(i);
        this.f12746c = i;
        invalidate();
    }

    @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
    /* renamed from: c_ */
    public void mo936c_(int i) {
        this.f12748e = i;
        if (this.f12745b != null) {
            this.f12745b.mo936c_(i);
        }
    }

    @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
    /* renamed from: a */
    public void mo940a(int i, float f, int i2) {
        this.f12746c = i;
        this.f12747d = f;
        invalidate();
        if (this.f12745b != null) {
            this.f12745b.mo940a(i, f, i2);
        }
    }

    @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
    /* renamed from: b_ */
    public void mo937b_(int i) {
        if (this.f12748e == 0) {
            this.f12746c = i;
            invalidate();
        }
        if (this.f12745b != null) {
            this.f12745b.mo937b_(i);
        }
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC0245e interfaceC0245e) {
        this.f12745b = interfaceC0245e;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            f = View.MeasureSpec.getSize(i2);
        } else {
            this.f12754k.setEmpty();
            this.f12754k.bottom = (int) (this.f12749f.descent() - this.f12749f.ascent());
            f = (this.f12754k.bottom - this.f12754k.top) + this.f12765v + this.f12761r + this.f12763t;
            if (this.f12756m != EnumC3890a.None) {
                f += this.f12759p;
            }
        }
        setMeasuredDimension(size, (int) f);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f12746c = savedState.f12771a;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12771a = this.f12746c;
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.tsf.shell.plugin.themepicker.indicator.TitlePageIndicator.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        int f12771a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f12771a = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12771a);
        }
    }

    /* renamed from: c */
    private CharSequence m1250c(int i) {
        CharSequence mo989c = this.f12744a.getAdapter().mo989c(i);
        if (mo989c == null) {
            return "";
        }
        return mo989c;
    }
}
