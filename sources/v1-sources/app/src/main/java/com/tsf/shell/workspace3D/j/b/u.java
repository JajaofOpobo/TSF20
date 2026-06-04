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
final class u implements Runnable {
    final /* synthetic */ t a;

    u(t tVar) {
        this.a = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList themeDescriptionList = ThemeManager.getInstance().getThemeDescriptionList();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = themeDescriptionList.iterator();
        while (it.hasNext()) {
            ThemeDescription themeDescription = (ThemeDescription) it.next();
            if (themeDescription.widget != null && themeDescription.widget.folder != null && !themeDescription.widget.folder.isSystem) {
                arrayList.add(new ThemeElementSubItem(2, themeDescription.themeName, themeDescription.packagename, new String[]{themeDescription.widget.folder.icon}, "theme/widget/com.tsf.shell.widget.folder", themeDescription.isSecondParserMode));
            }
        }
        ThemeDescription systemThemeDescription = ThemeManager.getInstance().getSystemThemeDescription();
        arrayList.add(0, new ThemeElementSubItem(2, systemThemeDescription.themeName, systemThemeDescription.packagename, new String[]{systemThemeDescription.widget.folder.icon}, "theme/widget/com.tsf.shell.widget.folder", systemThemeDescription.isSecondParserMode));
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("data", arrayList);
        intent.putExtra("title", ThemeManager.mix.getSettingButtonName(2));
        intent.setClass(Home.d(), ThemeElementPicker.class);
        new v(this).a(intent);
    }
}
