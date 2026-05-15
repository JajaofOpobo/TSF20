package com.censivn.C3DEngine.common.shader;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.tsf.shell.utils.s;
import com.tsf.shell.utils.x;
import java.nio.Buffer;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ShaderColor extends Shader {
    public int maColor4Handle;
    public String mVertexShader = "uniform mat4 uMVPMatrix;      \nattribute vec2 aTextureCoord;      \nattribute vec4 aPosition;      \nvarying vec2 vTextureCoord;      \nattribute vec4 aColor;      \nvarying vec4 vColor;      \nvoid main() {      \ngl_Position = uMVPMatrix * aPosition;      \n vTextureCoord = aTextureCoord;      \n vColor = aColor;      \n}";
    public String mFragmentShader = "precision mediump float;      \nvarying vec2 vTextureCoord;      \nuniform sampler2D sTexture;      \nvarying vec4 vColor;      \nvoid main() {      \n gl_FragColor = vColor;   \n}";

    public ShaderColor() {
        createProgram(this.mVertexShader, this.mFragmentShader);
    }

    public void createProgram(String str, String str2) {
        this.id = s.a(str, str2);
        if (this.id == 0) {
            throw new RuntimeException("Could create shader program");
        }
        this.maPositionHandle = GLES20.glGetAttribLocation(this.id, "aPosition");
        x.a("glGetAttribLocation aPosition");
        if (this.maPositionHandle == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        this.maColor4Handle = GLES20.glGetAttribLocation(this.id, "aColor");
        x.a("glGetAttribLocation aColor");
        if (this.maColor4Handle == -1) {
            throw new RuntimeException("Could not get attrib location for aColor");
        }
        this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.id, "uMVPMatrix");
        x.a("glGetUniformLocation uMVPMatrix");
        if (this.muMVPMatrixHandle == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
    }

    public void glColorPointer(int i, int i2, boolean z, int i3, Buffer buffer) {
        GLES20.glEnableVertexAttribArray(this.maColor4Handle);
        GLES20.glVertexAttribPointer(this.maColor4Handle, i, i2, z, i3, buffer);
    }

    public void glColor4f(int i, int i2, int i3, int i4) {
        float f = i / 255.0f;
        GLES20.glVertexAttrib4f(this.maColor4Handle, (i2 / 255.0f) * f, (i3 / 255.0f) * f, (i4 / 255.0f) * f, f);
    }

    public void glColor4f(VObject3d vObject3d) {
        float fAlpha = vObject3d.alpha() / 255.0f;
        GLES20.glVertexAttrib4f(this.maColor4Handle, (vObject3d.defaultColor().r / 255.0f) * fAlpha, (vObject3d.defaultColor().g / 255.0f) * fAlpha, (vObject3d.defaultColor().b / 255.0f) * fAlpha, fAlpha);
    }
}
