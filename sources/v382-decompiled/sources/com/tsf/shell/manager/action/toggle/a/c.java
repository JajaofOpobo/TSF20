package com.tsf.shell.manager.action.toggle.a;

import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.k;
import com.tsf.shell.services.g;
import com.tsf.shell.utils.l;

/* loaded from: classes.dex */
public class c extends com.tsf.shell.manager.action.toggle.b {
    public c(int i) {
        super(i);
        d();
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void d() {
        com.tsf.shell.manager.a.C.c().a(new g() { // from class: com.tsf.shell.manager.action.toggle.a.c.1
            @Override // com.tsf.shell.services.g
            public void a(com.c.a.a.a.a aVar) {
                int i = 1;
                switch (c.this.a) {
                    case 12000:
                        i = aVar.E();
                        break;
                    case 16000:
                        i = aVar.m();
                        break;
                    case 18000:
                        i = aVar.n();
                        break;
                    case 19000:
                        i = aVar.p();
                        break;
                    case 20000:
                        i = aVar.l();
                        break;
                    case 21000:
                        i = aVar.o();
                        break;
                }
                c.this.c(i);
            }
        });
    }

    @Override // com.tsf.shell.manager.action.toggle.b
    public void c() {
        if (com.tsf.shell.manager.a.C.c().a()) {
            com.tsf.shell.manager.a.C.c().a(new g() { // from class: com.tsf.shell.manager.action.toggle.a.c.2
                @Override // com.tsf.shell.services.g
                public void a(com.c.a.a.a.a aVar) {
                    switch (c.this.a) {
                        case 12000:
                            if (com.tsf.shell.services.f.a(com.censivn.C3DEngine.a.d(), 3)) {
                                aVar.v();
                                break;
                            } else {
                                com.tsf.shell.manager.r.c.c.a(com.tsf.shell.services.f.a);
                                break;
                            }
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
            k.a(Home.b(), R.string.text_download, R.string.notic_download_switch_widget, 0, R.string.text_download, R.string.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.action.toggle.a.c.3
                @Override // java.lang.Runnable
                public void run() {
                    l.a(Home.c, com.tsf.shell.services.f.a);
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
