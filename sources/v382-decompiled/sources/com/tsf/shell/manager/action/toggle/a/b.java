package com.tsf.shell.manager.action.toggle.a;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class b extends com.tsf.shell.manager.action.toggle.b {
    private static int c = 10;

    public b(int i) {
        super(i);
        b(2);
        d();
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void d() {
        a((Intent) null);
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void c() {
        switch (c) {
            case 10:
                c(180);
                break;
            case 11:
                c(255);
                break;
            case 12:
                k();
                c(50);
                break;
            case 13:
                l();
                c(50);
                break;
        }
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void a(Intent intent) {
        c = h();
        switch (c) {
            case 10:
                a(R.drawable.icon_toggle_bright_1);
                break;
            case 11:
                a(R.drawable.icon_toggle_bright_2);
                break;
            case 12:
                a(R.drawable.icon_toggle_bright_3);
                break;
            case 13:
                a(R.drawable.icon_toggle_bright_auto);
                break;
        }
    }

    private int h() {
        int j = j();
        if (i()) {
            return 13;
        }
        if (j <= 50) {
            return 10;
        }
        return ((j <= 50 || j > 180) && j > 180) ? 12 : 11;
    }

    private boolean i() {
        try {
            return Settings.System.getInt(com.censivn.C3DEngine.a.d().getContentResolver(), "screen_brightness_mode") == 1;
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    private int j() {
        try {
            return Settings.System.getInt(com.censivn.C3DEngine.a.d().getContentResolver(), "screen_brightness");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private static void k() {
        Settings.System.putInt(com.censivn.C3DEngine.a.d().getContentResolver(), "screen_brightness_mode", 1);
    }

    private static void l() {
        Settings.System.putInt(com.censivn.C3DEngine.a.d().getContentResolver(), "screen_brightness_mode", 0);
    }

    private static void c(int i) {
        ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
        Uri uriFor = Settings.System.getUriFor("screen_brightness");
        Settings.System.putInt(contentResolver, "screen_brightness", i);
        contentResolver.notifyChange(uriFor, null);
    }
}
