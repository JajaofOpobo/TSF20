package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.content.Context;
import com.tsf.C1306b;
import com.tsf.shell.plugin.themepicker.C3897k;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ThemePreviewInfoLayout extends ThemeDataInfoLayout {
    public ThemePreviewInfoLayout() {
        setTitle(C1306b.C1315i.text_preview);
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout
    public ArrayList<Integer> getData(Context context) {
        return C3897k.m1238a(context);
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout
    public int getMaxItemCount() {
        return 5;
    }
}
