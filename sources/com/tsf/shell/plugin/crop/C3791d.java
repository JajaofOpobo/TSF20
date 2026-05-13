package com.tsf.shell.plugin.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.TypedValue;
import com.tsf.shell.plugin.crop.C3788b;
/* renamed from: com.tsf.shell.plugin.crop.d */
/* loaded from: classes.dex */
public class C3791d implements C3788b.InterfaceC3789a {

    /* renamed from: A */
    private float f12447A;

    /* renamed from: d */
    public Bitmap f12451d;

    /* renamed from: g */
    private float f12454g;

    /* renamed from: h */
    private float f12455h;

    /* renamed from: k */
    private float f12458k;

    /* renamed from: l */
    private float f12459l;

    /* renamed from: m */
    private float f12460m;

    /* renamed from: n */
    private float f12461n;

    /* renamed from: o */
    private float f12462o;

    /* renamed from: p */
    private float f12463p;

    /* renamed from: q */
    private C3797g f12464q;

    /* renamed from: r */
    private Paint f12465r;

    /* renamed from: s */
    private Paint f12466s;

    /* renamed from: v */
    private float f12469v;

    /* renamed from: w */
    private float f12470w;

    /* renamed from: x */
    private float f12471x;

    /* renamed from: y */
    private float f12472y;

    /* renamed from: i */
    private int f12456i = 0;

    /* renamed from: j */
    private int f12457j = 0;

    /* renamed from: t */
    private boolean f12467t = true;

    /* renamed from: a */
    public C3788b f12448a = new C3788b();

    /* renamed from: b */
    public C3788b f12449b = new C3788b();

    /* renamed from: c */
    public C3788b f12450c = new C3788b();

    /* renamed from: u */
    private float f12468u = 30.0f;

    /* renamed from: z */
    private Matrix f12473z = new Matrix();

    /* renamed from: e */
    C3788b f12452e = new C3788b();

    /* renamed from: f */
    C3788b f12453f = new C3788b();

    /* renamed from: com.tsf.shell.plugin.crop.d$a */
    /* loaded from: classes.dex */
    enum EnumC3792a {
        CENTER,
        NULL,
        TOP,
        LEFT,
        RIGHT,
        BOTTOM
    }

    public C3791d(Context context, C3797g c3797g) {
        this.f12448a.m1481a(this);
        this.f12464q = c3797g;
        this.f12464q.m1429a(this);
        this.f12447A = TypedValue.applyDimension(1, 6.0f, context.getResources().getDisplayMetrics());
        C3790c.m1466a("mCornetRadius:" + this.f12447A);
        this.f12465r = new Paint();
        this.f12465r.setAntiAlias(true);
        this.f12465r.setDither(true);
        this.f12465r.setColor(-1);
        this.f12465r.setStyle(Paint.Style.FILL);
        this.f12465r.setStrokeJoin(Paint.Join.ROUND);
        this.f12465r.setStrokeCap(Paint.Cap.ROUND);
        this.f12465r.setStrokeWidth(5.0f);
        this.f12466s = new Paint();
        this.f12466s.setAntiAlias(true);
        this.f12466s.setDither(true);
        this.f12466s.setColor(-1429418804);
        this.f12466s.setStyle(Paint.Style.FILL);
        this.f12466s.setStrokeJoin(Paint.Join.ROUND);
        this.f12466s.setStrokeCap(Paint.Cap.ROUND);
        this.f12466s.setStrokeWidth(1.0f);
    }

    /* renamed from: a */
    public void m1458a(boolean z) {
        this.f12467t = z;
    }

    /* renamed from: a */
    public void m1463a(float f, float f2, float f3, float f4) {
        this.f12448a.m1482a(f, f2, f3, f4);
        this.f12454g = f3;
        this.f12455h = f4;
        m1440h();
    }

    /* renamed from: b */
    public float m1457b() {
        return this.f12454g / Math.max(this.f12448a.f12440g, this.f12448a.f12441h);
    }

    /* renamed from: h */
    private void m1440h() {
        this.f12448a.m1479a(this.f12464q.f12491a, this.f12449b);
    }

