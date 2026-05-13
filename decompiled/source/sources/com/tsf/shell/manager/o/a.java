package com.tsf.shell.manager.o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.utils.l;
/* loaded from: classes.dex */
public class a {
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a;
    public int aa;
    public com.tsf.shell.manager.o.a.b ab;
    private int ac;
    private com.tsf.shell.utils.d ad;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public Bitmap a() {
        return this.ad.a();
    }

    public Bitmap a(String str) {
        return this.ab.a(str, this);
    }

    public a() {
        this.A = 1.15f;
        this.B = 1.15f;
        this.C = 0.0f;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = 0;
        this.ac = 0;
        a(144, 144, 192, 42, 12, true);
    }

    public a(float f, float f2) {
        this.A = 1.15f;
        this.B = 1.15f;
        this.C = 0.0f;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = 0;
        this.ac = 0;
        a(f, f2);
    }

    public void a(float f, float f2) {
        this.A = f;
        this.B = f2;
        a(144, 144, 192, 42, 12, true);
    }

    public a(float f, float f2, int i, int i2, int i3, int i4, int i5) {
        this.A = 1.15f;
        this.B = 1.15f;
        this.C = 0.0f;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = 0;
        this.ac = 0;
        this.A = f;
        this.B = f2;
        a(i, i2, i3, i4, i5, true);
    }

    private void a(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (z) {
            this.y = com.censivn.C3DEngine.b.b.a.c * this.A;
            this.z = com.censivn.C3DEngine.b.b.a.c * this.B;
        } else {
            this.y = this.A;
            this.z = this.B;
        }
        this.C = 12.0f * this.y;
        this.H = (((int) (i * this.y)) / 2) * 2;
        this.I = (((int) (i2 * this.y)) / 2) * 2;
        this.J = (((int) (i3 * this.z)) / 2) * 2;
        this.K = (((int) (i4 * this.z)) / 2) * 2;
        this.ac = (((int) (i5 * this.y)) / 2) * 2;
        this.V = this.H > this.J ? this.H + 2 : this.J + 2;
        this.W = this.I + 2 + this.K + 2;
        this.T = this.V;
        this.U = this.W + this.ac;
        this.D = (this.V - this.H) / 2;
        this.E = 1;
        this.F = (this.V - this.J) / 2;
        this.G = this.I + 2 + 1;
        this.X = 0;
        this.Y = (this.U / 2) - ((this.I + 2) / 2);
        this.Z = 0;
        this.aa = -((this.U / 2) - ((this.K + 2) / 2));
        this.P = ((-this.H) / 2) + 2;
        this.Q = (this.H / 2) + 2;
        this.R = ((-this.I) / 2) + 2;
        this.S = (this.I / 2) + 2;
        this.L = (-this.T) / 2;
        this.M = this.T / 2;
        this.N = (-this.U) / 2;
        this.O = this.U / 2;
        this.ad = new com.tsf.shell.utils.d(this.V, this.W);
    }

    public float a(int i) {
        return (int) (i * this.z);
    }

    private com.censivn.C3DEngine.b.f.a.a c() {
        return new com.censivn.C3DEngine.b.f.a.a(2, 0, this.V, this.W);
    }

    public com.censivn.C3DEngine.b.f.a.a b() {
        return a(c());
    }

    public com.censivn.C3DEngine.b.f.a.a a(com.censivn.C3DEngine.b.f.a.a aVar) {
        com.censivn.C3DEngine.b.f.a.b a = aVar.a(0);
        a.a(0, this.E - 1, 0, 0, this.V, this.I + 2);
        a.i().x = this.X;
        a.i().y = this.Y;
        a.a(true);
        a.a(0.0f, this.E - 1, this.V, this.I + 2);
        a.h();
        com.censivn.C3DEngine.b.f.a.b a2 = aVar.a(1);
        a2.a(this.F - 1, this.G - 1, 0, 0, this.J + 2, this.K + 2);
        a2.i().x = this.Z;
        a2.i().y = this.aa;
        a2.a(true);
        a2.a(this.F - 1, this.G - 1, this.J + 2, this.K + 2);
        a2.h();
        if (this.i == 0.0f) {
            this.a = aVar.a(0).a;
            this.b = aVar.a(0).b;
            this.c = aVar.a(0).c;
            this.d = aVar.a(0).d;
            this.e = aVar.a(1).a;
            this.f = aVar.a(1).b;
            this.g = aVar.a(1).c;
            this.h = aVar.a(1).d;
            this.i = aVar.points().pxX(this.a);
            this.j = aVar.points().pxX(this.b);
            this.k = aVar.points().pxX(this.c);
            this.l = aVar.points().pxX(this.d);
            this.m = aVar.points().pxX(this.e);
            this.n = aVar.points().pxX(this.f);
            this.o = aVar.points().pxX(this.g);
            this.p = aVar.points().pxX(this.h);
            this.q = aVar.points().pxY(this.a);
            this.r = aVar.points().pxY(this.b);
            this.s = aVar.points().pxY(this.c);
            this.t = aVar.points().pxY(this.d);
            this.u = aVar.points().pxY(this.e);
            this.v = aVar.points().pxY(this.f);
            this.w = aVar.points().pxY(this.g);
            this.x = aVar.points().pxY(this.h);
        }
        return aVar;
    }

    public void a(Canvas canvas, Bitmap bitmap, Bitmap bitmap2, boolean z) {
        if (bitmap != null) {
            a(canvas, bitmap, z);
        }
        if (bitmap2 != null) {
            b(canvas, bitmap2, z);
        }
    }

    public void a(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, ((this.H - bitmap.getWidth()) / 2) + this.D, ((this.H - bitmap.getHeight()) / 2) + this.E, (Paint) null);
        bitmap.recycle();
    }

    public void a(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, ((this.H - bitmap.getWidth()) / 2) + this.D, ((this.H - bitmap.getHeight()) / 2) + this.E, paint);
        bitmap.recycle();
    }

    public void a(Canvas canvas, Bitmap bitmap, boolean z) {
        if (bitmap.getWidth() != this.H || bitmap.getHeight() != this.I) {
            l.a(bitmap, "drawIconToCanvas icon size error  w:" + bitmap.getWidth() + "   h:" + bitmap.getHeight() + "  sw:" + this.H + "  sh:" + this.I);
        }
        canvas.drawBitmap(bitmap, this.D, this.E, (Paint) null);
        if (z) {
            bitmap.recycle();
        }
    }

    public void b(Canvas canvas, Bitmap bitmap, boolean z) {
        canvas.drawBitmap(bitmap, this.F, this.G, (Paint) null);
        if (z) {
            bitmap.recycle();
        }
    }

    public void a(i iVar, boolean z) {
        if (z) {
            iVar.setAABBPX(this.L, this.N, 0.0f, this.M, this.O, 0.0f);
        } else {
            iVar.setAABBPX(this.P, this.R, 0.0f, this.Q, this.S, 0.0f);
        }
    }

    public void a(i iVar, float f, float f2, boolean z) {
        if (z) {
            iVar.setAABBPX(this.L + f, this.N + f2, 0.0f, this.M + f, this.O + f2, 0.0f);
        } else {
            iVar.setAABBPX(this.P + f, this.R + f2, 0.0f, this.Q + f, this.S + f2, 0.0f);
        }
    }
}
