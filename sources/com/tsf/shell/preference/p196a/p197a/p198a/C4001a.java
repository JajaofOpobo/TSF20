package com.tsf.shell.preference.p196a.p197a.p198a;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
/* renamed from: com.tsf.shell.preference.a.a.a.a */
/* loaded from: classes.dex */
public class C4001a extends C4017h {

    /* renamed from: a */
    private TextureElement f13109a;

    /* renamed from: b */
    private C0962a f13110b;

    /* renamed from: d */
    private C0980j f13111d;

    /* renamed from: e */
    private C0980j f13112e;

    /* renamed from: f */
    private TextureElement f13113f;

    /* renamed from: g */
    private float f13114g;

    /* renamed from: h */
    private float f13115h;

    /* renamed from: i */
    private float f13116i;

    /* renamed from: j */
    private boolean f13117j;

    /* renamed from: k */
    private Runnable f13118k;

    /* renamed from: l */
    private Runnable f13119l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.preference.a.a.a.a$a */
    /* loaded from: classes.dex */
    public class C4004a extends C0981k {

        /* renamed from: d */
        private C0984m f13123d;

        /* renamed from: e */
        private float f13124e;

        public C4004a(String str) {
            super(C0892a.m10742a(167.0f), C0892a.m10742a(164.0f), false);
            this.f13124e = ((-C0892a.m10742a(164.0f)) / 2.0f) - C0892a.m10742a(20.0f);
            textures().addElement(C4001a.this.f13113f);
            this.f13123d = new C0984m();
            this.f13123d.m10347d(30);
            this.f13123d.m10355a(str);
            addChild(this.f13123d);
            this.f13123d.alpha(0.0f);
        }

        /* renamed from: a */
        public void m910a(int i) {
            C1017d c1017d = new C1017d();
            c1017d.m10314a(255);
            c1017d.m10309b(i);
            C1014c.m10326a(this);
            C1014c.m10325a(this, 500, c1017d);
            C1017d c1017d2 = new C1017d();
            c1017d2.m10314a(255);
            c1017d2.mo10298h(this.f13124e);
            c1017d2.m10309b(i + VEasing.Linear.easeNone);
            c1017d2.m10313a(C0986a.f2946a);
            C1014c.m10326a(this.f13123d);
            C1014c.m10325a(this.f13123d, 500, c1017d2);
        }

        /* renamed from: b */
        public void m909b(int i) {
            C1017d c1017d = new C1017d();
            c1017d.m10314a(0);
            c1017d.m10309b(i + VEasing.Linear.easeNone);
            C1014c.m10326a(this);
            C1014c.m10325a(this, 500, c1017d);
            C1017d c1017d2 = new C1017d();
            c1017d2.m10314a(0);
            c1017d2.mo10298h(0.0f);
            c1017d2.m10309b(i);
            C1014c.m10326a(this.f13123d);
            C1014c.m10325a(this.f13123d, 500, c1017d2);
        }

        /* renamed from: a */
        public void m911a() {
            this.f13123d.m10358a();
        }
    }

