package com.tsf.shell.setting;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public final class f {
    private static float b;
    private static boolean c;
    private static float d;
    private static SeekBar f;
    private static CheckBox g;
    private static ImageView h;
    public static float a = 3.0f;
    private static boolean e = false;

    public static void a() {
        g gVar = new g();
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(gVar);
    }

    static /* synthetic */ void b() {
        float J = com.tsf.shell.a.t.J();
        AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.c());
        builder.setPositiveButton(com.censivn.C3DEngine.h.a.c(R.string.public_action_ok), new h());
        builder.setNegativeButton(com.censivn.C3DEngine.h.a.c(R.string.public_action_cancel), new i());
        ScrollView scrollView = (ScrollView) LayoutInflater.from(com.censivn.C3DEngine.a.c()).inflate(R.layout.setting_density, (ViewGroup) null);
        ImageView imageView = (ImageView) scrollView.findViewById(R.id.setting_scale_icon);
        h = imageView;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = (int) (com.censivn.C3DEngine.a.a * 128.0f);
        layoutParams.height = (int) (com.censivn.C3DEngine.a.a * 128.0f);
        h.setLayoutParams(layoutParams);
        g = (CheckBox) scrollView.findViewById(R.id.setting_scale_checkbox);
        if (J != 0.0f) {
            g.setChecked(false);
            e = false;
            c = false;
        } else {
            g.setChecked(true);
            e = true;
            c = true;
        }
        g.setOnCheckedChangeListener(new j());
        TextView textView = (TextView) scrollView.findViewById(R.id.setting_scale_value);
        textView.setText(String.valueOf(com.censivn.C3DEngine.a.c));
        d = com.censivn.C3DEngine.a.c;
        b = com.censivn.C3DEngine.a.c;
        SeekBar seekBar = (SeekBar) scrollView.findViewById(R.id.setting_scale_seekbar);
        f = seekBar;
        seekBar.setMax(c(a));
        f.setProgress(c(com.censivn.C3DEngine.a.c));
        f.setOnSeekBarChangeListener(new k(textView));
        builder.setView(scrollView);
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(float f2) {
        return ((int) (10.0f * f2)) - 8;
    }
}
