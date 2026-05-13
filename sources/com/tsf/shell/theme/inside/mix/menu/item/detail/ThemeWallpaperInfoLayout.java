package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.content.Context;
import com.tsf.C1306b;
import com.tsf.shell.plugin.themepicker.C3897k;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ThemeWallpaperInfoLayout extends ThemeDataInfoLayout {
    public ThemeWallpaperInfoLayout() {
        setTitle(C1306b.C1315i.text_wallpapers);
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout
    public ArrayList<Integer> getData(Context context) {
        return C3897k.m1230b(context);
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout
    public int getMaxItemCount() {
        return 5;
    }
}
