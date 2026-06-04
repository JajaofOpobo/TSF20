package com.tsf.shell.setting;

import android.util.DisplayMetrics;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import com.tsf.shell.Home;

/* loaded from: classes.dex */
final class j implements CompoundButton.OnCheckedChangeListener {
    j() {
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SeekBar seekBar;
        int c;
        f.e = z;
        if (z) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Home.d().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f = displayMetrics.density;
            if (f == 2.0f) {
                f = 1.8f;
            }
            if (f == 3.0f) {
                f = 2.7f;
            }
            seekBar = f.f;
            c = f.c(f);
            seekBar.setProgress(c);
        }
    }
}
