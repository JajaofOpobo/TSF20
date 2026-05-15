package com.tsf.shell.f.i.b.d;

import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    protected void a(b bVar) {
        if (com.tsf.shell.manager.a.A.a()) {
            ArrayList arrayList = new ArrayList();
            for (com.censivn.C3DEngine.b.f.i iVar : bVar.aG()) {
                if (iVar instanceof com.tsf.shell.f.i.b.e.g) {
                    com.tsf.shell.f.i.b.e.g gVar = (com.tsf.shell.f.i.b.e.g) iVar;
                    if (gVar.bd() != null) {
                        arrayList.add(gVar.bd());
                    }
                }
            }
            com.tsf.shell.f.e.a.c.a(bVar, arrayList);
        }
    }
}
