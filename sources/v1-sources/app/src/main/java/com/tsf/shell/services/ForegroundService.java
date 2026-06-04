package com.tsf.shell.services;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.tsf.shell.Home;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class ForegroundService extends Service {
    public String a = ForegroundService.class.getSimpleName();
    private final IBinder b = new i(this);
    private j c;

    public final void a(j jVar) {
        this.c = jVar;
        if (this.c != null) {
            new h(this).start();
        }
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && "com.tsf.shell.services.FOREGROUND".equals(intent.getAction())) {
            Notification notification = Build.VERSION.SDK_INT < 18 ? new Notification(0, "TSFShell Running", System.currentTimeMillis()) : new Notification(R.drawable.tsf_ico_grey, "TSFShell Running", System.currentTimeMillis());
            notification.setLatestEventInfo(this, "TSF SHELL", "TSFShell Running", PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) Home.class), 0));
            startForeground(R.string.app_name, notification);
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

    public static void a() {
    }
}
