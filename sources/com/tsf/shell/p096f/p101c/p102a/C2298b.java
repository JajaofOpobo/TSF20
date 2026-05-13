package com.tsf.shell.p096f.p101c.p102a;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.p044c.p045a.C1016a;
import com.tsf.shell.C3345g;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p187r.p193c.C3743g;
import com.tsf.shell.p096f.p118e.InterfaceC2557f;
import com.tsf.shell.p096f.p153i.C3105a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.c.a.b */
/* loaded from: classes.dex */
public class C2298b extends C2309c implements C3105a.InterfaceC3106a {

    /* renamed from: A */
    private float f7482A;

    /* renamed from: B */
    private Runnable f7483B;

    /* renamed from: H */
    private C3145b f7489H;

    /* renamed from: J */
    private Runnable f7491J;

    /* renamed from: c */
    float f7494c;

    /* renamed from: d */
    float f7495d;

    /* renamed from: e */
    float f7496e;

    /* renamed from: l */
    private ArrayList<C2310d> f7503l;

    /* renamed from: m */
    private ArrayList<C2310d> f7504m;

    /* renamed from: r */
    private C2326f f7509r;

    /* renamed from: s */
    private C0981k f7510s;

    /* renamed from: u */
    private C3112b f7512u;

    /* renamed from: v */
    private C3112b f7513v;

    /* renamed from: w */
    private TextureElement f7514w;

    /* renamed from: z */
    private float f7517z;

    /* renamed from: a */
    public float f7492a = 0.15f;

    /* renamed from: i */
    private float f7500i = 0.0f;

    /* renamed from: j */
    private float f7501j = 0.0f;

    /* renamed from: k */
    private float f7502k = 0.0f;

    /* renamed from: n */
    private boolean f7505n = true;

    /* renamed from: b */
    boolean f7493b = false;

    /* renamed from: x */
    private boolean f7515x = false;

    /* renamed from: y */
    private boolean f7516y = false;

    /* renamed from: f */
    boolean f7497f = false;

    /* renamed from: g */
    boolean f7498g = false;

    /* renamed from: C */
    private Number3d f7484C = new Number3d();

    /* renamed from: D */
    private Number3d f7485D = new Number3d();

    /* renamed from: E */
    private float[] f7486E = new float[2];

    /* renamed from: F */
    private int f7487F = 0;

    /* renamed from: G */
    private boolean f7488G = false;

    /* renamed from: I */
    private boolean f7490I = false;

    /* renamed from: t */
    private TextureElement f7511t = new TextureElement(0, false);

    /* renamed from: h */
    private C2298b f7499h = this;

    /* renamed from: p */
    private C3105a f7507p = new C3105a(this, this) { // from class: com.tsf.shell.f.c.a.b.1
        @Override // com.tsf.shell.p096f.p153i.C3105a
        /* renamed from: a */
        public void mo2071a(C3112b c3112b) {
            c3112b.mo3504f(C2298b.this.f7499h);
        }
    };

    /* renamed from: q */
    private float f7508q = 12.0f * C0892a.f2566b;

    /* renamed from: o */
    private C0975i f7506o = new C0981k(128.0f, 128.0f);

