package com.tsf.shell.widget.cubeclock;

import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* renamed from: com.tsf.shell.widget.cubeclock.d */
/* loaded from: classes.dex */
public class C4383d extends VObject3dContainer {

    /* renamed from: a */
    protected FloatBuffer f14210a;

    /* renamed from: b */
    protected FloatBuffer f14211b;

    /* renamed from: c */
    protected FloatBuffer f14212c;

    /* renamed from: f */
    float[] f14215f;

    /* renamed from: g */
    float[] f14216g;

    /* renamed from: i */
    private C4382c f14218i;

    /* renamed from: l */
    private float f14221l;

    /* renamed from: m */
    private float f14222m;

    /* renamed from: n */
    private float f14223n;

    /* renamed from: h */
    private int f14217h = 84;

    /* renamed from: d */
    public int f14213d = 0;

    /* renamed from: e */
    public int f14214e = 0;

    /* renamed from: j */
    private int f14219j = 0;

    /* renamed from: k */
    private int f14220k = 0;

    /* renamed from: o */
    private float f14224o = 0.0f;

    /* renamed from: p */
    private float f14225p = 0.0f;

    /* renamed from: q */
    private float f14226q = 0.0f;

    public C4383d(C4382c c4382c) {
        this.f14218i = c4382c;
        this.f14218i.f14195c.addObject(this);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f14217h * 3 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f14211b = allocateDirect.asFloatBuffer();
        this.f14211b.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.f14217h * 2 * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.f14212c = allocateDirect2.asFloatBuffer();
        this.f14212c.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(this.f14217h * 4 * 4);
        allocateDirect3.order(ByteOrder.nativeOrder());
        this.f14210a = allocateDirect3.asFloatBuffer();
        this.f14210a.position(0);
        m79a();
        this.f14218i.f14199g.m42a(this);
        rotation().f2526x = -360.0f;
    }

    /* renamed from: a */
    private void m79a() {
        this.f14215f = new float[]{-64.0f, 64.0f, 63.0f, -64.0f, -64.0f, 63.0f, 64.0f, 64.0f, 63.0f, 64.0f, 64.0f, 63.0f, -64.0f, -64.0f, 63.0f, 64.0f, -64.0f, 63.0f, -64.0f, 63.0f, -64.0f, -64.0f, 63.0f, 64.0f, 64.0f, 63.0f, -64.0f, 64.0f, 63.0f, -64.0f, -64.0f, 63.0f, 64.0f, 64.0f, 63.0f, 64.0f, -64.0f, -64.0f, -63.0f, -64.0f, 64.0f, -63.0f, 64.0f, -64.0f, -63.0f, 64.0f, -64.0f, -63.0f, -64.0f, 64.0f, -63.0f, 64.0f, 64.0f, -63.0f, -64.0f, -63.0f, 64.0f, -64.0f, -63.0f, -64.0f, 64.0f, -63.0f, 64.0f, 64.0f, -63.0f, 64.0f, -64.0f, -63.0f, -64.0f, 64.0f, -63.0f, -64.0f, -63.0f, 64.0f, -64.0f, -63.0f, -64.0f, -64.0f, -63.0f, 64.0f, 64.0f, -63.0f, 64.0f, 64.0f, -63.0f, -64.0f, -64.0f, -63.0f, -64.0f, 64.0f, 63.0f, 64.0f, 64.0f, 63.0f, -64.0f, 64.0f, 63.0f, 64.0f, -64.0f, 63.0f, 64.0f, -64.0f, 63.0f, -64.0f, 64.0f, 63.0f, -64.0f, -64.0f, -63.0f, 63.0f, 63.0f, -63.0f, -63.0f, 63.0f, 0.0f, 63.0f, 63.0f, 0.0f, 63.0f, 63.0f, -63.0f, -63.0f, 63.0f, 0.0f, -63.0f, 63.0f, 0.0f, 63.0f, 63.0f, 0.0f, -63.0f, 63.0f, 63.0f, 63.0f, 63.0f, 63.0f, 63.0f, 63.0f, 0.0f, -63.0f, 63.0f, 63.0f, -63.0f, 63.0f, -63.0f, 63.0f, -63.0f, -63.0f, 63.0f, 63.0f, 0.0f, 63.0f, -63.0f, 0.0f, 63.0f, -63.0f, -63.0f, 63.0f, 63.0f, 0.0f, 63.0f, 63.0f, 0.0f, 63.0f, -63.0f, 0.0f, 63.0f, 63.0f, 63.0f, 63.0f, -63.0f, 63.0f, 63.0f, -63.0f, 0.0f, 63.0f, 63.0f, 63.0f, 63.0f, 63.0f, -63.0f, -63.0f, -63.0f, -63.0f, 63.0f, -63.0f, 0.0f, -63.0f, -63.0f, 0.0f, -63.0f, -63.0f, -63.0f, 63.0f, -63.0f, 0.0f, 63.0f, -63.0f, 0.0f, -63.0f, -63.0f, 0.0f, 63.0f, -63.0f, 63.0f, -63.0f, -63.0f, 63.0f, -63.0f, -63.0f, 0.0f, 63.0f, -63.0f, 63.0f, 63.0f, -63.0f, -63.0f, -63.0f, 63.0f, -63.0f, -63.0f, -63.0f, 0.0f, -63.0f, 63.0f, 0.0f, -63.0f, 63.0f, -63.0f, -63.0f, -63.0f, 0.0f, -63.0f, -63.0f, 0.0f, -63.0f, 63.0f, 0.0f, -63.0f, -63.0f, 63.0f, -63.0f, 63.0f, 63.0f, -63.0f, 63.0f, 0.0f, -63.0f, -63.0f, 63.0f, -63.0f, -63.0f};
        this.f14216g = new float[this.f14217h * 4];
        m71c(-13421773);
        this.f14211b.put(this.f14215f);
        this.f14212c.put(this.f14218i.f14199g.m41b());
        this.f14212c.put(this.f14218i.f14199g.m41b());
        this.f14212c.put(this.f14218i.f14199g.m41b());
        this.f14212c.put(this.f14218i.f14199g.m41b());
        this.f14212c.put(this.f14218i.f14199g.m41b());
        this.f14212c.put(this.f14218i.f14199g.m41b());
        this.f14211b.position(0);
        this.f14212c.position(0);
    }

