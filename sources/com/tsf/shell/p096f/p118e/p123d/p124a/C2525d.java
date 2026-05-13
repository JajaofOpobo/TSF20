package com.tsf.shell.p096f.p118e.p123d.p124a;

import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p118e.p123d.p124a.C2516c;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.e.d.a.d */
/* loaded from: classes.dex */
public class C2525d {

    /* renamed from: d */
    private C0980j f8390d;

    /* renamed from: b */
    private boolean f8388b = false;

    /* renamed from: c */
    private C2516c f8389c = new C2516c(this);

    /* renamed from: a */
    private C2503a f8387a = new C2503a() { // from class: com.tsf.shell.f.e.d.a.d.1
        @Override // com.tsf.shell.p096f.p118e.p123d.p124a.C2503a
        /* renamed from: a */
        public void mo5342a() {
            if (C2525d.this.f8388b) {
                C2525d.this.m5348e();
            } else {
                C2525d.this.m5344j();
            }
        }
    };

    /* renamed from: a */
    public void m5354a(C0980j c0980j) {
        this.f8390d = c0980j;
    }

    /* renamed from: a */
    public void m5352a(ArrayList<C2516c.C2524c> arrayList) {
        C2516c.C2523b c2523b = new C2516c.C2523b();
        c2523b.f8372a = C0892a.m10742a(-80.0f);
        c2523b.f8373b = C0892a.m10742a(150.0f);
        c2523b.f8374c = C0892a.m10742a(65.0f);
        c2523b.f8375d = C0892a.m10742a(30.0f);
        c2523b.f8376e = 45;
        c2523b.f8377f = C0892a.m10742a(80.0f);
        this.f8389c.m5366a(arrayList, c2523b);
    }

    /* renamed from: a */
    public boolean m5355a() {
        return this.f8388b;
    }

    /* renamed from: b */
    public void m5351b() {
        this.f8387a.m5381b();
        this.f8387a.mouseEnabled(true);
    }

    /* renamed from: c */
    public void m5350c() {
        this.f8387a.m5379d();
        this.f8387a.mouseEnabled(false);
    }

    /* renamed from: d */
    public void m5349d() {
        while (this.f8388b) {
            m5348e();
        }
    }

    /* renamed from: e */
    public void m5348e() {
        if (this.f8388b && this.f8389c.m5365b()) {
            this.f8388b = false;
            this.f8390d.mouseEnabled(true);
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.d.a.d.2
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2525d.this.mo3720i();
                }
            };
            c1017d.mo10301f(0.0f);
            c1017d.m10314a(255);
            c1017d.m10313a(C0986a.f2946a);
            C1014c.m10326a(this.f8390d);
            C1014c.m10325a(this.f8390d, 500, c1017d);
            this.f8387a.m5378e();
            m5345h();
        }
    }

    /* renamed from: f */
    public void m5347f() {
    }

    /* renamed from: g */
    public void m5346g() {
    }

    /* renamed from: h */
    public void m5345h() {
    }

    /* renamed from: i */
    public void mo3720i() {
    }

    /* renamed from: j */
    public void m5344j() {
        if (!this.f8388b) {
            this.f8388b = true;
            m5343k();
            this.f8389c.removeFromParent();
            C3359a.f11096j.m2232a(this.f8389c);
            this.f8389c.m5373a();
            this.f8390d.mouseEnabled(false);
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.d.a.d.3
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2525d.this.m5346g();
                }
            };
            c1017d.mo10301f(this.f8389c.m5364c() + C0892a.m10742a(100.0f));
            c1017d.m10314a(50);
            c1017d.m10313a(C0986a.f2946a);
            C1014c.m10326a(this.f8390d);
            C1014c.m10325a(this.f8390d, 500, c1017d);
            this.f8387a.m5382a(this.f8389c.m5364c() + C0892a.m10742a(100.0f));
            m5347f();
        }
    }

    /* renamed from: k */
    public void m5343k() {
        this.f8387a.m5380c();
        this.f8389c.position().f2526x = C0892a.f2590z;
        this.f8389c.position().f2527y = C0892a.f2551B;
    }
}
