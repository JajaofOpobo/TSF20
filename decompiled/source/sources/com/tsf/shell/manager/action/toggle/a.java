package com.tsf.shell.manager.action.toggle;

import android.graphics.Bitmap;
import android.os.Build;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.b;
import com.tsf.shell.f.i.b.e.i;
import com.tsf.shell.manager.action.b;
import com.tsf.shell.manager.action.toggle.a.c;
import com.tsf.shell.manager.action.toggle.a.d;
import com.tsf.shell.manager.action.toggle.a.e;
import com.tsf.shell.manager.action.toggle.a.f;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class a {
    public ToggleStateManager a;
    public com.tsf.shell.manager.action.toggle.a.a c;
    public com.tsf.shell.manager.action.toggle.a.b d;
    public e e;
    public b f;
    public c g;
    public c h;
    public c i;
    public c j;
    public c k;
    public c l;
    public c m;
    public c n;
    public c o;
    public c p;
    public c q;
    private TextureElement s = new TextureElement(0, false);
    private TextureElement t = new TextureElement(0, false);
    private ArrayList<b> r = new ArrayList<>();
    public f b = new f(11000);

    public a() {
        this.r.add(this.b);
        if (Build.VERSION.SDK_INT < 21) {
            this.f = new d(12000);
        } else {
            this.f = new c(12000);
        }
        this.r.add(this.f);
        this.c = new com.tsf.shell.manager.action.toggle.a.a(13000);
        this.r.add(this.c);
        this.e = new e(14000);
        this.r.add(this.e);
        this.d = new com.tsf.shell.manager.action.toggle.a.b(15000);
        this.r.add(this.d);
        this.g = new c(16000);
        this.r.add(this.g);
        this.h = new c(17000);
        this.r.add(this.h);
        this.i = new c(18000);
        this.r.add(this.i);
        this.j = new c(19000);
        this.r.add(this.j);
        this.k = new c(20000);
        this.r.add(this.k);
        this.l = new c(21000);
        this.r.add(this.l);
        this.m = new c(22000);
        this.r.add(this.m);
        this.n = new c(23000);
        this.r.add(this.n);
        this.o = new c(24000);
        this.r.add(this.o);
        this.p = new c(25000);
        this.r.add(this.p);
        this.q = new c(26000);
        this.r.add(this.q);
        this.a = new ToggleStateManager(this);
    }

    public void a(String str, int i) {
        if (str.equals(com.tsf.shell.services.d.h)) {
            this.k.c(i);
        } else if (str.equals(com.tsf.shell.services.d.i)) {
            this.g.c(i);
        } else if (str.equals(com.tsf.shell.services.d.e)) {
            this.i.c(i);
        } else if (str.equals(com.tsf.shell.services.d.g)) {
            this.l.c(i);
        } else if (str.equals(com.tsf.shell.services.d.f)) {
            this.j.c(i);
        } else if (str.equals(com.tsf.shell.services.d.d)) {
            this.p.c(i);
        } else if (str.equals(com.tsf.shell.services.d.j) && (this.f instanceof c)) {
            ((c) this.f).c(i);
        }
    }

    public ArrayList<b> a() {
        return this.r;
    }

    public void a(i iVar) {
        c(iVar.aV()).a(iVar);
    }

    public void b(i iVar) {
        c(iVar.aV()).b(iVar);
    }

    private b c(int i) {
        Iterator<b> it = this.r.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.a == i) {
                return next;
            }
        }
        return this.r.get(0);
    }

    public void a(int i) {
        Iterator<b> it = this.r.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.a == i) {
                next.c();
                return;
            }
        }
    }

    public TextureElement b() {
        if (this.s.id == 0) {
            Bitmap a = x.a(b.d.toggle_shortcut_circle, com.tsf.shell.manager.o.b.c.H, com.tsf.shell.manager.o.b.c.I);
            com.censivn.C3DEngine.a.g().a(this.s, a);
            a.recycle();
        }
        return this.s;
    }

    public TextureElement c() {
        if (this.t.id == 0) {
            Bitmap a = x.a(b.d.toggle_shortcut_circle_loading, com.tsf.shell.manager.o.b.c.H, com.tsf.shell.manager.o.b.c.I);
            com.censivn.C3DEngine.a.g().a(this.t, a);
            a.recycle();
        }
        return this.t;
    }

    public static ArrayList<b.a> d() {
        ArrayList<b.a> arrayList = new ArrayList<>();
        arrayList.add(b(11000));
        arrayList.add(b(12000));
        arrayList.add(b(13000));
        arrayList.add(b(14000));
        arrayList.add(b(15000));
        arrayList.add(b(16000));
        arrayList.add(b(17000));
        arrayList.add(b(18000));
        arrayList.add(b(19000));
        arrayList.add(b(20000));
        arrayList.add(b(21000));
        arrayList.add(b(22000));
        arrayList.add(b(23000));
        arrayList.add(b(24000));
        arrayList.add(b(25000));
        arrayList.add(b(26000));
        return arrayList;
    }

    public static b.a b(int i) {
        b.a aVar = new b.a();
        aVar.a = i;
        switch (i) {
            case 11000:
                aVar.b = x.c(b.i.text_toggle_wifi);
                aVar.c = b.d.icon_toggle_wifi;
                break;
            case 12000:
                aVar.b = x.c(b.i.text_toggle_mobile_data);
                aVar.c = b.d.icon_toggle_mobile_data;
                break;
            case 13000:
                aVar.b = x.c(b.i.text_toggle_bluetooth);
                aVar.c = b.d.icon_toggle_bluetooth;
                break;
            case 14000:
                aVar.b = x.c(b.i.text_toggle_volume);
                aVar.c = b.d.icon_toggle_volume_on;
                break;
            case 15000:
                aVar.b = x.c(b.i.text_toggle_brightness);
                aVar.c = b.d.icon_toggle_bright_1;
                break;
            case 16000:
                aVar.b = x.c(b.i.text_toggle_flash_light);
                aVar.c = b.d.icon_toggle_flash;
                break;
            case 17000:
                aVar.b = x.c(b.i.text_toggle_screen_lock);
                aVar.c = b.d.icon_toggle_lock;
                break;
            case 18000:
                aVar.b = x.c(b.i.text_toggle_gps);
                aVar.c = b.d.icon_toggle_gps;
                break;
            case 19000:
                aVar.b = x.c(b.i.text_toggle_screen_rotation);
                aVar.c = b.d.icon_toggle_autorotate;
                break;
            case 20000:
                aVar.b = x.c(b.i.text_toggle_airplane_mode);
                aVar.c = b.d.icon_toggle_airplane;
                break;
            case 21000:
                aVar.b = x.c(b.i.text_toggle_nfc);
                aVar.c = b.d.icon_toggle_nfc;
                break;
            case 22000:
                aVar.b = x.c(b.i.text_toggle_shutdown);
                aVar.c = b.d.icon_toggle_flash;
                break;
            case 23000:
                aVar.b = x.c(b.i.text_toggle_restart);
                aVar.c = b.d.icon_toggle_restart;
                break;
            case 24000:
                aVar.b = x.c(b.i.text_toggle_home);
                aVar.c = b.d.icon_toggle_home;
                break;
            case 25000:
                aVar.b = x.c(b.i.text_toggle_sync);
                aVar.c = b.d.icon_toggle_sync;
                break;
            case 26000:
                aVar.b = x.c(b.i.text_toggle_recent_apps);
                aVar.c = b.d.icon_toggle_recent;
                break;
        }
        return aVar;
    }
}
