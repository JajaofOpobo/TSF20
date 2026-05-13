package com.tsf.shell.preference.a.a;

import com.censivn.C3DEngine.b.e.a;
import com.censivn.C3DEngine.b.e.i;
import com.tsf.b;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class e extends i {
    private boolean a = false;
    private com.censivn.C3DEngine.b.e.e b;
    private com.censivn.C3DEngine.b.e.e c;
    private com.censivn.C3DEngine.b.e.e d;
    private com.censivn.C3DEngine.b.e.a e;
    private com.censivn.C3DEngine.b.e.a f;
    private com.censivn.C3DEngine.b.e.a g;

    public e() {
        a(b.i.text_preferences);
        this.f = new com.censivn.C3DEngine.b.e.a();
        this.f.h(b.i.mn_drawer_top_menu);
        b(this.f);
        this.g = new com.censivn.C3DEngine.b.e.a();
        this.g.h(b.i.mn_drawer_bottom_menu);
        b(this.g);
        this.e = new com.censivn.C3DEngine.b.e.a();
        this.e.h(b.i.mn_grid_size_auto);
        this.e.i(b.i.mn_grid_size_auto_summary);
        this.e.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.e.1
            @Override // com.censivn.C3DEngine.b.e.a.C0027a
            public boolean a(boolean z) {
                e.this.a = z;
                if (e.this.a) {
                    e.this.c.k(com.tsf.shell.f.f.a.h.B);
                    e.this.b.k(com.tsf.shell.f.f.a.h.C);
                }
                e.this.i();
                return true;
            }
        });
        b(this.e);
        com.censivn.C3DEngine.b.e.e eVar = new com.censivn.C3DEngine.b.e.e();
        this.c = eVar;
        eVar.g(b.i.mn_grid_columns);
        eVar.h(b.i.mn_grid_columns_summary);
        eVar.i(0);
        eVar.j(100);
        eVar.k(0);
        eVar.a(" ");
        b(eVar);
        com.censivn.C3DEngine.b.e.e eVar2 = new com.censivn.C3DEngine.b.e.e();
        this.b = eVar2;
        eVar2.g(b.i.mn_grid_rows);
        eVar2.h(b.i.mn_grid_rows_summary);
        eVar2.i(0);
        eVar2.j(100);
        eVar2.k(0);
        eVar2.a(" ");
        b(eVar2);
        com.censivn.C3DEngine.b.e.e eVar3 = new com.censivn.C3DEngine.b.e.e();
        this.d = eVar3;
        eVar3.g(b.i.mn_background_transparency);
        eVar3.i(0);
        eVar3.j(100);
        eVar3.k(0);
        eVar3.a(" %");
        b(eVar3);
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void f() {
        this.a = com.tsf.shell.manager.b.e.W();
        String str = " ( " + (com.censivn.C3DEngine.b.b.a.O ? x.c(b.i.mn_orientation_portrait) : x.c(b.i.mn_orientation_landscape)) + " )";
        this.b.b(x.c(b.i.mn_grid_rows) + str);
        this.c.b(x.c(b.i.mn_grid_columns) + str);
        this.c.i(com.tsf.shell.f.f.a.h.x);
        this.c.j(com.tsf.shell.f.f.a.h.y);
        this.b.i(com.tsf.shell.f.f.a.h.z);
        this.b.j(com.tsf.shell.f.f.a.h.A);
        this.c.k(com.tsf.shell.f.f.a.h.p);
        this.b.k(com.tsf.shell.f.f.a.h.q);
        this.d.k(com.tsf.shell.manager.f.a.a);
        this.e.c(this.a);
        this.f.c(com.tsf.shell.manager.b.e.Q());
        this.g.c(com.tsf.shell.manager.b.e.R());
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.a) {
            this.b.i();
            this.c.i();
            return;
        }
        this.b.j();
        this.c.j();
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void g() {
        int e = this.d.e();
        if (e != com.tsf.shell.manager.f.a.a) {
            com.tsf.shell.manager.b.e.j(e);
            com.tsf.shell.manager.f.a.a(e);
        }
        if (this.f.e() != com.tsf.shell.manager.b.e.Q()) {
            if (this.f.e()) {
                com.tsf.shell.manager.a.h.t().g(true);
            } else {
                com.tsf.shell.manager.a.h.t().h(true);
            }
        }
        if (this.g.e() != com.tsf.shell.manager.b.e.R()) {
            if (this.g.e()) {
                com.tsf.shell.manager.a.h.t().b(true, true);
            } else {
                com.tsf.shell.manager.a.h.t().c(true, true);
            }
        }
        if (this.a) {
            if (com.tsf.shell.manager.b.e.W() != this.a) {
                com.tsf.shell.manager.b.e.l(this.a);
                if (com.tsf.shell.f.f.a.h.p != this.c.e() || com.tsf.shell.f.f.a.h.q != this.b.e()) {
                    com.tsf.shell.manager.a.h.t().aE();
                    return;
                }
                return;
            }
            return;
        }
        if (com.tsf.shell.manager.b.e.W() != this.a) {
            com.tsf.shell.manager.b.e.l(this.a);
        }
        if (com.tsf.shell.f.f.a.h.p != this.c.e()) {
            j();
        } else if (com.tsf.shell.f.f.a.h.q != this.b.e()) {
            j();
        }
    }

    private void j() {
        int e = this.b.e();
        int e2 = this.c.e();
        com.tsf.shell.manager.b.e.a(e, e2);
        com.tsf.shell.manager.a.h.t().a(e2, e);
    }
}
