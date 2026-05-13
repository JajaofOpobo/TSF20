package com.tsf.shell.widget.alarm.AlarmUtils;

import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.util.Log;
import com.tsf.shell.widget.alarm.i;
import com.tsf.shell.widget.alarm.m;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes.dex */
public class AlarmReceiver extends BroadcastReceiver {
    private void a(String str) {
        if (com.tsf.shell.widget.alarm.c.a.booleanValue()) {
            Log.v("TSF", str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Alarm alarm;
        Class<AlarmAlertFullScreen> cls;
        if (!context.getSharedPreferences("config", 0).getBoolean("GDPREnable", false)) {
            a("GDPR没有开启： AlarmReceiver - 不能执行命令");
            return;
        }
        a("GDPR已经开启： AlarmReceiver - 可以执行命令");
        if ("clear_notification".equals(intent.getAction())) {
            Intent intent2 = new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT");
            intent2.setPackage(context.getPackageName());
            context.stopService(intent2);
        } else if ("com.tsf.shell.widget.alarm.inshell.alarm_killed".equals(intent.getAction())) {
            a(context, (Alarm) intent.getParcelableExtra("intent.extra.alarm"), intent.getIntExtra("alarm_killed_timeout", -1));
        } else if ("com.tsf.shell.widget.alarm.inshell.cancel_snooze".equals(intent.getAction())) {
            c.a(context, -1, -1L);
        } else {
            byte[] byteArrayExtra = intent.getByteArrayExtra("intent.extra.alarm_raw");
            if (byteArrayExtra == null) {
                alarm = null;
            } else {
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
                obtain.setDataPosition(0);
                alarm = Alarm.CREATOR.createFromParcel(obtain);
            }
            if (alarm == null) {
                i.d("AlarmReceiver failed to parse the alarm from the intent");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            i.d("AlarmReceiver.onReceive() id " + alarm.a + " setFor " + new SimpleDateFormat("HH:mm:ss.SSS aaa").format(new Date(alarm.f)));
            if (currentTimeMillis > alarm.f + 1800000) {
                i.d("AlarmReceiver ignoring stale alarm");
                return;
            }
            a.a(context);
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            if (!((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                cls = AlarmAlertActivity.class;
            } else {
                cls = AlarmAlertFullScreen.class;
            }
            Intent intent3 = new Intent(context, cls);
            intent3.putExtra("intent.extra.alarm", alarm);
            intent3.setFlags(268697600);
            context.startActivity(intent3);
            c.b(context, alarm.a);
            if (!alarm.e.c()) {
                c.a(context, alarm.a, false);
            } else {
                c.d(context);
            }
            Intent intent4 = new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT");
            intent4.setPackage(context.getPackageName());
            intent4.putExtra("intent.extra.alarm", alarm);
            com.tsf.shell.component.a.a(context, intent4);
            Intent intent5 = new Intent(context, AlarmAlertActivity.class);
            intent5.putExtra("intent.extra.alarm", alarm);
            PendingIntent.getActivity(context, alarm.a, intent5, 0);
            String a = alarm.a(context);
            Notification.Builder builder = new Notification.Builder(context);
            builder.setSmallIcon(m.b.stat_notify_alarm);
            builder.setContentTitle(a);
            builder.setContentInfo(context.getString(m.f.alarm_notify_text));
            Intent intent6 = new Intent(context, AlarmReceiver.class);
            intent6.setAction("clear_notification");
            NotificationManager a2 = a(context);
            builder.setDeleteIntent(PendingIntent.getBroadcast(context, 0, intent6, 0));
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("1", "notification", 2);
                if (builder != null) {
                    builder.setChannelId("1");
                }
                if (a2 != null) {
                    a2.createNotificationChannel(notificationChannel);
                }
            }
            a2.notify(alarm.a, builder.build());
        }
    }

    private NotificationManager a(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }

    private void a(Context context, Alarm alarm, int i) {
        NotificationManager a = a(context);
        if (alarm == null) {
            i.d("Cannot update notification for killer callback");
            return;
        }
        PendingIntent.getActivity(context, alarm.a, new Intent(), 0);
        String a2 = alarm.a(context);
        Notification.Builder builder = new Notification.Builder(context);
        builder.setSmallIcon(m.b.stat_notify_alarm);
        builder.setContentTitle(a2);
        builder.setContentInfo(context.getString(m.f.alarm_alert_alert_silenced, Integer.valueOf(i)));
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("1", "notification", 2);
            if (builder != null) {
                builder.setChannelId("1");
            }
            if (a != null) {
                a.createNotificationChannel(notificationChannel);
            }
        }
        builder.build();
        a.notify(alarm.a, builder.getNotification());
    }
}
