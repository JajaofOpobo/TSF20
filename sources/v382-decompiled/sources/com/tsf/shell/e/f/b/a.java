package com.tsf.shell.e.f.b;

import android.opengl.GLES20;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class a extends com.tsf.shell.e.f.p {
    private com.censivn.C3DEngine.b.f.l a;
    private b b;
    private com.tsf.shell.e.f.g c;
    private com.tsf.shell.e.f.g d;
    private com.tsf.shell.e.f.g e;
    private int f;
    private com.censivn.C3DEngine.b.g.b.b g;
    private boolean h;

    public a(int i, boolean z) {
        super(i, R.drawable.desktop_transition_cloth, z);
        int i2;
        int i3;
        this.f = 2;
        this.g = new com.censivn.C3DEngine.b.g.b.b();
        this.h = true;
        if (this.b == null) {
            this.a = new com.censivn.C3DEngine.b.f.l();
            if (com.censivn.C3DEngine.b.b.a.F < com.censivn.C3DEngine.b.b.a.G) {
                i2 = com.censivn.C3DEngine.b.b.a.F;
                i3 = com.censivn.C3DEngine.b.b.a.G;
            } else {
                i2 = com.censivn.C3DEngine.b.b.a.G;
                i3 = com.censivn.C3DEngine.b.b.a.F;
            }
            this.b = new b(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G, (int) (i2 / (com.censivn.C3DEngine.b.b.a.e * 50.0f)), (int) (i3 / (com.censivn.C3DEngine.b.b.a.e * 8.0f)));
            this.a.addChild(this.b);
        }
        com.tsf.shell.manager.p.g a = com.tsf.shell.manager.a.a.a(com.tsf.shell.manager.p.f.f);
        if (a.a() && a.c == 110) {
            m();
        }
    }

    @Override // com.tsf.shell.e.f.p
    public void c() {
        this.c = null;
        this.d = null;
        this.e = null;
    }

    @Override // com.tsf.shell.e.f.p
    public void e() {
        if (this.c == null) {
            this.c = com.tsf.shell.manager.a.h.n();
        }
    }

    @Override // com.tsf.shell.e.f.p
    public boolean b() {
        return this.h;
    }

    private void o() {
        if (com.tsf.shell.manager.a.h.s().b()) {
            if (this.f != 1) {
                this.f = 1;
                final float f = this.a.position().z;
                x xVar = new x() { // from class: com.tsf.shell.e.f.b.a.1
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a(float f2) {
                        a.this.b.c(255.0f * f2);
                        a.this.a.position().z = f + (((-300.0f) - f) * f2);
                    }

                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        a.this.h = true;
                    }
                };
                w.a(this.g);
                w.a(this.g, VEasing.Linear.easeNone, xVar);
                this.h = false;
                return;
            }
            return;
        }
        if (this.f != 2) {
            this.f = 2;
            final float f2 = this.a.position().z;
            x xVar2 = new x() { // from class: com.tsf.shell.e.f.b.a.2
                @Override // com.censivn.C3DEngine.b.g.x
                public void a(float f3) {
                    a.this.b.c((1.0f - f3) * 255.0f);
                    a.this.a.position().z = f2 + ((0.0f - f2) * f3);
                }

                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    a.this.h = true;
                }
            };
            w.a(this.g);
            w.a(this.g, VEasing.Linear.easeNone, xVar2);
            this.h = false;
        }
    }

    @Override // com.tsf.shell.e.f.p
    public void b(float f, float f2) {
        o();
        com.tsf.shell.e.f.g n = com.tsf.shell.manager.a.h.n();
        if (this.e != null && this.e != n && Math.round(Math.abs(this.e.g - n.g)) % 2 != 0) {
            com.tsf.shell.e.f.g gVar = this.c;
            this.c = this.d;
            this.d = gVar;
        }
        this.e = n;
        a(f2);
        if (this.c == null || this.d == null) {
            return;
        }
        if (f > 0.0f) {
            if (f < 0.5f) {
                q();
                return;
            } else {
                p();
                return;
            }
        }
        if (f > -0.5f) {
            q();
        } else {
            p();
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

    public void a(com.tsf.shell.e.f.g gVar) {
        if (this.c == gVar) {
            b(gVar);
            return;
        }
        if (this.d == gVar) {
            c(gVar);
        } else if (this.c == null || Math.abs(this.c.g) >= 1.0f) {
            b(gVar);
        } else {
            c(gVar);
        }
    }

    private void b(com.tsf.shell.e.f.g gVar) {
        this.c = gVar;
        this.b.a();
        GLES20.glFrontFace(2305);
    }

    private void c(com.tsf.shell.e.f.g gVar) {
        this.d = gVar;
        this.b.d();
        GLES20.glFrontFace(2304);
    }

    @Override // com.tsf.shell.e.f.p
    public void b(com.tsf.shell.e.f.g gVar, float f) {
        gVar.position().x = 0.0f;
        this.b.a(gVar.j().b);
        a(gVar);
        this.a.dispatchDraw();
        GLES20.glFrontFace(2305);
    }

    private void a(float f) {
        this.b.d(f);
    }

    @Override // com.tsf.shell.e.f.p
    public void a(float f, float f2) {
        if (this.b != null) {
            this.b.b(f, f2);
        }
    }

    @Override // com.tsf.shell.e.f.p
    public boolean a() {
        return true;
    }
}
