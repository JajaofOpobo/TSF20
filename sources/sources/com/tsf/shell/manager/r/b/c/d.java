package com.tsf.shell.manager.r.b.c;

import android.view.KeyEvent;
import com.censivn.C3DEngine.b.c.b;
import com.tsf.shell.manager.r.b.c.b;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends com.tsf.shell.manager.r.b.b.a implements b.a {
    private b a;
    private c b;
    private com.tsf.shell.manager.r.b.b.a e;

    public d(com.tsf.shell.f.e.g.d dVar) {
        super(dVar);
        g();
    }

    private void g() {
        this.a = new b(this.d, this);
        this.b = new c(this.d, this);
        this.c.addChild(this.a.f());
        this.c.addChild(this.b.f());
    }

    public void a(b.a aVar) {
        this.b.a(aVar);
        a((com.tsf.shell.manager.r.b.b.a) this.b, true);
        com.censivn.C3DEngine.b.c.b.a(this);
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
        com.censivn.C3DEngine.b.c.b.b(this);
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
        this.b.e();
        c(false);
        this.e = null;
    }

    @Override // com.tsf.shell.manager.r.b.b.a
    public void a(float f, float f2, float f3, float f4) {
        this.a.a(f, f2, f3, f4);
        this.b.a(f, f2, f3, f4);
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            c(true);
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }
}
