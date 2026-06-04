package com.tsf.shell.workspace3D.g.d;

import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.ShaderFillColorTexture;

/* loaded from: classes.dex */
public final class ap extends com.censivn.C3DEngine.e.b implements o {
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    private boolean K;
    private float L;
    private int M;
    private r N;
    private float O;
    private boolean P;
    public float a;

    public ap(float f, float f2, float f3, int i, int i2, com.censivn.C3DEngine.b.l lVar) {
        super(f, f2, (byte) 0);
        this.K = false;
        if (i == 0 && i2 == 0) {
            this.P = false;
        } else {
            this.P = true;
        }
        this.O = f3;
        c(0.0f, f3, 0.0f);
        ar();
        e(this.l[0] + (com.censivn.C3DEngine.a.b * 30.0f));
        c(this.k[0] - (com.censivn.C3DEngine.a.b * 30.0f));
        f(this.k[1] + (com.censivn.C3DEngine.a.b * 30.0f));
        d(this.m[1] - (com.censivn.C3DEngine.a.b * 30.0f));
        a(lVar);
        this.H = Color.red(i);
        this.I = Color.green(i);
        this.J = Color.blue(i);
        this.E = Color.red(i2);
        this.F = Color.green(i2);
        this.G = Color.blue(i2);
        aI();
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final Number3d l() {
        Number3d.TEMPNUMBER3D4.reset();
        Number3d.TEMPNUMBER3D4.y = this.O;
        c(Number3d.TEMPNUMBER3D4);
        return Number3d.TEMPNUMBER3D4;
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void a(r rVar) {
        this.N = rVar;
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final r m() {
        return this.N;
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void n() {
        b(0.0f);
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final float o() {
        return this.L;
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void g(float f) {
        this.L = f;
    }

    @Override // com.censivn.C3DEngine.b.r
    public final void e() {
        if (this.P) {
            c.a(this);
            X();
            ShaderFillColorTexture shaderFillColorTexture = ShaderManager.SHADER_FILL_COLOR_TEXTURE;
            ShaderManager.enableShader(shaderFillColorTexture);
            float I = I() / 255.0f;
            J().r = (short) (r2.r + ((this.a - J().r) * 0.15f));
            J().g = (short) (r2.g + ((this.C - J().g) * 0.15f));
            J().b = (short) (r2.b + ((this.D - J().b) * 0.15f));
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
        super.e();
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void a(TextureElement textureElement) {
        z().d();
        z().c(textureElement);
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void p() {
        z().d();
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void a(int i, float f) {
        M().z = f - 90.0f;
        com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
        uVar.a(255);
        uVar.e(f);
        uVar.b(i * 50);
        uVar.a(com.censivn.C3DEngine.g.a.a);
        com.censivn.C3DEngine.g.s.a(this, 350, uVar);
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void a(int i) {
        this.M = i;
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final int aH() {
        return this.M;
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void aI() {
        this.a = this.H;
        this.C = this.I;
        this.D = this.J;
        J().r = (short) this.H;
        J().g = (short) this.I;
        J().b = (short) this.J;
    }

    @Override // com.tsf.shell.workspace3D.g.d.o
    public final void h(boolean z) {
        this.K = z;
        if (this.K) {
            this.a = this.E;
            this.C = this.F;
            this.D = this.G;
        } else {
            this.a = this.H;
            this.C = this.I;
            this.D = this.J;
        }
    }
}
