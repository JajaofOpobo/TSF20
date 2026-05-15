package com.censivn.C3DEngine.b.f;

import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.ShaderColor;
import java.nio.Buffer;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends h {
    private int d;
    private int e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;

    public d(float f, float f2) {
        super(f, f2, false, true);
    }

    public void a(int i, int i2) {
        this.d = i;
        this.e = i2;
        this.i = Color.alpha(this.d) / 255.0f;
        this.f = (Color.red(this.d) / 255.0f) * this.i;
        this.g = (Color.green(this.d) / 255.0f) * this.i;
        this.h = (Color.blue(this.d) / 255.0f) * this.i;
        this.m = Color.alpha(this.e) / 255.0f;
        this.j = (Color.red(this.e) / 255.0f) * this.m;
        this.k = (Color.green(this.e) / 255.0f) * this.m;
        this.l = (Color.blue(this.e) / 255.0f) * this.m;
    }

    @Override // com.censivn.C3DEngine.b.f.h, com.censivn.C3DEngine.b.f.i
    public void draw() {
        if (this.c) {
            this.c = false;
            updatePointsVBO();
        }
        com.censivn.C3DEngine.a.e().a(this);
        updateTextureState();
        ShaderColor shaderColor = ShaderManager.SHADER_COLOR;
        ShaderManager.enableShader(shaderColor);
        float fAlpha = (alpha() / 255.0f) * MatrixStack.glColor().alpha;
        float f = this.f * fAlpha;
        float f2 = this.g * fAlpha;
        float f3 = this.h * fAlpha;
        float f4 = this.i * fAlpha;
        vertices().colors().set(2, f, f2, f3, f4);
        vertices().colors().set(3, f, f2, f3, f4);
        float f5 = this.j * fAlpha;
        float f6 = this.k * fAlpha;
        float f7 = this.l * fAlpha;
        float f8 = this.m * fAlpha;
        vertices().colors().set(0, f5, f6, f7, f8);
        vertices().colors().set(1, f5, f6, f7, f8);
        vertices().colors().buffer().position(0);
        GLES20.glEnableVertexAttribArray(shaderColor.maColor4Handle);
        GLES20.glVertexAttribPointer(shaderColor.maColor4Handle, 4, 5126, false, 0, (Buffer) vertices().colors().buffer());
        if (doubleSidedEnabled()) {
            GLES20.glDisable(2884);
        } else {
            GLES20.glEnable(2884);
        }
        drawMVPMatrix();
        drawElement();
        GLES20.glDisableVertexAttribArray(shaderColor.maColor4Handle);
    }
}
