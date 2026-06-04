package com.tsf.shell.workspace3D.k;

import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.au;

/* loaded from: classes.dex */
final class ai implements Runnable {
    final /* synthetic */ ah a;

    ai(ah ahVar) {
        this.a = ahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Home.d().b(this.a.ch().b);
        } catch (Exception e) {
            au.a(com.censivn.C3DEngine.a.c().getString(R.string.activity_not_found));
        }
    }
}
