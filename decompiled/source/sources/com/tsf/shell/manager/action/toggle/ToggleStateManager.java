package com.tsf.shell.manager.action.toggle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
/* loaded from: classes.dex */
public class ToggleStateManager extends BroadcastReceiver {
    public static String a = "android.media.RINGER_MODE_CHANGED";
    private com.tsf.shell.manager.action.toggle.a b;
    private a c;
    private b d;

    public ToggleStateManager(com.tsf.shell.manager.action.toggle.a aVar) {
        this.b = aVar;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.AIRPLANE_MODE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction(a);
        com.censivn.C3DEngine.a.d().registerReceiver(this, intentFilter);
        Handler handler = new Handler();
        this.c = new a(handler);
        this.d = new b(handler);
        com.censivn.C3DEngine.a.d().getContentResolver().registerContentObserver(Settings.System.getUriFor("screen_brightness"), false, this.c);
        com.censivn.C3DEngine.a.d().getContentResolver().registerContentObserver(Settings.System.getUriFor("screen_brightness_mode"), false, this.c);
        com.censivn.C3DEngine.a.d().getContentResolver().registerContentObserver(Uri.parse("content://settings/global/mobile_data"), false, this.d);
        com.censivn.C3DEngine.a.d().getContentResolver().registerContentObserver(Settings.Secure.getUriFor("mobile_data"), false, this.d);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
            this.b.b.a(intent);
        } else if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            this.b.c.a(intent);
        } else if (!action.equals("android.intent.action.AIRPLANE_MODE") && action.equals(a)) {
            this.b.e.a(intent);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ContentObserver {
        public b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            ToggleStateManager.this.b.f.a((Intent) null);
        }
    }

    /* loaded from: classes.dex */
    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            ToggleStateManager.this.b.d.a((Intent) null);
        }
    }
}
