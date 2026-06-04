package com.tsf.shell.setting;

import android.net.wifi.WifiManager;
import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
public final class y {
    private static y a;
    private int b;
    private e c;
    private RenderRunnable d;

    public static y a() {
        if (a == null) {
            a = new y();
        }
        return a;
    }

    public final void a(e eVar) {
        this.c = eVar;
        this.b = ((WifiManager) com.censivn.C3DEngine.a.c().getSystemService("wifi")).getWifiState();
        b();
    }

    public final void b() {
        if (this.c != null) {
            switch (this.b) {
                case 0:
                    this.c.e(2);
                    break;
                case 1:
                    this.c.e(0);
                    break;
                case 2:
                    this.c.e(2);
                    break;
                case 3:
                    this.c.e(1);
                    break;
                case 4:
                    this.c.e(0);
                    break;
            }
        }
    }

    public final void c() {
        if (com.censivn.C3DEngine.a.c() != null && com.censivn.C3DEngine.a.a() != null) {
            this.b = ((WifiManager) com.censivn.C3DEngine.a.c().getSystemService("wifi")).getWifiState();
            if (this.d != null) {
                com.censivn.C3DEngine.a.a().b(this.d);
                this.d = null;
            }
            this.d = new z(this);
            if (com.tsf.shell.i.a().b()) {
                this.d.autoInvalidate = true;
            }
            com.censivn.C3DEngine.a.a().a(this.d);
            if (this.c != null) {
                e eVar = this.c;
                e.u();
            }
        }
    }
}
