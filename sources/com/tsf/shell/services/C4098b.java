package com.tsf.shell.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
/* renamed from: com.tsf.shell.services.b */
/* loaded from: classes.dex */
public class C4098b {

    /* renamed from: a */
    private Context f13358a;

    /* renamed from: b */
    private ServiceConnection f13359b = new ServiceConnection() { // from class: com.tsf.shell.services.b.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    public C4098b(Context context) {
        this.f13358a = context;
    }

    /* renamed from: a */
    public void m754a() {
        this.f13358a.bindService(new Intent(this.f13358a, ForegroundService.class), this.f13359b, 1);
    }

    /* renamed from: b */
    public void m753b() {
        this.f13358a.unbindService(this.f13359b);
    }

    /* renamed from: c */
    public void m752c() {
        Intent intent = new Intent("com.tsf.shell.services.FOREGROUND");
        intent.setClass(this.f13358a, ForegroundService.class);
        this.f13358a.startService(intent);
    }

    /* renamed from: d */
    public void m751d() {
        Intent intent = new Intent("com.tsf.shell.services.FOREGROUND");
        intent.setClass(this.f13358a, ForegroundService.class);
        this.f13358a.stopService(intent);
    }
}
