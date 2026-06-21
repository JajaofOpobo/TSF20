package com.tsf.shell.services;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.preference.SettingAdvancedPerferenceActivity;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class ForegroundService extends Service {
    public String a = ForegroundService.class.getSimpleName();
    private final IBinder b = new d(this);

    @Override // android.app.Service
    public void onCreate() {
    }

    void a(Intent intent) {
        Notification notification;
        if ("com.tsf.shell.services.FOREGROUND".equals(intent.getAction())) {
            String format = String.format(x.c(R.string.launcher_running), Home.b);
            if (Build.VERSION.SDK_INT < 18) {
                notification = new Notification(0, format, System.currentTimeMillis());
            } else {
                notification = new Notification(R.drawable.tsf_ico_grey, format, System.currentTimeMillis());
            }
            Intent intent2 = new Intent();
            intent2.setClass(com.censivn.C3DEngine.a.d(), SettingAdvancedPerferenceActivity.class);
            intent2.putExtra("memory_pemanent", true);
            notification.setLatestEventInfo(this, format, x.c(R.string.tsf_shell_notification_touch), PendingIntent.getActivity(this, 0, intent2, 134217728));
            try {
                notification.getClass().getField("priority").setInt(notification, -2);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            } catch (NoSuchFieldException e3) {
                e3.printStackTrace();
            }
            startForeground(R.string.app_name, notification);
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
