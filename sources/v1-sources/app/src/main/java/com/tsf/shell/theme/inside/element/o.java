package com.tsf.shell.theme.inside.element;

import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
final class o implements Runnable {
    final /* synthetic */ n a;
    private final /* synthetic */ String b;

    o(n nVar, String str) {
        this.a = nVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThemeShellDescription themeByThemePackagename;
        ThemeMenuManager themeMenuManager = this.a.a;
        themeByThemePackagename = this.a.a.getThemeByThemePackagename(this.b);
        themeMenuManager.startSetCustomTheme(themeByThemePackagename);
    }
}
