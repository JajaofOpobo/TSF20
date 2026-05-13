package com.tsf.shell.p096f.p131f.p132a.p137c;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p044c.p045a.C1016a;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p185p.C3595e;
import com.tsf.shell.p096f.p118e.C2636k;
import com.tsf.shell.p096f.p131f.p132a.C2843f;
import com.tsf.shell.p096f.p131f.p132a.C2862h;
import com.tsf.shell.p096f.p131f.p132a.p137c.p138a.C2757a;
import com.tsf.shell.p096f.p131f.p132a.p137c.p138a.C2765b;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.f.a.c.k */
/* loaded from: classes.dex */
public class C2799k extends C2792i {

    /* renamed from: l */
    private static C2636k f9144l;

    /* renamed from: g */
    private ArrayList<C2765b> f9145g;

    /* renamed from: h */
    private C0980j f9146h;

    /* renamed from: i */
    private float f9147i;

    /* renamed from: j */
    private float f9148j;

    /* renamed from: k */
    private C2757a f9149k;

    /* renamed from: com.tsf.shell.f.f.a.c.k$a */
    /* loaded from: classes.dex */
    public static class C2809a {

        /* renamed from: b */
        public String f9160b;

        /* renamed from: c */
        public int f9161c;

        public C2809a(int i, String str) {
            this.f9161c = i;
            this.f9160b = str;
        }

        /* renamed from: a */
        public void mo4631a() {
        }
    }

