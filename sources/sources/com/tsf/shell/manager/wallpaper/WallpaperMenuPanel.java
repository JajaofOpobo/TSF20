package com.tsf.shell.manager.wallpaper;

import android.content.Intent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.censivn.C3DEngine.b.f.LabelRenderable;
import com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerF;
import com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerH;

import com.tsf.shell.Home;
import com.tsf.shell.f.e._g.a.MenuActionHandler;
import com.tsf.shell.manager.p.ThemePreferenceProvider;
import com.tsf.shell.plugin.themepicker.wallpaper.WallpaperAppActivity;
import com.tsf.shell.plugin.themepicker.wallpaper.WallpaperPickerActivity;
import com.tsf.shell.utils.HapticFeedbackManager;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WallpaperMenuPanel extends com.tsf.shell.f.e._g.a.MenuActionItem {
    private DesktopTouchHandlerH a;
    private WallpaperMenuContainer b;
    private ArrayList<MenuItem> c;
    private com.tsf.shell.manager.wallpaper.BlurSettingsMenu d;
    private MenuActionHandler e;

    public WallpaperMenuPanel(WallpaperMenuContainer eVar) {
        super(x.c(b.i.text_wallpapers));
        this.b = eVar;
        a();
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onRecycle() {
        Iterator<BlurSettingsMenu> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void a() {
        this.e = com.tsf.shell.manager.app.AppListManager.a(com.tsf.shell.manager.p.ThemePreferenceProvider.p);
        this.d = new com.tsf.shell.manager.wallpaper.BlurSettingsMenu();
        this.c = new ArrayList<>();
        this.c.add(new C0150b(x.c(b.i.theme_picker_theme_picker_gallery_apps), b.d.wallpaper_gallery_preview) { // from class: com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.1
            @Override // com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.c
            public void a() {
                Intent intent = new Intent();
                intent.setClass(com.censivn.C3DEngine.C3DEngine.d(), WallpaperAppActivity.class);
                Home.b().startActivity(intent);
            }
        });
        this.c.add(new C0150b(x.c(b.i.text_launcher), b.d.wallpaper_launcher_preview) { // from class: com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.2
            @Override // com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.c
            public void a() {
                Intent intent = new Intent();
                intent.setClass(com.censivn.C3DEngine.C3DEngine.d(), WallpaperPickerActivity.class);
                Home.b().startActivity(intent);
            }
        });
        this.c.add(new LiveWallpaperMenuItem(x.c(b.i.text_live_wallpapers)));
        this.a = new DesktopTouchHandlerH(com.censivn.C3DEngine.b.b.ScreenConstants.D, this.b.getHeight(), com.censivn.C3DEngine.b.b.ScreenConstants.c * 20.0f, com.censivn.C3DEngine.b.b.ScreenConstants.c * 20.0f, com.censivn.C3DEngine.b.b.ScreenConstants.a(320.0f), com.censivn.C3DEngine.b.b.ScreenConstants.a(520.0f));
        this.a.a(new com.censivn.C3DEngine.b.h.b.SparkleEffect() { // from class: com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.3
            @Override // com.censivn.C3DEngine.b.h.b.SparkleEffect
            public int a() {
                return WallpaperMenuPanel.this.c.size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.SparkleEffect
            public IRenderable a(int i, i iVar) {
                return (IRenderable) WallpaperMenuPanel.this.c.get(i);
            }
        });
        this.a.a(new f() { // from class: com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.4
            @Override // com.censivn.C3DEngine.b.h.b.DesktopTouchHandlerF
            public void a(IRenderable iVar, int i, MotionEvent motionEvent) {
                w.b();
                ((BlurSettingsMenu) WallpaperMenuPanel.this.c.get(i)).a();
            }
        });
        ArrayList<WallpaperPreviewRenderer.C0095a> arrayList = new ArrayList<>();
        WallpaperPreviewRenderer.C0095a c0095a = new WallpaperPreviewRenderer.C0095a(b.d.wallpaper_setting_scrollable, x.c(b.i.text_scrollable), new WallpaperPreviewRenderer.C0095WallpaperPreviewRenderer.C0096a() { // from class: com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.5
            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095WallpaperPreviewRenderer.C0096a
            public boolean a() {
                return com.tsf.shell.manager.b.ConfigManager.Y() == ShellWallpaperManager.a;
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095WallpaperPreviewRenderer.C0096a
            public void b() {
                com.tsf.shell.manager.b.ConfigManager.l(ShellWallpaperManager.a);
                com.tsf.shell.manager.app.LauncherAppInfo.d();
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095WallpaperPreviewRenderer.C0096a
            public void c() {
                com.tsf.shell.manager.b.ConfigManager.l(ShellWallpaperManager.b);
                com.tsf.shell.manager.app.LauncherAppInfo.d();
            }
        });
        WallpaperPreviewRenderer.C0095WallpaperPreviewRenderer.C0096a c0096a = new WallpaperPreviewRenderer.C0095WallpaperPreviewRenderer.C0096a() { // from class: com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.6
            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095WallpaperPreviewRenderer.C0096a
            public boolean a() {
                return true;
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095WallpaperPreviewRenderer.C0096a
            public void c() {
                WallpaperMenuPanel.this.b.changeMenu(WallpaperMenuPanel.this.d);
                WallpaperMenuPanel.this.d.setParentMenu(WallpaperMenuPanel.this);
            }
        };
        if (!com.tsf.shell.manager.app.LauncherAppInfo.f()) {
            arrayList.add(new WallpaperPreviewRenderer.C0095a(b.d.wallpaper_setting_blur, x.c(b.i.text_blur), c0096a));
        }
        arrayList.add(c0095a);
        setFunctions(arrayList);
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onShow() {
        this.e.b();
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onLayout(float f, float f2, float f3, float f4) {
        this.a.a(f, f2, f3, f4);
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public BaseRenderable getContentContainer() {
        return this.a;
    }

    static class MenuItem extends BaseRenderable {
        public static final int b = (int) com.censivn.C3DEngine.b.b.ScreenConstants.a(300.0f);
        public static final int c = (int) com.censivn.C3DEngine.b.b.ScreenConstants.a(500.0f);
        private LabelRenderable a = new LabelRenderable();
        private IRenderable d;

        public MenuItem(String str) {
            this.a.a(str);
            this.a.d(36);
            addChild(this.a);
            this.a.position().y = ((-c) / 2.0f) - com.censivn.C3DEngine.b.b.ScreenConstants.a(5.0f);
        }

        public void a(IRenderable iVar) {
            this.d = iVar;
            this.d.position().y = com.censivn.C3DEngine.b.b.ScreenConstants.a(25.0f);
            addChild(this.d);
        }

        public void b() {
            this.a.a();
        }

        public void a() {
        }
    }

    /* JADX INFO: renamed from: com.tsf.shell.manager.wallpaper.WallpaperMenuPanel$b, reason: collision with other inner class name */
    static class C0150b extends MenuItem {
        private WallpaperPreviewRenderer a;

        public C0150b(String str, int i) {
            super(str);
            this.a = new WallpaperPreviewRenderer();
            this.a.a(i);
            a(this.a);
        }

        @Override // com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.c
        public void b() {
            this.a.a();
            super.b();
        }
    }

    static class a extends GridRenderable {
        private TextureElement a;
        private int d;

        public a() {
            super(MenuItem.b, MenuItem.c, false);
            this.d = -1;
            calAABB(1.1f, 1.1f, 1.0f);
            this.a = new TextureElement(0, false);
            textures().addElement(this.a);
        }

        public void a(int i) {
            a();
            this.d = i;
        }

        @Override // com.censivn.C3DEngine.b.f.IRenderable
        public void onDrawStart() {
            if (this.d != 0 && this.a.id == 0) {
                com.censivn.C3DEngine.C3DEngine.g().a(this.a, this.d);
            }
        }

        public void a() {
            if (this.a.id != 0) {
                com.censivn.C3DEngine.C3DEngine.g().a(this.a);
            }
        }
    }
}
