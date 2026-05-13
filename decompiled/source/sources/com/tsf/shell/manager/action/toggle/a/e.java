package com.tsf.shell.manager.action.toggle.a;

import android.app.NotificationManager;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.ShellApplication;
/* loaded from: classes.dex */
public class e extends com.tsf.shell.manager.action.toggle.b {
    private AudioManager c;
    private int d;

    public e(int i) {
        super(i);
        b(2);
        this.c = (AudioManager) com.censivn.C3DEngine.a.d().getSystemService("audio");
        d();
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void d() {
        a((Intent) null);
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void c() {
        NotificationManager notificationManager = (NotificationManager) ShellApplication.a().getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 24 && !notificationManager.isNotificationPolicyAccessGranted()) {
            Intent intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
            Home b = Home.b();
            if (b != null) {
                b.startActivity(intent);
                return;
            }
            return;
        }
        h();
    }

    private void h() {
        if (this.d == 2) {
            this.c.setRingerMode(0);
        } else if (this.d == 0) {
            this.c.setRingerMode(1);
        } else if (this.d == 1) {
            this.c.setRingerMode(2);
        }
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void a(Intent intent) {
        this.d = this.c.getRingerMode();
        switch (this.d) {
            case 0:
                a(b.d.icon_toggle_volume_off);
                return;
            case 1:
                a(b.d.icon_toggle_volume_vib);
                return;
            case 2:
                a(b.d.icon_toggle_volume_on);
                return;
            default:
                return;
        }
    }
}
