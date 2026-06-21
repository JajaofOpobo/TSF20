package com.tsf.shell.manager.wallpaper;

import com.censivn.C3DEngine.b.e.TextIconRenderer;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.b;
import com.tsf.shell.f.e.ToggleRowItem;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class BlurSettingsMenu extends com.tsf.shell.f.e._g.a.MenuItemConfig {
    private BaseRenderable a;
    private l b;
    private h c;
    private int d;

    public Object c() {
        setTitle(b.i.text_wallpaper_blur);
        setMenuHeight(com.censivn.C3DEngine.b.b.ScreenConstants.a(330.0f));
        this.a = new BaseRenderable();
        this.b = new l(b.d.button_reset, b.i.text_reset) { // from class: com.tsf.shell.manager.wallpaper.BlurSettingsMenu.1
            @Override // com.tsf.shell.f.e.ToggleRowItem
            public void a() {
                BlurSettingsMenu.this.c.a(0, true);
            }
        };
        com.tsf.shell.manager.o.ThemeColorConstants.a(this.b, com.tsf.shell.manager.o.ThemeColorConstants.h);
        this.b.a(0);
        this.b.position().y = com.censivn.C3DEngine.b.b.ScreenConstants.a(-250.0f);
        this.c = new com.censivn.C3DEngine.b.e.PercentLabelRenderer() { // from class: com.tsf.shell.manager.wallpaper.BlurSettingsMenu.2
            @Override // com.censivn.C3DEngine.b.e.PercentLabelRenderer, com.censivn.C3DEngine.b.e.TextIconRenderer
            public void f(int i) {
                d(i + "%");
            }
        };
        this.c.g(b.i.text_level);
        this.c.i(0);
        this.c.j(100);
        this.c.b((int) com.censivn.C3DEngine.b.b.ScreenConstants.a(850.0f));
        this.c.position().y = com.censivn.C3DEngine.b.b.ScreenConstants.a(10.0f);
        this.c.a(new h.a() { // from class: com.tsf.shell.manager.wallpaper.BlurSettingsMenu.3
            @Override // com.censivn.C3DEngine.b.e.TextIconRenderer.a
            public boolean a(int i) {
                BlurSettingsMenu.this.d = i;
                com.tsf.shell.manager.app.LauncherAppInfo.b(i);
                return true;
            }
        });
        this.a.addChild(this.c);
        this.a.addChild(this.b);
    }

    private void a() {
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public BaseRenderable getContentContainer() {
        return this.a;
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemConfig, com.tsf.shell.f.e._g.a.MenuItemBase
    public void onLayout(float f, float f2, float f3, float f4) {
        super.onLayout(f, f2, f3, f4);
        BlurSettingsMenu();
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemConfig, com.tsf.shell.f.e._g.a.MenuItemBase
    public void onShow() {
        super.onShow();
        BlurSettingsMenu();
        this.c.f();
        this.d = com.tsf.shell.manager.app.LauncherAppInfo.j();
        this.c.k(this.d);
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onHideComplete() {
        recycle();
        com.tsf.shell.manager.app.LauncherAppInfo.c(this.d);
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemConfig
    public void onRequestExit() {
        this.menu.changeMenu(getParentMenu());
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemConfig, com.tsf.shell.f.e._g.a.MenuItemBase
    public void recycle() {
        super.recycle();
        removeIcon();
        this.b.b();
        this.c.g();
    }
}
