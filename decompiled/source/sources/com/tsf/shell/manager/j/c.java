package com.tsf.shell.manager.j;

import android.view.KeyEvent;
import com.censivn.C3DEngine.b.f.j;
/* loaded from: classes.dex */
public class c {
    private b a;
    private com.tsf.shell.f.b.a b;

    public void a() {
        if (this.a == null) {
            d();
        }
        c();
        j a = com.tsf.shell.manager.a.j.a(this.b);
        this.a.removeFromParent();
        this.a.a();
        this.a.alpha(255.0f);
        a.addChild(this.a);
        com.tsf.shell.manager.a.j.a(new Runnable() { // from class: com.tsf.shell.manager.j.c.1
            @Override // java.lang.Runnable
            public void run() {
                c.this.a.b();
            }
        });
    }

    public void b() {
        this.a.c();
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.a(0);
        com.censivn.C3DEngine.b.g.c.a(this.a);
        com.censivn.C3DEngine.b.g.c.a(this.a, 300, dVar);
        com.tsf.shell.manager.a.j.a(new Runnable() { // from class: com.tsf.shell.manager.j.c.2
            @Override // java.lang.Runnable
            public void run() {
                c.this.a.d();
                com.tsf.shell.manager.a.j.b();
                c.this.a.removeFromParent();
            }
        }, true);
    }

    private void d() {
        this.a = new b();
        this.b = new com.tsf.shell.f.b.a() { // from class: com.tsf.shell.manager.j.c.3
            @Override // com.tsf.shell.f.b.a, com.censivn.C3DEngine.b.c.b.a
            public void a(int i, KeyEvent keyEvent) {
                if (i == 4) {
                    c.this.b();
                }
            }

            @Override // com.tsf.shell.f.b.a, com.censivn.C3DEngine.b.c.b.a
            public void b(int i, KeyEvent keyEvent) {
            }

            @Override // com.tsf.shell.f.b.a
            public void a(int i, int i2, int i3, int i4) {
                c.this.c();
            }
        };
    }

    public void c() {
        this.a.e();
    }
}
