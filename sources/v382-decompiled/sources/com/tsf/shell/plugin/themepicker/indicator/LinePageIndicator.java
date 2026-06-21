package com.tsf.shell.plugin.themepicker.indicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bc;
import android.support.v4.view.bn;
import android.support.v4.view.w;
import android.util.AttributeSet;
import android.util.FloatMath;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tsf.shell.plugin.themepicker.i;
import com.tsf.shell.plugin.themepicker.j;
import com.tsf.shell.plugin.themepicker.k;
import com.tsf.shell.plugin.themepicker.l;
import com.tsf.shell.plugin.themepicker.s;

/* loaded from: classes.dex */
public class LinePageIndicator extends View implements c {
    private final Paint a;
    private final Paint b;
    private ViewPager c;
    private bn d;
    private int e;
    private boolean f;
    private float g;
    private float h;
    private int i;
    private float j;
    private int k;
    private boolean l;

    public LinePageIndicator(Context context) {
        this(context, null);
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.vpiLinePageIndicatorStyle);
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.j = -1.0f;
        this.k = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(k.default_line_indicator_selected_color);
            int color2 = resources.getColor(k.default_line_indicator_unselected_color);
            float dimension = resources.getDimension(l.default_line_indicator_line_width);
            float dimension2 = resources.getDimension(l.default_line_indicator_gap_width);
            float dimension3 = resources.getDimension(l.default_line_indicator_stroke_width);
            boolean z = resources.getBoolean(j.default_line_indicator_centered);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.LinePageIndicator, i, 0);
            this.f = obtainStyledAttributes.getBoolean(s.LinePageIndicator_centered, z);
            this.g = obtainStyledAttributes.getDimension(s.LinePageIndicator_lineWidth, dimension);
            this.h = obtainStyledAttributes.getDimension(s.LinePageIndicator_gapWidth, dimension2);
            setStrokeWidth(obtainStyledAttributes.getDimension(s.LinePageIndicator_strokeWidth, dimension3));
            this.a.setColor(obtainStyledAttributes.getColor(s.LinePageIndicator_unselectedColor, color2));
            this.b.setColor(obtainStyledAttributes.getColor(s.LinePageIndicator_selectedColor, color));
            Drawable drawable = obtainStyledAttributes.getDrawable(s.LinePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.i = bc.a(ViewConfiguration.get(context));
        }
    }

    public void setCentered(boolean z) {
        this.f = z;
        invalidate();
    }

    public void setUnselectedColor(int i) {
        this.a.setColor(i);
        invalidate();
    }

    public int getUnselectedColor() {
        return this.a.getColor();
    }

    public void setSelectedColor(int i) {
        this.b.setColor(i);
        invalidate();
    }

    public int getSelectedColor() {
        return this.b.getColor();
    }

    public void setLineWidth(float f) {
        this.g = f;
        invalidate();
    }

    public float getLineWidth() {
        return this.g;
    }

    public void setStrokeWidth(float f) {
        this.b.setStrokeWidth(f);
        this.a.setStrokeWidth(f);
        invalidate();
    }

    public float getStrokeWidth() {
        return this.b.getStrokeWidth();
    }

    public void setGapWidth(float f) {
        this.h = f;
        invalidate();
    }

    public float getGapWidth() {
        return this.h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int b;
        super.onDraw(canvas);
        if (this.c != null && (b = this.c.getAdapter().b()) != 0) {
            if (this.e >= b) {
                setCurrentItem(b - 1);
                return;
            }
            float f = this.g + this.h;
            float f2 = (b * f) - this.h;
            float paddingTop = getPaddingTop();
            float paddingLeft = getPaddingLeft();
            float height = paddingTop + (((getHeight() - paddingTop) - getPaddingBottom()) / 2.0f);
            float width = this.f ? paddingLeft + ((((getWidth() - paddingLeft) - getPaddingRight()) / 2.0f) - (f2 / 2.0f)) : paddingLeft;
            int i = 0;
            while (i < b) {
                float f3 = width + (i * f);
                canvas.drawLine(f3, height, f3 + this.g, height, i == this.e ? this.b : this.a);
                i++;
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (this.c == null || this.c.getAdapter().b() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case 0:
                this.k = w.b(motionEvent, 0);
                this.j = motionEvent.getX();
                return true;
            case 1:
            case 3:
                if (!this.l) {
                    int b = this.c.getAdapter().b();
                    int width = getWidth();
                    float f = width / 2.0f;
                    float f2 = width / 6.0f;
                    if (this.e > 0 && motionEvent.getX() < f - f2) {
                        if (action == 3) {
                            return true;
                        }
                        this.c.setCurrentItem(this.e - 1);
                        return true;
                    }
                    if (this.e < b - 1 && motionEvent.getX() > f2 + f) {
                        if (action == 3) {
                            return true;
                        }
                        this.c.setCurrentItem(this.e + 1);
                        return true;
                    }
                }
                this.l = false;
                this.k = -1;
                if (!this.c.f()) {
                    return true;
                }
                this.c.e();
                return true;
            case 2:
                float c = w.c(motionEvent, w.a(motionEvent, this.k));
                float f3 = c - this.j;
                if (!this.l && Math.abs(f3) > this.i) {
                    this.l = true;
                }
                if (!this.l) {
                    return true;
                }
                this.j = c;
                if (!this.c.f() && !this.c.d()) {
                    return true;
                }
                this.c.b(f3);
                return true;
            case 4:
            default:
                return true;
            case 5:
                int b2 = w.b(motionEvent);
                this.j = w.c(motionEvent, b2);
                this.k = w.b(motionEvent, b2);
                return true;
            case 6:
                int b3 = w.b(motionEvent);
                if (w.b(motionEvent, b3) == this.k) {
                    this.k = w.b(motionEvent, b3 == 0 ? 1 : 0);
                }
                this.j = w.c(motionEvent, w.a(motionEvent, this.k));
                return true;
        }
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.c != viewPager) {
            if (this.c != null) {
                this.c.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.c = viewPager;
            this.c.setOnPageChangeListener(this);
            invalidate();
        }
    }

    public void setCurrentItem(int i) {
        if (this.c == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.c.setCurrentItem(i);
        this.e = i;
        invalidate();
    }

    @Override // android.support.v4.view.bn
    public void b_(int i) {
        if (this.d != null) {
            this.d.b_(i);
        }
    }

    @Override // android.support.v4.view.bn
    public void a(int i, float f, int i2) {
        if (this.d != null) {
            this.d.a(i, f, i2);
        }
    }

    @Override // android.support.v4.view.bn
    public void a_(int i) {
        this.e = i;
        invalidate();
        if (this.d != null) {
            this.d.a_(i);
        }
    }

    public void setOnPageChangeListener(bn bnVar) {
        this.d = bnVar;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(a(i), d(i2));
    }

    private int a(int i) {
        float f;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || this.c == null) {
            f = size;
        } else {
            f = ((r0 - 1) * this.h) + getPaddingLeft() + getPaddingRight() + (this.c.getAdapter().b() * this.g);
            if (mode == Integer.MIN_VALUE) {
                f = Math.min(f, size);
            }
        }
        return (int) FloatMath.ceil(f);
    }

    private int d(int i) {
        float strokeWidth;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            strokeWidth = size;
        } else {
            strokeWidth = this.b.getStrokeWidth() + getPaddingTop() + getPaddingBottom();
            if (mode == Integer.MIN_VALUE) {
                strokeWidth = Math.min(strokeWidth, size);
            }
        }
        return (int) FloatMath.ceil(strokeWidth);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.e = savedState.a;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.e;
        return savedState;
    }

    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.tsf.shell.plugin.themepicker.indicator.LinePageIndicator.SavedState.1
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
}
