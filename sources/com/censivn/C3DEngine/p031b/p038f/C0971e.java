package com.censivn.C3DEngine.p031b.p038f;

import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.ShaderColor;
import java.nio.Buffer;
/* renamed from: com.censivn.C3DEngine.b.f.e */
/* loaded from: classes.dex */
public class C0971e extends C0974h {

    /* renamed from: d */
    private int f2902d;

    /* renamed from: e */
    private int f2903e;

    /* renamed from: f */
    private float f2904f;

    /* renamed from: g */
    private float f2905g;

    /* renamed from: h */
    private float f2906h;

    /* renamed from: i */
    private float f2907i;

    /* renamed from: j */
    private float f2908j;

    /* renamed from: k */
    private float f2909k;

    /* renamed from: l */
    private float f2910l;

    /* renamed from: m */
    private float f2911m;

    public C0971e(float f, float f2) {
        super(f, f2, false, true);
    }

    /* renamed from: a */
    public void m10377a(int i, int i2) {
        this.f2902d = i;
        this.f2903e = i2;
        this.f2907i = Color.alpha(this.f2902d) / 255.0f;
        this.f2904f = (Color.red(this.f2902d) / 255.0f) * this.f2907i;
        this.f2905g = (Color.green(this.f2902d) / 255.0f) * this.f2907i;
        this.f2906h = (Color.blue(this.f2902d) / 255.0f) * this.f2907i;
        this.f2911m = Color.alpha(this.f2903e) / 255.0f;
        this.f2908j = (Color.red(this.f2903e) / 255.0f) * this.f2911m;
        this.f2909k = (Color.green(this.f2903e) / 255.0f) * this.f2911m;
        this.f2910l = (Color.blue(this.f2903e) / 255.0f) * this.f2911m;
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
        float f = this.f2904f * alpha;
        float f2 = this.f2905g * alpha;
        float f3 = this.f2906h * alpha;
        float f4 = this.f2907i * alpha;
        vertices().colors().set(1, f, f2, f3, f4);
        vertices().colors().set(3, f, f2, f3, f4);
        float f5 = this.f2908j * alpha;
        float f6 = this.f2909k * alpha;
        float f7 = this.f2910l * alpha;
        float f8 = this.f2911m * alpha;
        vertices().colors().set(0, f5, f6, f7, f8);
        vertices().colors().set(2, f5, f6, f7, f8);
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
