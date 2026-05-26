package com.tsf.shell.f.d.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.k;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f extends com.tsf.shell.f.d.a.a {
    private com.tsf.shell.f.d.a.b a;

    public f(int i, boolean z) {
        super(i, z);
    }

    @Override // com.tsf.shell.f.d.a.a
    public void a(final i iVar, Number3d number3d, Number3d number3d2, final Runnable runnable) {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.a.a.f.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.a.a.f.1.1
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void c() {
                        f.this.a(iVar);
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                };
                dVar2.e(0.0f);
                dVar2.a(com.censivn.C3DEngine.b.g.a.g);
                com.censivn.C3DEngine.b.g.c.a(iVar);
                com.censivn.C3DEngine.b.g.c.a(iVar, 1000, dVar2);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void c() {
                f.this.a(iVar);
            }
        };
        dVar.e(45.0f);
        com.censivn.C3DEngine.b.g.c.a(iVar);
        com.censivn.C3DEngine.b.g.c.a(iVar, 250, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i iVar) {
        iVar.rotation().z = 0.0f;
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
