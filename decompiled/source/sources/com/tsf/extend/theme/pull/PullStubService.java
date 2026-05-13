package com.tsf.extend.theme.pull;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
/* loaded from: classes.dex */
public class PullStubService extends Service {
    private Context a;
    private long b = 0;
    private boolean c = false;
    private ServiceConnection d = new ServiceConnection() { // from class: com.tsf.extend.theme.pull.PullStubService.1
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                PullStubService.this.e();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    public static void a(Context context) {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a = getApplicationContext();
        if (a()) {
            a("GDPR已经开启： PullStubService可以执行 onCreate-startAlarm");
            this.c = true;
            b();
            return;
        }
        a("GDPR没有开启： PullStubService不能执行 onCreate-startAlarm");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        if (a() && this.c) {
            a("GDPR已经开启：PullStubService可以执行 onDestroy-stopAlarm");
            c();
            return;
        }
        a("GDPR没有开启：PullStubService不能执行 onDestroy-stopAlarm");
    }

    private boolean a() {
        return getSharedPreferences("config", 0).getBoolean("GDPREnable", false);
    }

    private void a(String str) {
        if (com.tsf.extend.b.a.booleanValue()) {
            Log.v("TSF", str);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (!a()) {
            a("GDPR没有开启：PullStubService不能执行命令");
            return super.onStartCommand(intent, i, i2);
        }
        a("GDPR已经开启：PullStubService可以执行命令");
        if (!this.c) {
            this.c = true;
            b();
        }
        int onStartCommand = super.onStartCommand(intent, i, i2);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.b >= 60000) {
            this.b = currentTimeMillis;
            d();
            return onStartCommand;
        }
        return onStartCommand;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void b() {
        b.a(getApplicationContext(), 7260000, PullStubService.class, "com.ksmoible.launcher.theme.pull.PullStubService");
    }

    private void c() {
        b.a(getApplicationContext(), PullStubService.class, "com.ksmoible.launcher.theme.pull.PullStubService");
    }

    private void d() {
        if (this.a != null) {
            Context context = this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.a != null) {
            this.a.unbindService(this.d);
        }
    }
}
