package com.tsf.shell.manager.p178j;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p118e.C2617i;
/* renamed from: com.tsf.shell.manager.j.a */
/* loaded from: classes.dex */
public class C3500a extends C0980j {

    /* renamed from: a */
    private static final int f11567a = C0892a.m10735b(72.0f);

    /* renamed from: l */
    private static final int f11568l = C0892a.m10735b(15.0f);

    /* renamed from: m */
    private static final int f11569m = (f11567a / 2) + f11568l;

    /* renamed from: d */
    private C0981k f11572d;

    /* renamed from: e */
    private C0981k f11573e;

    /* renamed from: f */
    private C0981k f11574f;

    /* renamed from: g */
    private C0984m f11575g;

    /* renamed from: i */
    private TextureElement f11577i = new TextureElement(0, false);

    /* renamed from: j */
    private TextureElement f11578j = new TextureElement(0, false);

    /* renamed from: k */
    private TextureElement f11579k = new TextureElement(0, false);

    /* renamed from: b */
    private C0980j f11570b = new C0980j();

    /* renamed from: c */
    private C0980j f11571c = new C0980j();

    /* renamed from: h */
    private C2617i f11576h = new C2617i();

    public C3500a() {
        this.f11576h.m5151a(3);
        this.f11572d = new C0981k(f11567a, f11567a, false);
        this.f11572d.textures().addElement(this.f11577i);
        this.f11572d.setDefaultColor(new Color4(-2236963));
        this.f11573e = new C0981k(f11567a, f11567a, false);
        this.f11573e.textures().addElement(this.f11578j);
        this.f11574f = new C0981k(f11567a, f11567a, false);
        this.f11574f.textures().addElement(this.f11579k);
        this.f11575g = new C0984m();
        this.f11575g.m10347d(60);
        this.f11575g.m10345e(-2236963);
        this.f11575g.m10351b(true);
        this.f11575g.m10349c(C1306b.C1315i.text_excellent);
        this.f11575g.m10352b(1);
        this.f11575g.m10353b();
        this.f11575g.position().f2526x = f11569m;
        this.f11576h.addChild(this.f11575g);
        this.f11571c.addChild(this.f11572d);
        this.f11571c.addChild(this.f11573e);
        this.f11571c.addChild(this.f11574f);
        addChild(this.f11570b);
        this.f11570b.position().f2526x = m2176f();
        this.f11570b.addChild(this.f11576h);
        this.f11570b.addChild(this.f11571c);
        m2177e();
    }

    /* renamed from: e */
    private void m2177e() {
        this.f11576h.m5152a(this.f11575g.maxX() + f11568l + f11567a, this.f11575g.maxY() - this.f11575g.minY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public float m2176f() {
        return ((-((this.f11575g.maxX() + f11567a) + f11568l)) / 2.0f) + (f11567a / 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2186a(int i) {
        this.f11575g.m10349c(i);
        this.f11575g.m10353b();
        m2177e();
    }

    /* renamed from: a */
    public void m2187a() {
        C1017d c1017d = new C1017d();
        c1017d.mo10298h(C0892a.m10742a(-20.0f));
        C1014c.m10326a(this.f11573e);
        C1014c.m10325a(this.f11573e, VEasing.Linear.easeNone, c1017d);
        C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.manager.j.a.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3500a.this.m2186a(C1306b.C1315i.text_why);
                C1017d c1017d3 = new C1017d();
                c1017d3.mo10301f(C3500a.f11569m);
                C1014c.m10326a(C3500a.this.f11575g);
                C1014c.m10325a(C3500a.this.f11575g, VEasing.Linear.easeNone, c1017d3);
                C1017d c1017d4 = new C1017d();
                c1017d4.mo10301f(C3500a.this.m2176f());
                C1014c.m10326a(C3500a.this.f11570b);
                C1014c.m10325a(C3500a.this.f11570b, VEasing.Linear.easeNone, c1017d4);
            }
        };
        c1017d2.mo10301f(-this.f11575g.maxX());
        C1014c.m10326a(this.f11575g);
        C1014c.m10325a(this.f11575g, VEasing.Linear.easeNone, c1017d2);
        C1017d c1017d3 = new C1017d() { // from class: com.tsf.shell.manager.j.a.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C1017d c1017d4 = new C1017d();
                c1017d4.m10303e(180.0f);
                C1014c.m10326a(C3500a.this.f11571c);
                C1014c.m10325a(C3500a.this.f11571c, VEasing.Linear.easeNone, c1017d4);
            }
        };
        c1017d3.mo10298h(C0892a.m10742a(25.0f));
        C1014c.m10326a(this.f11574f);
        C1014c.m10325a(this.f11574f, VEasing.Linear.easeNone, c1017d3);
    }

    /* renamed from: b */
    public void m2183b() {
        C1017d c1017d = new C1017d();
        c1017d.mo10298h(0.0f);
        C1014c.m10326a(this.f11573e);
        C1014c.m10325a(this.f11573e, VEasing.Linear.easeNone, c1017d);
        C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.manager.j.a.3
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C3500a.this.m2186a(C1306b.C1315i.text_excellent);
                C1017d c1017d3 = new C1017d();
                c1017d3.mo10301f(C3500a.f11569m);
                C1014c.m10326a(C3500a.this.f11575g);
                C1014c.m10325a(C3500a.this.f11575g, VEasing.Linear.easeNone, c1017d3);
                C1017d c1017d4 = new C1017d();
                c1017d4.mo10301f(C3500a.this.m2176f());
                C1014c.m10326a(C3500a.this.f11570b);
                C1014c.m10325a(C3500a.this.f11570b, VEasing.Linear.easeNone, c1017d4);
            }
        };
        c1017d2.mo10301f(-this.f11575g.maxX());
        C1014c.m10326a(this.f11575g);
        C1014c.m10325a(this.f11575g, VEasing.Linear.easeNone, c1017d2);
        C1017d c1017d3 = new C1017d() { // from class: com.tsf.shell.manager.j.a.4
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                C1017d c1017d4 = new C1017d();
                c1017d4.m10303e(0.0f);
                C1014c.m10326a(C3500a.this.f11571c);
                C1014c.m10325a(C3500a.this.f11571c, VEasing.Linear.easeNone, c1017d4);
            }
        };
        c1017d3.mo10298h(0.0f);
        C1014c.m10326a(this.f11574f);
        C1014c.m10325a(this.f11574f, VEasing.Linear.easeNone, c1017d3);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (this.f11577i.f2529id == 0) {
            C0853a.m10853g().m10542a(this.f11577i, C1306b.C1310d.rate_face);
            C0853a.m10853g().m10542a(this.f11578j, C1306b.C1310d.rate_face_eyes);
            C0853a.m10853g().m10542a(this.f11579k, C1306b.C1310d.rate_face_mouth);
        }
    }

    /* renamed from: c */
    public void m2181c() {
        if (this.f11577i.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f11577i);
            C0853a.m10853g().m10543a(this.f11578j);
            C0853a.m10853g().m10543a(this.f11579k);
        }
    }
}
