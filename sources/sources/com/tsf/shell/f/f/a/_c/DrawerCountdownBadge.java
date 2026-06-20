package com.tsf.shell.f.f.a._c;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.b;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerCountdownBadge extends DrawerSelectionFrame {
    private com.censivn.C3DEngine.b.h.d.ProgressBarItem c;
    private boolean d = false;
    private TextureElement a = x.b(DrawerWidgetTouchHandler.d.drawer_layout_homescreen_countdown);
    private com.censivn.C3DEngine.b.f.GridRenderable b = com.censivn.C3DEngine.b.b.A.a(180.0f, 180.0f);

    public DrawerCountdownBadge() {
        this.b.textures().addElement(this.a);
        com.tsf.shell.manager.o.ThemeColorConstants.a(this.b, com.tsf.shell.manager.o.ThemeColorConstants.h);
        addChild(this.b);
        calAABB();
        this.c = new com.censivn.C3DEngine.b.h.d.ProgressBarItem(com.censivn.C3DEngine.b.b.A.a(182.0f), DrawerWidgetTouchHandler.d.ring);
        com.tsf.shell.manager.o.ThemeColorConstants.a(this.c, com.tsf.shell.manager.o.ThemeColorConstants.h);
        addChild(this.c);
    }

    public void b() {
    }

    public void c() {
        this.c.e();
        this.c.b(0.0f);
        this.d = false;
    }

    public void d() {
        if (!this.d) {
            this.d = true;
            this.c.a(360.0f, 1500, new Runnable() { // from class: com.tsf.shell.f.f.a._c.DrawerCountdownBadge.1
                @Override // java.lang.Runnable
                public void run() {
                    g.this.b();
                }
            });
        }
    }

    public void e() {
        if (this.d) {
            this.d = false;
            this.c.a(0.0f, 500);
        }
    }
}
