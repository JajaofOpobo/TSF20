package com.tsf.shell.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {
    public com.tsf.shell.services.a.a a;
    private e d;
    ServiceConnection b = new b(this);
    BroadcastReceiver c = new c(this);
    private ArrayList e = new ArrayList();

    public final void a(Context context, e eVar) {
        this.d = eVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tsf.shell.services.notifier.smsOnChange");
        intentFilter.addAction("com.tsf.shell.services.notifier.misscallOnChange");
        intentFilter.addAction("com.tsf.shell.services.notifier.eventOnchange");
        intentFilter.addAction("com.tsf.shell.services.notifier.gmailOnchange");
        context.registerReceiver(this.c, intentFilter);
    }

    public final void a(Context context, Runnable runnable) {
        if (this.a != null) {
            runnable.run();
            return;
        }
        this.e.add(runnable);
        Intent intent = new Intent("com.tsf.shell.services.notifier.CounterService");
        context.startService(intent);
        context.bindService(intent, this.b, 1);
    }
}
