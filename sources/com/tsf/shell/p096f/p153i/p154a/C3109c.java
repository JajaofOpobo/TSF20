package com.tsf.shell.p096f.p153i.p154a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.C3398f;
import com.tsf.shell.manager.p172d.C3466a;
import com.tsf.shell.manager.p187r.C3613a;
import com.tsf.shell.p096f.p118e.C2448a;
import com.tsf.shell.p096f.p118e.C2656s;
import com.tsf.shell.p096f.p118e.InterfaceC2557f;
import com.tsf.shell.p096f.p118e.p127g.AbstractC2593d;
import com.tsf.shell.p096f.p131f.C2951n;
import com.tsf.shell.p096f.p153i.C3105a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.utils.C4187w;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.i.a.c */
/* loaded from: classes.dex */
public class C3109c extends C0937a {

    /* renamed from: a */
    public static C2951n f10085a;

    /* renamed from: b */
    public float f10086b;

    /* renamed from: d */
    public float f10087d;

    /* renamed from: e */
    boolean f10088e;

    /* renamed from: f */
    boolean f10089f;

    /* renamed from: g */
    private C3112b f10090g;

    /* renamed from: h */
    private float f10091h;

    /* renamed from: i */
    private float f10092i;

    /* renamed from: j */
    private float f10093j;

    /* renamed from: k */
    private float f10094k;

    /* renamed from: l */
    private boolean f10095l;

    /* renamed from: m */
    private boolean f10096m;

    /* renamed from: n */
    private boolean f10097n;

    /* renamed from: o */
    private boolean f10098o;

    /* renamed from: p */
    private C0937a f10099p;

    /* renamed from: q */
    private C3466a.C3467a f10100q;

    /* renamed from: r */
    private float[] f10101r;

    public C3109c(C3112b c3112b) {
        super(c3112b);
        this.f10095l = false;
        this.f10096m = false;
        this.f10097n = false;
        this.f10098o = false;
        this.f10101r = new float[]{0.0f, 0.0f};
        this.f10088e = false;
        this.f10089f = true;
        this.f10090g = c3112b;
        this.f10100q = new C3466a.C3467a();
    }

    /* renamed from: d */
    private void m3545d() {
        this.f10086b = this.f2740c.position().f2526x;
        this.f10087d = this.f2740c.position().f2527y;
    }

    /* renamed from: a */
    public void m3553a(float f, float f2) {
        this.f10086b = f;
        this.f10087d = f2;
    }

