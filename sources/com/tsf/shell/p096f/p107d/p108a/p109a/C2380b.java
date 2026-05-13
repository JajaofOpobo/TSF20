package com.tsf.shell.p096f.p107d.p108a.p109a;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.p096f.p107d.p108a.AbstractC2374a;
import com.tsf.shell.p096f.p107d.p108a.C2401b;
/* renamed from: com.tsf.shell.f.d.a.a.b */
/* loaded from: classes.dex */
public class C2380b extends AbstractC2374a {

    /* renamed from: a */
    Color4 f7867a;

    /* renamed from: b */
    private C2401b f7868b;

    public C2380b(int i, boolean z) {
        super(i, z);
        this.f7867a = new Color4();
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: a */
    public void mo5652a(final C0975i c0975i, Number3d number3d, Number3d number3d2, final Runnable runnable) {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.d.a.a.b.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.d.a.a.b.1.1
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo518a(float f) {
                        C2380b.this.m5669a(c0975i, (int) (155.0f + (100.0f * f)));
                    }

                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: c */
                    public void mo4322c() {
                        C2380b.this.m5670a(c0975i);
                    }

                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C2380b.this.m5670a(c0975i);
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                };
                C1014c.m10326a(c0975i);
                C1014c.m10325a(c0975i, 250, c1017d2);
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                C2380b.this.m5669a(c0975i, (int) (255.0f - (100.0f * f)));
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: c */
            public void mo4322c() {
                C2380b.this.m5670a(c0975i);
            }
        };
        C1014c.m10326a(c0975i);
        C1014c.m10325a(c0975i, 250, c1017d);
        c0975i.setDefaultColor(this.f7867a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5669a(C0975i c0975i, int i) {
        this.f7867a.set(255, i, i, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5670a(C0975i c0975i) {
        c0975i.clearDefaultColor();
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: e */
    public C0975i mo5650e() {
        if (this.f7868b == null) {
            this.f7868b = new C2401b(this, true);
        }
        return this.f7868b;
    }

    @Override // com.tsf.shell.p096f.p107d.p108a.AbstractC2374a
    /* renamed from: a */
    public void mo5651a(C0981k c0981k, Runnable runnable) {
        mo5652a(c0981k, null, null, runnable);
    }
}
