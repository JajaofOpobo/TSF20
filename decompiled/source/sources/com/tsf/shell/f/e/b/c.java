package com.tsf.shell.f.e.b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* loaded from: classes.dex */
public class c extends j {
    protected FloatBuffer e;
    protected FloatBuffer f;
    public int a = -1;
    public int b = -1;
    public float c = 0.0f;
    public int d = 0;
    protected int g = 6;

    public c() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.g * 3 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.e = allocateDirect.asFloatBuffer();
        this.e.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.g * 2 * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.f = allocateDirect2.asFloatBuffer();
        this.f.position(0);
        this.f.put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f.position(0);
        a(1.0f, 1.0f);
    }

    public void a(float f, float f2) {
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        this.e.put(new float[]{-f3, f4, 0.0f, -f3, -f4, 0.0f, f3, f4, 0.0f, f3, f4, 0.0f, -f3, -f4, 0.0f, f3, -f4, 0.0f});
        this.e.position(0);
    }

    @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
    public void dispatchDraw() {
        if (this.c == 1.0f || this.c == 0.0f) {
            setCustomShader(ShaderManager.SHADER_COLOR_TEXTURE);
        } else {
            setCustomShader(e.b);
        }
        super.dispatchDraw();
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void drawMVPMatrix() {
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void drawElement() {
        if (this.c == 1.0f || this.c == 0.0f) {
            ShaderManager.CURRENT_SHADER.glMVPMatrix();
            ShaderManager.CURRENT_SHADER.glVertexPointer(3, 5126, false, 0, this.e);
            ShaderManager.CURRENT_SHADER.glTexCoordPointer(2, 5126, false, 0, this.f);
            ShaderManager.SHADER_COLOR_TEXTURE.glColor4f(255, 255 - this.d, 255 - this.d, 255 - this.d);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.c == 1.0f ? this.b : this.a);
            GLES20.glDrawArrays(4, 0, this.g);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, 0);
        } else if (this.a != -1 && this.b != -1) {
            e.b.a(this.c);
            e.b.a(255, 255 - this.d, 255 - this.d, 255 - this.d);
            e.b.glMVPMatrix();
            e.b.glVertexPointer(3, 5126, false, 0, this.e);
            e.b.glTexCoordPointer(2, 5126, false, 0, this.f);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.a);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.b);
            GLES20.glDrawArrays(4, 0, this.g);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, 0);
        }
    }
}
