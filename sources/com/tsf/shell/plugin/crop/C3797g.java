package com.tsf.shell.plugin.crop;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.tsf.shell.plugin.crop.C3788b;
/* renamed from: com.tsf.shell.plugin.crop.g */
/* loaded from: classes.dex */
public class C3797g implements C3788b.InterfaceC3789a {

    /* renamed from: B */
    private float f12488B;

    /* renamed from: C */
    private float f12489C;

    /* renamed from: D */
    private float f12490D;

    /* renamed from: b */
    private Bitmap f12492b;

    /* renamed from: f */
    private float f12496f;

    /* renamed from: g */
    private float f12497g;

    /* renamed from: i */
    private C3791d f12499i;

    /* renamed from: j */
    private float f12500j;

    /* renamed from: k */
    private float f12501k;

    /* renamed from: l */
    private float f12502l;

    /* renamed from: m */
    private float f12503m;

    /* renamed from: n */
    private float f12504n;

    /* renamed from: o */
    private float f12505o;

    /* renamed from: p */
    private float f12506p;

    /* renamed from: q */
    private float f12507q;

    /* renamed from: r */
    private float f12508r;

    /* renamed from: s */
    private float f12509s;

    /* renamed from: t */
    private float f12510t;

    /* renamed from: u */
    private float f12511u;

    /* renamed from: v */
    private float f12512v;

    /* renamed from: w */
    private float f12513w;

    /* renamed from: x */
    private float f12514x;

    /* renamed from: y */
    private float f12515y;

    /* renamed from: z */
    private float f12516z;

    /* renamed from: c */
    private Matrix f12493c = new Matrix();

    /* renamed from: d */
    private int f12494d = 0;

    /* renamed from: e */
    private int f12495e = 0;

    /* renamed from: h */
    private float f12498h = 1.0f;

    /* renamed from: A */
    private boolean f12487A = false;

    /* renamed from: a */
    public C3788b f12491a = new C3788b();

    public C3797g() {
        this.f12491a.m1481a(this);
    }

    /* renamed from: a */
    public void m1429a(C3791d c3791d) {
        this.f12499i = c3791d;
    }

    /* renamed from: a */
    public void m1433a(int i, int i2) {
        this.f12494d = i;
        this.f12495e = i2;
        this.f12491a.m1482a(0.0f, 0.0f, i, i2);
        m1426c();
    }

    /* renamed from: a */
    public void m1428a(boolean z) {
        this.f12487A = z;
    }

    /* renamed from: a */
    public boolean m1431a(Canvas canvas) {
        boolean z = false;
        if (!this.f12487A) {
            z = m1425d();
        }
        if (this.f12492b != null) {
            canvas.drawBitmap(this.f12492b, this.f12493c, null);
        }
        return z;
    }

    /* renamed from: a */
    public void m1430a(Canvas canvas, Paint paint) {
        if (this.f12492b != null) {
            canvas.drawBitmap(this.f12492b, this.f12493c, paint);
        }
    }

    /* renamed from: d */
    private boolean m1425d() {
        boolean z = false;
        float f = this.f12490D - this.f12498h;
        if (Math.abs(f) > 0.001f) {
            m1435a(this.f12498h + (f * 0.2f));
            z = true;
        }
        float f2 = this.f12488B - this.f12491a.f12438e;
        if (Math.abs(f2) > 0.001f) {
            this.f12491a.m1484a(this.f12491a.f12438e + (f2 * 0.2f));
            z = true;
        }
        float f3 = this.f12489C - this.f12491a.f12439f;
        if (Math.abs(f3) > 0.001f) {
            this.f12491a.m1477b(this.f12491a.f12439f + (f3 * 0.2f));
            return true;
        }
        return z;
    }

