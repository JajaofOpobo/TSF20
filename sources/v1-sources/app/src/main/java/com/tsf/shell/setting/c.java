package com.tsf.shell.setting;

import android.bluetooth.BluetoothAdapter;
import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
public final class c {
    private static c a;
    private int b;
    private e c;
    private RenderRunnable d;
    private BluetoothAdapter e;

    public static c a() {
        if (a == null) {
            a = new c();
        }
        return a;
    }

    public c() {
        try {
            this.e = BluetoothAdapter.getDefaultAdapter();
            this.b = this.e.getState();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final BluetoothAdapter b() {
        return this.e;
    }

    public final void c() {
        try {
            this.e.enable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void d() {
        try {
            this.e.disable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(e eVar) {
        this.c = eVar;
        e();
    }

    public final void e() {
        if (this.c != null) {
            switch (this.b) {
                case 10:
                    this.c.e(0);
                    break;
                case 11:
                    this.c.e(2);
                    break;
                case 12:
                    this.c.e(1);
                    break;
                case 13:
                    this.c.e(2);
                    break;
                default:
                    this.c.e(0);
                    break;
            }
        }
    }

    public final void a(int i) {
        if (com.censivn.C3DEngine.a.c() != null && com.censivn.C3DEngine.a.a() != null) {
            if (this.d != null) {
                com.censivn.C3DEngine.a.a().b(this.d);
                this.d = null;
            }
            this.b = i;
            this.d = new d(this);
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
