package com.tsf.shell.plugin.theme;

import android.app.AlertDialog;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {
    a a;
    private final ThemeElementPicker b;

    public b(ThemeElementPicker themeElementPicker) {
        this.b = themeElementPicker;
    }

    public void a(ArrayList arrayList, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
        builder.setTitle(str);
        this.a = new a(this.b, 0, arrayList);
        builder.setAdapter(this.a, new d(this));
        builder.setOnCancelListener(new c(this));
        builder.create().show();
    }
}
