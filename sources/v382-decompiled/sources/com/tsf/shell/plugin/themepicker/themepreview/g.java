package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
class g extends BroadcastReceiver {
    final /* synthetic */ f a;

    g(f fVar) {
        this.a = fVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.tsf.shell.plugin.themepicker.g.b("PackageChangeReceiver ActionCode:" + intent.getAction());
        this.a.L();
    }
}
