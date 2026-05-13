package com.tsf.shell.manager.q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.e;
import com.tsf.shell.manager.a.f;
import com.tsf.shell.services.a;
import com.tsf.shell.utils.k;
/* loaded from: classes.dex */
public class a implements a.InterfaceC0165a {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private boolean g = false;
    private com.tsf.shell.services.a h;
    private f i;
    private f j;
    private f k;
    private f l;
    private f m;

    public a() {
        b();
    }

    private void b() {
        this.h = new com.tsf.shell.services.a();
        this.h.a(com.censivn.C3DEngine.a.d(), new Runnable() { // from class: com.tsf.shell.manager.q.a.1
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
        this.h.a(com.censivn.C3DEngine.a.d(), this);
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
            e.a(Home.b(), b.i.mn_unread_download_notic, b.i.public_action_ok, b.i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.q.a.5
                @Override // java.lang.Runnable
                public void run() {
                    k.a(Home.b(), "com.tsf.shell.services.notifier");
                }
            }, (Runnable) null);
        }
    }

    public void a(f fVar) {
        if (this.i == null && com.tsf.shell.utils.b.a(fVar.b)) {
            this.i = fVar;
            if (this.g) {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.q.a.6
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.i.a(a.this.b);
                    }
                });
            }
        } else if (this.j == null && com.tsf.shell.utils.b.b(fVar.b)) {
            this.j = fVar;
            if (this.g) {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.q.a.7
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.j.a(a.this.a);
                    }
                });
            }
        } else if (this.m == null && com.tsf.shell.utils.b.e(fVar.b)) {
            this.m = fVar;
            if (this.g) {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.q.a.8
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.m.a(a.this.f);
                    }
                });
            }
        } else if (this.l == null && com.tsf.shell.utils.b.c(fVar.b)) {
            this.l = fVar;
            if (this.g) {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.q.a.9
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.l.a(a.this.e);
                    }
                });
            }
        } else if (this.k == null && com.tsf.shell.utils.b.d(fVar.b)) {
            this.k = fVar;
            if (this.g) {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.q.a.10
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
        this.a = i;
        if (this.j != null && this.j.h() != i) {
            RenderRunnable renderRunnable = new RenderRunnable(1, 1) { // from class: com.tsf.shell.manager.q.a.11
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    if (a.this.j != null) {
                        a.this.j.a(a.this.a);
                    }
                }
            };
            renderRunnable.autoInvalidate = true;
            com.censivn.C3DEngine.a.a().a(renderRunnable);
        }
    }

    @Override // com.tsf.shell.services.a.InterfaceC0165a
    public void b(int i) {
        this.b = i;
        if (this.i != null && this.i.h() != this.b) {
            RenderRunnable renderRunnable = new RenderRunnable(1, 1) { // from class: com.tsf.shell.manager.q.a.12
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    if (a.this.i != null) {
                        a.this.i.a(a.this.b);
                    }
                }
            };
            renderRunnable.autoInvalidate = true;
            com.censivn.C3DEngine.a.a().a(renderRunnable);
        }
    }

    @Override // com.tsf.shell.services.a.InterfaceC0165a
    public void c(int i) {
        this.d = i;
    }

    @Override // com.tsf.shell.services.a.InterfaceC0165a
    public void d(int i) {
        this.c = i;
        if (this.k != null && this.k.h() != this.c) {
            RenderRunnable renderRunnable = new RenderRunnable(1, 1) { // from class: com.tsf.shell.manager.q.a.2
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    if (a.this.k != null) {
                        a.this.k.a(a.this.c);
                    }
                }
            };
            renderRunnable.autoInvalidate = true;
            com.censivn.C3DEngine.a.a().a(renderRunnable);
        }
    }

    @Override // com.tsf.shell.services.a.InterfaceC0165a
    public void e(int i) {
        this.e = i;
        if (this.l != null && this.l.h() != this.e) {
            RenderRunnable renderRunnable = new RenderRunnable(1, 1) { // from class: com.tsf.shell.manager.q.a.3
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    if (a.this.l != null) {
                        a.this.l.a(a.this.e);
                    }
                }
            };
            renderRunnable.autoInvalidate = true;
            com.censivn.C3DEngine.a.a().a(renderRunnable);
        }
    }

    @Override // com.tsf.shell.services.a.InterfaceC0165a
    public void f(int i) {
        this.f = i;
        if (this.m != null && this.m.h() != this.f) {
            RenderRunnable renderRunnable = new RenderRunnable(1, 1) { // from class: com.tsf.shell.manager.q.a.4
                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                public void run() {
                    if (a.this.m != null) {
                        a.this.m.a(a.this.f);
                    }
                }
            };
            renderRunnable.autoInvalidate = true;
            com.censivn.C3DEngine.a.a().a(renderRunnable);
        }
    }
}
