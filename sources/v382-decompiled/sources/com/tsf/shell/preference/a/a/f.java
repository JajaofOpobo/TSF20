package com.tsf.shell.preference.a.a;

import com.censivn.C3DEngine.b.e.m;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class f extends m {
    private boolean a = false;
    private com.censivn.C3DEngine.b.e.h b;
    private com.censivn.C3DEngine.b.e.h c;
    private com.censivn.C3DEngine.b.e.h d;
    private com.censivn.C3DEngine.b.e.a e;
    private com.censivn.C3DEngine.b.e.a f;
    private com.censivn.C3DEngine.b.e.a g;

    public f() {
        a(R.string.text_preferences);
        this.f = new com.censivn.C3DEngine.b.e.a();
        this.f.h(R.string.mn_drawer_top_menu);
        b(this.f);
        this.g = new com.censivn.C3DEngine.b.e.a();
        this.g.h(R.string.mn_drawer_bottom_menu);
        b(this.g);
        this.e = new com.censivn.C3DEngine.b.e.a();
        this.e.h(R.string.mn_grid_size_auto);
        this.e.i(R.string.mn_grid_size_auto_summary);
        this.e.a(new com.censivn.C3DEngine.b.e.b() { // from class: com.tsf.shell.preference.a.a.f.1
            @Override // com.censivn.C3DEngine.b.e.b
            public boolean a(boolean z) {
                f.this.a = z;
                if (f.this.a) {
                    f.this.c.k(com.tsf.shell.e.f.a.m.B);
                    f.this.b.k(com.tsf.shell.e.f.a.m.C);
                }
                f.this.i();
                return true;
            }
        });
        b(this.e);
        com.censivn.C3DEngine.b.e.h hVar = new com.censivn.C3DEngine.b.e.h();
        this.c = hVar;
        hVar.g(R.string.mn_grid_columns);
        hVar.h(R.string.mn_grid_columns_summary);
        hVar.i(0);
        hVar.j(100);
        hVar.k(0);
        hVar.a(" ");
        b(hVar);
        com.censivn.C3DEngine.b.e.h hVar2 = new com.censivn.C3DEngine.b.e.h();
        this.b = hVar2;
        hVar2.g(R.string.mn_grid_rows);
        hVar2.h(R.string.mn_grid_rows_summary);
        hVar2.i(0);
        hVar2.j(100);
        hVar2.k(0);
        hVar2.a(" ");
        b(hVar2);
        com.censivn.C3DEngine.b.e.h hVar3 = new com.censivn.C3DEngine.b.e.h();
        this.d = hVar3;
        hVar3.g(R.string.mn_background_transparency);
        hVar3.i(0);
        hVar3.j(100);
        hVar3.k(0);
        hVar3.a(" %");
        b(hVar3);
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void f() {
        this.a = com.tsf.shell.manager.b.g.V();
        String str = " ( " + (com.censivn.C3DEngine.b.b.a.O ? x.c(R.string.mn_orientation_portrait) : x.c(R.string.mn_orientation_landscape)) + " )";
        this.b.b(String.valueOf(x.c(R.string.mn_grid_rows)) + str);
        this.c.b(String.valueOf(x.c(R.string.mn_grid_columns)) + str);
        this.c.i(com.tsf.shell.e.f.a.m.x);
        this.c.j(com.tsf.shell.e.f.a.m.y);
        this.b.i(com.tsf.shell.e.f.a.m.z);
        this.b.j(com.tsf.shell.e.f.a.m.A);
        this.c.k(com.tsf.shell.e.f.a.m.p);
        this.b.k(com.tsf.shell.e.f.a.m.q);
        this.d.k(com.tsf.shell.manager.f.a.a);
        this.e.c(this.a);
        this.f.c(com.tsf.shell.manager.b.g.P());
        this.g.c(com.tsf.shell.manager.b.g.Q());
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.a) {
            this.b.i();
            this.c.i();
        } else {
            this.b.j();
            this.c.j();
        }
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void g() {
        int e = this.d.e();
        if (e != com.tsf.shell.manager.f.a.a) {
            com.tsf.shell.manager.b.g.j(e);
            com.tsf.shell.manager.f.a.a(e);
        }
        if (this.f.e() != com.tsf.shell.manager.b.g.P()) {
            if (this.f.e()) {
                com.tsf.shell.manager.a.h.t().g(true);
            } else {
                com.tsf.shell.manager.a.h.t().h(true);
            }
        }
        if (this.g.e() != com.tsf.shell.manager.b.g.Q()) {
            if (this.g.e()) {
                com.tsf.shell.manager.a.h.t().b(true, true);
            } else {
                com.tsf.shell.manager.a.h.t().c(true, true);
            }
        }
        if (this.a) {
            if (com.tsf.shell.manager.b.g.V() != this.a) {
                com.tsf.shell.manager.b.g.k(this.a);
                if (com.tsf.shell.e.f.a.m.p != this.c.e() || com.tsf.shell.e.f.a.m.q != this.b.e()) {
                    com.tsf.shell.manager.a.h.t().aE();
                    return;
                }
                return;
            }
            return;
        }
        if (com.tsf.shell.manager.b.g.V() != this.a) {
            com.tsf.shell.manager.b.g.k(this.a);
        }
        if (com.tsf.shell.e.f.a.m.p != this.c.e()) {
            j();
        } else if (com.tsf.shell.e.f.a.m.q != this.b.e()) {
            j();
        }
    }

    private void j() {
        int e = this.b.e();
        int e2 = this.c.e();
        com.tsf.shell.manager.b.g.a(e, e2);
        com.tsf.shell.manager.a.h.t().a(e2, e);
    }
}
