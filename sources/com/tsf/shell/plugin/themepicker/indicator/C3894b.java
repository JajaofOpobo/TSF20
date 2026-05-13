package com.tsf.shell.plugin.themepicker.indicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
/* renamed from: com.tsf.shell.plugin.themepicker.indicator.b */
/* loaded from: classes.dex */
class C3894b extends LinearLayout {

    /* renamed from: a */
    private static final int[] f12781a = {16843049, 16843561, 16843562};

    /* renamed from: b */
    private Drawable f12782b;

    /* renamed from: c */
    private int f12783c;

    /* renamed from: d */
    private int f12784d;

    /* renamed from: e */
    private int f12785e;

    /* renamed from: f */
    private int f12786f;

    public C3894b(Context context, int i) {
        super(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f12781a, i, 0);
        setDividerDrawable(obtainStyledAttributes.getDrawable(0));
        this.f12786f = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f12785e = obtainStyledAttributes.getInteger(1, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout
    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f12782b) {
            this.f12782b = drawable;
            if (drawable != null) {
                this.f12783c = drawable.getIntrinsicWidth();
                this.f12784d = drawable.getIntrinsicHeight();
            } else {
                this.f12783c = 0;
                this.f12784d = 0;
            }
            setWillNotDraw(drawable == null);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int indexOfChild = indexOfChild(view);
        int orientation = getOrientation();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (m1243a(indexOfChild)) {
            if (orientation == 1) {
                layoutParams.topMargin = this.f12784d;
            } else {
                layoutParams.leftMargin = this.f12783c;
            }
        }
        int childCount = getChildCount();
        if (indexOfChild == childCount - 1 && m1243a(childCount)) {
            if (orientation == 1) {
                layoutParams.bottomMargin = this.f12784d;
            } else {
                layoutParams.rightMargin = this.f12783c;
            }
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f12782b != null) {
            if (getOrientation() == 1) {
                m1242a(canvas);
            } else {
                m1240b(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private void m1242a(Canvas canvas) {
        int bottom;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && childAt.getVisibility() != 8 && m1243a(i)) {
                m1241a(canvas, childAt.getTop() - ((LinearLayout.LayoutParams) childAt.getLayoutParams()).topMargin);
            }
        }
        if (m1243a(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f12784d;
            } else {
                bottom = childAt2.getBottom();
            }
            m1241a(canvas, bottom);
        }
    }

    /* renamed from: b */
    private void m1240b(Canvas canvas) {
        int right;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && childAt.getVisibility() != 8 && m1243a(i)) {
                m1239b(canvas, childAt.getLeft() - ((LinearLayout.LayoutParams) childAt.getLayoutParams()).leftMargin);
            }
        }
        if (m1243a(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 == null) {
                right = (getWidth() - getPaddingRight()) - this.f12783c;
            } else {
                right = childAt2.getRight();
            }
            m1239b(canvas, right);
        }
    }

    /* renamed from: a */
    private void m1241a(Canvas canvas, int i) {
        this.f12782b.setBounds(getPaddingLeft() + this.f12786f, i, (getWidth() - getPaddingRight()) - this.f12786f, this.f12784d + i);
        this.f12782b.draw(canvas);
    }

    /* renamed from: b */
    private void m1239b(Canvas canvas, int i) {
        this.f12782b.setBounds(i, getPaddingTop() + this.f12786f, this.f12783c + i, (getHeight() - getPaddingBottom()) - this.f12786f);
        this.f12782b.draw(canvas);
    }

    /* renamed from: a */
    private boolean m1243a(int i) {
        if (i == 0 || i == getChildCount() || (this.f12785e & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }
}
