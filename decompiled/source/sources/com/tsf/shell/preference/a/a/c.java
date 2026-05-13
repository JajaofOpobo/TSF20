package com.tsf.shell.preference.a.a;

import android.app.Activity;
import com.censivn.C3DEngine.b.e.a;
import com.censivn.C3DEngine.b.e.i;
import com.censivn.C3DEngine.b.e.j;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.Home;
/* loaded from: classes.dex */
public class c extends i {
    private j a;
    private com.censivn.C3DEngine.b.e.a b;
    private com.censivn.C3DEngine.b.e.a c;
    private com.censivn.C3DEngine.b.e.a d;
    private com.censivn.C3DEngine.b.e.a e;
    private com.censivn.C3DEngine.b.e.a f;
    private com.censivn.C3DEngine.b.e.a g;
    private com.censivn.C3DEngine.b.e.a h;
    private a i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;

    public c() {
        a(b.i.text_preferences);
        this.a = new j();
        this.a.h(b.i.mn_screen_orientation);
        this.a.a(new j.a() { // from class: com.tsf.shell.preference.a.a.c.1
            @Override // com.censivn.C3DEngine.b.e.j.a
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.c.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.d.b.a(com.censivn.C3DEngine.a.d(), c.this.a);
                    }
                });
            }
        });
        b(this.a);
        this.b = new com.censivn.C3DEngine.b.e.a();
        this.b.h(b.i.mn_infinite_scroll);
        this.b.i(b.i.mn_infinite_scroll_summary);
        this.b.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.c.2
            @Override // com.censivn.C3DEngine.b.e.a.C0027a
            public boolean a(boolean z) {
                if (com.tsf.shell.manager.b.e.J() != z) {
                    com.tsf.shell.manager.b.e.b(Boolean.valueOf(z));
                    com.tsf.shell.manager.a.h.g();
                    return true;
                }
                return true;
            }
        });
        b(this.b);
        this.c = new com.censivn.C3DEngine.b.e.a();
        this.c.h(b.i.mn_transparent_navigation_bar);
        this.c.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.c.3
            @Override // com.censivn.C3DEngine.b.e.a.C0027a
            public boolean a(boolean z) {
                c.this.m = z;
                return true;
            }
        });
        b(this.c);
        this.d = new com.censivn.C3DEngine.b.e.a();
        this.d.h(b.i.mn_transparent_notification_bar);
        this.d.i(b.i.mn_transparent_notification_bar_summary);
        this.d.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.c.4
            @Override // com.censivn.C3DEngine.b.e.a.C0027a
            public boolean a(boolean z) {
                c.this.l = z;
                return true;
            }
        });
        b(this.d);
        this.e = new com.censivn.C3DEngine.b.e.a();
        this.e.h(b.i.mn_show_notification_bar);
        this.e.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.c.5
            @Override // com.censivn.C3DEngine.b.e.a.C0027a
            public boolean a(boolean z) {
                c.this.k = z;
                return true;
            }
        });
        b(this.e);
        this.g = new com.censivn.C3DEngine.b.e.a();
        this.g.h(b.i.text_floating_button);
        this.g.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.c.6
            @Override // com.censivn.C3DEngine.b.e.a.C0027a
            public boolean a(boolean z) {
                return true;
            }
        });
        b(this.g);
        this.i = new a();
        b(this.i);
        this.f = new com.censivn.C3DEngine.b.e.a();
        this.f.h(b.i.text_lock_desktop);
        this.f.i(b.i.text_lock_desktop_summary);
        this.f.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.c.7
            @Override // com.censivn.C3DEngine.b.e.a.C0027a
            public boolean a(boolean z) {
                com.tsf.shell.manager.a.A.b();
                return true;
            }
        });
        b(this.f);
        this.h = new com.censivn.C3DEngine.b.e.a();
        this.h.h(b.i.mn_vibration_feedback);
        this.h.i(b.i.mn_vibration_feedback_summary);
        this.h.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.c.8
            @Override // com.censivn.C3DEngine.b.e.a.C0027a
            public boolean a(boolean z) {
                if (com.tsf.shell.manager.b.e.ae() != z) {
                    com.tsf.shell.manager.b.e.p(z);
                    return true;
                }
                return true;
            }
        });
        b(this.h);
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void f() {
        com.tsf.shell.manager.a.a.a(com.tsf.shell.manager.p.e.k).b();
        this.k = com.tsf.shell.manager.b.e.P();
        this.l = com.tsf.shell.manager.b.e.O();
        this.m = com.tsf.shell.manager.b.e.N();
        this.j = com.tsf.shell.manager.b.e.ac();
        this.g.c(this.j);
        com.tsf.shell.d.b.a(this.a);
        this.b.c(com.tsf.shell.manager.b.e.J());
        this.e.c(this.k);
        if (com.tsf.shell.utils.g.b()) {
            this.c.c(this.m);
        } else {
            c(this.c);
        }
        if (com.tsf.shell.utils.g.c()) {
            this.d.c(this.l);
        } else {
            c(this.d);
        }
        this.f.c(com.tsf.shell.manager.a.A.d());
        this.h.c(com.tsf.shell.manager.b.e.ae());
        this.n = com.tsf.shell.manager.b.e.ab();
        this.i.k(this.n);
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void g() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.c.9
            @Override // java.lang.Runnable
            public void run() {
                if (com.tsf.shell.manager.b.e.P() != c.this.k) {
                    com.tsf.shell.manager.a.b.a(!c.this.k);
                }
                if (com.tsf.shell.utils.g.c() && com.tsf.shell.manager.b.e.O() != c.this.l) {
                    com.censivn.C3DEngine.b.c.e eVar = com.tsf.shell.manager.a.b;
                    com.censivn.C3DEngine.b.c.e.b(Home.b(), c.this.l, true);
                }
                if (com.tsf.shell.utils.g.b() && com.tsf.shell.manager.b.e.N() != c.this.m) {
                    com.tsf.shell.manager.a.b.a((Activity) Home.b(), c.this.m, true);
                }
            }
        });
        int e = this.i.e();
        boolean e2 = this.g.e();
        if (e2 != this.j) {
            com.tsf.shell.manager.b.e.o(e2);
        }
        if (e != this.n) {
            com.tsf.shell.manager.b.e.m(e);
        }
        com.tsf.shell.manager.a.o.a(e2, e);
    }

    /* loaded from: classes.dex */
    public static class a extends com.censivn.C3DEngine.b.e.e {
        final com.censivn.C3DEngine.b.f.j b = new com.censivn.C3DEngine.b.f.j();

        public a() {
            a(com.censivn.C3DEngine.b.b.a.a(200.0f));
            g(b.i.text_transparency);
            h(b.i.text_floating_button_transparency_summary);
            i(0);
            j(100);
            a(" %");
            k a = com.censivn.C3DEngine.b.b.a.a(128.0f, 128.0f);
            a.textures().addElement(com.tsf.shell.manager.a.o.b().a());
            k a2 = com.censivn.C3DEngine.b.b.a.a(46.0f, 46.0f);
            a2.textures().addElement(com.tsf.shell.manager.a.o.b().b());
            this.b.addChild(a);
            this.b.addChild(a2);
            this.b.position().y = -com.censivn.C3DEngine.b.b.a.a(120.0f);
        }

        @Override // com.censivn.C3DEngine.b.e.e, com.censivn.C3DEngine.b.e.h
        public void f(int i) {
            super.f(i);
            l(i);
        }

        @Override // com.censivn.C3DEngine.b.b.c, com.censivn.C3DEngine.b.f.j
        public void onDrawChildStart() {
            super.onDrawChildStart();
            this.b.dispatchDraw();
        }

        @Override // com.censivn.C3DEngine.b.e.h, com.censivn.C3DEngine.b.b.c
        public void c(int i) {
            super.c(i);
            this.b.position().x = ((-i) / 2.0f) + com.censivn.C3DEngine.b.b.a.a(100.0f);
        }

        @Override // com.censivn.C3DEngine.b.e.h
        public void k(int i) {
            super.k(i);
            l(i);
        }

        private void l(int i) {
            this.b.alpha((i / 100.0f) * 255.0f);
        }
    }
}
