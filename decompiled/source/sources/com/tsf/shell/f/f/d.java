package com.tsf.shell.f.f;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class d extends c<l> {
    public Object a;
    private boolean b;
    private boolean c;

    public d(ArrayList<f> arrayList) {
        super(arrayList);
        this.a = new Object();
        this.b = false;
        this.c = false;
    }

    @Override // com.tsf.shell.f.f.c
    public boolean b() {
        return com.tsf.shell.manager.b.e.z();
    }

    @Override // com.tsf.shell.f.f.c
    public void a(boolean z, String str) {
        h.d();
        com.tsf.shell.manager.b.e.g(z);
        com.tsf.shell.manager.b.e.d(str);
    }

    @Override // com.tsf.shell.f.f.c
    public String c() {
        return com.tsf.shell.manager.b.e.A();
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(l lVar) {
        if (lVar.a()) {
            j.a(this.a, 2);
        } else {
            j.a(this.a);
        }
        com.tsf.shell.manager.a.v.c.h();
    }

    @Override // com.tsf.shell.f.f.c
    /* renamed from: b */
    public void a(l lVar) {
    }

    public void c(l lVar) {
        if (this.b) {
            a();
            a((f) lVar);
            this.c = true;
        } else if (a((f) lVar)) {
            a(800, 500);
        }
    }

    public void a(int i, int i2) {
        this.b = true;
        com.censivn.C3DEngine.a.d.d().c().a(false);
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
            return;
        }
        a(800, 500);
    }

    @Override // com.tsf.shell.f.f.c
    public void f() {
        super.f();
        if (this.b) {
            this.b = false;
            com.censivn.C3DEngine.a.d.d().c().a(true);
            if (this.c) {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.f.d.1
                    @Override // java.lang.Runnable
                    public void run() {
                        d.this.d();
                    }
                });
            }
        }
    }
}
