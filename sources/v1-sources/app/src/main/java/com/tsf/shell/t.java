package com.tsf.shell;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
final class t implements DialogInterface.OnClickListener {
    final /* synthetic */ Home a;

    t(Home home) {
        this.a = home;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://market.android.com/details?id=" + this.a.getPackageName())));
        this.a.finish();
    }
}
