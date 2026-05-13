package com.tsf.shell.theme.inside;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ViewFlipper;
/* loaded from: classes.dex */
public class ThemeViewFilpper extends ViewFlipper {
    public ThemeViewFilpper(Context context) {
        super(context);
    }

    public ThemeViewFilpper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ViewFlipper, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException e) {
            stopFlipping();
        }
    }
}
