package com.tsf.shell.p096f.p131f.p141b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureDescription;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.UvBufferManager;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p185p.C3595e;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.p096f.p131f.C2939h;
import com.tsf.shell.p096f.p131f.C2948l;
import java.nio.Buffer;
/* renamed from: com.tsf.shell.f.f.b.a */
/* loaded from: classes.dex */
public class C2878a extends C2948l {

    /* renamed from: a */
    private C0980j f9379a;

    /* renamed from: b */
    private C2881a f9380b;

    /* renamed from: c */
    private C2932g f9381c;

    /* renamed from: d */
    private C2932g f9382d;

    /* renamed from: e */
    private C2932g f9383e;

    /* renamed from: f */
    private int f9384f;

    /* renamed from: g */
    private C1013b f9385g;

    /* renamed from: h */
    private boolean f9386h;

    public C2878a(int i, boolean z) {
        super(i, C1306b.C1310d.desktop_transition_cloth, z);
        int i2;
        int i3;
        this.f9384f = 2;
        this.f9385g = new C1013b();
        this.f9386h = true;
        if (this.f9380b == null) {
            this.f9379a = new C0980j();
            if (C0892a.f2555F < C0892a.f2556G) {
                i2 = C0892a.f2555F;
                i3 = C0892a.f2556G;
            } else {
                i2 = C0892a.f2556G;
                i3 = C0892a.f2555F;
            }
            this.f9380b = new C2881a(C0892a.f2555F, C0892a.f2556G, (int) (i2 / (C0892a.f2569e * 50.0f)), (int) (i3 / (C0892a.f2569e * 8.0f)));
            this.f9379a.addChild(this.f9380b);
        }
        C3595e.C3597a m1929a = C3359a.f11087a.m1929a(C3595e.f11921f);
        if (m1929a.m1919a() && m1929a.f11938c == 110) {
            m4262m();
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: c */
    public void mo4134c() {
        this.f9381c = null;
        this.f9382d = null;
        this.f9383e = null;
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: e */
    public void mo4132e() {
        if (this.f9381c == null) {
            this.f9381c = C3359a.f11094h.m4031n();
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: b */
    public boolean mo4138b() {
        return this.f9386h;
    }

    /* renamed from: o */
    private void m4376o() {
        if (C3359a.f11094h.m4021s().m3917b()) {
            if (this.f9384f != 1) {
                this.f9384f = 1;
                final float f = this.f9379a.position().f2528z;
                C1017d c1017d = new C1017d() { // from class: com.tsf.shell.f.f.b.a.1
                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo518a(float f2) {
                        C2878a.this.f9380b.m4369c(255.0f * f2);
                        C2878a.this.f9379a.position().f2528z = f + (((-300.0f) - f) * f2);
                    }

                    @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                    /* renamed from: a */
                    public void mo732a() {
                        C2878a.this.f9386h = true;
                    }
                };
                C1014c.m10326a(this.f9385g);
                C1014c.m10325a(this.f9385g, VEasing.Linear.easeNone, c1017d);
                this.f9386h = false;
            }
        } else if (this.f9384f != 2) {
            this.f9384f = 2;
            final float f2 = this.f9379a.position().f2528z;
            C1017d c1017d2 = new C1017d() { // from class: com.tsf.shell.f.f.b.a.2
                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo518a(float f3) {
                    C2878a.this.f9380b.m4369c((1.0f - f3) * 255.0f);
                    C2878a.this.f9379a.position().f2528z = f2 + ((0.0f - f2) * f3);
                }

                @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
                /* renamed from: a */
                public void mo732a() {
                    C2878a.this.f9386h = true;
                }
            };
            C1014c.m10326a(this.f9385g);
            C1014c.m10325a(this.f9385g, VEasing.Linear.easeNone, c1017d2);
            this.f9386h = false;
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: b */
    public void mo4137b(float f, float f2) {
        m4376o();
        C2932g m4031n = C3359a.f11094h.m4031n();
        if (this.f9383e != null && this.f9383e != m4031n && Math.round(Math.abs(this.f9383e.f9541g - m4031n.f9541g)) % 2 != 0) {
            C2932g c2932g = this.f9381c;
            this.f9381c = this.f9382d;
            this.f9382d = c2932g;
        }
        this.f9383e = m4031n;
        m4383a(f2);
        if (this.f9381c != null && this.f9382d != null) {
            if (f > 0.0f) {
                if (f < 0.5f) {
                    m4374q();
                } else {
                    m4375p();
                }
            } else if (f > -0.5f) {
                m4374q();
            } else {
                m4375p();
            }
        }
    }

    /* renamed from: p */
    private void m4375p() {
        this.f9381c.setRendererPriorityLevel(0);
        this.f9382d.setRendererPriorityLevel(1);
    }

    /* renamed from: q */
    private void m4374q() {
        this.f9381c.setRendererPriorityLevel(1);
        this.f9382d.setRendererPriorityLevel(0);
    }

    /* renamed from: a */
    public void m4380a(C2932g c2932g) {
        if (this.f9381c == c2932g) {
            m4378b(c2932g);
        } else if (this.f9382d == c2932g) {
            m4377c(c2932g);
        } else if (this.f9381c == null || Math.abs(this.f9381c.f9541g) >= 1.0f) {
            m4378b(c2932g);
        } else {
            m4377c(c2932g);
        }
    }

    /* renamed from: b */
    private void m4378b(C2932g c2932g) {
        this.f9381c = c2932g;
        this.f9380b.m4373a();
        GLES20.glFrontFace(2305);
    }

    /* renamed from: c */
    private void m4377c(C2932g c2932g) {
        this.f9382d = c2932g;
        this.f9380b.m4368d();
        GLES20.glFrontFace(2304);
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: b */
    public void mo4136b(C2932g c2932g, float f) {
        c2932g.position().f2526x = 0.0f;
        this.f9380b.m4372a(c2932g.m4191j().f9574b);
        m4380a(c2932g);
        this.f9379a.dispatchDraw();
        GLES20.glFrontFace(2305);
    }

    /* renamed from: a */
    private void m4383a(float f) {
        this.f9380b.m4367d(f);
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public void mo4142a(float f, float f2) {
        if (this.f9380b != null) {
            this.f9380b.m4370b(f, f2);
        }
    }

    @Override // com.tsf.shell.p096f.p131f.C2948l
    /* renamed from: a */
    public boolean mo4143a() {
        return true;
    }

    /* renamed from: com.tsf.shell.f.f.b.a$a */
    /* loaded from: classes.dex */
    public static class C2881a extends C0981k {

        /* renamed from: a */
        private C0981k f9391a;

        /* renamed from: d */
        private int f9392d;

        /* renamed from: e */
        private int f9393e;

        /* renamed from: f */
        private int f9394f;

        /* renamed from: g */
        private Number3d f9395g;

        /* renamed from: h */
        private float f9396h;

        /* renamed from: i */
        private boolean f9397i;

        /* renamed from: j */
        private TextureElement f9398j;

        /* renamed from: k */
        private TextureElement f9399k;

        /* renamed from: l */
        private TextureElement f9400l;

        /* renamed from: m */
        private UvBufferManager f9401m;

        /* renamed from: n */
        private UvBufferManager f9402n;

        /* renamed from: o */
        private boolean f9403o;

        /* renamed from: p */
        private float f9404p;

        public C2881a(float f, float f2, int i, int i2) {
            super(f, f2, i, i2, false);
            this.f9395g = new Number3d();
            this.f9397i = true;
            this.f9400l = new TextureElement(0, false);
            this.f9403o = false;
            this.f9392d = i2 + 1;
            this.f9393e = i + 1;
            this.f9391a = new C0981k(f, f2, i, i2, false);
            this.f9396h = 0.5f / (this.f9392d - 1);
            this.f9394f = this.f9392d * this.f9393e;
            useVBO(false);
            textures().addElement(this.f9400l);
            this.f9401m = vertices().uvs().m13949clone();
            this.f9402n = this.f9391a.vertices().uvs().m13949clone();
            m4370b(f, f2);
        }

        /* renamed from: c */
        public void m4369c(float f) {
            this.f9404p = f;
        }

        /* renamed from: b */
        public void m4370b(float f, float f2) {
            m4371a(this, this.f9401m, f, f2, false);
            m4371a(this.f9391a, this.f9402n, f, f2, true);
        }

        /* renamed from: a */
        public void m4372a(TextureElement textureElement) {
            this.f9398j = textureElement;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0980j, com.censivn.C3DEngine.p031b.p038f.C0975i
        public void dispatchDraw() {
            this.f9400l.f2529id = 0;
            if (this.f9399k == null || this.f9399k.f2529id == 0) {
                this.f9399k = C2939h.m4169b();
            }
            this.f9400l.f2529id = this.f9399k.f2529id;
            alpha(this.f9404p);
            this.f9403o = true;
            super.dispatchDraw();
            if (this.f9398j != null) {
                this.f9400l.f2529id = this.f9398j.f2529id;
            }
            alpha(255.0f);
            this.f9403o = false;
            super.dispatchDraw();
        }

        /* renamed from: a */
        public void m4371a(C0981k c0981k, UvBufferManager uvBufferManager, float f, float f2, boolean z) {
            float f3;
            float f4;
            float f5;
            float f6;
            float f7 = C2939h.f9563c;
            int i = (int) (f7 / (f2 / (this.f9392d - 1)));
            float f8 = f / 2.0f;
            float f9 = (f - (2.0f * f7)) / ((this.f9393e - 2) - 1);
            float f10 = f2 / 2.0f;
            float f11 = (f2 - (2.0f * f7)) / ((this.f9392d - 2) - (i * 2));
            float f12 = f7 / (i + 1);
            float f13 = f7 / C2939h.f9562b;
            float f14 = 1.0f - (2.0f * f13);
            float f15 = f13 / (i + 1);
            int i2 = i + 1;
            int i3 = ((this.f9392d - 2) - i) - 1;
            float f16 = f14 / ((i3 - i2) + 1);
            float f17 = f14 / (this.f9392d - 3);
            float f18 = f10;
            for (int i4 = 0; i4 < this.f9392d; i4++) {
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
                for (int i5 = 0; i5 < this.f9393e; i5++) {
                    int i6 = (this.f9394f - (this.f9393e * i4)) - (i5 + 1);
                    c0981k.points().setYPX(i6, f18);
                    c0981k.uvs().setV(i6, 1.0f - f19);
                    uvBufferManager.setV(i6, f5);
                }
                f18 -= f6;
            }
            float f20 = -f8;
            for (int i7 = 0; i7 < this.f9393e; i7++) {
                float f21 = (f20 + f8) / f;
                if (i7 == 0) {
                    f3 = 0.0f;
                    f4 = f7;
                } else if (i7 == this.f9393e - 2) {
                    f3 = 1.0f - f13;
                    f4 = f7;
                } else if (i7 == this.f9393e - 1) {
                    f3 = 1.0f;
                    f4 = f7;
                } else {
                    f3 = ((i7 - 1) * f17) + f13;
                    f4 = f9;
                }
                for (int i8 = 0; i8 < this.f9392d; i8++) {
                    int i9 = (this.f9394f - (this.f9393e * i8)) - (i7 + 1);
                    c0981k.points().setXPX(i9, f20);
                    c0981k.uvs().setU(i9, f21);
                    uvBufferManager.setU(i9, f3);
                }
                f20 += f4;
            }
            if (z) {
                for (int i10 = 0; i10 < c0981k.uvs().size(); i10++) {
                    c0981k.uvs().setU(i10, 1.0f - c0981k.uvs().getU(i10));
                }
                for (int i11 = 0; i11 < uvBufferManager.size(); i11++) {
                    uvBufferManager.setU(i11, 1.0f - uvBufferManager.getU(i11));
                }
            }
        }

        /* renamed from: a */
        public void m4373a() {
            this.f9397i = true;
        }

        /* renamed from: d */
        public void m4368d() {
            this.f9397i = false;
        }

        /* renamed from: d */
        public void m4367d(float f) {
            float f2;
            float f3 = f % 1.0f;
            float f4 = ((int) f) * 180;
            for (int i = 0; i < this.f9392d; i++) {
                if (f3 < 0.0f) {
                    float f5 = ((i * this.f9396h) + f3) / 0.5f;
                    if (f5 < -1.0f) {
                        f5 = -1.0f;
                    } else if (f5 > 0.0f) {
                        f5 = 0.0f;
                    }
                    f2 = f5;
                } else {
                    float f6 = (f3 - (i * this.f9396h)) / 0.5f;
                    if (f6 < 0.0f) {
                        f6 = 0.0f;
                    } else if (f6 > 1.0f) {
                        f6 = 1.0f;
                    }
                    f2 = f6;
                }
                int i2 = f3 > 0.0f ? (this.f9392d - i) - 1 : i;
                for (int i3 = 0; i3 < this.f9393e; i3++) {
                    int i4 = (this.f9394f - (this.f9393e * i2)) - (i3 + 1);
                    this.f9391a.points().putInNumber3d(i4, this.f9395g);
                    this.f9395g.rotateDegressY((180.0f * f2) + f4);
                    points().setPX(i4, this.f9395g);
                }
            }
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void drawObject_textures() {
            GLES20.glActiveTexture(33984);
            if (hasUvs() && texturesEnabled() && textures().size() > 0) {
                TextureDescription textureDescription = textures().get(0);
                if (textureDescription != null) {
                    GLES20.glBindTexture(3553, textureDescription.textureElement.f2529id);
                } else {
                    GLES20.glBindTexture(3553, 0);
                }
                if (this.f9403o) {
                    if (this.f9397i) {
                        this.f9401m.buffer().position(0);
                        GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maTextureHandle, 2, 5126, false, 0, (Buffer) this.f9401m.buffer());
                    } else {
                        this.f9402n.buffer().position(0);
                        GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maTextureHandle, 2, 5126, false, 0, (Buffer) this.f9402n.buffer());
                    }
                } else if (this.f9397i) {
                    vertices().uvs().buffer().position(0);
                    GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maTextureHandle, 2, 5126, false, 0, (Buffer) vertices().uvs().buffer());
                } else {
                    this.f9391a.vertices().uvs().buffer().position(0);
                    GLES20.glVertexAttribPointer(ShaderManager.CURRENT_SHADER.maTextureHandle, 2, 5126, false, 0, (Buffer) this.f9391a.vertices().uvs().buffer());
                }
                GLES20.glEnableVertexAttribArray(ShaderManager.CURRENT_SHADER.maTextureHandle);
                return;
            }
            GLES20.glBindTexture(3553, 0);
        }
    }
}
