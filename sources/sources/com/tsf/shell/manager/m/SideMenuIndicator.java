package com.tsf.shell.manager.m;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.b;
import com.tsf.shell.f.e.SelectionFrameLayoutItem;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SideMenuIndicator extends com.tsf.shell.f.e.e.ItemLayoutItem {
    private TextureElement b;
    private GridRenderable d;
    private GridRenderable e;
    private SideMenuManager f;
    private double h;
    private double g = 0.10471975511965977d;
    private boolean j = false;
    private com.censivn.C3DEngine.b.g._b.TweenTargetWrapper i = new com.censivn.C3DEngine.b.g._b.TweenTargetWrapper();
    private TextureElement a = new TextureElement(0, false);
    private BaseRenderable c = new com.tsf.shell.f.e.e.ItemLayoutItem();

    public SideMenuIndicator(b bVar) {
        boolean z = false;
        this.f = bVar;
        this.d = new GridRenderable(com.censivn.C3DEngine.b.b.A.a(24.0f), com.censivn.C3DEngine.b.b.A.a(45.0f), z) { // from class: com.tsf.shell.manager.m.SideMenuIndicator.1
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                if (d.this.a.id == 0) {
                    com.censivn.C3DEngine.C3DEngine.g().a(d.this.a, b.d.scrollcontainer_arrow);
                }
            }
        };
        this.d.textures().addElement(this.a);
        com.censivn.C3DEngine.b.d.a aVar = new com.censivn.C3DEngine.b.d.a(this.d) { // from class: com.tsf.shell.manager.m.SideMenuIndicator.2
            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent) {
                d.this.f.l();
            }
        };
        this.d.alpha(200.0f);
        this.d.calAABB(8.0f, 8.0f, 1.0f);
        this.d.setMouseEventListener(aVar);
        com.tsf.shell.manager.app.StateManager.b(this);
        this.b = new TextureElement(0, false);
        this.e = new GridRenderable(com.censivn.C3DEngine.b.b.A.a(70.0f), com.censivn.C3DEngine.b.b.A.a(70.0f), z) { // from class: com.tsf.shell.manager.m.SideMenuIndicator.3
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                if (d.this.b.id == 0) {
                    com.censivn.C3DEngine.C3DEngine.g().a(d.this.b, b.d.side_menu_add_button);
                }
                float fSin = 0.8f + ((float) (Math.sin(d.this.h) * 0.20000000298023224d));
                d.this.h += d.this.g;
                scale().setAll(fSin, fSin, 1.0f);
            }
        };
        this.e.textures().addElement(this.b);
        this.c.position().x = com.censivn.C3DEngine.b.b.A.a(28.0f);
        addChild(this.d);
        addChild(this.c);
        this.c.addChild(this.e);
        this.c.visible(false);
        calAABB();
    }

    @Override // com.tsf.shell.f.e.e.ItemLayoutItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public boolean b(F fVar) {
        return b(fVar);
    }

    @Override // com.tsf.shell.f.e.e.ItemLayoutItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public boolean a(F fVar, float f, float f2) {
        return a(fVar, f, f2);
    }

    @Override // com.tsf.shell.f.e.e.ItemLayoutItem, com.tsf.shell.f.e.SelectionFrameLayoutItem
    public void a(F fVar) {
        a(fVar);
    }

    public void a(final float f, boolean z) {
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.i);
        if (z) {
            final float f2 = this.d.rotation().z;
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.manager.m.SideMenuIndicator.4
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a(float f3) {
                    d.this.d.rotation().z = f2 + ((f - f2) * f3);
                }
            };
            dVar.a(com.censivn.C3DEngine.b.g.a.e);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.i, 500, dVar);
            return;
        }
        this.d.rotation().z = f;
    }

    public void d_() {
        if (!this.j) {
            this.j = true;
            if (!this.c.visible()) {
                this.c.alpha(0.0f);
                this.c.scale().setAll(0.0f, 0.0f, 1.0f);
            }
            this.c.visible(true);
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
            dVar.a(255);
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.c);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.c, 300, dVar);
            com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams();
            dVar2.f(com.censivn.C3DEngine.b.b.A.a(100.0f));
            dVar2.a(0);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.d);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.d, 300, dVar2);
        }
    }

    public void b() {
        if (this.j) {
            this.j = false;
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.manager.m.SideMenuIndicator.5
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    d.this.c.visible(false);
                }
            };
            dVar.a(0);
            dVar.l(0.0f);
            dVar.m(0.0f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.c);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.c, 300, dVar);
            com.censivn.C3DEngine.b.g.TweenParams dVar2 = new com.censivn.C3DEngine.b.g.TweenParams();
            dVar2.f(0.0f);
            dVar2.a(VEasing.Back.easeIn);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.d);
            com.censivn.C3DEngine.b.g.TweenUtils.a(this.d, 300, dVar2);
        }
    }

    public void c() {
        if (this.a.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.a);
        }
        if (this.b.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.b);
        }
    }
}
