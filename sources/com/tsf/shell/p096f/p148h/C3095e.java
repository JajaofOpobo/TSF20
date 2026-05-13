package com.tsf.shell.p096f.p148h;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.C1306b;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.h.e */
/* loaded from: classes.dex */
public class C3095e extends C0962a {

    /* renamed from: k */
    private static TextureElement f10032k;

    /* renamed from: l */
    private static TextureElement f10033l;

    /* renamed from: a */
    public float f10034a;

    /* renamed from: c */
    private C3099a f10035c;

    /* renamed from: d */
    private C3099a f10036d;

    /* renamed from: e */
    private C3099a f10037e;

    /* renamed from: f */
    private C3099a f10038f;

    /* renamed from: g */
    private C3099a f10039g;

    /* renamed from: h */
    private C3099a f10040h;

    /* renamed from: i */
    private C3099a f10041i;

    /* renamed from: j */
    private C3099a f10042j;

    /* renamed from: m */
    private float f10043m;

    /* renamed from: n */
    private float f10044n;

    /* renamed from: o */
    private float f10045o;

    /* renamed from: p */
    private C1013b f10046p;

    /* renamed from: q */
    private C0981k f10047q;

    public C3095e() {
        super(2, 32, 32);
        this.f10043m = 0.0f;
        this.f10044n = 0.0f;
        this.f10045o = 0.0f;
        if (f10032k == null) {
            Bitmap m609a = C4189x.m609a(C1306b.C1310d.dock_operation_border);
            f10032k = C0853a.m10853g().m10544a(m609a, false);
            m609a.recycle();
            Bitmap m609a2 = C4189x.m609a(C1306b.C1310d.dock_operation_border_point);
            f10033l = C0853a.m10853g().m10544a(m609a2, false);
            m609a2.recycle();
        }
        this.f10043m = C0892a.f2566b * 158.0f;
        this.f10044n = C0892a.f2566b * 158.0f;
        this.f10034a = this.f10043m;
        textures().addElement(f10032k);
        this.f10047q = new C0981k(28.0f * C0892a.f2566b, 21.0f * C0892a.f2566b, false);
        this.f10047q.textures().addElement(f10033l);
        this.f10047q.alpha(0.0f);
        addChild(this.f10047q);
        this.f10039g = new C3099a(0.0f, 0.0f, 0.0f);
        this.f10040h = new C3099a(-this.f10043m, 0.0f, 0.0f);
        this.f10041i = new C3099a(0.0f, this.f10044n, 0.0f);
        this.f10042j = new C3099a(-this.f10043m, this.f10044n, 0.0f);
        this.f10035c = new C3099a(this.f10043m, 0.0f, 0.0f);
        this.f10036d = new C3099a(0.0f, 0.0f, 0.0f);
        this.f10037e = new C3099a(this.f10043m, this.f10044n, 0.0f);
        this.f10038f = new C3099a(0.0f, this.f10044n, 0.0f);
        C0964b a = m10456a(0);
        uvs().set(a.f2841a, 1.0f, 1.0f);
        uvs().set(a.f2842b, 0.0f, 1.0f);
        uvs().set(a.f2843c, 1.0f, 0.0f);
        uvs().set(a.f2844d, 0.0f, 0.0f);
        C0964b a2 = m10456a(1);
        uvs().set(a2.f2842b, 1.0f, 1.0f);
        uvs().set(a2.f2841a, 0.0f, 1.0f);
        uvs().set(a2.f2844d, 1.0f, 0.0f);
        uvs().set(a2.f2843c, 0.0f, 0.0f);
        this.f10046p = new C1013b();
        m3583e();
    }

