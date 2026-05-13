package com.tsf.shell.plugin.themepicker.indicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
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
/* loaded from: classes.dex */
public class LinePageIndicator extends View implements InterfaceC3895c {

    /* renamed from: a */
    private final Paint f12716a;

    /* renamed from: b */
    private final Paint f12717b;

    /* renamed from: c */
    private ViewPager f12718c;

    /* renamed from: d */
    private ViewPager.InterfaceC0245e f12719d;

    /* renamed from: e */
    private int f12720e;

    /* renamed from: f */
    private boolean f12721f;

    /* renamed from: g */
    private float f12722g;

    /* renamed from: h */
    private float f12723h;

    /* renamed from: i */
    private int f12724i;

    /* renamed from: j */
    private float f12725j;

    /* renamed from: k */
    private int f12726k;

    /* renamed from: l */
    private boolean f12727l;

    public LinePageIndicator(Context context) {
        this(context, null);
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3852f.C3853a.vpiLinePageIndicatorStyle);
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12716a = new Paint(1);
        this.f12717b = new Paint(1);
        this.f12725j = -1.0f;
        this.f12726k = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(C3852f.C3855c.default_line_indicator_selected_color);
            int color2 = resources.getColor(C3852f.C3855c.default_line_indicator_unselected_color);
            float dimension = resources.getDimension(C3852f.C3856d.default_line_indicator_line_width);
            float dimension2 = resources.getDimension(C3852f.C3856d.default_line_indicator_gap_width);
            float dimension3 = resources.getDimension(C3852f.C3856d.default_line_indicator_stroke_width);
            boolean z = resources.getBoolean(C3852f.C3854b.default_line_indicator_centered);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3852f.C3863k.LinePageIndicator, i, 0);
            this.f12721f = obtainStyledAttributes.getBoolean(C3852f.C3863k.LinePageIndicator_centered, z);
            this.f12722g = obtainStyledAttributes.getDimension(C3852f.C3863k.LinePageIndicator_lineWidth, dimension);
            this.f12723h = obtainStyledAttributes.getDimension(C3852f.C3863k.LinePageIndicator_gapWidth, dimension2);
            setStrokeWidth(obtainStyledAttributes.getDimension(C3852f.C3863k.LinePageIndicator_strokeWidth, dimension3));
            this.f12716a.setColor(obtainStyledAttributes.getColor(C3852f.C3863k.LinePageIndicator_unselectedColor, color2));
            this.f12717b.setColor(obtainStyledAttributes.getColor(C3852f.C3863k.LinePageIndicator_selectedColor, color));
            Drawable drawable = obtainStyledAttributes.getDrawable(C3852f.C3863k.LinePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.f12724i = C0335au.m12757a(ViewConfiguration.get(context));
        }
    }

    public void setCentered(boolean z) {
        this.f12721f = z;
        invalidate();
    }

    public void setUnselectedColor(int i) {
        this.f12716a.setColor(i);
        invalidate();
    }

    public int getUnselectedColor() {
        return this.f12716a.getColor();
    }

    public void setSelectedColor(int i) {
        this.f12717b.setColor(i);
        invalidate();
    }

    public int getSelectedColor() {
        return this.f12717b.getColor();
    }

    public void setLineWidth(float f) {
        this.f12722g = f;
        invalidate();
    }

    public float getLineWidth() {
        return this.f12722g;
    }

    public void setStrokeWidth(float f) {
        this.f12717b.setStrokeWidth(f);
        this.f12716a.setStrokeWidth(f);
        invalidate();
    }

    public float getStrokeWidth() {
        return this.f12717b.getStrokeWidth();
    }

    public void setGapWidth(float f) {
        this.f12723h = f;
        invalidate();
    }

    public float getGapWidth() {
        return this.f12723h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int mo938b;
        super.onDraw(canvas);
        if (this.f12718c != null && (mo938b = this.f12718c.getAdapter().mo938b()) != 0) {
            if (this.f12720e >= mo938b) {
                setCurrentItem(mo938b - 1);
                return;
            }
            float f = this.f12722g + this.f12723h;
            float f2 = (mo938b * f) - this.f12723h;
            float paddingTop = getPaddingTop();
            float paddingLeft = getPaddingLeft();
            float height = paddingTop + (((getHeight() - paddingTop) - getPaddingBottom()) / 2.0f);
            float width = this.f12721f ? paddingLeft + ((((getWidth() - paddingLeft) - getPaddingRight()) / 2.0f) - (f2 / 2.0f)) : paddingLeft;
            int i = 0;
            while (i < mo938b) {
                float f3 = width + (i * f);
                canvas.drawLine(f3, height, f3 + this.f12722g, height, i == this.f12720e ? this.f12717b : this.f12716a);
                i++;
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (this.f12718c == null || this.f12718c.getAdapter().mo938b() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case 0:
                this.f12726k = C0427t.m12596b(motionEvent, 0);
                this.f12725j = motionEvent.getX();
                return true;
            case 1:
            case 3:
                if (!this.f12727l) {
                    int mo938b = this.f12718c.getAdapter().mo938b();
                    int width = getWidth();
                    float f = width / 2.0f;
                    float f2 = width / 6.0f;
                    if (this.f12720e > 0 && motionEvent.getX() < f - f2) {
                        if (action != 3) {
                            this.f12718c.setCurrentItem(this.f12720e - 1);
                            return true;
                        }
                        return true;
                    } else if (this.f12720e < mo938b - 1 && motionEvent.getX() > f2 + f) {
                        if (action != 3) {
                            this.f12718c.setCurrentItem(this.f12720e + 1);
                            return true;
                        }
                        return true;
                    }
                }
                this.f12727l = false;
                this.f12726k = -1;
                if (this.f12718c.m13165f()) {
                    this.f12718c.m13167e();
                    return true;
                }
                return true;
            case 2:
                float m12594c = C0427t.m12594c(motionEvent, C0427t.m12598a(motionEvent, this.f12726k));
                float f3 = m12594c - this.f12725j;
                if (!this.f12727l && Math.abs(f3) > this.f12724i) {
                    this.f12727l = true;
                }
                if (this.f12727l) {
                    this.f12725j = m12594c;
                    if (this.f12718c.m13165f() || this.f12718c.m13169d()) {
                        this.f12718c.m13179b(f3);
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
                this.f12725j = C0427t.m12594c(motionEvent, m12597b);
                this.f12726k = C0427t.m12596b(motionEvent, m12597b);
                return true;
            case 6:
                int m12597b2 = C0427t.m12597b(motionEvent);
                if (C0427t.m12596b(motionEvent, m12597b2) == this.f12726k) {
                    this.f12726k = C0427t.m12596b(motionEvent, m12597b2 == 0 ? 1 : 0);
                }
                this.f12725j = C0427t.m12594c(motionEvent, C0427t.m12598a(motionEvent, this.f12726k));
                return true;
        }
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f12718c != viewPager) {
            if (this.f12718c != null) {
                this.f12718c.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.f12718c = viewPager;
            this.f12718c.setOnPageChangeListener(this);
            invalidate();
        }
    }

    public void setCurrentItem(int i) {
        if (this.f12718c == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f12718c.setCurrentItem(i);
        this.f12720e = i;
        invalidate();
    }

    @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
    /* renamed from: c_ */
    public void mo936c_(int i) {
        if (this.f12719d != null) {
            this.f12719d.mo936c_(i);
        }
    }

    @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
    /* renamed from: a */
    public void mo940a(int i, float f, int i2) {
        if (this.f12719d != null) {
            this.f12719d.mo940a(i, f, i2);
        }
    }

    @Override // android.support.p002v4.view.ViewPager.InterfaceC0245e
    /* renamed from: b_ */
    public void mo937b_(int i) {
        this.f12720e = i;
        invalidate();
        if (this.f12719d != null) {
            this.f12719d.mo937b_(i);
        }
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC0245e interfaceC0245e) {
        this.f12719d = interfaceC0245e;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(m1268c(i), m1267d(i2));
    }

    /* renamed from: c */
    private int m1268c(int i) {
        float f;
        int mo938b;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || this.f12718c == null) {
            f = size;
        } else {
            f = ((mo938b - 1) * this.f12723h) + getPaddingLeft() + getPaddingRight() + (this.f12718c.getAdapter().mo938b() * this.f12722g);
            if (mode == Integer.MIN_VALUE) {
                f = Math.min(f, size);
            }
        }
        return (int) Math.ceil(f);
    }

    /* renamed from: d */
    private int m1267d(int i) {
        float strokeWidth;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            strokeWidth = size;
        } else {
            strokeWidth = this.f12717b.getStrokeWidth() + getPaddingTop() + getPaddingBottom();
            if (mode == Integer.MIN_VALUE) {
                strokeWidth = Math.min(strokeWidth, size);
            }
        }
        return (int) Math.ceil(strokeWidth);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f12720e = savedState.f12728a;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12728a = this.f12720e;
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.tsf.shell.plugin.themepicker.indicator.LinePageIndicator.SavedState.1
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
        int f12728a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f12728a = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12728a);
        }
    }
}
