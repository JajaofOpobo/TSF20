package com.tsf.shell.p096f.p118e.p125e;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p030a.C0869e;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p182n.C3550a;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.manager.p187r.p193c.C3743g;
import com.tsf.shell.p096f.p118e.InterfaceC2557f;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p154a.C3109c;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.utils.C4176l;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.e.e.c */
/* loaded from: classes.dex */
public class C2539c {

    /* renamed from: a */
    private TextureElement f8425a;

    /* renamed from: b */
    private TextureElement f8426b;

    /* renamed from: c */
    private TextureElement f8427c;

    /* renamed from: d */
    private TextureElement f8428d;

    /* renamed from: e */
    private TextureElement f8429e;

    /* renamed from: f */
    private TextureElement f8430f;

    /* renamed from: g */
    private C2535b f8431g;

    /* renamed from: h */
    private C2535b f8432h;

    /* renamed from: i */
    private C2535b f8433i;

    /* renamed from: j */
    private C2535b f8434j;

    /* renamed from: k */
    private C2535b f8435k;

    /* renamed from: l */
    private C2535b f8436l;

    /* renamed from: m */
    private RunnableC2556f f8437m;

    /* renamed from: n */
    private C0980j f8438n;

    /* renamed from: o */
    private float f8439o;

    /* renamed from: p */
    private float f8440p;

    /* renamed from: q */
    private boolean f8441q = false;

    /* renamed from: r */
    private boolean f8442r = false;

    /* renamed from: s */
    private C3550a.C3558a f8443s;

