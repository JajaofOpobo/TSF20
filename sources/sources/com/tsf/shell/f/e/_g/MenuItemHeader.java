package com.tsf.shell.f.e._g;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class MenuItemHeader extends BaseRenderable {
    private com.tsf.shell.f.a.b.ShaderSlotElement a;
    private IRenderable b;

    public MenuItemHeader(float f, float f2) {
        this.a = new com.tsf.shell.f.a.b.ShaderSlotElement(f, f2, this.a);
        this.a.setDefaultColor(new Color4(0, 0, 0, 255));
        this.a.alpha(60.0f);
        this.a.scale().y = 0.0f;
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable, com.censivn.C3DEngine.b.f.IRenderableContainer
    public void addChild(IRenderable iVar) {
        if (this.b != null) {
            final i iVar2 = this.b;
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e._g.MenuItemHeader.1
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    iVar2.removeFromParent();
                }
            };
            dVar.a(0);
            dVar.h(MenuOverlay.MENU_EXTRA_HEIGHT);
            com.censivn.C3DEngine.b.g.TweenUtils.a(iVar2);
            com.censivn.C3DEngine.b.g.TweenUtils.a(iVar2, VEasing.Linear.easeNone, dVar);
        }
        this.b = iVar;
        if (this.b.parent() == null) {
            if (this.a.scale().y == 0.0f) {
                this.b.position().y = 0.0f;
            } else {
                this.b.position().y = -MenuOverlay.MENU_EXTRA_HEIGHT;
            }
            this.b.alpha(255.0f);
        }
        com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar2.a(com.censivn.C3DEngine.b.g.a.RenderableTween);
        dVar2.h(0.0f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.b);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.b, VEasing.Linear.easeNone, dVar2);
        this.b.removeFromParent();
        super.addChild(this.b);
    }

    public void a() {
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.m(1.0f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a, VEasing.Linear.easeNone, dVar);
    }

    public void b() {
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f.e._g.MenuItemHeader.2
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
                c.this.removeFromParent();
                if (c.this.b != null) {
                    c.this.b.removeFromParent();
                    c.this.b = null;
                }
            }
        };
        dVar.m(0.0f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a, 300, dVar);
    }

    public void a(int i) {
        this.a.a(i);
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable
    public void onDrawChildStart() {
        com.tsf.shell.manager.app.ActionHandler.a(this.a);
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawEnd() {
        com.tsf.shell.manager.app.ActionHandler.a();
    }
}
