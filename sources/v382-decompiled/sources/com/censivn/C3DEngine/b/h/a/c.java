package com.censivn.C3DEngine.b.h.a;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.censivn.C3DEngine.common.shader.Shader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public class c {
    protected FloatBuffer a;
    protected FloatBuffer b;
    private int c = 6;
    private int d = 6;
    private int e = -1;
    private Shader f;

    public c() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.c * 3 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.a = allocateDirect.asFloatBuffer();
        this.a.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.c * 2 * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.b = allocateDirect2.asFloatBuffer();
        this.b.position(0);
        b();
    }

    public void a(Shader shader) {
        this.f = shader;
    }

    public void a(int i) {
        this.e = i;
    }

    private void b() {
        this.a.put(new float[]{-this.d, this.d, 0.0f, -this.d, -this.d, 0.0f, this.d, this.d, 0.0f, this.d, this.d, 0.0f, -this.d, -this.d, 0.0f, this.d, -this.d, 0.0f});
        this.b.put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.a.position(0);
        this.b.position(0);
    }

    public void a(float f, float f2) {
        float f3 = (f / f2) * 6.0f;
        this.a.put(new float[]{-f3, 6.0f, 0.0f, -f3, -6.0f, 0.0f, f3, 6.0f, 0.0f, f3, 6.0f, 0.0f, -f3, -6.0f, 0.0f, f3, -6.0f, 0.0f}).position(0);
    }

    public void a() {
        GLES20.glClear(16640);
        Matrix.multiplyMM(a.e, 0, a.d, 0, a.f, 0);
        GLES20.glUniformMatrix4fv(this.f.muMVPMatrixHandle, 1, false, a.e, 0);
        if (this.e != -1) {
            this.f.glVertexPointer(3, 5126, false, 0, this.a);
            this.f.glTexCoordPointer(2, 5126, false, 0, this.b);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.e);
            GLES20.glDrawArrays(4, 0, this.c);
            GLES20.glDisableVertexAttribArray(this.f.maPositionHandle);
            GLES20.glDisableVertexAttribArray(this.f.maTextureHandle);
            GLES20.glBindTexture(3553, 0);
        }
    }
}
