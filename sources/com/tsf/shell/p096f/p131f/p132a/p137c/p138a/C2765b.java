package com.tsf.shell.p096f.p131f.p132a.p137c.p138a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.manager.p185p.C3595e;
import com.tsf.shell.p096f.p118e.C2636k;
import com.tsf.shell.p096f.p131f.p132a.C2843f;
import com.tsf.shell.p096f.p131f.p132a.p137c.C2798j;
import com.tsf.shell.p096f.p131f.p132a.p137c.C2799k;
import com.tsf.shell.utils.C4181q;
/* renamed from: com.tsf.shell.f.f.a.c.a.b */
/* loaded from: classes.dex */
public class C2765b extends C0980j {

    /* renamed from: a */
    public static final int f9045a = C0892a.m10735b(26.0f);

    /* renamed from: b */
    private static TextureElement f9046b = new TextureElement(0, false);

    /* renamed from: k */
    private static C2636k f9047k;

    /* renamed from: d */
    private C0980j f9049d;

    /* renamed from: f */
    private String f9051f;

    /* renamed from: g */
    private int f9052g;

    /* renamed from: h */
    private float f9053h;

    /* renamed from: i */
    private float f9054i;

    /* renamed from: j */
    private C2799k.C2809a f9055j;

    /* renamed from: m */
    private C3595e.C3597a f9057m;

    /* renamed from: c */
    private TextureElement f9048c = new TextureElement(0, false);

    /* renamed from: l */
    private boolean f9056l = false;

    /* renamed from: e */
    private C0981k f9050e = new C0981k(f9045a, f9045a, false);

    public C2765b(C2799k.C2809a c2809a) {
        this.f9055j = c2809a;
        this.f9050e.textures().addElement(f9046b);
        addChild(this.f9050e);
        this.f9051f = c2809a.f9160b;
        this.f9052g = c2809a.f9161c;
        C3567c.m1967a(this.f9050e, C3567c.f11842a);
        this.f9050e.alpha(200.0f);
        this.f9049d = mo4741a(this.f9048c);
        this.f9049d.setMouseEventListener(new C0937a(this.f9049d) { // from class: com.tsf.shell.f.f.a.c.a.b.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (C2765b.this.mo4739b()) {
                    C2765b.this.m4730h();
                    C2765b.this.mo4736c();
                    C2765b.this.f9055j.mo4631a();
                    if (C2765b.this.f9057m != null) {
                        C2765b.this.f9057m.m1916b();
                        return;
                    }
                    return;
                }
                C2765b.this.mo4734d();
            }
        });
        this.f9049d.calAABB();
        this.f9053h = (C2843f.f9233a / 2.0f) + C0892a.m10742a(25.0f);
        PositionNumber3d position = this.f9049d.position();
        float m10742a = C0892a.m10742a(-30.0f);
        this.f9054i = m10742a;
        position.f2527y = m10742a;
        this.f9049d.visible(false);
        this.f9049d.scale().setAll(0.0f, 0.0f, 1.0f);
        this.f9049d.alpha(0.0f);
        this.f9049d.removeFromParent();
        addChild(this.f9049d);
        C3567c.m1967a(this.f9049d, C3567c.f11842a);
        this.f9049d.alpha(200.0f);
    }

    /* renamed from: a */
    public void m4742a(int i) {
        this.f9057m = C3359a.f11087a.m1929a(i);
        if (this.f9057m.m1919a()) {
            m4731g();
        }
    }

    /* renamed from: g */
    public void m4731g() {
        if (f9047k == null) {
            f9047k = new C2636k();
            f9047k.position().f2526x = C0892a.m10742a(80.0f);
            f9047k.position().f2527y = C0892a.m10742a(220.0f);
            f9047k.alpha(0.0f);
        }
        this.f9056l = true;
    }

    /* renamed from: h */
    public void m4730h() {
        this.f9056l = false;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j
    public void onDrawChildEnd() {
        if (this.f9056l && this.f9049d.visible()) {
            f9047k.scale().setAllFrom(this.f9049d.scale());
            f9047k.alpha(this.f9049d.alpha());
            f9047k.dispatchDraw();
        }
    }

    /* renamed from: b */
    public boolean mo4739b() {
        return true;
    }

    /* renamed from: c */
    public void mo4736c() {
    }

    /* renamed from: d */
    public void mo4734d() {
    }

    /* renamed from: a */
    public C0980j mo4741a(TextureElement textureElement) {
        C0962a m4637a = C2798j.m4637a();
        m4637a.m10448a(true);
        m4637a.textures().addElement(textureElement);
        return m4637a;
    }

    /* renamed from: b */
    public void m4738b(int i) {
        mo4733e();
        if (this.f9048c.f2529id == 0) {
            C2798j.m4636a(this.f9048c, this.f9052g, this.f9051f);
        }
        this.f9049d.visible(true);
        C1017d c1017d = new C1017d();
        c1017d.m10294l(1.0f);
        c1017d.m10293m(1.0f);
        c1017d.mo10298h(this.f9053h);
        c1017d.m10314a(VEasing.Back.easeIn);
        c1017d.m10309b(i);
        C1014c.m10326a(this.f9049d);
        C1014c.m10325a(this.f9049d, VEasing.Linear.easeNone, c1017d);
        C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.f.a.c.a.b.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
            }
        };
        c1017d2.m10314a(60);
        c1017d2.m10309b(i);
        C1014c.m10326a(this.f9050e);
        C1014c.m10325a(this.f9050e, VEasing.Linear.easeNone, c1017d2);
    }

    /* renamed from: i */
    public void m4729i() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.a.c.a.b.3
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C2765b.this.f9049d.visible(false);
                C2765b.this.mo4732f();
            }
        };
        c1017d.m10294l(0.0f);
        c1017d.m10293m(0.0f);
        c1017d.mo10298h(this.f9054i);
        c1017d.m10314a(0);
        C1014c.m10326a(this.f9049d);
        C1014c.m10325a(this.f9049d, 750, c1017d);
        C1017d c1017d2 = new C1017d();
        c1017d2.m10314a(VEasing.Back.easeIn);
        C1014c.m10326a(this.f9050e);
        C1014c.m10325a(this.f9050e, 750, c1017d2);
        this.f9050e.visible(true);
    }

    /* renamed from: e */
    public void mo4733e() {
    }

    /* renamed from: f */
    public void mo4732f() {
        if (this.f9048c.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f9048c);
        }
    }

    /* renamed from: j */
    public static void m4728j() {
        if (f9046b.f2529id == 0) {
            C0853a.m10853g().m10540a(f9046b, C4181q.m638b(f9045a, -1));
        }
    }

    /* renamed from: k */
    public static void m4727k() {
        if (f9046b.f2529id != 0) {
            C0853a.m10853g().m10543a(f9046b);
        }
        if (f9047k != null) {
            f9047k.m5101a();
        }
    }
}
