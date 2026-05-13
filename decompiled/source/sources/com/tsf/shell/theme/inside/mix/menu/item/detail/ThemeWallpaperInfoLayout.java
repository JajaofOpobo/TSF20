package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.content.Context;
import com.tsf.b;
import com.tsf.shell.plugin.themepicker.k;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ThemeWallpaperInfoLayout extends ThemeDataInfoLayout {
    public ThemeWallpaperInfoLayout() {
        setTitle(b.i.text_wallpapers);
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout
    public ArrayList<Integer> getData(Context context) {
        return k.b(context);
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout
    public int getMaxItemCount() {
        return 5;
    }
}
