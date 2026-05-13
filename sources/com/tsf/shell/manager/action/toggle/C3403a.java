package com.tsf.shell.manager.action.toggle;

import android.graphics.Bitmap;
import android.os.Build;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.C1306b;
import com.tsf.shell.manager.action.C3386b;
import com.tsf.shell.manager.action.toggle.p167a.C3404a;
import com.tsf.shell.manager.action.toggle.p167a.C3405b;
import com.tsf.shell.manager.action.toggle.p167a.C3407c;
import com.tsf.shell.manager.action.toggle.p167a.C3411d;
import com.tsf.shell.manager.action.toggle.p167a.C3412e;
import com.tsf.shell.manager.action.toggle.p167a.C3413f;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3225i;
import com.tsf.shell.services.ServiceConnectionC4102d;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.action.toggle.a */
/* loaded from: classes.dex */
public class C3403a {

    /* renamed from: a */
    public ToggleStateManager f11259a;

    /* renamed from: c */
    public C3404a f11261c;

    /* renamed from: d */
    public C3405b f11262d;

    /* renamed from: e */
    public C3412e f11263e;

    /* renamed from: f */
    public C3414b f11264f;

    /* renamed from: g */
    public C3407c f11265g;

    /* renamed from: h */
    public C3407c f11266h;

    /* renamed from: i */
    public C3407c f11267i;

    /* renamed from: j */
    public C3407c f11268j;

    /* renamed from: k */
    public C3407c f11269k;

    /* renamed from: l */
    public C3407c f11270l;

    /* renamed from: m */
    public C3407c f11271m;

    /* renamed from: n */
    public C3407c f11272n;

    /* renamed from: o */
    public C3407c f11273o;

    /* renamed from: p */
    public C3407c f11274p;

    /* renamed from: q */
    public C3407c f11275q;

    /* renamed from: s */
    private TextureElement f11277s = new TextureElement(0, false);

    /* renamed from: t */
    private TextureElement f11278t = new TextureElement(0, false);

    /* renamed from: r */
    private ArrayList<C3414b> f11276r = new ArrayList<>();

    /* renamed from: b */
    public C3413f f11260b = new C3413f(11000);

    public C3403a() {
        this.f11276r.add(this.f11260b);
        if (Build.VERSION.SDK_INT < 21) {
            this.f11264f = new C3411d(12000);
        } else {
            this.f11264f = new C3407c(12000);
        }
        this.f11276r.add(this.f11264f);
        this.f11261c = new C3404a(13000);
        this.f11276r.add(this.f11261c);
        this.f11263e = new C3412e(14000);
        this.f11276r.add(this.f11263e);
        this.f11262d = new C3405b(15000);
        this.f11276r.add(this.f11262d);
        this.f11265g = new C3407c(16000);
        this.f11276r.add(this.f11265g);
        this.f11266h = new C3407c(17000);
        this.f11276r.add(this.f11266h);
        this.f11267i = new C3407c(18000);
        this.f11276r.add(this.f11267i);
        this.f11268j = new C3407c(19000);
        this.f11276r.add(this.f11268j);
        this.f11269k = new C3407c(20000);
        this.f11276r.add(this.f11269k);
        this.f11270l = new C3407c(21000);
        this.f11276r.add(this.f11270l);
        this.f11271m = new C3407c(22000);
        this.f11276r.add(this.f11271m);
        this.f11272n = new C3407c(23000);
        this.f11276r.add(this.f11272n);
        this.f11273o = new C3407c(24000);
        this.f11276r.add(this.f11273o);
        this.f11274p = new C3407c(25000);
        this.f11276r.add(this.f11274p);
        this.f11275q = new C3407c(26000);
        this.f11276r.add(this.f11275q);
        this.f11259a = new ToggleStateManager(this);
    }

    /* renamed from: a */
    public void m2630a(String str, int i) {
        if (str.equals(ServiceConnectionC4102d.f13372h)) {
            this.f11269k.m2613c(i);
        } else if (str.equals(ServiceConnectionC4102d.f13373i)) {
            this.f11265g.m2613c(i);
        } else if (str.equals(ServiceConnectionC4102d.f13369e)) {
            this.f11267i.m2613c(i);
        } else if (str.equals(ServiceConnectionC4102d.f13371g)) {
            this.f11270l.m2613c(i);
        } else if (str.equals(ServiceConnectionC4102d.f13370f)) {
            this.f11268j.m2613c(i);
        } else if (str.equals(ServiceConnectionC4102d.f13368d)) {
            this.f11274p.m2613c(i);
        } else if (str.equals(ServiceConnectionC4102d.f13374j) && (this.f11264f instanceof C3407c)) {
            ((C3407c) this.f11264f).m2613c(i);
        }
    }

    /* renamed from: a */
    public ArrayList<C3414b> m2633a() {
        return this.f11276r;
    }

    /* renamed from: a */
    public void m2631a(C3225i c3225i) {
        m2625c(c3225i.m3096aV()).m2606a(c3225i);
    }

