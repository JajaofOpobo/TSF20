package com.censivn.C3DEngine.p031b.p046h.p050d;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.censivn.C3DEngine.b.h.d.b */
/* loaded from: classes.dex */
public class C1052b extends C0962a {

    /* renamed from: a */
    private C1055a f3236a;

    /* renamed from: c */
    private C1055a f3237c;

    /* renamed from: d */
    private C1055a f3238d;

    /* renamed from: e */
    private C1055a f3239e;

    /* renamed from: f */
    private TextureElement f3240f;

    /* renamed from: g */
    private float f3241g;

    /* renamed from: h */
    private float f3242h;

    /* renamed from: i */
    private float f3243i;

    /* renamed from: j */
    private float f3244j;

    /* renamed from: k */
    private C1013b f3245k;

    /* renamed from: l */
    private C1056b f3246l;

    /* renamed from: m */
    private float f3247m;

    /* renamed from: n */
    private float f3248n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.censivn.C3DEngine.b.h.d.b$b */
    /* loaded from: classes.dex */
    public class C1056b {
        C1056b() {
        }

        /* renamed from: a */
        public Bitmap mo10091a() {
            return null;
        }
    }

    public C1052b(float f, final int i) {
        super(4, 32, 32);
        this.f3241g = 0.0f;
        this.f3242h = 0.0f;
        m10105a(f, new C1056b() { // from class: com.censivn.C3DEngine.b.h.d.b.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.censivn.C3DEngine.p031b.p046h.p050d.C1052b.C1056b
            /* renamed from: a */
            public Bitmap mo10091a() {
                return C4189x.m609a(i);
            }
        });
    }

    /* renamed from: a */
    private void m10105a(float f, C1056b c1056b) {
        this.f3246l = c1056b;
        this.f3240f = new TextureElement(0, false);
        this.f3244j = f;
        this.f3241g = f;
        this.f3242h = f;
        this.f3243i = (f / 2.0f) + 1.0f;
        textures().addElement(this.f3240f);
        this.f3236a = new C1055a(0.0f, 0.0f, 0.0f);
        this.f3237c = new C1055a(0.0f, this.f3243i, 0.0f);
        this.f3239e = new C1055a(this.f3243i, this.f3243i, 0.0f);
        this.f3238d = new C1055a(this.f3243i, 0.0f, 0.0f);
        doubleSidedEnabled(true);
        this.f3245k = new C1013b();
    }

