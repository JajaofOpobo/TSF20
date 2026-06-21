package com.tsf.shell.e;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {
    private static int a = 0;
    private static TextureElement b;

    public static void a() {
        if (com.tsf.shell.manager.r.c.b.a && a < 6) {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.a(true);
                    b.a(false);
                }
            });
        }
    }

    public static void a(boolean z) {
        a++;
        final ArrayList arrayList = new ArrayList();
        if (b == null) {
            b = x.b(R.drawable.snowflake);
        }
        float f = 100.0f * com.censivn.C3DEngine.b.b.a.c;
        for (int i = 0; i < 20; i++) {
            c cVar = new c();
            cVar.a = (float) (0.2d + (Math.random() * 0.800000011920929d));
            if (cVar.a < 0.5d) {
                cVar.c = cVar.a * 10.0f;
            } else {
                cVar.c = cVar.a * 5.0f;
            }
            float f2 = cVar.a * f;
            cVar.g = (float) (com.censivn.C3DEngine.b.b.a.B + f2 + ((com.censivn.C3DEngine.b.b.a.E / 3) * Math.random()));
            cVar.f = ((com.censivn.C3DEngine.b.b.a.C - f2) - com.censivn.C3DEngine.b.b.a.K) - (100.0f * com.censivn.C3DEngine.b.b.a.c);
            cVar.e = d();
            cVar.h = 3.141592653589793d * Math.random() * 2.0d;
            cVar.i = 0.05235987755982989d;
            cVar.d = 40.0f * com.censivn.C3DEngine.b.b.a.c * cVar.a;
            arrayList.add(cVar);
        }
        final int size = arrayList.size();
        com.censivn.C3DEngine.b.f.a.a aVar = new com.censivn.C3DEngine.b.f.a.a(size, 100, 300, 100) { // from class: com.tsf.shell.e.b.2
            @Override // com.censivn.C3DEngine.b.f.a.a, com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                boolean z2 = true;
                for (int i2 = 0; i2 < size; i2++) {
                    c cVar2 = (c) arrayList.get(i2);
                    com.censivn.C3DEngine.b.f.a.b a2 = a(i2);
                    if (a2.i().y >= cVar2.f) {
                        a2.i().y -= cVar2.c;
                        a2.i().x = cVar2.e + ((float) (Math.sin(cVar2.h) * cVar2.d));
                        cVar2.h += cVar2.i;
                        a2.f();
                        z2 = false;
                    }
                }
                updatePointsVBO();
                if (z2) {
                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.b.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            this.removeFromParent();
                            b.a--;
                            if (b.a == 0) {
                                com.censivn.C3DEngine.a.g().a(b.b);
                                b.b = null;
                            }
                        }
                    });
                }
            }
        };
        aVar.useVBO(false);
        aVar.setAnimationObjectState(true);
        aVar.textures().addElement(b);
        for (int i2 = 0; i2 < size; i2++) {
            c cVar2 = (c) arrayList.get(i2);
            com.censivn.C3DEngine.b.f.a.b a2 = aVar.a(i2);
            a2.i().x = cVar2.e;
            a2.m.y = cVar2.g;
            a2.a(0, 0, 1, 1, f, f);
            if (cVar2.a <= 0.7d) {
                if (cVar2.a > 0.45d) {
                    a2.a(1, 0, 1, 1, f, f);
                } else {
                    a2.a(2, 0, 1, 1, f, f);
                }
            }
            a2.k().setAll(cVar2.a * 0.7f, cVar2.a * 0.7f, 0.0f);
            a2.h();
        }
        if (z) {
            com.tsf.shell.manager.a.f.g().addChild(aVar);
        } else {
            com.tsf.shell.manager.a.j.a(aVar);
        }
    }

    private static float d() {
        return (float) ((Math.random() * com.censivn.C3DEngine.b.b.a.F) + com.censivn.C3DEngine.b.b.a.z);
    }
}
