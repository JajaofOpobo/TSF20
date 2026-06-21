package com.tsf.shell.e.e;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f extends com.censivn.C3DEngine.b.f.l {
    private static f a = new f();
    private static Number3d b = new Number3d();
    private static com.tsf.shell.e.i.e c;

    public f() {
        renderChildren(false);
    }

    public static boolean a(com.tsf.shell.e.i.e eVar) {
        return eVar == c && a.numChildren() > 0;
    }

    public static int a() {
        return a.numChildren();
    }

    public static boolean b(com.tsf.shell.e.i.e eVar) {
        if (eVar != c || a.numChildren() <= 0) {
            return false;
        }
        Iterator it = a.children().iterator();
        while (it.hasNext()) {
            if (((com.censivn.C3DEngine.b.f.j) it.next()) instanceof com.tsf.shell.e.i.b.d.b) {
                return true;
            }
        }
        return false;
    }

    public static void c(com.tsf.shell.e.i.e eVar) {
        if (a.parent() == null) {
            eVar.an();
            c = eVar;
            com.tsf.shell.manager.a.j.a(a);
        } else if (c != eVar) {
            com.tsf.shell.utils.m.a(a, "FollowingContainer exist FollowingTarget:" + c);
        }
    }

    public static void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d((com.tsf.shell.e.i.e) it.next());
        }
    }

    public static void d(com.tsf.shell.e.i.e eVar) {
        eVar.visible(true);
        eVar.alpha(255.0f);
        eVar.an();
        b.reset();
        eVar.localToGlobal(b);
        eVar.position().setAllFrom(b);
        eVar.removeFromParent();
        a.addChild(eVar);
    }

    public static ArrayList b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = a.children().iterator();
        while (it.hasNext()) {
            arrayList.add((com.tsf.shell.e.i.e) ((com.censivn.C3DEngine.b.f.j) it.next()));
        }
        return arrayList;
    }

    public static ArrayList c() {
        ArrayList b2 = b();
        while (a.numChildren() > 0) {
            a.getChildAt(0).removeFromParent();
        }
        com.tsf.shell.manager.a.j.b(a);
        c = null;
        return b2;
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (c != null) {
            com.censivn.C3DEngine.b.f.j jVar = c;
            float numChildren = numChildren() * 0.04f;
            float f = numChildren <= 0.3f ? numChildren : 0.3f;
            float f2 = ((double) f) < 0.12d ? 0.12f : f;
            Iterator it = children().iterator();
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.f.j jVar2 = (com.censivn.C3DEngine.b.f.j) it.next();
                jVar2.position().x += ((jVar.position().x + (10.0f * com.censivn.C3DEngine.b.b.a.c)) - jVar2.position().x) * f2;
                PositionNumber3d position = jVar2.position();
                position.y = ((jVar.position().y - jVar2.position().y) * f2) + position.y;
                jVar = jVar2;
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void onDrawChildStart() {
        int numChildren = numChildren();
        while (true) {
            numChildren--;
            if (numChildren > -1) {
                com.censivn.C3DEngine.b.f.j childAt = getChildAt(numChildren);
                onDrawChildStart(childAt);
                childAt.dispatchDraw();
                onDrawChildEnd(childAt);
            } else {
                return;
            }
        }
    }
}
