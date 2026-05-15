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
import android.support.v4.view.au;
import android.support.v4.view.t;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tsf.shell.plugin.themepicker.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class LinePageIndicator extends View implements c {
    private final Paint a;
    private final Paint b;
    private ViewPager c;
    private ViewPager.e d;
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
        this(context, attributeSet, f.a.vpiLinePageIndicatorStyle);
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.j = -1.0f;
        this.k = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(f.c.default_line_indicator_selected_color);
            int color2 = resources.getColor(f.c.default_line_indicator_unselected_color);
            float dimension = resources.getDimension(f.d.default_line_indicator_line_width);
            float dimension2 = resources.getDimension(f.d.default_line_indicator_gap_width);
            float dimension3 = resources.getDimension(f.d.default_line_indicator_stroke_width);
            boolean z = resources.getBoolean(f.b.default_line_indicator_centered);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.k.LinePageIndicator, i, 0);
            this.f = typedArrayObtainStyledAttributes.getBoolean(f.k.LinePageIndicator_centered, z);
            this.g = typedArrayObtainStyledAttributes.getDimension(f.k.LinePageIndicator_lineWidth, dimension);
            this.h = typedArrayObtainStyledAttributes.getDimension(f.k.LinePageIndicator_gapWidth, dimension2);
            setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(f.k.LinePageIndicator_strokeWidth, dimension3));
            this.a.setColor(typedArrayObtainStyledAttributes.getColor(f.k.LinePageIndicator_unselectedColor, color2));
            this.b.setColor(typedArrayObtainStyledAttributes.getColor(f.k.LinePageIndicator_selectedColor, color));
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(f.k.LinePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            typedArrayObtainStyledAttributes.recycle();
            this.i = au.a(ViewConfiguration.get(context));
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
        int iB;
        super.onDraw(canvas);
        if (this.c != null && (iB = this.c.getAdapter().b()) != 0) {
            if (this.e >= iB) {
                setCurrentItem(iB - 1);
                return;
            }
            float f = this.g + this.h;
            float f2 = (iB * f) - this.h;
            float paddingTop = getPaddingTop();
            float paddingLeft = getPaddingLeft();
            float height = paddingTop + (((getHeight() - paddingTop) - getPaddingBottom()) / 2.0f);
            float width = this.f ? paddingLeft + ((((getWidth() - paddingLeft) - getPaddingRight()) / 2.0f) - (f2 / 2.0f)) : paddingLeft;
            int i = 0;
            while (i < iB) {
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
                this.k = t.b(motionEvent, 0);
                this.j = motionEvent.getX();
                return true;
            case 1:
            case 3:
                if (!this.l) {
                    int iB = this.c.getAdapter().b();
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
                    if (this.e < iB - 1 && motionEvent.getX() > f2 + f) {
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
                float fC = t.c(motionEvent, t.a(motionEvent, this.k));
                float f3 = fC - this.j;
                if (!this.l && Math.abs(f3) > this.i) {
                    this.l = true;
                }
                if (!this.l) {
                    return true;
                }
                this.j = fC;
                if (!this.c.f() && !this.c.d()) {
                    return true;
                }
                this.c.b(f3);
                return true;
            case 4:
            default:
                return true;
            case 5:
                int iB2 = t.b(motionEvent);
                this.j = t.c(motionEvent, iB2);
                this.k = t.b(motionEvent, iB2);
                return true;
            case 6:
                int iB3 = t.b(motionEvent);
                if (t.b(motionEvent, iB3) == this.k) {
                    this.k = t.b(motionEvent, iB3 == 0 ? 1 : 0);
                }
                this.j = t.c(motionEvent, t.a(motionEvent, this.k));
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

    @Override // android.support.v4.view.ViewPager.e
    public void c_(int i) {
        if (this.d != null) {
            this.d.c_(i);
        }
    }

    @Override // android.support.v4.view.ViewPager.e
    public void a(int i, float f, int i2) {
        if (this.d != null) {
            this.d.a(i, f, i2);
        }
    }

    @Override // android.support.v4.view.ViewPager.e
    public void b_(int i) {
        this.e = i;
        invalidate();
        if (this.d != null) {
            this.d.b_(i);
        }
    }

    public void setOnPageChangeListener(ViewPager.e eVar) {
        this.d = eVar;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(c(i), d(i2));
    }

    private int c(int i) {
        float paddingLeft;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || this.c == null) {
            paddingLeft = size;
        } else {
            paddingLeft = ((r0 - 1) * this.h) + getPaddingLeft() + getPaddingRight() + (this.c.getAdapter().b() * this.g);
            if (mode == Integer.MIN_VALUE) {
                paddingLeft = Math.min(paddingLeft, size);
            }
        }
        return (int) Math.ceil(paddingLeft);
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
        return (int) Math.ceil(strokeWidth);
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

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.tsf.shell.plugin.themepicker.indicator.LinePageIndicator.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
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
