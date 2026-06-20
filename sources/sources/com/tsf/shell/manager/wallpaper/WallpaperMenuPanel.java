package com.tsf.shell.manager.wallpaper;

import android.content.Intent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.h.b.f;
import com.censivn.C3DEngine.b.h.b.h;

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
    private h a;
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
        Iterator<c> it = this.c.iterator();
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
                intent.setClass(com.censivn.C3DEngine.A.d(), WallpaperAppActivity.class);
                Home.b().startActivity(intent);
            }
        });
        this.c.add(new C0150b(x.c(b.i.text_launcher), b.d.wallpaper_launcher_preview) { // from class: com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.2
            @Override // com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.c
            public void a() {
                Intent intent = new Intent();
                intent.setClass(com.censivn.C3DEngine.A.d(), WallpaperPickerActivity.class);
                Home.b().startActivity(intent);
            }
        });
        this.c.add(new d(x.c(b.i.text_live_wallpapers)));
        this.a = new h(com.censivn.C3DEngine.b.b.A.D, this.b.getHeight(), com.censivn.C3DEngine.b.b.A.c * 20.0f, com.censivn.C3DEngine.b.b.A.c * 20.0f, com.censivn.C3DEngine.b.b.A.a(320.0f), com.censivn.C3DEngine.b.b.A.a(520.0f));
        this.a.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.3
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return b.this.c.size();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                return (i) b.this.c.get(i);
            }
        });
        this.a.a(new f() { // from class: com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.4
            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                w.b();
                ((c) b.this.c.get(i)).a();
            }
        });
        ArrayList<a.C0095a> arrayList = new ArrayList<>();
        a.C0095a c0095a = new a.C0095a(b.d.wallpaper_setting_scrollable, x.c(b.i.text_scrollable), new a.C0095a.C0096a() { // from class: com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.5
            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public boolean a() {
                return com.tsf.shell.manager.b.ConfigManager.Y() == ShellWallpaperManager.a;
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void b() {
                com.tsf.shell.manager.b.ConfigManager.l(ShellWallpaperManager.a);
                com.tsf.shell.manager.app.LauncherAppInfo.d();
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void c() {
                com.tsf.shell.manager.b.ConfigManager.l(ShellWallpaperManager.b);
                com.tsf.shell.manager.app.LauncherAppInfo.d();
            }
        });
        a.C0095a.C0096a c0096a = new a.C0095a.C0096a() { // from class: com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.6
            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public boolean a() {
                return true;
            }

            @Override // com.tsf.shell.f.e._g.a.MenuActionHandler.C0095a.C0096a
            public void c() {
                b.this.b.changeMenu(b.this.d);
                b.this.d.setParentMenu(b.this);
            }
        };
        if (!com.tsf.shell.manager.app.LauncherAppInfo.f()) {
            arrayList.add(new a.C0095a(b.d.wallpaper_setting_blur, x.c(b.i.text_blur), c0096a));
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
    public j getContentContainer() {
        return this.a;
    }

    static class MenuItem extends j {
        public static final int b = (int) com.censivn.C3DEngine.b.b.A.a(300.0f);
        public static final int c = (int) com.censivn.C3DEngine.b.b.A.a(500.0f);
        private m a = new m();
        private i d;

        public MenuItem(String str) {
            this.a.a(str);
            this.a.d(36);
            addChild(this.a);
            this.a.position().y = ((-c) / 2.0f) - com.censivn.C3DEngine.b.b.A.a(5.0f);
        }

        public void a(i iVar) {
            this.d = iVar;
            this.d.position().y = com.censivn.C3DEngine.b.b.A.a(25.0f);
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
        private a a;

        public C0150b(String str, int i) {
            super(str);
            this.a = new a();
            this.a.a(i);
            a(this.a);
        }

        @Override // com.tsf.shell.manager.wallpaper.WallpaperMenuPanel.c
        public void b() {
            this.a.a();
            super.b();
        }
    }

    static class a extends k {
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

        @Override // com.censivn.C3DEngine.b.f.i
        public void onDrawStart() {
            if (this.d != 0 && this.a.id == 0) {
                com.censivn.C3DEngine.A.g().a(this.a, this.d);
            }
        }

        public void a() {
            if (this.a.id != 0) {
                com.censivn.C3DEngine.A.g().a(this.a);
            }
        }
    }
}
