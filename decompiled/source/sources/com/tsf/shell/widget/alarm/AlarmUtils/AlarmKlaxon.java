package com.tsf.shell.widget.alarm.AlarmUtils;

import android.app.Service;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Vibrator;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.tsf.shell.widget.alarm.i;
import com.tsf.shell.widget.alarm.m;
/* loaded from: classes.dex */
public class AlarmKlaxon extends Service {
    private static final long[] a = {500, 500};
    private Vibrator c;
    private MediaPlayer d;
    private Alarm e;
    private long f;
    private TelephonyManager g;
    private int h;
    private boolean b = false;
    private Handler i = new Handler() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.AlarmKlaxon.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1000:
                    i.d("*********** Alarm killer triggered ***********");
                    AlarmKlaxon.this.a((Alarm) message.obj);
                    AlarmKlaxon.this.stopSelf();
                    return;
                default:
                    return;
            }
        }
    };
    private PhoneStateListener j = new PhoneStateListener() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.AlarmKlaxon.2
        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            if (i != 0 && i != AlarmKlaxon.this.h) {
                AlarmKlaxon.this.a(AlarmKlaxon.this.e);
                AlarmKlaxon.this.stopSelf();
            }
        }
    };

    @Override // android.app.Service
    public void onCreate() {
        this.c = (Vibrator) getSystemService("vibrator");
        this.g = (TelephonyManager) getSystemService("phone");
        this.g.listen(this.j, 32);
        a.a(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        a();
        this.g.listen(this.j, 0);
        a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            stopSelf();
            return 2;
        }
        Alarm alarm = (Alarm) intent.getParcelableExtra("intent.extra.alarm");
        if (alarm == null) {
            i.d("AlarmKlaxon failed to parse the alarm from the intent");
            stopSelf();
            return 2;
        }
        if (this.e != null) {
            a(this.e);
        }
        b(alarm);
        this.e = alarm;
        this.h = this.g.getCallState();
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Alarm alarm) {
        Intent intent = new Intent("com.tsf.shell.widget.alarm.inshell.alarm_killed");
        intent.putExtra("intent.extra.alarm", alarm);
        intent.putExtra("alarm_killed_timeout", (int) Math.round((System.currentTimeMillis() - this.f) / 60000.0d));
        sendBroadcast(intent);
    }

    private void b(Alarm alarm) {
        a();
        i.d("AlarmKlaxon.play() " + alarm.a + " alert " + alarm.i);
        if (!alarm.j) {
            Uri uri = alarm.i;
            if (uri == null) {
                uri = RingtoneManager.getDefaultUri(4);
                i.d("Using default alarm: " + uri.toString());
            }
            this.d = new MediaPlayer();
            this.d.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.AlarmKlaxon.3
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    i.c("Error occurred while playing audio.");
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    AlarmKlaxon.this.d = null;
                    return true;
                }
            });
            try {
                if (this.g.getCallState() != 0) {
                    i.d("Using the in-call alarm");
                    this.d.setVolume(0.125f, 0.125f);
                    a(getResources(), this.d, m.e.in_call_alarm);
                } else {
                    this.d.setDataSource(this, uri);
                }
                a(this.d);
            } catch (Exception e) {
                i.d("Using the fallback ringtone");
                try {
                    this.d.reset();
                    a(getResources(), this.d, m.e.fallbackring);
                    a(this.d);
                } catch (Exception e2) {
                    i.a("Failed to play fallback ringtone", "" + e2);
                }
            }
        }
        if (alarm.g) {
            this.c.vibrate(a, 0);
        } else {
            this.c.cancel();
        }
        c(alarm);
        this.b = true;
        this.f = System.currentTimeMillis();
    }

    private void a(MediaPlayer mediaPlayer) {
        if (((AudioManager) getSystemService("audio")).getStreamVolume(4) != 0) {
            mediaPlayer.setAudioStreamType(4);
            mediaPlayer.setLooping(true);
            mediaPlayer.prepare();
            mediaPlayer.start();
        }
    }

    private void a(Resources resources, MediaPlayer mediaPlayer, int i) {
        AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
        if (openRawResourceFd != null) {
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
        }
    }

    public void a() {
        i.d("AlarmKlaxon.stop()");
        if (this.b) {
            this.b = false;
            if (this.d != null) {
                this.d.stop();
                this.d.release();
                this.d = null;
            }
            this.c.cancel();
        }
        b();
    }

    private void c(Alarm alarm) {
        this.i.sendMessageDelayed(this.i.obtainMessage(1000, alarm), 600000L);
    }

    private void b() {
        this.i.removeMessages(1000);
    }
}
