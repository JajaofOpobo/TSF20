package com.censivn.C3DEngine.common.shader;

import android.opengl.GLES20;
import com.censivn.C3DEngine.b.b.a;

/* loaded from: classes.dex */
public class ShaderTextureMatrix extends Shader {
    public int muSTMatrixHandle;
    private static String mVertexShader = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    private static String mFragmentShader = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";

    public ShaderTextureMatrix() {
        createProgram();
    }

    public void glSTMatrix(float[] fArr, int i) {
        GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, fArr, i);
    }

    private void createProgram() {
        this.id = a.a(mVertexShader, mFragmentShader);
        if (this.id == 0) {
            throw new RuntimeException("Could create shader program");
        }
        this.maPositionHandle = GLES20.glGetAttribLocation(this.id, "aPosition");
        com.censivn.C3DEngine.h.a.a("glGetAttribLocation aPosition");
        if (this.maPositionHandle == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        this.maTextureHandle = GLES20.glGetAttribLocation(this.id, "aTextureCoord");
        com.censivn.C3DEngine.h.a.a("glGetAttribLocation aTextureCoord");
        if (this.maTextureHandle == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.id, "uMVPMatrix");
        com.censivn.C3DEngine.h.a.a("glGetUniformLocation uMVPMatrix");
        if (this.muMVPMatrixHandle == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        this.muSTMatrixHandle = GLES20.glGetUniformLocation(this.id, "uSTMatrix");
        com.censivn.C3DEngine.h.a.a("glGetUniformLocation uSTMatrix");
        if (this.muSTMatrixHandle == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
    }
}
