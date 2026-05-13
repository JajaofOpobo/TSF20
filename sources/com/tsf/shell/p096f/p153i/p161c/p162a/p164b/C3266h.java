package com.tsf.shell.p096f.p153i.p161c.p162a.p164b;

import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.primitives.VRectangle;
import java.util.Date;
/* renamed from: com.tsf.shell.f.i.c.a.b.h */
/* loaded from: classes.dex */
public class C3266h extends VObject3dContainer {

    /* renamed from: a */
    public int f10762a;

    /* renamed from: b */
    private C3262d f10763b;

    /* renamed from: c */
    private C3262d f10764c;

    /* renamed from: d */
    private C3262d f10765d;

    /* renamed from: e */
    private C3262d f10766e;

    /* renamed from: f */
    private C3267i f10767f;

    /* renamed from: g */
    private C3267i f10768g;

    /* renamed from: h */
    private C3265g f10769h;

    /* renamed from: i */
    private C3264f f10770i;

    /* renamed from: j */
    private C3274p f10771j;

    /* renamed from: k */
    private C3268j f10772k;

    /* renamed from: l */
    private boolean f10773l;

    /* renamed from: m */
    private C3272n f10774m;

    /* renamed from: n */
    private VRectangle f10775n;

    /* renamed from: o */
    private int f10776o;

    /* renamed from: p */
    private int f10777p;

    /* renamed from: q */
    private int f10778q;

    /* renamed from: r */
    private int f10779r;

    /* renamed from: s */
    private int f10780s;

    /* renamed from: t */
    private int f10781t;

    /* renamed from: u */
    private int f10782u;

    /* renamed from: v */
    private Date f10783v = new Date();

    public C3266h(float f) {
        this.f10773l = false;
        this.f10773l = m2958e();
        this.f10775n = new VRectangle(600.0f / f, 256.0f / f);
        this.f10775n.position().f2526x = 16.0f;
        this.f10775n.position().f2527y = -16.0f;
        this.f10775n.alpha(100);
        addChild(this.f10775n);
        this.f10763b = new C3262d();
        this.f10763b.position().f2526x = -204.0f;
        this.f10764c = new C3262d();
        this.f10764c.position().f2526x = -68.0f;
        this.f10765d = new C3262d();
        this.f10765d.position().f2526x = 68.0f;
        this.f10766e = new C3262d();
        this.f10766e.position().f2526x = 204.0f;
        addChild(this.f10763b);
        addChild(this.f10766e);
        addChild(this.f10764c);
        addChild(this.f10765d);
        this.f10769h = new C3265g();
        this.f10767f = new C3267i();
        this.f10768g = new C3267i();
        this.f10770i = new C3264f();
        this.f10771j = new C3274p();
        this.f10772k = new C3268j();
        this.f10774m = new C3272n();
        this.f10766e.m2971a(this.f10774m);
        m2961b(m2962b());
    }

    /* renamed from: a */
    public void m2965a(int i) {
        this.f10763b.f10754a.m2986a(i);
        this.f10764c.f10754a.m2986a(i);
        this.f10765d.f10754a.m2986a(i);
        this.f10766e.f10754a.m2986a(i);
    }

    /* renamed from: a */
    public void m2963a(TextureElement textureElement, AbstractC3263e abstractC3263e, AbstractC3263e abstractC3263e2, AbstractC3263e abstractC3263e3) {
        this.f10775n.textures().addElement(textureElement);
        this.f10769h.m2978a(abstractC3263e);
        this.f10767f.m2978a(abstractC3263e);
        this.f10768g.m2978a(abstractC3263e);
        this.f10770i.m2978a(abstractC3263e);
        this.f10771j.m2978a(abstractC3263e3);
        this.f10772k.m2978a(abstractC3263e);
        this.f10774m.m2978a(abstractC3263e2);
    }

    /* renamed from: a */
    public void m2966a() {
        this.f10775n.textures().removeAll();
    }

    /* renamed from: b */
    private int m2962b() {
        return 1;
    }

    /* renamed from: b */
    public void m2961b(int i) {
        this.f10762a = i;
        switch (this.f10762a) {
            case 0:
                m2960c();
                break;
            case 1:
                m2959d();
                break;
        }
        m2964a(System.currentTimeMillis(), true);
    }

    /* renamed from: c */
    private void m2960c() {
        this.f10763b.m2971a(this.f10769h);
        this.f10764c.m2971a(this.f10767f);
        this.f10765d.m2971a(this.f10768g);
    }

    /* renamed from: d */
    private void m2959d() {
        this.f10773l = m2958e();
        if (this.f10773l) {
            this.f10763b.m2971a(this.f10772k);
            this.f10764c.m2971a(this.f10770i);
        } else {
            this.f10764c.m2971a(this.f10772k);
            this.f10763b.m2971a(this.f10770i);
        }
        this.f10765d.m2971a(this.f10771j);
    }

    /* renamed from: e */
    private boolean m2958e() {
        return true;
    }

    /* renamed from: a */
    public void m2964a(long j, boolean z) {
        this.f10783v.setTime(j);
        switch (this.f10762a) {
            case 0:
                int minutes = this.f10783v.getMinutes();
                int hours = this.f10783v.getHours();
                int seconds = this.f10783v.getSeconds();
                if (this.f10777p != minutes || z) {
                    this.f10777p = minutes;
                    this.f10767f.m2980a(this.f10777p, 800);
                }
                if (this.f10779r != seconds || z) {
                    this.f10779r = seconds;
                    this.f10768g.m2980a(this.f10779r, 500);
                }
                if (this.f10778q != hours || z) {
                    this.f10778q = hours;
                    this.f10769h.m2980a(this.f10778q, 1000);
                }
                int i = this.f10778q >= 12 ? 0 : 1;
                if (this.f10776o != i || z) {
                    this.f10776o = i;
                    this.f10774m.m2980a(i, 900);
                    return;
                }
                return;
            case 1:
                int month = this.f10783v.getMonth();
                int date = this.f10783v.getDate();
                int day = this.f10783v.getDay();
                if (this.f10780s != month || z) {
                    this.f10780s = month;
                    this.f10772k.m2980a(this.f10780s, 1000);
                }
                if (this.f10781t != date || z) {
                    this.f10781t = date;
                    this.f10770i.m2980a(this.f10781t - 1, 800);
                }
                if (this.f10782u != day || z) {
                    this.f10782u = day;
                    this.f10771j.m2980a(this.f10782u - 1, 500);
                }
                if (this.f10766e.m2975a() != 3 || z) {
                    this.f10774m.m2980a(3, 500);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