    /* renamed from: a */
    public void m77a(int i) {
        this.f14219j = i;
        this.f14221l = Color.red(this.f14219j);
        this.f14222m = Color.green(this.f14219j);
        this.f14223n = Color.blue(this.f14219j);
    }

    /* renamed from: b */
    public void m72b(int i) {
        this.f14219j = i;
        this.f14220k = i;
        float red = Color.red(this.f14219j);
        this.f14224o = red;
        this.f14221l = red;
        float green = Color.green(this.f14219j);
        this.f14225p = green;
        this.f14222m = green;
        float blue = Color.blue(this.f14219j);
        this.f14226q = blue;
        this.f14223n = blue;
        m71c(i);
    }

    /* renamed from: b */
    private void m74b() {
        float abs = Math.abs(this.f14221l - this.f14224o);
        float abs2 = Math.abs(this.f14222m - this.f14225p);
        float abs3 = Math.abs(this.f14223n - this.f14226q);
        if (abs > 1.0f || abs2 > 1.0f || abs3 > 1.0f) {
            invalidate();
            this.f14224o = ((this.f14221l - this.f14224o) * 0.1f) + this.f14224o;
            this.f14225p = ((this.f14222m - this.f14225p) * 0.1f) + this.f14225p;
            this.f14226q = (0.1f * (this.f14223n - this.f14226q)) + this.f14226q;
            m71c(Color.argb(255, (int) this.f14224o, (int) this.f14225p, (int) this.f14226q));
            return;
        }
        if (this.f14220k != this.f14219j) {
            this.f14224o = this.f14221l;
            this.f14225p = this.f14222m;
            this.f14226q = this.f14223n;
            this.f14220k = this.f14219j;
            C4390j.m53a("Widget Cube Slient First");
        }
        m71c(this.f14220k);
    }

    /* renamed from: a */
    public int m78a(float f) {
        return Math.round(f / 90.0f);
    }

    /* renamed from: b */
    private float m73b(float f) {
        float f2 = ((45.0f + f) % 90.0f) / 90.0f;
        return f2 < 0.0f ? f2 + 1.0f : f2;
    }

