package com.tsf.shell.p096f.p107d.p112c.p113a;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.tsf.C1306b;
import com.tsf.shell.p096f.p146g.p147a.C3020h;
/* renamed from: com.tsf.shell.f.d.c.a.c */
/* loaded from: classes.dex */
public class C2421c extends C3020h {

    /* renamed from: h */
    private static TextureElement f7993h = new TextureElement(0, false);

    /* renamed from: a */
    private boolean f7994a;

    /* renamed from: b */
    private Runnable f7995b;

    /* renamed from: c */
    private Runnable f7996c;

    /* renamed from: d */
    private Runnable f7997d;

    /* renamed from: f */
    private Runnable f7998f;

    /* renamed from: g */
    private C2426d f7999g;

    public C2421c(C2426d c2426d) {
        super(new C0962a(5, 60, 120, 60));
        this.f7994a = false;
        this.f7999g = c2426d;
        this.f9833e.useVBO(false);
        C0962a c0962a = (C0962a) this.f9833e;
        c0962a.textures().addElement(f7993h);
        C0964b m10456a = c0962a.m10456a(4);
        m10456a.m10438a(0, 0, 1, 1, C0892a.m10742a(60.0f), C0892a.m10742a(60.0f));
        m10456a.m10408h();
        for (int i = 0; i < 4; i++) {
            C0964b m10456a2 = c0962a.m10456a(i);
            m10456a2.m10438a(1, 0, 1, 1, C0892a.m10742a(60.0f), C0892a.m10742a(60.0f));
            m10456a2.f2855o.setAll(0.0f, 0.0f, 1.0f);
            m10456a2.m10408h();
        }
        this.f7995b = new Runnable() { // from class: com.tsf.shell.f.d.c.a.c.1
            @Override // java.lang.Runnable
            public void run() {
                C0853a.m10865a().m10584b(C2421c.this.f7996c, 300L);
            }
        };
        this.f7996c = new Runnable() { // from class: com.tsf.shell.f.d.c.a.c.2
            @Override // java.lang.Runnable
            public void run() {
                C2421c.this.f7999g.mo5582b((C0962a) C2421c.this.f9833e, C2421c.this.f7997d);
            }
        };
        this.f7997d = new Runnable() { // from class: com.tsf.shell.f.d.c.a.c.3
            @Override // java.lang.Runnable
            public void run() {
                C2421c.this.f7994a = false;
            }
        };
        this.f7998f = new Runnable() { // from class: com.tsf.shell.f.d.c.a.c.4
            @Override // java.lang.Runnable
            public void run() {
                C2421c.this.f7999g.mo5587a((C0962a) C2421c.this.f9833e, C2421c.this.f7995b);
            }
        };
        calAABB();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        if (!this.f7994a) {
            this.f7994a = true;
            this.f7998f.run();
        }
        if (f7993h.f2529id == 0) {
            C0853a.m10853g().m10542a(f7993h, C1306b.C1310d.menu_effect_element);
        }
    }

    /* renamed from: a */
    public static void m5596a() {
        if (f7993h.f2529id != 0) {
            C0853a.m10853g().m10543a(f7993h);
        }
        C3020h.m3825b();
    }
}