    /* renamed from: c */
    public void m1453c() {
        this.f12448a.m1475b(this.f12464q.f12491a, this.f12449b);
    }

    /* renamed from: a */
    public void m1462a(int i, int i2) {
        this.f12456i = i;
        this.f12457j = i2;
        m1439i();
    }

    /* renamed from: i */
    private void m1439i() {
        this.f12448a.m1484a((this.f12456i - this.f12448a.f12440g) / 2.0f);
        this.f12448a.m1477b((this.f12457j - this.f12448a.f12441h) / 2.0f);
    }

    /* renamed from: a */
    public void m1464a(float f, float f2) {
        float f3 = f - this.f12458k;
        float f4 = f2 - this.f12459l;
        if (f3 < this.f12464q.f12491a.f12434a) {
            f3 = this.f12464q.f12491a.f12434a;
        } else if (f3 > this.f12464q.f12491a.f12436c - this.f12448a.f12440g) {
            f3 = this.f12464q.f12491a.f12436c - this.f12448a.f12440g;
        }
        if (f4 < this.f12464q.f12491a.f12435b) {
            f4 = this.f12464q.f12491a.f12435b;
        } else if (f4 > this.f12464q.f12491a.f12437d - this.f12448a.f12441h) {
            f4 = this.f12464q.f12491a.f12437d - this.f12448a.f12441h;
        }
        this.f12448a.m1483a(f3, f4);
    }

    /* renamed from: d */
    public void m1449d() {
        this.f12452e.m1480a(this.f12448a);
        this.f12453f.m1480a(this.f12448a);
    }

    /* renamed from: a */
    public void m1465a(float f) {
        this.f12453f.m1473c(this.f12452e.f12440g * f);
        this.f12453f.m1471d(this.f12452e.f12441h * f);
        this.f12453f.m1483a(this.f12452e.m1485a() - (this.f12448a.f12440g / 2.0f), this.f12452e.m1478b() - (this.f12448a.f12441h / 2.0f));
        if (this.f12453f.f12435b == m1448d(this.f12453f.f12435b) && this.f12453f.f12434a == m1445e(this.f12453f.f12434a) && this.f12453f.f12436c == m1443f(this.f12453f.f12436c) && this.f12453f.f12437d == m1441g(this.f12453f.f12437d)) {
            this.f12448a.m1480a(this.f12453f);
        }
    }

    /* renamed from: a */
    public void m1459a(EnumC3792a enumC3792a, float f, float f2) {
        if (enumC3792a == EnumC3792a.TOP) {
            float m1448d = m1448d(f2);
            if (this.f12467t) {
                if (m1452c(this.f12450c.f12440g * ((this.f12450c.f12437d - m1448d) / this.f12450c.f12441h))) {
                    this.f12448a.m1469f(m1448d);
                    return;
                }
                return;
            }
            this.f12448a.m1469f(m1448d);
        } else if (enumC3792a == EnumC3792a.LEFT) {
            float m1445e = m1445e(f);
            if (this.f12467t) {
                if (m1456b(this.f12450c.f12441h * ((this.f12450c.f12436c - m1445e) / this.f12450c.f12440g))) {
                    this.f12448a.m1470e(m1445e);
                    return;
                }
                return;
            }
            this.f12448a.m1470e(m1445e);
        } else if (enumC3792a == EnumC3792a.RIGHT) {
            float m1443f = m1443f(f);
            if (this.f12467t) {
                if (m1456b(this.f12450c.f12441h * ((m1443f - this.f12450c.f12434a) / this.f12450c.f12440g))) {
                    this.f12448a.m1467h(m1443f);
                    return;
                }
                return;
            }
            this.f12448a.m1467h(m1443f);
        } else if (enumC3792a == EnumC3792a.BOTTOM) {
            float m1441g = m1441g(f2);
            if (this.f12467t) {
                if (m1452c(this.f12450c.f12440g * ((m1441g - this.f12450c.f12435b) / this.f12450c.f12441h))) {
                    this.f12448a.m1468g(m1441g);
                    return;
                }
                return;
            }
            this.f12448a.m1468g(m1441g);
        }
    }

