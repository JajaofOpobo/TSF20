package com.tsf.shell.f;

import com.tsf.shell.manager.b.ConfigManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ShellSurfaceConfig {
    private static ShellSurfaceConfig b;
    private static com.tsf.shell.manager.f.LauncherInitController c;
    private com.censivn.C3DEngine.a.GLSurfaceViewWrapper a;

    public ShellSurfaceConfig(com.censivn.C3DEngine.a.GLSurfaceViewWrapper aVar) {
        b = this;
        this.a = aVar;
        ShellSurfaceConfig();
    }

    public static ShellSurfaceConfig c() {
        return b;
    }

    private void h() {
        this.a.setEGLContextClientVersion(2);
        if (ConfigManager.ai()) {
            this.a.setEGLConfigChooser(8, 8, 8, 8, 16, 8);
            this.a.getHolder().setFormat(-3);
        } else {
            this.a.setEGLConfigChooser(5, 6, 5, 0, 16, 8);
            this.a.getHolder().setFormat(4);
        }
        c = new com.tsf.shell.manager.f.LauncherInitController(this.a);
    }

    public void a() {
    }

    public void b() {
    }

    public static void d() {
        com.tsf.shell.manager.app.WidgetManager.d();
        com.tsf.shell.manager.app.WidgetLayoutManager.a();
        com.tsf.shell.manager.app.LauncherAppInfo.h();
        com.tsf.shell.manager.app.WidgetPanelController.b();
    }

    public void e() {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.f._d.1
            @Override // java.lang.Runnable
            public void run() {
                ShellSurfaceConfig.this.a.onResume();
                com.censivn.C3DEngine.b.g.c.c();
                ShellSurfaceConfig.c.f();
            }
        };
        com.censivn.C3DEngine.C3DEngine.e().j();
        com.censivn.C3DEngine.C3DEngine.a().c(runnable);
    }

    public void f() {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.f._d.2
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.b.g.c.b();
                ShellSurfaceConfig.c.g();
                ShellSurfaceConfig.this.a.onPause();
            }
        };
        com.censivn.C3DEngine.C3DEngine.e().j();
        com.censivn.C3DEngine.C3DEngine.a().c(runnable);
    }
}
