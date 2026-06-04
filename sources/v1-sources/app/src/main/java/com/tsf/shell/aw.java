package com.tsf.shell;

import android.widget.Toast;

/* loaded from: classes.dex */
final class aw implements Runnable {
    private final /* synthetic */ int a;

    aw(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(com.censivn.C3DEngine.a.c(), com.censivn.C3DEngine.a.c().getString(this.a), 0).show();
    }
}
