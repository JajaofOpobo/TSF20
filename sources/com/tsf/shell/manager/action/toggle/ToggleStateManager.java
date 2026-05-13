package com.tsf.shell.manager.action.toggle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import com.censivn.C3DEngine.C0853a;
/* loaded from: classes.dex */
public class ToggleStateManager extends BroadcastReceiver {

    /* renamed from: a */
    public static String f11253a = "android.media.RINGER_MODE_CHANGED";

    /* renamed from: b */
    private C3403a f11254b;

    /* renamed from: c */
    private C3401a f11255c;

    /* renamed from: d */
    private C3402b f11256d;

    public ToggleStateManager(C3403a c3403a) {
        this.f11254b = c3403a;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.AIRPLANE_MODE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction(f11253a);
        C0853a.m10856d().registerReceiver(this, intentFilter);
        Handler handler = new Handler();
        this.f11255c = new C3401a(handler);
        this.f11256d = new C3402b(handler);
        C0853a.m10856d().getContentResolver().registerContentObserver(Settings.System.getUriFor("screen_brightness"), false, this.f11255c);
        C0853a.m10856d().getContentResolver().registerContentObserver(Settings.System.getUriFor("screen_brightness_mode"), false, this.f11255c);
        C0853a.m10856d().getContentResolver().registerContentObserver(Uri.parse("content://settings/global/mobile_data"), false, this.f11256d);
        C0853a.m10856d().getContentResolver().registerContentObserver(Settings.Secure.getUriFor("mobile_data"), false, this.f11256d);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
            this.f11254b.f11260b.mo2607a(intent);
        } else if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            this.f11254b.f11261c.mo2607a(intent);
        } else if (!action.equals("android.intent.action.AIRPLANE_MODE") && action.equals(f11253a)) {
            this.f11254b.f11263e.mo2607a(intent);
        }
    }

    /* renamed from: com.tsf.shell.manager.action.toggle.ToggleStateManager$b */
    /* loaded from: classes.dex */
    public class C3402b extends ContentObserver {
        public C3402b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            ToggleStateManager.this.f11254b.f11264f.mo2607a((Intent) null);
        }
    }

    /* renamed from: com.tsf.shell.manager.action.toggle.ToggleStateManager$a */
    /* loaded from: classes.dex */
    public class C3401a extends ContentObserver {
        public C3401a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            ToggleStateManager.this.f11254b.f11262d.mo2607a((Intent) null);
        }
    }
}
