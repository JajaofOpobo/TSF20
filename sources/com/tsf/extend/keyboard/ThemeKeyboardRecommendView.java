package com.tsf.extend.keyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
/* loaded from: classes.dex */
public class ThemeKeyboardRecommendView extends RelativeLayout {
    public ThemeKeyboardRecommendView(Context context) {
        super(context);
    }

    public ThemeKeyboardRecommendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ThemeKeyboardRecommendView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int m8255a = m8255a(i);
        int m8255a2 = m8255a(i2);
        if (m8255a2 == 0) {
            m8255a2 = (int) (m8255a * 0.73251027f);
            getLayoutParams().height = m8255a2;
        }
        setMeasuredDimension(m8255a, m8255a2);
    }

    /* renamed from: a */
    private int m8255a(int i) {
        return View.MeasureSpec.getSize(i);
    }
}
