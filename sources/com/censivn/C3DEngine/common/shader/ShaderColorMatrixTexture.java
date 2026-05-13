package com.censivn.C3DEngine.common.shader;

import android.opengl.GLES20;
import com.tsf.shell.utils.C4189x;
/* loaded from: classes.dex */
public class ShaderColorMatrixTexture extends ShaderColor {
    public int muSTMatrixHandle;
    public String mVertexShader = "uniform mat4 uMVPMatrix;      \nuniform mat4 uSTMatrix;\nattribute vec4 aTextureCoord;      \nattribute vec4 aPosition;      \nvarying vec2 vTextureCoord;      \nattribute vec4 aColor;      \nvarying vec4 vColor;      \nvoid main() {      \ngl_Position = uMVPMatrix * aPosition;      \n vTextureCoord = (uSTMatrix * aTextureCoord).xy;      \n vColor = aColor;      \n}";
    public String mFragmentShader = "precision mediump float;      \nvarying vec2 vTextureCoord;      \nuniform sampler2D sTexture;      \nvarying vec4 vColor;      \nvoid main() {      \n gl_FragColor = vColor*texture2D(sTexture, vTextureCoord).rgba;      \n}";

    public ShaderColorMatrixTexture() {
        createProgram();
    }

    public void createProgram() {
        super.createProgram(this.mVertexShader, this.mFragmentShader);
        this.maTextureHandle = GLES20.glGetAttribLocation(this.f3427id, "aTextureCoord");
        C4189x.m597a("glGetAttribLocation aTextureCoord");
        if (this.maTextureHandle == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.muSTMatrixHandle = GLES20.glGetUniformLocation(this.f3427id, "uSTMatrix");
        C4189x.m597a("glGetUniformLocation uSTMatrix");
        if (this.muSTMatrixHandle == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
    }

    public void glSTMatrix(float[] fArr, int i) {
        GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, fArr, i);
    }
}