    public C2298b(C2326f c2326f) {
        this.f7509r = c2326f;
        this.f7506o.visible(false);
        this.f7503l = new ArrayList<>();
        this.f7504m = new ArrayList<>();
        if (!c2326f.m5857a()) {
            C3359a.f11097k.m2295b(this);
        }
        m5915A();
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.C2309c, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    public boolean mo3520a() {
        return this.f7509r.m5828e() && this.f7509r.m5802r();
    }

    @Override // com.tsf.shell.p096f.p153i.C3105a.InterfaceC3106a
    /* renamed from: b */
    public ArrayList<C0975i> mo2100b() {
        return children();
    }

    /* renamed from: a */
    public boolean m5913a(float f, float f2) {
        if (m5882i() < 1.0f || this.f7509r.m5800s()) {
            if (!this.f7493b) {
                this.f7517z = f;
                this.f7482A = f2;
                this.f7515x = false;
                this.f7516y = false;
                this.f7493b = true;
                if (this.f7509r.m5802r()) {
                    this.f7494c = this.f7502k;
                    this.f7495d = this.f7501j;
                    this.f7496e = this.f7500i;
                } else {
                    this.f7494c = this.f7502k;
                    this.f7495d = this.f7501j;
                    this.f7496e = this.f7500i;
                }
                this.f7509r.f7622n.m5948a(m5882i());
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m5901b(float f, float f2) {
        if (this.f7516y) {
            C3359a.f11094h.m4099a(f, f2, this.f7517z, this.f7482A);
        } else if (this.f7515x) {
            C4189x.m610a(f, f2, this.f7486E);
            this.f7485D.setAll(this.f7486E[0], this.f7486E[1], 0.0f);
            globalToLocal(this.f7485D);
            if (this.f7509r.m5857a()) {
                this.f7485D.f2527y = 0.0f;
            }
            if (this.f7509r.f7622n.mo5923b(this.f7485D.f2526x, this.f7485D.f2527y) == -4) {
                this.f7515x = false;
                C3359a.f11094h.m4013w();
                this.f7516y = true;
            }
        } else if (this.f7493b) {
            C4189x.m610a(f, f2, this.f7486E);
            this.f7485D.setAll(this.f7486E[0], this.f7486E[1], 0.0f);
            globalToLocal(this.f7485D);
            if (this.f7483B == null) {
                this.f7483B = new Runnable() { // from class: com.tsf.shell.f.c.a.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        int mo5928a = C2298b.this.f7509r.f7622n.mo5928a(C2298b.this.f7503l, C2298b.this.children(), C2298b.this.children().size(), C2298b.this.f7494c, C2298b.this.f7496e, C2298b.this.f7495d, C2298b.this.f7508q, C2298b.this.f7485D.f2526x, C2298b.this.f7485D.f2527y);
                        if (mo5928a == -3 || mo5928a == -4) {
                            C2298b.this.m5905a((C3112b) null);
                            C2298b.this.m5897c();
                            C2298b.this.f7515x = true;
                        } else if (mo5928a == -1 || mo5928a == -2) {
                            C2298b.this.f7509r.m5810n();
                            C2298b.this.m5905a((C3112b) null);
                        } else {
                            if (!C2298b.this.f7509r.m5802r()) {
                                C2298b.this.f7509r.m5812m();
                            }
                            C2298b.this.m5905a((C3112b) C2298b.this.children().get(mo5928a));
                        }
                        C2298b.this.f7505n = false;
                        C2298b.this.setAnimationObjectState(true);
                        C2298b.this.invalidate();
                    }
                };
            }
            C0853a.m10865a().m10583c(this.f7483B);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5905a(C3112b c3112b) {
        if (c3112b != null) {
            this.f7512u = c3112b;
            if (c3112b instanceof AbstractC3208b) {
            }
        } else {
            this.f7512u = null;
        }
        this.f7513v = null;
        this.f7514w = null;
    }

    /* renamed from: b */
    private void m5898b(final C3112b c3112b) {
        if (c3112b != null) {
            if (c3112b instanceof AbstractC3208b) {
                C0853a.m10865a().m10587a(new Runnable() { // from class: com.tsf.shell.f.c.a.b.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ((AbstractC3208b) c3112b).mo3094l();
                    }
                }, 200L);
            } else if (c3112b instanceof C3145b) {
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.c.a.b.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ((C3145b) c3112b).m3365aR();
                    }
                });
            }
        }
        this.f7513v = null;
        this.f7514w = null;
    }

    /* renamed from: c */
    public void m5897c() {
        if (this.f7516y) {
            C3359a.f11094h.m4011x();
        } else if (!this.f7515x && this.f7493b) {
            this.f7493b = false;
            if (this.f7507p.m3563e()) {
                if (this.f7512u instanceof C3231c) {
                    ((C3231c) this.f7512u).m3067ap();
                }
            } else {
                m5898b(this.f7512u);
            }
            this.f7512u = null;
            m5905a((C3112b) null);
            if (this.f7509r.m5802r()) {
                m5884g();
            } else {
                m5876x();
            }
            this.f7509r.m5810n();
        }
    }

    /* renamed from: e */
    public void m5888e() {
        m5875y();
        m5883h();
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.C2309c, com.tsf.shell.p096f.p118e.p126f.C2570b
    /* renamed from: a */
    public void mo2137a(final C3231c c3231c) {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.c.a.b.5
            @Override // java.lang.Runnable
            public void run() {
                C2298b.this.removeChild(c3231c);
            }
        };
        if (c3231c instanceof C3145b) {
            C3743g.m1618a(c3231c, null, runnable);
        } else {
            C3743g.m1619a(c3231c, runnable);
        }
    }

    /* renamed from: f */
    public void m5885f() {
        int size;
        m5874z();
        if (children().size() < 6) {
            size = 150;
        } else {
            size = 1000 / children().size();
        }
        for (int i = 0; i < children().size(); i++) {
            final C0975i c0975i = children().get(i);
            float f = (i * 20) + 10;
            if (f > 150.0f) {
                f = 150.0f;
            }
            c0975i.mouseEnabled(false);
            C1016a c1016a = new C1016a(c0975i, (i / 3) + 1, f) { // from class: com.tsf.shell.f.c.a.b.6
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    c0975i.visible(false);
                    c0975i.mouseEnabled(true);
                }
            };
            c1016a.m10294l(0.0f);
            c1016a.m10293m(0.0f);
            c1016a.mo10301f(0.0f);
            c1016a.mo10298h(0.0f);
            c1016a.m10316b(i % 2 == 0);
            C1014c.m10326a(c0975i);
            C1014c.m10325a(c0975i, (size * i) + 250, c1016a);
        }
    }

