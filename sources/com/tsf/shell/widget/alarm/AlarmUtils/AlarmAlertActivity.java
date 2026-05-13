package com.tsf.shell.widget.alarm.AlarmUtils;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.C4314m;
import com.tsf.shell.widget.alarm.setting.C4371e;
import java.text.DateFormatSymbols;
import java.util.Calendar;
/* loaded from: classes.dex */
public class AlarmAlertActivity extends Activity {

    /* renamed from: a */
    private String f13678a;

    /* renamed from: b */
    private C4234b f13679b = new C4234b();

    /* renamed from: c */
    private C4233a f13680c = new C4233a();

    /* renamed from: d */
    private Alarm f13681d;

    /* renamed from: e */
    private int f13682e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C4314m.C4318d.activity_alarm_alert_layout);
        m466b((Context) this);
        this.f13681d = (Alarm) getIntent().getParcelableExtra("intent.extra.alarm");
        this.f13682e = Integer.parseInt("2");
        registerReceiver(this.f13680c, new IntentFilter("com.tsf.shell.widget.alarm.inshell.alarm_killed"));
        findViewById(C4314m.C4317c.button1).setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.AlarmAlertActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AlarmAlertActivity.this.m467b();
            }
        });
        findViewById(C4314m.C4317c.button2).setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.AlarmAlertActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AlarmAlertActivity.this.m468a(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.alarm.AlarmUtils.AlarmAlertActivity$b */
    /* loaded from: classes.dex */
    public class C4234b extends BroadcastReceiver {
        C4234b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AlarmAlertActivity.this.m466b(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.alarm.AlarmUtils.AlarmAlertActivity$a */
    /* loaded from: classes.dex */
    public class C4233a extends BroadcastReceiver {
        C4233a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (AlarmAlertActivity.this.f13681d.f13658a == ((Alarm) intent.getParcelableExtra("intent.extra.alarm")).f13658a) {
                AlarmAlertActivity.this.m468a(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m468a(boolean z) {
        if (!z) {
            m473a().cancel(this.f13681d.f13658a);
            Intent intent = new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT");
            intent.setPackage(getPackageName());
            stopService(intent);
        }
        finish();
    }

    /* renamed from: a */
    private NotificationManager m473a() {
        return (NotificationManager) getSystemService("notification");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m467b() {
        new C4371e(this).m117b();
        int i = C4371e.f14146j;
        long currentTimeMillis = System.currentTimeMillis() + (60000 * i);
        C4242c.m439a(this, this.f13681d.f13658a, currentTimeMillis);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        String string = getString(C4314m.C4320f.alarm_notify_snooze_label, new Object[]{this.f13681d.m491a(this)});
        Intent intent = new Intent(this, C4233a.class);
        intent.setAction("com.tsf.shell.widget.alarm.inshell.cancel_snooze");
        intent.putExtra("alarm_id", this.f13681d.f13658a);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, this.f13681d.f13658a, intent, 0);
        NotificationManager m473a = m473a();
        Notification.Builder builder = new Notification.Builder(this);
        builder.setSmallIcon(C4314m.C4316b.stat_notify_alarm);
        builder.setContentTitle(string);
        builder.setContentInfo(getString(C4314m.C4320f.alarm_notify_snooze_text, new Object[]{C4242c.m432a(this, calendar)}));
        builder.setDeleteIntent(broadcast);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("1", "notification", 2);
            if (builder != null) {
                builder.setChannelId("1");
            }
            if (m473a != null) {
                m473a.createNotificationChannel(notificationChannel);
            }
        }
        builder.build();
        m473a.notify(this.f13681d.f13658a, builder.getNotification());
        String string2 = getString(C4314m.C4320f.alarm_alert_snooze_set, new Object[]{Integer.valueOf(i)});
        C4305i.m258d(string2);
        Toast.makeText(this, string2, 1).show();
        Intent intent2 = new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT");
        intent2.setPackage(getPackageName());
        stopService(intent2);
        finish();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        m464c();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        m463d();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f13680c);
    }

    /* renamed from: c */
    private void m464c() {
        registerReceiver(this.f13679b, new IntentFilter("android.intent.action.TIME_TICK"));
    }

    /* renamed from: d */
    private void m463d() {
        unregisterReceiver(this.f13679b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m466b(Context context) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        TextView textView = (TextView) findViewById(C4314m.C4317c.textView3);
        if (DateFormat.is24HourFormat(context)) {
            this.f13678a = "kk";
            textView.setVisibility(8);
        } else {
            this.f13678a = "h";
            textView.setText(new DateFormatSymbols().getAmPmStrings()[calendar.get(9)]);
        }
        this.f13678a += ":mm";
        ((TextView) findViewById(C4314m.C4317c.textView1)).setText(DateFormat.format(this.f13678a, calendar));
        ((TextView) findViewById(C4314m.C4317c.textView2)).setText(m472a((Context) this));
    }

    /* renamed from: a */
    public String m472a(Context context) {
        String string = context.getString(C4314m.C4320f.abbrev_wday_month_day_no_year);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        return DateFormat.format(string, calendar).toString();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = keyEvent.getAction() == 1;
        switch (keyEvent.getKeyCode()) {
            case 24:
            case 25:
            case 27:
            case 80:
                if (z) {
                    switch (this.f13682e) {
                        case 1:
                            m467b();
                            return true;
                        case 2:
                            m468a(false);
                            return true;
                        default:
                            return true;
                    }
                }
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }
}