    /* renamed from: b */
    public void m1427b() {
        float m1457b = this.f12499i.m1457b();
        this.f12490D = this.f12498h * m1457b;
        if (this.f12490D <= this.f12496f) {
            this.f12490D = this.f12496f;
        } else if (this.f12490D >= this.f12497g) {
            this.f12490D = this.f12497g;
        }
        float f = this.f12490D * this.f12506p;
        float f2 = this.f12490D * this.f12507q;
        float m1444f = this.f12499i.m1444f();
        float m1442g = this.f12499i.m1442g();
        this.f12508r = m1444f - this.f12491a.f12434a;
        this.f12509s = m1442g - this.f12491a.f12435b;
        this.f12513w = this.f12508r / this.f12491a.f12440g;
        this.f12514x = this.f12509s / this.f12491a.f12441h;
        float f3 = f * this.f12513w;
        float f4 = f2 * this.f12514x;
        this.f12488B = (this.f12494d / 2.0f) - f3;
        this.f12489C = (this.f12495e / 2.0f) - f4;
        C3790c.m1466a("calculateFitSize:" + m1457b);
    }

    /* renamed from: a */
    public void m1432a(Bitmap bitmap) {
        this.f12492b = bitmap;
        this.f12506p = this.f12492b.getWidth();
        this.f12507q = this.f12492b.getHeight();
        m1426c();
    }

    /* renamed from: c */
    public void m1426c() {
        if (this.f12492b != null && this.f12494d != 0 && this.f12495e != 0) {
            this.f12493c.reset();
            float min = Math.min(this.f12494d / this.f12506p, this.f12495e / this.f12507q);
            this.f12496f = min;
            this.f12498h = min;
            this.f12490D = min;
            this.f12497g = this.f12496f * 5.0f;
            float f = this.f12496f * this.f12506p;
            float f2 = this.f12496f * this.f12507q;
            float f3 = (this.f12494d - f) / 2.0f;
            this.f12488B = f3;
            this.f12515y = f3;
            float f4 = (this.f12495e - f2) / 2.0f;
            this.f12489C = f4;
            this.f12516z = f4;
            this.f12491a.m1482a(this.f12515y, this.f12516z, f, f2);
            this.f12493c.setScale(this.f12496f, this.f12496f);
            this.f12493c.postTranslate(this.f12515y, this.f12516z);
            float min2 = Math.min(f, f2) * 0.8f;
            this.f12499i.m1463a((this.f12494d - min2) / 2.0f, (this.f12495e - min2) / 2.0f, min2, min2);
        }
    }

    /* renamed from: a */
    public void m1435a(float f) {
        this.f12498h = f;
        float f2 = this.f12506p * this.f12498h;
        float f3 = this.f12507q * this.f12498h;
        this.f12491a.m1473c(f2);
        this.f12491a.m1471d(f3);
    }

    /* renamed from: a */
    public void m1434a(float f, float f2) {
        this.f12500j = f - this.f12491a.f12434a;
        this.f12501k = f2 - this.f12491a.f12435b;
        this.f12502l = f;
        this.f12503m = f2;
        this.f12504n = this.f12491a.f12440g;
        this.f12505o = this.f12491a.f12441h;
        this.f12511u = this.f12491a.f12438e;
        this.f12512v = this.f12491a.f12439f;
        float m1444f = this.f12499i.m1444f();
        float m1442g = this.f12499i.m1442g();
        this.f12508r = m1444f - this.f12491a.f12434a;
        this.f12509s = m1442g - this.f12491a.f12435b;
        this.f12513w = this.f12508r / this.f12504n;
        this.f12514x = this.f12509s / this.f12505o;
        this.f12510t = this.f12498h;
    }

    @Override // com.tsf.shell.plugin.crop.C3788b.InterfaceC3789a
    /* renamed from: a */
    public void mo1436a() {
        this.f12493c.setScale(this.f12498h, this.f12498h);
        this.f12493c.postTranslate(this.f12491a.f12434a, this.f12491a.f12435b);
        this.f12499i.m1453c();
    }
}
