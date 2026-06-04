package com.flurry.android;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
final class ec implements DialogInterface.OnShowListener {
    private /* synthetic */ de a;

    ec(de deVar) {
        this.a = deVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        dialog = this.a.a.r;
        if (dialog != null) {
            dialog2 = this.a.a.r;
            dialog2.hide();
        }
    }
}
