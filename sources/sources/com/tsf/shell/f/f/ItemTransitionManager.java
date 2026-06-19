package com.tsf.shell.f.f;

import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ItemTransitionManager extends TransitionManager<l> {
    public Object a;
    private boolean b;
    private boolean c;

    public ItemTransitionManager(ArrayList<LauncherAppInfo> arrayList) {
        super(arrayList);
        this.a = new Object();
        this.b = false;
        this.c = false;
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public boolean b() {
        return com.tsf.shell.manager.b.ConfigManager.z();
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public void a(boolean z, String str) {
        h.d();
        com.tsf.shell.manager.b.ConfigManager.g(z);
        com.tsf.shell.manager.b.ConfigManager.d(str);
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public String e() {
        return com.tsf.shell.manager.b.ConfigManager.A();
    }

    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    public void a2(l lVar) {
        if (lVar.a()) {
            j.a(this.a, 2);
        } else {
            j.a(this.a);
        }
        com.tsf.shell.manager.app.v.ObjectHelper.h();
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(l lVar) {
    }

    public void c(l lVar) {
        if (this.b) {
            e();
            a((TransitionRenderer) lVar);
            this.c = true;
        } else if (a((TransitionRenderer) lVar)) {
            a(800, 500);
        }
    }

    public void a(int i, int i2) {
        this.b = true;
        com.censivn.C3DEngine.a.d.d().c().a(false);
        if (com.tsf.shell.manager.app.StateHub.n().t() != -1) {
            com.tsf.shell.manager.app.StateHub.s().a(i, i2);
        }
    }

    public void a() {
        com.tsf.shell.manager.app.StateHub.s().b(500);
    }

    public void d() {
        this.c = false;
        if (this.b) {
            e();
            this.c = true;
        } else {
            a(800, 500);
        }
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public void f() {
        super.f();
        if (this.b) {
            this.b = false;
            com.censivn.C3DEngine.a.d.d().c().a(true);
            if (this.c) {
                com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.f.f.d.1
                    @Override // java.lang.Runnable
                    public void run() {
                        d.this.d();
                    }
                });
            }
        }
    }
}
