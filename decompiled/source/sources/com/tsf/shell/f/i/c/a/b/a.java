package com.tsf.shell.f.i.c.a.b;

import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* loaded from: classes.dex */
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
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.k * 3 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.b = allocateDirect.asFloatBuffer();
        this.b.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.k * 2 * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.c = allocateDirect2.asFloatBuffer();
        this.c.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(this.k * 4 * 4);
        allocateDirect3.order(ByteOrder.nativeOrder());
        this.a = allocateDirect3.asFloatBuffer();
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
        float[] c = c.h.c();
        this.c.put(c);
        this.c.put(c);
        this.c.put(c);
        this.c.put(c);
        this.c.put(c);
        this.c.put(c);
        this.b.position(0);
        this.c.position(0);
    }

    public void a(int i) {
        this.l = i;
        this.m = i;
        float red = Color.red(this.l);
        this.q = red;
        this.n = red;
        float green = Color.green(this.l);
        this.r = green;
        this.o = green;
        float blue = Color.blue(this.l);
        this.s = blue;
        this.p = blue;
        b(i);
    }

    private void b() {
        float abs = Math.abs(this.n - this.q);
        float abs2 = Math.abs(this.o - this.r);
        float abs3 = Math.abs(this.p - this.s);
        if (abs > 1.0f || abs2 > 1.0f || abs3 > 1.0f) {
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
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int alpha = Color.alpha(i);
        int a = a(a(rotation().x), 4);
        int a2 = a(a - 1, 4);
        int a3 = a(a + 1, 4);
        float b = b(rotation().x);
        float f2 = ((double) b) < 0.5d ? b / 0.5f : 1.0f;
        float f3 = b > 0.5f ? (1.0f - b) / 0.5f : 1.0f;
        float f4 = 0.7f;
        float f5 = 1.0f - 0.7f;
        for (int i2 = 0; i2 < this.k; i2++) {
            if (i2 < 24) {
                int i3 = i2 % 6;
                int i4 = i2 / 6;
                if (i4 == a) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.j[(i2 * 4) + 0] = (red / 255.0f) * ((f5 * f2) + f4);
                            this.j[(i2 * 4) + 1] = (green / 255.0f) * ((f5 * f2) + f4);
                            this.j[(i2 * 4) + 2] = (blue / 255.0f) * ((f5 * f2) + f4);
                            this.j[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                        case 1:
                        default:
                            this.j[(i2 * 4) + 0] = (red / 255.0f) * ((f5 * f3) + f4) * 0.7f;
                            this.j[(i2 * 4) + 1] = (green / 255.0f) * ((f5 * f3) + f4) * 0.7f;
                            this.j[(i2 * 4) + 2] = (blue / 255.0f) * ((f5 * f3) + f4) * 0.7f;
                            this.j[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                    }
                } else if (i4 == a2) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.j[(i2 * 4) + 0] = (red / 255.0f) * 1.0f;
                            this.j[(i2 * 4) + 1] = (green / 255.0f) * 1.0f;
                            this.j[(i2 * 4) + 2] = (blue / 255.0f) * 1.0f;
                            this.j[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                        case 1:
                        default:
                            this.j[(i2 * 4) + 0] = (red / 255.0f) * f4 * 0.7f;
                            this.j[(i2 * 4) + 1] = (green / 255.0f) * f4 * 0.7f;
                            this.j[(i2 * 4) + 2] = (blue / 255.0f) * f4 * 0.7f;
                            this.j[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                    }
                } else if (i4 == a3) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.j[(i2 * 4) + 0] = (red / 255.0f) * f4;
                            this.j[(i2 * 4) + 1] = (green / 255.0f) * f4;
                            this.j[(i2 * 4) + 2] = (blue / 255.0f) * f4;
                            this.j[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                        case 1:
                        default:
                            this.j[(i2 * 4) + 0] = (red / 255.0f) * 1.0f * 0.7f;
                            this.j[(i2 * 4) + 1] = (green / 255.0f) * 1.0f * 0.7f;
                            this.j[(i2 * 4) + 2] = (blue / 255.0f) * 1.0f * 0.7f;
                            this.j[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                    }
                } else {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.j[(i2 * 4) + 0] = red / 255.0f;
                            this.j[(i2 * 4) + 1] = green / 255.0f;
                            this.j[(i2 * 4) + 2] = blue / 255.0f;
                            this.j[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                        case 1:
                        default:
                            this.j[(i2 * 4) + 0] = (red / 255.0f) * 0.7f;
                            this.j[(i2 * 4) + 1] = (green / 255.0f) * 0.7f;
                            this.j[(i2 * 4) + 2] = (blue / 255.0f) * 0.7f;
                            this.j[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                    }
                }
            } else if (i2 >= 24 && i2 < 36) {
                this.j[(i2 * 4) + 0] = (red / 255.0f) * 0.5f;
                this.j[(i2 * 4) + 1] = (green / 255.0f) * 0.5f;
                this.j[(i2 * 4) + 2] = (blue / 255.0f) * 0.5f;
                this.j[(i2 * 4) + 3] = alpha / 255.0f;
            } else {
                int i5 = i2 % 6;
                int i6 = (i2 - 36) / 12;
                f4 = 0.5f;
                f5 = 1.0f - 0.5f;
                if (i6 == a) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.j[(i2 * 4) + 0] = ((f5 * f2) + 0.5f) * 1.0f;
                            this.j[(i2 * 4) + 1] = ((f5 * f2) + 0.5f) * 1.0f;
                            this.j[(i2 * 4) + 2] = 1.0f * ((f5 * f2) + 0.5f);
                            this.j[(i2 * 4) + 3] = 1.0f;
                            continue;
                        case 1:
                        default:
                            this.j[(i2 * 4) + 0] = ((f5 * f3) + 0.5f) * 1.0f;
                            this.j[(i2 * 4) + 1] = ((f5 * f3) + 0.5f) * 1.0f;
                            this.j[(i2 * 4) + 2] = 1.0f * ((f5 * f3) + 0.5f);
                            this.j[(i2 * 4) + 3] = 1.0f;
                            continue;
                    }
                } else if (i6 == a2) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.j[(i2 * 4) + 0] = 1.0f * 1.0f;
                            this.j[(i2 * 4) + 1] = 1.0f * 1.0f;
                            this.j[(i2 * 4) + 2] = 1.0f * 1.0f;
                            this.j[(i2 * 4) + 3] = 1.0f;
                            continue;
                        case 1:
                        default:
                            this.j[(i2 * 4) + 0] = 1.0f * 0.5f;
                            this.j[(i2 * 4) + 1] = 1.0f * 0.5f;
                            this.j[(i2 * 4) + 2] = 1.0f * 0.5f;
                            this.j[(i2 * 4) + 3] = 1.0f;
                            continue;
                    }
                } else if (i6 == a3) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.j[(i2 * 4) + 0] = 1.0f * 0.5f;
                            this.j[(i2 * 4) + 1] = 1.0f * 0.5f;
                            this.j[(i2 * 4) + 2] = 1.0f * 0.5f;
                            this.j[(i2 * 4) + 3] = 1.0f;
                            continue;
                        case 1:
                        default:
                            this.j[(i2 * 4) + 0] = 1.0f * 1.0f;
                            this.j[(i2 * 4) + 1] = 1.0f * 1.0f;
                            this.j[(i2 * 4) + 2] = 1.0f * 1.0f;
                            this.j[(i2 * 4) + 3] = 1.0f;
                            continue;
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
                            continue;
                        case 1:
                        default:
                            this.j[(i2 * 4) + 0] = 1.0f * 0.7f;
                            this.j[(i2 * 4) + 1] = 1.0f * 0.7f;
                            this.j[(i2 * 4) + 2] = 1.0f * 0.7f;
                            this.j[(i2 * 4) + 3] = 1.0f;
                            continue;
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
        boolean colorFillEnable = colorFillEnable();
        if (visible() && c.h.a != null) {
            if (colorFillEnable) {
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
            if (colorFillEnable) {
            }
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            GLES20.glBindTexture(3553, 0);
        }
    }
}
