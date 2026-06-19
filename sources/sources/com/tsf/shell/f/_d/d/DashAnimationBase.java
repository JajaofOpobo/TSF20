package com.tsf.shell.f._d.d;

import com.tsf.shell.f.f.WorkspacePage;
import com.tsf.shell.manager.b.ConfigManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DashAnimationBase {
    public ArrayList<com.tsf.shell.f._d.d.a.DashEffectCallback> a;
    public b b;
    private com.tsf.shell.f._d.d.a.DashEffectCallback c;

    public void a() {
        int size = 0;
        this.b = new DashAnimationConfig();
        this.a = new ArrayList<>();
        this.a.add(new com.tsf.shell.f._d.d.a.DashEffectRenderer(0));
        this.a.add(new com.tsf.shell.f._d.d.a.DashEffectHandler(1));
        int iO = e.o();
        if (iO >= 0) {
            size = iO > this.a.size() + (-1) ? this.a.size() - 1 : iO;
        }
        this.c = this.a.get(size);
    }

    public boolean b() {
        return this.c instanceof com.tsf.shell.f._d.d.a.DashEffectHandler;
    }

    public void c() {
        a(this.a.get(1));
    }

    public void d() {
        a(this.a.get(0));
    }

    public boolean a(com.tsf.shell.f._d.d.a.DashEffectCallback aVar) {
        if (aVar == this.c) {
            return false;
        }
        if (this.c != null) {
            this.c.b();
        }
        this.c = aVar;
        e.c(aVar.d());
        return true;
    }

    public com.tsf.shell.f._d.d.a.DashEffectCallback e() {
        return this.c;
    }

    public void f() {
        this.c.c();
    }

    public void g() {
        g gVarN = com.tsf.shell.manager.app.StateHub.n();
        if (gVarN != null) {
            gVarN.ae();
            if (gVarN.ah() != null) {
                gVarN.ah().ae();
            }
            if (gVarN.ag() != null) {
                gVarN.ag().ae();
            }
        }
    }

    public void h() {
        if (com.tsf.shell.manager.app.v.FlagHelper.C0126a.h().a()) {
            f();
            g();
        }
    }
}