    /* renamed from: c */
    public void m71c(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int alpha = Color.alpha(i);
        int m76a = m76a(m78a(rotation().f2526x), 4);
        int m76a2 = m76a(m76a - 1, 4);
        int m76a3 = m76a(m76a + 1, 4);
        float m73b = m73b(rotation().f2526x);
        float f = ((double) m73b) < 0.5d ? m73b / 0.5f : 1.0f;
        float f2 = m73b > 0.5f ? (1.0f - m73b) / 0.5f : 1.0f;
        float f3 = 0.7f;
        float f4 = 1.0f - 0.7f;
        for (int i2 = 0; i2 < this.f14217h; i2++) {
            if (i2 < 24) {
                int i3 = i2 % 6;
                int i4 = i2 / 6;
                if (i4 == m76a) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.f14216g[(i2 * 4) + 0] = (red / 255.0f) * ((f4 * f) + f3);
                            this.f14216g[(i2 * 4) + 1] = (green / 255.0f) * ((f4 * f) + f3);
                            this.f14216g[(i2 * 4) + 2] = (blue / 255.0f) * ((f4 * f) + f3);
                            this.f14216g[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                        case 1:
                        default:
                            this.f14216g[(i2 * 4) + 0] = (red / 255.0f) * ((f4 * f2) + f3) * 0.7f;
                            this.f14216g[(i2 * 4) + 1] = (green / 255.0f) * ((f4 * f2) + f3) * 0.7f;
                            this.f14216g[(i2 * 4) + 2] = (blue / 255.0f) * ((f4 * f2) + f3) * 0.7f;
                            this.f14216g[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                    }
                } else if (i4 == m76a2) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.f14216g[(i2 * 4) + 0] = (red / 255.0f) * 1.0f;
                            this.f14216g[(i2 * 4) + 1] = (green / 255.0f) * 1.0f;
                            this.f14216g[(i2 * 4) + 2] = (blue / 255.0f) * 1.0f;
                            this.f14216g[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                        case 1:
                        default:
                            this.f14216g[(i2 * 4) + 0] = (red / 255.0f) * f3 * 0.7f;
                            this.f14216g[(i2 * 4) + 1] = (green / 255.0f) * f3 * 0.7f;
                            this.f14216g[(i2 * 4) + 2] = (blue / 255.0f) * f3 * 0.7f;
                            this.f14216g[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                    }
                } else if (i4 == m76a3) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.f14216g[(i2 * 4) + 0] = (red / 255.0f) * f3;
                            this.f14216g[(i2 * 4) + 1] = (green / 255.0f) * f3;
                            this.f14216g[(i2 * 4) + 2] = (blue / 255.0f) * f3;
                            this.f14216g[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                        case 1:
                        default:
                            this.f14216g[(i2 * 4) + 0] = (red / 255.0f) * 1.0f * 0.7f;
                            this.f14216g[(i2 * 4) + 1] = (green / 255.0f) * 1.0f * 0.7f;
                            this.f14216g[(i2 * 4) + 2] = (blue / 255.0f) * 1.0f * 0.7f;
                            this.f14216g[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                    }
                } else {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.f14216g[(i2 * 4) + 0] = red / 255.0f;
                            this.f14216g[(i2 * 4) + 1] = green / 255.0f;
                            this.f14216g[(i2 * 4) + 2] = blue / 255.0f;
                            this.f14216g[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                        case 1:
                        default:
                            this.f14216g[(i2 * 4) + 0] = (red / 255.0f) * 0.7f;
                            this.f14216g[(i2 * 4) + 1] = (green / 255.0f) * 0.7f;
                            this.f14216g[(i2 * 4) + 2] = (blue / 255.0f) * 0.7f;
                            this.f14216g[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                    }
                }
            } else if (i2 >= 24 && i2 < 36) {
                this.f14216g[(i2 * 4) + 0] = (red / 255.0f) * 0.5f;
                this.f14216g[(i2 * 4) + 1] = (green / 255.0f) * 0.5f;
                this.f14216g[(i2 * 4) + 2] = (blue / 255.0f) * 0.5f;
                this.f14216g[(i2 * 4) + 3] = alpha / 255.0f;
            } else {
                int i5 = i2 % 6;
                int i6 = (i2 - 36) / 12;
                f3 = 0.5f;
                f4 = 1.0f - 0.5f;
                if (i6 == m76a) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.f14216g[(i2 * 4) + 0] = ((f4 * f) + 0.5f) * 1.0f;
                            this.f14216g[(i2 * 4) + 1] = ((f4 * f) + 0.5f) * 1.0f;
                            this.f14216g[(i2 * 4) + 2] = 1.0f * ((f4 * f) + 0.5f);
                            this.f14216g[(i2 * 4) + 3] = 1.0f;
                            continue;
                        case 1:
                        default:
                            this.f14216g[(i2 * 4) + 0] = ((f4 * f2) + 0.5f) * 1.0f;
                            this.f14216g[(i2 * 4) + 1] = ((f4 * f2) + 0.5f) * 1.0f;
                            this.f14216g[(i2 * 4) + 2] = 1.0f * ((f4 * f2) + 0.5f);
                            this.f14216g[(i2 * 4) + 3] = 1.0f;
                            continue;
                    }
                } else if (i6 == m76a2) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.f14216g[(i2 * 4) + 0] = 1.0f * 1.0f;
                            this.f14216g[(i2 * 4) + 1] = 1.0f * 1.0f;
                            this.f14216g[(i2 * 4) + 2] = 1.0f * 1.0f;
                            this.f14216g[(i2 * 4) + 3] = 1.0f;
                            continue;
                        case 1:
                        default:
                            this.f14216g[(i2 * 4) + 0] = 1.0f * 0.5f;
                            this.f14216g[(i2 * 4) + 1] = 1.0f * 0.5f;
                            this.f14216g[(i2 * 4) + 2] = 1.0f * 0.5f;
                            this.f14216g[(i2 * 4) + 3] = 1.0f;
                            continue;
                    }
                } else if (i6 == m76a3) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.f14216g[(i2 * 4) + 0] = 1.0f * 0.5f;
                            this.f14216g[(i2 * 4) + 1] = 1.0f * 0.5f;
                            this.f14216g[(i2 * 4) + 2] = 1.0f * 0.5f;
                            this.f14216g[(i2 * 4) + 3] = 1.0f;
                            continue;
                        case 1:
                        default:
                            this.f14216g[(i2 * 4) + 0] = 1.0f * 1.0f;
                            this.f14216g[(i2 * 4) + 1] = 1.0f * 1.0f;
                            this.f14216g[(i2 * 4) + 2] = 1.0f * 1.0f;
                            this.f14216g[(i2 * 4) + 3] = 1.0f;
                            continue;
                    }
                } else {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.f14216g[(i2 * 4) + 0] = 1.0f;
                            this.f14216g[(i2 * 4) + 1] = 1.0f;
                            this.f14216g[(i2 * 4) + 2] = 1.0f;
                            this.f14216g[(i2 * 4) + 3] = 1.0f;
                            continue;
                        case 1:
                        default:
                            this.f14216g[(i2 * 4) + 0] = 1.0f * 0.7f;
                            this.f14216g[(i2 * 4) + 1] = 1.0f * 0.7f;
                            this.f14216g[(i2 * 4) + 2] = 1.0f * 0.7f;
                            this.f14216g[(i2 * 4) + 3] = 1.0f;
                            continue;
                    }
                }
            }
        }
        this.f14210a.position(0);
        this.f14210a.put(this.f14216g);
        this.f14210a.position(0);
    }

    /* renamed from: a */
    public int m76a(int i, int i2) {
        int i3 = i % i2;
        return i3 < 0 ? i3 + i2 : i3;
    }

    /* renamed from: a */
    public void m75a(int i, float[] fArr) {
        this.f14212c.position((i * 24) + 72);
        this.f14212c.put(fArr);
        this.f14212c.position(0);
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
        m74b();
        boolean colorFillEnable = colorFillEnable();
        if (visible()) {
            if (colorFillEnable) {
                ShaderManager.SHADER_COLOR_TEXTURE.glMVPMatrix();
                ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.f14212c);
                ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.f14211b);
                ShaderManager.SHADER_COLOR_TEXTURE.glColor4f(this);
            } else {
                ShaderManager.SHADER_COLOR_TEXTURE.glMVPMatrix();
                ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.f14212c);
                ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.f14211b);
                ShaderManager.SHADER_COLOR_TEXTURE.glColorPointer(4, 5126, false, 0, this.f14210a);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f14218i.f14199g.f14241a.f2529id);
            GLES20.glDrawArrays(4, 0, 36);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f14213d);
            GLES20.glDrawArrays(4, 36, this.f14217h - 36);
            if (colorFillEnable) {
            }
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            GLES20.glBindTexture(3553, 0);
        }
    }
}
