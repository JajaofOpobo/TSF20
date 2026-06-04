package com.tsf.shell.workspace3D;

import com.censivn.C3DEngine.api.message.RenderRunnable;

/* loaded from: classes.dex */
public final class ap implements com.tsf.shell.services.e {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private boolean e = false;
    private com.tsf.shell.services.a f = new com.tsf.shell.services.a();
    private com.tsf.shell.workspace3D.k.ah g;
    private com.tsf.shell.workspace3D.k.ah h;
    private com.tsf.shell.workspace3D.k.ah i;

    public ap() {
        this.f.a(com.censivn.C3DEngine.a.c(), new aq(this));
        this.f.a(com.censivn.C3DEngine.a.c(), this);
    }

    public final void a(com.tsf.shell.workspace3D.k.ah ahVar) {
        String a = com.tsf.shell.g.b.a(ahVar.ch().c);
        if (this.g == null && com.tsf.shell.g.b.a(a)) {
            this.g = ahVar;
            if (this.e) {
                ahVar.a(this.b);
                return;
            }
            return;
        }
        if (this.h == null && com.tsf.shell.g.b.b(a)) {
            this.h = ahVar;
            if (this.e) {
                ahVar.a(this.a);
                return;
            }
            return;
        }
        if (this.i == null && com.tsf.shell.g.b.c(a)) {
            this.i = ahVar;
            if (this.e) {
                ahVar.a(this.c);
            }
        }
    }

    @Override // com.tsf.shell.services.e
    public final void a(int i) {
        this.a = i;
        if (this.h != null && this.h.bW() != i) {
            ar arVar = new ar(this);
            arVar.autoInvalidate = true;
            com.censivn.C3DEngine.a.a().a((RenderRunnable) arVar);
        }
    }

    @Override // com.tsf.shell.services.e
    public final void b(int i) {
        this.b = i;
        if (this.g != null && this.g.bW() != this.b) {
            as asVar = new as(this);
            asVar.autoInvalidate = true;
            com.censivn.C3DEngine.a.a().a((RenderRunnable) asVar);
        }
    }

    @Override // com.tsf.shell.services.e
    public final void c(int i) {
        this.d = i;
    }

    @Override // com.tsf.shell.services.e
    public final void d(int i) {
        this.c = i;
        if (this.i != null && this.i.bW() != this.c) {
            at atVar = new at(this);
            atVar.autoInvalidate = true;
            com.censivn.C3DEngine.a.a().a((RenderRunnable) atVar);
        }
    }
}