    /* renamed from: c */
    public void m3585c() {
        this.f10047q.position().f2527y = 0.0f;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.h.e.1
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
            }
        };
        c1017d.mo10298h(this.f10034a + (20.0f * C0892a.f2566b));
        c1017d.m10314a(255);
        C1014c.m10326a(this.f10047q);
        C1014c.m10325a(this.f10047q, 300, c1017d);
    }

    /* renamed from: d */
    public void m3584d() {
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.h.e.2
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
            }
        };
        c1017d.m10314a(0);
        C1014c.m10326a(this.f10047q);
        C1014c.m10325a(this.f10047q, 300, c1017d);
    }

    /* renamed from: a */
    public void m3588a(float f) {
        m3587a(f, (Runnable) null);
    }

    /* renamed from: a */
    public void m3587a(final float f, final Runnable runnable) {
        final float f2 = this.f10045o;
        C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.h.e.3
            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f3) {
                C3095e.this.m3586b(f2 + ((f - f2) * f3));
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo732a() {
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        C1014c.m10326a(this.f10046p);
        C1014c.m10325a(this.f10046p, 300, c1017d);
        if (f == 0.0f) {
            m3584d();
        } else {
            m3585c();
        }
    }

    /* renamed from: b */
    public void m3586b(float f) {
        this.f10045o = f;
        this.f10039g.m3582a();
        this.f10040h.m3582a();
        this.f10041i.m3582a();
        this.f10042j.m3582a();
        this.f10035c.m3582a();
        this.f10036d.m3582a();
        this.f10037e.m3582a();
        this.f10038f.m3582a();
        float f2 = 90.0f - (f / 2.0f);
        if (f2 < 45.0f) {
            float cos = (float) (this.f10034a / Math.cos((f2 * 3.141592653589793d) / 180.0d));
            float tan = (float) (Math.tan((f2 * 3.141592653589793d) / 180.0d) * this.f10034a);
            this.f10040h.rotateDegressZ(-f2);
            this.f10041i.f2526x = 0.0f;
            this.f10041i.f2527y = cos;
            this.f10042j.rotateDegressZ(-f2);
            this.f10035c.rotateDegressZ(f2);
            this.f10038f.f2526x = 0.0f;
            this.f10038f.f2527y = cos;
            this.f10037e.rotateDegressZ(f2);
            C0964b a = m10456a(0);
            uvs().set(a.f2841a, 1.0f, 1.0f);
            uvs().set(a.f2842b, 0.0f, 1.0f);
            uvs().set(a.f2843c, (this.f10034a - tan) / this.f10034a, 0.0f);
            uvs().set(a.f2844d, 0.0f, 0.0f);
            C0964b a2 = m10456a(1);
            uvs().set(a2.f2841a, 0.0f, 1.0f);
            uvs().set(a2.f2842b, 1.0f, 1.0f);
            uvs().set(a2.f2843c, 0.0f, 0.0f);
            uvs().set(a2.f2844d, (this.f10034a - tan) / this.f10034a, 0.0f);
        } else {
            float f3 = f / 2.0f;
            float tan2 = (float) (Math.tan((f3 * 3.141592653589793d) / 180.0d) * this.f10034a);
            float cos2 = (float) (this.f10034a / Math.cos((f3 * 3.141592653589793d) / 180.0d));
            this.f10040h.rotateDegressZ((-90.0f) + f3);
            C3099a c3099a = this.f10041i;
            this.f10042j.f2526x = 0.0f;
            c3099a.f2526x = 0.0f;
            C3099a c3099a2 = this.f10041i;
            this.f10042j.f2527y = cos2;
            c3099a2.f2527y = cos2;
            this.f10035c.rotateDegressZ(90.0f - f3);
            C3099a c3099a3 = this.f10037e;
            this.f10038f.f2526x = 0.0f;
            c3099a3.f2526x = 0.0f;
            C3099a c3099a4 = this.f10037e;
            this.f10038f.f2527y = cos2;
            c3099a4.f2527y = cos2;
            C0964b a3 = m10456a(0);
            uvs().set(a3.f2841a, 1.0f, 1.0f);
            uvs().set(a3.f2842b, 0.0f, 1.0f);
            uvs().set(a3.f2843c, 0.0f, (this.f10034a - tan2) / this.f10034a);
            uvs().set(a3.f2844d, 0.0f, (this.f10034a - tan2) / this.f10034a);
            a3.f2853m.f2526x = 1.0f;
            C0964b a4 = m10456a(1);
            uvs().set(a4.f2841a, 0.0f, 1.0f);
            uvs().set(a4.f2842b, 1.0f, 1.0f);
            uvs().set(a4.f2843c, 0.0f, (this.f10034a - tan2) / this.f10034a);
            uvs().set(a4.f2844d, 0.0f, (this.f10034a - tan2) / this.f10034a);
            a4.f2853m.f2526x = -1.0f;
        }
        m3583e();
    }

    /* renamed from: e */
    private void m3583e() {
        C0964b a = m10456a(0);
        points().setPX(a.f2841a, this.f10039g);
        points().setPX(a.f2842b, this.f10040h);
        points().setPX(a.f2843c, this.f10041i);
        points().setPX(a.f2844d, this.f10042j);
        C0964b a2 = m10456a(1);
        points().setPX(a2.f2841a, this.f10035c);
        points().setPX(a2.f2842b, this.f10036d);
        points().setPX(a2.f2843c, this.f10037e);
        points().setPX(a2.f2844d, this.f10038f);
        updatePointsVBO();
        updateUvsVBO();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.h.e$a */
    /* loaded from: classes.dex */
    public class C3099a extends Number3d {

        /* renamed from: b */
        private float f10055b;

        /* renamed from: c */
        private float f10056c;

        /* renamed from: d */
        private float f10057d;

        public C3099a(float f, float f2, float f3) {
            super(f, f2, f3);
            this.f10055b = f;
            this.f10056c = f2;
            this.f10057d = f3;
        }

        /* renamed from: a */
        public void m3582a() {
            this.f2526x = this.f10055b;
            this.f2527y = this.f10056c;
            this.f2528z = this.f10057d;
        }
    }
}
