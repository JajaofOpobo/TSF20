package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.content.Context;
import com.tsf.shell.R;
import com.tsf.shell.plugin.themepicker.ac;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ThemeWallpaperInfoLayout extends ThemeDataInfoLayout {
    public ThemeWallpaperInfoLayout() {
        setTitle(R.string.text_wallpapers);
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout
    public ArrayList getData(Context context) {
        return ac.b(context);
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout
    public int getMaxItemCount() {
        return 5;
    }
}
