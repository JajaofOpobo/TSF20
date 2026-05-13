package com.tsf.shell.preference.p196a.p197a;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p037e.AbstractC0951f;
import com.censivn.C3DEngine.p031b.p037e.C0938a;
import com.censivn.C3DEngine.p031b.p037e.C0950e;
import com.censivn.C3DEngine.p031b.p037e.C0952g;
import com.censivn.C3DEngine.p031b.p037e.C0953h;
import com.censivn.C3DEngine.p031b.p037e.C0956i;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p181m.C3529b;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.preference.a.a.h */
/* loaded from: classes.dex */
public class C4071h extends C0956i {

    /* renamed from: a */
    private C4075a f13264a;

    /* renamed from: b */
    private C0950e f13265b;

    /* renamed from: c */
    private C0938a f13266c;

    /* renamed from: d */
    private boolean f13267d;

    /* renamed from: e */
    private boolean f13268e;

    /* renamed from: h */
    private float f13271h = 0.5f;

    /* renamed from: f */
    private TextureElement f13269f = new TextureElement(0, false);

    /* renamed from: g */
    private C0981k f13270g = new C0981k(C0892a.m10742a(24.0f), C0892a.m10742a(45.0f), false) { // from class: com.tsf.shell.preference.a.a.h.1
        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            if (C4071h.this.f13269f.f2529id == 0) {
                C0853a.m10853g().m10542a(C4071h.this.f13269f, C1306b.C1310d.scrollcontainer_arrow);
            }
        }
    };

    public C4071h() {
        this.f13270g.textures().addElement(this.f13269f);
        this.f13270g.alpha(200.0f);
        m10516a(C1306b.C1315i.text_preferences);
        this.f13266c = new C0938a();
        this.f13266c.m10488h(C1306b.C1315i.text_enable);
        this.f13266c.m10538a(new C0938a.C0940a() { // from class: com.tsf.shell.preference.a.a.h.2
            @Override // com.censivn.C3DEngine.p031b.p037e.C0938a.C0940a
            /* renamed from: a */
            public boolean mo551a(boolean z) {
                C4071h.this.f13267d = z;
                C3359a.f11100n.m2101a(C4071h.this.f13267d);
                C4071h.this.m829k();
                C4071h.this.m831i();
                return true;
            }
        });
        mo838b(this.f13266c);
        this.f13264a = new C4075a();
        this.f13264a.m10488h(C1306b.C1315i.text_direction);
        mo838b(this.f13264a);
        C0950e c0950e = new C0950e();
        this.f13265b = c0950e;
        c0950e.m10472g(C1306b.C1315i.text_position);
        c0950e.m10469i(0);
        c0950e.m10468j(100);
        c0950e.m10484a(new C0953h.C0955a() { // from class: com.tsf.shell.preference.a.a.h.3
            @Override // com.censivn.C3DEngine.p031b.p037e.C0953h.C0955a
            /* renamed from: a */
            public boolean mo733a(int i) {
                C4071h.this.f13271h = i / 100.0f;
                if (C0892a.f2564O) {
                    C3359a.f11100n.m2111a(C4071h.this.f13271h);
                } else {
                    C3359a.f11100n.m2099b(C4071h.this.f13271h);
                }
                C4071h.this.m831i();
                return true;
            }
        });
        mo838b(c0950e);
        addChild(this.f13270g);
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0956i
    /* renamed from: b */
    public void mo838b(AbstractC0951f abstractC0951f) {
        super.m10464a(abstractC0951f, C0892a.m10742a(50.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m831i() {
        this.f13270g.visible(Boolean.valueOf(this.f13267d));
        if (this.f13264a.m825e() == 0) {
            this.f13270g.position().f2526x = C0892a.f2590z + C0892a.m10742a(30.0f);
            this.f13270g.rotation().f2528z = 0.0f;
        } else {
            this.f13270g.position().f2526x = C0892a.f2550A - C0892a.m10742a(30.0f);
            this.f13270g.rotation().f2528z = 180.0f;
        }
        float f = C0892a.f2551B - C3529b.f11654b;
        float f2 = (C0892a.f2551B - C0892a.f2552C) - (2.0f * C3529b.f11654b);
        this.f13270g.position().f2527y = f - (f2 * this.f13271h);
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: h */
    public void mo832h() {
        super.mo832h();
        m830j();
        m831i();
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: f */
    public void mo553f() {
        boolean m2462h = C3430e.m2462h();
        this.f13268e = m2462h;
        this.f13267d = m2462h;
        this.f13266c.m10535c(this.f13267d);
        this.f13264a.m823f(C3359a.f11100n.m2092d());
        m831i();
        m829k();
        m830j();
    }

    /* renamed from: j */
    private void m830j() {
        if (C0892a.f2564O) {
            this.f13265b.m10479b(C4189x.m588c(C1306b.C1315i.text_position) + " (" + C4189x.m588c(C1306b.C1315i.text_vertical) + ")");
            this.f13271h = C3359a.f11100n.m2112a();
        } else {
            this.f13265b.m10479b(C4189x.m588c(C1306b.C1315i.text_position) + " (" + C4189x.m588c(C1306b.C1315i.text_horizontal) + ")");
            this.f13271h = C3359a.f11100n.m2095c();
        }
        this.f13265b.mo865k((int) (this.f13271h * 100.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m829k() {
        if (this.f13267d) {
            this.f13264a.mo820j();
            this.f13265b.mo820j();
            return;
        }
        this.f13264a.mo821i();
        this.f13265b.mo821i();
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: c */
    public void mo836c() {
        if (this.f13269f.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f13269f);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0945c
    /* renamed from: g */
    public void mo552g() {
        if (this.f13267d != this.f13268e) {
            C3430e.m2491b(this.f13267d);
        }
        C3359a.f11100n.m2110a(this.f13264a.m825e(), true);
        C3359a.f11100n.m2085h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.preference.a.a.h$a */
    /* loaded from: classes.dex */
    public class C4075a extends C0952g {

        /* renamed from: b */
        private C0981k f13276b;

        /* renamed from: d */
        private TextureElement f13277d;

        /* renamed from: e */
        private int f13278e = 0;

        public C4075a() {
            m822h();
        }

        /* renamed from: f */
        public void m823f(int i) {
            this.f13278e = i;
            m819m();
        }

        /* renamed from: e */
        public int m825e() {
            return this.f13278e;
        }

        @Override // com.censivn.C3DEngine.p031b.p037e.C0952g, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
        /* renamed from: i */
        public void mo821i() {
            super.mo821i();
            this.f13276b.alpha(100.0f);
        }

        @Override // com.censivn.C3DEngine.p031b.p037e.C0952g, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
        /* renamed from: j */
        public void mo820j() {
            super.mo820j();
            this.f13276b.alpha(255.0f);
        }

        @Override // com.censivn.C3DEngine.p031b.p037e.C0952g, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
        /* renamed from: f */
        public void mo539f() {
            super.mo539f();
        }

        @Override // com.censivn.C3DEngine.p031b.p037e.C0952g, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
        /* renamed from: g */
        public void mo538g() {
            super.mo538g();
            if (this.f13277d.f2529id != 0) {
                C0853a.m10853g().m10543a(this.f13277d);
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            super.onDrawStart();
            if (this.f13277d.f2529id == 0) {
                Bitmap m608a = C4189x.m608a(C1306b.C1310d.preference_side_menu_direction_icon, C0892a.m10742a(90.0f), C0892a.m10742a(120.0f));
                C0853a.m10853g().m10540a(this.f13277d, m608a);
                m608a.recycle();
            }
        }

        /* renamed from: h */
        private void m822h() {
            this.f13276b = C0892a.m10741a(90.0f, 120.0f);
            this.f13277d = new TextureElement(0, false);
            this.f13276b.textures().addElement(this.f13277d);
            this.f13276b.position().f2527y = (-m10621b()) / 2.0f;
            addChild(this.f13276b);
            setMouseEventListener(new C0937a(this) { // from class: com.tsf.shell.preference.a.a.h.a.1
                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo502a(MotionEvent motionEvent) {
                    if (C4075a.this.f13278e == 0) {
                        C4075a.this.f13278e = 1;
                    } else {
                        C4075a.this.f13278e = 0;
                    }
                    C3359a.f11100n.m2110a(C4075a.this.f13278e, false);
                    C4075a.this.m819m();
                    C4071h.this.m831i();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public void m819m() {
            if (this.f13278e == 0) {
                this.f13276b.rotation().f2528z = 0.0f;
            } else {
                this.f13276b.rotation().f2528z = 180.0f;
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p037e.C0952g, com.censivn.C3DEngine.p031b.p033b.C0908c
        /* renamed from: c */
        public void mo544c(int i) {
            super.mo544c(i);
            if (this.f13276b != null) {
                this.f13276b.position().f2526x = (i / 2.0f) - (this.f13276b.mo10366b() / 2.0f);
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p033b.C0908c
        /* renamed from: e */
        public void mo824e(int i) {
            super.mo824e(i);
            if (this.f13276b != null) {
                this.f13276b.position().f2527y = (-i) / 2.0f;
            }
        }
    }
}
