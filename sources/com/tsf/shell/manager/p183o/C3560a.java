package com.tsf.shell.manager.p183o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.tsf.shell.manager.p183o.p184a.C3562b;
import com.tsf.shell.utils.C4167d;
import com.tsf.shell.utils.C4176l;
/* renamed from: com.tsf.shell.manager.o.a */
/* loaded from: classes.dex */
public class C3560a {

    /* renamed from: A */
    public float f11743A;

    /* renamed from: B */
    public float f11744B;

    /* renamed from: C */
    public float f11745C;

    /* renamed from: D */
    public int f11746D;

    /* renamed from: E */
    public int f11747E;

    /* renamed from: F */
    public int f11748F;

    /* renamed from: G */
    public int f11749G;

    /* renamed from: H */
    public int f11750H;

    /* renamed from: I */
    public int f11751I;

    /* renamed from: J */
    public int f11752J;

    /* renamed from: K */
    public int f11753K;

    /* renamed from: L */
    public int f11754L;

    /* renamed from: M */
    public int f11755M;

    /* renamed from: N */
    public int f11756N;

    /* renamed from: O */
    public int f11757O;

    /* renamed from: P */
    public int f11758P;

    /* renamed from: Q */
    public int f11759Q;

    /* renamed from: R */
    public int f11760R;

    /* renamed from: S */
    public int f11761S;

    /* renamed from: T */
    public int f11762T;

    /* renamed from: U */
    public int f11763U;

    /* renamed from: V */
    public int f11764V;

    /* renamed from: W */
    public int f11765W;

    /* renamed from: X */
    public int f11766X;

    /* renamed from: Y */
    public int f11767Y;

    /* renamed from: Z */
    public int f11768Z;

    /* renamed from: a */
    public int f11769a;

    /* renamed from: aa */
    public int f11770aa;

    /* renamed from: ab */
    public C3562b f11771ab;

    /* renamed from: ac */
    private int f11772ac;

    /* renamed from: ad */
    private C4167d f11773ad;

    /* renamed from: b */
    public int f11774b;

    /* renamed from: c */
    public int f11775c;

    /* renamed from: d */
    public int f11776d;

    /* renamed from: e */
    public int f11777e;

    /* renamed from: f */
    public int f11778f;

    /* renamed from: g */
    public int f11779g;

    /* renamed from: h */
    public int f11780h;

    /* renamed from: i */
    public float f11781i;

    /* renamed from: j */
    public float f11782j;

    /* renamed from: k */
    public float f11783k;

    /* renamed from: l */
    public float f11784l;

    /* renamed from: m */
    public float f11785m;

    /* renamed from: n */
    public float f11786n;

    /* renamed from: o */
    public float f11787o;

    /* renamed from: p */
    public float f11788p;

    /* renamed from: q */
    public float f11789q;

    /* renamed from: r */
    public float f11790r;

    /* renamed from: s */
    public float f11791s;

    /* renamed from: t */
    public float f11792t;

    /* renamed from: u */
    public float f11793u;

    /* renamed from: v */
    public float f11794v;

    /* renamed from: w */
    public float f11795w;

    /* renamed from: x */
    public float f11796x;

    /* renamed from: y */
    public float f11797y;

    /* renamed from: z */
    public float f11798z;

    /* renamed from: a */
    public Bitmap m2022a() {
        return this.f11773ad.m694a();
    }

    /* renamed from: a */
    public Bitmap m2011a(String str) {
        return this.f11771ab.mo1975a(str, this);
    }

    public C3560a() {
        this.f11743A = 1.15f;
        this.f11744B = 1.15f;
        this.f11745C = 0.0f;
        this.f11750H = 0;
        this.f11751I = 0;
        this.f11752J = 0;
        this.f11753K = 0;
        this.f11754L = 0;
        this.f11755M = 0;
        this.f11756N = 0;
        this.f11757O = 0;
        this.f11758P = 0;
        this.f11759Q = 0;
        this.f11760R = 0;
        this.f11761S = 0;
        this.f11762T = 0;
        this.f11763U = 0;
        this.f11764V = 0;
        this.f11765W = 0;
        this.f11766X = 0;
        this.f11767Y = 0;
        this.f11768Z = 0;
        this.f11770aa = 0;
        this.f11772ac = 0;
        m2019a(144, 144, 192, 42, 12, true);
    }

