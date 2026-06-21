package com.tsf.shell.e.f.b;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class g extends com.tsf.shell.e.f.p {
    private com.censivn.C3DEngine.b.f.l a;
    private com.censivn.C3DEngine.b.f.i b;
    private com.censivn.C3DEngine.c.a c;
    private com.censivn.C3DEngine.c.b.a d;
    private int e;
    private com.censivn.C3DEngine.b.g.b.b f;
    private com.censivn.C3DEngine.b.f.m g;
    private boolean h;

    public g(int i, boolean z) {
        super(i, R.drawable.desktop_transition_effect_cylinder, z);
        this.e = 2;
        this.f = new com.censivn.C3DEngine.b.g.b.b();
        this.h = false;
        if (this.b == null) {
            this.a = new com.censivn.C3DEngine.b.f.l();
            this.b = new com.censivn.C3DEngine.b.f.i(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G, 20, 1, new Color4(0, 0, 0, 0), false, false, false);
            this.g = new com.censivn.C3DEngine.b.f.m(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.a(20.0f), 20, 1, false);
            this.g.setDefaultColor(new Color4(255, 0, 0, 255));
            this.b.useVBO(false);
            this.b.doubleSidedEnabled(true);
            this.a.addChild(this.b);
            this.c = new com.censivn.C3DEngine.c.a(this.b);
            this.d = new com.censivn.C3DEngine.c.b.a(0.0f, 0.0f);
            this.d.a(1);
            this.d.b(0.5f);
            this.c.a(this.d);
        }
    }

    @Override // com.tsf.shell.e.f.p
    public boolean b() {
        return this.h;
    }

    @Override // com.tsf.shell.e.f.p
    public void b(float f, float f2) {
        boolean b = com.tsf.shell.manager.a.h.s().b();
        final float b2 = this.d.b();
        if (b) {
            if (this.e != 1) {
                this.e = 1;
                x xVar = new x() { // from class: com.tsf.shell.e.f.b.g.1
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a(float f3) {
                        g.this.d.a(b2 + ((0.5f - b2) * f3));
                        g.this.c.a();
                    }

                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        g.this.h = true;
                    }
                };
                w.a(this.f);
                w.a(this.f, VEasing.Linear.easeNone, xVar);
                this.h = false;
                return;
            }
            return;
        }
        if (this.e != 2) {
            this.e = 2;
            x xVar2 = new x() { // from class: com.tsf.shell.e.f.b.g.2
                @Override // com.censivn.C3DEngine.b.g.x
                public void a(float f3) {
                    g.this.d.a(b2 + ((0.0f - b2) * f3));
                    g.this.c.a();
                }

                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    g.this.h = true;
                }
            };
            w.a(this.f);
            w.a(this.f, VEasing.Linear.easeNone, xVar2);
            this.h = false;
        }
    }

    @Override // com.tsf.shell.e.f.p
    public void b(com.tsf.shell.e.f.g gVar, float f) {
        gVar.position().x = 0.0f;
        com.tsf.shell.e.f.m j = gVar.j();
        this.b.alpha((1.0f - Math.abs(f)) * 255.0f);
        this.b.position().z = (com.censivn.C3DEngine.b.b.a.D / 5) * 3;
        this.a.position().z = -this.b.position().z;
        this.a.rotation().y = 180.0f * f;
        this.b.textures().clear();
        this.b.textures().addElement(j.b);
        this.a.dispatchDraw();
    }

    @Override // com.tsf.shell.e.f.p
    public void a(com.tsf.shell.e.f.g gVar, float f) {
        float f2 = 180.0f * f;
        if (f2 < 90.0f && f2 > -90.0f) {
            gVar.setRendererPriorityLevel(1);
        } else {
            gVar.setRendererPriorityLevel(0);
        }
    }

    @Override // com.tsf.shell.e.f.p
    public void a(float f, float f2) {
        if (this.b != null) {
            this.b.a(f);
            this.b.b(f2);
            this.c.a(this.b);
        }
    }

    @Override // com.tsf.shell.e.f.p
    public boolean a() {
        return true;
    }
}
