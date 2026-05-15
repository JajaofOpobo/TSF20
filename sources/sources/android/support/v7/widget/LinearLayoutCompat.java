package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.ai;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private int[] i;
    private int[] j;
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private int o;

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        aa aaVarA = aa.a(context, attributeSet, a.k.LinearLayoutCompat, i, 0);
        int iA = aaVarA.a(a.k.LinearLayoutCompat_android_orientation, -1);
        if (iA >= 0) {
            setOrientation(iA);
        }
        int iA2 = aaVarA.a(a.k.LinearLayoutCompat_android_gravity, -1);
        if (iA2 >= 0) {
            setGravity(iA2);
        }
        boolean zA = aaVarA.a(a.k.LinearLayoutCompat_android_baselineAligned, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.g = aaVarA.a(a.k.LinearLayoutCompat_android_weightSum, -1.0f);
        this.b = aaVarA.a(a.k.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.h = aaVarA.a(a.k.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(aaVarA.a(a.k.LinearLayoutCompat_divider));
        this.n = aaVarA.a(a.k.LinearLayoutCompat_showDividers, 0);
        this.o = aaVarA.e(a.k.LinearLayoutCompat_dividerPadding, 0);
        aaVarA.a();
    }

    public void setShowDividers(int i) {
        if (i != this.n) {
            requestLayout();
        }
        this.n = i;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getShowDividers() {
        return this.n;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.k) {
            this.k = drawable;
            if (drawable != null) {
                this.l = drawable.getIntrinsicWidth();
                this.m = drawable.getIntrinsicHeight();
            } else {
                this.l = 0;
                this.m = 0;
            }
            setWillNotDraw(drawable == null);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.o = i;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.l;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.k != null) {
            if (this.d == 1) {
                a(canvas);
            } else {
                b(canvas);
            }
        }
    }

    void a(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View viewB = b(i);
            if (viewB != null && viewB.getVisibility() != 8 && c(i)) {
                a(canvas, (viewB.getTop() - ((LayoutParams) viewB.getLayoutParams()).topMargin) - this.m);
            }
        }
        if (c(virtualChildCount)) {
            View viewB2 = b(virtualChildCount - 1);
            if (viewB2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.m;
            } else {
                bottom = ((LayoutParams) viewB2.getLayoutParams()).bottomMargin + viewB2.getBottom();
            }
            a(canvas, bottom);
        }
    }

    void b(Canvas canvas) {
        int right;
        int left;
        int virtualChildCount = getVirtualChildCount();
        boolean zA = ad.a(this);
        for (int i = 0; i < virtualChildCount; i++) {
            View viewB = b(i);
            if (viewB != null && viewB.getVisibility() != 8 && c(i)) {
                LayoutParams layoutParams = (LayoutParams) viewB.getLayoutParams();
                if (zA) {
                    left = layoutParams.rightMargin + viewB.getRight();
                } else {
                    left = (viewB.getLeft() - layoutParams.leftMargin) - this.l;
                }
                b(canvas, left);
            }
        }
        if (c(virtualChildCount)) {
            View viewB2 = b(virtualChildCount - 1);
            if (viewB2 == null) {
                if (zA) {
                    right = getPaddingLeft();
                } else {
                    right = (getWidth() - getPaddingRight()) - this.l;
                }
            } else {
                LayoutParams layoutParams2 = (LayoutParams) viewB2.getLayoutParams();
                if (zA) {
                    right = (viewB2.getLeft() - layoutParams2.leftMargin) - this.l;
                } else {
                    right = layoutParams2.rightMargin + viewB2.getRight();
                }
            }
            b(canvas, right);
        }
    }

    void a(Canvas canvas, int i) {
        this.k.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.k.draw(canvas);
    }

    void b(Canvas canvas, int i) {
        this.k.setBounds(i, getPaddingTop() + this.o, this.l + i, (getHeight() - getPaddingBottom()) - this.o);
        this.k.draw(canvas);
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.h = z;
    }

    @Override // android.view.View
    public int getBaseline() {
        int bottom;
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.b);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b != 0) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            return -1;
        }
        int i2 = this.c;
        if (this.d == 1 && (i = this.e & 112) != 48) {
            switch (i) {
                case 16:
                    bottom = i2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2);
                    break;
                case 80:
                    bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
                    break;
                default:
                    bottom = i2;
                    break;
            }
        } else {
            bottom = i2;
        }
        return ((LayoutParams) childAt.getLayoutParams()).topMargin + bottom + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.b = i;
    }

    View b(int i) {
        return getChildAt(i);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.g;
    }

    public void setWeightSum(float f) {
        this.g = Math.max(0.0f, f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.d == 1) {
            a(i, i2);
        } else {
            b(i, i2);
        }
    }

    protected boolean c(int i) {
        if (i == 0) {
            return (this.n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.n & 4) != 0;
        }
        if ((this.n & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    void a(int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        int iA;
        boolean z;
        int i6;
        int i7;
        int i8;
        int iA2;
        boolean z2;
        boolean z3;
        int iMax;
        int iMax2;
        boolean z4;
        int i9;
        int i10;
        int i11;
        this.f = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z5 = true;
        float f2 = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean z6 = false;
        boolean z7 = false;
        int i16 = this.b;
        boolean z8 = this.h;
        int iMax3 = Integer.MIN_VALUE;
        int iA3 = 0;
        while (iA3 < virtualChildCount) {
            View viewB = b(iA3);
            if (viewB == null) {
                this.f += d(iA3);
                i10 = iMax3;
                z4 = z7;
                z3 = z5;
                i11 = i13;
                i9 = i12;
            } else if (viewB.getVisibility() == 8) {
                iA3 += a(viewB, iA3);
                i10 = iMax3;
                z4 = z7;
                z3 = z5;
                i11 = i13;
                i9 = i12;
            } else {
                if (c(iA3)) {
                    this.f += this.m;
                }
                LayoutParams layoutParams = (LayoutParams) viewB.getLayoutParams();
                float f3 = f2 + layoutParams.g;
                if (mode2 == 1073741824 && layoutParams.height == 0 && layoutParams.g > 0.0f) {
                    int i17 = this.f;
                    this.f = Math.max(i17, layoutParams.topMargin + i17 + layoutParams.bottomMargin);
                    z7 = true;
                } else {
                    int i18 = Integer.MIN_VALUE;
                    if (layoutParams.height == 0 && layoutParams.g > 0.0f) {
                        i18 = 0;
                        layoutParams.height = -2;
                    }
                    int i19 = i18;
                    a(viewB, iA3, i, 0, i2, f3 == 0.0f ? this.f : 0);
                    if (i19 != Integer.MIN_VALUE) {
                        layoutParams.height = i19;
                    }
                    int measuredHeight = viewB.getMeasuredHeight();
                    int i20 = this.f;
                    this.f = Math.max(i20, i20 + measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin + b(viewB));
                    if (z8) {
                        iMax3 = Math.max(measuredHeight, iMax3);
                    }
                }
                if (i16 >= 0 && i16 == iA3 + 1) {
                    this.c = this.f;
                }
                if (iA3 < i16 && layoutParams.g > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                boolean z9 = false;
                if (mode == 1073741824 || layoutParams.width != -1) {
                    z2 = z6;
                } else {
                    z2 = true;
                    z9 = true;
                }
                int i21 = layoutParams.rightMargin + layoutParams.leftMargin;
                int measuredWidth = viewB.getMeasuredWidth() + i21;
                int iMax4 = Math.max(i12, measuredWidth);
                int iA4 = ad.a(i13, ai.i(viewB));
                z3 = z5 && layoutParams.width == -1;
                if (layoutParams.g > 0.0f) {
                    iMax2 = Math.max(i15, z9 ? i21 : measuredWidth);
                    iMax = i14;
                } else {
                    if (!z9) {
                        i21 = measuredWidth;
                    }
                    iMax = Math.max(i14, i21);
                    iMax2 = i15;
                }
                iA3 += a(viewB, iA3);
                z4 = z7;
                i15 = iMax2;
                i14 = iMax;
                i9 = iMax4;
                i10 = iMax3;
                i11 = iA4;
                z6 = z2;
                f2 = f3;
            }
            iA3++;
            iMax3 = i10;
            z7 = z4;
            z5 = z3;
            i13 = i11;
            i12 = i9;
        }
        if (this.f > 0 && c(virtualChildCount)) {
            this.f += this.m;
        }
        if (z8 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.f = 0;
            int i22 = 0;
            while (i22 < virtualChildCount) {
                View viewB2 = b(i22);
                if (viewB2 == null) {
                    this.f += d(i22);
                    iA2 = i22;
                } else if (viewB2.getVisibility() == 8) {
                    iA2 = a(viewB2, i22) + i22;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) viewB2.getLayoutParams();
                    int i23 = this.f;
                    this.f = Math.max(i23, layoutParams2.bottomMargin + i23 + iMax3 + layoutParams2.topMargin + b(viewB2));
                    iA2 = i22;
                }
                i22 = iA2 + 1;
            }
        }
        this.f += getPaddingTop() + getPaddingBottom();
        int iA5 = ai.a(Math.max(this.f, getSuggestedMinimumHeight()), i2, 0);
        int i24 = (16777215 & iA5) - this.f;
        if (z7 || (i24 != 0 && f2 > 0.0f)) {
            if (this.g > 0.0f) {
                f2 = this.g;
            }
            this.f = 0;
            int i25 = 0;
            float f4 = f2;
            boolean z10 = z5;
            int i26 = i14;
            int i27 = i13;
            int i28 = i12;
            int i29 = i24;
            while (i25 < virtualChildCount) {
                View viewB3 = b(i25);
                if (viewB3.getVisibility() == 8) {
                    i6 = i26;
                    i8 = i27;
                    i7 = i28;
                    z = z10;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) viewB3.getLayoutParams();
                    float f5 = layoutParams3.g;
                    if (f5 > 0.0f) {
                        int i30 = (int) ((i29 * f5) / f4);
                        float f6 = f4 - f5;
                        int i31 = i29 - i30;
                        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams3.leftMargin + layoutParams3.rightMargin, layoutParams3.width);
                        if (layoutParams3.height != 0 || mode2 != 1073741824) {
                            int measuredHeight2 = i30 + viewB3.getMeasuredHeight();
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            viewB3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
                        } else {
                            if (i30 <= 0) {
                                i30 = 0;
                            }
                            viewB3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i30, 1073741824));
                        }
                        i5 = i31;
                        iA = ad.a(i27, ai.i(viewB3) & (-256));
                        f = f6;
                    } else {
                        f = f4;
                        i5 = i29;
                        iA = i27;
                    }
                    int i32 = layoutParams3.leftMargin + layoutParams3.rightMargin;
                    int measuredWidth2 = viewB3.getMeasuredWidth() + i32;
                    int iMax5 = Math.max(i28, measuredWidth2);
                    if (!(mode != 1073741824 && layoutParams3.width == -1)) {
                        i32 = measuredWidth2;
                    }
                    int iMax6 = Math.max(i26, i32);
                    z = z10 && layoutParams3.width == -1;
                    int i33 = this.f;
                    this.f = Math.max(i33, layoutParams3.bottomMargin + viewB3.getMeasuredHeight() + i33 + layoutParams3.topMargin + b(viewB3));
                    i6 = iMax6;
                    i7 = iMax5;
                    float f7 = f;
                    i8 = iA;
                    i29 = i5;
                    f4 = f7;
                }
                i25++;
                i26 = i6;
                i28 = i7;
                z10 = z;
                i27 = i8;
            }
            this.f += getPaddingTop() + getPaddingBottom();
            z5 = z10;
            i3 = i26;
            i13 = i27;
            i4 = i28;
        } else {
            int iMax7 = Math.max(i14, i15);
            if (z8 && mode2 != 1073741824) {
                int i34 = 0;
                while (true) {
                    int i35 = i34;
                    if (i35 >= virtualChildCount) {
                        break;
                    }
                    View viewB4 = b(i35);
                    if (viewB4 != null && viewB4.getVisibility() != 8 && ((LayoutParams) viewB4.getLayoutParams()).g > 0.0f) {
                        viewB4.measure(View.MeasureSpec.makeMeasureSpec(viewB4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824));
                    }
                    i34 = i35 + 1;
                }
            }
            i3 = iMax7;
            i4 = i12;
        }
        if (z5 || mode == 1073741824) {
            i3 = i4;
        }
        setMeasuredDimension(ai.a(Math.max(i3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, i13), iA5);
        if (z6) {
            c(virtualChildCount, i2);
        }
    }

    private void c(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View viewB = b(i3);
            if (viewB.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) viewB.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = viewB.getMeasuredHeight();
                    measureChildWithMargins(viewB, iMakeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    void b(int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int iA;
        float f2;
        int baseline;
        int iA2;
        boolean z2;
        boolean z3;
        int iMax;
        int iMax2;
        boolean z4;
        int i9;
        int i10;
        int i11;
        this.f = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z5 = true;
        float f3 = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean z6 = false;
        boolean z7 = false;
        if (this.i == null || this.j == null) {
            this.i = new int[4];
            this.j = new int[4];
        }
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z8 = this.a;
        boolean z9 = this.h;
        boolean z10 = mode == 1073741824;
        int iMax3 = Integer.MIN_VALUE;
        int iA3 = 0;
        while (iA3 < virtualChildCount) {
            View viewB = b(iA3);
            if (viewB == null) {
                this.f += d(iA3);
                i10 = iMax3;
                z4 = z7;
                z3 = z5;
                i11 = i13;
                i9 = i12;
            } else if (viewB.getVisibility() == 8) {
                iA3 += a(viewB, iA3);
                i10 = iMax3;
                z4 = z7;
                z3 = z5;
                i11 = i13;
                i9 = i12;
            } else {
                if (c(iA3)) {
                    this.f += this.l;
                }
                LayoutParams layoutParams = (LayoutParams) viewB.getLayoutParams();
                float f4 = f3 + layoutParams.g;
                if (mode == 1073741824 && layoutParams.width == 0 && layoutParams.g > 0.0f) {
                    if (z10) {
                        this.f += layoutParams.leftMargin + layoutParams.rightMargin;
                    } else {
                        int i16 = this.f;
                        this.f = Math.max(i16, layoutParams.leftMargin + i16 + layoutParams.rightMargin);
                    }
                    if (z8) {
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        viewB.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    } else {
                        z7 = true;
                    }
                } else {
                    int i17 = Integer.MIN_VALUE;
                    if (layoutParams.width == 0 && layoutParams.g > 0.0f) {
                        i17 = 0;
                        layoutParams.width = -2;
                    }
                    int i18 = i17;
                    a(viewB, iA3, i, f4 == 0.0f ? this.f : 0, i2, 0);
                    if (i18 != Integer.MIN_VALUE) {
                        layoutParams.width = i18;
                    }
                    int measuredWidth = viewB.getMeasuredWidth();
                    if (z10) {
                        this.f += layoutParams.leftMargin + measuredWidth + layoutParams.rightMargin + b(viewB);
                    } else {
                        int i19 = this.f;
                        this.f = Math.max(i19, i19 + measuredWidth + layoutParams.leftMargin + layoutParams.rightMargin + b(viewB));
                    }
                    if (z9) {
                        iMax3 = Math.max(measuredWidth, iMax3);
                    }
                }
                boolean z11 = false;
                if (mode2 == 1073741824 || layoutParams.height != -1) {
                    z2 = z6;
                } else {
                    z2 = true;
                    z11 = true;
                }
                int i20 = layoutParams.bottomMargin + layoutParams.topMargin;
                int measuredHeight = viewB.getMeasuredHeight() + i20;
                int iA4 = ad.a(i13, ai.i(viewB));
                if (z8) {
                    int baseline2 = viewB.getBaseline();
                    if (baseline2 != -1) {
                        int i21 = ((((layoutParams.h < 0 ? this.e : layoutParams.h) & 112) >> 4) & (-2)) >> 1;
                        iArr[i21] = Math.max(iArr[i21], baseline2);
                        iArr2[i21] = Math.max(iArr2[i21], measuredHeight - baseline2);
                    }
                }
                int iMax4 = Math.max(i12, measuredHeight);
                z3 = z5 && layoutParams.height == -1;
                if (layoutParams.g > 0.0f) {
                    iMax2 = Math.max(i15, z11 ? i20 : measuredHeight);
                    iMax = i14;
                } else {
                    if (!z11) {
                        i20 = measuredHeight;
                    }
                    iMax = Math.max(i14, i20);
                    iMax2 = i15;
                }
                iA3 += a(viewB, iA3);
                z4 = z7;
                i15 = iMax2;
                i14 = iMax;
                i9 = iMax4;
                i10 = iMax3;
                i11 = iA4;
                z6 = z2;
                f3 = f4;
            }
            iA3++;
            iMax3 = i10;
            z7 = z4;
            z5 = z3;
            i13 = i11;
            i12 = i9;
        }
        if (this.f > 0 && c(virtualChildCount)) {
            this.f += this.l;
        }
        int iMax5 = (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) ? i12 : Math.max(i12, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        if (z9 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f = 0;
            int i22 = 0;
            while (i22 < virtualChildCount) {
                View viewB2 = b(i22);
                if (viewB2 == null) {
                    this.f += d(i22);
                    iA2 = i22;
                } else if (viewB2.getVisibility() == 8) {
                    iA2 = a(viewB2, i22) + i22;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) viewB2.getLayoutParams();
                    if (z10) {
                        this.f = layoutParams2.rightMargin + layoutParams2.leftMargin + iMax3 + b(viewB2) + this.f;
                        iA2 = i22;
                    } else {
                        int i23 = this.f;
                        this.f = Math.max(i23, layoutParams2.rightMargin + i23 + iMax3 + layoutParams2.leftMargin + b(viewB2));
                        iA2 = i22;
                    }
                }
                i22 = iA2 + 1;
            }
        }
        this.f += getPaddingLeft() + getPaddingRight();
        int iA5 = ai.a(Math.max(this.f, getSuggestedMinimumWidth()), i, 0);
        int i24 = (16777215 & iA5) - this.f;
        if (z7 || (i24 != 0 && f3 > 0.0f)) {
            if (this.g > 0.0f) {
                f3 = this.g;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f = 0;
            int i25 = 0;
            float f5 = f3;
            boolean z12 = z5;
            int i26 = i14;
            int i27 = i13;
            int i28 = i24;
            int iMax6 = -1;
            while (i25 < virtualChildCount) {
                View viewB3 = b(i25);
                if (viewB3 == null) {
                    f = f5;
                    i5 = i28;
                    i6 = iMax6;
                    i7 = i26;
                    z = z12;
                } else if (viewB3.getVisibility() == 8) {
                    f = f5;
                    i5 = i28;
                    i6 = iMax6;
                    i7 = i26;
                    z = z12;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) viewB3.getLayoutParams();
                    float f6 = layoutParams3.g;
                    if (f6 > 0.0f) {
                        int i29 = (int) ((i28 * f6) / f5);
                        float f7 = f5 - f6;
                        i8 = i28 - i29;
                        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + layoutParams3.topMargin + layoutParams3.bottomMargin, layoutParams3.height);
                        if (layoutParams3.width != 0 || mode != 1073741824) {
                            int measuredWidth2 = i29 + viewB3.getMeasuredWidth();
                            if (measuredWidth2 < 0) {
                                measuredWidth2 = 0;
                            }
                            viewB3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), childMeasureSpec);
                        } else {
                            if (i29 <= 0) {
                                i29 = 0;
                            }
                            viewB3.measure(View.MeasureSpec.makeMeasureSpec(i29, 1073741824), childMeasureSpec);
                        }
                        iA = ad.a(i27, ai.i(viewB3) & (-16777216));
                        f2 = f7;
                    } else {
                        i8 = i28;
                        iA = i27;
                        f2 = f5;
                    }
                    if (z10) {
                        this.f += viewB3.getMeasuredWidth() + layoutParams3.leftMargin + layoutParams3.rightMargin + b(viewB3);
                    } else {
                        int i30 = this.f;
                        this.f = Math.max(i30, viewB3.getMeasuredWidth() + i30 + layoutParams3.leftMargin + layoutParams3.rightMargin + b(viewB3));
                    }
                    boolean z13 = mode2 != 1073741824 && layoutParams3.height == -1;
                    int i31 = layoutParams3.topMargin + layoutParams3.bottomMargin;
                    int measuredHeight2 = viewB3.getMeasuredHeight() + i31;
                    int iMax7 = Math.max(iMax6, measuredHeight2);
                    int iMax8 = Math.max(i26, z13 ? i31 : measuredHeight2);
                    boolean z14 = z12 && layoutParams3.height == -1;
                    if (z8 && (baseline = viewB3.getBaseline()) != -1) {
                        int i32 = ((((layoutParams3.h < 0 ? this.e : layoutParams3.h) & 112) >> 4) & (-2)) >> 1;
                        iArr[i32] = Math.max(iArr[i32], baseline);
                        iArr2[i32] = Math.max(iArr2[i32], measuredHeight2 - baseline);
                    }
                    f = f2;
                    i7 = iMax8;
                    z = z14;
                    i27 = iA;
                    i5 = i8;
                    i6 = iMax7;
                }
                i25++;
                i26 = i7;
                iMax6 = i6;
                z12 = z;
                i28 = i5;
                f5 = f;
            }
            this.f += getPaddingLeft() + getPaddingRight();
            if (iArr[1] != -1 || iArr[0] != -1 || iArr[2] != -1 || iArr[3] != -1) {
                iMax6 = Math.max(iMax6, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            z5 = z12;
            i3 = i26;
            i13 = i27;
            i4 = iMax6;
        } else {
            int iMax9 = Math.max(i14, i15);
            if (z9 && mode != 1073741824) {
                int i33 = 0;
                while (true) {
                    int i34 = i33;
                    if (i34 >= virtualChildCount) {
                        break;
                    }
                    View viewB4 = b(i34);
                    if (viewB4 != null && viewB4.getVisibility() != 8 && ((LayoutParams) viewB4.getLayoutParams()).g > 0.0f) {
                        viewB4.measure(View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824), View.MeasureSpec.makeMeasureSpec(viewB4.getMeasuredHeight(), 1073741824));
                    }
                    i33 = i34 + 1;
                }
            }
            i3 = iMax9;
            i4 = iMax5;
        }
        if (z5 || mode2 == 1073741824) {
            i3 = i4;
        }
        setMeasuredDimension(((-16777216) & i13) | iA5, ai.a(Math.max(i3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i13 << 16));
        if (z6) {
            d(virtualChildCount, i);
        }
    }

    private void d(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View viewB = b(i3);
            if (viewB.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) viewB.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = viewB.getMeasuredWidth();
                    measureChildWithMargins(viewB, i2, 0, iMakeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
        }
    }

    int a(View view, int i) {
        return 0;
    }

    int d(int i) {
        return 0;
    }

    void a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    int a(View view) {
        return 0;
    }

    int b(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.d == 1) {
            a(i, i2, i3, i4);
        } else {
            b(i, i2, i3, i4);
        }
    }

    void a(int i, int i2, int i3, int i4) {
        int paddingTop;
        int iA;
        int i5;
        int paddingLeft = getPaddingLeft();
        int i6 = i3 - i;
        int paddingRight = i6 - getPaddingRight();
        int paddingRight2 = (i6 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i7 = this.e & 112;
        int i8 = this.e & 8388615;
        switch (i7) {
            case 16:
                paddingTop = getPaddingTop() + (((i4 - i2) - this.f) / 2);
                break;
            case 80:
                paddingTop = ((getPaddingTop() + i4) - i2) - this.f;
                break;
            default:
                paddingTop = getPaddingTop();
                break;
        }
        int i9 = 0;
        int iB = paddingTop;
        while (i9 < virtualChildCount) {
            View viewB = b(i9);
            if (viewB == null) {
                iB += d(i9);
                iA = i9;
            } else if (viewB.getVisibility() != 8) {
                int measuredWidth = viewB.getMeasuredWidth();
                int measuredHeight = viewB.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) viewB.getLayoutParams();
                int i10 = layoutParams.h;
                if (i10 < 0) {
                    i10 = i8;
                }
                switch (android.support.v4.view.e.a(i10, ai.e(this)) & 7) {
                    case 1:
                        i5 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + layoutParams.leftMargin) - layoutParams.rightMargin;
                        break;
                    case 5:
                        i5 = (paddingRight - measuredWidth) - layoutParams.rightMargin;
                        break;
                    default:
                        i5 = paddingLeft + layoutParams.leftMargin;
                        break;
                }
                int i11 = (c(i9) ? this.m + iB : iB) + layoutParams.topMargin;
                a(viewB, i5, i11 + a(viewB), measuredWidth, measuredHeight);
                iB = i11 + layoutParams.bottomMargin + measuredHeight + b(viewB);
                iA = a(viewB, i9) + i9;
            } else {
                iA = i9;
            }
            i9 = iA + 1;
        }
    }

    void b(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int iA;
        int baseline;
        int measuredHeight;
        boolean zA = ad.a(this);
        int paddingTop = getPaddingTop();
        int i7 = i4 - i2;
        int paddingBottom = i7 - getPaddingBottom();
        int paddingBottom2 = (i7 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.e & 8388615;
        int i9 = this.e & 112;
        boolean z = this.a;
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        switch (android.support.v4.view.e.a(i8, ai.e(this))) {
            case 1:
                paddingLeft = getPaddingLeft() + (((i3 - i) - this.f) / 2);
                break;
            case 5:
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.f;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (!zA) {
            i5 = 1;
            i6 = 0;
        } else {
            i5 = -1;
            i6 = virtualChildCount - 1;
        }
        int i10 = 0;
        while (i10 < virtualChildCount) {
            int i11 = i6 + (i5 * i10);
            View viewB = b(i11);
            if (viewB == null) {
                paddingLeft += d(i11);
                iA = i10;
            } else if (viewB.getVisibility() != 8) {
                int measuredWidth = viewB.getMeasuredWidth();
                int measuredHeight2 = viewB.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) viewB.getLayoutParams();
                if (!z || layoutParams.height == -1) {
                    baseline = -1;
                } else {
                    baseline = viewB.getBaseline();
                }
                int i12 = layoutParams.h;
                if (i12 < 0) {
                    i12 = i9;
                }
                switch (i12 & 112) {
                    case 16:
                        measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        break;
                    case 48:
                        measuredHeight = paddingTop + layoutParams.topMargin;
                        if (baseline != -1) {
                            measuredHeight += iArr[1] - baseline;
                        }
                        break;
                    case 80:
                        measuredHeight = (paddingBottom - measuredHeight2) - layoutParams.bottomMargin;
                        if (baseline != -1) {
                            measuredHeight -= iArr2[2] - (viewB.getMeasuredHeight() - baseline);
                        }
                        break;
                    default:
                        measuredHeight = paddingTop;
                        break;
                }
                int i13 = (c(i11) ? this.l + paddingLeft : paddingLeft) + layoutParams.leftMargin;
                a(viewB, i13 + a(viewB), measuredHeight, measuredWidth, measuredHeight2);
                paddingLeft = i13 + layoutParams.rightMargin + measuredWidth + b(viewB);
                iA = a(viewB, i11) + i10;
            } else {
                iA = i10;
            }
            i10 = iA + 1;
        }
    }

    private void a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    public void setOrientation(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.d;
    }

    public void setGravity(int i) {
        if (this.e != i) {
            int i2 = (8388615 & i) == 0 ? 8388611 | i : i;
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((this.e & 8388615) != i2) {
            this.e = i2 | (this.e & (-8388616));
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        if ((this.e & 112) != i2) {
            this.e = i2 | (this.e & (-113));
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        if (this.d == 0) {
            return new LayoutParams(-2, -2);
        }
        if (this.d == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public float g;
        public int h;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.h = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k.LinearLayoutCompat_Layout);
            this.g = typedArrayObtainStyledAttributes.getFloat(a.k.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.h = typedArrayObtainStyledAttributes.getInt(a.k.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.h = -1;
            this.g = 0.0f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.h = -1;
        }
    }
}
