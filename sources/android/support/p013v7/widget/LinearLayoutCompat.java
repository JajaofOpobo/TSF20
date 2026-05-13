package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.C0391e;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
/* renamed from: android.support.v7.widget.LinearLayoutCompat */
/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a */
    private boolean f1817a;

    /* renamed from: b */
    private int f1818b;

    /* renamed from: c */
    private int f1819c;

    /* renamed from: d */
    private int f1820d;

    /* renamed from: e */
    private int f1821e;

    /* renamed from: f */
    private int f1822f;

    /* renamed from: g */
    private float f1823g;

    /* renamed from: h */
    private boolean f1824h;

    /* renamed from: i */
    private int[] f1825i;

    /* renamed from: j */
    private int[] f1826j;

    /* renamed from: k */
    private Drawable f1827k;

    /* renamed from: l */
    private int f1828l;

    /* renamed from: m */
    private int f1829m;

    /* renamed from: n */
    private int f1830n;

    /* renamed from: o */
    private int f1831o;

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1817a = true;
        this.f1818b = -1;
        this.f1819c = 0;
        this.f1821e = 8388659;
        C0725aa m11295a = C0725aa.m11295a(context, attributeSet, C0535a.C0546k.LinearLayoutCompat, i, 0);
        int m11298a = m11295a.m11298a(C0535a.C0546k.LinearLayoutCompat_android_orientation, -1);
        if (m11298a >= 0) {
            setOrientation(m11298a);
        }
        int m11298a2 = m11295a.m11298a(C0535a.C0546k.LinearLayoutCompat_android_gravity, -1);
        if (m11298a2 >= 0) {
            setGravity(m11298a2);
        }
        boolean m11297a = m11295a.m11297a(C0535a.C0546k.LinearLayoutCompat_android_baselineAligned, true);
        if (!m11297a) {
            setBaselineAligned(m11297a);
        }
        this.f1823g = m11295a.m11299a(C0535a.C0546k.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1818b = m11295a.m11298a(C0535a.C0546k.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f1824h = m11295a.m11297a(C0535a.C0546k.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(m11295a.m11300a(C0535a.C0546k.LinearLayoutCompat_divider));
        this.f1830n = m11295a.m11298a(C0535a.C0546k.LinearLayoutCompat_showDividers, 0);
        this.f1831o = m11295a.m11287e(C0535a.C0546k.LinearLayoutCompat_dividerPadding, 0);
        m11295a.m11301a();
    }

    public void setShowDividers(int i) {
        if (i != this.f1830n) {
            requestLayout();
        }
        this.f1830n = i;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getShowDividers() {
        return this.f1830n;
    }

    public Drawable getDividerDrawable() {
        return this.f1827k;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f1827k) {
            this.f1827k = drawable;
            if (drawable != null) {
                this.f1828l = drawable.getIntrinsicWidth();
                this.f1829m = drawable.getIntrinsicHeight();
            } else {
                this.f1828l = 0;
                this.f1829m = 0;
            }
            setWillNotDraw(drawable == null);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f1831o = i;
    }

    public int getDividerPadding() {
        return this.f1831o;
    }

    public int getDividerWidth() {
        return this.f1828l;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1827k != null) {
            if (this.f1820d == 1) {
                m11531a(canvas);
            } else {
                m11522b(canvas);
            }
        }
    }

    /* renamed from: a */
    void m11531a(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View m11525b = m11525b(i);
            if (m11525b != null && m11525b.getVisibility() != 8 && m11517c(i)) {
                m11530a(canvas, (m11525b.getTop() - ((LayoutParams) m11525b.getLayoutParams()).topMargin) - this.f1829m);
            }
        }
        if (m11517c(virtualChildCount)) {
            View m11525b2 = m11525b(virtualChildCount - 1);
            if (m11525b2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f1829m;
            } else {
                bottom = ((LayoutParams) m11525b2.getLayoutParams()).bottomMargin + m11525b2.getBottom();
            }
            m11530a(canvas, bottom);
        }
    }

    /* renamed from: b */
    void m11522b(Canvas canvas) {
        int right;
        int left;
        int virtualChildCount = getVirtualChildCount();
        boolean m11259a = C0730ad.m11259a(this);
        for (int i = 0; i < virtualChildCount; i++) {
            View m11525b = m11525b(i);
            if (m11525b != null && m11525b.getVisibility() != 8 && m11517c(i)) {
                LayoutParams layoutParams = (LayoutParams) m11525b.getLayoutParams();
                if (m11259a) {
                    left = layoutParams.rightMargin + m11525b.getRight();
                } else {
                    left = (m11525b.getLeft() - layoutParams.leftMargin) - this.f1828l;
                }
                m11521b(canvas, left);
            }
        }
        if (m11517c(virtualChildCount)) {
            View m11525b2 = m11525b(virtualChildCount - 1);
            if (m11525b2 == null) {
                if (m11259a) {
                    right = getPaddingLeft();
                } else {
                    right = (getWidth() - getPaddingRight()) - this.f1828l;
                }
            } else {
                LayoutParams layoutParams2 = (LayoutParams) m11525b2.getLayoutParams();
                if (m11259a) {
                    right = (m11525b2.getLeft() - layoutParams2.leftMargin) - this.f1828l;
                } else {
                    right = layoutParams2.rightMargin + m11525b2.getRight();
                }
            }
            m11521b(canvas, right);
        }
    }

    /* renamed from: a */
    void m11530a(Canvas canvas, int i) {
        this.f1827k.setBounds(getPaddingLeft() + this.f1831o, i, (getWidth() - getPaddingRight()) - this.f1831o, this.f1829m + i);
        this.f1827k.draw(canvas);
    }

    /* renamed from: b */
    void m11521b(Canvas canvas, int i) {
        this.f1827k.setBounds(i, getPaddingTop() + this.f1831o, this.f1828l + i, (getHeight() - getPaddingBottom()) - this.f1831o);
        this.f1827k.draw(canvas);
    }

    public void setBaselineAligned(boolean z) {
        this.f1817a = z;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1824h = z;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        int i2;
        if (this.f1818b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.f1818b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.f1818b);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1818b != 0) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            return -1;
        }
        int i3 = this.f1819c;
        if (this.f1820d == 1 && (i2 = this.f1821e & 112) != 48) {
            switch (i2) {
                case 16:
                    i = i3 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1822f) / 2);
                    break;
                case 80:
                    i = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1822f;
                    break;
            }
            return ((LayoutParams) childAt.getLayoutParams()).topMargin + i + baseline;
        }
        i = i3;
        return ((LayoutParams) childAt.getLayoutParams()).topMargin + i + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1818b;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f1818b = i;
    }

    /* renamed from: b */
    View m11525b(int i) {
        return getChildAt(i);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1823g;
    }

    public void setWeightSum(float f) {
        this.f1823g = Math.max(0.0f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f1820d == 1) {
            m11533a(i, i2);
        } else {
            m11524b(i, i2);
        }
    }

    /* renamed from: c */
    protected boolean m11517c(int i) {
        if (i == 0) {
            return (this.f1830n & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.f1830n & 4) != 0;
        } else if ((this.f1830n & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    void m11533a(int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        boolean z3;
        int max;
        int i11;
        boolean z4;
        int i12;
        int i13;
        int i14;
        this.f1822f = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z5 = true;
        float f2 = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean z6 = false;
        boolean z7 = false;
        int i19 = this.f1818b;
        boolean z8 = this.f1824h;
        int i20 = Integer.MIN_VALUE;
        int i21 = 0;
        while (i21 < virtualChildCount) {
            View m11525b = m11525b(i21);
            if (m11525b == null) {
                this.f1822f += m11515d(i21);
                i13 = i20;
                z4 = z7;
                z3 = z5;
                i14 = i16;
                i12 = i15;
            } else if (m11525b.getVisibility() == 8) {
                i21 += m11528a(m11525b, i21);
                i13 = i20;
                z4 = z7;
                z3 = z5;
                i14 = i16;
                i12 = i15;
            } else {
                if (m11517c(i21)) {
                    this.f1822f += this.f1829m;
                }
                LayoutParams layoutParams = (LayoutParams) m11525b.getLayoutParams();
                float f3 = f2 + layoutParams.f1832g;
                if (mode2 == 1073741824 && layoutParams.height == 0 && layoutParams.f1832g > 0.0f) {
                    int i22 = this.f1822f;
                    this.f1822f = Math.max(i22, layoutParams.topMargin + i22 + layoutParams.bottomMargin);
                    z7 = true;
                } else {
                    int i23 = Integer.MIN_VALUE;
                    if (layoutParams.height == 0 && layoutParams.f1832g > 0.0f) {
                        i23 = 0;
                        layoutParams.height = -2;
                    }
                    int i24 = i23;
                    m11526a(m11525b, i21, i, 0, i2, f3 == 0.0f ? this.f1822f : 0);
                    if (i24 != Integer.MIN_VALUE) {
                        layoutParams.height = i24;
                    }
                    int measuredHeight = m11525b.getMeasuredHeight();
                    int i25 = this.f1822f;
                    this.f1822f = Math.max(i25, i25 + measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin + m11519b(m11525b));
                    if (z8) {
                        i20 = Math.max(measuredHeight, i20);
                    }
                }
                if (i19 >= 0 && i19 == i21 + 1) {
                    this.f1819c = this.f1822f;
                }
                if (i21 < i19 && layoutParams.f1832g > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                boolean z9 = false;
                if (mode == 1073741824 || layoutParams.width != -1) {
                    z2 = z6;
                } else {
                    z2 = true;
                    z9 = true;
                }
                int i26 = layoutParams.rightMargin + layoutParams.leftMargin;
                int measuredWidth = m11525b.getMeasuredWidth() + i26;
                int max2 = Math.max(i15, measuredWidth);
                int m11260a = C0730ad.m11260a(i16, C0309ai.m12898i(m11525b));
                z3 = z5 && layoutParams.width == -1;
                if (layoutParams.f1832g > 0.0f) {
                    i11 = Math.max(i18, z9 ? i26 : measuredWidth);
                    max = i17;
                } else {
                    if (!z9) {
                        i26 = measuredWidth;
                    }
                    max = Math.max(i17, i26);
                    i11 = i18;
                }
                i21 += m11528a(m11525b, i21);
                z4 = z7;
                i18 = i11;
                i17 = max;
                i12 = max2;
                i13 = i20;
                i14 = m11260a;
                z6 = z2;
                f2 = f3;
            }
            i21++;
            i20 = i13;
            z7 = z4;
            z5 = z3;
            i16 = i14;
            i15 = i12;
        }
        if (this.f1822f > 0 && m11517c(virtualChildCount)) {
            this.f1822f += this.f1829m;
        }
        if (z8 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.f1822f = 0;
            int i27 = 0;
            while (i27 < virtualChildCount) {
                View m11525b2 = m11525b(i27);
                if (m11525b2 == null) {
                    this.f1822f += m11515d(i27);
                    i10 = i27;
                } else if (m11525b2.getVisibility() == 8) {
                    i10 = m11528a(m11525b2, i27) + i27;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) m11525b2.getLayoutParams();
                    int i28 = this.f1822f;
                    this.f1822f = Math.max(i28, layoutParams2.bottomMargin + i28 + i20 + layoutParams2.topMargin + m11519b(m11525b2));
                    i10 = i27;
                }
                i27 = i10 + 1;
            }
        }
        this.f1822f += getPaddingTop() + getPaddingBottom();
        int m12932a = C0309ai.m12932a(Math.max(this.f1822f, getSuggestedMinimumHeight()), i2, 0);
        int i29 = (16777215 & m12932a) - this.f1822f;
        if (z7 || (i29 != 0 && f2 > 0.0f)) {
            if (this.f1823g > 0.0f) {
                f2 = this.f1823g;
            }
            this.f1822f = 0;
            int i30 = 0;
            float f4 = f2;
            boolean z10 = z5;
            int i31 = i17;
            int i32 = i16;
            int i33 = i15;
            int i34 = i29;
            while (i30 < virtualChildCount) {
                View m11525b3 = m11525b(i30);
                if (m11525b3.getVisibility() == 8) {
                    i7 = i31;
                    i9 = i32;
                    i8 = i33;
                    z = z10;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) m11525b3.getLayoutParams();
                    float f5 = layoutParams3.f1832g;
                    if (f5 > 0.0f) {
                        int i35 = (int) ((i34 * f5) / f4);
                        float f6 = f4 - f5;
                        int i36 = i34 - i35;
                        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams3.leftMargin + layoutParams3.rightMargin, layoutParams3.width);
                        if (layoutParams3.height != 0 || mode2 != 1073741824) {
                            int measuredHeight2 = i35 + m11525b3.getMeasuredHeight();
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            m11525b3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
                        } else {
                            if (i35 <= 0) {
                                i35 = 0;
                            }
                            m11525b3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i35, 1073741824));
                        }
                        i5 = i36;
                        i6 = C0730ad.m11260a(i32, C0309ai.m12898i(m11525b3) & (-256));
                        f = f6;
                    } else {
                        f = f4;
                        i5 = i34;
                        i6 = i32;
                    }
                    int i37 = layoutParams3.leftMargin + layoutParams3.rightMargin;
                    int measuredWidth2 = m11525b3.getMeasuredWidth() + i37;
                    int max3 = Math.max(i33, measuredWidth2);
                    if (!(mode != 1073741824 && layoutParams3.width == -1)) {
                        i37 = measuredWidth2;
                    }
                    int max4 = Math.max(i31, i37);
                    z = z10 && layoutParams3.width == -1;
                    int i38 = this.f1822f;
                    this.f1822f = Math.max(i38, layoutParams3.bottomMargin + m11525b3.getMeasuredHeight() + i38 + layoutParams3.topMargin + m11519b(m11525b3));
                    i7 = max4;
                    i8 = max3;
                    float f7 = f;
                    i9 = i6;
                    i34 = i5;
                    f4 = f7;
                }
                i30++;
                i31 = i7;
                i33 = i8;
                z10 = z;
                i32 = i9;
            }
            this.f1822f += getPaddingTop() + getPaddingBottom();
            z5 = z10;
            i3 = i31;
            i16 = i32;
            i4 = i33;
        } else {
            int max5 = Math.max(i17, i18);
            if (z8 && mode2 != 1073741824) {
                int i39 = 0;
                while (true) {
                    int i40 = i39;
                    if (i40 >= virtualChildCount) {
                        break;
                    }
                    View m11525b4 = m11525b(i40);
                    if (m11525b4 != null && m11525b4.getVisibility() != 8 && ((LayoutParams) m11525b4.getLayoutParams()).f1832g > 0.0f) {
                        m11525b4.measure(View.MeasureSpec.makeMeasureSpec(m11525b4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                    }
                    i39 = i40 + 1;
                }
            }
            i3 = max5;
            i4 = i15;
        }
        if (z5 || mode == 1073741824) {
            i3 = i4;
        }
        setMeasuredDimension(C0309ai.m12932a(Math.max(i3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, i16), m12932a);
        if (z6) {
            m11516c(virtualChildCount, i2);
        }
    }

    /* renamed from: c */
    private void m11516c(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m11525b = m11525b(i3);
            if (m11525b.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) m11525b.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = m11525b.getMeasuredHeight();
                    measureChildWithMargins(m11525b, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    /* renamed from: b */
    void m11524b(int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        float f2;
        int baseline;
        int i10;
        boolean z2;
        boolean z3;
        int max;
        int i11;
        boolean z4;
        int i12;
        int i13;
        int i14;
        this.f1822f = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z5 = true;
        float f3 = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean z6 = false;
        boolean z7 = false;
        if (this.f1825i == null || this.f1826j == null) {
            this.f1825i = new int[4];
            this.f1826j = new int[4];
        }
        int[] iArr = this.f1825i;
        int[] iArr2 = this.f1826j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z8 = this.f1817a;
        boolean z9 = this.f1824h;
        boolean z10 = mode == 1073741824;
        int i19 = Integer.MIN_VALUE;
        int i20 = 0;
        while (i20 < virtualChildCount) {
            View m11525b = m11525b(i20);
            if (m11525b == null) {
                this.f1822f += m11515d(i20);
                i13 = i19;
                z4 = z7;
                z3 = z5;
                i14 = i16;
                i12 = i15;
            } else if (m11525b.getVisibility() == 8) {
                i20 += m11528a(m11525b, i20);
                i13 = i19;
                z4 = z7;
                z3 = z5;
                i14 = i16;
                i12 = i15;
            } else {
                if (m11517c(i20)) {
                    this.f1822f += this.f1828l;
                }
                LayoutParams layoutParams = (LayoutParams) m11525b.getLayoutParams();
                float f4 = f3 + layoutParams.f1832g;
                if (mode == 1073741824 && layoutParams.width == 0 && layoutParams.f1832g > 0.0f) {
                    if (z10) {
                        this.f1822f += layoutParams.leftMargin + layoutParams.rightMargin;
                    } else {
                        int i21 = this.f1822f;
                        this.f1822f = Math.max(i21, layoutParams.leftMargin + i21 + layoutParams.rightMargin);
                    }
                    if (z8) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        m11525b.measure(makeMeasureSpec, makeMeasureSpec);
                    } else {
                        z7 = true;
                    }
                } else {
                    int i22 = Integer.MIN_VALUE;
                    if (layoutParams.width == 0 && layoutParams.f1832g > 0.0f) {
                        i22 = 0;
                        layoutParams.width = -2;
                    }
                    int i23 = i22;
                    m11526a(m11525b, i20, i, f4 == 0.0f ? this.f1822f : 0, i2, 0);
                    if (i23 != Integer.MIN_VALUE) {
                        layoutParams.width = i23;
                    }
                    int measuredWidth = m11525b.getMeasuredWidth();
                    if (z10) {
                        this.f1822f += layoutParams.leftMargin + measuredWidth + layoutParams.rightMargin + m11519b(m11525b);
                    } else {
                        int i24 = this.f1822f;
                        this.f1822f = Math.max(i24, i24 + measuredWidth + layoutParams.leftMargin + layoutParams.rightMargin + m11519b(m11525b));
                    }
                    if (z9) {
                        i19 = Math.max(measuredWidth, i19);
                    }
                }
                boolean z11 = false;
                if (mode2 == 1073741824 || layoutParams.height != -1) {
                    z2 = z6;
                } else {
                    z2 = true;
                    z11 = true;
                }
                int i25 = layoutParams.bottomMargin + layoutParams.topMargin;
                int measuredHeight = m11525b.getMeasuredHeight() + i25;
                int m11260a = C0730ad.m11260a(i16, C0309ai.m12898i(m11525b));
                if (z8) {
                    int baseline2 = m11525b.getBaseline();
                    if (baseline2 != -1) {
                        int i26 = ((((layoutParams.f1833h < 0 ? this.f1821e : layoutParams.f1833h) & 112) >> 4) & (-2)) >> 1;
                        iArr[i26] = Math.max(iArr[i26], baseline2);
                        iArr2[i26] = Math.max(iArr2[i26], measuredHeight - baseline2);
                    }
                }
                int max2 = Math.max(i15, measuredHeight);
                z3 = z5 && layoutParams.height == -1;
                if (layoutParams.f1832g > 0.0f) {
                    i11 = Math.max(i18, z11 ? i25 : measuredHeight);
                    max = i17;
                } else {
                    if (!z11) {
                        i25 = measuredHeight;
                    }
                    max = Math.max(i17, i25);
                    i11 = i18;
                }
                i20 += m11528a(m11525b, i20);
                z4 = z7;
                i18 = i11;
                i17 = max;
                i12 = max2;
                i13 = i19;
                i14 = m11260a;
                z6 = z2;
                f3 = f4;
            }
            i20++;
            i19 = i13;
            z7 = z4;
            z5 = z3;
            i16 = i14;
            i15 = i12;
        }
        if (this.f1822f > 0 && m11517c(virtualChildCount)) {
            this.f1822f += this.f1828l;
        }
        int max3 = (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) ? i15 : Math.max(i15, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        if (z9 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f1822f = 0;
            int i27 = 0;
            while (i27 < virtualChildCount) {
                View m11525b2 = m11525b(i27);
                if (m11525b2 == null) {
                    this.f1822f += m11515d(i27);
                    i10 = i27;
                } else if (m11525b2.getVisibility() == 8) {
                    i10 = m11528a(m11525b2, i27) + i27;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) m11525b2.getLayoutParams();
                    if (z10) {
                        this.f1822f = layoutParams2.rightMargin + layoutParams2.leftMargin + i19 + m11519b(m11525b2) + this.f1822f;
                        i10 = i27;
                    } else {
                        int i28 = this.f1822f;
                        this.f1822f = Math.max(i28, layoutParams2.rightMargin + i28 + i19 + layoutParams2.leftMargin + m11519b(m11525b2));
                        i10 = i27;
                    }
                }
                i27 = i10 + 1;
            }
        }
        this.f1822f += getPaddingLeft() + getPaddingRight();
        int m12932a = C0309ai.m12932a(Math.max(this.f1822f, getSuggestedMinimumWidth()), i, 0);
        int i29 = (16777215 & m12932a) - this.f1822f;
        if (z7 || (i29 != 0 && f3 > 0.0f)) {
            if (this.f1823g > 0.0f) {
                f3 = this.f1823g;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f1822f = 0;
            int i30 = 0;
            float f5 = f3;
            boolean z12 = z5;
            int i31 = i17;
            int i32 = i16;
            int i33 = i29;
            int i34 = -1;
            while (i30 < virtualChildCount) {
                View m11525b3 = m11525b(i30);
                if (m11525b3 == null) {
                    f = f5;
                    i5 = i33;
                    i6 = i34;
                    i7 = i31;
                    z = z12;
                } else if (m11525b3.getVisibility() == 8) {
                    f = f5;
                    i5 = i33;
                    i6 = i34;
                    i7 = i31;
                    z = z12;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) m11525b3.getLayoutParams();
                    float f6 = layoutParams3.f1832g;
                    if (f6 > 0.0f) {
                        int i35 = (int) ((i33 * f6) / f5);
                        float f7 = f5 - f6;
                        i8 = i33 - i35;
                        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + layoutParams3.topMargin + layoutParams3.bottomMargin, layoutParams3.height);
                        if (layoutParams3.width != 0 || mode != 1073741824) {
                            int measuredWidth2 = i35 + m11525b3.getMeasuredWidth();
                            if (measuredWidth2 < 0) {
                                measuredWidth2 = 0;
                            }
                            m11525b3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), childMeasureSpec);
                        } else {
                            if (i35 <= 0) {
                                i35 = 0;
                            }
                            m11525b3.measure(View.MeasureSpec.makeMeasureSpec(i35, 1073741824), childMeasureSpec);
                        }
                        i9 = C0730ad.m11260a(i32, C0309ai.m12898i(m11525b3) & (-16777216));
                        f2 = f7;
                    } else {
                        i8 = i33;
                        i9 = i32;
                        f2 = f5;
                    }
                    if (z10) {
                        this.f1822f += m11525b3.getMeasuredWidth() + layoutParams3.leftMargin + layoutParams3.rightMargin + m11519b(m11525b3);
                    } else {
                        int i36 = this.f1822f;
                        this.f1822f = Math.max(i36, m11525b3.getMeasuredWidth() + i36 + layoutParams3.leftMargin + layoutParams3.rightMargin + m11519b(m11525b3));
                    }
                    boolean z13 = mode2 != 1073741824 && layoutParams3.height == -1;
                    int i37 = layoutParams3.topMargin + layoutParams3.bottomMargin;
                    int measuredHeight2 = m11525b3.getMeasuredHeight() + i37;
                    int max4 = Math.max(i34, measuredHeight2);
                    int max5 = Math.max(i31, z13 ? i37 : measuredHeight2);
                    boolean z14 = z12 && layoutParams3.height == -1;
                    if (z8 && (baseline = m11525b3.getBaseline()) != -1) {
                        int i38 = ((((layoutParams3.f1833h < 0 ? this.f1821e : layoutParams3.f1833h) & 112) >> 4) & (-2)) >> 1;
                        iArr[i38] = Math.max(iArr[i38], baseline);
                        iArr2[i38] = Math.max(iArr2[i38], measuredHeight2 - baseline);
                    }
                    f = f2;
                    i7 = max5;
                    z = z14;
                    i32 = i9;
                    i5 = i8;
                    i6 = max4;
                }
                i30++;
                i31 = i7;
                i34 = i6;
                z12 = z;
                i33 = i5;
                f5 = f;
            }
            this.f1822f += getPaddingLeft() + getPaddingRight();
            if (iArr[1] != -1 || iArr[0] != -1 || iArr[2] != -1 || iArr[3] != -1) {
                i34 = Math.max(i34, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            z5 = z12;
            i3 = i31;
            i16 = i32;
            i4 = i34;
        } else {
            int max6 = Math.max(i17, i18);
            if (z9 && mode != 1073741824) {
                int i39 = 0;
                while (true) {
                    int i40 = i39;
                    if (i40 >= virtualChildCount) {
                        break;
                    }
                    View m11525b4 = m11525b(i40);
                    if (m11525b4 != null && m11525b4.getVisibility() != 8 && ((LayoutParams) m11525b4.getLayoutParams()).f1832g > 0.0f) {
                        m11525b4.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(m11525b4.getMeasuredHeight(), 1073741824));
                    }
                    i39 = i40 + 1;
                }
            }
            i3 = max6;
            i4 = max3;
        }
        if (z5 || mode2 == 1073741824) {
            i3 = i4;
        }
        setMeasuredDimension(((-16777216) & i16) | m12932a, C0309ai.m12932a(Math.max(i3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i16 << 16));
        if (z6) {
            m11514d(virtualChildCount, i);
        }
    }

    /* renamed from: d */
    private void m11514d(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m11525b = m11525b(i3);
            if (m11525b.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) m11525b.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = m11525b.getMeasuredWidth();
                    measureChildWithMargins(m11525b, i2, 0, makeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
        }
    }

    /* renamed from: a */
    int m11528a(View view, int i) {
        return 0;
    }

    /* renamed from: d */
    int m11515d(int i) {
        return 0;
    }

    /* renamed from: a */
    void m11526a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* renamed from: a */
    int m11529a(View view) {
        return 0;
    }

    /* renamed from: b */
    int m11519b(View view) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1820d == 1) {
            m11532a(i, i2, i3, i4);
        } else {
            m11523b(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    void m11532a(int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.f1821e & 112;
        int i9 = this.f1821e & 8388615;
        switch (i8) {
            case 16:
                paddingTop = getPaddingTop() + (((i4 - i2) - this.f1822f) / 2);
                break;
            case 80:
                paddingTop = ((getPaddingTop() + i4) - i2) - this.f1822f;
                break;
            default:
                paddingTop = getPaddingTop();
                break;
        }
        int i10 = 0;
        int i11 = paddingTop;
        while (i10 < virtualChildCount) {
            View m11525b = m11525b(i10);
            if (m11525b == null) {
                i11 += m11515d(i10);
                i5 = i10;
            } else if (m11525b.getVisibility() != 8) {
                int measuredWidth = m11525b.getMeasuredWidth();
                int measuredHeight = m11525b.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) m11525b.getLayoutParams();
                int i12 = layoutParams.f1833h;
                if (i12 < 0) {
                    i12 = i9;
                }
                switch (C0391e.m12648a(i12, C0309ai.m12904e(this)) & 7) {
                    case 1:
                        i6 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + layoutParams.leftMargin) - layoutParams.rightMargin;
                        break;
                    case 5:
                        i6 = (paddingRight - measuredWidth) - layoutParams.rightMargin;
                        break;
                    default:
                        i6 = paddingLeft + layoutParams.leftMargin;
                        break;
                }
                int i13 = (m11517c(i10) ? this.f1829m + i11 : i11) + layoutParams.topMargin;
                m11527a(m11525b, i6, i13 + m11529a(m11525b), measuredWidth, measuredHeight);
                i11 = i13 + layoutParams.bottomMargin + measuredHeight + m11519b(m11525b);
                i5 = m11528a(m11525b, i10) + i10;
            } else {
                i5 = i10;
            }
            i10 = i5 + 1;
        }
    }

    /* renamed from: b */
    void m11523b(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean m11259a = C0730ad.m11259a(this);
        int paddingTop = getPaddingTop();
        int i10 = i4 - i2;
        int paddingBottom = i10 - getPaddingBottom();
        int paddingBottom2 = (i10 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i11 = this.f1821e & 112;
        boolean z = this.f1817a;
        int[] iArr = this.f1825i;
        int[] iArr2 = this.f1826j;
        switch (C0391e.m12648a(this.f1821e & 8388615, C0309ai.m12904e(this))) {
            case 1:
                paddingLeft = getPaddingLeft() + (((i3 - i) - this.f1822f) / 2);
                break;
            case 5:
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.f1822f;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (!m11259a) {
            i5 = 1;
            i6 = 0;
        } else {
            i5 = -1;
            i6 = virtualChildCount - 1;
        }
        int i12 = 0;
        while (i12 < virtualChildCount) {
            int i13 = i6 + (i5 * i12);
            View m11525b = m11525b(i13);
            if (m11525b == null) {
                paddingLeft += m11515d(i13);
                i7 = i12;
            } else if (m11525b.getVisibility() != 8) {
                int measuredWidth = m11525b.getMeasuredWidth();
                int measuredHeight = m11525b.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) m11525b.getLayoutParams();
                if (!z || layoutParams.height == -1) {
                    i8 = -1;
                } else {
                    i8 = m11525b.getBaseline();
                }
                int i14 = layoutParams.f1833h;
                if (i14 < 0) {
                    i14 = i11;
                }
                switch (i14 & 112) {
                    case 16:
                        i9 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        break;
                    case 48:
                        i9 = paddingTop + layoutParams.topMargin;
                        if (i8 != -1) {
                            i9 += iArr[1] - i8;
                            break;
                        }
                        break;
                    case 80:
                        i9 = (paddingBottom - measuredHeight) - layoutParams.bottomMargin;
                        if (i8 != -1) {
                            i9 -= iArr2[2] - (m11525b.getMeasuredHeight() - i8);
                            break;
                        }
                        break;
                    default:
                        i9 = paddingTop;
                        break;
                }
                int i15 = (m11517c(i13) ? this.f1828l + paddingLeft : paddingLeft) + layoutParams.leftMargin;
                m11527a(m11525b, i15 + m11529a(m11525b), i9, measuredWidth, measuredHeight);
                paddingLeft = i15 + layoutParams.rightMargin + measuredWidth + m11519b(m11525b);
                i7 = m11528a(m11525b, i13) + i12;
            } else {
                i7 = i12;
            }
            i12 = i7 + 1;
        }
    }

    /* renamed from: a */
    private void m11527a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    public void setOrientation(int i) {
        if (this.f1820d != i) {
            this.f1820d = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.f1820d;
    }

    public void setGravity(int i) {
        if (this.f1821e != i) {
            int i2 = (8388615 & i) == 0 ? 8388611 | i : i;
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f1821e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((this.f1821e & 8388615) != i2) {
            this.f1821e = i2 | (this.f1821e & (-8388616));
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        if ((this.f1821e & 112) != i2) {
            this.f1821e = i2 | (this.f1821e & (-113));
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: j */
    public LayoutParams generateDefaultLayoutParams() {
        if (this.f1820d == 0) {
            return new LayoutParams(-2, -2);
        }
        if (this.f1820d == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: b */
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

    /* renamed from: android.support.v7.widget.LinearLayoutCompat$LayoutParams */
    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: g */
        public float f1832g;

        /* renamed from: h */
        public int f1833h;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1833h = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0535a.C0546k.LinearLayoutCompat_Layout);
            this.f1832g = obtainStyledAttributes.getFloat(C0535a.C0546k.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f1833h = obtainStyledAttributes.getInt(C0535a.C0546k.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1833h = -1;
            this.f1832g = 0.0f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1833h = -1;
        }
    }
}
