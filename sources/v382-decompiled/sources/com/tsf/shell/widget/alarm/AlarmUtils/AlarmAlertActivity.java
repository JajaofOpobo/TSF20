package com.tsf.shell.widget.alarm.AlarmUtils;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tsf.shell.widget.alarm.ab;
import com.tsf.shell.widget.alarm.ac;
import com.tsf.shell.widget.alarm.ad;
import com.tsf.shell.widget.alarm.af;
import com.tsf.shell.widget.alarm.setting.j;
import com.tsf.shell.widget.alarm.u;
import java.text.DateFormatSymbols;
import java.util.Calendar;

/* loaded from: classes.dex */
public class AlarmAlertActivity extends Activity {
    private String a;
    private d b = new d(this);
    private c c = new c(this);
    private Alarm d;
    private int e;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ad.activity_alarm_alert_layout);
        b((Context) this);
        this.d = (Alarm) getIntent().getParcelableExtra("intent.extra.alarm");
        this.e = Integer.parseInt("2");
        registerReceiver(this.c, new IntentFilter("com.tsf.shell.widget.alarm.inshell.alarm_killed"));
        findViewById(ac.button1).setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.AlarmAlertActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AlarmAlertActivity.this.b();
            }
        });
        findViewById(ac.button2).setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.AlarmAlertActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AlarmAlertActivity.this.a(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (!z) {
            a().cancel(this.d.a);
            Intent intent = new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT");
            intent.setPackage(getPackageName());
            stopService(intent);
        }
        finish();
    }

    private NotificationManager a() {
        return (NotificationManager) getSystemService("notification");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        new j(this).b();
        int i = j.j;
        long currentTimeMillis = System.currentTimeMillis() + (60000 * i);
        i.a(this, this.d.a, currentTimeMillis);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        String string = getString(af.alarm_notify_snooze_label, new Object[]{this.d.a(this)});
        Intent intent = new Intent(this, (Class<?>) c.class);
        intent.setAction("com.tsf.shell.widget.alarm.inshell.cancel_snooze");
        intent.putExtra("alarm_id", this.d.a);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, this.d.a, intent, 0);
        NotificationManager a = a();
        Notification notification = new Notification(ab.stat_notify_alarm, string, 0L);
        notification.setLatestEventInfo(this, string, getString(af.alarm_notify_snooze_text, new Object[]{i.a(this, calendar)}), broadcast);
        notification.deleteIntent = broadcast;
        notification.flags |= 16;
        a.notify(this.d.a, notification);
        String string2 = getString(af.alarm_alert_snooze_set, new Object[]{Integer.valueOf(i)});
        u.d(string2);
        Toast.makeText(this, string2, 1).show();
        Intent intent2 = new Intent("com.tsf.shell.widget.alarm.inshell.ALARM_ALERT");
        intent2.setPackage(getPackageName());
        stopService(intent2);
        finish();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        c();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        d();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.c);
    }

    private void c() {
        registerReceiver(this.b, new IntentFilter("android.intent.action.TIME_TICK"));
    }

    private void d() {
        unregisterReceiver(this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        TextView textView = (TextView) findViewById(ac.textView3);
        if (DateFormat.is24HourFormat(context)) {
            this.a = "kk";
            textView.setVisibility(8);
        } else {
            this.a = "h";
            textView.setText(new DateFormatSymbols().getAmPmStrings()[calendar.get(9)]);
        }
        this.a = String.valueOf(this.a) + ":mm";
        ((TextView) findViewById(ac.textView1)).setText(DateFormat.format(this.a, calendar));
        ((TextView) findViewById(ac.textView2)).setText(a((Context) this));
    }

    public String a(Context context) {
        String string = context.getString(af.abbrev_wday_month_day_no_year);
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
                if (!z) {
                    return true;
                }
                switch (this.e) {
                    case 1:
                        b();
                        return true;
                    case 2:
                        a(false);
                        return true;
                    default:
                        return true;
                }
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }
}
