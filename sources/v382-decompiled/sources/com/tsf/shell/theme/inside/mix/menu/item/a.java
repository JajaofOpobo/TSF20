package com.tsf.shell.theme.inside.mix.menu.item;

import android.view.KeyEvent;
import com.censivn.C3DEngine.b.c.d;

/* loaded from: classes.dex */
class a implements d {
    final /* synthetic */ ThemeInstalledDetailMenu a;

    a(ThemeInstalledDetailMenu themeInstalledDetailMenu) {
        this.a = themeInstalledDetailMenu;
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void a(int i, KeyEvent keyEvent) {
        com.censivn.C3DEngine.b.b.a.d dVar;
        if (i == 4) {
            dVar = this.a.mDetailContainer;
            dVar.g();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void b(int i, KeyEvent keyEvent) {
    }
}
