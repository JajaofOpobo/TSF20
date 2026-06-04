package com.tsf.shell;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class ay implements DialogInterface.OnClickListener {
    final /* synthetic */ ax a;
    private final /* synthetic */ Runnable b;

    ay(ax axVar, Runnable runnable) {
        this.a = axVar;
        this.b = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b != null) {
            this.b.run();
        }
    }
}
