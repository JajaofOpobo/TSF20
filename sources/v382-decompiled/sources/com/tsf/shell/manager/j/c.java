package com.tsf.shell.manager.j;

import android.view.KeyEvent;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class c {
    private b a;
    private com.tsf.shell.e.b.a b;

    public void a() {
        if (this.a == null) {
            d();
        }
        c();
        l a = com.tsf.shell.manager.a.j.a(this.b);
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
        x xVar = new x();
        xVar.a(0);
        w.a(this.a);
        w.a(this.a, 300, xVar);
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
        this.b = new com.tsf.shell.e.b.a() { // from class: com.tsf.shell.manager.j.c.3
            @Override // com.tsf.shell.e.b.a, com.censivn.C3DEngine.b.c.d
            public void a(int i, KeyEvent keyEvent) {
                if (i == 4) {
                    c.this.b();
                }
            }

            @Override // com.tsf.shell.e.b.a, com.censivn.C3DEngine.b.c.d
            public void b(int i, KeyEvent keyEvent) {
            }

            @Override // com.tsf.shell.e.b.a
            public void a(int i, int i2, int i3, int i4) {
                c.this.c();
            }
        };
    }

    public void c() {
        this.a.e();
    }
}
