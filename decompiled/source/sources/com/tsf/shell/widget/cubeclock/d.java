package com.tsf.shell.widget.cubeclock;

import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* loaded from: classes.dex */
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
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.h * 3 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.b = allocateDirect.asFloatBuffer();
        this.b.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.h * 2 * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.c = allocateDirect2.asFloatBuffer();
        this.c.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(this.h * 4 * 4);
        allocateDirect3.order(ByteOrder.nativeOrder());
        this.a = allocateDirect3.asFloatBuffer();
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
        float red = Color.red(this.j);
        this.o = red;
        this.l = red;
        float green = Color.green(this.j);
        this.p = green;
        this.m = green;
        float blue = Color.blue(this.j);
        this.q = blue;
        this.n = blue;
        c(i);
    }

    private void b() {
        float abs = Math.abs(this.l - this.o);
        float abs2 = Math.abs(this.m - this.p);
        float abs3 = Math.abs(this.n - this.q);
        if (abs > 1.0f || abs2 > 1.0f || abs3 > 1.0f) {
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
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int alpha = Color.alpha(i);
        int a = a(a(rotation().x), 4);
        int a2 = a(a - 1, 4);
        int a3 = a(a + 1, 4);
        float b = b(rotation().x);
        float f = ((double) b) < 0.5d ? b / 0.5f : 1.0f;
        float f2 = b > 0.5f ? (1.0f - b) / 0.5f : 1.0f;
        float f3 = 0.7f;
        float f4 = 1.0f - 0.7f;
        for (int i2 = 0; i2 < this.h; i2++) {
            if (i2 < 24) {
                int i3 = i2 % 6;
                int i4 = i2 / 6;
                if (i4 == a) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.g[(i2 * 4) + 0] = (red / 255.0f) * ((f4 * f) + f3);
                            this.g[(i2 * 4) + 1] = (green / 255.0f) * ((f4 * f) + f3);
                            this.g[(i2 * 4) + 2] = (blue / 255.0f) * ((f4 * f) + f3);
                            this.g[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                        case 1:
                        default:
                            this.g[(i2 * 4) + 0] = (red / 255.0f) * ((f4 * f2) + f3) * 0.7f;
                            this.g[(i2 * 4) + 1] = (green / 255.0f) * ((f4 * f2) + f3) * 0.7f;
                            this.g[(i2 * 4) + 2] = (blue / 255.0f) * ((f4 * f2) + f3) * 0.7f;
                            this.g[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                    }
                } else if (i4 == a2) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.g[(i2 * 4) + 0] = (red / 255.0f) * 1.0f;
                            this.g[(i2 * 4) + 1] = (green / 255.0f) * 1.0f;
                            this.g[(i2 * 4) + 2] = (blue / 255.0f) * 1.0f;
                            this.g[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                        case 1:
                        default:
                            this.g[(i2 * 4) + 0] = (red / 255.0f) * f3 * 0.7f;
                            this.g[(i2 * 4) + 1] = (green / 255.0f) * f3 * 0.7f;
                            this.g[(i2 * 4) + 2] = (blue / 255.0f) * f3 * 0.7f;
                            this.g[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                    }
                } else if (i4 == a3) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.g[(i2 * 4) + 0] = (red / 255.0f) * f3;
                            this.g[(i2 * 4) + 1] = (green / 255.0f) * f3;
                            this.g[(i2 * 4) + 2] = (blue / 255.0f) * f3;
                            this.g[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                        case 1:
                        default:
                            this.g[(i2 * 4) + 0] = (red / 255.0f) * 1.0f * 0.7f;
                            this.g[(i2 * 4) + 1] = (green / 255.0f) * 1.0f * 0.7f;
                            this.g[(i2 * 4) + 2] = (blue / 255.0f) * 1.0f * 0.7f;
                            this.g[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                    }
                } else {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.g[(i2 * 4) + 0] = red / 255.0f;
                            this.g[(i2 * 4) + 1] = green / 255.0f;
                            this.g[(i2 * 4) + 2] = blue / 255.0f;
                            this.g[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                        case 1:
                        default:
                            this.g[(i2 * 4) + 0] = (red / 255.0f) * 0.7f;
                            this.g[(i2 * 4) + 1] = (green / 255.0f) * 0.7f;
                            this.g[(i2 * 4) + 2] = (blue / 255.0f) * 0.7f;
                            this.g[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                    }
                }
            } else if (i2 >= 24 && i2 < 36) {
                this.g[(i2 * 4) + 0] = (red / 255.0f) * 0.5f;
                this.g[(i2 * 4) + 1] = (green / 255.0f) * 0.5f;
                this.g[(i2 * 4) + 2] = (blue / 255.0f) * 0.5f;
                this.g[(i2 * 4) + 3] = alpha / 255.0f;
            } else {
                int i5 = i2 % 6;
                int i6 = (i2 - 36) / 12;
                f3 = 0.5f;
                f4 = 1.0f - 0.5f;
                if (i6 == a) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.g[(i2 * 4) + 0] = ((f4 * f) + 0.5f) * 1.0f;
                            this.g[(i2 * 4) + 1] = ((f4 * f) + 0.5f) * 1.0f;
                            this.g[(i2 * 4) + 2] = 1.0f * ((f4 * f) + 0.5f);
                            this.g[(i2 * 4) + 3] = 1.0f;
                            continue;
                        case 1:
                        default:
                            this.g[(i2 * 4) + 0] = ((f4 * f2) + 0.5f) * 1.0f;
                            this.g[(i2 * 4) + 1] = ((f4 * f2) + 0.5f) * 1.0f;
                            this.g[(i2 * 4) + 2] = 1.0f * ((f4 * f2) + 0.5f);
                            this.g[(i2 * 4) + 3] = 1.0f;
                            continue;
                    }
                } else if (i6 == a2) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.g[(i2 * 4) + 0] = 1.0f * 1.0f;
                            this.g[(i2 * 4) + 1] = 1.0f * 1.0f;
                            this.g[(i2 * 4) + 2] = 1.0f * 1.0f;
                            this.g[(i2 * 4) + 3] = 1.0f;
                            continue;
                        case 1:
                        default:
                            this.g[(i2 * 4) + 0] = 1.0f * 0.5f;
                            this.g[(i2 * 4) + 1] = 1.0f * 0.5f;
                            this.g[(i2 * 4) + 2] = 1.0f * 0.5f;
                            this.g[(i2 * 4) + 3] = 1.0f;
                            continue;
                    }
                } else if (i6 == a3) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.g[(i2 * 4) + 0] = 1.0f * 0.5f;
                            this.g[(i2 * 4) + 1] = 1.0f * 0.5f;
                            this.g[(i2 * 4) + 2] = 1.0f * 0.5f;
                            this.g[(i2 * 4) + 3] = 1.0f;
                            continue;
                        case 1:
                        default:
                            this.g[(i2 * 4) + 0] = 1.0f * 1.0f;
                            this.g[(i2 * 4) + 1] = 1.0f * 1.0f;
                            this.g[(i2 * 4) + 2] = 1.0f * 1.0f;
                            this.g[(i2 * 4) + 3] = 1.0f;
                            continue;
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
                            continue;
                        case 1:
                        default:
                            this.g[(i2 * 4) + 0] = 1.0f * 0.7f;
                            this.g[(i2 * 4) + 1] = 1.0f * 0.7f;
                            this.g[(i2 * 4) + 2] = 1.0f * 0.7f;
                            this.g[(i2 * 4) + 3] = 1.0f;
                            continue;
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
        boolean colorFillEnable = colorFillEnable();
        if (visible()) {
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
            GLES20.glBindTexture(3553, this.i.g.a.id);
            GLES20.glDrawArrays(4, 0, 36);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.d);
            GLES20.glDrawArrays(4, 36, this.h - 36);
            if (colorFillEnable) {
            }
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            GLES20.glBindTexture(3553, 0);
        }
    }
}
