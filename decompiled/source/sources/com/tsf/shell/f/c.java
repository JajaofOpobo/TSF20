package com.tsf.shell.f;

import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.f.i.b.e.h;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c {
    private static ArrayList<com.tsf.shell.f.i.b.e.b> a = new ArrayList<>();

    public static com.tsf.shell.f.i.b.e.b a(i iVar) {
        com.tsf.shell.f.i.b.e.b remove;
        if (a.isEmpty()) {
            remove = new h();
            remove.visible(false);
        } else {
            remove = a.remove(0);
        }
        remove.position().setAllFrom(iVar.position());
        remove.scale().setAllFrom(iVar.scale());
        remove.rotation().setAllFrom(iVar.rotation());
        remove.setAABBPX(iVar.minX(), iVar.minY(), iVar.minZ(), iVar.maxX(), iVar.maxY(), iVar.maxZ());
        return remove;
    }

    public static void a(com.tsf.shell.f.i.b.e.b bVar) {
        a.add(bVar);
    }
}
