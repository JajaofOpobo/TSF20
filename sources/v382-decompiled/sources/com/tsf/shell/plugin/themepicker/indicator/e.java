package com.tsf.shell.plugin.themepicker.indicator;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.i;

/* loaded from: classes.dex */
class e extends TextView {
    final /* synthetic */ TabPageIndicator a;
    private int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TabPageIndicator tabPageIndicator, Context context) {
        super(context, null, i.vpiTabPageIndicatorStyle);
        this.a = tabPageIndicator;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        super.onMeasure(i, i2);
        i3 = this.a.g;
        if (i3 > 0) {
            int measuredWidth = getMeasuredWidth();
            i4 = this.a.g;
            if (measuredWidth > i4) {
                i5 = this.a.g;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i2);
            }
        }
    }

    public int a() {
        return this.b;
    }
}
