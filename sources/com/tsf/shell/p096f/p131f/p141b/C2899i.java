package com.tsf.shell.p096f.p131f.p141b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.ShaderColorTexture;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0974h;
import com.censivn.C3DEngine.p031b.p038f.p040b.C0967a;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2942j;
import com.tsf.shell.p096f.p131f.C2948l;
import java.nio.Buffer;
/* renamed from: com.tsf.shell.f.f.b.i */
/* loaded from: classes.dex */
public class C2899i extends C2948l {

    /* renamed from: a */
    private C0974h f9432a;

    /* renamed from: b */
    private C0974h f9433b;

    /* renamed from: c */
    private C0974h f9434c;

    public C2899i(int i, boolean z) {
        super(i, C1306b.C1310d.desktop_transition_fold_page, z);
        this.f9432a = new C0974h(C0892a.f2557H, C0892a.f2556G, false);
        this.f9433b = new C0974h(C0892a.f2557H, C0892a.f2556G, false);
        this.f9434c = new C0974h(C0892a.f2557H, C0892a.f2556G, false, true) { // from class: com.tsf.shell.f.f.b.i.1
            @Override // com.censivn.C3DEngine.p031b.p038f.C0974h, com.censivn.C3DEngine.p031b.p038f.C0975i
            public void draw() {
                C0853a.m10855e().m10774a(this);
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
                m10374a();
            }
        };
        this.f9432a.uvs().setU(0, 0.5f);
        this.f9432a.uvs().setU(2, 0.5f);
        this.f9433b.uvs().setU(1, 0.5f);
        this.f9433b.uvs().setU(3, 0.5f);
        this.f9432a.useVBO(false);
        this.f9433b.useVBO(false);
        this.f9434c.useVBO(false);
        m4354o();
    }

    /* renamed from: o */
    private void m4354o() {
        if (this.f9432a != null) {
            this.f9432a.m10373a(C0892a.f2557H);
            this.f9432a.m10371b(C0892a.f2556G);
            this.f9433b.m10373a(C0892a.f2557H);
            this.f9433b.m10371b(C0892a.f2556G);
            this.f9434c.points().setPX(0, 0.0f, -C0892a.f2558I, 0.0f);
            this.f9434c.points().setPX(1, -C0892a.f2557H, -C0892a.f2558I, 0.0f);
            this.f9434c.points().setPX(2, 0.0f, C0892a.f2558I, 0.0f);
            this.f9434c.points().setPX(3, -C0892a.f2557H, C0892a.f2558I, 0.0f);
            this.f9432a.position().f2526x = (-C0892a.f2557H) / 2.0f;
            this.f9433b.position().f2526x = C0892a.f2557H / 2.0f;
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: b */
    public void mo4136b(C2932g c2932g, float f) {
        boolean m1575i = C3359a.f11092f.m1575i();
        C2942j.C2943a m4218a = c2932g.m4218a(true, false);
        if (f > 0.0f) {
            this.f9433b.textures().clear();
            this.f9433b.textures().addElement(m4218a.f9574b);
            if (m1575i) {
                this.f9433b.alpha(255.0f);
            } else {
                float f2 = (1.0f - f) * 2.0f * 255.0f;
                this.f9433b.alpha(f2 <= 255.0f ? f2 : 255.0f);
            }
            this.f9433b.dispatchDraw();
            if (f <= 0.5f) {
                this.f9434c.uvs().setU(0, 0.5f);
                this.f9434c.uvs().setU(1, 0.0f);
                this.f9434c.uvs().setU(2, 0.5f);
                this.f9434c.uvs().setU(3, 0.0f);
                this.f9434c.textures().clear();
                this.f9434c.textures().addElement(m4218a.f9574b);
                this.f9434c.rotation().f2527y = 180.0f * f;
                this.f9434c.doubleSidedEnabled(false);
                m4353p();
                this.f9434c.dispatchDraw();
            }
        } else if (f < 0.0f) {
            this.f9432a.textures().clear();
            this.f9432a.textures().addElement(m4218a.f9574b);
            if (m1575i) {
                this.f9432a.alpha(255.0f);
            } else {
                float f3 = (1.0f + f) * 2.0f * 255.0f;
                this.f9432a.alpha(f3 <= 255.0f ? f3 : 255.0f);
            }
            this.f9432a.dispatchDraw();
            if (f > -0.5f) {
                this.f9434c.uvs().setU(0, 0.5f);
                this.f9434c.uvs().setU(1, 1.0f);
                this.f9434c.uvs().setU(2, 0.5f);
                this.f9434c.uvs().setU(3, 1.0f);
                this.f9434c.textures().clear();
                this.f9434c.textures().addElement(m4218a.f9574b);
                this.f9434c.rotation().f2527y = (1.0f + f) * 180.0f;
                this.f9434c.doubleSidedEnabled(true);
                m4353p();
                this.f9434c.dispatchDraw();
            }
        } else if (c2932g.f9541g == 0.0f) {
            this.f9432a.alpha(255.0f);
            this.f9433b.alpha(255.0f);
            this.f9432a.textures().clear();
            this.f9432a.textures().addElement(m4218a.f9574b);
            this.f9433b.textures().clear();
            this.f9433b.textures().addElement(m4218a.f9574b);
            this.f9433b.dispatchDraw();
            this.f9432a.dispatchDraw();
        }
    }

    /* renamed from: p */
    private void m4353p() {
        float abs = 1.0f - (Math.abs(Math.abs(this.f9434c.rotation().f2527y) - 90.0f) / 90.0f);
        float f = 1.0f - (0.5f * abs);
        this.f9434c.vertices().colors().set(0, f, f, f, 1.0f);
        this.f9434c.vertices().colors().set(2, f, f, f, 1.0f);
        float f2 = 1.0f - (0.8f * abs);
        this.f9434c.vertices().colors().set(1, f2, f2, f2, 1.0f);
        this.f9434c.vertices().colors().set(3, f2, f2, f2, 1.0f);
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public void mo4141a(C2932g c2932g, float f) {
        if (f > 0.0f) {
            if (f <= 0.5f) {
                c2932g.setRendererPriorityLevel(1);
            } else {
                c2932g.setRendererPriorityLevel(0);
            }
        } else if (f > -0.5f) {
            c2932g.setRendererPriorityLevel(1);
        } else {
            c2932g.setRendererPriorityLevel(0);
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public boolean mo4140a(C2932g c2932g, C0967a c0967a) {
        return false;
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public void mo4142a(float f, float f2) {
        m4354o();
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public boolean mo4143a() {
        return true;
    }
}
