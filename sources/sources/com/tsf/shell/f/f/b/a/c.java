package com.tsf.shell.f.f.b.a;

import com.censivn.C3DEngine.b.f.i;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends d {
    private boolean b;
    private boolean c;

    public c(int i, boolean z, boolean z2, boolean z3) {
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
        int i = 0;
        while (i < arrayList.size()) {
            i iVar = arrayList.get(i);
            com.censivn.C3DEngine.b.g.c.a(iVar);
            if (iVar instanceof com.tsf.shell.f.i.b) {
                com.censivn.C3DEngine.b.g.d dVar3 = new com.censivn.C3DEngine.b.g.d();
                if (z) {
                    dVar3.l(0.0f);
                    dVar3.m(0.0f);
                    dVar3.a(0);
                    if (this.c) {
                        dVar3.d(a(50));
                        dVar3.e(a(180));
                        dVar3.c(a(50));
                    }
                    com.censivn.C3DEngine.b.g.c.a(iVar, 600, dVar3);
                    dVar = dVar3;
                } else {
                    iVar.scale().x = 0.0f;
                    iVar.scale().y = 0.0f;
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
        com.censivn.C3DEngine.b.g.d dVar = null;
        for (int i = 0; i < aVar.a(); i++) {
            com.censivn.C3DEngine.b.f.a.b bVarA = aVar.a(i);
            dVar = new com.censivn.C3DEngine.b.g.d();
            dVar.l(0.0f);
            dVar.m(0.0f);
            if (this.c) {
                dVar.d(a(50));
                dVar.e(a(180));
                dVar.c(a(50));
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
