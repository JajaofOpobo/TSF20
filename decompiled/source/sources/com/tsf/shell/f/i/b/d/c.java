package com.tsf.shell.f.i.b.d;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class c {
    /* JADX INFO: Access modifiers changed from: protected */
    public void a(b bVar) {
        if (com.tsf.shell.manager.a.A.a()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.censivn.C3DEngine.b.f.i> it = bVar.aG().iterator();
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.f.i next = it.next();
                if (next instanceof com.tsf.shell.f.i.b.e.g) {
                    com.tsf.shell.f.i.b.e.g gVar = (com.tsf.shell.f.i.b.e.g) next;
                    if (gVar.bd() != null) {
                        arrayList.add(gVar.bd());
                    }
                }
            }
            com.tsf.shell.f.e.a.c.a(bVar, arrayList);
        }
    }
}