    public C4001a(String str) {
        super(str, C0892a.m10742a(175.0f));
        this.f13109a = new TextureElement(0, false);
        this.f13113f = new TextureElement(0, false);
        this.f13117j = false;
        this.f13111d = new C0980j();
        this.f13112e = new C0980j();
        this.f13110b = new C0962a(12, 100, 300, (int) VEasing.Linear.easeNone);
        int m10742a = (int) C0892a.m10742a(100.0f);
        int m10742a2 = (int) C0892a.m10742a(10.0f);
        float f = (-((m10742a * 6) + (m10742a2 * 5))) / 2.0f;
        float f2 = ((m10742a * 2) + m10742a2) / 2.0f;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 12) {
                break;
            }
            C0964b m10456a = this.f13110b.m10456a(11 - i2);
            m10456a.m10437a(i2 % 3, i2 / 3, 1, 1, m10742a, m10742a);
            int i3 = i2 % 6;
            int i4 = i2 / 6;
            if (i3 % 2 == 0) {
                i4 = 1 - i4;
            }
            m10456a.m10407i().f2526x = (i3 * (m10742a + m10742a2)) + f + (m10742a / 2.0f);
            m10456a.m10407i().f2527y = (f2 - (i4 * (m10742a + m10742a2))) - (m10742a / 2.0f);
            Number3d number3d = new Number3d();
            number3d.setAllFrom(m10456a.f2853m);
            m10456a.m10408h();
            m10456a.m10434a(number3d);
            i = i2 + 1;
        }
        this.f13111d.addChild(this.f13110b);
        m890e().addChild(this.f13112e);
        m890e().addChild(this.f13111d);
        this.f13110b.textures().addElement(this.f13109a);
        this.f13114g = C0892a.m10742a(120.0f);
        this.f13115h = C0892a.m10742a(40.0f);
        this.f13116i = ((-((this.f13114g * 4.0f) + (this.f13115h * 3.0f))) / 2.0f) + (this.f13114g / 2.0f);
        String[] strArr = {"Social", "Games", "Lifestyle", "Tools"};
        for (int i5 = 0; i5 < 4; i5++) {
            C4004a c4004a = new C4004a(strArr[i5]);
            c4004a.alpha(0.0f);
            c4004a.position().f2526x = this.f13116i + (i5 * (this.f13114g + this.f13115h));
            this.f13112e.addChild(c4004a);
        }
        this.f13118k = new Runnable() { // from class: com.tsf.shell.preference.a.a.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (C4001a.this.f13117j) {
                    C4001a.this.m913h();
                    C0853a.m10865a().m10584b(C4001a.this.f13119l, 4000L);
                }
            }
        };
        this.f13119l = new Runnable() { // from class: com.tsf.shell.preference.a.a.a.a.2
            @Override // java.lang.Runnable
            public void run() {
                C4001a.this.m912m();
                C0853a.m10865a().m10584b(C4001a.this.f13118k, 4000L);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m913h() {
        float m10742a = C0892a.m10742a(-20.0f);
        float m10742a2 = C0892a.m10742a(-20.0f);
        float m10742a3 = C0892a.m10742a(0.0f);
        float m10742a4 = C0892a.m10742a(0.0f);
        float m10742a5 = C0892a.m10742a(20.0f);
        float m10742a6 = C0892a.m10742a(20.0f);
        for (int i = 0; i < 12; i++) {
            C0964b m10456a = this.f13110b.m10456a(i);
            int i2 = i % 3;
            float f = ((i / 3) * (this.f13115h + this.f13114g)) + this.f13116i;
            C1017d c1017d = new C1017d();
            switch (i2) {
                case 0:
                    c1017d.mo10301f(f + m10742a5);
                    c1017d.mo10298h(m10742a6 + 0.0f);
                    c1017d.m10294l(0.8f);
                    c1017d.m10293m(0.8f);
                    break;
                case 1:
                    c1017d.mo10301f(f + m10742a3);
                    c1017d.mo10298h(m10742a4 + 0.0f);
                    c1017d.m10294l(0.9f);
                    c1017d.m10293m(0.9f);
                    break;
                case 2:
                    c1017d.mo10301f(f + m10742a);
                    c1017d.mo10298h(m10742a2 + 0.0f);
                    break;
            }
            C1014c.m10326a(m10456a);
            C1014c.m10325a(m10456a, 1000, c1017d);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 < 4) {
                ((C4004a) this.f13112e.getChildAt(i4)).m910a(800);
                i3 = i4 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m912m() {
        for (int i = 0; i < 12; i++) {
            C0964b m10456a = this.f13110b.m10456a(i);
            Number3d number3d = (Number3d) m10456a.m10444a();
            C1017d c1017d = new C1017d();
            c1017d.mo10301f(number3d.f2526x);
            c1017d.mo10298h(number3d.f2527y);
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            C1014c.m10326a(m10456a);
            C1014c.m10325a(m10456a, 1000, c1017d);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            ((C4004a) this.f13112e.getChildAt(i2)).m909b(0);
        }
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        int i = 0;
        super.mo538g();
        this.f13117j = false;
        C0853a.m10853g().m10543a(this.f13109a);
        C0853a.m10853g().m10543a(this.f13113f);
        while (true) {
            int i2 = i;
            if (i2 < 4) {
                ((C4004a) this.f13112e.getChildAt(i2)).m911a();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.preference.p196a.p197a.p198a.C4017h, com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
        super.mo539f();
        this.f13117j = true;
        if (this.f13109a.f2529id == 0) {
            C0853a.m10853g().m10542a(this.f13109a, C1306b.C1310d.feature_auto_classify_icon);
        }
        if (this.f13113f.f2529id == 0) {
            C0853a.m10853g().m10542a(this.f13113f, C1306b.C1310d.feature_auto_classify_folder);
        }
        C0853a.m10865a().m10584b(this.f13118k, 1000L);
    }
}
