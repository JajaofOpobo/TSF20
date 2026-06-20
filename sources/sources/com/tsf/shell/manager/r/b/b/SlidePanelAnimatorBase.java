package com.tsf.shell.manager.r.b.b;

import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.g.TweenManager;
import com.tsf.shell.f.e._g.MenuOverlay;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SlidePanelAnimatorBase {
    protected BaseRenderable c = new BaseRenderable();
    protected d d;

    public SlidePanelAnimatorBase(d dVar) {
        this.d = dVar;
        this.c.visible(false);
    }

    public void a(boolean z) {
        if (this.c.visible() && z) {
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase.1
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    SlidePanelAnimatorBase.this.c.visible(false);
                    SlidePanelAnimatorBase.this.b();
                }
            };
            dVar.h(-this.d.getHeight());
            dVar.a(0);
            c.a(this.c);
            c.a(this.c, com.tsf.shell.f.e._g.a.MenuItemBase.ANIMATION_TIME, dVar);
        } else {
            this.c.position().y = -this.d.getHeight();
            this.c.visible(false);
            this.c.alpha(0.0f);
            SlidePanelAnimatorBase();
        }
        SlidePanelAnimatorBase();
    }

    public void b(boolean z) {
        if (z) {
            if (!this.c.visible()) {
                this.c.alpha(0.0f);
                this.c.position().y = -this.d.getHeight();
            }
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.manager.r.b.b.SlidePanelAnimatorBase.2
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    SlidePanelAnimatorBase.this.d();
                }
            };
            dVar.h(0.0f);
            dVar.a(255);
            c.a(this.c);
            dVar.a(com.censivn.C3DEngine.b.g.a.RenderableTween);
            c.a(this.c, com.tsf.shell.f.e._g.a.MenuItemBase.ANIMATION_TIME, dVar);
        } else {
            this.c.alpha(255.0f);
            this.c.position().y = 0.0f;
            SlidePanelAnimatorBase();
        }
        this.c.visible(true);
        SlidePanelAnimatorBase();
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void a(float f, float f2, float f3, float f4) {
    }

    public BaseRenderable f() {
        return this.c;
    }
}
