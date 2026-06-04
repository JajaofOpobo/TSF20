package com.tsf.shell.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class c extends BroadcastReceiver {
    final /* synthetic */ a a;

    c(a aVar) {
        this.a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.a(com.censivn.C3DEngine.a.c(), new d(this, intent.getAction()));
    }
}
