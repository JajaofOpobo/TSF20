package com.tsf.shell.f._d.c.a;

import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.tsf.shell.f.e.f.EditModeController;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DashLayoutE extends DashLayoutContainer {
    private static float a = 50.0f * com.censivn.C3DEngine.b.b.A.c;
    private boolean c;
    private boolean d;

    public DashLayoutE(int i, boolean z, boolean z2) {
        super(i, z2);
        this.d = false;
        this.d = z;
    }

    @Override // com.tsf.shell.f._d.c.a.DashLayoutContainer
    public void a(com.censivn.C3DEngine.b.f.a.TextureSpriteRenderable aVar, Runnable runnable) {
        float fA = com.censivn.C3DEngine.b.b.A.a(70.0f);
        float fA2 = com.censivn.C3DEngine.b.b.A.a(110.0f);
        float f = fA2 / 3.0f;
        float f2 = fA2 / 2.0f;
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.a.SpriteItemData bVarA = aVar.a(i);
            bVarA.i().x = fA;
            bVarA.i().y = f2;
            f2 -= f;
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
            if (i == 3) {
                dVar.a(runnable);
            }
            if (this.d) {
                dVar.b(i * 150);
            }
            dVar.l(1.0f);
            dVar.m(1.0f);
            dVar.a(com.censivn.C3DEngine.b.g.a.e);
            com.censivn.C3DEngine.b.g.TweenUtils.a(bVarA);
            com.censivn.C3DEngine.b.g.TweenUtils.a(bVarA, 500, dVar);
        }
    }

    @Override // com.tsf.shell.f._d.c.a.DashLayoutContainer
    public void b(com.censivn.C3DEngine.b.f.a.TextureSpriteRenderable aVar, Runnable runnable) {
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.a.SpriteItemData bVarA = aVar.a(i);
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
            dVar.l(0.0f);
            dVar.m(0.0f);
            if (i == 3) {
                dVar.a(runnable);
            }
            com.censivn.C3DEngine.b.g.TweenUtils.a(bVarA);
            com.censivn.C3DEngine.b.g.TweenUtils.a(bVarA, 500, dVar);
        }
    }

    @Override // com.tsf.shell.f._d.c.a.DashLayoutContainer
    public void a(ArrayList<Integer> arrayList, float f, float f2) {
        float f3;
        ArrayList<DashLayoutA.c> arrayListC = com.tsf.shell.manager.app.v.ScreenHelper.d().c();
        j jVarD = com.tsf.shell.manager.app.v.ScreenHelper.d().d();
        int size = arrayList.size();
        float f4 = 120.0f * com.censivn.C3DEngine.b.b.A.c * (size - 1);
        if ((f4 / 2.0f) + f2 + (com.tsf.shell.manager.g.LayoutDimensionConstants.h / 2.0f) + a > com.censivn.C3DEngine.b.b.A.B) {
            f3 = ((com.censivn.C3DEngine.b.b.A.B - a) - (com.tsf.shell.manager.g.LayoutDimensionConstants.h / 2.0f)) - f2;
        } else if (((f2 - (f4 / 2.0f)) - (com.tsf.shell.manager.g.LayoutDimensionConstants.h / 2.0f)) - a < com.censivn.C3DEngine.b.b.A.C) {
            f3 = f4 + (((com.censivn.C3DEngine.b.b.A.C + a) + (com.tsf.shell.manager.g.LayoutDimensionConstants.h / 2.0f)) - f2);
        } else {
            f3 = f4 / 2.0f;
        }
        this.c = f < 0.0f;
        if (this.c) {
            jVarD.position().x = 190.0f * com.censivn.C3DEngine.b.b.A.c;
        } else {
            jVarD.position().x = (-190.0f) * com.censivn.C3DEngine.b.b.A.c;
        }
        jVarD.position().y = f3;
        for (int i = 0; i < size; i++) {
            DashLayoutA.c cVar = arrayListC.get(i);
            if (this.c) {
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
        int i = 0;
        while (i < iNumChildren) {
            a(arrayListC.get((iNumChildren - i) - 1), i, i == iNumChildren + (-1));
            i++;
        }
    }

    private float c(DashLayoutA.c cVar) {
        return this.c ? (80.0f * com.censivn.C3DEngine.b.b.A.c) + (com.censivn.C3DEngine.b.b.A.c * 60.0f) : ((-80.0f) * com.censivn.C3DEngine.b.b.A.c) - (com.censivn.C3DEngine.b.b.A.c * 60.0f);
    }

    private float d(DashLayoutA.c cVar) {
        return this.c ? 80.0f * com.censivn.C3DEngine.b.b.A.c : (-80.0f) * com.censivn.C3DEngine.b.b.A.c;
    }

    @Override // com.tsf.shell.f._d.c.a.DashLayoutContainer
    public void a(DashLayoutA.c cVar) {
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.f(c(cVar));
        com.censivn.C3DEngine.b.g.TweenUtils.a(cVar.d);
        com.censivn.C3DEngine.b.g.TweenUtils.a(cVar.d, 250, dVar);
    }

    @Override // com.tsf.shell.f._d.c.a.DashLayoutContainer
    public void b(DashLayoutA.c cVar) {
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        dVar.f(d(cVar));
        com.censivn.C3DEngine.b.g.TweenUtils.a(cVar.d);
        com.censivn.C3DEngine.b.g.TweenUtils.a(cVar.d, 250, dVar);
    }

    private void a(DashLayoutA.c cVar, int i, int i2, com.censivn.C3DEngine.b.g.TweenCallback bVar) {
        cVar.scale().x = 0.0f;
        cVar.scale().y = 0.0f;
        cVar.position().y = (-120.0f) * com.censivn.C3DEngine.b.b.A.c * i;
        cVar.d.position().x = d(cVar);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f._d.c.a.DashLayoutE.1
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a() {
            }
        };
        dVar.l(1.0f);
        dVar.m(1.0f);
        if (this.d && i2 != 0) {
            dVar.b(i2);
        }
        dVar.a(bVar);
        com.censivn.C3DEngine.b.g.TweenUtils.a(cVar);
        com.censivn.C3DEngine.b.g.TweenUtils.a(cVar, 300, dVar);
    }

    private void a(DashLayoutA.c cVar, int i, boolean z) {
        com.censivn.C3DEngine.b.g.TweenParams dVar;
        if (z) {
            dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        } else {
            dVar = new com.censivn.C3DEngine.b.g.TweenParams();
        }
        dVar.l(0.0f);
        dVar.m(0.0f);
        com.censivn.C3DEngine.b.g.TweenUtils.a(cVar);
        com.censivn.C3DEngine.b.g.TweenUtils.a(cVar, 300, dVar);
    }
}
