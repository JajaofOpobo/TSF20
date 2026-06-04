package com.tsf.shell.theme.inside.element;

import com.tsf.shell.R;
import com.tsf.shell.workspace3D.u;

/* loaded from: classes.dex */
final class a implements Runnable {
    final /* synthetic */ ThemeContactManager a;
    private final /* synthetic */ String b;

    a(ThemeContactManager themeContactManager, String str) {
        this.a = themeContactManager;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.a(com.censivn.C3DEngine.h.a.c(R.string.tsf_loading_content));
        com.censivn.C3DEngine.a.a().b(new b(this, this.b), 100L);
    }
}
