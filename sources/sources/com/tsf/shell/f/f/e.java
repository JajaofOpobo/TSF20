package com.tsf.shell.f.f;

import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends C<l> {
    private boolean a;
    private boolean b;
    private boolean c;

    public e(ArrayList<LauncherAppInfo> arrayList) {
        super(arrayList);
        this.a = false;
        this.b = false;
        this.c = false;
    }

    @Override // com.tsf.shell.f.f.C
    public boolean b() {
        return com.tsf.shell.manager.b.ConfigManager.E();
    }

    @Override // com.tsf.shell.f.f.C
    public void a(boolean z, String str) {
        h.d();
        com.tsf.shell.manager.b.ConfigManager.i(z);
        com.tsf.shell.manager.b.ConfigManager.g(str);
    }

    @Override // com.tsf.shell.f.f.C
    public String c() {
        return com.tsf.shell.manager.b.ConfigManager.F();
    }

    @Override // com.tsf.shell.f.f.C
    public void a(l lVar) {
    }

    public void b(l lVar) {
        if (this.a) {
            a((f) lVar);
            this.b = true;
        } else if (a((f) lVar)) {
            b(true);
        }
    }

    public void b(boolean z) {
        this.c = z;
        this.a = true;
        com.censivn.C3DEngine.a.d.d().c().a(false);
        com.tsf.shell.manager.app.StateHub.s().d(600);
    }

    @Override // com.tsf.shell.f.f.C
    public void f() {
        super.f();
        if (this.a) {
            if (this.c) {
                b(false);
                return;
            }
            this.a = false;
            com.censivn.C3DEngine.a.d.d().c().a(true);
            if (this.b) {
                this.b = false;
                com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.f.f.e.1
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.b(true);
                    }
                });
            }
        }
    }
}
