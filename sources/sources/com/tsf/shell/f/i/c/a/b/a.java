package com.tsf.shell.f.i.c.a.b;

import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends VObject3dContainer {
    public static int d = 62;
    public static int e = d / 2;
    public static int f = 64;
    protected FloatBuffer a;
    protected FloatBuffer b;
    protected FloatBuffer c;
    float[] i;
    float[] j;
    private float n;
    private float o;
    private float p;
    private int k = 84;
    public int g = 0;
    public int h = 0;
    private int l = 0;
    private int m = 0;
    private float q = 0.0f;
    private float r = 0.0f;
    private float s = 0.0f;

    public a() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.k * 3 * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.b = byteBufferAllocateDirect.asFloatBuffer();
        this.b.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(this.k * 2 * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        this.c = byteBufferAllocateDirect2.asFloatBuffer();
        this.c.position(0);
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(this.k * 4 * 4);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        this.a = byteBufferAllocateDirect3.asFloatBuffer();
        this.a.position(0);
        a();
        c.h.a(this);
        rotation().x = -360.0f;
    }

    private void a() {
        this.i = new float[]{-f, f, d, -f, -f, d, f, f, d, f, f, d, -f, -f, d, f, -f, d, -f, d, -f, -f, d, f, f, d, -f, f, d, -f, -f, d, f, f, d, f, -f, -f, -d, -f, f, -d, f, -f, -d, f, -f, -d, -f, f, -d, f, f, -d, -f, -d, f, -f, -d, -f, f, -d, f, f, -d, f, -f, -d, -f, f, -d, -f, -d, f, -f, -d, -f, -f, -d, f, f, -d, f, f, -d, -f, -f, -d, -f, f, d, f, f, d, -f, f, d, f, -f, d, f, -f, d, -f, f, d, -f, -f, -d, d, d, -d, -d, d, 0.0f, d, d, 0.0f, d, d, -d, -d, d, 0.0f, -d, d, 0.0f, d, d, 0.0f, -d, d, d, d, d, d, d, d, 0.0f, -d, d, d, -d, d, -d, d, -d, -d, d, d, 0.0f, d, -d, 0.0f, d, -d, -d, d, d, 0.0f, d, d, 0.0f, d, -d, 0.0f, d, d, d, d, -d, d, d, -d, 0.0f, d, d, d, d, d, -d, -d, -d, -d, d, -d, 0.0f, -d, -d, 0.0f, -d, -d, -d, d, -d, 0.0f, d, -d, 0.0f, -d, -d, 0.0f, d, -d, d, -d, -d, d, -d, -d, 0.0f, d, -d, d, d, -d, -d, -d, d, -d, -d, -d, 0.0f, -d, d, 0.0f, -d, d, -d, -d, -d, 0.0f, -d, -d, 0.0f, -d, d, 0.0f, -d, -d, d, -d, d, d, -d, d, 0.0f, -d, -d, d, -d, -d};
        this.j = new float[this.k * 4];
        b(-13421773);
        this.b.put(this.i);
        float[] fArrC = c.h.c();
        this.c.put(fArrC);
        this.c.put(fArrC);
        this.c.put(fArrC);
        this.c.put(fArrC);
        this.c.put(fArrC);
        this.c.put(fArrC);
        this.b.position(0);
        this.c.position(0);
    }

    public void a(int i) {
        this.l = i;
        this.m = i;
        float fRed = Color.red(this.l);
        this.q = fRed;
        this.n = fRed;
        float fGreen = Color.green(this.l);
        this.r = fGreen;
        this.o = fGreen;
        float fBlue = Color.blue(this.l);
        this.s = fBlue;
        this.p = fBlue;
        b(i);
    }

    private void b() {
        float fAbs = Math.abs(this.n - this.q);
        float fAbs2 = Math.abs(this.o - this.r);
        float fAbs3 = Math.abs(this.p - this.s);
        if (fAbs > 1.0f || fAbs2 > 1.0f || fAbs3 > 1.0f) {
            invalidate();
            this.q = ((this.n - this.q) * 0.1f) + this.q;
            this.r = ((this.o - this.r) * 0.1f) + this.r;
            this.s = (0.1f * (this.p - this.s)) + this.s;
            b(Color.argb(255, (int) this.q, (int) this.r, (int) this.s));
            return;
        }
        if (this.m != this.l) {
            this.q = this.n;
            this.r = this.o;
            this.s = this.p;
            this.m = this.l;
        }
        b(this.m);
    }

    public int a(float f2) {
        return Math.round(f2 / 90.0f);
    }

    private float b(float f2) {
        float f3 = ((45.0f + f2) % 90.0f) / 90.0f;
        return f3 < 0.0f ? f3 + 1.0f : f3;
    }

    public void b(int i) {
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        int iAlpha = Color.alpha(i);
        int iA = a(a(rotation().x), 4);
        int iA2 = a(iA - 1, 4);
        int iA3 = a(iA + 1, 4);
        float fB = b(rotation().x);
        float f2 = ((double) fB) < 0.5d ? fB / 0.5f : 1.0f;
        float f3 = fB > 0.5f ? (1.0f - fB) / 0.5f : 1.0f;
        float f4 = 0.7f;
        float f5 = 1.0f - 0.7f;
        for (int i2 = 0; i2 < this.k; i2++) {
            if (i2 < 24) {
                int i3 = i2 % 6;
                int i4 = i2 / 6;
                if (i4 == iA) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.j[(i2 * 4) + 0] = (iRed / 255.0f) * ((f5 * f2) + f4);
                            this.j[(i2 * 4) + 1] = (iGreen / 255.0f) * ((f5 * f2) + f4);
                            this.j[(i2 * 4) + 2] = (iBlue / 255.0f) * ((f5 * f2) + f4);
                            this.j[(i2 * 4) + 3] = iAlpha / 255.0f;
                            break;
                        case 1:
                        default:
                            this.j[(i2 * 4) + 0] = (iRed / 255.0f) * ((f5 * f3) + f4) * 0.7f;
                            this.j[(i2 * 4) + 1] = (iGreen / 255.0f) * ((f5 * f3) + f4) * 0.7f;
                            this.j[(i2 * 4) + 2] = (iBlue / 255.0f) * ((f5 * f3) + f4) * 0.7f;
                            this.j[(i2 * 4) + 3] = iAlpha / 255.0f;
                            break;
                    }
                } else if (i4 == iA2) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.j[(i2 * 4) + 0] = (iRed / 255.0f) * 1.0f;
                            this.j[(i2 * 4) + 1] = (iGreen / 255.0f) * 1.0f;
                            this.j[(i2 * 4) + 2] = (iBlue / 255.0f) * 1.0f;
                            this.j[(i2 * 4) + 3] = iAlpha / 255.0f;
                            break;
                        case 1:
                        default:
                            this.j[(i2 * 4) + 0] = (iRed / 255.0f) * f4 * 0.7f;
                            this.j[(i2 * 4) + 1] = (iGreen / 255.0f) * f4 * 0.7f;
                            this.j[(i2 * 4) + 2] = (iBlue / 255.0f) * f4 * 0.7f;
                            this.j[(i2 * 4) + 3] = iAlpha / 255.0f;
                            break;
                    }
                } else if (i4 == iA3) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.j[(i2 * 4) + 0] = (iRed / 255.0f) * f4;
                            this.j[(i2 * 4) + 1] = (iGreen / 255.0f) * f4;
                            this.j[(i2 * 4) + 2] = (iBlue / 255.0f) * f4;
                            this.j[(i2 * 4) + 3] = iAlpha / 255.0f;
                            break;
                        case 1:
                        default:
                            this.j[(i2 * 4) + 0] = (iRed / 255.0f) * 1.0f * 0.7f;
                            this.j[(i2 * 4) + 1] = (iGreen / 255.0f) * 1.0f * 0.7f;
                            this.j[(i2 * 4) + 2] = (iBlue / 255.0f) * 1.0f * 0.7f;
                            this.j[(i2 * 4) + 3] = iAlpha / 255.0f;
                            break;
                    }
                } else {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.j[(i2 * 4) + 0] = iRed / 255.0f;
                            this.j[(i2 * 4) + 1] = iGreen / 255.0f;
                            this.j[(i2 * 4) + 2] = iBlue / 255.0f;
                            this.j[(i2 * 4) + 3] = iAlpha / 255.0f;
                            break;
                        case 1:
                        default:
                            this.j[(i2 * 4) + 0] = (iRed / 255.0f) * 0.7f;
                            this.j[(i2 * 4) + 1] = (iGreen / 255.0f) * 0.7f;
                            this.j[(i2 * 4) + 2] = (iBlue / 255.0f) * 0.7f;
                            this.j[(i2 * 4) + 3] = iAlpha / 255.0f;
                            break;
                    }
                }
            } else if (i2 >= 24 && i2 < 36) {
                this.j[(i2 * 4) + 0] = (iRed / 255.0f) * 0.5f;
                this.j[(i2 * 4) + 1] = (iGreen / 255.0f) * 0.5f;
                this.j[(i2 * 4) + 2] = (iBlue / 255.0f) * 0.5f;
                this.j[(i2 * 4) + 3] = iAlpha / 255.0f;
            } else {
                int i5 = i2 % 6;
                int i6 = (i2 - 36) / 12;
                f4 = 0.5f;
                f5 = 1.0f - 0.5f;
                if (i6 == iA) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.j[(i2 * 4) + 0] = ((f5 * f2) + 0.5f) * 1.0f;
                            this.j[(i2 * 4) + 1] = ((f5 * f2) + 0.5f) * 1.0f;
                            this.j[(i2 * 4) + 2] = 1.0f * ((f5 * f2) + 0.5f);
                            this.j[(i2 * 4) + 3] = 1.0f;
                            break;
                        case 1:
                        default:
                            this.j[(i2 * 4) + 0] = ((f5 * f3) + 0.5f) * 1.0f;
                            this.j[(i2 * 4) + 1] = ((f5 * f3) + 0.5f) * 1.0f;
                            this.j[(i2 * 4) + 2] = 1.0f * ((f5 * f3) + 0.5f);
                            this.j[(i2 * 4) + 3] = 1.0f;
                            break;
                    }
                } else if (i6 == iA2) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.j[(i2 * 4) + 0] = 1.0f * 1.0f;
                            this.j[(i2 * 4) + 1] = 1.0f * 1.0f;
                            this.j[(i2 * 4) + 2] = 1.0f * 1.0f;
                            this.j[(i2 * 4) + 3] = 1.0f;
                            break;
                        case 1:
                        default:
                            this.j[(i2 * 4) + 0] = 1.0f * 0.5f;
                            this.j[(i2 * 4) + 1] = 1.0f * 0.5f;
                            this.j[(i2 * 4) + 2] = 1.0f * 0.5f;
                            this.j[(i2 * 4) + 3] = 1.0f;
                            break;
                    }
                } else if (i6 == iA3) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.j[(i2 * 4) + 0] = 1.0f * 0.5f;
                            this.j[(i2 * 4) + 1] = 1.0f * 0.5f;
                            this.j[(i2 * 4) + 2] = 1.0f * 0.5f;
                            this.j[(i2 * 4) + 3] = 1.0f;
                            break;
                        case 1:
                        default:
                            this.j[(i2 * 4) + 0] = 1.0f * 1.0f;
                            this.j[(i2 * 4) + 1] = 1.0f * 1.0f;
                            this.j[(i2 * 4) + 2] = 1.0f * 1.0f;
                            this.j[(i2 * 4) + 3] = 1.0f;
                            break;
                    }
                } else {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.j[(i2 * 4) + 0] = 1.0f;
                            this.j[(i2 * 4) + 1] = 1.0f;
                            this.j[(i2 * 4) + 2] = 1.0f;
                            this.j[(i2 * 4) + 3] = 1.0f;
                            break;
                        case 1:
                        default:
                            this.j[(i2 * 4) + 0] = 1.0f * 0.7f;
                            this.j[(i2 * 4) + 1] = 1.0f * 0.7f;
                            this.j[(i2 * 4) + 2] = 1.0f * 0.7f;
                            this.j[(i2 * 4) + 3] = 1.0f;
                            break;
                    }
                }
            }
        }
        this.a.position(0);
        this.a.put(this.j);
        this.a.position(0);
    }

    public int a(int i, int i2) {
        int i3 = i % i2;
        return i3 < 0 ? i3 + i2 : i3;
    }

    public void a(int i, float[] fArr) {
        this.c.position((i * 24) + 72);
        this.c.put(fArr);
        this.c.position(0);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void dispatchDraw() {
        setCustomShader(ShaderManager.SHADER_COLOR_TEXTURE);
        super.dispatchDraw();
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void drawElement() {
        b();
        boolean zColorFillEnable = colorFillEnable();
        if (visible() && c.h.a != null) {
            if (zColorFillEnable) {
                ShaderManager.SHADER_COLOR_TEXTURE.glMVPMatrix();
                ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.c);
                ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.b);
                ShaderManager.SHADER_COLOR_TEXTURE.glColor4f(this);
            } else {
                ShaderManager.SHADER_COLOR_TEXTURE.glMVPMatrix();
                ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.c);
                ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.b);
                ShaderManager.SHADER_COLOR_TEXTURE.glColorPointer(4, 5126, false, 0, this.a);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, c.h.a.id);
            GLES20.glDrawArrays(4, 0, 36);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.g);
            GLES20.glDrawArrays(4, 36, this.k - 36);
            if (zColorFillEnable) {
            }
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            GLES20.glBindTexture(3553, 0);
        }
    }
}
