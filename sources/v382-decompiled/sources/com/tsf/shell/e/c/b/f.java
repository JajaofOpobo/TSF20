package com.tsf.shell.e.c.b;

import com.censivn.C3DEngine.b.f.l;

/* loaded from: classes.dex */
public class f extends c {
    private e a;
    private l b;

    public f(e eVar, l lVar) {
        this.a = eVar;
        this.b = lVar;
    }

    @Override // com.tsf.shell.e.c.b.c
    public l a() {
        return this.b;
    }

    @Override // com.tsf.shell.e.c.b.c
    public void b() {
        com.tsf.shell.e.c.b.a.b l = this.a.l();
        if (this.a.j()) {
            a(0.0f, l.h);
            c().rotation().z = 45.0f;
        } else {
            a(0.0f, l.l);
            c().rotation().z = 135.0f;
        }
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.c.b.f.1
            @Override // java.lang.Runnable
            public void run() {
                f.this.m();
            }
        }, 1500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        a(false);
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.c.b.f.2
            @Override // java.lang.Runnable
            public void run() {
                f.this.a.k();
                f.this.f();
            }
        }, 500L);
        com.censivn.C3DEngine.a.a().b(new Runnable() { // from class: com.tsf.shell.e.c.b.f.3
            @Override // java.lang.Runnable
            public void run() {
                f.this.k();
                f.this.l();
            }
        }, 2500L);
    }
}
