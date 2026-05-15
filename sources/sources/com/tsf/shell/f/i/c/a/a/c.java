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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
            this.k.a(new C0117c());
        }
        this.i = new a<>((this.s + 2) * 2);
        this.d = new a<>((this.s + 2) * 2);
        this.j = new a<>((this.s + 2) * 2);
        for (int i3 = 0; i3 < (this.s + 2) * 2; i3++) {
            this.j.a(new b());
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
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i5 * 3 * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.p = byteBufferAllocateDirect.asFloatBuffer();
        this.p.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i5 * 2 * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        this.o = byteBufferAllocateDirect2.asFloatBuffer();
        this.o.position(0);
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(i5 * 4 * 4);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        this.l = byteBufferAllocateDirect3.asFloatBuffer();
        this.l.position(0);
        int i6 = (this.s + 2) * 2 * 2;
        ByteBuffer byteBufferAllocateDirect4 = ByteBuffer.allocateDirect(i6 * 4 * 4);
        byteBufferAllocateDirect4.order(ByteOrder.nativeOrder());
        this.m = byteBufferAllocateDirect4.asFloatBuffer();
        this.m.position(0);
        ByteBuffer byteBufferAllocateDirect5 = ByteBuffer.allocateDirect(i6 * 3 * 4);
        byteBufferAllocateDirect5.order(ByteOrder.nativeOrder());
        this.n = byteBufferAllocateDirect5.asFloatBuffer();
        this.n.position(0);
        this.u = 0;
        this.q = 0;
    }

    private void a(C0117c c0117c) {
        float fAlpha = alpha() / 255.0f;
        this.p.put((float) c0117c.e);
        this.p.put((float) c0117c.f);
        this.p.put((float) c0117c.g);
        this.l.put(((c0117c.b * Color.red(c0117c.a)) / 255.0f) * fAlpha);
        this.l.put(((c0117c.b * Color.green(c0117c.a)) / 255.0f) * fAlpha);
        this.l.put(((c0117c.b * Color.blue(c0117c.a)) / 255.0f) * fAlpha);
        this.l.put(fAlpha * (Color.alpha(c0117c.a) / 255.0f));
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
        float fAlpha = alpha() / 255.0f;
        this.p.position(0);
        this.l.position(0);
        this.o.position(0);
        double dAcos = Math.acos(pointF2.x);
        double d2 = pointF2.y > 0.0f ? -dAcos : dAcos;
        this.k.a(this.g);
        this.g.a();
        for (int i = 0; i < 4; i++) {
            C0117c c0117cB = this.k.b(0);
            c0117cB.a(this.t[i]);
            c0117cB.a(-pointF.x, -pointF.y);
            c0117cB.a(-d2);
            int i2 = 0;
            while (i2 < this.g.b()) {
                C0117c c0117cA = this.g.a(i2);
                if (c0117cB.e <= c0117cA.e && (c0117cB.e != c0117cA.e || c0117cB.f <= c0117cA.f)) {
                    i2++;
                }
            }
            this.g.a(i2, c0117cB);
        }
        int[][] iArr = {new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 3}, new int[]{2, 3}};
        C0117c c0117cA2 = this.g.a(0);
        C0117c c0117cA3 = this.g.a(2);
        C0117c c0117cA4 = this.g.a(3);
        if (Math.sqrt(((c0117cA2.e - c0117cA3.e) * (c0117cA2.e - c0117cA3.e)) + ((c0117cA2.f - c0117cA3.f) * (c0117cA2.f - c0117cA3.f))) > Math.sqrt(((c0117cA2.f - c0117cA4.f) * (c0117cA2.f - c0117cA4.f)) + ((c0117cA2.e - c0117cA4.e) * (c0117cA2.e - c0117cA4.e)))) {
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
            this.h.a(Double.valueOf(0.0d));
        }
        for (int i3 = 1; i3 < this.s; i3++) {
            this.h.a(Double.valueOf(((-d3) * ((double) i3)) / ((double) (this.s - 1))));
        }
        this.h.a(Double.valueOf(this.g.a(3).e - 1.0d));
        int i4 = 0;
        double d4 = 1.0d + this.g.a(0).e;
        while (i4 < this.h.b()) {
            double dDoubleValue = this.h.a(i4).doubleValue();
            for (int i5 = 0; i5 < this.g.b(); i5++) {
                C0117c c0117cA5 = this.g.a(i5);
                if (c0117cA5.e >= dDoubleValue && c0117cA5.e <= d4) {
                    C0117c c0117cB2 = this.k.b(0);
                    c0117cB2.a(c0117cA5);
                    a<C0117c> aVarA = a(this.g, iArr, c0117cB2.e);
                    if (aVarA.b() == 1 && aVarA.a(0).f > c0117cA5.f) {
                        this.f.a(aVarA);
                        this.f.a(c0117cB2);
                    } else if (aVarA.b() <= 1) {
                        this.f.a(c0117cB2);
                        this.f.a(aVarA);
                    } else {
                        this.k.a(c0117cB2);
                        this.k.a(aVarA);
                    }
                }
            }
            a<C0117c> aVarA2 = a(this.g, iArr, dDoubleValue);
            if (aVarA2.b() == 2) {
                C0117c c0117cA6 = aVarA2.a(0);
                C0117c c0117cA7 = aVarA2.a(1);
                if (c0117cA6.f < c0117cA7.f) {
                    this.f.a(c0117cA7);
                    this.f.a(c0117cA6);
                } else {
                    this.f.a(aVarA2);
                }
            } else if (aVarA2.b() != 0) {
                this.k.a(aVarA2);
            }
            while (this.f.b() > 0) {
                C0117c c0117cB3 = this.f.b(0);
                this.k.a(c0117cB3);
                if (i4 == 0) {
                    z = true;
                    this.B++;
                } else if (i4 == this.h.b() - 1 || d3 == 0.0d) {
                    c0117cB3.e = -(c0117cB3.e + d3);
                    c0117cB3.g = 2.0d * d;
                    c0117cB3.c = -c0117cB3.c;
                    z = false;
                    this.A++;
                } else {
                    double d5 = 3.141592653589793d * (c0117cB3.e / d3);
                    c0117cB3.e = Math.sin(d5) * d;
                    c0117cB3.g = d - (Math.cos(d5) * d);
                    c0117cB3.c *= Math.cos(d5);
                    c0117cB3.b = (float) ((Math.sqrt(Math.sin(d5) + 1.0d) * 0.800000011920929d) + 0.20000000298023224d);
                    if (c0117cB3.g >= 10.0d + d) {
                        z = false;
                        this.A++;
                    } else {
                        z = true;
                        this.B++;
                    }
                }
                if (z != this.r) {
                    c0117cB3.h *= (double) this.z.right;
                    c0117cB3.i *= (double) this.z.bottom;
                    c0117cB3.a = this.x.a(1);
                } else {
                    c0117cB3.h *= (double) this.y.right;
                    c0117cB3.i *= (double) this.y.bottom;
                    c0117cB3.a = this.x.a(2);
                }
                c0117cB3.a(d2);
                c0117cB3.a(pointF.x, pointF.y);
                a(c0117cB3);
                if (c0117cB3.g > 0.0d && c0117cB3.g <= d) {
                    b bVarB = this.j.b(0);
                    bVarB.d = c0117cB3.e;
                    bVarB.e = c0117cB3.f;
                    bVarB.f = c0117cB3.g;
                    bVarB.b = (c0117cB3.g / 1.0d) * ((double) (-pointF2.x));
                    bVarB.c = (c0117cB3.g / 1.0d) * ((double) (-pointF2.y));
                    bVarB.a = c0117cB3.g / d;
                    this.d.a((this.d.b() + 1) / 2, bVarB);
                }
                if (c0117cB3.g > d) {
                    b bVarB2 = this.j.b(0);
                    bVarB2.d = c0117cB3.e;
                    bVarB2.e = c0117cB3.f;
                    bVarB2.f = c0117cB3.g;
                    bVarB2.b = ((c0117cB3.g - d) / 3.0d) * c0117cB3.c;
                    bVarB2.c = ((c0117cB3.g - d) / 3.0d) * c0117cB3.d;
                    bVarB2.a = (c0117cB3.g - d) / (2.0d * d);
                    this.i.a((this.i.b() + 1) / 2, bVarB2);
                }
            }
            i4++;
            d4 = dDoubleValue;
        }
        this.p.position(0);
        this.l.position(0);
        this.o.position(0);
        this.m.position(0);
        this.n.position(0);
        this.q = 0;
        for (int i6 = 0; i6 < this.d.b(); i6++) {
            b bVarA = this.d.a(i6);
            this.n.put((float) bVarA.d);
            this.n.put((float) bVarA.e);
            this.n.put((float) bVarA.f);
            this.n.put((float) (bVarA.d + bVarA.b));
            this.n.put((float) (bVarA.e + bVarA.c));
            this.n.put((float) bVarA.f);
            for (int i7 = 0; i7 < 4; i7++) {
                this.m.put(((float) (((double) b[i7]) + (((double) (a[i7] - b[i7])) * bVarA.a))) * fAlpha);
            }
            this.m.put(b);
            this.q += 2;
        }
        this.u = 0;
        for (int i8 = 0; i8 < this.i.b(); i8++) {
            b bVarA2 = this.i.a(i8);
            this.n.put((float) bVarA2.d);
            this.n.put((float) bVarA2.e);
            this.n.put((float) bVarA2.f);
            this.n.put((float) (bVarA2.d + bVarA2.b));
            this.n.put((float) (bVarA2.e + bVarA2.c));
            this.n.put((float) bVarA2.f);
            for (int i9 = 0; i9 < 4; i9++) {
                this.m.put((float) (((double) b[i9]) + (((double) (a[i9] - b[i9])) * bVarA2.a)));
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
                C0117c c0117cA = aVar.a(iArr[i2][0]);
                C0117c c0117cA2 = aVar.a(iArr[i2][1]);
                if (c0117cA.e > d && c0117cA2.e < d) {
                    double d2 = (d - c0117cA2.e) / (c0117cA.e - c0117cA2.e);
                    C0117c c0117cB = this.k.b(0);
                    c0117cB.a(c0117cA2);
                    c0117cB.e = d;
                    c0117cB.f += (c0117cA.f - c0117cA2.f) * d2;
                    c0117cB.h += (c0117cA.h - c0117cA2.h) * d2;
                    c0117cB.i += (c0117cA.i - c0117cA2.i) * d2;
                    c0117cB.c += (c0117cA.c - c0117cA2.c) * d2;
                    c0117cB.d = ((c0117cA.d - c0117cA2.d) * d2) + c0117cB.d;
                    this.e.a(c0117cB);
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
            int iMax = Math.max(0, this.B - 12);
            int i = (this.B + this.A) - iMax;
            GLES20.glEnable(3553);
            if (this.r || !this.v) {
                GLES20.glBindTexture(3553, this.x.b(1).id);
            } else {
                GLES20.glBindTexture(3553, this.x.b(2).id);
            }
            GLES20.glDrawArrays(5, iMax, i);
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
            C0117c c0117cA = this.k.a(0);
            c0117cA.a(this.t[i]);
            if (this.r) {
                c0117cA.h *= (double) this.y.right;
                c0117cA.i *= (double) this.y.bottom;
                c0117cA.a = this.x.a(2);
            } else {
                c0117cA.h *= (double) this.z.right;
                c0117cA.i *= (double) this.z.bottom;
                c0117cA.a = this.x.a(1);
            }
            a(c0117cA);
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

    private class a<T> {
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

    private class b {
        public double a;
        public double b;
        public double c;
        public double d;
        public double e;
        public double f;

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.tsf.shell.f.i.c.a.a.c$c, reason: collision with other inner class name */
    private class C0117c {
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
            double dCos = Math.cos(d);
            double dSin = Math.sin(d);
            double d2 = (this.e * dCos) + (this.f * dSin);
            double d3 = (this.e * (-dSin)) + (this.f * dCos);
            this.e = d2;
            this.f = d3;
            double d4 = (this.c * dCos) + (this.d * dSin);
            double d5 = (dCos * this.d) + ((-dSin) * this.c);
            this.c = d4;
            this.d = d5;
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
