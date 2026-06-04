package com.tsf.shell.workspace3D.j;

import android.content.SharedPreferences;
import com.tsf.shell.theme.inside.ThemeManager;

/* loaded from: classes.dex */
final class aj implements Runnable {
    final /* synthetic */ n a;

    aj(n nVar) {
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.setting.e eVar;
        com.tsf.shell.setting.e eVar2;
        eVar = this.a.k;
        if (eVar.aG()) {
            eVar2 = this.a.k;
            eVar2.aH();
            int i = ThemeManager.VERSION_CODE;
            SharedPreferences.Editor c = com.tsf.shell.a.x.c();
            c.putInt("setting_theme_version_code", i);
            c.commit();
        }
        ThemeManager.mix.ui.a();
    }
}
