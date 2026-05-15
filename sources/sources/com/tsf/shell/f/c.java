package com.tsf.shell.f;

import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.f.i.b.e.h;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c {
    private static ArrayList<com.tsf.shell.f.i.b.e.b> a = new ArrayList<>();

    public static com.tsf.shell.f.i.b.e.b a(i iVar) {
        com.tsf.shell.f.i.b.e.b bVarRemove;
        if (a.isEmpty()) {
            bVarRemove = new h();
            bVarRemove.visible(false);
        } else {
            bVarRemove = a.remove(0);
        }
        bVarRemove.position().setAllFrom(iVar.position());
        bVarRemove.scale().setAllFrom(iVar.scale());
        bVarRemove.rotation().setAllFrom(iVar.rotation());
        bVarRemove.setAABBPX(iVar.minX(), iVar.minY(), iVar.minZ(), iVar.maxX(), iVar.maxY(), iVar.maxZ());
        return bVarRemove;
    }

    public static void a(com.tsf.shell.f.i.b.e.b bVar) {
        a.add(bVar);
    }
}
