package com.tsf.shell.p096f.p118e.p125e;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p118e.InterfaceC2557f;
import com.tsf.shell.utils.C4187w;
/* renamed from: com.tsf.shell.f.e.e.a */
/* loaded from: classes.dex */
public class C2530a extends C0980j {

    /* renamed from: b */
    private C2533a f8398b;

    /* renamed from: c */
    private RunnableC2534b f8399c;

    /* renamed from: d */
    private boolean f8400d = false;

    /* renamed from: a */
    private C2533a f8397a = new C2533a(C0892a.m10742a(20.0f), C0892a.f2554E, 0);

    public C2530a() {
        this.f8397a.setDefaultColor(new Color4(255, 255, 255, 100));
        this.f8397a.alpha(0.0f);
        this.f8398b = new C2533a(C0892a.m10742a(20.0f), C0892a.f2554E, 1);
        this.f8398b.setDefaultColor(new Color4(255, 255, 255, 100));
        this.f8398b.alpha(0.0f);
        addChild(this.f8397a);
        addChild(this.f8398b);
        this.f8399c = new RunnableC2534b() { // from class: com.tsf.shell.f.e.e.a.1
            @Override // com.tsf.shell.p096f.p118e.p125e.C2530a.RunnableC2534b, java.lang.Runnable
            public void run() {
                C2530a.this.mo4004a(this.f8406c, this.f8405b);
            }
        };
    }

    /* renamed from: a */
    public void mo4004a(int i, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m5327d() {
        visible(true);
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        C1014c.m10326a(this.f8397a);
        C1014c.m10325a(this.f8397a, 250, c1017d);
        C1017d c1017d2 = new C1017d();
        c1017d2.m10314a(255);
        C1014c.m10326a(this.f8398b);
        C1014c.m10325a(this.f8398b, 250, c1017d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m5325e() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.e.a.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2530a.this.visible(false);
                if (!C2530a.this.f8400d) {
                    C3359a.f11096j.m2223b(C2530a.this);
                }
            }
        };
        c1017d.m10314a(0);
        C1014c.m10326a(this.f8397a);
        C1014c.m10325a(this.f8397a, 250, c1017d);
        C1017d c1017d2 = new C1017d();
        c1017d2.m10314a(0);
        C1014c.m10326a(this.f8398b);
        C1014c.m10325a(this.f8398b, 250, c1017d2);
    }

    /* renamed from: a */
    public float mo4005a() {
        return 0.0f;
    }

    /* renamed from: b */
    public void m5331b() {
        if (!this.f8400d) {
            this.f8400d = true;
            removeFromParent();
            float mo4005a = C0892a.f2552C + mo4005a();
            this.f8397a.points().setYPX(0, mo4005a);
            this.f8397a.points().setYPX(1, mo4005a);
            this.f8398b.points().setYPX(0, mo4005a);
            this.f8398b.points().setYPX(1, mo4005a);
            this.f8397a.points().setYPX(2, C0892a.f2551B);
            this.f8397a.points().setYPX(3, C0892a.f2551B);
            this.f8398b.points().setYPX(2, C0892a.f2551B);
            this.f8398b.points().setYPX(3, C0892a.f2551B);
            this.f8397a.updatePointsVBO();
            this.f8398b.updatePointsVBO();
            this.f8397a.calAABB(6.0f, 1.0f, 1.0f);
            this.f8398b.calAABB(6.0f, 1.0f, 1.0f);
            C3359a.f11096j.m2232a(this);
            C3359a.f11097k.m2295b(this.f8397a);
            C3359a.f11097k.m2295b(this.f8398b);
            this.f8397a.position().f2526x = C0892a.f2590z;
            this.f8398b.position().f2526x = C0892a.f2550A;
        }
    }

    /* renamed from: a */
    public void m5333a(int i) {
        C0853a.m10865a().m10584b(this.f8399c, i);
    }

    /* renamed from: c */
    public void m5329c() {
        if (this.f8400d) {
            this.f8400d = false;
            m5325e();
            C3359a.f11097k.m2294c(this.f8397a);
            C3359a.f11097k.m2294c(this.f8398b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.e.e.a$a */
    /* loaded from: classes.dex */
    public class C2533a extends C2555e {

        /* renamed from: a */
        public int f8403a;

        public C2533a(float f, float f2, int i) {
            super(f, f2, false);
            this.f8403a = i;
        }

        @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
        /* renamed from: a */
        public void mo2062a(InterfaceC2557f interfaceC2557f) {
            C4187w.m616a();
            C2530a.this.f8399c.f8405b = interfaceC2557f;
            C2530a.this.f8399c.f8406c = this.f8403a;
            C0853a.m10865a().m10584b(C2530a.this.f8399c, 400L);
            C2530a.this.m5327d();
        }

        @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
        /* renamed from: b */
        public boolean mo2057b(InterfaceC2557f interfaceC2557f) {
            return false;
        }

        @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
        /* renamed from: e */
        public void mo3139e(InterfaceC2557f interfaceC2557f) {
            C0853a.m10865a().m10578g(C2530a.this.f8399c);
            C2530a.this.f8399c.f8405b = null;
            C2530a.this.m5325e();
        }

        @Override // com.tsf.shell.p096f.p118e.p125e.C2555e, com.tsf.shell.p096f.p118e.InterfaceC2557f
        /* renamed from: d */
        public void mo3140d(InterfaceC2557f interfaceC2557f) {
            C0853a.m10865a().m10578g(C2530a.this.f8399c);
            C2530a.this.f8399c.f8405b = null;
            C2530a.this.m5325e();
        }
    }

    /* renamed from: com.tsf.shell.f.e.e.a$b */
    /* loaded from: classes.dex */
    class RunnableC2534b implements Runnable {

        /* renamed from: b */
        Object f8405b;

        /* renamed from: c */
        int f8406c;

        RunnableC2534b() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }
}
