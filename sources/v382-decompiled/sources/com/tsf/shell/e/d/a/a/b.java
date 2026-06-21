package com.tsf.shell.e.d.a.a;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;

/* loaded from: classes.dex */
public class b extends com.tsf.shell.e.d.a.a {
    Color4 a;
    private com.tsf.shell.e.d.a.b b;

    public b(int i, boolean z) {
        super(i, z);
        this.a = new Color4();
    }

    @Override // com.tsf.shell.e.d.a.a
    public void a(final j jVar, Number3d number3d, Number3d number3d2, final Runnable runnable) {
        x xVar = new x() { // from class: com.tsf.shell.e.d.a.a.b.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                final j jVar2 = jVar;
                final Runnable runnable2 = runnable;
                x xVar2 = new x() { // from class: com.tsf.shell.e.d.a.a.b.1.1
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a(float f) {
                        b.this.a(jVar2, (int) (155.0f + (100.0f * f)));
                    }

                    @Override // com.censivn.C3DEngine.b.g.x
                    public void c() {
                        b.this.a(jVar2);
                    }

                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        b.this.a(jVar2);
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                };
                w.a(jVar);
                w.a(jVar, 250, xVar2);
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f) {
                b.this.a(jVar, (int) (255.0f - (100.0f * f)));
            }

            @Override // com.censivn.C3DEngine.b.g.x
            public void c() {
                b.this.a(jVar);
            }
        };
        w.a(jVar);
        w.a(jVar, 250, xVar);
        jVar.setDefaultColor(this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(j jVar, int i) {
        this.a.set(255, i, i, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(j jVar) {
        jVar.clearDefaultColor();
    }

    @Override // com.tsf.shell.e.d.a.a
    public j e() {
        if (this.b == null) {
            this.b = new com.tsf.shell.e.d.a.b(this, true);
        }
        return this.b;
    }

    @Override // com.tsf.shell.e.d.a.a
    public void a(m mVar, Runnable runnable) {
        a(mVar, null, null, runnable);
    }
}
