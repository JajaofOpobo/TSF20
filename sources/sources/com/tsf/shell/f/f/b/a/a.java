package com.tsf.shell.f.f.b.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.f.f.a.h;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends d {
    private boolean b;
    private boolean c;

    public a(int i, boolean z, boolean z2, boolean z3) {
        super(i, z3);
        this.b = z;
        this.c = z2;
    }

    @Override // com.tsf.shell.f.f.b.a.d
    public void a(ArrayList<i> arrayList, boolean z, Runnable runnable) {
        a(arrayList, z, this.b, runnable);
    }

    @Override // com.tsf.shell.f.f.b.a.d
    public void b(ArrayList<i> arrayList, boolean z, Runnable runnable) {
        com.censivn.C3DEngine.b.g.d dVar;
        com.censivn.C3DEngine.b.g.d dVar2 = null;
        float fA = com.censivn.C3DEngine.b.b.a.a(300.0f);
        int i = 0;
        while (i < arrayList.size()) {
            i iVar = arrayList.get(i);
            Number3d number3d = h.E.get(i);
            com.censivn.C3DEngine.b.g.c.a(iVar);
            if (iVar instanceof com.tsf.shell.f.i.b) {
                com.censivn.C3DEngine.b.g.d dVar3 = new com.censivn.C3DEngine.b.g.d();
                if (z) {
                    dVar3.f(0.0f);
                    dVar3.h(number3d.y + fA);
                    dVar3.a(0);
                    if (this.c) {
                        dVar3.d(a(50));
                        dVar3.e(a(180));
                        dVar3.c(a(50));
                    }
                    com.censivn.C3DEngine.b.g.c.a(iVar, 600, dVar3);
                    dVar = dVar3;
                } else {
                    iVar.position().x = 0.0f;
                    iVar.position().y = 0.0f + fA;
                    iVar.alpha(0.0f);
                    if (this.c) {
                        iVar.rotation().x = a(50);
                        iVar.rotation().y = a(180);
                        iVar.rotation().z = a(50);
                    }
                    dVar = dVar2;
                }
            } else {
                dVar = dVar2;
            }
            i++;
            dVar2 = dVar;
        }
        if (dVar2 != null) {
            dVar2.a(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.tsf.shell.f.f.b.a.d, com.tsf.shell.f.d.e.a.InterfaceC0090a
    public void a(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
        float fA = com.censivn.C3DEngine.b.b.a.a(0.0f);
        com.censivn.C3DEngine.b.g.d dVar = null;
        int i = 0;
        while (i < aVar.a()) {
            com.censivn.C3DEngine.b.f.a.b bVarA = aVar.a(i);
            com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
            dVar2.h(com.tsf.shell.f.d.e.a.a.get(i).y + fA);
            dVar2.f(0.0f);
            if (this.c) {
                dVar2.d(a(50));
                dVar2.e(a(180));
                dVar2.c(a(50));
            }
            com.censivn.C3DEngine.b.g.c.a(bVarA);
            com.censivn.C3DEngine.b.g.c.a(bVarA, 700, dVar2);
            i++;
            dVar = dVar2;
        }
        if (dVar != null) {
            dVar.a(runnable);
            dVar.b(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
