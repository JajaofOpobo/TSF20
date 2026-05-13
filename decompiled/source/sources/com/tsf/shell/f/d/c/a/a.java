package com.tsf.shell.f.d.c.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.f.e.f.a;
import java.util.ArrayList;
/* loaded from: classes.dex */
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
            com.censivn.C3DEngine.b.f.a.b a2 = aVar.a(i);
            double d = f2 * 0.017453292519943295d;
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.f((float) (Math.sin(d) * b));
            dVar.h((float) (Math.cos(d) * b));
            if (i == 3) {
                dVar.a(runnable);
            }
            if (this.c) {
                dVar.b(i * 100);
            }
            dVar.l(1.0f);
            dVar.m(1.0f);
            com.censivn.C3DEngine.b.g.c.a(a2);
            com.censivn.C3DEngine.b.g.c.a(a2, 500, dVar);
            f2 += f;
        }
    }

    @Override // com.tsf.shell.f.d.c.a.d
    public void b(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.a.b a2 = aVar.a(i);
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
            com.censivn.C3DEngine.b.g.c.a(a2);
            com.censivn.C3DEngine.b.g.c.a(a2, 500, dVar);
        }
    }

    @Override // com.tsf.shell.f.d.c.a.d
    public void a(ArrayList<Integer> arrayList, float f, float f2) {
        int i;
        int acos;
        int acos2;
        ArrayList<a.c> c = com.tsf.shell.manager.a.v.e.d().c();
        int size = arrayList.size();
        boolean z = false;
        if (f >= 0.0f && f2 >= 0.0f) {
            z = true;
            if (a + f2 < com.censivn.C3DEngine.b.b.a.B) {
                i = 0;
            } else {
                i = (int) (Math.acos((com.censivn.C3DEngine.b.b.a.B - f2) / a) / 0.017453292519943295d);
            }
            if (a + f < com.censivn.C3DEngine.b.b.a.A) {
                acos = 270;
            } else {
                acos = ((int) (Math.asin((com.censivn.C3DEngine.b.b.a.A - f) / a) / 0.017453292519943295d)) + 180;
            }
        } else if (f >= 0.0f && f2 <= 0.0f) {
            z = true;
            if (f2 - a > com.censivn.C3DEngine.b.b.a.C) {
                acos2 = 180;
            } else {
                acos2 = 180 - ((int) (Math.acos((f2 - com.censivn.C3DEngine.b.b.a.C) / a) / 0.017453292519943295d));
            }
            if (a + f < com.censivn.C3DEngine.b.b.a.A) {
                acos = acos2;
                i = -90;
            } else {
                acos = acos2;
                i = -((int) (Math.asin((com.censivn.C3DEngine.b.b.a.A - f) / a) / 0.017453292519943295d));
            }
        } else if (f <= 0.0f && f2 <= 0.0f) {
            int acos3 = f2 - a > com.censivn.C3DEngine.b.b.a.C ? -180 : ((int) (Math.acos((f2 - com.censivn.C3DEngine.b.b.a.C) / a) / 0.017453292519943295d)) - 180;
            if (f - a > com.censivn.C3DEngine.b.b.a.z) {
                acos = acos3;
                i = 90;
            } else {
                acos = acos3;
                i = 90 - ((int) (Math.acos((f - com.censivn.C3DEngine.b.b.a.z) / a) / 0.017453292519943295d));
            }
        } else {
            if (a + f2 < com.censivn.C3DEngine.b.b.a.B) {
                i = 0;
            } else {
                i = -((int) (Math.acos((com.censivn.C3DEngine.b.b.a.B - f2) / a) / 0.017453292519943295d));
            }
            acos = f - a > com.censivn.C3DEngine.b.b.a.z ? -270 : ((int) (Math.acos((f - com.censivn.C3DEngine.b.b.a.z) / a) / 0.017453292519943295d)) - 270;
        }
        float abs = Math.abs(i - acos);
        float f3 = (size - 1) * 25.0f;
        if (f3 < abs) {
            float f4 = (abs - f3) / 2.0f;
            if (i < acos) {
                i = (int) (i + f4);
            } else {
                i = (int) (i - f4);
            }
        }
        int i2 = i + 90;
        for (int i3 = 0; i3 < size; i3++) {
            a.c cVar = c.get(i3);
            cVar.d.b(1);
            cVar.d.b();
            a(cVar, i3, z, 25.0f, i2, acos, i3 * 50, com.censivn.C3DEngine.b.g.a.e);
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
        ArrayList<a.c> c = com.tsf.shell.manager.a.v.e.d().c();
        int numChildren = com.tsf.shell.manager.a.v.e.d().d().numChildren();
        for (int i = 0; i < numChildren; i++) {
            a(c.get(i), i, false);
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
        final float a2 = a + com.censivn.C3DEngine.b.b.a.a(60.0f);
        cVar.d.position().x = a2;
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
                Number3d scale = cVar.d.scale();
                Number3d scale2 = cVar.d.scale();
                float f6 = cVar.c.scale().x;
                scale2.y = f6;
                scale.x = f6;
                cVar.d.position().x = f4 + ((a2 - f4) * f5);
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
        final float a2 = com.censivn.C3DEngine.b.b.a.a(60.0f);
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.d.c.a.a.2
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f2) {
                Number3d scale = cVar.d.scale();
                Number3d scale2 = cVar.d.scale();
                float f3 = cVar.c.scale().x;
                scale2.y = f3;
                scale.x = f3;
                cVar.d.position().x = f + ((a2 - f) * f2);
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
