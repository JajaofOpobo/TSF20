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
import com.tsf.shell.widget.alarm.i;
import com.tsf.shell.widget.alarm.m;
import java.util.Calendar;
/* loaded from: classes.dex */
public class AlarmAlert extends Activity {
    private Alarm a;
    private int b;
    private BroadcastReceiver c = new BroadcastReceiver() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.AlarmAlert.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (AlarmAlert.this.a.a == ((Alarm) intent.getParcelableExtra("intent.extra.alarm")).a) {
                AlarmAlert.this.a(true);
            }
        }
    };

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = (Alarm) getIntent().getParcelableExtra("intent.extra.alarm");
        this.b = Integer.parseInt("2");
        requestWindowFeature(1);
        getWindow().addFlags(6815872);
        b();
        registerReceiver(this.c, new IntentFilter("com.tsf.shell.widget.alarm.inshell.alarm_killed"));
    }

    private void a() {
        ((TextView) findViewById(m.c.alertTitle)).setText(this.a.a(this));
    }

    protected View a(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(m.d.alarm_alert, (ViewGroup) null);
    }

    private void b() {
        LayoutInflater from = LayoutInflater.from(this);
        setContentView(a(from));
        from.inflate(m.d.tat_appwidget, (ViewGroup) findViewById(m.c.clockView));
        Button button = (Button) findViewById(m.c.snooze);
        button.requestFocus();
        button.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.AlarmAlert.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AlarmAlert.this.c();
            }
        });
        findViewById(m.c.dismiss).setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.AlarmAlert.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AlarmAlert.this.a(false);
            }
        });
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        int i = getSharedPreferences("setting_info", 1).getInt("snooze_duration", 10);
        long currentTimeMillis = System.currentTimeMillis() + (60000 * i);
        c.a(this, this.a.a, currentTimeMillis);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        String string = getString(m.f.alarm_notify_snooze_label, new Object[]{this.a.a(this)});
        Intent intent = new Intent(this, AlarmReceiver.class);
        intent.setAction("com.tsf.shell.widget.alarm.inshell.cancel_snooze");
        intent.putExtra("alarm_id", this.a.a);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, this.a.a, intent, 0);
        NotificationManager d = d();
        Notification.Builder builder = new Notification.Builder(this);
        builder.setSmallIcon(m.b.stat_notify_alarm);
        builder.setContentTitle(string);
        builder.setContentInfo(getString(m.f.alarm_notify_snooze_text, new Object[]{c.a(this, calendar)}));
        builder.setDeleteIntent(broadcast);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("1", "notification", 2);
            if (builder != null) {
                builder.setChannelId("1");
            }
            if (d != null) {
                d.createNotificationChannel(notificationChannel);
            }
        }
        builder.build();
        d.notify(this.a.a, builder.getNotification());
        String string2 = getString(m.f.alarm_alert_snooze_set, new Object[]{Integer.valueOf(i)});
        i.d(string2);
        Toast.makeText(this, string2, 1).show();
        stopService(new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT"));
        finish();
    }

    private NotificationManager d() {
        return (NotificationManager) getSystemService("notification");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (!z) {
            d().cancel(this.a.a);
            stopService(new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT"));
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        i.d("AlarmAlert.OnNewIntent()");
        this.a = (Alarm) intent.getParcelableExtra("intent.extra.alarm");
        a();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.c);
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
                    switch (this.b) {
                        case 1:
                            c();
                            return true;
                        case 2:
                            a(false);
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
