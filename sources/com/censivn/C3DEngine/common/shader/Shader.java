package com.censivn.C3DEngine.common.shader;

import android.opengl.GLES20;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.p030a.C0863c;
import java.nio.Buffer;
/* loaded from: classes.dex */
public class Shader {

    /* renamed from: id */
    public int f3427id;
    public int maPositionHandle;
    public int maTextureHandle;
    public int muMVPMatrixHandle;

    public void glVertexPointer(int i, int i2, boolean z, int i3, Buffer buffer) {
        GLES20.glEnableVertexAttribArray(this.maPositionHandle);
        GLES20.glVertexAttribPointer(this.maPositionHandle, i, i2, z, i3, buffer);
    }

    public void glTexCoordPointer(int i, int i2, boolean z, int i3, Buffer buffer) {
        GLES20.glEnableVertexAttribArray(this.maTextureHandle);
        GLES20.glVertexAttribPointer(this.maTextureHandle, i, i2, z, i3, buffer);
    }

    public void glMVPMatrix(float[] fArr, int i) {
        C0863c.m10829a(MatrixStack.rMVPMatrix, 0, MatrixStack.rSceneMatrix, 0, fArr, i);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle, 1, false, MatrixStack.rMVPMatrix, 0);
    }

    public void glMVPMatrix() {
        glMVPMatrix(MatrixStack.matrix, MatrixStack.topIndex);
    }
}
