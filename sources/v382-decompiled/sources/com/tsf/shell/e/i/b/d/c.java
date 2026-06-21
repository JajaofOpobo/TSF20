package com.tsf.shell.e.i.b.d;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c {
    protected void a(b bVar) {
        if (com.tsf.shell.manager.a.A.a()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = bVar.aG().iterator();
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
                if (jVar instanceof com.tsf.shell.e.i.b.e.i) {
                    com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) jVar;
                    if (iVar.bd() != null) {
                        arrayList.add(iVar.bd());
                    }
                }
            }
            com.tsf.shell.e.e.a.c.a(bVar, arrayList);
        }
    }
}
