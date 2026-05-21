package com.tsf.shell.manager.action.toggle.a;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import com.tsf.b;
import com.tsf.shell.Home;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        Home.b().runOnUiThread(new Runnable() { // from class: com.tsf.shell.manager.action.toggle.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.tsf.shell.a.a.e.a(Home.b())) {
                    switch (b.c) {
                        case 10:
                            b.d(180);
                            break;
                        case 11:
                            b.d(255);
                            break;
                        case 12:
                            b.n();
                            b.d(50);
                            break;
                        case 13:
                            b.o();
                            b.d(50);
                            break;
                    }
                }
            }
        });
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void a(Intent intent) {
        c = k();
        switch (c) {
            case 10:
                a(b.d.icon_toggle_bright_1);
                break;
            case 11:
                a(b.d.icon_toggle_bright_2);
                break;
            case 12:
                a(b.d.icon_toggle_bright_3);
                break;
            case 13:
                a(b.d.icon_toggle_bright_auto);
                break;
        }
    }

    private int k() {
        int iM = m();
        if (l()) {
            return 13;
        }
        if (iM <= 50) {
            return 10;
        }
        return ((iM <= 50 || iM > 180) && iM > 180) ? 12 : 11;
    }

    private boolean l() {
        try {
            return Settings.System.getInt(com.censivn.C3DEngine.a.d().getContentResolver(), "screen_brightness_mode") == 1;
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    private int m() {
        try {
            return Settings.System.getInt(com.censivn.C3DEngine.a.d().getContentResolver(), "screen_brightness");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n() {
        Settings.System.putInt(com.censivn.C3DEngine.a.d().getContentResolver(), "screen_brightness_mode", 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o() {
        Settings.System.putInt(com.censivn.C3DEngine.a.d().getContentResolver(), "screen_brightness_mode", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(int i) {
        ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
        Uri uriFor = Settings.System.getUriFor("screen_brightness");
        Settings.System.putInt(contentResolver, "screen_brightness", i);
        contentResolver.notifyChange(uriFor, null);
    }
}
