package com.tsf.shell.c.a;

import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.k.ah;
import com.tsf.shell.workspace3D.k.b.ap;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a {
    private static boolean a = false;

    public static void a() {
        a = true;
    }

    public static void b() {
        float f;
        float f2;
        if (a) {
            float f3 = 20.0f * com.censivn.C3DEngine.a.b;
            float f4 = (ap.G * 4.0f) + (3.0f * f3);
            float f5 = (ap.H * 2.0f) + f3;
            float f6 = (ap.G * 3.0f) + (2.0f * f3);
            float f7 = (ap.H * 3.0f) + (2.0f * f3);
            float f8 = 550.0f * com.censivn.C3DEngine.a.b;
            float f9 = 500.0f * com.censivn.C3DEngine.a.b;
            float f10 = 8.0f * f3;
            if (com.censivn.C3DEngine.a.q) {
                f = com.censivn.C3DEngine.a.l;
                f2 = com.censivn.C3DEngine.a.m;
            } else {
                f = com.censivn.C3DEngine.a.m;
                f2 = com.censivn.C3DEngine.a.l;
            }
            com.tsf.shell.workspace3D.h.a l = bf.j().l();
            ArrayList arrayList = new ArrayList();
            arrayList.add(com.tsf.shell.g.b.m);
            arrayList.add(com.tsf.shell.g.b.l);
            arrayList.add(com.tsf.shell.g.b.f);
            arrayList.add(com.tsf.shell.g.b.i);
            arrayList.add(com.tsf.shell.g.b.e);
            arrayList.add(com.tsf.shell.g.b.h);
            arrayList.add(com.tsf.shell.g.b.j);
            arrayList.add(com.tsf.shell.g.b.d);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ah a2 = com.tsf.shell.g.b.a((ArrayList) it.next());
                if (a2 != null) {
                    arrayList2.add(a2);
                    if (arrayList2.size() == 8.0f) {
                        break;
                    }
                }
            }
            float f11 = (f2 / 2.0f) - ((f2 - ((f8 + f10) + f5)) / 2.0f);
            float f12 = ((-f2) / 2.0f) + ((f2 - (f6 + (f9 + f10))) / 2.0f);
            float f13 = 1.0f;
            float f14 = 1.0f;
            if (0.8f * f2 < f5 + f8) {
                f13 = ((f2 * 0.8f) - f5) / f8;
                if (f13 < 0.5f) {
                    f13 = 0.5f;
                }
            }
            if (0.7f * f < f8) {
                f14 = (0.7f * f) / f8;
                if (f14 < 0.5f) {
                    f14 = 0.5f;
                }
            }
            float f15 = f11 - (f8 / 2.0f);
            bf.l().a("com.tsf.shell.widget.alarm", l.aG(), f15, (f9 / 2.0f) + f12 + ((f9 - (f9 * f14)) / 2.0f) + (60.0f * com.censivn.C3DEngine.a.b), f13, f14);
            float f16 = (((-f) / 2.0f) + ((f - f4) / 2.0f)) - ap.N;
            float f17 = (f15 - ((f8 / 2.0f) * f13)) - f10;
            float f18 = ((f / 2.0f) - ((f - f7) / 2.0f)) - ap.Q;
            float f19 = f12 + f9 + f10;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < arrayList2.size()) {
                    ah ahVar = (ah) arrayList2.get(i2);
                    l.g(ahVar);
                    LauncherItem3DInfo be = ahVar.be();
                    be.cellX = (int) (((i2 % 4.0f) * (ap.G + f3)) + f16);
                    be.cellY = (int) (f17 - (((int) (i2 / 4.0f)) * (ap.H + f3)));
                    be.cellXH = (int) (((i2 % 3.0f) * (ap.G + f3)) + f19);
                    be.cellYH = (int) (f18 - (((int) (i2 / 3.0f)) * (ap.H + f3)));
                    ahVar.i_();
                    ahVar.bs();
                    i = i2 + 1;
                } else {
                    l.aV();
                    return;
                }
            }
        }
    }
}
