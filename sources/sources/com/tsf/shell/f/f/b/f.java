package com.tsf.shell.f.f.b;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.b;
import com.tsf.shell.f.f.j;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f extends com.tsf.shell.f.f.l {
    private com.censivn.C3DEngine.b.f.j a;
    private com.censivn.C3DEngine.b.f.h b;
    private com.censivn.C3DEngine.c.a c;
    private com.censivn.C3DEngine.c.b.a d;
    private int e;
    private com.censivn.C3DEngine.b.g.b.b f;
    private com.censivn.C3DEngine.b.f.k g;
    private boolean h;

    public f(int i, boolean z) {
        super(i, b.d.desktop_transition_effect_cylinder, z);
        this.e = 2;
        this.f = new com.censivn.C3DEngine.b.g.b.b();
        this.h = false;
        if (this.b == null) {
            this.a = new com.censivn.C3DEngine.b.f.j();
            this.b = new com.censivn.C3DEngine.b.f.h(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.G, 20, 1, new Color4(0, 0, 0, 0), false, false, false);
            this.g = new com.censivn.C3DEngine.b.f.k(com.censivn.C3DEngine.b.b.a.F, com.censivn.C3DEngine.b.b.a.a(20.0f), 20, 1, false);
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

    @Override // com.tsf.shell.f.f.l
    public boolean b() {
        return this.h;
    }

    @Override // com.tsf.shell.f.f.l
    public void b(float f, float f2) {
        boolean zB = com.tsf.shell.manager.a.h.s().b();
        final float fB = this.d.b();
        if (zB) {
            if (this.e != 1) {
                this.e = 1;
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.b.f.1
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a(float f3) {
                        f.this.d.a(fB + ((0.5f - fB) * f3));
                        f.this.c.a();
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        f.this.h = true;
                    }
                };
                com.censivn.C3DEngine.b.g.c.a(this.f);
                com.censivn.C3DEngine.b.g.c.a(this.f, VEasing.Linear.easeNone, dVar);
                this.h = false;
                return;
            }
            return;
        }
        if (this.e != 2) {
            this.e = 2;
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.b.f.2
                @Override // com.censivn.C3DEngine.b.g.d
                public void a(float f3) {
                    f.this.d.a(fB + ((0.0f - fB) * f3));
                    f.this.c.a();
                }

                @Override // com.censivn.C3DEngine.b.g.d
                public void a() {
                    f.this.h = true;
                }
            };
            com.censivn.C3DEngine.b.g.c.a(this.f);
            com.censivn.C3DEngine.b.g.c.a(this.f, VEasing.Linear.easeNone, dVar2);
            this.h = false;
        }
    }

    @Override // com.tsf.shell.f.f.l
    public void b(com.tsf.shell.f.f.g gVar, float f) {
        gVar.position().x = 0.0f;
        j.a aVarJ = gVar.j();
        this.b.alpha((1.0f - Math.abs(f)) * 255.0f);
        this.b.position().z = (com.censivn.C3DEngine.b.b.a.D / 5) * 3;
        this.a.position().z = -this.b.position().z;
        this.a.rotation().y = 180.0f * f;
        this.b.textures().clear();
        this.b.textures().addElement(aVarJ.b);
        this.a.dispatchDraw();
    }

    @Override // com.tsf.shell.f.f.l
    public void a(com.tsf.shell.f.f.g gVar, float f) {
        float f2 = 180.0f * f;
        if (f2 < 90.0f && f2 > -90.0f) {
            gVar.setRendererPriorityLevel(1);
        } else {
            gVar.setRendererPriorityLevel(0);
        }
    }

    @Override // com.tsf.shell.f.f.l
    public void a(float f, float f2) {
        if (this.b != null) {
            this.b.a(f);
            this.b.b(f2);
            this.c.a(this.b);
        }
    }

    @Override // com.tsf.shell.f.f.l
    public boolean a() {
        return true;
    }
}
