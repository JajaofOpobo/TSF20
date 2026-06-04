package com.tsf.shell.a;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class n implements DialogInterface.OnClickListener {
    private final /* synthetic */ Runnable a;

    n(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a != null) {
            this.a.run();
        }
    }
}
