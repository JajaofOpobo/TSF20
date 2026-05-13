package com.tsf.shell.manager.n;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.b.f.h;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.g.c;
import com.censivn.C3DEngine.b.g.d;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.ShaderColor;
import java.nio.Buffer;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a implements e.a {
    private j a;
    private j b;
    private h c;
    private boolean d;
    private float e;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private C0133a q;
    private com.tsf.shell.manager.o.a.a s;
    private boolean r = false;
    private boolean t = false;
    private ArrayList<C0133a> p = new ArrayList<>();
    private int f = 1677721600;

    public a() {
        float red = Color.red(this.f);
        this.m = red;
        this.j = red;
        this.g = red;
        float green = Color.green(this.f);
        this.n = green;
        this.k = green;
        this.h = green;
        float blue = Color.blue(this.f);
        this.o = blue;
        this.l = blue;
        this.i = blue;
    }

    public void a(int i) {
        this.j = Color.red(i);
        this.k = Color.green(i);
        this.l = Color.blue(i);
        this.c.setAnimationObjectState(true);
        this.c.invalidate();
    }

    public void a() {
        this.j = this.g;
        this.k = this.h;
        this.l = this.i;
        this.c.setAnimationObjectState(true);
        this.c.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        float alpha = (this.c.alpha() / 255.0f) * MatrixStack.glColor().alpha * 0.5f;
        this.m += (this.j - this.m) * 0.1f;
        this.n += (this.k - this.n) * 0.1f;
        this.o += (this.l - this.o) * 0.1f;
        if (a(this.m, this.j) && a(this.n, this.k) && a(this.o, this.l)) {
            this.m = this.j;
            this.n = this.k;
            this.o = this.l;
            this.c.setAnimationObjectState(false);
        }
        float f = (this.m / 255.0f) * alpha;
        float f2 = (this.n / 255.0f) * alpha;
        float f3 = (this.o / 255.0f) * alpha;
        this.c.vertices().colors().set(2, f, f2, f3, alpha);
        this.c.vertices().colors().set(3, f, f2, f3, alpha);
        this.c.vertices().colors().set(0, 0.0f, 0.0f, 0.0f, 0.0f);
        this.c.vertices().colors().set(1, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    private boolean a(float f, float f2) {
        return Math.abs(f - f2) < 0.3f;
    }

    public float b() {
        return this.e;
    }

    public void a(j jVar) {
        this.a = jVar;
        this.b = new j();
        this.e = 100.0f * com.censivn.C3DEngine.b.b.a.c;
        this.c = new h(com.censivn.C3DEngine.b.b.a.D, 1.2f * this.e, false, true) { // from class: com.tsf.shell.manager.n.a.1
            @Override // com.censivn.C3DEngine.b.f.h, com.censivn.C3DEngine.b.f.i
            public void draw() {
                if (a.this.c.getAnimationObjectState() || a.this.r) {
                    a.this.c();
                }
                com.censivn.C3DEngine.a.e().a(this);
                updateTextureState();
                ShaderColor shaderColor = ShaderManager.SHADER_COLOR;
                ShaderManager.enableShader(shaderColor);
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
                a();
            }
        };
        this.c.moveAllPointsPX(0.0f, (-this.c.b()) / 2.0f, 0.0f);
        this.s = new com.tsf.shell.manager.o.a.a();
        this.s.i(-1);
        this.s.h(44);
        this.b.addChild(this.c);
        this.b.alpha(0.0f);
    }

    public C0133a a(C0133a c0133a) {
        return a(c0133a, (String) null, 1677721600, 0);
    }

    public C0133a a(C0133a c0133a, String str) {
        return a(c0133a, str, 1677721600, 0);
    }

    public C0133a a(final C0133a c0133a, String str, int i, int i2) {
        d();
        if (this.q != null) {
            this.q.a(false);
            this.q = null;
        }
        if (c0133a == null) {
            c0133a = a(str);
        } else {
            c0133a.a(str);
        }
        this.q = c0133a;
        this.p.remove(this.q);
        this.p.add(this.q);
        a();
        this.q.a(i);
        if (i2 != 0) {
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.n.a.2
                @Override // java.lang.Runnable
                public void run() {
                    c0133a.a = null;
                    a.this.b(c0133a);
                }
            };
            com.censivn.C3DEngine.a.a().b(runnable, i2);
            if (c0133a.a != null) {
                com.censivn.C3DEngine.a.a().g(c0133a.a);
            }
            c0133a.a = runnable;
        }
        return this.q;
    }

    public void b(C0133a c0133a) {
        if (c0133a != null) {
            if (c0133a == this.q) {
                this.q.a(true);
            } else {
                c0133a.d();
            }
            this.p.remove(c0133a);
            if (this.p.isEmpty()) {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.n.a.3
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.e();
                    }
                });
                return;
            }
            this.q = this.p.get(this.p.size() - 1);
            this.q.a();
        }
    }

    private C0133a a(String str) {
        return new C0133a(str);
    }

    private void d() {
        if (!this.t) {
            this.t = true;
            com.tsf.shell.manager.a.b.a(this);
            this.b.removeFromParent();
            this.a.addChild(this.b);
            this.c.a(com.censivn.C3DEngine.b.b.a.D);
            this.d = com.tsf.shell.manager.a.b.c();
            if (!this.d) {
                this.b.position().y = com.censivn.C3DEngine.b.b.a.I;
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.manager.n.a.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!com.tsf.shell.manager.a.b.c()) {
                            com.tsf.shell.manager.a.b.a(true, false, false);
                        }
                    }
                });
            } else {
                this.b.position().y = com.censivn.C3DEngine.b.b.a.I;
            }
            this.r = true;
            d dVar = new d() { // from class: com.tsf.shell.manager.n.a.5
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    a.this.r = false;
                }
            };
            dVar.a(255);
            c.a(this.b);
            c.a(this.b, 750, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.t && this.p.isEmpty()) {
            this.t = false;
            if (!this.d) {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.manager.n.a.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!com.tsf.shell.manager.a.b.c()) {
                            com.tsf.shell.manager.a.b.a(false, false, false);
                        }
                    }
                });
            }
            this.r = true;
            d dVar = new d() { // from class: com.tsf.shell.manager.n.a.7
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    a.this.r = false;
                    com.tsf.shell.manager.a.b.b(a.this);
                    a.this.b.removeFromParent();
                    a.this.a();
                }
            };
            dVar.a(0);
            c.a(this.b);
            c.a(this.b, 750, dVar);
        }
    }

    @Override // com.censivn.C3DEngine.b.c.e.a
    public void a(int i, int i2, int i3, int i4) {
        this.b.position().y = com.tsf.shell.manager.a.b.c() ? com.censivn.C3DEngine.b.b.a.B : com.censivn.C3DEngine.b.b.a.B + com.censivn.C3DEngine.b.b.a.J;
        this.c.a(com.censivn.C3DEngine.b.b.a.D);
    }

    /* renamed from: com.tsf.shell.manager.n.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0133a extends k {
        public Runnable a;
        private TextureElement e;
        private String f;
        private boolean g;
        private int h;

        @Override // com.censivn.C3DEngine.b.f.i
        public void onDrawStart() {
            if (this.g) {
                this.g = false;
                System.currentTimeMillis();
                Bitmap b = a.this.s.b(this.f);
                com.censivn.C3DEngine.a.g().a(this.e, b);
                b.recycle();
                a(this.e.width);
                b(this.e.height);
            }
        }

        public C0133a(String str) {
            super(0.0f, 0.0f);
            this.e = new TextureElement(0, false);
            this.f = "";
            this.g = false;
            position().y = 100.0f * com.censivn.C3DEngine.b.b.a.c;
            alpha(0.0f);
            textures().addElement(this.e);
            a(str);
            com.tsf.shell.manager.o.c.a(this, com.tsf.shell.manager.o.c.b);
        }

        public void a(String str) {
            if (str != null && !str.equals(this.f)) {
                this.g = true;
                this.f = str;
            }
        }

        protected void a() {
            a(this.h);
        }

        protected void a(int i) {
            this.h = i;
            if (this.e.id != 0 || this.g) {
                d dVar = new d();
                dVar.h((-a.this.e) / 2.0f);
                dVar.a(255);
                c.a(this);
                c.a(this, 500, dVar);
                if (parent() == null) {
                    a.this.b.addChild(this);
                }
                a.this.a(i);
            }
        }

        public void a(final boolean z) {
            d dVar = new d() { // from class: com.tsf.shell.manager.n.a.a.1
                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    C0133a.this.removeFromParent();
                    if (z) {
                        C0133a.this.d();
                    }
                }
            };
            dVar.a(0);
            dVar.h(100.0f * com.censivn.C3DEngine.b.b.a.c);
            c.a(this);
            c.a(this, 500, dVar);
            a.this.a();
        }

        public void d() {
            removeFromParent();
            if (this.e.id != 0) {
                com.censivn.C3DEngine.a.g().a(this.e);
            }
            this.f = "";
        }
    }
}
