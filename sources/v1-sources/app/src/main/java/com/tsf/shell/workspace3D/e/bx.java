package com.tsf.shell.workspace3D.e;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bx {
    private static ArrayList a = new ArrayList();

    public static com.censivn.C3DEngine.e.b a(com.censivn.C3DEngine.b.r rVar) {
        com.censivn.C3DEngine.e.b bVar;
        if (a.isEmpty()) {
            bVar = new com.censivn.C3DEngine.e.b(128.0f, 128.0f);
            bVar.a((Boolean) false);
        } else {
            bVar = (com.censivn.C3DEngine.e.b) a.remove(0);
        }
        bVar.L().setAllFrom(rVar.L());
        bVar.N().setAllFrom(rVar.N());
        bVar.M().setAllFrom(rVar.M());
        float al = rVar.al();
        float am = rVar.am();
        float an = rVar.an();
        float ao = rVar.ao();
        float ap = rVar.ap();
        rVar.aq();
        bVar.b(al, am, an, ao, ap);
        return bVar;
    }

    public static void a(com.censivn.C3DEngine.e.b bVar) {
        a.add(bVar);
    }
}
