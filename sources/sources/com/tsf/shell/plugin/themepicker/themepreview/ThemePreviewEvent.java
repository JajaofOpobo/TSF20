package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.o;
import android.support.v4.app.r;
import com.tsf.shell.plugin.themepicker.ThemePickerResources;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemePreviewEvent extends ThemePreviewResult {
    private static final int[] a = {f.j.theme_picker_theme_bottom_installed, f.j.theme_picker_theme_bottom_featured};
    private Context b;

    public ThemePreviewEvent(o oVar, Context context) {
        super(oVar);
        this.b = context;
    }

    @Override // android.support.v4.app.r
    public Fragment c() {
        return i == 0 ? new ThemePreviewRenderer() : new ThemePreviewPanel();
    }

    @Override // android.support.v4.view.ac
    public int b() {
        return 2;
    }

    @Override // android.support.v4.view.ac
    public CharSequence c() {
        return this.b.getString(a[i]);
    }
}
