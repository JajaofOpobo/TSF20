package com.tsf.shell.manager.r.b.c;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public class f extends com.tsf.shell.manager.r.b.b.a implements com.censivn.C3DEngine.b.c.d {
    private b a;
    private e d;
    private com.tsf.shell.manager.r.b.b.a e;

    public f(com.tsf.shell.e.e.g.e eVar) {
        super(eVar);
        g();
    }

    private void g() {
        this.a = new b(this.c, this);
        this.d = new e(this.c, this);
        this.b.addChild(this.a.f());
        this.b.addChild(this.d.f());
    }

    public void a(c cVar) {
        this.d.a(cVar);
        a((com.tsf.shell.manager.r.b.b.a) this.d, true);
        com.censivn.C3DEngine.b.c.c.a(this);
    }

    public void a(com.tsf.shell.manager.r.b.b.a aVar, boolean z) {
        if (aVar != this.e) {
            if (this.e != null) {
                this.e.a(z);
            }
            this.e = aVar;
            this.e.b(z);
        }
    }

    public void c(boolean z) {
        com.censivn.C3DEngine.b.c.c.b(this);
        a(this.a, z);
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void c() {
        a((com.tsf.shell.manager.r.b.b.a) this.a, false);
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void d() {
        this.a.h();
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void e() {
        this.a.e();
        this.d.e();
        c(false);
        this.e = null;
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void a(float f, float f2, float f3, float f4) {
        this.a.a(f, f2, f3, f4);
        this.d.a(f, f2, f3, f4);
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            c(true);
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void b(int i, KeyEvent keyEvent) {
    }
}
