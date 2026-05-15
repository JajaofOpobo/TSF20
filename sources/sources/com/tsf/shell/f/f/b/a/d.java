package com.tsf.shell.f.f.b.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.f.d.e.a;
import com.tsf.shell.f.f.a.h;
import com.tsf.shell.f.f.g;
import com.tsf.shell.f.f.i;
import com.tsf.shell.f.f.j;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends i implements a.InterfaceC0090a {
    private com.tsf.shell.f.d.e.a b;

    public d(int i, boolean z) {
        super(i, 0, z);
    }

    protected float a(int i) {
        return (float) (((double) i) - (((double) (i * 2)) * Math.random()));
    }

    @Override // com.tsf.shell.f.f.l
    public void a(g gVar, float f) {
    }

    @Override // com.tsf.shell.f.f.l
    public boolean a(g gVar, com.censivn.C3DEngine.b.f.b.a aVar) {
        return false;
    }

    @Override // com.tsf.shell.f.f.l
    public void a(g gVar, boolean z) {
        if (gVar.t() == -1) {
            final h hVar = (h) gVar;
            hVar.aB();
            if (z) {
                hVar.c((Runnable) null, false);
                b(hVar.ap().children(), false, null);
            }
            hVar.b((Runnable) null, z);
            a(hVar.ap().children(), z, new Runnable() { // from class: com.tsf.shell.f.f.b.a.d.1
                @Override // java.lang.Runnable
                public void run() {
                    hVar.aO();
                }
            });
        }
    }

    @Override // com.tsf.shell.f.f.l
    public void b(g gVar, boolean z) {
        if (gVar.t() == -1) {
            h hVar = (h) gVar;
            hVar.c((Runnable) null, true);
            b(hVar.ap().children(), z, null);
        }
    }

    @Override // com.tsf.shell.f.f.l
    public void b(g gVar, float f) {
        if (gVar.t() == -1) {
            gVar.dispatchDraw();
            return;
        }
        j.a aVarJ = gVar.j();
        this.a.alpha((1.0f - Math.abs(f)) * 255.0f);
        this.a.position().y = com.censivn.C3DEngine.b.b.a.a(400.0f) * f;
        this.a.textures().clear();
        this.a.textures().addElement(aVarJ.b);
        this.a.dispatchDraw();
    }

    public static void a(ArrayList<com.censivn.C3DEngine.b.f.i> arrayList, boolean z, boolean z2, Runnable runnable) {
        com.censivn.C3DEngine.b.f.i iVar = arrayList.size() > 0 ? arrayList.get((int) (Math.random() * ((double) arrayList.size()))) : null;
        com.censivn.C3DEngine.b.g.d dVar = null;
        for (int i = 0; i < arrayList.size(); i++) {
            com.censivn.C3DEngine.b.f.i iVar2 = arrayList.get(i);
            com.censivn.C3DEngine.b.g.c.a(iVar2);
            if (iVar2 instanceof com.tsf.shell.f.i.b) {
                Number3d number3d = h.E.get(i);
                if (z) {
                    com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                    if (z2) {
                        if (iVar2 == iVar) {
                            dVar2.b(350);
                            dVar = dVar2;
                        } else {
                            dVar2.b((int) (Math.random() * 300.0d));
                        }
                    }
                    dVar2.f(number3d.x);
                    dVar2.h(number3d.y);
                    dVar2.e(0.0f);
                    dVar2.l(1.0f);
                    dVar2.m(1.0f);
                    dVar2.c(0.0f);
                    dVar2.d(0.0f);
                    dVar2.a(255);
                    dVar2.a(com.censivn.C3DEngine.b.g.a.a);
                    com.censivn.C3DEngine.b.g.c.a(iVar2, 450, dVar2);
                    if (com.tsf.shell.manager.a.v.d.b().b()) {
                        dVar2 = dVar;
                    }
                    dVar = dVar2;
                } else {
                    iVar2.position().x = number3d.x;
                    iVar2.position().y = number3d.y;
                    iVar2.rotation().x = 0.0f;
                    iVar2.rotation().y = 0.0f;
                    iVar2.rotation().z = 0.0f;
                    iVar2.scale().x = 1.0f;
                    iVar2.scale().y = 1.0f;
                    iVar2.alpha(255.0f);
                }
            }
        }
        if (dVar != null) {
            dVar.a(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void a(ArrayList<com.censivn.C3DEngine.b.f.i> arrayList, boolean z, Runnable runnable) {
    }

    public void b(ArrayList<com.censivn.C3DEngine.b.f.i> arrayList, boolean z, Runnable runnable) {
    }

    public com.censivn.C3DEngine.b.f.i o() {
        if (this.b == null) {
            this.b = new com.tsf.shell.f.d.e.a(this) { // from class: com.tsf.shell.f.f.b.a.d.2
                @Override // com.tsf.shell.f.g.a.h, com.censivn.C3DEngine.b.f.j
                public void onDrawChildEnd() {
                    super.onDrawChildEnd();
                    com.tsf.shell.manager.i.a.a(d.this, com.censivn.C3DEngine.b.b.a.a(20.0f));
                }
            };
        }
        return this.b;
    }

    public boolean p() {
        return true;
    }

    @Override // com.tsf.shell.f.d.e.a.InterfaceC0090a
    public void b(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        com.censivn.C3DEngine.b.g.d dVar;
        com.censivn.C3DEngine.b.g.d dVar2;
        com.censivn.C3DEngine.b.g.d dVar3 = null;
        com.censivn.C3DEngine.b.f.a.b bVarA = aVar.a((int) (Math.random() * ((double) aVar.a())));
        int i = 0;
        while (true) {
            int i2 = i;
            dVar = dVar3;
            if (i2 >= aVar.a()) {
                break;
            }
            com.censivn.C3DEngine.b.f.a.b bVarA2 = aVar.a(i2);
            dVar3 = new com.censivn.C3DEngine.b.g.d();
            if (!p()) {
                dVar2 = dVar;
            } else if (bVarA2 == bVarA) {
                dVar3.b(300);
                dVar2 = dVar3;
            } else {
                dVar3.b((int) (Math.random() * 300.0d));
                dVar2 = dVar;
            }
            Number3d number3d = com.tsf.shell.f.d.e.a.a.get(i2);
            dVar3.f(number3d.x);
            dVar3.h(number3d.y);
            dVar3.l(1.0f);
            dVar3.m(1.0f);
            dVar3.d(0.0f);
            dVar3.e(0.0f);
            dVar3.c(0.0f);
            dVar3.a(com.censivn.C3DEngine.b.g.a.a);
            com.censivn.C3DEngine.b.g.c.a(bVarA2);
            com.censivn.C3DEngine.b.g.c.a(bVarA2, 500, dVar3);
            if (p()) {
                dVar3 = dVar2;
            }
            i = i2 + 1;
        }
        if (dVar != null) {
            dVar.a(runnable);
            dVar.b(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void a(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
    }
}
