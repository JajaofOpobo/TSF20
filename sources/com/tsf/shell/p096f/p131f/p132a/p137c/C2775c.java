package com.tsf.shell.p096f.p131f.p132a.p137c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.p096f.p118e.InterfaceC2557f;
import com.tsf.shell.p096f.p118e.p125e.C2530a;
import com.tsf.shell.p096f.p118e.p125e.C2539c;
import com.tsf.shell.p096f.p131f.p132a.C2676a;
import com.tsf.shell.p096f.p131f.p132a.C2843f;
import com.tsf.shell.p096f.p131f.p132a.C2862h;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p154a.C3109c;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3142a;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.a.c.c */
/* loaded from: classes.dex */
public class C2775c extends C2792i {

    /* renamed from: g */
    private C2769b f9077g;

    /* renamed from: h */
    private C2754a f9078h;

    /* renamed from: i */
    private C2778a f9079i;

    /* renamed from: j */
    private C3112b f9080j;

    /* renamed from: k */
    private C2530a f9081k;

    /* renamed from: l */
    private C3231c f9082l;

    /* renamed from: m */
    private C3112b f9083m;

    /* renamed from: n */
    private C3112b f9084n;

    /* renamed from: o */
    private boolean f9085o;

    /* renamed from: p */
    private boolean f9086p;

    /* renamed from: q */
    private float f9087q;

    /* renamed from: r */
    private float f9088r;

    /* renamed from: s */
    private Number3d f9089s;

    /* renamed from: t */
    private float[] f9090t;

    /* renamed from: u */
    private C0937a f9091u;

    /* renamed from: v */
    private int f9092v;

    /* renamed from: w */
    private boolean f9093w;

    /* renamed from: x */
    private C0980j f9094x;

    /* renamed from: y */
    private boolean f9095y;

    /* renamed from: z */
    private Number3d f9096z;

    /* renamed from: com.tsf.shell.f.f.a.c.c$a */
    /* loaded from: classes.dex */
    public static class C2778a extends C0980j {
        public C2778a() {
            visible(false);
            position().f2527y = -C0892a.m10742a(150.0f);
            alpha(0.0f);
        }

        /* renamed from: f */
        public void m4678f() {
            visible(true);
            C1017d c1017d = new C1017d();
            c1017d.m10314a(255);
            c1017d.mo10298h(0.0f);
            c1017d.m10313a(C0986a.f2946a);
            C1014c.m10326a(this);
            C1014c.m10325a(this, VEasing.Linear.easeNone, c1017d);
            mo4681a();
        }

