package com.tsf.extend.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
/* loaded from: classes.dex */
public class ThemeRecommendView extends RelativeLayout {
    public ThemeRecommendView(Context context) {
        super(context);
    }

    public ThemeRecommendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ThemeRecommendView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int a = a(i);
        int a2 = a(i2);
        if (a2 == 0) {
            a2 = (int) (a * 1.3333334f);
            getLayoutParams().height = a2;
        }
        setMeasuredDimension(a, a2);
    }

    private int a(int i) {
        return View.MeasureSpec.getSize(i);
    }
}
