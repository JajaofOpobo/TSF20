package com.tsf.shell.p096f.p131f.p132a.p137c.p138a;

import android.os.AsyncTask;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p046h.p050d.C1052b;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p131f.p132a.C2814d;
import com.tsf.shell.p096f.p131f.p132a.p137c.C2798j;
import com.tsf.shell.p096f.p131f.p132a.p137c.C2799k;
import com.tsf.shell.plugin.classification.C3777d;
/* renamed from: com.tsf.shell.f.f.a.c.a.a */
/* loaded from: classes.dex */
public class C2757a extends C2765b {

    /* renamed from: b */
    private C1052b f9028b;

    /* renamed from: c */
    private C0962a f9029c;

    /* renamed from: d */
    private boolean f9030d;

    /* renamed from: e */
    private float f9031e;

    /* renamed from: f */
    private float f9032f;

    /* renamed from: g */
    private boolean f9033g;

    /* renamed from: h */
    private C2814d.C2815a f9034h;

    /* renamed from: i */
    private AsyncTask f9035i;

    /* renamed from: a */
    public void m4758a() {
        if (this.f9035i != null) {
            this.f9035i.cancel(true);
            this.f9035i = null;
        }
        if (this.f9030d) {
            m4752a((C3777d.C3778a) null);
        }
    }

    public C2757a(C2799k.C2809a c2809a) {
        super(c2809a);
        this.f9030d = false;
        this.f9031e = 360.0f;
        this.f9032f = 0.0f;
        this.f9033g = false;
        this.f9034h = new C2814d.C2815a() { // from class: com.tsf.shell.f.f.a.c.a.a.1
            @Override // com.tsf.shell.p096f.p131f.p132a.C2814d.C2815a, com.tsf.shell.plugin.classification.C3777d.InterfaceC3781d
            /* renamed from: a */
            public void mo1510a(final C3777d.C3778a c3778a) {
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.f.a.c.a.a.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2757a.this.m4752a(c3778a);
                    }
                });
            }

            @Override // com.tsf.shell.p096f.p131f.p132a.C2814d.C2815a, com.tsf.shell.plugin.classification.C3777d.InterfaceC3781d
            /* renamed from: a */
            public void mo1511a() {
                if (C2757a.this.f9030d) {
                    C2757a.this.m4752a((C3777d.C3778a) null);
                }
            }
        };
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.p138a.C2765b
    /* renamed from: a */
    public C0980j mo4741a(TextureElement textureElement) {
        C0980j c0980j = new C0980j();
        C0962a m4637a = C2798j.m4637a();
        this.f9029c = m4637a;
        m4637a.removeFromParent();
        m4637a.textures().addElement(textureElement);
        c0980j.addChild(m4637a);
        this.f9028b = new C1052b(C0892a.m10742a(140.0f), C1306b.C1310d.ring) { // from class: com.tsf.shell.f.f.a.c.a.a.2
            @Override // com.censivn.C3DEngine.p031b.p046h.p050d.C1052b, com.censivn.C3DEngine.p031b.p038f.p039a.C0962a, com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                m10097f();
                if (C2757a.this.f9030d) {
                    C2757a.this.f9032f += (C2757a.this.f9031e - C2757a.this.f9032f) * 0.12f;
                    if (C2757a.this.f9031e != 360.0f) {
                        if (C2757a.this.f9031e == 25.0f) {
                            rotation().f2528z += 3.0f;
                            if (Math.abs(C2757a.this.f9032f - C2757a.this.f9031e) < 1.0f) {
                                C2757a.this.f9032f = C2757a.this.f9031e;
                                C2757a.this.f9031e = 360.0f;
                                rotation().f2527y = 0.0f;
                                rotation().f2528z = 360.0f - rotation().f2528z;
                            }
                        }
                    } else {
                        rotation().f2528z -= 3.0f;
                        if (Math.abs(C2757a.this.f9032f - C2757a.this.f9031e) < 1.0f) {
                            C2757a.this.f9032f = C2757a.this.f9031e;
                            C2757a.this.f9031e = 25.0f;
                            rotation().f2528z = 360.0f - rotation().f2528z;
                            rotation().f2527y = 180.0f;
                        }
                    }
                    m10103b(C2757a.this.f9032f);
                    return;
                }
                super.onDrawStart();
            }
        };
        this.f9028b.doubleSidedEnabled(true);
        this.f9028b.m10109a(0.0f);
        this.f9028b.visible(false);
        this.f9028b.position().f2527y = m4637a.m10456a(0).f2853m.f2527y;
        c0980j.addChild(this.f9028b);
        return c0980j;
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.p138a.C2765b
    /* renamed from: b */
    public boolean mo4739b() {
        return !this.f9030d;
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.p138a.C2765b
    /* renamed from: c */
    public void mo4736c() {
        m4743l();
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.p138a.C2765b
    /* renamed from: d */
    public void mo4734d() {
        m4758a();
    }

    /* renamed from: l */
    private void m4743l() {
        this.f9030d = true;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.c.a.a.3
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2757a.this.f9028b.visible(true);
                C2757a.this.f9031e = 360.0f;
                C2757a.this.f9032f = 0.0f;
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.f.a.c.a.a.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2757a.this.f9035i = C3359a.f11094h.m4019t().m4454am().m4605a(C2757a.this.f9034h);
                    }
                });
            }
        };
        c1017d.m10294l(0.6f);
        c1017d.m10293m(0.6f);
        C1014c.m10326a(this.f9029c.m10456a(0));
        C1014c.m10325a(this.f9029c.m10456a(0), 250, c1017d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4752a(final C3777d.C3778a c3778a) {
        this.f9028b.m10107a(0.0f, 250, new Runnable() { // from class: com.tsf.shell.f.f.a.c.a.a.4
            @Override // java.lang.Runnable
            public void run() {
                C2757a.this.f9028b.visible(false);
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.c.a.a.4.1
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        if (C2757a.this.f9035i != null && c3778a != null) {
                            C3359a.f11094h.m4019t().m4454am().m4604a(c3778a);
                            C2757a.this.f9033g = true;
                        }
                        C2757a.this.f9030d = false;
                        C2757a.this.f9035i = null;
                    }
                };
                c1017d.m10294l(1.0f);
                c1017d.m10293m(1.0f);
                C1014c.m10326a(C2757a.this.f9029c.m10456a(0));
                C1014c.m10325a(C2757a.this.f9029c.m10456a(0), 250, c1017d);
                C2757a.this.f9028b.rotation().f2527y = 0.0f;
                C2757a.this.f9028b.rotation().f2528z = 0.0f;
            }
        });
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.p138a.C2765b
    /* renamed from: e */
    public void mo4733e() {
        this.f9033g = false;
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.p138a.C2765b
    /* renamed from: f */
    public void mo4732f() {
        super.mo4732f();
        this.f9028b.m10102c();
    }
}