    /* renamed from: a */
    public void m5317a() {
        this.f8425a = C4189x.m593b(C1306b.C1310d.editer_icon_delete);
        this.f8426b = C4189x.m593b(C1306b.C1310d.editer_icon_desktop);
        this.f8427c = C4189x.m593b(C1306b.C1310d.editer_icon_grid);
        this.f8428d = C4189x.m593b(C1306b.C1310d.editer_icon_info);
        this.f8429e = C4189x.m593b(C1306b.C1310d.editer_icon_setting);
        this.f8430f = C4189x.m593b(C1306b.C1310d.editer_icon_shadow);
        this.f8431g = new C2535b();
        this.f8432h = new C2535b();
        this.f8433i = new C2535b();
        this.f8434j = new C2535b();
        this.f8435k = new C2535b();
        this.f8436l = new C2535b();
        this.f8438n = new C0980j() { // from class: com.tsf.shell.f.e.e.c.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
            public boolean removeChild(C0975i c0975i) {
                boolean removeChild = super.removeChild(c0975i);
                if (numChildren() == 0) {
                    removeFromParent();
                }
                return removeChild;
            }

            @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
            public void addChild(C0975i c0975i) {
                if (parent() == null) {
                    C3359a.f11096j.m2232a(this);
                }
                c0975i.removeFromParent();
                super.addChild(c0975i);
                invalidate();
            }
        };
        C2551a c2551a = new C2551a(C0892a.f2567c * 120.0f, C0892a.f2567c * 120.0f, false) { // from class: com.tsf.shell.f.e.e.c.2
            @Override // com.tsf.shell.p096f.p118e.p125e.C2539c.C2551a, com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: a */
            public void mo2062a(InterfaceC2557f interfaceC2557f) {
                super.mo2062a(interfaceC2557f);
                C4187w.m615a(3);
                C3359a.f11103q.m2046a(-52736);
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: b */
            public boolean mo2057b(InterfaceC2557f interfaceC2557f) {
                return true;
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2539c.C2551a, com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: e */
            public void mo3139e(InterfaceC2557f interfaceC2557f) {
                super.mo3139e(interfaceC2557f);
                final C3112b c3112b = (C3112b) interfaceC2557f;
                ArrayList arrayList = new ArrayList();
                if (c3112b instanceof C3231c) {
                    C3231c c3231c = (C3231c) c3112b;
                    if (c3231c.m3064as()) {
                        Iterator<C3231c> it = c3231c.m3060aw().iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next());
                        }
                    }
                }
                arrayList.add(c3112b);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C3112b c3112b2 = (C3112b) it2.next();
                    c3112b2.removeFromParent();
                    C3359a.f11096j.m2232a(c3112b2);
                }
                if (arrayList.size() > 1) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C3743g.m1619a((C3112b) it3.next(), (Runnable) null);
                    }
                } else if (c3112b instanceof C3145b) {
                    C3743g.m1618a(c3112b, new Runnable() { // from class: com.tsf.shell.f.e.e.c.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C3109c c3109c = (C3109c) c3112b.getMouseEventListener();
                            c3112b.clearDefaultColor();
                            c3109c.m3550a(new float[]{c3109c.f10086b, c3109c.f10087d}, false);
                        }
                    }, null);
                } else {
                    C3743g.m1619a(c3112b, (Runnable) null);
                }
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2539c.C2551a, com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: d */
            public void mo3140d(InterfaceC2557f interfaceC2557f) {
                super.mo3140d(interfaceC2557f);
                ((C3112b) interfaceC2557f).clearDefaultColor();
                C3359a.f11103q.m2048a();
            }
        };
        c2551a.alpha(0.0f);
        c2551a.scale().setAll(0.0f, 0.0f, 1.0f);
        c2551a.calAABB(1.5f, 1.5f, 1.5f);
        this.f8431g.f8415h = c2551a;
        c2551a.textures().addElement(this.f8425a);
        this.f8431g.addChild(c2551a);
        this.f8431g.setAABBPX(c2551a.minX(), c2551a.minY(), c2551a.minZ(), c2551a.maxX(), c2551a.maxY(), c2551a.maxZ());
        C2553b c2553b = new C2553b(C0892a.f2567c * 120.0f, C0892a.f2567c * 120.0f, false) { // from class: com.tsf.shell.f.e.e.c.3
            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: a */
            public void mo2062a(InterfaceC2557f interfaceC2557f) {
                C4187w.m615a(3);
                C2539c.this.f8437m.f8462b = interfaceC2557f;
                C0853a.m10865a().m10584b(C2539c.this.f8437m, 400L);
                C3359a.f11103q.m2046a(-16728065);
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: b */
            public boolean mo2057b(InterfaceC2557f interfaceC2557f) {
                return false;
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: e */
            public void mo3139e(InterfaceC2557f interfaceC2557f) {
                C0853a.m10865a().m10578g(C2539c.this.f8437m);
                C2539c.this.f8437m.f8462b = null;
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: d */
            public void mo3140d(InterfaceC2557f interfaceC2557f) {
                C0853a.m10865a().m10578g(C2539c.this.f8437m);
                C2539c.this.f8437m.f8462b = null;
                C3359a.f11103q.m2048a();
            }
        };
        c2553b.alpha(0.0f);
        c2553b.scale().setAll(0.0f, 0.0f, 1.0f);
        c2553b.calAABB(1.5f, 1.5f, 1.5f);
        this.f8432h.f8415h = c2553b;
        c2553b.textures().addElement(this.f8426b);
        this.f8432h.addChild(c2553b);
        this.f8432h.setAABBPX(c2553b.minX(), c2553b.minY(), c2553b.minZ(), c2553b.maxX(), c2553b.maxY(), c2553b.maxZ());
        C2553b c2553b2 = new C2553b(C0892a.f2567c * 120.0f, C0892a.f2567c * 120.0f, false) { // from class: com.tsf.shell.f.e.e.c.4
            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: a */
            public void mo2062a(InterfaceC2557f interfaceC2557f) {
                if (!C3359a.f11094h.m4031n().m4204c()) {
                    C3359a.f11094h.m4031n().m4201d();
                    C2539c.this.m5312c();
                    C3359a.f11094h.f9606d.m4334a((C3112b) interfaceC2557f);
                    C4187w.m615a(3);
                }
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: b */
            public boolean mo2057b(InterfaceC2557f interfaceC2557f) {
                return false;
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: e */
            public void mo3139e(InterfaceC2557f interfaceC2557f) {
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: d */
            public void mo3140d(InterfaceC2557f interfaceC2557f) {
                C3359a.f11103q.m2048a();
            }
        };
        c2553b2.alpha(0.0f);
        c2553b2.scale().setAll(0.0f, 0.0f, 1.0f);
        c2553b2.calAABB(1.5f, 1.5f, 1.5f);
        this.f8433i.f8415h = c2553b2;
        c2553b2.textures().addElement(this.f8427c);
        this.f8433i.addChild(c2553b2);
        this.f8433i.setAABBPX(c2553b2.minX(), c2553b2.minY(), c2553b2.minZ(), c2553b2.maxX(), c2553b2.maxY(), c2553b2.maxZ());
        C2551a c2551a2 = new C2551a(C0892a.f2567c * 120.0f, C0892a.f2567c * 120.0f, false) { // from class: com.tsf.shell.f.e.e.c.5
            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: a */
            public boolean mo3520a() {
                return super.mo3520a();
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2539c.C2551a, com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: a */
            public void mo2062a(InterfaceC2557f interfaceC2557f) {
                super.mo2062a(interfaceC2557f);
                C4187w.m615a(3);
                ((C3112b) interfaceC2557f).setDefaultColor(C3567c.f11844c);
                C3359a.f11103q.m2046a(-52736);
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: b */
            public boolean mo2057b(InterfaceC2557f interfaceC2557f) {
                super.mo2057b(interfaceC2557f);
                C3112b c3112b = (C3112b) interfaceC2557f;
                c3112b.clearDefaultColor();
                C3359a.f11103q.m2048a();
                return C3359a.f11094h.m4019t().m4412d(c3112b);
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2539c.C2551a, com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: e */
            public void mo3139e(InterfaceC2557f interfaceC2557f) {
                super.mo3139e(interfaceC2557f);
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2539c.C2551a, com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: d */
            public void mo3140d(InterfaceC2557f interfaceC2557f) {
                super.mo3140d(interfaceC2557f);
                ((C3112b) interfaceC2557f).clearDefaultColor();
                C3359a.f11103q.m2048a();
            }
        };
        c2551a2.alpha(0.0f);
        c2551a2.scale().setAll(0.0f, 0.0f, 1.0f);
        c2551a2.calAABB(1.5f, 1.5f, 1.5f);
        this.f8434j.f8415h = c2551a2;
        c2551a2.textures().addElement(this.f8425a);
        this.f8434j.addChild(c2551a2);
        this.f8434j.setAABBPX(c2551a2.minX(), c2551a2.minY(), c2551a2.minZ(), c2551a2.maxX(), c2551a2.maxY(), c2551a2.maxZ());
        C2553b c2553b3 = new C2553b(C0892a.f2567c * 120.0f, C0892a.f2567c * 120.0f, false) { // from class: com.tsf.shell.f.e.e.c.6
            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: a */
            public boolean mo3520a() {
                return super.mo3520a();
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: a */
            public void mo2062a(InterfaceC2557f interfaceC2557f) {
                C4187w.m615a(3);
                C3359a.f11103q.m2046a(-16728065);
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: b */
            public boolean mo2057b(final InterfaceC2557f interfaceC2557f) {
                C0853a.m10865a().m10587a(new Runnable() { // from class: com.tsf.shell.f.e.e.c.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (interfaceC2557f instanceof C3222g) {
                            ((C3222g) interfaceC2557f).m3102bh();
                        }
                    }
                }, 250L);
                return false;
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: e */
            public void mo3139e(InterfaceC2557f interfaceC2557f) {
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: d */
            public void mo3140d(InterfaceC2557f interfaceC2557f) {
                C3359a.f11103q.m2048a();
            }
        };
        c2553b3.alpha(0.0f);
        c2553b3.scale().setAll(0.0f, 0.0f, 1.0f);
        c2553b3.calAABB(1.5f, 1.5f, 1.5f);
        this.f8435k.f8415h = c2553b3;
        c2553b3.textures().addElement(this.f8428d);
        this.f8435k.addChild(c2553b3);
        this.f8435k.setAABBPX(c2553b3.minX(), c2553b3.minY(), c2553b3.minZ(), c2553b3.maxX(), c2553b3.maxY(), c2553b3.maxZ());
        C2553b c2553b4 = new C2553b(C0892a.f2567c * 120.0f, C0892a.f2567c * 120.0f, false) { // from class: com.tsf.shell.f.e.e.c.7
            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: a */
            public void mo2062a(InterfaceC2557f interfaceC2557f) {
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: b */
            public boolean mo2057b(InterfaceC2557f interfaceC2557f) {
                return false;
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: e */
            public void mo3139e(InterfaceC2557f interfaceC2557f) {
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: d */
            public void mo3140d(InterfaceC2557f interfaceC2557f) {
            }
        };
        c2553b4.alpha(0.0f);
        c2553b4.scale().setAll(0.0f, 0.0f, 1.0f);
        c2553b4.calAABB(1.5f, 1.5f, 1.5f);
        this.f8436l.f8415h = c2553b4;
        c2553b4.textures().addElement(this.f8429e);
        this.f8436l.addChild(c2553b4);
        this.f8436l.setAABBPX(c2553b4.minX(), c2553b4.minY(), c2553b4.minZ(), c2553b4.maxX(), c2553b4.maxY(), c2553b4.maxZ());
        this.f8437m = new RunnableC2556f() { // from class: com.tsf.shell.f.e.e.c.8
            @Override // com.tsf.shell.p096f.p118e.p125e.RunnableC2556f
            /* renamed from: a */
            public void mo5307a(InterfaceC2557f interfaceC2557f) {
                C3359a.f11094h.m4061b((C3112b) interfaceC2557f);
            }
        };
    }

    /* renamed from: b */
    public TextureElement m5313b() {
        return this.f8430f;
    }

    /* renamed from: a */
    public void m5314a(C3112b c3112b, float f, float f2, boolean z, int... iArr) {
        float f3;
        float f4;
        if (c3112b.m3526S()) {
            this.f8441q = false;
            this.f8439o = f;
            this.f8440p = f2;
            this.f8443s = C3359a.f11103q.m2044a(this.f8443s);
            this.f8442r = true;
            int length = iArr.length;
            if (length == 1) {
                f4 = 0.0f;
                f3 = 0.0f;
            } else {
                f3 = C0892a.f2553D / length;
                f4 = C0892a.f2590z + (f3 / 2.0f);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                C2535b c2535b = null;
                switch (i2) {
                    case 0:
                        c2535b = this.f8431g;
                        break;
                    case 1:
                        c2535b = this.f8432h;
                        break;
                    case 2:
                        c2535b = this.f8433i;
                        break;
                    case 3:
                        c2535b = this.f8434j;
                        break;
                    case 4:
                        c2535b = this.f8436l;
                        break;
                    case 5:
                        c2535b = this.f8435k;
                        break;
                }
                if (c2535b == null) {
                    C4176l.m668a(this, "ElementEditer wrong show type:" + i2);
                } else {
                    c2535b.m5324a();
                    c2535b.m5321a((i * f3) + f4, C0892a.f2558I - (C3359a.f11103q.m2038b() / 2.0f), true);
                    arrayList.add(c2535b);
                }
            }
            Iterator<C0975i> it = this.f8438n.children().iterator();
            while (it.hasNext()) {
                C2535b c2535b2 = (C2535b) it.next();
                if (!arrayList.contains(c2535b2)) {
                    c2535b2.m5318c();
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C2535b c2535b3 = (C2535b) it2.next();
                c2535b3.m5319b();
                this.f8438n.addChild(c2535b3);
            }
        }
    }

    /* renamed from: c */
    public void m5312c() {
        if (Thread.currentThread().getId() != C0869e.f2474f) {
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.e.e.c.9
                @Override // java.lang.Runnable
                public void run() {
                    C2539c.this.m5312c();
                }
            });
        } else if (this.f8442r) {
            C3359a.f11103q.m2037b(this.f8443s);
            this.f8442r = false;
            Iterator<C0975i> it = this.f8438n.children().iterator();
            while (it.hasNext()) {
                ((C2535b) it.next()).m5318c();
            }
        }
    }

    /* renamed from: a */
    public void m5316a(float f, float f2) {
        if (this.f8442r) {
            if (this.f8441q && C4189x.m594b(this.f8439o, this.f8440p, f, f2) > C0892a.m10742a(250.0f)) {
                Iterator<C0975i> it = this.f8438n.children().iterator();
                while (it.hasNext()) {
                    ((C2535b) it.next()).m5324a();
                }
            }
            Iterator<C0975i> it2 = this.f8438n.children().iterator();
            while (it2.hasNext()) {
                C2535b c2535b = (C2535b) it2.next();
                c2535b.m5322a(C4189x.m594b(c2535b.f8410c, c2535b.f8411d, f, f2), f, f2);
            }
        }
    }

    /* renamed from: d */
    public C2535b m5311d() {
        return this.f8431g;
    }

    /* renamed from: com.tsf.shell.f.e.e.c$b */
    /* loaded from: classes.dex */
    public static class C2553b extends C2555e {
        public C2553b(float f, float f2, boolean z) {
            super(f, f2, z);
        }
    }

    /* renamed from: com.tsf.shell.f.e.e.c$a */
    /* loaded from: classes.dex */
    public static class C2551a extends C2553b {

        /* renamed from: d */
        private static TextureElement f8457d = new TextureElement(0, false);

        /* renamed from: a */
        private C0981k f8458a;

        public C2551a(float f, float f2, boolean z) {
            super(f, f2, z);
            this.f8458a = new C0981k(C0892a.m10742a(64.0f), C0892a.m10742a(14.0f), false) { // from class: com.tsf.shell.f.e.e.c.a.1
                @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
                public void onDrawStart() {
                    if (C2551a.f8457d.f2529id == 0) {
                        C0853a.m10853g().m10542a(C2551a.f8457d, C1306b.C1310d.editer_icon_delete_cap);
                    }
                }
            };
            this.f8458a.moveAllPointsPX(this.f8458a.mo10366b() / 2.0f, this.f8458a.mo10365c() / 2.0f, 0.0f);
            this.f8458a.position().f2526x = (-this.f8458a.mo10366b()) / 2.0f;
            this.f8458a.position().f2527y = C0892a.m10742a(18.0f);
            this.f8458a.textures().addElement(f8457d);
            addChild(this.f8458a);
        }

        @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
        /* renamed from: a */
        public void mo2062a(InterfaceC2557f interfaceC2557f) {
            m5309e();
        }

        @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
        /* renamed from: e */
        public void mo3139e(InterfaceC2557f interfaceC2557f) {
            m5308f();
        }

        @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
        /* renamed from: d */
        public void mo3140d(InterfaceC2557f interfaceC2557f) {
            m5308f();
        }

        /* renamed from: e */
        private void m5309e() {
            C1017d c1017d = new C1017d();
            c1017d.m10303e(50.0f);
            c1017d.m10313a(C0986a.f2950e);
            C1014c.m10326a(this.f8458a);
            C1014c.m10325a(this.f8458a, VEasing.Linear.easeNone, c1017d);
        }

        /* renamed from: f */
        private void m5308f() {
            C1017d c1017d = new C1017d();
            c1017d.m10303e(0.0f);
            C1014c.m10326a(this.f8458a);
            C1014c.m10325a(this.f8458a, 300, c1017d);
        }
    }
}
