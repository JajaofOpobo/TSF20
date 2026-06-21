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
import android.support.v4.view.ViewPager;
import android.support.v4.view.bc;
import android.support.v4.view.bn;
import android.support.v4.view.w;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tsf.shell.plugin.themepicker.i;
import com.tsf.shell.plugin.themepicker.j;
import com.tsf.shell.plugin.themepicker.k;
import com.tsf.shell.plugin.themepicker.l;
import com.tsf.shell.plugin.themepicker.o;
import com.tsf.shell.plugin.themepicker.s;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class TitlePageIndicator extends View implements c {
    private static /* synthetic */ int[] B;
    private h A;
    private ViewPager a;
    private bn b;
    private int c;
    private float d;
    private int e;
    private final Paint f;
    private boolean g;
    private int h;
    private int i;
    private Path j;
    private final Rect k;
    private final Paint l;
    private f m;
    private g n;
    private final Paint o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private int w;
    private float x;
    private int y;
    private boolean z;

    static /* synthetic */ int[] a() {
        int[] iArr = B;
        if (iArr == null) {
            iArr = new int[f.valuesCustom().length];
            try {
                iArr[f.None.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[f.Triangle.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[f.Underline.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            B = iArr;
        }
        return iArr;
    }

    public TitlePageIndicator(Context context) {
        this(context, null);
    }

    public TitlePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.vpiTitlePageIndicatorStyle);
    }

    public TitlePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = -1;
        this.f = new Paint();
        this.j = new Path();
        this.k = new Rect();
        this.l = new Paint();
        this.o = new Paint();
        this.x = -1.0f;
        this.y = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(k.default_title_indicator_footer_color);
            float dimension = resources.getDimension(l.default_title_indicator_footer_line_height);
            int integer = resources.getInteger(o.default_title_indicator_footer_indicator_style);
            float dimension2 = resources.getDimension(l.default_title_indicator_footer_indicator_height);
            float dimension3 = resources.getDimension(l.default_title_indicator_footer_indicator_underline_padding);
            float dimension4 = resources.getDimension(l.default_title_indicator_footer_padding);
            int integer2 = resources.getInteger(o.default_title_indicator_line_position);
            int color2 = resources.getColor(k.default_title_indicator_selected_color);
            boolean z = resources.getBoolean(j.default_title_indicator_selected_bold);
            int color3 = resources.getColor(k.default_title_indicator_text_color);
            float dimension5 = resources.getDimension(l.default_title_indicator_text_size);
            float dimension6 = resources.getDimension(l.default_title_indicator_title_padding);
            float dimension7 = resources.getDimension(l.default_title_indicator_clip_padding);
            float dimension8 = resources.getDimension(l.default_title_indicator_top_padding);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.TitlePageIndicator, i, 0);
            this.v = obtainStyledAttributes.getDimension(s.TitlePageIndicator_footerLineHeight, dimension);
            this.m = f.a(obtainStyledAttributes.getInteger(s.TitlePageIndicator_footerIndicatorStyle, integer));
            this.p = obtainStyledAttributes.getDimension(s.TitlePageIndicator_footerIndicatorHeight, dimension2);
            this.q = obtainStyledAttributes.getDimension(s.TitlePageIndicator_footerIndicatorUnderlinePadding, dimension3);
            this.r = obtainStyledAttributes.getDimension(s.TitlePageIndicator_footerPadding, dimension4);
            this.n = g.a(obtainStyledAttributes.getInteger(s.TitlePageIndicator_linePosition, integer2));
            this.t = obtainStyledAttributes.getDimension(s.TitlePageIndicator_topPadding, dimension8);
            this.s = obtainStyledAttributes.getDimension(s.TitlePageIndicator_titlePadding, dimension6);
            this.u = obtainStyledAttributes.getDimension(s.TitlePageIndicator_clipPadding, dimension7);
            this.i = obtainStyledAttributes.getColor(s.TitlePageIndicator_selectedColor, color2);
            this.h = obtainStyledAttributes.getColor(s.TitlePageIndicator_android_textColor, color3);
            this.g = obtainStyledAttributes.getBoolean(s.TitlePageIndicator_selectedBold, z);
            float dimension9 = obtainStyledAttributes.getDimension(s.TitlePageIndicator_android_textSize, dimension5);
            int color4 = obtainStyledAttributes.getColor(s.TitlePageIndicator_footerColor, color);
            this.f.setTextSize(dimension9);
            this.f.setAntiAlias(true);
            this.l.setStyle(Paint.Style.FILL_AND_STROKE);
            this.l.setStrokeWidth(this.v);
            this.l.setColor(color4);
            this.o.setStyle(Paint.Style.FILL_AND_STROKE);
            this.o.setColor(color4);
            Drawable drawable = obtainStyledAttributes.getDrawable(s.TitlePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.w = bc.a(ViewConfiguration.get(context));
        }
    }

    public int getFooterColor() {
        return this.l.getColor();
    }

    public void setFooterColor(int i) {
        this.l.setColor(i);
        this.o.setColor(i);
        invalidate();
    }

    public float getFooterLineHeight() {
        return this.v;
    }

    public void setFooterLineHeight(float f) {
        this.v = f;
        this.l.setStrokeWidth(this.v);
        invalidate();
    }

    public float getFooterIndicatorHeight() {
        return this.p;
    }

    public void setFooterIndicatorHeight(float f) {
        this.p = f;
        invalidate();
    }

    public float getFooterIndicatorPadding() {
        return this.r;
    }

    public void setFooterIndicatorPadding(float f) {
        this.r = f;
        invalidate();
    }

    public f getFooterIndicatorStyle() {
        return this.m;
    }

    public void setFooterIndicatorStyle(f fVar) {
        this.m = fVar;
        invalidate();
    }

    public g getLinePosition() {
        return this.n;
    }

    public void setLinePosition(g gVar) {
        this.n = gVar;
        invalidate();
    }

    public int getSelectedColor() {
        return this.i;
    }

    public void setSelectedColor(int i) {
        this.i = i;
        invalidate();
    }

    public void setSelectedBold(boolean z) {
        this.g = z;
        invalidate();
    }

    public int getTextColor() {
        return this.h;
    }

    public void setTextColor(int i) {
        this.f.setColor(i);
        this.h = i;
        invalidate();
    }

    public float getTextSize() {
        return this.f.getTextSize();
    }

    public void setTextSize(float f) {
        this.f.setTextSize(f);
        invalidate();
    }

    public float getTitlePadding() {
        return this.s;
    }

    public void setTitlePadding(float f) {
        this.s = f;
        invalidate();
    }

    public float getTopPadding() {
        return this.t;
    }

    public void setTopPadding(float f) {
        this.t = f;
        invalidate();
    }

    public float getClipPadding() {
        return this.u;
    }

    public void setClipPadding(float f) {
        this.u = f;
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.f.setTypeface(typeface);
        invalidate();
    }

    public Typeface getTypeface() {
        return this.f.getTypeface();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int b;
        int i;
        float f;
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.a != null && (b = this.a.getAdapter().b()) != 0) {
            if (this.c == -1 && this.a != null) {
                this.c = this.a.getCurrentItem();
            }
            ArrayList a = a(this.f);
            int size = a.size();
            if (this.c >= size) {
                setCurrentItem(size - 1);
                return;
            }
            int i3 = b - 1;
            float width = getWidth() / 2.0f;
            float f4 = 0.0f + this.u;
            int width2 = getWidth();
            int height = getHeight();
            int i4 = width2 + 0;
            float f5 = i4 - this.u;
            int i5 = this.c;
            if (this.d <= 0.5d) {
                i = i5;
                f = this.d;
            } else {
                i = i5 + 1;
                f = 1.0f - this.d;
            }
            boolean z = f <= 0.25f;
            boolean z2 = f <= 0.05f;
            float f6 = (0.25f - f) / 0.25f;
            Rect rect = (Rect) a.get(this.c);
            float f7 = rect.right - rect.left;
            if (rect.left < f4) {
                b(rect, f7, 0);
            }
            if (rect.right > f5) {
                a(rect, f7, i4);
            }
            if (this.c > 0) {
                for (int i6 = this.c - 1; i6 >= 0; i6--) {
                    Rect rect2 = (Rect) a.get(i6);
                    if (rect2.left < f4) {
                        int i7 = rect2.right - rect2.left;
                        b(rect2, i7, 0);
                        Rect rect3 = (Rect) a.get(i6 + 1);
                        if (rect2.right + this.s > rect3.left) {
                            rect2.left = (int) ((rect3.left - i7) - this.s);
                            rect2.right = rect2.left + i7;
                        }
                    }
                }
            }
            if (this.c < i3) {
                int i8 = this.c + 1;
                while (true) {
                    int i9 = i8;
                    if (i9 >= b) {
                        break;
                    }
                    Rect rect4 = (Rect) a.get(i9);
                    if (rect4.right > f5) {
                        int i10 = rect4.right - rect4.left;
                        a(rect4, i10, i4);
                        Rect rect5 = (Rect) a.get(i9 - 1);
                        if (rect4.left - this.s < rect5.right) {
                            rect4.left = (int) (rect5.right + this.s);
                            rect4.right = rect4.left + i10;
                        }
                    }
                    i8 = i9 + 1;
                }
            }
            int i11 = this.h >>> 24;
            int i12 = 0;
            while (true) {
                int i13 = i12;
                if (i13 >= b) {
                    break;
                }
                Rect rect6 = (Rect) a.get(i13);
                if ((rect6.left > 0 && rect6.left < i4) || (rect6.right > 0 && rect6.right < i4)) {
                    boolean z3 = i13 == i;
                    CharSequence a2 = a(i13);
                    this.f.setFakeBoldText(z3 && z2 && this.g);
                    this.f.setColor(this.h);
                    if (z3 && z) {
                        this.f.setAlpha(i11 - ((int) (i11 * f6)));
                    }
                    if (i13 < size - 1) {
                        Rect rect7 = (Rect) a.get(i13 + 1);
                        if (rect6.right + this.s > rect7.left) {
                            int i14 = rect6.right - rect6.left;
                            rect6.left = (int) ((rect7.left - i14) - this.s);
                            rect6.right = rect6.left + i14;
                        }
                    }
                    canvas.drawText(a2, 0, a2.length(), rect6.left, this.t + rect6.bottom, this.f);
                    if (z3 && z) {
                        this.f.setColor(this.i);
                        this.f.setAlpha((int) ((this.i >>> 24) * f6));
                        canvas.drawText(a2, 0, a2.length(), rect6.left, this.t + rect6.bottom, this.f);
                    }
                }
                i12 = i13 + 1;
            }
            float f8 = this.v;
            float f9 = this.p;
            if (this.n == g.Top) {
                i2 = 0;
                float f10 = -f9;
                f3 = -f8;
                f2 = f10;
            } else {
                i2 = height;
                f2 = f9;
                f3 = f8;
            }
            this.j.reset();
            this.j.moveTo(0.0f, i2 - (f3 / 2.0f));
            this.j.lineTo(width2, i2 - (f3 / 2.0f));
            this.j.close();
            canvas.drawPath(this.j, this.l);
            float f11 = i2 - f3;
            switch (a()[this.m.ordinal()]) {
                case 2:
                    this.j.reset();
                    this.j.moveTo(width, f11 - f2);
                    this.j.lineTo(width + f2, f11);
                    this.j.lineTo(width - f2, f11);
                    this.j.close();
                    canvas.drawPath(this.j, this.o);
                    break;
                case 3:
                    if (z && i < size) {
                        Rect rect8 = (Rect) a.get(i);
                        float f12 = rect8.right + this.q;
                        float f13 = rect8.left - this.q;
                        float f14 = f11 - f2;
                        this.j.reset();
                        this.j.moveTo(f13, f11);
                        this.j.lineTo(f12, f11);
                        this.j.lineTo(f12, f14);
                        this.j.lineTo(f13, f14);
                        this.j.close();
                        this.o.setAlpha((int) (255.0f * f6));
                        canvas.drawPath(this.j, this.o);
                        this.o.setAlpha(255);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (this.a == null || this.a.getAdapter().b() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case 0:
                this.y = w.b(motionEvent, 0);
                this.x = motionEvent.getX();
                return true;
            case 1:
            case 3:
                if (!this.z) {
                    int b = this.a.getAdapter().b();
                    int width = getWidth();
                    float f = width / 2.0f;
                    float f2 = width / 6.0f;
                    float f3 = f - f2;
                    float f4 = f2 + f;
                    float x = motionEvent.getX();
                    if (x < f3) {
                        if (this.c > 0) {
                            if (action == 3) {
                                return true;
                            }
                            this.a.setCurrentItem(this.c - 1);
                            return true;
                        }
                    } else if (x > f4) {
                        if (this.c < b - 1) {
                            if (action == 3) {
                                return true;
                            }
                            this.a.setCurrentItem(this.c + 1);
                            return true;
                        }
                    } else if (this.A != null && action != 3) {
                        this.A.a(this.c);
                    }
                }
                this.z = false;
                this.y = -1;
                if (!this.a.f()) {
                    return true;
                }
                this.a.e();
                return true;
            case 2:
                float c = w.c(motionEvent, w.a(motionEvent, this.y));
                float f5 = c - this.x;
                if (!this.z && Math.abs(f5) > this.w) {
                    this.z = true;
                }
                if (!this.z) {
                    return true;
                }
                this.x = c;
                if (!this.a.f() && !this.a.d()) {
                    return true;
                }
                this.a.b(f5);
                return true;
            case 4:
            default:
                return true;
            case 5:
                int b2 = w.b(motionEvent);
                this.x = w.c(motionEvent, b2);
                this.y = w.b(motionEvent, b2);
                return true;
            case 6:
                int b3 = w.b(motionEvent);
                if (w.b(motionEvent, b3) == this.y) {
                    this.y = w.b(motionEvent, b3 == 0 ? 1 : 0);
                }
                this.x = w.c(motionEvent, w.a(motionEvent, this.y));
                return true;
        }
    }

    private void a(Rect rect, float f, int i) {
        rect.right = (int) (i - this.u);
        rect.left = (int) (rect.right - f);
    }

    private void b(Rect rect, float f, int i) {
        rect.left = (int) (i + this.u);
        rect.right = (int) (this.u + f);
    }

    private ArrayList a(Paint paint) {
        ArrayList arrayList = new ArrayList();
        int b = this.a.getAdapter().b();
        int width = getWidth();
        int i = width / 2;
        for (int i2 = 0; i2 < b; i2++) {
            Rect a = a(i2, paint);
            int i3 = a.right - a.left;
            int i4 = a.bottom - a.top;
            a.left = (int) ((i - (i3 / 2.0f)) + (((i2 - this.c) - this.d) * width));
            a.right = i3 + a.left;
            a.top = 0;
            a.bottom = i4;
            arrayList.add(a);
        }
        return arrayList;
    }

    private Rect a(int i, Paint paint) {
        Rect rect = new Rect();
        CharSequence a = a(i);
        rect.right = (int) paint.measureText(a, 0, a.length());
        rect.bottom = (int) (paint.descent() - paint.ascent());
        return rect;
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.a != viewPager) {
            if (this.a != null) {
                this.a.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.a = viewPager;
            this.a.setOnPageChangeListener(this);
            invalidate();
        }
    }

    public void setOnCenterItemClickListener(h hVar) {
        this.A = hVar;
    }

    public void setCurrentItem(int i) {
        if (this.a == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.a.setCurrentItem(i);
        this.c = i;
        invalidate();
    }

    @Override // android.support.v4.view.bn
    public void b_(int i) {
        this.e = i;
        if (this.b != null) {
            this.b.b_(i);
        }
    }

    @Override // android.support.v4.view.bn
    public void a(int i, float f, int i2) {
        this.c = i;
        this.d = f;
        invalidate();
        if (this.b != null) {
            this.b.a(i, f, i2);
        }
    }

    @Override // android.support.v4.view.bn
    public void a_(int i) {
        if (this.e == 0) {
            this.c = i;
            invalidate();
        }
        if (this.b != null) {
            this.b.a_(i);
        }
    }

    public void setOnPageChangeListener(bn bnVar) {
        this.b = bnVar;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            f = View.MeasureSpec.getSize(i2);
        } else {
            this.k.setEmpty();
            this.k.bottom = (int) (this.f.descent() - this.f.ascent());
            f = (this.k.bottom - this.k.top) + this.v + this.r + this.t;
            if (this.m != f.None) {
                f += this.p;
            }
        }
        setMeasuredDimension(size, (int) f);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.c = savedState.a;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.c;
        return savedState;
    }

    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.tsf.shell.plugin.themepicker.indicator.TitlePageIndicator.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* synthetic */ SavedState(Parcel parcel, SavedState savedState) {
            this(parcel);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }
    }

    private CharSequence a(int i) {
        CharSequence c = this.a.getAdapter().c(i);
        if (c == null) {
            return "";
        }
        return c;
    }
}