    /* renamed from: l */
    private float m3542l(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        if (y > 0.0f) {
            return ((float) (Math.atan(x / y) / 0.017453292519943295d)) + 180.0f;
        }
        return (float) (Math.atan(x / y) / 0.017453292519943295d);
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: c */
    public void mo2122c(MotionEvent motionEvent) {
        float f;
        float f2;
        LauncherShortcutStandardInfo launcherShortcutStandardInfo;
        super.mo2122c(motionEvent);
        C3112b c3112b = (C3112b) this.f2740c;
        if (C3359a.f11083A.m2213a()) {
            if (c3112b == null || !c3112b.m3530O()) {
                C3359a.f11094h.f9606d.m4334a(c3112b);
                C3359a.f11094h.m4087a(c3112b);
                AbstractC2593d.onTempleteHide();
                if (C3359a.f11094h.m4121F() != -1) {
                    C3359a.f11094h.m4100a().m2284b();
                }
                if (c3112b.m3541A() != null && (c3112b instanceof C3231c)) {
                    C3231c c3231c = (C3231c) c3112b;
                    if (c3231c.m3541A().m3563e()) {
                        ArrayList<C3231c> m3560i = c3231c.m3541A().m3560i();
                        m3560i.remove(c3112b);
                        c3231c.rotation().f2528z = 0.0f;
                        if (m3560i.size() > 0) {
                            c3231c.m3075ah();
                            c3231c.m3057b(m3560i);
                        }
                    }
                    c3231c.m3541A().m3561g();
                }
                C3359a.f11096j.m2230a((C0975i) c3112b, true);
                C3398f.m2651a();
                this.f10097n = false;
                this.f10098o = false;
                C1017d c1017d = new C1017d();
                c1017d.m10294l(c3112b.f10107d);
                c1017d.m10293m(c3112b.f10107d);
                C1014c.m10326a(this.f2740c);
                C1014c.m10325a(this.f2740c, 500, c1017d);
                c3112b.mo3052n_();
                C3105a m3541A = c3112b.m3541A();
                if (m3541A != null) {
                    m3541A.mo2071a(c3112b);
                }
                c3112b.m3540B();
                if (motionEvent == null) {
                    this.f10097n = true;
                } else {
                    C4187w.m616a();
                }
                m3545d();
                if (motionEvent != null) {
                    C4189x.m600a(motionEvent, this.f10101r);
                    f = this.f10101r[0];
                    f2 = this.f10101r[1];
                } else {
                    f = c3112b.position().f2526x;
                    f2 = c3112b.position().f2527y;
                }
                if (motionEvent != null && (this.f2740c instanceof InterfaceC2557f) && !this.f10090g.m3539D()) {
                    InterfaceC2557f interfaceC2557f = (InterfaceC2557f) this.f2740c;
                    if (interfaceC2557f.mo3494o()) {
                        InterfaceC2557f mo3517a = interfaceC2557f.mo3517a((int) f, (int) f2);
                        if (mo3517a != null) {
                            interfaceC2557f.mo3504f(mo3517a);
                        } else {
                            interfaceC2557f.mo3493p();
                        }
                    }
                }
                m3547b(true);
                if (!c3112b.m3539D()) {
                    C3359a.f11094h.m4067b().m5331b();
                    C3359a.f11100n.m2109a((C0975i) c3112b);
                    if (C3359a.f11094h.f9606d.m4333b()) {
                        C3359a.f11102p.m5314a(c3112b, f, f2, true, 0, 1);
                    } else if (c3112b == null || c3112b.m3534K() == null || c3112b.m3534K().title == null || !c3112b.m3534K().title.equals(C4189x.m588c(C1306b.C1315i.panda))) {
                        ItemInfo m3534K = c3112b.m3534K();
                        if (!(m3534K instanceof LauncherShortcutStandardInfo) || (launcherShortcutStandardInfo = (LauncherShortcutStandardInfo) m3534K) == null || launcherShortcutStandardInfo.intent == null || launcherShortcutStandardInfo.intent.getIntExtra("action", -1) != 19) {
                            C3359a.f11102p.m5314a(c3112b, f, f2, true, 0, 2, 1);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m3547b(boolean z) {
        this.f10095l = z;
    }

    /* renamed from: a */
    public boolean m3554a() {
        return this.f10095l;
    }

    /* renamed from: a */
    public void m3551a(boolean z) {
        this.f10096m = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2119d(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r2 = 1
            r3 = 0
            super.mo2119d(r7)
            com.censivn.C3DEngine.b.f.i r0 = r6.f2740c
            com.tsf.shell.f.i.b r0 = (com.tsf.shell.p096f.p153i.C3112b) r0
            com.tsf.shell.f.f.n r1 = com.tsf.shell.manager.C3359a.f11094h
            com.tsf.shell.manager.f.a r1 = r1.m4100a()
            r1.m2280d()
            com.tsf.shell.manager.h.a r1 = com.tsf.shell.manager.C3359a.f11083A
            boolean r1 = r1.m2213a()
            if (r1 == 0) goto L22
            if (r0 == 0) goto L26
            boolean r1 = r0.m3530O()
            if (r1 == 0) goto L26
        L22:
            r0.m3529P()
        L25:
            return
        L26:
            com.tsf.shell.f.f.n r1 = com.tsf.shell.manager.C3359a.f11094h
            com.tsf.shell.f.f.c.a r1 = r1.f9606d
            r1.m4331b(r0)
            com.tsf.shell.p096f.p118e.p127g.AbstractC2593d.onTempleteShow()
            boolean r1 = r6.f10096m
            if (r1 == 0) goto L55
            r6.f10096m = r3
            r6.m3549b()
            com.tsf.shell.f.f.n r0 = com.tsf.shell.p096f.p153i.p154a.C3109c.f10085a
            r0.m4011x()
        L3e:
            r6.m3547b(r3)
            com.tsf.shell.f.e.e.c r0 = com.tsf.shell.manager.C3359a.f11102p
            r0.m5312c()
            com.tsf.shell.f.f.n r0 = com.tsf.shell.manager.C3359a.f11094h
            com.tsf.shell.f.e.e.a r0 = r0.m4067b()
            r0.m5329c()
            com.tsf.shell.manager.m.b r0 = com.tsf.shell.manager.C3359a.f11100n
            r0.m2090e()
            goto L25
        L55:
            com.tsf.shell.f.f.n r1 = com.tsf.shell.manager.C3359a.f11094h
            r1.m4055d()
            com.censivn.C3DEngine.b.f.i r1 = r6.f2740c
            boolean r1 = r1 instanceof com.tsf.shell.p096f.p118e.InterfaceC2557f
            if (r1 == 0) goto Lc6
            com.tsf.shell.f.i.b r1 = r6.f10090g
            boolean r1 = r1.m3539D()
            if (r1 != 0) goto Lc6
            com.censivn.C3DEngine.b.f.i r1 = r6.f2740c
            com.tsf.shell.f.e.f r1 = (com.tsf.shell.p096f.p118e.InterfaceC2557f) r1
            boolean r4 = r6.f10097n
            if (r4 != 0) goto L76
            com.tsf.shell.f.e.f r4 = r1.mo3495n()
            if (r4 == 0) goto Lc6
        L76:
            boolean r4 = r1.mo3494o()
            if (r4 == 0) goto Lc6
            float[] r4 = com.tsf.shell.utils.C4189x.m601a(r7)
            r5 = r4[r3]
            int r5 = (int) r5
            r4 = r4[r2]
            int r4 = (int) r4
            com.tsf.shell.f.e.f r4 = r1.mo3517a(r5, r4)
            boolean r5 = r1.mo3500h(r4)
            if (r5 == 0) goto Lbc
            com.tsf.shell.manager.f.d r2 = com.tsf.shell.manager.C3359a.f11096j
            r2.m2223b(r0)
            r1.mo3135g(r4)
            com.tsf.shell.f.i.b r1 = r6.f10090g
            r1.mo3053m_()
            com.tsf.shell.f.i.b r1 = r6.f10090g
            r1.mo3056c()
            r1 = r3
        La3:
            if (r1 == 0) goto L3e
            com.tsf.shell.manager.f.d r1 = com.tsf.shell.manager.C3359a.f11096j
            r1.m2223b(r0)
            com.tsf.shell.f.f.n r1 = com.tsf.shell.manager.C3359a.f11094h
            com.tsf.shell.f.f.g r1 = r1.m4031n()
            if (r1 == 0) goto Lb8
            r0.removeFromParent()
            r1.m4229a(r0)
        Lb8:
            r6.m3549b()
            goto L3e
        Lbc:
            com.tsf.shell.manager.f.d r4 = com.tsf.shell.manager.C3359a.f11096j
            r4.m2223b(r0)
            r1.mo3493p()
            r1 = r2
            goto La3
        Lc6:
            r1 = r2
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.p096f.p153i.p154a.C3109c.mo2119d(android.view.MotionEvent):void");
    }

    /* renamed from: b */
    public void m3549b() {
        if (C3359a.f11094h.f9606d.m4333b()) {
            m3550a(C3359a.f11094h.f9606d.m4340a(), true);
        } else {
            m3546c();
        }
    }

    /* renamed from: c */
    public void m3546c() {
        m3550a((float[]) null, false);
    }

    /* renamed from: a */
    public void m3550a(float[] fArr, boolean z) {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.i.a.c.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3109c.this.f10090g.mo3056c();
            }
        };
        if (fArr == null) {
            fArr = C3613a.m1891a(this.f10090g, this.f10090g.position().f2526x, this.f10090g.position().f2527y);
        }
        if (fArr[0] != this.f10090g.position().f2526x || fArr[1] != this.f10090g.position().f2527y) {
            c1017d.mo10301f(fArr[0]);
            c1017d.mo10298h(fArr[1]);
            if (this.f10090g.m3522Y()) {
                C2656s.m5048a(fArr[0] - this.f10090g.position().f2526x, fArr[1] - this.f10090g.position().f2527y);
            }
        }
        if (z) {
            c1017d.m10303e(0.0f);
        }
        c1017d.m10294l(1.0f);
        c1017d.m10293m(1.0f);
        c1017d.m10313a(C0986a.f2946a);
        C1014c.m10326a(this.f2740c);
        C1014c.m10325a(this.f10090g, 380, c1017d);
        this.f10090g.mo3053m_();
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        super.mo2129a(motionEvent, motionEvent2);
        if (this.f10095l) {
            if (this.f10090g.m3539D()) {
                C2448a.m5537a((int) (this.f10086b + (motionEvent2.getX() - motionEvent.getX())), (int) (this.f10087d - (motionEvent2.getY() - motionEvent.getY())));
            } else if (this.f10097n) {
                this.f2740c.position().f2526x = (int) (this.f10086b + (motionEvent2.getX() - motionEvent.getX()));
                this.f2740c.position().f2527y = (int) (this.f10087d - (motionEvent2.getY() - motionEvent.getY()));
                float[] m600a = C4189x.m600a(motionEvent2, this.f10101r);
                C3359a.f11102p.m5316a(m600a[0], m600a[1]);
            } else if (C4189x.m594b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                this.f10097n = true;
                this.f10090g.mo3077ab();
            }
            if (motionEvent2.getPointerCount() == 2) {
                if (this.f10090g.m3532M()) {
                    if (!this.f10098o) {
                        this.f10098o = true;
                        this.f10090g.mo3078aa();
                        C3359a.f11102p.m5312c();
                    }
                    float m3542l = m3542l(motionEvent2);
                    this.f10090g.rotation().f2528z = this.f10094k - (this.f10093j - m3542l);
                }
            } else if (this.f10096m) {
                f10085a.m4099a(motionEvent2.getX(), motionEvent2.getY(), this.f10091h, this.f10092i);
            } else if (this.f10097n && (this.f2740c instanceof InterfaceC2557f)) {
                this.f10100q.m2292a((InterfaceC2557f) this.f2740c, motionEvent2);
            }
        } else if (this.f10099p != null && this.f10090g.m3528Q()) {
            this.f10099p.mo2129a(motionEvent, motionEvent2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1654e(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r1 = 0
            r4 = 1
            r2 = 0
            super.mo1654e(r6)
            r5.f10088e = r2
            float r0 = r6.getX()
            r5.f10091h = r0
            float r0 = r6.getY()
            r5.f10092i = r0
            com.tsf.shell.f.i.b r0 = r5.f10090g
            boolean r0 = r0 instanceof com.tsf.shell.p096f.p153i.C3231c
            if (r0 == 0) goto L5a
            com.tsf.shell.f.i.b r0 = r5.f10090g
            com.tsf.shell.f.i.c r0 = (com.tsf.shell.p096f.p153i.C3231c) r0
            com.tsf.shell.f.i.a r3 = r0.m3541A()
            if (r3 == 0) goto L5a
            com.tsf.shell.f.i.a r0 = r0.m3541A()
            boolean r0 = r0.m3563e()
        L2c:
            if (r0 != 0) goto L58
            float[] r0 = com.tsf.shell.utils.C4189x.m601a(r6)
            com.censivn.C3DEngine.b.f.i r3 = r5.f2740c
            r2 = r0[r2]
            r0 = r0[r4]
            com.censivn.C3DEngine.b.f.i r0 = r3.getHittingTarget(r2, r0, r4)
        L3c:
            if (r0 == 0) goto L55
            com.censivn.C3DEngine.b.d.a r0 = r0.getMouseEventListener()
            r5.f10099p = r0
            com.censivn.C3DEngine.b.d.a r0 = r5.f10099p
            r0.mo1654e(r6)
        L49:
            com.tsf.shell.f.i.b r0 = r5.f10090g
            boolean r0 = r0.m3527R()
            if (r0 != 0) goto L54
            com.tsf.shell.manager.action.C3398f.m2644a(r6)
        L54:
            return
        L55:
            r5.f10099p = r1
            goto L49
        L58:
            r0 = r1
            goto L3c
        L5a:
            r0 = r2
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.p096f.p153i.p154a.C3109c.mo1654e(android.view.MotionEvent):void");
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: i */
    public void mo3544i(MotionEvent motionEvent) {
        if (!this.f10090g.m3528Q()) {
            C3359a.f11094h.m4021s().m3914b(motionEvent);
        }
        if (this.f10099p != null) {
            this.f10099p.mo3544i(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: j */
    public void mo3543j(MotionEvent motionEvent) {
        if (!this.f10090g.m3528Q()) {
            C3359a.f11094h.m4021s().m3904c(motionEvent);
        }
        this.f10093j = m3542l(motionEvent);
        this.f10094k = this.f2740c.rotation().f2528z;
        if (this.f10099p != null) {
            this.f10099p.mo3543j(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo502a(MotionEvent motionEvent) {
        if (this.f10090g instanceof C3231c) {
            C3231c c3231c = (C3231c) this.f10090g;
            if (c3231c.m3541A() != null && c3231c.m3541A().m3563e()) {
                c3231c.m3067ap();
                return;
            }
        }
        if (this.f10090g instanceof AbstractC3208b) {
            ((AbstractC3208b) this.f10090g).mo3094l();
        }
        if (this.f10099p != null) {
            this.f10099p.mo502a(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: b */
    public void mo3548b(MotionEvent motionEvent) {
        if (this.f10099p != null) {
            this.f10099p.mo3548b(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: g */
    public void mo3208g(MotionEvent motionEvent) {
        if (this.f10099p != null) {
            this.f10099p.mo3208g(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: a */
    public void mo527a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f10090g.f10106c) {
            if (!this.f10090g.m3528Q()) {
                C3359a.f11094h.m4021s().m3896d(motionEvent, motionEvent2, f, f2);
                boolean m3888f = C3359a.f11094h.m4021s().m3888f();
                this.f10088e = C3359a.f11094h.m4021s().m3884g();
                if (m3888f && !this.f10088e && this.f10099p != null) {
                    this.f10099p.mo527a(motionEvent, motionEvent2, f, f2);
                }
            } else if (this.f10099p != null) {
                this.f10099p.mo527a(motionEvent, motionEvent2, f, f2);
            }
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: f */
    public void mo1653f(MotionEvent motionEvent) {
        if (this.f10099p != null) {
            this.f10099p.mo1653f(motionEvent);
        }
        if (!this.f10090g.f10106c && !this.f10090g.m3528Q()) {
            C3359a.f11094h.m4021s().m3897d(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
    /* renamed from: b */
    public void mo3209b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f10090g.f10106c && !this.f10090g.m3528Q()) {
            C3359a.f11094h.m4021s().m3930a(motionEvent, motionEvent2, f, f2);
        }
        if (this.f10099p != null && !this.f10088e) {
            this.f10099p.mo3209b(motionEvent, motionEvent2, f, f2);
        }
    }
}
