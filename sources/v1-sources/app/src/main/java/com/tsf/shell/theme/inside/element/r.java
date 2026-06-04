package com.tsf.shell.theme.inside.element;

import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class r implements Runnable {
    final /* synthetic */ q a;
    private final /* synthetic */ String b;

    r(q qVar, String str) {
        this.a = qVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThemeShellDescription themeByThemePackagename;
        ThemePageManager themePageManager = this.a.a;
        themeByThemePackagename = this.a.a.getThemeByThemePackagename(this.b);
        themePageManager.startSetCustomTheme(themeByThemePackagename);
    }
}
