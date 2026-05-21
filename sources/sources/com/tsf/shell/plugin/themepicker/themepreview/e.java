package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.o;
import android.support.v4.app.r;
import com.tsf.shell.plugin.themepicker.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends r {
    private static final int[] a = {f.j.theme_picker_theme_bottom_installed, f.j.theme_picker_theme_bottom_featured};
    private Context b;

    public e(o oVar, Context context) {
        super(oVar);
        this.b = context;
    }

    @Override // android.support.v4.app.r
    public Fragment a(int i) {
        return i == 0 ? new c() : new d();
    }

    @Override // android.support.v4.view.ac
    public int b() {
        return 2;
    }

    @Override // android.support.v4.view.ac
    public CharSequence c(int i) {
        return this.b.getString(a[i]);
    }
}