    /* renamed from: a */
    public void m5903a(boolean z) {
        int size;
        m5874z();
        m5883h();
        if (children().size() < 6) {
            size = 150;
        } else {
            size = 1000 / children().size();
        }
        if (z) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < children().size()) {
                    C2310d c2310d = this.f7503l.get(i2);
                    final C0975i c0975i = children().get(i2);
                    if (!c0975i.visible()) {
                        c0975i.rotation().f2528z = c2310d.f7539c;
                        c0975i.position().f2526x = 0.0f;
                        c0975i.position().f2527y = 0.0f;
                        c0975i.scale().setAll(0.0f, 0.0f, 1.0f);
                    }
                    c0975i.visible(true);
                    c0975i.mouseEnabled(false);
                    C1016a c1016a = new C1016a(c0975i, (i2 / 3) + 1, (float) (20.0d + (Math.random() * 120.0d))) { // from class: com.tsf.shell.f.c.a.b.7
                        @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                        /* renamed from: a */
                        public void mo732a() {
                            c0975i.mouseEnabled(true);
                        }
                    };
                    c1016a.m10294l(c2310d.f7540d);
                    c1016a.m10293m(c2310d.f7540d);
                    c1016a.mo10301f(c2310d.f7537a);
                    c1016a.mo10298h(c2310d.f7538b);
                    c1016a.m10303e(c2310d.f7539c);
                    c1016a.m10314a(255);
                    c1016a.m10316b(i2 % 2 == 0);
                    c1016a.m10317a(false);
                    C1014c.m10326a(c0975i);
                    C1014c.m10325a(c0975i, (size * i2) + 250, c1016a);
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        } else {
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 < children().size()) {
                    C2310d c2310d2 = this.f7503l.get(i4);
                    C0975i c0975i2 = children().get(i4);
                    c0975i2.rotation().f2528z = c2310d2.f7539c;
                    c0975i2.position().f2526x = c2310d2.f7537a;
                    c0975i2.position().f2527y = c2310d2.f7538b;
                    c0975i2.scale().setAll(c2310d2.f7540d, c2310d2.f7540d, 1.0f);
                    i3 = i4 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: w */
    private C2310d m5877w() {
        if (this.f7504m.isEmpty()) {
            return new C2310d();
        }
        C2310d remove = this.f7504m.remove(0);
        remove.m5873a();
        return remove;
    }

    /* renamed from: a */
    private void m5906a(C2310d c2310d) {
        this.f7504m.add(c2310d);
    }

    /* renamed from: x */
    private void m5876x() {
        Iterator<C2310d> it = this.f7503l.iterator();
        while (it.hasNext()) {
            C2310d next = it.next();
            next.f7545i = 0.0f;
            next.f7540d = 0.0f;
            next.f7544h = false;
        }
        this.f7505n = false;
        setAnimationObjectState(true);
        mouseEnabled(false);
        invalidate();
    }

    /* renamed from: g */
    public void m5884g() {
        m5883h();
        this.f7505n = false;
        setAnimationObjectState(true);
        mouseEnabled(false);
        invalidate();
    }

    /* renamed from: h */
    public void m5883h() {
        this.f7509r.f7622n.mo5929a(this.f7503l, children(), children().size(), this.f7502k, this.f7500i, this.f7501j, this.f7508q);
    }

    /* renamed from: a */
    public float m5914a(float f) {
        return this.f7509r.f7622n.mo5917a(children(), children().size(), f, this.f7500i, this.f7501j, this.f7508q);
    }

    /* renamed from: i */
    public float m5882i() {
        return this.f7509r.f7622n.mo5917a(children(), children().size(), this.f7502k, this.f7500i, this.f7501j, this.f7508q);
    }

    /* renamed from: b */
    public void m5902b(float f) {
        m5887e(f);
    }

    /* renamed from: j */
    public void m5880j() {
        Iterator<C2310d> it = this.f7503l.iterator();
        while (it.hasNext()) {
            it.next().f7544h = true;
        }
        Iterator<C0975i> it2 = children().iterator();
        while (it2.hasNext()) {
            C0975i next = it2.next();
            next.position().f2526x = 0.0f;
            next.position().f2527y = 0.0f;
            next.rotation().f2528z = 0.0f;
            next.scale().setAll(0.0f, 0.0f, 1.0f);
        }
        this.f7505n = true;
        setAnimationObjectState(false);
    }

    /* renamed from: c */
    public void m5896c(float f) {
        if (this.f7502k != f) {
            this.f7502k = f;
            m5875y();
            m5884g();
        }
    }

    /* renamed from: d */
    public void m5891d(float f) {
        this.f7502k = f;
        m5875y();
        m5884g();
    }

    /* renamed from: e */
    public void m5887e(float f) {
        if (this.f7502k != f) {
            this.f7502k = f;
            m5875y();
            m5883h();
        }
    }

    /* renamed from: k */
    public float m5879k() {
        return this.f7502k;
    }

    /* renamed from: y */
    private void m5875y() {
        this.f7509r.f7622n.mo5925a(this, this.f7500i, this.f7501j, this.f7502k);
    }

    /* renamed from: z */
    private void m5874z() {
        for (int i = 0; i < children().size(); i++) {
            this.f7503l.get(i).f7544h = true;
        }
        this.f7505n = true;
        mouseEnabled(true);
        setAnimationObjectState(false);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.f7513v != null) {
            this.f7509r.f7622n.mo5920a(this.f7510s, this.f7513v);
            this.f7511t.f2529id = this.f7514w.f2529id;
            this.f7510s.dispatchDraw();
        }
        if (!this.f7505n) {
            this.f7505n = true;
            for (int i = 0; i < children().size(); i++) {
                C0975i c0975i = children().get(i);
                C2310d c2310d = this.f7503l.get(i);
                if (!c2310d.f7544h) {
                    float f = c2310d.f7537a;
                    float f2 = c2310d.f7538b;
                    c0975i.position().f2526x += (f - c0975i.position().f2526x) * this.f7492a;
                    c0975i.position().f2527y += (f2 - c0975i.position().f2527y) * this.f7492a;
                    c0975i.rotation().f2528z += (c2310d.f7539c - c0975i.rotation().f2528z) * this.f7492a;
                    Number3d scale = c0975i.scale();
                    Number3d scale2 = c0975i.scale();
                    float f3 = scale2.f2527y + ((c2310d.f7540d - c0975i.scale().f2526x) * this.f7492a);
                    scale2.f2527y = f3;
                    scale.f2526x = f3;
                    float alpha = c0975i.alpha();
                    c0975i.alpha(alpha + ((c2310d.f7545i - alpha) * this.f7492a));
                    if (Math.abs(c0975i.alpha() - c2310d.f7545i) < 0.2f && Math.abs(c0975i.position().f2526x - f) < 0.2f && Math.abs(c0975i.position().f2527y - f2) < 0.2f && Math.abs(c0975i.scale().f2526x - c2310d.f7540d) < 0.01f && Math.abs(c0975i.rotation().f2528z - c2310d.f7539c) < 0.2f) {
                        c0975i.position().f2526x = f;
                        c0975i.position().f2527y = f2;
                        c0975i.rotation().f2528z = c2310d.f7539c;
                        Number3d scale3 = c0975i.scale();
                        Number3d scale4 = c0975i.scale();
                        float f4 = c2310d.f7540d;
                        scale4.f2527y = f4;
                        scale3.f2526x = f4;
                        c2310d.f7544h = true;
                        c0975i.alpha(c2310d.f7545i);
                    }
                    if (c0975i.alpha() == 0.0f) {
                        c0975i.visible(false);
                    } else {
                        c0975i.visible(true);
                    }
                }
                this.f7505n = c2310d.f7544h && this.f7505n;
            }
            if (this.f7505n) {
                mouseEnabled(true);
                setAnimationObjectState(false);
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public void addChild(C0975i c0975i) {
        this.f7503l.add(m5877w());
        super.addChild(c0975i);
        m5884g();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void addChildAt(C0975i c0975i, int i) {
        this.f7503l.add(m5877w());
        super.addChildAt(c0975i, i);
        m5884g();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public boolean removeChild(C0975i c0975i) {
        boolean removeChild = super.removeChild(c0975i);
        if (removeChild) {
            m5906a(this.f7503l.remove(0));
            m5884g();
            m5878l();
            if (c0975i instanceof C3112b) {
                ((C3112b) c0975i).f10106c = false;
                ((C3112b) c0975i).m3540B();
            }
            if (c0975i instanceof AbstractC3208b) {
                ((AbstractC3208b) c0975i).m3153aM();
            } else if (c0975i instanceof C3145b) {
                ((C3145b) c0975i).m3370aM();
                C3359a.f11097k.m2294c((C3145b) c0975i);
            }
        }
        return removeChild;
    }

    /* renamed from: c */
    public void m5895c(float f, float f2) {
        this.f7500i = f;
        this.f7501j = f2;
        m5884g();
    }

    /* renamed from: a */
    private int m5910a(C0975i c0975i, Number3d number3d) {
        Number3d.TEMPNUMBER3D.reset();
        c0975i.localToGlobal(Number3d.TEMPNUMBER3D);
        return m5912a(Number3d.TEMPNUMBER3D.f2526x, Number3d.TEMPNUMBER3D.f2527y, number3d);
    }

    /* renamed from: a */
    private int m5912a(float f, float f2, Number3d number3d) {
        number3d.setAll(f, f2, 0.0f);
        globalToLocal(number3d);
        if (children().size() == 0) {
            return 0;
        }
        int mo5932a = this.f7509r.f7622n.mo5932a(number3d, this.f7503l, children().size());
        if (mo5932a >= children().size()) {
            return children().size() - 1;
        }
        return mo5932a;
    }

    /* renamed from: c */
    private void m5892c(C3112b c3112b) {
    }

    /* renamed from: d */
    private void m5889d(C3112b c3112b) {
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.C2309c, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    public boolean mo2061a(InterfaceC2557f interfaceC2557f, float f, float f2) {
        int m5912a;
        if ((interfaceC2557f instanceof AbstractC3208b) || (interfaceC2557f instanceof C3145b)) {
            if (!this.f7488G && children().size() != 0 && (m5912a = m5912a(f, f2, this.f7484C)) != -1 && m5912a != -2 && (getChildAt(m5912a) instanceof C3145b)) {
            }
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private void m5881i(InterfaceC2557f interfaceC2557f) {
        this.f7489H.mo3140d(interfaceC2557f);
        this.f7489H = null;
        m5892c((C3112b) interfaceC2557f);
    }

    /* renamed from: a */
    private boolean m5911a(int i, Number3d number3d) {
        if (i < 0) {
            return false;
        }
        C0975i childAt = getChildAt(i);
        if (childAt instanceof C3145b) {
            return this.f7509r.f7622n.mo5933a(number3d, childAt, this.f7487F < i);
        }
        return false;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.C2309c, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    public void mo2062a(InterfaceC2557f interfaceC2557f) {
        this.f7488G = true;
        C3112b c3112b = (C3112b) interfaceC2557f;
        m5892c(c3112b);
        this.f7506o.setAABBPX(c3112b.minX(), c3112b.minY(), c3112b.minZ(), c3112b.maxX(), c3112b.maxY(), c3112b.maxZ());
        this.f7487F = m5910a((C0975i) interfaceC2557f, this.f7484C);
        if (this.f7487F == -1) {
            this.f7487F = 0;
        } else if (this.f7487F == -2) {
            this.f7487F = children().size() - 1;
        }
        addChildAt(this.f7506o, this.f7487F);
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.C2309c, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: c */
    public void mo3332c(InterfaceC2557f interfaceC2557f) {
        int i;
        int m5910a = m5910a((C0975i) interfaceC2557f, this.f7484C);
        if (m5910a == -1) {
            i = 0;
        } else {
            i = m5910a == -2 ? children().size() - 1 : m5910a;
        }
        if (m5911a(m5910a, this.f7484C)) {
            C3145b c3145b = (C3145b) getChildAt(i);
            if (this.f7489H == null) {
                this.f7489H = c3145b;
                m5889d((C3112b) interfaceC2557f);
                this.f7489H.mo2062a(interfaceC2557f);
            }
            this.f7489H.mo3504f(interfaceC2557f);
            return;
        }
        if (this.f7489H != null) {
            m5881i(interfaceC2557f);
        }
        if (this.f7487F != i) {
            this.f7487F = i;
            super.removeChild(this.f7506o);
            super.addChildAt(this.f7506o, i);
            m5884g();
        }
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.C2309c, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: d */
    public void mo3140d(InterfaceC2557f interfaceC2557f) {
        this.f7488G = false;
        if (this.f7489H != null) {
            m5881i(interfaceC2557f);
        }
        m5889d((C3112b) interfaceC2557f);
        removeChild(this.f7506o);
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.C2309c, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: b */
    public boolean mo2057b(InterfaceC2557f interfaceC2557f) {
        return interfaceC2557f instanceof C3231c;
    }

    @Override // com.tsf.shell.p096f.p101c.p102a.C2309c, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: e */
    public void mo3139e(InterfaceC2557f interfaceC2557f) {
        boolean z;
        this.f7488G = false;
        C3112b c3112b = (C3112b) interfaceC2557f;
        if (this.f7489H != null) {
            z = this.f7489H.mo2057b(interfaceC2557f);
            if (z) {
                this.f7489H.mo3139e(interfaceC2557f);
            }
            this.f7489H = null;
            if (z) {
                removeChild(this.f7506o);
            }
        } else {
            z = false;
        }
        if (!z) {
            C1014c.m10326a(c3112b);
            globalToLocal(c3112b.position());
            c3112b.removeFromParent();
            c3112b.clearDefaultColor();
            super.removeChild(this.f7506o);
            if (this.f7487F < 0) {
                this.f7487F = 0;
            } else if (this.f7487F > children().size()) {
                this.f7487F = children().size();
                if (this.f7487F < 0) {
                    this.f7487F = 0;
                }
            }
            super.addChildAt(c3112b, this.f7487F);
            m5904a(c3112b, true);
            if (c3112b instanceof C3231c) {
                C3231c c3231c = (C3231c) c3112b;
                if (c3231c.m3064as()) {
                    Iterator<C3231c> it = c3231c.m3061av().iterator();
                    while (it.hasNext()) {
                        m5904a(it.next(), true);
                    }
                    c3231c.m3058ay();
                }
            }
            m5878l();
            m5884g();
        }
    }

    /* renamed from: a */
    public void m5904a(C3112b c3112b, boolean z) {
        c3112b.mo3462a(this.f7507p);
        c3112b.f10106c = true;
        if (c3112b instanceof AbstractC3208b) {
            C1014c.m10326a(((AbstractC3208b) c3112b).f10495k);
            ((AbstractC3208b) c3112b).m3154aL();
        } else if (c3112b instanceof C3145b) {
            ((C3145b) c3112b).m3371aL();
        }
        if (z) {
            c3112b.m3534K().onUpdateContainer(-4);
        }
    }

    /* renamed from: A */
    private void m5915A() {
        this.f7491J = new Runnable() { // from class: com.tsf.shell.f.c.a.b.8
            @Override // java.lang.Runnable
            public void run() {
                C0975i next;
                String str;
                C2298b.this.f7490I = false;
                final String str2 = "";
                Iterator<C0975i> it = C2298b.this.children().iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof C3112b) {
                        str = str2 + ((C3112b) next).m3534K().f2532id + ",";
                    } else {
                        str = str2;
                    }
                    str2 = str;
                }
                C0853a.m10865a().m10581d(new Runnable() { // from class: com.tsf.shell.f.c.a.b.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ContentResolver contentResolver = C0853a.m10856d().getContentResolver();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("child", str2);
                        contentResolver.update(ContentUris.withAppendedId(C3345g.C3353h.f11072a, 1L), contentValues, null, null);
                        contentValues.clear();
                    }
                });
            }
        };
    }

    /* renamed from: l */
    public void m5878l() {
        if (!this.f7490I && !this.f7509r.m5857a()) {
            this.f7490I = true;
            C0853a.m10865a().m10583c(this.f7491J);
        }
    }
}
