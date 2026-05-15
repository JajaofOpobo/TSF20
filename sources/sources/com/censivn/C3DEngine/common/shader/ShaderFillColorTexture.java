package com.censivn.C3DEngine.common.shader;

import android.opengl.GLES20;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ShaderFillColorTexture extends ShaderColor {
    public String mVertexShader = "uniform mat4 uMVPMatrix;      \nattribute vec2 aTextureCoord;      \nattribute vec4 aPosition;      \nvarying vec2 vTextureCoord;      \nattribute vec4 aColor;      \nvarying vec4 vColor;      \nvoid main() {      \ngl_Position = uMVPMatrix * aPosition;      \n vTextureCoord = aTextureCoord;      \n vColor = aColor;      \n}";
    public String mFragmentShader = "precision mediump float;      \nvarying vec2 vTextureCoord;      \nuniform sampler2D sTexture;      \nvarying vec4 vColor;      \nvoid main() {      \n gl_FragColor = vColor*texture2D(sTexture, vTextureCoord).aaaa;      \n}";

    public ShaderFillColorTexture() {
        createProgram();
    }

    public void createProgram() {
        super.createProgram(this.mVertexShader, this.mFragmentShader);
        this.maTextureHandle = GLES20.glGetAttribLocation(this.id, "aTextureCoord");
        x.a("glGetAttribLocation aTextureCoord");
        if (this.maTextureHandle == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
    }
}
