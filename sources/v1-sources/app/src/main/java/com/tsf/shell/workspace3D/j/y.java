package com.tsf.shell.workspace3D.j;

import android.content.SharedPreferences;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class y implements Runnable {
    final /* synthetic */ n a;

    y(n nVar) {
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.setting.e eVar;
        com.tsf.shell.setting.e eVar2;
        eVar = this.a.s;
        if (eVar.aG()) {
            eVar2 = this.a.s;
            eVar2.aH();
            SharedPreferences.Editor c = com.tsf.shell.a.x.c();
            c.putInt("setting_effect_version_code", 1);
            c.commit();
        }
        bf.j().g().a();
    }
}
