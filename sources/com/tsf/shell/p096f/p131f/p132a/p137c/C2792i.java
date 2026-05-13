package com.tsf.shell.p096f.p131f.p132a.p137c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p182n.C3550a;
import com.tsf.shell.p096f.p131f.p132a.C2843f;
import com.tsf.shell.p096f.p131f.p132a.C2862h;
import com.tsf.shell.p096f.p153i.C3231c;
/* renamed from: com.tsf.shell.f.f.a.c.i */
/* loaded from: classes.dex */
public class C2792i extends C0980j {

    /* renamed from: a */
    protected C2862h f9128a;

    /* renamed from: b */
    protected C2843f f9129b;

    /* renamed from: c */
    protected int f9130c;

    /* renamed from: d */
    protected String f9131d;

    /* renamed from: e */
    protected C0962a f9132e;

    /* renamed from: f */
    protected C3550a.C3558a f9133f;

    /* renamed from: g */
    private TextureElement f9134g = new TextureElement(0, false);

    /* renamed from: h */
    private boolean f9135h = false;

    /* renamed from: i */
    private boolean f9136i = false;

    /* renamed from: j */
    private Runnable f9137j;

    public C2792i(C2862h c2862h, C2843f c2843f, int i, String str) {
        this.f9130c = 0;
        this.f9129b = c2843f;
        this.f9128a = c2862h;
        this.f9130c = i;
        this.f9131d = str;
        position().f2527y = (-C2843f.f9233a) / 2.0f;
        alpha(0.0f);
        m4648e();
    }

    /* renamed from: e */
    public C0962a m4648e() {
        if (this.f9132e == null) {
            this.f9132e = C2798j.m4637a();
            this.f9132e.textures().addElement(this.f9134g);
            C0937a c0937a = new C0937a(this.f9132e) { // from class: com.tsf.shell.f.f.a.c.i.1
                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo502a(MotionEvent motionEvent) {
                    if (C2792i.this.f9135h) {
                        if (C2792i.this.f9137j != null) {
                            C2792i.this.f9137j.run();
                        }
                    } else if (!C2792i.this.f9129b.m4552a(C2792i.this)) {
                        C2792i.this.f9129b.m4526m();
                    }
                }
            };
            this.f9132e.calAABB();
            this.f9132e.m10448a(true);
            this.f9132e.setMouseEventListener(c0937a);
        }
        return this.f9132e;
    }

    /* renamed from: f */
    public void m4646f() {
        this.f9132e.m10456a(1).m10435a((Boolean) true);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.c.i.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
            }
        };
        c1017d.m10294l(1.0f);
        c1017d.m10293m(1.0f);
        C1014c.m10326a(this.f9132e.m10456a(1));
        C1014c.m10325a(this.f9132e.m10456a(1), 500, c1017d);
    }

    /* renamed from: g */
    public void m4645g() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.c.i.3
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2792i.this.f9132e.m10456a(1).m10435a((Boolean) false);
            }
        };
        c1017d.m10294l(0.0f);
        c1017d.m10293m(0.0f);
        C1014c.m10326a(this.f9132e.m10456a(1));
        C1014c.m10325a(this.f9132e.m10456a(1), 500, c1017d);
    }

    /* renamed from: c */
    public void m4650c(boolean z) {
        this.f9136i = false;
        if (mo4656a(z)) {
            this.f9133f = C3359a.f11103q.m2043a(this.f9133f, this.f9131d);
        }
        mo4611b(z);
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.c.i.4
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2792i.this.f9136i = true;
                C2792i.this.m4639m();
            }
        };
        c1017d.mo10298h(C2843f.f9233a / 2.0f);
        c1017d.m10314a(255);
        C1014c.m10326a(this);
        C1014c.m10325a(this, 500, c1017d);
        removeFromParent();
        this.f9129b.m4531h().addChild(this);
    }

    /* renamed from: c */
    private void m4652c() {
        if (this.f9134g.f2529id == 0) {
            C2798j.m4636a(this.f9134g, this.f9130c, this.f9131d);
        }
    }

    /* renamed from: a */
    public boolean mo4656a(boolean z) {
        return true;
    }

    /* renamed from: h */
    public void m4644h() {
    }

    /* renamed from: i */
    public void m4643i() {
        this.f9136i = false;
        C3359a.f11103q.m2037b(this.f9133f);
        mo4617a();
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.c.i.5
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2792i.this.removeFromParent();
                C2792i.this.mo4613b();
            }
        };
        c1017d.m10314a(0);
        c1017d.mo10298h((-C2843f.f9233a) / 2.0f);
        C1014c.m10326a(this);
        C1014c.m10325a(this, 500, c1017d);
    }

    /* renamed from: j */
    public void m4642j() {
        if (this.f9132e != null) {
            C1017d c1017d = new C1017d();
            c1017d.m10314a(VEasing.Back.easeIn);
            C1014c.m10326a(this.f9132e);
            C1014c.m10325a(this.f9132e, 150, c1017d);
        }
    }

    /* renamed from: k */
    public void m4641k() {
        if (this.f9132e != null) {
            C1017d c1017d = new C1017d();
            c1017d.m10314a(50);
            C1014c.m10326a(this.f9132e);
            C1014c.m10325a(this.f9132e, 150, c1017d);
        }
    }

    /* renamed from: l */
    public boolean m4640l() {
        return true;
    }

    /* renamed from: a */
    public void mo4616a(int i, int i2, int i3, int i4) {
    }

    /* renamed from: b */
    public void mo4611b(boolean z) {
    }

    /* renamed from: a */
    public void mo4617a() {
    }

    /* renamed from: m */
    public void m4639m() {
    }

    /* renamed from: b */
    public void mo4613b() {
    }

    /* renamed from: n */
    public void mo4633n() {
        m4652c();
    }

    /* renamed from: o */
    public void m4638o() {
    }

    /* renamed from: p */
    public void mo4632p() {
    }

    /* renamed from: a */
    public void mo4659a(C3231c c3231c, MotionEvent motionEvent) {
    }

    /* renamed from: b */
    public void mo4654b(C3231c c3231c, MotionEvent motionEvent) {
    }

    /* renamed from: c */
    public void mo4651c(C3231c c3231c, MotionEvent motionEvent) {
    }

    /* renamed from: d */
    public void mo4649d(C3231c c3231c, MotionEvent motionEvent) {
    }

    /* renamed from: a */
    public void mo4658a(C3231c c3231c, MotionEvent motionEvent, MotionEvent motionEvent2) {
    }

    /* renamed from: a */
    public void mo4657a(C3231c c3231c, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    /* renamed from: b */
    public void mo4653b(C3231c c3231c, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    /* renamed from: e */
    public void mo4647e(C3231c c3231c, MotionEvent motionEvent) {
    }
}
