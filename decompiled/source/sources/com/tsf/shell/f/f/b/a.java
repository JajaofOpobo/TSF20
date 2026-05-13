package com.tsf.shell.f.f.b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureDescription;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.UvBufferManager;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.tsf.b;
import com.tsf.shell.manager.p.e;
import java.nio.Buffer;
/* loaded from: classes.dex */
public class a extends com.tsf.shell.f.f.l {
    private com.censivn.C3DEngine.b.f.j a;
    private C0108a b;
    private com.tsf.shell.f.f.g c;
    private com.tsf.shell.f.f.g d;
    private com.tsf.shell.f.f.g e;
    private int f;
    private com.censivn.C3DEngine.b.g.b.b g;
    private boolean h;

    public a(int i, boolean z) {
        super(i, b.d.desktop_transition_cloth, z);
        int i2;
        int i3;
        this.f = 2;
        this.g = new com.censivn.C3DEngine.b.g.b.b();
        this.h = true;
        if (this.b == null) {
            this.a = new com.censivn.C3DEngine.b.f.j();
            if (com.censivn.C3DEngine.b.b.a.F < com.censivn.C3DEngine.b.b.a.G) {
                i2 = com.censivn.C3DEngine.b.b.a.F;
                i3 = com.censivn.C3DEngine.b.b.a.G;
            } else {
                i2 = com.censivn.C3DEngine.b.b.a.G;
                i3 = com.censivn.C3DEngine.b.b.a.F;
            }
            this.b = new C0108a(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G, (int) (i2 / (com.censivn.C3DEngine.b.b.a.e * 50.0f)), (int) (i3 / (com.censivn.C3DEngine.b.b.a.e * 8.0f)));
            this.a.addChild(this.b);
        }
        e.a a = com.tsf.shell.manager.a.a.a(com.tsf.shell.manager.p.e.f);
        if (a.a() && a.c == 110) {
            m();
        }
    }

    @Override // com.tsf.shell.f.f.l
    public void c() {
        this.c = null;
        this.d = null;
        this.e = null;
    }

    @Override // com.tsf.shell.f.f.l
    public void e() {
        if (this.c == null) {
            this.c = com.tsf.shell.manager.a.h.n();
        }
    }

    @Override // com.tsf.shell.f.f.l
    public boolean b() {
        return this.h;
    }

