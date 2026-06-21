package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
class j extends BroadcastReceiver {
    final /* synthetic */ i a;

    j(i iVar) {
        this.a = iVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.tsf.shell.plugin.themepicker.g.b("PackageChangeReceiver ActionCode:" + intent.getAction());
        this.a.L();
    }
}
