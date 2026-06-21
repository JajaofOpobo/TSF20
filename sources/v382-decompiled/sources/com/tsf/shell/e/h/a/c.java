package com.tsf.shell.e.h.a;

import com.tsf.shell.R;
import com.tsf.shell.manager.b.g;

/* loaded from: classes.dex */
public class c extends a {
    public static final float a = com.censivn.C3DEngine.b.b.a.a(200.0f);
    private d b;
    private com.tsf.shell.e.h.a.a.d c;
    private com.tsf.shell.e.h.a.b.a d;

    public c() {
        int as = g.as();
        this.c = new com.tsf.shell.e.h.a.a.d(this);
        this.c.a(0);
        this.c.a(false);
        this.d = new com.tsf.shell.e.h.a.b.a(this);
        this.d.a(1);
        this.d.a(false);
        if (as == 0) {
            a((d) this.c, false, false);
        } else {
            a((d) this.d, false, false);
        }
        if (!g.at()) {
            a(false, false, false);
        }
    }

    private void x() {
        if (this.b == this.c) {
            a((d) this.d, true, true);
        } else {
            a((d) this.c, true, true);
        }
    }

    private void a(d dVar, boolean z, boolean z2) {
        if (this.b != null) {
            this.b.d();
            this.b.a(z);
        }
        a(dVar.a());
        this.b = dVar;
        this.b.b(z);
        if (z2) {
            this.b.c();
            g.s(this.b.j());
        }
    }

    @Override // com.tsf.shell.e.h.a.a
    public void b(int i) {
        if (i == 0) {
            if (this.b == this.c) {
                d(R.drawable.ico_recents_app);
                e(R.string.text_toggle_recent_apps);
                return;
            } else {
                d(R.drawable.ico_contact);
                e(R.string.text_quick_contact);
                return;
            }
        }
        d(R.drawable.ico_setting);
        a("");
    }

    @Override // com.tsf.shell.e.h.a.a
    public boolean c(int i) {
        if (i != 0) {
            return true;
        }
        x();
        return false;
    }

    public com.tsf.shell.e.h.a.a.d v() {
        return this.c;
    }

    @Override // com.tsf.shell.e.h.a.a
    public void d() {
        this.b.b();
    }

    @Override // com.tsf.shell.e.h.a.a
    public void u() {
        super.u();
    }

    @Override // com.tsf.shell.e.h.a.a
    public void a(boolean z) {
        g.v(z);
    }

    @Override // com.tsf.shell.e.h.a.a
    public void t() {
        this.b.i();
    }

    @Override // com.tsf.shell.e.h.a.a
    public void m() {
        this.b.c();
    }

    @Override // com.tsf.shell.e.h.a.a
    public void n() {
        this.b.d();
    }

    @Override // com.tsf.shell.e.h.a.a
    public void o() {
        this.b.e();
    }

    @Override // com.tsf.shell.e.h.a.a
    public void p() {
        this.b.f();
    }

    @Override // com.tsf.shell.e.h.a.a
    public void r() {
        this.b.g();
    }

    @Override // com.tsf.shell.e.h.a.a
    public void s() {
        this.b.h();
    }

    public void w() {
        r();
        p();
    }
}
