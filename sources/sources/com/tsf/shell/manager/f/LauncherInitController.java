package com.tsf.shell.manager.f;

import android.opengl.GLSurfaceView;
import com.censivn.C3DEngine.a.f;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.Home;
import com.tsf.shell.f.e.p;
import com.tsf.shell.f.e.s;
import com.tsf.shell.f.f.g;
import com.tsf.shell.f.f.n;
import com.tsf.shell.manager.f.WorkspaceScene;
import com.tsf.shell.manager.p.ThemePreferenceProvider;
import com.tsf.shell.manager.wallpaper.ShellWallpaperManager;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.utils.t;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class LauncherInitController extends f {
    private j c;
    private j d;
    private j e;
    private boolean f;
    private boolean g;
    private Object h;

    public c(GLSurfaceView gLSurfaceView) {
        super(gLSurfaceView, "Launcher");
        this.f = false;
        this.g = true;
        this.h = null;
        com.tsf.shell.manager.app.Initializer = new com.tsf.shell.manager.j.RateDialogController();
        com.tsf.shell.manager.app.AppListManager = new e();
        com.tsf.shell.manager.app.C = new com.tsf.shell.services.c();
        com.tsf.shell.manager.app.CallbackHandler = new com.censivn.C3DEngine.b.c.d();
        com.tsf.shell.manager.app.FeatureConfig = new com.tsf.shell.manager.h.ScreenLockController();
        com.tsf.shell.manager.app.AppListModel = this;
        com.censivn.C3DEngine.a.a(gLSurfaceView);
        com.censivn.C3DEngine.b.b.A.a();
        com.tsf.shell.manager.app.SimpleHandler = new com.tsf.shell.manager.e.ScreenSaverDelayConfig();
        com.tsf.shell.manager.app.TextureCache = new com.tsf.shell.f.a.a.b();
        com.tsf.shell.manager.app.ActionHandler = new com.tsf.shell.f.a.b.a();
        com.tsf.shell.manager.app.EventHandler = new com.tsf.shell.manager.q.UnreadBadgeManager();
        ThemeManager.initThemeManager();
        com.tsf.shell.manager.app.FolderManager = new com.tsf.shell.manager.action.ActionManager();
        com.tsf.shell.manager.action.GestureHandler.a(com.censivn.C3DEngine.A.d());
        com.tsf.shell.manager.app.ObjectRegistry = new com.tsf.shell.manager.c.ContactManager();
        com.tsf.shell.e.DragLayer eVar = (com.tsf.shell.e.DragLayer) gLSurfaceView.getParent();
        com.tsf.shell.manager.app.ServiceFactory = new com.tsf.shell.f.h.b();
        com.tsf.shell.manager.app.PanelStateManager = new com.tsf.shell.manager.m.SideMenuManager();
        com.tsf.shell.manager.app.LauncherAppInfo = new ShellWallpaperManager(com.censivn.C3DEngine.A.d());
        com.tsf.shell.manager.app.TaskScheduler = new d(eVar);
        com.tsf.shell.manager.app.StateHub = new n();
        com.tsf.shell.manager.app.WidgetAnimator = new com.tsf.shell.f.e.e.c();
        com.tsf.shell.manager.app.Notifier = new com.tsf.shell.manager.n.ToastOverlayController();
        com.tsf.shell.manager.app.WidgetPanelController = new com.tsf.shell.f.c.A();
        com.tsf.shell.manager.app.PositionAnimator = new com.tsf.shell.manager.l.ShortcutManagerHolder();
        com.tsf.shell.manager.app.WidgetManager = new com.tsf.shell.manager.r.c.WidgetRegistryManager();
        com.tsf.shell.manager.app.StateManager = new com.tsf.shell.manager.d.HitTargetManager();
        com.tsf.shell.manager.app.WidgetLayoutManager = new com.tsf.shell.manager.r.a.WidgetInstanceTracker();
        com.tsf.shell.manager.app.PlaceholderManager = new p();
        if (!t.a(com.censivn.C3DEngine.A.d())) {
            com.tsf.shell.services.c.a = false;
        }
        this.d = new j();
    }

    private void h() {
        com.tsf.shell.f.e.b.a();
        com.tsf.shell.f.e.t.b();
        s.c();
        com.tsf.shell.f.e.a.a();
    }

    @Override // com.censivn.C3DEngine.a.f, com.censivn.C3DEngine.d.b
    public void b() {
        Home.c.a("initScene start");
        Home.q();
        com.tsf.shell.f.e.b.e.a();
        com.tsf.shell.manager.app.PreferenceProvider = new com.tsf.shell.preference.a.d();
        com.tsf.shell.manager.app.v = new com.tsf.shell.f._d.A();
        com.tsf.shell.f.i.b.d.b.k();
        new com.tsf.shell.manager.o.EmptyStub();
        com.censivn.C3DEngine.a.d.d().a(new com.tsf.shell.f.i.a.a(new j()));
        com.tsf.shell.manager.app.DataCoordinator = new b();
        this.d = new j();
        this.e = new j();
        com.tsf.shell.manager.p.TipsDialogManager.a();
        com.tsf.shell.manager.app.WidgetAnimator.a();
        com.tsf.shell.manager.app.LauncherAppInfo.b();
        com.tsf.shell.manager.app.TaskScheduler.a(this.a);
        this.c = com.tsf.shell.manager.app.StateHub.f();
        com.tsf.shell.manager.app.ServiceFactory.a(this.e);
        com.tsf.shell.manager.app.PanelStateManager.a(this.e);
        com.tsf.shell.manager.app.WidgetPanelController.a(this.d);
        com.tsf.shell.manager.app.WidgetManager.a();
        com.tsf.shell.manager.app.WidgetLayoutManager.b();
        com.tsf.shell.manager.app.Notifier.a(this.d);
        com.tsf.shell.manager.app.DataCoordinator.addChild(com.tsf.shell.manager.app.LauncherAppInfo.g());
        com.tsf.shell.manager.app.DataCoordinator.addChild(this.c);
        com.tsf.shell.manager.app.DataCoordinator.addChild(this.d);
        this.a.addChild(com.tsf.shell.manager.app.DataCoordinator);
        this.a.addChild(this.e);
        h();
        com.tsf.shell.f._d.c().a();
        Home.c.a("initScene end");
        this.f = true;
    }

    public boolean c() {
        return this.g;
    }

    public void d() {
        com.tsf.shell.f.e._g.d.hideAll();
        a((Object) this);
        c(this);
        this.c.mouseEnabled(false);
    }

    public void e() {
        b(this);
        a((Object) this, true);
        this.c.mouseEnabled(true);
    }

    public void a(Object obj) {
        com.tsf.shell.manager.app.WidgetPanelController.a.m();
        com.tsf.shell.manager.app.WidgetPanelController.b.y();
    }

    public void a(Object obj, boolean z) {
        if (!z || !com.tsf.shell.manager.app.StateHub.E()) {
            com.tsf.shell.manager.app.WidgetPanelController.a.n();
            com.tsf.shell.manager.app.WidgetPanelController.b.z();
        }
    }

    public void b(Object obj) {
        if (this.h == obj) {
            this.h = null;
            com.tsf.shell.manager.app.ServiceFactory.i();
            com.tsf.shell.manager.app.WidgetPanelController.b.z();
            com.tsf.shell.manager.app.PanelStateManager.j();
        }
    }

    public void c(Object obj) {
        if (this.h == null) {
            this.h = obj;
            com.tsf.shell.manager.app.ServiceFactory.k();
            com.tsf.shell.manager.app.WidgetPanelController.b.y();
            com.tsf.shell.manager.app.PanelStateManager.i();
        }
    }

    public void a(Runnable runnable, int i) {
        a(null, runnable, i);
    }

    public void a(b.a aVar, Runnable runnable, int i) {
        this.g = false;
        com.tsf.shell.f.e._g.d.hideAll();
        com.tsf.shell.manager.app.ServiceFactory.k();
        com.tsf.shell.manager.app.PanelStateManager.i();
        com.tsf.shell.manager.action.GestureHandler.a();
        com.tsf.shell.manager.app.DataCoordinator.a(aVar, i, runnable);
    }

    public void a(final Runnable runnable, boolean z) {
        if (this.h == null) {
            com.tsf.shell.manager.app.ServiceFactory.i();
            com.tsf.shell.manager.app.PanelStateManager.j();
        }
        com.tsf.shell.manager.app.DataCoordinator.a(new Runnable() { // from class: com.tsf.shell.manager.f.LauncherInitController.1
            @Override // java.lang.Runnable
            public void run() {
                c.this.g = true;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }, z);
    }

    public void a(Runnable runnable) {
        b(runnable, ItemInfo.APP_INTENT);
    }

    public void b(final Runnable runnable, int i) {
        final boolean zA = com.tsf.shell.manager.app.v.SimpleHelper.b().a();
        g gVarN = com.tsf.shell.manager.app.StateHub.n();
        gVarN.ab();
        gVarN.a(new Runnable() { // from class: com.tsf.shell.manager.f.LauncherInitController.2
            @Override // java.lang.Runnable
            public void run() {
                if (!zA) {
                    c.this.c.visible(false);
                }
                if (runnable != null) {
                    runnable.run();
                }
            }
        }, i);
        this.c.mouseEnabled(false);
    }

    public void b(final Runnable runnable, boolean z) {
        this.c.visible(true);
        final g gVarN = com.tsf.shell.manager.app.StateHub.n();
        gVarN.a(new Runnable() { // from class: com.tsf.shell.manager.f.LauncherInitController.3
            @Override // java.lang.Runnable
            public void run() {
                c.this.g = true;
                gVarN.ac();
                if (runnable != null) {
                    runnable.run();
                }
                c.this.c.mouseEnabled(true);
            }
        }, z);
    }

    public void f() {
        if (this.f) {
            com.tsf.shell.manager.app.StateHub.O();
            com.tsf.shell.manager.app.WidgetLayoutManager.d();
        }
    }

    public void g() {
        if (this.f) {
            com.tsf.shell.manager.app.StateHub.P();
            com.tsf.shell.manager.app.WidgetLayoutManager.c();
        }
    }
}
