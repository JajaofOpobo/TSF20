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
        int m8469a = m8469a(i);
        int m8469a2 = m8469a(i2);
        if (m8469a2 == 0) {
            m8469a2 = (int) (m8469a * 1.3333334f);
            getLayoutParams().height = m8469a2;
        }
        setMeasuredDimension(m8469a, m8469a2);
    }

    /* renamed from: a */
    private int m8469a(int i) {
        return View.MeasureSpec.getSize(i);
    }
}
