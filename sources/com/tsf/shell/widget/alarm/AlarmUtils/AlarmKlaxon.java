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
import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.C4314m;
/* loaded from: classes.dex */
public class AlarmKlaxon extends Service {

    /* renamed from: a */
    private static final long[] f13687a = {500, 500};

    /* renamed from: c */
    private Vibrator f13689c;

    /* renamed from: d */
    private MediaPlayer f13690d;

    /* renamed from: e */
    private Alarm f13691e;

    /* renamed from: f */
    private long f13692f;

    /* renamed from: g */
    private TelephonyManager f13693g;

    /* renamed from: h */
    private int f13694h;

    /* renamed from: b */
    private boolean f13688b = false;

    /* renamed from: i */
    private Handler f13695i = new Handler() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.AlarmKlaxon.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1000:
                    C4305i.m258d("*********** Alarm killer triggered ***********");
                    AlarmKlaxon.this.m459a((Alarm) message.obj);
                    AlarmKlaxon.this.stopSelf();
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: j */
    private PhoneStateListener f13696j = new PhoneStateListener() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.AlarmKlaxon.2
        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            if (i != 0 && i != AlarmKlaxon.this.f13694h) {
                AlarmKlaxon.this.m459a(AlarmKlaxon.this.f13691e);
                AlarmKlaxon.this.stopSelf();
            }
        }
    };

    @Override // android.app.Service
    public void onCreate() {
        this.f13689c = (Vibrator) getSystemService("vibrator");
        this.f13693g = (TelephonyManager) getSystemService("phone");
        this.f13693g.listen(this.f13696j, 32);
        C4239a.m447a(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        m462a();
        this.f13693g.listen(this.f13696j, 0);
        C4239a.m448a();
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
            C4305i.m258d("AlarmKlaxon failed to parse the alarm from the intent");
            stopSelf();
            return 2;
        }
        if (this.f13691e != null) {
            m459a(this.f13691e);
        }
        m454b(alarm);
        this.f13691e = alarm;
        this.f13694h = this.f13693g.getCallState();
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m459a(Alarm alarm) {
        Intent intent = new Intent("com.tsf.shell.widget.alarm.inshell.alarm_killed");
        intent.putExtra("intent.extra.alarm", alarm);
        intent.putExtra("alarm_killed_timeout", (int) Math.round((System.currentTimeMillis() - this.f13692f) / 60000.0d));
        sendBroadcast(intent);
    }

    /* renamed from: b */
    private void m454b(Alarm alarm) {
        m462a();
        C4305i.m258d("AlarmKlaxon.play() " + alarm.f13658a + " alert " + alarm.f13666i);
        if (!alarm.f13667j) {
            Uri uri = alarm.f13666i;
            if (uri == null) {
                uri = RingtoneManager.getDefaultUri(4);
                C4305i.m258d("Using default alarm: " + uri.toString());
            }
            this.f13690d = new MediaPlayer();
            this.f13690d.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.AlarmKlaxon.3
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    C4305i.m259c("Error occurred while playing audio.");
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    AlarmKlaxon.this.f13690d = null;
                    return true;
                }
            });
            try {
                if (this.f13693g.getCallState() != 0) {
                    C4305i.m258d("Using the in-call alarm");
                    this.f13690d.setVolume(0.125f, 0.125f);
                    m461a(getResources(), this.f13690d, C4314m.C4319e.in_call_alarm);
                } else {
                    this.f13690d.setDataSource(this, uri);
                }
                m460a(this.f13690d);
            } catch (Exception e) {
                C4305i.m258d("Using the fallback ringtone");
                try {
                    this.f13690d.reset();
                    m461a(getResources(), this.f13690d, C4314m.C4319e.fallbackring);
                    m460a(this.f13690d);
                } catch (Exception e2) {
                    C4305i.m261a("Failed to play fallback ringtone", "" + e2);
                }
            }
        }
        if (alarm.f13664g) {
            this.f13689c.vibrate(f13687a, 0);
        } else {
            this.f13689c.cancel();
        }
        m452c(alarm);
        this.f13688b = true;
        this.f13692f = System.currentTimeMillis();
    }

    /* renamed from: a */
    private void m460a(MediaPlayer mediaPlayer) {
        if (((AudioManager) getSystemService("audio")).getStreamVolume(4) != 0) {
            mediaPlayer.setAudioStreamType(4);
            mediaPlayer.setLooping(true);
            mediaPlayer.prepare();
            mediaPlayer.start();
        }
    }

    /* renamed from: a */
    private void m461a(Resources resources, MediaPlayer mediaPlayer, int i) {
        AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
        if (openRawResourceFd != null) {
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
        }
    }

    /* renamed from: a */
    public void m462a() {
        C4305i.m258d("AlarmKlaxon.stop()");
        if (this.f13688b) {
            this.f13688b = false;
            if (this.f13690d != null) {
                this.f13690d.stop();
                this.f13690d.release();
                this.f13690d = null;
            }
            this.f13689c.cancel();
        }
        m455b();
    }

    /* renamed from: c */
    private void m452c(Alarm alarm) {
        this.f13695i.sendMessageDelayed(this.f13695i.obtainMessage(1000, alarm), 600000L);
    }

    /* renamed from: b */
    private void m455b() {
        this.f13695i.removeMessages(1000);
    }
}
