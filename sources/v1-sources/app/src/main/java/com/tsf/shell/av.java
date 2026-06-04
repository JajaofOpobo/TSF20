package com.tsf.shell;

import android.widget.Toast;

/* loaded from: classes.dex */
final class av implements Runnable {
    private final /* synthetic */ String a;

    av(String str) {
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(com.censivn.C3DEngine.a.c(), this.a, 0).show();
    }
}
