package com.tsf.shell;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class ba implements DialogInterface.OnClickListener {
    private final /* synthetic */ Runnable a;

    ba(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a != null) {
            this.a.run();
        }
    }
}
