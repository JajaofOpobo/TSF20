package com.tsf.shell.p096f.p107d.p108a.p109a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.p096f.p107d.p108a.AbstractC2374a;
import com.tsf.shell.p096f.p107d.p108a.C2401b;
/* renamed from: com.tsf.shell.f.d.a.a.g */
/* loaded from: classes.dex */
public class C2395g extends AbstractC2374a {

    /* renamed from: a */
    private C2401b f7926a;

    public C2395g(int i, boolean z) {
        super(i, z);
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: a */
    public void mo5652a(final C0975i c0975i, Number3d number3d, Number3d number3d2, final Runnable runnable) {
        final C0964b m10456a = c0975i instanceof C0962a ? ((C0962a) c0975i).m10456a(0) : c0975i;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.a.a.g.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.d.a.a.g.1.1
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }

                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: c */
                    public void mo4322c() {
                        C2395g.this.m5654a(c0975i);
                    }
                };
                c1017d2.m10294l(1.0f);
                c1017d2.m10293m(1.0f);
                C1014c.m10326a(m10456a);
                C1014c.m10325a(m10456a, 250, c1017d2);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: c */
            public void mo4322c() {
                C2395g.this.m5654a(c0975i);
            }
        };
        c1017d.m10294l(0.75f);
        c1017d.m10293m(0.75f);
        C1014c.m10326a(m10456a);
        C1014c.m10325a(m10456a, 250, c1017d);
    }

    /* renamed from: a */
    public void m5654a(C0975i c0975i) {
        if (c0975i instanceof C0962a) {
            C0964b m10456a = ((C0962a) c0975i).m10456a(0);
            Number3d m10405k = m10456a.m10405k();
            m10456a.m10405k().f2527y = 1.0f;
            m10405k.f2526x = 1.0f;
            m10456a.m10411f();
        } else {
            Number3d scale = c0975i.scale();
            c0975i.scale().f2527y = 1.0f;
            scale.f2526x = 1.0f;
        }
        C1014c.m10326a(c0975i);
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: e */
    public C0975i mo5650e() {
        if (this.f7926a == null) {
            this.f7926a = new C2401b(this, true);
        }
        return this.f7926a;
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: a */
    public void mo5651a(C0981k c0981k, Runnable runnable) {
        mo5652a(c0981k, null, null, runnable);
    }
}
