package com.tsf.shell.preference.a.a;

import com.censivn.C3DEngine.b.e.a;
import com.censivn.C3DEngine.b.e.i;
import com.tsf.b;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PreferenceItemE extends i {
    private boolean a = false;
    private com.censivn.C3DEngine.b.e.e b;
    private com.censivn.C3DEngine.b.e.e c;
    private com.censivn.C3DEngine.b.e.e d;
    private com.censivn.C3DEngine.b.e.a e;
    private com.censivn.C3DEngine.b.e.a f;
    private com.censivn.C3DEngine.b.e.a g;

    public PreferenceItemE() {
        a(PreferenceItemB.i.text_preferences);
        this.f = new com.censivn.C3DEngine.b.e.a();
        this.f.h(PreferenceItemB.i.mn_drawer_top_menu);
        b(this.f);
        this.g = new com.censivn.C3DEngine.b.e.a();
        this.g.h(PreferenceItemB.i.mn_drawer_bottom_menu);
        b(this.g);
        this.e = new com.censivn.C3DEngine.b.e.a();
        this.e.h(PreferenceItemB.i.mn_grid_size_auto);
        this.e.i(PreferenceItemB.i.mn_grid_size_auto_summary);
        this.e.a(new a.C0027a() { // from class: com.tsf.shell.preference.a.a.PreferenceItemE.1
            @Override // com.censivn.C3DEngine.b.e.a.C0027a
            public boolean a(boolean z) {
                e.this.a = z;
                if (e.this.a) {
                    e.this.c.k(com.tsf.shell.f.f.a.FolderPage.B);
                    e.this.b.k(com.tsf.shell.f.f.a.FolderPage.C);
                }
                e.this.i();
                return true;
            }
        });
        b(this.e);
        com.censivn.C3DEngine.b.e.e eVar = new com.censivn.C3DEngine.b.e.e();
        this.c = eVar;
        eVar.g(PreferenceItemB.i.mn_grid_columns);
        eVar.h(PreferenceItemB.i.mn_grid_columns_summary);
        eVar.i(0);
        eVar.j(100);
        eVar.k(0);
        eVar.a(" ");
        b(eVar);
        com.censivn.C3DEngine.b.e.e eVar2 = new com.censivn.C3DEngine.b.e.e();
        this.b = eVar2;
        eVar2.g(PreferenceItemB.i.mn_grid_rows);
        eVar2.h(PreferenceItemB.i.mn_grid_rows_summary);
        eVar2.i(0);
        eVar2.j(100);
        eVar2.k(0);
        eVar2.a(" ");
        b(eVar2);
        com.censivn.C3DEngine.b.e.e eVar3 = new com.censivn.C3DEngine.b.e.e();
        this.d = eVar3;
        eVar3.g(PreferenceItemB.i.mn_background_transparency);
        eVar3.i(0);
        eVar3.j(100);
        eVar3.k(0);
        eVar3.a(" %");
        b(eVar3);
    }

    @Override // com.censivn.C3DEngine.b.e.c
    public void f() {
        this.a = com.tsf.shell.manager.b.ConfigManager.W();
        String str = " ( " + (com.censivn.C3DEngine.b.b.A.O ? x.c(PreferenceItemB.i.mn_orientation_portrait) : x.c(PreferenceItemB.i.mn_orientation_landscape)) + " )";
        this.b.b(x.c(PreferenceItemB.i.mn_grid_rows) + str);
        this.c.b(x.c(PreferenceItemB.i.mn_grid_columns) + str);
        this.c.i(com.tsf.shell.f.f.a.FolderPage.x);
        this.c.j(com.tsf.shell.f.f.a.FolderPage.y);
        this.b.i(com.tsf.shell.f.f.a.FolderPage.z);
        this.b.j(com.tsf.shell.f.f.a.FolderPage.A);
        this.c.k(com.tsf.shell.f.f.a.FolderPage.p);
        this.b.k(com.tsf.shell.f.f.a.FolderPage.q);
        this.d.k(com.tsf.shell.manager.f.ScreenFadeController.a);
        this.e.c(this.a);
        this.f.c(com.tsf.shell.manager.b.ConfigManager.Q());
        this.g.c(com.tsf.shell.manager.b.ConfigManager.R());
        PreferenceItemE();
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

    @Override // com.censivn.C3DEngine.b.e.c
    public void g() {
        int iE = this.d.e();
        if (iE != com.tsf.shell.manager.f.ScreenFadeController.a) {
            com.tsf.shell.manager.b.ConfigManager.j(iE);
            com.tsf.shell.manager.f.ScreenFadeController.a(iE);
        }
        if (this.f.e() != com.tsf.shell.manager.b.ConfigManager.Q()) {
            if (this.f.e()) {
                com.tsf.shell.manager.app.StateHub.t().g(true);
            } else {
                com.tsf.shell.manager.app.StateHub.t().h(true);
            }
        }
        if (this.g.e() != com.tsf.shell.manager.b.ConfigManager.R()) {
            if (this.g.e()) {
                com.tsf.shell.manager.app.StateHub.t().b(true, true);
            } else {
                com.tsf.shell.manager.app.StateHub.t().c(true, true);
            }
        }
        if (this.a) {
            if (com.tsf.shell.manager.b.ConfigManager.W() != this.a) {
                com.tsf.shell.manager.b.ConfigManager.l(this.a);
                if (com.tsf.shell.f.f.a.FolderPage.p != this.c.e() || com.tsf.shell.f.f.a.FolderPage.q != this.b.e()) {
                    com.tsf.shell.manager.app.StateHub.t().aE();
                    return;
                }
                return;
            }
            return;
        }
        if (com.tsf.shell.manager.b.ConfigManager.W() != this.a) {
            com.tsf.shell.manager.b.ConfigManager.l(this.a);
        }
        if (com.tsf.shell.f.f.a.FolderPage.p != this.c.e()) {
            PreferenceItemE();
        } else if (com.tsf.shell.f.f.a.FolderPage.q != this.b.e()) {
            PreferenceItemE();
        }
    }

    private void j() {
        int iE = this.b.e();
        int iE2 = this.c.e();
        com.tsf.shell.manager.b.ConfigManager.a(iE, iE2);
        com.tsf.shell.manager.app.StateHub.t().a(iE2, iE);
    }
}
