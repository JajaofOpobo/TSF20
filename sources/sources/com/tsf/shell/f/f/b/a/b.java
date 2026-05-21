package com.tsf.shell.f.f.b.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.f.f.a.h;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        i iVar = arrayList.size() > 0 ? arrayList.get((int) (Math.random() * ((double) arrayList.size()))) : null;
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
        com.censivn.C3DEngine.b.g.d dVarA;
        float f;
        com.censivn.C3DEngine.b.g.d dVarA2;
        float f2;
        com.censivn.C3DEngine.b.g.d dVarA3;
        float f3;
        int i2 = h.p;
        int i3 = h.q;
        int i4 = com.censivn.C3DEngine.b.b.a.F;
        int i5 = com.censivn.C3DEngine.b.b.a.G;
        float f4 = com.tsf.shell.manager.o.b.a.H;
        float f5 = com.tsf.shell.manager.o.b.a.I;
        float fA = this.c ? com.censivn.C3DEngine.b.b.a.a(100.0f) : 0.0f;
        int size = arrayList.size();
        float f6 = ((-i4) / 2.0f) + (f4 / 2.0f);
        float f7 = (i4 - f4) / (i2 - 1);
        float f8 = f7 < 0.0f ? 0.0f : f7;
        int i6 = 0;
        float f9 = f6;
        com.censivn.C3DEngine.b.g.d dVar3 = null;
        while (i6 < i2) {
            if (i6 < size) {
                dVarA3 = a(arrayList.get(i6), f9, (i5 / 2.0f) + f5 + fA, z);
                f3 = f9 + f8;
            } else {
                dVarA3 = dVar3;
                f3 = f9;
            }
            i6++;
            f9 = f3;
            dVar3 = dVarA3;
        }
        int i7 = (i2 * i3) - i2;
        if (i7 < size) {
            int i8 = i7;
            dVar = dVar3;
            while (i8 < size) {
                float f10 = f6 + f8;
                com.censivn.C3DEngine.b.g.d dVarA4 = a(arrayList.get(i8), f6, (((-i5) / 2.0f) - f5) - fA, z);
                i8++;
                dVar = dVarA4;
                f6 = f10;
            }
        } else {
            dVar = dVar3;
        }
        if (size <= i2 || i3 - 2 <= 0) {
            dVar2 = dVar;
        } else {
            int i9 = i3 - 1;
            float f11 = i == 1 ? 0.0f : (i5 / 2.0f) - (f5 / 2.0f);
            float f12 = i == 1 ? 0.0f : (i5 - f5) / (i - 1);
            int i10 = i2 - (i2 / 2);
            float f13 = (((-i4) / 2.0f) - ((i2 - r2) * f4)) - fA;
            float f14 = (i4 / 2.0f) + f4 + fA;
            float f15 = f11;
            dVar2 = dVar;
            int i11 = 1;
            while (i11 < i9) {
                int i12 = 0;
                float f16 = f13;
                while (i12 < i10) {
                    int i13 = (i11 * i2) + i12;
                    if (i13 < size) {
                        f2 = f16 + f4;
                        dVarA2 = a(arrayList.get(i13), f16, f15, z);
                    } else {
                        float f17 = f16;
                        dVarA2 = dVar2;
                        f2 = f17;
                    }
                    i12++;
                    float f18 = f2;
                    dVar2 = dVarA2;
                    f16 = f18;
                }
                int i14 = i10;
                float f19 = f14;
                while (i14 < i2) {
                    int i15 = (i11 * i2) + i14;
                    if (i15 < size) {
                        f = f19 + f4;
                        dVarA = a(arrayList.get(i15), f19, f15, z);
                    } else {
                        float f20 = f19;
                        dVarA = dVar2;
                        f = f20;
                    }
                    i14++;
                    float f21 = f;
                    dVar2 = dVarA;
                    f19 = f21;
                }
                i11++;
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
            com.censivn.C3DEngine.b.f.a.b bVarA = aVar.a(i);
            dVar = new com.censivn.C3DEngine.b.g.d();
            float fAbs = Math.abs((float) Math.sqrt((bVarA.m.x * bVarA.m.x) + (bVarA.m.y * bVarA.m.y)));
            float f2 = (bVarA.m.x * (fAbs + f)) / fAbs;
            float f3 = (bVarA.m.y * (fAbs + f)) / fAbs;
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
            com.censivn.C3DEngine.b.g.c.a(bVarA);
            com.censivn.C3DEngine.b.g.c.a(bVarA, 700, dVar);
        }
        if (dVar != null) {
            dVar.a(runnable);
            dVar.b(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