    public C3560a(float f, float f2) {
        this.f11743A = 1.15f;
        this.f11744B = 1.15f;
        this.f11745C = 0.0f;
        this.f11750H = 0;
        this.f11751I = 0;
        this.f11752J = 0;
        this.f11753K = 0;
        this.f11754L = 0;
        this.f11755M = 0;
        this.f11756N = 0;
        this.f11757O = 0;
        this.f11758P = 0;
        this.f11759Q = 0;
        this.f11760R = 0;
        this.f11761S = 0;
        this.f11762T = 0;
        this.f11763U = 0;
        this.f11764V = 0;
        this.f11765W = 0;
        this.f11766X = 0;
        this.f11767Y = 0;
        this.f11768Z = 0;
        this.f11770aa = 0;
        this.f11772ac = 0;
        m2021a(f, f2);
    }

    /* renamed from: a */
    public void m2021a(float f, float f2) {
        this.f11743A = f;
        this.f11744B = f2;
        m2019a(144, 144, 192, 42, 12, true);
    }

    public C3560a(float f, float f2, int i, int i2, int i3, int i4, int i5) {
        this.f11743A = 1.15f;
        this.f11744B = 1.15f;
        this.f11745C = 0.0f;
        this.f11750H = 0;
        this.f11751I = 0;
        this.f11752J = 0;
        this.f11753K = 0;
        this.f11754L = 0;
        this.f11755M = 0;
        this.f11756N = 0;
        this.f11757O = 0;
        this.f11758P = 0;
        this.f11759Q = 0;
        this.f11760R = 0;
        this.f11761S = 0;
        this.f11762T = 0;
        this.f11763U = 0;
        this.f11764V = 0;
        this.f11765W = 0;
        this.f11766X = 0;
        this.f11767Y = 0;
        this.f11768Z = 0;
        this.f11770aa = 0;
        this.f11772ac = 0;
        this.f11743A = f;
        this.f11744B = f2;
        m2019a(i, i2, i3, i4, i5, true);
    }

    /* renamed from: a */
    private void m2019a(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (z) {
            this.f11797y = C0892a.f2567c * this.f11743A;
            this.f11798z = C0892a.f2567c * this.f11744B;
        } else {
            this.f11797y = this.f11743A;
            this.f11798z = this.f11744B;
        }
        this.f11745C = 12.0f * this.f11797y;
        this.f11750H = (((int) (i * this.f11797y)) / 2) * 2;
        this.f11751I = (((int) (i2 * this.f11797y)) / 2) * 2;
        this.f11752J = (((int) (i3 * this.f11798z)) / 2) * 2;
        this.f11753K = (((int) (i4 * this.f11798z)) / 2) * 2;
        this.f11772ac = (((int) (i5 * this.f11797y)) / 2) * 2;
        this.f11764V = this.f11750H > this.f11752J ? this.f11750H + 2 : this.f11752J + 2;
        this.f11765W = this.f11751I + 2 + this.f11753K + 2;
        this.f11762T = this.f11764V;
        this.f11763U = this.f11765W + this.f11772ac;
        this.f11746D = (this.f11764V - this.f11750H) / 2;
        this.f11747E = 1;
        this.f11748F = (this.f11764V - this.f11752J) / 2;
        this.f11749G = this.f11751I + 2 + 1;
        this.f11766X = 0;
        this.f11767Y = (this.f11763U / 2) - ((this.f11751I + 2) / 2);
        this.f11768Z = 0;
        this.f11770aa = -((this.f11763U / 2) - ((this.f11753K + 2) / 2));
        this.f11758P = ((-this.f11750H) / 2) + 2;
        this.f11759Q = (this.f11750H / 2) + 2;
        this.f11760R = ((-this.f11751I) / 2) + 2;
        this.f11761S = (this.f11751I / 2) + 2;
        this.f11754L = (-this.f11762T) / 2;
        this.f11755M = this.f11762T / 2;
        this.f11756N = (-this.f11763U) / 2;
        this.f11757O = this.f11763U / 2;
        this.f11773ad = new C4167d(this.f11764V, this.f11765W);
    }

    /* renamed from: a */
    public float m2020a(int i) {
        return (int) (i * this.f11798z);
    }

    /* renamed from: c */
    private C0962a m2008c() {
        return new C0962a(2, 0, this.f11764V, this.f11765W);
    }

    /* renamed from: b */
    public C0962a m2010b() {
        return m2014a(m2008c());
    }

