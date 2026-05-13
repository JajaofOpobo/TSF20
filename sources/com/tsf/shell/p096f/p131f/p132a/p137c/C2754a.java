package com.tsf.shell.p096f.p131f.p132a.p137c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p118e.InterfaceC2557f;
import com.tsf.shell.p096f.p131f.p132a.C2843f;
import com.tsf.shell.p096f.p131f.p132a.C2862h;
import com.tsf.shell.p096f.p131f.p132a.p137c.C2775c;
import com.tsf.shell.p096f.p153i.C3231c;
import com.tsf.shell.p096f.p153i.p154a.C3109c;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
/* renamed from: com.tsf.shell.f.f.a.c.a */
/* loaded from: classes.dex */
public class C2754a extends C2775c.C2778a {

    /* renamed from: a */
    private C2862h f9019a;

    /* renamed from: b */
    private C2843f f9020b;

    /* renamed from: c */
    private C2775c f9021c;

    /* renamed from: d */
    private C2789g f9022d;

    /* renamed from: e */
    private C3231c f9023e;

    /* renamed from: f */
    private C3109c f9024f;

    /* renamed from: g */
    private C0937a f9025g;

    public C2754a(C2775c c2775c, C2843f c2843f, C2862h c2862h) {
        this.f9021c = c2775c;
        this.f9019a = c2862h;
        this.f9020b = c2843f;
        m4759e();
    }

    /* renamed from: e */
    private void m4759e() {
        this.f9025g = new C0937a(null) { // from class: com.tsf.shell.f.f.a.c.a.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo2129a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                C2754a.this.f9024f.mo2129a(motionEvent, motionEvent2);
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: d */
            public void mo2119d(MotionEvent motionEvent) {
                C2754a.this.f9024f.mo2119d(motionEvent);
                C2754a.this.f9019a.m4456ak();
                C2754a.this.f9019a.m4451ap().m4955q();
            }
        };
        this.f9022d = new C2789g() { // from class: com.tsf.shell.f.f.a.c.a.2
            @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2789g
            /* renamed from: b */
            public void mo4665b() {
                if (C2754a.this.f9021c.m4691c() != null) {
                    C2754a.this.m4763a(C2754a.this.f9021c.m4691c());
                }
            }

            @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2791h, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: a */
            public void mo2062a(InterfaceC2557f interfaceC2557f) {
                C2754a.this.m4763a((C3231c) interfaceC2557f);
            }

            @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2791h, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: b */
            public boolean mo2057b(InterfaceC2557f interfaceC2557f) {
                return false;
            }

            @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2791h, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: e */
            public void mo3139e(InterfaceC2557f interfaceC2557f) {
            }

            @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2791h, com.tsf.shell.p096f.p118e.InterfaceC2557f
            /* renamed from: d */
            public void mo3140d(InterfaceC2557f interfaceC2557f) {
            }
        };
        this.f9022d.position().f2527y = (C2862h.f9293F - C2843f.f9233a) / 2.0f;
        addChild(this.f9022d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4763a(C3231c c3231c) {
        C3231c c3231c2;
        this.f9022d.m4664c();
        if (c3231c instanceof C3222g) {
            c3231c2 = (C3222g) c3231c;
            this.f9023e = ((C3222g) c3231c).m3109ba();
        } else if (c3231c instanceof C3145b) {
            c3231c2 = (C3145b) c3231c;
            this.f9023e = ((C3145b) c3231c).m3355az();
        } else {
            c3231c2 = null;
        }
        this.f9021c.m4692b(c3231c2);
        this.f9024f = (C3109c) this.f9023e.getMouseEventListener();
        this.f9023e.m3075ah();
        this.f9024f.mo2122c(null);
        this.f9021c.m4695a(this.f9023e);
        C3359a.f11094h.m4061b(this.f9023e);
        this.f9021c.m4704a(this.f9025g);
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2775c.C2778a
    /* renamed from: a */
    public void mo4681a() {
        C3359a.f11097k.m2295b(this.f9022d);
        this.f9022d.m4663d();
    }

    /* renamed from: b */
    public void m4762b() {
        this.f9022d.m4662e();
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2775c.C2778a
    /* renamed from: c */
    public void mo4680c() {
        C3359a.f11097k.m2294c(this.f9022d);
        this.f9021c.m4704a((C0937a) null);
        m4762b();
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2775c.C2778a
    /* renamed from: d */
    public void mo4679d() {
    }
}
