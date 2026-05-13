package com.tsf.shell.p096f.p118e.p127g;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p097a.p099b.C2278b;
/* renamed from: com.tsf.shell.f.e.g.c */
/* loaded from: classes.dex */
public class C2590c extends C0980j {

    /* renamed from: a */
    private C2278b f8543a;

    /* renamed from: b */
    private C0975i f8544b;

    public C2590c(float f, float f2) {
        this.f8543a = new C2278b(f, f2, this.f8543a);
        this.f8543a.setDefaultColor(new Color4(0, 0, 0, 255));
        this.f8543a.alpha(60.0f);
        this.f8543a.scale().f2527y = 0.0f;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.InterfaceC0972f
    public void addChild(C0975i c0975i) {
        if (this.f8544b != null) {
            final C0975i c0975i2 = this.f8544b;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.g.c.1
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    c0975i2.removeFromParent();
                }
            };
            c1017d.m10314a(0);
            c1017d.mo10298h(AbstractC2593d.MENU_EXTRA_HEIGHT);
            C1014c.m10326a(c0975i2);
            C1014c.m10325a(c0975i2, VEasing.Linear.easeNone, c1017d);
        }
        this.f8544b = c0975i;
        if (this.f8544b.parent() == null) {
            if (this.f8543a.scale().f2527y == 0.0f) {
                this.f8544b.position().f2527y = 0.0f;
            } else {
                this.f8544b.position().f2527y = -AbstractC2593d.MENU_EXTRA_HEIGHT;
            }
            this.f8544b.alpha(255.0f);
        }
        C1017d c1017d2 = new C1017d();
        c1017d2.m10313a(C0986a.f2946a);
        c1017d2.mo10298h(0.0f);
        C1014c.m10326a(this.f8544b);
        C1014c.m10325a(this.f8544b, VEasing.Linear.easeNone, c1017d2);
        this.f8544b.removeFromParent();
        super.addChild(this.f8544b);
    }

    /* renamed from: a */
    public void m5220a() {
        C1017d c1017d = new C1017d();
        c1017d.m10293m(1.0f);
        C1014c.m10326a(this.f8543a);
        C1014c.m10325a(this.f8543a, VEasing.Linear.easeNone, c1017d);
    }

    /* renamed from: b */
    public void m5216b() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.g.c.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2590c.this.removeFromParent();
                if (C2590c.this.f8544b != null) {
                    C2590c.this.f8544b.removeFromParent();
                    C2590c.this.f8544b = null;
                }
            }
        };
        c1017d.m10293m(0.0f);
        C1014c.m10326a(this.f8543a);
        C1014c.m10325a(this.f8543a, 300, c1017d);
    }

    /* renamed from: a */
    public void m5219a(int i) {
        this.f8543a.mo10368a(i);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildStart() {
        C3359a.f11107u.m5966a(this.f8543a);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawEnd() {
        C3359a.f11107u.m5968a();
    }
}
