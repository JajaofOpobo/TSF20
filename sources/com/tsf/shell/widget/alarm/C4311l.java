package com.tsf.shell.widget.alarm;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VTween;
import com.censivn.C3DEngine.api.tween.VTweenParam;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.tsf.shell.widget.alarm.p202a.C4257a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* renamed from: com.tsf.shell.widget.alarm.l */
/* loaded from: classes.dex */
public class C4311l extends VObject3dContainer {

    /* renamed from: d */
    public static final int f13994d = Color.argb(255, 255, 255, 255);

    /* renamed from: a */
    protected FloatBuffer f13995a;

    /* renamed from: b */
    protected FloatBuffer f13996b;

    /* renamed from: c */
    protected FloatBuffer f13997c;

    /* renamed from: j */
    private int f14003j;

    /* renamed from: m */
    private double f14006m;

    /* renamed from: n */
    private double f14007n;

    /* renamed from: o */
    private TextureElement f14008o;

    /* renamed from: e */
    protected C4257a[] f13998e = new C4257a[24];

    /* renamed from: g */
    private float f14000g = 0.0f;

    /* renamed from: h */
    private float f14001h = 0.0f;

    /* renamed from: i */
    private float f14002i = 1.0f;

    /* renamed from: k */
    private float f14004k = 192.0f;

    /* renamed from: l */
    private float f14005l = 192.0f;

    /* renamed from: f */
    boolean f13999f = false;

    public C4311l() {
        m237d();
        m241b();
        m238c();
        invalidate();
    }

    /* renamed from: d */
    private void m237d() {
        AlarmWidget.f13710d.addObject(this);
        Bitmap m226b = C4324p.m226b(AlarmWidget.f13714h, "progress_bar");
        this.f14008o = AlarmWidget.f13709c.createTexture(m226b, true);
        m226b.recycle();
        m245a(this.f14008o.f2529id);
        for (int i = 0; i < this.f13998e.length; i++) {
            C4257a[] c4257aArr = this.f13998e;
            C4257a c4257a = new C4257a();
            c4257aArr[i] = c4257a;
            c4257a.f13787a = f13994d;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f13998e.length * 3 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f13995a = allocateDirect.asFloatBuffer();
        this.f13995a.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.f13998e.length * 2 * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.f13996b = allocateDirect2.asFloatBuffer();
        this.f13996b.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(this.f13998e.length * 4 * 4);
        allocateDirect3.order(ByteOrder.nativeOrder());
        this.f13997c = allocateDirect3.asFloatBuffer();
        this.f13997c.position(0);
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void dispatchDraw() {
        if (colorFillEnable()) {
            setCustomShader(ShaderManager.SHADER_COLOR_TEXTURE);
        } else {
            setCustomShader(ShaderManager.SHADER_STANDARD);
        }
        super.dispatchDraw();
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void drawElement() {
        m236e();
        m241b();
        m238c();
        boolean colorFillEnable = colorFillEnable();
        if (visible()) {
            MatrixStack.glPushMatrix();
            MatrixStack.glTranslatef(position().f2526x, position().f2527y, position().f2528z);
            MatrixStack.glRotatef(rotation().f2526x, 1.0f, 0.0f, 0.0f);
            MatrixStack.glRotatef(rotation().f2527y, 0.0f, 1.0f, 0.0f);
            MatrixStack.glRotatef(rotation().f2528z, 0.0f, 0.0f, 1.0f);
            MatrixStack.glScalef(AlarmWidget.f13713g, AlarmWidget.f13713g, AlarmWidget.f13713g);
            MatrixStack.glScalef(scale().f2526x, scale().f2527y, scale().f2528z);
            if (colorFillEnable) {
                ShaderManager.SHADER_COLOR_TEXTURE.glMVPMatrix();
                ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.f13996b);
                ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.f13995a);
                ShaderManager.SHADER_COLOR_TEXTURE.glColor4f(this);
            } else {
                ShaderManager.SHADER_STANDARD.glMVPMatrix();
                ShaderManager.SHADER_STANDARD.glTexCoordPointer(2, 5126, false, 0, this.f13996b);
                ShaderManager.SHADER_STANDARD.glVertexPointer(3, 5126, false, 0, this.f13995a);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f14003j);
            GLES20.glDrawArrays(4, 0, this.f13998e.length);
            if (colorFillEnable) {
                GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maColor4Handle);
            }
            MatrixStack.glPopMatrix();
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            GLES20.glBindTexture(3553, 0);
        }
    }

    /* renamed from: e */
    private void m236e() {
        if (!AlarmWidget.f13718o && !this.f13999f) {
            this.f14001h = (((float) (System.currentTimeMillis() % 60000)) / 60000.0f) * 284.0f;
            float f = this.f14001h - this.f14000g;
            if (Math.abs(f) > 1.0f) {
                this.f14002i = 0.08f;
            } else {
                this.f14002i = 0.99f;
            }
            this.f14000g += this.f14002i * f;
            if (Math.abs(f) > 2.0f) {
                invalidate();
            }
        }
    }

