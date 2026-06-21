package com.tsf.shell.manager.r.c;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.R;
import com.tsf.shell.e.i.b.e.k;

/* loaded from: classes.dex */
public class i {
    private static void b(final com.tsf.shell.e.i.c cVar, final Runnable runnable) {
        if (cVar instanceof k) {
            a(((k) cVar).q().q(), cVar);
        } else if (cVar instanceof com.tsf.shell.e.i.b.e.b) {
            a(((com.tsf.shell.e.i.b.e.b) cVar).k.textures().get(0).textureElement, cVar);
        } else if (cVar instanceof com.tsf.shell.e.i.b.d.b) {
            a(((com.tsf.shell.e.i.b.d.b) cVar).aD(), cVar);
        } else if (cVar instanceof com.tsf.shell.e.i.b.b.a) {
            a(((com.tsf.shell.e.i.b.b.a) cVar).h, cVar);
        }
        cVar.mouseEnabled(false);
        x xVar = new x() { // from class: com.tsf.shell.manager.r.c.i.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                if (runnable != null) {
                    runnable.run();
                }
                com.tsf.shell.manager.a.i.a(cVar);
            }
        };
        xVar.l(0.0f);
        xVar.m(0.0f);
        xVar.n(0.0f);
        w.a(cVar);
        w.a(cVar, VEasing.Back.easeIn, xVar);
        cVar.n_();
    }

    public static void a(TextureElement textureElement, j jVar) {
        if (textureElement != null && textureElement.id != 0) {
            com.censivn.C3DEngine.b.h.a.a a = com.censivn.C3DEngine.b.h.a.a.a(textureElement);
            a.position().setAllFrom(jVar.position());
            Number3d.TEMPNUMBER3D2.reset();
            a.position().setAllFrom(jVar.localToGlobal(Number3d.TEMPNUMBER3D2));
            com.tsf.shell.manager.a.j.a(a);
        }
    }

    public static void a(com.tsf.shell.e.i.c cVar, Runnable runnable) {
        b(cVar, runnable);
    }

    public static void a(final com.tsf.shell.e.i.c cVar, final Runnable runnable, final Runnable runnable2) {
        if (cVar instanceof com.tsf.shell.e.i.b.d.b) {
            if (((com.tsf.shell.e.i.b.d.b) cVar).aT()) {
                a(cVar, runnable2);
                return;
            }
            com.tsf.shell.k.a(R.string.notic_delete_folder, R.string.public_action_ok, R.string.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.r.c.i.2
                @Override // java.lang.Runnable
                public void run() {
                    final com.tsf.shell.e.i.c cVar2 = com.tsf.shell.e.i.c.this;
                    final Runnable runnable3 = runnable2;
                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.i.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            i.a(cVar2, runnable3);
                        }
                    });
                }
            }, new Runnable() { // from class: com.tsf.shell.manager.r.c.i.3
                @Override // java.lang.Runnable
                public void run() {
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            });
        }
    }
}
