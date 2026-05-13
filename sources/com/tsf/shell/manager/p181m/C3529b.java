package com.tsf.shell.manager.p181m;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0902e;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.C3345g;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p174f.C3474b;
import com.tsf.shell.manager.p180l.C3519a;
import com.tsf.shell.p096f.p118e.InterfaceC2557f;
import com.tsf.shell.p096f.p153i.C3105a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3224h;
import com.tsf.shell.utils.C4171h;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.m.b */
/* loaded from: classes.dex */
public class C3529b implements C0925e.InterfaceC0934a, C3105a.InterfaceC3106a {

    /* renamed from: a */
    public static float f11653a = C0892a.m10742a(300.0f);

    /* renamed from: b */
    public static float f11654b = C0892a.m10742a(190.0f);

    /* renamed from: c */
    private C0980j f11655c;

    /* renamed from: d */
    private C3541c f11656d;

    /* renamed from: e */
    private C3524a f11657e;

    /* renamed from: f */
    private C3544d f11658f;

    /* renamed from: h */
    private AbstractC3208b f11660h;

    /* renamed from: i */
    private C3474b.C3478a f11661i;

    /* renamed from: j */
    private C3105a f11662j;

    /* renamed from: m */
    private float f11665m;

    /* renamed from: r */
    private Runnable f11670r;

    /* renamed from: g */
    private boolean f11659g = false;

    /* renamed from: k */
    private int f11663k = 1;

    /* renamed from: l */
    private boolean f11664l = true;

    /* renamed from: n */
    private float f11666n = 0.5f;

    /* renamed from: o */
    private float f11667o = 0.5f;

    /* renamed from: p */
    private boolean f11668p = false;

    /* renamed from: q */
    private boolean f11669q = false;

    /* renamed from: s */
    private boolean f11671s = false;

    /* renamed from: a */
    public float m2112a() {
        return this.f11666n;
    }

    /* renamed from: c */
    public float m2095c() {
        return this.f11667o;
    }

    /* renamed from: a */
    public void m2111a(float f) {
        this.f11666n = f;
        m2088f();
    }

    /* renamed from: b */
    public void m2099b(float f) {
        this.f11667o = f;
        m2088f();
    }

    /* renamed from: d */
    public int m2092d() {
        return this.f11663k;
    }

    /* renamed from: a */
    public void m2101a(boolean z) {
        this.f11664l = z;
    }

