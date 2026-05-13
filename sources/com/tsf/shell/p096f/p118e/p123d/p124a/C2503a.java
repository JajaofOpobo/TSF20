package com.tsf.shell.p096f.p118e.p123d.p124a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
/* renamed from: com.tsf.shell.f.e.d.a.a */
/* loaded from: classes.dex */
public class C2503a extends C0980j {

    /* renamed from: a */
    private C2506b f8332a = new C2506b();

    public C2503a() {
        addChild(this.f8332a);
        setMouseEventListener(new C0937a(this) { // from class: com.tsf.shell.f.e.d.a.a.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C2503a.this.mo5342a();
            }
        });
        setAABBPX(-C0892a.m10742a(150.0f), -C0892a.m10742a(150.0f), 0.0f, C0892a.m10742a(150.0f), C0892a.m10742a(150.0f), 0.0f);
    }

    /* renamed from: a */
    public void mo5342a() {
    }

    /* renamed from: b */
    public void m5381b() {
        if (parent() == null) {
            C3359a.f11096j.m2232a(this);
            position().f2526x = C0892a.f2590z - C0892a.m10742a(100.0f);
            position().f2527y = C0892a.f2551B - C0892a.m10742a(84.0f);
            this.f8332a.position().f2526x = C0892a.m10742a(45.0f);
        }
        C1017d c1017d = new C1017d();
        c1017d.mo10301f(C0892a.f2590z);
        C1014c.m10326a(this);
        C1014c.m10325a(this, 500, c1017d);
    }

    /* renamed from: c */
    public void m5380c() {
        position().f2526x = C0892a.f2590z;
        position().f2527y = C0892a.f2551B - C0892a.m10742a(84.0f);
    }

    /* renamed from: d */
    public void m5379d() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.d.a.a.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2503a.this.removeFromParent();
            }
        };
        c1017d.mo10301f(C0892a.f2590z - C0892a.m10742a(100.0f));
        C1014c.m10326a(this);
        C1014c.m10325a(this, 500, c1017d);
    }

    /* renamed from: a */
    public void m5382a(float f) {
        this.f8332a.m5377a();
        C1017d c1017d = new C1017d();
        c1017d.mo10301f(f);
        C1014c.m10326a(this.f8332a);
        C1014c.m10325a(this.f8332a, 500, c1017d);
    }

    /* renamed from: e */
    public void m5378e() {
        this.f8332a.m5375b();
        C1017d c1017d = new C1017d();
        c1017d.mo10301f(C0892a.m10742a(45.0f));
        C1014c.m10326a(this.f8332a);
        C1014c.m10325a(this.f8332a, 500, c1017d);
    }
}
