package com.tsf.shell.theme.inside.element;

import com.tsf.shell.theme.inside.ThemeManager;

/* loaded from: classes.dex */
final class j implements Runnable {
    final /* synthetic */ ThemeIconManager a;
    private final /* synthetic */ String b;

    j(ThemeIconManager themeIconManager, String str) {
        this.a = themeIconManager;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThemeManager.mix.onSetIconTheme(this.b);
    }
}
