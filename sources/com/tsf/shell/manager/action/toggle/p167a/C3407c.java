package com.tsf.shell.manager.action.toggle.p167a;

import com.censivn.C3DEngine.C0853a;
import com.p026c.p027a.p028a.p029a.InterfaceC0850a;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.action.toggle.C3414b;
import com.tsf.shell.manager.p187r.p193c.C3705c;
import com.tsf.shell.services.ServiceConnectionC4102d;
import com.tsf.shell.utils.C4175k;
/* renamed from: com.tsf.shell.manager.action.toggle.a.c */
/* loaded from: classes.dex */
public class C3407c extends C3414b {
    public C3407c(int i) {
        super(i);
        mo2601d();
    }

    @Override // com.tsf.shell.manager.action.toggle.C3414b
    /* renamed from: d */
    public void mo2601d() {
        C3359a.f11085C.m748c().m744a(new ServiceConnectionC4102d.InterfaceC4103a() { // from class: com.tsf.shell.manager.action.toggle.a.c.1
            @Override // com.tsf.shell.services.ServiceConnectionC4102d.InterfaceC4103a
            /* renamed from: a */
            public void mo739a(InterfaceC0850a interfaceC0850a) {
                int i = 1;
                switch (C3407c.this.f11287a) {
                    case 12000:
                        i = interfaceC0850a.mo10892E();
                        break;
                    case 16000:
                        i = interfaceC0850a.mo10879m();
                        break;
                    case 18000:
                        i = interfaceC0850a.mo10878n();
                        break;
                    case 19000:
                        i = interfaceC0850a.mo10876p();
                        break;
                    case 20000:
                        i = interfaceC0850a.mo10880l();
                        break;
                    case 21000:
                        i = interfaceC0850a.mo10877o();
                        break;
                }
                C3407c.this.m2613c(i);
            }
        });
    }

    @Override // com.tsf.shell.manager.action.toggle.C3414b
    /* renamed from: c */
    public void mo2602c() {
        if (C3359a.f11085C.m748c().m746a()) {
            C3359a.f11085C.m748c().m744a(new ServiceConnectionC4102d.InterfaceC4103a() { // from class: com.tsf.shell.manager.action.toggle.a.c.2
                @Override // com.tsf.shell.services.ServiceConnectionC4102d.InterfaceC4103a
                /* renamed from: a */
                public void mo739a(InterfaceC0850a interfaceC0850a) {
                    switch (C3407c.this.f11287a) {
                        case 12000:
                            if (ServiceConnectionC4102d.m745a(C0853a.m10856d(), 3)) {
                                interfaceC0850a.mo10870v();
                                return;
                            } else {
                                C3705c.m1668a(ServiceConnectionC4102d.f13365a);
                                return;
                            }
                        case 16000:
                            interfaceC0850a.mo10890b();
                            return;
                        case 17000:
                            interfaceC0850a.mo10887e();
                            return;
                        case 18000:
                            interfaceC0850a.mo10889c();
                            return;
                        case 19000:
                            interfaceC0850a.mo10883i();
                            return;
                        case 20000:
                            interfaceC0850a.mo10891a();
                            return;
                        case 21000:
                            interfaceC0850a.mo10886f();
                            return;
                        case 22000:
                            interfaceC0850a.mo10882j();
                            return;
                        case 23000:
                            interfaceC0850a.mo10885g();
                            return;
                        case 24000:
                            interfaceC0850a.mo10888d();
                            return;
                        case 25000:
                            interfaceC0850a.mo10881k();
                            return;
                        case 26000:
                            interfaceC0850a.mo10884h();
                            return;
                        default:
                            return;
                    }
                }
            });
            return;
        }
        C2244e.m6018a(Home.m6177b(), C1306b.C1315i.text_download, C1306b.C1315i.notic_download_switch_widget, 0, C1306b.C1315i.text_download, C1306b.C1315i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.action.toggle.a.c.3
            @Override // java.lang.Runnable
            public void run() {
                C4175k.m671a(Home.f7122c, ServiceConnectionC4102d.f13365a);
            }
        }, (Runnable) null);
    }

    /* renamed from: c */
    public void m2613c(int i) {
        switch (i) {
            case 0:
                m2604b(0);
                return;
            case 1:
                m2604b(2);
                return;
            default:
                m2604b(1);
                return;
        }
    }
}
