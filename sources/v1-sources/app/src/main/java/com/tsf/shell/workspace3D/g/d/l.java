package com.tsf.shell.workspace3D.g.d;

import android.opengl.GLES20;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.ShaderFillColorTexture;

/* loaded from: classes.dex */
final class l extends com.censivn.C3DEngine.e.b {
    final /* synthetic */ k a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(k kVar, float f, float f2) {
        super(f, f2, (byte) 0);
        this.a = kVar;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void e() {
        r rVar;
        boolean z;
        rVar = this.a.S;
        if (!rVar.i) {
            z = this.a.M;
            if (z) {
                c.a(this);
                X();
                ShaderFillColorTexture shaderFillColorTexture = ShaderManager.SHADER_FILL_COLOR_TEXTURE;
                ShaderManager.enableShader(shaderFillColorTexture);
                float I = I() / 255.0f;
                J().r = (short) (r2.r + ((this.a.a - J().r) * 0.15f));
                J().g = (short) (r2.g + ((this.a.A - J().g) * 0.15f));
                J().b = (short) (r2.b + ((this.a.B - J().b) * 0.15f));
                GLES20.glVertexAttrib4f(shaderFillColorTexture.maColor4Handle, (J().r / 255.0f) * I, (J().g / 255.0f) * I, (J().b / 255.0f) * I, I);
                if (B()) {
                    GLES20.glDisable(2884);
                } else {
                    GLES20.glEnable(2884);
                }
                g();
                h();
                return;
            }
        }
        super.e();
    }
}
