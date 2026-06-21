package com.tsf.shell.widget.alarm.AlarmUtils;

import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.tsf.shell.widget.alarm.ab;
import com.tsf.shell.widget.alarm.af;
import com.tsf.shell.widget.alarm.u;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public class AlarmReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Alarm alarm;
        Class<AlarmAlertFullScreen> cls;
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
            i.a(context, -1, -1L);
            return;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("intent.extra.alarm_raw");
        if (byteArrayExtra == null) {
            alarm = null;
        } else {
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            alarm = (Alarm) Alarm.CREATOR.createFromParcel(obtain);
        }
        if (alarm == null) {
            u.d("AlarmReceiver failed to parse the alarm from the intent");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        u.d("AlarmReceiver.onReceive() id " + alarm.a + " setFor " + new SimpleDateFormat("HH:mm:ss.SSS aaa").format(new Date(alarm.f)));
        if (currentTimeMillis > alarm.f + 1800000) {
            u.d("AlarmReceiver ignoring stale alarm");
            return;
        }
        e.a(context);
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
        i.b(context, alarm.a);
        if (!alarm.e.c()) {
            i.a(context, alarm.a, false);
        } else {
            i.d(context);
        }
        Intent intent4 = new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT");
        intent4.setPackage(context.getPackageName());
        intent4.putExtra("intent.extra.alarm", alarm);
        context.startService(intent4);
        Intent intent5 = new Intent(context, (Class<?>) AlarmAlertActivity.class);
        intent5.putExtra("intent.extra.alarm", alarm);
        PendingIntent activity = PendingIntent.getActivity(context, alarm.a, intent5, 0);
        String a = alarm.a(context);
        Notification notification = new Notification(ab.stat_notify_alarm, a, alarm.f);
        notification.setLatestEventInfo(context, a, context.getString(af.alarm_notify_text), activity);
        notification.flags |= 1;
        notification.ledARGB = -16711936;
        notification.ledOnMS = 500;
        notification.ledOffMS = 500;
        Intent intent6 = new Intent(context, (Class<?>) AlarmReceiver.class);
        intent6.setAction("clear_notification");
        notification.deleteIntent = PendingIntent.getBroadcast(context, 0, intent6, 0);
        a(context).notify(alarm.a, notification);
    }

    private NotificationManager a(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }

    private void a(Context context, Alarm alarm, int i) {
        NotificationManager a = a(context);
        if (alarm == null) {
            u.d("Cannot update notification for killer callback");
            return;
        }
        PendingIntent activity = PendingIntent.getActivity(context, alarm.a, new Intent(), 0);
        String a2 = alarm.a(context);
        Notification notification = new Notification(ab.stat_notify_alarm, a2, alarm.f);
        notification.setLatestEventInfo(context, a2, context.getString(af.alarm_alert_alert_silenced, Integer.valueOf(i)), activity);
        notification.flags |= 16;
        a.notify(alarm.a, notification);
    }
}
