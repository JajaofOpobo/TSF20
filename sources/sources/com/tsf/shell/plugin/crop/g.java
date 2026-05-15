package com.tsf.shell.plugin.crop;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.tsf.shell.plugin.crop.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g implements b.a {
    private float B;
    private float C;
    private float D;
    private Bitmap b;
    private float f;
    private float g;
    private d i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;
    private Matrix c = new Matrix();
    private int d = 0;
    private int e = 0;
    private float h = 1.0f;
    private boolean A = false;
    public b a = new b();

    public g() {
        this.a.a(this);
    }

    public void a(d dVar) {
        this.i = dVar;
    }

    public void a(int i, int i2) {
        this.d = i;
        this.e = i2;
        this.a.a(0.0f, 0.0f, i, i2);
        c();
    }

    public void a(boolean z) {
        this.A = z;
    }

    public boolean a(Canvas canvas) {
        boolean zD = false;
        if (!this.A) {
            zD = d();
        }
        if (this.b != null) {
            canvas.drawBitmap(this.b, this.c, null);
        }
        return zD;
    }

    public void a(Canvas canvas, Paint paint) {
        if (this.b != null) {
            canvas.drawBitmap(this.b, this.c, paint);
        }
    }

    private boolean d() {
        boolean z = false;
        float f = this.D - this.h;
        if (Math.abs(f) > 0.001f) {
            a(this.h + (f * 0.2f));
            z = true;
        }
        float f2 = this.B - this.a.e;
        if (Math.abs(f2) > 0.001f) {
            this.a.a(this.a.e + (f2 * 0.2f));
            z = true;
        }
        float f3 = this.C - this.a.f;
        if (Math.abs(f3) <= 0.001f) {
            return z;
        }
        this.a.b(this.a.f + (f3 * 0.2f));
        return true;
    }

    public void b() {
        float fB = this.i.b();
        this.D = this.h * fB;
        if (this.D <= this.f) {
            this.D = this.f;
        } else if (this.D >= this.g) {
            this.D = this.g;
        }
        float f = this.D * this.p;
        float f2 = this.D * this.q;
        float f3 = this.i.f();
        float fG = this.i.g();
        this.r = f3 - this.a.a;
        this.s = fG - this.a.b;
        this.w = this.r / this.a.g;
        this.x = this.s / this.a.h;
        float f4 = f * this.w;
        float f5 = f2 * this.x;
        this.B = (this.d / 2.0f) - f4;
        this.C = (this.e / 2.0f) - f5;
        c.a("calculateFitSize:" + fB);
    }

    public void a(Bitmap bitmap) {
        this.b = bitmap;
        this.p = this.b.getWidth();
        this.q = this.b.getHeight();
        c();
    }

    public void c() {
        if (this.b != null && this.d != 0 && this.e != 0) {
            this.c.reset();
            float fMin = Math.min(this.d / this.p, this.e / this.q);
            this.f = fMin;
            this.h = fMin;
            this.D = fMin;
            this.g = this.f * 5.0f;
            float f = this.f * this.p;
            float f2 = this.f * this.q;
            float f3 = (this.d - f) / 2.0f;
            this.B = f3;
            this.y = f3;
            float f4 = (this.e - f2) / 2.0f;
            this.C = f4;
            this.z = f4;
            this.a.a(this.y, this.z, f, f2);
            this.c.setScale(this.f, this.f);
            this.c.postTranslate(this.y, this.z);
            float fMin2 = Math.min(f, f2) * 0.8f;
            this.i.a((this.d - fMin2) / 2.0f, (this.e - fMin2) / 2.0f, fMin2, fMin2);
        }
    }

    public void a(float f) {
        this.h = f;
        float f2 = this.p * this.h;
        float f3 = this.q * this.h;
        this.a.c(f2);
        this.a.d(f3);
    }

    public void a(float f, float f2) {
        this.j = f - this.a.a;
        this.k = f2 - this.a.b;
        this.l = f;
        this.m = f2;
        this.n = this.a.g;
        this.o = this.a.h;
        this.u = this.a.e;
        this.v = this.a.f;
        float f3 = this.i.f();
        float fG = this.i.g();
        this.r = f3 - this.a.a;
        this.s = fG - this.a.b;
        this.w = this.r / this.n;
        this.x = this.s / this.o;
        this.t = this.h;
    }

    @Override // com.tsf.shell.plugin.crop.b.a
    public void a() {
        this.c.setScale(this.h, this.h);
        this.c.postTranslate(this.a.a, this.a.b);
        this.i.c();
    }
}
