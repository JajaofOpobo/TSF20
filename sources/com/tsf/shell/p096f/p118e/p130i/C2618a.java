package com.tsf.shell.p096f.p118e.p130i;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.message.VMessageManager;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
/* renamed from: com.tsf.shell.f.e.i.a */
/* loaded from: classes.dex */
public class C2618a extends C0980j {

    /* renamed from: c */
    private static TextureElement f8614c = new TextureElement(0, false);

    /* renamed from: d */
    private static TextureElement f8615d = new TextureElement(0, false);

    /* renamed from: e */
    private static TextureElement f8616e = new TextureElement(0, false);

    /* renamed from: f */
    private static TextureElement f8617f = new TextureElement(0, false);

    /* renamed from: g */
    private C2624c f8620g;

    /* renamed from: h */
    private C2624c f8621h;

    /* renamed from: i */
    private int f8622i;

    /* renamed from: b */
    private C0981k f8619b = new C0981k(C0892a.m10742a(200.0f), C0892a.m10742a(200.0f), false);

    /* renamed from: a */
    public C0981k f8618a = new C0981k(C0892a.m10742a(200.0f), C0892a.m10742a(200.0f), false) { // from class: com.tsf.shell.f.e.i.a.1
        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            if (C2618a.f8615d.f2529id == 0) {
                C0853a.m10853g().m10542a(C2618a.f8615d, C1306b.C1310d.mark_star_disable);
            }
        }
    };

    public C2618a() {
        this.f8618a.textures().addElement(f8615d);
        addChild(this.f8619b);
        this.f8620g = new C2624c();
        this.f8620g.textures().addElement(f8616e);
        addChild(this.f8620g);
        this.f8621h = new C2624c();
        this.f8621h.textures().addElement(f8617f);
        addChild(this.f8621h);
    }

    /* renamed from: a */
    public void m5147a(float f) {
        this.f8618a.rotation().f2528z = f;
        this.f8619b.rotation().f2528z = f;
    }

    /* renamed from: a */
    public void m5146a(int i) {
        this.f8622i = i;
    }

    /* renamed from: a */
    public int m5148a() {
        return this.f8622i;
    }

    /* renamed from: b */
    public static void m5144b() {
        if (f8614c.f2529id != 0) {
            C0853a.m10853g().m10543a(f8614c);
        }
        if (f8615d.f2529id != 0) {
            C0853a.m10853g().m10543a(f8615d);
        }
        if (f8616e.f2529id != 0) {
            C0853a.m10853g().m10543a(f8616e);
        }
        if (f8617f.f2529id != 0) {
            C0853a.m10853g().m10543a(f8617f);
        }
    }

    /* renamed from: f */
    private void m5137f() {
        if (f8614c.f2529id == 0) {
            C0853a.m10853g().m10542a(f8614c, C1306b.C1310d.mark_star_enable);
        }
        if (f8616e.f2529id == 0) {
            C0853a.m10853g().m10542a(f8616e, C1306b.C1310d.mark_little_star_w);
        }
        if (f8617f.f2529id == 0) {
            C0853a.m10853g().m10542a(f8617f, C1306b.C1310d.mark_little_star_y);
        }
    }

    /* renamed from: c */
    public void m5141c() {
        this.f8619b.scale().setAll(0.0f, 0.0f, 1.0f);
        this.f8620g.m5130e();
        this.f8621h.m5130e();
        this.f8618a.visible(true);
    }

    /* renamed from: b */
    public void m5143b(int i) {
        m5137f();
        VMessageManager.postGLThreadRunnable(new Runnable() { // from class: com.tsf.shell.f.e.i.a.2
            @Override // java.lang.Runnable
            public void run() {
                C2618a.this.f8619b.textures().removeAll();
                C2618a.this.f8619b.textures().addElement(C2618a.f8614c);
                C2618a.this.f8619b.scale().setAll(0.0f, 0.0f, 1.0f);
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.i.a.2.1
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C2618a.this.f8618a.visible(false);
                    }
                };
                c1017d.m10294l(1.0f);
                c1017d.m10293m(1.0f);
                c1017d.m10313a(C0986a.f2950e);
                C1014c.m10326a(C2618a.this.f8619b);
                C1014c.m10325a(C2618a.this.f8619b, 300, c1017d);
                C2618a.this.f8620g.m5131d();
                C2618a.this.f8621h.m5131d();
            }
        }, i);
    }
}
