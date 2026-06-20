package com.tsf.shell.manager.q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.ShellThemeProvider;
import com.tsf.shell.manager.app.LauncherAppInfo;
import com.tsf.shell.services.NotifierConnector;
import com.tsf.shell.utils.MarketLinkHandler;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class UnreadBadgeManager implements A.InterfaceC0165a {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private boolean g = false;
    private com.tsf.shell.services.NotifierConnector h;
    private LauncherAppInfo i;
    private LauncherAppInfo j;
    private LauncherAppInfo k;
    private LauncherAppInfo l;
    private LauncherAppInfo m;

    public UnreadBadgeManager() {
        UnreadBadgeManager();
    }

    private void b() {
        this.h = new com.tsf.shell.services.NotifierConnector();
        this.h.a(com.censivn.C3DEngine.C3DEngine.d(), new Runnable() { // from class: com.tsf.shell.manager.q.UnreadBadgeManager.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.a = a.this.h.a.a();
                    a.this.b = a.this.h.a.b();
                    a.this.c = a.this.h.a.d();
                    a.this.e = a.this.h.a.e();
                    a.this.f = a.this.h.a.f();
                    a.this.a(a.this.a);
                    a.this.b(a.this.b);
                    a.this.d(a.this.c);
                    a.this.e(a.this.e);
                    a.this.f(a.this.f);
                    a.this.g = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.h.a(com.censivn.C3DEngine.C3DEngine.d(), this);
    }

    public void a(Context context) {
        try {
            this.h.c(context);
        } catch (Exception e) {
        }
        try {
            this.h.b(context);
        } catch (Exception e2) {
        }
    }

    public void a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.tsf.shell.services.notifier", "com.tsf.shell.services.notifier.MainActivity"));
        intent.setAction("android.intent.action.VIEW");
        try {
            Home.b().startActivity(intent);
        } catch (Exception e) {
            e.a(Home.b(), b.i.mn_unread_download_notic, b.i.public_action_ok, b.i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.q.UnreadBadgeManager.5
                @Override // java.lang.Runnable
                public void run() {
                    k.a(Home.b(), "com.tsf.shell.services.notifier");
                }
            }, (Runnable) null);
        }
    }

    public void a(LauncherAppInfo fVar) {
        if (this.i == null && com.tsf.shell.utils.OEMComponentResolver.a(fVar.b)) {
            this.i = fVar;
            if (this.g) {
                com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.q.UnreadBadgeManager.6
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.i.a(a.this.b);
                    }
                });
                return;
            }
            return;
        }
        if (this.j == null && com.tsf.shell.utils.OEMComponentResolver.b(fVar.b)) {
            this.j = fVar;
            if (this.g) {
                com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.q.UnreadBadgeManager.7
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.j.a(a.this.a);
                    }
                });
                return;
            }
            return;
        }
        if (this.m == null && com.tsf.shell.utils.OEMComponentResolver.e(fVar.b)) {
            this.m = fVar;
            if (this.g) {
                com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.q.UnreadBadgeManager.8
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.m.a(a.this.f);
                    }
                });
                return;
            }
            return;
        }
        if (this.l == null && com.tsf.shell.utils.OEMComponentResolver.c(fVar.b)) {
            this.l = fVar;
            if (this.g) {
                com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.q.UnreadBadgeManager.9
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.l.a(a.this.e);
                    }
                });
                return;
            }
            return;
        }
        if (this.k == null && com.tsf.shell.utils.OEMComponentResolver.d(fVar.b)) {
            this.k = fVar;
            if (this.g) {
                com.censivn.C3DEngine.C3DEngine.a().c(new Runnable() { // from class: com.tsf.shell.manager.q.UnreadBadgeManager.10
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.k.a(a.this.c);
                    }
                });
            }
        }
    }

    @Override // com.tsf.shell.services.a.InterfaceC0165a
    public void a(int i) {
        int i2 = 1;
        this.a = i;
        if (this.j != null && this.j.h() != i) {
            RenderRunnable renderRunnable = new RenderRunnable(i2, i2) { // from class: com.tsf.shell.manager.q.UnreadBadgeManager.11
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    if (a.this.j != null) {
                        a.this.j.a(a.this.a);
                    }
                }
            };
            renderRunnable.autoInvalidate = true;
            com.censivn.C3DEngine.C3DEngine.a().a(renderRunnable);
        }
    }

    @Override // com.tsf.shell.services.a.InterfaceC0165a
    public void b(int i) {
        int i2 = 1;
        this.b = i;
        if (this.i != null && this.i.h() != this.b) {
            RenderRunnable renderRunnable = new RenderRunnable(i2, i2) { // from class: com.tsf.shell.manager.q.UnreadBadgeManager.12
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    if (a.this.i != null) {
                        a.this.i.a(a.this.b);
                    }
                }
            };
            renderRunnable.autoInvalidate = true;
            com.censivn.C3DEngine.C3DEngine.a().a(renderRunnable);
        }
    }

    @Override // com.tsf.shell.services.a.InterfaceC0165a
    public void c(int i) {
        this.d = i;
    }

    @Override // com.tsf.shell.services.a.InterfaceC0165a
    public void d(int i) {
        int i2 = 1;
        this.c = i;
        if (this.k != null && this.k.h() != this.c) {
            RenderRunnable renderRunnable = new RenderRunnable(i2, i2) { // from class: com.tsf.shell.manager.q.UnreadBadgeManager.2
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    if (a.this.k != null) {
                        a.this.k.a(a.this.c);
                    }
                }
            };
            renderRunnable.autoInvalidate = true;
            com.censivn.C3DEngine.C3DEngine.a().a(renderRunnable);
        }
    }

    @Override // com.tsf.shell.services.a.InterfaceC0165a
    public void e(int i) {
        int i2 = 1;
        this.e = i;
        if (this.l != null && this.l.h() != this.e) {
            RenderRunnable renderRunnable = new RenderRunnable(i2, i2) { // from class: com.tsf.shell.manager.q.UnreadBadgeManager.3
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    if (a.this.l != null) {
                        a.this.l.a(a.this.e);
                    }
                }
            };
            renderRunnable.autoInvalidate = true;
            com.censivn.C3DEngine.C3DEngine.a().a(renderRunnable);
        }
    }

    @Override // com.tsf.shell.services.a.InterfaceC0165a
    public void f(int i) {
        int i2 = 1;
        this.f = i;
        if (this.m != null && this.m.h() != this.f) {
            RenderRunnable renderRunnable = new RenderRunnable(i2, i2) { // from class: com.tsf.shell.manager.q.UnreadBadgeManager.4
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    if (a.this.m != null) {
                        a.this.m.a(a.this.f);
                    }
                }
            };
            renderRunnable.autoInvalidate = true;
            com.censivn.C3DEngine.C3DEngine.a().a(renderRunnable);
        }
    }
}
