package com.tsf.shell.services;

import android.content.Context;
import com.p026c.p027a.p028a.p029a.InterfaceC0850a;
import com.tsf.shell.Home;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.services.ServiceConnectionC4102d;
/* renamed from: com.tsf.shell.services.c */
/* loaded from: classes.dex */
public class C4100c {

    /* renamed from: a */
    public static boolean f13361a = true;

    /* renamed from: b */
    private C4098b f13362b;

    /* renamed from: c */
    private ServiceConnectionC4102d f13363c;

    public C4100c() {
        m747d();
    }

    /* renamed from: d */
    private void m747d() {
        Context applicationContext = Home.m6177b().getApplicationContext();
        if (m750a()) {
            this.f13362b = new C4098b(applicationContext);
            this.f13362b.m752c();
            this.f13362b.m754a();
        }
        this.f13363c = new ServiceConnectionC4102d(applicationContext);
        this.f13363c.m743b();
        this.f13363c.m742c();
        this.f13363c.m744a(new ServiceConnectionC4102d.InterfaceC4103a() { // from class: com.tsf.shell.services.c.1
            @Override // com.tsf.shell.services.ServiceConnectionC4102d.InterfaceC4103a
            /* renamed from: a */
            public void mo739a(InterfaceC0850a interfaceC0850a) {
                if (interfaceC0850a.mo10893D().equals("false")) {
                    C4100c.f13361a = false;
                }
            }
        });
    }

    /* renamed from: a */
    public boolean m750a() {
        return C3430e.m2535aA();
    }

    /* renamed from: b */
    public void m749b() {
        if (this.f13362b != null) {
            try {
                this.f13362b.m753b();
                this.f13362b.m751d();
            } catch (Exception e) {
            }
        }
        if (this.f13363c != null) {
            try {
                this.f13363c.m741d();
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: c */
    public ServiceConnectionC4102d m748c() {
        return this.f13363c;
    }
}
