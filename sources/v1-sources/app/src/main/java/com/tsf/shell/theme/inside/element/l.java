package com.tsf.shell.theme.inside.element;

import com.tsf.shell.theme.inside.ThemeIconDescription;

/* loaded from: classes.dex */
final class l implements Runnable {
    final /* synthetic */ k a;
    private final /* synthetic */ String b;

    l(k kVar, String str) {
        this.a = kVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThemeIconDescription themeIconDescription;
        this.a.a.resetIconTheme();
        this.a.a.setIconFilterPackage(this.b, false);
        ThemeIconManager themeIconManager = this.a.a;
        themeIconDescription = this.a.a.mCustomThemeIconDescription;
        themeIconManager.startSetCustomIconFilter(themeIconDescription);
    }
}
