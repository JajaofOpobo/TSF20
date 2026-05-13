package com.tsf.shell.manager.p185p;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
/* renamed from: com.tsf.shell.manager.p.b */
/* loaded from: classes.dex */
public class C3586b extends C0980j {

    /* renamed from: a */
    private TextureElement f11890a = new TextureElement(0, false);

    /* renamed from: b */
    private TextureElement f11891b = new TextureElement(0, false);

    /* renamed from: c */
    private C0981k f11892c = C0892a.m10741a(103.0f, 149.0f);

    /* renamed from: d */
    private C0981k f11893d;

    public C3586b() {
        this.f11892c.position().f2527y = (-this.f11892c.mo10365c()) / 2.0f;
        this.f11892c.textures().addElement(this.f11890a);
        this.f11893d = C0892a.m10741a(69.0f, 69.0f);
        this.f11893d.textures().addElement(this.f11891b);
        this.f11893d.scale().setAll(0.0f, 0.0f, 1.0f);
        this.f11893d.visible(false);
        addChild(this.f11892c);
    }

    /* renamed from: a */
    public void m1953a() {
        C0853a.m10853g().m10543a(this.f11890a);
        C0853a.m10853g().m10543a(this.f11891b);
    }

    /* renamed from: a */
    public void m1951a(float f, float f2, int i, Runnable runnable) {
        C1017d c1017d = new C1017d();
        c1017d.mo10301f(C0892a.f2590z + C0892a.m10742a(50.0f));
        c1017d.mo10298h(f2);
        c1017d.m10311a(runnable);
        C1014c.m10326a(this);
        C1014c.m10325a(this, i, c1017d);
    }

    /* renamed from: a */
    public void m1948a(final Runnable runnable, final int i) {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.p.b.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                if (runnable != null) {
                    C0853a.m10865a().m10584b(runnable, i);
                }
            }
        };
        c1017d.m10314a(255);
        C1014c.m10326a(this);
        C1014c.m10325a(this, 500, c1017d);
    }

    /* renamed from: b */
    public void m1946b(final Runnable runnable, final int i) {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.p.b.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                if (runnable != null) {
                    C0853a.m10865a().m10584b(runnable, i);
                }
            }
        };
        c1017d.m10314a(0);
        C1014c.m10326a(this);
        C1014c.m10325a(this, 500, c1017d);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.f11890a.f2529id == 0) {
            C0853a.m10853g().m10542a(this.f11890a, C1306b.C1310d.tips_gesture_finger);
            C0853a.m10853g().m10542a(this.f11891b, C1306b.C1310d.tips_finger_point2);
        }
    }

    /* renamed from: a */
    public void m1952a(float f) {
        m1950a(f, (Runnable) null);
    }

    /* renamed from: a */
    public void m1950a(final float f, Runnable runnable) {
        final float f2 = rotation().f2528z;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.p.b.3
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f3) {
                C3586b.this.rotation().f2528z = f2 + ((f - f2) * f3);
            }
        };
        c1017d.m10311a(runnable);
        C1014c.m10325a(new C1013b(), 450, c1017d);
    }

    /* renamed from: b */
    public void m1947b() {
        this.f11893d.removeFromParent();
        C3359a.f11096j.m2232a(this.f11893d);
        setZOrderOnTop();
        this.f11893d.scale().setAll(0.0f, 0.0f, 1.0f);
        this.f11893d.visible(true);
        this.f11893d.alpha(255.0f);
        this.f11893d.position().setAllFrom(position());
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.p.b.4
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3586b.this.f11893d.visible(false);
                C3586b.this.f11893d.alpha(255.0f);
                C3359a.f11096j.m2223b(C3586b.this.f11893d);
            }
        };
        C1014c.m10326a(this.f11893d);
        c1017d.m10294l(5.0f);
        c1017d.m10293m(5.0f);
        c1017d.m10314a(0);
        c1017d.m10313a(C0986a.f2946a);
        C1014c.m10326a(this.f11893d);
        C1014c.m10325a(this.f11893d, 600, c1017d);
    }
}
