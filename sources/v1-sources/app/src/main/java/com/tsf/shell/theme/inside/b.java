package com.tsf.shell.theme.inside;

import com.tsf.shell.R;
import com.tsf.shell.workspace3D.u;

/* loaded from: classes.dex */
final class b implements Runnable {
    final /* synthetic */ ThemeManager a;

    b(ThemeManager themeManager) {
        this.a = themeManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.a(com.censivn.C3DEngine.h.a.c(R.string.tsf_loading_content));
    }
}
