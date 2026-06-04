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
final class x implements Runnable {
    final /* synthetic */ w a;

    x(w wVar) {
        this.a = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList themeDescriptionList = ThemeManager.getInstance().getThemeDescriptionList();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = themeDescriptionList.iterator();
        while (it.hasNext()) {
            ThemeDescription themeDescription = (ThemeDescription) it.next();
            if (themeDescription.widget != null && themeDescription.widget.contact != null && !themeDescription.widget.contact.isSystem) {
                arrayList.add(new ThemeElementSubItem(3, themeDescription.themeName, themeDescription.packagename, new String[]{themeDescription.widget.contact.icon}, "theme/widget/com.tsf.shell.widget.contact", themeDescription.isSecondParserMode));
            }
        }
        ThemeDescription systemThemeDescription = ThemeManager.getInstance().getSystemThemeDescription();
        arrayList.add(0, new ThemeElementSubItem(3, systemThemeDescription.themeName, systemThemeDescription.packagename, new String[]{systemThemeDescription.widget.contact.icon}, "theme/widget/com.tsf.shell.widget.contact", systemThemeDescription.isSecondParserMode));
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("data", arrayList);
        intent.putExtra("title", ThemeManager.mix.getSettingButtonName(3));
        intent.setClass(Home.d(), ThemeElementPicker.class);
        new y(this).a(intent);
    }
}
