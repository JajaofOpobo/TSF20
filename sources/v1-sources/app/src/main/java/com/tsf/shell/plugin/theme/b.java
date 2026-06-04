package com.tsf.shell.plugin.theme;

import android.app.AlertDialog;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {
    a a;
    private final ThemeElementPicker b;

    public b(ThemeElementPicker themeElementPicker) {
        this.b = themeElementPicker;
    }

    public final void a(ArrayList arrayList, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
        builder.setTitle(str);
        this.a = new a(this.b, arrayList);
        builder.setAdapter(this.a, new d(this));
        builder.setOnCancelListener(new c(this));
        builder.create().show();
    }
}
