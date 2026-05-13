package com.tsf.shell.p096f.p153i.p155b.p159d;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p030a.C0864d;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p172d.C3466a;
import com.tsf.shell.p096f.p118e.InterfaceC2557f;
import com.tsf.shell.p096f.p118e.p125e.C2539c;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.i.b.d.a */
/* loaded from: classes.dex */
public class C3142a extends C0937a {

    /* renamed from: l */
    private static float[] f10213l = {0.0f, 0.0f};

    /* renamed from: a */
    private C3145b f10214a;

    /* renamed from: b */
    private C0937a f10215b;

    /* renamed from: d */
    private boolean f10216d;

    /* renamed from: e */
    private C3466a.C3467a f10217e;

    /* renamed from: f */
    private boolean f10218f;

    /* renamed from: g */
    private float f10219g;

    /* renamed from: h */
    private float f10220h;

    /* renamed from: i */
    private float f10221i;

    /* renamed from: j */
    private float f10222j;

    /* renamed from: k */
    private boolean f10223k;

    /* renamed from: m */
    private int f10224m;

    /* renamed from: n */
    private float f10225n;

    /* renamed from: o */
    private float f10226o;

    /* renamed from: p */
    private boolean f10227p;

    /* renamed from: q */
    private Runnable f10228q;

    public C3142a(C0975i c0975i, C3145b c3145b) {
        super(c0975i);
        this.f10216d = false;
        this.f10223k = false;
        this.f10224m = -1;
        this.f10227p = false;
        this.f10214a = c3145b;
        this.f10215b = c0975i.getMouseEventListener();
        this.f10217e = new C3466a.C3467a() { // from class: com.tsf.shell.f.i.b.d.a.1
            @Override // com.tsf.shell.manager.p172d.C3466a.C3467a
            /* renamed from: a */
            public boolean mo2293a(InterfaceC2557f interfaceC2557f) {
                return interfaceC2557f instanceof C2539c.C2553b;
            }
        };
    }

