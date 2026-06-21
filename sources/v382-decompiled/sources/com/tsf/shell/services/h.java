package com.tsf.shell.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
class h extends BroadcastReceiver {
    final /* synthetic */ f a;

    h(f fVar) {
        this.a = fVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.tsf.shell.manager.a.d.c.a(intent.getAction(), intent.getExtras().getInt("status"));
    }
}
