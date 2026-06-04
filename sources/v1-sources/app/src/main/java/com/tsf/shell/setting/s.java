package com.tsf.shell.setting;

import android.media.AudioManager;
import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
public final class s {
    public static String a = "android.media.RINGER_MODE_CHANGED";
    private static s b;
    private int c;
    private e d;
    private RenderRunnable e;
    private AudioManager f;

    public static s a() {
        if (b == null) {
            b = new s();
        }
        return b;
    }

    public final void b() {
        this.f = (AudioManager) com.censivn.C3DEngine.a.c().getSystemService("audio");
        if (this.c == 2) {
            this.f.setRingerMode(0);
        } else if (this.c == 0) {
            this.f.setRingerMode(1);
        } else if (this.c == 1) {
            this.f.setRingerMode(2);
        }
    }

    public final void a(e eVar) {
        this.d = eVar;
        this.f = (AudioManager) com.censivn.C3DEngine.a.c().getSystemService("audio");
        this.c = this.f.getRingerMode();
        c();
    }

    public final void c() {
        if (this.d != null) {
            switch (this.c) {
                case 0:
                    this.d.a(1);
                    break;
                case 1:
                    this.d.a(2);
                    break;
                case 2:
                    this.d.a(0);
                    break;
            }
        }
    }

    public final void d() {
        if (com.censivn.C3DEngine.a.a() != null && com.censivn.C3DEngine.a.c() != null && this.f != null) {
            this.c = this.f.getRingerMode();
            if (this.e != null) {
                com.censivn.C3DEngine.a.a().b(this.e);
                this.e = null;
            }
            this.e = new t(this);
            if (com.tsf.shell.i.a().b()) {
                this.e.autoInvalidate = true;
            }
            com.censivn.C3DEngine.a.a().a(this.e);
            if (this.d != null) {
                e eVar = this.d;
                e.u();
            }
        }
    }
}
