package com.tsf.shell.e.f;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends c {
    public Object a;
    private boolean b;
    private boolean c;

    public d(ArrayList arrayList) {
        super(arrayList);
        this.a = new Object();
        this.b = false;
        this.c = false;
    }

    @Override // com.tsf.shell.e.f.c
    public boolean b() {
        return com.tsf.shell.manager.b.g.z();
    }

    @Override // com.tsf.shell.e.f.c
    public void a(boolean z, String str) {
        i.d();
        com.tsf.shell.manager.b.g.g(z);
        com.tsf.shell.manager.b.g.d(str);
    }

    @Override // com.tsf.shell.e.f.c
    public String c() {
        return com.tsf.shell.manager.b.g.A();
    }

    public void a(p pVar) {
        if (pVar.a()) {
            l.a(this.a, 2);
        } else {
            l.a(this.a);
        }
        com.tsf.shell.manager.a.v.c.h();
    }

    @Override // com.tsf.shell.e.f.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(p pVar) {
    }

    public void c(p pVar) {
        if (this.b) {
            a();
            a((f) pVar);
            this.c = true;
        } else if (a((f) pVar)) {
            a(800, 500);
        }
    }

    public void a(int i, int i2) {
        this.b = true;
        com.censivn.C3DEngine.a.h.d().c().a(false);
        if (com.tsf.shell.manager.a.h.n().t() != -1) {
            com.tsf.shell.manager.a.h.s().a(i, i2);
        }
    }

    public void a() {
        com.tsf.shell.manager.a.h.s().b(500);
    }

    public void d() {
        this.c = false;
        if (this.b) {
            a();
            this.c = true;
        } else {
            a(800, 500);
        }
    }

    @Override // com.tsf.shell.e.f.c
    public void f() {
        super.f();
        if (this.b) {
            this.b = false;
            com.censivn.C3DEngine.a.h.d().c().a(true);
            if (this.c) {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.f.d.1
                    @Override // java.lang.Runnable
                    public void run() {
                        d.this.d();
                    }
                });
            }
        }
    }
}
