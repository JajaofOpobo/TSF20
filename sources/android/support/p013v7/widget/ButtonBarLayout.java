package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p002v4.view.C0309ai;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
/* renamed from: android.support.v7.widget.ButtonBarLayout */
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f1805a;

    /* renamed from: b */
    private int f1806b;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1806b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0535a.C0546k.ButtonBarLayout);
        this.f1805a = obtainStyledAttributes.getBoolean(C0535a.C0546k.ButtonBarLayout_allowStacking, false);
        obtainStyledAttributes.recycle();
    }

    public void setAllowStacking(boolean z) {
        if (this.f1805a != z) {
            this.f1805a = z;
            if (!this.f1805a && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        boolean z2 = false;
        int size = View.MeasureSpec.getSize(i);
        if (this.f1805a) {
            if (size > this.f1806b && m11538a()) {
                setStacked(false);
            }
            this.f1806b = size;
        }
        if (m11538a() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1805a && !m11538a()) {
            if (Build.VERSION.SDK_INT >= 11) {
                if ((C0309ai.m12899h(this) & (-16777216)) == 16777216) {
                    z2 = true;
                }
            } else {
                int childCount = getChildCount();
                int i4 = 0;
                for (int i5 = 0; i5 < childCount; i5++) {
                    i4 += getChildAt(i5).getMeasuredWidth();
                }
                if (getPaddingLeft() + i4 + getPaddingRight() > size) {
                    z2 = true;
                }
            }
            if (z2) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0535a.C0541f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* renamed from: a */
    private boolean m11538a() {
        return getOrientation() == 1;
    }
}
