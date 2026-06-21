package com.tsf.shell.f.e;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ItemTrailContainer extends com.censivn.C3DEngine.b.f.BaseRenderable {
    private static E a = new ItemTrailContainer();
    private static Number3d b = new Number3d();
    private static com.tsf.shell.f.i.ShortcutItem c;

    public ItemTrailContainer() {
        renderChildren(false);
    }

    public static boolean a(com.tsf.shell.f.i.ShortcutItem cVar) {
        return cVar == c && AlignmentOverlay.numChildren() > 0;
    }

    public static int a() {
        return AlignmentOverlay.numChildren();
    }

    public static boolean b(com.tsf.shell.f.i.ShortcutItem cVar) {
        if (cVar != c || AlignmentOverlay.numChildren() <= 0) {
            return false;
        }
        Iterator<com.censivn.C3DEngine.b.f.IRenderable> it = AlignmentOverlay.children().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof com.tsf.shell.f.i.b.d.FolderShortcutItem) {
                return true;
            }
        }
        return false;
    }

    public static void c(com.tsf.shell.f.i.ShortcutItem cVar) {
        if (AlignmentOverlay.parent() == null) {
            cVar.an();
            c = cVar;
            com.tsf.shell.manager.app.TaskScheduler.a(AlignmentOverlay);
        } else if (c != cVar) {
            com.tsf.shell.utils.ErrorThrower.a(a, "FollowingContainer exist FollowingTarget:" + c);
        }
    }

    public static void a(ArrayList<com.tsf.shell.f.i.ShortcutItem> arrayList) {
        Iterator<com.tsf.shell.f.i.ShortcutItem> it = arrayList.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }

    public static void d(com.tsf.shell.f.i.ShortcutItem cVar) {
        cVar.visible(true);
        cVar.alpha(255.0f);
        cVar.an();
        WidgetResizeResources.reset();
        cVar.localToGlobal(WidgetResizeResources);
        cVar.position().setAllFrom(WidgetResizeResources);
        cVar.removeFromParent();
        AlignmentOverlay.addChild(cVar);
    }

    public static ArrayList<com.tsf.shell.f.i.ShortcutItem> b() {
        ArrayList<com.tsf.shell.f.i.ShortcutItem> arrayList = new ArrayList<>();
        Iterator<com.censivn.C3DEngine.b.f.IRenderable> it = AlignmentOverlay.children().iterator();
        while (it.hasNext()) {
            arrayList.add((com.tsf.shell.f.i.ShortcutItem) it.next());
        }
        return arrayList;
    }

    public static ArrayList<com.tsf.shell.f.i.ShortcutItem> c() {
        ArrayList<com.tsf.shell.f.i.ShortcutItem> arrayListB = b();
        while (AlignmentOverlay.numChildren() > 0) {
            AlignmentOverlay.getChildAt(0).removeFromParent();
        }
        com.tsf.shell.manager.app.TaskScheduler.b(AlignmentOverlay);
        c = null;
        return arrayListB;
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
        if (c != null) {
            com.censivn.C3DEngine.b.f.IRenderable iVar = c;
            float fNumChildren = numChildren() * 0.04f;
            float f = fNumChildren <= 0.3f ? fNumChildren : 0.3f;
            float f2 = ((double) f) < 0.12d ? 0.12f : f;
            for (com.censivn.C3DEngine.b.f.IRenderable iVar2 : children()) {
                iVar2.position().x += ((iVar.position().x + (10.0f * com.censivn.C3DEngine.b.b.ScreenConstants.c)) - iVar2.position().x) * f2;
                PositionNumber3d positionNumber3dPosition = iVar2.position();
                positionNumber3dPosition.y = ((iVar.position().y - iVar2.position().y) * f2) + positionNumber3dPosition.y;
                iVar = iVar2;
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.f.BaseRenderable
    public void onDrawChildStart() {
        int iNumChildren = numChildren();
        while (true) {
            iNumChildren--;
            if (iNumChildren > -1) {
                com.censivn.C3DEngine.b.f.IRenderable childAt = getChildAt(iNumChildren);
                onDrawChildStart(childAt);
                childAt.dispatchDraw();
                onDrawChildEnd(childAt);
            } else {
                return;
            }
        }
    }
}
