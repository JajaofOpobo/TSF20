package com.tsf.shell.p096f.p153i.p161c.p162a.p164b;

import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* renamed from: com.tsf.shell.f.i.c.a.b.a */
/* loaded from: classes.dex */
public class C3258a extends VObject3dContainer {

    /* renamed from: d */
    public static int f10718d = 62;

    /* renamed from: e */
    public static int f10719e = f10718d / 2;

    /* renamed from: f */
    public static int f10720f = 64;

    /* renamed from: a */
    protected FloatBuffer f10721a;

    /* renamed from: b */
    protected FloatBuffer f10722b;

    /* renamed from: c */
    protected FloatBuffer f10723c;

    /* renamed from: i */
    float[] f10726i;

    /* renamed from: j */
    float[] f10727j;

    /* renamed from: n */
    private float f10731n;

    /* renamed from: o */
    private float f10732o;

    /* renamed from: p */
    private float f10733p;

    /* renamed from: k */
    private int f10728k = 84;

    /* renamed from: g */
    public int f10724g = 0;

    /* renamed from: h */
    public int f10725h = 0;

    /* renamed from: l */
    private int f10729l = 0;

    /* renamed from: m */
    private int f10730m = 0;

    /* renamed from: q */
    private float f10734q = 0.0f;

    /* renamed from: r */
    private float f10735r = 0.0f;

    /* renamed from: s */
    private float f10736s = 0.0f;

