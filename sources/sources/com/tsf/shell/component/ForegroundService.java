package com.tsf.shell.component;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.MessageQueue;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ForegroundService extends Service {
    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("default_channelId", "default_channelId", 2));
            startForeground(100, new Notification.Builder(this, "default_channelId").build());
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            try {
                startService((Intent) intent.getParcelableExtra("cml_intent"));
                startForeground(100, new Notification());
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.tsf.shell.component.ForegroundService.1
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        ForegroundService.this.stopSelf();
                        return false;
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }
}
