package com.tsf.shell.workspace3D.g;

import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class t implements Runnable {
    final /* synthetic */ p a;
    private final /* synthetic */ boolean b;

    t(p pVar, boolean z) {
        this.a = pVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bf.m().a(new u(this, this.b));
    }
}
