package com.tsf.shell.f.d.e.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.g.c;
import com.censivn.C3DEngine.b.g.d;
import com.tsf.shell.f.d.e.a;
import com.tsf.shell.f.f.a.h;
import com.tsf.shell.f.f.g;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class b implements a.InterfaceC0090a {
    private int a;
    private boolean b = false;
    private boolean c = false;

    public abstract void a(g gVar, float f, ArrayList<i> arrayList, Runnable runnable);

    public b(int i) {
        this.a = i;
    }

    public boolean b() {
        return true;
    }

    public boolean a() {
        return false;
    }

    @Override // com.tsf.shell.f.d.e.a.InterfaceC0090a
    public void b(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        com.censivn.C3DEngine.b.f.a.b bVarA = aVar.a((int) (Math.random() * ((double) aVar.a())));
        int i = 0;
        while (true) {
            int i2 = i;
            dVar = dVar3;
            if (i2 >= aVar.a()) {
                break;
            }
            com.censivn.C3DEngine.b.f.a.b bVarA2 = aVar.a(i2);
            dVar3 = new d();
            if (!b()) {
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
            c.a(bVarA2);
            c.a(bVarA2, 500, dVar3);
            if (b()) {
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

    public void a(g gVar, ArrayList<i> arrayList, Runnable runnable, boolean z) {
        if (!z) {
            a(arrayList, runnable);
            return;
        }
        d dVar = null;
        i iVar = arrayList.size() > 0 ? arrayList.get((int) (Math.random() * ((double) arrayList.size()))) : null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList.size()) {
                break;
            }
            i iVar2 = arrayList.get(i2);
            if (iVar2 instanceof com.tsf.shell.f.i.b) {
                com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) iVar2;
                d dVar2 = new d();
                if (b()) {
                    if (iVar2 == iVar) {
                        dVar2.b(300);
                        dVar = dVar2;
                    } else {
                        dVar2.b((int) (Math.random() * 300.0d));
                    }
                }
                if (bVar instanceof com.tsf.shell.f.i.b.b.a) {
                    com.tsf.shell.f.i.b.b.a aVar = (com.tsf.shell.f.i.b.b.a) bVar;
                    if (com.censivn.C3DEngine.b.b.a.O) {
                        dVar2.f(aVar.b(bVar.K().cellX));
                        dVar2.h(aVar.c(bVar.K().cellY));
                        dVar2.e(0.0f);
                    } else {
                        dVar2.f(aVar.b(bVar.K().cellXH));
                        dVar2.h(aVar.c(bVar.K().cellYH));
                        dVar2.e(0.0f);
                    }
                } else if (bVar.K() == null) {
                    Number3d number3d = h.E.get(i2);
                    dVar2.f(number3d.x);
                    dVar2.h(number3d.y);
                    dVar2.e(0.0f);
                } else if (com.censivn.C3DEngine.b.b.a.O) {
                    dVar2.f(bVar.K().cellX);
                    dVar2.h(bVar.K().cellY);
                    dVar2.e(bVar.K().rotation);
                } else {
                    dVar2.f(bVar.K().cellXH);
                    dVar2.h(bVar.K().cellYH);
                    dVar2.e(bVar.K().rotationH);
                }
                dVar2.l(1.0f);
                dVar2.m(1.0f);
                dVar2.c(0.0f);
                dVar2.d(0.0f);
                dVar2.a(com.censivn.C3DEngine.b.g.a.a);
                c.a(iVar2);
                c.a(iVar2, d(), dVar2);
                if (!b()) {
                    dVar = dVar2;
                }
            }
            i = i2 + 1;
        }
        if (dVar != null) {
            dVar.a(runnable);
        } else if (runnable != null) {
            com.censivn.C3DEngine.a.a().b(runnable, d());
        }
    }

    public void a(ArrayList<i> arrayList, Runnable runnable) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList.size()) {
                break;
            }
            i iVar = arrayList.get(i2);
            if (iVar instanceof com.tsf.shell.f.i.b) {
                com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) iVar;
                if (bVar instanceof com.tsf.shell.f.i.b.b.a) {
                    com.tsf.shell.f.i.b.b.a aVar = (com.tsf.shell.f.i.b.b.a) bVar;
                    if (com.censivn.C3DEngine.b.b.a.O) {
                        bVar.position().x = aVar.b(bVar.K().cellX);
                        bVar.position().y = aVar.c(bVar.K().cellY);
                        bVar.rotation().z = 0.0f;
                    } else {
                        bVar.position().x = aVar.b(bVar.K().cellXH);
                        bVar.position().y = aVar.c(bVar.K().cellYH);
                        bVar.rotation().z = 0.0f;
                    }
                } else if (bVar.K() == null) {
                    Number3d number3d = h.E.get(i2);
                    bVar.position().x = number3d.x;
                    bVar.position().y = number3d.y;
                    bVar.position().z = 0.0f;
                } else if (com.censivn.C3DEngine.b.b.a.O) {
                    bVar.position().x = bVar.K().cellX;
                    bVar.position().y = bVar.K().cellY;
                    bVar.rotation().z = bVar.K().rotation;
                } else {
                    bVar.position().x = bVar.K().cellXH;
                    bVar.position().y = bVar.K().cellYH;
                    bVar.rotation().z = bVar.K().rotationH;
                }
                bVar.scale().x = 1.0f;
                bVar.scale().y = 1.0f;
                bVar.rotation().x = 0.0f;
                bVar.rotation().y = 0.0f;
            }
            i = i2 + 1;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public int d() {
        return VEasing.Linear.easeNone;
    }

    public int e() {
        return 500;
    }

    public void a(g gVar) {
    }
}
