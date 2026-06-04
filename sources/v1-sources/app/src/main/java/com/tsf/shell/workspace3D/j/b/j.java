package com.tsf.shell.workspace3D.j.b;

import android.content.Intent;
import android.os.Parcelable;
import com.tsf.shell.Home;
import com.tsf.shell.plugin.theme.ThemeElementPicker;
import com.tsf.shell.plugin.theme.ThemeElementSubItem;
import com.tsf.shell.theme.inside.ThemeDescription;
import com.tsf.shell.theme.inside.ThemeManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
final class j implements Runnable {
    final /* synthetic */ i a;

    j(i iVar) {
        this.a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList themeDescriptionList = ThemeManager.getInstance().getThemeDescriptionList();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = themeDescriptionList.iterator();
        while (it.hasNext()) {
            ThemeDescription themeDescription = (ThemeDescription) it.next();
            if (themeDescription.shell != null && !themeDescription.shell.isSystem) {
                arrayList.add(new ThemeElementSubItem(4, themeDescription.themeName, themeDescription.packagename, new String[]{themeDescription.shell.menuToolButton}, "theme/shell", themeDescription.isSecondParserMode));
            } else if (themeDescription.shell == null) {
                String str = themeDescription.packagename == null ? "null" : themeDescription.packagename;
                HashMap hashMap = new HashMap();
                hashMap.put("ThemesMixManager.TYPE_MENU theme.shell==null  line  842", "errorString:theme.shell == null  packagename:" + str);
                com.flurry.android.t.a("EVENT_ISSUSE_SETTING_THEMES_MIX", hashMap);
            }
        }
        ThemeDescription systemThemeDescription = ThemeManager.getInstance().getSystemThemeDescription();
        arrayList.add(0, new ThemeElementSubItem(4, systemThemeDescription.themeName, systemThemeDescription.packagename, new String[]{systemThemeDescription.shell.menuToolButton}, "theme/shell", systemThemeDescription.isSecondParserMode));
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("data", arrayList);
        intent.putExtra("title", ThemeManager.mix.getSettingButtonName(4));
        intent.setClass(Home.d(), ThemeElementPicker.class);
        new k(this).a(intent);
    }
}
