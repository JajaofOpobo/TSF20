package com.tsf.shell.f.d.a.a;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.k;
/* loaded from: classes.dex */
public class b extends com.tsf.shell.f.d.a.a {
    Color4 a;
    private com.tsf.shell.f.d.a.b b;

    public b(int i, boolean z) {
        super(i, z);
        this.a = new Color4();
    }

    @Override // com.tsf.shell.f.d.a.a
    public void a(final i iVar, Number3d number3d, Number3d number3d2, final Runnable runnable) {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.a.a.b.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.a.a.b.1.1
                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a(float f) {
                        b.this.a(iVar, (int) (155.0f + (100.0f * f)));
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void c() {
                        b.this.a(iVar);
                    }

                    @Override // com.censivn.C3DEngine.b.g.d
                    public void a() {
                        b.this.a(iVar);
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                };
                com.censivn.C3DEngine.b.g.c.a(iVar);
                com.censivn.C3DEngine.b.g.c.a(iVar, 250, dVar2);
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                b.this.a(iVar, (int) (255.0f - (100.0f * f)));
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void c() {
                b.this.a(iVar);
            }
        };
        com.censivn.C3DEngine.b.g.c.a(iVar);
        com.censivn.C3DEngine.b.g.c.a(iVar, 250, dVar);
        iVar.setDefaultColor(this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i iVar, int i) {
        this.a.set(255, i, i, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i iVar) {
        iVar.clearDefaultColor();
    }

    @Override // com.tsf.shell.f.d.a.a
    public i e() {
        if (this.b == null) {
            this.b = new com.tsf.shell.f.d.a.b(this, true);
        }
        return this.b;
    }

    @Override // com.tsf.shell.f.d.a.a
    public void a(k kVar, Runnable runnable) {
        a(kVar, null, null, runnable);
    }
}