    /* renamed from: b */
    public void m2096b(boolean z) {
        this.f11664l = false;
        if (!this.f11659g) {
            this.f11669q = true;
            this.f11658f.mouseEnabled(false);
            if (z) {
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.m.b.1
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C3529b.this.f11658f.visible(false);
                        C3529b.this.f11658f.m2055c();
                    }
                };
                c1017d.mo10301f(m2075r());
                C1014c.m10326a(this.f11658f);
                C1014c.m10325a(this.f11658f, 600, c1017d);
                return;
            }
            this.f11658f.position().f2526x = m2075r();
            this.f11658f.visible(false);
        }
    }

    /* renamed from: a */
    public void m2109a(C0975i c0975i) {
        if (this.f11664l && !m2098b(c0975i)) {
            this.f11658f.m2052d_();
        }
    }

    /* renamed from: e */
    public void m2090e() {
        this.f11658f.m2058b();
    }

    /* renamed from: a */
    public void m2110a(int i, boolean z) {
        this.f11663k = i == 0 ? 0 : 1;
        m2086g();
        if (z) {
            C3430e.m2495b(this.f11663k);
        }
    }

    /* renamed from: f */
    public void m2088f() {
        this.f11665m = C0892a.f2564O ? this.f11666n : this.f11667o;
        this.f11658f.position().f2527y = (C0892a.f2551B - f11654b) - (((C0892a.f2551B - C0892a.f2552C) - (2.0f * f11654b)) * this.f11665m);
    }

    /* renamed from: g */
    public void m2086g() {
        this.f11658f.position().f2526x = m2075r();
        this.f11658f.m2063a(m2076q(), false);
        this.f11656d.position().f2526x = m2074s();
    }

    /* renamed from: h */
    public void m2085h() {
        C3430e.m2489c(this.f11666n);
        C3430e.m2482d(this.f11667o);
    }

    /* renamed from: a */
    public void m2108a(C0980j c0980j) {
        this.f11666n = C3430e.m2454j();
        this.f11666n = this.f11666n > 1.0f ? 0.4f : this.f11666n;
        this.f11666n = this.f11666n < 0.0f ? 0.4f : this.f11666n;
        this.f11667o = C3430e.m2450k();
        this.f11667o = this.f11667o > 1.0f ? 0.4f : this.f11667o;
        this.f11667o = this.f11667o >= 0.0f ? this.f11667o : 0.4f;
        this.f11663k = C3430e.m2458i() == 0 ? 0 : 1;
        C3359a.f11088b.m10565a(this);
        this.f11662j = new C3105a(this, this) { // from class: com.tsf.shell.manager.m.b.3
            @Override // com.tsf.shell.p096f.p153i.C3105a
            /* renamed from: a */
            public void mo2071a(C3112b c3112b) {
            }
        };
        this.f11660h = new C3224h();
        this.f11655c = new C0980j();
        this.f11657e = new C3524a(this) { // from class: com.tsf.shell.manager.m.b.4
            @Override // com.censivn.C3DEngine.p031b.p033b.p034a.C0896c, com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
            public void addChild(C0975i c0975i) {
                super.m10728a(c0975i, true);
            }
        };
        this.f11657e.m10731a(C0892a.m10742a(60.0f));
        this.f11657e.m10725b(C0892a.m10742a(10.0f));
        this.f11656d = new C3541c(this, this.f11657e);
        this.f11657e.m2139a((C0902e) this.f11656d);
        this.f11656d.visible(false);
        this.f11656d.m10665a(this.f11657e);
        c0980j.addChild(this.f11655c);
        this.f11658f = new C3544d(this) { // from class: com.tsf.shell.manager.m.b.5
            @Override // com.tsf.shell.manager.p181m.C3544d, com.tsf.shell.p096f.p118e.p125e.C2554d, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: a */
            public boolean mo2061a(InterfaceC2557f interfaceC2557f, float f, float f2) {
                return C3529b.this.m2098b((C0975i) interfaceC2557f);
            }

            @Override // com.tsf.shell.manager.p181m.C3544d, com.tsf.shell.p096f.p118e.p125e.C2554d, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: a */
            public void mo2062a(InterfaceC2557f interfaceC2557f) {
                if (!C3529b.this.f11659g) {
                    C3359a.f11094h.m4067b().m5329c();
                    C3359a.f11102p.m5312c();
                    C3529b.this.m2093c(false);
                    C3529b.this.f11657e.m2138a(interfaceC2557f);
                    m2058b();
                }
            }

            @Override // com.tsf.shell.manager.p181m.C3544d, com.tsf.shell.p096f.p118e.p125e.C2554d, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: b */
            public boolean mo2057b(InterfaceC2557f interfaceC2557f) {
                return interfaceC2557f instanceof AbstractC3208b;
            }
        };
        this.f11655c.addChild(this.f11658f);
        this.f11655c.addChild(this.f11656d);
        this.f11661i = new C3474b.C3478a() { // from class: com.tsf.shell.manager.m.b.6
            @Override // com.tsf.shell.manager.p174f.C3474b.C3478a
            /* renamed from: a */
            public void mo2070a() {
                if (!C3529b.this.f11657e.m5251v()) {
                    C3529b.this.m2073t();
                }
            }
        };
        m2077p();
        m2086g();
        if (!C3430e.m2462h()) {
            m2096b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m2098b(C0975i c0975i) {
        boolean z;
        if (this.f11669q) {
            return true;
        }
        if (this.f11664l) {
            if (c0975i instanceof AbstractC3208b) {
                Iterator<C3231c> it = ((AbstractC3208b) c0975i).m3061av().iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof AbstractC3208b)) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = true;
            }
            return z;
        }
        z = false;
        return z;
    }

    /* renamed from: i */
    public void m2084i() {
        if (this.f11664l && !this.f11669q) {
            this.f11669q = true;
            this.f11658f.mouseEnabled(false);
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.m.b.7
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3529b.this.f11658f.visible(false);
                }
            };
            if (this.f11663k == 0) {
                c1017d.mo10301f(C0892a.f2590z - C0892a.m10742a(30.0f));
            } else {
                c1017d.mo10301f(C0892a.f2550A + C0892a.m10742a(30.0f));
            }
            C1014c.m10326a(this.f11658f);
            C1014c.m10325a(this.f11658f, 350, c1017d);
        }
    }

    /* renamed from: j */
    public void m2083j() {
        if (this.f11664l && this.f11669q) {
            this.f11669q = false;
            this.f11658f.visible(true);
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.m.b.8
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3529b.this.f11658f.mouseEnabled(true);
                }
            };
            c1017d.mo10301f(m2075r());
            C1014c.m10326a(this.f11658f);
            C1014c.m10325a(this.f11658f, 350, c1017d);
        }
    }

    /* renamed from: k */
    public C0980j m2082k() {
        return this.f11655c;
    }

    @Override // com.tsf.shell.p096f.p153i.C3105a.InterfaceC3106a
    /* renamed from: b */
    public ArrayList<C0975i> mo2100b() {
        return this.f11657e.children();
    }

    /* renamed from: a */
    public void m2107a(C3112b c3112b, boolean z) {
        c3112b.mo3462a(this.f11662j);
        if (z) {
            c3112b.m3534K().onUpdateContainer(-5);
        }
    }

    /* renamed from: p */
    private void m2077p() {
        this.f11658f.position().f2526x = m2075r();
        this.f11656d.setAABBPX((-f11653a) / 2.0f, -C0892a.f2554E, 0.0f, f11653a / 2.0f, 0.0f, 0.0f);
        this.f11656d.position().f2527y = C0892a.f2551B;
        this.f11656d.position().f2526x = m2074s();
        this.f11656d.m10646h();
        m2088f();
    }

    /* renamed from: q */
    private int m2076q() {
        return this.f11659g ? this.f11663k == 0 ? 180 : 0 : this.f11663k == 0 ? 0 : 180;
    }

    /* renamed from: r */
    private float m2075r() {
        if (this.f11659g) {
            if (this.f11663k == 0) {
                return C0892a.f2590z + f11653a;
            }
            return C0892a.f2550A - f11653a;
        } else if (this.f11664l) {
            if (this.f11663k == 0) {
                return C0892a.f2590z + C0892a.m10742a(30.0f);
            }
            return C0892a.f2550A - C0892a.m10742a(30.0f);
        } else if (this.f11663k == 0) {
            return C0892a.f2590z - C0892a.m10742a(60.0f);
        } else {
            return C0892a.f2550A + C0892a.m10742a(60.0f);
        }
    }

    /* renamed from: s */
    private float m2074s() {
        if (this.f11659g) {
            if (this.f11663k == 0) {
                return C0892a.f2590z + (f11653a / 2.0f);
            }
            return C0892a.f2550A - (f11653a / 2.0f);
        } else if (this.f11663k == 0) {
            return C0892a.f2590z - (f11653a / 2.0f);
        } else {
            return C0892a.f2550A + (f11653a / 2.0f);
        }
    }

    /* renamed from: l */
    public void m2081l() {
        if (this.f11659g) {
            m2073t();
        } else {
            m2093c(true);
        }
    }

    /* renamed from: m */
    public boolean m2080m() {
        return this.f11668p;
    }

    /* renamed from: c */
    public void m2093c(boolean z) {
        if (!C3359a.f11094h.m4021s().m3938a()) {
            this.f11668p = !z;
            if (z) {
            }
            if (!this.f11659g) {
                this.f11659g = true;
                C3359a.f11091e.m2269a(this.f11661i, ItemInfo.APP_INTENT, (Runnable) null);
                C3359a.f11101o.m3607k();
                this.f11658f.visible(true);
                C1017d c1017d = new C1017d();
                c1017d.mo10301f(m2075r());
                c1017d.m10313a(C0986a.f2950e);
                C1014c.m10326a(this.f11658f);
                C1014c.m10325a(this.f11658f, 500, c1017d);
                this.f11658f.m2063a(m2076q(), true);
                C1017d c1017d2 = new C1017d();
                c1017d2.mo10301f(m2074s());
                c1017d2.m10313a(C0986a.f2946a);
                C1014c.m10326a(this.f11656d);
                C1014c.m10325a(this.f11656d, 500, c1017d2);
                this.f11656d.visible(true);
                this.f11656d.m2067j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m2073t() {
        m2103a((Runnable) null);
    }

    /* renamed from: a */
    public void m2103a(Runnable runnable) {
        if (this.f11659g) {
            this.f11659g = false;
            C3359a.f11091e.m2266a(runnable, true);
            C3359a.f11101o.m3611i();
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.m.b.9
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    if (!C3529b.this.f11664l) {
                        C3529b.this.f11658f.visible(false);
                    }
                    if (C3529b.this.f11656d != null) {
                        C3529b.this.f11656d.m2066k();
                    }
                }
            };
            c1017d.mo10301f(m2075r());
            c1017d.m10313a(C0986a.f2950e);
            C1014c.m10326a(this.f11658f);
            C1014c.m10325a(this.f11658f, 500, c1017d);
            this.f11658f.m2063a(m2076q(), true);
            C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.manager.m.b.10
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3529b.this.f11656d.visible(false);
                }
            };
            c1017d2.mo10301f(m2074s());
            C1014c.m10326a(this.f11656d);
            C1014c.m10325a(this.f11656d, 300, c1017d2);
        }
    }

    /* renamed from: a */
    public void m2102a(ArrayList<ItemInfo> arrayList, String str) {
        Iterator<ItemInfo> it = C4171h.m678a(arrayList, str, ",", true).iterator();
        while (it.hasNext()) {
            AbstractC3208b m2146a = C3519a.m2146a(it.next(), true);
            m2107a((C3112b) m2146a, false);
            this.f11657e.addChild(m2146a);
        }
        this.f11657e.m10732a();
    }

    /* renamed from: n */
    public static String m2079n() {
        Cursor query = C0853a.m10856d().getContentResolver().query(C3345g.C3352g.f11071a, null, null, null, null);
        String str = "";
        while (query.moveToNext()) {
            str = query.getString(query.getColumnIndex("child"));
        }
        if (str == null) {
            str = "";
        }
        query.close();
        return str;
    }

    /* renamed from: o */
    public void m2078o() {
        if (this.f11670r == null) {
            m2072u();
        }
        if (!this.f11671s) {
            this.f11671s = true;
            C0853a.m10865a().m10583c(this.f11670r);
        }
    }

    /* renamed from: u */
    private void m2072u() {
        this.f11670r = new Runnable() { // from class: com.tsf.shell.manager.m.b.2
            @Override // java.lang.Runnable
            public void run() {
                C0975i next;
                String str;
                C3529b.this.f11671s = false;
                final String str2 = "";
                Iterator<C0975i> it = C3529b.this.f11657e.children().iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof C3112b) {
                        str = str2 + ((C3112b) next).m3534K().f2532id + ",";
                    } else {
                        str = str2;
                    }
                    str2 = str;
                }
                C0853a.m10865a().m10581d(new Runnable() { // from class: com.tsf.shell.manager.m.b.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ContentResolver contentResolver = C0853a.m10856d().getContentResolver();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("child", str2);
                        contentResolver.update(ContentUris.withAppendedId(C3345g.C3352g.f11071a, 1L), contentValues, null, null);
                        contentValues.clear();
                    }
                });
            }
        };
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        m2077p();
    }
}
