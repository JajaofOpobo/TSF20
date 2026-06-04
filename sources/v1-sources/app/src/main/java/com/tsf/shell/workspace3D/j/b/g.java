package com.tsf.shell.workspace3D.j.b;

import android.content.Intent;
import android.os.Parcelable;
import com.tsf.shell.Home;
import com.tsf.shell.plugin.theme.ThemeElementPicker;
import com.tsf.shell.plugin.theme.ThemeElementSubItem;
import com.tsf.shell.theme.inside.ThemeDescription;
import com.tsf.shell.theme.inside.ThemeManager;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class g implements Runnable {
    final /* synthetic */ f a;

    g(f fVar) {
        this.a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList themeDescriptionList = ThemeManager.getInstance().getThemeDescriptionList();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = themeDescriptionList.iterator();
        while (it.hasNext()) {
            ThemeDescription themeDescription = (ThemeDescription) it.next();
            if (themeDescription.shell != null && !themeDescription.shell.isSystem) {
                arrayList.add(new ThemeElementSubItem(1, themeDescription.themeName, themeDescription.packagename, new String[]{themeDescription.dock.dockBar, themeDescription.dock.dockDesktopSelectorButtonOff}, "theme/shell", themeDescription.isSecondParserMode));
            }
        }
        ThemeDescription systemThemeDescription = ThemeManager.getInstance().getSystemThemeDescription();
        arrayList.add(0, new ThemeElementSubItem(1, systemThemeDescription.themeName, systemThemeDescription.packagename, new String[]{systemThemeDescription.dock.dockBar, systemThemeDescription.dock.dockDesktopSelectorButtonOff}, "theme/shell", systemThemeDescription.isSecondParserMode));
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("data", arrayList);
        intent.putExtra("title", ThemeManager.mix.getSettingButtonName(1));
        intent.setClass(Home.d(), ThemeElementPicker.class);
        new h(this).a(intent);
    }
}
