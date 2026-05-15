package com.tsf.shell.f.e;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends com.censivn.C3DEngine.b.f.j {
    private static e a = new e();
    private static Number3d b = new Number3d();
    private static com.tsf.shell.f.i.c c;

    public e() {
        renderChildren(false);
    }

    public static boolean a(com.tsf.shell.f.i.c cVar) {
        return cVar == c && a.numChildren() > 0;
    }

    public static int a() {
        return a.numChildren();
    }

    public static boolean b(com.tsf.shell.f.i.c cVar) {
        if (cVar != c || a.numChildren() <= 0) {
            return false;
        }
        Iterator<com.censivn.C3DEngine.b.f.i> it = a.children().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof com.tsf.shell.f.i.b.d.b) {
                return true;
            }
        }
        return false;
    }

    public static void c(com.tsf.shell.f.i.c cVar) {
        if (a.parent() == null) {
            cVar.an();
            c = cVar;
            com.tsf.shell.manager.a.j.a(a);
        } else if (c != cVar) {
            com.tsf.shell.utils.l.a(a, "FollowingContainer exist FollowingTarget:" + c);
        }
    }

    public static void a(ArrayList<com.tsf.shell.f.i.c> arrayList) {
        Iterator<com.tsf.shell.f.i.c> it = arrayList.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }

    public static void d(com.tsf.shell.f.i.c cVar) {
        cVar.visible(true);
        cVar.alpha(255.0f);
        cVar.an();
        b.reset();
        cVar.localToGlobal(b);
        cVar.position().setAllFrom(b);
        cVar.removeFromParent();
        a.addChild(cVar);
    }

    public static ArrayList<com.tsf.shell.f.i.c> b() {
        ArrayList<com.tsf.shell.f.i.c> arrayList = new ArrayList<>();
        Iterator<com.censivn.C3DEngine.b.f.i> it = a.children().iterator();
        while (it.hasNext()) {
            arrayList.add((com.tsf.shell.f.i.c) it.next());
        }
        return arrayList;
    }

    public static ArrayList<com.tsf.shell.f.i.c> c() {
        ArrayList<com.tsf.shell.f.i.c> arrayListB = b();
        while (a.numChildren() > 0) {
            a.getChildAt(0).removeFromParent();
        }
        com.tsf.shell.manager.a.j.b(a);
        c = null;
        return arrayListB;
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (c != null) {
            com.censivn.C3DEngine.b.f.i iVar = c;
            float fNumChildren = numChildren() * 0.04f;
            float f = fNumChildren <= 0.3f ? fNumChildren : 0.3f;
            float f2 = ((double) f) < 0.12d ? 0.12f : f;
            for (com.censivn.C3DEngine.b.f.i iVar2 : children()) {
                iVar2.position().x += ((iVar.position().x + (10.0f * com.censivn.C3DEngine.b.b.a.c)) - iVar2.position().x) * f2;
                PositionNumber3d positionNumber3dPosition = iVar2.position();
                positionNumber3dPosition.y = ((iVar.position().y - iVar2.position().y) * f2) + positionNumber3dPosition.y;
                iVar = iVar2;
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawChildStart() {
        int iNumChildren = numChildren();
        while (true) {
            iNumChildren--;
            if (iNumChildren > -1) {
                com.censivn.C3DEngine.b.f.i childAt = getChildAt(iNumChildren);
                onDrawChildStart(childAt);
                childAt.dispatchDraw();
                onDrawChildEnd(childAt);
            } else {
                return;
            }
        }
    }
}
