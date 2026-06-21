package com.tsf.shell.f.f.b;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.b;
import com.tsf.shell.f.f.PageAnimationState;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class CylinderTransition extends ItemPageTransition {
    private com.censivn.C3DEngine.b.f.BaseRenderable a;
    private com.censivn.C3DEngine.b.f.BaseColoredRectRenderable b;
    private com.censivn.C3DEngine.c.PhysicsSystem c;
    private com.censivn.C3DEngine.c.b.WavePhysicsSystem d;
    private int e;
    private com.censivn.C3DEngine.b.g._b.TweenTargetWrapper f;
    private com.censivn.C3DEngine.b.f.GridRenderable g;
    private boolean h;

    public CylinderTransition(int i, boolean z) {
        super(i, CrossfadeTransition.d.desktop_transition_effect_cylinder, z);
        this.e = 2;
        this.f = new com.censivn.C3DEngine.b.g._b.TweenTargetWrapper();
        this.h = false;
        if (this.b == null) {
            this.a = new com.censivn.C3DEngine.b.f.BaseRenderable();
            this.b = new com.censivn.C3DEngine.b.f.BaseColoredRectRenderable(com.censivn.C3DEngine.b.b.ScreenConstants.F, com.censivn.C3DEngine.b.b.ScreenConstants.G, 20, 1, new Color4(0, 0, 0, 0), false, false, false);
            this.g = new com.censivn.C3DEngine.b.f.GridRenderable(com.censivn.C3DEngine.b.b.ScreenConstants.F, com.censivn.C3DEngine.b.b.ScreenConstants.a(20.0f), 20, 1, false);
            this.g.setDefaultColor(new Color4(255, 0, 0, 255));
            this.b.useVBO(false);
            this.b.doubleSidedEnabled(true);
            this.a.addChild(this.b);
            this.c = new com.censivn.C3DEngine.c.PhysicsSystem(this.b);
            this.d = new com.censivn.C3DEngine.c.b.WavePhysicsSystem(0.0f, 0.0f);
            this.d.a(1);
            this.d.b(0.5f);
            this.c.a(this.d);
        }
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public boolean b() {
        return this.h;
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void b(float f, float f2) {
        boolean zB = com.tsf.shell.manager.app.StateHub.s().b();
        final float fB = this.d.b();
        if (zB) {
            if (this.e != 1) {
                this.e = 1;
                com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.f.b.CylinderTransition.1
                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a(float f3) {
                        CylinderTransition.this.d.a(fB + ((0.5f - fB) * f3));
                        CylinderTransition.this.c.a();
                    }

                    @Override // com.censivn.C3DEngine.b.g.TweenParams
                    public void a() {
                        CylinderTransition.this.h = true;
                    }
                };
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.f);
                com.censivn.C3DEngine.b.g.TweenUtils.a(this.f, VEasing.Linear.easeNone, dVar);
                this.h = false;
                return;
            }
            return;
        }
        if (this.e != 2) {
            this.e = 2;
            com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.f.b.CylinderTransition.2
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a(float f3) {
                    CylinderTransition.this.d.a(fB + ((0.0f - fB) * f3));
                    CylinderTransition.this.c.a();
                }

                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    CylinderTransition.this.h = true;
                }
            };
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.f, VEasing.Linear.easeNone, dVar2);
            this.h = false;
        }
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void b(com.tsf.shell.f.f.WorkspacePage gVar, float f) {
        gVar.position().x = 0.0f;
        HorizontalFlipTransition.a aVarJ = gVar.j();
        this.b.alpha((1.0f - Math.abs(f)) * 255.0f);
        this.b.position().z = (com.censivn.C3DEngine.b.b.ScreenConstants.D / 5) * 3;
        this.a.position().z = -this.b.position().z;
        this.a.rotation().y = 180.0f * f;
        this.b.textures().clear();
        this.b.textures().addElement(aVarJ.b);
        this.a.dispatchDraw();
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void a(com.tsf.shell.f.f.WorkspacePage gVar, float f) {
        float f2 = 180.0f * f;
        if (f2 < 90.0f && f2 > -90.0f) {
            gVar.setRendererPriorityLevel(1);
        } else {
            gVar.setRendererPriorityLevel(0);
        }
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void a(float f, float f2) {
        if (this.b != null) {
            this.b.a(f);
            this.b.b(f2);
            this.c.a(this.b);
        }
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public boolean a() {
        return true;
    }
}
