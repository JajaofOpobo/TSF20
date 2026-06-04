package com.tsf.shell.workspace3D.j.b;

import com.tsf.shell.theme.inside.ThemeManager;

/* loaded from: classes.dex */
final class s implements Runnable {
    final /* synthetic */ d a;

    s(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThemeManager.mix.icon.startIconPackagePicker();
    }
}
