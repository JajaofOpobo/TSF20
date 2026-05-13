package com.tsf.extend.theme.pull;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.tsf.extend.C1335b;
/* loaded from: classes.dex */
public class PullStubService extends Service {

    /* renamed from: a */
    private Context f5999a;

    /* renamed from: b */
    private long f6000b = 0;

    /* renamed from: c */
    private boolean f6001c = false;

    /* renamed from: d */
    private ServiceConnection f6002d = new ServiceConnection() { // from class: com.tsf.extend.theme.pull.PullStubService.1
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                PullStubService.this.m7209e();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    /* renamed from: a */
    public static void m7215a(Context context) {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f5999a = getApplicationContext();
        if (m7216a()) {
            m7213a("GDPR已经开启： PullStubService可以执行 onCreate-startAlarm");
            this.f6001c = true;
            m7212b();
            return;
        }
        m7213a("GDPR没有开启： PullStubService不能执行 onCreate-startAlarm");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        if (m7216a() && this.f6001c) {
            m7213a("GDPR已经开启：PullStubService可以执行 onDestroy-stopAlarm");
            m7211c();
            return;
        }
        m7213a("GDPR没有开启：PullStubService不能执行 onDestroy-stopAlarm");
    }

    /* renamed from: a */
    private boolean m7216a() {
        return getSharedPreferences("config", 0).getBoolean("GDPREnable", false);
    }

    /* renamed from: a */
    private void m7213a(String str) {
        if (C1335b.f4221a.booleanValue()) {
            Log.v("TSF", str);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (!m7216a()) {
            m7213a("GDPR没有开启：PullStubService不能执行命令");
            return super.onStartCommand(intent, i, i2);
        }
        m7213a("GDPR已经开启：PullStubService可以执行命令");
        if (!this.f6001c) {
            this.f6001c = true;
            m7212b();
        }
        int onStartCommand = super.onStartCommand(intent, i, i2);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f6000b >= 60000) {
            this.f6000b = currentTimeMillis;
            m7210d();
            return onStartCommand;
        }
        return onStartCommand;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* renamed from: b */
    private void m7212b() {
        C1873b.m7171a(getApplicationContext(), 7260000, PullStubService.class, "com.ksmoible.launcher.theme.pull.PullStubService");
    }

    /* renamed from: c */
    private void m7211c() {
        C1873b.m7169a(getApplicationContext(), PullStubService.class, "com.ksmoible.launcher.theme.pull.PullStubService");
    }

    /* renamed from: d */
    private void m7210d() {
        if (this.f5999a != null) {
            Context context = this.f5999a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m7209e() {
        if (this.f5999a != null) {
            this.f5999a.unbindService(this.f6002d);
        }
    }
}
