package com.tsf.shell.widget.cubeclock.a;

import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class b extends VObject3dContainer {
    protected FloatBuffer a;
    protected FloatBuffer b;
    protected FloatBuffer c;
    private com.tsf.shell.widget.cubeclock.c l;
    private int g = 96;
    public int d = 0;
    public int e = 0;
    private ArrayList h = new ArrayList();
    private ArrayList i = new ArrayList();
    public int[] f = {-8319731, -62196, -1609171, -536534, -13607043, -13667434, -13521439, -5315356, -16306422, -15901936, -15947500, -9712101, -15462385, -14540254, -13421773, -10066330};
    private float j = -5.0f;
    private int k = -13421773;
    private float m = 1.0f;

    public b(com.tsf.shell.widget.cubeclock.c cVar) {
        this.l = cVar;
        this.l.c.addObject(this);
        scale().x = this.l.p;
        scale().y = this.l.p;
        scale().z = this.l.p;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.g * 3 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.b = allocateDirect.asFloatBuffer();
        this.b.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.g * 2 * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.c = allocateDirect2.asFloatBuffer();
        this.c.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(this.g * 4 * 4);
        allocateDirect3.order(ByteOrder.nativeOrder());
        this.a = allocateDirect3.asFloatBuffer();
        this.a.position(0);
        b();
        setMouseEventListener(new d(this, this));
        setAABBSP(((-588.0f) / this.l.n) / 2.0f, ((-144.0f) / this.l.n) / 2.0f, 0.0f, (588.0f / this.l.n) / 2.0f, (144.0f / this.l.n) / 2.0f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.k = this.f[i];
        this.k = b(this.k);
        this.l.g.a(this.k);
    }

    public int a() {
        return this.k;
    }

    private int b(int i) {
        return Color.argb(255, (int) (Color.red(i) * this.m), (int) (Color.green(i) * this.m), (int) (Color.blue(i) * this.m));
    }

    private void b() {
        float[] fArr = new float[18];
        fArr[0] = (-13.0f) - 195.0f;
        fArr[1] = 26.0f;
        fArr[2] = 0.0f;
        fArr[3] = (-13.0f) - 195.0f;
        fArr[4] = -26.0f;
        fArr[5] = 0.0f;
        fArr[6] = 13.0f - 195.0f;
        fArr[7] = 26.0f;
        fArr[8] = 0.0f;
        fArr[9] = 13.0f - 195.0f;
        fArr[10] = 26.0f;
        fArr[11] = 0.0f;
        fArr[12] = (-13.0f) - 195.0f;
        fArr[13] = -26.0f;
        fArr[14] = 0.0f;
        fArr[15] = 13.0f - 195.0f;
        fArr[16] = -26.0f;
        fArr[17] = 0.0f;
        for (int i = 0; i < 16; i++) {
            c cVar = new c(this, i);
            this.h.add(cVar);
            this.i.add(cVar);
            this.b.put(fArr);
            for (int i2 = 0; i2 < 6; i2++) {
                int i3 = i2 * 3;
                fArr[i3] = fArr[i3] + 26.0f;
            }
        }
        for (int i4 = 0; i4 < 16; i4++) {
            this.c.put(this.l.g.b());
        }
        a(1.0f);
        this.b.position(0);
        this.c.position(0);
    }

    public void a(float f) {
        this.m = f;
        this.a.position(0);
        float[] fArr = new float[this.g * 4];
        for (int i = 0; i < this.g; i++) {
            int i2 = this.f[i / 6];
            fArr[(i * 4) + 0] = (Color.red(i2) * f) / 255.0f;
            fArr[(i * 4) + 1] = (Color.green(i2) * f) / 255.0f;
            fArr[(i * 4) + 2] = (Color.blue(i2) * f) / 255.0f;
            fArr[(i * 4) + 3] = 255.0f;
        }
        this.a.put(fArr);
        this.a.position(0);
        invalidate();
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
            GLES20.glBindTexture(3553, this.l.g.a().id);
            Collections.sort(this.i);
            c();
            for (int i = 0; i < 16; i++) {
                c cVar = (c) this.i.get(i);
                MatrixStack.glPushMatrix();
                MatrixStack.glScalef((cVar.b / 10.0f) + 1.0f, cVar.b, 1.0f);
                ShaderManager.SHADER_COLOR_TEXTURE.glMVPMatrix();
                GLES20.glDrawArrays(4, cVar.d * 6, 6);
                MatrixStack.glPopMatrix();
            }
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maColor4Handle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.SHADER_COLOR_TEXTURE.maTextureHandle);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, 0);
        }
    }

    private void c() {
        int size = this.h.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            c cVar = (c) this.h.get(i);
            float abs = Math.abs(this.j - cVar.d) / 3.0f;
            if (abs > 1.0f) {
                abs = 1.0f;
            }
            cVar.a = 2.0f - abs;
            cVar.b += (cVar.a - cVar.b) * 0.4f;
            i++;
            z = cVar.b > 1.1f ? true : z;
        }
        if (z) {
            invalidate();
        }
    }
}
