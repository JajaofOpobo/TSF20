package com.tsf.shell.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    private Context a;
    private ServiceConnection b = new ServiceConnection() { // from class: com.tsf.shell.services.b.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    public b(Context context) {
        this.a = context;
    }

    public void a() {
        this.a.bindService(new Intent(this.a, (Class<?>) ForegroundService.class), this.b, 1);
    }

    public void b() {
        this.a.unbindService(this.b);
    }

    public void c() {
        Intent intent = new Intent("com.tsf.shell.services.FOREGROUND");
        intent.setClass(this.a, ForegroundService.class);
        this.a.startService(intent);
    }

    public void d() {
        Intent intent = new Intent("com.tsf.shell.services.FOREGROUND");
        intent.setClass(this.a, ForegroundService.class);
        this.a.stopService(intent);
    }
}
