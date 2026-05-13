package com.tsf.shell.p096f.p153i.p161c;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.tsf.C1306b;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.f.i.c.d */
/* loaded from: classes.dex */
public class C3338d extends C3343g {

    /* renamed from: k */
    private C0980j f11022k;

    /* renamed from: l */
    private C0981k f11023l;

    /* renamed from: m */
    private C0981k f11024m;

    /* renamed from: n */
    private C0981k f11025n;

    /* renamed from: o */
    private C0981k f11026o;

    /* renamed from: p */
    private TextureElement f11027p = new TextureElement(0, false);

    /* renamed from: q */
    private TextureElement f11028q = new TextureElement(0, false);

    /* renamed from: r */
    private TextureElement f11029r = new TextureElement(0, false);

    public C3338d() {
        m2796b(true);
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.C3343g, com.tsf.shell.p096f.p153i.p161c.AbstractC3341e
    /* renamed from: b */
    public void mo1623b() {
        C0853a.m10853g().m10543a(this.f11027p);
        C0853a.m10853g().m10543a(this.f11028q);
        C0853a.m10853g().m10543a(this.f11029r);
    }

    /* renamed from: p */
    private void m2812p() {
        if (this.f11027p.f2529id == 0) {
            Bitmap m609a = C4189x.m609a(C1306b.C1310d.cloud2);
            C0853a.m10853g().m10540a(this.f11027p, m609a);
            m609a.recycle();
            Bitmap m609a2 = C4189x.m609a(C1306b.C1310d.animals4);
            C0853a.m10853g().m10540a(this.f11029r, m609a2);
            m609a2.recycle();
            Bitmap m609a3 = C4189x.m609a(C1306b.C1310d.animals3);
            C0853a.m10853g().m10540a(this.f11028q, m609a3);
            m609a3.recycle();
        }
    }

    @Override // com.tsf.shell.p096f.p153i.p161c.C3343g
    /* renamed from: a */
    public C0975i mo2798a(boolean z) {
        if (this.f11022k == null) {
            this.f11022k = m2811q();
        } else {
            m2812p();
        }
        return this.f11022k;
    }

    /* renamed from: q */
    private C0980j m2811q() {
        m2812p();
        C0980j c0980j = new C0980j();
        this.f11023l = new C0981k(242.0f * C0892a.f2567c, 150.0f * C0892a.f2567c, false) { // from class: com.tsf.shell.f.i.c.d.1

            /* renamed from: a */
            float f11030a = 30.0f * C0892a.f2567c;

            /* renamed from: d */
            int f11031d = 10;

            /* renamed from: e */
            double f11032e = 0.017453292519943295d;

            @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
            public void onDrawStart() {
                position().f2527y = this.f11030a + (((float) Math.sin(this.f11032e * this.f11031d)) * 10.0f * C0892a.f2567c);
                this.f11031d++;
            }
        };
        this.f11024m = new C3340a(C0892a.f2567c * 54.0f, C0892a.f2567c * 54.0f, C0892a.f2567c * 200.0f, C0892a.f2567c * 3.0f, true, true);
        this.f11024m.position().f2528z = 100.0f * C0892a.f2567c;
        this.f11025n = new C3340a(C0892a.f2567c * 54.0f, C0892a.f2567c * 54.0f, C0892a.f2567c * 180.0f, C0892a.f2567c * 3.0f, false, true);
        this.f11025n.position().f2528z = (-100.0f) * C0892a.f2567c;
        this.f11026o = new C3340a(C0892a.f2567c * 54.0f, C0892a.f2567c * 54.0f, C0892a.f2567c * 70.0f, C0892a.f2567c * 0.4f, true, false);
        this.f11026o.position().f2527y = (-100.0f) * C0892a.f2567c;
        this.f11023l.textures().addElement(this.f11027p);
        this.f11024m.textures().addElement(this.f11028q);
        this.f11025n.textures().addElement(this.f11028q);
        this.f11026o.textures().addElement(this.f11029r);
        c0980j.addChild(this.f11025n);
        c0980j.addChild(this.f11023l);
        c0980j.addChild(this.f11024m);
        c0980j.addChild(this.f11026o);
        return c0980j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2814a(C0975i c0975i) {
        c0975i.doubleSidedEnabled(true);
        C1017d c1017d = new C1017d();
        if (c0975i.rotation().f2527y == 0.0f) {
            c1017d.m10305d(180.0f);
        } else {
            c1017d.m10305d(0.0f);
        }
        C1014c.m10326a(c0975i);
        C1014c.m10325a(c0975i, 300, c1017d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.i.c.d$a */
    /* loaded from: classes.dex */
    public class C3340a extends C0981k {

        /* renamed from: a */
        float f11034a;

        /* renamed from: d */
        int f11035d;

        /* renamed from: e */
        double f11036e;

        /* renamed from: f */
        float f11037f;

        /* renamed from: g */
        float f11038g;

        /* renamed from: h */
        boolean f11039h;

        /* renamed from: i */
        boolean f11040i;

        /* renamed from: j */
        float f11041j;

        public C3340a(float f, float f2, float f3, float f4, boolean z, boolean z2) {
            super(f, f2, false);
            this.f11034a = 30.0f * C0892a.f2567c;
            this.f11035d = 10;
            this.f11036e = 0.017453292519943295d;
            this.f11039h = true;
            this.f11040i = false;
            this.f11040i = z2;
            this.f11039h = z;
            this.f11041j = f4;
            this.f11037f = f3;
            this.f11038g = -f3;
            doubleSidedEnabled(true);
            if (z) {
                position().f2526x = this.f11038g;
                this.f11035d = 90;
                return;
            }
            position().f2526x = this.f11037f;
            rotation().f2527y = 180.0f;
            this.f11035d = 180;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            if (this.f11040i) {
                position().f2527y = this.f11034a + (((float) Math.sin(this.f11036e * this.f11035d)) * 30.0f * C0892a.f2567c);
                this.f11035d += 2;
            }
            if (this.f11039h) {
                position().f2526x += this.f11041j;
                if (position().f2526x > this.f11037f) {
                    C3338d.this.m2814a(this);
                    this.f11039h = false;
                    return;
                }
                return;
            }
            position().f2526x -= this.f11041j;
            if (position().f2526x < this.f11038g) {
                C3338d.this.m2814a(this);
                this.f11039h = true;
            }
        }
    }
}
