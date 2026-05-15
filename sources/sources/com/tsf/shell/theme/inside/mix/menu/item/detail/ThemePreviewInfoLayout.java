package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.content.Context;
import com.tsf.b;
import com.tsf.shell.plugin.themepicker.k;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemePreviewInfoLayout extends ThemeDataInfoLayout {
    public ThemePreviewInfoLayout() {
        setTitle(b.i.text_preview);
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout
    public ArrayList<Integer> getData(Context context) {
        return k.a(context);
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.detail.ThemeDataInfoLayout
    public int getMaxItemCount() {
        return 5;
    }
}
