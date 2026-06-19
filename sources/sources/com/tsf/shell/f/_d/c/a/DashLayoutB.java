package com.tsf.shell.f._d.c.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.f.e.f.EditModeController;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DashLayoutB extends DashLayoutContainer {
    private static float c = 50.0f * com.censivn.C3DEngine.b.b.A.c;
    float a;
    private boolean d;
    private boolean e;

    public DashLayoutB(int i, boolean z, boolean z2) {
        super(i, z2);
        this.e = false;
        this.e = z;
    }

    @Override // com.tsf.shell.f._d.c.a.DashLayoutContainer
    public void a(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        float fA = com.censivn.C3DEngine.b.b.A.a(70.0f);
        float fA2 = com.censivn.C3DEngine.b.b.A.a(110.0f);
        float f = fA2 / 3.0f;
        float f2 = fA2 / 2.0f;
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.a.b bVarA = aVar.a(i);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            if (i == 3) {
                dVar.a(runnable);
            }
            if (this.e) {
                dVar.b(i * 150);
            }
            dVar.l(1.0f);
            dVar.m(1.0f);
            dVar.f(fA);
            dVar.h(f2);
            dVar.a(com.censivn.C3DEngine.b.g.a.e);
            com.censivn.C3DEngine.b.g.c.a(bVarA);
            com.censivn.C3DEngine.b.g.c.a(bVarA, 500, dVar);
            f2 -= f;
        }
    }

    @Override // com.tsf.shell.f._d.c.a.DashLayoutContainer
    public void b(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.a.b bVarA = aVar.a(i);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.l(0.0f);
            dVar.m(0.0f);
            dVar.f(0.0f);
            dVar.h(0.0f);
            if (i == 3) {
                dVar.a(runnable);
            }
            com.censivn.C3DEngine.b.g.c.a(bVarA);
            com.censivn.C3DEngine.b.g.c.a(bVarA, 500, dVar);
        }
    }

    @Override // com.tsf.shell.f._d.c.a.DashLayoutContainer
    public void a(ArrayList<Integer> arrayList, float f, float f2) {
        float f3;
        ArrayList<DashLayoutA.c> arrayListC = com.tsf.shell.manager.app.v.ScreenHelper.d().c();
        j jVarD = com.tsf.shell.manager.app.v.ScreenHelper.d().d();
        int size = arrayList.size();
        float f4 = 120.0f * com.censivn.C3DEngine.b.b.A.c * (size - 1);
        if ((f4 / 2.0f) + f2 + (com.tsf.shell.manager.g.LayoutDimensionConstants.h / 2.0f) + c > com.censivn.C3DEngine.b.b.A.B) {
            f3 = ((com.censivn.C3DEngine.b.b.A.B - c) - (com.tsf.shell.manager.g.LayoutDimensionConstants.h / 2.0f)) - f2;
        } else if (((f2 - (f4 / 2.0f)) - (com.tsf.shell.manager.g.LayoutDimensionConstants.h / 2.0f)) - c < com.censivn.C3DEngine.b.b.A.C) {
            f3 = f4 + (((com.censivn.C3DEngine.b.b.A.C + c) + (com.tsf.shell.manager.g.LayoutDimensionConstants.h / 2.0f)) - f2);
        } else {
            f3 = f4 / 2.0f;
        }
        this.d = f < 0.0f;
        jVarD.position().y = f3;
        Number3d number3d = new Number3d(f, f2, 0.0f);
        jVarD.globalToLocal(number3d);
        this.a = number3d.y;
        for (int i = 0; i < size; i++) {
            DashLayoutA.c cVar = arrayListC.get(i);
            cVar.position().y = this.a;
            if (this.d) {
                cVar.d.b(1);
            } else {
                cVar.d.b(2);
            }
            a(cVar, i, i * 50, com.censivn.C3DEngine.b.g.a.e);
            cVar.calAABB(2.0f, 1.2f, 1.0f);
        }
    }

    @Override // com.tsf.shell.f._d.c.a.DashLayoutContainer
    public void a() {
        ArrayList<DashLayoutA.c> arrayListC = com.tsf.shell.manager.app.v.ScreenHelper.d().c();
        int iNumChildren = com.tsf.shell.manager.app.v.ScreenHelper.d().d().numChildren();
        for (int i = 0; i < iNumChildren; i++) {
            a(arrayListC.get((iNumChildren - i) - 1), i, this.a);
        }
    }

    private float c(DashLayoutA.c cVar) {
        return this.d ? (80.0f * com.censivn.C3DEngine.b.b.A.c) + (com.censivn.C3DEngine.b.b.A.c * 60.0f) : ((-80.0f) * com.censivn.C3DEngine.b.b.A.c) - (com.censivn.C3DEngine.b.b.A.c * 60.0f);
    }

    private float d(DashLayoutA.c cVar) {
        return this.d ? 80.0f * com.censivn.C3DEngine.b.b.A.c : (-80.0f) * com.censivn.C3DEngine.b.b.A.c;
    }

    @Override // com.tsf.shell.f._d.c.a.DashLayoutContainer
    public void a(DashLayoutA.c cVar) {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.f(c(cVar));
        com.censivn.C3DEngine.b.g.c.a(cVar.d);
        com.censivn.C3DEngine.b.g.c.a(cVar.d, 250, dVar);
    }

    @Override // com.tsf.shell.f._d.c.a.DashLayoutContainer
    public void b(DashLayoutA.c cVar) {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.f(d(cVar));
        com.censivn.C3DEngine.b.g.c.a(cVar.d);
        com.censivn.C3DEngine.b.g.c.a(cVar.d, 250, dVar);
    }

    private void a(DashLayoutA.c cVar, int i, int i2, com.censivn.C3DEngine.b.g.b bVar) {
        cVar.scale().x = 0.0f;
        cVar.scale().y = 0.0f;
        cVar.d.position().x = d(cVar);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.l(1.0f);
        dVar.m(1.0f);
        if (this.d) {
            dVar.f(190.0f * com.censivn.C3DEngine.b.b.A.c);
        } else {
            dVar.f((-190.0f) * com.censivn.C3DEngine.b.b.A.c);
        }
        dVar.h((-120.0f) * com.censivn.C3DEngine.b.b.A.c * i);
        if (this.e && i2 != 0) {
            dVar.b(i2);
        }
        dVar.a(bVar);
        com.censivn.C3DEngine.b.g.c.a(cVar);
        com.censivn.C3DEngine.b.g.c.a(cVar, 300, dVar);
    }

    private void a(DashLayoutA.c cVar, int i, float f) {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
        dVar.l(0.0f);
        dVar.m(0.0f);
        dVar.f(0.0f);
        dVar.h(f);
        com.censivn.C3DEngine.b.g.c.a(cVar);
        com.censivn.C3DEngine.b.g.c.a(cVar, 300, dVar);
    }
}
