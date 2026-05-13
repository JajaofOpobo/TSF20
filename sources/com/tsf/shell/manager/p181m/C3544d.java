package com.tsf.shell.manager.p181m;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p118e.InterfaceC2557f;
import com.tsf.shell.p096f.p118e.p125e.C2554d;
/* renamed from: com.tsf.shell.manager.m.d */
/* loaded from: classes.dex */
public class C3544d extends C2554d {

    /* renamed from: b */
    private TextureElement f11691b;

    /* renamed from: e */
    private C0981k f11694e;

    /* renamed from: f */
    private C3529b f11695f;

    /* renamed from: h */
    private double f11697h;

    /* renamed from: g */
    private double f11696g = 0.10471975511965977d;

    /* renamed from: j */
    private boolean f11699j = false;

    /* renamed from: i */
    private C1013b f11698i = new C1013b();

    /* renamed from: a */
    private TextureElement f11690a = new TextureElement(0, false);

    /* renamed from: c */
    private C0980j f11692c = new C2554d();

    /* renamed from: d */
    private C0981k f11693d = new C0981k(C0892a.m10742a(24.0f), C0892a.m10742a(45.0f), false) { // from class: com.tsf.shell.manager.m.d.1
        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            if (C3544d.this.f11690a.f2529id == 0) {
                C0853a.m10853g().m10542a(C3544d.this.f11690a, C1306b.C1310d.scrollcontainer_arrow);
            }
        }
    };

    public C3544d(C3529b c3529b) {
        this.f11695f = c3529b;
        this.f11693d.textures().addElement(this.f11690a);
        C0937a c0937a = new C0937a(this.f11693d) { // from class: com.tsf.shell.manager.m.d.2
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C3544d.this.f11695f.m2081l();
            }
        };
        this.f11693d.alpha(200.0f);
        this.f11693d.calAABB(8.0f, 8.0f, 1.0f);
        this.f11693d.setMouseEventListener(c0937a);
        C3359a.f11097k.m2295b(this);
        this.f11691b = new TextureElement(0, false);
        this.f11694e = new C0981k(C0892a.m10742a(70.0f), C0892a.m10742a(70.0f), false) { // from class: com.tsf.shell.manager.m.d.3
            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                if (C3544d.this.f11691b.f2529id == 0) {
                    C0853a.m10853g().m10542a(C3544d.this.f11691b, C1306b.C1310d.side_menu_add_button);
                }
                float sin = 0.8f + ((float) (Math.sin(C3544d.this.f11697h) * 0.20000000298023224d));
                C3544d.this.f11697h += C3544d.this.f11696g;
                scale().setAll(sin, sin, 1.0f);
            }
        };
        this.f11694e.textures().addElement(this.f11691b);
        this.f11692c.position().f2526x = C0892a.m10742a(28.0f);
        addChild(this.f11693d);
        addChild(this.f11692c);
        this.f11692c.addChild(this.f11694e);
        this.f11692c.visible(false);
        calAABB();
    }

    @Override // com.tsf.shell.p096f.p118e.p125e.C2554d, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: b */
    public boolean mo2057b(InterfaceC2557f interfaceC2557f) {
        return mo2057b(interfaceC2557f);
    }

    @Override // com.tsf.shell.p096f.p118e.p125e.C2554d, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    public boolean mo2061a(InterfaceC2557f interfaceC2557f, float f, float f2) {
        return mo2061a(interfaceC2557f, f, f2);
    }

    @Override // com.tsf.shell.p096f.p118e.p125e.C2554d, com.tsf.shell.p096f.p118e.InterfaceC2557f
    /* renamed from: a */
    public void mo2062a(InterfaceC2557f interfaceC2557f) {
        mo2062a(interfaceC2557f);
    }

    /* renamed from: a */
    public void m2063a(final float f, boolean z) {
        C1014c.m10326a(this.f11698i);
        if (z) {
            final float f2 = this.f11693d.rotation().f2528z;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.m.d.4
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f3) {
                    C3544d.this.f11693d.rotation().f2528z = f2 + ((f - f2) * f3);
                }
            };
            c1017d.m10313a(C0986a.f2950e);
            C1014c.m10325a(this.f11698i, 500, c1017d);
            return;
        }
        this.f11693d.rotation().f2528z = f;
    }

    /* renamed from: d_ */
    public void m2052d_() {
        if (!this.f11699j) {
            this.f11699j = true;
            if (!this.f11692c.visible()) {
                this.f11692c.alpha(0.0f);
                this.f11692c.scale().setAll(0.0f, 0.0f, 1.0f);
            }
            this.f11692c.visible(true);
            C1017d c1017d = new C1017d();
            c1017d.m10314a(255);
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            C1014c.m10326a(this.f11692c);
            C1014c.m10325a(this.f11692c, 300, c1017d);
            C1017d c1017d2 = new C1017d();
            c1017d2.mo10301f(C0892a.m10742a(100.0f));
            c1017d2.m10314a(0);
            C1014c.m10326a(this.f11693d);
            C1014c.m10325a(this.f11693d, 300, c1017d2);
        }
    }

    /* renamed from: b */
    public void m2058b() {
        if (this.f11699j) {
            this.f11699j = false;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.m.d.5
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3544d.this.f11692c.visible(false);
                }
            };
            c1017d.m10314a(0);
            c1017d.m10294l(0.0f);
            c1017d.m10293m(0.0f);
            C1014c.m10326a(this.f11692c);
            C1014c.m10325a(this.f11692c, 300, c1017d);
            C1017d c1017d2 = new C1017d();
            c1017d2.mo10301f(0.0f);
            c1017d2.m10314a(VEasing.Back.easeIn);
            C1014c.m10326a(this.f11693d);
            C1014c.m10325a(this.f11693d, 300, c1017d2);
        }
    }

    /* renamed from: c */
    public void m2055c() {
        if (this.f11690a.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f11690a);
        }
        if (this.f11691b.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f11691b);
        }
    }
}
