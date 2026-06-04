package com.tsf.shell.theme.inside.element;

import com.tsf.shell.R;
import com.tsf.shell.workspace3D.u;

/* loaded from: classes.dex */
final class n implements Runnable {
    final /* synthetic */ ThemeMenuManager a;
    private final /* synthetic */ String b;

    n(ThemeMenuManager themeMenuManager, String str) {
        this.a = themeMenuManager;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.a(com.censivn.C3DEngine.h.a.c(R.string.tsf_loading_content));
        com.censivn.C3DEngine.a.a().b(new o(this, this.b), 100L);
    }
}
