package com.tsf.shell.p096f.p118e;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.f.e.r */
/* loaded from: classes.dex */
public class C2652r extends C0980j {

    /* renamed from: d */
    private C2654a f8715d;

    /* renamed from: e */
    private C0981k f8716e;

    /* renamed from: a */
    private TextureElement f8712a = new TextureElement(0, false);

    /* renamed from: b */
    private TextureElement f8713b = new TextureElement(0, false);

    /* renamed from: f */
    private boolean f8717f = false;

    /* renamed from: c */
    private ArrayList<C2654a> f8714c = new ArrayList<>();

    /* renamed from: a */
    public void m5061a(int i) {
        if (!this.f8717f) {
            this.f8717f = true;
            if (this.f8712a.f2529id == 0) {
                C0853a.m10853g().m10540a(this.f8712a, C4189x.m609a(C1306b.C1310d.shell_number));
            }
            if (this.f8713b.f2529id == 0) {
                C0853a.m10853g().m10540a(this.f8713b, C4189x.m609a(C1306b.C1310d.shell_number_bg));
            }
            if (this.f8716e == null) {
                this.f8716e = new C0981k(252.0f * C0892a.f2567c, 162.0f * C0892a.f2567c, false);
                this.f8716e.alpha(0.0f);
                addChild(this.f8716e);
            }
            this.f8716e.textures().clear();
            this.f8716e.textures().addElement(this.f8713b);
            C1017d c1017d = new C1017d();
            c1017d.m10314a(255);
            C1014c.m10326a(this.f8716e);
            C1014c.m10325a(this.f8716e, VEasing.Back.easeIn, c1017d);
            if (parent() == null) {
                C3359a.f11096j.m2232a(this);
            }
            m5056b(i);
        }
    }

    /* renamed from: a */
    public void m5062a() {
        if (this.f8717f) {
            this.f8717f = false;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.r.1
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3359a.f11096j.m2223b(C2652r.this);
                    if (C2652r.this.f8712a.f2529id != 0) {
                        C0853a.m10853g().m10543a(C2652r.this.f8712a);
                    }
                    if (C2652r.this.f8713b.f2529id != 0) {
                        C0853a.m10853g().m10543a(C2652r.this.f8713b);
                    }
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(this.f8716e);
            C1014c.m10325a(this.f8716e, VEasing.Back.easeIn, c1017d);
            if (this.f8715d != null) {
                this.f8715d.m5052b(0);
                this.f8715d = null;
            }
        }
    }

    /* renamed from: b */
    public void m5056b(int i) {
        boolean z;
        if (this.f8715d == null || this.f8715d.f8725h != i) {
            if (this.f8715d != null) {
                this.f8715d.m5051c();
                z = false;
            } else {
                z = true;
            }
            this.f8715d = m5057b();
            this.f8715d.m5054a(z ? 0 : 1, i);
        }
    }

    /* renamed from: b */
    private C2654a m5057b() {
        C2654a remove;
        if (this.f8714c.isEmpty()) {
            remove = new C2654a();
        } else {
            remove = this.f8714c.remove(0);
        }
        remove.textures().clear();
        remove.textures().addElement(this.f8712a);
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5060a(C2654a c2654a) {
        c2654a.removeFromParent();
        c2654a.textures().clear();
        this.f8714c.add(c2654a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.f.e.r$a */
    /* loaded from: classes.dex */
    public class C2654a extends C0962a {

        /* renamed from: c */
        private C0964b f8720c;

        /* renamed from: d */
        private C0964b f8721d;

        /* renamed from: e */
        private float f8722e;

        /* renamed from: f */
        private float f8723f;

        /* renamed from: g */
        private int f8724g;

        /* renamed from: h */
        private int f8725h;

        public C2654a() {
            super(2, 80, (int) VEasing.Linear.easeNone, 160);
            this.f8724g = 0;
            this.f8720c = m10456a(0);
            this.f8720c.m10438a(0, 0, 1, 1, 80.0f * C0892a.f2567c, 80.0f * C0892a.f2567c);
            this.f8720c.m10408h();
            this.f8721d = m10456a(1);
            this.f8721d.m10438a(0, 0, 1, 1, 80.0f * C0892a.f2567c, 80.0f * C0892a.f2567c);
            this.f8721d.m10408h();
            this.f8722e = (-200.0f) * C0892a.f2567c;
            this.f8723f = 200.0f * C0892a.f2567c;
        }

        /* renamed from: c */
        private void m5050c(int i) {
            if (i < 10) {
                this.f8721d.m10435a((Boolean) false);
                this.f8720c.m10407i().f2526x = 0.0f;
                this.f8720c.m10440a(i % 5, i / 5);
            } else {
                int i2 = i / 10;
                int i3 = i - (i2 * 10);
                this.f8721d.m10435a((Boolean) true);
                this.f8720c.m10407i().f2526x = (-40.0f) * C0892a.f2567c;
                this.f8720c.m10440a(i2 % 5, i2 / 5);
                this.f8721d.m10407i().f2526x = 40.0f * C0892a.f2567c;
                this.f8721d.m10440a(i3 % 5, i3 / 5);
            }
            this.f8720c.m10408h();
            this.f8721d.m10408h();
        }

        /* renamed from: a */
        public void m5054a(int i, int i2) {
            this.f8725h = i2;
            this.f8724g = i;
            alpha(0.0f);
            m5050c(i2);
            C1017d c1017d = new C1017d();
            switch (i) {
                case 0:
                    position().f2526x = 0.0f;
                    break;
                case 1:
                    position().f2526x = this.f8722e;
                    break;
                case 2:
                    position().f2526x = this.f8723f;
                    break;
            }
            c1017d.mo10301f(0.0f);
            c1017d.m10314a(255);
            C1014c.m10326a(this);
            C1014c.m10325a(this, VEasing.Back.easeIn, c1017d);
            C2652r.this.addChild(this);
        }

        /* renamed from: c */
        public void m5051c() {
            m5052b(this.f8724g);
        }

        /* renamed from: b */
        public void m5052b(int i) {
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.e.r.a.1
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2652r.this.m5060a(C2654a.this);
                }
            };
            switch (i) {
                case 0:
                    c1017d.mo10301f(0.0f);
                    break;
                case 1:
                    c1017d.mo10301f(this.f8723f);
                    break;
                case 2:
                    c1017d.mo10301f(this.f8722e);
                    break;
            }
            c1017d.m10314a(0);
            C1014c.m10326a(this);
            C1014c.m10325a(this, VEasing.Back.easeIn, c1017d);
        }
    }
}
