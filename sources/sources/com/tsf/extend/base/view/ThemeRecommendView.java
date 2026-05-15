package com.tsf.extend.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        int iA = a(i);
        int iA2 = a(i2);
        if (iA2 == 0) {
            iA2 = (int) (iA * 1.3333334f);
            getLayoutParams().height = iA2;
        }
        setMeasuredDimension(iA, iA2);
    }

    private int a(int i) {
        return View.MeasureSpec.getSize(i);
    }
}
