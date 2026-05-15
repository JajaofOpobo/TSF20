package com.tsf.shell.widget.cubeclock;

import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends VObject3dContainer {
    protected FloatBuffer a;
    protected FloatBuffer b;
    protected FloatBuffer c;
    float[] f;
    float[] g;
    private c i;
    private float l;
    private float m;
    private float n;
    private int h = 84;
    public int d = 0;
    public int e = 0;
    private int j = 0;
    private int k = 0;
    private float o = 0.0f;
    private float p = 0.0f;
    private float q = 0.0f;

    public d(c cVar) {
        this.i = cVar;
        this.i.c.addObject(this);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.h * 3 * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.b = byteBufferAllocateDirect.asFloatBuffer();
        this.b.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(this.h * 2 * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        this.c = byteBufferAllocateDirect2.asFloatBuffer();
        this.c.position(0);
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(this.h * 4 * 4);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        this.a = byteBufferAllocateDirect3.asFloatBuffer();
        this.a.position(0);
        a();
        this.i.g.a(this);
        rotation().x = -360.0f;
    }

    private void a() {
        this.f = new float[]{-64.0f, 64.0f, 63.0f, -64.0f, -64.0f, 63.0f, 64.0f, 64.0f, 63.0f, 64.0f, 64.0f, 63.0f, -64.0f, -64.0f, 63.0f, 64.0f, -64.0f, 63.0f, -64.0f, 63.0f, -64.0f, -64.0f, 63.0f, 64.0f, 64.0f, 63.0f, -64.0f, 64.0f, 63.0f, -64.0f, -64.0f, 63.0f, 64.0f, 64.0f, 63.0f, 64.0f, -64.0f, -64.0f, -63.0f, -64.0f, 64.0f, -63.0f, 64.0f, -64.0f, -63.0f, 64.0f, -64.0f, -63.0f, -64.0f, 64.0f, -63.0f, 64.0f, 64.0f, -63.0f, -64.0f, -63.0f, 64.0f, -64.0f, -63.0f, -64.0f, 64.0f, -63.0f, 64.0f, 64.0f, -63.0f, 64.0f, -64.0f, -63.0f, -64.0f, 64.0f, -63.0f, -64.0f, -63.0f, 64.0f, -64.0f, -63.0f, -64.0f, -64.0f, -63.0f, 64.0f, 64.0f, -63.0f, 64.0f, 64.0f, -63.0f, -64.0f, -64.0f, -63.0f, -64.0f, 64.0f, 63.0f, 64.0f, 64.0f, 63.0f, -64.0f, 64.0f, 63.0f, 64.0f, -64.0f, 63.0f, 64.0f, -64.0f, 63.0f, -64.0f, 64.0f, 63.0f, -64.0f, -64.0f, -63.0f, 63.0f, 63.0f, -63.0f, -63.0f, 63.0f, 0.0f, 63.0f, 63.0f, 0.0f, 63.0f, 63.0f, -63.0f, -63.0f, 63.0f, 0.0f, -63.0f, 63.0f, 0.0f, 63.0f, 63.0f, 0.0f, -63.0f, 63.0f, 63.0f, 63.0f, 63.0f, 63.0f, 63.0f, 63.0f, 0.0f, -63.0f, 63.0f, 63.0f, -63.0f, 63.0f, -63.0f, 63.0f, -63.0f, -63.0f, 63.0f, 63.0f, 0.0f, 63.0f, -63.0f, 0.0f, 63.0f, -63.0f, -63.0f, 63.0f, 63.0f, 0.0f, 63.0f, 63.0f, 0.0f, 63.0f, -63.0f, 0.0f, 63.0f, 63.0f, 63.0f, 63.0f, -63.0f, 63.0f, 63.0f, -63.0f, 0.0f, 63.0f, 63.0f, 63.0f, 63.0f, 63.0f, -63.0f, -63.0f, -63.0f, -63.0f, 63.0f, -63.0f, 0.0f, -63.0f, -63.0f, 0.0f, -63.0f, -63.0f, -63.0f, 63.0f, -63.0f, 0.0f, 63.0f, -63.0f, 0.0f, -63.0f, -63.0f, 0.0f, 63.0f, -63.0f, 63.0f, -63.0f, -63.0f, 63.0f, -63.0f, -63.0f, 0.0f, 63.0f, -63.0f, 63.0f, 63.0f, -63.0f, -63.0f, -63.0f, 63.0f, -63.0f, -63.0f, -63.0f, 0.0f, -63.0f, 63.0f, 0.0f, -63.0f, 63.0f, -63.0f, -63.0f, -63.0f, 0.0f, -63.0f, -63.0f, 0.0f, -63.0f, 63.0f, 0.0f, -63.0f, -63.0f, 63.0f, -63.0f, 63.0f, 63.0f, -63.0f, 63.0f, 0.0f, -63.0f, -63.0f, 63.0f, -63.0f, -63.0f};
        this.g = new float[this.h * 4];
        c(-13421773);
        this.b.put(this.f);
        this.c.put(this.i.g.b());
        this.c.put(this.i.g.b());
        this.c.put(this.i.g.b());
        this.c.put(this.i.g.b());
        this.c.put(this.i.g.b());
        this.c.put(this.i.g.b());
        this.b.position(0);
        this.c.position(0);
    }

    public void a(int i) {
        this.j = i;
        this.l = Color.red(this.j);
        this.m = Color.green(this.j);
        this.n = Color.blue(this.j);
    }

    public void b(int i) {
        this.j = i;
        this.k = i;
        float fRed = Color.red(this.j);
        this.o = fRed;
        this.l = fRed;
        float fGreen = Color.green(this.j);
        this.p = fGreen;
        this.m = fGreen;
        float fBlue = Color.blue(this.j);
        this.q = fBlue;
        this.n = fBlue;
        c(i);
    }

    private void b() {
        float fAbs = Math.abs(this.l - this.o);
        float fAbs2 = Math.abs(this.m - this.p);
        float fAbs3 = Math.abs(this.n - this.q);
        if (fAbs > 1.0f || fAbs2 > 1.0f || fAbs3 > 1.0f) {
            invalidate();
            this.o = ((this.l - this.o) * 0.1f) + this.o;
            this.p = ((this.m - this.p) * 0.1f) + this.p;
            this.q = (0.1f * (this.n - this.q)) + this.q;
            c(Color.argb(255, (int) this.o, (int) this.p, (int) this.q));
            return;
        }
        if (this.k != this.j) {
            this.o = this.l;
            this.p = this.m;
            this.q = this.n;
            this.k = this.j;
            j.a("Widget Cube Slient First");
        }
        c(this.k);
    }

    public int a(float f) {
        return Math.round(f / 90.0f);
    }

    private float b(float f) {
        float f2 = ((45.0f + f) % 90.0f) / 90.0f;
        return f2 < 0.0f ? f2 + 1.0f : f2;
    }

    public void c(int i) {
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        int iAlpha = Color.alpha(i);
        int iA = a(a(rotation().x), 4);
        int iA2 = a(iA - 1, 4);
        int iA3 = a(iA + 1, 4);
        float fB = b(rotation().x);
        float f = ((double) fB) < 0.5d ? fB / 0.5f : 1.0f;
        float f2 = fB > 0.5f ? (1.0f - fB) / 0.5f : 1.0f;
        float f3 = 0.7f;
        float f4 = 1.0f - 0.7f;
        for (int i2 = 0; i2 < this.h; i2++) {
            if (i2 < 24) {
                int i3 = i2 % 6;
                int i4 = i2 / 6;
                if (i4 == iA) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.g[(i2 * 4) + 0] = (iRed / 255.0f) * ((f4 * f) + f3);
                            this.g[(i2 * 4) + 1] = (iGreen / 255.0f) * ((f4 * f) + f3);
                            this.g[(i2 * 4) + 2] = (iBlue / 255.0f) * ((f4 * f) + f3);
                            this.g[(i2 * 4) + 3] = iAlpha / 255.0f;
                            break;
                        case 1:
                        default:
                            this.g[(i2 * 4) + 0] = (iRed / 255.0f) * ((f4 * f2) + f3) * 0.7f;
                            this.g[(i2 * 4) + 1] = (iGreen / 255.0f) * ((f4 * f2) + f3) * 0.7f;
                            this.g[(i2 * 4) + 2] = (iBlue / 255.0f) * ((f4 * f2) + f3) * 0.7f;
                            this.g[(i2 * 4) + 3] = iAlpha / 255.0f;
                            break;
                    }
                } else if (i4 == iA2) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.g[(i2 * 4) + 0] = (iRed / 255.0f) * 1.0f;
                            this.g[(i2 * 4) + 1] = (iGreen / 255.0f) * 1.0f;
                            this.g[(i2 * 4) + 2] = (iBlue / 255.0f) * 1.0f;
                            this.g[(i2 * 4) + 3] = iAlpha / 255.0f;
                            break;
                        case 1:
                        default:
                            this.g[(i2 * 4) + 0] = (iRed / 255.0f) * f3 * 0.7f;
                            this.g[(i2 * 4) + 1] = (iGreen / 255.0f) * f3 * 0.7f;
                            this.g[(i2 * 4) + 2] = (iBlue / 255.0f) * f3 * 0.7f;
                            this.g[(i2 * 4) + 3] = iAlpha / 255.0f;
                            break;
                    }
                } else if (i4 == iA3) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.g[(i2 * 4) + 0] = (iRed / 255.0f) * f3;
                            this.g[(i2 * 4) + 1] = (iGreen / 255.0f) * f3;
                            this.g[(i2 * 4) + 2] = (iBlue / 255.0f) * f3;
                            this.g[(i2 * 4) + 3] = iAlpha / 255.0f;
                            break;
                        case 1:
                        default:
                            this.g[(i2 * 4) + 0] = (iRed / 255.0f) * 1.0f * 0.7f;
                            this.g[(i2 * 4) + 1] = (iGreen / 255.0f) * 1.0f * 0.7f;
                            this.g[(i2 * 4) + 2] = (iBlue / 255.0f) * 1.0f * 0.7f;
                            this.g[(i2 * 4) + 3] = iAlpha / 255.0f;
                            break;
                    }
                } else {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.g[(i2 * 4) + 0] = iRed / 255.0f;
                            this.g[(i2 * 4) + 1] = iGreen / 255.0f;
                            this.g[(i2 * 4) + 2] = iBlue / 255.0f;
                            this.g[(i2 * 4) + 3] = iAlpha / 255.0f;
                            break;
                        case 1:
                        default:
                            this.g[(i2 * 4) + 0] = (iRed / 255.0f) * 0.7f;
                            this.g[(i2 * 4) + 1] = (iGreen / 255.0f) * 0.7f;
                            this.g[(i2 * 4) + 2] = (iBlue / 255.0f) * 0.7f;
                            this.g[(i2 * 4) + 3] = iAlpha / 255.0f;
                            break;
                    }
                }
            } else if (i2 >= 24 && i2 < 36) {
                this.g[(i2 * 4) + 0] = (iRed / 255.0f) * 0.5f;
                this.g[(i2 * 4) + 1] = (iGreen / 255.0f) * 0.5f;
                this.g[(i2 * 4) + 2] = (iBlue / 255.0f) * 0.5f;
                this.g[(i2 * 4) + 3] = iAlpha / 255.0f;
            } else {
                int i5 = i2 % 6;
                int i6 = (i2 - 36) / 12;
                f3 = 0.5f;
                f4 = 1.0f - 0.5f;
                if (i6 == iA) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.g[(i2 * 4) + 0] = ((f4 * f) + 0.5f) * 1.0f;
                            this.g[(i2 * 4) + 1] = ((f4 * f) + 0.5f) * 1.0f;
                            this.g[(i2 * 4) + 2] = 1.0f * ((f4 * f) + 0.5f);
                            this.g[(i2 * 4) + 3] = 1.0f;
                            break;
                        case 1:
                        default:
                            this.g[(i2 * 4) + 0] = ((f4 * f2) + 0.5f) * 1.0f;
                            this.g[(i2 * 4) + 1] = ((f4 * f2) + 0.5f) * 1.0f;
                            this.g[(i2 * 4) + 2] = 1.0f * ((f4 * f2) + 0.5f);
                            this.g[(i2 * 4) + 3] = 1.0f;
                            break;
                    }
                } else if (i6 == iA2) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.g[(i2 * 4) + 0] = 1.0f * 1.0f;
                            this.g[(i2 * 4) + 1] = 1.0f * 1.0f;
                            this.g[(i2 * 4) + 2] = 1.0f * 1.0f;
                            this.g[(i2 * 4) + 3] = 1.0f;
                            break;
                        case 1:
                        default:
                            this.g[(i2 * 4) + 0] = 1.0f * 0.5f;
                            this.g[(i2 * 4) + 1] = 1.0f * 0.5f;
                            this.g[(i2 * 4) + 2] = 1.0f * 0.5f;
                            this.g[(i2 * 4) + 3] = 1.0f;
                            break;
                    }
                } else if (i6 == iA3) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.g[(i2 * 4) + 0] = 1.0f * 0.5f;
                            this.g[(i2 * 4) + 1] = 1.0f * 0.5f;
                            this.g[(i2 * 4) + 2] = 1.0f * 0.5f;
                            this.g[(i2 * 4) + 3] = 1.0f;
                            break;
                        case 1:
                        default:
                            this.g[(i2 * 4) + 0] = 1.0f * 1.0f;
                            this.g[(i2 * 4) + 1] = 1.0f * 1.0f;
                            this.g[(i2 * 4) + 2] = 1.0f * 1.0f;
                            this.g[(i2 * 4) + 3] = 1.0f;
                            break;
                    }
                } else {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.g[(i2 * 4) + 0] = 1.0f;
                            this.g[(i2 * 4) + 1] = 1.0f;
                            this.g[(i2 * 4) + 2] = 1.0f;
                            this.g[(i2 * 4) + 3] = 1.0f;
                            break;
                        case 1:
                        default:
                            this.g[(i2 * 4) + 0] = 1.0f * 0.7f;
                            this.g[(i2 * 4) + 1] = 1.0f * 0.7f;
                            this.g[(i2 * 4) + 2] = 1.0f * 0.7f;
                            this.g[(i2 * 4) + 3] = 1.0f;
                            break;
                    }
                }
            }
        }
        this.a.position(0);
        this.a.put(this.g);
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
        if (visible()) {
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
            GLES20.glBindTexture(3553, this.i.g.a.id);
            GLES20.glDrawArrays(4, 0, 36);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.d);
            GLES20.glDrawArrays(4, 36, this.h - 36);
            if (zColorFillEnable) {
            }
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            GLES20.glBindTexture(3553, 0);
        }
    }
}