    /* renamed from: a */
    public C0962a m2014a(C0962a c0962a) {
        C0964b m10456a = c0962a.m10456a(0);
        m10456a.m10437a(0, this.f11747E - 1, 0, 0, this.f11764V, this.f11751I + 2);
        m10456a.m10407i().f2526x = this.f11766X;
        m10456a.m10407i().f2527y = this.f11767Y;
        m10456a.m10433a(true);
        m10456a.m10442a(0.0f, this.f11747E - 1, this.f11764V, this.f11751I + 2);
        m10456a.m10408h();
        C0964b m10456a2 = c0962a.m10456a(1);
        m10456a2.m10437a(this.f11748F - 1, this.f11749G - 1, 0, 0, this.f11752J + 2, this.f11753K + 2);
        m10456a2.m10407i().f2526x = this.f11768Z;
        m10456a2.m10407i().f2527y = this.f11770aa;
        m10456a2.m10433a(true);
        m10456a2.m10442a(this.f11748F - 1, this.f11749G - 1, this.f11752J + 2, this.f11753K + 2);
        m10456a2.m10408h();
        if (this.f11781i == 0.0f) {
            this.f11769a = c0962a.m10456a(0).f2841a;
            this.f11774b = c0962a.m10456a(0).f2842b;
            this.f11775c = c0962a.m10456a(0).f2843c;
            this.f11776d = c0962a.m10456a(0).f2844d;
            this.f11777e = c0962a.m10456a(1).f2841a;
            this.f11778f = c0962a.m10456a(1).f2842b;
            this.f11779g = c0962a.m10456a(1).f2843c;
            this.f11780h = c0962a.m10456a(1).f2844d;
            this.f11781i = c0962a.points().pxX(this.f11769a);
            this.f11782j = c0962a.points().pxX(this.f11774b);
            this.f11783k = c0962a.points().pxX(this.f11775c);
            this.f11784l = c0962a.points().pxX(this.f11776d);
            this.f11785m = c0962a.points().pxX(this.f11777e);
            this.f11786n = c0962a.points().pxX(this.f11778f);
            this.f11787o = c0962a.points().pxX(this.f11779g);
            this.f11788p = c0962a.points().pxX(this.f11780h);
            this.f11789q = c0962a.points().pxY(this.f11769a);
            this.f11790r = c0962a.points().pxY(this.f11774b);
            this.f11791s = c0962a.points().pxY(this.f11775c);
            this.f11792t = c0962a.points().pxY(this.f11776d);
            this.f11793u = c0962a.points().pxY(this.f11777e);
            this.f11794v = c0962a.points().pxY(this.f11778f);
            this.f11795w = c0962a.points().pxY(this.f11779g);
            this.f11796x = c0962a.points().pxY(this.f11780h);
        }
        return c0962a;
    }

    /* renamed from: a */
    public void m2017a(Canvas canvas, Bitmap bitmap, Bitmap bitmap2, boolean z) {
        if (bitmap != null) {
            m2015a(canvas, bitmap, z);
        }
        if (bitmap2 != null) {
            m2009b(canvas, bitmap2, z);
        }
    }

    /* renamed from: a */
    public void m2018a(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, ((this.f11750H - bitmap.getWidth()) / 2) + this.f11746D, ((this.f11750H - bitmap.getHeight()) / 2) + this.f11747E, (Paint) null);
        bitmap.recycle();
    }

    /* renamed from: a */
    public void m2016a(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, ((this.f11750H - bitmap.getWidth()) / 2) + this.f11746D, ((this.f11750H - bitmap.getHeight()) / 2) + this.f11747E, paint);
        bitmap.recycle();
    }

    /* renamed from: a */
    public void m2015a(Canvas canvas, Bitmap bitmap, boolean z) {
        if (bitmap.getWidth() != this.f11750H || bitmap.getHeight() != this.f11751I) {
            C4176l.m668a(bitmap, "drawIconToCanvas icon size error  w:" + bitmap.getWidth() + "   h:" + bitmap.getHeight() + "  sw:" + this.f11750H + "  sh:" + this.f11751I);
        }
        canvas.drawBitmap(bitmap, this.f11746D, this.f11747E, (Paint) null);
        if (z) {
            bitmap.recycle();
        }
    }

    /* renamed from: b */
    public void m2009b(Canvas canvas, Bitmap bitmap, boolean z) {
        canvas.drawBitmap(bitmap, this.f11748F, this.f11749G, (Paint) null);
        if (z) {
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    public void m2012a(C0975i c0975i, boolean z) {
        if (z) {
            c0975i.setAABBPX(this.f11754L, this.f11756N, 0.0f, this.f11755M, this.f11757O, 0.0f);
        } else {
            c0975i.setAABBPX(this.f11758P, this.f11760R, 0.0f, this.f11759Q, this.f11761S, 0.0f);
        }
    }

    /* renamed from: a */
    public void m2013a(C0975i c0975i, float f, float f2, boolean z) {
        if (z) {
            c0975i.setAABBPX(this.f11754L + f, this.f11756N + f2, 0.0f, this.f11755M + f, this.f11757O + f2, 0.0f);
        } else {
            c0975i.setAABBPX(this.f11758P + f, this.f11760R + f2, 0.0f, this.f11759Q + f, this.f11761S + f2, 0.0f);
        }
    }
}
