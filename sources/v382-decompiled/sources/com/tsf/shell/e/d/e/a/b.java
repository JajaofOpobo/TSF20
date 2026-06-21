package com.tsf.shell.e.d.e.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.e.f.a.m;
import com.tsf.shell.e.f.g;
import com.tsf.shell.e.i.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b implements com.tsf.shell.e.d.e.b {
    private int a;
    private boolean b = false;
    private boolean c = false;

    public abstract void a(g gVar, float f, ArrayList arrayList, Runnable runnable);

    public b(int i) {
        this.a = i;
    }

    public boolean b() {
        return true;
    }

    public boolean a() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070 A[SYNTHETIC] */
    @Override // com.tsf.shell.e.d.e.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        x xVar;
        x xVar2;
        x xVar3 = null;
        com.censivn.C3DEngine.b.f.a.b a = aVar.a((int) (Math.random() * aVar.a()));
        int i = 0;
        while (true) {
            int i2 = i;
            xVar = xVar3;
            if (i2 >= aVar.a()) {
                break;
            }
            com.censivn.C3DEngine.b.f.a.b a2 = aVar.a(i2);
            xVar3 = new x();
            if (b()) {
                if (a2 == a) {
                    xVar3.b(300);
                    xVar2 = xVar3;
                    Number3d number3d = (Number3d) com.tsf.shell.e.d.e.a.a.get(i2);
                    xVar3.f(number3d.x);
                    xVar3.h(number3d.y);
                    xVar3.l(1.0f);
                    xVar3.m(1.0f);
                    xVar3.d(0.0f);
                    xVar3.e(0.0f);
                    xVar3.c(0.0f);
                    xVar3.a(com.censivn.C3DEngine.b.g.a.a);
                    w.a(a2);
                    w.a(a2, 500, xVar3);
                    if (!b()) {
                        xVar3 = xVar2;
                    }
                    i = i2 + 1;
                } else {
                    xVar3.b((int) (Math.random() * 300.0d));
                }
            }
            xVar2 = xVar;
            Number3d number3d2 = (Number3d) com.tsf.shell.e.d.e.a.a.get(i2);
            xVar3.f(number3d2.x);
            xVar3.h(number3d2.y);
            xVar3.l(1.0f);
            xVar3.m(1.0f);
            xVar3.d(0.0f);
            xVar3.e(0.0f);
            xVar3.c(0.0f);
            xVar3.a(com.censivn.C3DEngine.b.g.a.a);
            w.a(a2);
            w.a(a2, 500, xVar3);
            if (!b()) {
            }
            i = i2 + 1;
        }
        if (xVar != null) {
            xVar.a(runnable);
            xVar.b(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void a(g gVar, ArrayList arrayList, Runnable runnable, boolean z) {
        if (!z) {
            a(arrayList, runnable);
            return;
        }
        x xVar = null;
        j jVar = arrayList.size() > 0 ? (j) arrayList.get((int) (Math.random() * arrayList.size())) : null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList.size()) {
                break;
            }
            j jVar2 = (j) arrayList.get(i2);
            if (jVar2 instanceof c) {
                c cVar = (c) jVar2;
                x xVar2 = new x();
                if (b()) {
                    if (jVar2 == jVar) {
                        xVar2.b(300);
                        xVar = xVar2;
                    } else {
                        xVar2.b((int) (Math.random() * 300.0d));
                    }
                }
                if (cVar instanceof com.tsf.shell.e.i.b.b.a) {
                    com.tsf.shell.e.i.b.b.a aVar = (com.tsf.shell.e.i.b.b.a) cVar;
                    if (com.censivn.C3DEngine.b.b.a.O) {
                        xVar2.f(aVar.b(cVar.K().cellX));
                        xVar2.h(aVar.c(cVar.K().cellY));
                        xVar2.e(0.0f);
                    } else {
                        xVar2.f(aVar.b(cVar.K().cellXH));
                        xVar2.h(aVar.c(cVar.K().cellYH));
                        xVar2.e(0.0f);
                    }
                } else if (cVar.K() == null) {
                    Number3d number3d = (Number3d) m.E.get(i2);
                    xVar2.f(number3d.x);
                    xVar2.h(number3d.y);
                    xVar2.e(0.0f);
                } else if (com.censivn.C3DEngine.b.b.a.O) {
                    xVar2.f(cVar.K().cellX);
                    xVar2.h(cVar.K().cellY);
                    xVar2.e(cVar.K().rotation);
                } else {
                    xVar2.f(cVar.K().cellXH);
                    xVar2.h(cVar.K().cellYH);
                    xVar2.e(cVar.K().rotationH);
                }
                xVar2.l(1.0f);
                xVar2.m(1.0f);
                xVar2.c(0.0f);
                xVar2.d(0.0f);
                xVar2.a(com.censivn.C3DEngine.b.g.a.a);
                w.a(jVar2);
                w.a(jVar2, d(), xVar2);
                if (!b()) {
                    xVar = xVar2;
                }
            }
            i = i2 + 1;
        }
        if (xVar != null) {
            xVar.a(runnable);
        } else if (runnable != null) {
            com.censivn.C3DEngine.a.a().b(runnable, d());
        }
    }

    public void a(ArrayList arrayList, Runnable runnable) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList.size()) {
                break;
            }
            j jVar = (j) arrayList.get(i2);
            if (jVar instanceof c) {
                c cVar = (c) jVar;
                if (cVar instanceof com.tsf.shell.e.i.b.b.a) {
                    com.tsf.shell.e.i.b.b.a aVar = (com.tsf.shell.e.i.b.b.a) cVar;
                    if (com.censivn.C3DEngine.b.b.a.O) {
                        cVar.position().x = aVar.b(cVar.K().cellX);
                        cVar.position().y = aVar.c(cVar.K().cellY);
                        cVar.rotation().z = 0.0f;
                    } else {
                        cVar.position().x = aVar.b(cVar.K().cellXH);
                        cVar.position().y = aVar.c(cVar.K().cellYH);
                        cVar.rotation().z = 0.0f;
                    }
                } else if (cVar.K() == null) {
                    Number3d number3d = (Number3d) m.E.get(i2);
                    cVar.position().x = number3d.x;
                    cVar.position().y = number3d.y;
                    cVar.position().z = 0.0f;
                } else if (com.censivn.C3DEngine.b.b.a.O) {
                    cVar.position().x = cVar.K().cellX;
                    cVar.position().y = cVar.K().cellY;
                    cVar.rotation().z = cVar.K().rotation;
                } else {
                    cVar.position().x = cVar.K().cellXH;
                    cVar.position().y = cVar.K().cellYH;
                    cVar.rotation().z = cVar.K().rotationH;
                }
                cVar.scale().x = 1.0f;
                cVar.scale().y = 1.0f;
                cVar.rotation().x = 0.0f;
                cVar.rotation().y = 0.0f;
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