    private void o() {
        if (com.tsf.shell.manager.a.h.s().b()) {
            if (this.f != 1) {
                this.f = 1;
                final float f = this.a.position().z;
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.b.a.1
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a(float f2) {
                        a.this.b.c(255.0f * f2);
                        a.this.a.position().z = f + (((-300.0f) - f) * f2);
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        a.this.h = true;
                    }
                };
                com.censivn.C3DEngine.b.g.c.a(this.g);
                com.censivn.C3DEngine.b.g.c.a(this.g, VEasing.Linear.easeNone, dVar);
                this.h = false;
            }
        } else if (this.f != 2) {
            this.f = 2;
            final float f2 = this.a.position().z;
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.b.a.2
                @Override // com.censivn.C3DEngine.b.g.d
                public void a(float f3) {
                    a.this.b.c((1.0f - f3) * 255.0f);
                    a.this.a.position().z = f2 + ((0.0f - f2) * f3);
                }

                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    a.this.h = true;
                }
            };
            com.censivn.C3DEngine.b.g.c.a(this.g);
            com.censivn.C3DEngine.b.g.c.a(this.g, VEasing.Linear.easeNone, dVar2);
            this.h = false;
        }
    }

    @Override // com.tsf.shell.f.f.l
    public void b(float f, float f2) {
        o();
        com.tsf.shell.f.f.g n = com.tsf.shell.manager.a.h.n();
        if (this.e != null && this.e != n && Math.round(Math.abs(this.e.g - n.g)) % 2 != 0) {
            com.tsf.shell.f.f.g gVar = this.c;
            this.c = this.d;
            this.d = gVar;
        }
        this.e = n;
        a(f2);
        if (this.c != null && this.d != null) {
            if (f > 0.0f) {
                if (f < 0.5f) {
                    q();
                } else {
                    p();
                }
            } else if (f > -0.5f) {
                q();
            } else {
                p();
            }
        }
    }

    private void p() {
        this.c.setRendererPriorityLevel(0);
        this.d.setRendererPriorityLevel(1);
    }

    private void q() {
        this.c.setRendererPriorityLevel(1);
        this.d.setRendererPriorityLevel(0);
    }

    public void a(com.tsf.shell.f.f.g gVar) {
        if (this.c == gVar) {
            b(gVar);
        } else if (this.d == gVar) {
            c(gVar);
        } else if (this.c == null || Math.abs(this.c.g) >= 1.0f) {
            b(gVar);
        } else {
            c(gVar);
        }
    }

    private void b(com.tsf.shell.f.f.g gVar) {
        this.c = gVar;
        this.b.a();
        GLES20.glFrontFace(2305);
    }

    private void c(com.tsf.shell.f.f.g gVar) {
        this.d = gVar;
        this.b.d();
        GLES20.glFrontFace(2304);
    }

    @Override // com.tsf.shell.f.f.l
    public void b(com.tsf.shell.f.f.g gVar, float f) {
        gVar.position().x = 0.0f;
        this.b.a(gVar.j().b);
        a(gVar);
        this.a.dispatchDraw();
        GLES20.glFrontFace(2305);
    }

    private void a(float f) {
        this.b.d(f);
    }

    @Override // com.tsf.shell.f.f.l
    public void a(float f, float f2) {
        if (this.b != null) {
            this.b.b(f, f2);
        }
    }

    @Override // com.tsf.shell.f.f.l
    public boolean a() {
        return true;
    }

    /* renamed from: com.tsf.shell.f.f.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0108a extends com.censivn.C3DEngine.b.f.k {
        private com.censivn.C3DEngine.b.f.k a;
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

        public C0108a(float f, float f2, int i, int i2) {
            super(f, f2, i, i2, false);
            this.g = new Number3d();
            this.i = true;
            this.l = new TextureElement(0, false);
            this.o = false;
            this.d = i2 + 1;
            this.e = i + 1;
            this.a = new com.censivn.C3DEngine.b.f.k(f, f2, i, i2, false);
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

        @Override // com.censivn.C3DEngine.b.f.j, com.censivn.C3DEngine.b.f.i
        public void dispatchDraw() {
            this.l.id = 0;
            if (this.k == null || this.k.id == 0) {
                this.k = com.tsf.shell.f.f.h.b();
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

        public void a(com.censivn.C3DEngine.b.f.k kVar, UvBufferManager uvBufferManager, float f, float f2, boolean z) {
            float f3;
            float f4;
            float f5;
            float f6;
            float f7 = com.tsf.shell.f.f.h.c;
            int i = (int) (f7 / (f2 / (this.d - 1)));
            float f8 = f / 2.0f;
            float f9 = (f - (2.0f * f7)) / ((this.e - 2) - 1);
            float f10 = f2 / 2.0f;
            float f11 = (f2 - (2.0f * f7)) / ((this.d - 2) - (i * 2));
            float f12 = f7 / (i + 1);
            float f13 = f7 / com.tsf.shell.f.f.h.b;
            float f14 = 1.0f - (2.0f * f13);
            float f15 = f13 / (i + 1);
            int i2 = i + 1;
            int i3 = ((this.d - 2) - i) - 1;
            float f16 = f14 / ((i3 - i2) + 1);
            float f17 = f14 / (this.d - 3);
            float f18 = f10;
            for (int i4 = 0; i4 < this.d; i4++) {
                float f19 = (f2 - (f18 + f10)) / f2;
                if (i4 < i2) {
                    f5 = i4 * f15;
                    f6 = f12;
                } else if (i4 > i3) {
                    f5 = (((i4 - i3) - 1) * f15) + (1.0f - f13);
                    f6 = f12;
                } else {
                    f5 = ((i4 - i2) * f16) + f13;
                    f6 = f11;
                }
                for (int i5 = 0; i5 < this.e; i5++) {
                    int i6 = (this.f - (this.e * i4)) - (i5 + 1);
                    kVar.points().setYPX(i6, f18);
                    kVar.uvs().setV(i6, 1.0f - f19);
                    uvBufferManager.setV(i6, f5);
                }
                f18 -= f6;
            }
            float f20 = -f8;
            for (int i7 = 0; i7 < this.e; i7++) {
                float f21 = (f20 + f8) / f;
                if (i7 == 0) {
                    f3 = 0.0f;
                    f4 = f7;
                } else if (i7 == this.e - 2) {
                    f3 = 1.0f - f13;
                    f4 = f7;
                } else if (i7 == this.e - 1) {
                    f3 = 1.0f;
                    f4 = f7;
                } else {
                    f3 = ((i7 - 1) * f17) + f13;
                    f4 = f9;
                }
                for (int i8 = 0; i8 < this.d; i8++) {
                    int i9 = (this.f - (this.e * i8)) - (i7 + 1);
                    kVar.points().setXPX(i9, f20);
                    kVar.uvs().setU(i9, f21);
                    uvBufferManager.setU(i9, f3);
                }
                f20 += f4;
            }
            if (z) {
                for (int i10 = 0; i10 < kVar.uvs().size(); i10++) {
                    kVar.uvs().setU(i10, 1.0f - kVar.uvs().getU(i10));
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

        @Override // com.censivn.C3DEngine.b.f.i
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
}