    public C3258a() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f10728k * 3 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f10722b = allocateDirect.asFloatBuffer();
        this.f10722b.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.f10728k * 2 * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.f10723c = allocateDirect2.asFloatBuffer();
        this.f10723c.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(this.f10728k * 4 * 4);
        allocateDirect3.order(ByteOrder.nativeOrder());
        this.f10721a = allocateDirect3.asFloatBuffer();
        this.f10721a.position(0);
        m2988a();
        C3260c.f10745h.m2956a(this);
        rotation().f2526x = -360.0f;
    }

    /* renamed from: a */
    private void m2988a() {
        this.f10726i = new float[]{-f10720f, f10720f, f10718d, -f10720f, -f10720f, f10718d, f10720f, f10720f, f10718d, f10720f, f10720f, f10718d, -f10720f, -f10720f, f10718d, f10720f, -f10720f, f10718d, -f10720f, f10718d, -f10720f, -f10720f, f10718d, f10720f, f10720f, f10718d, -f10720f, f10720f, f10718d, -f10720f, -f10720f, f10718d, f10720f, f10720f, f10718d, f10720f, -f10720f, -f10720f, -f10718d, -f10720f, f10720f, -f10718d, f10720f, -f10720f, -f10718d, f10720f, -f10720f, -f10718d, -f10720f, f10720f, -f10718d, f10720f, f10720f, -f10718d, -f10720f, -f10718d, f10720f, -f10720f, -f10718d, -f10720f, f10720f, -f10718d, f10720f, f10720f, -f10718d, f10720f, -f10720f, -f10718d, -f10720f, f10720f, -f10718d, -f10720f, -f10718d, f10720f, -f10720f, -f10718d, -f10720f, -f10720f, -f10718d, f10720f, f10720f, -f10718d, f10720f, f10720f, -f10718d, -f10720f, -f10720f, -f10718d, -f10720f, f10720f, f10718d, f10720f, f10720f, f10718d, -f10720f, f10720f, f10718d, f10720f, -f10720f, f10718d, f10720f, -f10720f, f10718d, -f10720f, f10720f, f10718d, -f10720f, -f10720f, -f10718d, f10718d, f10718d, -f10718d, -f10718d, f10718d, 0.0f, f10718d, f10718d, 0.0f, f10718d, f10718d, -f10718d, -f10718d, f10718d, 0.0f, -f10718d, f10718d, 0.0f, f10718d, f10718d, 0.0f, -f10718d, f10718d, f10718d, f10718d, f10718d, f10718d, f10718d, f10718d, 0.0f, -f10718d, f10718d, f10718d, -f10718d, f10718d, -f10718d, f10718d, -f10718d, -f10718d, f10718d, f10718d, 0.0f, f10718d, -f10718d, 0.0f, f10718d, -f10718d, -f10718d, f10718d, f10718d, 0.0f, f10718d, f10718d, 0.0f, f10718d, -f10718d, 0.0f, f10718d, f10718d, f10718d, f10718d, -f10718d, f10718d, f10718d, -f10718d, 0.0f, f10718d, f10718d, f10718d, f10718d, f10718d, -f10718d, -f10718d, -f10718d, -f10718d, f10718d, -f10718d, 0.0f, -f10718d, -f10718d, 0.0f, -f10718d, -f10718d, -f10718d, f10718d, -f10718d, 0.0f, f10718d, -f10718d, 0.0f, -f10718d, -f10718d, 0.0f, f10718d, -f10718d, f10718d, -f10718d, -f10718d, f10718d, -f10718d, -f10718d, 0.0f, f10718d, -f10718d, f10718d, f10718d, -f10718d, -f10718d, -f10718d, f10718d, -f10718d, -f10718d, -f10718d, 0.0f, -f10718d, f10718d, 0.0f, -f10718d, f10718d, -f10718d, -f10718d, -f10718d, 0.0f, -f10718d, -f10718d, 0.0f, -f10718d, f10718d, 0.0f, -f10718d, -f10718d, f10718d, -f10718d, f10718d, f10718d, -f10718d, f10718d, 0.0f, -f10718d, -f10718d, f10718d, -f10718d, -f10718d};
        this.f10727j = new float[this.f10728k * 4];
        m2981b(-13421773);
        this.f10722b.put(this.f10726i);
        float[] m2955c = C3260c.f10745h.m2955c();
        this.f10723c.put(m2955c);
        this.f10723c.put(m2955c);
        this.f10723c.put(m2955c);
        this.f10723c.put(m2955c);
        this.f10723c.put(m2955c);
        this.f10723c.put(m2955c);
        this.f10722b.position(0);
        this.f10723c.position(0);
    }

    /* renamed from: a */
    public void m2986a(int i) {
        this.f10729l = i;
        this.f10730m = i;
        float red = Color.red(this.f10729l);
        this.f10734q = red;
        this.f10731n = red;
        float green = Color.green(this.f10729l);
        this.f10735r = green;
        this.f10732o = green;
        float blue = Color.blue(this.f10729l);
        this.f10736s = blue;
        this.f10733p = blue;
        m2981b(i);
    }

    /* renamed from: b */
    private void m2983b() {
        float abs = Math.abs(this.f10731n - this.f10734q);
        float abs2 = Math.abs(this.f10732o - this.f10735r);
        float abs3 = Math.abs(this.f10733p - this.f10736s);
        if (abs > 1.0f || abs2 > 1.0f || abs3 > 1.0f) {
            invalidate();
            this.f10734q = ((this.f10731n - this.f10734q) * 0.1f) + this.f10734q;
            this.f10735r = ((this.f10732o - this.f10735r) * 0.1f) + this.f10735r;
            this.f10736s = (0.1f * (this.f10733p - this.f10736s)) + this.f10736s;
            m2981b(Color.argb(255, (int) this.f10734q, (int) this.f10735r, (int) this.f10736s));
            return;
        }
        if (this.f10730m != this.f10729l) {
            this.f10734q = this.f10731n;
            this.f10735r = this.f10732o;
            this.f10736s = this.f10733p;
            this.f10730m = this.f10729l;
        }
        m2981b(this.f10730m);
    }

    /* renamed from: a */
    public int m2987a(float f) {
        return Math.round(f / 90.0f);
    }

    /* renamed from: b */
    private float m2982b(float f) {
        float f2 = ((45.0f + f) % 90.0f) / 90.0f;
        return f2 < 0.0f ? f2 + 1.0f : f2;
    }

    /* renamed from: b */
    public void m2981b(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int alpha = Color.alpha(i);
        int m2985a = m2985a(m2987a(rotation().f2526x), 4);
        int m2985a2 = m2985a(m2985a - 1, 4);
        int m2985a3 = m2985a(m2985a + 1, 4);
        float m2982b = m2982b(rotation().f2526x);
        float f = ((double) m2982b) < 0.5d ? m2982b / 0.5f : 1.0f;
        float f2 = m2982b > 0.5f ? (1.0f - m2982b) / 0.5f : 1.0f;
        float f3 = 0.7f;
        float f4 = 1.0f - 0.7f;
        for (int i2 = 0; i2 < this.f10728k; i2++) {
            if (i2 < 24) {
                int i3 = i2 % 6;
                int i4 = i2 / 6;
                if (i4 == m2985a) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.f10727j[(i2 * 4) + 0] = (red / 255.0f) * ((f4 * f) + f3);
                            this.f10727j[(i2 * 4) + 1] = (green / 255.0f) * ((f4 * f) + f3);
                            this.f10727j[(i2 * 4) + 2] = (blue / 255.0f) * ((f4 * f) + f3);
                            this.f10727j[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                        case 1:
                        default:
                            this.f10727j[(i2 * 4) + 0] = (red / 255.0f) * ((f4 * f2) + f3) * 0.7f;
                            this.f10727j[(i2 * 4) + 1] = (green / 255.0f) * ((f4 * f2) + f3) * 0.7f;
                            this.f10727j[(i2 * 4) + 2] = (blue / 255.0f) * ((f4 * f2) + f3) * 0.7f;
                            this.f10727j[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                    }
                } else if (i4 == m2985a2) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.f10727j[(i2 * 4) + 0] = (red / 255.0f) * 1.0f;
                            this.f10727j[(i2 * 4) + 1] = (green / 255.0f) * 1.0f;
                            this.f10727j[(i2 * 4) + 2] = (blue / 255.0f) * 1.0f;
                            this.f10727j[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                        case 1:
                        default:
                            this.f10727j[(i2 * 4) + 0] = (red / 255.0f) * f3 * 0.7f;
                            this.f10727j[(i2 * 4) + 1] = (green / 255.0f) * f3 * 0.7f;
                            this.f10727j[(i2 * 4) + 2] = (blue / 255.0f) * f3 * 0.7f;
                            this.f10727j[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                    }
                } else if (i4 == m2985a3) {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.f10727j[(i2 * 4) + 0] = (red / 255.0f) * f3;
                            this.f10727j[(i2 * 4) + 1] = (green / 255.0f) * f3;
                            this.f10727j[(i2 * 4) + 2] = (blue / 255.0f) * f3;
                            this.f10727j[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                        case 1:
                        default:
                            this.f10727j[(i2 * 4) + 0] = (red / 255.0f) * 1.0f * 0.7f;
                            this.f10727j[(i2 * 4) + 1] = (green / 255.0f) * 1.0f * 0.7f;
                            this.f10727j[(i2 * 4) + 2] = (blue / 255.0f) * 1.0f * 0.7f;
                            this.f10727j[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                    }
                } else {
                    switch (i3) {
                        case 0:
                        case 2:
                        case 3:
                            this.f10727j[(i2 * 4) + 0] = red / 255.0f;
                            this.f10727j[(i2 * 4) + 1] = green / 255.0f;
                            this.f10727j[(i2 * 4) + 2] = blue / 255.0f;
                            this.f10727j[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                        case 1:
                        default:
                            this.f10727j[(i2 * 4) + 0] = (red / 255.0f) * 0.7f;
                            this.f10727j[(i2 * 4) + 1] = (green / 255.0f) * 0.7f;
                            this.f10727j[(i2 * 4) + 2] = (blue / 255.0f) * 0.7f;
                            this.f10727j[(i2 * 4) + 3] = alpha / 255.0f;
                            continue;
                    }
                }
            } else if (i2 >= 24 && i2 < 36) {
                this.f10727j[(i2 * 4) + 0] = (red / 255.0f) * 0.5f;
                this.f10727j[(i2 * 4) + 1] = (green / 255.0f) * 0.5f;
                this.f10727j[(i2 * 4) + 2] = (blue / 255.0f) * 0.5f;
                this.f10727j[(i2 * 4) + 3] = alpha / 255.0f;
            } else {
                int i5 = i2 % 6;
                int i6 = (i2 - 36) / 12;
                f3 = 0.5f;
                f4 = 1.0f - 0.5f;
                if (i6 == m2985a) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.f10727j[(i2 * 4) + 0] = ((f4 * f) + 0.5f) * 1.0f;
                            this.f10727j[(i2 * 4) + 1] = ((f4 * f) + 0.5f) * 1.0f;
                            this.f10727j[(i2 * 4) + 2] = 1.0f * ((f4 * f) + 0.5f);
                            this.f10727j[(i2 * 4) + 3] = 1.0f;
                            continue;
                        case 1:
                        default:
                            this.f10727j[(i2 * 4) + 0] = ((f4 * f2) + 0.5f) * 1.0f;
                            this.f10727j[(i2 * 4) + 1] = ((f4 * f2) + 0.5f) * 1.0f;
                            this.f10727j[(i2 * 4) + 2] = 1.0f * ((f4 * f2) + 0.5f);
                            this.f10727j[(i2 * 4) + 3] = 1.0f;
                            continue;
                    }
                } else if (i6 == m2985a2) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.f10727j[(i2 * 4) + 0] = 1.0f * 1.0f;
                            this.f10727j[(i2 * 4) + 1] = 1.0f * 1.0f;
                            this.f10727j[(i2 * 4) + 2] = 1.0f * 1.0f;
                            this.f10727j[(i2 * 4) + 3] = 1.0f;
                            continue;
                        case 1:
                        default:
                            this.f10727j[(i2 * 4) + 0] = 1.0f * 0.5f;
                            this.f10727j[(i2 * 4) + 1] = 1.0f * 0.5f;
                            this.f10727j[(i2 * 4) + 2] = 1.0f * 0.5f;
                            this.f10727j[(i2 * 4) + 3] = 1.0f;
                            continue;
                    }
                } else if (i6 == m2985a3) {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.f10727j[(i2 * 4) + 0] = 1.0f * 0.5f;
                            this.f10727j[(i2 * 4) + 1] = 1.0f * 0.5f;
                            this.f10727j[(i2 * 4) + 2] = 1.0f * 0.5f;
                            this.f10727j[(i2 * 4) + 3] = 1.0f;
                            continue;
                        case 1:
                        default:
                            this.f10727j[(i2 * 4) + 0] = 1.0f * 1.0f;
                            this.f10727j[(i2 * 4) + 1] = 1.0f * 1.0f;
                            this.f10727j[(i2 * 4) + 2] = 1.0f * 1.0f;
                            this.f10727j[(i2 * 4) + 3] = 1.0f;
                            continue;
                    }
                } else {
                    switch (i5) {
                        case 0:
                        case 2:
                        case 3:
                            this.f10727j[(i2 * 4) + 0] = 1.0f;
                            this.f10727j[(i2 * 4) + 1] = 1.0f;
                            this.f10727j[(i2 * 4) + 2] = 1.0f;
                            this.f10727j[(i2 * 4) + 3] = 1.0f;
                            continue;
                        case 1:
                        default:
                            this.f10727j[(i2 * 4) + 0] = 1.0f * 0.7f;
                            this.f10727j[(i2 * 4) + 1] = 1.0f * 0.7f;
                            this.f10727j[(i2 * 4) + 2] = 1.0f * 0.7f;
                            this.f10727j[(i2 * 4) + 3] = 1.0f;
                            continue;
                    }
                }
            }
        }
        this.f10721a.position(0);
        this.f10721a.put(this.f10727j);
        this.f10721a.position(0);
    }

    /* renamed from: a */
    public int m2985a(int i, int i2) {
        int i3 = i % i2;
        return i3 < 0 ? i3 + i2 : i3;
    }

    /* renamed from: a */
    public void m2984a(int i, float[] fArr) {
        this.f10723c.position((i * 24) + 72);
        this.f10723c.put(fArr);
        this.f10723c.position(0);
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
        m2983b();
        boolean colorFillEnable = colorFillEnable();
        if (visible() && C3260c.f10745h.f10761a != null) {
            if (colorFillEnable) {
                ShaderManager.SHADER_COLOR_TEXTURE.glMVPMatrix();
                ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.f10723c);
                ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.f10722b);
                ShaderManager.SHADER_COLOR_TEXTURE.glColor4f(this);
            } else {
                ShaderManager.SHADER_COLOR_TEXTURE.glMVPMatrix();
                ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.f10723c);
                ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.f10722b);
                ShaderManager.SHADER_COLOR_TEXTURE.glColorPointer(4, 5126, false, 0, this.f10721a);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, C3260c.f10745h.f10761a.f2529id);
            GLES20.glDrawArrays(4, 0, 36);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f10724g);
            GLES20.glDrawArrays(4, 36, this.f10728k - 36);
            if (colorFillEnable) {
            }
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            GLES20.glBindTexture(3553, 0);
        }
    }
}
