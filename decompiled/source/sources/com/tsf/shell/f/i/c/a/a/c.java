package com.tsf.shell.f.i.c.a.a;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* loaded from: classes.dex */
public class c extends VObject3dContainer {
    private static final float[] a = {0.0f, 0.0f, 0.0f, 0.5f};
    private static final float[] b = {0.0f, 0.0f, 0.0f, 0.0f};
    private int A;
    private int B;
    private PointF C;
    private PointF D;
    private double E;
    private a<b> d;
    private a<C0117c> e;
    private a<C0117c> f;
    private a<C0117c> g;
    private a<Double> h;
    private a<b> i;
    private a<b> j;
    private a<C0117c> k;
    private FloatBuffer l;
    private FloatBuffer m;
    private FloatBuffer n;
    private FloatBuffer o;
    private FloatBuffer p;
    private int q;
    private int s;
    private int u;
    private int c = 0;
    private boolean r = false;
    private final C0117c[] t = new C0117c[4];
    private boolean v = false;
    private boolean w = true;
    private final e x = new e();
    private final RectF y = new RectF();
    private final RectF z = new RectF();

    public c(int i) {
        this.y.set(0.0f, 0.0f, 1.0f, 1.0f);
        this.z.set(0.0f, 0.0f, 1.0f, 1.0f);
        this.s = i < 1 ? 1 : i;
        this.h = new a<>(i + 2);
        this.f = new a<>(7);
        this.g = new a<>(4);
        this.e = new a<>(2);
        this.k = new a<>(11);
        for (int i2 = 0; i2 < 11; i2++) {
            this.k.a((a<C0117c>) new C0117c());
        }
        this.i = new a<>((this.s + 2) * 2);
        this.d = new a<>((this.s + 2) * 2);
        this.j = new a<>((this.s + 2) * 2);
        for (int i3 = 0; i3 < (this.s + 2) * 2; i3++) {
            this.j.a((a<b>) new b());
        }
        for (int i4 = 0; i4 < 4; i4++) {
            this.t[i4] = new C0117c();
        }
        C0117c c0117c = this.t[0];
        C0117c c0117c2 = this.t[1];
        C0117c c0117c3 = this.t[1];
        this.t[3].d = -1.0d;
        c0117c3.d = -1.0d;
        c0117c2.c = -1.0d;
        c0117c.c = -1.0d;
        C0117c c0117c4 = this.t[0];
        C0117c c0117c5 = this.t[2];
        C0117c c0117c6 = this.t[2];
        this.t[3].c = 1.0d;
        c0117c6.d = 1.0d;
        c0117c5.c = 1.0d;
        c0117c4.d = 1.0d;
        int i5 = (this.s * 2) + 6;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i5 * 3 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.p = allocateDirect.asFloatBuffer();
        this.p.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i5 * 2 * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.o = allocateDirect2.asFloatBuffer();
        this.o.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(i5 * 4 * 4);
        allocateDirect3.order(ByteOrder.nativeOrder());
        this.l = allocateDirect3.asFloatBuffer();
        this.l.position(0);
        int i6 = (this.s + 2) * 2 * 2;
        ByteBuffer allocateDirect4 = ByteBuffer.allocateDirect(i6 * 4 * 4);
        allocateDirect4.order(ByteOrder.nativeOrder());
        this.m = allocateDirect4.asFloatBuffer();
        this.m.position(0);
        ByteBuffer allocateDirect5 = ByteBuffer.allocateDirect(i6 * 3 * 4);
        allocateDirect5.order(ByteOrder.nativeOrder());
        this.n = allocateDirect5.asFloatBuffer();
        this.n.position(0);
        this.u = 0;
        this.q = 0;
    }

    private void a(C0117c c0117c) {
        float alpha = alpha() / 255.0f;
        this.p.put((float) c0117c.e);
        this.p.put((float) c0117c.f);
        this.p.put((float) c0117c.g);
        this.l.put(((c0117c.b * Color.red(c0117c.a)) / 255.0f) * alpha);
        this.l.put(((c0117c.b * Color.green(c0117c.a)) / 255.0f) * alpha);
        this.l.put(((c0117c.b * Color.blue(c0117c.a)) / 255.0f) * alpha);
        this.l.put(alpha * (Color.alpha(c0117c.a) / 255.0f));
        this.o.put((float) c0117c.h);
        this.o.put((float) c0117c.i);
    }

