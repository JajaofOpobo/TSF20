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
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.C4314m;
import java.util.Calendar;
/* loaded from: classes.dex */
public class AlarmAlert extends Activity {

    /* renamed from: a */
    private Alarm f13672a;

    /* renamed from: b */
    private int f13673b;

    /* renamed from: c */
    private BroadcastReceiver f13674c = new BroadcastReceiver() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.AlarmAlert.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (AlarmAlert.this.f13672a.f13658a == ((Alarm) intent.getParcelableExtra("intent.extra.alarm")).f13658a) {
                AlarmAlert.this.m478a(true);
            }
        }
    };

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13672a = (Alarm) getIntent().getParcelableExtra("intent.extra.alarm");
        this.f13673b = Integer.parseInt("2");
        requestWindowFeature(1);
        getWindow().addFlags(6815872);
        m477b();
        registerReceiver(this.f13674c, new IntentFilter("com.tsf.shell.widget.alarm.inshell.alarm_killed"));
    }

    /* renamed from: a */
    private void m482a() {
        ((TextView) findViewById(C4314m.C4317c.alertTitle)).setText(this.f13672a.m491a(this));
    }

    /* renamed from: a */
    protected View m481a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(C4314m.C4318d.alarm_alert, (ViewGroup) null);
    }

    /* renamed from: b */
    private void m477b() {
        LayoutInflater from = LayoutInflater.from(this);
        setContentView(m481a(from));
        from.inflate(C4314m.C4318d.tat_appwidget, (ViewGroup) findViewById(C4314m.C4317c.clockView));
        Button button = (Button) findViewById(C4314m.C4317c.snooze);
        button.requestFocus();
        button.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.AlarmAlert.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AlarmAlert.this.m475c();
            }
        });
        findViewById(C4314m.C4317c.dismiss).setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.AlarmAlert.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AlarmAlert.this.m478a(false);
            }
        });
        m482a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m475c() {
        int i = getSharedPreferences("setting_info", 1).getInt("snooze_duration", 10);
        long currentTimeMillis = System.currentTimeMillis() + (60000 * i);
        C4242c.m439a(this, this.f13672a.f13658a, currentTimeMillis);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        String string = getString(C4314m.C4320f.alarm_notify_snooze_label, new Object[]{this.f13672a.m491a(this)});
        Intent intent = new Intent(this, AlarmReceiver.class);
        intent.setAction("com.tsf.shell.widget.alarm.inshell.cancel_snooze");
        intent.putExtra("alarm_id", this.f13672a.f13658a);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, this.f13672a.f13658a, intent, 0);
        NotificationManager m474d = m474d();
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
            if (m474d != null) {
                m474d.createNotificationChannel(notificationChannel);
            }
        }
        builder.build();
        m474d.notify(this.f13672a.f13658a, builder.getNotification());
        String string2 = getString(C4314m.C4320f.alarm_alert_snooze_set, new Object[]{Integer.valueOf(i)});
        C4305i.m258d(string2);
        Toast.makeText(this, string2, 1).show();
        stopService(new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT"));
        finish();
    }

    /* renamed from: d */
    private NotificationManager m474d() {
        return (NotificationManager) getSystemService("notification");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m478a(boolean z) {
        if (!z) {
            m474d().cancel(this.f13672a.f13658a);
            stopService(new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT"));
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C4305i.m258d("AlarmAlert.OnNewIntent()");
        this.f13672a = (Alarm) intent.getParcelableExtra("intent.extra.alarm");
        m482a();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f13674c);
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
                    switch (this.f13673b) {
                        case 1:
                            m475c();
                            return true;
                        case 2:
                            m478a(false);
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