    /* renamed from: b */
    public void m2627b(C3225i c3225i) {
        m2625c(c3225i.m3096aV()).m2603b(c3225i);
    }

    /* renamed from: c */
    private C3414b m2625c(int i) {
        Iterator<C3414b> it = this.f11276r.iterator();
        while (it.hasNext()) {
            C3414b next = it.next();
            if (next.f11287a == i) {
                return next;
            }
        }
        return this.f11276r.get(0);
    }

    /* renamed from: a */
    public void m2632a(int i) {
        Iterator<C3414b> it = this.f11276r.iterator();
        while (it.hasNext()) {
            C3414b next = it.next();
            if (next.f11287a == i) {
                next.mo2602c();
                return;
            }
        }
    }

    /* renamed from: b */
    public TextureElement m2629b() {
        if (this.f11277s.f2529id == 0) {
            Bitmap m607a = C4189x.m607a(C1306b.C1310d.toggle_shortcut_circle, C3566b.f11841c.f11750H, C3566b.f11841c.f11751I);
            C0853a.m10853g().m10540a(this.f11277s, m607a);
            m607a.recycle();
        }
        return this.f11277s;
    }

    /* renamed from: c */
    public TextureElement m2626c() {
        if (this.f11278t.f2529id == 0) {
            Bitmap m607a = C4189x.m607a(C1306b.C1310d.toggle_shortcut_circle_loading, C3566b.f11841c.f11750H, C3566b.f11841c.f11751I);
            C0853a.m10853g().m10540a(this.f11278t, m607a);
            m607a.recycle();
        }
        return this.f11278t;
    }

    /* renamed from: d */
    public static ArrayList<C3386b.C3389a> m2624d() {
        ArrayList<C3386b.C3389a> arrayList = new ArrayList<>();
        arrayList.add(m2628b(11000));
        arrayList.add(m2628b(12000));
        arrayList.add(m2628b(13000));
        arrayList.add(m2628b(14000));
        arrayList.add(m2628b(15000));
        arrayList.add(m2628b(16000));
        arrayList.add(m2628b(17000));
        arrayList.add(m2628b(18000));
        arrayList.add(m2628b(19000));
        arrayList.add(m2628b(20000));
        arrayList.add(m2628b(21000));
        arrayList.add(m2628b(22000));
        arrayList.add(m2628b(23000));
        arrayList.add(m2628b(24000));
        arrayList.add(m2628b(25000));
        arrayList.add(m2628b(26000));
        return arrayList;
    }

    /* renamed from: b */
    public static C3386b.C3389a m2628b(int i) {
        C3386b.C3389a c3389a = new C3386b.C3389a();
        c3389a.f11194a = i;
        switch (i) {
            case 11000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_toggle_wifi);
                c3389a.f11196c = C1306b.C1310d.icon_toggle_wifi;
                break;
            case 12000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_toggle_mobile_data);
                c3389a.f11196c = C1306b.C1310d.icon_toggle_mobile_data;
                break;
            case 13000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_toggle_bluetooth);
                c3389a.f11196c = C1306b.C1310d.icon_toggle_bluetooth;
                break;
            case 14000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_toggle_volume);
                c3389a.f11196c = C1306b.C1310d.icon_toggle_volume_on;
                break;
            case 15000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_toggle_brightness);
                c3389a.f11196c = C1306b.C1310d.icon_toggle_bright_1;
                break;
            case 16000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_toggle_flash_light);
                c3389a.f11196c = C1306b.C1310d.icon_toggle_flash;
                break;
            case 17000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_toggle_screen_lock);
                c3389a.f11196c = C1306b.C1310d.icon_toggle_lock;
                break;
            case 18000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_toggle_gps);
                c3389a.f11196c = C1306b.C1310d.icon_toggle_gps;
                break;
            case 19000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_toggle_screen_rotation);
                c3389a.f11196c = C1306b.C1310d.icon_toggle_autorotate;
                break;
            case 20000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_toggle_airplane_mode);
                c3389a.f11196c = C1306b.C1310d.icon_toggle_airplane;
                break;
            case 21000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_toggle_nfc);
                c3389a.f11196c = C1306b.C1310d.icon_toggle_nfc;
                break;
            case 22000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_toggle_shutdown);
                c3389a.f11196c = C1306b.C1310d.icon_toggle_flash;
                break;
            case 23000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_toggle_restart);
                c3389a.f11196c = C1306b.C1310d.icon_toggle_restart;
                break;
            case 24000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_toggle_home);
                c3389a.f11196c = C1306b.C1310d.icon_toggle_home;
                break;
            case 25000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_toggle_sync);
                c3389a.f11196c = C1306b.C1310d.icon_toggle_sync;
                break;
            case 26000:
                c3389a.f11195b = C4189x.m588c(C1306b.C1315i.text_toggle_recent_apps);
                c3389a.f11196c = C1306b.C1310d.icon_toggle_recent;
                break;
        }
        return c3389a;
    }
}
