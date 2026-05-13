package com.tsf.shell.p096f.p107d.p108a.p109a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.p096f.p107d.p108a.AbstractC2374a;
import com.tsf.shell.p096f.p107d.p108a.C2401b;
/* renamed from: com.tsf.shell.f.d.a.a.f */
/* loaded from: classes.dex */
public class C2392f extends AbstractC2374a {

    /* renamed from: a */
    private C2401b f7921a;

    public C2392f(int i, boolean z) {
        super(i, z);
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: a */
    public void mo5652a(final C0975i c0975i, Number3d number3d, Number3d number3d2, final Runnable runnable) {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.a.a.f.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.d.a.a.f.1.1
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: c */
                    public void mo4322c() {
                        C2392f.this.m5656a(c0975i);
                    }

                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                };
                c1017d2.m10303e(0.0f);
                c1017d2.m10313a(C0986a.f2952g);
                C1014c.m10326a(c0975i);
                C1014c.m10325a(c0975i, 1000, c1017d2);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: c */
            public void mo4322c() {
                C2392f.this.m5656a(c0975i);
            }
        };
        c1017d.m10303e(45.0f);
        C1014c.m10326a(c0975i);
        C1014c.m10325a(c0975i, 250, c1017d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5656a(C0975i c0975i) {
        c0975i.rotation().f2528z = 0.0f;
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: e */
    public C0975i mo5650e() {
        if (this.f7921a == null) {
            this.f7921a = new C2401b(this, true);
        }
        return this.f7921a;
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: a */
    public void mo5651a(C0981k c0981k, Runnable runnable) {
        mo5652a(c0981k, null, null, runnable);
    }
}
