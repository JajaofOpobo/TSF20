package com.tsf.shell.workspace3D.j;

import android.view.View;

/* loaded from: classes.dex */
final class d implements Runnable {
    final /* synthetic */ a a;

    d(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        view = this.a.e;
        if (view != null) {
            a.f(this.a);
        }
    }
}
