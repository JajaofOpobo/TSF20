package com.censivn.C3DEngine.b.f.a;

import android.opengl.GLES20;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.common.renderer.MatrixStack;
import com.censivn.C3DEngine.common.renderer.ShaderManager;
import com.censivn.C3DEngine.common.shader.ShaderColorTexture;
import com.tsf.shell.utils.x;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends j {
    private int a;
    public int b;
    private float c;
    private float d;
    private b e;
    private ArrayList<b> f;
    private i g;
    private boolean h;
    private boolean i;
    private com.censivn.C3DEngine.b.d.a j;
    private boolean k;
    private boolean l;

    public a(int i, int i2, int i3, boolean z) {
        this(i, i2, i3, i3, null, z);
    }

    public a(int i, int i2, int i3) {
        this(i, i2, i3, i3, null, false);
    }

    public a(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, null, false);
    }

    public a(int i, int i2, int i3, int i4, i iVar, boolean z) {
        super(((i * 2) - 1) * 4 * 1, ((i * 2) - 1) * 2 * 1, true, true, Boolean.valueOf(z));
        this.b = 16;
        this.h = false;
        this.i = false;
        this.k = false;
        this.l = false;
        this.k = z;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.f = new ArrayList<>();
        this.g = iVar;
        a(0.0f, 0.0f, (i * 2) - 1, 1, new Color4(255, 50, 0, 100));
    }

    public void a(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void draw() {
        if (this.k) {
            com.censivn.C3DEngine.a.e().a(this);
            updateTextureState();
            ShaderColorTexture shaderColorTexture = ShaderManager.SHADER_COLOR_TEXTURE;
            ShaderManager.enableShader(shaderColorTexture);
            float f = (this.mAlpha / 255.0f) * MatrixStack.glColor().alpha;
            Iterator<b> it = this.f.iterator();
            while (it.hasNext()) {
                a(it.next(), f);
            }
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
            return;
        }
        super.draw();
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (this.h) {
            updatePointsVBO();
            this.h = false;
        }
        if (this.i) {
            updateUvsVBO();
            this.i = false;
        }
    }

    public int a() {
        return this.a;
    }

    private void a(float f, float f2, int i, int i2, Color4 color4) {
        float f3 = f / i;
        float f4 = f2 / i2;
        float f5 = f / 2.0f;
        float f6 = f2 / 2.0f;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 > i2) {
                break;
            }
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 <= i) {
                    vertices().addVertex(1.0f - ((i6 * f3) - f5), (i4 * f4) - f6, 0.0f, 1.0f - (i6 / i), 1.0f - (i4 / i2), 0.0f, 0.0f, -1.0f, color4.r, color4.g, color4.b, color4.a);
                    i5 = i6 + 1;
                }
            }
            i3 = i4 + 1;
        }
        int i7 = i + 1;
        int i8 = 1;
        while (true) {
            int i9 = i8;
            if (i9 > i2) {
                break;
            }
            for (int i10 = 1; i10 <= i; i10++) {
                if (i10 % 2 != 0) {
                    int i11 = (i9 * i7) + i10;
                    int i12 = i11 - i7;
                    x.a(this, i12 - 1, i12, i11, i11 - 1);
                }
            }
            i8 = i9 + 1;
        }
        int i13 = this.a * 2;
        for (int i14 = 0; i14 < this.a; i14++) {
            b bVar = new b(this);
            bVar.J = i14;
            bVar.a = i14 * 2;
            bVar.b = bVar.a + 1;
            bVar.c = bVar.a + i13;
            bVar.d = bVar.b + i13;
            this.f.add(bVar);
        }
        this.j = new com.censivn.C3DEngine.b.d.a(this.g == null ? this : this.g) { // from class: com.censivn.C3DEngine.b.f.a.a.1
            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                float[] fArrA = x.a(motionEvent);
                a.this.e = a.this.a(fArrA[0], fArrA[1]);
                if (a.this.e != null && a.this.e.l != null) {
                    a.this.e.l.e(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                if (a.this.e != null && a.this.e.l != null) {
                    a.this.e.l.f(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void g(MotionEvent motionEvent) {
                if (a.this.e != null && a.this.e.l != null) {
                    a.this.e.l.g(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                if (a.this.e != null && a.this.e.l != null) {
                    a.this.e.l.a(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void k(MotionEvent motionEvent) {
                if (a.this.e != null && a.this.e.l != null) {
                    a.this.e.l.k(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent) {
                if (a.this.e != null && a.this.e.l != null) {
                    a.this.e.l.b(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void c(MotionEvent motionEvent) {
                if (a.this.e != null && a.this.e.l != null) {
                    a.this.e.l.c(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void d(MotionEvent motionEvent) {
                if (a.this.e != null && a.this.e.l != null) {
                    a.this.e.l.d(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
                if (a.this.e != null && a.this.e.l != null) {
                    a.this.e.l.a(motionEvent, motionEvent2, f7, f8);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (a.this.e != null && a.this.e.l != null) {
                    a.this.e.l.a(motionEvent, motionEvent2);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
                if (a.this.e != null && a.this.e.l != null) {
                    a.this.e.l.b(motionEvent, motionEvent2, f7, f8);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void h(MotionEvent motionEvent) {
                if (a.this.e != null && a.this.e.l != null) {
                    a.this.e.l.h(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void i(MotionEvent motionEvent) {
                if (a.this.e != null && a.this.e.l != null) {
                    a.this.e.l.i(motionEvent);
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void j(MotionEvent motionEvent) {
                if (a.this.e != null && a.this.e.l != null) {
                    a.this.e.l.j(motionEvent);
                }
            }
        };
        setMouseEventListener(this.j);
    }

    public void a(b bVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int i = bVar.e;
        int i2 = bVar.f;
        if (bVar.x) {
            float f12 = bVar.A / this.c;
            float f13 = bVar.y / this.c;
            float f14 = bVar.B / this.d;
            f = bVar.z / this.d;
            f2 = f13;
            f3 = f12;
            f4 = f13;
            f5 = f12;
            f6 = f14;
            f7 = f14;
            f8 = f;
        } else {
            float f15 = ((i * this.b) + (bVar.g * this.b)) / this.c;
            float f16 = (bVar.g * this.b) / this.c;
            float f17 = ((bVar.h * this.b) + (i2 * this.b)) / this.d;
            f = (bVar.h * this.b) / this.d;
            f2 = f16;
            f3 = f15;
            f4 = f16;
            f5 = f15;
            f6 = f17;
            f7 = f17;
            f8 = f;
        }
        if (bVar.i) {
            f9 = f5;
            f10 = f4;
        } else {
            float f18 = f2;
            f9 = f4;
            f4 = f3;
            f10 = f5;
            f5 = f18;
        }
        if (bVar.j) {
            f6 = f8;
            f11 = f8;
            f8 = f7;
        } else {
            float f19 = f;
            f11 = f7;
            f7 = f19;
        }
        vertices().uvs().set(bVar.a, f10, f11);
        vertices().uvs().set(bVar.b, f9, f6);
        vertices().uvs().set(bVar.c, f4, f8);
        vertices().uvs().set(bVar.d, f5, f7);
        if (useVBO()) {
            this.i = true;
        } else {
            invalidate();
        }
    }

    private void c(b bVar) {
        float fM = bVar.m() / 2.0f;
        float fO = bVar.o() / 2.0f;
        bVar.p.x = bVar.q() + fM;
        bVar.p.y = (-fO) + bVar.s();
        bVar.p.z = 0.0f;
        bVar.q.x = (-fM) + bVar.q();
        bVar.q.y = (-fO) + bVar.s();
        bVar.q.z = 0.0f;
        bVar.r.x = bVar.q() + fM;
        bVar.r.y = bVar.s() + fO;
        bVar.r.z = 0.0f;
        bVar.s.x = (-fM) + bVar.q();
        bVar.s.y = fO + bVar.s();
        bVar.s.z = 0.0f;
        if (bVar.l()) {
            bVar.p.x *= bVar.o.x;
            bVar.q.x *= bVar.o.x;
            bVar.r.x *= bVar.o.x;
            bVar.s.x *= bVar.o.x;
            bVar.p.y *= bVar.o.y;
            bVar.q.y *= bVar.o.y;
            bVar.r.y *= bVar.o.y;
            bVar.s.y *= bVar.o.y;
        } else {
            bVar.p.x = 0.0f;
            bVar.q.x = 0.0f;
            bVar.r.x = 0.0f;
            bVar.s.x = 0.0f;
            bVar.p.y = 0.0f;
            bVar.q.y = 0.0f;
            bVar.r.y = 0.0f;
            bVar.s.y = 0.0f;
            bVar.p.z = 0.0f;
            bVar.q.z = 0.0f;
            bVar.r.z = 0.0f;
            bVar.s.z = 0.0f;
        }
        bVar.t.setAllFrom(bVar.p);
        bVar.u.setAllFrom(bVar.q);
        bVar.v.setAllFrom(bVar.r);
        bVar.w.setAllFrom(bVar.s);
        if (bVar.D != null) {
            bVar.t.x *= bVar.D.x;
            bVar.t.y *= bVar.D.y;
        } else {
            bVar.t.x *= bVar.C.x;
            bVar.t.y *= bVar.C.y;
        }
        if (bVar.E != null) {
            bVar.u.x *= bVar.E.x;
            bVar.u.y *= bVar.E.y;
        } else {
            bVar.u.x *= bVar.C.x;
            bVar.u.y *= bVar.C.y;
        }
        if (bVar.F != null) {
            bVar.v.x *= bVar.F.x;
            bVar.v.y *= bVar.F.y;
        } else {
            bVar.v.x *= bVar.C.x;
            bVar.v.y *= bVar.C.y;
        }
        if (bVar.G != null) {
            bVar.w.x *= bVar.G.x;
            bVar.w.y *= bVar.G.y;
        } else {
            bVar.w.x *= bVar.C.x;
            bVar.w.y *= bVar.C.y;
        }
        float f = (float) ((((double) bVar.n.x) * 3.141592653589793d) / 180.0d);
        float f2 = (float) ((((double) bVar.n.y) * 3.141592653589793d) / 180.0d);
        float f3 = (float) ((((double) bVar.n.z) * 3.141592653589793d) / 180.0d);
        bVar.p.rotateX(f);
        bVar.q.rotateX(f);
        bVar.r.rotateX(f);
        bVar.s.rotateX(f);
        bVar.t.rotateX(f);
        bVar.u.rotateX(f);
        bVar.v.rotateX(f);
        bVar.w.rotateX(f);
        bVar.p.rotateY(f2);
        bVar.q.rotateY(f2);
        bVar.r.rotateY(f2);
        bVar.s.rotateY(f2);
        bVar.t.rotateY(f2);
        bVar.u.rotateY(f2);
        bVar.v.rotateY(f2);
        bVar.w.rotateY(f2);
        bVar.p.rotateZ(f3);
        bVar.q.rotateZ(f3);
        bVar.r.rotateZ(f3);
        bVar.s.rotateZ(f3);
        bVar.t.rotateZ(f3);
        bVar.u.rotateZ(f3);
        bVar.v.rotateZ(f3);
        bVar.w.rotateZ(f3);
        bVar.p.add(bVar.m);
        bVar.q.add(bVar.m);
        bVar.r.add(bVar.m);
        bVar.s.add(bVar.m);
        bVar.t.add(bVar.m);
        bVar.u.add(bVar.m);
        bVar.v.add(bVar.m);
        bVar.w.add(bVar.m);
    }

    public void b(b bVar) {
        c(bVar);
        points().setPX(bVar.a, bVar.p);
        points().setPX(bVar.b, bVar.q);
        points().setPX(bVar.c, bVar.r);
        points().setPX(bVar.d, bVar.s);
        if (useVBO()) {
            this.h = true;
        } else {
            invalidate();
        }
    }

    private void a(b bVar, float f) {
        if (this.k) {
            float f2 = ((bVar.H.glA * bVar.I) / 255.0f) * f;
            float f3 = f2 * bVar.H.glR;
            float f4 = f2 * bVar.H.glG;
            float f5 = f2 * bVar.H.glB;
            vertices().colors().set(bVar.a, f3, f4, f5, f2);
            vertices().colors().set(bVar.b, f3, f4, f5, f2);
            vertices().colors().set(bVar.c, f3, f4, f5, f2);
            vertices().colors().set(bVar.d, f3, f4, f5, f2);
        }
    }

    public void a(boolean z) {
        this.l = z;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public boolean calTouchCollision(float f, float f2) {
        if (this.l) {
            return super.calTouchCollision(f, f2);
        }
        if (a(f, f2) == null) {
            return false;
        }
        return true;
    }

    public int b() {
        return this.f.size();
    }

    public b a(int i) {
        return this.f.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b a(float f, float f2) {
        for (int i = 0; i < this.a; i++) {
            b bVar = this.f.get(i);
            this.AABB_TL[0] = bVar.t.x;
            this.AABB_TL[1] = bVar.t.y;
            this.AABB_TL[2] = bVar.t.z;
            this.AABB_TL[3] = 1.0f;
            this.AABB_TR[0] = bVar.u.x;
            this.AABB_TR[1] = bVar.u.y;
            this.AABB_TR[2] = bVar.u.z;
            this.AABB_TR[3] = 1.0f;
            this.AABB_BL[0] = bVar.v.x;
            this.AABB_BL[1] = bVar.v.y;
            this.AABB_BL[2] = bVar.v.z;
            this.AABB_BL[3] = 1.0f;
            this.AABB_BR[0] = bVar.w.x;
            this.AABB_BR[1] = bVar.w.y;
            this.AABB_BR[2] = bVar.w.z;
            this.AABB_BR[3] = 1.0f;
            if (super.calTouchCollision(f, f2) && bVar.l != null) {
                return bVar;
            }
        }
        return null;
    }
}
