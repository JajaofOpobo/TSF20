package com.tsf.shell.f.d.c.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.f.e.f.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends d {
    private static final float a = 268.0f * com.censivn.C3DEngine.b.b.a.c;
    private boolean c;

    public a(int i, boolean z, boolean z2) {
        super(i, z2);
        this.c = false;
        this.c = z;
    }

    @Override // com.tsf.shell.f.d.c.a.d
    public void a(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        float f = 120.0f / 3.0f;
        float f2 = 90.0f - (120.0f / 2.0f);
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.a.b bVarA = aVar.a(i);
            double d = ((double) f2) * 0.017453292519943295d;
            float fSin = (float) (Math.sin(d) * ((double) b));
            float fCos = (float) (Math.cos(d) * ((double) b));
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
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
            com.censivn.C3DEngine.b.g.c.a(bVarA);
            com.censivn.C3DEngine.b.g.c.a(bVarA, 500, dVar);
            f2 += f;
        }
    }

    @Override // com.tsf.shell.f.d.c.a.d
    public void b(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.a.b bVarA = aVar.a(i);
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
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
            com.censivn.C3DEngine.b.g.c.a(bVarA);
            com.censivn.C3DEngine.b.g.c.a(bVarA, 500, dVar);
        }
    }

    @Override // com.tsf.shell.f.d.c.a.d
    public void a(ArrayList<Integer> arrayList, float f, float f2) {
        int iAcos;
        int iAcos2;
        int iAcos3;
        ArrayList<a.c> arrayListC = com.tsf.shell.manager.a.v.e.d().c();
        int size = arrayList.size();
        boolean z = false;
        if (f >= 0.0f && f2 >= 0.0f) {
            z = true;
            if (a + f2 < com.censivn.C3DEngine.b.b.a.B) {
                iAcos = 0;
            } else {
                iAcos = (int) (Math.acos((com.censivn.C3DEngine.b.b.a.B - f2) / a) / 0.017453292519943295d);
            }
            if (a + f < com.censivn.C3DEngine.b.b.a.A) {
                iAcos2 = 270;
            } else {
                iAcos2 = ((int) (Math.asin((com.censivn.C3DEngine.b.b.a.A - f) / a) / 0.017453292519943295d)) + 180;
            }
        } else if (f >= 0.0f && f2 <= 0.0f) {
            z = true;
            if (f2 - a > com.censivn.C3DEngine.b.b.a.C) {
                iAcos3 = 180;
            } else {
                iAcos3 = 180 - ((int) (Math.acos((f2 - com.censivn.C3DEngine.b.b.a.C) / a) / 0.017453292519943295d));
            }
            if (a + f < com.censivn.C3DEngine.b.b.a.A) {
                iAcos2 = iAcos3;
                iAcos = -90;
            } else {
                iAcos2 = iAcos3;
                iAcos = -((int) (Math.asin((com.censivn.C3DEngine.b.b.a.A - f) / a) / 0.017453292519943295d));
            }
        } else if (f <= 0.0f && f2 <= 0.0f) {
            int iAcos4 = f2 - a > com.censivn.C3DEngine.b.b.a.C ? -180 : ((int) (Math.acos((f2 - com.censivn.C3DEngine.b.b.a.C) / a) / 0.017453292519943295d)) - 180;
            if (f - a > com.censivn.C3DEngine.b.b.a.z) {
                iAcos2 = iAcos4;
                iAcos = 90;
            } else {
                iAcos2 = iAcos4;
                iAcos = 90 - ((int) (Math.acos((f - com.censivn.C3DEngine.b.b.a.z) / a) / 0.017453292519943295d));
            }
        } else {
            if (a + f2 < com.censivn.C3DEngine.b.b.a.B) {
                iAcos = 0;
            } else {
                iAcos = -((int) (Math.acos((com.censivn.C3DEngine.b.b.a.B - f2) / a) / 0.017453292519943295d));
            }
            iAcos2 = f - a > com.censivn.C3DEngine.b.b.a.z ? -270 : ((int) (Math.acos((f - com.censivn.C3DEngine.b.b.a.z) / a) / 0.017453292519943295d)) - 270;
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
            a.c cVar = arrayListC.get(i2);
            cVar.d.b(1);
            cVar.d.b();
            a(cVar, i2, z, 25.0f, i, iAcos2, i2 * 50, com.censivn.C3DEngine.b.g.a.e);
        }
    }

    @Override // com.tsf.shell.f.d.c.a.d
    public int a(int i) {
        if (this.c) {
            return (i * 50) + 500;
        }
        return 500;
    }

    @Override // com.tsf.shell.f.d.c.a.d
    public void a() {
        ArrayList<a.c> arrayListC = com.tsf.shell.manager.a.v.e.d().c();
        int iNumChildren = com.tsf.shell.manager.a.v.e.d().d().numChildren();
        for (int i = 0; i < iNumChildren; i++) {
            a(arrayListC.get(i), i, false);
        }
    }

    private void a(final a.c cVar, int i, boolean z, float f, float f2, float f3, int i2, com.censivn.C3DEngine.b.g.b bVar) {
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
        final float fA = a + com.censivn.C3DEngine.b.b.a.a(60.0f);
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
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.c.a.a.1
            @Override // com.censivn.C3DEngine.b.g.d
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
        com.censivn.C3DEngine.b.g.c.a(cVar.c);
        com.censivn.C3DEngine.b.g.c.a(cVar.c, 500, dVar);
    }

    private void a(final a.c cVar, int i, boolean z) {
        final float f = cVar.d.position().x;
        final float fA = com.censivn.C3DEngine.b.b.a.a(60.0f);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.c.a.a.2
            @Override // com.censivn.C3DEngine.b.g.d
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
        com.censivn.C3DEngine.b.g.c.a(cVar.c);
        com.censivn.C3DEngine.b.g.c.a(cVar.c, 500, dVar);
    }
}
