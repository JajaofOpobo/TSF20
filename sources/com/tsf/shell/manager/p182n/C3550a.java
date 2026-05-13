package com.tsf.shell.manager.p182n;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.ShaderColor;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p035c.C0925e;
import com.censivn.C3DEngine.p031b.p038f.C0974h;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.manager.p183o.p184a.C3561a;
import java.nio.Buffer;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.manager.n.a */
/* loaded from: classes.dex */
public class C3550a implements C0925e.InterfaceC0934a {

    /* renamed from: a */
    private C0980j f11707a;

    /* renamed from: b */
    private C0980j f11708b;

    /* renamed from: c */
    private C0974h f11709c;

    /* renamed from: d */
    private boolean f11710d;

    /* renamed from: e */
    private float f11711e;

    /* renamed from: g */
    private float f11713g;

    /* renamed from: h */
    private float f11714h;

    /* renamed from: i */
    private float f11715i;

    /* renamed from: j */
    private float f11716j;

    /* renamed from: k */
    private float f11717k;

    /* renamed from: l */
    private float f11718l;

    /* renamed from: m */
    private float f11719m;

    /* renamed from: n */
    private float f11720n;

    /* renamed from: o */
    private float f11721o;

    /* renamed from: q */
    private C3558a f11723q;

    /* renamed from: s */
    private C3561a f11725s;

    /* renamed from: r */
    private boolean f11724r = false;

    /* renamed from: t */
    private boolean f11726t = false;

    /* renamed from: p */
    private ArrayList<C3558a> f11722p = new ArrayList<>();

    /* renamed from: f */
    private int f11712f = 1677721600;

    public C3550a() {
        float red = Color.red(this.f11712f);
        this.f11719m = red;
        this.f11716j = red;
        this.f11713g = red;
        float green = Color.green(this.f11712f);
        this.f11720n = green;
        this.f11717k = green;
        this.f11714h = green;
        float blue = Color.blue(this.f11712f);
        this.f11721o = blue;
        this.f11718l = blue;
        this.f11715i = blue;
    }

    /* renamed from: a */
    public void m2046a(int i) {
        this.f11716j = Color.red(i);
        this.f11717k = Color.green(i);
        this.f11718l = Color.blue(i);
        this.f11709c.setAnimationObjectState(true);
        this.f11709c.invalidate();
    }

