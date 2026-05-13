package com.tsf.shell.f.d.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.k;
/* loaded from: classes.dex */
public class g extends com.tsf.shell.f.d.a.a {
    private com.tsf.shell.f.d.a.b a;

    public g(int i, boolean z) {
        super(i, z);
    }

    @Override // com.tsf.shell.f.d.a.a
    public void a(final i iVar, Number3d number3d, Number3d number3d2, final Runnable runnable) {
        final com.censivn.C3DEngine.b.f.a.b a = iVar instanceof com.censivn.C3DEngine.b.f.a.a ? ((com.censivn.C3DEngine.b.f.a.a) iVar).a(0) : iVar;
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.a.a.g.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.a.a.g.1.1
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void c() {
                        g.this.a(iVar);
                    }
                };
                dVar2.l(1.0f);
                dVar2.m(1.0f);
                com.censivn.C3DEngine.b.g.c.a(a);
                com.censivn.C3DEngine.b.g.c.a(a, 250, dVar2);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void c() {
                g.this.a(iVar);
            }
        };
        dVar.l(0.75f);
        dVar.m(0.75f);
        com.censivn.C3DEngine.b.g.c.a(a);
        com.censivn.C3DEngine.b.g.c.a(a, 250, dVar);
    }

    public void a(i iVar) {
        if (iVar instanceof com.censivn.C3DEngine.b.f.a.a) {
            com.censivn.C3DEngine.b.f.a.b a = ((com.censivn.C3DEngine.b.f.a.a) iVar).a(0);
            Number3d k = a.k();
            a.k().y = 1.0f;
            k.x = 1.0f;
            a.f();
        } else {
            Number3d scale = iVar.scale();
            iVar.scale().y = 1.0f;
            scale.x = 1.0f;
        }
        com.censivn.C3DEngine.b.g.c.a(iVar);
    }

    @Override // com.tsf.shell.f.d.a.a
    public i e() {
        if (this.a == null) {
            this.a = new com.tsf.shell.f.d.a.b(this, true);
        }
        return this.a;
    }

    @Override // com.tsf.shell.f.d.a.a
    public void a(k kVar, Runnable runnable) {
        a(kVar, null, null, runnable);
    }
}
