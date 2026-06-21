package com.tsf.shell.e.f.b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureDescription;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.UvBufferManager;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import java.nio.Buffer;

/* loaded from: classes.dex */
public class b extends com.censivn.C3DEngine.b.f.m {
    private com.censivn.C3DEngine.b.f.m a;
    private int d;
    private int e;
    private int f;
    private Number3d g;
    private float h;
    private boolean i;
    private TextureElement j;
    private TextureElement k;
    private TextureElement l;
    private UvBufferManager m;
    private UvBufferManager n;
    private boolean o;
    private float p;

    public b(float f, float f2, int i, int i2) {
        super(f, f2, i, i2, false);
        this.g = new Number3d();
        this.i = true;
        this.l = new TextureElement(0, false);
        this.o = false;
        this.d = i2 + 1;
        this.e = i + 1;
        this.a = new com.censivn.C3DEngine.b.f.m(f, f2, i, i2, false);
        this.h = 0.5f / (this.d - 1);
        this.f = this.d * this.e;
        useVBO(false);
        textures().addElement(this.l);
        this.m = vertices().uvs().m7clone();
        this.n = this.a.vertices().uvs().m7clone();
        b(f, f2);
    }

    public void c(float f) {
        this.p = f;
    }

    public void b(float f, float f2) {
        a(this, this.m, f, f2, false);
        a(this.a, this.n, f, f2, true);
    }

    public void a(TextureElement textureElement) {
        this.j = textureElement;
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
    public void dispatchDraw() {
        this.l.id = 0;
        if (this.k == null || this.k.id == 0) {
            this.k = com.tsf.shell.e.f.i.b();
        }
        this.l.id = this.k.id;
        alpha(this.p);
        this.o = true;
        super.dispatchDraw();
        if (this.j != null) {
            this.l.id = this.j.id;
        }
        alpha(255.0f);
        this.o = false;
        super.dispatchDraw();
    }

    public void a(com.censivn.C3DEngine.b.f.m mVar, UvBufferManager uvBufferManager, float f, float f2, boolean z) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = com.tsf.shell.e.f.i.b;
        float f8 = com.tsf.shell.e.f.i.c;
        int i = (int) (f8 / (f2 / (this.d - 1)));
        float f9 = f / 2.0f;
        float f10 = (f - (2.0f * f8)) / ((this.e - 2) - 1);
        float f11 = f2 / 2.0f;
        float f12 = (f2 - (2.0f * f8)) / ((this.d - 2) - (i * 2));
        float f13 = f8 / (i + 1);
        float f14 = f8 / f7;
        float f15 = 1.0f - (2.0f * f14);
        float f16 = f14 / (i + 1);
        int i2 = i + 1;
        int i3 = ((this.d - 2) - i) - 1;
        float f17 = f15 / ((i3 - i2) + 1);
        float f18 = f15 / (this.d - 3);
        float f19 = f11;
        for (int i4 = 0; i4 < this.d; i4++) {
            float f20 = (f2 - (f19 + f11)) / f2;
            if (i4 < i2) {
                f5 = i4 * f16;
                f6 = f13;
            } else if (i4 > i3) {
                f5 = (((i4 - i3) - 1) * f16) + (1.0f - f14);
                f6 = f13;
            } else {
                f5 = ((i4 - i2) * f17) + f14;
                f6 = f12;
            }
            for (int i5 = 0; i5 < this.e; i5++) {
                int i6 = (this.f - (this.e * i4)) - (i5 + 1);
                mVar.points().setYPX(i6, f19);
                mVar.uvs().setV(i6, 1.0f - f20);
                uvBufferManager.setV(i6, f5);
            }
            f19 -= f6;
        }
        float f21 = -f9;
        for (int i7 = 0; i7 < this.e; i7++) {
            float f22 = (f21 + f9) / f;
            if (i7 == 0) {
                f3 = 0.0f;
                f4 = f8;
            } else if (i7 == this.e - 2) {
                f3 = 1.0f - f14;
                f4 = f8;
            } else if (i7 == this.e - 1) {
                f3 = 1.0f;
                f4 = f8;
            } else {
                f3 = ((i7 - 1) * f18) + f14;
                f4 = f10;
            }
            for (int i8 = 0; i8 < this.d; i8++) {
                int i9 = (this.f - (this.e * i8)) - (i7 + 1);
                mVar.points().setXPX(i9, f21);
                mVar.uvs().setU(i9, f22);
                uvBufferManager.setU(i9, f3);
            }
            f21 += f4;
        }
        if (z) {
            for (int i10 = 0; i10 < mVar.uvs().size(); i10++) {
                mVar.uvs().setU(i10, 1.0f - mVar.uvs().getU(i10));
            }
            for (int i11 = 0; i11 < uvBufferManager.size(); i11++) {
                uvBufferManager.setU(i11, 1.0f - uvBufferManager.getU(i11));
            }
        }
    }

    public void a() {
        this.i = true;
    }

    public void d() {
        this.i = false;
    }

    public void d(float f) {
        float f2;
        float f3 = f % 1.0f;
        float f4 = ((int) f) * 180;
        for (int i = 0; i < this.d; i++) {
            if (f3 < 0.0f) {
                float f5 = ((i * this.h) + f3) / 0.5f;
                if (f5 < -1.0f) {
                    f5 = -1.0f;
                } else if (f5 > 0.0f) {
                    f5 = 0.0f;
                }
                f2 = f5;
            } else {
                float f6 = (f3 - (i * this.h)) / 0.5f;
                if (f6 < 0.0f) {
                    f6 = 0.0f;
                } else if (f6 > 1.0f) {
                    f6 = 1.0f;
                }
                f2 = f6;
            }
            int i2 = f3 > 0.0f ? (this.d - i) - 1 : i;
            for (int i3 = 0; i3 < this.e; i3++) {
                int i4 = (this.f - (this.e * i2)) - (i3 + 1);
                this.a.points().putInNumber3d(i4, this.g);
                this.g.rotateDegressY((180.0f * f2) + f4);
                points().setPX(i4, this.g);
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void drawObject_textures() {
        GLES20.glActiveTexture(33984);
        if (hasUvs() && texturesEnabled() && textures().size() > 0) {
            TextureDescription textureDescription = textures().get(0);
            if (textureDescription != null) {
                GLES20.glBindTexture(3553, textureDescription.textureElement.id);
            } else {
                GLES20.glBindTexture(3553, 0);
            }
            if (this.o) {
                if (this.i) {
                    this.m.buffer().position(0);
                    GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maTextureHandle, 2, 5126, false, 0, (Buffer) this.m.buffer());
                } else {
                    this.n.buffer().position(0);
                    GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maTextureHandle, 2, 5126, false, 0, (Buffer) this.n.buffer());
                }
            } else if (this.i) {
                vertices().uvs().buffer().position(0);
                GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maTextureHandle, 2, 5126, false, 0, (Buffer) vertices().uvs().buffer());
            } else {
                this.a.vertices().uvs().buffer().position(0);
                GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maTextureHandle, 2, 5126, false, 0, (Buffer) this.a.vertices().uvs().buffer());
            }
            GLES20.glEnableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
            return;
        }
        GLES20.glBindTexture(3553, 0);
    }
}
