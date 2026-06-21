package com.tsf.shell.e.f;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class e extends c {
    private boolean a;
    private boolean b;
    private boolean c;

    public e(ArrayList arrayList) {
        super(arrayList);
        this.a = false;
        this.b = false;
        this.c = false;
    }

    @Override // com.tsf.shell.e.f.c
    public boolean b() {
        return com.tsf.shell.manager.b.g.E();
    }

    @Override // com.tsf.shell.e.f.c
    public void a(boolean z, String str) {
        i.d();
        com.tsf.shell.manager.b.g.i(z);
        com.tsf.shell.manager.b.g.g(str);
    }

    @Override // com.tsf.shell.e.f.c
    public String c() {
        return com.tsf.shell.manager.b.g.F();
    }

    @Override // com.tsf.shell.e.f.c
    public void a(p pVar) {
    }

    public void b(p pVar) {
        if (this.a) {
            a((f) pVar);
            this.b = true;
        } else if (a((f) pVar)) {
            b(true);
        }
    }

    public void b(boolean z) {
        this.c = z;
        this.a = true;
        com.censivn.C3DEngine.a.h.d().c().a(false);
        com.tsf.shell.manager.a.h.s().d(600);
    }

    @Override // com.tsf.shell.e.f.c
    public void f() {
        super.f();
        if (this.a) {
            if (this.c) {
                b(false);
                return;
            }
            this.a = false;
            com.censivn.C3DEngine.a.h.d().c().a(true);
            if (this.b) {
                this.b = false;
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.f.e.1
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.b(true);
                    }
                });
            }
        }
    }
}
