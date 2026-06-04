package com.tsf.shell.setting;

import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

/* loaded from: classes.dex */
final class k implements SeekBar.OnSeekBarChangeListener {
    private final /* synthetic */ TextView a;

    k(TextView textView) {
        this.a = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        ImageView imageView;
        float f;
        float f2;
        ImageView imageView2;
        f.d = 0.8f + (i / 10.0f);
        String valueOf = String.valueOf(i + 8);
        if (i + 8 < 10) {
            this.a.setText("0." + valueOf.substring(0, 1));
        } else {
            this.a.setText(String.valueOf(valueOf.substring(0, 1)) + "." + valueOf.substring(1));
        }
        imageView = f.h;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        f = f.d;
        layoutParams.width = (int) ((f * 128.0f) / 1.5f);
        f2 = f.d;
        layoutParams.height = (int) ((f2 * 128.0f) / 1.5f);
        imageView2 = f.h;
        imageView2.setLayoutParams(layoutParams);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        seekBar.setSecondaryProgress(seekBar.getProgress());
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        CheckBox checkBox;
        checkBox = f.g;
        checkBox.setChecked(false);
        f.e = false;
    }
}
