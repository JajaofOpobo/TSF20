package com.tsf.shell.manager.r.c;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.b;
import com.tsf.shell.f.i.b.e.i;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g {
    private static void b(final com.tsf.shell.f.i.b bVar, final Runnable runnable) {
        if (bVar instanceof i) {
            a(((i) bVar).q().q(), bVar);
        } else if (bVar instanceof com.tsf.shell.f.i.b.e.b) {
            a(((com.tsf.shell.f.i.b.e.b) bVar).k.textures().get(0).textureElement, bVar);
        } else if (bVar instanceof com.tsf.shell.f.i.b.d.b) {
            a(((com.tsf.shell.f.i.b.d.b) bVar).aD(), bVar);
        } else if (bVar instanceof com.tsf.shell.f.i.b.b.a) {
            a(((com.tsf.shell.f.i.b.b.a) bVar).h, bVar);
        }
        bVar.mouseEnabled(false);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.manager.r.c.g.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                if (runnable != null) {
                    runnable.run();
                }
                com.tsf.shell.manager.a.i.a(bVar);
            }
        };
        dVar.l(0.0f);
        dVar.m(0.0f);
        dVar.n(0.0f);
        com.censivn.C3DEngine.b.g.c.a(bVar);
        com.censivn.C3DEngine.b.g.c.a(bVar, VEasing.Back.easeIn, dVar);
        bVar.p_();
    }

    public static void a(TextureElement textureElement, com.censivn.C3DEngine.b.f.i iVar) {
        if (textureElement != null && textureElement.id != 0) {
            com.censivn.C3DEngine.b.h.a.a aVarA = com.censivn.C3DEngine.b.h.a.a.a(textureElement);
            aVarA.position().setAllFrom(iVar.position());
            Number3d.TEMPNUMBER3D2.reset();
            aVarA.position().setAllFrom(iVar.localToGlobal(Number3d.TEMPNUMBER3D2));
            com.tsf.shell.manager.a.j.a(aVarA);
        }
    }

    public static void a(com.tsf.shell.f.i.b bVar, Runnable runnable) {
        b(bVar, runnable);
    }

    public static void a(final com.tsf.shell.f.i.b bVar, final Runnable runnable, final Runnable runnable2) {
        if (bVar instanceof com.tsf.shell.f.i.b.d.b) {
            if (((com.tsf.shell.f.i.b.d.b) bVar).aT()) {
                a(bVar, runnable2);
                return;
            }
            com.tsf.shell.e.a(b.i.notic_delete_folder, b.i.public_action_ok, b.i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.r.c.g.2
                @Override // java.lang.Runnable
                public void run() {
                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.g.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            g.a(bVar, runnable2);
                        }
                    });
                }
            }, new Runnable() { // from class: com.tsf.shell.manager.r.c.g.3
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
