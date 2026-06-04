package com.tsf.shell.workspace3D.k.b;

import com.tsf.shell.Home;

/* loaded from: classes.dex */
final class d implements Runnable {
    private final /* synthetic */ String a;

    d(String str) {
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.g.d.a(Home.d(), this.a);
    }
}
