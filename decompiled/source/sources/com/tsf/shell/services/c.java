package com.tsf.shell.services;

import android.content.Context;
import com.tsf.shell.Home;
import com.tsf.shell.manager.b.e;
import com.tsf.shell.services.d;
/* loaded from: classes.dex */
public class c {
    public static boolean a = true;
    private b b;
    private d c;

    public c() {
        d();
    }

    private void d() {
        Context applicationContext = Home.b().getApplicationContext();
        if (a()) {
            this.b = new b(applicationContext);
            this.b.c();
            this.b.a();
        }
        this.c = new d(applicationContext);
        this.c.b();
        this.c.c();
        this.c.a(new d.a() { // from class: com.tsf.shell.services.c.1
            @Override // com.tsf.shell.services.d.a
            public void a(com.c.a.a.a.a aVar) {
                if (aVar.D().equals("false")) {
                    c.a = false;
                }
            }
        });
    }

    public boolean a() {
        return e.aA();
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

    public d c() {
        return this.c;
    }
}
