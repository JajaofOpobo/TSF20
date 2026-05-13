package com.tsf.shell.services;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.censivn.C3DEngine.C0853a;
import com.tsf.C1305a;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.preference.SettingAdvancedPerferenceActivity;
import com.tsf.shell.utils.C4189x;
/* loaded from: classes.dex */
public class ForegroundService extends Service {

    /* renamed from: a */
    public String f13343a = ForegroundService.class.getSimpleName();

    /* renamed from: b */
    private final IBinder f13344b = new BinderC4089a();

    /* renamed from: com.tsf.shell.services.ForegroundService$a */
    /* loaded from: classes.dex */
    public class BinderC4089a extends Binder {
        public BinderC4089a() {
        }
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    /* renamed from: a */
    private boolean m780a() {
        return getSharedPreferences("config", 0).getBoolean("GDPREnable", false);
    }

    /* renamed from: a */
    private void m778a(String str) {
        if (C1305a.f4114a.booleanValue()) {
            Log.v("TSF", str);
        }
    }

    /* renamed from: a */
    void m779a(Intent intent) {
        Notification notification;
        if (!m780a()) {
            m778a("GDPR没有开启： ForegroundService不能执行任何命令");
            return;
        }
        m778a("GDPR已经开启： ForegroundService可以执行命令");
        if ("com.tsf.shell.services.FOREGROUND".equals(intent.getAction())) {
            String format = String.format(C4189x.m588c(C1306b.C1315i.launcher_running), Home.f7121b);
            if (Build.VERSION.SDK_INT < 18) {
                notification = new Notification(0, format, System.currentTimeMillis());
            } else {
                notification = new Notification(C1306b.C1310d.tsf_ico_grey, format, System.currentTimeMillis());
            }
            Intent intent2 = new Intent();
            intent2.setClass(C0853a.m10856d(), SettingAdvancedPerferenceActivity.class);
            intent2.putExtra("memory_pemanent", true);
            PendingIntent.getActivity(this, 0, intent2, 134217728);
            try {
                notification.getClass().getField("priority").setInt(notification, -2);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            } catch (NoSuchFieldException e3) {
                e3.printStackTrace();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            m779a(intent);
            return 1;
        }
        return 1;
    }

    @Override // android.app.Service
    public void onDestroy() {
        stopForeground(true);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f13344b;
    }
}
