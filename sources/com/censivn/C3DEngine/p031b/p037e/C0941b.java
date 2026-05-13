package com.censivn.C3DEngine.p031b.p037e;

import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.p034a.C0895b;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.e.b */
/* loaded from: classes.dex */
public class C0941b extends C0952g {

    /* renamed from: a */
    public static final int f2747a = C0892a.m10735b(58.0f);

    /* renamed from: b */
    public static final TextureElement f2748b = new TextureElement(0, false);

    /* renamed from: d */
    private C0942a f2749d;

    /* renamed from: e */
    private C0895b f2750e;

    /* renamed from: f */
    private C0943b f2751f;

    /* renamed from: com.censivn.C3DEngine.b.e.b$a */
    /* loaded from: classes.dex */
    public static class C0942a {
        /* renamed from: a */
        public void mo857a(int i) {
        }
    }

    public C0941b() {
        m10524h();
    }

    @Override // com.censivn.C3DEngine.p031b.p033b.C0908c, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onChildMeasure(C0975i c0975i) {
        c0975i.position().f2526x = (-c0975i.maxX()) / 2.0f;
    }

    /* renamed from: a */
    public void m10530a(C0942a c0942a) {
        this.f2749d = c0942a;
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
    }

    /* renamed from: e */
    public int m10527e() {
        return m10529a(this.f2751f);
    }

    /* renamed from: f */
    public void m10526f(int i) {
        if (i > -1 && i < numChildren()) {
            m10528a((C0943b) this.f2750e.getChildAt(i), false);
        }
    }

    /* renamed from: a */
    public void m10528a(C0943b c0943b, boolean z) {
        if (this.f2751f != null) {
            this.f2751f.m10519b();
        }
        this.f2751f = c0943b;
        this.f2751f.m10523a();
        int m10529a = m10529a(this.f2751f);
        if (z && this.f2749d != null) {
            this.f2749d.mo857a(m10529a);
        }
    }

    /* renamed from: a */
    private int m10529a(C0943b c0943b) {
        return this.f2750e.children().indexOf(c0943b);
    }

    /* renamed from: h */
    private void m10524h() {
        this.f2750e = new C0895b();
        this.f2750e.position().f2527y = (-m10621b()) / 2.0f;
        addChild(this.f2750e);
        this.f2750e.position().f2526x = (-this.f2750e.maxX()) / 2.0f;
    }

    /* renamed from: g */
    public void m10525g(int i) {
        C0943b c0943b = new C0943b();
        c0943b.m10522a(i);
        this.f2750e.addChild(c0943b);
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.C0952g, com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        super.mo544c(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.censivn.C3DEngine.b.e.b$b */
    /* loaded from: classes.dex */
    public class C0943b extends C0980j {

        /* renamed from: b */
        private C0962a f2753b;

        /* renamed from: c */
        private C0984m f2754c = new C0984m();

        /* renamed from: d */
        private C0964b f2755d;

        /* renamed from: e */
        private C0964b f2756e;

        public C0943b() {
            this.f2754c.m10347d(50);
            this.f2754c.position().f2526x = C0941b.f2747a + C0892a.m10742a(20.0f);
            this.f2754c.m10352b(1);
            this.f2753b = new C0962a(2, C0941b.f2747a, C0941b.f2747a * 2, C0941b.f2747a);
            this.f2753b.position().f2526x = C0941b.f2747a / 2.0f;
            this.f2755d = this.f2753b.m10456a(0);
            this.f2755d.m10428b(0, 0, 1, 1);
            this.f2755d.m10408h();
            this.f2756e = this.f2753b.m10456a(1);
            this.f2756e.m10428b(1, 0, 1, 1);
            this.f2756e.m10408h();
            this.f2753b.textures().addElement(C0941b.f2748b);
            addChild(this.f2753b);
            addChild(this.f2754c);
            m10518b(false);
            setMouseEventListener(new C0937a(this) { // from class: com.censivn.C3DEngine.b.e.b.b.1
                @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
                /* renamed from: a */
                public void mo502a(MotionEvent motionEvent) {
                    C0941b.this.m10528a(C0943b.this, true);
                }
            });
        }

        /* renamed from: a */
        public void m10522a(int i) {
            m10521a(C4189x.m588c(i));
        }

        /* renamed from: a */
        public void m10521a(String str) {
            this.f2754c.m10355a(str);
            this.f2754c.m10353b();
            setAABBPX(0.0f, ((-C0941b.f2747a) / 2.0f) * 1.5f, 0.0f, this.f2754c.position().f2526x + this.f2754c.maxX() + C0892a.m10742a(50.0f), 1.5f * (C0941b.f2747a / 2.0f), 0.0f);
            notifLayoutRefresh();
        }

        /* renamed from: a */
        public void m10523a() {
            m10520a(true);
        }

        /* renamed from: a */
        public void m10520a(boolean z) {
            if (z) {
                C1017d c1017d = new C1017d();
                c1017d.m10294l(1.0f);
                c1017d.m10293m(1.0f);
                c1017d.m10313a(C0986a.f2946a);
                C1014c.m10326a(this.f2756e);
                C1014c.m10325a(this.f2756e, VEasing.Back.easeIn, c1017d);
                return;
            }
            this.f2756e.m10405k().f2526x = 1.0f;
            this.f2756e.m10405k().f2527y = 1.0f;
            this.f2756e.m10411f();
        }

        /* renamed from: b */
        public void m10519b() {
            m10518b(true);
        }

        /* renamed from: b */
        public void m10518b(boolean z) {
            if (z) {
                C1017d c1017d = new C1017d();
                c1017d.m10294l(0.0f);
                c1017d.m10293m(0.0f);
                C1014c.m10326a(this.f2756e);
                C1014c.m10325a(this.f2756e, VEasing.Back.easeIn, c1017d);
                return;
            }
            this.f2756e.m10405k().f2526x = 0.0f;
            this.f2756e.m10405k().f2527y = 0.0f;
            this.f2756e.m10411f();
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            if (C0941b.f2748b.f2529id == 0) {
                C0853a.m10853g().m10542a(C0941b.f2748b, C1306b.C1310d.preference_radio);
            }
        }
    }
}
