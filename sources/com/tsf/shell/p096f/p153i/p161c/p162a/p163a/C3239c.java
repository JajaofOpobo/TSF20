package com.tsf.shell.p096f.p153i.p161c.p162a.p163a;

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
/* renamed from: com.tsf.shell.f.i.c.a.a.c */
/* loaded from: classes.dex */
public class C3239c extends VObject3dContainer {

    /* renamed from: a */
    private static final float[] f10591a = {0.0f, 0.0f, 0.0f, 0.5f};

    /* renamed from: b */
    private static final float[] f10592b = {0.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: A */
    private int f10593A;

    /* renamed from: B */
    private int f10594B;

    /* renamed from: C */
    private PointF f10595C;

    /* renamed from: D */
    private PointF f10596D;

    /* renamed from: E */
    private double f10597E;

    /* renamed from: d */
    private C3241a<C3242b> f10599d;

    /* renamed from: e */
    private C3241a<C3243c> f10600e;

    /* renamed from: f */
    private C3241a<C3243c> f10601f;

    /* renamed from: g */
    private C3241a<C3243c> f10602g;

    /* renamed from: h */
    private C3241a<Double> f10603h;

    /* renamed from: i */
    private C3241a<C3242b> f10604i;

    /* renamed from: j */
    private C3241a<C3242b> f10605j;

    /* renamed from: k */
    private C3241a<C3243c> f10606k;

    /* renamed from: l */
    private FloatBuffer f10607l;

    /* renamed from: m */
    private FloatBuffer f10608m;

    /* renamed from: n */
    private FloatBuffer f10609n;

    /* renamed from: o */
    private FloatBuffer f10610o;

    /* renamed from: p */
    private FloatBuffer f10611p;

    /* renamed from: q */
    private int f10612q;

    /* renamed from: s */
    private int f10614s;

    /* renamed from: u */
    private int f10616u;

    /* renamed from: c */
    private int f10598c = 0;

    /* renamed from: r */
    private boolean f10613r = false;

    /* renamed from: t */
    private final C3243c[] f10615t = new C3243c[4];

    /* renamed from: v */
    private boolean f10617v = false;

    /* renamed from: w */
    private boolean f10618w = true;

    /* renamed from: x */
    private final C3249e f10619x = new C3249e();

    /* renamed from: y */
    private final RectF f10620y = new RectF();

    /* renamed from: z */
    private final RectF f10621z = new RectF();

    public C3239c(int i) {
        this.f10620y.set(0.0f, 0.0f, 1.0f, 1.0f);
        this.f10621z.set(0.0f, 0.0f, 1.0f, 1.0f);
        this.f10614s = i < 1 ? 1 : i;
        this.f10603h = new C3241a<>(i + 2);
        this.f10601f = new C3241a<>(7);
        this.f10602g = new C3241a<>(4);
        this.f10600e = new C3241a<>(2);
        this.f10606k = new C3241a<>(11);
        for (int i2 = 0; i2 < 11; i2++) {
            this.f10606k.m3028a((C3241a<C3243c>) new C3243c());
        }
        this.f10604i = new C3241a<>((this.f10614s + 2) * 2);
        this.f10599d = new C3241a<>((this.f10614s + 2) * 2);
        this.f10605j = new C3241a<>((this.f10614s + 2) * 2);
        for (int i3 = 0; i3 < (this.f10614s + 2) * 2; i3++) {
            this.f10605j.m3028a((C3241a<C3242b>) new C3242b());
        }
        for (int i4 = 0; i4 < 4; i4++) {
            this.f10615t[i4] = new C3243c();
        }
        C3243c c3243c = this.f10615t[0];
        C3243c c3243c2 = this.f10615t[1];
        C3243c c3243c3 = this.f10615t[1];
        this.f10615t[3].f10636d = -1.0d;
        c3243c3.f10636d = -1.0d;
        c3243c2.f10635c = -1.0d;
        c3243c.f10635c = -1.0d;
        C3243c c3243c4 = this.f10615t[0];
        C3243c c3243c5 = this.f10615t[2];
        C3243c c3243c6 = this.f10615t[2];
        this.f10615t[3].f10635c = 1.0d;
        c3243c6.f10636d = 1.0d;
        c3243c5.f10635c = 1.0d;
        c3243c4.f10636d = 1.0d;
        int i5 = (this.f10614s * 2) + 6;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i5 * 3 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f10611p = allocateDirect.asFloatBuffer();
        this.f10611p.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i5 * 2 * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.f10610o = allocateDirect2.asFloatBuffer();
        this.f10610o.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(i5 * 4 * 4);
        allocateDirect3.order(ByteOrder.nativeOrder());
        this.f10607l = allocateDirect3.asFloatBuffer();
        this.f10607l.position(0);
        int i6 = (this.f10614s + 2) * 2 * 2;
        ByteBuffer allocateDirect4 = ByteBuffer.allocateDirect(i6 * 4 * 4);
        allocateDirect4.order(ByteOrder.nativeOrder());
        this.f10608m = allocateDirect4.asFloatBuffer();
        this.f10608m.position(0);
        ByteBuffer allocateDirect5 = ByteBuffer.allocateDirect(i6 * 3 * 4);
        allocateDirect5.order(ByteOrder.nativeOrder());
        this.f10609n = allocateDirect5.asFloatBuffer();
        this.f10609n.position(0);
        this.f10616u = 0;
        this.f10612q = 0;
    }

    /* renamed from: a */
    private void m3038a(C3243c c3243c) {
        float alpha = alpha() / 255.0f;
        this.f10611p.put((float) c3243c.f10637e);
        this.f10611p.put((float) c3243c.f10638f);
        this.f10611p.put((float) c3243c.f10639g);
        this.f10607l.put(((c3243c.f10634b * Color.red(c3243c.f10633a)) / 255.0f) * alpha);
        this.f10607l.put(((c3243c.f10634b * Color.green(c3243c.f10633a)) / 255.0f) * alpha);
        this.f10607l.put(((c3243c.f10634b * Color.blue(c3243c.f10633a)) / 255.0f) * alpha);
        this.f10607l.put(alpha * (Color.alpha(c3243c.f10633a) / 255.0f));
        this.f10610o.put((float) c3243c.f10640h);
        this.f10610o.put((float) c3243c.f10641i);
    }

    /* renamed from: a */
    public synchronized void m3043a() {
        if (this.f10595C != null) {
            m3041a(this.f10595C, this.f10596D, this.f10597E);
        }
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void alpha(int i) {
        if (i < 0) {
            i = 0;
        }
        super.alpha(i);
        m3043a();
    }

    /* renamed from: a */
    public synchronized void m3041a(PointF pointF, PointF pointF2, double d) {
        boolean z;
        this.f10618w = false;
        visible(true);
        float alpha = alpha() / 255.0f;
        this.f10611p.position(0);
        this.f10607l.position(0);
        this.f10610o.position(0);
        double acos = Math.acos(pointF2.x);
        double d2 = pointF2.y > 0.0f ? -acos : acos;
        this.f10606k.m3029a(this.f10602g);
        this.f10602g.m3032a();
        for (int i = 0; i < 4; i++) {
            C3243c m3026b = this.f10606k.m3026b(0);
            m3026b.m3023a(this.f10615t[i]);
            m3026b.m3024a(-pointF.x, -pointF.y);
            m3026b.m3025a(-d2);
            for (int i2 = 0; i2 < this.f10602g.m3027b(); i2++) {
                C3243c m3031a = this.f10602g.m3031a(i2);
                if (m3026b.f10637e <= m3031a.f10637e && (m3026b.f10637e != m3031a.f10637e || m3026b.f10638f <= m3031a.f10638f)) {
                }
                this.f10602g.m3030a(i2, m3026b);
            }
            this.f10602g.m3030a(i2, m3026b);
        }
        int[][] iArr = {new int[]{0, 1}, new int[]{0, 2}, new int[]{1, 3}, new int[]{2, 3}};
        C3243c m3031a2 = this.f10602g.m3031a(0);
        C3243c m3031a3 = this.f10602g.m3031a(2);
        C3243c m3031a4 = this.f10602g.m3031a(3);
        if (Math.sqrt(((m3031a2.f10637e - m3031a3.f10637e) * (m3031a2.f10637e - m3031a3.f10637e)) + ((m3031a2.f10638f - m3031a3.f10638f) * (m3031a2.f10638f - m3031a3.f10638f))) > Math.sqrt(((m3031a2.f10638f - m3031a4.f10638f) * (m3031a2.f10638f - m3031a4.f10638f)) + ((m3031a2.f10637e - m3031a4.f10637e) * (m3031a2.f10637e - m3031a4.f10637e)))) {
            iArr[1][1] = 3;
            iArr[2][1] = 2;
        }
        this.f10593A = 0;
        this.f10594B = 0;
        this.f10605j.m3029a(this.f10599d);
        this.f10605j.m3029a(this.f10604i);
        this.f10599d.m3032a();
        this.f10604i.m3032a();
        double d3 = 3.141592653589793d * d;
        this.f10603h.m3032a();
        if (this.f10614s > 0) {
            this.f10603h.m3028a((C3241a<Double>) Double.valueOf(0.0d));
        }
        for (int i3 = 1; i3 < this.f10614s; i3++) {
            this.f10603h.m3028a((C3241a<Double>) Double.valueOf(((-d3) * i3) / (this.f10614s - 1)));
        }
        this.f10603h.m3028a((C3241a<Double>) Double.valueOf(this.f10602g.m3031a(3).f10637e - 1.0d));
        int i4 = 0;
        double d4 = 1.0d + this.f10602g.m3031a(0).f10637e;
        while (i4 < this.f10603h.m3027b()) {
            double doubleValue = this.f10603h.m3031a(i4).doubleValue();
            for (int i5 = 0; i5 < this.f10602g.m3027b(); i5++) {
                C3243c m3031a5 = this.f10602g.m3031a(i5);
                if (m3031a5.f10637e >= doubleValue && m3031a5.f10637e <= d4) {
                    C3243c m3026b2 = this.f10606k.m3026b(0);
                    m3026b2.m3023a(m3031a5);
                    C3241a<C3243c> m3039a = m3039a(this.f10602g, iArr, m3026b2.f10637e);
                    if (m3039a.m3027b() == 1 && m3039a.m3031a(0).f10638f > m3031a5.f10638f) {
                        this.f10601f.m3029a(m3039a);
                        this.f10601f.m3028a((C3241a<C3243c>) m3026b2);
                    } else if (m3039a.m3027b() <= 1) {
                        this.f10601f.m3028a((C3241a<C3243c>) m3026b2);
                        this.f10601f.m3029a(m3039a);
                    } else {
                        this.f10606k.m3028a((C3241a<C3243c>) m3026b2);
                        this.f10606k.m3029a(m3039a);
                    }
                }
            }
            C3241a<C3243c> m3039a2 = m3039a(this.f10602g, iArr, doubleValue);
            if (m3039a2.m3027b() == 2) {
                C3243c m3031a6 = m3039a2.m3031a(0);
                C3243c m3031a7 = m3039a2.m3031a(1);
                if (m3031a6.f10638f < m3031a7.f10638f) {
                    this.f10601f.m3028a((C3241a<C3243c>) m3031a7);
                    this.f10601f.m3028a((C3241a<C3243c>) m3031a6);
                } else {
                    this.f10601f.m3029a(m3039a2);
                }
            } else if (m3039a2.m3027b() != 0) {
                this.f10606k.m3029a(m3039a2);
            }
            while (this.f10601f.m3027b() > 0) {
                C3243c m3026b3 = this.f10601f.m3026b(0);
                this.f10606k.m3028a((C3241a<C3243c>) m3026b3);
                if (i4 == 0) {
                    z = true;
                    this.f10594B++;
                } else if (i4 == this.f10603h.m3027b() - 1 || d3 == 0.0d) {
                    m3026b3.f10637e = -(m3026b3.f10637e + d3);
                    m3026b3.f10639g = 2.0d * d;
                    m3026b3.f10635c = -m3026b3.f10635c;
                    z = false;
                    this.f10593A++;
                } else {
                    double d5 = 3.141592653589793d * (m3026b3.f10637e / d3);
                    m3026b3.f10637e = Math.sin(d5) * d;
                    m3026b3.f10639g = d - (Math.cos(d5) * d);
                    m3026b3.f10635c *= Math.cos(d5);
                    m3026b3.f10634b = (float) ((Math.sqrt(Math.sin(d5) + 1.0d) * 0.800000011920929d) + 0.20000000298023224d);
                    if (m3026b3.f10639g >= 10.0d + d) {
                        z = false;
                        this.f10593A++;
                    } else {
                        z = true;
                        this.f10594B++;
                    }
                }
                if (z != this.f10613r) {
                    m3026b3.f10640h *= this.f10621z.right;
                    m3026b3.f10641i *= this.f10621z.bottom;
                    m3026b3.f10633a = this.f10619x.m3005a(1);
                } else {
                    m3026b3.f10640h *= this.f10620y.right;
                    m3026b3.f10641i *= this.f10620y.bottom;
                    m3026b3.f10633a = this.f10619x.m3005a(2);
                }
                m3026b3.m3025a(d2);
                m3026b3.m3024a(pointF.x, pointF.y);
                m3038a(m3026b3);
                if (m3026b3.f10639g > 0.0d && m3026b3.f10639g <= d) {
                    C3242b m3026b4 = this.f10605j.m3026b(0);
                    m3026b4.f10629d = m3026b3.f10637e;
                    m3026b4.f10630e = m3026b3.f10638f;
                    m3026b4.f10631f = m3026b3.f10639g;
                    m3026b4.f10627b = (m3026b3.f10639g / 1.0d) * (-pointF2.x);
                    m3026b4.f10628c = (m3026b3.f10639g / 1.0d) * (-pointF2.y);
                    m3026b4.f10626a = m3026b3.f10639g / d;
                    this.f10599d.m3030a((this.f10599d.m3027b() + 1) / 2, m3026b4);
                }
                if (m3026b3.f10639g > d) {
                    C3242b m3026b5 = this.f10605j.m3026b(0);
                    m3026b5.f10629d = m3026b3.f10637e;
                    m3026b5.f10630e = m3026b3.f10638f;
                    m3026b5.f10631f = m3026b3.f10639g;
                    m3026b5.f10627b = ((m3026b3.f10639g - d) / 3.0d) * m3026b3.f10635c;
                    m3026b5.f10628c = ((m3026b3.f10639g - d) / 3.0d) * m3026b3.f10636d;
                    m3026b5.f10626a = (m3026b3.f10639g - d) / (2.0d * d);
                    this.f10604i.m3030a((this.f10604i.m3027b() + 1) / 2, m3026b5);
                }
            }
            i4++;
            d4 = doubleValue;
        }
        this.f10611p.position(0);
        this.f10607l.position(0);
        this.f10610o.position(0);
        this.f10608m.position(0);
        this.f10609n.position(0);
        this.f10612q = 0;
        for (int i6 = 0; i6 < this.f10599d.m3027b(); i6++) {
            C3242b m3031a8 = this.f10599d.m3031a(i6);
            this.f10609n.put((float) m3031a8.f10629d);
            this.f10609n.put((float) m3031a8.f10630e);
            this.f10609n.put((float) m3031a8.f10631f);
            this.f10609n.put((float) (m3031a8.f10629d + m3031a8.f10627b));
            this.f10609n.put((float) (m3031a8.f10630e + m3031a8.f10628c));
            this.f10609n.put((float) m3031a8.f10631f);
            for (int i7 = 0; i7 < 4; i7++) {
                this.f10608m.put(((float) (f10592b[i7] + ((f10591a[i7] - f10592b[i7]) * m3031a8.f10626a))) * alpha);
            }
            this.f10608m.put(f10592b);
            this.f10612q += 2;
        }
        this.f10616u = 0;
        for (int i8 = 0; i8 < this.f10604i.m3027b(); i8++) {
            C3242b m3031a9 = this.f10604i.m3031a(i8);
            this.f10609n.put((float) m3031a9.f10629d);
            this.f10609n.put((float) m3031a9.f10630e);
            this.f10609n.put((float) m3031a9.f10631f);
            this.f10609n.put((float) (m3031a9.f10629d + m3031a9.f10627b));
            this.f10609n.put((float) (m3031a9.f10630e + m3031a9.f10628c));
            this.f10609n.put((float) m3031a9.f10631f);
            for (int i9 = 0; i9 < 4; i9++) {
                this.f10608m.put((float) (f10592b[i9] + ((f10591a[i9] - f10592b[i9]) * m3031a9.f10626a)));
            }
            this.f10608m.put(f10592b);
            this.f10616u += 2;
        }
        this.f10608m.position(0);
        this.f10609n.position(0);
    }

    /* renamed from: a */
    private C3241a<C3243c> m3039a(C3241a<C3243c> c3241a, int[][] iArr, double d) {
        this.f10600e.m3032a();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < iArr.length) {
                C3243c m3031a = c3241a.m3031a(iArr[i2][0]);
                C3243c m3031a2 = c3241a.m3031a(iArr[i2][1]);
                if (m3031a.f10637e > d && m3031a2.f10637e < d) {
                    double d2 = (d - m3031a2.f10637e) / (m3031a.f10637e - m3031a2.f10637e);
                    C3243c m3026b = this.f10606k.m3026b(0);
                    m3026b.m3023a(m3031a2);
                    m3026b.f10637e = d;
                    m3026b.f10638f += (m3031a.f10638f - m3031a2.f10638f) * d2;
                    m3026b.f10640h += (m3031a.f10640h - m3031a2.f10640h) * d2;
                    m3026b.f10641i += (m3031a.f10641i - m3031a2.f10641i) * d2;
                    m3026b.f10635c += (m3031a.f10635c - m3031a2.f10635c) * d2;
                    m3026b.f10636d = ((m3031a.f10636d - m3031a2.f10636d) * d2) + m3026b.f10636d;
                    this.f10600e.m3028a((C3241a<C3243c>) m3026b);
                }
                i = i2 + 1;
            } else {
                return this.f10600e;
            }
        }
    }

