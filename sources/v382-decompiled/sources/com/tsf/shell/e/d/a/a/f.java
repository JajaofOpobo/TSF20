package com.tsf.shell.e.d.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class f extends com.tsf.shell.e.d.a.a {
    private com.tsf.shell.e.d.a.b a;

    public f(int i, boolean z) {
        super(i, z);
    }

    @Override // com.tsf.shell.e.d.a.a
    public void a(final j jVar, Number3d number3d, Number3d number3d2, final Runnable runnable) {
        x xVar = new x() { // from class: com.tsf.shell.e.d.a.a.f.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                final j jVar2 = jVar;
                final Runnable runnable2 = runnable;
                x xVar2 = new x() { // from class: com.tsf.shell.e.d.a.a.f.1.1
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void c() {
                        f.this.a(jVar2);
                    }

                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                };
                xVar2.e(0.0f);
                xVar2.a(com.censivn.C3DEngine.b.g.a.g);
                w.a(jVar);
                w.a(jVar, 1000, xVar2);
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void c() {
                f.this.a(jVar);
            }
        };
        xVar.e(45.0f);
        w.a(jVar);
        w.a(jVar, 250, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(j jVar) {
        jVar.rotation().z = 0.0f;
    }

    @Override // com.tsf.shell.e.d.a.a
    public j e() {
        if (this.a == null) {
            this.a = new com.tsf.shell.e.d.a.b(this, true);
        }
        return this.a;
    }

    @Override // com.tsf.shell.e.d.a.a
    public void a(m mVar, Runnable runnable) {
        a(mVar, null, null, runnable);
    }
}
