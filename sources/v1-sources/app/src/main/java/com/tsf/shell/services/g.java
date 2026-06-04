package com.tsf.shell.services;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
final class g implements ServiceConnection {
    final /* synthetic */ f a;

    g(f fVar) {
        this.a = fVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ForegroundService foregroundService;
        this.a.c = ((i) iBinder).a();
        foregroundService = this.a.c;
        foregroundService.a(this.a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ForegroundService foregroundService;
        this.a.c = null;
        foregroundService = this.a.c;
        foregroundService.a(null);
    }
}
