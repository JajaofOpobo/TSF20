package com.tsf.extend.wallpaper;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tsf.extend.theme.diy.ThemeDIYActivity;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemePreview extends FrameLayout {
    public ThemePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        if (size > 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) ((size - (getPaddingTop() + getPaddingBottom())) * ThemeDIYActivity.a)) + getPaddingLeft() + getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }
}
