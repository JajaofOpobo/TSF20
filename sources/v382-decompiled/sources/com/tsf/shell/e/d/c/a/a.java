package com.tsf.shell.e.d.c.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.g.v;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
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

    @Override // com.tsf.shell.e.d.c.a.d
    public void a(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        float f = 120.0f / 3.0f;
        float f2 = 90.0f - (120.0f / 2.0f);
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.a.b a2 = aVar.a(i);
            double d = f2 * 0.017453292519943295d;
            float sin = (float) (Math.sin(d) * b);
            float cos = (float) (Math.cos(d) * b);
            x xVar = new x();
            xVar.f(sin);
            xVar.h(cos);
            if (i == 3) {
                xVar.a(runnable);
            }
            if (this.c) {
                xVar.b(i * 100);
            }
            xVar.l(1.0f);
            xVar.m(1.0f);
            w.a(a2);
            w.a(a2, 500, xVar);
            f2 += f;
        }
    }

    @Override // com.tsf.shell.e.d.c.a.d
    public void b(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        for (int i = 0; i < 4; i++) {
            com.censivn.C3DEngine.b.f.a.b a2 = aVar.a(i);
            x xVar = new x();
            xVar.f(0.0f);
            xVar.h(0.0f);
            xVar.l(0.0f);
            xVar.m(0.0f);
            if (i == 3) {
                xVar.a(runnable);
            }
            if (this.c) {
                xVar.b(i * 80);
            }
            w.a(a2);
            w.a(a2, 500, xVar);
        }
    }

    @Override // com.tsf.shell.e.d.c.a.d
    public void a(ArrayList arrayList, float f, float f2) {
        int i;
        int acos;
        int acos2;
        ArrayList c = com.tsf.shell.manager.a.v.e.d().c();
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
            com.tsf.shell.e.e.f.d dVar = (com.tsf.shell.e.e.f.d) c.get(i3);
            dVar.d.b(1);
            dVar.d.b();
            a(dVar, i3, z, 25.0f, i2, acos, i3 * 50, com.censivn.C3DEngine.b.g.a.e);
        }
    }

    @Override // com.tsf.shell.e.d.c.a.d
    public int a(int i) {
        if (this.c) {
            return (i * 50) + 500;
        }
        return 500;
    }

    @Override // com.tsf.shell.e.d.c.a.d
    public void a() {
        ArrayList c = com.tsf.shell.manager.a.v.e.d().c();
        int numChildren = com.tsf.shell.manager.a.v.e.d().d().numChildren();
        for (int i = 0; i < numChildren; i++) {
            a((com.tsf.shell.e.e.f.d) c.get(i), i, false);
        }
    }

    private void a(final com.tsf.shell.e.e.f.d dVar, int i, boolean z, float f, float f2, float f3, int i2, v vVar) {
        dVar.rotation().z = ((f2 > f3 ? 1 : (f2 == f3 ? 0 : -1)) > 0 ? (-i) * f : i * f) + f2;
        if (z) {
            dVar.c.rotation().z = 180.0f;
            dVar.d.rotation().z = 180.0f;
            dVar.d.b(2);
        } else {
            dVar.c.rotation().z = 0.0f;
            dVar.d.rotation().z = 0.0f;
            dVar.d.b(1);
        }
        final float f4 = dVar.d.position().x;
        final float a2 = a + com.censivn.C3DEngine.b.b.a.a(60.0f);
        dVar.d.position().x = a2;
        dVar.d.scale().x = 1.0f;
        dVar.d.scale().y = 1.0f;
        dVar.c.scale().x = 1.0f;
        dVar.c.scale().y = 1.0f;
        dVar.calAABB(1.2f, 1.0f, 1.0f);
        dVar.d.position().x = f4;
        dVar.c.scale().x = 0.0f;
        dVar.c.scale().y = 0.0f;
        dVar.d.scale().x = 0.0f;
        dVar.d.scale().y = 0.0f;
        x xVar = new x() { // from class: com.tsf.shell.e.d.c.a.a.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f5) {
                Number3d scale = dVar.d.scale();
                Number3d scale2 = dVar.d.scale();
                float f6 = dVar.c.scale().x;
                scale2.y = f6;
                scale.x = f6;
                dVar.d.position().x = f4 + ((a2 - f4) * f5);
            }
        };
        xVar.f(a);
        xVar.l(1.0f);
        xVar.m(1.0f);
        if (this.c && i2 != 0) {
            xVar.b(i2);
        }
        xVar.a(vVar);
        w.a(dVar.c);
        w.a(dVar.c, 500, xVar);
    }

    private void a(final com.tsf.shell.e.e.f.d dVar, int i, boolean z) {
        final float f = dVar.d.position().x;
        final float a2 = com.censivn.C3DEngine.b.b.a.a(60.0f);
        x xVar = new x() { // from class: com.tsf.shell.e.d.c.a.a.2
            @Override // com.censivn.C3DEngine.b.g.x
            public void a(float f2) {
                Number3d scale = dVar.d.scale();
                Number3d scale2 = dVar.d.scale();
                float f3 = dVar.c.scale().x;
                scale2.y = f3;
                scale.x = f3;
                dVar.d.position().x = f + ((a2 - f) * f2);
            }
        };
        xVar.h(0.0f);
        xVar.f(0.0f);
        xVar.e((-dVar.rotation().z) + 360.0f);
        xVar.l(0.0f);
        xVar.m(0.0f);
        if (this.c) {
            xVar.b(i * 50);
        }
        xVar.a(com.censivn.C3DEngine.b.g.a.e);
        w.a(dVar.c);
        w.a(dVar.c, 500, xVar);
    }
}
