package com.tsf.shell.f.f.b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.ShaderColorTexture;
import com.tsf.b;
import com.tsf.shell.f.f.j;
import java.nio.Buffer;
/* loaded from: classes.dex */
public class i extends com.tsf.shell.f.f.l {
    private com.censivn.C3DEngine.b.f.h a;
    private com.censivn.C3DEngine.b.f.h b;
    private com.censivn.C3DEngine.b.f.h c;

    public i(int i, boolean z) {
        super(i, b.d.desktop_transition_fold_page, z);
        this.a = new com.censivn.C3DEngine.b.f.h(com.censivn.C3DEngine.b.b.a.H, com.censivn.C3DEngine.b.b.a.G, false);
        this.b = new com.censivn.C3DEngine.b.f.h(com.censivn.C3DEngine.b.b.a.H, com.censivn.C3DEngine.b.b.a.G, false);
        this.c = new com.censivn.C3DEngine.b.f.h(com.censivn.C3DEngine.b.b.a.H, com.censivn.C3DEngine.b.b.a.G, false, true) { // from class: com.tsf.shell.f.f.b.i.1
            @Override // com.censivn.C3DEngine.b.f.h, com.censivn.C3DEngine.b.f.i
            public void draw() {
                com.censivn.C3DEngine.a.e().a(this);
                updateTextureState();
                ShaderColorTexture shaderColorTexture = ShaderManager.SHADER_COLOR_TEXTURE;
                ShaderManager.enableShader(shaderColorTexture);
                vertices().colors().buffer().position(0);
                GLES20.glEnableVertexAttribArray(shaderColorTexture.maColor4Handle);
                GLES20.glVertexAttribPointer(shaderColorTexture.maColor4Handle, 4, 5126, false, 0, (Buffer) vertices().colors().buffer());
                if (doubleSidedEnabled()) {
                    GLES20.glDisable(2884);
                } else {
                    GLES20.glEnable(2884);
                }
                drawMVPMatrix();
                drawElement();
                GLES20.glDisableVertexAttribArray(shaderColorTexture.maColor4Handle);
                a();
            }
        };
        this.a.uvs().setU(0, 0.5f);
        this.a.uvs().setU(2, 0.5f);
        this.b.uvs().setU(1, 0.5f);
        this.b.uvs().setU(3, 0.5f);
        this.a.useVBO(false);
        this.b.useVBO(false);
        this.c.useVBO(false);
        o();
    }

    private void o() {
        if (this.a != null) {
            this.a.a(com.censivn.C3DEngine.b.b.a.H);
            this.a.b(com.censivn.C3DEngine.b.b.a.G);
            this.b.a(com.censivn.C3DEngine.b.b.a.H);
            this.b.b(com.censivn.C3DEngine.b.b.a.G);
            this.c.points().setPX(0, 0.0f, -com.censivn.C3DEngine.b.b.a.I, 0.0f);
            this.c.points().setPX(1, -com.censivn.C3DEngine.b.b.a.H, -com.censivn.C3DEngine.b.b.a.I, 0.0f);
            this.c.points().setPX(2, 0.0f, com.censivn.C3DEngine.b.b.a.I, 0.0f);
            this.c.points().setPX(3, -com.censivn.C3DEngine.b.b.a.H, com.censivn.C3DEngine.b.b.a.I, 0.0f);
            this.a.position().x = (-com.censivn.C3DEngine.b.b.a.H) / 2.0f;
            this.b.position().x = com.censivn.C3DEngine.b.b.a.H / 2.0f;
        }
    }

    @Override // com.tsf.shell.f.f.l
    public void b(com.tsf.shell.f.f.g gVar, float f) {
        boolean i = com.tsf.shell.manager.a.f.i();
        j.a a = gVar.a(true, false);
        if (f > 0.0f) {
            this.b.textures().clear();
            this.b.textures().addElement(a.b);
            if (i) {
                this.b.alpha(255.0f);
            } else {
                float f2 = (1.0f - f) * 2.0f * 255.0f;
                this.b.alpha(f2 <= 255.0f ? f2 : 255.0f);
            }
            this.b.dispatchDraw();
            if (f <= 0.5f) {
                this.c.uvs().setU(0, 0.5f);
                this.c.uvs().setU(1, 0.0f);
                this.c.uvs().setU(2, 0.5f);
                this.c.uvs().setU(3, 0.0f);
                this.c.textures().clear();
                this.c.textures().addElement(a.b);
                this.c.rotation().y = 180.0f * f;
                this.c.doubleSidedEnabled(false);
                p();
                this.c.dispatchDraw();
            }
        } else if (f < 0.0f) {
            this.a.textures().clear();
            this.a.textures().addElement(a.b);
            if (i) {
                this.a.alpha(255.0f);
            } else {
                float f3 = (1.0f + f) * 2.0f * 255.0f;
                this.a.alpha(f3 <= 255.0f ? f3 : 255.0f);
            }
            this.a.dispatchDraw();
            if (f > -0.5f) {
                this.c.uvs().setU(0, 0.5f);
                this.c.uvs().setU(1, 1.0f);
                this.c.uvs().setU(2, 0.5f);
                this.c.uvs().setU(3, 1.0f);
                this.c.textures().clear();
                this.c.textures().addElement(a.b);
                this.c.rotation().y = (1.0f + f) * 180.0f;
                this.c.doubleSidedEnabled(true);
                p();
                this.c.dispatchDraw();
            }
        } else if (gVar.g == 0.0f) {
            this.a.alpha(255.0f);
            this.b.alpha(255.0f);
            this.a.textures().clear();
            this.a.textures().addElement(a.b);
            this.b.textures().clear();
            this.b.textures().addElement(a.b);
            this.b.dispatchDraw();
            this.a.dispatchDraw();
        }
    }

    private void p() {
        float abs = 1.0f - (Math.abs(Math.abs(this.c.rotation().y) - 90.0f) / 90.0f);
        float f = 1.0f - (0.5f * abs);
        this.c.vertices().colors().set(0, f, f, f, 1.0f);
        this.c.vertices().colors().set(2, f, f, f, 1.0f);
        float f2 = 1.0f - (0.8f * abs);
        this.c.vertices().colors().set(1, f2, f2, f2, 1.0f);
        this.c.vertices().colors().set(3, f2, f2, f2, 1.0f);
    }

    @Override // com.tsf.shell.f.f.l
    public void a(com.tsf.shell.f.f.g gVar, float f) {
        if (f > 0.0f) {
            if (f <= 0.5f) {
                gVar.setRendererPriorityLevel(1);
            } else {
                gVar.setRendererPriorityLevel(0);
            }
        } else if (f > -0.5f) {
            gVar.setRendererPriorityLevel(1);
        } else {
            gVar.setRendererPriorityLevel(0);
        }
    }

    @Override // com.tsf.shell.f.f.l
    public boolean a(com.tsf.shell.f.f.g gVar, com.censivn.C3DEngine.b.f.b.a aVar) {
        return false;
    }

    @Override // com.tsf.shell.f.f.l
    public void a(float f, float f2) {
        o();
    }

    @Override // com.tsf.shell.f.f.l
    public boolean a() {
        return true;
    }
}
