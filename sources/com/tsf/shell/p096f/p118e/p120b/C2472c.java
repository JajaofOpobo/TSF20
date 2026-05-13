package com.tsf.shell.p096f.p118e.p120b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* renamed from: com.tsf.shell.f.e.b.c */
/* loaded from: classes.dex */
public class C2472c extends C0980j {

    /* renamed from: e */
    protected FloatBuffer f8128e;

    /* renamed from: f */
    protected FloatBuffer f8129f;

    /* renamed from: a */
    public int f8124a = -1;

    /* renamed from: b */
    public int f8125b = -1;

    /* renamed from: c */
    public float f8126c = 0.0f;

    /* renamed from: d */
    public int f8127d = 0;

    /* renamed from: g */
    protected int f8130g = 6;

    public C2472c() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f8130g * 3 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f8128e = allocateDirect.asFloatBuffer();
        this.f8128e.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.f8130g * 2 * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.f8129f = allocateDirect2.asFloatBuffer();
        this.f8129f.position(0);
        this.f8129f.put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f8129f.position(0);
        m5499a(1.0f, 1.0f);
    }

    /* renamed from: a */
    public void m5499a(float f, float f2) {
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        this.f8128e.put(new float[]{-f3, f4, 0.0f, -f3, -f4, 0.0f, f3, f4, 0.0f, f3, f4, 0.0f, -f3, -f4, 0.0f, f3, -f4, 0.0f});
        this.f8128e.position(0);
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void dispatchDraw() {
        if (this.f8126c == 1.0f || this.f8126c == 0.0f) {
            setCustomShader(ShaderManager.SHADER_COLOR_TEXTURE);
        } else {
            setCustomShader(C2474e.f8137b);
        }
        super.dispatchDraw();
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void drawMVPMatrix() {
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
    public void drawElement() {
        if (this.f8126c == 1.0f || this.f8126c == 0.0f) {
            ShaderManager.CURRENT_SHADER.glMVPMatrix();
            ShaderManager.CURRENT_SHADER.glVertexPointer(3, 5126, false, 0, this.f8128e);
            ShaderManager.CURRENT_SHADER.glTexCoordPointer(2, 5126, false, 0, this.f8129f);
            ShaderManager.SHADER_COLOR_TEXTURE.glColor4f(255, 255 - this.f8127d, 255 - this.f8127d, 255 - this.f8127d);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f8126c == 1.0f ? this.f8125b : this.f8124a);
            GLES20.glDrawArrays(4, 0, this.f8130g);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, 0);
        } else if (this.f8124a != -1 && this.f8125b != -1) {
            C2474e.f8137b.m5479a(this.f8126c);
            C2474e.f8137b.m5478a(255, 255 - this.f8127d, 255 - this.f8127d, 255 - this.f8127d);
            C2474e.f8137b.glMVPMatrix();
            C2474e.f8137b.glVertexPointer(3, 5126, false, 0, this.f8128e);
            C2474e.f8137b.glTexCoordPointer(2, 5126, false, 0, this.f8129f);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f8124a);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.f8125b);
            GLES20.glDrawArrays(4, 0, this.f8130g);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maPositionHandle);
            GLES20.glDisableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, 0);
        }
    }
}
