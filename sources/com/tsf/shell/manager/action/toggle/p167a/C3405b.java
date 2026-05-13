package com.tsf.shell.manager.action.toggle.p167a;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import com.censivn.C3DEngine.C0853a;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.action.toggle.C3414b;
import com.tsf.shell.p086a.p087a.C2205e;
/* renamed from: com.tsf.shell.manager.action.toggle.a.b */
/* loaded from: classes.dex */
public class C3405b extends C3414b {

    /* renamed from: c */
    private static int f11280c = 10;

    public C3405b(int i) {
        super(i);
        m2604b(2);
        mo2601d();
    }

    @Override // com.tsf.shell.manager.action.toggle.C3414b
    /* renamed from: d */
    public void mo2601d() {
        mo2607a((Intent) null);
    }

    @Override // com.tsf.shell.manager.action.toggle.C3414b
    /* renamed from: c */
    public void mo2602c() {
        Home.m6177b().runOnUiThread(new Runnable() { // from class: com.tsf.shell.manager.action.toggle.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (C2205e.m6087a(Home.m6177b())) {
                    switch (C3405b.f11280c) {
                        case 10:
                            C3405b.m2622d(180);
                            return;
                        case 11:
                            C3405b.m2622d(255);
                            return;
                        case 12:
                            C3405b.m2615n();
                            C3405b.m2622d(50);
                            return;
                        case 13:
                            C3405b.m2614o();
                            C3405b.m2622d(50);
                            return;
                        default:
                            return;
                    }
                }
            }
        });
    }

    @Override // com.tsf.shell.manager.action.toggle.C3414b
    /* renamed from: a */
    public void mo2607a(Intent intent) {
        f11280c = m2618k();
        switch (f11280c) {
            case 10:
                m2608a(C1306b.C1310d.icon_toggle_bright_1);
                return;
            case 11:
                m2608a(C1306b.C1310d.icon_toggle_bright_2);
                return;
            case 12:
                m2608a(C1306b.C1310d.icon_toggle_bright_3);
                return;
            case 13:
                m2608a(C1306b.C1310d.icon_toggle_bright_auto);
                return;
            default:
                return;
        }
    }

    /* renamed from: k */
    private int m2618k() {
        int m2616m = m2616m();
        if (m2617l()) {
            return 13;
        }
        if (m2616m <= 50) {
            return 10;
        }
        return ((m2616m <= 50 || m2616m > 180) && m2616m > 180) ? 12 : 11;
    }

    /* renamed from: l */
    private boolean m2617l() {
        try {
            return Settings.System.getInt(C0853a.m10856d().getContentResolver(), "screen_brightness_mode") == 1;
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: m */
    private int m2616m() {
        try {
            return Settings.System.getInt(C0853a.m10856d().getContentResolver(), "screen_brightness");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static void m2615n() {
        Settings.System.putInt(C0853a.m10856d().getContentResolver(), "screen_brightness_mode", 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static void m2614o() {
        Settings.System.putInt(C0853a.m10856d().getContentResolver(), "screen_brightness_mode", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m2622d(int i) {
        ContentResolver contentResolver = C0853a.m10856d().getContentResolver();
        Uri uriFor = Settings.System.getUriFor("screen_brightness");
        Settings.System.putInt(contentResolver, "screen_brightness", i);
        contentResolver.notifyChange(uriFor, null);
    }
}
