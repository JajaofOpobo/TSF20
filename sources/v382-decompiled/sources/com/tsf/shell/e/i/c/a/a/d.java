package com.tsf.shell.e.i.c.a.a;

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
public class d extends VObject3dContainer {
    private static final float[] a = {0.0f, 0.0f, 0.0f, 0.5f};
    private static final float[] b = {0.0f, 0.0f, 0.0f, 0.0f};
    private int A;
    private int B;
    private PointF C;
    private PointF D;
    private double E;
    private e d;
    private e e;
    private e f;
    private e g;
    private e h;
    private e i;
    private e j;
    private e k;
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
    private final g[] t = new g[4];
    private boolean v = false;
    private boolean w = true;
    private final j x = new j();
    private final RectF y = new RectF();
    private final RectF z = new RectF();

    public d(int i) {
        this.y.set(0.0f, 0.0f, 1.0f, 1.0f);
        this.z.set(0.0f, 0.0f, 1.0f, 1.0f);
        this.s = i < 1 ? 1 : i;
        this.h = new e(this, i + 2);
        this.f = new e(this, 7);
        this.g = new e(this, 4);
        this.e = new e(this, 2);
        this.k = new e(this, 11);
        for (int i2 = 0; i2 < 11; i2++) {
            this.k.a(new g(this));
        }
        this.i = new e(this, (this.s + 2) * 2);
        this.d = new e(this, (this.s + 2) * 2);
        this.j = new e(this, (this.s + 2) * 2);
        for (int i3 = 0; i3 < (this.s + 2) * 2; i3++) {
            this.j.a(new f(this, null));
        }
        for (int i4 = 0; i4 < 4; i4++) {
            this.t[i4] = new g(this);
        }
        g gVar = this.t[0];
        g gVar2 = this.t[1];
        g gVar3 = this.t[1];
        this.t[3].d = -1.0d;
        gVar3.d = -1.0d;
        gVar2.c = -1.0d;
        gVar.c = -1.0d;
        g gVar4 = this.t[0];
        g gVar5 = this.t[2];
        g gVar6 = this.t[2];
        this.t[3].c = 1.0d;
        gVar6.d = 1.0d;
        gVar5.c = 1.0d;
        gVar4.d = 1.0d;
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

    private void a(g gVar) {
        float alpha = alpha() / 255.0f;
        this.p.put((float) gVar.e);
        this.p.put((float) gVar.f);
        this.p.put((float) gVar.g);
        this.l.put(((gVar.b * Color.red(gVar.a)) / 255.0f) * alpha);
        this.l.put(((gVar.b * Color.green(gVar.a)) / 255.0f) * alpha);
        this.l.put(((gVar.b * Color.blue(gVar.a)) / 255.0f) * alpha);
        this.l.put(alpha * (Color.alpha(gVar.a) / 255.0f));
        this.o.put((float) gVar.h);
        this.o.put((float) gVar.i);
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
            g gVar = (g) this.k.b(0);
            gVar.a(this.t[i]);
            gVar.a(-pointF.x, -pointF.y);
            gVar.a(-d2);
            for (int i2 = 0; i2 < this.g.b(); i2++) {
                g gVar2 = (g) this.g.a(i2);
                if (gVar.e <= gVar2.e && (gVar.e != gVar2.e || gVar.f <= gVar2.f)) {
                }
                this.g.a(i2, gVar);
            }
            this.g.a(i2, gVar);
        }
        int[][] iArr = {new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 3}, new int[]{2, 3}};
        g gVar3 = (g) this.g.a(0);
        g gVar4 = (g) this.g.a(2);
        g gVar5 = (g) this.g.a(3);
        if (Math.sqrt(((gVar3.e - gVar4.e) * (gVar3.e - gVar4.e)) + ((gVar3.f - gVar4.f) * (gVar3.f - gVar4.f))) > Math.sqrt(((gVar3.f - gVar5.f) * (gVar3.f - gVar5.f)) + ((gVar3.e - gVar5.e) * (gVar3.e - gVar5.e)))) {
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
            this.h.a(Double.valueOf(((-d3) * i3) / (this.s - 1)));
        }
        this.h.a(Double.valueOf(((g) this.g.a(3)).e - 1.0d));
        int i4 = 0;
        double d4 = 1.0d + ((g) this.g.a(0)).e;
        while (i4 < this.h.b()) {
            double doubleValue = ((Double) this.h.a(i4)).doubleValue();
            for (int i5 = 0; i5 < this.g.b(); i5++) {
                g gVar6 = (g) this.g.a(i5);
                if (gVar6.e >= doubleValue && gVar6.e <= d4) {
                    g gVar7 = (g) this.k.b(0);
                    gVar7.a(gVar6);
                    e a2 = a(this.g, iArr, gVar7.e);
                    if (a2.b() == 1 && ((g) a2.a(0)).f > gVar6.f) {
                        this.f.a(a2);
                        this.f.a(gVar7);
                    } else if (a2.b() <= 1) {
                        this.f.a(gVar7);
                        this.f.a(a2);
                    } else {
                        this.k.a(gVar7);
                        this.k.a(a2);
                    }
                }
            }
            e a3 = a(this.g, iArr, doubleValue);
            if (a3.b() == 2) {
                g gVar8 = (g) a3.a(0);
                g gVar9 = (g) a3.a(1);
                if (gVar8.f < gVar9.f) {
                    this.f.a(gVar9);
                    this.f.a(gVar8);
                } else {
                    this.f.a(a3);
                }
            } else if (a3.b() != 0) {
                this.k.a(a3);
            }
            while (this.f.b() > 0) {
                g gVar10 = (g) this.f.b(0);
                this.k.a(gVar10);
                if (i4 == 0) {
                    z = true;
                    this.B++;
                } else if (i4 == this.h.b() - 1 || d3 == 0.0d) {
                    gVar10.e = -(gVar10.e + d3);
                    gVar10.g = 2.0d * d;
                    gVar10.c = -gVar10.c;
                    z = false;
                    this.A++;
                } else {
                    double d5 = 3.141592653589793d * (gVar10.e / d3);
                    gVar10.e = Math.sin(d5) * d;
                    gVar10.g = d - (Math.cos(d5) * d);
                    gVar10.c *= Math.cos(d5);
                    gVar10.b = (float) ((Math.sqrt(Math.sin(d5) + 1.0d) * 0.800000011920929d) + 0.20000000298023224d);
                    if (gVar10.g >= 10.0d + d) {
                        z = false;
                        this.A++;
                    } else {
                        z = true;
                        this.B++;
                    }
                }
                if (z != this.r) {
                    gVar10.h *= this.z.right;
                    gVar10.i *= this.z.bottom;
                    gVar10.a = this.x.a(1);
                } else {
                    gVar10.h *= this.y.right;
                    gVar10.i *= this.y.bottom;
                    gVar10.a = this.x.a(2);
                }
                gVar10.a(d2);
                gVar10.a(pointF.x, pointF.y);
                a(gVar10);
                if (gVar10.g > 0.0d && gVar10.g <= d) {
                    f fVar = (f) this.j.b(0);
                    fVar.d = gVar10.e;
                    fVar.e = gVar10.f;
                    fVar.f = gVar10.g;
                    fVar.b = (gVar10.g / 1.0d) * (-pointF2.x);
                    fVar.c = (gVar10.g / 1.0d) * (-pointF2.y);
                    fVar.a = gVar10.g / d;
                    this.d.a((this.d.b() + 1) / 2, fVar);
                }
                if (gVar10.g > d) {
                    f fVar2 = (f) this.j.b(0);
                    fVar2.d = gVar10.e;
                    fVar2.e = gVar10.f;
                    fVar2.f = gVar10.g;
                    fVar2.b = ((gVar10.g - d) / 3.0d) * gVar10.c;
                    fVar2.c = ((gVar10.g - d) / 3.0d) * gVar10.d;
                    fVar2.a = (gVar10.g - d) / (2.0d * d);
                    this.i.a((this.i.b() + 1) / 2, fVar2);
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
            f fVar3 = (f) this.d.a(i6);
            this.n.put((float) fVar3.d);
            this.n.put((float) fVar3.e);
            this.n.put((float) fVar3.f);
            this.n.put((float) (fVar3.d + fVar3.b));
            this.n.put((float) (fVar3.e + fVar3.c));
            this.n.put((float) fVar3.f);
            for (int i7 = 0; i7 < 4; i7++) {
                this.m.put(((float) (b[i7] + ((a[i7] - b[i7]) * fVar3.a))) * alpha);
            }
            this.m.put(b);
            this.q += 2;
        }
        this.u = 0;
        for (int i8 = 0; i8 < this.i.b(); i8++) {
            f fVar4 = (f) this.i.a(i8);
            this.n.put((float) fVar4.d);
            this.n.put((float) fVar4.e);
            this.n.put((float) fVar4.f);
            this.n.put((float) (fVar4.d + fVar4.b));
            this.n.put((float) (fVar4.e + fVar4.c));
            this.n.put((float) fVar4.f);
            for (int i9 = 0; i9 < 4; i9++) {
                this.m.put((float) (b[i9] + ((a[i9] - b[i9]) * fVar4.a)));
            }
            this.m.put(b);
            this.u += 2;
        }
        this.m.position(0);
        this.n.position(0);
    }

    private e a(e eVar, int[][] iArr, double d) {
        this.e.a();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < iArr.length) {
                g gVar = (g) eVar.a(iArr[i2][0]);
                g gVar2 = (g) eVar.a(iArr[i2][1]);
                if (gVar.e > d && gVar2.e < d) {
                    double d2 = (d - gVar2.e) / (gVar.e - gVar2.e);
                    g gVar3 = (g) this.k.b(0);
                    gVar3.a(gVar2);
                    gVar3.e = d;
                    gVar3.f += (gVar.f - gVar2.f) * d2;
                    gVar3.h += (gVar.h - gVar2.h) * d2;
                    gVar3.i += (gVar.i - gVar2.i) * d2;
                    gVar3.c += (gVar.c - gVar2.c) * d2;
                    gVar3.d = ((gVar.d - gVar2.d) * d2) + gVar3.d;
                    this.e.a(gVar3);
                }
                i = i2 + 1;
            } else {
                return this.e;
            }
        }
    }

    public synchronized j b() {
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
        position().setAll(0.0f, 47.0f * h.j, 0.0f);
        alpha(255);
        this.p.position(0);
        this.l.position(0);
        this.o.position(0);
        for (int i = 0; i < 4; i++) {
            g gVar = (g) this.k.a(0);
            gVar.a(this.t[i]);
            if (this.r) {
                gVar.h *= this.y.right;
                gVar.i *= this.y.bottom;
                gVar.a = this.x.a(2);
            } else {
                gVar.h *= this.z.right;
                gVar.i *= this.z.bottom;
                gVar.a = this.x.a(1);
            }
            a(gVar);
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
}