    /* renamed from: a */
    public void m248a() {
        this.f13999f = true;
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.widget.alarm.l.1

            /* renamed from: a */
            float f14009a;

            {
                this.f14009a = C4311l.this.f14000g;
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                C4311l.this.f14000g = this.f14009a * (1.0f - f);
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                Bitmap m226b = C4324p.m226b(AlarmWidget.f13714h, "progress_bar");
                C4324p.m232a(C4311l.this.f14008o.f2529id, m226b, 0, 0);
                m226b.recycle();
                VTween.m10747to(C4311l.this, 1500, new VTweenParam() { // from class: com.tsf.shell.widget.alarm.l.1.1
                    @Override // com.censivn.C3DEngine.api.tween.VTweenParam
                    public void onComplete() {
                        C4311l.this.f13999f = false;
                    }
                });
            }
        };
        VTween.killTween(this);
        VTween.m10747to(this, 300, vTweenParam);
    }

    /* renamed from: b */
    public void m241b() {
        double d = 38.0d;
        this.f14006m = this.f14000g / 89.2d;
        this.f14007n = this.f14000g % 89.2d;
        for (int i = 0; i < 1; i++) {
            double m247a = m247a((((int) this.f14006m) * 89.2d) + 38.0d);
            double m247a2 = m247a(90.0d - this.f14007n);
            double m247a3 = m247a(this.f14007n / 2.0d);
            Math.sin(m247a3);
            Math.cos(m247a3);
            double tan = Math.tan(m247a3);
            C4257a c4257a = this.f13998e[(i * 6) + 0];
            c4257a.f13793g = 0.0f;
            c4257a.f13791e = 0.0d;
            c4257a.f13792f = 0.0d;
            c4257a.f13794h = m246a(0.0f);
            c4257a.f13795i = m240b(0.0f + 192.0f);
            c4257a.m375a(m247a);
            C4257a c4257a2 = this.f13998e[(i * 6) + 1];
            float f = (float) (tan * 192.0f);
            c4257a2.f13793g = 0.0f;
            c4257a2.f13791e = f;
            c4257a2.f13792f = 192.0f;
            c4257a2.f13794h = m246a(0.0f + f);
            c4257a2.f13795i = m240b(0.0f);
            c4257a2.m375a(m247a);
            C4257a c4257a3 = this.f13998e[(i * 6) + 2];
            c4257a3.f13793g = 0.0f;
            c4257a3.f13791e = 0.0d;
            c4257a3.f13792f = 192.0f;
            c4257a3.f13794h = m246a(0.0f);
            c4257a3.f13795i = m240b(0.0f);
            c4257a3.m375a(m247a);
            C4257a c4257a4 = this.f13998e[(i * 6) + 3];
            c4257a4.f13793g = 0.0f;
            c4257a4.f13791e = 0.0d;
            c4257a4.f13792f = 0.0d;
            c4257a4.f13794h = m246a(0.0f);
            c4257a4.f13795i = m240b(0.0f + 192.0f);
            c4257a4.m375a(m247a - m247a2);
            C4257a c4257a5 = this.f13998e[(i * 6) + 4];
            c4257a5.f13793g = 0.0f;
            c4257a5.f13791e = 192.0f;
            c4257a5.f13792f = 0.0d;
            c4257a5.f13794h = m246a(0.0f + 192.0f);
            c4257a5.f13795i = m240b(0.0f + 192.0f);
            c4257a5.m375a(m247a - m247a2);
            C4257a c4257a6 = this.f13998e[(i * 6) + 5];
            c4257a6.f13793g = 0.0f;
            c4257a6.f13791e = 192.0f;
            c4257a6.f13792f = f;
            c4257a6.f13794h = m246a(0.0f + 192.0f);
            c4257a6.f13795i = m240b((0.0f + 192.0f) - f);
            c4257a6.m375a(m247a - m247a2);
        }
        int i2 = ((int) this.f14006m) + 1;
        for (int i3 = 1; i3 < i2; i3++) {
            double m247a4 = m247a(d);
            C4257a c4257a7 = this.f13998e[(i3 * 6) + 0];
            c4257a7.f13793g = 0.0f;
            c4257a7.f13791e = 0.0d;
            c4257a7.f13792f = 0.0d;
            c4257a7.f13794h = m246a(0.0f);
            c4257a7.f13795i = m240b(0.0f + 192.0f);
            c4257a7.m375a(m247a4);
            C4257a c4257a8 = this.f13998e[(i3 * 6) + 1];
            c4257a8.f13793g = 0.0f;
            c4257a8.f13791e = 192.0f;
            c4257a8.f13792f = 192.0f;
            c4257a8.f13794h = m246a(0.0f + 192.0f);
            c4257a8.f13795i = m240b(0.0f);
            c4257a8.m375a(m247a4);
            C4257a c4257a9 = this.f13998e[(i3 * 6) + 2];
            c4257a9.f13793g = 0.0f;
            c4257a9.f13791e = 0.0d;
            c4257a9.f13792f = 192.0f;
            c4257a9.f13794h = m246a(0.0f);
            c4257a9.f13795i = m240b(0.0f);
            c4257a9.m375a(m247a4);
            C4257a c4257a10 = this.f13998e[(i3 * 6) + 3];
            c4257a10.f13793g = 0.0f;
            c4257a10.f13791e = 0.0d;
            c4257a10.f13792f = 0.0d;
            c4257a10.f13794h = m246a(0.0f);
            c4257a10.f13795i = m240b(0.0f + 192.0f);
            c4257a10.m375a(m247a4);
            C4257a c4257a11 = this.f13998e[(i3 * 6) + 4];
            c4257a11.f13793g = 0.0f;
            c4257a11.f13791e = 192.0f;
            c4257a11.f13792f = 0.0d;
            c4257a11.f13794h = m246a(0.0f + 192.0f);
            c4257a11.f13795i = m240b(0.0f + 192.0f);
            c4257a11.m375a(m247a4);
            C4257a c4257a12 = this.f13998e[(i3 * 6) + 5];
            c4257a12.f13793g = 0.0f;
            c4257a12.f13791e = 192.0f;
            c4257a12.f13792f = 192.0f;
            c4257a12.f13794h = m246a(0.0f + 192.0f);
            c4257a12.f13795i = m240b(0.0f);
            c4257a12.m375a(m247a4);
            d += 89.2d;
        }
        while (i2 < 4) {
            C4257a c4257a13 = this.f13998e[(i2 * 6) + 0];
            c4257a13.f13793g = 0.0d;
            c4257a13.f13791e = 0.0d;
            c4257a13.f13792f = 0.0d;
            c4257a13.f13794h = 0.0d;
            c4257a13.f13795i = 0.0d;
            C4257a c4257a14 = this.f13998e[(i2 * 6) + 1];
            c4257a14.f13793g = 0.0d;
            c4257a14.f13791e = 0.0d;
            c4257a14.f13792f = 0.0d;
            c4257a14.f13794h = 0.0d;
            c4257a14.f13795i = 0.0d;
            C4257a c4257a15 = this.f13998e[(i2 * 6) + 2];
            c4257a15.f13793g = 0.0d;
            c4257a15.f13791e = 0.0d;
            c4257a15.f13792f = 0.0d;
            c4257a15.f13794h = 0.0d;
            c4257a15.f13795i = 0.0d;
            C4257a c4257a16 = this.f13998e[(i2 * 6) + 3];
            c4257a16.f13793g = 0.0d;
            c4257a16.f13791e = 0.0d;
            c4257a16.f13792f = 0.0d;
            c4257a16.f13794h = 0.0d;
            c4257a16.f13795i = 0.0d;
            C4257a c4257a17 = this.f13998e[(i2 * 6) + 4];
            c4257a17.f13793g = 0.0d;
            c4257a17.f13791e = 0.0d;
            c4257a17.f13792f = 0.0d;
            c4257a17.f13794h = 0.0d;
            c4257a17.f13795i = 0.0d;
            C4257a c4257a18 = this.f13998e[(i2 * 6) + 5];
            c4257a18.f13793g = 0.0d;
            c4257a18.f13791e = 0.0d;
            c4257a18.f13792f = 0.0d;
            c4257a18.f13794h = 0.0d;
            c4257a18.f13795i = 0.0d;
            i2++;
        }
    }

    /* renamed from: a */
    private double m247a(double d) {
        return 0.017453292519943295d * d;
    }

    /* renamed from: a */
    private float m246a(float f) {
        return f / this.f14004k;
    }

    /* renamed from: b */
    private float m240b(float f) {
        return f / this.f14005l;
    }

    /* renamed from: a */
    public void m245a(int i) {
        this.f14003j = i;
    }

    /* renamed from: c */
    public void m238c() {
        this.f13995a.position(0);
        this.f13996b.position(0);
        this.f13997c.position(0);
        int length = this.f13998e.length;
        for (int i = 0; i < length; i++) {
            m244a(this.f13998e[i]);
        }
        this.f13995a.position(0);
        this.f13996b.position(0);
        this.f13997c.position(0);
    }

    /* renamed from: a */
    private void m244a(C4257a c4257a) {
        this.f13995a.put((float) c4257a.f13791e);
        this.f13995a.put((float) c4257a.f13792f);
        this.f13995a.put((float) c4257a.f13793g);
        this.f13997c.put(((c4257a.f13788b * Color.red(c4257a.f13787a)) / 255.0f) * 1.0f);
        this.f13997c.put(((c4257a.f13788b * Color.green(c4257a.f13787a)) / 255.0f) * 1.0f);
        this.f13997c.put(((c4257a.f13788b * Color.blue(c4257a.f13787a)) / 255.0f) * 1.0f);
        this.f13997c.put((Color.alpha(c4257a.f13787a) / 255.0f) * 1.0f);
        this.f13996b.put((float) c4257a.f13794h);
        this.f13996b.put((float) c4257a.f13795i);
    }
}
