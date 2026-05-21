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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AlarmReceiver extends BroadcastReceiver {
    private void a(String str) {
        if (com.tsf.shell.widget.alarm.c.a.booleanValue()) {
            Log.v("TSF", str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Alarm alarmCreateFromParcel;
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
            return;
        }
        if ("com.tsf.shell.widget.alarm.inshell.alarm_killed".equals(intent.getAction())) {
            a(context, (Alarm) intent.getParcelableExtra("intent.extra.alarm"), intent.getIntExtra("alarm_killed_timeout", -1));
            return;
        }
        if ("com.tsf.shell.widget.alarm.inshell.cancel_snooze".equals(intent.getAction())) {
            c.a(context, -1, -1L);
            return;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("intent.extra.alarm_raw");
        if (byteArrayExtra == null) {
            alarmCreateFromParcel = null;
        } else {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            parcelObtain.setDataPosition(0);
            alarmCreateFromParcel = Alarm.CREATOR.createFromParcel(parcelObtain);
        }
        if (alarmCreateFromParcel == null) {
            i.d("AlarmReceiver failed to parse the alarm from the intent");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        i.d("AlarmReceiver.onReceive() id " + alarmCreateFromParcel.a + " setFor " + new SimpleDateFormat("HH:mm:ss.SSS aaa").format(new Date(alarmCreateFromParcel.f)));
        if (jCurrentTimeMillis > alarmCreateFromParcel.f + 1800000) {
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
        intent3.putExtra("intent.extra.alarm", alarmCreateFromParcel);
        intent3.setFlags(268697600);
        context.startActivity(intent3);
        c.b(context, alarmCreateFromParcel.a);
        if (!alarmCreateFromParcel.e.c()) {
            c.a(context, alarmCreateFromParcel.a, false);
        } else {
            c.d(context);
        }
        Intent intent4 = new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT");
        intent4.setPackage(context.getPackageName());
        intent4.putExtra("intent.extra.alarm", alarmCreateFromParcel);
        com.tsf.shell.component.a.a(context, intent4);
        Intent intent5 = new Intent(context, (Class<?>) AlarmAlertActivity.class);
        intent5.putExtra("intent.extra.alarm", alarmCreateFromParcel);
        PendingIntent.getActivity(context, alarmCreateFromParcel.a, intent5, 0);
        String strA = alarmCreateFromParcel.a(context);
        Notification.Builder builder = new Notification.Builder(context);
        builder.setSmallIcon(m.b.stat_notify_alarm);
        builder.setContentTitle(strA);
        builder.setContentInfo(context.getString(m.f.alarm_notify_text));
        Intent intent6 = new Intent(context, (Class<?>) AlarmReceiver.class);
        intent6.setAction("clear_notification");
        NotificationManager notificationManagerA = a(context);
        builder.setDeleteIntent(PendingIntent.getBroadcast(context, 0, intent6, 0));
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("1", "notification", 2);
            if (builder != null) {
                builder.setChannelId("1");
            }
            if (notificationManagerA != null) {
                notificationManagerA.createNotificationChannel(notificationChannel);
            }
        }
        notificationManagerA.notify(alarmCreateFromParcel.a, builder.build());
    }

    private NotificationManager a(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }

    private void a(Context context, Alarm alarm, int i) {
        NotificationManager notificationManagerA = a(context);
        if (alarm == null) {
            i.d("Cannot update notification for killer callback");
            return;
        }
        PendingIntent.getActivity(context, alarm.a, new Intent(), 0);
        String strA = alarm.a(context);
        Notification.Builder builder = new Notification.Builder(context);
        builder.setSmallIcon(m.b.stat_notify_alarm);
        builder.setContentTitle(strA);
        builder.setContentInfo(context.getString(m.f.alarm_alert_alert_silenced, Integer.valueOf(i)));
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("1", "notification", 2);
            if (builder != null) {
                builder.setChannelId("1");
            }
            if (notificationManagerA != null) {
                notificationManagerA.createNotificationChannel(notificationChannel);
            }
        }
        builder.build();
        notificationManagerA.notify(alarm.a, builder.getNotification());
    }
}
