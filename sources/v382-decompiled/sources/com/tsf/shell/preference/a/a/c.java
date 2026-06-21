package com.tsf.shell.preference.a.a;

import android.app.Activity;
import com.censivn.C3DEngine.b.e.m;
import com.censivn.C3DEngine.b.e.n;
import com.censivn.C3DEngine.b.e.o;
import com.tsf.shell.Home;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class c extends m {
    private n a;
    private com.censivn.C3DEngine.b.e.a b;
    private com.censivn.C3DEngine.b.e.a c;
    private com.censivn.C3DEngine.b.e.a d;
    private com.censivn.C3DEngine.b.e.a e;
    private com.censivn.C3DEngine.b.e.a f;
    private com.censivn.C3DEngine.b.e.a g;
    private com.censivn.C3DEngine.b.e.a h;
    private d i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;

    public c() {
        a(R.string.text_preferences);
        this.a = new n();
        this.a.h(R.string.mn_screen_orientation);
        this.a.a(new o() { // from class: com.tsf.shell.preference.a.a.c.1
            @Override // com.censivn.C3DEngine.b.e.o
            public void a() {
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.c.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.c.b.a(com.censivn.C3DEngine.a.d(), c.this.a);
                    }
                });
            }
        });
        b(this.a);
        this.b = new com.censivn.C3DEngine.b.e.a();
        this.b.h(R.string.mn_infinite_scroll);
        this.b.i(R.string.mn_infinite_scroll_summary);
        this.b.a(new com.censivn.C3DEngine.b.e.b() { // from class: com.tsf.shell.preference.a.a.c.2
            @Override // com.censivn.C3DEngine.b.e.b
            public boolean a(boolean z) {
                if (com.tsf.shell.manager.b.g.J() != z) {
                    com.tsf.shell.manager.b.g.b(Boolean.valueOf(z));
                    com.tsf.shell.manager.a.h.g();
                    return true;
                }
                return true;
            }
        });
        b(this.b);
        this.c = new com.censivn.C3DEngine.b.e.a();
        this.c.h(R.string.mn_transparent_navigation_bar);
        this.c.a(new com.censivn.C3DEngine.b.e.b() { // from class: com.tsf.shell.preference.a.a.c.3
            @Override // com.censivn.C3DEngine.b.e.b
            public boolean a(boolean z) {
                c.this.m = z;
                return true;
            }
        });
        b(this.c);
        this.d = new com.censivn.C3DEngine.b.e.a();
        this.d.h(R.string.mn_transparent_notification_bar);
        this.d.i(R.string.mn_transparent_notification_bar_summary);
        this.d.a(new com.censivn.C3DEngine.b.e.b() { // from class: com.tsf.shell.preference.a.a.c.4
            @Override // com.censivn.C3DEngine.b.e.b
            public boolean a(boolean z) {
                c.this.l = z;
                return true;
            }
        });
        b(this.d);
        this.e = new com.censivn.C3DEngine.b.e.a();
        this.e.h(R.string.mn_show_notification_bar);
        this.e.a(new com.censivn.C3DEngine.b.e.b() { // from class: com.tsf.shell.preference.a.a.c.5
            @Override // com.censivn.C3DEngine.b.e.b
            public boolean a(boolean z) {
                c.this.k = z;
                return true;
            }
        });
        b(this.e);
        this.g = new com.censivn.C3DEngine.b.e.a();
        this.g.h(R.string.text_floating_button);
        this.g.a(new com.censivn.C3DEngine.b.e.b() { // from class: com.tsf.shell.preference.a.a.c.6
            @Override // com.censivn.C3DEngine.b.e.b
            public boolean a(boolean z) {
                return true;
            }
        });
        b(this.g);
        this.i = new d();
        b(this.i);
        this.f = new com.censivn.C3DEngine.b.e.a();
        this.f.h(R.string.text_lock_desktop);
        this.f.i(R.string.text_lock_desktop_summary);
        this.f.a(new com.censivn.C3DEngine.b.e.b() { // from class: com.tsf.shell.preference.a.a.c.7
            @Override // com.censivn.C3DEngine.b.e.b
            public boolean a(boolean z) {
                com.tsf.shell.manager.a.A.b();
                return true;
            }
        });
        b(this.f);
        this.h = new com.censivn.C3DEngine.b.e.a();
        this.h.h(R.string.mn_vibration_feedback);
        this.h.i(R.string.mn_vibration_feedback_summary);
        this.h.a(new com.censivn.C3DEngine.b.e.b() { // from class: com.tsf.shell.preference.a.a.c.8
            @Override // com.censivn.C3DEngine.b.e.b
            public boolean a(boolean z) {
                if (com.tsf.shell.manager.b.g.ac() != z) {
                    com.tsf.shell.manager.b.g.o(z);
                    return true;
                }
                return true;
            }
        });
        b(this.h);
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void f() {
        com.tsf.shell.manager.a.a.a(com.tsf.shell.manager.p.f.k).b();
        this.k = com.tsf.shell.manager.b.g.O();
        this.l = com.tsf.shell.manager.b.g.N();
        this.m = com.tsf.shell.manager.b.g.M();
        this.j = com.tsf.shell.manager.b.g.aa();
        this.g.c(this.j);
        com.tsf.shell.c.b.a(this.a);
        this.b.c(com.tsf.shell.manager.b.g.J());
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
        this.h.c(com.tsf.shell.manager.b.g.ac());
        this.n = com.tsf.shell.manager.b.g.Z();
        this.i.k(this.n);
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void g() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.preference.a.a.c.9
            @Override // java.lang.Runnable
            public void run() {
                if (com.tsf.shell.manager.b.g.O() != c.this.k) {
                    com.tsf.shell.manager.a.b.a(!c.this.k);
                }
                if (com.tsf.shell.utils.g.c() && com.tsf.shell.manager.b.g.N() != c.this.l) {
                    com.censivn.C3DEngine.b.c.j jVar = com.tsf.shell.manager.a.b;
                    com.censivn.C3DEngine.b.c.j.b(Home.b(), c.this.l, true);
                }
                if (com.tsf.shell.utils.g.b() && com.tsf.shell.manager.b.g.M() != c.this.m) {
                    com.tsf.shell.manager.a.b.a((Activity) Home.b(), c.this.m, true);
                }
            }
        });
        int e = this.i.e();
        boolean e2 = this.g.e();
        if (e2 != this.j) {
            com.tsf.shell.manager.b.g.n(e2);
        }
        if (e != this.n) {
            com.tsf.shell.manager.b.g.l(e);
        }
        com.tsf.shell.manager.a.o.a(e2, e);
    }
}
