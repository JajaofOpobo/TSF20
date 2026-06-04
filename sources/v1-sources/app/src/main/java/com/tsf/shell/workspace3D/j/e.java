package com.tsf.shell.workspace3D.j;

import android.view.View;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class e implements Runnable {
    final /* synthetic */ a a;

    e(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        view = this.a.e;
        if (view == null) {
            return;
        }
        bf.m().a(this.a.e);
    }
}
