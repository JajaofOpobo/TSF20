package com.tsf.shell.p096f.p153i.p155b.p159d;

import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.utils.C4187w;
/* renamed from: com.tsf.shell.f.i.b.d.e */
/* loaded from: classes.dex */
public class C3171e {

    /* renamed from: a */
    private C1017d f10331a;

    /* renamed from: b */
    private C1017d f10332b;

    /* renamed from: c */
    private C1017d f10333c;

    /* renamed from: d */
    private C1017d f10334d;

    /* renamed from: e */
    private C1017d f10335e;

    /* renamed from: f */
    private C1017d f10336f;

    /* renamed from: g */
    private C1017d f10337g;

    /* renamed from: h */
    private C1017d f10338h;

    /* renamed from: i */
    private C3145b f10339i;

    public C3171e(C3145b c3145b) {
        this.f10339i = c3145b;
        m3283c();
    }

    /* renamed from: a */
    public void m3289a() {
        m3283c();
    }

    /* renamed from: c */
    private void m3283c() {
        C3187j c3187j = C3145b.f10241l;
        this.f10331a = new C1017d();
        this.f10331a.m10294l(1.2f);
        this.f10331a.m10293m(1.2f);
        this.f10331a.mo10301f(c3187j.m3224c().folder.backPlaneX + ((c3187j.m3224c().folder.frontPlaneX - c3187j.m3224c().folder.backPlaneX) * 1.2f));
        this.f10331a.mo10298h(c3187j.m3224c().folder.backPlaneY + ((c3187j.m3224c().folder.frontPlaneY - c3187j.m3224c().folder.backPlaneY) * 1.2f));
        this.f10332b = new C1017d();
        this.f10332b.m10294l(1.2f);
        this.f10332b.m10293m(1.2f);
        this.f10332b.mo10301f(c3187j.m3224c().folder.backPlaneX);
        this.f10332b.mo10298h(c3187j.m3224c().folder.backPlaneY);
        this.f10333c = new C1017d();
        this.f10333c.m10294l(1.2f);
        this.f10333c.m10293m(1.2f);
        this.f10333c.mo10301f(c3187j.m3224c().folder.backPlaneX + ((c3187j.m3224c().folder.textPlaneX - c3187j.m3224c().folder.backPlaneX) * 1.2f));
        this.f10333c.mo10298h(c3187j.m3224c().folder.backPlaneY + ((c3187j.m3224c().folder.textPlaneY - c3187j.m3224c().folder.backPlaneY) * 1.2f));
        if (c3187j.m3224c().folder.sizePlaneEnable) {
            this.f10334d = new C1017d();
            this.f10334d.m10294l(1.2f);
            this.f10334d.m10293m(1.2f);
            this.f10334d.mo10301f(c3187j.m3224c().folder.backPlaneX + ((c3187j.m3224c().folder.sizePlaneX - c3187j.m3224c().folder.backPlaneX) * 1.2f));
            this.f10334d.mo10298h((1.2f * (c3187j.m3224c().folder.sizePlaneY - c3187j.m3224c().folder.backPlaneY)) + c3187j.m3224c().folder.backPlaneY);
        }
        this.f10335e = new C1017d();
        this.f10335e.m10294l(1.0f);
        this.f10335e.m10293m(1.0f);
        this.f10335e.mo10301f(c3187j.m3224c().folder.frontPlaneX);
        this.f10335e.mo10298h(c3187j.m3224c().folder.frontPlaneY);
        this.f10336f = new C1017d();
        this.f10336f.m10294l(1.0f);
        this.f10336f.m10293m(1.0f);
        this.f10336f.mo10301f(c3187j.m3224c().folder.backPlaneX);
        this.f10336f.mo10298h(c3187j.m3224c().folder.backPlaneY);
        this.f10337g = new C1017d() { // from class: com.tsf.shell.f.i.b.d.e.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3171e.this.f10339i.m3347ba();
                if (C3171e.this.f10339i.f10280x) {
                    C3145b.f10242m.m3290e(C3171e.this.f10339i);
                }
            }
        };
        this.f10337g.m10294l(1.0f);
        this.f10337g.m10293m(1.0f);
        this.f10337g.mo10301f(c3187j.m3224c().folder.textPlaneX);
        this.f10337g.mo10298h(c3187j.m3224c().folder.textPlaneY);
        if (c3187j.m3224c().folder.sizePlaneEnable) {
            this.f10338h = new C1017d();
            this.f10338h.m10294l(1.0f);
            this.f10338h.m10293m(1.0f);
            this.f10338h.mo10301f(c3187j.m3224c().folder.sizePlaneX);
            this.f10338h.mo10298h(c3187j.m3224c().folder.sizePlaneY);
        }
    }

    /* renamed from: a */
    public void m3288a(float f) {
        C3187j c3187j = C3145b.f10241l;
        if (c3187j.m3224c().folder.frontPlaneEnable) {
            this.f10339i.f10273q.scale().setAll(f, f, 1.0f);
            this.f10339i.f10273q.position().f2526x = c3187j.m3224c().folder.backPlaneX;
            this.f10339i.f10273q.position().f2527y = c3187j.m3224c().folder.backPlaneY;
        }
        if (c3187j.m3224c().folder.backPlaneEnable) {
            this.f10339i.f10272p.scale().setAll(f, f, 1.0f);
            this.f10339i.f10272p.position().f2526x = c3187j.m3224c().folder.backPlaneX;
            this.f10339i.f10272p.position().f2527y = c3187j.m3224c().folder.backPlaneY;
        }
        this.f10339i.f10274r.scale().setAll(f, f, 1.0f);
        this.f10339i.f10274r.position().f2526x = c3187j.m3224c().folder.backPlaneX;
        this.f10339i.f10274r.position().f2527y = c3187j.m3224c().folder.backPlaneY;
        if (c3187j.m3224c().folder.sizePlaneEnable) {
            this.f10339i.f10275s.scale().setAll(f, f, 1.0f);
            this.f10339i.f10275s.position().f2526x = c3187j.m3224c().folder.backPlaneX;
            this.f10339i.f10275s.position().f2527y = c3187j.m3224c().folder.backPlaneY;
        }
    }

    /* renamed from: b */
    public void m3285b() {
        C3187j c3187j = C3145b.f10241l;
        C1017d c1017d = new C1017d();
        if (this.f10339i.f10273q != null) {
            C1014c.m10326a(this.f10339i.f10273q);
            c1017d.m10294l(0.0f);
            c1017d.m10293m(0.0f);
            c1017d.mo10301f(c3187j.m3224c().folder.backPlaneX);
            c1017d.mo10298h(c3187j.m3224c().folder.backPlaneY);
            C1014c.m10325a(this.f10339i.f10273q, 300, c1017d);
        }
        if (this.f10339i.f10272p != null) {
            C1017d c1017d2 = new C1017d();
            C1014c.m10326a(this.f10339i.f10272p);
            c1017d2.m10294l(0.0f);
            c1017d2.m10293m(0.0f);
            c1017d2.mo10301f(c3187j.m3224c().folder.backPlaneX);
            c1017d2.mo10298h(c3187j.m3224c().folder.backPlaneY);
            C1014c.m10325a(this.f10339i.f10272p, 300, c1017d2);
        }
        C1017d c1017d3 = new C1017d() { // from class: com.tsf.shell.f.i.b.d.e.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3171e.this.f10339i.m3347ba();
            }
        };
        C1014c.m10326a(this.f10339i.f10274r);
        c1017d3.m10294l(0.0f);
        c1017d3.m10293m(0.0f);
        c1017d3.mo10301f(c3187j.m3224c().folder.backPlaneX);
        c1017d3.mo10298h(c3187j.m3224c().folder.backPlaneY);
        C1014c.m10325a(this.f10339i.f10274r, 300, c1017d3);
        if (this.f10339i.f10275s != null) {
            C1017d c1017d4 = new C1017d();
            C1014c.m10326a(this.f10339i.f10275s);
            c1017d4.m10294l(0.0f);
            c1017d4.m10293m(0.0f);
            c1017d4.mo10301f(c3187j.m3224c().folder.backPlaneX);
            c1017d4.mo10298h(c3187j.m3224c().folder.backPlaneY);
            C1014c.m10325a(this.f10339i.f10275s, 300, c1017d4);
        }
    }

    /* renamed from: a */
    public void m3287a(C0975i c0975i) {
        C4187w.m615a(3);
        C1017d c1017d = new C1017d();
        c1017d.m10294l(0.8f);
        c1017d.m10293m(0.8f);
        C1014c.m10326a(c0975i);
        C1014c.m10325a(c0975i, 250, c1017d);
        this.f10339i.m3357aZ();
        C3145b.f10242m.m3291d(this.f10339i);
        C1014c.m10326a(this.f10339i.f10273q);
        C1014c.m10325a(this.f10339i.f10273q, 300, this.f10331a);
        C1014c.m10326a(this.f10339i.f10272p);
        C1014c.m10325a(this.f10339i.f10272p, 300, this.f10332b);
        C1014c.m10326a(this.f10339i.f10274r);
        C1014c.m10325a(this.f10339i.f10274r, 300, this.f10333c);
        if (this.f10339i.f10275s != null) {
            C1014c.m10326a(this.f10339i.f10275s);
            C1014c.m10325a(this.f10339i.f10275s, 300, this.f10334d);
        }
    }

    /* renamed from: b */
    public void m3284b(C0975i c0975i) {
        if (c0975i != null) {
            C1017d c1017d = new C1017d();
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            C1014c.m10326a(c0975i);
            C1014c.m10325a(c0975i, 250, c1017d);
        }
        C1014c.m10326a(this.f10339i.f10273q);
        C1014c.m10325a(this.f10339i.f10273q, 300, this.f10335e);
        C1014c.m10326a(this.f10339i.f10272p);
        C1014c.m10325a(this.f10339i.f10272p, 300, this.f10336f);
        C1014c.m10326a(this.f10339i.f10274r);
        C1014c.m10325a(this.f10339i.f10274r, 300, this.f10337g);
        if (this.f10339i.f10275s != null) {
            C1014c.m10326a(this.f10339i.f10275s);
            C1014c.m10325a(this.f10339i.f10275s, 300, this.f10338h);
        }
    }
}