    public C2799k(C2862h c2862h, C2843f c2843f) {
        super(c2862h, c2843f, 0, C4189x.m588c(C1306b.C1315i.text_more));
        this.f9145g = new ArrayList<>();
        C2757a c2757a = new C2757a(new C2809a(C1306b.C1310d.drawer_classification, C4189x.m588c(C1306b.C1315i.text_classify)));
        this.f9149k = c2757a;
        this.f9149k.m4742a(C3595e.f11925j);
        this.f9145g.add(c2757a);
        this.f9145g.add(new C2765b(new C2809a(C1306b.C1310d.drawer_preferences, C4189x.m588c(C1306b.C1315i.text_preferences)) { // from class: com.tsf.shell.f.f.a.c.k.1
            @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2799k.C2809a
            /* renamed from: a */
            public void mo4631a() {
                C3359a.f11084B.m806d().m10506d();
            }
        }));
        this.f9145g.add(new C2765b(new C2809a(C1306b.C1310d.drawer_clean, C4189x.m588c(C1306b.C1315i.text_clean)) { // from class: com.tsf.shell.f.f.a.c.k.2
            @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2799k.C2809a
            /* renamed from: a */
            public void mo4631a() {
                C2244e.m6020a(C1306b.C1315i.mn_next_version_release);
            }
        }));
        this.f9145g.add(new C2765b(new C2809a(C1306b.C1310d.drawer_more_manager, C4189x.m588c(C1306b.C1315i.menu_manage_apps)) { // from class: com.tsf.shell.f.f.a.c.k.3
            @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2799k.C2809a
            /* renamed from: a */
            public void mo4631a() {
                Home.m6177b().m6163m();
            }
        }));
        this.f9145g.add(new C2765b(new C2809a(C1306b.C1310d.drawer_more_reset, C4189x.m588c(C1306b.C1315i.text_reset)) { // from class: com.tsf.shell.f.f.a.c.k.4
            @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2799k.C2809a
            /* renamed from: a */
            public void mo4631a() {
                C3359a.f11094h.m4019t().m4454am().m4601c();
            }
        }));
        this.f9146h = new C0980j();
        this.f9146h.position().f2527y = C0892a.m10742a(20.0f);
        this.f9147i = C0892a.m10735b(12.0f) + C2765b.f9045a;
        this.f9148j = ((-this.f9147i) * 2.0f) / 2.0f;
        float f = this.f9148j;
        for (int i = 0; i < this.f9145g.size(); i++) {
            C2765b c2765b = this.f9145g.get(i);
            c2765b.position().f2526x = f;
            if (i > 2) {
                c2765b.visible(false);
                c2765b.alpha(0.0f);
            } else if (i < 2) {
                f += this.f9147i;
            }
            this.f9146h.addChild(c2765b);
        }
        m4648e().addChild(this.f9146h);
        C3595e.C3597a m1929a = C3359a.f11087a.m1929a(C3595e.f11924i);
        if (m1929a.m1919a()) {
            f9144l = new C2636k();
            m1929a.m1918a(new C3595e.C3597a.C3598a() { // from class: com.tsf.shell.f.f.a.c.k.5
                @Override // com.tsf.shell.manager.p185p.C3595e.C3597a.C3598a
                /* renamed from: a */
                public void mo720a() {
                    C2799k.f9144l.removeFromParent();
                    C2799k.f9144l.m5101a();
                }
            });
            f9144l = new C2636k();
            f9144l.position().f2527y = C0892a.m10742a(54.0f);
            f9144l.position().f2526x = C0892a.m10742a(70.0f);
            m4648e().addChild(f9144l);
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: n */
    public void mo4633n() {
        super.mo4633n();
        C2765b.m4728j();
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: p */
    public void mo4632p() {
        C2765b.m4727k();
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: b */
    public void mo4611b(boolean z) {
        Number3d.TEMPNUMBER3D.reset();
        this.f9146h.localToGlobal(Number3d.TEMPNUMBER3D);
        this.f9129b.m4531h().globalToLocal(Number3d.TEMPNUMBER3D);
        float m10742a = C0892a.m10742a(200.0f);
        float f = Number3d.TEMPNUMBER3D.f2526x;
        float f2 = Number3d.TEMPNUMBER3D.f2527y;
        float f3 = C2843f.f9235c;
        int numChildren = this.f9146h.numChildren();
        float m10742a2 = C0892a.m10742a(20.0f);
        int i = 0;
        float f4 = f3;
        while (i < numChildren) {
            C2765b c2765b = this.f9145g.get(i);
            c2765b.removeFromParent();
            this.f9129b.m4531h().addChild(c2765b);
            c2765b.position().setAll(c2765b.position().f2526x + f, c2765b.position().f2527y + f2, 0.0f);
            c2765b.m4738b((i * 20) + 250);
            if (i < 3) {
                C1016a c1016a = new C1016a(c2765b, (i / 3) + 2, m10742a) { // from class: com.tsf.shell.f.f.a.c.k.6
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                    }
                };
                c1016a.m10316b(i % 2 == 0);
                c1016a.mo10301f(f4);
                c1016a.mo10298h(m10742a2);
                c1016a.m10314a(255);
                C1014c.m10326a(c2765b);
                C1014c.m10325a(c2765b, (i * 50) + 600, c1016a);
            } else {
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.c.k.7
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                    }
                };
                c1017d.mo10301f(f4);
                c1017d.mo10298h(m10742a2);
                c1017d.m10314a(255);
                C1014c.m10326a(c2765b);
                C1014c.m10325a(c2765b, (i * 50) + 600, c1017d);
            }
            c2765b.visible(true);
            i++;
            f4 += C2843f.f9236d;
        }
        this.f9129b.m4535e();
    }

    /* renamed from: c */
    public void m4635c() {
        if (this.f9149k != null) {
            this.f9149k.m4758a();
        }
    }

    @Override // com.tsf.shell.p096f.p131f.p132a.p137c.C2792i
    /* renamed from: a */
    public void mo4617a() {
        this.f9129b.m4533f();
        this.f9149k.m4758a();
        float f = this.f9148j;
        for (int i = 0; i < this.f9145g.size(); i++) {
            Number3d.TEMPNUMBER3D.reset();
            final C2765b c2765b = this.f9145g.get(i);
            c2765b.m4729i();
            c2765b.localToGlobal(Number3d.TEMPNUMBER3D);
            this.f9146h.globalToLocal(Number3d.TEMPNUMBER3D);
            c2765b.position().setAllFrom(Number3d.TEMPNUMBER3D);
            float m10742a = C0892a.m10742a(200.0f);
            if (i < 3) {
                C1016a c1016a = new C1016a(c2765b, (i / 3) + 2, m10742a) { // from class: com.tsf.shell.f.f.a.c.k.8
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                    }
                };
                c1016a.m10316b(i % 2 == 0);
                c1016a.mo10301f(f);
                if (i != 2) {
                    f += this.f9147i;
                }
                C1014c.m10326a(c2765b);
                C1014c.m10325a(c2765b, (i * 50) + 600, c1016a);
            } else {
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.c.k.9
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        c2765b.visible(false);
                    }
                };
                c1017d.mo10301f(f);
                c1017d.mo10298h(0.0f);
                c1017d.m10314a(0);
                C1014c.m10326a(c2765b);
                C1014c.m10325a(c2765b, 600, c1017d);
            }
            c2765b.removeFromParent();
            this.f9146h.addChild(c2765b);
        }
        Number3d.TEMPNUMBER3D.reset();
        this.f9146h.localToGlobal(Number3d.TEMPNUMBER3D);
        m4648e().globalToLocal(Number3d.TEMPNUMBER3D);
        this.f9146h.position().setAllFrom(Number3d.TEMPNUMBER3D);
        this.f9146h.removeFromParent();
        m4648e().addChild(this.f9146h);
    }
}
