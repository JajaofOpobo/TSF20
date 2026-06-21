package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import com.tsf.shell.plugin.themepicker.r;

/* loaded from: classes.dex */
public class l extends p {
    private static final int[] a = {r.theme_picker_theme_bottom_installed, r.theme_picker_theme_bottom_featured};
    private Context b;

    public l(android.support.v4.app.k kVar, Context context) {
        super(kVar);
        this.b = context;
    }

    @Override // android.support.v4.app.p
    public Fragment a(int i) {
        return i == 0 ? new f() : new i();
    }

    @Override // android.support.v4.view.ad, com.tsf.shell.activity.actionselector.d
    public int b() {
        return 2;
    }

    @Override // android.support.v4.view.ad
    public CharSequence c(int i) {
        return this.b.getString(a[i]);
    }
}
