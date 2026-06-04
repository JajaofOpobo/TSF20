package com.tsf.shell.setting;

import android.provider.Settings;
import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
public final class a {
    public static String a = "android.intent.action.SERVICE_STATE";
    private static a b;
    private int c;
    private e d;
    private RenderRunnable e;

    public static a a() {
        if (b == null) {
            b = new a();
        }
        return b;
    }

    public final void a(e eVar) {
        this.d = eVar;
        try {
            if (Settings.System.getString(com.censivn.C3DEngine.a.c().getContentResolver(), "airplane_mode_on").equals("0")) {
                this.c = 0;
            } else {
                this.c = 1;
            }
        } catch (Exception e) {
            this.c = 0;
        }
        b();
    }

    public final void b() {
        if (this.d != null) {
            switch (this.c) {
                case 0:
                    this.d.e(0);
                    break;
                case 1:
                    this.d.e(1);
                    break;
                default:
                    this.d.e(2);
                    break;
            }
        }
    }

    public final void c() {
        if (com.censivn.C3DEngine.a.c() != null && com.censivn.C3DEngine.a.a() != null) {
            if (Settings.System.getString(com.censivn.C3DEngine.a.c().getContentResolver(), "airplane_mode_on").equals("0")) {
                this.c = 0;
            } else {
                this.c = 1;
            }
            if (this.e != null) {
                com.censivn.C3DEngine.a.a().b(this.e);
                this.e = null;
            }
            this.e = new b(this);
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
