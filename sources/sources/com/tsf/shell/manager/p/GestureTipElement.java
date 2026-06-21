package com.tsf.shell.manager.p;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;


/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class GestureTipElement extends BaseRenderable {
    private TextureElement a = new TextureElement(0, false);
    private TextureElement b = new TextureElement(0, false);
    private GridRenderable c = com.censivn.C3DEngine.b.b.ScreenConstants.a(103.0f, 149.0f);
    private GridRenderable d;

    public void a() {
        com.censivn.C3DEngine.C3DEngine.g().a(this.a);
        com.censivn.C3DEngine.C3DEngine.g().a(this.b);
    }

    public void a(float f, float f2, int i, Runnable runnable) {
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.f(com.censivn.C3DEngine.b.b.ScreenConstants.z + com.censivn.C3DEngine.b.b.ScreenConstants.a(50.0f));
        dVar.h(f2);
        dVar.a(runnable);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this, i, dVar);
    }

    public void a(final Runnable runnable, final int i) {
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.manager.p.GestureTipElement.1
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                if (runnable != null) {
                    com.censivn.C3DEngine.C3DEngine.a().b(runnable, i);
                }
            }
        };
        dVar.a(255);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this, 500, dVar);
    }

    public void b(final Runnable runnable, final int i) {
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.manager.p.GestureTipElement.2
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                if (runnable != null) {
                    com.censivn.C3DEngine.C3DEngine.a().b(runnable, i);
                }
            }
        };
        dVar.a(0);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this, 500, dVar);
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
        if (this.a.id == 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.a, b.d.tips_gesture_finger);
            com.censivn.C3DEngine.C3DEngine.g().a(this.b, b.d.tips_finger_point2);
        }
    }

    public void a(float f) {
        a(f, (Runnable) null);
    }

    public void a(final float f, Runnable runnable) {
        final float f2 = rotation().z;
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.manager.p.GestureTipElement.3
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a(float f3) {
                GestureTipElement.this.rotation().z = f2 + ((f - f2) * f3);
            }
        };
        dVar.a(runnable);
        com.censivn.C3DEngine.b.g.TweenUtils.a(new com.censivn.C3DEngine.b.g._b.TweenTargetWrapper(), 450, dVar);
    }

    public void b() {
        this.d.removeFromParent();
        com.tsf.shell.manager.app.TaskScheduler.a(this.d);
        setZOrderOnTop();
        this.d.scale().setAll(0.0f, 0.0f, 1.0f);
        this.d.visible(true);
        this.d.alpha(255.0f);
        this.d.position().setAllFrom(position());
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.manager.p.GestureTipElement.4
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                GestureTipElement.this.d.visible(false);
                GestureTipElement.this.d.alpha(255.0f);
                com.tsf.shell.manager.app.TaskScheduler.b(GestureTipElement.this.d);
            }
        };
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.d);
        dVar.l(5.0f);
        dVar.m(5.0f);
        dVar.a(0);
        dVar.a(com.censivn.C3DEngine.b.g.a.RenderableTween);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.d);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.d, 600, dVar);
    }
}
