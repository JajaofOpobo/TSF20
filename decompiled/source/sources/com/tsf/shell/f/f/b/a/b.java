package com.tsf.shell.f.f.b.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.f.f.a.h;
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

    @Override // com.tsf.shell.f.f.b.a.d
    public void a(ArrayList<i> arrayList, boolean z, Runnable runnable) {
        i iVar = arrayList.size() > 0 ? arrayList.get((int) (Math.random() * arrayList.size())) : null;
        com.censivn.C3DEngine.b.g.d dVar = null;
        for (int i = 0; i < arrayList.size(); i++) {
            i iVar2 = arrayList.get(i);
            com.censivn.C3DEngine.b.g.c.a(iVar2);
            if (iVar2 instanceof com.tsf.shell.f.i.b) {
                Number3d number3d = h.E.get(i);
                if (z) {
                    com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                    if (iVar2 == iVar) {
                        dVar2.b(60);
                        dVar = dVar2;
                    } else {
                        dVar2.b((int) (Math.random() * 50.0d));
                    }
                    dVar2.f(number3d.x);
                    dVar2.h(number3d.y);
                    dVar2.e(0.0f);
                    dVar2.l(1.0f);
                    dVar2.m(1.0f);
                    dVar2.c(0.0f);
                    dVar2.d(0.0f);
                    dVar2.a(255);
                    dVar2.a(com.censivn.C3DEngine.b.g.a.n);
                    com.censivn.C3DEngine.b.g.c.a(iVar2, com.tsf.shell.f.e.g.a.c.ANIMATION_TIME, dVar2);
                    if (com.tsf.shell.manager.a.v.d.b().b()) {
                        dVar2 = dVar;
                    }
                    dVar = dVar2;
                } else {
                    iVar2.position().x = number3d.x;
                    iVar2.position().y = number3d.y;
                    iVar2.rotation().x = 0.0f;
                    iVar2.rotation().y = 0.0f;
                    iVar2.rotation().z = 0.0f;
                    iVar2.scale().x = 1.0f;
                    iVar2.scale().y = 1.0f;
                    iVar2.alpha(255.0f);
                }
            }
        }
        if (dVar != null) {
            dVar.a(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private com.censivn.C3DEngine.b.g.d a(i iVar, float f, float f2, boolean z) {
        com.censivn.C3DEngine.b.g.c.a(iVar);
        if (z) {
            com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.f(f);
            dVar.h(f2);
            if (this.c) {
                dVar.l(3.0f);
                dVar.m(3.0f);
            } else {
                dVar.l(1.5f);
                dVar.m(1.5f);
            }
            dVar.a(0);
            if (this.b) {
                if (f > 0.0f) {
                    dVar.d(50.0f);
                } else {
                    dVar.d(-50.0f);
                }
                if (f2 > 0.0f) {
                    dVar.c(-50.0f);
                } else {
                    dVar.c(50.0f);
                }
            }
            com.censivn.C3DEngine.b.g.c.a(iVar, 600, dVar);
            return dVar;
        }
        iVar.position().x = f;
        iVar.position().y = f2;
        if (this.b) {
            if (f > 0.0f) {
                iVar.rotation().y = 50.0f;
            } else {
                iVar.rotation().y = -50.0f;
            }
            if (f2 > 0.0f) {
                iVar.rotation().x = -50.0f;
            } else {
                iVar.rotation().x = 50.0f;
            }
        }
        if (this.c) {
            iVar.scale().x = 3.0f;
            iVar.scale().y = 3.0f;
        } else {
            iVar.scale().x = 1.5f;
            iVar.scale().y = 1.5f;
        }
        return null;
    }

    @Override // com.tsf.shell.f.f.b.a.d
    public void b(ArrayList<i> arrayList, boolean z, Runnable runnable) {
        com.censivn.C3DEngine.b.g.d dVar;
        com.censivn.C3DEngine.b.g.d dVar2;
        int i;
        int i2;
        com.censivn.C3DEngine.b.g.d dVar3;
        float f;
        com.censivn.C3DEngine.b.g.d dVar4;
        float f2;
        com.censivn.C3DEngine.b.g.d dVar5;
        float f3;
        int i3 = h.p;
        int i4 = h.q;
        int i5 = com.censivn.C3DEngine.b.b.a.F;
        int i6 = com.censivn.C3DEngine.b.b.a.G;
        float f4 = com.tsf.shell.manager.o.b.a.H;
        float f5 = com.tsf.shell.manager.o.b.a.I;
        float a = this.c ? com.censivn.C3DEngine.b.b.a.a(100.0f) : 0.0f;
        int size = arrayList.size();
        float f6 = ((-i5) / 2.0f) + (f4 / 2.0f);
        float f7 = (i5 - f4) / (i3 - 1);
        float f8 = f7 < 0.0f ? 0.0f : f7;
        int i7 = 0;
        float f9 = f6;
        com.censivn.C3DEngine.b.g.d dVar6 = null;
        while (i7 < i3) {
            if (i7 < size) {
                dVar5 = a(arrayList.get(i7), f9, (i6 / 2.0f) + f5 + a, z);
                f3 = f9 + f8;
            } else {
                dVar5 = dVar6;
                f3 = f9;
            }
            i7++;
            f9 = f3;
            dVar6 = dVar5;
        }
        int i8 = (i3 * i4) - i3;
        if (i8 < size) {
            int i9 = i8;
            dVar = dVar6;
            while (i9 < size) {
                float f10 = f6 + f8;
                com.censivn.C3DEngine.b.g.d a2 = a(arrayList.get(i9), f6, (((-i6) / 2.0f) - f5) - a, z);
                i9++;
                dVar = a2;
                f6 = f10;
            }
        } else {
            dVar = dVar6;
        }
        if (size <= i3 || i4 - 2 <= 0) {
            dVar2 = dVar;
        } else {
            int i10 = i4 - 1;
            float f11 = i == 1 ? 0.0f : (i6 / 2.0f) - (f5 / 2.0f);
            float f12 = i == 1 ? 0.0f : (i6 - f5) / (i - 1);
            int i11 = i3 - (i3 / 2);
            float f13 = (((-i5) / 2.0f) - ((i3 - i2) * f4)) - a;
            float f14 = (i5 / 2.0f) + f4 + a;
            float f15 = f11;
            dVar2 = dVar;
            int i12 = 1;
            while (i12 < i10) {
                int i13 = 0;
                float f16 = f13;
                while (i13 < i11) {
                    int i14 = (i12 * i3) + i13;
                    if (i14 < size) {
                        f2 = f16 + f4;
                        dVar4 = a(arrayList.get(i14), f16, f15, z);
                    } else {
                        float f17 = f16;
                        dVar4 = dVar2;
                        f2 = f17;
                    }
                    i13++;
                    float f18 = f2;
                    dVar2 = dVar4;
                    f16 = f18;
                }
                int i15 = i11;
                float f19 = f14;
                while (i15 < i3) {
                    int i16 = (i12 * i3) + i15;
                    if (i16 < size) {
                        f = f19 + f4;
                        dVar3 = a(arrayList.get(i16), f19, f15, z);
                    } else {
                        float f20 = f19;
                        dVar3 = dVar2;
                        f = f20;
                    }
                    i15++;
                    float f21 = f;
                    dVar2 = dVar3;
                    f19 = f21;
                }
                i12++;
                f15 -= f12;
            }
        }
        if (dVar2 != null) {
            dVar2.a(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.tsf.shell.f.f.b.a.d, com.tsf.shell.f.d.e.a.InterfaceC0090a
    public void a(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        com.censivn.C3DEngine.b.g.d dVar = null;
        float f = com.censivn.C3DEngine.b.b.a.c * 25.0f;
        for (int i = 0; i < aVar.a(); i++) {
            com.censivn.C3DEngine.b.f.a.b a = aVar.a(i);
            dVar = new com.censivn.C3DEngine.b.g.d();
            float abs = Math.abs((float) Math.sqrt((a.m.x * a.m.x) + (a.m.y * a.m.y)));
            float f2 = (a.m.x * (abs + f)) / abs;
            float f3 = (a.m.y * (abs + f)) / abs;
            dVar.f(f2);
            dVar.h(f3);
            if (this.c) {
                dVar.l(1.4f);
                dVar.m(1.4f);
            }
            if (this.b) {
                if (f2 > 0.0f) {
                    dVar.d(50.0f);
                } else {
                    dVar.d(-50.0f);
                }
                if (f3 > 0.0f) {
                    dVar.c(-50.0f);
                } else {
                    dVar.c(50.0f);
                }
            }
            com.censivn.C3DEngine.b.g.c.a(a);
            com.censivn.C3DEngine.b.g.c.a(a, 700, dVar);
        }
        if (dVar != null) {
            dVar.a(runnable);
            dVar.b(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
