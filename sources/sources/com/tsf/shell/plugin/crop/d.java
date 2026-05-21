package com.tsf.shell.plugin.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.TypedValue;
import com.tsf.shell.plugin.crop.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d implements b.a {
    private float A;
    public Bitmap d;
    private float g;
    private float h;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private g q;
    private Paint r;
    private Paint s;
    private float v;
    private float w;
    private float x;
    private float y;
    private int i = 0;
    private int j = 0;
    private boolean t = true;
    public b a = new b();
    public b b = new b();
    public b c = new b();
    private float u = 30.0f;
    private Matrix z = new Matrix();
    b e = new b();
    b f = new b();

    enum a {
        CENTER,
        NULL,
        TOP,
        LEFT,
        RIGHT,
        BOTTOM
    }

    public d(Context context, g gVar) {
        this.a.a(this);
        this.q = gVar;
        this.q.a(this);
        this.A = TypedValue.applyDimension(1, 6.0f, context.getResources().getDisplayMetrics());
        c.a("mCornetRadius:" + this.A);
        this.r = new Paint();
        this.r.setAntiAlias(true);
        this.r.setDither(true);
        this.r.setColor(-1);
        this.r.setStyle(Paint.Style.FILL);
        this.r.setStrokeJoin(Paint.Join.ROUND);
        this.r.setStrokeCap(Paint.Cap.ROUND);
        this.r.setStrokeWidth(5.0f);
        this.s = new Paint();
        this.s.setAntiAlias(true);
        this.s.setDither(true);
        this.s.setColor(-1429418804);
        this.s.setStyle(Paint.Style.FILL);
        this.s.setStrokeJoin(Paint.Join.ROUND);
        this.s.setStrokeCap(Paint.Cap.ROUND);
        this.s.setStrokeWidth(1.0f);
    }

    public void a(boolean z) {
        this.t = z;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.a.a(f, f2, f3, f4);
        this.g = f3;
        this.h = f4;
        h();
    }

    public float b() {
        return this.g / Math.max(this.a.g, this.a.h);
    }

    private void h() {
        this.a.a(this.q.a, this.b);
    }

    public void c() {
        this.a.b(this.q.a, this.b);
    }

    public void a(int i, int i2) {
        this.i = i;
        this.j = i2;
        i();
    }

    private void i() {
        this.a.a((this.i - this.a.g) / 2.0f);
        this.a.b((this.j - this.a.h) / 2.0f);
    }

    public void a(float f, float f2) {
        float f3 = f - this.k;
        float f4 = f2 - this.l;
        if (f3 < this.q.a.a) {
            f3 = this.q.a.a;
        } else if (f3 > this.q.a.c - this.a.g) {
            f3 = this.q.a.c - this.a.g;
        }
        if (f4 < this.q.a.b) {
            f4 = this.q.a.b;
        } else if (f4 > this.q.a.d - this.a.h) {
            f4 = this.q.a.d - this.a.h;
        }
        this.a.a(f3, f4);
    }

    public void d() {
        this.e.a(this.a);
        this.f.a(this.a);
    }

    public void a(float f) {
        this.f.c(this.e.g * f);
        this.f.d(this.e.h * f);
        this.f.a(this.e.a() - (this.a.g / 2.0f), this.e.b() - (this.a.h / 2.0f));
        if (this.f.b == d(this.f.b) && this.f.a == e(this.f.a) && this.f.c == f(this.f.c) && this.f.d == g(this.f.d)) {
            this.a.a(this.f);
        }
    }

    public void a(a aVar, float f, float f2) {
        if (aVar == a.TOP) {
            float fD = d(f2);
            if (this.t) {
                if (c(this.c.g * ((this.c.d - fD) / this.c.h))) {
                    this.a.f(fD);
                    return;
                }
                return;
            }
            this.a.f(fD);
            return;
        }
        if (aVar == a.LEFT) {
            float fE = e(f);
            if (this.t) {
                if (b(this.c.h * ((this.c.c - fE) / this.c.g))) {
                    this.a.e(fE);
                    return;
                }
                return;
            }
            this.a.e(fE);
            return;
        }
        if (aVar == a.RIGHT) {
            float f3 = f(f);
            if (this.t) {
                if (b(this.c.h * ((f3 - this.c.a) / this.c.g))) {
                    this.a.h(f3);
                    return;
                }
                return;
            }
            this.a.h(f3);
            return;
        }
        if (aVar == a.BOTTOM) {
            float fG = g(f2);
            if (this.t) {
                if (c(this.c.g * ((fG - this.c.b) / this.c.h))) {
                    this.a.g(fG);
                    return;
                }
                return;
            }
            this.a.g(fG);
        }
    }

    private boolean b(float f) {
        if (this.y > 0.5f) {
            float f2 = this.c.d - f;
            float fD = d(f2);
            if (f2 == fD) {
                this.a.f(fD);
                return true;
            }
        } else {
            float f3 = this.c.b + f;
            float f4 = f(f3);
            if (f3 == f4) {
                this.a.g(f4);
                return true;
            }
        }
        return false;
    }

    private boolean c(float f) {
        if (this.x > 0.5f) {
            float f2 = this.c.c - f;
            if (f2 == e(f2)) {
                this.a.e(f2);
                return true;
            }
        } else {
            float f3 = this.c.a + f;
            float f4 = f(f3);
            if (f3 == f4) {
                this.a.h(f4);
                return true;
            }
        }
        return false;
    }

    private float d(float f) {
        if (f > this.a.d - this.u) {
            return this.a.d - this.u;
        }
        if (f < this.q.a.b) {
            return this.q.a.b;
        }
        return f;
    }

    private float e(float f) {
        if (f > this.a.c - this.u) {
            return this.a.c - this.u;
        }
        if (f < this.q.a.a) {
            return this.q.a.a;
        }
        return f;
    }

    private float f(float f) {
        if (f < this.a.a + this.u) {
            return this.a.a + this.u;
        }
        if (f > this.q.a.c) {
            return this.q.a.c;
        }
        return f;
    }

    private float g(float f) {
        if (f < this.a.b + this.u) {
            return this.a.b + this.u;
        }
        if (f > this.q.a.d) {
            return this.q.a.d;
        }
        return f;
    }

    public void a(Bitmap bitmap) {
        if (this.d != null) {
            this.d.recycle();
            this.d = null;
        }
        if (bitmap != null) {
            this.d = bitmap;
            this.a.c(this.d.getWidth());
            this.a.d(this.d.getHeight());
            a(true);
            return;
        }
        this.d = null;
    }

    public void a(Canvas canvas) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(-1442840576);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawRect(0.0f, 0.0f, this.i, this.a.b, paint);
        canvas.drawRect(0.0f, this.a.b, this.a.a, this.a.d, paint);
        canvas.drawRect(this.a.c, this.a.b, this.i, this.a.d, paint);
        canvas.drawRect(0.0f, this.a.d, this.i, this.j, paint);
        b(canvas);
        c(canvas);
    }

    private void b(Canvas canvas) {
        if (this.d != null) {
            float width = this.a.g / this.d.getWidth();
            this.z.setScale(width, width);
            this.z.postTranslate(this.a.a, this.a.b);
            canvas.drawBitmap(this.d, this.z, null);
        }
    }

    public float e() {
        return this.a.g / this.d.getWidth();
    }

    private void c(Canvas canvas) {
        canvas.drawLine(this.a.a, this.a.b, this.a.c, this.a.b, this.s);
        canvas.drawLine(this.a.a, this.a.d, this.a.c, this.a.d, this.s);
        canvas.drawLine(this.a.a, this.a.b, this.a.a, this.a.d, this.s);
        canvas.drawLine(this.a.c, this.a.b, this.a.c, this.a.d, this.s);
        canvas.drawCircle(this.a.a + (this.a.g / 2.0f), this.a.b, this.A, this.r);
        canvas.drawCircle(this.a.a + (this.a.g / 2.0f), this.a.d, this.A, this.r);
        canvas.drawCircle(this.a.a, this.a.b + (this.a.h / 2.0f), this.A, this.r);
        canvas.drawCircle(this.a.c, this.a.b + (this.a.h / 2.0f), this.A, this.r);
    }

    public a b(float f, float f2) {
        float f3 = this.a.g / 2.0f;
        float f4 = this.a.h / 2.0f;
        float f5 = this.A * 2.0f;
        if (f >= this.a.a - f5 && f <= this.a.c + f5 && f2 > this.a.b - f5 && f2 <= this.a.d + f5) {
            d(f, f2);
            if (f <= (this.a.a + f3) - f5 || f >= f3 + this.a.a + f5) {
                if (f2 > (this.a.b + f4) - f5 && f2 < this.a.b + f4 + f5) {
                    if (f > this.a.a - f5 && f < this.a.a + f5) {
                        return a.LEFT;
                    }
                    if (f > this.a.c - f5 && f < this.a.c + f5) {
                        return a.RIGHT;
                    }
                }
            } else {
                if (f2 > this.a.b - f5 && f2 < this.a.b + f5) {
                    return a.TOP;
                }
                if (f2 > this.a.d - f5 && f2 < this.a.d + f5) {
                    return a.BOTTOM;
                }
            }
            return a.CENTER;
        }
        return a.NULL;
    }

    private void d(float f, float f2) {
        this.k = f - this.a.a;
        this.l = f2 - this.a.b;
        this.o = f;
        this.p = f2;
        this.m = this.a.g;
        this.n = this.a.h;
        this.c.a(this.a);
        float f3 = f();
        float fG = g();
        this.v = f3 - this.q.a.a;
        this.w = fG - this.q.a.b;
        this.x = this.v / this.q.a.g;
        this.y = this.w / this.q.a.h;
    }

    public void c(float f, float f2) {
        this.a.a(f, f2);
    }

    public float f() {
        return this.a.a();
    }

    public float g() {
        return this.a.b();
    }

    @Override // com.tsf.shell.plugin.crop.b.a
    public void a() {
        h();
    }
}