    /* renamed from: b */
    private boolean m1456b(float f) {
        if (this.f12472y > 0.5f) {
            float f2 = this.f12450c.f12437d - f;
            float m1448d = m1448d(f2);
            if (f2 == m1448d) {
                this.f12448a.m1469f(m1448d);
                return true;
            }
        } else {
            float f3 = this.f12450c.f12435b + f;
            float m1443f = m1443f(f3);
            if (f3 == m1443f) {
                this.f12448a.m1468g(m1443f);
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m1452c(float f) {
        if (this.f12471x > 0.5f) {
            float f2 = this.f12450c.f12436c - f;
            if (f2 == m1445e(f2)) {
                this.f12448a.m1470e(f2);
                return true;
            }
        } else {
            float f3 = this.f12450c.f12434a + f;
            float m1443f = m1443f(f3);
            if (f3 == m1443f) {
                this.f12448a.m1467h(m1443f);
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private float m1448d(float f) {
        if (f > this.f12448a.f12437d - this.f12468u) {
            return this.f12448a.f12437d - this.f12468u;
        }
        if (f < this.f12464q.f12491a.f12435b) {
            return this.f12464q.f12491a.f12435b;
        }
        return f;
    }

    /* renamed from: e */
    private float m1445e(float f) {
        if (f > this.f12448a.f12436c - this.f12468u) {
            return this.f12448a.f12436c - this.f12468u;
        }
        if (f < this.f12464q.f12491a.f12434a) {
            return this.f12464q.f12491a.f12434a;
        }
        return f;
    }

    /* renamed from: f */
    private float m1443f(float f) {
        if (f < this.f12448a.f12434a + this.f12468u) {
            return this.f12448a.f12434a + this.f12468u;
        }
        if (f > this.f12464q.f12491a.f12436c) {
            return this.f12464q.f12491a.f12436c;
        }
        return f;
    }

    /* renamed from: g */
    private float m1441g(float f) {
        if (f < this.f12448a.f12435b + this.f12468u) {
            return this.f12448a.f12435b + this.f12468u;
        }
        if (f > this.f12464q.f12491a.f12437d) {
            return this.f12464q.f12491a.f12437d;
        }
        return f;
    }

    /* renamed from: a */
    public void m1461a(Bitmap bitmap) {
        if (this.f12451d != null) {
            this.f12451d.recycle();
            this.f12451d = null;
        }
        if (bitmap != null) {
            this.f12451d = bitmap;
            this.f12448a.m1473c(this.f12451d.getWidth());
            this.f12448a.m1471d(this.f12451d.getHeight());
            m1458a(true);
            return;
        }
        this.f12451d = null;
    }

    /* renamed from: a */
    public void m1460a(Canvas canvas) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(-1442840576);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawRect(0.0f, 0.0f, this.f12456i, this.f12448a.f12435b, paint);
        canvas.drawRect(0.0f, this.f12448a.f12435b, this.f12448a.f12434a, this.f12448a.f12437d, paint);
        canvas.drawRect(this.f12448a.f12436c, this.f12448a.f12435b, this.f12456i, this.f12448a.f12437d, paint);
        canvas.drawRect(0.0f, this.f12448a.f12437d, this.f12456i, this.f12457j, paint);
        m1454b(canvas);
        m1450c(canvas);
    }

    /* renamed from: b */
    private void m1454b(Canvas canvas) {
        if (this.f12451d != null) {
            float width = this.f12448a.f12440g / this.f12451d.getWidth();
            this.f12473z.setScale(width, width);
            this.f12473z.postTranslate(this.f12448a.f12434a, this.f12448a.f12435b);
            canvas.drawBitmap(this.f12451d, this.f12473z, null);
        }
    }

    /* renamed from: e */
    public float m1446e() {
        return this.f12448a.f12440g / this.f12451d.getWidth();
    }

    /* renamed from: c */
    private void m1450c(Canvas canvas) {
        canvas.drawLine(this.f12448a.f12434a, this.f12448a.f12435b, this.f12448a.f12436c, this.f12448a.f12435b, this.f12466s);
        canvas.drawLine(this.f12448a.f12434a, this.f12448a.f12437d, this.f12448a.f12436c, this.f12448a.f12437d, this.f12466s);
        canvas.drawLine(this.f12448a.f12434a, this.f12448a.f12435b, this.f12448a.f12434a, this.f12448a.f12437d, this.f12466s);
        canvas.drawLine(this.f12448a.f12436c, this.f12448a.f12435b, this.f12448a.f12436c, this.f12448a.f12437d, this.f12466s);
        canvas.drawCircle(this.f12448a.f12434a + (this.f12448a.f12440g / 2.0f), this.f12448a.f12435b, this.f12447A, this.f12465r);
        canvas.drawCircle(this.f12448a.f12434a + (this.f12448a.f12440g / 2.0f), this.f12448a.f12437d, this.f12447A, this.f12465r);
        canvas.drawCircle(this.f12448a.f12434a, this.f12448a.f12435b + (this.f12448a.f12441h / 2.0f), this.f12447A, this.f12465r);
        canvas.drawCircle(this.f12448a.f12436c, this.f12448a.f12435b + (this.f12448a.f12441h / 2.0f), this.f12447A, this.f12465r);
    }

    /* renamed from: b */
    public EnumC3792a m1455b(float f, float f2) {
        float f3 = this.f12448a.f12440g / 2.0f;
        float f4 = this.f12448a.f12441h / 2.0f;
        float f5 = this.f12447A * 2.0f;
        if (f >= this.f12448a.f12434a - f5 && f <= this.f12448a.f12436c + f5 && f2 > this.f12448a.f12435b - f5 && f2 <= this.f12448a.f12437d + f5) {
            m1447d(f, f2);
            if (f > (this.f12448a.f12434a + f3) - f5 && f < f3 + this.f12448a.f12434a + f5) {
                if (f2 > this.f12448a.f12435b - f5 && f2 < this.f12448a.f12435b + f5) {
                    return EnumC3792a.TOP;
                }
                if (f2 > this.f12448a.f12437d - f5 && f2 < this.f12448a.f12437d + f5) {
                    return EnumC3792a.BOTTOM;
                }
            } else if (f2 > (this.f12448a.f12435b + f4) - f5 && f2 < this.f12448a.f12435b + f4 + f5) {
                if (f > this.f12448a.f12434a - f5 && f < this.f12448a.f12434a + f5) {
                    return EnumC3792a.LEFT;
                }
                if (f > this.f12448a.f12436c - f5 && f < this.f12448a.f12436c + f5) {
                    return EnumC3792a.RIGHT;
                }
            }
            return EnumC3792a.CENTER;
        }
        return EnumC3792a.NULL;
    }

    /* renamed from: d */
    private void m1447d(float f, float f2) {
        this.f12458k = f - this.f12448a.f12434a;
        this.f12459l = f2 - this.f12448a.f12435b;
        this.f12462o = f;
        this.f12463p = f2;
        this.f12460m = this.f12448a.f12440g;
        this.f12461n = this.f12448a.f12441h;
        this.f12450c.m1480a(this.f12448a);
        float m1444f = m1444f();
        float m1442g = m1442g();
        this.f12469v = m1444f - this.f12464q.f12491a.f12434a;
        this.f12470w = m1442g - this.f12464q.f12491a.f12435b;
        this.f12471x = this.f12469v / this.f12464q.f12491a.f12440g;
        this.f12472y = this.f12470w / this.f12464q.f12491a.f12441h;
    }

    /* renamed from: c */
    public void m1451c(float f, float f2) {
        this.f12448a.m1483a(f, f2);
    }

    /* renamed from: f */
    public float m1444f() {
        return this.f12448a.m1485a();
    }

    /* renamed from: g */
    public float m1442g() {
        return this.f12448a.m1478b();
    }

    @Override // com.tsf.shell.plugin.crop.C3788b.InterfaceC3789a
    /* renamed from: a */
    public void mo1436a() {
        m1440h();
    }
}
