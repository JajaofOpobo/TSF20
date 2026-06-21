package com.tsf.shell.f._d.c.a;

import com.censivn.C3DEngine.api.element.Number3d;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DashLayoutA extends DashLayoutContainer {
    private static final float a = 268.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c;
    private boolean c;

    public DashLayoutA(int i, boolean z, boolean z2) {
        super(i, z2);
        this.c = false;
        this.c = z;
    }

    @Override // com.tsf.shell.f._d.c.a.DashLayoutContainer
    public void a(com.censivn.C3DEngine.b.f.sprite.TextureSpriteRenderable aVar, Runnable runnable) {
        float f = 120.0f / 3.0f;
        float f2 = 90.0f - (120.0f / 2.0f);
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.sprite.SpriteItemData bVarA = aVar.a(i);
            double d = ((double) f2) * 0.017453292519943295d;
            float fSin = (float) (Math.sin(DashLayoutContainer) * ((double) b));
            float fCos = (float) (Math.cos(DashLayoutContainer) * ((double) b));
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
            dVar.f(fSin);
            dVar.h(fCos);
            if (i == 3) {
                dVar.a(runnable);
            }
            if (this.c) {
                dVar.b(i * 100);
            }
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.TweenUtils.a(bVarA);
            com.censivn.C3DEngine.b.g.TweenUtils.a(bVarA, 500, dVar);
            f2 += f;
        }
    }

    @Override // com.tsf.shell.f._d.c.a.DashLayoutContainer
    public void b(com.censivn.C3DEngine.b.f.sprite.TextureSpriteRenderable aVar, Runnable runnable) {
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.sprite.SpriteItemData bVarA = aVar.a(i);
            com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams();
            dVar.f(0.0f);
            dVar.h(0.0f);
            dVar.l(0.0f);
            dVar.m(0.0f);
            if (i == 3) {
                dVar.a(runnable);
            }
            if (this.c) {
                dVar.b(i * 80);
            }
            com.censivn.C3DEngine.b.g.TweenUtils.a(bVarA);
            com.censivn.C3DEngine.b.g.TweenUtils.a(bVarA, 500, dVar);
        }
    }

    @Override // com.tsf.shell.f._d.c.a.DashLayoutContainer
    public void a(ArrayList<Integer> arrayList, float f, float f2) {
        int iAcos;
        int iAcos2;
        int iAcos3;
        ArrayList<com.tsf.shell.f.e.f.EditModeController.c> arrayListC = com.tsf.shell.manager.app.v.ScreenHelper.d().c();
        int size = arrayList.size();
        boolean z = false;
        if (f >= 0.0f && f2 >= 0.0f) {
            z = true;
            if (a + f2 < com.censivn.C3DEngine.b.b.ScreenConstants.B) {
                iAcos = 0;
            } else {
                iAcos = (int) (Math.acos((com.censivn.C3DEngine.b.b.ScreenConstants.B - f2) / a) / 0.017453292519943295d);
            }
            if (a + f < com.censivn.C3DEngine.b.b.ScreenConstants.A) {
                iAcos2 = 270;
            } else {
                iAcos2 = ((int) (Math.asin((com.censivn.C3DEngine.b.b.ScreenConstants.A - f) / a) / 0.017453292519943295d)) + 180;
            }
        } else if (f >= 0.0f && f2 <= 0.0f) {
            z = true;
            if (f2 - a > com.censivn.C3DEngine.b.b.ScreenConstants.C) {
                iAcos3 = 180;
            } else {
                iAcos3 = 180 - ((int) (Math.acos((f2 - com.censivn.C3DEngine.b.b.ScreenConstants.C) / a) / 0.017453292519943295d));
            }
            if (a + f < com.censivn.C3DEngine.b.b.ScreenConstants.A) {
                iAcos2 = iAcos3;
                iAcos = -90;
            } else {
                iAcos2 = iAcos3;
                iAcos = -((int) (Math.asin((com.censivn.C3DEngine.b.b.ScreenConstants.A - f) / a) / 0.017453292519943295d));
            }
        } else if (f <= 0.0f && f2 <= 0.0f) {
            int iAcos4 = f2 - a > com.censivn.C3DEngine.b.b.ScreenConstants.C ? -180 : ((int) (Math.acos((f2 - com.censivn.C3DEngine.b.b.ScreenConstants.C) / a) / 0.017453292519943295d)) - 180;
            if (f - a > com.censivn.C3DEngine.b.b.ScreenConstants.z) {
                iAcos2 = iAcos4;
                iAcos = 90;
            } else {
                iAcos2 = iAcos4;
                iAcos = 90 - ((int) (Math.acos((f - com.censivn.C3DEngine.b.b.ScreenConstants.z) / a) / 0.017453292519943295d));
            }
        } else {
            if (a + f2 < com.censivn.C3DEngine.b.b.ScreenConstants.B) {
                iAcos = 0;
            } else {
                iAcos = -((int) (Math.acos((com.censivn.C3DEngine.b.b.ScreenConstants.B - f2) / a) / 0.017453292519943295d));
            }
            iAcos2 = f - a > com.censivn.C3DEngine.b.b.ScreenConstants.z ? -270 : ((int) (Math.acos((f - com.censivn.C3DEngine.b.b.ScreenConstants.z) / a) / 0.017453292519943295d)) - 270;
        }
        float fAbs = Math.abs(iAcos - iAcos2);
        float f3 = (size - 1) * 25.0f;
        if (f3 < fAbs) {
            float f4 = (fAbs - f3) / 2.0f;
            if (iAcos < iAcos2) {
                iAcos = (int) (iAcos + f4);
            } else {
                iAcos = (int) (iAcos - f4);
            }
        }
        int i = iAcos + 90;
        for (int i2 = 0; i2 < size; i2++) {
            com.tsf.shell.f.e.f.EditModeController.c cVar = arrayListC.get(i2);
            cVar.d.b(1);
            cVar.d.b();
            a(cVar, i2, z, 25.0f, i, iAcos2, i2 * 50, com.censivn.C3DEngine.b.g.a.e);
        }
    }

    @Override // com.tsf.shell.f._d.c.a.DashLayoutContainer
    public int a(int i) {
        if (this.c) {
            return (i * 50) + 500;
        }
        return 500;
    }

    @Override // com.tsf.shell.f._d.c.a.DashLayoutContainer
    public void a() {
        ArrayList<com.tsf.shell.f.e.f.EditModeController.c> arrayListC = com.tsf.shell.manager.app.v.ScreenHelper.d().c();
        int iNumChildren = com.tsf.shell.manager.app.v.ScreenHelper.d().d().numChildren();
        for (int i = 0; i < iNumChildren; i++) {
            a(arrayListC.get(i), i, false);
        }
    }

    private void a(final com.tsf.shell.f.e.f.EditModeController.c cVar, int i, boolean z, float f, float f2, float f3, int i2, com.censivn.C3DEngine.b.g.TweenCallback bVar) {
        cVar.rotation().z = ((f2 > f3 ? 1 : (f2 == f3 ? 0 : -1)) > 0 ? (-i) * f : i * f) + f2;
        if (z) {
            cVar.c.rotation().z = 180.0f;
            cVar.d.rotation().z = 180.0f;
            cVar.d.b(2);
        } else {
            cVar.c.rotation().z = 0.0f;
            cVar.d.rotation().z = 0.0f;
            cVar.d.b(1);
        }
        final float f4 = cVar.d.position().x;
        final float fA = a + com.censivn.C3DEngine.b.b.ScreenConstants.a(60.0f);
        cVar.d.position().x = fA;
        cVar.d.scale().x = 1.0f;
        cVar.d.scale().y = 1.0f;
        cVar.c.scale().x = 1.0f;
        cVar.c.scale().y = 1.0f;
        cVar.calAABB(1.2f, 1.0f, 1.0f);
        cVar.d.position().x = f4;
        cVar.c.scale().x = 0.0f;
        cVar.c.scale().y = 0.0f;
        cVar.d.scale().x = 0.0f;
        cVar.d.scale().y = 0.0f;
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f._d.c.a.DashLayoutA.1
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a(float f5) {
                Number3d number3dScale = cVar.d.scale();
                Number3d number3dScale2 = cVar.d.scale();
                float f6 = cVar.c.scale().x;
                number3dScale2.y = f6;
                number3dScale.x = f6;
                cVar.d.position().x = f4 + ((fA - f4) * f5);
            }
        };
        dVar.f(a);
        dVar.l(1.0f);
        dVar.m(1.0f);
        if (this.c && i2 != 0) {
            dVar.b(i2);
        }
        dVar.a(bVar);
        com.censivn.C3DEngine.b.g.TweenUtils.a(cVar.c);
        com.censivn.C3DEngine.b.g.TweenUtils.a(cVar.c, 500, dVar);
    }

    private void a(final com.tsf.shell.f.e.f.EditModeController.c cVar, int i, boolean z) {
        final float f = cVar.d.position().x;
        final float fA = com.censivn.C3DEngine.b.b.ScreenConstants.a(60.0f);
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.f._d.c.a.DashLayoutA.2
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a(float f2) {
                Number3d number3dScale = cVar.d.scale();
                Number3d number3dScale2 = cVar.d.scale();
                float f3 = cVar.c.scale().x;
                number3dScale2.y = f3;
                number3dScale.x = f3;
                cVar.d.position().x = f + ((fA - f) * f2);
            }
        };
        dVar.h(0.0f);
        dVar.f(0.0f);
        dVar.e((-cVar.rotation().z) + 360.0f);
        dVar.l(0.0f);
        dVar.m(0.0f);
        if (this.c) {
            dVar.b(i * 50);
        }
        dVar.a(com.censivn.C3DEngine.b.g.a.e);
        com.censivn.C3DEngine.b.g.TweenUtils.a(cVar.c);
        com.censivn.C3DEngine.b.g.TweenUtils.a(cVar.c, 500, dVar);
    }
}
