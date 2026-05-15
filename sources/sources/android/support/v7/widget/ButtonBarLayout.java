package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.view.ai;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ButtonBarLayout extends LinearLayout {
    private boolean a;
    private int b;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k.ButtonBarLayout);
        this.a = typedArrayObtainStyledAttributes.getBoolean(a.k.ButtonBarLayout_allowStacking, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setAllowStacking(boolean z) {
        if (this.a != z) {
            this.a = z;
            if (!this.a && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        boolean z2 = false;
        int size = View.MeasureSpec.getSize(i);
        if (this.a) {
            if (size > this.b && a()) {
                setStacked(false);
            }
            this.b = size;
        }
        if (a() || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (this.a && !a()) {
            if (Build.VERSION.SDK_INT >= 11) {
                if ((ai.h(this) & (-16777216)) == 16777216) {
                    z2 = true;
                }
            } else {
                int childCount = getChildCount();
                int measuredWidth = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    measuredWidth += getChildAt(i3).getMeasuredWidth();
                }
                if (getPaddingLeft() + measuredWidth + getPaddingRight() > size) {
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
        View viewFindViewById = findViewById(a.f.spacer);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    private boolean a() {
        return getOrientation() == 1;
    }
}
