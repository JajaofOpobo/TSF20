package com.tsf.shell.p096f.p107d.p108a;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.shell.manager.p177i.C3498a;
import com.tsf.shell.p096f.p146g.p147a.C3020h;
/* renamed from: com.tsf.shell.f.d.a.b */
/* loaded from: classes.dex */
public class C2401b extends C3020h {

    /* renamed from: b */
    public static C0981k f7938b;

    /* renamed from: a */
    public boolean f7939a;

    /* renamed from: c */
    private AbstractC2374a f7940c;

    /* renamed from: d */
    private Runnable f7941d;

    /* renamed from: f */
    private Runnable f7942f;

    public C2401b(AbstractC2374a abstractC2374a, boolean z) {
        super(0.85f);
        this.f7939a = false;
        this.f7940c = abstractC2374a;
        calAABB();
        useVBO(false);
        this.f9833e.useVBO(false);
        if (f7938b == null) {
            f7938b = C3020h.m3826a(0.85f);
            f7938b.useVBO(false);
        }
        this.f7939a = z ? false : true;
        this.f7941d = new Runnable() { // from class: com.tsf.shell.f.d.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                C0853a.m10865a().m10584b(C2401b.this.f7942f, 300L);
            }
        };
        this.f7942f = new Runnable() { // from class: com.tsf.shell.f.d.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                C2401b.this.f7939a = false;
            }
        };
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (!this.f7939a) {
            this.f7939a = true;
            this.f7940c.mo5651a((C0981k) this.f9833e, this.f7941d);
        }
    }

    @Override // com.tsf.shell.p096f.p146g.p147a.C3020h, com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildEnd() {
        super.onDrawChildEnd();
        C3498a.m2190a(this.f7940c.m5684a(), C0892a.m10742a(30.0f));
    }
}
