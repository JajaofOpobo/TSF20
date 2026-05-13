package com.censivn.C3DEngine.common.shader;

import android.opengl.GLES20;
import com.tsf.shell.utils.C4183s;
import com.tsf.shell.utils.C4189x;
/* loaded from: classes.dex */
public class ShaderStandard extends Shader {
    private String mVertexShader = "uniform mat4 uMVPMatrix;      \nattribute vec2 aTextureCoord;      \nattribute vec4 aPosition;      \nvarying vec2 vTextureCoord;      \nvoid main() {      \ngl_Position = uMVPMatrix * aPosition;      \n vTextureCoord = aTextureCoord;      \n}";
    private String mFragmentShader = "precision mediump float;      \nvarying vec2 vTextureCoord;      \nuniform sampler2D sTexture;      \nvoid main() {      \n gl_FragColor = texture2D(sTexture, vTextureCoord);      \n}";

    public ShaderStandard() {
        createProgram();
    }

    private void createProgram() {
        this.f3427id = C4183s.m629a(this.mVertexShader, this.mFragmentShader);
        if (this.f3427id == 0) {
            throw new RuntimeException("Could create shader program");
        }
        this.maPositionHandle = GLES20.glGetAttribLocation(this.f3427id, "aPosition");
        C4189x.m597a("glGetAttribLocation aPosition");
        if (this.maPositionHandle == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        this.maTextureHandle = GLES20.glGetAttribLocation(this.f3427id, "aTextureCoord");
        C4189x.m597a("glGetAttribLocation aTextureCoord");
        if (this.maTextureHandle == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.f3427id, "uMVPMatrix");
        C4189x.m597a("glGetUniformLocation uMVPMatrix");
        if (this.muMVPMatrixHandle == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
    }
}
