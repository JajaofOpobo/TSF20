package com.tsf.shell.e.d.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class g extends com.tsf.shell.e.d.a.a {
    private com.tsf.shell.e.d.a.b a;

    public g(int i, boolean z) {
        super(i, z);
    }

    @Override // com.tsf.shell.e.d.a.a
    public void a(final j jVar, Number3d number3d, Number3d number3d2, final Runnable runnable) {
        final com.censivn.C3DEngine.b.g.b.a a = jVar instanceof com.censivn.C3DEngine.b.f.a.a ? ((com.censivn.C3DEngine.b.f.a.a) jVar).a(0) : jVar;
        x xVar = new x() { // from class: com.tsf.shell.e.d.a.a.g.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                final Runnable runnable2 = runnable;
                final j jVar2 = jVar;
                x xVar2 = new x() { // from class: com.tsf.shell.e.d.a.a.g.1.1
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }

                    @Override // com.censivn.C3DEngine.b.g.x
                    public void c() {
                        g.this.a(jVar2);
                    }
                };
                xVar2.l(1.0f);
                xVar2.m(1.0f);
                w.a(a);
                w.a(a, 250, xVar2);
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void c() {
                g.this.a(jVar);
            }
        };
        xVar.l(0.75f);
        xVar.m(0.75f);
        w.a(a);
        w.a(a, 250, xVar);
    }

    public void a(j jVar) {
        if (jVar instanceof com.censivn.C3DEngine.b.f.a.a) {
            com.censivn.C3DEngine.b.f.a.b a = ((com.censivn.C3DEngine.b.f.a.a) jVar).a(0);
            Number3d k = a.k();
            a.k().y = 1.0f;
            k.x = 1.0f;
            a.f();
        } else {
            Number3d scale = jVar.scale();
            jVar.scale().y = 1.0f;
            scale.x = 1.0f;
        }
        w.a(jVar);
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