    public synchronized void a() {
        if (this.C != null) {
            a(this.C, this.D, this.E);
        }
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void alpha(int i) {
        if (i < 0) {
            i = 0;
        }
        super.alpha(i);
        a();
    }

    public synchronized void a(PointF pointF, PointF pointF2, double d) {
        boolean z;
        this.w = false;
        visible(true);
        float alpha = alpha() / 255.0f;
        this.p.position(0);
        this.l.position(0);
        this.o.position(0);
        double acos = Math.acos(pointF2.x);
        double d2 = pointF2.y > 0.0f ? -acos : acos;
        this.k.a(this.g);
        this.g.a();
        for (int i = 0; i < 4; i++) {
            C0117c b2 = this.k.b(0);
            b2.a(this.t[i]);
            b2.a(-pointF.x, -pointF.y);
            b2.a(-d2);
            for (int i2 = 0; i2 < this.g.b(); i2++) {
                C0117c a2 = this.g.a(i2);
                if (b2.e <= a2.e && (b2.e != a2.e || b2.f <= a2.f)) {
                }
                this.g.a(i2, b2);
            }
            this.g.a(i2, b2);
        }
        int[][] iArr = {new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 3}, new int[]{2, 3}};
        C0117c a3 = this.g.a(0);
        C0117c a4 = this.g.a(2);
        C0117c a5 = this.g.a(3);
        if (Math.sqrt(((a3.e - a4.e) * (a3.e - a4.e)) + ((a3.f - a4.f) * (a3.f - a4.f))) > Math.sqrt(((a3.f - a5.f) * (a3.f - a5.f)) + ((a3.e - a5.e) * (a3.e - a5.e)))) {
            iArr[1][1] = 3;
            iArr[2][1] = 2;
        }
        this.A = 0;
        this.B = 0;
        this.j.a(this.d);
        this.j.a(this.i);
        this.d.a();
        this.i.a();
        double d3 = 3.141592653589793d * d;
        this.h.a();
        if (this.s > 0) {
            this.h.a((a<Double>) Double.valueOf(0.0d));
        }
        for (int i3 = 1; i3 < this.s; i3++) {
            this.h.a((a<Double>) Double.valueOf(((-d3) * i3) / (this.s - 1)));
        }
        this.h.a((a<Double>) Double.valueOf(this.g.a(3).e - 1.0d));
        int i4 = 0;
        double d4 = 1.0d + this.g.a(0).e;
        while (i4 < this.h.b()) {
            double doubleValue = this.h.a(i4).doubleValue();
            for (int i5 = 0; i5 < this.g.b(); i5++) {
                C0117c a6 = this.g.a(i5);
                if (a6.e >= doubleValue && a6.e <= d4) {
                    C0117c b3 = this.k.b(0);
                    b3.a(a6);
                    a<C0117c> a7 = a(this.g, iArr, b3.e);
                    if (a7.b() == 1 && a7.a(0).f > a6.f) {
                        this.f.a(a7);
                        this.f.a((a<C0117c>) b3);
                    } else if (a7.b() <= 1) {
                        this.f.a((a<C0117c>) b3);
                        this.f.a(a7);
                    } else {
                        this.k.a((a<C0117c>) b3);
                        this.k.a(a7);
                    }
                }
            }
            a<C0117c> a8 = a(this.g, iArr, doubleValue);
            if (a8.b() == 2) {
                C0117c a9 = a8.a(0);
                C0117c a10 = a8.a(1);
                if (a9.f < a10.f) {
                    this.f.a((a<C0117c>) a10);
                    this.f.a((a<C0117c>) a9);
                } else {
                    this.f.a(a8);
                }
            } else if (a8.b() != 0) {
                this.k.a(a8);
            }
            while (this.f.b() > 0) {
                C0117c b4 = this.f.b(0);
                this.k.a((a<C0117c>) b4);
                if (i4 == 0) {
                    z = true;
                    this.B++;
                } else if (i4 == this.h.b() - 1 || d3 == 0.0d) {
                    b4.e = -(b4.e + d3);
                    b4.g = 2.0d * d;
                    b4.c = -b4.c;
                    z = false;
                    this.A++;
                } else {
                    double d5 = 3.141592653589793d * (b4.e / d3);
                    b4.e = Math.sin(d5) * d;
                    b4.g = d - (Math.cos(d5) * d);
                    b4.c *= Math.cos(d5);
                    b4.b = (float) ((Math.sqrt(Math.sin(d5) + 1.0d) * 0.800000011920929d) + 0.20000000298023224d);
                    if (b4.g >= 10.0d + d) {
                        z = false;
                        this.A++;
                    } else {
                        z = true;
                        this.B++;
                    }
                }
                if (z != this.r) {
                    b4.h *= this.z.right;
                    b4.i *= this.z.bottom;
                    b4.a = this.x.a(1);
                } else {
                    b4.h *= this.y.right;
                    b4.i *= this.y.bottom;
                    b4.a = this.x.a(2);
                }
                b4.a(d2);
                b4.a(pointF.x, pointF.y);
                a(b4);
                if (b4.g > 0.0d && b4.g <= d) {
                    b b5 = this.j.b(0);
                    b5.d = b4.e;
                    b5.e = b4.f;
                    b5.f = b4.g;
                    b5.b = (b4.g / 1.0d) * (-pointF2.x);
                    b5.c = (b4.g / 1.0d) * (-pointF2.y);
                    b5.a = b4.g / d;
                    this.d.a((this.d.b() + 1) / 2, b5);
                }
                if (b4.g > d) {
                    b b6 = this.j.b(0);
                    b6.d = b4.e;
                    b6.e = b4.f;
                    b6.f = b4.g;
                    b6.b = ((b4.g - d) / 3.0d) * b4.c;
                    b6.c = ((b4.g - d) / 3.0d) * b4.d;
                    b6.a = (b4.g - d) / (2.0d * d);
                    this.i.a((this.i.b() + 1) / 2, b6);
                }
            }
            i4++;
            d4 = doubleValue;
        }
        this.p.position(0);
        this.l.position(0);
        this.o.position(0);
        this.m.position(0);
        this.n.position(0);
        this.q = 0;
        for (int i6 = 0; i6 < this.d.b(); i6++) {
            b a11 = this.d.a(i6);
            this.n.put((float) a11.d);
            this.n.put((float) a11.e);
            this.n.put((float) a11.f);
            this.n.put((float) (a11.d + a11.b));
            this.n.put((float) (a11.e + a11.c));
            this.n.put((float) a11.f);
            for (int i7 = 0; i7 < 4; i7++) {
                this.m.put(((float) (b[i7] + ((a[i7] - b[i7]) * a11.a))) * alpha);
            }
            this.m.put(b);
            this.q += 2;
        }
        this.u = 0;
        for (int i8 = 0; i8 < this.i.b(); i8++) {
            b a12 = this.i.a(i8);
            this.n.put((float) a12.d);
            this.n.put((float) a12.e);
            this.n.put((float) a12.f);
            this.n.put((float) (a12.d + a12.b));
            this.n.put((float) (a12.e + a12.c));
            this.n.put((float) a12.f);
            for (int i9 = 0; i9 < 4; i9++) {
                this.m.put((float) (b[i9] + ((a[i9] - b[i9]) * a12.a)));
            }
            this.m.put(b);
            this.u += 2;
        }
        this.m.position(0);
        this.n.position(0);
    }

