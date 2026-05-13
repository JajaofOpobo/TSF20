package com.tsf.shell.p096f.p153i.p161c;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.LauncherDrawerFolder3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.i.c.c */
/* loaded from: classes.dex */
public class C3332c extends C3343g {

    /* renamed from: k */
    private C0980j f11004k;

    /* renamed from: l */
    private C3145b f11005l;

    /* renamed from: m */
    private C3337a f11006m;

    /* renamed from: n */
    private C3337a f11007n;

    /* renamed from: o */
    private C3337a f11008o;

    /* renamed from: p */
    private TextureElement f11009p = new TextureElement(0, false);

    /* renamed from: q */
    private TextureElement f11010q = new TextureElement(0, false);

    /* renamed from: r */
    private TextureElement f11011r = new TextureElement(0, false);

    /* renamed from: s */
    private boolean f11012s = true;

    /* renamed from: t */
    private boolean f11013t = true;

    /* renamed from: u */
    private ArrayList<AbstractC3208b> f11014u;

    /* renamed from: v */
    private Runnable f11015v;

    public C3332c() {
        m2796b(true);
        this.f11014u = new ArrayList<>();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.C3343g
    /* renamed from: c */
    public void mo2795c() {
        this.f11012s = true;
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.C3343g
    /* renamed from: d */
    public void mo2794d() {
        this.f11012s = false;
        m2816q();
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.C3343g, com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: e */
    public void mo2793e() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.i.c.c.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                float alpha = C3332c.this.f11006m.f11020a.alpha();
                C3332c.this.f11006m.f11020a.alpha(alpha);
                C3332c.this.f11007n.f11020a.alpha(alpha);
                C3332c.this.f11008o.f11020a.alpha(alpha);
            }
        };
        c1017d.m10314a(0);
        C1014c.m10326a(this.f11006m.f11020a);
        C1014c.m10325a(this.f11006m.f11020a, 300, c1017d);
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.C3343g, com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: f */
    public void mo2792f() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.i.c.c.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                float alpha = C3332c.this.f11006m.f11020a.alpha();
                C3332c.this.f11006m.f11020a.alpha(alpha);
                C3332c.this.f11007n.f11020a.alpha(alpha);
                C3332c.this.f11008o.f11020a.alpha(alpha);
            }
        };
        c1017d.m10314a(255);
        C1014c.m10326a(this.f11006m.f11020a);
        C1014c.m10325a(this.f11006m.f11020a, 300, c1017d);
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.C3343g, com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: b */
    public void mo1623b() {
        C0853a.m10853g().m10543a(this.f11009p);
        C0853a.m10853g().m10543a(this.f11010q);
        C0853a.m10853g().m10543a(this.f11011r);
    }

    /* renamed from: p */
    private void m2817p() {
        if (this.f11009p.f2529id == 0) {
            int i = C3566b.f11839a.f11750H;
            int i2 = C3566b.f11839a.f11751I;
            C0853a.m10853g().m10540a(this.f11009p, LauncherShortcutStandardInfo.createTextureBitmap(null, "", C4189x.m607a(C1306b.C1310d.widget_item_folder_icon1, i, i2), C3566b.f11839a, i, i2, false));
            C0853a.m10853g().m10540a(this.f11010q, LauncherShortcutStandardInfo.createTextureBitmap(null, "", C4189x.m607a(C1306b.C1310d.widget_item_folder_icon2, i, i2), C3566b.f11839a, i, i2, false));
            C0853a.m10853g().m10540a(this.f11011r, LauncherShortcutStandardInfo.createTextureBitmap(null, "", C4189x.m607a(C1306b.C1310d.widget_item_folder_icon3, i, i2), C3566b.f11839a, i, i2, false));
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.C3343g
    /* renamed from: a */
    public C0975i mo2798a(boolean z) {
        if (this.f11004k == null) {
            this.f11004k = m2815r();
        } else {
            m2817p();
        }
        return this.f11004k;
    }

    /* renamed from: q */
    private void m2816q() {
        if (this.f11015v != null) {
            C0853a.m10865a().m10578g(this.f11015v);
        }
        AbstractC3208b abstractC3208b = this.f11014u.get(0);
        C1014c.m10326a(abstractC3208b);
        abstractC3208b.removeFromParent();
        this.f11005l.m3359aX().addChild(abstractC3208b);
        int size = this.f11014u.size();
        float f = (C0892a.f2567c * 60.0f) / 2.0f;
        for (int i = 0; i < 2; i++) {
            AbstractC3208b abstractC3208b2 = this.f11014u.get((size - i) - 1);
            abstractC3208b2.removeFromParent();
            C1014c.m10326a(abstractC3208b2);
            this.f11004k.addChild(abstractC3208b2);
            abstractC3208b2.rotation().f2528z = 0.0f;
            abstractC3208b2.scale().setAll(0.4f, 0.4f, 1.0f);
            abstractC3208b2.position().f2526x = (-160.0f) * C0892a.f2567c;
            abstractC3208b2.position().f2527y = f;
            f -= C0892a.f2567c * 60.0f;
        }
        this.f11005l.m3358aY();
        this.f11015v = new Runnable() { // from class: com.tsf.shell.f.i.c.c.3
            @Override // java.lang.Runnable
            public void run() {
                AbstractC3208b abstractC3208b3 = (AbstractC3208b) C3332c.this.f11014u.get(2);
                Number3d.TEMPNUMBER3D.reset();
                abstractC3208b3.localToGlobal(Number3d.TEMPNUMBER3D);
                abstractC3208b3.position().setAllFrom(Number3d.TEMPNUMBER3D);
                C3332c.this.f11005l.mo3139e(abstractC3208b3);
                C3332c.this.f11015v = new Runnable() { // from class: com.tsf.shell.f.i.c.c.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C3332c.this.f11015v = null;
                        AbstractC3208b abstractC3208b4 = (AbstractC3208b) C3332c.this.f11014u.get(1);
                        Number3d.TEMPNUMBER3D.reset();
                        abstractC3208b4.localToGlobal(Number3d.TEMPNUMBER3D);
                        abstractC3208b4.position().setAllFrom(Number3d.TEMPNUMBER3D);
                        C3332c.this.f11005l.mo3139e(abstractC3208b4);
                    }
                };
                C0853a.m10865a().m10584b(C3332c.this.f11015v, 1000L);
            }
        };
        C0853a.m10865a().m10584b(this.f11015v, 1000L);
    }

    /* renamed from: r */
    private C0980j m2815r() {
        m2817p();
        this.f11004k = new C0980j();
        this.f11005l = new C3145b(new LauncherDrawerFolder3DInfo(true));
        this.f11004k.addChild(this.f11005l);
        this.f11006m = new C3337a();
        this.f11006m.f10495k.textures().addElement(this.f11009p);
        this.f11007n = new C3337a();
        this.f11007n.f10495k.textures().addElement(this.f11010q);
        this.f11008o = new C3337a();
        this.f11008o.f10495k.textures().addElement(this.f11011r);
        this.f11014u.add(this.f11006m);
        this.f11014u.add(this.f11007n);
        this.f11014u.add(this.f11008o);
        int size = this.f11014u.size();
        float f = C0892a.f2567c * (-60.0f);
        for (int i = 0; i < size; i++) {
            AbstractC3208b abstractC3208b = this.f11014u.get((size - i) - 1);
            abstractC3208b.position().f2526x = (-160.0f) * C0892a.f2567c;
            abstractC3208b.position().f2527y = f;
            Number3d scale = abstractC3208b.scale();
            abstractC3208b.scale().f2527y = 0.4f;
            scale.f2526x = 0.4f;
            f += 60.0f * C0892a.f2567c;
            this.f11004k.addChild(abstractC3208b);
        }
        return this.f11004k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.i.c.c$a */
    /* loaded from: classes.dex */
    public class C3337a extends AbstractC3208b {

        /* renamed from: a */
        public C0980j f11020a;

        public C3337a() {
            super(null, C3566b.f11839a);
            this.f11020a = new C0980j();
            this.f10495k.visible(true);
            this.f10495k.removeFromParent();
            this.f11020a.addChild(this.f10495k);
            addChild(this.f11020a);
        }

        @Override // com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b
        /* renamed from: k */
        public void mo1827k() {
        }
    }
}
