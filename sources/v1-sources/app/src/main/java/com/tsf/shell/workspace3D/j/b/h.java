package com.tsf.shell.workspace3D.j.b;

import android.content.Intent;
import com.tsf.shell.theme.inside.ThemeManager;

/* loaded from: classes.dex */
final class h extends com.tsf.shell.activity.a.a {
    final /* synthetic */ g a;

    h(g gVar) {
        this.a = gVar;
    }

    @Override // com.tsf.shell.activity.a.a
    public final void a(int i, Intent intent) {
        if (i == -1) {
            ThemeManager.mix.onSetDock(intent.getStringExtra("packagename"));
        }
    }
}