    /* renamed from: c */
    public void m10102c() {
        if (this.f3240f.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f3240f);
        }
    }

    /* renamed from: d */
    public float m10099d() {
        return this.f3244j;
    }

    /* renamed from: a */
    public void m10108a(float f, int i) {
        m10107a(f, i, (Runnable) null);
    }

    /* renamed from: a */
    public void m10107a(final float f, int i, final Runnable runnable) {
        final float f2 = this.f3247m;
        C1017d c1017d = new C1017d() { // from class: com.censivn.C3DEngine.b.h.d.b.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f3) {
                C1052b.this.m10109a(f2 + ((f - f2) * f3));
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        C1014c.m10326a(this.f3245k);
        C1014c.m10325a(this.f3245k, i, c1017d);
    }

    /* renamed from: e */
    public void m10098e() {
        C1014c.m10326a(this.f3245k);
    }

    /* renamed from: a */
    public void m10109a(float f) {
        this.f3248n = f;
        visible(true);
    }

    /* renamed from: g */
    private void m10096g() {
        this.f3236a.m10092a();
        this.f3237c.m10092a();
        this.f3238d.m10092a();
        this.f3239e.m10092a();
    }

    /* renamed from: h */
    private void m10095h() {
        this.f3236a.f2526x -= 1.0f;
        this.f3237c.f2526x -= 1.0f;
        this.f3238d.f2526x -= 1.0f;
        this.f3239e.f2526x -= 1.0f;
        this.f3236a.f2527y -= 1.0f;
        this.f3237c.f2527y -= 1.0f;
        this.f3238d.f2527y -= 1.0f;
        this.f3239e.f2527y -= 1.0f;
    }

    /* renamed from: i */
    private void m10094i() {
        this.f3236a.f2526x *= -1.0f;
        this.f3237c.f2526x *= -1.0f;
        this.f3238d.f2526x *= -1.0f;
        this.f3239e.f2526x *= -1.0f;
    }

    /* renamed from: j */
    private void m10093j() {
        this.f3236a.f2527y *= -1.0f;
        this.f3237c.f2527y *= -1.0f;
        this.f3238d.f2527y *= -1.0f;
        this.f3239e.f2527y *= -1.0f;
    }

    /* renamed from: c */
    private void m10101c(float f) {
        this.f3236a.rotateDegressZ(f);
        this.f3237c.rotateDegressZ(f);
        this.f3238d.rotateDegressZ(f);
        this.f3239e.rotateDegressZ(f);
    }

    /* renamed from: a */
    private void m10104a(C0964b c0964b, boolean z) {
        if (!z) {
            m10094i();
            m10093j();
        }
        points().setPX(c0964b.f2841a, this.f3236a);
        points().setPX(c0964b.f2842b, this.f3237c);
        points().setPX(c0964b.f2843c, this.f3238d);
        points().setPX(c0964b.f2844d, this.f3239e);
    }

    /* renamed from: c */
    private void m10100c(C0964b c0964b) {
        uvs().set(c0964b.f2841a, 0.0f, 1.0f);
        uvs().set(c0964b.f2842b, 0.0f, 0.0f);
        uvs().set(c0964b.f2844d, 1.0f, 0.0f);
        uvs().set(c0964b.f2843c, 1.0f, 1.0f);
    }

    /* renamed from: a */
    private void m10106a(float f, C0964b c0964b, C0964b c0964b2, boolean z) {
        float f2 = f / 2.0f;
        if (f <= 90.0f) {
            float tan = ((float) (Math.tan((f2 * 3.141592653589793d) / 180.0d) * (this.f3243i - 1.0f))) + 1.0f;
            m10096g();
            C1055a c1055a = this.f3238d;
            this.f3239e.f2526x = tan;
            c1055a.f2526x = tan;
            C1055a c1055a2 = this.f3238d;
            C1055a c1055a3 = this.f3239e;
            float f3 = this.f3243i;
            c1055a3.f2527y = f3;
            c1055a2.f2527y = f3;
            m10095h();
            uvs().set(c0964b.f2841a, 0.0f, 1.0f);
            uvs().set(c0964b.f2842b, 0.0f, 0.0f);
            uvs().set(c0964b.f2843c, tan / this.f3243i, 0.0f);
            uvs().set(c0964b.f2844d, tan / this.f3243i, 0.0f);
            m10104a(c0964b, z);
            m10096g();
            C1055a c1055a4 = this.f3238d;
            this.f3239e.f2526x = tan;
            c1055a4.f2526x = tan;
            C1055a c1055a5 = this.f3238d;
            C1055a c1055a6 = this.f3239e;
            float f4 = this.f3243i;
            c1055a6.f2527y = f4;
            c1055a5.f2527y = f4;
            m10095h();
            m10094i();
            m10101c(-f);
            uvs().set(c0964b2.f2841a, 0.0f, 1.0f);
            uvs().set(c0964b2.f2842b, 0.0f, 0.0f);
            uvs().set(c0964b2.f2843c, tan / this.f3243i, 0.0f);
            uvs().set(c0964b2.f2844d, tan / this.f3243i, 0.0f);
            m10104a(c0964b2, z);
        } else if (f <= 180.0f) {
            float tan2 = ((float) (Math.tan(((90.0f - f2) * 3.141592653589793d) / 180.0d) * (this.f3243i - 1.0f))) + 1.0f;
            m10096g();
            C1055a c1055a7 = this.f3238d;
            this.f3238d.f2527y = tan2;
            c1055a7.f2527y = tan2;
            m10095h();
            uvs().set(c0964b.f2841a, 0.0f, 1.0f);
            uvs().set(c0964b.f2842b, 0.0f, 0.0f);
            uvs().set(c0964b.f2844d, 1.0f, 0.0f);
            uvs().set(c0964b.f2843c, 1.0f, (this.f3243i - tan2) / this.f3243i);
            m10104a(c0964b, z);
            m10096g();
            C1055a c1055a8 = this.f3238d;
            this.f3238d.f2527y = tan2;
            c1055a8.f2527y = tan2;
            m10095h();
            m10094i();
            m10101c(-f);
            uvs().set(c0964b2.f2841a, 0.0f, 1.0f);
            uvs().set(c0964b2.f2842b, 0.0f, 0.0f);
            uvs().set(c0964b2.f2844d, 1.0f, 0.0f);
            uvs().set(c0964b2.f2843c, 1.0f, (this.f3243i - tan2) / this.f3243i);
            m10104a(c0964b2, z);
        }
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.p039a.C0962a, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void onDrawStart() {
        m10097f();
        if (this.f3248n != this.f3247m) {
            m10103b(this.f3248n);
        }
    }

    /* renamed from: f */
    public void m10097f() {
        if (this.f3240f.f2529id == 0) {
            Bitmap mo10091a = this.f3246l.mo10091a();
            C0853a.m10853g().m10540a(this.f3240f, mo10091a);
            mo10091a.recycle();
        }
    }

    /* renamed from: b */
    public void m10103b(float f) {
        this.f3248n = f;
        this.f3247m = f;
        if (f <= 90.0f) {
            m10106a(f, m10456a(0), m10456a(1), true);
            C0964b a = m10456a(2);
            a.m10435a((Boolean) false);
            a.m10408h();
            C0964b a2 = m10456a(3);
            a2.m10435a((Boolean) false);
            a2.m10408h();
        } else if (f <= 180.0f) {
            m10106a(f, m10456a(0), m10456a(1), true);
            C0964b a3 = m10456a(2);
            a3.m10435a((Boolean) false);
            a3.m10408h();
            C0964b a4 = m10456a(3);
            a4.m10435a((Boolean) false);
            a4.m10408h();
        } else if (f <= 360.0f) {
            C0964b a5 = m10456a(0);
            m10096g();
            m10100c(a5);
            m10095h();
            m10104a(a5, true);
            C0964b a6 = m10456a(1);
            m10096g();
            m10100c(a6);
            m10095h();
            m10094i();
            m10101c(-180.0f);
            m10104a(a6, true);
            m10106a(f - 180.0f, m10456a(2), m10456a(3), false);
        }
        if (f == 0.0f) {
            visible(false);
        }
        updatePointsVBO();
        updateUvsVBO();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.censivn.C3DEngine.b.h.d.b$a */
    /* loaded from: classes.dex */
    public class C1055a extends Number3d {

        /* renamed from: b */
        private float f3256b;

        /* renamed from: c */
        private float f3257c;

        /* renamed from: d */
        private float f3258d;

        public C1055a(float f, float f2, float f3) {
            super(f, f2, f3);
            this.f3256b = f;
            this.f3257c = f2;
            this.f3258d = f3;
        }

        /* renamed from: a */
        public void m10092a() {
            this.f2526x = this.f3256b;
            this.f2527y = this.f3257c;
            this.f2528z = this.f3258d;
        }
    }
}
