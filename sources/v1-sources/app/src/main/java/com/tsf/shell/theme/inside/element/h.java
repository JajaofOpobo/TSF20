package com.tsf.shell.theme.inside.element;

import com.tsf.shell.theme.inside.widget.SystemFolderTheme;

/* loaded from: classes.dex */
final class h implements Runnable {
    final /* synthetic */ g a;
    private final /* synthetic */ String b;

    h(g gVar, String str) {
        this.a = gVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SystemFolderTheme themeByThemePackagename;
        ThemeFolderManager themeFolderManager = this.a.a;
        themeByThemePackagename = this.a.a.getThemeByThemePackagename(this.b);
        themeFolderManager.startSetCustomTheme(themeByThemePackagename);
    }
}
