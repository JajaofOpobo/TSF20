package com.tsf.shell.f.f.a._a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerVisualFrame extends com.censivn.C3DEngine.b.b.DesktopRenderer {
    private static final int h = com.censivn.C3DEngine.b.b.ScreenConstants.b(160.0f);
    private BaseRenderable c;
    private GridRenderable d;
    private GridRenderable e;
    private c i;
    private TextureElement f = new TextureElement(0, false);
    private TextureElement g = new TextureElement(0, false);
    private BaseRenderable a = new BaseRenderable();
    private GridRenderable b = new GridRenderable(com.censivn.C3DEngine.b.b.ScreenConstants.D, 120.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c, false);

    public DrawerVisualFrame(c cVar) {
        boolean z = false;
        this.i = cVar;
        this.b.setDefaultColor(new Color4(255, 255, 255, 60));
        this.b.setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this.b) { // from class: com.tsf.shell.f.f.a._a.DrawerVisualFrame.1
            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                com.tsf.shell.manager.app.FolderManager.a(7, true);
            }
        });
        this.a.addChild(this.b);
        this.c = new BaseRenderable();
        this.a.addChild(this.c);
        this.d = new GridRenderable(com.tsf.shell.manager.g.LayoutDimensionConstants.j, com.tsf.shell.manager.g.LayoutDimensionConstants.j, z) { // from class: com.tsf.shell.f.f.a._a.DrawerVisualFrame.2
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                if (e.this.f.id == 0) {
                    com.censivn.C3DEngine.C3DEngine.g().a(e.this.f, b.d.drawer_top_menu_button_voice_search);
                }
            }
        };
        this.d.textures().addElement(this.f);
        this.d.calAABB();
        this.d.setMouseEventListener(new com.censivn.C3DEngine.b.d.MouseEventListener(this.d) { // from class: com.tsf.shell.f.f.a._a.DrawerVisualFrame.3
            @Override // com.censivn.C3DEngine.b.d.MouseEventListener
            public void a(MotionEvent motionEvent) {
                com.tsf.shell.manager.app.FolderManager.a(8, true);
            }
        });
        this.e = new GridRenderable(com.censivn.C3DEngine.b.b.ScreenConstants.a(170.0f), com.censivn.C3DEngine.b.b.ScreenConstants.a(61.0f), z) { // from class: com.tsf.shell.f.f.a._a.DrawerVisualFrame.4
            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                if (e.this.g.id == 0) {
                    com.censivn.C3DEngine.C3DEngine.g().a(e.this.g, b.d.allapps_google_icon);
                }
            }
        };
        this.e.position().y = com.censivn.C3DEngine.b.b.ScreenConstants.a(-5.0f);
        this.e.textures().addElement(this.g);
        this.c.addChild(this.e);
        this.c.addChild(this.d);
        addChild(this.a);
        this.a.position().y = -com.censivn.C3DEngine.b.b.ScreenConstants.a(100.0f);
    }

    @Override // com.censivn.C3DEngine.b.b.DesktopRenderer
    public void c(int i) {
        this.e.position().x = ((-i) / 2.0f) + com.censivn.C3DEngine.b.b.ScreenConstants.a(40.0f) + (this.e.b() / 2.0f);
        this.d.position().x = (i / 2.0f) - com.tsf.shell.manager.g.LayoutDimensionConstants.j;
        this.b.a(i);
        d(h);
        this.b.calAABB();
    }

    public void e() {
        com.censivn.C3DEngine.C3DEngine.g().a(this.f);
        com.censivn.C3DEngine.C3DEngine.g().a(this.g);
    }

    public void f() {
        this.a.position().y = (-com.censivn.C3DEngine.b.b.ScreenConstants.a(100.0f)) + DrawerItemContainer.a;
        this.a.alpha(0.0f);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.a(255);
        dVar.a(com.censivn.C3DEngine.b.g.a.n);
        dVar.h(-com.censivn.C3DEngine.b.b.ScreenConstants.a(100.0f));
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a, 750, dVar);
    }
}
