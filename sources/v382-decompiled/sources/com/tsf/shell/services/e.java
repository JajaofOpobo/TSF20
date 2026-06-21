package com.tsf.shell.services;

import android.content.Context;
import com.tsf.shell.Home;

/* loaded from: classes.dex */
public class e {
    public static boolean a = true;
    private c b;
    private f c;

    public e() {
        d();
    }

    private void d() {
        Context applicationContext = Home.b().getApplicationContext();
        if (a()) {
            this.b = new c(applicationContext);
            this.b.c();
            this.b.a();
        }
        this.c = new f(applicationContext);
        this.c.b();
        this.c.c();
        this.c.a(new g() { // from class: com.tsf.shell.services.e.1
            @Override // com.tsf.shell.services.g
            public void a(com.c.a.a.a.a aVar) {
                if (aVar.D().equals("false")) {
                    e.a = false;
                }
            }
        });
    }

    public boolean a() {
        return com.tsf.shell.manager.b.g.ay();
    }

    public void b() {
        if (this.b != null) {
            try {
                this.b.b();
                this.b.d();
            } catch (Exception e) {
            }
        }
        if (this.c != null) {
            try {
                this.c.d();
            } catch (Exception e2) {
            }
        }
    }

    public f c() {
        return this.c;
    }
}