    /* renamed from: b */
    public synchronized C3249e m3036b() {
        return this.f10619x;
    }

    /* renamed from: c */
    public void m3035c() {
        if (visible() && this.f10619x.m3002b(1) != null) {
            ShaderManager.enableShader(ShaderManager.SHADER_COLOR_TEXTURE);
            MatrixStack.glPushMatrix();
            drawMVPMatrix();
            GLES20.glActiveTexture(33984);
            ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.f10610o);
            ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.f10611p);
            ShaderManager.SHADER_COLOR_TEXTURE.glColorPointer(4, 5126, false, 0, this.f10607l);
            GLES20.glEnable(3553);
            if (this.f10613r || !this.f10617v) {
                GLES20.glBindTexture(3553, this.f10619x.m3002b(1).f2529id);
            } else {
                GLES20.glBindTexture(3553, this.f10619x.m3002b(2).f2529id);
            }
            GLES20.glDrawArrays(5, 0, this.f10594B);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maTextureHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maPositionHandle);
            ShaderManager.enableShader(ShaderManager.SHADER_COLOR);
            GLES20.glUniformMatrix4fv(ShaderManager.SHADER_COLOR.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
            ShaderManager.SHADER_COLOR.glColorPointer(4, 5126, false, 0, this.f10608m);
            ShaderManager.SHADER_COLOR.glVertexPointer(3, 5126, false, 0, this.f10609n);
            GLES20.glDrawArrays(5, 0, this.f10612q);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR.maPositionHandle);
            MatrixStack.glPopMatrix();
        }
    }

    /* renamed from: d */
    public synchronized void m3034d() {
        if (!this.f10618w && this.f10593A != 0 && visible() && this.f10619x.m3002b(2) != null) {
            ShaderManager.enableShader(ShaderManager.SHADER_COLOR_TEXTURE);
            MatrixStack.glPushMatrix();
            drawMVPMatrix();
            GLES20.glActiveTexture(33984);
            ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.f10610o);
            ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.f10611p);
            ShaderManager.SHADER_COLOR_TEXTURE.glColorPointer(4, 5126, false, 0, this.f10607l);
            int max = Math.max(0, this.f10594B - 12);
            int i = (this.f10594B + this.f10593A) - max;
            GLES20.glEnable(3553);
            if (this.f10613r || !this.f10617v) {
                GLES20.glBindTexture(3553, this.f10619x.m3002b(1).f2529id);
            } else {
                GLES20.glBindTexture(3553, this.f10619x.m3002b(2).f2529id);
            }
            GLES20.glDrawArrays(5, max, i);
            ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.f10610o);
            ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.f10611p);
            ShaderManager.SHADER_COLOR_TEXTURE.glColorPointer(4, 5126, false, 0, this.f10607l);
            ShaderManager.enableShader(ShaderManager.SHADER_COLOR);
            GLES20.glUniformMatrix4fv(ShaderManager.SHADER_COLOR.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
            ShaderManager.SHADER_COLOR.glColorPointer(4, 5126, false, 0, this.f10608m);
            ShaderManager.SHADER_COLOR.glVertexPointer(3, 5126, false, 0, this.f10609n);
            GLES20.glDrawArrays(5, this.f10612q, this.f10616u);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maTextureHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maPositionHandle);
            MatrixStack.glPopMatrix();
        }
    }

    /* renamed from: e */
    public synchronized void m3033e() {
        this.f10618w = true;
        visible(false);
        VTween.killTween(this);
        position().setAll(0.0f, 47.0f * C3244d.f10643j, 0.0f);
        alpha(255);
        this.f10611p.position(0);
        this.f10607l.position(0);
        this.f10610o.position(0);
        for (int i = 0; i < 4; i++) {
            C3243c m3031a = this.f10606k.m3031a(0);
            m3031a.m3023a(this.f10615t[i]);
            if (this.f10613r) {
                m3031a.f10640h *= this.f10620y.right;
                m3031a.f10641i *= this.f10620y.bottom;
                m3031a.f10633a = this.f10619x.m3005a(2);
            } else {
                m3031a.f10640h *= this.f10621z.right;
                m3031a.f10641i *= this.f10621z.bottom;
                m3031a.f10633a = this.f10619x.m3005a(1);
            }
            m3038a(m3031a);
        }
        this.f10594B = 4;
        this.f10593A = 0;
        this.f10611p.position(0);
        this.f10607l.position(0);
        this.f10610o.position(0);
        this.f10616u = 0;
        this.f10612q = 0;
    }

    /* renamed from: a */
    public synchronized void m3037a(boolean z) {
        this.f10613r = z;
        if (z) {
            m3042a(1.0f, 0.0f, 0.0f, 1.0f);
        } else {
            m3042a(0.0f, 0.0f, 1.0f, 1.0f);
        }
    }

    /* renamed from: a */
    public void m3040a(RectF rectF) {
        this.f10615t[0].f10637e = rectF.left;
        this.f10615t[0].f10638f = rectF.top;
        this.f10615t[1].f10637e = rectF.left;
        this.f10615t[1].f10638f = rectF.bottom;
        this.f10615t[2].f10637e = rectF.right;
        this.f10615t[2].f10638f = rectF.top;
        this.f10615t[3].f10637e = rectF.right;
        this.f10615t[3].f10638f = rectF.bottom;
    }

    /* renamed from: a */
    private synchronized void m3042a(float f, float f2, float f3, float f4) {
        this.f10615t[0].f10640h = f;
        this.f10615t[0].f10641i = f2;
        this.f10615t[1].f10640h = f;
        this.f10615t[1].f10641i = f4;
        this.f10615t[2].f10640h = f3;
        this.f10615t[2].f10641i = f2;
        this.f10615t[3].f10640h = f3;
        this.f10615t[3].f10641i = f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.f.i.c.a.a.c$a */
    /* loaded from: classes.dex */
    public class C3241a<T> {

        /* renamed from: b */
        private Object[] f10623b;

        /* renamed from: c */
        private int f10624c;

        /* renamed from: d */
        private int f10625d;

        public C3241a(int i) {
            this.f10624c = i;
            this.f10623b = new Object[i];
        }

        /* renamed from: a */
        public void m3030a(int i, T t) {
            if (i < 0 || i > this.f10625d || this.f10625d >= this.f10624c) {
                throw new IndexOutOfBoundsException();
            }
            for (int i2 = this.f10625d; i2 > i; i2--) {
                this.f10623b[i2] = this.f10623b[i2 - 1];
            }
            this.f10623b[i] = t;
            this.f10625d++;
        }

        /* renamed from: a */
        public void m3028a(T t) {
            if (this.f10625d >= this.f10624c) {
                throw new IndexOutOfBoundsException();
            }
            Object[] objArr = this.f10623b;
            int i = this.f10625d;
            this.f10625d = i + 1;
            objArr[i] = t;
        }

        /* renamed from: a */
        public void m3029a(C3241a<T> c3241a) {
            if (this.f10625d + c3241a.m3027b() > this.f10624c) {
                throw new IndexOutOfBoundsException();
            }
            for (int i = 0; i < c3241a.m3027b(); i++) {
                Object[] objArr = this.f10623b;
                int i2 = this.f10625d;
                this.f10625d = i2 + 1;
                objArr[i2] = c3241a.m3031a(i);
            }
        }

        /* renamed from: a */
        public void m3032a() {
            this.f10625d = 0;
        }

        /* renamed from: a */
        public T m3031a(int i) {
            if (i < 0 || i >= this.f10625d) {
                throw new IndexOutOfBoundsException();
            }
            return (T) this.f10623b[i];
        }

        /* renamed from: b */
        public T m3026b(int i) {
            if (i < 0 || i >= this.f10625d) {
                throw new IndexOutOfBoundsException();
            }
            T t = (T) this.f10623b[i];
            while (i < this.f10625d - 1) {
                this.f10623b[i] = this.f10623b[i + 1];
                i++;
            }
            this.f10625d--;
            return t;
        }

        /* renamed from: b */
        public int m3027b() {
            return this.f10625d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.f.i.c.a.a.c$b */
    /* loaded from: classes.dex */
    public class C3242b {

        /* renamed from: a */
        public double f10626a;

        /* renamed from: b */
        public double f10627b;

        /* renamed from: c */
        public double f10628c;

        /* renamed from: d */
        public double f10629d;

        /* renamed from: e */
        public double f10630e;

        /* renamed from: f */
        public double f10631f;

        private C3242b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.f.i.c.a.a.c$c */
    /* loaded from: classes.dex */
    public class C3243c {

        /* renamed from: a */
        public int f10633a;

        /* renamed from: c */
        public double f10635c;

        /* renamed from: d */
        public double f10636d;

        /* renamed from: i */
        public double f10641i = 0.0d;

        /* renamed from: h */
        public double f10640h = 0.0d;

        /* renamed from: g */
        public double f10639g = 0.0d;

        /* renamed from: f */
        public double f10638f = 0.0d;

        /* renamed from: e */
        public double f10637e = 0.0d;

        /* renamed from: b */
        public float f10634b = 1.0f;

        public C3243c() {
        }

        /* renamed from: a */
        public void m3025a(double d) {
            double cos = Math.cos(d);
            double sin = Math.sin(d);
            this.f10637e = (this.f10637e * cos) + (this.f10638f * sin);
            this.f10638f = (this.f10637e * (-sin)) + (this.f10638f * cos);
            double d2 = (this.f10635c * cos) + (this.f10636d * sin);
            double d3 = (-sin) * this.f10635c;
            this.f10635c = d2;
            this.f10636d = (cos * this.f10636d) + d3;
        }

        /* renamed from: a */
        public void m3023a(C3243c c3243c) {
            this.f10637e = c3243c.f10637e;
            this.f10638f = c3243c.f10638f;
            this.f10639g = c3243c.f10639g;
            this.f10640h = c3243c.f10640h;
            this.f10641i = c3243c.f10641i;
            this.f10635c = c3243c.f10635c;
            this.f10636d = c3243c.f10636d;
            this.f10633a = c3243c.f10633a;
            this.f10634b = c3243c.f10634b;
        }

        /* renamed from: a */
        public void m3024a(double d, double d2) {
            this.f10637e += d;
            this.f10638f += d2;
        }
    }
}
