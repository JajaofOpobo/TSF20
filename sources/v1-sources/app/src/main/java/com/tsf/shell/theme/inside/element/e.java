package com.tsf.shell.theme.inside.element;

import com.tsf.shell.theme.inside.ThemeDockDescription;

/* loaded from: classes.dex */
final class e implements Runnable {
    final /* synthetic */ d a;
    private final /* synthetic */ String b;

    e(d dVar, String str) {
        this.a = dVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThemeDockDescription themeByThemePackagename;
        ThemeDockManager themeDockManager = this.a.a;
        themeByThemePackagename = this.a.a.getThemeByThemePackagename(this.b);
        themeDockManager.startSetCustomTheme(themeByThemePackagename);
    }
}
