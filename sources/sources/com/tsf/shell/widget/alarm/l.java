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
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class l extends VObject3dContainer {
    public static final int d = Color.argb(255, 255, 255, 255);
    protected FloatBuffer a;
    protected FloatBuffer b;
    protected FloatBuffer c;
    private int j;
    private double m;
    private double n;
    private TextureElement o;
    protected com.tsf.shell.widget.alarm.a.a[] e = new com.tsf.shell.widget.alarm.a.a[24];
    private float g = 0.0f;
    private float h = 0.0f;
    private float i = 1.0f;
    private float k = 192.0f;
    private float l = 192.0f;
    boolean f = false;

    public l() {
        d();
        b();
        c();
        invalidate();
    }

    private void d() {
        AlarmWidget.d.addObject(this);
        Bitmap bitmapB = p.b(AlarmWidget.h, "progress_bar");
        this.o = AlarmWidget.c.createTexture(bitmapB, true);
        bitmapB.recycle();
        a(this.o.id);
        for (int i = 0; i < this.e.length; i++) {
            com.tsf.shell.widget.alarm.a.a[] aVarArr = this.e;
            com.tsf.shell.widget.alarm.a.a aVar = new com.tsf.shell.widget.alarm.a.a();
            aVarArr[i] = aVar;
            aVar.a = d;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.e.length * 3 * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.a = byteBufferAllocateDirect.asFloatBuffer();
        this.a.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(this.e.length * 2 * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        this.b = byteBufferAllocateDirect2.asFloatBuffer();
        this.b.position(0);
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(this.e.length * 4 * 4);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        this.c = byteBufferAllocateDirect3.asFloatBuffer();
        this.c.position(0);
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
        e();
        b();
        c();
        boolean zColorFillEnable = colorFillEnable();
        if (visible()) {
            MatrixStack.glPushMatrix();
            MatrixStack.glTranslatef(position().x, position().y, position().z);
            MatrixStack.glRotatef(rotation().x, 1.0f, 0.0f, 0.0f);
            MatrixStack.glRotatef(rotation().y, 0.0f, 1.0f, 0.0f);
            MatrixStack.glRotatef(rotation().z, 0.0f, 0.0f, 1.0f);
            MatrixStack.glScalef(AlarmWidget.g, AlarmWidget.g, AlarmWidget.g);
            MatrixStack.glScalef(scale().x, scale().y, scale().z);
            if (zColorFillEnable) {
                ShaderManager.SHADER_COLOR_TEXTURE.glMVPMatrix();
                ShaderManager.SHADER_COLOR_TEXTURE.glTexCoordPointer(2, 5126, false, 0, this.b);
                ShaderManager.SHADER_COLOR_TEXTURE.glVertexPointer(3, 5126, false, 0, this.a);
                ShaderManager.SHADER_COLOR_TEXTURE.glColor4f(this);
            } else {
                ShaderManager.SHADER_STANDARD.glMVPMatrix();
                ShaderManager.SHADER_STANDARD.glTexCoordPointer(2, 5126, false, 0, this.b);
                ShaderManager.SHADER_STANDARD.glVertexPointer(3, 5126, false, 0, this.a);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.j);
            GLES20.glDrawArrays(4, 0, this.e.length);
            if (zColorFillEnable) {
                GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maColor4Handle);
            }
            MatrixStack.glPopMatrix();
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            GLES20.glBindTexture(3553, 0);
        }
    }

    private void e() {
        if (!AlarmWidget.o && !this.f) {
            this.h = ((System.currentTimeMillis() % 60000) / 60000.0f) * 284.0f;
            float f = this.h - this.g;
            if (Math.abs(f) > 1.0f) {
                this.i = 0.08f;
            } else {
                this.i = 0.99f;
            }
            this.g += this.i * f;
            if (Math.abs(f) > 2.0f) {
                invalidate();
            }
        }
    }

    public void a() {
        this.f = true;
        VTweenParam vTweenParam = new VTweenParam() { // from class: com.tsf.shell.widget.alarm.l.1
            float a;

            {
                this.a = l.this.g;
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onUpdate(float f) {
                l.this.g = this.a * (1.0f - f);
            }

            @Override // com.censivn.C3DEngine.api.tween.VTweenParam
            public void onComplete() {
                Bitmap bitmapB = p.b(AlarmWidget.h, "progress_bar");
                p.a(l.this.o.id, bitmapB, 0, 0);
                bitmapB.recycle();
                VTween.to(l.this, 1500, new VTweenParam() { // from class: com.tsf.shell.widget.alarm.l.1.1
                    @Override // com.censivn.C3DEngine.api.tween.VTweenParam
                    public void onComplete() {
                        l.this.f = false;
                    }
                });
            }
        };
        VTween.killTween(this);
        VTween.to(this, 300, vTweenParam);
    }

    public void b() {
        double d2 = 38.0d;
        this.m = ((double) this.g) / 89.2d;
        this.n = ((double) this.g) % 89.2d;
        for (int i = 0; i < 1; i++) {
            double dA = a((((double) ((int) this.m)) * 89.2d) + 38.0d);
            double dA2 = a(90.0d - this.n);
            double dA3 = a(this.n / 2.0d);
            Math.sin(dA3);
            Math.cos(dA3);
            double dTan = Math.tan(dA3);
            com.tsf.shell.widget.alarm.a.a aVar = this.e[(i * 6) + 0];
            aVar.g = 0.0f;
            aVar.e = 0.0d;
            aVar.f = 0.0d;
            aVar.h = a(0.0f);
            aVar.i = b(0.0f + 192.0f);
            aVar.a(dA);
            com.tsf.shell.widget.alarm.a.a aVar2 = this.e[(i * 6) + 1];
            float f = (float) (dTan * ((double) 192.0f));
            aVar2.g = 0.0f;
            aVar2.e = f;
            aVar2.f = 192.0f;
            aVar2.h = a(0.0f + f);
            aVar2.i = b(0.0f);
            aVar2.a(dA);
            com.tsf.shell.widget.alarm.a.a aVar3 = this.e[(i * 6) + 2];
            aVar3.g = 0.0f;
            aVar3.e = 0.0d;
            aVar3.f = 192.0f;
            aVar3.h = a(0.0f);
            aVar3.i = b(0.0f);
            aVar3.a(dA);
            com.tsf.shell.widget.alarm.a.a aVar4 = this.e[(i * 6) + 3];
            aVar4.g = 0.0f;
            aVar4.e = 0.0d;
            aVar4.f = 0.0d;
            aVar4.h = a(0.0f);
            aVar4.i = b(0.0f + 192.0f);
            aVar4.a(dA - dA2);
            com.tsf.shell.widget.alarm.a.a aVar5 = this.e[(i * 6) + 4];
            aVar5.g = 0.0f;
            aVar5.e = 192.0f;
            aVar5.f = 0.0d;
            aVar5.h = a(0.0f + 192.0f);
            aVar5.i = b(0.0f + 192.0f);
            aVar5.a(dA - dA2);
            com.tsf.shell.widget.alarm.a.a aVar6 = this.e[(i * 6) + 5];
            aVar6.g = 0.0f;
            aVar6.e = 192.0f;
            aVar6.f = f;
            aVar6.h = a(0.0f + 192.0f);
            aVar6.i = b((0.0f + 192.0f) - f);
            aVar6.a(dA - dA2);
        }
        int i2 = ((int) this.m) + 1;
        for (int i3 = 1; i3 < i2; i3++) {
            double dA4 = a(d2);
            com.tsf.shell.widget.alarm.a.a aVar7 = this.e[(i3 * 6) + 0];
            aVar7.g = 0.0f;
            aVar7.e = 0.0d;
            aVar7.f = 0.0d;
            aVar7.h = a(0.0f);
            aVar7.i = b(0.0f + 192.0f);
            aVar7.a(dA4);
            com.tsf.shell.widget.alarm.a.a aVar8 = this.e[(i3 * 6) + 1];
            aVar8.g = 0.0f;
            aVar8.e = 192.0f;
            aVar8.f = 192.0f;
            aVar8.h = a(0.0f + 192.0f);
            aVar8.i = b(0.0f);
            aVar8.a(dA4);
            com.tsf.shell.widget.alarm.a.a aVar9 = this.e[(i3 * 6) + 2];
            aVar9.g = 0.0f;
            aVar9.e = 0.0d;
            aVar9.f = 192.0f;
            aVar9.h = a(0.0f);
            aVar9.i = b(0.0f);
            aVar9.a(dA4);
            com.tsf.shell.widget.alarm.a.a aVar10 = this.e[(i3 * 6) + 3];
            aVar10.g = 0.0f;
            aVar10.e = 0.0d;
            aVar10.f = 0.0d;
            aVar10.h = a(0.0f);
            aVar10.i = b(0.0f + 192.0f);
            aVar10.a(dA4);
            com.tsf.shell.widget.alarm.a.a aVar11 = this.e[(i3 * 6) + 4];
            aVar11.g = 0.0f;
            aVar11.e = 192.0f;
            aVar11.f = 0.0d;
            aVar11.h = a(0.0f + 192.0f);
            aVar11.i = b(0.0f + 192.0f);
            aVar11.a(dA4);
            com.tsf.shell.widget.alarm.a.a aVar12 = this.e[(i3 * 6) + 5];
            aVar12.g = 0.0f;
            aVar12.e = 192.0f;
            aVar12.f = 192.0f;
            aVar12.h = a(0.0f + 192.0f);
            aVar12.i = b(0.0f);
            aVar12.a(dA4);
            d2 += 89.2d;
        }
        while (i2 < 4) {
            com.tsf.shell.widget.alarm.a.a aVar13 = this.e[(i2 * 6) + 0];
            aVar13.g = 0.0d;
            aVar13.e = 0.0d;
            aVar13.f = 0.0d;
            aVar13.h = 0.0d;
            aVar13.i = 0.0d;
            com.tsf.shell.widget.alarm.a.a aVar14 = this.e[(i2 * 6) + 1];
            aVar14.g = 0.0d;
            aVar14.e = 0.0d;
            aVar14.f = 0.0d;
            aVar14.h = 0.0d;
            aVar14.i = 0.0d;
            com.tsf.shell.widget.alarm.a.a aVar15 = this.e[(i2 * 6) + 2];
            aVar15.g = 0.0d;
            aVar15.e = 0.0d;
            aVar15.f = 0.0d;
            aVar15.h = 0.0d;
            aVar15.i = 0.0d;
            com.tsf.shell.widget.alarm.a.a aVar16 = this.e[(i2 * 6) + 3];
            aVar16.g = 0.0d;
            aVar16.e = 0.0d;
            aVar16.f = 0.0d;
            aVar16.h = 0.0d;
            aVar16.i = 0.0d;
            com.tsf.shell.widget.alarm.a.a aVar17 = this.e[(i2 * 6) + 4];
            aVar17.g = 0.0d;
            aVar17.e = 0.0d;
            aVar17.f = 0.0d;
            aVar17.h = 0.0d;
            aVar17.i = 0.0d;
            com.tsf.shell.widget.alarm.a.a aVar18 = this.e[(i2 * 6) + 5];
            aVar18.g = 0.0d;
            aVar18.e = 0.0d;
            aVar18.f = 0.0d;
            aVar18.h = 0.0d;
            aVar18.i = 0.0d;
            i2++;
        }
    }

    private double a(double d2) {
        return 0.017453292519943295d * d2;
    }

    private float a(float f) {
        return f / this.k;
    }

    private float b(float f) {
        return f / this.l;
    }

    public void a(int i) {
        this.j = i;
    }

    public void c() {
        this.a.position(0);
        this.b.position(0);
        this.c.position(0);
        int length = this.e.length;
        for (int i = 0; i < length; i++) {
            a(this.e[i]);
        }
        this.a.position(0);
        this.b.position(0);
        this.c.position(0);
    }

    private void a(com.tsf.shell.widget.alarm.a.a aVar) {
        this.a.put((float) aVar.e);
        this.a.put((float) aVar.f);
        this.a.put((float) aVar.g);
        this.c.put(((aVar.b * Color.red(aVar.a)) / 255.0f) * 1.0f);
        this.c.put(((aVar.b * Color.green(aVar.a)) / 255.0f) * 1.0f);
        this.c.put(((aVar.b * Color.blue(aVar.a)) / 255.0f) * 1.0f);
        this.c.put((Color.alpha(aVar.a) / 255.0f) * 1.0f);
        this.b.put((float) aVar.h);
        this.b.put((float) aVar.i);
    }
}
