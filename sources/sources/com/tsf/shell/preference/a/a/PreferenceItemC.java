package com.tsf.shell.preference.a.a;

import android.app.Activity;
import com.censivn.C3DEngine.b.e.IconButtonRenderer;
import com.censivn.C3DEngine.b.e.PanelGroupRenderer;
import com.censivn.C3DEngine.b.e.ActionButtonRenderer;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.tsf.b;
import com.tsf.shell.Home;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PreferenceItemC extends i {
    private j a;
    private com.censivn.C3DEngine.b.e.IconButtonRenderer b;
    private com.censivn.C3DEngine.b.e.IconButtonRenderer c;
    private com.censivn.C3DEngine.b.e.IconButtonRenderer d;
    private com.censivn.C3DEngine.b.e.IconButtonRenderer e;
    private com.censivn.C3DEngine.b.e.IconButtonRenderer f;
    private com.censivn.C3DEngine.b.e.IconButtonRenderer g;
    private com.censivn.C3DEngine.b.e.IconButtonRenderer h;
    private A i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;

    public PreferenceItemC() {
        a(PreferenceItemB.i.text_preferences);
        this.a = new j();
        this.a.h(PreferenceItemB.i.mn_screen_orientation);
        this.a.a(new j.a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemC.1
            @Override // com.censivn.C3DEngine.b.e.ActionButtonRenderer.a
            public void a() {
                com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.PreferenceItemC.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.d.ShellDataHandler.a(com.censivn.C3DEngine.C3DEngine.d(), c.this.a);
                    }
                });
            }
        });
        b(this.a);
        this.b = new com.censivn.C3DEngine.b.e.IconButtonRenderer();
        this.b.h(PreferenceItemB.i.mn_infinite_scroll);
        this.b.i(PreferenceItemB.i.mn_infinite_scroll_summary);
        this.b.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemC.2
            @Override // com.censivn.C3DEngine.b.e.IconButtonRenderer.C0027a
            public boolean a(boolean z) {
                if (com.tsf.shell.manager.b.ConfigManager.J() != z) {
                    com.tsf.shell.manager.b.ConfigManager.b(Boolean.valueOf(z));
                    com.tsf.shell.manager.app.StateHub.g();
                    return true;
                }
                return true;
            }
        });
        b(this.b);
        this.c = new com.censivn.C3DEngine.b.e.IconButtonRenderer();
        this.c.h(PreferenceItemB.i.mn_transparent_navigation_bar);
        this.c.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemC.3
            @Override // com.censivn.C3DEngine.b.e.IconButtonRenderer.C0027a
            public boolean a(boolean z) {
                c.this.m = z;
                return true;
            }
        });
        b(this.c);
        this.d = new com.censivn.C3DEngine.b.e.IconButtonRenderer();
        this.d.h(PreferenceItemB.i.mn_transparent_notification_bar);
        this.d.i(PreferenceItemB.i.mn_transparent_notification_bar_summary);
        this.d.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemC.4
            @Override // com.censivn.C3DEngine.b.e.IconButtonRenderer.C0027a
            public boolean a(boolean z) {
                c.this.l = z;
                return true;
            }
        });
        b(this.d);
        this.e = new com.censivn.C3DEngine.b.e.IconButtonRenderer();
        this.e.h(PreferenceItemB.i.mn_show_notification_bar);
        this.e.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemC.5
            @Override // com.censivn.C3DEngine.b.e.IconButtonRenderer.C0027a
            public boolean a(boolean z) {
                c.this.k = z;
                return true;
            }
        });
        b(this.e);
        this.g = new com.censivn.C3DEngine.b.e.IconButtonRenderer();
        this.g.h(PreferenceItemB.i.text_floating_button);
        this.g.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemC.6
            @Override // com.censivn.C3DEngine.b.e.IconButtonRenderer.C0027a
            public boolean a(boolean z) {
                return true;
            }
        });
        b(this.g);
        this.i = new PreferenceItemA();
        b(this.i);
        this.f = new com.censivn.C3DEngine.b.e.IconButtonRenderer();
        this.f.h(PreferenceItemB.i.text_lock_desktop);
        this.f.i(PreferenceItemB.i.text_lock_desktop_summary);
        this.f.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemC.7
            @Override // com.censivn.C3DEngine.b.e.IconButtonRenderer.C0027a
            public boolean a(boolean z) {
                com.tsf.shell.manager.app.FeatureConfig.b();
                return true;
            }
        });
        b(this.f);
        this.h = new com.censivn.C3DEngine.b.e.IconButtonRenderer();
        this.h.h(PreferenceItemB.i.mn_vibration_feedback);
        this.h.i(PreferenceItemB.i.mn_vibration_feedback_summary);
        this.h.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemC.8
            @Override // com.censivn.C3DEngine.b.e.IconButtonRenderer.C0027a
            public boolean a(boolean z) {
                if (com.tsf.shell.manager.b.ConfigManager.ae() != z) {
                    com.tsf.shell.manager.b.ConfigManager.p(z);
                    return true;
                }
                return true;
            }
        });
        b(this.h);
    }

    @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
    public void f() {
        com.tsf.shell.manager.app.AppListManager.a(com.tsf.shell.manager.p.ThemePreferenceProvider.k).b();
        this.k = com.tsf.shell.manager.b.ConfigManager.P();
        this.l = com.tsf.shell.manager.b.ConfigManager.O();
        this.m = com.tsf.shell.manager.b.ConfigManager.N();
        this.j = com.tsf.shell.manager.b.ConfigManager.ac();
        this.g.c(this.j);
        com.tsf.shell.d.ShellDataHandler.a(this.a);
        this.b.c(com.tsf.shell.manager.b.ConfigManager.J());
        this.e.c(this.k);
        if (com.tsf.shell.utils.StatusBarHelper.b()) {
            this.c.c(this.m);
        } else {
            c(this.c);
        }
        if (com.tsf.shell.utils.StatusBarHelper.c()) {
            this.d.c(this.l);
        } else {
            c(this.d);
        }
        this.f.c(com.tsf.shell.manager.app.FeatureConfig.d());
        this.h.c(com.tsf.shell.manager.b.ConfigManager.ae());
        this.n = com.tsf.shell.manager.b.ConfigManager.ab();
        this.i.k(this.n);
    }

    @Override // com.censivn.C3DEngine.b.e.DesktopPanelRenderer
    public void g() {
        com.censivn.C3DEngine.C3DEngine.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.PreferenceItemC.9
            @Override // java.lang.Runnable
            public void run() {
                if (com.tsf.shell.manager.b.ConfigManager.P() != c.this.k) {
                    com.tsf.shell.manager.app.ObserverManager.a(!c.this.k);
                }
                if (com.tsf.shell.utils.StatusBarHelper.c() && com.tsf.shell.manager.b.ConfigManager.O() != c.this.l) {
                    com.censivn.C3DEngine.b.c.WindowManager eVar = com.tsf.shell.manager.app.ObserverManager;
                    com.censivn.C3DEngine.b.c.WindowManager.b(Home.b(), c.this.l, true);
                }
                if (com.tsf.shell.utils.StatusBarHelper.b() && com.tsf.shell.manager.b.ConfigManager.N() != c.this.m) {
                    com.tsf.shell.manager.app.ObserverManager.a((Activity) Home.b(), c.this.m, true);
                }
            }
        });
        int iE = this.i.e();
        boolean zE = this.g.e();
        if (zE != this.j) {
            com.tsf.shell.manager.b.ConfigManager.o(zE);
        }
        if (iE != this.n) {
            com.tsf.shell.manager.b.ConfigManager.m(iE);
        }
        com.tsf.shell.manager.app.ServiceFactory.a(zE, iE);
    }

    public static class A extends com.censivn.C3DEngine.b.e.PercentLabelRenderer {
        final com.censivn.C3DEngine.b.f.BaseRenderable b = new com.censivn.C3DEngine.b.f.BaseRenderable();

        public A() {
            a(com.censivn.C3DEngine.b.b.ScreenConstants.a(200.0f));
            g(PreferenceItemB.i.text_transparency);
            h(PreferenceItemB.i.text_floating_button_transparency_summary);
            i(0);
            j(100);
            a(" %");
            k kVarA = com.censivn.C3DEngine.b.b.ScreenConstants.a(128.0f, 128.0f);
            kVarA.textures().addElement(com.tsf.shell.manager.app.ServiceFactory.b().a());
            k kVarA2 = com.censivn.C3DEngine.b.b.ScreenConstants.a(46.0f, 46.0f);
            kVarA2.textures().addElement(com.tsf.shell.manager.app.ServiceFactory.b().b());
            this.b.addChild(kVarA);
            this.b.addChild(kVarA2);
            this.b.position().y = -com.censivn.C3DEngine.b.b.ScreenConstants.a(120.0f);
        }

        @Override // com.censivn.C3DEngine.b.e.PercentLabelRenderer, com.censivn.C3DEngine.b.e.TextIconRenderer
        public void f(int i) {
            super.f(i);
            l(i);
        }

        @Override // com.censivn.C3DEngine.b.b.DesktopRenderer, com.censivn.C3DEngine.b.f.BaseRenderable
        public void onDrawChildStart() {
            super.onDrawChildStart();
            this.b.dispatchDraw();
        }

        @Override // com.censivn.C3DEngine.b.e.TextIconRenderer, com.censivn.C3DEngine.b.b.DesktopRenderer
        public void c(int i) {
            super.c(i);
            this.b.position().x = ((-i) / 2.0f) + com.censivn.C3DEngine.b.b.ScreenConstants.a(100.0f);
        }

        @Override // com.censivn.C3DEngine.b.e.TextIconRenderer
        public void k(int i) {
            super.k(i);
            l(i);
        }

        private void l(int i) {
            this.b.alpha((i / 100.0f) * 255.0f);
        }
    }
}
