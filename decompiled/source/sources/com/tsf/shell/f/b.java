package com.tsf.shell.f;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.b;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b {
    private static int a = 0;
    private static TextureElement b;

    static /* synthetic */ int b() {
        int i = a;
        a = i - 1;
        return i;
    }

    public static void a() {
        if (com.tsf.shell.manager.r.c.b.a && a < 6) {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.b.1
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
            b = x.b(b.d.snowflake);
        }
        float f = 100.0f * com.censivn.C3DEngine.b.b.a.c;
        for (int i = 0; i < 20; i++) {
            a aVar = new a();
            aVar.a = (float) (0.2d + (Math.random() * 0.800000011920929d));
            if (aVar.a < 0.5d) {
                aVar.c = aVar.a * 10.0f;
            } else {
                aVar.c = aVar.a * 5.0f;
            }
            float f2 = aVar.a * f;
            aVar.g = (float) (com.censivn.C3DEngine.b.b.a.B + f2 + ((com.censivn.C3DEngine.b.b.a.E / 3) * Math.random()));
            aVar.f = ((com.censivn.C3DEngine.b.b.a.C - f2) - com.censivn.C3DEngine.b.b.a.K) - (100.0f * com.censivn.C3DEngine.b.b.a.c);
            aVar.e = e();
            aVar.h = 3.141592653589793d * Math.random() * 2.0d;
            aVar.i = 0.05235987755982989d;
            aVar.d = 40.0f * com.censivn.C3DEngine.b.b.a.c * aVar.a;
            arrayList.add(aVar);
        }
        final int size = arrayList.size();
        com.censivn.C3DEngine.b.f.a.a aVar2 = new com.censivn.C3DEngine.b.f.a.a(size, 100, 300, 100) { // from class: com.tsf.shell.f.b.2
            @Override // com.censivn.C3DEngine.b.f.a.a, com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                boolean z2 = true;
                for (int i2 = 0; i2 < size; i2++) {
                    a aVar3 = (a) arrayList.get(i2);
                    com.censivn.C3DEngine.b.f.a.b a2 = a(i2);
                    if (a2.i().y >= aVar3.f) {
                        a2.i().y -= aVar3.c;
                        a2.i().x = aVar3.e + ((float) (Math.sin(aVar3.h) * aVar3.d));
                        aVar3.h += aVar3.i;
                        a2.f();
                        z2 = false;
                    }
                }
                updatePointsVBO();
                if (z2) {
                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.b.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            this.removeFromParent();
                            b.b();
                            if (b.a == 0) {
                                com.censivn.C3DEngine.a.g().a(b.b);
                                TextureElement unused = b.b = null;
                            }
                        }
                    });
                }
            }
        };
        aVar2.useVBO(false);
        aVar2.setAnimationObjectState(true);
        aVar2.textures().addElement(b);
        for (int i2 = 0; i2 < size; i2++) {
            a aVar3 = (a) arrayList.get(i2);
            com.censivn.C3DEngine.b.f.a.b a2 = aVar2.a(i2);
            a2.i().x = aVar3.e;
            a2.m.y = aVar3.g;
            a2.a(0, 0, 1, 1, f, f);
            if (aVar3.a <= 0.7d) {
                if (aVar3.a > 0.45d) {
                    a2.a(1, 0, 1, 1, f, f);
                } else {
                    a2.a(2, 0, 1, 1, f, f);
                }
            }
            a2.k().setAll(aVar3.a * 0.7f, aVar3.a * 0.7f, 0.0f);
            a2.h();
        }
        if (z) {
            com.tsf.shell.manager.a.f.g().addChild(aVar2);
        } else {
            com.tsf.shell.manager.a.j.a(aVar2);
        }
    }

    private static float e() {
        return (float) ((Math.random() * com.censivn.C3DEngine.b.b.a.F) + com.censivn.C3DEngine.b.b.a.z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        float d;
        float e;
        float f;
        float g;
        double i;
        float a = 1.0f;
        float b = 1.0f;
        float c = 1.0f;
        double h = 0.0d;

        a() {
        }
    }
}