    private a<C0117c> a(a<C0117c> aVar, int[][] iArr, double d) {
        this.e.a();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < iArr.length) {
                C0117c a2 = aVar.a(iArr[i2][0]);
                C0117c a3 = aVar.a(iArr[i2][1]);
                if (a2.e > d && a3.e < d) {
                    double d2 = (d - a3.e) / (a2.e - a3.e);
                    C0117c b2 = this.k.b(0);
                    b2.a(a3);
                    b2.e = d;
                    b2.f += (a2.f - a3.f) * d2;
                    b2.h += (a2.h - a3.h) * d2;
                    b2.i += (a2.i - a3.i) * d2;
                    b2.c += (a2.c - a3.c) * d2;
                    b2.d = ((a2.d - a3.d) * d2) + b2.d;
                    this.e.a((a<C0117c>) b2);
                }
                i = i2 + 1;
            } else {
                return this.e;
            }
        }
    }

    public synchronized e b() {
        return this.x;
    }

    public void c() {
        if (visible() && this.x.b(1) != null) {
            ShaderManager.enableShader(ShaderManager.SHADER_COLOR_TEXTURE);
            MatrixStack.glPushMatrix();
            drawMVPMatrix();
            GLES20.glActiveTexture(33984);
            ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.o);
            ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.p);
            ShaderManager.SHADER_COLOR_TEXTURE.glColorPointer(4, 5126, false, 0, this.l);
            GLES20.glEnable(3553);
            if (this.r || !this.v) {
                GLES20.glBindTexture(3553, this.x.b(1).id);
            } else {
                GLES20.glBindTexture(3553, this.x.b(2).id);
            }
            GLES20.glDrawArrays(5, 0, this.B);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maTextureHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maPositionHandle);
            ShaderManager.enableShader(ShaderManager.SHADER_COLOR);
            GLES20.glUniformMatrix4fv(ShaderManager.SHADER_COLOR.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
            ShaderManager.SHADER_COLOR.glColorPointer(4, 5126, false, 0, this.m);
            ShaderManager.SHADER_COLOR.glVertexPointer(3, 5126, false, 0, this.n);
            GLES20.glDrawArrays(5, 0, this.q);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR.maPositionHandle);
            MatrixStack.glPopMatrix();
        }
    }

    public synchronized void d() {
        if (!this.w && this.A != 0 && visible() && this.x.b(2) != null) {
            ShaderManager.enableShader(ShaderManager.SHADER_COLOR_TEXTURE);
            MatrixStack.glPushMatrix();
            drawMVPMatrix();
            GLES20.glActiveTexture(33984);
            ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.o);
            ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.p);
            ShaderManager.SHADER_COLOR_TEXTURE.glColorPointer(4, 5126, false, 0, this.l);
            int max = Math.max(0, this.B - 12);
            int i = (this.B + this.A) - max;
            GLES20.glEnable(3553);
            if (this.r || !this.v) {
                GLES20.glBindTexture(3553, this.x.b(1).id);
            } else {
                GLES20.glBindTexture(3553, this.x.b(2).id);
            }
            GLES20.glDrawArrays(5, max, i);
            ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.o);
            ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.p);
            ShaderManager.SHADER_COLOR_TEXTURE.glColorPointer(4, 5126, false, 0, this.l);
            ShaderManager.enableShader(ShaderManager.SHADER_COLOR);
            GLES20.glUniformMatrix4fv(ShaderManager.SHADER_COLOR.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
            ShaderManager.SHADER_COLOR.glColorPointer(4, 5126, false, 0, this.m);
            ShaderManager.SHADER_COLOR.glVertexPointer(3, 5126, false, 0, this.n);
            GLES20.glDrawArrays(5, this.q, this.u);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maTextureHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maPositionHandle);
            MatrixStack.glPopMatrix();
        }
    }

    public synchronized void e() {
        this.w = true;
        visible(false);
        VTween.killTween(this);
        position().setAll(0.0f, 47.0f * d.j, 0.0f);
        alpha(255);
        this.p.position(0);
        this.l.position(0);
        this.o.position(0);
        for (int i = 0; i < 4; i++) {
            C0117c a2 = this.k.a(0);
            a2.a(this.t[i]);
            if (this.r) {
                a2.h *= this.y.right;
                a2.i *= this.y.bottom;
                a2.a = this.x.a(2);
            } else {
                a2.h *= this.z.right;
                a2.i *= this.z.bottom;
                a2.a = this.x.a(1);
            }
            a(a2);
        }
        this.B = 4;
        this.A = 0;
        this.p.position(0);
        this.l.position(0);
        this.o.position(0);
        this.u = 0;
        this.q = 0;
    }

    public synchronized void a(boolean z) {
        this.r = z;
        if (z) {
            a(1.0f, 0.0f, 0.0f, 1.0f);
        } else {
            a(0.0f, 0.0f, 1.0f, 1.0f);
        }
    }

    public void a(RectF rectF) {
        this.t[0].e = rectF.left;
        this.t[0].f = rectF.top;
        this.t[1].e = rectF.left;
        this.t[1].f = rectF.bottom;
        this.t[2].e = rectF.right;
        this.t[2].f = rectF.top;
        this.t[3].e = rectF.right;
        this.t[3].f = rectF.bottom;
    }

    private synchronized void a(float f, float f2, float f3, float f4) {
        this.t[0].h = f;
        this.t[0].i = f2;
        this.t[1].h = f;
        this.t[1].i = f4;
        this.t[2].h = f3;
        this.t[2].i = f2;
        this.t[3].h = f3;
        this.t[3].i = f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a<T> {
        private Object[] b;
        private int c;
        private int d;

        public a(int i) {
            this.c = i;
            this.b = new Object[i];
        }

        public void a(int i, T t) {
            if (i < 0 || i > this.d || this.d >= this.c) {
                throw new IndexOutOfBoundsException();
            }
            for (int i2 = this.d; i2 > i; i2--) {
                this.b[i2] = this.b[i2 - 1];
            }
            this.b[i] = t;
            this.d++;
        }

        public void a(T t) {
            if (this.d >= this.c) {
                throw new IndexOutOfBoundsException();
            }
            Object[] objArr = this.b;
            int i = this.d;
            this.d = i + 1;
            objArr[i] = t;
        }

        public void a(a<T> aVar) {
            if (this.d + aVar.b() > this.c) {
                throw new IndexOutOfBoundsException();
            }
            for (int i = 0; i < aVar.b(); i++) {
                Object[] objArr = this.b;
                int i2 = this.d;
                this.d = i2 + 1;
                objArr[i2] = aVar.a(i);
            }
        }

        public void a() {
            this.d = 0;
        }

        public T a(int i) {
            if (i < 0 || i >= this.d) {
                throw new IndexOutOfBoundsException();
            }
            return (T) this.b[i];
        }

        public T b(int i) {
            if (i < 0 || i >= this.d) {
                throw new IndexOutOfBoundsException();
            }
            T t = (T) this.b[i];
            while (i < this.d - 1) {
                this.b[i] = this.b[i + 1];
                i++;
            }
            this.d--;
            return t;
        }

        public int b() {
            return this.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {
        public double a;
        public double b;
        public double c;
        public double d;
        public double e;
        public double f;

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.f.i.c.a.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0117c {
        public int a;
        public double c;
        public double d;
        public double i = 0.0d;
        public double h = 0.0d;
        public double g = 0.0d;
        public double f = 0.0d;
        public double e = 0.0d;
        public float b = 1.0f;

        public C0117c() {
        }

        public void a(double d) {
            double cos = Math.cos(d);
            double sin = Math.sin(d);
            this.e = (this.e * cos) + (this.f * sin);
            this.f = (this.e * (-sin)) + (this.f * cos);
            double d2 = (this.c * cos) + (this.d * sin);
            double d3 = (-sin) * this.c;
            this.c = d2;
            this.d = (cos * this.d) + d3;
        }

        public void a(C0117c c0117c) {
            this.e = c0117c.e;
            this.f = c0117c.f;
            this.g = c0117c.g;
            this.h = c0117c.h;
            this.i = c0117c.i;
            this.c = c0117c.c;
            this.d = c0117c.d;
            this.a = c0117c.a;
            this.b = c0117c.b;
        }

        public void a(double d, double d2) {
            this.e += d;
            this.f += d2;
        }
    }
}
