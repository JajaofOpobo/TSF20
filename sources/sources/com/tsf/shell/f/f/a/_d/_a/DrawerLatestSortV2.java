package com.tsf.shell.f.f.a._d._a;

import com.censivn.C3DEngine.b.f.i;
import com.tsf.b;
import com.tsf.shell.f.i._b.e.WidgetDrawerItemVisual;
import java.util.Comparator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerLatestSortV2 extends DrawerSortBaseV2 {
    public DrawerLatestSortV2(int i) {
        super(DrawerNameSortV2.d.drawer_sort_time_latest, DrawerNameSortV2.i.text_sort_latest_installed);
        this.a = i;
        this.b = new Comparator<com.tsf.shell.f.i.PageItem>() { // from class: com.tsf.shell.f.f.a._d._a.DrawerLatestSortV2.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final int compare(com.tsf.shell.f.i.PageItem bVar, com.tsf.shell.f.i.PageItem bVar2) {
                if ((bVar instanceof com.tsf.shell.f.i._b.d.WorkspaceShortcutItem) && (bVar2 instanceof com.tsf.shell.f.i._b.d.WorkspaceShortcutItem)) {
                    return 0;
                }
                if (bVar instanceof com.tsf.shell.f.i._b.d.WorkspaceShortcutItem) {
                    return -1;
                }
                if (!(bVar2 instanceof com.tsf.shell.f.i._b.d.WorkspaceShortcutItem) && bVar.s() <= bVar2.s()) {
                    return bVar.s() < bVar2.s() ? -1 : 0;
                }
                return 1;
            }
        };
        this.c = new Comparator<i>() { // from class: com.tsf.shell.f.f.a._d._a.DrawerLatestSortV2.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final int compare(i iVar, i iVar2) {
                if ((iVar instanceof g) && (iVar2 instanceof g)) {
                    g gVar = (g) iVar;
                    g gVar2 = (g) iVar2;
                    if (gVar.s() > gVar2.s()) {
                        return 1;
                    }
                    if (gVar.s() < gVar2.s()) {
                        return -1;
                    }
                }
                return 0;
            }
        };
    }
}
