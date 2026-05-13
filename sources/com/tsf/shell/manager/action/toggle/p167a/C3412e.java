package com.tsf.shell.manager.action.toggle.p167a;

import android.app.NotificationManager;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import com.censivn.C3DEngine.C0853a;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.ShellApplication;
import com.tsf.shell.manager.action.toggle.C3414b;
/* renamed from: com.tsf.shell.manager.action.toggle.a.e */
/* loaded from: classes.dex */
public class C3412e extends C3414b {

    /* renamed from: c */
    private AudioManager f11285c;

    /* renamed from: d */
    private int f11286d;

    public C3412e(int i) {
        super(i);
        m2604b(2);
        this.f11285c = (AudioManager) C0853a.m10856d().getSystemService("audio");
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
        NotificationManager notificationManager = (NotificationManager) ShellApplication.m6152a().getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 24 && !notificationManager.isNotificationPolicyAccessGranted()) {
            Intent intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
            Home m6177b = Home.m6177b();
            if (m6177b != null) {
                m6177b.startActivity(intent);
                return;
            }
            return;
        }
        m2610h();
    }

    /* renamed from: h */
    private void m2610h() {
        if (this.f11286d == 2) {
            this.f11285c.setRingerMode(0);
        } else if (this.f11286d == 0) {
            this.f11285c.setRingerMode(1);
        } else if (this.f11286d == 1) {
            this.f11285c.setRingerMode(2);
        }
    }

    @Override // com.tsf.shell.manager.action.toggle.C3414b
    /* renamed from: a */
    public void mo2607a(Intent intent) {
        this.f11286d = this.f11285c.getRingerMode();
        switch (this.f11286d) {
            case 0:
                m2608a(C1306b.C1310d.icon_toggle_volume_off);
                return;
            case 1:
                m2608a(C1306b.C1310d.icon_toggle_volume_vib);
                return;
            case 2:
                m2608a(C1306b.C1310d.icon_toggle_volume_on);
                return;
            default:
                return;
        }
    }
}
