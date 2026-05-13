package com.tsf.shell.f.c.b;

import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.f.c.b.a.a;
/* loaded from: classes.dex */
public class f extends c {
    private e a;
    private j b;

    public f(e eVar, j jVar) {
        this.a = eVar;
        this.b = jVar;
    }

    @Override // com.tsf.shell.f.c.b.c
    public j a() {
        return this.b;
    }

    @Override // com.tsf.shell.f.c.b.c
    public void b() {
        a.C0084a l = this.a.l();
        if (this.a.j()) {
            a(0.0f, l.h);
            c().rotation().z = 45.0f;
        } else {
            a(0.0f, l.l);
            c().rotation().z = 135.0f;
        }
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.c.b.f.1
            @Override // java.lang.Runnable
            public void run() {
                f.this.m();
            }
        }, 1500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        a(false);
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.c.b.f.2
            @Override // java.lang.Runnable
            public void run() {
                f.this.a.k();
                f.this.f();
            }
        }, 500L);
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.f.c.b.f.3
            @Override // java.lang.Runnable
            public void run() {
                f.this.k();
                f.this.l();
            }
        }, 2500L);
    }
}
