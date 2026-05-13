package com.censivn.C3DEngine.p031b.p038f;

import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.ShaderColor;
import java.nio.Buffer;
/* renamed from: com.censivn.C3DEngine.b.f.d */
/* loaded from: classes.dex */
public class C0970d extends C0974h {

    /* renamed from: d */
    private int f2892d;

    /* renamed from: e */
    private int f2893e;

    /* renamed from: f */
    private float f2894f;

    /* renamed from: g */
    private float f2895g;

    /* renamed from: h */
    private float f2896h;

    /* renamed from: i */
    private float f2897i;

    /* renamed from: j */
    private float f2898j;

    /* renamed from: k */
    private float f2899k;

    /* renamed from: l */
    private float f2900l;

    /* renamed from: m */
    private float f2901m;

    public C0970d(float f, float f2) {
        super(f, f2, false, true);
    }

    /* renamed from: a */
    public void m10378a(int i, int i2) {
        this.f2892d = i;
        this.f2893e = i2;
        this.f2897i = Color.alpha(this.f2892d) / 255.0f;
        this.f2894f = (Color.red(this.f2892d) / 255.0f) * this.f2897i;
        this.f2895g = (Color.green(this.f2892d) / 255.0f) * this.f2897i;
        this.f2896h = (Color.blue(this.f2892d) / 255.0f) * this.f2897i;
        this.f2901m = Color.alpha(this.f2893e) / 255.0f;
        this.f2898j = (Color.red(this.f2893e) / 255.0f) * this.f2901m;
        this.f2899k = (Color.green(this.f2893e) / 255.0f) * this.f2901m;
        this.f2900l = (Color.blue(this.f2893e) / 255.0f) * this.f2901m;
    }

    @Override // com.censivn.C3DEngine.p031b.p038f.C0974h, com.censivn.C3DEngine.p031b.p038f.C0975i
    public void draw() {
        if (this.f2916c) {
            this.f2916c = false;
            updatePointsVBO();
        }
        C0853a.m10855e().m10774a(this);
        updateTextureState();
        ShaderColor shaderColor = ShaderManager.SHADER_COLOR;
        ShaderManager.enableShader(shaderColor);
        float alpha = (alpha() / 255.0f) * MatrixStack.glColor().alpha;
        float f = this.f2894f * alpha;
        float f2 = this.f2895g * alpha;
        float f3 = this.f2896h * alpha;
        float f4 = this.f2897i * alpha;
        vertices().colors().set(2, f, f2, f3, f4);
        vertices().colors().set(3, f, f2, f3, f4);
        float f5 = this.f2898j * alpha;
        float f6 = this.f2899k * alpha;
        float f7 = this.f2900l * alpha;
        float f8 = this.f2901m * alpha;
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
