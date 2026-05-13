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
import com.tsf.shell.component.C2233a;
import com.tsf.shell.widget.alarm.C4266c;
import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.C4314m;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes.dex */
public class AlarmReceiver extends BroadcastReceiver {
    /* renamed from: a */
    private void m449a(String str) {
        if (C4266c.f13845a.booleanValue()) {
            Log.v("TSF", str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Alarm alarm;
        Class<AlarmAlertFullScreen> cls;
        if (!context.getSharedPreferences("config", 0).getBoolean("GDPREnable", false)) {
            m449a("GDPR没有开启： AlarmReceiver - 不能执行命令");
            return;
        }
        m449a("GDPR已经开启： AlarmReceiver - 可以执行命令");
        if ("clear_notification".equals(intent.getAction())) {
            Intent intent2 = new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT");
            intent2.setPackage(context.getPackageName());
            context.stopService(intent2);
        } else if ("com.tsf.shell.widget.alarm.inshell.alarm_killed".equals(intent.getAction())) {
            m450a(context, (Alarm) intent.getParcelableExtra("intent.extra.alarm"), intent.getIntExtra("alarm_killed_timeout", -1));
        } else if ("com.tsf.shell.widget.alarm.inshell.cancel_snooze".equals(intent.getAction())) {
            C4242c.m439a(context, -1, -1L);
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
                C4305i.m258d("AlarmReceiver failed to parse the alarm from the intent");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            C4305i.m258d("AlarmReceiver.onReceive() id " + alarm.f13658a + " setFor " + new SimpleDateFormat("HH:mm:ss.SSS aaa").format(new Date(alarm.f13663f)));
            if (currentTimeMillis > alarm.f13663f + 1800000) {
                C4305i.m258d("AlarmReceiver ignoring stale alarm");
                return;
            }
            C4239a.m447a(context);
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
            C4242c.m428b(context, alarm.f13658a);
            if (!alarm.f13662e.m483c()) {
                C4242c.m438a(context, alarm.f13658a, false);
            } else {
                C4242c.m424d(context);
            }
            Intent intent4 = new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT");
            intent4.setPackage(context.getPackageName());
            intent4.putExtra("intent.extra.alarm", alarm);
            C2233a.m6034a(context, intent4);
            Intent intent5 = new Intent(context, AlarmAlertActivity.class);
            intent5.putExtra("intent.extra.alarm", alarm);
            PendingIntent.getActivity(context, alarm.f13658a, intent5, 0);
            String m491a = alarm.m491a(context);
            Notification.Builder builder = new Notification.Builder(context);
            builder.setSmallIcon(C4314m.C4316b.stat_notify_alarm);
            builder.setContentTitle(m491a);
            builder.setContentInfo(context.getString(C4314m.C4320f.alarm_notify_text));
            Intent intent6 = new Intent(context, AlarmReceiver.class);
            intent6.setAction("clear_notification");
            NotificationManager m451a = m451a(context);
            builder.setDeleteIntent(PendingIntent.getBroadcast(context, 0, intent6, 0));
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("1", "notification", 2);
                if (builder != null) {
                    builder.setChannelId("1");
                }
                if (m451a != null) {
                    m451a.createNotificationChannel(notificationChannel);
                }
            }
            m451a.notify(alarm.f13658a, builder.build());
        }
    }

    /* renamed from: a */
    private NotificationManager m451a(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: a */
    private void m450a(Context context, Alarm alarm, int i) {
        NotificationManager m451a = m451a(context);
        if (alarm == null) {
            C4305i.m258d("Cannot update notification for killer callback");
            return;
        }
        PendingIntent.getActivity(context, alarm.f13658a, new Intent(), 0);
        String m491a = alarm.m491a(context);
        Notification.Builder builder = new Notification.Builder(context);
        builder.setSmallIcon(C4314m.C4316b.stat_notify_alarm);
        builder.setContentTitle(m491a);
        builder.setContentInfo(context.getString(C4314m.C4320f.alarm_alert_alert_silenced, Integer.valueOf(i)));
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("1", "notification", 2);
            if (builder != null) {
                builder.setChannelId("1");
            }
            if (m451a != null) {
                m451a.createNotificationChannel(notificationChannel);
            }
        }
        builder.build();
        m451a.notify(alarm.f13658a, builder.getNotification());
    }
}