        /* renamed from: g */
        public void m4677g() {
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.c.c.a.1
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2778a.this.visible(false);
                    C2778a.this.mo4679d();
                }
            };
            c1017d.m10314a(0);
            c1017d.mo10298h(-C0892a.m10742a(150.0f));
            C1014c.m10326a(this);
            C1014c.m10325a(this, 350, c1017d);
            mo4680c();
        }

        /* renamed from: a */
        public void mo4681a() {
        }

        /* renamed from: c */
        public void mo4680c() {
        }

        /* renamed from: d */
        public void mo4679d() {
        }
    }

    public C2775c(final C2862h c2862h, C2843f c2843f) {
        super(c2862h, c2843f, C1306b.C1310d.drawer_multiple_choice, C4189x.m588c(C1306b.C1315i.text_multi_choice));
        this.f9083m = new C3112b(null);
        this.f9084n = new C3112b(null);
        this.f9085o = false;
        this.f9086p = false;
        this.f9089s = new Number3d();
        this.f9090t = new float[]{0.0f, 0.0f};
        this.f9093w = false;
        this.f9095y = false;
        this.f9096z = new Number3d();
        this.f9077g = new C2769b(this, c2843f, c2862h);
        this.f9078h = new C2754a(this, c2843f, c2862h);
        this.f9081k = new C2530a() { // from class: com.tsf.shell.f.f.a.c.c.1
            @Override // com.tsf.shell.p096f.p118e.p125e.C2530a
            /* renamed from: a */
            public void mo4004a(int i, Object obj) {
                c2862h.m4446au();
                if (i == 0) {
                    c2862h.m4477aG();
                } else {
                    c2862h.m4478aF();
                }
                m5333a(800);
            }

            @Override // com.tsf.shell.p096f.p118e.p125e.C2530a
            /* renamed from: a */
            public float mo4005a() {
                return C0892a.m10742a(C2862h.f9293F);
            }
        };
        addChild(this.f9077g);
        addChild(this.f9078h);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: a */
    public void mo4616a(int i, int i2, int i3, int i4) {
        this.f9077g.m4725a(i, i2, i3, i4);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: a */
    public boolean mo4656a(boolean z) {
        return z || this.f9077g.m4721b() > 0;
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: a */
    public void mo4617a() {
        this.f9129b.m4533f();
        if (this.f9079i != null) {
            this.f9079i.m4677g();
        }
        this.f9079i = null;
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: b */
    public void mo4613b() {
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: b */
    public void mo4611b(boolean z) {
        this.f9129b.m4535e();
        if (this.f9077g.m4721b() > 0 || z) {
            m4701a(this.f9077g);
        } else {
            m4701a(this.f9078h);
        }
    }

    /* renamed from: a */
    private void m4701a(C2778a c2778a) {
        if (this.f9079i != null) {
            this.f9079i.m4677g();
        }
        this.f9079i = c2778a;
        this.f9079i.m4678f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m4684q() {
        this.f9078h.m4762b();
    }

    /* renamed from: r */
    private void m4683r() {
        this.f9128a.m4452ao().m4807c();
    }

    /* renamed from: a */
    private void m4703a(C0980j c0980j, int i) {
        C2676a c2676a = (C2676a) c0980j;
        int numChildren = c2676a.numChildren();
        if (numChildren == 1) {
            c2676a.addChild(this.f9084n);
        }
        this.f9083m.removeFromParent();
        if (i != -1) {
            c0980j.addChildAt(this.f9083m, i);
        } else {
            c0980j.addChild(this.f9083m);
        }
        if (numChildren == 1) {
            this.f9084n.removeFromParent();
        }
        m4683r();
    }

    /* renamed from: a */
    public void m4702a(C0980j c0980j, C3112b c3112b, int i, float f, float f2) {
        float m594b;
        float f3;
        int i2;
        int i3;
        C3222g c3222g = null;
        if (i > -1 && i < c0980j.numChildren()) {
            C3112b c3112b2 = (C3112b) c0980j.getChildAt(i);
            if (c3112b2 == this.f9083m) {
                c3112b2 = null;
            }
            c3222g = c3112b2;
        } else if (c0980j.getChildIndexOf(this.f9083m) == -1) {
            m4703a(c0980j, -1);
        }
        if (c3222g != null) {
            c3222g.setAnimationObjectState(true);
            this.f9083m.setAnimationObjectState(true);
            int numChildren = c0980j.numChildren();
            int childIndexOf = c0980j.getChildIndexOf(this.f9083m);
            if (childIndexOf == -1) {
                if (c3222g instanceof C3145b) {
                    m594b = 0.0f;
                    f3 = 1.0f;
                } else {
                    m4703a(c0980j, i);
                    return;
                }
            } else {
                Number3d number3d = C2862h.f9292E.get(childIndexOf);
                Number3d number3d2 = C2862h.f9292E.get(i);
                float m594b2 = C4189x.m594b(number3d.f2526x, number3d.f2527y, number3d2.f2526x, number3d2.f2527y) + (20.0f * C0892a.f2567c);
                m594b = C4189x.m594b(f, f2, number3d.f2526x, number3d.f2527y);
                f3 = m594b2;
            }
            if (m594b > f3 || (c3112b instanceof C3145b) || ((c3222g instanceof AbstractC3208b) && !AbstractC3208b.m3150aR() && c3222g != this.f9080j)) {
                m4684q();
                m4683r();
                c0980j.children().remove(this.f9083m);
                c0980j.children().add(i, this.f9083m);
                if (childIndexOf > i) {
                    i2 = childIndexOf;
                    i3 = i;
                } else {
                    i2 = i;
                    i3 = childIndexOf;
                }
                if (i3 > numChildren - 1) {
                    i3 = numChildren - 1;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                int i4 = i2 > numChildren + (-1) ? numChildren - 1 : i2;
                while (i3 < i4 + 1) {
                    c0980j.children().get(i3).setAnimationObjectState(true);
                    i3++;
                }
                c3222g = null;
            } else if (((c3222g instanceof AbstractC3208b) || (c3222g instanceof C3145b)) && this.f9080j != c3222g) {
                m4684q();
                if (c3112b instanceof AbstractC3208b) {
                    if (c3222g instanceof AbstractC3208b) {
                        C3222g c3222g2 = c3222g;
                        if (c3222g2.m3161aC() && !c3222g2.m3492t()) {
                            c3222g2.m3169a((C0975i) c3112b);
                        } else {
                            c3222g = null;
                        }
                    } else if (c3222g instanceof C3145b) {
                        c3112b.mo3504f(c3222g);
                    }
                }
            }
        }
        m4696a(c3112b, c3222g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4697a(C3112b c3112b) {
        m4696a(c3112b, (C3112b) null);
    }

    /* renamed from: a */
    private void m4696a(C3112b c3112b, C3112b c3112b2) {
        if (c3112b2 != this.f9080j) {
            if (this.f9080j instanceof AbstractC3208b) {
                ((AbstractC3208b) this.f9080j).m3144b((C0975i) c3112b);
            } else if (this.f9080j instanceof C3145b) {
                c3112b.mo3493p();
            }
            this.f9080j = c3112b2;
        }
    }

    /* renamed from: a */
    public void m4704a(C0937a c0937a) {
        this.f9091u = c0937a;
    }

    /* renamed from: c */
    public C3231c m4691c() {
        return this.f9082l;
    }

    /* renamed from: d */
    public boolean m4689d() {
        return this.f9085o;
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: a */
    public void mo4659a(C3231c c3231c, MotionEvent motionEvent) {
        this.f9086p = false;
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: b */
    public void mo4654b(C3231c c3231c, MotionEvent motionEvent) {
        if (this.f9091u != null) {
            this.f9091u.mo1653f(motionEvent);
        }
        this.f9091u = null;
    }

    /* renamed from: a */
    public void m4695a(C3231c c3231c) {
        ((C3109c) c3231c.getMouseEventListener()).m3553a(this.f9087q, this.f9088r);
    }

    /* renamed from: a */
    public void m4705a(float f, float f2) {
        this.f9087q = this.f9089s.f2526x;
        this.f9088r = this.f9089s.f2527y;
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: c */
    public void mo4651c(C3231c c3231c, MotionEvent motionEvent) {
        this.f9093w = false;
        this.f9081k.m5331b();
        this.f9082l = c3231c;
        this.f9089s.reset();
        c3231c.localToGlobal(this.f9089s);
        m4705a(this.f9089s.f2526x, this.f9089s.f2527y);
        this.f9085o = true;
        C0980j c0980j = (C0980j) c3231c.parent();
        c3231c.position().setAllFrom(this.f9089s);
        if (c3231c.parent() instanceof C2676a) {
            this.f9094x = c0980j;
            this.f9092v = c0980j.getChildIndexOf(c3231c);
            c0980j.replaceChild(c3231c, this.f9083m);
            C3359a.f11096j.m2232a(c3231c);
            this.f9128a.m4417c((C3112b) c3231c);
            c3231c.setAnimationObjectState(true);
            Number3d.TEMPNUMBER3D.reset();
            Number3d.TEMPNUMBER3D.setAll(1.0f, 1.0f, 1.0f);
            Number3d localScaleToGlobale = c3231c.localScaleToGlobale(Number3d.TEMPNUMBER3D);
            c3231c.scale().setAll(localScaleToGlobale.f2526x, localScaleToGlobale.f2527y, 1.0f);
            C1017d c1017d = new C1017d();
            c1017d.m10294l(c3231c.f10107d);
            c1017d.m10293m(c3231c.f10107d);
            C1014c.m10326a(c3231c);
            C1014c.m10325a(c3231c, 250, c1017d);
            if (motionEvent == null) {
                this.f9090t[0] = c3231c.position().f2526x;
                this.f9090t[1] = c3231c.position().f2527y;
            } else {
                C4189x.m600a(motionEvent, this.f9090t);
            }
            this.f9128a.m4488a((C3112b) c3231c, true, this.f9090t[0], this.f9090t[1]);
            return;
        }
        this.f9094x = null;
        this.f9077g.m4718b(c3231c, motionEvent);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: d */
    public void mo4649d(C3231c c3231c, MotionEvent motionEvent) {
        ArrayList<C3231c> arrayList;
        this.f9081k.m5329c();
        if (this.f9091u != null) {
            this.f9091u.mo2119d(motionEvent);
            return;
        }
        this.f9093w = this.f9128a.m4452ao().m4804f();
        this.f9082l = null;
        this.f9085o = false;
        C0980j c0980j = (C0980j) this.f9083m.parent();
        boolean z = c0980j == null;
        if (c3231c.mo3495n() != null && c3231c.mo3494o()) {
            float[] m601a = C4189x.m601a(motionEvent);
            InterfaceC2557f a = c3231c.m3516a((int) m601a[0], (int) m601a[1], false);
            if (a != null && (a instanceof C2539c.C2553b)) {
                if (c3231c.mo3500h(a)) {
                    c3231c.mo3135g(a);
                }
                z = true;
            } else {
                c3231c.mo3493p();
            }
        }
        if (z) {
            m4692b(c3231c);
        } else {
            if (c0980j instanceof C2676a) {
                Number3d.TEMPNUMBER3D.reset();
                Number3d.TEMPNUMBER3D.setAllFrom(c3231c.scale());
                c0980j.globalScaleToLocal(Number3d.TEMPNUMBER3D);
                c3231c.scale().setAllFrom(Number3d.TEMPNUMBER3D);
            }
            if (this.f9080j != null && (c3231c instanceof AbstractC3208b)) {
                c0980j.removeChild(this.f9083m);
                if (this.f9080j instanceof AbstractC3208b) {
                    C3222g c3222g = (C3222g) this.f9080j;
                    C3145b a2 = c3222g.m3164a((AbstractC3208b) c3231c, true);
                    m4683r();
                    this.f9128a.m4490a(a2, c3222g);
                    a2.setMouseEventListener(this.f9128a.m4406f(a2));
                    a2.setAnimationObjectState(true);
                } else if (this.f9080j instanceof C3145b) {
                    c3231c.mo3135g(this.f9080j);
                }
                this.f9080j = null;
            } else {
                C2676a c2676a = (C2676a) c0980j;
                if (c3231c.m3064as()) {
                    arrayList = c3231c.m3060aw();
                } else {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(c3231c);
                Iterator<C3231c> it = arrayList.iterator();
                while (it.hasNext()) {
                    C3231c next = it.next();
                    this.f9089s.reset();
                    this.f9089s.setAllFrom(next.position());
                    c0980j.globalToLocal(this.f9089s);
                    next.position().setAllFrom(this.f9089s);
                }
                arrayList.remove(c3231c);
                C3359a.f11096j.m2223b(c3231c);
                int childIndexOf = c0980j.getChildIndexOf(this.f9083m);
                c0980j.children().set(childIndexOf, c3231c);
                c3231c.parent(c0980j);
                c3231c.setAnimationObjectState(true);
                this.f9083m.parent(null);
                this.f9128a.m4491a(c3231c, c2676a, childIndexOf);
                Iterator<C3231c> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C3231c next2 = it2.next();
                    c0980j.addChildAt(next2, childIndexOf + 1);
                    this.f9128a.m4491a(next2, c2676a, childIndexOf + 1);
                    next2.setAnimationObjectState(true);
                }
                C1017d c1017d = new C1017d();
                c1017d.m10294l(1.0f);
                c1017d.m10293m(1.0f);
                C1014c.m10326a(c3231c);
                C1014c.m10325a(c3231c, 250, c1017d);
            }
        }
        if (this.f9129b.m4541c() == this) {
            m4682s();
        }
        C3359a.f11102p.m5312c();
    }

    /* renamed from: s */
    private void m4682s() {
        if (this.f9077g.m4715e()) {
            if (this.f9128a.m4452ao().m4804f()) {
                m4701a(this.f9077g);
            } else {
                this.f9129b.m4526m();
            }
        }
    }

    /* renamed from: b */
    public void m4692b(C3231c c3231c) {
        int m4967e;
        this.f9085o = false;
        if (c3231c.mo3495n() != null) {
            c3231c.mo3493p();
        }
        if (this.f9094x == null) {
            this.f9094x = this.f9128a.m4451ap();
        }
        ArrayList<C3231c> arrayList = new ArrayList<>();
        if (c3231c instanceof C3145b) {
            C3145b c3145b = (C3145b) c3231c;
            if (c3145b.m3533L()) {
                m4683r();
                ArrayList arrayList2 = new ArrayList();
                Iterator<C0975i> it = c3145b.m3359aX().children().iterator();
                while (it.hasNext()) {
                    arrayList2.add((C3222g) it.next());
                }
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    C3222g c3222g = (C3222g) arrayList2.get((size - i) - 1);
                    ((C3142a) c3222g.getMouseEventListener()).m3418a();
                    Number3d.TEMPNUMBER3D.reset();
                    c3222g.localToGlobal(Number3d.TEMPNUMBER3D);
                    c3145b.m3359aX().removeChild(c3222g);
                    c3222g.position().setAllFrom(Number3d.TEMPNUMBER3D);
                    c3222g.mouseEnabled(true);
                    c3222g.m3540B();
                    c3222g.visible(true);
                    c3222g.alpha(255.0f);
                    ((LauncherShortcut3DInfo) c3222g.m3534K()).container = -1;
                    c3222g.m3136g(1.0f);
                    arrayList.add(c3222g);
                }
            } else {
                arrayList.add(c3231c);
            }
        } else if ((c3231c instanceof C3222g) && c3231c.m3533L()) {
            C3359a.f11096j.m2223b(c3231c);
            C0980j c0980j = (C0980j) this.f9083m.parent();
            if (c0980j != null && (c0980j instanceof C2676a)) {
                ((C2676a) c0980j).removeChild(this.f9083m);
                return;
            }
            return;
        } else {
            ArrayList<C3231c> m3060aw = c3231c.m3064as() ? c3231c.m3060aw() : arrayList;
            m3060aw.add(c3231c);
            arrayList = m3060aw;
        }
        C3359a.f11096j.m2223b(c3231c);
        Iterator<C3231c> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C3231c next = it2.next();
            this.f9089s.reset();
            this.f9089s.setAllFrom(next.position());
            this.f9094x.globalToLocal(this.f9089s);
            next.position().setAllFrom(this.f9089s);
        }
        C0980j c0980j2 = (C0980j) this.f9083m.parent();
        if (c0980j2 != null && (c0980j2 instanceof C2676a)) {
            m4967e = (((C2676a) c0980j2).m4967e() * C2862h.f9296m) + this.f9092v;
        } else {
            m4967e = this.f9128a.m4451ap().m4967e() * C2862h.f9296m;
        }
        this.f9083m.removeFromParent();
        Iterator<C3231c> it3 = arrayList.iterator();
        while (true) {
            int i2 = m4967e;
            if (!it3.hasNext()) {
                break;
            }
            C3231c next2 = it3.next();
            int i3 = i2 % C2862h.f9296m;
            C2676a m4411e = this.f9128a.m4411e(i2);
            m4411e.addChildAt(next2, i3);
            this.f9128a.m4491a(next2, m4411e, i3);
            C1017d c1017d = new C1017d();
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            c1017d.m10303e(0.0f);
            C1014c.m10326a(next2);
            C1014c.m10325a(next2, 250, c1017d);
            m4967e = i2 + 1;
        }
        m4697a((C3112b) c3231c);
        m4683r();
        if (!this.f9093w) {
            this.f9128a.m4452ao().m4805e();
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: a */
    public void mo4658a(final C3231c c3231c, MotionEvent motionEvent, final MotionEvent motionEvent2) {
        if (this.f9091u != null) {
            this.f9091u.mo2129a(motionEvent, motionEvent2);
        } else if (this.f9085o) {
            float[] m600a = C4189x.m600a(motionEvent2, this.f9090t);
            if (this.f9086p) {
                C3359a.f11102p.m5316a(m600a[0], m600a[1]);
                c3231c.position().f2526x = this.f9087q + (motionEvent2.getX() - motionEvent.getX());
                c3231c.position().f2527y = this.f9088r - (motionEvent2.getY() - motionEvent.getY());
            }
            if (!this.f9095y) {
                this.f9095y = true;
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.f.a.c.c.2
                    @Override // java.lang.Runnable
                    public void run() {
                        C2775c.this.f9095y = false;
                        if (C2775c.this.f9085o) {
                            if (!C2775c.this.f9086p) {
                                if (C4189x.m594b(C2775c.this.f9087q, C2775c.this.f9088r, motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                                    C2775c.this.f9086p = true;
                                    return;
                                }
                                return;
                            }
                            float[] m595b = C4189x.m595b(motionEvent2.getX(), motionEvent2.getY());
                            InterfaceC2557f a = c3231c.m3516a((int) C2775c.this.f9090t[0], (int) C2775c.this.f9090t[1], false);
                            if (a != null) {
                                c3231c.mo3504f(a);
                                C2775c.this.m4697a((C3112b) c3231c);
                                C2775c.this.m4684q();
                                return;
                            }
                            if (c3231c.mo3495n() != null && !(c3231c.mo3495n() instanceof C3145b)) {
                                c3231c.mo3493p();
                            }
                            C2775c.this.f9096z.f2526x = m595b[0];
                            C2775c.this.f9096z.f2527y = m595b[1];
                            if (m595b[1] >= C0892a.f2552C + C2843f.f9233a) {
                                C2775c.this.f9128a.m4451ap().globalToLocal(C2775c.this.f9096z);
                                float f = C2775c.this.f9096z.f2526x;
                                float f2 = C2775c.this.f9096z.f2527y;
                                C2775c.this.m4702a(C2775c.this.f9128a.m4451ap(), c3231c, C2775c.this.f9128a.m4451ap().m4983a(C2775c.this.f9096z.f2526x + ((C3566b.f11839a.f11762T / 2.0f) * C2862h.f9305v), C2775c.this.f9096z.f2527y - ((C3566b.f11839a.f11763U / 2.0f) * C2862h.f9305v)), f, f2);
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: a */
    public void mo4657a(C3231c c3231c, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f9091u != null) {
            this.f9091u.mo527a(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: b */
    public void mo4653b(C3231c c3231c, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: e */
    public void mo4647e(C3231c c3231c, MotionEvent motionEvent) {
        this.f9077g.m4722a(c3231c, motionEvent);
    }
}
