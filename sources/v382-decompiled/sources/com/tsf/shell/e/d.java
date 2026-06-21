package com.tsf.shell.e;

import com.censivn.C3DEngine.b.f.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d {
    private static ArrayList a = new ArrayList();

    public static com.tsf.shell.e.i.b.e.b a(j jVar) {
        com.tsf.shell.e.i.b.e.b bVar;
        if (a.isEmpty()) {
            bVar = new com.tsf.shell.e.i.b.e.j();
            bVar.visible(false);
        } else {
            bVar = (com.tsf.shell.e.i.b.e.b) a.remove(0);
        }
        bVar.position().setAllFrom(jVar.position());
        bVar.scale().setAllFrom(jVar.scale());
        bVar.rotation().setAllFrom(jVar.rotation());
        bVar.setAABBPX(jVar.minX(), jVar.minY(), jVar.minZ(), jVar.maxX(), jVar.maxY(), jVar.maxZ());
        return bVar;
    }

    public static void a(com.tsf.shell.e.i.b.e.b bVar) {
        a.add(bVar);
    }
}
