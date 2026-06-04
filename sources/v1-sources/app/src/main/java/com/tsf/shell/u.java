package com.tsf.shell;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class u implements DialogInterface.OnClickListener {
    final /* synthetic */ Home a;

    u(Home home) {
        this.a = home;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }
}
