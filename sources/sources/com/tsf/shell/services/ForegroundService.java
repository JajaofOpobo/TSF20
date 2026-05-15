package com.tsf.shell.services;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.preference.SettingAdvancedPerferenceActivity;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ForegroundService extends Service {
    public String a = ForegroundService.class.getSimpleName();
    private final IBinder b = new a();

    public class a extends Binder {
        public a() {
        }
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    private boolean a() {
        return getSharedPreferences("config", 0).getBoolean("GDPREnable", false);
    }

    private void a(String str) {
        if (com.tsf.a.a.booleanValue()) {
            Log.v("TSF", str);
        }
    }

    void a(Intent intent) {
        Notification notification;
        if (!a()) {
            a("GDPR没有开启： ForegroundService不能执行任何命令");
            return;
        }
        a("GDPR已经开启： ForegroundService可以执行命令");
        if ("com.tsf.shell.services.FOREGROUND".equals(intent.getAction())) {
            String str = String.format(x.c(b.i.launcher_running), Home.b);
            if (Build.VERSION.SDK_INT < 18) {
                notification = new Notification(0, str, System.currentTimeMillis());
            } else {
                notification = new Notification(b.d.tsf_ico_grey, str, System.currentTimeMillis());
            }
            Intent intent2 = new Intent();
            intent2.setClass(com.censivn.C3DEngine.a.d(), SettingAdvancedPerferenceActivity.class);
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
            a(intent);
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
        return this.b;
    }
}