    /* renamed from: a */
    public boolean m3418a() {
        this.f10214a = null;
        this.f2740c.setMouseEventListener(this.f10215b);
        if (this.f10218f) {
            ((AbstractC3208b) this.f2740c).m3075ah();
            this.f10215b.mo2122c(null);
            C0864d.m10805d().m10801e();
            C0864d.m10805d().m10820a(this.f10215b, true);
        }
        this.f10215b = null;
        return this.f10218f;
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: c */
    public void mo2122c(MotionEvent motionEvent) {
        super.mo2122c(motionEvent);
        this.f10223k = false;
        f10213l = C4189x.m600a(motionEvent, f10213l);
        this.f10221i = motionEvent.getX();
        this.f10222j = motionEvent.getY();
        if (this.f10214a.m3361aV() == C3145b.f10238a) {
            AbstractC3208b abstractC3208b = (AbstractC3208b) this.f2740c;
            if (C3359a.f11083A.m2213a() && abstractC3208b.m3161aC()) {
                this.f10224m = this.f10214a.m3377aF().m3273a(this.f2740c);
                this.f10214a.m3368aO();
                this.f10214a.m3377aF().m3259c(true);
                if (abstractC3208b.m3541A().m3563e()) {
                    ArrayList<C3231c> m3560i = abstractC3208b.m3541A().m3560i();
                    abstractC3208b.rotation().f2528z = 0.0f;
                    int size = m3560i.size();
                    for (int i = 0; i < size; i++) {
                        AbstractC3208b abstractC3208b2 = (AbstractC3208b) m3560i.get(i);
                        if (abstractC3208b2 != abstractC3208b) {
                            abstractC3208b2.m3136g(1.0f);
                            abstractC3208b.m3080a((C3231c) abstractC3208b2);
                            C1017d c1017d = new C1017d();
                            C1014c.m10326a(abstractC3208b2);
                            c1017d.m10294l(1.0f);
                            c1017d.m10293m(1.0f);
                            C1014c.m10325a(abstractC3208b2, 300, c1017d);
                        }
                    }
                    abstractC3208b.m3541A().m3561g();
                    this.f10214a.m3306n(false);
                }
                C4187w.m616a();
                this.f10218f = true;
                Number3d.TEMPNUMBER3D2.reset();
                Number3d localToGlobal = this.f2740c.localToGlobal(Number3d.TEMPNUMBER3D2);
                localToGlobal.f2527y += this.f10214a.m3377aF().m3250m();
                this.f2740c.position().setAllFrom(localToGlobal);
                this.f10214a.m3377aF().m3268a((AbstractC3208b) this.f2740c);
                C3359a.f11096j.m2232a(this.f2740c);
                m3413b();
                C1017d c1017d2 = new C1017d();
                c1017d2.m10294l(abstractC3208b.f10107d);
                c1017d2.m10293m(abstractC3208b.f10107d);
                c1017d2.m10292n(1.0f);
                C1014c.m10326a(this.f2740c);
                C1014c.m10325a(this.f2740c, 500, c1017d2);
                this.f2740c.setAnimationObjectState(true);
                if (this.f10214a.m3380aC()) {
                    if (!abstractC3208b.m3064as()) {
                        C3359a.f11094h.m4019t().m4488a((C3112b) abstractC3208b, false, f10213l[0], f10213l[1]);
                        return;
                    }
                    return;
                }
                C3359a.f11102p.m5314a(abstractC3208b, f10213l[0], f10213l[1], true, 0);
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f10214a.m3377aF().m3274a(motionEvent, motionEvent2, f, f2);
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: b */
    public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f10214a.m3377aF().m3278a(f2);
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: g */
    public void mo3208g(MotionEvent motionEvent) {
        this.f10214a.m3377aF().m3278a(0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2119d(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.p096f.p153i.p155b.p159d.C3142a.mo2119d(android.view.MotionEvent):void");
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        super.mo2129a(motionEvent, motionEvent2);
        if (this.f10218f) {
            if (this.f10223k) {
                final float[] m600a = C4189x.m600a(motionEvent2, f10213l);
                if (!this.f10216d) {
                    this.f10217e.m2292a((InterfaceC2557f) this.f2740c, motionEvent2);
                }
                this.f10225n = motionEvent2.getX();
                this.f10226o = motionEvent2.getY();
                this.f2740c.position().f2526x = (int) (this.f10219g + (motionEvent2.getX() - this.f10221i));
                this.f2740c.position().f2527y = (int) (this.f10220h - (motionEvent2.getY() - this.f10222j));
                if (this.f10228q == null) {
                    this.f10228q = new Runnable() { // from class: com.tsf.shell.f.i.b.d.a.2
                        @Override // java.lang.Runnable
                        public void run() {
                            C3142a.this.f10227p = false;
                            if (!C3142a.this.f10216d) {
                                C3359a.f11102p.m5316a(m600a[0], m600a[1]);
                                int m3354b = C3142a.this.f10214a.m3354b(C3142a.this.f10225n, C3142a.this.f10226o);
                                if (m3354b == -2) {
                                    C3142a.this.f10216d = true;
                                    C3142a.this.f10214a.m3377aF().m3259c(false);
                                    C3142a.this.f10214a.m3392a((AbstractC3208b) C3142a.this.f2740c);
                                    return;
                                }
                                if (C3142a.this.f10224m != m3354b) {
                                    switch (m3354b) {
                                        case -4:
                                            C3142a.this.f10214a.m3377aF();
                                            C3183g.m3265a(false);
                                            C3142a.this.f10214a.m3377aF();
                                            C3183g.m3261b(true);
                                            return;
                                        case -3:
                                            C3142a.this.f10214a.m3377aF();
                                            C3183g.m3265a(true);
                                            C3142a.this.f10214a.m3377aF();
                                            C3183g.m3261b(false);
                                            return;
                                        case -2:
                                        default:
                                            C3142a.this.f10214a.m3377aF();
                                            C3183g.m3265a(false);
                                            C3142a.this.f10214a.m3377aF();
                                            C3183g.m3261b(false);
                                            C3142a.this.f10214a.m3377aF();
                                            C3183g.m3279a();
                                            C3142a.this.f10214a.m3377aF().m3252k();
                                            break;
                                        case ItemInfo.NO_ID /* -1 */:
                                            C3142a.this.f10214a.m3377aF();
                                            C3183g.m3265a(false);
                                            C3142a.this.f10214a.m3377aF();
                                            C3183g.m3261b(false);
                                            C3142a.this.f10214a.m3377aF();
                                            C3183g.m3279a();
                                            return;
                                    }
                                }
                                if (C3142a.this.f10214a.m3377aF().m3272a(C3142a.this.f2740c, C3142a.this.f10224m, m3354b)) {
                                    C3142a.this.f10224m = m3354b;
                                }
                            }
                        }
                    };
                }
                if (!this.f10227p) {
                    this.f10227p = true;
                    C0853a.m10865a().m10585b(this.f10228q);
                }
            } else if (C4189x.m594b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                this.f10223k = true;
                if (this.f2740c instanceof C3112b) {
                    ((C3112b) this.f2740c).mo3077ab();
                }
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: e */
    public void mo1654e(MotionEvent motionEvent) {
        if (this.f2740c.parent() instanceof C3183g) {
            Number3d.TEMPNUMBER3D2.reset();
            Number3d.TEMPNUMBER3D3.reset();
            this.f2740c.localToGlobal(Number3d.TEMPNUMBER3D2);
            Number3d number3d = Number3d.TEMPNUMBER3D2;
            number3d.f2527y = ((C3183g) this.f2740c.parent()).m3250m() + number3d.f2527y;
            ((AbstractC3208b) this.f2740c).m3170a(Number3d.TEMPNUMBER3D2, Number3d.TEMPNUMBER3D3);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo502a(MotionEvent motionEvent) {
        if (this.f2740c instanceof C3231c) {
            C3231c c3231c = (C3231c) this.f2740c;
            if (c3231c.m3541A().m3563e()) {
                c3231c.m3067ap();
                return;
            }
        }
        ((AbstractC3208b) this.f2740c).mo3094l();
    }

    /* renamed from: b */
    public void m3413b() {
        m3417a(this.f2740c.position().f2526x, this.f2740c.position().f2527y);
    }

    /* renamed from: a */
    public void m3417a(float f, float f2) {
        this.f10219g = f;
        this.f10220h = f2;
    }
}
