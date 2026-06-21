package com.tsf.shell.plugin.themepicker;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public class t implements Interpolator {
    final /* synthetic */ SildingMenuLayout a;

    protected t(SildingMenuLayout sildingMenuLayout) {
        this.a = sildingMenuLayout;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return ((float) Math.pow(f - 1.0f, 5.0d)) + 1.0f;
    }
}
