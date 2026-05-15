package com.tsf.shell.manager.action.toggle.a;

import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.services.d;
import com.tsf.shell.utils.k;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends com.tsf.shell.manager.action.toggle.b {
    public c(int i) {
        super(i);
        d();
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void d() {
        com.tsf.shell.manager.a.C.c().a(new d.a() { // from class: com.tsf.shell.manager.action.toggle.a.c.1
            @Override // com.tsf.shell.services.d.a
            public void a(com.c.a.a.a.a aVar) {
                int iE = 1;
                switch (c.this.a) {
                    case 12000:
                        iE = aVar.E();
                        break;
                    case 16000:
                        iE = aVar.m();
                        break;
                    case 18000:
                        iE = aVar.n();
                        break;
                    case 19000:
                        iE = aVar.p();
                        break;
                    case 20000:
                        iE = aVar.l();
                        break;
                    case 21000:
                        iE = aVar.o();
                        break;
                }
                c.this.c(iE);
            }
        });
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void c() {
        if (com.tsf.shell.manager.a.C.c().a()) {
            com.tsf.shell.manager.a.C.c().a(new d.a() { // from class: com.tsf.shell.manager.action.toggle.a.c.2
                @Override // com.tsf.shell.services.d.a
                public void a(com.c.a.a.a.a aVar) {
                    switch (c.this.a) {
                        case 12000:
                            if (com.tsf.shell.services.d.a(com.censivn.C3DEngine.a.d(), 3)) {
                                aVar.v();
                            } else {
                                com.tsf.shell.manager.r.c.c.a(com.tsf.shell.services.d.a);
                            }
                            break;
                        case 16000:
                            aVar.b();
                            break;
                        case 17000:
                            aVar.e();
                            break;
                        case 18000:
                            aVar.c();
                            break;
                        case 19000:
                            aVar.i();
                            break;
                        case 20000:
                            aVar.a();
                            break;
                        case 21000:
                            aVar.f();
                            break;
                        case 22000:
                            aVar.j();
                            break;
                        case 23000:
                            aVar.g();
                            break;
                        case 24000:
                            aVar.d();
                            break;
                        case 25000:
                            aVar.k();
                            break;
                        case 26000:
                            aVar.h();
                            break;
                    }
                }
            });
        } else {
            com.tsf.shell.e.a(Home.b(), b.i.text_download, b.i.notic_download_switch_widget, 0, b.i.text_download, b.i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.action.toggle.a.c.3
                @Override // java.lang.Runnable
                public void run() {
                    k.a(Home.c, com.tsf.shell.services.d.a);
                }
            }, (Runnable) null);
        }
    }

    public void c(int i) {
        switch (i) {
            case 0:
                b(0);
                break;
            case 1:
                b(2);
                break;
            default:
                b(1);
                break;
        }
    }
}