    /* renamed from: a */
    public void m2048a() {
        this.f11716j = this.f11713g;
        this.f11717k = this.f11714h;
        this.f11718l = this.f11715i;
        this.f11709c.setAnimationObjectState(true);
        this.f11709c.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m2035c() {
        float alpha = (this.f11709c.alpha() / 255.0f) * MatrixStack.glColor().alpha * 0.5f;
        this.f11719m += (this.f11716j - this.f11719m) * 0.1f;
        this.f11720n += (this.f11717k - this.f11720n) * 0.1f;
        this.f11721o += (this.f11718l - this.f11721o) * 0.1f;
        if (m2047a(this.f11719m, this.f11716j) && m2047a(this.f11720n, this.f11717k) && m2047a(this.f11721o, this.f11718l)) {
            this.f11719m = this.f11716j;
            this.f11720n = this.f11717k;
            this.f11721o = this.f11718l;
            this.f11709c.setAnimationObjectState(false);
        }
        float f = (this.f11719m / 255.0f) * alpha;
        float f2 = (this.f11720n / 255.0f) * alpha;
        float f3 = (this.f11721o / 255.0f) * alpha;
        this.f11709c.vertices().colors().set(2, f, f2, f3, alpha);
        this.f11709c.vertices().colors().set(3, f, f2, f3, alpha);
        this.f11709c.vertices().colors().set(0, 0.0f, 0.0f, 0.0f, 0.0f);
        this.f11709c.vertices().colors().set(1, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: a */
    private boolean m2047a(float f, float f2) {
        return Math.abs(f - f2) < 0.3f;
    }

    /* renamed from: b */
    public float m2038b() {
        return this.f11711e;
    }

    /* renamed from: a */
    public void m2045a(C0980j c0980j) {
        this.f11707a = c0980j;
        this.f11708b = new C0980j();
        this.f11711e = 100.0f * C0892a.f2567c;
        this.f11709c = new C0974h(C0892a.f2553D, 1.2f * this.f11711e, false, true) { // from class: com.tsf.shell.manager.n.a.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0974h, com.censivn.C3DEngine.p031b.p038f.C0975i
            public void draw() {
                if (C3550a.this.f11709c.getAnimationObjectState() || C3550a.this.f11724r) {
                    C3550a.this.m2035c();
                }
                C0853a.m10855e().m10774a(this);
                updateTextureState();
                ShaderColor shaderColor = ShaderManager.SHADER_COLOR;
                ShaderManager.enableShader(shaderColor);
                vertices().colors().buffer().position(0);
                GLES20.glEnableVertexAttribArray(shaderColor.maColor4Handle);
                GLES20.glVertexAttribPointer(shaderColor.maColor4Handle, 4, 5126, false, 0, (Buffer) vertices().colors().buffer());
                if (doubleSidedEnabled()) {
                    GLES20.glDisable(2884);
                } else {
                    GLES20.glEnable(2884);
                }
                drawMVPMatrix();
                drawElement();
                GLES20.glDisableVertexAttribArray(shaderColor.maColor4Handle);
                m10374a();
            }
        };
        this.f11709c.moveAllPointsPX(0.0f, (-this.f11709c.m10372b()) / 2.0f, 0.0f);
        this.f11725s = new C3561a();
        this.f11725s.m1988i(-1);
        this.f11725s.m1989h(44);
        this.f11708b.addChild(this.f11709c);
        this.f11708b.alpha(0.0f);
    }

    /* renamed from: a */
    public C3558a m2044a(C3558a c3558a) {
        return m2042a(c3558a, (String) null, 1677721600, 0);
    }

    /* renamed from: a */
    public C3558a m2043a(C3558a c3558a, String str) {
        return m2042a(c3558a, str, 1677721600, 0);
    }

    /* renamed from: a */
    public C3558a m2042a(final C3558a c3558a, String str, int i, int i2) {
        m2033d();
        if (this.f11723q != null) {
            this.f11723q.m2024a(false);
            this.f11723q = null;
        }
        if (c3558a == null) {
            c3558a = m2039a(str);
        } else {
            c3558a.m2025a(str);
        }
        this.f11723q = c3558a;
        this.f11722p.remove(this.f11723q);
        this.f11722p.add(this.f11723q);
        m2048a();
        this.f11723q.m2026a(i);
        if (i2 != 0) {
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.n.a.2
                @Override // java.lang.Runnable
                public void run() {
                    c3558a.f11735a = null;
                    C3550a.this.m2037b(c3558a);
                }
            };
            C0853a.m10865a().m10584b(runnable, i2);
            if (c3558a.f11735a != null) {
                C0853a.m10865a().m10578g(c3558a.f11735a);
            }
            c3558a.f11735a = runnable;
        }
        return this.f11723q;
    }

    /* renamed from: b */
    public void m2037b(C3558a c3558a) {
        if (c3558a != null) {
            if (c3558a == this.f11723q) {
                this.f11723q.m2024a(true);
            } else {
                c3558a.m2023d();
            }
            this.f11722p.remove(c3558a);
            if (this.f11722p.isEmpty()) {
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.n.a.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C3550a.this.m2031e();
                    }
                });
                return;
            }
            this.f11723q = this.f11722p.get(this.f11722p.size() - 1);
            this.f11723q.m2027a();
        }
    }

    /* renamed from: a */
    private C3558a m2039a(String str) {
        return new C3558a(str);
    }

    /* renamed from: d */
    private void m2033d() {
        if (!this.f11726t) {
            this.f11726t = true;
            C3359a.f11088b.m10565a(this);
            this.f11708b.removeFromParent();
            this.f11707a.addChild(this.f11708b);
            this.f11709c.m10373a(C0892a.f2553D);
            this.f11710d = C3359a.f11088b.m10553c();
            if (!this.f11710d) {
                this.f11708b.position().f2527y = C0892a.f2558I;
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.manager.n.a.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!C3359a.f11088b.m10553c()) {
                            C3359a.f11088b.m10561a(true, false, false);
                        }
                    }
                });
            } else {
                this.f11708b.position().f2527y = C0892a.f2558I;
            }
            this.f11724r = true;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.n.a.5
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3550a.this.f11724r = false;
                }
            };
            c1017d.m10314a(255);
            C1014c.m10326a(this.f11708b);
            C1014c.m10325a(this.f11708b, 750, c1017d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m2031e() {
        if (this.f11726t && this.f11722p.isEmpty()) {
            this.f11726t = false;
            if (!this.f11710d) {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.manager.n.a.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!C3359a.f11088b.m10553c()) {
                            C3359a.f11088b.m10561a(false, false, false);
                        }
                    }
                });
            }
            this.f11724r = true;
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.n.a.7
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3550a.this.f11724r = false;
                    C3359a.f11088b.m10557b(C3550a.this);
                    C3550a.this.f11708b.removeFromParent();
                    C3550a.this.m2048a();
                }
            };
            c1017d.m10314a(0);
            C1014c.m10326a(this.f11708b);
            C1014c.m10325a(this.f11708b, 750, c1017d);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0925e.InterfaceC0934a
    /* renamed from: a */
    public void mo1664a(int i, int i2, int i3, int i4) {
        this.f11708b.position().f2527y = C3359a.f11088b.m10553c() ? C0892a.f2551B : C0892a.f2551B + C0892a.f2559J;
        this.f11709c.m10373a(C0892a.f2553D);
    }

    /* renamed from: com.tsf.shell.manager.n.a$a */
    /* loaded from: classes.dex */
    public class C3558a extends C0981k {

        /* renamed from: a */
        public Runnable f11735a;

        /* renamed from: e */
        private TextureElement f11737e;

        /* renamed from: f */
        private String f11738f;

        /* renamed from: g */
        private boolean f11739g;

        /* renamed from: h */
        private int f11740h;

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            if (this.f11739g) {
                this.f11739g = false;
                System.currentTimeMillis();
                Bitmap m1998b = C3550a.this.f11725s.m1998b(this.f11738f);
                C0853a.m10853g().m10540a(this.f11737e, m1998b);
                m1998b.recycle();
                mo10368a(this.f11737e.width);
                mo5215b(this.f11737e.height);
            }
        }

        public C3558a(String str) {
            super(0.0f, 0.0f);
            this.f11737e = new TextureElement(0, false);
            this.f11738f = "";
            this.f11739g = false;
            position().f2527y = 100.0f * C0892a.f2567c;
            alpha(0.0f);
            textures().addElement(this.f11737e);
            m2025a(str);
            C3567c.m1967a(this, C3567c.f11843b);
        }

        /* renamed from: a */
        public void m2025a(String str) {
            if (str != null && !str.equals(this.f11738f)) {
                this.f11739g = true;
                this.f11738f = str;
            }
        }

        /* renamed from: a */
        protected void m2027a() {
            m2026a(this.f11740h);
        }

        /* renamed from: a */
        protected void m2026a(int i) {
            this.f11740h = i;
            if (this.f11737e.f2529id != 0 || this.f11739g) {
                C1017d c1017d = new C1017d();
                c1017d.mo10298h((-C3550a.this.f11711e) / 2.0f);
                c1017d.m10314a(255);
                C1014c.m10326a(this);
                C1014c.m10325a(this, 500, c1017d);
                if (parent() == null) {
                    C3550a.this.f11708b.addChild(this);
                }
                C3550a.this.m2046a(i);
            }
        }

        /* renamed from: a */
        public void m2024a(final boolean z) {
            C1017d c1017d = new C1017d() { // from class: com.tsf.shell.manager.n.a.a.1
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C3558a.this.removeFromParent();
                    if (z) {
                        C3558a.this.m2023d();
                    }
                }
            };
            c1017d.m10314a(0);
            c1017d.mo10298h(100.0f * C0892a.f2567c);
            C1014c.m10326a(this);
            C1014c.m10325a(this, 500, c1017d);
            C3550a.this.m2048a();
        }

        /* renamed from: d */
        public void m2023d() {
            removeFromParent();
            if (this.f11737e.f2529id != 0) {
                C0853a.m10853g().m10543a(this.f11737e);
            }
            this.f11738f = "";
        }
    }
}
