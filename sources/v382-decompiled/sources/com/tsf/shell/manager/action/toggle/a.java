package com.tsf.shell.manager.action.toggle;

import android.graphics.Bitmap;
import android.os.Build;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import com.tsf.shell.e.i.b.e.k;
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
    public com.tsf.shell.manager.action.toggle.a.c g;
    public com.tsf.shell.manager.action.toggle.a.c h;
    public com.tsf.shell.manager.action.toggle.a.c i;
    public com.tsf.shell.manager.action.toggle.a.c j;
    public com.tsf.shell.manager.action.toggle.a.c k;
    public com.tsf.shell.manager.action.toggle.a.c l;
    public com.tsf.shell.manager.action.toggle.a.c m;
    public com.tsf.shell.manager.action.toggle.a.c n;
    public com.tsf.shell.manager.action.toggle.a.c o;
    public com.tsf.shell.manager.action.toggle.a.c p;
    public com.tsf.shell.manager.action.toggle.a.c q;
    private TextureElement s = new TextureElement(0, false);
    private TextureElement t = new TextureElement(0, false);
    private ArrayList r = new ArrayList();
    public f b = new f(11000);

    public a() {
        this.r.add(this.b);
        if (Build.VERSION.SDK_INT < 21) {
            this.f = new com.tsf.shell.manager.action.toggle.a.d(12000);
        } else {
            this.f = new com.tsf.shell.manager.action.toggle.a.c(12000);
        }
        this.r.add(this.f);
        this.c = new com.tsf.shell.manager.action.toggle.a.a(13000);
        this.r.add(this.c);
        this.e = new e(14000);
        this.r.add(this.e);
        this.d = new com.tsf.shell.manager.action.toggle.a.b(15000);
        this.r.add(this.d);
        this.g = new com.tsf.shell.manager.action.toggle.a.c(16000);
        this.r.add(this.g);
        this.h = new com.tsf.shell.manager.action.toggle.a.c(17000);
        this.r.add(this.h);
        this.i = new com.tsf.shell.manager.action.toggle.a.c(18000);
        this.r.add(this.i);
        this.j = new com.tsf.shell.manager.action.toggle.a.c(19000);
        this.r.add(this.j);
        this.k = new com.tsf.shell.manager.action.toggle.a.c(20000);
        this.r.add(this.k);
        this.l = new com.tsf.shell.manager.action.toggle.a.c(21000);
        this.r.add(this.l);
        this.m = new com.tsf.shell.manager.action.toggle.a.c(22000);
        this.r.add(this.m);
        this.n = new com.tsf.shell.manager.action.toggle.a.c(23000);
        this.r.add(this.n);
        this.o = new com.tsf.shell.manager.action.toggle.a.c(24000);
        this.r.add(this.o);
        this.p = new com.tsf.shell.manager.action.toggle.a.c(25000);
        this.r.add(this.p);
        this.q = new com.tsf.shell.manager.action.toggle.a.c(26000);
        this.r.add(this.q);
        this.a = new ToggleStateManager(this);
    }

    public void a(String str, int i) {
        if (str.equals(com.tsf.shell.services.f.h)) {
            this.k.c(i);
            return;
        }
        if (str.equals(com.tsf.shell.services.f.i)) {
            this.g.c(i);
            return;
        }
        if (str.equals(com.tsf.shell.services.f.e)) {
            this.i.c(i);
            return;
        }
        if (str.equals(com.tsf.shell.services.f.g)) {
            this.l.c(i);
            return;
        }
        if (str.equals(com.tsf.shell.services.f.f)) {
            this.j.c(i);
            return;
        }
        if (str.equals(com.tsf.shell.services.f.d)) {
            this.p.c(i);
        } else if (str.equals(com.tsf.shell.services.f.j) && (this.f instanceof com.tsf.shell.manager.action.toggle.a.c)) {
            ((com.tsf.shell.manager.action.toggle.a.c) this.f).c(i);
        }
    }

    public ArrayList a() {
        return this.r;
    }

    public void a(k kVar) {
        c(kVar.aV()).a(kVar);
    }

    public void b(k kVar) {
        c(kVar.aV()).b(kVar);
    }

    private b c(int i) {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.a == i) {
                return bVar;
            }
        }
        return (b) this.r.get(0);
    }

    public void a(int i) {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.a == i) {
                bVar.c();
                return;
            }
        }
    }

    public TextureElement b() {
        if (this.s.id == 0) {
            Bitmap a = x.a(R.drawable.toggle_shortcut_circle, com.tsf.shell.manager.o.b.c.H, com.tsf.shell.manager.o.b.c.I);
            com.censivn.C3DEngine.a.g().a(this.s, a);
            a.recycle();
        }
        return this.s;
    }

    public TextureElement c() {
        if (this.t.id == 0) {
            Bitmap a = x.a(R.drawable.toggle_shortcut_circle_loading, com.tsf.shell.manager.o.b.c.H, com.tsf.shell.manager.o.b.c.I);
            com.censivn.C3DEngine.a.g().a(this.t, a);
            a.recycle();
        }
        return this.t;
    }

    public static ArrayList d() {
        ArrayList arrayList = new ArrayList();
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.tsf.shell.manager.action.c b(int i) {
        com.tsf.shell.manager.action.c cVar = new com.tsf.shell.manager.action.c();
        cVar.a = i;
        switch (i) {
            case 11000:
                cVar.b = x.c(R.string.text_toggle_wifi);
                cVar.c = R.drawable.icon_toggle_wifi;
                break;
            case 12000:
                cVar.b = x.c(R.string.text_toggle_mobile_data);
                cVar.c = R.drawable.icon_toggle_mobile_data;
                break;
            case 13000:
                cVar.b = x.c(R.string.text_toggle_bluetooth);
                cVar.c = R.drawable.icon_toggle_bluetooth;
                break;
            case 14000:
                cVar.b = x.c(R.string.text_toggle_volume);
                cVar.c = R.drawable.icon_toggle_volume_on;
                break;
            case 15000:
                cVar.b = x.c(R.string.text_toggle_brightness);
                cVar.c = R.drawable.icon_toggle_bright_1;
                break;
            case 16000:
                cVar.b = x.c(R.string.text_toggle_flash_light);
                cVar.c = R.drawable.icon_toggle_flash;
                break;
            case 17000:
                cVar.b = x.c(R.string.text_toggle_screen_lock);
                cVar.c = R.drawable.icon_toggle_lock;
                break;
            case 18000:
                cVar.b = x.c(R.string.text_toggle_gps);
                cVar.c = R.drawable.icon_toggle_gps;
                break;
            case 19000:
                cVar.b = x.c(R.string.text_toggle_screen_rotation);
                cVar.c = R.drawable.icon_toggle_autorotate;
                break;
            case 20000:
                cVar.b = x.c(R.string.text_toggle_airplane_mode);
                cVar.c = R.drawable.icon_toggle_airplane;
                break;
            case 21000:
                cVar.b = x.c(R.string.text_toggle_nfc);
                cVar.c = R.drawable.icon_toggle_nfc;
                break;
            case 22000:
                cVar.b = x.c(R.string.text_toggle_shutdown);
                cVar.c = R.drawable.icon_toggle_flash;
                break;
            case 23000:
                cVar.b = x.c(R.string.text_toggle_restart);
                cVar.c = R.drawable.icon_toggle_restart;
                break;
            case 24000:
                cVar.b = x.c(R.string.text_toggle_home);
                cVar.c = R.drawable.icon_toggle_home;
                break;
            case 25000:
                cVar.b = x.c(R.string.text_toggle_sync);
                cVar.c = R.drawable.icon_toggle_sync;
                break;
            case 26000:
                cVar.b = x.c(R.string.text_toggle_recent_apps);
                cVar.c = R.drawable.icon_toggle_recent;
                break;
        }
    }
}
