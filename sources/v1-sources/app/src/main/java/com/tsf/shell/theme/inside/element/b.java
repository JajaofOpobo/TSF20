package com.tsf.shell.theme.inside.element;

import com.tsf.shell.theme.inside.widget.SystemContactTheme;

/* loaded from: classes.dex */
final class b implements Runnable {
    final /* synthetic */ a a;
    private final /* synthetic */ String b;

    b(a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SystemContactTheme themeByThemePackagename;
        ThemeContactManager themeContactManager = this.a.a;
        themeByThemePackagename = this.a.a.getThemeByThemePackagename(this.b);
        themeContactManager.startSetCustomTheme(themeByThemePackagename);
    }
}
