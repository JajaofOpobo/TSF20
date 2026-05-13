package com.tsf.shell.p096f.p131f.p132a.p133a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.C0908c;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p175g.C3489a;
/* renamed from: com.tsf.shell.f.f.a.a.e */
/* loaded from: classes.dex */
public class C2717e extends C0908c {

    /* renamed from: h */
    private static final int f8931h = C0892a.m10735b(160.0f);

    /* renamed from: c */
    private C0980j f8934c;

    /* renamed from: d */
    private C0981k f8935d;

    /* renamed from: e */
    private C0981k f8936e;

    /* renamed from: i */
    private C2695c f8939i;

    /* renamed from: f */
    private TextureElement f8937f = new TextureElement(0, false);

    /* renamed from: g */
    private TextureElement f8938g = new TextureElement(0, false);

    /* renamed from: a */
    private C0980j f8932a = new C0980j();

    /* renamed from: b */
    private C0981k f8933b = new C0981k(C0892a.f2553D, 120.0f * C0892a.f2567c, false);

    public C2717e(C2695c c2695c) {
        this.f8939i = c2695c;
        this.f8933b.setDefaultColor(new Color4(255, 255, 255, 60));
        this.f8933b.setMouseEventListener(new C0937a(this.f8933b) { // from class: com.tsf.shell.f.f.a.a.e.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C3359a.f11090d.m2669a(7, true);
            }
        });
        this.f8932a.addChild(this.f8933b);
        this.f8934c = new C0980j();
        this.f8932a.addChild(this.f8934c);
        this.f8935d = new C0981k(C3489a.f11523j, C3489a.f11523j, false) { // from class: com.tsf.shell.f.f.a.a.e.2
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (C2717e.this.f8937f.f2529id == 0) {
                    C0853a.m10853g().m10542a(C2717e.this.f8937f, C1306b.C1310d.drawer_top_menu_button_voice_search);
                }
            }
        };
        this.f8935d.textures().addElement(this.f8937f);
        this.f8935d.calAABB();
        this.f8935d.setMouseEventListener(new C0937a(this.f8935d) { // from class: com.tsf.shell.f.f.a.a.e.3
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C3359a.f11090d.m2669a(8, true);
            }
        });
        this.f8936e = new C0981k(C0892a.m10742a(170.0f), C0892a.m10742a(61.0f), false) { // from class: com.tsf.shell.f.f.a.a.e.4
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (C2717e.this.f8938g.f2529id == 0) {
                    C0853a.m10853g().m10542a(C2717e.this.f8938g, C1306b.C1310d.allapps_google_icon);
                }
            }
        };
        this.f8936e.position().f2527y = C0892a.m10742a(-5.0f);
        this.f8936e.textures().addElement(this.f8938g);
        this.f8934c.addChild(this.f8936e);
        this.f8934c.addChild(this.f8935d);
        addChild(this.f8932a);
        this.f8932a.position().f2527y = -C0892a.m10742a(100.0f);
    }

    @Override // com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        this.f8936e.position().f2526x = ((-i) / 2.0f) + C0892a.m10742a(40.0f) + (this.f8936e.mo10366b() / 2.0f);
        this.f8935d.position().f2526x = (i / 2.0f) - C3489a.f11523j;
        this.f8933b.mo10368a(i);
        m10615d(f8931h);
        this.f8933b.calAABB();
    }

    /* renamed from: e */
    public void m4836e() {
        C0853a.m10853g().m10543a(this.f8937f);
        C0853a.m10853g().m10543a(this.f8938g);
    }

    /* renamed from: f */
    public void m4835f() {
        this.f8932a.position().f2527y = (-C0892a.m10742a(100.0f)) + C2695c.f8876a;
        this.f8932a.alpha(0.0f);
        C1017d c1017d = new C1017d();
        c1017d.m10314a(255);
        c1017d.m10313a(C0986a.f2959n);
        c1017d.mo10298h(-C0892a.m10742a(100.0f));
        C1014c.m10326a(this.f8932a);
        C1014c.m10325a(this.f8932a, 750, c1017d);
    }
}
