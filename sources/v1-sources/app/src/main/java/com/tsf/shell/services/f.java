package com.tsf.shell.services;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* loaded from: classes.dex */
public final class f implements j {
    private Context b;
    private ForegroundService c;
    private String a = "ForegroundClient";
    private ServiceConnection d = new g(this);

    public f(Context context) {
        this.b = context;
    }

    public final void a() {
        this.b.bindService(new Intent(this.b, (Class<?>) ForegroundService.class), this.d, 1);
    }

    public final void b() {
        Intent intent = new Intent("com.tsf.shell.services.FOREGROUND");
        intent.setClass(this.b, ForegroundService.class);
        this.b.startService(intent);
    }
}
