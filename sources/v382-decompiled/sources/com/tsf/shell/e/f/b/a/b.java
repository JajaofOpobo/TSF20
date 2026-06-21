package com.tsf.shell.e.f.b.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.e.f.a.m;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b extends d {
    private boolean b;
    private boolean c;

    public b(int i, boolean z, boolean z2, boolean z3) {
        super(i, z3);
        this.b = z;
        this.c = z2;
    }

    @Override // com.tsf.shell.e.f.b.a.d
    public void a(ArrayList arrayList, boolean z, Runnable runnable) {
        j jVar = arrayList.size() > 0 ? (j) arrayList.get((int) (Math.random() * arrayList.size())) : null;
        x xVar = null;
        for (int i = 0; i < arrayList.size(); i++) {
            j jVar2 = (j) arrayList.get(i);
            w.a(jVar2);
            if (jVar2 instanceof com.tsf.shell.e.i.c) {
                Number3d number3d = (Number3d) m.E.get(i);
                if (z) {
                    x xVar2 = new x();
                    if (jVar2 == jVar) {
                        xVar2.b(60);
                        xVar = xVar2;
                    } else {
                        xVar2.b((int) (Math.random() * 50.0d));
                    }
                    xVar2.f(number3d.x);
                    xVar2.h(number3d.y);
                    xVar2.e(0.0f);
                    xVar2.l(1.0f);
                    xVar2.m(1.0f);
                    xVar2.c(0.0f);
                    xVar2.d(0.0f);
                    xVar2.a(255);
                    xVar2.a(com.censivn.C3DEngine.b.g.a.n);
                    w.a(jVar2, com.tsf.shell.e.e.g.a.e.ANIMATION_TIME, xVar2);
                    if (!com.tsf.shell.manager.a.v.d.b().b()) {
                        xVar = xVar2;
                    }
                } else {
                    jVar2.position().x = number3d.x;
                    jVar2.position().y = number3d.y;
                    jVar2.rotation().x = 0.0f;
                    jVar2.rotation().y = 0.0f;
                    jVar2.rotation().z = 0.0f;
                    jVar2.scale().x = 1.0f;
                    jVar2.scale().y = 1.0f;
                    jVar2.alpha(255.0f);
                }
            }
        }
        if (xVar != null) {
            xVar.a(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private x a(j jVar, float f, float f2, boolean z) {
        w.a(jVar);
        if (z) {
            x xVar = new x();
            xVar.f(f);
            xVar.h(f2);
            if (this.c) {
                xVar.l(3.0f);
                xVar.m(3.0f);
            } else {
                xVar.l(1.5f);
                xVar.m(1.5f);
            }
            xVar.a(0);
            if (this.b) {
                if (f > 0.0f) {
                    xVar.d(50.0f);
                } else {
                    xVar.d(-50.0f);
                }
                if (f2 > 0.0f) {
                    xVar.c(-50.0f);
                } else {
                    xVar.c(50.0f);
                }
            }
            w.a(jVar, 600, xVar);
            return xVar;
        }
        jVar.position().x = f;
        jVar.position().y = f2;
        if (this.b) {
            if (f > 0.0f) {
                jVar.rotation().y = 50.0f;
            } else {
                jVar.rotation().y = -50.0f;
            }
            if (f2 > 0.0f) {
                jVar.rotation().x = -50.0f;
            } else {
                jVar.rotation().x = 50.0f;
            }
        }
        if (this.c) {
            jVar.scale().x = 3.0f;
            jVar.scale().y = 3.0f;
        } else {
            jVar.scale().x = 1.5f;
            jVar.scale().y = 1.5f;
        }
        return null;
    }

    @Override // com.tsf.shell.e.f.b.a.d
    public void b(ArrayList arrayList, boolean z, Runnable runnable) {
        x xVar;
        x xVar2;
        int i;
        x xVar3;
        float f;
        x xVar4;
        float f2;
        x xVar5;
        float f3;
        int i2 = m.p;
        int i3 = m.q;
        int i4 = com.censivn.C3DEngine.b.b.a.F;
        int i5 = com.censivn.C3DEngine.b.b.a.G;
        float f4 = com.tsf.shell.manager.o.b.a.H;
        float f5 = com.tsf.shell.manager.o.b.a.I;
        float a = this.c ? com.censivn.C3DEngine.b.b.a.a(100.0f) : 0.0f;
        int size = arrayList.size();
        float f6 = ((-i4) / 2.0f) + (f4 / 2.0f);
        float f7 = (i4 - f4) / (i2 - 1);
        float f8 = f7 < 0.0f ? 0.0f : f7;
        int i6 = 0;
        float f9 = f6;
        x xVar6 = null;
        while (i6 < i2) {
            if (i6 < size) {
                xVar5 = a((j) arrayList.get(i6), f9, (i5 / 2.0f) + f5 + a, z);
                f3 = f9 + f8;
            } else {
                xVar5 = xVar6;
                f3 = f9;
            }
            i6++;
            f9 = f3;
            xVar6 = xVar5;
        }
        int i7 = (i2 * i3) - i2;
        if (i7 < size) {
            int i8 = i7;
            xVar = xVar6;
            while (i8 < size) {
                float f10 = f6 + f8;
                x a2 = a((j) arrayList.get(i8), f6, (((-i5) / 2.0f) - f5) - a, z);
                i8++;
                xVar = a2;
                f6 = f10;
            }
        } else {
            xVar = xVar6;
        }
        if (size <= i2 || i3 - 2 <= 0) {
            xVar2 = xVar;
        } else {
            int i9 = i3 - 1;
            float f11 = i == 1 ? 0.0f : (i5 / 2.0f) - (f5 / 2.0f);
            float f12 = i == 1 ? 0.0f : (i5 - f5) / (i - 1);
            int i10 = i2 - (i2 / 2);
            float f13 = (((-i4) / 2.0f) - ((i2 - r2) * f4)) - a;
            float f14 = (i4 / 2.0f) + f4 + a;
            float f15 = f11;
            xVar2 = xVar;
            int i11 = 1;
            while (i11 < i9) {
                int i12 = 0;
                float f16 = f13;
                while (i12 < i10) {
                    int i13 = (i11 * i2) + i12;
                    if (i13 < size) {
                        f2 = f16 + f4;
                        xVar4 = a((j) arrayList.get(i13), f16, f15, z);
                    } else {
                        float f17 = f16;
                        xVar4 = xVar2;
                        f2 = f17;
                    }
                    i12++;
                    float f18 = f2;
                    xVar2 = xVar4;
                    f16 = f18;
                }
                int i14 = i10;
                float f19 = f14;
                while (i14 < i2) {
                    int i15 = (i11 * i2) + i14;
                    if (i15 < size) {
                        f = f19 + f4;
                        xVar3 = a((j) arrayList.get(i15), f19, f15, z);
                    } else {
                        float f20 = f19;
                        xVar3 = xVar2;
                        f = f20;
                    }
                    i14++;
                    float f21 = f;
                    xVar2 = xVar3;
                    f19 = f21;
                }
                i11++;
                f15 -= f12;
            }
        }
        if (xVar2 != null) {
            xVar2.a(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.tsf.shell.e.f.b.a.d, com.tsf.shell.e.d.e.b
    public void a(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        x xVar = null;
        float f = com.censivn.C3DEngine.b.b.a.c * 25.0f;
        for (int i = 0; i < aVar.a(); i++) {
            com.censivn.C3DEngine.b.f.a.b a = aVar.a(i);
            xVar = new x();
            float abs = Math.abs((float) Math.sqrt((a.m.x * a.m.x) + (a.m.y * a.m.y)));
            float f2 = (a.m.x * (abs + f)) / abs;
            float f3 = (a.m.y * (abs + f)) / abs;
            xVar.f(f2);
            xVar.h(f3);
            if (this.c) {
                xVar.l(1.4f);
                xVar.m(1.4f);
            }
            if (this.b) {
                if (f2 > 0.0f) {
                    xVar.d(50.0f);
                } else {
                    xVar.d(-50.0f);
                }
                if (f3 > 0.0f) {
                    xVar.c(-50.0f);
                } else {
                    xVar.c(50.0f);
                }
            }
            w.a(a);
            w.a(a, 700, xVar);
        }
        if (xVar != null) {
            xVar.a(runnable);
            xVar.b(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
